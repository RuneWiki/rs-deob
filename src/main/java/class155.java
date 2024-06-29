import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class155 extends class516 {
   @OriginalMember(
      owner = "client!ct",
      name = "n",
      descriptor = "[I"
   )
   public int[] field2003;
   @OriginalMember(
      owner = "client!ct",
      name = "m",
      descriptor = "[I"
   )
   public int[] field2000;
   @OriginalMember(
      owner = "client!ct",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2006 = new String[]{method1273(method1272("t\u0012\u0005r\u0015")), method1273(method1272("t\u0012\u0005q\u0015")), method1273(method1272("t\u0012\u0005v\u0015")), method1273(method1272("t\u0012\u0005\u000fTy\u000f_\r\u0015")), method1273(method1272("lH\u0005\u001d@")), method1273(method1272("y\u0013G_"))};
   @OriginalMember(
      owner = "client!ct",
      name = "k",
      descriptor = "[Ldja;"
   )
   public static class326[] field2001 = new class326[128];
   @OriginalMember(
      owner = "client!ct",
      name = "i",
      descriptor = "Leb;"
   )
   public static class657 field2004 = null;
   @OriginalMember(
      owner = "client!ct",
      name = "f",
      descriptor = "Lbga;"
   )
   public static class378 field1997 = new class378(111, -1);
   @OriginalMember(
      owner = "client!ct",
      name = "l",
      descriptor = "I"
   )
   public static int field2005 = 64;
   @OriginalMember(
      owner = "client!ct",
      name = "h",
      descriptor = "F"
   )
   public static float field2002;
   @OriginalMember(
      owner = "client!ct",
      name = "j",
      descriptor = "I"
   )
   public static int field1998;
   @OriginalMember(
      owner = "client!ct",
      name = "g",
      descriptor = "I"
   )
   public static int field1999;

   @OriginalMember(
      owner = "client!ct",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1269(int arg0) {
      try {
         field1997 = null;
         field2001 = null;
         int var1 = -40 % ((arg0 - -37) / 38);
         field2004 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2006[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1270(int arg0, int arg1, int arg2) {
      try {
         ++field1998;
         class446 var3 = class635.method4607(119, (long)arg0, 7);
         int var4 = 60 % ((arg1 - -83) / 32);
         var3.method3311(true);
         var3.field6167 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2006[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "<init>",
      descriptor = "(II[I[I)V"
   )
   public class155(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         this.field2003 = arg3;
         this.field2000 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2006[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2006[4] : field2006[5]) + ',' + (arg3 != null ? field2006[4] : field2006[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1271(byte arg0) {
      try {
         ++field1999;
         if (arg0 != -72) {
            method1270(115, 72, 122);
         }

         class685.method5008(0);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2006[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1272(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ct",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1273(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
