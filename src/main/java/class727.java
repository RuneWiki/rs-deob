import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class727 extends class490 {
   @OriginalMember(
      owner = "client!sea",
      name = "r",
      descriptor = "I"
   )
   private int field10648;
   @OriginalMember(
      owner = "client!sea",
      name = "o",
      descriptor = "I"
   )
   private int field10638;
   @OriginalMember(
      owner = "client!sea",
      name = "x",
      descriptor = "I"
   )
   private int field10642;
   @OriginalMember(
      owner = "client!sea",
      name = "s",
      descriptor = "I"
   )
   private int field10649;
   @OriginalMember(
      owner = "client!sea",
      name = "u",
      descriptor = "I"
   )
   private int field10647;
   @OriginalMember(
      owner = "client!sea",
      name = "t",
      descriptor = "I"
   )
   private int field10646;
   @OriginalMember(
      owner = "client!sea",
      name = "l",
      descriptor = "I"
   )
   private int field10641;
   @OriginalMember(
      owner = "client!sea",
      name = "p",
      descriptor = "I"
   )
   private int field10640;
   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10651 = new String[]{method5304(method5303("i\u0004\u0014h\u001fs\u000f\u001c2\u001d2")), method5304(method5303("i\u0004\u0014h`2")), method5304(method5303("i\u0004\u0014hg2")), method5304(method5303("i\u0004\u0014hk2")), method5304(method5303("aO[h^")), method5304(method5303("t\u0014\u0019*")), method5304(method5303("i\u0004\u0014hj2")), method5304(method5303("i\u0004\u0014hd2"))};
   @OriginalMember(
      owner = "client!sea",
      name = "n",
      descriptor = "I"
   )
   public static int field10637;
   @OriginalMember(
      owner = "client!sea",
      name = "y",
      descriptor = "I"
   )
   public static int field10639;
   @OriginalMember(
      owner = "client!sea",
      name = "q",
      descriptor = "I"
   )
   public static int field10643;
   @OriginalMember(
      owner = "client!sea",
      name = "w",
      descriptor = "I"
   )
   public static int field10644;
   @OriginalMember(
      owner = "client!sea",
      name = "m",
      descriptor = "I"
   )
   public static int field10645;
   @OriginalMember(
      owner = "client!sea",
      name = "v",
      descriptor = "I"
   )
   public static int field10650;

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(IBILbl;)V"
   )
   public static final void method5301(int arg0, byte arg1, int arg2, class678 arg3) {
      try {
         class30.field437 = arg2;
         ++field10639;
         class122.field1580 = arg3;
         class22.field256 = arg0;
         if (arg1 == 7) {
            ;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10651[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10651[4] : field10651[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method1646(int arg0, int arg1, int arg2) {
      try {
         if (arg0 == 30078) {
            ++field10650;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10651[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(JI)Ljava/lang/String;"
   )
   public static final String method5302(long arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field10644;
         if (arg1 != -27867) {
            return null;
         } else if (~arg0 < -1L && ~arg0 > -6582952005840035282L) {
            if (~(arg0 % 37L) == -1L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg0;
               if (var3) {
                  var5 = arg0 / 37L;
                  ++var4;
               }

               while(true) {
                  while(~var5 != -1L) {
                     var5 /= 37L;
                     ++var4;
                  }

                  StringBuffer var7 = new StringBuffer(var4);
                  if (!var3) {
                     if (!var3 && ~arg0 == -1L) {
                        return var7.reverse().toString();
                     } else {
                        do {
                           long var8 = arg0;
                           arg0 /= 37L;
                           var7.append(class255.field3470[(int)(-(arg0 * 37L) + var8)]);
                        } while(~arg0 != -1L);

                        return var7.reverse().toString();
                     }
                  }

                  ++var4;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field10651[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method1644(byte arg0, int arg1, int arg2) {
      try {
         ++field10643;
         int var4 = 23 / ((arg0 - 75) / 40);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10651[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "c",
      descriptor = "(III)V"
   )
   public final void method1645(int arg0, int arg1, int arg2) {
      try {
         ++field10645;
         int var4 = this.field10648 * arg1 >> 12;
         int var5 = this.field10640 * arg0 >> 12;
         int var6 = this.field10647 * arg1 >> 12;
         int var7 = -2 / ((arg2 - 39) / 45);
         int var8 = this.field10646 * arg0 >> 12;
         int var9 = this.field10641 * arg1 >> 12;
         int var10 = this.field10642 * arg0 >> 12;
         int var11 = this.field10649 * arg1 >> 12;
         int var12 = this.field10638 * arg0 >> 12;
         class644.method4658(var8, var6, var12, var5, var10, false, var9, super.field7012, var4, var11);
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field10651[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      super(-1, arg8, arg9);

      try {
         this.field10648 = arg0;
         this.field10638 = arg7;
         this.field10642 = arg5;
         this.field10649 = arg6;
         this.field10647 = arg2;
         this.field10646 = arg3;
         this.field10641 = arg4;
         this.field10640 = arg1;
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field10651[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5303(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5304(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
