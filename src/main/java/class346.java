import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class346 implements class475 {
   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   private String field5269;
   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5273 = new String[]{method2714(method2713(")E<~on")), method2714(method2713(")E<~\u0016/M4$\u0014n")), method2714(method2713("=\rs~W")), method2714(method2713("(V1<")), method2714(method2713(")E<~in")), method2714(method2713(")E<~kn")), method2714(method2713(")E<~nn")), method2714(method2713(")E<~hn"))};
   @OriginalMember(
      owner = "client!ofa",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field5268 = new int[]{16, 32, 64, 128};
   @OriginalMember(
      owner = "client!ofa",
      name = "c",
      descriptor = "I"
   )
   public static int field5265;
   @OriginalMember(
      owner = "client!ofa",
      name = "f",
      descriptor = "I"
   )
   public static int field5266;
   @OriginalMember(
      owner = "client!ofa",
      name = "h",
      descriptor = "I"
   )
   public static int field5267;
   @OriginalMember(
      owner = "client!ofa",
      name = "g",
      descriptor = "I"
   )
   public static int field5270;
   @OriginalMember(
      owner = "client!ofa",
      name = "e",
      descriptor = "I"
   )
   public static int field5271;
   @OriginalMember(
      owner = "client!ofa",
      name = "d",
      descriptor = "Z"
   )
   private boolean field5272;

   @OriginalMember(
      owner = "client!ofa",
      name = "d",
      descriptor = "(I)Z",
      line = 3
   )
   public final boolean method2710(int arg0) {
      try {
         int var2 = -61 / ((41 - arg0) / 63);
         ++field5265;
         return this.field5272;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5273[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "b",
      descriptor = "(I)V",
      line = 13
   )
   public static final void method2711(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "c",
      descriptor = "(I)V",
      line = 56
   )
   public static void method2712(int arg0) {
      try {
         field5268 = null;
         if (arg0 != -1) {
            field5267 = -115;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5273[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(B)I",
      line = 69
   )
   public final int method1242(byte arg0) {
      try {
         ++field5271;
         int var2 = class600.method4387((byte)-77, this.field5269);
         if (~var2 <= -1 && ~var2 >= -101) {
            return var2;
         } else {
            int var3 = -104 % ((arg0 - 45) / 44);
            this.field5272 = true;
            return 100;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5273[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(I)Lam;",
      line = 88
   )
   public final class658 method1241(int arg0) {
      try {
         if (arg0 != -1321) {
            method2711(3);
         }

         ++field5270;
         return class658.field9549;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5273[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 104
   )
   public class346(String arg0) {
      try {
         this.field5269 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5273[1] + (arg0 != null ? field5273[2] : field5273[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2713(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2714(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
