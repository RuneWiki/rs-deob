import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class88 extends class214 {
   @OriginalMember(
      owner = "client!gv",
      name = "q",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field1072;
   @OriginalMember(
      owner = "client!gv",
      name = "i",
      descriptor = "Lsv;"
   )
   private class686 field1073;
   @OriginalMember(
      owner = "client!gv",
      name = "f",
      descriptor = "Lui;"
   )
   private class239 field1066;
   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1078 = new String[]{method814(method813("\u001b=\u0017F\u0018")), method814(method813("\u0012>Uo")), method814(method813("\u0007e\u0017-M")), method814(method813("\u001b=\u0017G\u0018")), method814(method813("\u001b=\u0017B\u0018")), method814(method813("\u001b=\u0017?Y\u0012\"M=\u0018")), method814(method813("\u001b=\u0017@\u0018")), method814(method813("\u001b=\u0017eY\u0012*UjJ\u0019c")), method814(method813("\u001b=\u0017A\u0018")), method814(method813("\u001b=\u0017E\u0018"))};
   @OriginalMember(
      owner = "client!gv",
      name = "o",
      descriptor = "Lsda;"
   )
   public static class269 field1068 = new class269(20, 7);
   @OriginalMember(
      owner = "client!gv",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field1076 = false;
   @OriginalMember(
      owner = "client!gv",
      name = "j",
      descriptor = "I"
   )
   public static int field1065;
   @OriginalMember(
      owner = "client!gv",
      name = "p",
      descriptor = "I"
   )
   public static int field1067;
   @OriginalMember(
      owner = "client!gv",
      name = "r",
      descriptor = "I"
   )
   public static int field1069;
   @OriginalMember(
      owner = "client!gv",
      name = "k",
      descriptor = "I"
   )
   public static int field1070;
   @OriginalMember(
      owner = "client!gv",
      name = "n",
      descriptor = "I"
   )
   public static int field1071;
   @OriginalMember(
      owner = "client!gv",
      name = "g",
      descriptor = "I"
   )
   public static int field1074;
   @OriginalMember(
      owner = "client!gv",
      name = "m",
      descriptor = "I"
   )
   public static int field1075;
   @OriginalMember(
      owner = "client!gv",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field1077;

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public final boolean method807(int arg0, boolean arg1) throws IOException {
      try {
         ++field1065;
         if (!arg1) {
            method808(-119);
         }

         return this.field1073.method4989(arg0, 0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1078[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method808(int arg0) {
      try {
         field1068 = null;
         field1077 = null;
         if (arg0 != 7) {
            field1068 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1078[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      try {
         ++field1071;
         this.method812(2035738378);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1078[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "([BBII)I"
   )
   public final int method809(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
      try {
         int var5 = 107 / ((-57 - arg1) / 36);
         ++field1074;
         return this.field1073.method4984(arg0, 0, arg3, arg2);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1078[3] + (arg0 != null ? field1078[2] : field1078[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(BI[BI)V"
   )
   public final void method810(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      try {
         if (arg0 != -31) {
            field1077 = null;
         }

         this.field1066.method1785(arg1, 0, arg2, arg3);
         ++field1069;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1078[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1078[2] : field1078[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;I)V"
   )
   public class88(Socket arg0, int arg1) throws IOException {
      try {
         this.field1072 = arg0;
         this.field1072.setSoTimeout(30000);
         this.field1072.setTcpNoDelay(true);
         this.field1073 = new class686(this.field1072.getInputStream(), arg1);
         this.field1066 = new class239(this.field1072.getOutputStream(), arg1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1078[5] + (arg0 != null ? field1078[2] : field1078[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method811(boolean arg0) {
      try {
         ++field1067;
         this.field1073.method4987((byte)-34);
         this.field1066.method1780(arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1078[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method812(int arg0) {
      try {
         try {
            this.field1072.close();
         } catch (IOException var3) {
         }

         if (arg0 != 2035738378) {
            method808(30);
         }

         ++field1070;
         this.field1073.method4986(124);
         this.field1066.method1782(arg0 ^ 2035738484);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1078[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method813(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method814(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
