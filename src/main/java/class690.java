import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class690 {
   @OriginalMember(
      owner = "client!rda",
      name = "e",
      descriptor = "I"
   )
   public int field10394;
   @OriginalMember(
      owner = "client!rda",
      name = "f",
      descriptor = "Leh;"
   )
   private class379 field10398;
   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10402 = new String[]{method5027(method5026(",Fu;|7L}a~v")), method5027(method5026("0Wxy")), method5027(method5026("%\f:;=")), method5027(method5026(",Fu;\u0002v")), method5027(method5026(",Fu;&7Luy)$G<")), method5027(method5026(",Fu;\u0001v"))};
   @OriginalMember(
      owner = "client!rda",
      name = "c",
      descriptor = "Lcj;"
   )
   public static class721 field10395 = new class721(10, 2, 2, 0);
   @OriginalMember(
      owner = "client!rda",
      name = "d",
      descriptor = "Lsda;"
   )
   public static class269 field10397 = new class269(8, 2);
   @OriginalMember(
      owner = "client!rda",
      name = "b",
      descriptor = "Lsda;"
   )
   public static class269 field10401 = new class269(91, 15);
   @OriginalMember(
      owner = "client!rda",
      name = "g",
      descriptor = "I"
   )
   public static int field10396;
   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "I"
   )
   public static int field10399;
   @OriginalMember(
      owner = "client!rda",
      name = "h",
      descriptor = "I"
   )
   public static int field10400;

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(IZII)I"
   )
   public static final int method5024(int arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field10396;
         class5 var4 = class289.method2200(arg3, arg2, arg1);
         if (var4 == null) {
            return 0;
         } else {
            return ~arg0 <= -1 && ~arg0 > ~var4.field87.length ? var4.field87[arg0] : 0;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10402[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5025(byte arg0) {
      try {
         field10401 = null;
         field10397 = null;
         field10395 = null;
         if (arg0 != 116) {
            method5024(-1, false, 26, -57);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10402[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "<init>",
      descriptor = "(Leh;II)V"
   )
   public class690(class379 arg0, int arg1, int arg2) {
      try {
         this.field10394 = arg2;
         this.field10398 = arg0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10402[0] + (arg0 != null ? field10402[2] : field10402[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field10398.method2931(this.field10394, 120);
         ++field10399;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10402[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5026(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5027(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
