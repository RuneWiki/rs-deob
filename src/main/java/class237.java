import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class237 {
   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3003 = new String[]{method1898(method1897("cSeNm\"")), method1898(method1897("cSeNh\"")), method1898(method1897("dDh\f")), method1898(method1897("0\u0011")), method1898(method1897("q\u001f*NT")), method1898(method1897("cSeNj\"")), method1898(method1897("cSeNk\"")), method1898(method1897("cSeN]ebp\u0012@dV,"))};
   @OriginalMember(
      owner = "client!iba",
      name = "h",
      descriptor = "Laka;"
   )
   public static class418 field2998 = new class418(51, 7);
   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field3000 = false;
   @OriginalMember(
      owner = "client!iba",
      name = "d",
      descriptor = "I"
   )
   public static int field2994;
   @OriginalMember(
      owner = "client!iba",
      name = "g",
      descriptor = "I"
   )
   public static int field2995;
   @OriginalMember(
      owner = "client!iba",
      name = "i",
      descriptor = "I"
   )
   public static int field2996;
   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "I"
   )
   public static int field2997;
   @OriginalMember(
      owner = "client!iba",
      name = "f",
      descriptor = "I"
   )
   public static int field2999;
   @OriginalMember(
      owner = "client!iba",
      name = "e",
      descriptor = "Liea;"
   )
   public static class674 field3002;
   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field3001;

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(BII)I"
   )
   public final int method1893(byte arg0, int arg1, int arg2) {
      try {
         ++field2996;
         int var4 = ~arg2 <= ~class204.field2605 ? arg2 : class204.field2605;
         if (arg0 != -49) {
            return 118;
         } else if (class103.field1329 == this) {
            return 0;
         } else if (class658.field9805 == this) {
            return -arg1 + var4;
         } else {
            return class381.field5300 == this ? (-arg1 + var4) / 2 : 0;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3003[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2997;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3003[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1894(boolean arg0) {
      try {
         field2998 = null;
         field3001 = null;
         if (arg0) {
            field3002 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3003[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;"
   )
   public static final String[] method1895(String[] arg0, byte arg1) {
      boolean var2 = client.field1481;

      try {
         ++field2999;
         String[] var3 = new String[5];
         int var4 = 0;
         if (var2) {
            var3[var4] = var4 + field3003[3];
            if (arg0 != null && arg0[var4] != null) {
               var3[var4] = var3[var4] + arg0[var4];
            }

            ++var4;
         }

         while(true) {
            if (~var4 <= -6) {
               if (!var2) {
                  if (arg1 <= 5) {
                     return null;
                  }

                  return var3;
               }
            } else {
               var3[var4] = var4 + field3003[3];
            }

            if (arg0 != null && arg0[var4] != null) {
               var3[var4] = var3[var4] + arg0[var4];
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3003[5] + (arg0 != null ? field3003[4] : field3003[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method1896(byte arg0) {
      try {
         if (arg0 <= 105) {
            return 61;
         } else {
            ++field2994;
            return class334.field4590;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3003[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1897(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1898(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
