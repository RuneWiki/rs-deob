import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {
   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field62 = new String[]{method28(method27(":)tni")), method28(method27(":)tmi"))};
   @OriginalMember(
      owner = "client!ro",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field61 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "I"
   )
   public static int field58;
   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "I"
   )
   public static int field59;
   @OriginalMember(
      owner = "client!ro",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field60;

   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method25(boolean arg0) {
      try {
         if (!arg0) {
            method25(false);
         }

         field61 = null;
         field60 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field62[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method26(boolean arg0) {
      int var1 = client.field4530;

      try {
         if (class786.field11439 != null) {
            if (class446.field6785) {
               class559.method4144(73);
            }

            class499.field7394.method5144(true);
            class124.method1022();
            class431.method3282(false);
            class395.method3025((byte)125);
            class277.method2134(false);
            class310.method2340(-11);
            if (class264.field3610 != null) {
               class264.field3610.method2964(1);
            }

            class155.method1278((byte)-40);
            class607.method4426(-16770);
            class672.method4897(true);
            class97.method855(0);
            class372.method2891(0, false);
            int var2 = 0;
            if (var1 != 0 || ~var2 > -2049) {
               do {
                  class687 var3 = class661.field9578[var2];
                  if (var3 == null) {
                     ++var2;
                  } else {
                     int var4 = 0;
                     if (var1 != 0) {
                        var3.field6122[var4] = null;
                        ++var4;
                     }

                     while(var4 < var3.field6122.length) {
                        var3.field6122[var4] = null;
                        ++var4;
                     }

                     ++var2;
                  }
               } while(~var2 > -2049);
            }

            int var5 = 0;
            if (var1 != 0 || ~class132.field1657 < ~var5) {
               do {
                  class155 var6 = class506.field7478[var5].field10794;
                  if (var6 == null) {
                     ++var5;
                  } else {
                     int var7 = 0;
                     if (var1 != 0) {
                        var6.field6122[var7] = null;
                        ++var7;
                     }

                     while(~var7 > ~var6.field6122.length) {
                        var6.field6122[var7] = null;
                        ++var7;
                     }

                     ++var5;
                  }
               } while(~class132.field1657 < ~var5);
            }

            class706.field10567 = null;
            class332.field4754 = null;
            class786.field11439.method653(-124);
            class786.field11439 = null;
         }

         ++field59;
         if (arg0) {
            field61 = null;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field62[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method27(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method28(char[] arg0) {
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
            var10005 = 70;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
