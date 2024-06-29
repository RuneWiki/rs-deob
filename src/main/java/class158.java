import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class158 extends class500 {
   @OriginalMember(
      owner = "client!mg",
      name = "n",
      descriptor = "Z"
   )
   public boolean field2030 = false;
   @OriginalMember(
      owner = "client!mg",
      name = "x",
      descriptor = "Z"
   )
   public boolean field2037 = true;
   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2041 = new String[]{method1288(method1287("k\u000e\u0001\u0002g")), method1288(method1287("k\u000e\u0001\u0001g"))};
   @OriginalMember(
      owner = "client!mg",
      name = "t",
      descriptor = "[[Z"
   )
   public static boolean[][] field2031 = new boolean[][]{new boolean[4], new boolean[4], {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
   @OriginalMember(
      owner = "client!mg",
      name = "u",
      descriptor = "I"
   )
   public int field2026;
   @OriginalMember(
      owner = "client!mg",
      name = "r",
      descriptor = "I"
   )
   public int field2027;
   @OriginalMember(
      owner = "client!mg",
      name = "l",
      descriptor = "I"
   )
   public int field2028;
   @OriginalMember(
      owner = "client!mg",
      name = "s",
      descriptor = "I"
   )
   public int field2029;
   @OriginalMember(
      owner = "client!mg",
      name = "q",
      descriptor = "I"
   )
   public static int field2032;
   @OriginalMember(
      owner = "client!mg",
      name = "m",
      descriptor = "I"
   )
   public int field2033;
   @OriginalMember(
      owner = "client!mg",
      name = "w",
      descriptor = "I"
   )
   public int field2034;
   @OriginalMember(
      owner = "client!mg",
      name = "o",
      descriptor = "I"
   )
   public int field2035;
   @OriginalMember(
      owner = "client!mg",
      name = "p",
      descriptor = "I"
   )
   public int field2036;
   @OriginalMember(
      owner = "client!mg",
      name = "k",
      descriptor = "I"
   )
   public int field2038;
   @OriginalMember(
      owner = "client!mg",
      name = "v",
      descriptor = "I"
   )
   public int field2039;
   @OriginalMember(
      owner = "client!mg",
      name = "j",
      descriptor = "Ljv;"
   )
   public class87 field2040;

   @OriginalMember(
      owner = "client!mg",
      name = "b",
      descriptor = "(I)Z"
   )
   public static final boolean method1285(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field2032;
         int var2 = 70 / ((arg0 - 82) / 36);
         boolean var3 = true;
         if (class622.field8692 == null) {
            label62: {
               if (!class354.field5051.method717(class435.field6050, (byte)-58)) {
                  var3 = false;
                  if (!var1) {
                     break label62;
                  }
               }

               class622.field8692 = class267.method2048(class354.field5051, class435.field6050);
            }
         }

         if (class257.field3288 == null) {
            label56: {
               if (!class354.field5051.method717(class299.field3957, (byte)-58)) {
                  var3 = false;
                  if (!var1) {
                     break label56;
                  }
               }

               class257.field3288 = class267.method2048(class354.field5051, class299.field3957);
            }
         }

         if (class188.field2306 == null) {
            label50: {
               if (class354.field5051.method717(class619.field8653, (byte)-58)) {
                  class188.field2306 = class267.method2048(class354.field5051, class619.field8653);
                  if (!var1) {
                     break label50;
                  }
               }

               var3 = false;
            }
         }

         if (class601.field8385 == null) {
            label44: {
               if (!class194.field2365.method717(class577.field7922, (byte)-58)) {
                  var3 = false;
                  if (!var1) {
                     break label44;
                  }
               }

               class601.field8385 = class287.method2176(class577.field7922, 93, class194.field2365);
            }
         }

         if (class457.field6261 == null) {
            if (!class354.field5051.method717(class577.field7922, (byte)-58)) {
               var3 = false;
               if (!var1) {
                  return var3;
               }
            }

            class457.field6261 = class267.method2046(class354.field5051, class577.field7922);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2041[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1286(int arg0) {
      try {
         if (arg0 == 27580) {
            field2031 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2041[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1287(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1288(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
