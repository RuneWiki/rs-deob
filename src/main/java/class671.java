import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class671 extends class127 {
   @OriginalMember(
      owner = "client!ck",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9874 = new String[]{method4922(method4921("\u0005cw\u000f9")), method4922(method4921("\u0005cw\f9")), method4922(method4921("\u0005cw\b9")), method4922(method4921("\u0005cw\t9")), method4922(method4921("\b}5!")), method4922(method4921("\u001d&wcl")), method4922(method4921("\u0005cw\u000e9"))};
   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "Lafa;"
   )
   public static class365 field9869 = new class365(6, 1);
   @OriginalMember(
      owner = "client!ck",
      name = "C",
      descriptor = "I"
   )
   public static int field9872 = 4;
   @OriginalMember(
      owner = "client!ck",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field9873 = null;
   @OriginalMember(
      owner = "client!ck",
      name = "A",
      descriptor = "I"
   )
   public static int field9865;
   @OriginalMember(
      owner = "client!ck",
      name = "F",
      descriptor = "I"
   )
   public static int field9866;
   @OriginalMember(
      owner = "client!ck",
      name = "E",
      descriptor = "I"
   )
   public static int field9867;
   @OriginalMember(
      owner = "client!ck",
      name = "H",
      descriptor = "I"
   )
   public static int field9868;
   @OriginalMember(
      owner = "client!ck",
      name = "D",
      descriptor = "I"
   )
   public static int field9870;
   @OriginalMember(
      owner = "client!ck",
      name = "I",
      descriptor = "I"
   )
   public static int field9871;

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method4918(boolean arg0) {
      try {
         if (!arg0) {
            method4919((byte)73, -27, 65);
         }

         field9869 = null;
         field9873 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9874[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method4919(byte arg0, int arg1, int arg2) {
      try {
         ++field9866;
         if (arg0 != 83) {
            return false;
         } else {
            return (arg2 & 2048) != 0;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9874[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method76(int arg0, float arg1) {
      try {
         ++field9868;
         if (arg0 != -1) {
            field9872 = -78;
         }

         super.field1596 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9874[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class671(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public final void method78(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field9867;
         super.field1595 = arg1;
         super.field1594 = arg0;
         if (arg3 < 37) {
            field9871 = -79;
         }

         super.field1608 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9874[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(BLjava/lang/String;C)I"
   )
   public static final int method4920(byte arg0, String arg1, char arg2) {
      boolean var3 = client.field4273;

      try {
         ++field9865;
         int var4 = 0;
         int var5 = arg1.length();
         int var6 = 0;
         if (arg0 != 1) {
            method4918(false);
            if (var3) {
               if (arg2 == arg1.charAt(var6)) {
                  ++var4;
               }

               ++var6;
            }
         }

         while(true) {
            int var10000;
            if (~var5 >= ~var6) {
               var10000 = var4;
               if (!var3) {
                  return var4;
               }
            } else {
               var10000 = arg2;
            }

            if (var10000 == arg1.charAt(var6)) {
               ++var4;
            }

            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9874[6] + arg0 + ',' + (arg1 != null ? field9874[5] : field9874[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4921(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4922(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
