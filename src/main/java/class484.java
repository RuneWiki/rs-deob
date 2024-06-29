import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class484 extends class588 {
   @OriginalMember(
      owner = "client!vq",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7038 = new String[]{method3662(method3661("Jt8\u0015")), method3662(method3661("Rpz;f")), method3662(method3661("_/zW3")), method3662(method3661("Rpz1f")), method3662(method3661("Rpz8f")), method3662(method3661("Rpz:f"))};
   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "Lfd;"
   )
   public static class551 field7032 = new class551();
   @OriginalMember(
      owner = "client!vq",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field7037 = new int[4];
   @OriginalMember(
      owner = "client!vq",
      name = "A",
      descriptor = "B"
   )
   private byte field7026;
   @OriginalMember(
      owner = "client!vq",
      name = "t",
      descriptor = "B"
   )
   private byte field7028;
   @OriginalMember(
      owner = "client!vq",
      name = "s",
      descriptor = "B"
   )
   private byte field7029;
   @OriginalMember(
      owner = "client!vq",
      name = "x",
      descriptor = "B"
   )
   private byte field7033;
   @OriginalMember(
      owner = "client!vq",
      name = "r",
      descriptor = "I"
   )
   public static int field7027;
   @OriginalMember(
      owner = "client!vq",
      name = "w",
      descriptor = "I"
   )
   public static int field7030;
   @OriginalMember(
      owner = "client!vq",
      name = "p",
      descriptor = "I"
   )
   public static int field7034;
   @OriginalMember(
      owner = "client!vq",
      name = "q",
      descriptor = "I"
   )
   public static int field7036;
   @OriginalMember(
      owner = "client!vq",
      name = "y",
      descriptor = "Ld;"
   )
   public static class160 field7035;
   @OriginalMember(
      owner = "client!vq",
      name = "u",
      descriptor = "Z"
   )
   private boolean field7031;

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method3659(int arg0) {
      try {
         if (arg0 == 17814) {
            field7035 = null;
            field7037 = null;
            field7032 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7038[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(Lwga;I)V",
      line = 23
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         arg0.field11394 = this.field7029;
         arg0.field11389 = this.field7031;
         arg0.field11379 = this.field7033;
         if (arg1 > -120) {
            field7036 = 44;
         }

         arg0.field11405 = this.field7028;
         arg0.field11401 = this.field7026;
         ++field7034;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7038[1] + (arg0 != null ? field7038[2] : field7038[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(BLuda;)V",
      line = 38
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         this.field7031 = ~arg1.method3564((byte)-126) == -2;
         ++field7030;
         this.field7028 = arg1.method3543(-1132613840);
         this.field7029 = arg1.method3543(-1132613840);
         this.field7026 = arg1.method3543(-1132613840);
         int var3 = 38 % ((-26 - arg0) / 33);
         this.field7033 = arg1.method3543(-1132613840);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7038[3] + arg0 + ',' + (arg1 != null ? field7038[2] : field7038[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(FFFB)I",
      line = 55
   )
   public static final int method3660(float arg0, float arg1, float arg2, byte arg3) {
      try {
         ++field7027;
         if (arg3 >= -25) {
            field7032 = null;
         }

         float var4 = arg2 < 0.0F ? -arg2 : arg2;
         float var5 = arg1 < 0.0F ? -arg1 : arg1;
         float var6 = arg0 < 0.0F ? -arg0 : arg0;
         if (var4 < var5 && var6 < var5) {
            return !(arg1 > 0.0F) ? 1 : 0;
         } else if (var4 < var6 && var5 < var6) {
            return !(arg0 > 0.0F) ? 3 : 2;
         } else {
            return !(arg2 > 0.0F) ? 5 : 4;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7038[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3661(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3662(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
