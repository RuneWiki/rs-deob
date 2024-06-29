import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class752 {
   @OriginalMember(
      owner = "client!ff",
      name = "c",
      descriptor = "[S"
   )
   public short[] field11149;
   @OriginalMember(
      owner = "client!ff",
      name = "f",
      descriptor = "J"
   )
   public long field11151;
   @OriginalMember(
      owner = "client!ff",
      name = "h",
      descriptor = "[S"
   )
   public short[] field11152;
   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "[I"
   )
   public int[] field11156;
   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11157 = new String[]{method5522(method5521("Xj\u001e\u0002HPeD\u0000\t")), method5522(method5521("E\"\u001e\u0010\\")), method5522(method5521("Py\\R")), method5522(method5521("Xj\u001e|\t")), method5522(method5521("Xj\u001e\u007f\t"))};
   @OriginalMember(
      owner = "client!ff",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field11150 = new class498(117, 7);
   @OriginalMember(
      owner = "client!ff",
      name = "g",
      descriptor = "Luk;"
   )
   public static class498 field11154 = new class498(113, -1);
   @OriginalMember(
      owner = "client!ff",
      name = "e",
      descriptor = "I"
   )
   public static int field11153;
   @OriginalMember(
      owner = "client!ff",
      name = "b",
      descriptor = "I"
   )
   public static int field11155;

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(B)V",
      line = 9
   )
   public static void method5519(byte arg0) {
      try {
         field11150 = null;
         field11154 = null;
         if (arg0 > -4) {
            field11150 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11157[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(II)Z",
      line = 22
   )
   public static final boolean method5520(int arg0, int arg1) {
      try {
         if (arg0 != -19842) {
            method5519((byte)-109);
         }

         ++field11153;
         return arg1 == 59 || arg1 == 15 || ~arg1 == -59 || ~arg1 == -13 || arg1 == 51 || ~arg1 == -14 || ~arg1 == -6 || ~arg1 == -17 || ~arg1 == -53 || ~arg1 == -9 || ~arg1 == -24;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11157[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "<init>",
      descriptor = "(J[I[S[S)V",
      line = 37
   )
   public class752(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field11149 = arg3;
         this.field11151 = arg0;
         this.field11152 = arg2;
         this.field11156 = arg1;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11157[0] + arg0 + ',' + (arg1 != null ? field11157[1] : field11157[2]) + ',' + (arg2 != null ? field11157[1] : field11157[2]) + ',' + (arg3 != null ? field11157[1] : field11157[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "<init>",
      descriptor = "()V",
      line = 47
   )
   protected class752() {
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5521(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5522(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
