import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class255 extends class564 {
   @OriginalMember(
      owner = "client!ig",
      name = "j",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field3627;
   @OriginalMember(
      owner = "client!ig",
      name = "k",
      descriptor = "Lbl;"
   )
   private class674 field3623;
   @OriginalMember(
      owner = "client!ig",
      name = "m",
      descriptor = "Lul;"
   )
   private class596 field3629;
   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3633 = new String[]{method2052(method2051("(Qc'_")), method2052(method2051("=\n!e")), method2052(method2051(":\u0018cO\n")), method2052(method2051(":\u0018cH\n")), method2052(method2051(":\u0018cM\n")), method2052(method2051(":\u0018cJ\n")), method2052(method2051(":\u0018c5K=\u001697\n")), method2052(method2051(":\u0018coK=\u001e!`X6W")), method2052(method2051(":\u0018cL\n")), method2052(method2051(":\u0018cK\n"))};
   @OriginalMember(
      owner = "client!ig",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field3621 = false;
   @OriginalMember(
      owner = "client!ig",
      name = "h",
      descriptor = "I"
   )
   public static int field3622 = 0;
   @OriginalMember(
      owner = "client!ig",
      name = "o",
      descriptor = "I"
   )
   public static int field3624;
   @OriginalMember(
      owner = "client!ig",
      name = "e",
      descriptor = "I"
   )
   public static int field3625;
   @OriginalMember(
      owner = "client!ig",
      name = "i",
      descriptor = "I"
   )
   public static int field3626;
   @OriginalMember(
      owner = "client!ig",
      name = "n",
      descriptor = "I"
   )
   public static int field3628;
   @OriginalMember(
      owner = "client!ig",
      name = "l",
      descriptor = "I"
   )
   public static int field3630;
   @OriginalMember(
      owner = "client!ig",
      name = "p",
      descriptor = "I"
   )
   public static int field3631;
   @OriginalMember(
      owner = "client!ig",
      name = "g",
      descriptor = "I"
   )
   public static int field3632;

   @OriginalMember(
      owner = "client!ig",
      name = "c",
      descriptor = "(I)V",
      line = 4
   )
   public final void method2045(int arg0) {
      try {
         try {
            this.field3627.close();
         } catch (IOException var3) {
         }

         ++field3625;
         this.field3623.method4925((byte)-107);
         if (arg0 == 907867169) {
            this.field3629.method4404((byte)126);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3633[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(II)Z",
      line = 24
   )
   public final boolean method2046(int arg0, int arg1) throws IOException {
      try {
         if (arg1 != 3) {
            this.field3623 = null;
         }

         ++field3626;
         return this.field3623.method4927(false, arg0);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3633[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "finalize",
      descriptor = "()V",
      line = 36
   )
   protected final void finalize() {
      try {
         ++field3630;
         this.method2045(907867169);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3633[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(IZ)I",
      line = 44
   )
   public static final int method2047(int arg0, boolean arg1) {
      try {
         ++field3624;
         int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
         if (!arg1) {
            return 98;
         } else {
            int var3 = arg0 * 6 + -61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3633[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "b",
      descriptor = "(I)V",
      line = 69
   )
   public final void method2048(int arg0) {
      try {
         this.field3623.method4926(-63);
         ++field3631;
         if (arg0 == -3) {
            this.field3629.method4406(false);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3633[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(I[BIB)I",
      line = 81
   )
   public final int method2049(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
      try {
         if (arg3 != 116) {
            this.method2045(39);
         }

         ++field3628;
         return this.field3623.method4928(arg0, (byte)-67, arg1, arg2);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3633[2] + arg0 + ',' + (arg1 != null ? field3633[0] : field3633[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;I)V",
      line = 92
   )
   public class255(Socket arg0, int arg1) throws IOException {
      try {
         this.field3627 = arg0;
         this.field3627.setSoTimeout(30000);
         this.field3627.setTcpNoDelay(true);
         this.field3623 = new class674(this.field3627.getInputStream(), arg1);
         this.field3629 = new class596(this.field3627.getOutputStream(), arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3633[6] + (arg0 != null ? field3633[0] : field3633[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "([BIII)V",
      line = 104
   )
   public final void method2050(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
      try {
         this.field3629.method4405((byte)-82, arg2, arg0, arg3);
         if (arg1 != -1935658335) {
            method2047(75, false);
         }

         ++field3632;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3633[8] + (arg0 != null ? field3633[0] : field3633[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2051(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2052(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
