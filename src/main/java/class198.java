import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class198 extends class67 {
   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3059 = new String[]{method1751(method1750("MN_vp")), method1751(method1750("@\u0011_\u001d%")), method1751(method1750("MN_up")), method1751(method1750("UJ\u001d_")), method1751(method1750("MN_zp")), method1751(method1750("MN_qp")), method1751(method1750("MN_pp")), method1751(method1750("MN_{p")), method1751(method1750("MN_rp")), method1751(method1750("MN_tp")), method1751(method1750("MN_wp"))};
   @OriginalMember(
      owner = "client!vq",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field3052 = new int[4096];
   @OriginalMember(
      owner = "client!vq",
      name = "m",
      descriptor = "I"
   )
   public static int field3058;
   @OriginalMember(
      owner = "client!vq",
      name = "u",
      descriptor = "Lnaa;"
   )
   public static class113 field3057;
   @OriginalMember(
      owner = "client!vq",
      name = "r",
      descriptor = "I"
   )
   public static int field3048;
   @OriginalMember(
      owner = "client!vq",
      name = "k",
      descriptor = "I"
   )
   public static int field3049;
   @OriginalMember(
      owner = "client!vq",
      name = "o",
      descriptor = "I"
   )
   public static int field3050;
   @OriginalMember(
      owner = "client!vq",
      name = "s",
      descriptor = "I"
   )
   public static int field3051;
   @OriginalMember(
      owner = "client!vq",
      name = "n",
      descriptor = "I"
   )
   public static int field3053;
   @OriginalMember(
      owner = "client!vq",
      name = "l",
      descriptor = "I"
   )
   public static int field3054;
   @OriginalMember(
      owner = "client!vq",
      name = "q",
      descriptor = "I"
   )
   public static int field3055;
   @OriginalMember(
      owner = "client!vq",
      name = "t",
      descriptor = "I"
   )
   public static int field3056;

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         ++field3056;
         if (super.field881.field507.method3434(0) && !class290.method2450(super.field881.field507.method3440(480102311), (byte)74)) {
            super.field877 = 0;
         }

         if (~super.field877 > -1 || super.field877 > 2) {
            super.field877 = this.method162(0);
         }

         if (arg0 != -69) {
            method1748(false);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3059[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method1745(int arg0) {
      try {
         ++field3054;
         if (!class290.method2450(super.field881.field507.method3440(480102311), (byte)105)) {
            return false;
         } else {
            if (arg0 != 3343) {
               field3057 = null;
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3059[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1746(int arg0) {
      try {
         if (arg0 != 480102311) {
            field3058 = 63;
         }

         ++field3049;
         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3059[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field3055;
         if (!class290.method2450(super.field881.field507.method3440(480102311), (byte)104)) {
            return 3;
         } else {
            if (arg1 >= -74) {
               this.method1745(100);
            }

            return 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3059[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(Ljava/io/File;[BII)V"
   )
   public static final void method1747(File arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      try {
         ++field3053;
         DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));

         try {
            var4.readFully(arg1, arg2, arg3);
         } catch (EOFException var6) {
         }

         var4.close();
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field3059[2] + (arg0 != null ? field3059[1] : field3059[3]) + ',' + (arg1 != null ? field3059[1] : field3059[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class198(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!vq",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class198(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1748(boolean arg0) {
      try {
         field3057 = null;
         if (!arg0) {
            method1748(true);
         }

         field3052 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3059[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field3051;
         super.field877 = arg0;
         if (!arg1) {
            field3058 = 5;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3059[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            field3057 = null;
         }

         ++field3050;
         return 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3059[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(IILha;ILfq;I)V"
   )
   public static final void method1749(int arg0, int arg1, class610 arg2, int arg3, class374 arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         if (arg5 != 0) {
            method1748(false);
         }

         int var7 = 7;
         int var10000;
         if (var6) {
            var10000 = 127;
         } else if (var7 < 0) {
            var10000 = field3048 + 1;
            if (!var6) {
               field3048 = var10000;
               return;
            }
         } else {
            var10000 = 127;
         }

         while(true) {
            label71: {
               int var8 = var10000;
               if (var6) {
                  class274.method2325(false, 1, true);
               } else if (~var8 > -1) {
                  if (!var6) {
                     break label71;
                  }
               } else {
                  class274.method2325(false, 1, true);
               }

               while(true) {
                  int var9 = 64512 & arg3 << 10 | (7 & var7) << 7 | 127 & var8;
                  int var10 = class228.field3503[var9];
                  class595.method4428(false, (byte)-107, true);
                  arg2.method631((arg4.field5849 * var8 >> 7) + arg0, ((-var7 + 7) * arg4.field5915 >> 3) + arg1, (arg4.field5849 >> 7) + 1, (arg4.field5915 >> 3) + 1, var10, 0);
                  --var8;
                  if (~var8 > -1) {
                     if (!var6) {
                        break;
                     }
                  } else {
                     class274.method2325(false, 1, true);
                  }
               }
            }

            --var7;
            if (var7 < 0) {
               var10000 = field3048 + 1;
               if (!var6) {
                  field3048 = var10000;
                  return;
               }
            } else {
               var10000 = 127;
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field3059[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3059[1] : field3059[3]) + ',' + arg3 + ',' + (arg4 != null ? field3059[1] : field3059[3]) + ',' + arg5 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 4096; ++var0) {
         field3052[var0] = class722.method5339(-105, var0);
      }

      field3058 = 0;
      field3057 = new class113(15, 4);
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1750(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1751(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
