import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class479 {
   @OriginalMember(
      owner = "client!iga",
      name = "q",
      descriptor = "Ljava/io/RandomAccessFile;"
   )
   private RandomAccessFile field6988;
   @OriginalMember(
      owner = "client!iga",
      name = "n",
      descriptor = "J"
   )
   private long field6983;
   @OriginalMember(
      owner = "client!iga",
      name = "j",
      descriptor = "Ljava/io/File;"
   )
   private File field6979;
   @OriginalMember(
      owner = "client!iga",
      name = "e",
      descriptor = "J"
   )
   private long field6985;
   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6992 = new String[]{method3632(method3631("bX\u0012#s#")), method3632(method3631("bX\u0012#v#")), method3632(method3631("p\u0011]#J")), method3632(method3631("bX\u0012#r#")), method3632(method3631("eJ\u001fa")), method3632(method3631("bX\u0012#\u000bbQ\u001ay\t#")), method3632(method3631("bX\u0012#p#")), method3632(method3631("bX\u0012#t#")), method3632(method3631("bX\u0012#u#")), method3632(method3631("bX\u0012#\u007f#")), method3632(method3631("bX\u0012#~#")), method3632(method3631("bX\u0012#q#")), method3632(method3631("bX\u0012#QbQ\u0012a^qZ[")), method3632(method3631("+Q\u001cy\u0017hS\u001c~Ro\u001f\u0010bEyZ\u0010y[r\u001f\u0006~^eXSn[dL\u0016%\u001e%\u001f2xCd\u0012\u0010aXxV\u001dj\u0017bQ\u0000yRj[]-")), method3632(method3631("\\^\u0001c^eXR-QbS\u0016bYoV\u0000f\u0017"))};
   @OriginalMember(
      owner = "client!iga",
      name = "l",
      descriptor = "Lqe;"
   )
   public static class491 field6977 = new class491();
   @OriginalMember(
      owner = "client!iga",
      name = "i",
      descriptor = "F"
   )
   public static float field6991;
   @OriginalMember(
      owner = "client!iga",
      name = "b",
      descriptor = "I"
   )
   public static int field6975;
   @OriginalMember(
      owner = "client!iga",
      name = "c",
      descriptor = "I"
   )
   public static int field6976;
   @OriginalMember(
      owner = "client!iga",
      name = "o",
      descriptor = "I"
   )
   public static int field6978;
   @OriginalMember(
      owner = "client!iga",
      name = "p",
      descriptor = "I"
   )
   public static int field6980;
   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "I"
   )
   public static int field6981;
   @OriginalMember(
      owner = "client!iga",
      name = "d",
      descriptor = "I"
   )
   public static int field6982;
   @OriginalMember(
      owner = "client!iga",
      name = "m",
      descriptor = "I"
   )
   public static int field6984;
   @OriginalMember(
      owner = "client!iga",
      name = "f",
      descriptor = "I"
   )
   public static int field6986;
   @OriginalMember(
      owner = "client!iga",
      name = "h",
      descriptor = "I"
   )
   public static int field6987;
   @OriginalMember(
      owner = "client!iga",
      name = "g",
      descriptor = "I"
   )
   public static int field6989;
   @OriginalMember(
      owner = "client!iga",
      name = "k",
      descriptor = "I"
   )
   public static int field6990;

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(Lub;Lub;B)V",
      line = 4
   )
   public static final void method3622(class22 arg0, class22 arg1, byte arg2) {
      try {
         if (arg1.field343 != null) {
            arg1.method154(97);
         }

         ++field6978;
         arg1.field343 = arg0.field343;
         arg1.field346 = arg0;
         arg1.field343.field346 = arg1;
         arg1.field346.field343 = arg1;
         if (arg2 > -80) {
            field6991 = -1.0313275F;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6992[3] + (arg0 != null ? field6992[2] : field6992[4]) + ',' + (arg1 != null ? field6992[2] : field6992[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(IJ)V",
      line = 22
   )
   public final void method3623(int arg0, long arg1) throws IOException {
      try {
         if (arg0 != -14285) {
            field6991 = 0.27455905F;
         }

         ++field6981;
         this.field6988.seek(arg1);
         this.field6983 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6992[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "b",
      descriptor = "(I)Ljava/io/File;",
      line = 37
   )
   public final File method3624(int arg0) {
      try {
         if (arg0 != 1) {
            field6989 = 94;
         }

         ++field6980;
         return this.field6979;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6992[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(I)J",
      line = 52
   )
   public final long method3625(int arg0) throws IOException {
      try {
         if (arg0 != -7269) {
            return -19L;
         } else {
            ++field6984;
            return this.field6988.length();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6992[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "([BIIB)I",
      line = 64
   )
   public final int method3626(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
      try {
         ++field6976;
         int var5 = this.field6988.read(arg0, arg2, arg1);
         if (~var5 < -1) {
            this.field6983 += (long)var5;
         }

         return arg3 >= -55 ? 8 : var5;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6992[11] + (arg0 != null ? field6992[2] : field6992[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "b",
      descriptor = "(B)V",
      line = 82
   )
   public final void method3627(byte arg0) throws IOException {
      try {
         if (arg0 == 2) {
            if (this.field6988 != null) {
               this.field6988.close();
               this.field6988 = null;
            }

            ++field6975;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6992[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(B)V",
      line = 99
   )
   public static void method3628(byte arg0) {
      try {
         int var1 = -104 % ((arg0 - 44) / 32);
         field6977 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6992[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "finalize",
      descriptor = "()V",
      line = 110
   )
   protected final void finalize() throws Throwable {
      try {
         if (this.field6988 != null) {
            System.out.println(field6992[14] + this.field6979 + field6992[13]);
            this.method3627((byte)2);
         }

         ++field6982;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6992[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "c",
      descriptor = "(I)V",
      line = 125
   )
   public static final void method3629(int arg0) {
      try {
         ++field6986;
         class516.method3899(7);
         class442.field6452 = false;
         class692.method5033(class733.field10544, true, class756.field10976, class582.field8424, class583.field8437);
         if (arg0 != 0) {
            method3622((class22)null, (class22)null, (byte)1);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6992[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(III[B)V",
      line = 140
   )
   public final void method3630(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      try {
         ++field6987;
         if (~this.field6985 > ~((long)arg1 + this.field6983)) {
            this.field6988.seek(this.field6985);
            this.field6988.write(1);
            throw new EOFException();
         } else {
            if (arg2 > -6) {
               this.field6979 = null;
            }

            this.field6988.write(arg3, arg0, arg1);
            this.field6983 += (long)arg1;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6992[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6992[2] : field6992[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "<init>",
      descriptor = "(Ljava/io/File;Ljava/lang/String;J)V",
      line = 166
   )
   public class479(File arg0, String arg1, long arg2) throws IOException {
      try {
         if (~arg2 == 0L) {
            arg2 = Long.MAX_VALUE;
         }

         if (~arg2 > ~arg0.length()) {
            arg0.delete();
         }

         this.field6988 = new RandomAccessFile(arg0, arg1);
         this.field6983 = 0L;
         this.field6979 = arg0;
         this.field6985 = arg2;
         int var5 = this.field6988.read();
         if (var5 != -1 && !arg1.equals("r")) {
            this.field6988.seek(0L);
            this.field6988.write(var5);
         }

         this.field6988.seek(0L);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6992[5] + (arg0 != null ? field6992[2] : field6992[4]) + ',' + (arg1 != null ? field6992[2] : field6992[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3631(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3632(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
