import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class623 extends class3 {
   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9169 = new String[]{method4533(method4532("dPYOG")), method4533(method4532("dPYMG")), method4533(method4532("~M\u001b`")), method4533(method4532("dPYNG")), method4533(method4532("k\u0016Y\"\u0012"))};
   @OriginalMember(
      owner = "client!th",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field9163 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @OriginalMember(
      owner = "client!th",
      name = "n",
      descriptor = "F"
   )
   public static float field9162;
   @OriginalMember(
      owner = "client!th",
      name = "m",
      descriptor = "I"
   )
   public static int field9166;
   @OriginalMember(
      owner = "client!th",
      name = "l",
      descriptor = "I"
   )
   public static int field9167;
   @OriginalMember(
      owner = "client!th",
      name = "k",
      descriptor = "Lgn;"
   )
   public class731 field9168;
   @OriginalMember(
      owner = "client!th",
      name = "j",
      descriptor = "Z"
   )
   public boolean field9165;
   @OriginalMember(
      owner = "client!th",
      name = "o",
      descriptor = "[Lsb;"
   )
   public class307[] field9164;

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(IZ)Lwu;",
      line = 5
   )
   public static final class395 method4529(int arg0, boolean arg1) {
      boolean var2 = client.field4360;

      try {
         ++field9167;
         class395[] var3 = class721.method5242((byte)-96);
         if (arg1) {
            return null;
         } else {
            int var4 = 0;
            if (var2) {
               if (var3[var4].field5708 == arg0) {
                  return var3[var4];
               }

               ++var4;
            }

            while(true) {
               while(~var4 > ~var3.length) {
                  if (var3[var4].field5708 == arg0) {
                     return var3[var4];
                  }

                  ++var4;
               }

               if (!var2) {
                  return null;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9169[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(Lha;III)Z",
      line = 42
   )
   public final boolean method4530(class66 arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         if (arg2 != 0) {
            return true;
         } else {
            ++field9166;
            int var6 = this.field9168.method3670((byte)28);
            if (this.field9164 != null) {
               int var7 = 0;
               if (var5 || ~var7 > ~this.field9164.length) {
                  do {
                     this.field9164[var7].field4195 <<= var6;
                     if (this.field9164[var7].method2285(arg3, arg1) && this.field9168.method251(arg1, arg3, arg0, ~arg2)) {
                        this.field9164[var7].field4195 >>= var6;
                        return true;
                     }

                     this.field9164[var7].field4195 >>= var6;
                     ++var7;
                  } while(~var7 > ~this.field9164.length);
               }
            }

            return false;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field9169[3] + (arg0 != null ? field9169[4] : field9169[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(I)V",
      line = 77
   )
   public static void method4531(int arg0) {
      try {
         if (arg0 == 255) {
            field9163 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9169[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4532(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4533(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
