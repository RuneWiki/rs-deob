import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class349 extends class313 {
   @OriginalMember(
      owner = "client!pba",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5299 = new String[]{method2734(method2733("|4p\u0019\u0011$")), method2734(method2733("|4p\u0019\u0013$")), method2734(method2733("|4p\u0019\u0017$"))};
   @OriginalMember(
      owner = "client!pba",
      name = "H",
      descriptor = "I"
   )
   public static int field5296 = 0;
   @OriginalMember(
      owner = "client!pba",
      name = "M",
      descriptor = "Lsd;"
   )
   public static class101 field5297 = new class101(130, 0);
   @OriginalMember(
      owner = "client!pba",
      name = "L",
      descriptor = "Lsd;"
   )
   public static class101 field5298 = new class101(101, 6);
   @OriginalMember(
      owner = "client!pba",
      name = "K",
      descriptor = "I"
   )
   public static int field5294;
   @OriginalMember(
      owner = "client!pba",
      name = "J",
      descriptor = "I"
   )
   public static int field5295;
   @OriginalMember(
      owner = "client!pba",
      name = "I",
      descriptor = "[B"
   )
   private byte[] field5293;

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(BBI)V"
   )
   public final void method2359(byte arg0, byte arg1, int arg2) {
      try {
         ++field5294;
         int var4 = -70 % ((arg1 - 34) / 41);
         int var5 = arg2 * 2;
         int var6 = arg0 & 255;
         int var10001 = var5;
         int var9 = var5 + 1;
         this.field5293[var10001] = (byte)(var6 * 3 >> 5);
         this.field5293[var9] = (byte)(var6 * 3 >> 5);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5299[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method2730(int arg0) {
      try {
         field5298 = null;
         if (arg0 != 130) {
            field5296 = -29;
         }

         field5297 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5299[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(IIIB)[B"
   )
   public final byte[] method2731(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field5295;
         this.field5293 = new byte[arg0 * arg1 * arg2 * 2];
         this.method3429(arg1, arg2, arg0, 26264);
         if (arg3 <= 67) {
            method2730(-21);
         }

         return this.field5293;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5299[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "<init>",
      descriptor = "()V"
   )
   public class349() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(III)Lqr;"
   )
   public static final class72 method2732(int arg0, int arg1, int arg2) {
      if (class353.field5360[arg0][arg1][arg2] == null) {
         boolean var3 = class353.field5360[0][arg1][arg2] != null && class353.field5360[0][arg1][arg2].field918 != null;
         if (var3 && arg0 >= class424.field6437 - 1) {
            return null;
         }

         class676.method4939(arg0, arg1, arg2);
      }

      return class353.field5360[arg0][arg1][arg2];
   }

   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2733(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2734(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
