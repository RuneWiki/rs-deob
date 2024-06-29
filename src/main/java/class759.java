import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class759 {
   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11023 = new String[]{method5494(method5493("\u0000\u0001\u0011\u0012H")), method5494(method5493("\f\u001bS8")), method5494(method5493("\u0000\u0001\u0011\u0013H")), method5494(method5493("\u0019@\u0011z\u001d")), method5494(method5493("\u0000\u0001\u0011\u0011H"))};
   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "[F"
   )
   public static float[] field11021 = new float[16384];
   @OriginalMember(
      owner = "client!bo",
      name = "e",
      descriptor = "[F"
   )
   public static float[] field11018 = new float[16384];
   @OriginalMember(
      owner = "client!bo",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field11020 = false;
   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "Luw;"
   )
   public static class435 field11022;
   @OriginalMember(
      owner = "client!bo",
      name = "d",
      descriptor = "I"
   )
   public static int field11017;
   @OriginalMember(
      owner = "client!bo",
      name = "c",
      descriptor = "I"
   )
   public static int field11019;

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(BLuda;I)V"
   )
   public static final void method5490(byte arg0, class473 arg1, int arg2) {
      try {
         if (class538.field7829 != null) {
            try {
               class538.field7829.method2331(0L, true);
               class538.field7829.method2329(-1, arg1.field6889, arg2, 24);
            } catch (Exception var4) {
            }
         }

         ++field11019;
         if (arg0 != -24) {
            method5492(63);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11023[2] + arg0 + ',' + (arg1 != null ? field11023[3] : field11023[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(II)[[[B"
   )
   public static final byte[][][] method5491(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5492(int arg0) {
      try {
         field11022 = null;
         field11018 = null;
         field11021 = null;
         if (arg0 >= -104) {
            method5490((byte)123, (class473)null, -105);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11023[0] + arg0 + ')');
      }
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; ~var2 > -16385; ++var2) {
         field11021[var2] = (float)Math.sin((double)var2 * var0);
         field11018[var2] = (float)Math.cos((double)var2 * var0);
      }

      field11022 = new class435(53, 3);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5493(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5494(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
