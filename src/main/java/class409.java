import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class409 {
   @OriginalMember(
      owner = "client!vl",
      name = "f",
      descriptor = "[I"
   )
   public int[] field6372;
   @OriginalMember(
      owner = "client!vl",
      name = "l",
      descriptor = "B"
   )
   public byte field6375;
   @OriginalMember(
      owner = "client!vl",
      name = "e",
      descriptor = "[I"
   )
   public int[] field6364;
   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "[I"
   )
   public int[] field6368;
   @OriginalMember(
      owner = "client!vl",
      name = "i",
      descriptor = "B"
   )
   public byte field6369;
   @OriginalMember(
      owner = "client!vl",
      name = "o",
      descriptor = "S"
   )
   public short field6373;
   @OriginalMember(
      owner = "client!vl",
      name = "k",
      descriptor = "S"
   )
   public short field6366;
   @OriginalMember(
      owner = "client!vl",
      name = "g",
      descriptor = "S"
   )
   public short field6377;
   @OriginalMember(
      owner = "client!vl",
      name = "j",
      descriptor = "[S"
   )
   public short[] field6376;
   @OriginalMember(
      owner = "client!vl",
      name = "h",
      descriptor = "S"
   )
   public short field6371;
   @OriginalMember(
      owner = "client!vl",
      name = "n",
      descriptor = "[S"
   )
   public short[] field6367;
   @OriginalMember(
      owner = "client!vl",
      name = "c",
      descriptor = "[S"
   )
   public short[] field6370;
   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6379 = new String[]{method3283(method3282("\u0003W\u0012\u0019\u0002")), method3283(method3282("\u0003W\u0012\u001a\u0002")), method3283(method3282("\u0003W\u0012dC\u001bRHf\u0002"))};
   @OriginalMember(
      owner = "client!vl",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field6365 = new class498(127, 3);
   @OriginalMember(
      owner = "client!vl",
      name = "d",
      descriptor = "Ldha;"
   )
   public static class642 field6378 = new class642("", 15);
   @OriginalMember(
      owner = "client!vl",
      name = "b",
      descriptor = "I"
   )
   public static int field6374;

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(IBI)I",
      line = 13
   )
   public static final int method3280(int arg0, byte arg1, int arg2) {
      try {
         int var3 = -23 % ((-34 - arg1) / 52);
         ++field6374;
         int var4 = arg2 + -1 & arg0 >> 31;
         return ((arg0 >>> 31) + arg0) % arg2 + var4;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6379[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(I)V",
      line = 25
   )
   public static void method3281(int arg0) {
      try {
         field6365 = null;
         field6378 = null;
         if (arg0 < 49) {
            field6365 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6379[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "<init>",
      descriptor = "(IIIIIIIIIIIIII)V",
      line = 43
   )
   public class409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
      try {
         this.field6372 = new int[4];
         this.field6375 = (byte)arg0;
         this.field6364 = new int[4];
         this.field6368 = new int[4];
         this.field6369 = (byte)arg1;
         this.field6364[1] = arg3;
         this.field6364[3] = arg5;
         this.field6364[0] = arg2;
         this.field6364[2] = arg4;
         this.field6372[2] = arg8;
         this.field6372[0] = arg6;
         this.field6372[1] = arg7;
         this.field6372[3] = arg9;
         this.field6368[1] = arg11;
         this.field6368[3] = arg13;
         this.field6368[0] = arg10;
         this.field6373 = (short)(arg2 >> class394.field6180);
         this.field6368[2] = arg12;
         this.field6366 = (short)(arg4 >> class394.field6180);
         this.field6377 = (short)(arg10 >> class394.field6180);
         this.field6376 = new short[4];
         this.field6371 = (short)(arg12 >> class394.field6180);
         this.field6367 = new short[4];
         this.field6370 = new short[4];
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field6379[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3282(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3283(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
