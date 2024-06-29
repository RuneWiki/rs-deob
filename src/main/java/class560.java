import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class560 {
   @OriginalMember(
      owner = "client!pga",
      name = "i",
      descriptor = "I"
   )
   public int field8378;
   @OriginalMember(
      owner = "client!pga",
      name = "b",
      descriptor = "[I"
   )
   public int[] field8380;
   @OriginalMember(
      owner = "client!pga",
      name = "h",
      descriptor = "[I"
   )
   public int[] field8373;
   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8381 = new String[]{method4149(method4148("Om@\u0001:VdH[8\u0017")), method4149(method4148("Q\u007fMC")), method4149(method4148("Om@\u0001G\u0017")), method4149(method4148("D$\u000f\u0001{"))};
   @OriginalMember(
      owner = "client!pga",
      name = "g",
      descriptor = "I"
   )
   public static int field8374 = -1;
   @OriginalMember(
      owner = "client!pga",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field8379 = false;
   @OriginalMember(
      owner = "client!pga",
      name = "c",
      descriptor = "I"
   )
   public static int field8372;
   @OriginalMember(
      owner = "client!pga",
      name = "d",
      descriptor = "I"
   )
   public static int field8376;
   @OriginalMember(
      owner = "client!pga",
      name = "e",
      descriptor = "I"
   )
   public static int field8377;
   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field8375;

   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "(IZLeaa;I)Lpg;"
   )
   public static final class763 method4147(int arg0, boolean arg1, class526 arg2, int arg3) {
      try {
         if (arg1) {
            return null;
         } else {
            ++field8377;
            byte[] var4 = arg2.method3899(-64, arg0, arg3);
            return var4 == null ? null : new class763(var4);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8381[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8381[3] : field8381[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class560(int arg0) {
      try {
         this.field8378 = arg0;
         this.field8380 = new int[this.field8378];
         this.field8373 = new int[this.field8378];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8381[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4148(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4149(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
