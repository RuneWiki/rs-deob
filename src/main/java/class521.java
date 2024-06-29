import java.awt.Rectangle;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class521 extends class619 {
   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7582 = new String[]{method3846(method3845("B\u001fb3")), method3846(method3845("WD qm")), method3846(method3845("A\u0003 \u001b8")), method3846(method3845("A\u0003 \u001a8"))};
   @OriginalMember(
      owner = "client!mi",
      name = "k",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field7579 = new Rectangle[100];
   @OriginalMember(
      owner = "client!mi",
      name = "i",
      descriptor = "F"
   )
   public static float field7581;
   @OriginalMember(
      owner = "client!mi",
      name = "j",
      descriptor = "I"
   )
   public static int field7578;
   @OriginalMember(
      owner = "client!mi",
      name = "l",
      descriptor = "Leaa;"
   )
   public static class526 field7580;

   static {
      for(int var0 = 0; ~var0 > -101; ++var0) {
         field7579[var0] = new Rectangle();
      }

   }

   @OriginalMember(
      owner = "client!mi",
      name = "c",
      descriptor = "(I)V",
      line = 5
   )
   public static void method3843(int arg0) {
      try {
         field7580 = null;
         field7579 = null;
         if (arg0 != 0) {
            field7580 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7582[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(IZ[BLjava/io/File;)V",
      line = 16
   )
   public static final void method3844(int arg0, boolean arg1, byte[] arg2, File arg3) throws IOException {
      try {
         ++field7578;
         DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
         if (!arg1) {
            try {
               var4.readFully(arg2, 0, arg0);
            } catch (EOFException var6) {
            }

            var4.close();
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7582[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7582[1] : field7582[0]) + ',' + (arg3 != null ? field7582[1] : field7582[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3845(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3846(char[] arg0) {
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
            var10005 = 106;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
