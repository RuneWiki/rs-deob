import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public abstract class class689 implements class708 {
   @OriginalMember(
      owner = "client!bca",
      name = "q",
      descriptor = "Z"
   )
   private boolean field10378 = false;
   @OriginalMember(
      owner = "client!bca",
      name = "k",
      descriptor = "Z"
   )
   private boolean field10375;
   @OriginalMember(
      owner = "client!bca",
      name = "s",
      descriptor = "I"
   )
   public int field10376;
   @OriginalMember(
      owner = "client!bca",
      name = "m",
      descriptor = "I"
   )
   private int field10379;
   @OriginalMember(
      owner = "client!bca",
      name = "d",
      descriptor = "I"
   )
   public int field10369;
   @OriginalMember(
      owner = "client!bca",
      name = "r",
      descriptor = "Lck;"
   )
   public class667 field10381;
   @OriginalMember(
      owner = "client!bca",
      name = "f",
      descriptor = "I"
   )
   public int field10388;
   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10393 = new String[]{method5023(method5022("Xn\u001d@Q")), method5023(method5022("A#R@\u0010J.Z\u001a\u0012\u000b")), method5023(method5022("M5_\u0002")), method5023(method5022("A#R@c\u000b")), method5023(method5022("A#R@o\u000b")), method5023(method5022("A#R@|\u000b")), method5023(method5022("A#R@}\u000b")), method5023(method5022("A#R@h\u000b")), method5023(method5022("A#R@k\u000b")), method5023(method5022("A#R@m\u000b")), method5023(method5022("A#R@i\u000b")), method5023(method5022("A#R@d\u000b")), method5023(method5022("A#R@n\u000b")), method5023(method5022("A#R@j\u000b")), method5023(method5022("A#R@JJ.R\u0002EY%\u001b"))};
   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field10382 = new int[120];
   @OriginalMember(
      owner = "client!bca",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field10390;
   @OriginalMember(
      owner = "client!bca",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field10389;
   @OriginalMember(
      owner = "client!bca",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field10391;
   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "I"
   )
   public static int field10370;
   @OriginalMember(
      owner = "client!bca",
      name = "h",
      descriptor = "I"
   )
   public static int field10371;
   @OriginalMember(
      owner = "client!bca",
      name = "n",
      descriptor = "I"
   )
   public static int field10373;
   @OriginalMember(
      owner = "client!bca",
      name = "o",
      descriptor = "I"
   )
   public static int field10374;
   @OriginalMember(
      owner = "client!bca",
      name = "g",
      descriptor = "I"
   )
   public static int field10377;
   @OriginalMember(
      owner = "client!bca",
      name = "p",
      descriptor = "I"
   )
   public static int field10380;
   @OriginalMember(
      owner = "client!bca",
      name = "j",
      descriptor = "I"
   )
   public static int field10383;
   @OriginalMember(
      owner = "client!bca",
      name = "i",
      descriptor = "I"
   )
   public static int field10384;
   @OriginalMember(
      owner = "client!bca",
      name = "x",
      descriptor = "I"
   )
   public static int field10385;
   @OriginalMember(
      owner = "client!bca",
      name = "w",
      descriptor = "I"
   )
   public static int field10386;
   @OriginalMember(
      owner = "client!bca",
      name = "t",
      descriptor = "I"
   )
   public static int field10387;
   @OriginalMember(
      owner = "client!bca",
      name = "e",
      descriptor = "Lat;"
   )
   public static class396 field10392;
   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "Lhg;"
   )
   public static class719 field10372;

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method5011(int arg0) {
      try {
         label35: {
            ++field10380;
            this.field10381.method4818((byte)116, this);
            if (this.field10378) {
               OpenGL.glTexParameteri(this.field10376, 10241, this.field10375 ? 9987 : 9729);
               OpenGL.glTexParameteri(this.field10376, 10240, 9729);
               if (client.field4530 == 0) {
                  break label35;
               }
            }

            OpenGL.glTexParameteri(this.field10376, 10241, !this.field10375 ? 9728 : 9984);
            OpenGL.glTexParameteri(this.field10376, 10240, 9728);
         }

         if (arg0 != 13636) {
            this.method5011(-103);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10393[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method5012(boolean arg0, int arg1) {
      try {
         ++field10373;
         if (arg1 != -10161) {
            this.method5019(-112);
         }

         if (this.field10378 != arg0) {
            this.field10378 = arg0;
            this.method5011(13636);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10393[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method5013(byte arg0) {
      try {
         if (arg0 != 70) {
            field10392 = null;
         }

         ++field10374;
         if (this.field10381.field9957) {
            int var2 = this.method5019(-42);
            this.field10381.method4818((byte)25, this);
            OpenGL.glGenerateMipmapEXT(this.field10376);
            this.field10375 = true;
            this.method5011(arg0 ^ 13570);
            this.method5018((byte)-28, var2);
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10393[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method5014(int arg0, boolean arg1) {
      try {
         if (arg0 == 6162) {
            if (this.field10375 != arg1) {
               int var3 = this.method5019(-44);
               this.field10375 = true;
               this.method5011(13636);
               this.method5018((byte)-28, var3);
            }

            ++field10377;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10393[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method5015(byte arg0) {
      try {
         if (~this.field10388 < -1) {
            this.field10381.method4844(-11495, this.method5019(-44), this.field10388);
            this.field10388 = 0;
         }

         ++field10384;
         int var2 = -8 / ((arg0 - -32) / 61);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10393[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5016(int arg0) {
      try {
         field10372 = null;
         field10392 = null;
         field10391 = null;
         field10382 = null;
         if (arg0 == 15589) {
            field10389 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10393[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(IIIZIBJLeaa;)V"
   )
   public static final void method5017(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, long arg6, class526 arg7) {
      try {
         class9.field136 = arg1;
         class660.field9569 = arg3;
         class627.field9106 = 1;
         ++field10371;
         if (arg5 == -115) {
            class357.field5407 = 10000;
            class560.field8372 = arg2;
            class660.field9563 = null;
            class668.field10055 = arg4;
            class552.field8185 = arg0;
            class547.field8118 = arg6;
            class67.field837 = arg7;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10393[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field10393[0] : field10393[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(BI)V"
   )
   private final void method5018(byte arg0, int arg1) {
      try {
         ++field10383;
         if (arg0 != -28) {
            method5017(-52, 79, -84, false, -121, (byte)100, -13L, (class526)null);
         }

         this.field10381.field9915 -= arg1;
         this.field10381.field9915 += this.method5019(-125);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10393[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "(I)I"
   )
   private final int method5019(int arg0) {
      try {
         ++field10385;
         int var2 = this.field10381.method4834(this.field10369, 1000) * this.field10379;
         if (arg0 >= -29) {
            return -63;
         } else {
            return this.field10375 ? var2 * 4 / 3 : var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10393[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field10387;
         this.method5015((byte)-97);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10393[14] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(ILjj;)Lmg;"
   )
   public static final class158 method5020(int arg0, class128 arg1) {
      try {
         ++field10370;
         class370 var2 = class65.method534(arg1, -15143);
         int var3 = arg1.method1038((byte)-100);
         int var4 = arg1.method1038((byte)-109);
         if (arg0 != 0) {
            return null;
         } else {
            int var5 = arg1.method1038((byte)-97);
            int var6 = arg1.method1038((byte)-109);
            int var7 = arg1.method1038((byte)-99);
            int var8 = arg1.method1038((byte)-94);
            return new class158(var2.field5647, var2.field5640, var2.field5636, var2.field5631, var2.field5645, var2.field5637, var2.field5644, var2.field5638, var2.field5639, var3, var4, var5, var6, var7, var8);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10393[4] + arg0 + ',' + (arg1 != null ? field10393[0] : field10393[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method5021(byte arg0) {
      try {
         ++field10386;
         return arg0 != 42 ? 64 : this.field10388;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10393[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "<init>",
      descriptor = "(Lck;IIIZ)V"
   )
   public class689(class667 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         this.field10375 = arg4;
         this.field10376 = arg1;
         this.field10379 = arg3;
         this.field10369 = arg2;
         this.field10381 = arg0;
         OpenGL.glGenTextures(1, class237.field3000, 0);
         this.field10388 = class237.field3000[0];
         this.method5018((byte)-28, 0);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10393[1] + (arg0 != null ? field10393[0] : field10393[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method117(byte arg0);

   static {
      int var0 = 0;

      for(int var1 = 0; ~var1 > -121; ++var1) {
         int var5 = var1 + 1;
         int var6 = (int)(Math.pow(2.0D, (double)var5 / 7.0D) * 300.0D + (double)var5);
         var0 += var6;
         field10382[var1] = var0 / 4;
      }

      field10390 = true;
      field10389 = new int[16384];
      field10391 = new int[16384];
      double var2 = 3.834951969714103E-4D;

      for(int var4 = 0; ~var4 > -16385; ++var4) {
         field10389[var4] = (int)(Math.sin((double)var4 * var2) * 16384.0D);
         field10391[var4] = (int)(Math.cos((double)var4 * var2) * 16384.0D);
      }

   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5022(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5023(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
