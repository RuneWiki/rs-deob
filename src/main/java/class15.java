import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!fa")
public class class15 {
   @OriginalMember(
      owner = "loginapplet!fa",
      name = "a",
      descriptor = "Lsa;"
   )
   public static class41 field114 = class8.method31(71, "back_");
   @OriginalMember(
      owner = "loginapplet!fa",
      name = "b",
      descriptor = "Lsa;"
   )
   public static class41 field115 = class8.method31(39, "seal_auth");
   @OriginalMember(
      owner = "loginapplet!fa",
      name = "c",
      descriptor = "Lga;"
   )
   public static class17 field116;
   @OriginalMember(
      owner = "loginapplet!fa",
      name = "d",
      descriptor = "Lsa;"
   )
   public static class41 field117 = class8.method31(-72, "box_right_plain");
   @OriginalMember(
      owner = "loginapplet!fa",
      name = "e",
      descriptor = "Lsa;"
   )
   public static class41 field118 = class8.method31(35, "back_expanded_");
   @OriginalMember(
      owner = "loginapplet!fa",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field119 = new int[128];
   @OriginalMember(
      owner = "loginapplet!fa",
      name = "g",
      descriptor = "Lsa;"
   )
   public static class41 field120 = class8.method31(-96, "submit_");

   @OriginalMember(
      owner = "loginapplet!fa",
      name = "a",
      descriptor = "(IILjava/io/File;[B)V",
      line = 30
   )
   public static final void method80(int arg0, int arg1, File arg2, byte[] arg3) throws IOException {
      try {
         DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));

         try {
            var4.readFully(arg3, arg0, arg1);
         } catch (EOFException var6) {
         }

         var4.close();
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "fa.A(" + arg0 + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ',' + (arg3 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!fa",
      name = "a",
      descriptor = "(I)V",
      line = 65
   )
   public static void method81(int arg0) {
      try {
         field119 = null;
         if (arg0 > -95) {
            field118 = (class41)null;
         }

         field118 = null;
         field117 = null;
         field120 = null;
         field114 = null;
         field115 = null;
         field116 = null;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "fa.B(" + arg0 + ')');
      }
   }
}
