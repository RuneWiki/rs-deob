import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class492 {
   @OriginalMember(
      owner = "client!qp",
      name = "l",
      descriptor = "Ljava/io/RandomAccessFile;"
   )
   private RandomAccessFile field6874;
   @OriginalMember(
      owner = "client!qp",
      name = "k",
      descriptor = "J"
   )
   private long field6877;
   @OriginalMember(
      owner = "client!qp",
      name = "f",
      descriptor = "J"
   )
   private long field6873;
   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "Ljava/io/File;"
   )
   private File field6869;
   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6881 = new String[]{method3749(method3748("tr:|")), method3749(method3748("kwx,-tn\".l")), method3749(method3748("a)x>9")), method3749(method3748("kwxTl")), method3749(method3748("kwxXl")), method3749(method3748("kwxWl")), method3749(method3748(":i9ddyk9c!~'5\u007f6hb5d(c'#c-t`vs(ut38m4'\u0017e0u*5|+in8wdsi%d!{cx0")), method3749(method3748("kwxv-tf:y>\u007f/")), method3749(method3748("Mf$~-t`w0\"sk3\u007f*~n%{d")), method3749(method3748("kwxRl")), method3749(method3748("kwxUl")), method3749(method3748("kwxYl")), method3749(method3748("kwxQl")), method3749(method3748("kwxVl")), method3749(method3748("kwxSl"))};
   @OriginalMember(
      owner = "client!qp",
      name = "e",
      descriptor = "I"
   )
   public static int field6879 = 0;
   @OriginalMember(
      owner = "client!qp",
      name = "n",
      descriptor = "I"
   )
   public static int field6866;
   @OriginalMember(
      owner = "client!qp",
      name = "g",
      descriptor = "I"
   )
   public static int field6867;
   @OriginalMember(
      owner = "client!qp",
      name = "m",
      descriptor = "I"
   )
   public static int field6868;
   @OriginalMember(
      owner = "client!qp",
      name = "i",
      descriptor = "I"
   )
   public static int field6870;
   @OriginalMember(
      owner = "client!qp",
      name = "c",
      descriptor = "I"
   )
   public static int field6872;
   @OriginalMember(
      owner = "client!qp",
      name = "d",
      descriptor = "I"
   )
   public static int field6875;
   @OriginalMember(
      owner = "client!qp",
      name = "o",
      descriptor = "I"
   )
   public static int field6876;
   @OriginalMember(
      owner = "client!qp",
      name = "j",
      descriptor = "I"
   )
   public static int field6878;
   @OriginalMember(
      owner = "client!qp",
      name = "b",
      descriptor = "I"
   )
   public static int field6880;
   @OriginalMember(
      owner = "client!qp",
      name = "h",
      descriptor = "Lkv;"
   )
   public static class19 field6871;

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "([BIBI)I"
   )
   public final int method3739(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
      try {
         ++field6872;
         if (arg2 > -111) {
            return 2;
         } else {
            int var5 = this.field6874.read(arg0, arg3, arg1);
            if (~var5 < -1) {
               this.field6877 += (long)var5;
            }

            return var5;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6881[4] + (arg0 != null ? field6881[2] : field6881[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "d",
      descriptor = "(I)Ljava/io/File;"
   )
   public final File method3740(int arg0) {
      try {
         if (arg0 != 0) {
            this.field6874 = null;
         }

         ++field6867;
         return this.field6869;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6881[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method3741(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      try {
         ++field6878;
         if ((long)arg0 + this.field6877 > this.field6873) {
            this.field6874.seek(this.field6873);
            this.field6874.write(1);
            throw new EOFException();
         } else {
            this.field6874.write(arg2, arg1, arg0);
            this.field6877 += (long)arg0;
            if (arg3 != 1) {
               this.field6869 = null;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6881[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6881[2] : field6881[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method3742(long arg0, int arg1) throws IOException {
      try {
         ++field6870;
         this.field6874.seek(arg0);
         int var4 = -51 / ((51 - arg1) / 37);
         this.field6877 = arg0;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6881[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method3743(int arg0) throws IOException {
      try {
         ++field6876;
         if (arg0 != 3) {
            this.field6874 = null;
         }

         return this.field6874.length();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6881[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3744(int arg0) throws IOException {
      try {
         if (arg0 != 1571) {
            this.field6874 = null;
         }

         if (this.field6874 != null) {
            this.field6874.close();
            this.field6874 = null;
         }

         ++field6880;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6881[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(II[[[BLha;IIIIIIIII)V"
   )
   public static final void method3745(int arg0, int arg1, byte[][][] arg2, class479 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field6868;
         if (arg6 != 0 && arg4 != 0) {
            int var13 = -64 % ((-14 - arg9) / 44);
            if (~arg6 == -10) {
               arg12 = arg12 + 1 & 3;
               arg6 = 1;
            }

            if (~arg6 == -11) {
               arg12 = 3 & arg12 + 3;
               arg6 = 1;
            }

            if (arg6 == 11) {
               arg12 = 3 & arg12 + 3;
               arg6 = 8;
            }

            arg3.method404(arg8, arg10, arg0, arg5, arg11, arg7, arg2[arg6 - 1][arg12], arg4, arg1);
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field6881[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6881[2] : field6881[0]) + ',' + (arg3 != null ? field6881[2] : field6881[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         if (this.field6874 != null) {
            System.out.println(field6881[8] + this.field6869 + field6881[6]);
            this.method3744(1571);
         }

         ++field6875;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6881[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method3746(int arg0) {
      try {
         if (arg0 != 11) {
            field6871 = null;
         }

         field6871 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6881[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "<init>",
      descriptor = "(Ljava/io/File;Ljava/lang/String;J)V"
   )
   public class492(File arg0, String arg1, long arg2) throws IOException {
      try {
         if (~arg2 == 0L) {
            arg2 = Long.MAX_VALUE;
         }

         if (~arg2 > ~arg0.length()) {
            arg0.delete();
         }

         this.field6874 = new RandomAccessFile(arg0, arg1);
         this.field6877 = 0L;
         this.field6873 = arg2;
         this.field6869 = arg0;
         int var5 = this.field6874.read();
         if (var5 != -1 && !arg1.equals("r")) {
            this.field6874.seek(0L);
            this.field6874.write(var5);
         }

         this.field6874.seek(0L);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6881[1] + (arg0 != null ? field6881[2] : field6881[0]) + ',' + (arg1 != null ? field6881[2] : field6881[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "c",
      descriptor = "(I)Z"
   )
   public static final boolean method3747(int arg0) {
      try {
         ++field6866;
         if (arg0 != 0) {
            method3746(53);
         }

         return class704.field10289;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6881[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3748(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3749(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
