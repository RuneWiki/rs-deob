import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class774 extends class67 {
   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11385 = new String[]{method5630(method5629("\\r.g\u0000\u0012")), method5630(method5629("\\r.g\u0006\u0012")), method5630(method5629("\\r.g\u0003\u0012")), method5630(method5629("\\r.g\t\u0012")), method5630(method5629("\\r.g\u0004\u0012")), method5630(method5629("\\r.g\u0002\u0012"))};
   @OriginalMember(
      owner = "client!fea",
      name = "q",
      descriptor = "Ltia;"
   )
   public static class208 field11381 = new class208();
   @OriginalMember(
      owner = "client!fea",
      name = "l",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field11382 = new String[200];
   @OriginalMember(
      owner = "client!fea",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field11383 = false;
   @OriginalMember(
      owner = "client!fea",
      name = "k",
      descriptor = "I"
   )
   public static int field11376;
   @OriginalMember(
      owner = "client!fea",
      name = "m",
      descriptor = "I"
   )
   public static int field11377;
   @OriginalMember(
      owner = "client!fea",
      name = "s",
      descriptor = "I"
   )
   public static int field11378;
   @OriginalMember(
      owner = "client!fea",
      name = "p",
      descriptor = "I"
   )
   public static int field11379;
   @OriginalMember(
      owner = "client!fea",
      name = "r",
      descriptor = "I"
   )
   public static int field11380;
   @OriginalMember(
      owner = "client!fea",
      name = "n",
      descriptor = "I"
   )
   public static int field11384;

   @OriginalMember(
      owner = "client!fea",
      name = "d",
      descriptor = "(I)I",
      line = 3
   )
   public final int method5627(int arg0) {
      try {
         ++field11379;
         if (arg0 != 480102311) {
            this.method161(-119, -30);
         }

         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11385[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 14
   )
   public class774(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(IZ)V",
      line = 17
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field11377;
         if (!arg1) {
            method5628(92);
         }

         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11385[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 28
   )
   public class774(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "c",
      descriptor = "(I)V",
      line = 31
   )
   public static void method5628(int arg0) {
      try {
         field11382 = null;
         if (arg0 > -107) {
            method5628(110);
         }

         field11381 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11385[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(II)I",
      line = 44
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field11376;
         if (arg1 > -74) {
            field11381 = null;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11385[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(B)V",
      line = 59
   )
   public final void method158(byte arg0) {
      try {
         ++field11378;
         if (arg0 != -69) {
            this.method161(-23, -75);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11385[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "b",
      descriptor = "(I)I",
      line = 69
   )
   public final int method162(int arg0) {
      try {
         ++field11380;
         if (arg0 != 0) {
            method5628(74);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11385[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5629(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5630(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
