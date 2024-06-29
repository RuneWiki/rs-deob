import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class706 extends class107 implements class215 {
   @OriginalMember(
      owner = "client!gi",
      name = "C",
      descriptor = "Lef;"
   )
   private class513 field10563;
   @OriginalMember(
      owner = "client!gi",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10571 = new String[]{method5133(method5132("\u0010e*R3")), method5133(method5132("\u0010e*U3")), method5133(method5132("\u0010e*W3")), method5133(method5132("\u0010e*Q3")), method5133(method5132("\u0010e*S3")), method5133(method5132("\u0010e*T3")), method5133(method5132("\u0010e*P3")), method5133(method5132("\u0010e*^3")), method5133(method5132("\u0010e**r\u0019ep(3")), method5133(method5132("\f\"*8f")), method5133(method5132("\u0019yhz"))};
   @OriginalMember(
      owner = "client!gi",
      name = "y",
      descriptor = "Lsda;"
   )
   public static class269 field10566 = new class269(11, 16);
   @OriginalMember(
      owner = "client!gi",
      name = "F",
      descriptor = "I"
   )
   public static int field10558;
   @OriginalMember(
      owner = "client!gi",
      name = "B",
      descriptor = "I"
   )
   public static int field10559;
   @OriginalMember(
      owner = "client!gi",
      name = "u",
      descriptor = "I"
   )
   public static int field10560;
   @OriginalMember(
      owner = "client!gi",
      name = "t",
      descriptor = "I"
   )
   public static int field10561;
   @OriginalMember(
      owner = "client!gi",
      name = "A",
      descriptor = "I"
   )
   public static int field10562;
   @OriginalMember(
      owner = "client!gi",
      name = "D",
      descriptor = "I"
   )
   public static int field10564;
   @OriginalMember(
      owner = "client!gi",
      name = "E",
      descriptor = "I"
   )
   public static int field10565;
   @OriginalMember(
      owner = "client!gi",
      name = "x",
      descriptor = "I"
   )
   public static int field10569;
   @OriginalMember(
      owner = "client!gi",
      name = "v",
      descriptor = "I"
   )
   public static int field10570;
   @OriginalMember(
      owner = "client!gi",
      name = "w",
      descriptor = "Lgq;"
   )
   public static class540 field10567;
   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "[[B"
   )
   public static byte[][] field10568;

   @OriginalMember(
      owner = "client!gi",
      name = "h",
      descriptor = "(I)V",
      line = 3
   )
   public static void method5130(int arg0) {
      try {
         field10568 = null;
         int var1 = 14 / ((59 - arg0) / 44);
         field10566 = null;
         field10567 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10571[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(BI)V",
      line = 20
   )
   public final void method923(byte arg0, int arg1) {
      try {
         ++field10565;
         super.method923(arg0, this.field10563.field7515 * arg1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10571[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "c",
      descriptor = "(I)Lef;",
      line = 30
   )
   public final class513 method1623(int arg0) {
      try {
         ++field10562;
         if (arg0 <= 81) {
            field10568 = null;
         }

         return this.field10563;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10571[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "d",
      descriptor = "(I)Z",
      line = 45
   )
   public final boolean method1624(int arg0) {
      try {
         if (arg0 != -7695) {
            field10567 = null;
         }

         ++field10559;
         return super.method921(super.field1304.field5819, 0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10571[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "b",
      descriptor = "(I)I",
      line = 56
   )
   public final int method927(int arg0) {
      try {
         if (arg0 != 34962) {
            this.field10563 = null;
         }

         ++field10561;
         return super.method927(34962);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10571[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "<init>",
      descriptor = "(Leh;Lef;Z)V",
      line = 69
   )
   public class706(class379 arg0, class513 arg1, boolean arg2) {
      super(arg0, 34963, arg2);

      try {
         this.field10563 = arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10571[8] + (arg0 != null ? field10571[9] : field10571[10]) + ',' + (arg1 != null ? field10571[9] : field10571[10]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(ZZ)Ljaclib/memory/Buffer;",
      line = 79
   )
   public final Buffer method1625(boolean arg0, boolean arg1) {
      try {
         ++field10560;
         if (!arg0) {
            this.method1623(52);
         }

         return super.method924(arg1, super.field1304.field5819, -89);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10571[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "g",
      descriptor = "(I)Z",
      line = 91
   )
   public static final boolean method5131(int arg0) {
      try {
         if (arg0 != -28813) {
            method5131(-29);
         }

         ++field10558;
         return ~class777.field11357 != -1;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10571[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(I)V",
      line = 108
   )
   public final void method423(int arg0) {
      try {
         ++field10564;
         super.method423(arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10571[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5132(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5133(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
