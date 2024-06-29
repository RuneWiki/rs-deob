import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class157 {
   @OriginalMember(
      owner = "client!ct",
      name = "e",
      descriptor = "I"
   )
   public int field2243;
   @OriginalMember(
      owner = "client!ct",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public String field2230;
   @OriginalMember(
      owner = "client!ct",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field2231;
   @OriginalMember(
      owner = "client!ct",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public String field2229;
   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "I"
   )
   public int field2240;
   @OriginalMember(
      owner = "client!ct",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public String field2228;
   @OriginalMember(
      owner = "client!ct",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public String field2242;
   @OriginalMember(
      owner = "client!ct",
      name = "s",
      descriptor = "I"
   )
   public int field2244;
   @OriginalMember(
      owner = "client!ct",
      name = "g",
      descriptor = "I"
   )
   public int field2234;
   @OriginalMember(
      owner = "client!ct",
      name = "h",
      descriptor = "I"
   )
   public int field2235;
   @OriginalMember(
      owner = "client!ct",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2247 = new String[]{method1320(method1319("O\u001f\u000e\na")), method1320(method1319("WE\u000ee4")), method1320(method1319("B\u001eL'")), method1320(method1319("O\u001f\u000e\ba")), method1320(method1319("O\u001f\u000ew B\u0002Tua")), method1320(method1319("O\u001f\u000e\u000fa")), method1320(method1319("O\u001f\u000e\ta"))};
   @OriginalMember(
      owner = "client!ct",
      name = "f",
      descriptor = "I"
   )
   public static int field2236 = 0;
   @OriginalMember(
      owner = "client!ct",
      name = "m",
      descriptor = "[[I"
   )
   public static int[][] field2245 = new int[6][];
   @OriginalMember(
      owner = "client!ct",
      name = "n",
      descriptor = "Leg;"
   )
   public static class118 field2232 = new class118(50, 7);
   @OriginalMember(
      owner = "client!ct",
      name = "i",
      descriptor = "Loi;"
   )
   public static class80 field2246 = new class80(20);
   @OriginalMember(
      owner = "client!ct",
      name = "j",
      descriptor = "I"
   )
   public static int field2233;
   @OriginalMember(
      owner = "client!ct",
      name = "l",
      descriptor = "I"
   )
   public static int field2237;
   @OriginalMember(
      owner = "client!ct",
      name = "b",
      descriptor = "I"
   )
   public static int field2238;
   @OriginalMember(
      owner = "client!ct",
      name = "q",
      descriptor = "I"
   )
   public static int field2239;
   @OriginalMember(
      owner = "client!ct",
      name = "d",
      descriptor = "I"
   )
   public static int field2241;

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V"
   )
   public final void method1315(String arg0, int arg1, int arg2, String arg3, String arg4, int arg5, String arg6, int arg7, String arg8) {
      try {
         this.field2243 = class433.method3196(122);
         ++field2238;
         if (arg2 > -38) {
            method1317(69, 19, -87, 82, -54);
         }

         this.field2244 = arg7;
         this.field2242 = arg0;
         this.field2240 = arg1;
         this.field2228 = arg3;
         this.field2235 = arg5;
         this.field2231 = arg4;
         this.field2229 = arg6;
         this.field2234 = class96.field1234;
         this.field2230 = arg8;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field2247[3] + (arg0 != null ? field2247[1] : field2247[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2247[1] : field2247[2]) + ',' + (arg4 != null ? field2247[1] : field2247[2]) + ',' + arg5 + ',' + (arg6 != null ? field2247[1] : field2247[2]) + ',' + arg7 + ',' + (arg8 != null ? field2247[1] : field2247[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "b",
      descriptor = "(I)Z"
   )
   public static final boolean method1316(int arg0) {
      try {
         ++field2233;
         if (arg0 != -1222) {
            method1317(28, 116, -54, 79, -69);
         }

         return ~class4.field38 != -1;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2247[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method1317(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         class699.field10237 = arg0;
         class348.field4702 = arg4;
         class457.field6528 = arg2;
         if (arg1 != 0) {
            method1318(23);
         }

         class245.field3374 = arg3;
         ++field2239;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2247[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1318(int arg0) {
      try {
         field2246 = null;
         if (arg0 > -50) {
            field2246 = null;
         }

         field2245 = null;
         field2232 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2247[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "<init>",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V"
   )
   public class157(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
      try {
         this.field2243 = class433.method3196(125);
         this.field2230 = arg2;
         this.field2231 = arg5;
         this.field2229 = arg4;
         this.field2240 = arg0;
         this.field2228 = arg3;
         this.field2242 = arg7;
         this.field2244 = arg1;
         this.field2234 = class96.field1234;
         this.field2235 = arg6;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field2247[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2247[1] : field2247[2]) + ',' + (arg3 != null ? field2247[1] : field2247[2]) + ',' + (arg4 != null ? field2247[1] : field2247[2]) + ',' + (arg5 != null ? field2247[1] : field2247[2]) + ',' + arg6 + ',' + (arg7 != null ? field2247[1] : field2247[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1319(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ct",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1320(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
