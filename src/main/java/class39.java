import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class39 extends class127 {
   @OriginalMember(
      owner = "client!bh",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field457 = new String[]{method299(method298("9\u0006\u0018\u001d*")), method299(method298("9\u0006\u0018\u001e*")), method299(method298("9\u0006\u0018\u0019*")), method299(method298("9\u0006\u0018\u0018*")), method299(method298("9\u0006\u0018\u001f*"))};
   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "Lnw;"
   )
   public static class616 field454 = new class616(69, -1);
   @OriginalMember(
      owner = "client!bh",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field455 = new int[]{3, 7, 15};
   @OriginalMember(
      owner = "client!bh",
      name = "D",
      descriptor = "Z"
   )
   public static boolean field456 = false;
   @OriginalMember(
      owner = "client!bh",
      name = "A",
      descriptor = "I"
   )
   public static int field450;
   @OriginalMember(
      owner = "client!bh",
      name = "F",
      descriptor = "I"
   )
   public static int field451;
   @OriginalMember(
      owner = "client!bh",
      name = "C",
      descriptor = "I"
   )
   public static int field452;
   @OriginalMember(
      owner = "client!bh",
      name = "E",
      descriptor = "I"
   )
   public static int field453;

   @OriginalMember(
      owner = "client!bh",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method295(int arg0) {
      try {
         field454 = null;
         if (arg0 == 69) {
            field455 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field457[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public final void method78(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field453;
         super.field1608 = arg2;
         super.field1595 = arg1;
         if (arg3 <= 37) {
            method295(126);
         }

         super.field1594 = arg0;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field457[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class39(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method76(int arg0, float arg1) {
      try {
         if (arg0 != -1) {
            this.method76(63, 0.103607014F);
         }

         ++field452;
         super.field1596 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field457[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "d",
      descriptor = "(B)V"
   )
   public static final void method296(byte arg0) {
      boolean var1 = client.field4273;

      try {
         if (class667.field9487 == null || class210.field2607 == null) {
            class667.field9487 = new int[256];
            class210.field2607 = new int[256];
            int var2 = 0;
            if (var1 || var2 < 256) {
               do {
                  double var3 = (double)var2 / 255.0D * 6.283185307179586D;
                  class667.field9487[var2] = (int)(Math.sin(var3) * 4096.0D);
                  class210.field2607[var2] = (int)(Math.cos(var3) * 4096.0D);
                  ++var2;
               } while(var2 < 256);
            }
         }

         if (arg0 != 56) {
            method297(89);
         }

         ++field450;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field457[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "h",
      descriptor = "(I)V"
   )
   public static final void method297(int arg0) {
      try {
         if (~class545.field7442 != -1) {
            class604.field8418.method1697(55);
            class639.method4629(-122);
            class684.method4996(-64);
         }

         if (arg0 <= -23) {
            ++field451;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field457[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method298(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method299(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
