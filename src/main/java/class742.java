import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class742 {
   @OriginalMember(
      owner = "client!nda",
      name = "j",
      descriptor = "[I"
   )
   public int[] field10852;
   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "[I"
   )
   public int[] field10851;
   @OriginalMember(
      owner = "client!nda",
      name = "e",
      descriptor = "[I"
   )
   public int[] field10855;
   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "[I"
   )
   public int[] field10847;
   @OriginalMember(
      owner = "client!nda",
      name = "d",
      descriptor = "[S"
   )
   public short[] field10853;
   @OriginalMember(
      owner = "client!nda",
      name = "f",
      descriptor = "[S"
   )
   public short[] field10856;
   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10857 = new String[]{method5388(method5387("\u0019IX0o_")), method5388(method5387("\u0019IX0n_")), method5388(method5387("\u0019IX0m_")), method5388(method5387("\u0019XUr")), method5388(method5387("\f\u0003\u00170Q")), method5388(method5387("\u0019IX0\u0010\u001eCPj\u0012_")), method5388(method5387("\u0019IX0h_")), method5388(method5387("\u0019IX0i_"))};
   @OriginalMember(
      owner = "client!nda",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field10854 = null;
   @OriginalMember(
      owner = "client!nda",
      name = "g",
      descriptor = "I"
   )
   public static int field10846;
   @OriginalMember(
      owner = "client!nda",
      name = "i",
      descriptor = "I"
   )
   public static int field10848;
   @OriginalMember(
      owner = "client!nda",
      name = "h",
      descriptor = "I"
   )
   public static int field10849;
   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "I"
   )
   public static int field10850;

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5382(byte arg0) {
      try {
         ++field10850;
         if (class661.field9817 != -1) {
            int var1 = class372.field5216.method1570(29658);
            int var2 = class372.field5216.method1566(arg0 ^ 60);
            class505 var3 = (class505)class17.field291.method288(arg0 + -60);
            if (var3 != null) {
               var1 = var3.method1557(-1012);
               var2 = var3.method1554((byte)115);
            }

            int var4 = 0;
            int var5 = 0;
            if (class28.field416) {
               var4 = class356.method2825(0);
               var5 = class465.method3538(-26506);
            }

            if (arg0 == 60) {
               class529.method3948(var4, class661.field9817, var1, var5, var2, var4 - -class204.field2605, var5 - -class91.field1242, var5, var2 + var5, var1 + var4, arg0 ^ -76, var4);
               if (class777.field11329 != null) {
                  class513.method3870(0, var1 + var4, var2 - -var5);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10857[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)V"
   )
   public static final void method5383(String arg0, boolean arg1) {
      try {
         System.exit(1);
         ++field10848;
         if (arg1) {
            field10854 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10857[7] + (arg0 != null ? field10857[4] : field10857[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method5384(byte arg0) {
      try {
         if (arg0 <= 113) {
            field10854 = null;
         }

         field10854 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10857[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(BILha;Lija;Lkka;IIILwc;)V"
   )
   public static final void method5385(byte arg0, int arg1, class479 arg2, class160 arg3, class519 arg4, int arg5, int arg6, int arg7, class394 arg8) {
      boolean var9 = client.field1481;

      try {
         ++field10849;
         int var10 = -(arg1 / 2) + arg5 + -5;
         int var11 = arg7 - -2;
         if (~arg4.field7298 != -1) {
            arg2.method3643(false, var11, arg4.field7298, var10, arg1 - -10, arg7 - -(arg8.method3107() * arg6) - var11 - -1);
         }

         if (arg4.field7275 != 0) {
            arg2.method3645(-var11 + 1 + arg7 + arg6 * arg8.method3107(), var10, arg4.field7275, arg1 + 10, (byte)100, var11);
         }

         int var12 = arg4.field7262;
         if (arg3.field2047 && ~arg4.field7278 != 0) {
            var12 = arg4.field7278;
         }

         int var13 = -72 / ((10 - arg0) / 46);
         int var14 = 0;
         if (var9 || ~arg6 < ~var14) {
            do {
               String var15 = class616.field9070[var14];
               if (arg6 - 1 > var14) {
                  var15 = var15.substring(0, -4 + var15.length());
               }

               arg8.method3109(arg2, var15, arg5, arg7, var12, true);
               arg7 += arg8.method3107();
               ++var14;
            } while(~arg6 < ~var14);

         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field10857[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10857[4] : field10857[3]) + ',' + (arg3 != null ? field10857[4] : field10857[3]) + ',' + (arg4 != null ? field10857[4] : field10857[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field10857[4] : field10857[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method5386(byte arg0) {
      try {
         ++field10846;
         if (class211.field2686 == null) {
            return 0;
         } else {
            if (arg0 >= -62) {
               field10854 = null;
            }

            return class211.field2686.length * 2;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10857[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "<init>",
      descriptor = "(Lti;)V"
   )
   public class742(class546 arg0) {
      try {
         this.field10852 = new int[3];
         this.field10851 = new int[2];
         this.field10855 = new int[2];
         this.field10847 = new int[3];
         this.field10852[2] = arg0.field8023;
         this.field10852[0] = arg0.field7976;
         this.field10852[1] = arg0.field8004;
         this.field10847[0] = arg0.field8041;
         this.field10847[1] = arg0.field8025;
         this.field10847[2] = arg0.field7992;
         this.field10851[1] = arg0.field8053;
         this.field10851[0] = arg0.field8035;
         this.field10855[1] = arg0.field8040;
         this.field10855[0] = arg0.field8015;
         if (arg0.field8051 != null) {
            this.field10853 = new short[arg0.field8051.length];
            class349.method2757(arg0.field8051, 0, this.field10853, 0, this.field10853.length);
         }

         if (arg0.field8055 != null) {
            this.field10856 = new short[arg0.field8055.length];
            class349.method2757(arg0.field8055, 0, this.field10856, 0, this.field10856.length);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10857[5] + (arg0 != null ? field10857[4] : field10857[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5387(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5388(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
