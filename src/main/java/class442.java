import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class442 extends class757 {
   @OriginalMember(
      owner = "client!nv",
      name = "e",
      descriptor = "Lee;"
   )
   private class707 field6134;
   @OriginalMember(
      owner = "client!nv",
      name = "j",
      descriptor = "Lcba;"
   )
   private class580 field6126;
   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6137 = new String[]{method3287(method3286("}cem")), method3287(method3286("}`'@\u0017")), method3287(method3286("h8'/B")), method3287(method3286("}`'C\u0017")), method3287(method3286("}`'F\u0017")), method3287(method3286("}`'=V}\u007f}?\u0017")), method3287(method3286("}`'K\u0017")), method3287(method3286("}`'B\u0017")), method3287(method3286("}`'G\u0017")), method3287(method3286("}`'E\u0017")), method3287(method3286("}`'D\u0017")), method3287(method3286("}`'H\u0017")), method3287(method3286("}`'I\u0017")), method3287(method3286("}`'J\u0017"))};
   @OriginalMember(
      owner = "client!nv",
      name = "s",
      descriptor = "Lbga;"
   )
   public static class378 field6125 = new class378(69, -2);
   @OriginalMember(
      owner = "client!nv",
      name = "k",
      descriptor = "I"
   )
   public static int field6122;
   @OriginalMember(
      owner = "client!nv",
      name = "h",
      descriptor = "I"
   )
   public static int field6123;
   @OriginalMember(
      owner = "client!nv",
      name = "f",
      descriptor = "I"
   )
   public static int field6124;
   @OriginalMember(
      owner = "client!nv",
      name = "r",
      descriptor = "I"
   )
   public static int field6127;
   @OriginalMember(
      owner = "client!nv",
      name = "l",
      descriptor = "I"
   )
   public static int field6128;
   @OriginalMember(
      owner = "client!nv",
      name = "p",
      descriptor = "I"
   )
   public static int field6130;
   @OriginalMember(
      owner = "client!nv",
      name = "g",
      descriptor = "I"
   )
   public static int field6131;
   @OriginalMember(
      owner = "client!nv",
      name = "i",
      descriptor = "I"
   )
   public static int field6132;
   @OriginalMember(
      owner = "client!nv",
      name = "o",
      descriptor = "I"
   )
   public static int field6133;
   @OriginalMember(
      owner = "client!nv",
      name = "n",
      descriptor = "I"
   )
   public static int field6135;
   @OriginalMember(
      owner = "client!nv",
      name = "m",
      descriptor = "I"
   )
   public static int field6136;
   @OriginalMember(
      owner = "client!nv",
      name = "q",
      descriptor = "Laga;"
   )
   private class697 field6129;

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method388(byte arg0) {
      try {
         ++field6128;
         this.field6129.method5070('\u0001', 4);
         if (~super.field10974.field9806 < -1) {
            super.field10974.method4841(1, 33984);
            super.field10974.method4848(false, (class573)null);
            super.field10974.method4878(1.0F, (byte)-17, 0.0F);
            super.field10974.method4841(0, 33984);
         }

         int var2 = 98 / ((arg0 - 48) / 63);
         super.field10974.method4862(8448, 8448, 91);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6137[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(BILmd;)V"
   )
   public final void method387(byte arg0, int arg1, class573 arg2) {
      try {
         ++field6136;
         if (arg0 != -96) {
            this.field6129 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6137[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6137[2] : field6137[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "<init>",
      descriptor = "(Lor;Lee;)V"
   )
   public class442(class670 arg0, class707 arg1) {
      super(arg0);

      try {
         this.field6134 = arg1;
         this.method3282(121);
         this.field6126 = new class580(super.field10974, 6406, 2, new byte[]{0, -1}, 6406);
         this.field6126.method4170(false, 33071);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6137[5] + (arg0 != null ? field6137[2] : field6137[0]) + ',' + (arg1 != null ? field6137[2] : field6137[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "(IZ)I"
   )
   public static final int method3281(int arg0, boolean arg1) {
      try {
         ++field6135;
         return arg1 ? -62 : 127 & arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6137[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method392(int arg0) {
      try {
         if (arg0 < 110) {
            this.method392(-40);
         }

         ++field6130;
         return true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6137[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method385(boolean arg0, int arg1) {
      try {
         super.field10974.method4862(8448, 260, 77);
         ++field6127;
         if (arg1 != 500) {
            method3281(-60, false);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6137[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method3282(int arg0) {
      try {
         ++field6122;
         this.field6129 = new class697(super.field10974, 2);
         this.field6129.method5069(-112, 0);
         super.field10974.method4841(1, 33984);
         super.field10974.method4862(260, 7681, 109);
         super.field10974.method4901(768, 0, 34168, 5);
         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glEnable(3168);
         super.field10974.method4841(0, 33984);
         OpenGL.glTexEnvf(8960, 34163, 2.0F);
         if (this.field6134.field10264) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
         }

         if (arg0 < 114) {
            this.method3282(17);
         }

         this.field6129.method5068((byte)119);
         this.field6129.method5069(7, 1);
         super.field10974.method4841(1, 33984);
         super.field10974.method4862(8448, 8448, 26);
         super.field10974.method4901(768, 0, 5890, 5);
         OpenGL.glDisable(3168);
         super.field10974.method4841(0, 33984);
         OpenGL.glTexEnvf(8960, 34163, 1.0F);
         if (this.field6134.field10264) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
         }

         this.field6129.method5068((byte)119);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6137[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method386(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         if (arg1 < -118) {
            label40: {
               if ((arg0 & 1) == 1) {
                  if (!this.field6134.field10264) {
                     int var5 = super.field10974.field9711 % 4000 * 16 / 4000;
                     super.field10974.method4848(false, this.field6134.field10259[var5]);
                     if (!var4) {
                        break label40;
                     }
                  }

                  super.field10974.method4848(false, this.field6134.field10261);
                  class537.field7341[0] = 0.0F;
                  class537.field7341[2] = 0.0F;
                  class537.field7341[1] = 0.0F;
                  class537.field7341[3] = (float)(super.field10974.field9711 % 4000) / 4000.0F;
                  OpenGL.glTexGenfv(8194, 9473, class537.field7341, 0);
                  if (!var4) {
                     break label40;
                  }
               }

               if (!this.field6134.field10264) {
                  super.field10974.method4848(false, this.field6134.field10259[0]);
                  if (!var4) {
                     break label40;
                  }
               }

               super.field10974.method4848(false, this.field6134.field10261);
               class537.field7341[1] = 0.0F;
               class537.field7341[3] = 0.0F;
               class537.field7341[2] = 0.0F;
               class537.field7341[0] = 0.0F;
               OpenGL.glTexGenfv(8194, 9473, class537.field7341, 0);
            }

            ++field6131;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6137[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method391(int arg0, boolean arg1) {
      try {
         ++field6123;
         if (super.field10974.field9806 > 0) {
            float var3 = -0.5F / (float)super.field10974.field9806;
            super.field10974.method4841(1, 33984);
            class537.field7341[0] = 0.0F;
            class537.field7341[1] = 0.0F;
            class537.field7341[3] = super.field10974.field9798 * var3 + 0.25F;
            class537.field7341[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class537.field7341, 0);
            OpenGL.glPopMatrix();
            super.field10974.method4878(0.5F, (byte)-17, (float)super.field10974.field9806);
            super.field10974.method4848(false, this.field6126);
            super.field10974.method4841(0, 33984);
         }

         this.field6129.method5070('\u0000', 4);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(0.25F, 0.25F, 1.0F);
         if (arg0 <= 24) {
            this.field6126 = null;
         }

         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6137[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public static final void method3283(class594 arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         ++field6133;
         if (~(arg0.field8227.length + -arg0.field8243) <= -2) {
            int var3 = arg0.method4288((byte)125);
            if (arg1 <= -43) {
               if (~var3 <= -1 && ~var3 >= -2) {
                  if (arg0.field8227.length + -arg0.field8243 >= 2) {
                     int var4 = arg0.method4280(-19104);
                     if (arg0.field8227.length + -arg0.field8243 >= var4 * 6) {
                        int var5 = 0;
                        if (var2 || ~var4 < ~var5) {
                           do {
                              int var6 = arg0.method4280(-19104);
                              int var7 = arg0.method4302(true);
                              if (var6 < class576.field7918.length) {
                                 if (!class535.field7311[var6] && !var2) {
                                    ++var5;
                                 } else if (~class752.field10924.method2319(320, var6).field4175 == -50) {
                                    if (~var7 <= 0) {
                                       if (var7 > 1) {
                                          if (var2) {
                                             class576.field7918[var6] = var7;
                                             ++var5;
                                          } else {
                                             ++var5;
                                          }
                                       } else {
                                          class576.field7918[var6] = var7;
                                          ++var5;
                                       }
                                    } else {
                                       ++var5;
                                    }
                                 } else {
                                    class576.field7918[var6] = var7;
                                    ++var5;
                                 }
                              } else {
                                 ++var5;
                              }
                           } while(~var4 < ~var5);

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field6137[13] + (arg0 != null ? field6137[2] : field6137[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3284(byte arg0) {
      try {
         field6125 = null;
         if (arg0 != 111) {
            method3283((class594)null, (byte)-53);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6137[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3285(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 65) {
            return true;
         } else {
            ++field6124;
            return ~(256 & arg0) != -1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6137[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3286(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3287(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
