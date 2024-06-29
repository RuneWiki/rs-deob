import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class168 extends class338 {
   @OriginalMember(
      owner = "client!wea",
      name = "o",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field2354;
   @OriginalMember(
      owner = "client!wea",
      name = "l",
      descriptor = "Lkb;"
   )
   private class720 field2357;
   @OriginalMember(
      owner = "client!wea",
      name = "r",
      descriptor = "Lnm;"
   )
   private class501 field2351;
   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2358 = new String[]{method1383(method1382("W-v&j\b")), method1383(method1382("[f9&T")), method1383(method1382("N={d")), method1383(method1382("W-v&k\b")), method1383(method1382("W-v&h\b")), method1383(method1382("W-v&\u0015I&~|\u0017\b")), method1383(method1382("W-v&o\b")), method1383(method1382("W-v&OI&vd@Z-?")), method1383(method1382("W-v&n\b"))};
   @OriginalMember(
      owner = "client!wea",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field2345 = false;
   @OriginalMember(
      owner = "client!wea",
      name = "t",
      descriptor = "I"
   )
   public static int field2346 = 0;
   @OriginalMember(
      owner = "client!wea",
      name = "s",
      descriptor = "J"
   )
   public static long field2353 = (long)(Math.random() * 9.999999999E9D);
   @OriginalMember(
      owner = "client!wea",
      name = "k",
      descriptor = "I"
   )
   public static int field2347;
   @OriginalMember(
      owner = "client!wea",
      name = "v",
      descriptor = "I"
   )
   public static int field2348;
   @OriginalMember(
      owner = "client!wea",
      name = "m",
      descriptor = "I"
   )
   public static int field2349;
   @OriginalMember(
      owner = "client!wea",
      name = "w",
      descriptor = "I"
   )
   public static int field2350;
   @OriginalMember(
      owner = "client!wea",
      name = "p",
      descriptor = "I"
   )
   public static int field2352;
   @OriginalMember(
      owner = "client!wea",
      name = "q",
      descriptor = "I"
   )
   public static int field2355;
   @OriginalMember(
      owner = "client!wea",
      name = "u",
      descriptor = "I"
   )
   public static int field2356;

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1377(boolean arg0) {
      try {
         ++field2356;

         try {
            if (arg0) {
               return;
            }

            this.field2354.close();
         } catch (IOException var3) {
         }

         this.field2357.method5237(-114);
         this.field2351.method3638((byte)28);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2358[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1378(int arg0) {
      try {
         this.field2357.method5236(0);
         ++field2347;
         if (arg0 >= -44) {
            this.method1378(2);
         }

         this.field2351.method3641(962);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2358[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "(II[BI)I"
   )
   public final int method1379(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      try {
         if (arg3 != -1) {
            this.finalize();
         }

         ++field2348;
         return this.field2357.method5238(arg2, arg1, arg0, arg3 + 23485);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2358[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2358[1] : field2358[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public final boolean method1380(int arg0, boolean arg1) throws IOException {
      try {
         if (arg1) {
            field2353 = -88L;
         }

         ++field2355;
         return this.field2357.method5239(3041, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2358[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method1381(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      try {
         if (arg0 == -17613) {
            this.field2351.method3636(arg2, arg1, (byte)-126, arg3);
            ++field2349;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2358[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2358[1] : field2358[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      try {
         ++field2352;
         this.method1377(false);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2358[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;I)V"
   )
   public class168(Socket arg0, int arg1) throws IOException {
      try {
         this.field2354 = arg0;
         this.field2354.setSoTimeout(30000);
         this.field2354.setTcpNoDelay(true);
         this.field2357 = new class720(this.field2354.getInputStream(), arg1);
         this.field2351 = new class501(this.field2354.getOutputStream(), arg1);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2358[5] + (arg0 != null ? field2358[1] : field2358[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1382(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1383(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
