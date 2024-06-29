import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class202 {
   @OriginalMember(
      owner = "client!ru",
      name = "h",
      descriptor = "Lgw;"
   )
   private class179 field3026 = new class179(64);
   @OriginalMember(
      owner = "client!ru",
      name = "f",
      descriptor = "Lhw;"
   )
   private class141 field3025;
   @OriginalMember(
      owner = "client!ru",
      name = "k",
      descriptor = "Lne;"
   )
   public class335 field3030;
   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3031 = new String[]{method1734(method1733("\u0019;\u0019rQ")), method1734(method1733("\u0019;\u0019qQ")), method1734(method1733("\u0019;\u0019uQ")), method1734(method1733("\u0019;\u0019tQ")), method1734(method1733("\u0010`\u0019\u001e\u0004")), method1734(method1733("\u0005;[\\")), method1734(method1733("\u0019;\u0019\f\u0010\u0005'C\u000eQ")), method1734(method1733("\u0019;\u0019sQ"))};
   @OriginalMember(
      owner = "client!ru",
      name = "i",
      descriptor = "[[Z"
   )
   public static boolean[][] field3022 = new boolean[][]{new boolean[13], {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}};
   @OriginalMember(
      owner = "client!ru",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field3023 = new int[128][128];
   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "F"
   )
   public static float field3028;
   @OriginalMember(
      owner = "client!ru",
      name = "d",
      descriptor = "I"
   )
   public static int field3021;
   @OriginalMember(
      owner = "client!ru",
      name = "c",
      descriptor = "I"
   )
   public static int field3024;
   @OriginalMember(
      owner = "client!ru",
      name = "j",
      descriptor = "I"
   )
   public static int field3027;
   @OriginalMember(
      owner = "client!ru",
      name = "g",
      descriptor = "I"
   )
   public static int field3029;
   @OriginalMember(
      owner = "client!ru",
      name = "e",
      descriptor = "Ltd;"
   )
   public static class476 field3020;

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(I)V",
      line = 11
   )
   public static void method1728(int arg0) {
      try {
         field3023 = null;
         field3020 = null;
         if (arg0 != -24304) {
            field3022 = null;
         }

         field3022 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3031[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(B)V",
      line = 24
   )
   public final void method1729(byte arg0) {
      try {
         class179 var2 = this.field3026;
         synchronized(this.field3026) {
            if (arg0 >= -40) {
               field3028 = 0.16328482F;
            }

            this.field3026.method1591((byte)58);
         }

         ++field3021;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3031[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(II)V",
      line = 42
   )
   public final void method1730(int arg0, int arg1) {
      try {
         int var3 = 30 / ((-46 - arg1) / 55);
         class179 var4 = this.field3026;
         synchronized(this.field3026) {
            this.field3026.method1579(-68, arg0);
         }

         ++field3029;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3031[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(IB)Lpda;",
      line = 62
   )
   public final class654 method1731(int arg0, byte arg1) {
      try {
         ++field3027;
         class179 var3 = this.field3026;
         class654 var4;
         synchronized(this.field3026) {
            var4 = (class654)this.field3026.method1584((long)arg0, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field3025;
            byte[] var6;
            synchronized(this.field3025) {
               var6 = this.field3025.method1347((byte)123, 32, arg0);
            }

            class654 var7 = new class654();
            var7.field9533 = this;
            int var8 = 118 / ((67 - arg1) / 41);
            if (var6 != null) {
               var7.method4808(new class473(var6), -26);
            }

            class179 var9 = this.field3026;
            synchronized(this.field3026) {
               this.field3026.method1581((long)arg0, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field3031[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "b",
      descriptor = "(I)V",
      line = 92
   )
   public final void method1732(int arg0) {
      try {
         class179 var2 = this.field3026;
         synchronized(this.field3026) {
            this.field3026.method1589((byte)56);
         }

         ++field3024;
         if (arg0 != 128) {
            this.method1729((byte)82);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3031[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "<init>",
      descriptor = "(Lca;ILhw;Lne;)V",
      line = 111
   )
   public class202(class320 arg0, int arg1, class141 arg2, class335 arg3) {
      try {
         this.field3025 = arg2;
         this.field3025.method1346(32, 0);
         this.field3030 = arg3;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3031[6] + (arg0 != null ? field3031[4] : field3031[5]) + ',' + arg1 + ',' + (arg2 != null ? field3031[4] : field3031[5]) + ',' + (arg3 != null ? field3031[4] : field3031[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1733(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1734(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
