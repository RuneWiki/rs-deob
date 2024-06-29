import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public abstract class class707 implements class714 {
   @OriginalMember(
      owner = "client!ufa",
      name = "i",
      descriptor = "Z"
   )
   private boolean field10274 = false;
   @OriginalMember(
      owner = "client!ufa",
      name = "h",
      descriptor = "Z"
   )
   private boolean field10275;
   @OriginalMember(
      owner = "client!ufa",
      name = "n",
      descriptor = "I"
   )
   public int field10277;
   @OriginalMember(
      owner = "client!ufa",
      name = "c",
      descriptor = "I"
   )
   private int field10276;
   @OriginalMember(
      owner = "client!ufa",
      name = "g",
      descriptor = "I"
   )
   public int field10270;
   @OriginalMember(
      owner = "client!ufa",
      name = "j",
      descriptor = "Lrk;"
   )
   public class35 field10269;
   @OriginalMember(
      owner = "client!ufa",
      name = "d",
      descriptor = "I"
   )
   public int field10271;
   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10283 = new String[]{method5136(method5135("i\u001b\u000fI)4")), method5136(method5135("i\u001b\u000fI(4")), method5136(method5135("i\u001b\u000fI,4")), method5136(method5135("i\u001b\u000fI*4")), method5136(method5135("i\u001b\u000fI&4")), method5136(method5135("i\u001b\u000fI+4")), method5136(method5135("i\u001b\u000fI%4")), method5136(method5135("i\u001b\u000fI#4")), method5136(method5135("i\u001b\u000fI\u0006u\u0013\u000f\u000b\tf\u0018F")), method5136(method5135("i\u001b\u000fI$4")), method5136(method5135("i\u001b\u000fI'4")), method5136(method5135("r\b\u0002\u000b")), method5136(method5135("gS@I\u001d")), method5136(method5135("i\u001b\u000fI\\u\u0013\u0007\u0013^4"))};
   @OriginalMember(
      owner = "client!ufa",
      name = "q",
      descriptor = "Luw;"
   )
   public static class435 field10266 = new class435(69, -1);
   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "I"
   )
   public static int field10267;
   @OriginalMember(
      owner = "client!ufa",
      name = "e",
      descriptor = "I"
   )
   public static int field10268;
   @OriginalMember(
      owner = "client!ufa",
      name = "f",
      descriptor = "I"
   )
   public static int field10272;
   @OriginalMember(
      owner = "client!ufa",
      name = "m",
      descriptor = "I"
   )
   public static int field10273;
   @OriginalMember(
      owner = "client!ufa",
      name = "k",
      descriptor = "I"
   )
   public static int field10278;
   @OriginalMember(
      owner = "client!ufa",
      name = "o",
      descriptor = "I"
   )
   public static int field10279;
   @OriginalMember(
      owner = "client!ufa",
      name = "b",
      descriptor = "I"
   )
   public static int field10280;
   @OriginalMember(
      owner = "client!ufa",
      name = "p",
      descriptor = "I"
   )
   public static int field10281;
   @OriginalMember(
      owner = "client!ufa",
      name = "l",
      descriptor = "I"
   )
   public static int field10282;

   @OriginalMember(
      owner = "client!ufa",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5125(int arg0) {
      try {
         if (arg0 <= 91) {
            this.field10269 = null;
         }

         ++field10278;
         return this.field10271;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10283[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5126(int arg0) {
      try {
         if (arg0 != 10240) {
            this.method5126(-62);
         }

         if (~this.field10271 < -1) {
            this.field10269.method306(255, this.method5134(true), this.field10271);
            this.field10271 = 0;
         }

         ++field10272;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10283[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5127(byte arg0) {
      try {
         if (arg0 <= 98) {
            field10266 = null;
         }

         field10266 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10283[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field10281;
         this.method5126(10240);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10283[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(IB)V"
   )
   private final void method5128(int arg0, byte arg1) {
      try {
         ++field10273;
         this.field10269.field744 -= arg0;
         this.field10269.field744 += this.method5134(true);
         int var3 = -11 % ((-23 - arg1) / 49);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10283[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method5129(long arg0, long arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10283[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method5130(int arg0) {
      try {
         label35: {
            ++field10267;
            this.field10269.method252(this, (byte)-17);
            if (!this.field10274) {
               OpenGL.glTexParameteri(this.field10277, 10241, this.field10275 ? 9984 : 9728);
               OpenGL.glTexParameteri(this.field10277, 10240, 9728);
               if (!client.field4564) {
                  break label35;
               }
            }

            OpenGL.glTexParameteri(this.field10277, 10241, this.field10275 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field10277, 10240, 9729);
         }

         if (arg0 != 7408) {
            this.method5130(-48);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10283[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method5131(boolean arg0, int arg1) {
      try {
         ++field10282;
         if (!arg0 != !this.field10275) {
            int var3 = this.method5134(true);
            this.field10275 = true;
            this.method5130(7408);
            this.method5128(var3, (byte)-81);
         }

         if (arg1 <= 47) {
            this.field10274 = false;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10283[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method5132(boolean arg0, int arg1) {
      try {
         ++field10279;
         if (arg0 == !this.field10274) {
            this.field10274 = arg0;
            this.method5130(7408);
         }

         if (arg1 != 0) {
            this.method5125(-18);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10283[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method5133(byte arg0) {
      try {
         ++field10268;
         if (this.field10269.field771) {
            int var2 = this.method5134(true);
            this.field10269.method252(this, (byte)-58);
            OpenGL.glGenerateMipmapEXT(this.field10277);
            this.field10275 = true;
            this.method5130(7408);
            this.method5128(var2, (byte)-120);
            return true;
         } else {
            if (arg0 > -79) {
               this.method5132(false, -50);
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10283[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(Z)I"
   )
   private final int method5134(boolean arg0) {
      try {
         ++field10280;
         if (!arg0) {
            this.field10269 = null;
         }

         int var2 = this.field10269.method373(this.field10270, 34023) * this.field10276;
         return this.field10275 ? var2 * 4 / 3 : var2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10283[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "<init>",
      descriptor = "(Lrk;IIIZ)V"
   )
   public class707(class35 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         this.field10275 = arg4;
         this.field10277 = arg1;
         this.field10276 = arg3;
         this.field10270 = arg2;
         this.field10269 = arg0;
         OpenGL.glGenTextures(1, class198.field2983, 0);
         this.field10271 = class198.field2983[0];
         this.method5128(0, (byte)74);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10283[13] + (arg0 != null ? field10283[12] : field10283[11]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method96(int arg0);

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5135(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5136(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
