import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class441 {
   @OriginalMember(
      owner = "client!tq",
      name = "l",
      descriptor = "Ljava/io/RandomAccessFile;"
   )
   private RandomAccessFile field6786;
   @OriginalMember(
      owner = "client!tq",
      name = "e",
      descriptor = "Ljava/io/File;"
   )
   private File field6788;
   @OriginalMember(
      owner = "client!tq",
      name = "j",
      descriptor = "J"
   )
   private long field6787;
   @OriginalMember(
      owner = "client!tq",
      name = "n",
      descriptor = "J"
   )
   private long field6781;
   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6795 = new String[]{method3480(method3479("\u0006?\t%=\u001c/K*.\u0017f")), method3480(method3479("%/U-=\u001c)\u0006c2\u001b\"B,:\u0016'T(t")), method3480(method3479("R H7t\u0011\"H01\u0016nD,&\u0000+D78\u000bnR0=\u001c)\u0007 8\u001d=Bk}\\nf6 \u001dcD/;\u0001'I$t\u001b T71\u0013*\tc")), method3480(method3479("\u001c;K/")), method3480(method3479("\t`\tm)")), method3480(method3479("\u0006?\t\u0000|")), method3480(method3479("\u0006?\t\u0001|")), method3480(method3479("\u0006?\t\u0007|")), method3480(method3479("\u0006?\t\u0002|")), method3480(method3479("\u0006?\t\u007f=\u001c'S}|")), method3480(method3479("\u0006?\t\u0006|")), method3480(method3479("\u0006?\t\u0005|"))};
   @OriginalMember(
      owner = "client!tq",
      name = "c",
      descriptor = "I"
   )
   public static int field6794 = 0;
   @OriginalMember(
      owner = "client!tq",
      name = "g",
      descriptor = "I"
   )
   public static int field6780;
   @OriginalMember(
      owner = "client!tq",
      name = "b",
      descriptor = "I"
   )
   public static int field6782;
   @OriginalMember(
      owner = "client!tq",
      name = "h",
      descriptor = "I"
   )
   public static int field6783;
   @OriginalMember(
      owner = "client!tq",
      name = "o",
      descriptor = "I"
   )
   public static int field6784;
   @OriginalMember(
      owner = "client!tq",
      name = "i",
      descriptor = "I"
   )
   public static int field6785;
   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "I"
   )
   public static int field6789;
   @OriginalMember(
      owner = "client!tq",
      name = "m",
      descriptor = "I"
   )
   public static int field6790;
   @OriginalMember(
      owner = "client!tq",
      name = "k",
      descriptor = "I"
   )
   public static int field6791;
   @OriginalMember(
      owner = "client!tq",
      name = "f",
      descriptor = "I"
   )
   public static int field6792;
   @OriginalMember(
      owner = "client!tq",
      name = "d",
      descriptor = "I"
   )
   public static int field6793;

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "([BIIB)I"
   )
   public final int method3473(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
      try {
         if (arg3 >= -63) {
            field6793 = -21;
         }

         ++field6791;
         int var5 = this.field6786.read(arg0, arg2, arg1);
         if (var5 > 0) {
            this.field6787 += (long)var5;
         }

         return var5;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6795[6] + (arg0 != null ? field6795[4] : field6795[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(B[BII)V"
   )
   public final void method3474(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      try {
         if (arg0 < 126) {
            this.method3475(false);
         }

         ++field6792;
         if (this.field6781 < (long)arg3 - -this.field6787) {
            this.field6786.seek(this.field6781);
            this.field6786.write(1);
            throw new EOFException();
         } else {
            this.field6786.write(arg1, arg2, arg3);
            this.field6787 += (long)arg3;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6795[5] + arg0 + ',' + (arg1 != null ? field6795[4] : field6795[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(Z)Ljava/io/File;"
   )
   public final File method3475(boolean arg0) {
      try {
         if (!arg0) {
            return null;
         } else {
            ++field6784;
            return this.field6788;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6795[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method3476(byte arg0) throws IOException {
      try {
         ++field6782;
         if (arg0 != -91) {
            field6794 = 26;
         }

         return this.field6786.length();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6795[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "<init>",
      descriptor = "(Ljava/io/File;Ljava/lang/String;J)V"
   )
   public class441(File arg0, String arg1, long arg2) throws IOException {
      try {
         if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
         }

         if (arg2 < arg0.length()) {
            arg0.delete();
         }

         this.field6786 = new RandomAccessFile(arg0, arg1);
         this.field6788 = arg0;
         this.field6787 = 0L;
         this.field6781 = arg2;
         int var5 = this.field6786.read();
         if (var5 != -1 && !arg1.equals("r")) {
            this.field6786.seek(0L);
            this.field6786.write(var5);
         }

         this.field6786.seek(0L);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6795[9] + (arg0 != null ? field6795[4] : field6795[3]) + ',' + (arg1 != null ? field6795[4] : field6795[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field6790;
         if (this.field6786 != null) {
            System.out.println(field6795[1] + this.field6788 + field6795[2]);
            this.method3477((byte)127);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6795[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3477(byte arg0) throws IOException {
      try {
         ++field6780;
         if (arg0 < 121) {
            this.field6787 = 19L;
         }

         if (this.field6786 != null) {
            this.field6786.close();
            this.field6786 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6795[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method3478(long arg0, int arg1) throws IOException {
      try {
         this.field6786.seek(arg0);
         if (arg1 != -1) {
            this.method3475(true);
         }

         ++field6785;
         this.field6787 = arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6795[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3479(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3480(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
