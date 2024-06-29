import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class366 implements class110 {
   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "I"
   )
   public int field5098;
   @OriginalMember(
      owner = "client!hp",
      name = "k",
      descriptor = "Lbu;"
   )
   public class596 field5095;
   @OriginalMember(
      owner = "client!hp",
      name = "g",
      descriptor = "I"
   )
   public int field5091;
   @OriginalMember(
      owner = "client!hp",
      name = "j",
      descriptor = "I"
   )
   public int field5094;
   @OriginalMember(
      owner = "client!hp",
      name = "c",
      descriptor = "Liba;"
   )
   public class237 field5093;
   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5102 = new String[]{method2892(method2891("<vEqz:o\u001fs;")), method2892(method2891(":s\u0007!")), method2892(method2891("/(Ecn")), method2892(method2891("<vE\t;")), method2892(method2891("<vE\u000f;")), method2892(method2891("<vE\u000e;")), method2892(method2891("<vE\f;"))};
   @OriginalMember(
      owner = "client!hp",
      name = "h",
      descriptor = "Laka;"
   )
   public static class418 field5096 = new class418(77, 12);
   @OriginalMember(
      owner = "client!hp",
      name = "f",
      descriptor = "[F"
   )
   public static float[] field5101 = new float[4];
   @OriginalMember(
      owner = "client!hp",
      name = "b",
      descriptor = "F"
   )
   public static float field5099;
   @OriginalMember(
      owner = "client!hp",
      name = "d",
      descriptor = "I"
   )
   public static int field5090;
   @OriginalMember(
      owner = "client!hp",
      name = "e",
      descriptor = "I"
   )
   public static int field5097;
   @OriginalMember(
      owner = "client!hp",
      name = "l",
      descriptor = "I"
   )
   public static int field5100;
   @OriginalMember(
      owner = "client!hp",
      name = "m",
      descriptor = "Lgj;"
   )
   public static class736 field5092;
   @OriginalMember(
      owner = "client!hp",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field5089;

   @OriginalMember(
      owner = "client!hp",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2888(int arg0) {
      try {
         ++field5090;
         class288.field3983 = true;
         int var1 = 28 % (-arg0 / 46);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5102[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2889(int arg0) {
      try {
         if (~class493.field6885 == -2 || ~class493.field6885 == -4 || class493.field6885 != class178.field2279 && (class493.field6885 == 0 || ~class178.field2279 == -1)) {
            class737.field10798 = 0;
            class418.field5713 = 0;
            class35.field493.method1809(true);
         }

         ++field5100;
         class178.field2279 = class493.field6885;
         if (arg0 != -7593) {
            field5099 = -0.6560562F;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5102[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public class499 method842(byte arg0) {
      try {
         int var2 = 105 % ((arg0 - 4) / 37);
         ++field5097;
         return class359.field4999;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5102[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2890(int arg0) {
      try {
         if (arg0 <= -82) {
            field5089 = null;
            field5092 = null;
            field5096 = null;
            field5101 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5102[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "<init>",
      descriptor = "(ILiba;Lbu;II)V"
   )
   public class366(int arg0, class237 arg1, class596 arg2, int arg3, int arg4) {
      try {
         this.field5098 = arg3;
         this.field5095 = arg2;
         this.field5091 = arg0;
         this.field5094 = arg4;
         this.field5093 = arg1;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5102[0] + arg0 + ',' + (arg1 != null ? field5102[2] : field5102[1]) + ',' + (arg2 != null ? field5102[2] : field5102[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2891(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2892(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
