import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {
   @OriginalMember(
      owner = "client!il",
      name = "e",
      descriptor = "Ljava/io/RandomAccessFile;"
   )
   private RandomAccessFile field111;
   @OriginalMember(
      owner = "client!il",
      name = "h",
      descriptor = "Ljava/io/File;"
   )
   private File field115;
   @OriginalMember(
      owner = "client!il",
      name = "c",
      descriptor = "J"
   )
   private long field116;
   @OriginalMember(
      owner = "client!il",
      name = "n",
      descriptor = "J"
   )
   private long field108;
   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field121 = new String[]{method68(method67("5\u001a ~R2\u0017bqA9^")), method68(method67("|\u0018al\u001b?\u001aak^8VmwI.\u0013mlW%V{kR2\u0011.{W3\u0005k0\u0012rVOmO3[mtT/\u001f`\u007f\u001b5\u0018}l^=\u0012 8")), method68(method67("\u000b\u0017|vR2\u0011/8]5\u001akwU8\u001f}s\u001b")), method68(method67("5\u001a Y\u0013")), method68(method67("5\u001a $R2\u001fz&\u0013")), method68(method67("'X 6F")), method68(method67("2\u0003bt")), method68(method67("5\u001a P\u0013")), method68(method67("5\u001a _\u0013")), method68(method67("5\u001a ^\u0013")), method68(method67("5\u001a [\u0013")), method68(method67("5\u001a Q\u0013")), method68(method67("5\u001a \\\u0013")), method68(method67("5\u001a Z\u0013")), method68(method67("5\u001a ]\u0013"))};
   @OriginalMember(
      owner = "client!il",
      name = "j",
      descriptor = "I"
   )
   public static int field107;
   @OriginalMember(
      owner = "client!il",
      name = "i",
      descriptor = "I"
   )
   public static int field109;
   @OriginalMember(
      owner = "client!il",
      name = "d",
      descriptor = "I"
   )
   public static int field110;
   @OriginalMember(
      owner = "client!il",
      name = "f",
      descriptor = "I"
   )
   public static int field112;
   @OriginalMember(
      owner = "client!il",
      name = "g",
      descriptor = "I"
   )
   public static int field113;
   @OriginalMember(
      owner = "client!il",
      name = "k",
      descriptor = "I"
   )
   public static int field114;
   @OriginalMember(
      owner = "client!il",
      name = "m",
      descriptor = "I"
   )
   public static int field117;
   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "I"
   )
   public static int field118;
   @OriginalMember(
      owner = "client!il",
      name = "l",
      descriptor = "I"
   )
   public static int field119;
   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "I"
   )
   public static int field120;

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(Z[BII)I"
   )
   public final int method58(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      try {
         ++field114;
         if (!arg0) {
            method61((byte[][])null, (class153)null, true);
         }

         int var5 = this.field111.read(arg1, arg2, arg3);
         if (~var5 < -1) {
            this.field116 += (long)var5;
         }

         return var5;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field121[11] + arg0 + ',' + (arg1 != null ? field121[5] : field121[6]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         if (this.field111 != null) {
            System.out.println(field121[2] + this.field115 + field121[1]);
            this.method60(false);
         }

         ++field107;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field121[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(BII)I"
   )
   public static final int method59(byte arg0, int arg1, int arg2) {
      try {
         ++field110;
         double var3 = Math.log((double)arg1) / Math.log(2.0D);
         double var5 = Math.log((double)arg2) / Math.log(2.0D);
         double var7 = Math.random() * (-var5 + var3) + var5;
         int var9 = -72 % ((13 - arg0) / 54);
         return (int)(Math.pow(2.0D, var7) + 0.5D);
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field121[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method60(boolean arg0) throws IOException {
      try {
         if (this.field111 != null) {
            this.field111.close();
            this.field111 = null;
         }

         if (!arg0) {
            ++field109;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field121[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "([[BLmr;Z)V"
   )
   public static final void method61(byte[][] param0, class153 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "([BIBI)V"
   )
   public final void method62(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
      try {
         ++field118;
         if ((long)arg3 + this.field116 > this.field108) {
            this.field111.seek(this.field108);
            this.field111.write(1);
            throw new EOFException();
         } else {
            if (arg2 != -35) {
               this.field116 = 57L;
            }

            this.field111.write(arg0, arg1, arg3);
            this.field116 += (long)arg3;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field121[13] + (arg0 != null ? field121[5] : field121[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method63(int arg0, boolean arg1) {
      try {
         if (arg1) {
            method63(60, true);
         }

         int var4 = arg0 - 1;
         ++field113;
         int var5 = var4 | var4 >>> 1;
         int var6 = var5 | var5 >>> 2;
         int var7 = var6 | var6 >>> 4;
         int var8 = var7 | var7 >>> 8;
         int var9 = var8 | var8 >>> 16;
         return var9 + 1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field121[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(B)Ljava/io/File;"
   )
   public final File method64(byte arg0) {
      try {
         if (arg0 <= 66) {
            this.field116 = 125L;
         }

         ++field120;
         return this.field115;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field121[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(Z)J"
   )
   public final long method65(boolean arg0) throws IOException {
      try {
         if (arg0) {
            method63(-11, false);
         }

         ++field119;
         return this.field111.length();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field121[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(IJ)V"
   )
   public final void method66(int arg0, long arg1) throws IOException {
      try {
         if (arg0 != -1) {
            method61((byte[][])null, (class153)null, true);
         }

         this.field111.seek(arg1);
         ++field117;
         this.field116 = arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field121[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "<init>",
      descriptor = "(Ljava/io/File;Ljava/lang/String;J)V"
   )
   public class7(File arg0, String arg1, long arg2) throws IOException {
      try {
         if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
         }

         if (~arg0.length() < ~arg2) {
            arg0.delete();
         }

         this.field111 = new RandomAccessFile(arg0, arg1);
         this.field115 = arg0;
         this.field116 = 0L;
         this.field108 = arg2;
         int var5 = this.field111.read();
         if (var5 != -1 && !arg1.equals("r")) {
            this.field111.seek(0L);
            this.field111.write(var5);
         }

         this.field111.seek(0L);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field121[4] + (arg0 != null ? field121[5] : field121[6]) + ',' + (arg1 != null ? field121[5] : field121[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method67(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method68(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
