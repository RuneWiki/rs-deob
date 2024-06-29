import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class357 extends class744 {
   @OriginalMember(
      owner = "client!gd",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5412 = new String[]{method2793(method2792("\fU\u0013\u0017\u001b")), method2793(method2792("\fU\u0013\u0016\u001b")), method2793(method2792("\fU\u0013\u0015\u001b")), method2793(method2792("\u0005DQ7")), method2793(method2792("\fU\u0013\u000b\u001b")), method2793(method2792("\u0010\u001f\u0013uN")), method2793(method2792("\fU\u0013\u0014\u001b")), method2793(method2792("\fU\u0013\u001f\u001b")), method2793(method2792("\fU\u0013\u0019\u001b"))};
   @OriginalMember(
      owner = "client!gd",
      name = "D",
      descriptor = "I"
   )
   public static int field5404;
   @OriginalMember(
      owner = "client!gd",
      name = "H",
      descriptor = "I"
   )
   public static int field5405;
   @OriginalMember(
      owner = "client!gd",
      name = "F",
      descriptor = "I"
   )
   public static int field5406;
   @OriginalMember(
      owner = "client!gd",
      name = "G",
      descriptor = "I"
   )
   public static int field5407;
   @OriginalMember(
      owner = "client!gd",
      name = "A",
      descriptor = "I"
   )
   public static int field5409;
   @OriginalMember(
      owner = "client!gd",
      name = "I",
      descriptor = "I"
   )
   public static int field5410;
   @OriginalMember(
      owner = "client!gd",
      name = "C",
      descriptor = "I"
   )
   public static int field5411;
   @OriginalMember(
      owner = "client!gd",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field5408;

   @OriginalMember(
      owner = "client!gd",
      name = "h",
      descriptor = "(I)V",
      line = 4
   )
   public static final void method2787(int arg0) {
      try {
         if (arg0 != -17687) {
            field5408 = null;
         }

         ++field5410;
         class136.field1744 = new class544[class241.field3064.method3903((byte)89)][];
         class660.field9568 = new class544[class241.field3064.method3903((byte)-96)][];
         class685.field10272 = new boolean[class241.field3064.method3903((byte)104)];
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5412[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "([BI)Z",
      line = 17
   )
   public static final boolean method2788(byte[] arg0, int arg1) {
      try {
         ++field5405;
         class128 var2 = new class128(arg0);
         int var3 = var2.method1104(255);
         if (var3 != 2) {
            return false;
         } else {
            boolean var4 = arg1 == var2.method1104(255);
            if (var4) {
               class743.method5413(8, var2);
            }

            class29.method208(-24119, var2);
            return true;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5412[4] + (arg0 != null ? field5412[5] : field5412[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(IIII)V",
      line = 44
   )
   public final void method1397(int arg0, int arg1, int arg2, int arg3) {
      try {
         super.field11027 = arg2;
         ++field5406;
         super.field11031 = arg3;
         if (arg0 == 2969) {
            super.field11038 = arg1;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5412[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(FB)V",
      line = 58
   )
   public final void method1398(float arg0, byte arg1) {
      try {
         ++field5409;
         super.field11028 = arg0;
         int var3 = 90 / ((43 - arg1) / 51);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5412[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "i",
      descriptor = "(I)[I",
      line = 69
   )
   public static final int[] method2789(int arg0) {
      try {
         ++field5411;
         return arg0 != 29510 ? null : new int[]{class87.field1058, class78.field979, class374.field5671};
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5412[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "g",
      descriptor = "(I)V",
      line = 80
   )
   public static void method2790(int arg0) {
      try {
         field5408 = null;
         if (arg0 != 2) {
            method2787(79);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5412[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "<init>",
      descriptor = "(IIIIIF)V",
      line = 90
   )
   public class357(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!gd",
      name = "j",
      descriptor = "(I)Lmja;",
      line = 96
   )
   public static final class440 method2791(int arg0) {
      try {
         ++field5404;
         if (arg0 != 1) {
            method2789(103);
         }

         return class329.field4667;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5412[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2792(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2793(char[] arg0) {
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
            var10005 = 49;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
