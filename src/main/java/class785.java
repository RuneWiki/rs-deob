import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class785 implements class517 {
   @OriginalMember(
      owner = "client!kq",
      name = "e",
      descriptor = "Lww;"
   )
   private class339 field11469;
   @OriginalMember(
      owner = "client!kq",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   private String field11465;
   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11474 = new String[]{method5668(method5667("h@VdS")), method5668(method5667("h@VfS")), method5668(method5667("mD\u0014K")), method5668(method5667("x\u001fV\t\u0006")), method5668(method5667("h@V\u001b\u0012mX\f\u0019S")), method5668(method5667("h@VeS"))};
   @OriginalMember(
      owner = "client!kq",
      name = "f",
      descriptor = "J"
   )
   public static long field11471 = 0L;
   @OriginalMember(
      owner = "client!kq",
      name = "d",
      descriptor = "Lse;"
   )
   public static class6 field11470 = new class6(66, 4);
   @OriginalMember(
      owner = "client!kq",
      name = "c",
      descriptor = "I"
   )
   public static int field11473 = 1400;
   @OriginalMember(
      owner = "client!kq",
      name = "i",
      descriptor = "I"
   )
   public static int field11466;
   @OriginalMember(
      owner = "client!kq",
      name = "b",
      descriptor = "I"
   )
   public static int field11468;
   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "Lce;"
   )
   public static class591 field11467;
   @OriginalMember(
      owner = "client!kq",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field11472;

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(I)Ltg;"
   )
   public final class374 method1641(int arg0) {
      try {
         if (arg0 != -23257) {
            this.method1638(-125);
         }

         ++field11468;
         return class374.field5229;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11474[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1638(int arg0) {
      try {
         if (arg0 != 13053) {
            field11472 = null;
         }

         ++field11466;
         return this.field11469.method2711(arg0 ^ 12983, this.field11465) ? 100 : 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11474[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5666(int arg0) {
      try {
         field11472 = null;
         field11470 = null;
         field11467 = null;
         if (arg0 != 0) {
            field11467 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11474[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "<init>",
      descriptor = "(Lww;Ljava/lang/String;)V"
   )
   public class785(class339 arg0, String arg1) {
      try {
         this.field11469 = arg0;
         this.field11465 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11474[4] + (arg0 != null ? field11474[3] : field11474[2]) + ',' + (arg1 != null ? field11474[3] : field11474[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5667(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5668(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
