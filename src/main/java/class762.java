import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class762 {
   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11285 = new String[]{method5588(method5587("x\u0018#L\u0014")), method5588(method5587("x\u0018#M\u0014")), method5588(method5587("x\u0018#O\u0014"))};
   @OriginalMember(
      owner = "client!so",
      name = "c",
      descriptor = "[[Z"
   )
   public static boolean[][] field11281 = new boolean[][]{new boolean[4], new boolean[4], {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
   @OriginalMember(
      owner = "client!so",
      name = "d",
      descriptor = "I"
   )
   public static int field11282 = 0;
   @OriginalMember(
      owner = "client!so",
      name = "b",
      descriptor = "I"
   )
   public static int field11283;
   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "I"
   )
   public static int field11284;

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public static final void method5584(byte arg0) {
      try {
         class261.field4293 = false;
         ++field11284;
         if (arg0 != -68) {
            field11281 = null;
         }

         class204.method1782((byte)7);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11285[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(Z)V",
      line = 21
   )
   public static void method5585(boolean arg0) {
      try {
         if (!arg0) {
            method5584((byte)73);
         }

         field11281 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11285[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(I)V",
      line = 38
   )
   public static final void method5586(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field11283;
         if (arg0 > -111) {
            method5585(false);
         }

         if (class304.field4747) {
            do {
               while(~class589.field8690 > ~class529.field8026.length) {
                  class433 var2 = class529.field8026[class589.field8690];
                  if (var2 == null || var2.field6660 != -1) {
                     ++class589.field8690;
                     if (!var1) {
                        continue;
                     }
                  }

                  if (class444.field6811 == null) {
                     class444.field6811 = class227.field3447.method2533(var2.field6661, (byte)-41);
                  }

                  int var3 = class444.field6811.field1326;
                  if (var3 == -1) {
                     return;
                  }

                  ++class589.field8690;
                  var2.field6660 = var3;
                  class444.field6811 = null;
               }
            } while(var1);

         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11285[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5587(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5588(char[] arg0) {
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
            var10005 = 119;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
