import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!k")
public class class24 {
   @OriginalMember(
      owner = "loginapplet!k",
      name = "a",
      descriptor = "J"
   )
   private long field166;
   @OriginalMember(
      owner = "loginapplet!k",
      name = "b",
      descriptor = "J"
   )
   private long field167;
   @OriginalMember(
      owner = "loginapplet!k",
      name = "c",
      descriptor = "Ljava/io/RandomAccessFile;"
   )
   private RandomAccessFile field168;
   @OriginalMember(
      owner = "loginapplet!k",
      name = "d",
      descriptor = "Ljava/io/File;"
   )
   private File field169;

   @OriginalMember(
      owner = "loginapplet!k",
      name = "a",
      descriptor = "(B)Ljava/io/File;",
      line = 5
   )
   public final File method117(byte arg0) {
      try {
         int var2 = 68 / ((arg0 - 43) / 33);
         return this.field169;
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   @OriginalMember(
      owner = "loginapplet!k",
      name = "finalize",
      descriptor = "()V",
      line = 13
   )
   protected final void finalize() throws Throwable {
      try {
         if (this.field168 != null) {
            System.out.println("Warning! fileondisk " + this.field169 + " not closed correctly using close(). Auto-closing instead. ");
            this.method120(21657);
         }

      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   @OriginalMember(
      owner = "loginapplet!k",
      name = "a",
      descriptor = "(B[BII)V",
      line = 28
   )
   public final void method118(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      try {
         int var5 = -71 / ((arg0 - 31) / 55);
         if (~(this.field166 + (long)arg3) >= ~this.field167) {
            this.field168.write(arg1, arg2, arg3);
            this.field166 += (long)arg3;
         } else {
            this.field168.seek(this.field167 + 1L);
            this.field168.write(1);
            throw new EOFException();
         }
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   @OriginalMember(
      owner = "loginapplet!k",
      name = "b",
      descriptor = "(B)J",
      line = 45
   )
   public final long method119(byte arg0) throws IOException {
      try {
         if (arg0 >= -19) {
            this.field169 = (File)null;
         }

         return this.field168.length();
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   @OriginalMember(
      owner = "loginapplet!k",
      name = "a",
      descriptor = "(I)V",
      line = 56
   )
   public final void method120(int arg0) throws IOException {
      try {
         if (arg0 != 21657) {
            this.method117((byte)33);
         }

         if (null != this.field168) {
            this.field168.close();
            this.field168 = null;
         }

      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   @OriginalMember(
      owner = "loginapplet!k",
      name = "a",
      descriptor = "(JZ)V",
      line = 72
   )
   public final void method121(long arg0, boolean arg1) throws IOException {
      try {
         if (!arg1) {
            this.method117((byte)-76);
         }

         this.field168.seek(arg0);
         this.field166 = arg0;
      } catch (RuntimeException var5) {
         throw var5;
      }
   }

   @OriginalMember(
      owner = "loginapplet!k",
      name = "a",
      descriptor = "(III[B)I",
      line = 86
   )
   public final int method122(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      try {
         if (arg2 != 15409) {
            this.field168 = (RandomAccessFile)null;
         }

         int var5 = this.field168.read(arg3, arg0, arg1);
         if (0 < var5) {
            this.field166 += (long)var5;
         }

         return var5;
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   @OriginalMember(
      owner = "loginapplet!k",
      name = "<init>",
      descriptor = "(Ljava/io/File;Ljava/lang/String;J)V",
      line = 100
   )
   public class24(File arg0, String arg1, long arg2) throws IOException {
      try {
         if (-1L == arg2) {
            arg2 = Long.MAX_VALUE;
         }

         if (~arg2 >= ~arg0.length()) {
            arg0.delete();
         }

         this.field168 = new RandomAccessFile(arg0, arg1);
         this.field167 = arg2;
         this.field166 = 0L;
         this.field169 = arg0;
         int var5 = this.field168.read();
         if (~var5 != 0 && !arg1.equals("r")) {
            this.field168.seek(0L);
            this.field168.write(var5);
         }

         this.field168.seek(0L);
      } catch (RuntimeException var6) {
         throw var6;
      }
   }
}
