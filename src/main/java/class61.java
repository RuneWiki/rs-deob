import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class61 extends class479 implements class95 {
   @OriginalMember(
      owner = "client!gda",
      name = "H",
      descriptor = "I"
   )
   private int field758;
   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "I"
   )
   private int field764;
   @OriginalMember(
      owner = "client!gda",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field768 = new String[]{method512(method511("\u000e\u001aI\u001a")), method512(method511("\u001bA\u000bXk")), method512(method511("\u0007\u000bDX*\t\u0001L\u0002(H")), method512(method511("\u0007\u000bDXRH")), method512(method511("\u0007\u000bDXYH")), method512(method511("\u0007\u000bDXXH")), method512(method511("\u0007\u000bDXUH")), method512(method511("\u0007\u000bDXTH")), method512(method511("\u0007\u000bDXSH")), method512(method511("\u0007\u000bDXWH")), method512(method511("\u0007\u000bDX^H")), method512(method511("\u0007\u000bDX_H")), method512(method511("\u0007\u000bDX[H")), method512(method511("\u0007\u000bDXPH")), method512(method511("\u0007\u000bDX\\H")), method512(method511("\u0007\u000bDXQH"))};
   @OriginalMember(
      owner = "client!gda",
      name = "F",
      descriptor = "[F"
   )
   public static float[] field754 = new float[4];
   @OriginalMember(
      owner = "client!gda",
      name = "D",
      descriptor = "I"
   )
   public static int field759 = 0;
   @OriginalMember(
      owner = "client!gda",
      name = "y",
      descriptor = "I"
   )
   public static int field752;
   @OriginalMember(
      owner = "client!gda",
      name = "C",
      descriptor = "I"
   )
   public static int field753;
   @OriginalMember(
      owner = "client!gda",
      name = "A",
      descriptor = "I"
   )
   public static int field755;
   @OriginalMember(
      owner = "client!gda",
      name = "x",
      descriptor = "I"
   )
   public static int field756;
   @OriginalMember(
      owner = "client!gda",
      name = "G",
      descriptor = "I"
   )
   public static int field757;
   @OriginalMember(
      owner = "client!gda",
      name = "M",
      descriptor = "I"
   )
   public static int field760;
   @OriginalMember(
      owner = "client!gda",
      name = "L",
      descriptor = "I"
   )
   public static int field761;
   @OriginalMember(
      owner = "client!gda",
      name = "E",
      descriptor = "I"
   )
   public static int field762;
   @OriginalMember(
      owner = "client!gda",
      name = "K",
      descriptor = "I"
   )
   public static int field763;
   @OriginalMember(
      owner = "client!gda",
      name = "J",
      descriptor = "I"
   )
   public static int field765;
   @OriginalMember(
      owner = "client!gda",
      name = "I",
      descriptor = "I"
   )
   public static int field766;
   @OriginalMember(
      owner = "client!gda",
      name = "w",
      descriptor = "I"
   )
   public static int field767;

   @OriginalMember(
      owner = "client!gda",
      name = "<init>",
      descriptor = "(Leh;Lii;Lef;II)V"
   )
   public class61(class379 arg0, class579 arg1, class513 arg2, int arg3, int arg4) {
      super(arg0, 3553, arg1, arg2, arg3 * arg4, false);

      try {
         this.field758 = arg4;
         this.field764 = arg3;
         super.field7119.method2578(this, true);
         OpenGL.glTexImage2Dub(super.field7122, 0, this.method3554(34840), arg3, arg4, 0, class420.method3207(super.field7112, 17835), class577.method4260(super.field7110, (byte)113), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field768[2] + (arg0 != null ? field768[1] : field768[0]) + ',' + (arg1 != null ? field768[1] : field768[0]) + ',' + (arg2 != null ? field768[1] : field768[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "([BILii;IIIIII)V"
   )
   public final void method498(byte[] arg0, int arg1, class579 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         super.field7119.method2578(this, true);
         ++field760;
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg4);
         OpenGL.glTexSubImage2Dub(super.field7122, 0, arg8, arg5, arg6, arg3, class420.method3207(arg2, arg1 ^ 18083), 5121, arg0, arg7);
         OpenGL.glPixelStorei(3314, 0);
         if (arg1 != 776) {
            field754 = null;
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field768[8] + (arg0 != null ? field768[1] : field768[0]) + ',' + arg1 + ',' + (arg2 != null ? field768[1] : field768[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method499(int arg0) {
      try {
         if (arg0 != 27891) {
            this.field764 = 104;
         }

         ++field767;
         return true;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field768[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method500(int arg0) {
      try {
         ++field766;
         if (arg0 != -32545) {
            field759 = 67;
         }

         return this.field758;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field768[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(IIIIB)Z"
   )
   public static final boolean method501(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         if (arg4 != 73) {
            method501(-76, 108, -45, -70, (byte)-5);
         }

         ++field762;
         if (~(class65.field797[0][arg1][arg2] & 2) != -1) {
            return true;
         } else if ((class65.field797[arg0][arg1][arg2] & 16) != 0) {
            return false;
         } else {
            return ~arg3 == ~class393.method3002(arg0, arg2, arg1, (byte)-58);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field768[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public final void method502(int arg0, boolean arg1, boolean arg2) {
      try {
         super.field7119.method2578(this, true);
         if (arg0 >= 90) {
            ++field761;
            OpenGL.glTexParameteri(super.field7122, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field7122, 10243, !arg2 ? 33071 : 10497);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field768[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(FI)F"
   )
   public final float method503(float arg0, int arg1) {
      try {
         if (arg1 != 25525) {
            method509(3, 20);
         }

         ++field763;
         return arg0 / (float)this.field758;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field768[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "<init>",
      descriptor = "(Leh;Lii;IIZ[FII)V"
   )
   public class61(class379 arg0, class579 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class513.field7523, arg2 * arg3, arg4);

      try {
         this.field758 = arg3;
         this.field764 = arg2;
         super.field7119.method2578(this, true);
         if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method3553(arg3, arg5, super.field7122, (byte)30, arg2);
         } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field7122, 0, this.method3554(34840), arg2, arg3, 0, class420.method3207(super.field7112, 17835), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field768[2] + (arg0 != null ? field768[1] : field768[0]) + ',' + (arg1 != null ? field768[1] : field768[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field768[1] : field768[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "b",
      descriptor = "(FI)F"
   )
   public final float method504(float arg0, int arg1) {
      try {
         ++field755;
         return arg1 != 2029 ? 0.042824544F : arg0 / (float)this.field764;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field768[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "<init>",
      descriptor = "(Leh;IIZ[III)V"
   )
   public class61(class379 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, 3553, class75.field963, class513.field7519, arg1 * arg2, arg3);

      try {
         this.field764 = arg1;
         this.field758 = arg2;
         super.field7119.method2578(this, true);
         if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method3559(arg4, arg2, super.field7122, 0, arg1);
         } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field7122, 0, 6408, this.field764, this.field758, 0, 32993, super.field7119.field5832, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field768[2] + (arg0 != null ? field768[1] : field768[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field768[1] : field768[0]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method505(int arg0) {
      try {
         ++field756;
         if (arg0 != 9987) {
            method501(13, -53, 93, 38, (byte)-64);
         }

         return this.field764;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field768[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(IIIIIILii;[FI)V"
   )
   public final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class579 arg6, float[] arg7, int arg8) {
      try {
         super.field7119.method2578(this, true);
         ++field753;
         OpenGL.glPixelStorei(arg4, arg1);
         OpenGL.glTexSubImage2Df(super.field7122, 0, arg3, arg5, arg0, arg2, class420.method3207(arg6, arg4 ^ 18777), 5121, arg7, arg8);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field768[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field768[1] : field768[0]) + ',' + (arg7 != null ? field768[1] : field768[0]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "<init>",
      descriptor = "(Leh;Lii;IIZ[BII)V"
   )
   public class61(class379 arg0, class579 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class513.field7519, arg2 * arg3, arg4);

      try {
         label39: {
            this.field758 = arg3;
            this.field764 = arg2;
            super.field7119.method2578(this, true);
            OpenGL.glPixelStorei(3317, 1);
            if (arg4 && arg7 == 0 && ~arg6 == -1) {
               this.method3561(arg5, arg2, arg3, super.field7122, (byte)-128);
               if (client.field4530 == 0) {
                  break label39;
               }
            }

            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field7122, 0, this.method3554(34840), arg2, arg3, 0, class420.method3207(super.field7112, 17835), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field768[2] + (arg0 != null ? field768[1] : field768[0]) + ',' + (arg1 != null ? field768[1] : field768[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field768[1] : field768[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method507(byte arg0) {
      try {
         if (arg0 != -117) {
            method501(-59, -34, -93, -109, (byte)69);
         }

         field754 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field768[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(III[IIIII)V"
   )
   public final void method508(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field752;
         super.field7119.method2578(this, true);
         OpenGL.glPixelStorei(3314, arg7);
         OpenGL.glTexSubImage2Di(super.field7122, 0, arg6, arg5, arg2, arg0, 32993, super.field7119.field5832, arg3, arg1);
         if (arg4 > -106) {
            this.method502(8, false, false);
         }

         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field768[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field768[1] : field768[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method509(int arg0, int arg1) {
      try {
         class124.field1515 = arg0;
         ++field765;
         if (arg1 != 3553) {
            method509(117, -82);
         }

         class748 var2 = class134.field1713;
         synchronized(class134.field1713) {
            class134.field1713.method5451(104);
         }

         class748 var3 = class402.field6170;
         synchronized(class402.field6170) {
            class402.field6170.method5451(arg1 ^ -3476);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field768[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(III[IIII)V"
   )
   public final void method510(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
      int var8 = client.field4530;

      try {
         ++field757;
         int[] var9 = new int[this.field764 * this.field758];
         super.field7119.method2578(this, true);
         OpenGL.glGetTexImagei(super.field7122, 0, 32993, 5121, var9, 0);
         int var10 = 0;
         if (var8 != 0) {
            class195.method1495(var9, (-1 - -arg0 + (arg5 - var10)) * this.field764, arg3, arg6 - -(arg2 * var10), arg2);
            ++var10;
         }

         while(true) {
            while(~var10 > ~arg0) {
               class195.method1495(var9, (-1 - -arg0 + (arg5 - var10)) * this.field764, arg3, arg6 - -(arg2 * var10), arg2);
               ++var10;
            }

            if (var8 == 0) {
               if (arg4 != -18779) {
                  field759 = -106;
                  return;
               }

               return;
            }

            ++var10;
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field768[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field768[1] : field768[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method511(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method512(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
