import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class101 {
   @OriginalMember(
      owner = "client!sd",
      name = "c",
      descriptor = "I"
   )
   public int field1237;
   @OriginalMember(
      owner = "client!sd",
      name = "f",
      descriptor = "I"
   )
   private int field1241;
   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1242 = new String[]{method887(method886("\u0000\u001ehKZ")), method887(method886("\u001d\u000f*e")), method887(method886("\bTh'\u000f")), method887(method886("\u0000\u001eh}\u001d \u000e4`\u001c\u0014R")), method887(method886("\u0000\u001ehJZ")), method887(method886("\u0000\u001ehHZ")), method887(method886("\u0000\u001eh5\u001b\u001d\u001327Z"))};
   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field1239 = new byte[50][];
   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "Lsda;"
   )
   public static class269 field1240 = new class269(12, 8);
   @OriginalMember(
      owner = "client!sd",
      name = "e",
      descriptor = "I"
   )
   public static int field1235;
   @OriginalMember(
      owner = "client!sd",
      name = "d",
      descriptor = "I"
   )
   public static int field1236;
   @OriginalMember(
      owner = "client!sd",
      name = "g",
      descriptor = "I"
   )
   public static int field1238;

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(B)I",
      line = 7
   )
   public final int method883(byte arg0) {
      try {
         if (arg0 != -25) {
            field1240 = null;
         }

         ++field1236;
         return this.field1241;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1242[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static void method884(int arg0) {
      try {
         if (arg0 > -123) {
            field1240 = null;
         }

         field1239 = null;
         field1240 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1242[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 30
   )
   public final String toString() {
      try {
         ++field1238;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1242[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(Lck;B[III[I)Lgha;",
      line = 38
   )
   public static final class364 method885(class667 arg0, byte arg1, int[] arg2, int arg3, int arg4, int[] arg5) {
      int var6 = client.field4530;

      try {
         ++field1235;
         if (arg1 >= -54) {
            return null;
         } else {
            byte[] var7 = new byte[arg3 * arg4];
            int var8 = 0;
            if (var6 == 0 && ~var8 <= ~arg3) {
               return new class364(arg0, arg4, arg3, var7);
            } else {
               do {
                  int var9 = arg4 * var8 + arg2[var8];
                  int var10 = 0;
                  if (var6 != 0) {
                     var7[var9++] = -1;
                     ++var10;
                  }

                  while(true) {
                     while(~arg5[var8] < ~var10) {
                        var7[var9++] = -1;
                        ++var10;
                     }

                     if (var6 == 0) {
                        ++var8;
                        break;
                     }

                     ++var10;
                  }
               } while(~var8 > ~arg3);

               return new class364(arg0, arg4, arg3, var7);
            }
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field1242[0] + (arg0 != null ? field1242[2] : field1242[1]) + ',' + arg1 + ',' + (arg2 != null ? field1242[2] : field1242[1]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1242[2] : field1242[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "<init>",
      descriptor = "(II)V",
      line = 74
   )
   public class101(int arg0, int arg1) {
      try {
         this.field1237 = arg1;
         this.field1241 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1242[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method886(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method887(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
