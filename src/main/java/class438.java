import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public abstract class class438 extends class305 {
   @OriginalMember(
      owner = "client!mja",
      name = "F",
      descriptor = "Z"
   )
   public volatile boolean field6322 = true;
   @OriginalMember(
      owner = "client!mja",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6325 = new String[]{method3289(method3288("apVN\r")), method3289(method3288("w4\u0019N62")), method3289(method3288("t+\u0014\f")), method3289(method3288("w4\u0019N32")), method3289(method3288("w4\u0019N12")), method3289(method3288("w4\u0019N42"))};
   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "I"
   )
   public static int field6315 = 0;
   @OriginalMember(
      owner = "client!mja",
      name = "B",
      descriptor = "Luw;"
   )
   public static class435 field6316 = new class435(32, 12);
   @OriginalMember(
      owner = "client!mja",
      name = "A",
      descriptor = "I"
   )
   public static int field6317;
   @OriginalMember(
      owner = "client!mja",
      name = "w",
      descriptor = "I"
   )
   public static int field6318;
   @OriginalMember(
      owner = "client!mja",
      name = "E",
      descriptor = "I"
   )
   public static int field6319;
   @OriginalMember(
      owner = "client!mja",
      name = "y",
      descriptor = "I"
   )
   public static int field6324;
   @OriginalMember(
      owner = "client!mja",
      name = "D",
      descriptor = "Z"
   )
   public boolean field6320;
   @OriginalMember(
      owner = "client!mja",
      name = "x",
      descriptor = "Z"
   )
   public boolean field6321;
   @OriginalMember(
      owner = "client!mja",
      name = "v",
      descriptor = "Z"
   )
   public static boolean field6323;

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(Luda;I)Lrs;",
      line = 4
   )
   public static final class677 method3284(class473 arg0, int arg1) {
      try {
         ++field6319;
         String var2 = arg0.method3566(-16496688);
         class678 var3 = class405.method3115(86)[arg0.method3564((byte)-92)];
         class112 var4 = class213.method1811(false)[arg0.method3564((byte)-54)];
         int var5 = arg0.method3538(-128);
         int var6 = arg0.method3538(-128);
         int var7 = arg0.method3564((byte)-46);
         int var8 = arg0.method3564((byte)-115);
         int var9 = arg0.method3564((byte)-50);
         int var10 = arg0.method3565(true);
         int var11 = arg0.method3565(true);
         int var12 = 64 / ((65 - arg1) / 57);
         int var13 = arg0.method3567(31871);
         int var14 = arg0.method3567(31871);
         int var15 = arg0.method3567(31871);
         return new class677(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var13, var14, var15);
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field6325[4] + (arg0 != null ? field6325[0] : field6325[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "i",
      descriptor = "(I)V",
      line = 40
   )
   public static void method3285(int arg0) {
      try {
         field6316 = null;
         if (arg0 != 2) {
            method3285(-23);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6325[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Z",
      line = 53
   )
   public static final boolean method3286(String arg0, byte arg1) {
      try {
         ++field6318;
         int var2 = 2 % ((16 - arg1) / 44);
         return class592.field8528.containsKey(arg0);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6325[3] + (arg0 != null ? field6325[0] : field6325[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(IZIILwk;I)V",
      line = 75
   )
   public static final void method3287(int arg0, boolean arg1, int arg2, int arg3, class152 arg4, int arg5) {
      try {
         if (!arg1) {
            field6316 = null;
         }

         ++field6317;
         if (~arg0 <= -2 && ~arg5 <= -2 && arg0 <= class209.field3112 - 2 && ~(class1.field3 - 2) <= ~arg5) {
            if (class90.field1473 == null) {
               return;
            }

            class268 var6 = class358.field5362.method2845(arg2, arg5, arg0, arg3, false);
            if (var6 != null) {
               if (var6 instanceof class48) {
                  ((class48)var6).method585(arg4, (byte)-4);
                  return;
               }

               if (!(var6 instanceof class397)) {
                  if (!(var6 instanceof class270)) {
                     if (var6 instanceof class566) {
                        ((class566)var6).method4224(-84, arg4);
                        return;
                     }
                  } else {
                     ((class270)var6).method2137(false, arg4);
                  }

                  return;
               }

               ((class397)var6).method3059((byte)117, arg4);
               return;
            }
         }

      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field6325[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6325[0] : field6325[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(I)[B"
   )
   public abstract byte[] method1091(int arg0);

   @OriginalMember(
      owner = "client!mja",
      name = "h",
      descriptor = "(I)I"
   )
   public abstract int method1089(int arg0);

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3288(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3289(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
