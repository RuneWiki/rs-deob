import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class90 extends class38 implements class706 {
   @OriginalMember(
      owner = "client!kca",
      name = "A",
      descriptor = "I"
   )
   private int field1482;
   @OriginalMember(
      owner = "client!kca",
      name = "G",
      descriptor = "I"
   )
   private int field1469;
   @OriginalMember(
      owner = "client!kca",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1485 = new String[]{method891(method890(";t*^Q")), method891(method890("+9e^\u0010)4m\u0004\u0012h")), method891(method890("./h\u001c")), method891(method890("+9e^`h")), method891(method890("+9e^nh")), method891(method890("+9e^hh")), method891(method890("+9e^ah")), method891(method890("+9e^jh")), method891(method890("+9e^{h")), method891(method890("+9e^fh")), method891(method890("+9e^dh")), method891(method890("+9e^kh")), method891(method890("+9e^gh")), method891(method890("+9e^ih")), method891(method890("+9e^eh"))};
   @OriginalMember(
      owner = "client!kca",
      name = "x",
      descriptor = "I"
   )
   public static int field1470;
   @OriginalMember(
      owner = "client!kca",
      name = "K",
      descriptor = "I"
   )
   public static int field1471;
   @OriginalMember(
      owner = "client!kca",
      name = "L",
      descriptor = "I"
   )
   public static int field1472;
   @OriginalMember(
      owner = "client!kca",
      name = "D",
      descriptor = "I"
   )
   public static int field1474;
   @OriginalMember(
      owner = "client!kca",
      name = "F",
      descriptor = "I"
   )
   public static int field1475;
   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "I"
   )
   public static int field1476;
   @OriginalMember(
      owner = "client!kca",
      name = "E",
      descriptor = "I"
   )
   public static int field1479;
   @OriginalMember(
      owner = "client!kca",
      name = "H",
      descriptor = "I"
   )
   public static int field1480;
   @OriginalMember(
      owner = "client!kca",
      name = "I",
      descriptor = "I"
   )
   public static int field1481;
   @OriginalMember(
      owner = "client!kca",
      name = "C",
      descriptor = "I"
   )
   public static int field1483;
   @OriginalMember(
      owner = "client!kca",
      name = "y",
      descriptor = "I"
   )
   public static int field1484;
   @OriginalMember(
      owner = "client!kca",
      name = "J",
      descriptor = "Lgha;"
   )
   public static class363 field1478;
   @OriginalMember(
      owner = "client!kca",
      name = "B",
      descriptor = "[Ltd;"
   )
   public static class476[] field1477;
   @OriginalMember(
      owner = "client!kca",
      name = "w",
      descriptor = "[[[Luo;"
   )
   public static class600[][][] field1473;

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(Z)Z",
      line = 4
   )
   public final boolean method878(boolean arg0) {
      try {
         ++field1481;
         if (!arg0) {
            this.method880(70, 0.6084501F);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1485[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(IIIIILtv;[FBI)V",
      line = 15
   )
   public final void method879(int arg0, int arg1, int arg2, int arg3, int arg4, class584 arg5, float[] arg6, byte arg7, int arg8) {
      try {
         ++field1470;
         if (arg7 < -89) {
            super.field922.method2806(false, this);
            OpenGL.glPixelStorei(3314, arg2);
            OpenGL.glTexSubImage2Df(super.field924, 0, arg1, arg4, arg0, arg8, class583.method4325(arg5, 6406), 5121, arg6, arg3);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field1485[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1485[0] : field1485[2]) + ',' + (arg6 != null ? field1485[0] : field1485[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "<init>",
      descriptor = "(Lbba;IIZ[III)V",
      line = 31
   )
   public class90(class124 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, 3553, class296.field4146, class209.field3106, arg1 * arg2, arg3);

      try {
         this.field1482 = arg2;
         this.field1469 = arg1;
         super.field922.method2806(false, this);
         if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method468((byte)127, arg2, arg4, super.field924, arg1);
         } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field924, 0, 6408, this.field1469, this.field1482, 0, 32993, super.field922.field2089, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1485[1] + (arg0 != null ? field1485[0] : field1485[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1485[0] : field1485[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "<init>",
      descriptor = "(Lbba;Ltv;IIZ[BII)V",
      line = 54
   )
   public class90(class124 arg0, class584 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class209.field3106, arg2 * arg3, arg4);

      try {
         label53: {
            this.field1469 = arg2;
            this.field1482 = arg3;
            super.field922.method2806(false, this);
            OpenGL.glPixelStorei(3317, 1);
            if (!arg4 || ~arg7 != -1 || ~arg6 != -1) {
               OpenGL.glPixelStorei(3314, arg7);
               OpenGL.glTexImage2Dub(super.field924, 0, this.method466((byte)118), arg2, arg3, 0, class583.method4325(super.field905, 6406), 5121, arg5, arg6);
               OpenGL.glPixelStorei(3314, 0);
               if (!client.field4564) {
                  break label53;
               }
            }

            this.method470(arg3, super.field924, arg2, arg5, 123);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field1485[1] + (arg0 != null ? field1485[0] : field1485[2]) + ',' + (arg1 != null ? field1485[0] : field1485[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1485[0] : field1485[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(IF)F",
      line = 81
   )
   public final float method880(int arg0, float arg1) {
      try {
         ++field1480;
         if (arg0 != -10745) {
            this.method880(121, 0.5586796F);
         }

         return arg1 / (float)this.field1469;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1485[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(FZ)F",
      line = 92
   )
   public final float method881(float arg0, boolean arg1) {
      try {
         ++field1479;
         return arg1 ? 1.3181041F : arg0 / (float)this.field1482;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1485[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "f",
      descriptor = "(B)V",
      line = 103
   )
   public static void method882(byte arg0) {
      try {
         field1473 = null;
         field1478 = null;
         field1477 = null;
         int var1 = -120 / ((arg0 - 23) / 59);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1485[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "<init>",
      descriptor = "(Lbba;Ltv;Lrfa;II)V",
      line = 114
   )
   public class90(class124 arg0, class584 arg1, class209 arg2, int arg3, int arg4) {
      super(arg0, 3553, arg1, arg2, arg3 * arg4, false);

      try {
         this.field1482 = arg4;
         this.field1469 = arg3;
         super.field922.method2806(false, this);
         OpenGL.glTexImage2Dub(super.field924, 0, this.method466((byte)118), arg3, arg4, 0, class583.method4325(super.field905, 6406), class458.method3444((byte)-108, super.field913), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1485[1] + (arg0 != null ? field1485[0] : field1485[2]) + ',' + (arg1 != null ? field1485[0] : field1485[2]) + ',' + (arg2 != null ? field1485[0] : field1485[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(III[IBII)V",
      line = 125
   )
   public final void method883(int arg0, int arg1, int arg2, int[] arg3, byte arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      RuntimeException var10000;
      label38: {
         int[] var9;
         int var10;
         boolean var10001;
         try {
            ++field1483;
            var9 = new int[this.field1482 * this.field1469];
            super.field922.method2806(false, this);
            OpenGL.glGetTexImagei(super.field924, 0, 32993, 5121, var9, 0);
            var10 = 0;
            if (arg4 > -100) {
               return;
            }
         } catch (RuntimeException var14) {
            var10000 = var14;
            var10001 = false;
            break label38;
         }

         while(true) {
            label33: {
               try {
                  if (var10 < arg2) {
                     class365.method2855(var9, (arg1 + arg2 - (1 - -var10)) * this.field1469, arg3, arg6 * var10 + arg0, arg6);
                     break label33;
                  }
               } catch (RuntimeException var13) {
                  var10000 = var13;
                  var10001 = false;
                  break;
               }

               if (!var8) {
                  return;
               }
            }

            try {
               ++var10;
            } catch (RuntimeException var12) {
               var10000 = var12;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var11 = var10000;
      throw class608.method4462(var11, field1485[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1485[0] : field1485[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(ZIZ)V",
      line = 148
   )
   public final void method884(boolean arg0, int arg1, boolean arg2) {
      try {
         super.field922.method2806(false, this);
         ++field1471;
         OpenGL.glTexParameteri(super.field924, 10242, arg2 ? 10497 : 33071);
         int var4 = 57 / ((30 - arg1) / 37);
         OpenGL.glTexParameteri(super.field924, 10243, !arg0 ? 33071 : 10497);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1485[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(ILtv;IIIB[BII)V",
      line = 160
   )
   public final void method885(int arg0, class584 arg1, int arg2, int arg3, int arg4, byte arg5, byte[] arg6, int arg7, int arg8) {
      try {
         ++field1472;
         super.field922.method2806(false, this);
         OpenGL.glPixelStorei(3317, 1);
         if (arg5 <= 9) {
            this.method885(-38, (class584)null, -125, -76, -42, (byte)-107, (byte[])null, 85, -58);
         }

         OpenGL.glPixelStorei(3314, arg0);
         OpenGL.glTexSubImage2Dub(super.field924, 0, arg7, arg8, arg2, arg4, class583.method4325(arg1, 6406), 5121, arg6, arg3);
         OpenGL.glPixelStorei(3314, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field1485[6] + arg0 + ',' + (arg1 != null ? field1485[0] : field1485[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1485[0] : field1485[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "<init>",
      descriptor = "(Lbba;Ltv;IIZ[FII)V",
      line = 176
   )
   public class90(class124 arg0, class584 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class209.field3110, arg2 * arg3, arg4);

      try {
         this.field1482 = arg3;
         this.field1469 = arg2;
         super.field922.method2806(false, this);
         if (!arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method469(arg2, super.field924, 30805, arg3, arg5);
         } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field924, 0, this.method466((byte)118), arg2, arg3, 0, class583.method4325(super.field905, 6406), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field1485[1] + (arg0 != null ? field1485[0] : field1485[2]) + ',' + (arg1 != null ? field1485[0] : field1485[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1485[0] : field1485[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "b",
      descriptor = "(I)I",
      line = 195
   )
   public final int method886(int arg0) {
      try {
         ++field1484;
         if (arg0 != -19759) {
            this.method889(55);
         }

         return this.field1482;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1485[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(I[IIIIIZI)V",
      line = 209
   )
   public final void method887(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
      try {
         super.field922.method2806(arg6, this);
         ++field1476;
         OpenGL.glPixelStorei(3314, arg2);
         OpenGL.glTexSubImage2Di(super.field924, 0, arg3, arg0, arg7, arg4, 32993, super.field922.field2089, arg1, arg5);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field1485[5] + arg0 + ',' + (arg1 != null ? field1485[0] : field1485[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(III)Z",
      line = 220
   )
   public static final boolean method888(int arg0, int arg1, int arg2) {
      try {
         ++field1474;
         int var3 = -86 % ((-36 - arg1) / 39);
         return (arg0 & 540800) != 0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1485[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(I)I",
      line = 230
   )
   public final int method889(int arg0) {
      try {
         ++field1475;
         if (arg0 != 28570) {
            this.method884(false, 90, false);
         }

         return this.field1469;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1485[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method890(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method891(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
