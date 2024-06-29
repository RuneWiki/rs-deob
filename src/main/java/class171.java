import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class171 extends class300 {
   @OriginalMember(
      owner = "client!uq",
      name = "J",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field2117;
   @OriginalMember(
      owner = "client!uq",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2124 = new String[]{method1378(method1377(":\\,qU")), method1378(method1377(":\\,tU")), method1378(method1377(":\\,wU")), method1378(method1377("4\u0003,\u0013\u0000")), method1378(method1377("!XnQ")), method1378(method1377(":\\,\u0001\u0014!Dv\u0003U"))};
   @OriginalMember(
      owner = "client!uq",
      name = "B",
      descriptor = "Lvha;"
   )
   public static class713 field2116 = new class713();
   @OriginalMember(
      owner = "client!uq",
      name = "I",
      descriptor = "I"
   )
   public static int field2120 = 0;
   @OriginalMember(
      owner = "client!uq",
      name = "C",
      descriptor = "[I"
   )
   public static int[] field2122 = new int[14];
   @OriginalMember(
      owner = "client!uq",
      name = "G",
      descriptor = "Lsd;"
   )
   public static class101 field2121 = new class101(119, -1);
   @OriginalMember(
      owner = "client!uq",
      name = "H",
      descriptor = "I"
   )
   public static int field2123 = 0;
   @OriginalMember(
      owner = "client!uq",
      name = "F",
      descriptor = "I"
   )
   public static int field2115;
   @OriginalMember(
      owner = "client!uq",
      name = "D",
      descriptor = "I"
   )
   public static int field2118;
   @OriginalMember(
      owner = "client!uq",
      name = "E",
      descriptor = "I"
   )
   public static int field2119;

   @OriginalMember(
      owner = "client!uq",
      name = "g",
      descriptor = "(I)Z",
      line = 5
   )
   public final boolean method1374(int arg0) {
      try {
         ++field2115;
         if (arg0 != -25864) {
            method1375((byte)125);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2124[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(B)V",
      line = 17
   )
   public static void method1375(byte arg0) {
      try {
         field2122 = null;
         field2121 = null;
         field2116 = null;
         if (arg0 != 117) {
            field2116 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2124[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "<init>",
      descriptor = "(Lsf;Ljava/lang/Object;I)V",
      line = 31
   )
   public class171(class549 arg0, Object arg1, int arg2) {
      super(arg0, arg2);

      try {
         this.field2117 = arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2124[5] + (arg0 != null ? field2124[3] : field2124[4]) + ',' + (arg1 != null ? field2124[3] : field2124[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(Z)Ljava/lang/Object;",
      line = 40
   )
   public final Object method1376(boolean arg0) {
      try {
         ++field2119;
         if (arg0) {
            field2121 = null;
         }

         return this.field2117;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2124[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1377(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1378(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
