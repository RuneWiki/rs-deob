import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class468 {
   @OriginalMember(
      owner = "client!ti",
      name = "f",
      descriptor = "Ljava/io/RandomAccessFile;"
   )
   private RandomAccessFile field6448;
   @OriginalMember(
      owner = "client!ti",
      name = "l",
      descriptor = "J"
   )
   private long field6446;
   @OriginalMember(
      owner = "client!ti",
      name = "p",
      descriptor = "Ljava/io/File;"
   )
   private File field6449;
   @OriginalMember(
      owner = "client!ti",
      name = "g",
      descriptor = "J"
   )
   private long field6452;
   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6457 = new String[]{method3437(method3436("p;zJR")), method3437(method3436("p;zOR")), method3437(method3436("j'8b")), method3437(method3436("p;zIR")), method3437(method3436("\u007f|z \u0007")), method3437(method3436("p;zHR")), method3437(method3436("$<;zZg>;}\u001f`r7a\bv77z\u0016}r!}\u0013j5tm\u0016k!1&S*r\u0015{\u000ek\u007f7b\u0015w;:iZm<'z\u001fe6z.")), method3437(method3436("p;zh\u0013j38g\u0000az")), method3437(method3436("S3&`\u0013j5u.\u001cm>1a\u0014`;'eZ")), method3437(method3436("p;zKR")), method3437(method3436("p;zLR")), method3437(method3436("p;z2\u0013j; 0R")), method3437(method3436("p;zMR"))};
   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "I"
   )
   public static int field6445 = 1;
   @OriginalMember(
      owner = "client!ti",
      name = "c",
      descriptor = "Ltv;"
   )
   public static class590 field6450 = new class590(5);
   @OriginalMember(
      owner = "client!ti",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field6456 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @OriginalMember(
      owner = "client!ti",
      name = "j",
      descriptor = "D"
   )
   public static double field6454;
   @OriginalMember(
      owner = "client!ti",
      name = "m",
      descriptor = "I"
   )
   public static int field6440;
   @OriginalMember(
      owner = "client!ti",
      name = "b",
      descriptor = "I"
   )
   public static int field6441;
   @OriginalMember(
      owner = "client!ti",
      name = "o",
      descriptor = "I"
   )
   public static int field6442;
   @OriginalMember(
      owner = "client!ti",
      name = "q",
      descriptor = "I"
   )
   public static int field6443;
   @OriginalMember(
      owner = "client!ti",
      name = "n",
      descriptor = "I"
   )
   public static int field6444;
   @OriginalMember(
      owner = "client!ti",
      name = "i",
      descriptor = "I"
   )
   public static int field6447;
   @OriginalMember(
      owner = "client!ti",
      name = "h",
      descriptor = "I"
   )
   public static int field6453;
   @OriginalMember(
      owner = "client!ti",
      name = "d",
      descriptor = "I"
   )
   public static int field6455;
   @OriginalMember(
      owner = "client!ti",
      name = "e",
      descriptor = "[[Leb;"
   )
   public static class657[][] field6451;

   @OriginalMember(
      owner = "client!ti",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field6443;
         if (this.field6448 != null) {
            System.out.println(field6457[8] + this.field6449 + field6457[6]);
            this.method3435(false);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6457[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method3429(int arg0) throws IOException {
      try {
         if (arg0 != 137) {
            method3431((byte)5);
         }

         ++field6455;
         return this.field6448.length();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6457[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(II[BB)V"
   )
   public final void method3430(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
      try {
         if (arg3 == 126) {
            ++field6453;
            if (this.field6446 < (long)arg1 - -this.field6452) {
               this.field6448.seek(this.field6446);
               this.field6448.write(1);
               throw new EOFException();
            } else {
               this.field6448.write(arg2, arg0, arg1);
               this.field6452 += (long)arg1;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6457[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6457[4] : field6457[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3431(byte arg0) {
      try {
         field6450 = null;
         field6451 = null;
         if (arg0 >= -103) {
            field6454 = -1.2075353513402383D;
         }

         field6456 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6457[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method3432(long arg0, int arg1) throws IOException {
      try {
         ++field6442;
         this.field6448.seek(arg0);
         int var4 = -84 / ((arg1 - 4) / 39);
         this.field6452 = arg0;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6457[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(I)Ljava/io/File;"
   )
   public final File method3433(int arg0) {
      try {
         ++field6440;
         return arg0 != 24150 ? null : this.field6449;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6457[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(BII[B)I"
   )
   public final int method3434(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      try {
         if (arg0 != -83) {
            return 48;
         } else {
            ++field6444;
            int var5 = this.field6448.read(arg3, arg2, arg1);
            if (var5 > 0) {
               this.field6452 += (long)var5;
            }

            return var5;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6457[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6457[4] : field6457[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3435(boolean arg0) throws IOException {
      try {
         ++field6447;
         if (this.field6448 != null) {
            this.field6448.close();
            this.field6448 = null;
         }

         if (arg0) {
            this.method3433(36);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6457[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "<init>",
      descriptor = "(Ljava/io/File;Ljava/lang/String;J)V"
   )
   public class468(File arg0, String arg1, long arg2) throws IOException {
      try {
         if (~arg2 == 0L) {
            arg2 = Long.MAX_VALUE;
         }

         if (~arg2 > ~arg0.length()) {
            arg0.delete();
         }

         this.field6448 = new RandomAccessFile(arg0, arg1);
         this.field6446 = arg2;
         this.field6449 = arg0;
         this.field6452 = 0L;
         int var5 = this.field6448.read();
         if (~var5 != 0 && !arg1.equals("r")) {
            this.field6448.seek(0L);
            this.field6448.write(var5);
         }

         this.field6448.seek(0L);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6457[11] + (arg0 != null ? field6457[4] : field6457[2]) + ',' + (arg1 != null ? field6457[4] : field6457[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3436(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3437(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
