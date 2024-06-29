import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class102 implements class504 {
   @OriginalMember(
      owner = "client!pia",
      name = "l",
      descriptor = "I"
   )
   public int field1249;
   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1255 = new String[]{method893(method892("\u00027\u000e\n\u001aZ")), method893(method892("\u001c+\u0003H")), method893(method892("\tpA\n&")), method893(method892("\u00027\u000e\ng\u001b0\u0006PeZ")), method893(method892("\u00027\u000e\n/\u001d\r\u001bV2\u001c9G")), method893(method892("\u00027\u000e\n\u0018Z")), method893(method892("\u00027\u000e\n\u0019Z")), method893(method892("\u00027\u000e\n\u001fZ"))};
   @OriginalMember(
      owner = "client!pia",
      name = "b",
      descriptor = "I"
   )
   public static int field1243 = 1;
   @OriginalMember(
      owner = "client!pia",
      name = "h",
      descriptor = "Lsda;"
   )
   public static class269 field1247 = new class269(31, 3);
   @OriginalMember(
      owner = "client!pia",
      name = "d",
      descriptor = "F"
   )
   public static float field1252;
   @OriginalMember(
      owner = "client!pia",
      name = "e",
      descriptor = "I"
   )
   public static int field1245;
   @OriginalMember(
      owner = "client!pia",
      name = "g",
      descriptor = "I"
   )
   public static int field1246;
   @OriginalMember(
      owner = "client!pia",
      name = "c",
      descriptor = "I"
   )
   public static int field1248;
   @OriginalMember(
      owner = "client!pia",
      name = "i",
      descriptor = "I"
   )
   public static int field1250;
   @OriginalMember(
      owner = "client!pia",
      name = "f",
      descriptor = "I"
   )
   public static int field1251;
   @OriginalMember(
      owner = "client!pia",
      name = "k",
      descriptor = "I"
   )
   public static int field1253;
   @OriginalMember(
      owner = "client!pia",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field1254;
   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "[Lcu;"
   )
   public static class229[] field1244;

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(IIIII)V",
      line = 4
   )
   public static final void method888(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field1253;
         class197.field2442 = arg0;
         class22.field234 = arg1;
         int var5 = -56 / ((arg3 - -63) / 49);
         class100.field1232 = arg2;
         class506.field7472 = arg4;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1255[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 19
   )
   public final String toString() {
      try {
         ++field1246;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1255[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(IB)I",
      line = 28
   )
   public static final int method889(int arg0, byte arg1) {
      try {
         if (arg1 != 55) {
            return 104;
         } else {
            ++field1251;
            return arg0 >>> 7;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1255[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
      line = 40
   )
   public static final Class method890(String arg0, int arg1) throws ClassNotFoundException {
      try {
         ++field1245;
         if (arg1 > -79) {
            method888(-63, 16, 10, -109, -112);
         }

         if (arg0.equals("B")) {
            return Byte.TYPE;
         } else if (arg0.equals("I")) {
            return Integer.TYPE;
         } else if (arg0.equals("S")) {
            return Short.TYPE;
         } else if (arg0.equals("J")) {
            return Long.TYPE;
         } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
         } else if (arg0.equals("F")) {
            return Float.TYPE;
         } else if (arg0.equals("D")) {
            return Double.TYPE;
         } else {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1255[6] + (arg0 != null ? field1255[2] : field1255[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(B)V",
      line = 86
   )
   public static void method891(byte arg0) {
      try {
         field1247 = null;
         field1254 = null;
         if (arg0 != 109) {
            method888(2, 1, -19, -12, 126);
         }

         field1244 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1255[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V",
      line = 101
   )
   public class102(String arg0, int arg1) {
      try {
         this.field1249 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1255[3] + (arg0 != null ? field1255[2] : field1255[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method892(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method893(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
