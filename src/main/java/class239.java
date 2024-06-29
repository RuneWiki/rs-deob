import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class239 implements Runnable {
   @OriginalMember(
      owner = "client!mr",
      name = "c",
      descriptor = "[Lce;"
   )
   public volatile class591[] field3044 = new class591[2];
   @OriginalMember(
      owner = "client!mr",
      name = "d",
      descriptor = "Z"
   )
   public volatile boolean field3039 = false;
   @OriginalMember(
      owner = "client!mr",
      name = "e",
      descriptor = "Z"
   )
   public volatile boolean field3041 = false;
   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3045 = new String[]{method1911(method1910("\u0017\u0011ISw")), method1911(method1910("\u0017\u0011IPw")), method1911(method1910("\u0017\u0011Ic*\u0014K"))};
   @OriginalMember(
      owner = "client!mr",
      name = "b",
      descriptor = "I"
   )
   public static int field3038;
   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "I"
   )
   public static int field3042;
   @OriginalMember(
      owner = "client!mr",
      name = "f",
      descriptor = "Lpd;"
   )
   public static class648 field3043;
   @OriginalMember(
      owner = "client!mr",
      name = "g",
      descriptor = "Lgj;"
   )
   public class736 field3040;

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1908(int arg0, int arg1) {
      try {
         if (arg0 != 0) {
            method1909(false);
         }

         ++field3038;
         return arg1 >>> 10;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3045[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1909(boolean arg0) {
      try {
         if (!arg0) {
            method1908(125, -95);
         }

         field3043 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3045[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field1481;

      try {
         this.field3041 = true;
         ++field3042;

         try {
            if (var1 || !this.field3039) {
               do {
                  int var2 = 0;
                  if (var1 || ~var2 > -3) {
                     do {
                        class591 var3 = this.field3044[var2];
                        if (var3 != null) {
                           var3.method4398(6000);
                        }

                        ++var2;
                     } while(~var2 > -3);
                  }

                  class340.method2717(10L, (byte)-119);
                  class574.method4307((Object)null, 1, this.field3040);
               } while(!this.field3039);
            }
         } catch (Exception var12) {
            class668.method4877((byte)-6, var12, (String)null);
         } finally {
            Object var8 = null;
            this.field3041 = false;
         }

      } catch (RuntimeException var14) {
         throw class93.method866(var14, field3045[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1910(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1911(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
