import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class524 extends class122 {
   @OriginalMember(
      owner = "client!iaa",
      name = "k",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field7173;
   @OriginalMember(
      owner = "client!iaa",
      name = "m",
      descriptor = "Lak;"
   )
   private class371 field7172;
   @OriginalMember(
      owner = "client!iaa",
      name = "h",
      descriptor = "Lkka;"
   )
   private class329 field7176;
   @OriginalMember(
      owner = "client!iaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7182 = new String[]{method3790(method3789("y!\u001a''8")), method3790(method3789("y!\u001a'Sy.\u0012}Q8")), method3790(method3789("~5\u0017e")), method3790(method3789("knU'\u0012")), method3790(method3789("y!\u001a'(8")), method3790(method3789("y!\u001a'&8")), method3790(method3789("y!\u001a',8")), method3790(method3789("y!\u001a'\ty.\u001ae\u0006j%S")), method3790(method3789("y!\u001a'*8")), method3790(method3789("y!\u001a'-8")), method3790(method3789("y!\u001a'.8")), method3790(method3789("y!\u001a')8"))};
   @OriginalMember(
      owner = "client!iaa",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field7171 = new class378(122, -2);
   @OriginalMember(
      owner = "client!iaa",
      name = "b",
      descriptor = "Lnja;"
   )
   public static class459 field7178 = new class459();
   @OriginalMember(
      owner = "client!iaa",
      name = "l",
      descriptor = "I"
   )
   public static int field7180 = 0;
   @OriginalMember(
      owner = "client!iaa",
      name = "o",
      descriptor = "I"
   )
   public static int field7167;
   @OriginalMember(
      owner = "client!iaa",
      name = "d",
      descriptor = "I"
   )
   public static int field7168;
   @OriginalMember(
      owner = "client!iaa",
      name = "c",
      descriptor = "I"
   )
   public static int field7169;
   @OriginalMember(
      owner = "client!iaa",
      name = "j",
      descriptor = "I"
   )
   public static int field7170;
   @OriginalMember(
      owner = "client!iaa",
      name = "f",
      descriptor = "I"
   )
   public static int field7174;
   @OriginalMember(
      owner = "client!iaa",
      name = "g",
      descriptor = "I"
   )
   public static int field7175;
   @OriginalMember(
      owner = "client!iaa",
      name = "n",
      descriptor = "I"
   )
   public static int field7177;
   @OriginalMember(
      owner = "client!iaa",
      name = "i",
      descriptor = "I"
   )
   public static int field7179;
   @OriginalMember(
      owner = "client!iaa",
      name = "p",
      descriptor = "Ldha;"
   )
   public static class84 field7181;

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public final boolean method1029(boolean arg0, int arg1) throws IOException {
      try {
         ++field7170;
         return !arg0 ? false : this.field7172.method2868(arg1, !arg0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7182[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(ZD)V"
   )
   public static final void method3786(boolean arg0, double arg1) {
      try {
         class126.field1572.method158(class195.field2370);
         ++field7168;
         class126.field1572.method154(0, 0, (int)arg1);
         class633.field8958.method581(class126.field1572);
         if (arg0) {
            method3788(-121, -96, 21);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7182[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1031(int arg0) {
      try {
         try {
            this.field7173.close();
         } catch (IOException var3) {
         }

         ++field7179;
         this.field7172.method2869(-1);
         this.field7176.method2619(-9742);
         if (arg0 != 0) {
            this.finalize();
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7182[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final void method1028(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
      try {
         if (arg3 == 0) {
            this.field7176.method2621(arg2, arg1, arg0, false);
            ++field7174;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7182[8] + (arg0 != null ? field7182[3] : field7182[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(I[BBI)I"
   )
   public final int method1030(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
      try {
         ++field7175;
         if (arg2 != 43) {
            this.method1027((byte)98);
         }

         return this.field7172.method2867(false, arg1, arg0, arg3);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7182[11] + arg0 + ',' + (arg1 != null ? field7182[3] : field7182[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3787(byte arg0) {
      try {
         field7181 = null;
         if (arg0 != 25) {
            field7178 = null;
         }

         field7178 = null;
         field7171 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7182[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;I)V"
   )
   public class524(Socket arg0, int arg1) throws IOException {
      try {
         this.field7173 = arg0;
         this.field7173.setSoTimeout(30000);
         this.field7173.setTcpNoDelay(true);
         this.field7172 = new class371(this.field7173.getInputStream(), arg1);
         this.field7176 = new class329(this.field7173.getOutputStream(), arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7182[1] + (arg0 != null ? field7182[3] : field7182[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1027(byte arg0) {
      try {
         this.field7172.method2873(true);
         if (arg0 < -116) {
            ++field7177;
            this.field7176.method2620(108);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7182[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      try {
         this.method1031(0);
         ++field7169;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7182[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3788(int arg0, int arg1, int arg2) {
      try {
         ++field7167;
         if (arg2 > -83) {
            field7181 = null;
         }

         return class47.method400(1, arg1, arg0) | (arg1 & 458752) != 0 || class625.method4545(arg1, arg0, (byte)-111);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7182[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3789(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3790(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
