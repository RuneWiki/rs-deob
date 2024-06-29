import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class634 extends class243 {
   @OriginalMember(
      owner = "client!wj",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9337 = new String[]{method4674(method4673("d5n\u000b\u001e")), method4674(method4673("d5n\u0003\u001e")), method4674(method4673("d5n\u000e\u001e")), method4674(method4673("d5n\u0004\u001e"))};
   @OriginalMember(
      owner = "client!wj",
      name = "C",
      descriptor = "[J"
   )
   public static long[] field9334 = new long[256];
   @OriginalMember(
      owner = "client!wj",
      name = "E",
      descriptor = "I"
   )
   public static int field9332;
   @OriginalMember(
      owner = "client!wj",
      name = "B",
      descriptor = "I"
   )
   public static int field9333;
   @OriginalMember(
      owner = "client!wj",
      name = "D",
      descriptor = "I"
   )
   public static int field9335;
   @OriginalMember(
      owner = "client!wj",
      name = "F",
      descriptor = "Lww;"
   )
   public static class339 field9336;

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public final void method1537(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         super.field3062 = arg3;
         if (arg0) {
            ++field9335;
            super.field3070 = arg2;
            super.field3065 = arg1;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9337[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method4671(int arg0, byte arg1) {
      try {
         ++field9333;
         int var2 = -126 % ((arg1 - -23) / 57);
         int var3 = arg0 >>> 1;
         int var4 = var3 | var3 >>> 1;
         int var5 = var4 | var4 >>> 2;
         int var6 = var5 | var5 >>> 4;
         int var7 = var6 | var6 >>> 8;
         int var8 = var7 | var7 >>> 16;
         return arg0 & ~var8;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field9337[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4672(byte arg0) {
      try {
         if (arg0 != 6) {
            method4671(-99, (byte)4);
         }

         field9336 = null;
         field9334 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9337[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method1536(int arg0, float arg1) {
      try {
         if (arg0 != 58) {
            field9336 = null;
         }

         super.field3067 = arg1;
         ++field9332;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9337[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class634(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         long var1 = (long)var0;

         for(int var3 = 0; var3 < 8; ++var3) {
            if (~(var1 & 1L) != -2L) {
               var1 >>>= 1;
            } else {
               var1 = -3932672073523589310L ^ var1 >>> 1;
            }
         }

         field9334[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4673(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4674(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
