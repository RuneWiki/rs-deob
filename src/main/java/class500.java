import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class500 extends class529 {
   @OriginalMember(
      owner = "client!gk",
      name = "e",
      descriptor = "Lae;"
   )
   private class262 field7430;
   @OriginalMember(
      owner = "client!gk",
      name = "d",
      descriptor = "Lds;"
   )
   private class16 field7417;
   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7432 = new String[]{method3738(method3737("4\u001bG27")), method3738(method3737("(^G^b")), method3738(method3737("=\u0005\u0005\u001c")), method3738(method3737("4\u001bG77")), method3738(method3737("4\u001bG67")), method3738(method3737("4\u001bG97")), method3738(method3737("4\u001bGLv=\u0019\u001dN7")), method3738(method3737("4\u001bG:7")), method3738(method3737("4\u001bG17")), method3738(method3737("4\u001bG47")), method3738(method3737("4\u001bG=7")), method3738(method3737("4\u001bG57")), method3738(method3737("4\u001bG37")), method3738(method3737("4\u001bG87"))};
   @OriginalMember(
      owner = "client!gk",
      name = "k",
      descriptor = "[F"
   )
   public static float[] field7423 = new float[16384];
   @OriginalMember(
      owner = "client!gk",
      name = "q",
      descriptor = "[F"
   )
   public static float[] field7425 = new float[16384];
   @OriginalMember(
      owner = "client!gk",
      name = "h",
      descriptor = "F"
   )
   public static float field7431;
   @OriginalMember(
      owner = "client!gk",
      name = "r",
      descriptor = "I"
   )
   public static int field7416;
   @OriginalMember(
      owner = "client!gk",
      name = "m",
      descriptor = "I"
   )
   public static int field7418;
   @OriginalMember(
      owner = "client!gk",
      name = "l",
      descriptor = "I"
   )
   public static int field7420;
   @OriginalMember(
      owner = "client!gk",
      name = "i",
      descriptor = "I"
   )
   public static int field7421;
   @OriginalMember(
      owner = "client!gk",
      name = "p",
      descriptor = "I"
   )
   public static int field7422;
   @OriginalMember(
      owner = "client!gk",
      name = "o",
      descriptor = "I"
   )
   public static int field7424;
   @OriginalMember(
      owner = "client!gk",
      name = "s",
      descriptor = "I"
   )
   public static int field7426;
   @OriginalMember(
      owner = "client!gk",
      name = "g",
      descriptor = "I"
   )
   public static int field7427;
   @OriginalMember(
      owner = "client!gk",
      name = "n",
      descriptor = "I"
   )
   public static int field7428;
   @OriginalMember(
      owner = "client!gk",
      name = "f",
      descriptor = "I"
   )
   public static int field7429;
   @OriginalMember(
      owner = "client!gk",
      name = "j",
      descriptor = "Lll;"
   )
   private class383 field7419;

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(ILbca;I)V"
   )
   public final void method870(int arg0, class689 arg1, int arg2) {
      try {
         ++field7427;
         if (arg2 != -1) {
            method3732(-12, -58);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7432[0] + arg0 + ',' + (arg1 != null ? field7432[1] : field7432[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method874(int arg0) {
      try {
         if (arg0 != 1) {
            field7425 = null;
         }

         ++field7422;
         this.field7419.method2948('\u0001', (byte)-69);
         if (~super.field7700.field10031 < -1) {
            super.field7700.method4828(1, (byte)66);
            super.field7700.method4818((byte)-121, (class689)null);
            super.field7700.method4836(0.0F, 1.0F, (byte)-106);
            super.field7700.method4828(0, (byte)66);
         }

         super.field7700.method4849(8448, 34161, 8448);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7432[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method873(int arg0) {
      try {
         ++field7424;
         return arg0 == 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7432[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(BZLjava/lang/Object;)[B"
   )
   public static final byte[] method3731(byte arg0, boolean arg1, Object arg2) {
      try {
         ++field7429;
         if (arg2 == null) {
            return null;
         } else {
            int var3 = 95 / ((-57 - arg0) / 40);
            if (arg2 instanceof byte[]) {
               byte[] var4 = (byte[])arg2;
               return !arg1 ? var4 : class729.method5311((byte)-4, var4);
            } else if (arg2 instanceof class65) {
               class65 var5 = (class65)arg2;
               return var5.method536((byte)-94);
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7432[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7432[1] : field7432[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "<init>",
      descriptor = "(Lck;Lae;)V"
   )
   public class500(class667 arg0, class262 arg1) {
      super(arg0);

      try {
         this.field7430 = arg1;
         this.method3734(3171);
         this.field7417 = new class16(super.field7700, 6406, 2, new byte[]{0, -1}, 6406);
         this.field7417.method113(false, 3589);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7432[6] + (arg0 != null ? field7432[1] : field7432[2]) + ',' + (arg1 != null ? field7432[1] : field7432[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method878(int arg0, boolean arg1) {
      try {
         ++field7416;
         if (super.field7700.field10031 > arg0) {
            float var3 = -0.5F / (float)super.field7700.field10031;
            super.field7700.method4828(1, (byte)66);
            class167.field2085[3] = super.field7700.field9937 * var3 + 0.25F;
            class167.field2085[1] = 0.0F;
            class167.field2085[2] = var3;
            class167.field2085[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class167.field2085, 0);
            OpenGL.glPopMatrix();
            super.field7700.method4836((float)super.field7700.field10031, 0.5F, (byte)-6);
            super.field7700.method4818((byte)-107, this.field7417);
            super.field7700.method4828(0, (byte)66);
         }

         this.field7419.method2948('\u0000', (byte)-69);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(0.25F, 0.25F, 1.0F);
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7432[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method872(int arg0, boolean arg1) {
      try {
         ++field7418;
         if (arg0 <= 12) {
            method3735(54L, (byte)-45);
         }

         super.field7700.method4849(8448, 34161, 260);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7432[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3732(int arg0, int arg1) {
      return class661.field9571 != null ? class661.field9571[arg0][arg1] & 65535 : 0;
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method871(int arg0, int arg1, int arg2) {
      try {
         int var4 = 86 % ((75 - arg1) / 37);
         ++field7426;
         if ((1 & arg0) == 1) {
            if (!this.field7430.field3579) {
               int var5 = super.field7700.field9898 % 4000 * 16 / 4000;
               super.field7700.method4818((byte)-106, this.field7430.field3580[var5]);
            } else {
               super.field7700.method4818((byte)-125, this.field7430.field3586);
               class167.field2085[2] = 0.0F;
               class167.field2085[3] = (float)(super.field7700.field9898 % 4000) / 4000.0F;
               class167.field2085[0] = 0.0F;
               class167.field2085[1] = 0.0F;
               OpenGL.glTexGenfv(8194, 9473, class167.field2085, 0);
            }
         } else if (this.field7430.field3579) {
            super.field7700.method4818((byte)20, this.field7430.field3586);
            class167.field2085[3] = 0.0F;
            class167.field2085[0] = 0.0F;
            class167.field2085[1] = 0.0F;
            class167.field2085[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class167.field2085, 0);
         } else {
            super.field7700.method4818((byte)28, this.field7430.field3580[0]);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7432[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3733(byte arg0) {
      try {
         field7423 = null;
         if (arg0 != 21) {
            field7431 = 0.51442873F;
         }

         field7425 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7432[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method3734(int arg0) {
      try {
         if (arg0 == 3171) {
            ++field7421;
            this.field7419 = new class383(super.field7700, 2);
            this.field7419.method2949(false, 0);
            super.field7700.method4828(1, (byte)66);
            super.field7700.method4849(260, 34161, 7681);
            super.field7700.method4814(arg0 ^ 4706, 0, 34168, 768);
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glEnable(3168);
            super.field7700.method4828(0, (byte)66);
            OpenGL.glTexEnvf(8960, 34163, 2.0F);
            if (this.field7430.field3579) {
               OpenGL.glTexGeni(8194, 9472, 9217);
               OpenGL.glTexGeni(8195, 9472, 9217);
               OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
               OpenGL.glEnable(3170);
               OpenGL.glEnable(3171);
            }

            this.field7419.method2946(407554050);
            this.field7419.method2949(false, 1);
            super.field7700.method4828(1, (byte)66);
            super.field7700.method4849(8448, 34161, 8448);
            super.field7700.method4814(7681, 0, 5890, 768);
            OpenGL.glDisable(3168);
            super.field7700.method4828(0, (byte)66);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field7430.field3579) {
               OpenGL.glDisable(3170);
               OpenGL.glDisable(3171);
            }

            this.field7419.method2946(407554050);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7432[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(JB)V"
   )
   public static final void method3735(long arg0, byte arg1) {
      try {
         class447.field6798.setTime(new Date(arg0));
         if (arg1 != -92) {
            field7423 = null;
         }

         ++field7428;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7432[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method3736(int arg0, int arg1) {
      int var2 = client.field4530;

      try {
         if (arg1 != -51) {
            field7431 = -2.342622F;
         }

         label45: {
            if (arg0 != 37) {
               if (~arg0 == -51) {
                  class329.field4680 = 4.0F;
                  if (var2 == 0) {
                     break label45;
                  }
               }

               if (arg0 == 75) {
                  class329.field4680 = 6.0F;
                  if (var2 == 0) {
                     break label45;
                  }
               }

               if (arg0 == 100) {
                  class329.field4680 = 8.0F;
                  if (var2 == 0) {
                     break label45;
                  }
               }

               if (arg0 != 200) {
                  break label45;
               }

               class329.field4680 = 16.0F;
               if (var2 == 0) {
                  break label45;
               }
            }

            class329.field4680 = 3.0F;
         }

         ++field7420;
         class82.field999 = -1;
         class82.field999 = -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7432[10] + arg0 + ',' + arg1 + ')');
      }
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field7425[var2] = (float)Math.sin((double)var2 * var0);
         field7423[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3737(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3738(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
