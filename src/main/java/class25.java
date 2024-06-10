import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ka")
public class class25 extends class16 {
   @OriginalMember(
      owner = "loginapplet!ka",
      name = "h",
      descriptor = "Laa;"
   )
   public static class2 field170;
   @OriginalMember(
      owner = "loginapplet!ka",
      name = "i",
      descriptor = "Lsa;"
   )
   public class41 field171;
   @OriginalMember(
      owner = "loginapplet!ka",
      name = "j",
      descriptor = "Lsa;"
   )
   public static class41 field172 = class3.method9(20, (byte)19);
   @OriginalMember(
      owner = "loginapplet!ka",
      name = "k",
      descriptor = "[C"
   )
   public static char[] field173 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
   @OriginalMember(
      owner = "loginapplet!ka",
      name = "l",
      descriptor = "[Z"
   )
   public static boolean[] field174 = new boolean[112];
   @OriginalMember(
      owner = "loginapplet!ka",
      name = "m",
      descriptor = "I"
   )
   public static int field175;

   @OriginalMember(
      owner = "loginapplet!ka",
      name = "b",
      descriptor = "(I)V",
      line = 30
   )
   public static final void method123(int arg0) {
      try {
         int var1 = 125 / ((arg0 - 13) / 61);
         int var3 = 0;
         class7[] var2 = class4.field52;

         while(~var2.length < ~var3) {
            class7 var4 = var2[var3];
            if (0.0F < var4.field62 && 0.0F < var4.field60 && 400.0F > var4.field62 && 200.0F > var4.field60) {
               class21.method109((int)(var4.field62 * 16.0F), (int)(var4.field60 * 16.0F), 96, -1 + class16.field126.length, class16.field126);
            }

            ++var3;
         }

      } catch (RuntimeException var5) {
         throw class28.method139(var5, "ka.A(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ka",
      name = "a",
      descriptor = "(ILjava/io/File;[BI)V",
      line = 62
   )
   public static final void method124(int arg0, File arg1, byte[] arg2, int arg3) throws IOException {
      try {
         FileOutputStream var4 = new FileOutputStream(arg1);
         if (arg3 > -73) {
            field174 = (boolean[])null;
         }

         var4.write(arg2, 0, arg0);
         var4.close();
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "ka.B(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ka",
      name = "c",
      descriptor = "(I)V",
      line = 74
   )
   public static void method125(int arg0) {
      try {
         field174 = null;
         field173 = null;
         field172 = null;
         field170 = null;
         if (arg0 != 10713) {
            field174 = (boolean[])null;
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ka.D(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ka",
      name = "a",
      descriptor = "(Ljava/io/File;ZI)[B",
      line = 89
   )
   public static final byte[] method126(File arg0, boolean arg1, int arg2) {
      try {
         try {
            if (arg1) {
               field173 = (char[])null;
            }

            byte[] var3 = new byte[arg2];
            class15.method80(0, arg2, arg0, var3);
            return var3;
         } catch (IOException var4) {
            return null;
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "ka.C(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ')');
      }
   }
}
