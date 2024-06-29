import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class553 {
   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8206 = new String[]{method4094(method4093("pe\u0012FF")), method4094(method4093("e>P\u0004")), method4094(method4093("m/\u0012+\u0013")), method4094(method4093("m/\u0012)\u0013")), method4094(method4093("m/\u0012-\u0013")), method4094(method4093("m/\u0012,\u0013")), method4094(method4093("m/\u0012*\u0013"))};
   @OriginalMember(
      owner = "client!fd",
      name = "f",
      descriptor = "I"
   )
   public static int field8200 = 0;
   @OriginalMember(
      owner = "client!fd",
      name = "b",
      descriptor = "Lnea;"
   )
   public static class743 field8205 = class196.method1499(false);
   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "I"
   )
   public static int field8199;
   @OriginalMember(
      owner = "client!fd",
      name = "g",
      descriptor = "I"
   )
   public static int field8201;
   @OriginalMember(
      owner = "client!fd",
      name = "d",
      descriptor = "I"
   )
   public static int field8202;
   @OriginalMember(
      owner = "client!fd",
      name = "c",
      descriptor = "I"
   )
   public static int field8203;
   @OriginalMember(
      owner = "client!fd",
      name = "e",
      descriptor = "I"
   )
   public static int field8204;

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(IIII)I",
      line = 3
   )
   public static final int method4088(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var4 = -118 / ((-5 - arg0) / 54);
         ++field8203;
         if (arg1 == arg2) {
            return arg2;
         } else {
            int var5 = -arg3 + 128;
            int var6 = (arg1 & 127) * arg3 + (127 & arg2) * var5 >> 7;
            int var7 = (arg1 & 896) * arg3 + (896 & arg2) * var5 >> 7;
            int var8 = (arg1 & 64512) * arg3 + (arg2 & 64512) * var5 >> 7;
            return 64512 & var8 | 896 & var7 | 127 & var6;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field8206[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(BI)V",
      line = 25
   )
   public static final void method4089(byte arg0, int arg1) {
      try {
         if (arg0 >= -72) {
            field8205 = null;
         }

         ++field8201;
         if (class448.field6805 != 1) {
            if (class448.field6805 == 2) {
               class348.field5289 = arg1;
               return;
            }
         } else {
            class442.field6744 = arg1;
         }

      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8206[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(ZIIILck;I[BB)Lfe;",
      line = 43
   )
   public static final class596 method4090(boolean arg0, int arg1, int arg2, int arg3, class667 arg4, int arg5, byte[] arg6, byte arg7) {
      try {
         ++field8199;
         if (arg7 <= 34) {
            return null;
         } else if (!arg4.field10032 && (!class766.method5547(1008, arg1) || !class766.method5547(1008, arg5))) {
            return arg4.field9950 ? new class596(arg4, 34037, arg3, arg1, arg5, arg0, arg6, arg2) : new class596(arg4, arg3, arg1, arg5, class7.method63(arg1, false), class7.method63(arg5, false), arg6, arg2);
         } else {
            return new class596(arg4, 3553, arg3, arg1, arg5, arg0, arg6, arg2);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field8206[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8206[0] : field8206[1]) + ',' + arg5 + ',' + (arg6 != null ? field8206[0] : field8206[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(ZIIZI[Lhv;)V",
      line = 65
   )
   public static final void method4091(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, class544[] arg5) {
      int var6 = client.field4530;

      try {
         ++field8204;
         int var7 = 0;
         if (var6 == 0 && ~arg5.length >= ~var7) {
            if (arg0) {
               method4090(false, -108, 35, -115, (class667)null, -59, (byte[])null, (byte)91);
            }
         } else {
            do {
               class544 var8 = arg5[var7];
               if (var8 != null && ~var8.field7968 == ~arg1) {
                  class11.method91(var8, arg4, (byte)-128, arg2, arg3);
                  class358.method2798(arg4, arg2, var8, 58);
                  if (~(-var8.field7986 + var8.field8028) > ~var8.field8060) {
                     var8.field8060 = -var8.field7986 + var8.field8028;
                  }

                  if (~var8.field8060 > -1) {
                     var8.field8060 = 0;
                  }

                  if (var8.field7962 > -var8.field7954 + var8.field7971) {
                     var8.field7962 = -var8.field7954 + var8.field7971;
                  }

                  if (var8.field7962 < 0) {
                     var8.field7962 = 0;
                  }

                  if (var8.field7920 == 0) {
                     class783.method5626(var8, arg3, -12725);
                  }
               }

               ++var7;
            } while(~arg5.length < ~var7);

            if (arg0) {
               method4090(false, -108, 35, -115, (class667)null, -59, (byte[])null, (byte)91);
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field8206[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8206[0] : field8206[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(I)V",
      line = 115
   )
   public static void method4092(int arg0) {
      try {
         field8205 = null;
         if (arg0 != 127) {
            method4089((byte)78, -55);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8206[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4093(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4094(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
