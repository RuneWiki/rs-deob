import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class712 extends class390 {
   @OriginalMember(
      owner = "client!ar",
      name = "y",
      descriptor = "I"
   )
   public int field10380;
   @OriginalMember(
      owner = "client!ar",
      name = "t",
      descriptor = "S"
   )
   public short field10382;
   @OriginalMember(
      owner = "client!ar",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   public String field10381;
   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10387 = new String[]{method5177(method5176("%1tT>")), method5177(method5176("%1tW>")), method5177(method5176("%1t*\u007f**.(>")), method5177(method5176("?mt8k")), method5177(method5176("*66z"))};
   @OriginalMember(
      owner = "client!ar",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field10384 = new int[8];
   @OriginalMember(
      owner = "client!ar",
      name = "s",
      descriptor = "F"
   )
   public static float field10386;
   @OriginalMember(
      owner = "client!ar",
      name = "x",
      descriptor = "I"
   )
   public static int field10383;
   @OriginalMember(
      owner = "client!ar",
      name = "v",
      descriptor = "I"
   )
   public static int field10385;

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5174(byte arg0) {
      try {
         if (arg0 <= 9) {
            method5175(104, -13, 105, 40);
         }

         field10384 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10387[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class712(String arg0, int arg1) {
      try {
         this.field10380 = (int)(class133.method1054(-29025) / 1000L);
         this.field10382 = (short)arg1;
         this.field10381 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10387[2] + (arg0 != null ? field10387[3] : field10387[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method5175(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg1 != -25591) {
            method5175(52, -60, 6, 106);
         }

         ++field10383;
         class613.field9016 = new byte[arg3][arg0][arg2];
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10387[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5176(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5177(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
