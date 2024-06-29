import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class407 {
   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5755 = new String[]{method3093(method3092("34\u001cb>")), method3093(method3092("&o^ ")), method3093(method3092(")r\u001c\rk")), method3093(method3092(")r\u001c\u000fk")), method3093(method3092(")r\u001c\bk")), method3093(method3092(")r\u001c\tk")), method3093(method3092(")r\u001c\u000ek"))};
   @OriginalMember(
      owner = "client!ah",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field5752 = new int[50];
   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "C"
   )
   public char field5749;
   @OriginalMember(
      owner = "client!ah",
      name = "b",
      descriptor = "I"
   )
   public int field5746;
   @OriginalMember(
      owner = "client!ah",
      name = "d",
      descriptor = "I"
   )
   public int field5747;
   @OriginalMember(
      owner = "client!ah",
      name = "f",
      descriptor = "I"
   )
   public static int field5748;
   @OriginalMember(
      owner = "client!ah",
      name = "g",
      descriptor = "I"
   )
   public static int field5750;
   @OriginalMember(
      owner = "client!ah",
      name = "e",
      descriptor = "I"
   )
   public static int field5751;
   @OriginalMember(
      owner = "client!ah",
      name = "c",
      descriptor = "I"
   )
   public static int field5753;
   @OriginalMember(
      owner = "client!ah",
      name = "i",
      descriptor = "I"
   )
   public int field5754;

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method3087(class594 arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field5751;

         while(true) {
            int var4 = arg0.method4288((byte)107);
            if (~var4 != -1) {
               this.method3089(var4, arg0, 1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 < 112) {
               this.field5749 = (char)65458;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5755[2] + (arg0 != null ? field5755[0] : field5755[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method3088(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 != -23998) {
            field5752 = null;
         }

         ++field5753;
         int var6 = arg2 & 3;
         if (~var6 == -1) {
            return arg0;
         } else if (var6 == 1) {
            return arg1;
         } else {
            return ~var6 == -3 ? -arg0 + 7 : 7 - arg1;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5755[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(ILwm;I)V"
   )
   private final void method3089(int arg0, class594 arg1, int arg2) {
      try {
         label31: {
            if (arg0 != 1) {
               if (~arg0 != -3) {
                  break label31;
               }

               this.field5747 = arg1.method4280(-19104);
               this.field5746 = arg1.method4288((byte)98);
               this.field5754 = arg1.method4288((byte)97);
               if (!client.field4273) {
                  break label31;
               }
            }

            this.field5749 = class90.method855(arg1.method4340(409855200), (byte)98);
         }

         ++field5748;
         if (arg2 != 1) {
            this.field5754 = -7;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5755[6] + arg0 + ',' + (arg1 != null ? field5755[0] : field5755[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3090(int arg0, int arg1, int arg2) {
      try {
         ++field5750;
         if (arg0 >= 0 && arg2 >= 0 && ~arg0 > ~class100.field1295[1].length && ~class100.field1295[1][arg0].length < ~arg2) {
            return ~(class100.field1295[arg1][arg0][arg2] & 2) != -1;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5755[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3091(byte arg0) {
      try {
         int var1 = 84 / ((arg0 - 70) / 49);
         field5752 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5755[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3092(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3093(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
