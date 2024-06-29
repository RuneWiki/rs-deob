import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class73 {
   @OriginalMember(
      owner = "client!hia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field934 = new String[]{method724(method723("2qEMnr")), method724(method723("!6\nMP")), method724(method723("4mH\u000f")), method724(method723("2qEMir")), method724(method723("2qEMor")), method724(method723("2qEMlr"))};
   @OriginalMember(
      owner = "client!hia",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field928 = new class101(102, 3);
   @OriginalMember(
      owner = "client!hia",
      name = "c",
      descriptor = "Ldw;"
   )
   public static class748 field929 = new class748(8);
   @OriginalMember(
      owner = "client!hia",
      name = "e",
      descriptor = "I"
   )
   public static int field925;
   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "I"
   )
   public int field927;
   @OriginalMember(
      owner = "client!hia",
      name = "f",
      descriptor = "I"
   )
   public static int field930;
   @OriginalMember(
      owner = "client!hia",
      name = "g",
      descriptor = "I"
   )
   public int field931;
   @OriginalMember(
      owner = "client!hia",
      name = "i",
      descriptor = "I"
   )
   public static int field932;
   @OriginalMember(
      owner = "client!hia",
      name = "d",
      descriptor = "I"
   )
   public static int field933;
   @OriginalMember(
      owner = "client!hia",
      name = "h",
      descriptor = "[Lcw;"
   )
   public class191[] field926;

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(I)V",
      line = 8
   )
   public static void method719(int arg0) {
      try {
         if (arg0 > -107) {
            field933 = 127;
         }

         field929 = null;
         field928 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field934[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(ILoi;Ljj;)Lcw;",
      line = 19
   )
   private final class191 method720(int arg0, class79 arg1, class128 arg2) {
      try {
         ++field925;
         if (class688.field10363 == arg1) {
            return class566.method4181(arg2, (byte)32);
         } else if (class554.field8209 == arg1) {
            return class557.method4134((byte)-127, arg2);
         } else if (class561.field8388 == arg1) {
            return class330.method2508((byte)-3, arg2);
         } else {
            if (arg0 > -85) {
               this.method720(17, (class79)null, (class128)null);
            }

            if (class335.field4792 == arg1) {
               return class492.method3647(arg2, false);
            } else if (class362.field5454 == arg1) {
               return class246.method1842(arg2, (byte)-98);
            } else if (class33.field367 == arg1) {
               return class20.method138(false, arg2);
            } else if (class675.field10143 == arg1) {
               return class689.method5020(0, arg2);
            } else if (class389.field5946 == arg1) {
               return class78.method746(8632, arg2);
            } else if (class55.field686 == arg1) {
               return class41.method283(arg2, (byte)-13);
            } else {
               return class380.field5848 == arg1 ? class507.method3762(512, arg2) : null;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field934[0] + arg0 + ',' + (arg1 != null ? field934[1] : field934[2]) + ',' + (arg2 != null ? field934[1] : field934[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(ZLjj;)V",
      line = 70
   )
   public final void method721(boolean param1, class128 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(Lhv;I)V",
      line = 95
   )
   public static final void method722(class544 arg0, int arg1) {
      try {
         ++field932;
         if (~class163.field2051 == ~arg0.field7994) {
            if (class693.field10418.field10332 == null) {
               arg0.field8038 = 0;
               arg0.field7925 = 0;
            } else {
               arg0.field8008 = 150;
               arg0.field7960 = 2047 & (int)(Math.sin((double)class314.field4488 / 40.0D) * 256.0D);
               arg0.field8038 = class741.field10996;
               arg0.field7965 = 5;
               arg0.field7925 = class200.method1538(0, class693.field10418.field10332);
               arg0.field7944 = class693.field10418.field6078;
               arg0.field7989 = class693.field10418.field6049;
               arg0.field7972 = class693.field10418.field6075;
               arg0.field7936 = 0;
               class676 var2 = ~arg0.field7944 == 0 ? null : class576.field8554.method3189(arg0.field7944, (byte)-116);
               if (var2 != null) {
                  class324.method2447(arg0.field7989, 255, var2);
               }

            }
         } else if (arg1 != 2047) {
            field929 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field934[3] + (arg0 != null ? field934[1] : field934[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method723(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method724(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
