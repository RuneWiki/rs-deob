import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class610 {
   @OriginalMember(
      owner = "client!nea",
      name = "b",
      descriptor = "Ljava/io/RandomAccessFile;"
   )
   private RandomAccessFile field8687;
   @OriginalMember(
      owner = "client!nea",
      name = "f",
      descriptor = "J"
   )
   private long field8683;
   @OriginalMember(
      owner = "client!nea",
      name = "c",
      descriptor = "J"
   )
   private long field8694;
   @OriginalMember(
      owner = "client!nea",
      name = "o",
      descriptor = "Ljava/io/File;"
   )
   private File field8686;
   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8697 = new String[]{method4499(method4498("lH\u001e\u0016q*")), method4499(method4498("lH\u001e\u0016UkC\u001eTZxHW")), method4499(method4498("UL\rVZlJ^\u0018UkA\u001aW]fD\fS\u0013")), method4499(method4498("\"C\u0010L\u0013aA\u0010KVf\r\u001cWApH\u001cL_{\r\nKZlJ_[_m^\u001a\u0010\u001a,\r>MGm\u0000\u001cT\\qD\u0011_\u0013kC\fLVcIQ\u0018")), method4499(method4498("lX\u0013T")), method4499(method4498("lH\u001e\u0016v*")), method4499(method4498("y\u0003Q\u0016N")), method4499(method4498("lH\u001e\u0016r*")), method4499(method4498("lH\u001e\u0016p*")), method4499(method4498("lH\u001e\u0016\u000fkC\u0016L\r*")), method4499(method4498("lH\u001e\u0016t*")), method4499(method4498("lH\u001e\u0016w*")), method4499(method4498("lH\u001e\u0016u*"))};
   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field8691 = new String[][]{{method4499(method4498("O\u001c")), method4499(method4498("O\u001f")), method4499(method4498("Q\u001c")), "F"}, {method4499(method4498("O\u001c")), method4499(method4498("O\u001f")), method4499(method4498("O\u001e")), method4499(method4498("Q\u001c")), method4499(method4498("Q\u001f")), "F"}, {method4499(method4498("O\u001c")), method4499(method4498("O\u001f")), method4499(method4498("O\u001e")), method4499(method4498("O\u0019")), method4499(method4498("Q\u001c")), method4499(method4498("Q\u001f")), method4499(method4498("Q\u001e")), "F"}};
   @OriginalMember(
      owner = "client!nea",
      name = "q",
      descriptor = "I"
   )
   public static int field8692 = -1;
   @OriginalMember(
      owner = "client!nea",
      name = "d",
      descriptor = "Lhha;"
   )
   public static class724 field8682 = new class724(62, 9);
   @OriginalMember(
      owner = "client!nea",
      name = "l",
      descriptor = "I"
   )
   public static int field8696 = 0;
   @OriginalMember(
      owner = "client!nea",
      name = "e",
      descriptor = "Lhha;"
   )
   public static class724 field8695 = new class724(22, 6);
   @OriginalMember(
      owner = "client!nea",
      name = "j",
      descriptor = "I"
   )
   public static int field8680;
   @OriginalMember(
      owner = "client!nea",
      name = "n",
      descriptor = "I"
   )
   public static int field8681;
   @OriginalMember(
      owner = "client!nea",
      name = "m",
      descriptor = "I"
   )
   public static int field8684;
   @OriginalMember(
      owner = "client!nea",
      name = "h",
      descriptor = "I"
   )
   public static int field8685;
   @OriginalMember(
      owner = "client!nea",
      name = "g",
      descriptor = "I"
   )
   public static int field8688;
   @OriginalMember(
      owner = "client!nea",
      name = "p",
      descriptor = "I"
   )
   public static int field8689;
   @OriginalMember(
      owner = "client!nea",
      name = "i",
      descriptor = "I"
   )
   public static int field8690;
   @OriginalMember(
      owner = "client!nea",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8693;

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(I[BII)V"
   )
   public final void method4491(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      try {
         ++field8685;
         if (~this.field8683 > ~((long)arg3 + this.field8694)) {
            this.field8687.seek(this.field8683);
            this.field8687.write(1);
            throw new EOFException();
         } else {
            if (arg0 != 1) {
               field8682 = null;
            }

            this.field8687.write(arg1, arg2, arg3);
            this.field8694 += (long)arg3;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8697[5] + arg0 + ',' + (arg1 != null ? field8697[6] : field8697[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(III[B)I"
   )
   public final int method4492(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      try {
         if (arg0 != 9236) {
            return -53;
         } else {
            ++field8684;
            int var5 = this.field8687.read(arg3, arg2, arg1);
            if (var5 > 0) {
               this.field8694 += (long)var5;
            }

            return var5;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8697[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8697[6] : field8697[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method4493(long arg0, int arg1) throws IOException {
      try {
         this.field8687.seek(arg0);
         if (arg1 < 2) {
            method4496(-48);
         }

         ++field8690;
         this.field8694 = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8697[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method4494(byte arg0) throws IOException {
      try {
         if (arg0 <= 75) {
            field8692 = -54;
         }

         ++field8681;
         if (this.field8687 != null) {
            this.field8687.close();
            this.field8687 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8697[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method4495(int arg0) throws IOException {
      try {
         if (arg0 != 1191) {
            field8692 = -109;
         }

         ++field8680;
         return this.field8687.length();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8697[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4496(int arg0) {
      try {
         field8682 = null;
         field8695 = null;
         field8691 = null;
         if (arg0 != -18650) {
            field8692 = 109;
         }

         field8693 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8697[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(B)Ljava/io/File;"
   )
   public final File method4497(byte arg0) {
      try {
         ++field8689;
         if (arg0 != -93) {
            this.field8683 = -72L;
         }

         return this.field8686;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8697[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field8688;
         if (this.field8687 != null) {
            System.out.println(field8697[2] + this.field8686 + field8697[3]);
            this.method4494((byte)105);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8697[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "<init>",
      descriptor = "(Ljava/io/File;Ljava/lang/String;J)V"
   )
   public class610(File arg0, String arg1, long arg2) throws IOException {
      try {
         if (~arg2 == 0L) {
            arg2 = Long.MAX_VALUE;
         }

         if (arg0.length() > arg2) {
            arg0.delete();
         }

         this.field8687 = new RandomAccessFile(arg0, arg1);
         this.field8683 = arg2;
         this.field8694 = 0L;
         this.field8686 = arg0;
         int var5 = this.field8687.read();
         if (~var5 != 0 && !arg1.equals("r")) {
            this.field8687.seek(0L);
            this.field8687.write(var5);
         }

         this.field8687.seek(0L);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8697[9] + (arg0 != null ? field8697[6] : field8697[4]) + ',' + (arg1 != null ? field8697[6] : field8697[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4498(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4499(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
