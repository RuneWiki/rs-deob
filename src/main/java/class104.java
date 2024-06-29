import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class104 extends class67 {
   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1452 = new String[]{method1009(method1008("dA\u001e\u0015\u0017")), method1009(method1008("w\u001e\u001e\u007fB")), method1009(method1008("q\u001a\\W")), method1009(method1008("w\u001e\u001e~B")), method1009(method1008("w\u001e\u001eyB")), method1009(method1008("w\u001e\u001ezB")), method1009(method1008("w\u001e\u001esB")), method1009(method1008("w\u001e\u001e|B")), method1009(method1008("w\u001e\u001exB"))};
   @OriginalMember(
      owner = "client!hq",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field1446 = new class498(40, -1);
   @OriginalMember(
      owner = "client!hq",
      name = "l",
      descriptor = "I"
   )
   public static int field1443;
   @OriginalMember(
      owner = "client!hq",
      name = "q",
      descriptor = "I"
   )
   public static int field1444;
   @OriginalMember(
      owner = "client!hq",
      name = "r",
      descriptor = "I"
   )
   public static int field1445;
   @OriginalMember(
      owner = "client!hq",
      name = "s",
      descriptor = "I"
   )
   public static int field1447;
   @OriginalMember(
      owner = "client!hq",
      name = "o",
      descriptor = "I"
   )
   public static int field1449;
   @OriginalMember(
      owner = "client!hq",
      name = "p",
      descriptor = "I"
   )
   public static int field1450;
   @OriginalMember(
      owner = "client!hq",
      name = "n",
      descriptor = "Lsda;"
   )
   public static class223 field1451;
   @OriginalMember(
      owner = "client!hq",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field1448;

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(ILica;)Ldh;"
   )
   public static final class244 method1005(int arg0, class354 arg1) {
      try {
         ++field1450;
         return arg0 != -1 ? null : new class244(arg1.method2869(false), arg1.method2869(false), arg1.method2869(false), arg1.method2869(false), arg1.method2869(false), arg1.method2869(false), arg1.method2869(false), arg1.method2869(false), arg1.method2872(2), arg1.method2855(-31007));
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1452[1] + arg0 + ',' + (arg1 != null ? field1452[0] : field1452[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class104(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hq",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class104(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field1444;
         if (arg1 >= -74) {
            this.method1006(-11);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1452[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1006(int arg0) {
      try {
         if (arg0 != 480102311) {
            return -94;
         } else {
            ++field1449;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1452[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            this.method161(91, 55);
         }

         ++field1443;
         return 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1452[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (~super.field877 != -2 && super.field877 != 0) {
            super.field877 = this.method162(0);
         }

         ++field1445;
         if (arg0 != -69) {
            field1451 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1452[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            field1448 = null;
         }

         ++field1447;
         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1452[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1007(int arg0) {
      try {
         if (arg0 != 19605) {
            field1448 = null;
         }

         field1448 = null;
         field1451 = null;
         field1446 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1452[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1008(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1009(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
