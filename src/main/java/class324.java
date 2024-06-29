import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class324 extends class15 implements class219 {
   @OriginalMember(
      owner = "client!lt",
      name = "t",
      descriptor = "I"
   )
   private int field4431 = -1;
   @OriginalMember(
      owner = "client!lt",
      name = "E",
      descriptor = "I"
   )
   private int field4439 = -1;
   @OriginalMember(
      owner = "client!lt",
      name = "F",
      descriptor = "I"
   )
   public int field4436;
   @OriginalMember(
      owner = "client!lt",
      name = "C",
      descriptor = "I"
   )
   private int field4434;
   @OriginalMember(
      owner = "client!lt",
      name = "u",
      descriptor = "I"
   )
   public int field4429;
   @OriginalMember(
      owner = "client!lt",
      name = "G",
      descriptor = "Liu;"
   )
   private class530 field4440;
   @OriginalMember(
      owner = "client!lt",
      name = "v",
      descriptor = "I"
   )
   private int field4442;
   @OriginalMember(
      owner = "client!lt",
      name = "x",
      descriptor = "I"
   )
   private int field4430;
   @OriginalMember(
      owner = "client!lt",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4445 = new String[]{method2547(method2546("`3Z\\u")), method2547(method2546("`3Z%4b.\u0000'u")), method2547(method2546("b2\u0018u")), method2547(method2546("wiZ7 ")), method2547(method2546("`3ZXu")), method2547(method2546("D.\u0010}8bj")), method2547(method2546("`3ZZu")), method2547(method2546("`3Z\u007f4b&\u0018p'io")), method2547(method2546("`3Z[u")), method2547(method2546("`3Z]u")), method2547(method2546("`3Z_u"))};
   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "[Lko;"
   )
   public static class327[] field4438 = new class327[4];
   @OriginalMember(
      owner = "client!lt",
      name = "y",
      descriptor = "I"
   )
   public static int field4432;
   @OriginalMember(
      owner = "client!lt",
      name = "A",
      descriptor = "I"
   )
   public static int field4433;
   @OriginalMember(
      owner = "client!lt",
      name = "D",
      descriptor = "I"
   )
   public static int field4435;
   @OriginalMember(
      owner = "client!lt",
      name = "w",
      descriptor = "I"
   )
   public static int field4437;
   @OriginalMember(
      owner = "client!lt",
      name = "B",
      descriptor = "I"
   )
   public static int field4441;
   @OriginalMember(
      owner = "client!lt",
      name = "s",
      descriptor = "I"
   )
   public static int field4443;
   @OriginalMember(
      owner = "client!lt",
      name = "H",
      descriptor = "I"
   )
   public static int field4444;

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2541(int arg0, int arg1, int arg2) {
      try {
         OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field4442);
         ++field4444;
         this.field4439 = arg0;
         if (arg1 < 19) {
            this.field4436 = -45;
         }

         this.field4431 = arg2;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4445[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method2542(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg0 != 4095) {
            return 94;
         } else {
            int var6 = arg2 & 3;
            ++field4435;
            if (var6 == 0) {
               return arg3;
            } else if (~var6 == -2) {
               return arg1;
            } else {
               return ~var6 == -3 ? -arg3 + 4095 : -arg1 + 4095;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4445[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method970(byte arg0) {
      try {
         ++field4432;
         if (arg0 < -12) {
            OpenGL.glFramebufferRenderbufferEXT(this.field4439, this.field4431, 36161, 0);
            this.field4431 = -1;
            this.field4439 = -1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4445[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method2543(int arg0) {
      try {
         if (arg0 == 1) {
            field4438 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4445[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field4433;
         this.method2545(120);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4445[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IILoca;)Ljava/lang/String;"
   )
   public static final String method2544(int arg0, int arg1, class642 arg2) {
      try {
         int var3 = 35 % ((arg1 - -54) / 40);
         ++field4437;
         if (!client.method999(arg2).method5276(arg0, (byte)107) && arg2.field9612 == null) {
            return null;
         } else if (arg2.field9551 != null && arg0 < arg2.field9551.length && arg2.field9551[arg0] != null && arg2.field9551[arg0].trim().length() != 0) {
            return arg2.field9551[arg0];
         } else {
            return class497.field6955 ? field4445[5] + arg0 : null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4445[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4445[3] : field4445[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2545(int arg0) {
      try {
         if (arg0 > 106) {
            ++field4441;
            if (this.field4442 > 0) {
               this.field4440.method3980((byte)5, this.field4442, this.field4430);
               this.field4442 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4445[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "<init>",
      descriptor = "(Liu;III)V"
   )
   public class324(class530 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field4436 = arg2;
         this.field4434 = arg1;
         this.field4429 = arg3;
         this.field4440 = arg0;
         OpenGL.glGenRenderbuffersEXT(1, class332.field4585, 0);
         this.field4442 = class332.field4585[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field4442);
         OpenGL.glRenderbufferStorageEXT(36161, this.field4434, this.field4436, this.field4429);
         this.field4430 = this.field4429 * this.field4436 * this.field4440.method3975(this.field4434, -7184);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4445[1] + (arg0 != null ? field4445[3] : field4445[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "<init>",
      descriptor = "(Liu;IIII)V"
   )
   public class324(class530 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field4429 = arg3;
         this.field4440 = arg0;
         this.field4434 = arg1;
         this.field4436 = arg2;
         OpenGL.glGenRenderbuffersEXT(1, class332.field4585, 0);
         this.field4442 = class332.field4585[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field4442);
         OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field4434, this.field4436, this.field4429);
         this.field4430 = this.field4429 * this.field4436 * this.field4440.method3975(this.field4434, -7184);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4445[1] + (arg0 != null ? field4445[3] : field4445[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2546(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2547(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
