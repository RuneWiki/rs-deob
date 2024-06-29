import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class258 {
   @OriginalMember(
      owner = "client!cca",
      name = "c",
      descriptor = "[I"
   )
   public int[] field3494;
   @OriginalMember(
      owner = "client!cca",
      name = "b",
      descriptor = "[I"
   )
   public int[] field3490;
   @OriginalMember(
      owner = "client!cca",
      name = "f",
      descriptor = "[I"
   )
   public int[] field3497;
   @OriginalMember(
      owner = "client!cca",
      name = "g",
      descriptor = "[I"
   )
   public int[] field3493;
   @OriginalMember(
      owner = "client!cca",
      name = "h",
      descriptor = "[S"
   )
   public short[] field3496;
   @OriginalMember(
      owner = "client!cca",
      name = "i",
      descriptor = "[S"
   )
   public short[] field3492;
   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3499 = new String[]{method1955(method1954(">\u0003\u001a\\5u")), method1955(method1954(">\u0003\u001a\\K4\u000e\u0012\u0006Iu")), method1955(method1954("3\u0015\u0017\u001e")), method1955(method1954("&NU\\\n")), method1955(method1954(">\u0003\u001a\\6u"))};
   @OriginalMember(
      owner = "client!cca",
      name = "e",
      descriptor = "[C"
   )
   public static char[] field3491 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "[Z"
   )
   public static boolean[] field3498 = new boolean[5];
   @OriginalMember(
      owner = "client!cca",
      name = "d",
      descriptor = "I"
   )
   public static int field3495;

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(Ld;ZLeaa;)V"
   )
   public static final void method1952(class160 arg0, boolean arg1, class526 arg2) {
      try {
         class239.field3030 = arg2;
         if (arg1) {
            ++field3495;
            class91.field1164 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3499[4] + (arg0 != null ? field3499[3] : field3499[2]) + ',' + arg1 + ',' + (arg2 != null ? field3499[3] : field3499[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1953(int arg0) {
      try {
         field3491 = null;
         field3498 = null;
         if (arg0 < 70) {
            method1952((class160)null, false, (class526)null);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3499[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "<init>",
      descriptor = "(Lfca;)V"
   )
   public class258(class91 arg0) {
      try {
         this.field3494 = new int[3];
         this.field3490 = new int[2];
         this.field3497 = new int[2];
         this.field3493 = new int[3];
         this.field3493[2] = arg0.field1108;
         this.field3493[0] = arg0.field1116;
         this.field3493[1] = arg0.field1136;
         this.field3494[0] = arg0.field1129;
         this.field3494[2] = arg0.field1086;
         this.field3494[1] = arg0.field1143;
         this.field3490[1] = arg0.field1160;
         this.field3490[0] = arg0.field1170;
         this.field3497[0] = arg0.field1166;
         this.field3497[1] = arg0.field1124;
         if (arg0.field1106 != null) {
            this.field3496 = new short[arg0.field1106.length];
            class195.method1489(arg0.field1106, 0, this.field3496, 0, this.field3496.length);
         }

         if (arg0.field1096 != null) {
            this.field3492 = new short[arg0.field1096.length];
            class195.method1489(arg0.field1096, 0, this.field3492, 0, this.field3492.length);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3499[1] + (arg0 != null ? field3499[3] : field3499[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1954(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1955(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
