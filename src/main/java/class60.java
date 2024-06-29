import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class60 extends class515 {
   @OriginalMember(
      owner = "client!kk",
      name = "q",
      descriptor = "Lqk;"
   )
   private class118 field859;
   @OriginalMember(
      owner = "client!kk",
      name = "l",
      descriptor = "Lht;"
   )
   private class792 field857;
   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field868 = new String[]{method617(method616("8s\u0007\u0011\u0000")), method617(method616("8s\u0007\u001f\u0000")), method617(method616("8s\u0007\u0010\u0000")), method617(method616("8s\u0007\u001e\u0000")), method617(method616("8s\u0007\u0012\u0000")), method617(method616("8s\u0007\u0015\u0000")), method617(method616("=mE;")), method617(method616("(6\u0007yU")), method617(method616("8s\u0007\u0016\u0000")), method617(method616("8s\u0007\u0013\u0000")), method617(method616("8s\u0007\u0014\u0000")), method617(method616("8s\u0007kA=q]i\u0000"))};
   @OriginalMember(
      owner = "client!kk",
      name = "f",
      descriptor = "[Z"
   )
   public static boolean[] field856 = new boolean[200];
   @OriginalMember(
      owner = "client!kk",
      name = "h",
      descriptor = "I"
   )
   public static int field858;
   @OriginalMember(
      owner = "client!kk",
      name = "p",
      descriptor = "I"
   )
   public static int field861;
   @OriginalMember(
      owner = "client!kk",
      name = "i",
      descriptor = "I"
   )
   public static int field862;
   @OriginalMember(
      owner = "client!kk",
      name = "j",
      descriptor = "I"
   )
   public static int field863;
   @OriginalMember(
      owner = "client!kk",
      name = "g",
      descriptor = "I"
   )
   public static int field864;
   @OriginalMember(
      owner = "client!kk",
      name = "o",
      descriptor = "I"
   )
   public static int field865;
   @OriginalMember(
      owner = "client!kk",
      name = "k",
      descriptor = "I"
   )
   public static int field866;
   @OriginalMember(
      owner = "client!kk",
      name = "m",
      descriptor = "I"
   )
   public static int field867;
   @OriginalMember(
      owner = "client!kk",
      name = "n",
      descriptor = "J"
   )
   public static long field855;
   @OriginalMember(
      owner = "client!kk",
      name = "r",
      descriptor = "Lgca;"
   )
   private class50 field860;

   @OriginalMember(
      owner = "client!kk",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method613(int arg0) {
      try {
         field856 = null;
         if (arg0 != 22) {
            field856 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field868[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method614(int arg0) {
      try {
         this.field860 = new class50(super.field7307, 2);
         ++field858;
         this.field860.method544(0, arg0 ^ 8196);
         super.field7307.method4958(1, false);
         super.field7307.method4931(7681, 260, 0);
         super.field7307.method4909(34168, 768, 0, (byte)-19);
         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glEnable(3168);
         super.field7307.method4958(0, false);
         OpenGL.glTexEnvf(8960, 34163, 2.0F);
         if (this.field859.field1858) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
         }

         this.field860.method545((byte)93);
         this.field860.method544(1, arg0 ^ 8314);
         super.field7307.method4958(1, false);
         super.field7307.method4931(8448, 8448, arg0 + -8194);
         super.field7307.method4909(5890, 768, 0, (byte)-111);
         OpenGL.glDisable(3168);
         if (arg0 == 8194) {
            super.field7307.method4958(0, false);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field859.field1858) {
               OpenGL.glDisable(3170);
               OpenGL.glDisable(3171);
            }

            this.field860.method545((byte)93);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field868[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method132(int arg0, boolean arg1) {
      try {
         ++field862;
         super.field7307.method4931(260, 8448, arg0 ^ arg0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field868[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "<init>",
      descriptor = "(Laea;Lqk;)V"
   )
   public class60(class678 arg0, class118 arg1) {
      super(arg0);

      try {
         this.field859 = arg1;
         this.method614(8194);
         this.field857 = new class792(super.field7307, 6406, 2, new byte[]{0, -1}, 6406);
         this.field857.method5714(false, -119);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field868[11] + (arg0 != null ? field868[7] : field868[6]) + ',' + (arg1 != null ? field868[7] : field868[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(ILln;I)V"
   )
   public final void method131(int arg0, class719 arg1, int arg2) {
      try {
         int var4 = -34 % ((-44 - arg0) / 41);
         ++field864;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field868[8] + arg0 + ',' + (arg1 != null ? field868[7] : field868[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method133(boolean arg0) {
      try {
         this.field860.method547('\u0001', !arg0);
         ++field865;
         if (super.field7307.field9751 > 0) {
            super.field7307.method4958(1, false);
            super.field7307.method4906(-2, (class719)null);
            super.field7307.method4888(0.0F, 1.0F, 8448);
            super.field7307.method4958(0, false);
         }

         super.field7307.method4931(8448, 8448, 0);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         if (arg0) {
            this.method614(-60);
         }

         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field868[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method135(int arg0) {
      try {
         ++field863;
         if (arg0 != 19455) {
            this.method132(93, true);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field868[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IIB)V"
   )
   public static final void method615(int arg0, int arg1, byte arg2) {
      boolean var3 = client.field10022;

      try {
         int var4;
         int var7;
         label114: {
            ++field866;
            var4 = class705.field10143.method3430(32, class765.field10927.method5512(arg2 ^ -12, class777.field11340));
            int var10000;
            if (!class392.field5703) {
               class272 var5 = (class272)class594.field8377.method2245((byte)-94);
               int var6;
               if (var3) {
                  var6 = class605.method4460(true, var5);
                  if (~var4 > ~var6) {
                     var4 = var6;
                  }

                  var5 = (class272)class594.field8377.method2239((byte)118);
               }

               while(true) {
                  if (var5 == null) {
                     var4 += 8;
                     var7 = class687.field9909 * 16 - -21;
                     var10000 = class687.field9909 * 16;
                     if (!var3) {
                        class685.field9890 = var10000 - -(class317.field4742 ? 26 : 22);
                        if (!var3) {
                           break label114;
                        }
                        break;
                     }
                  } else {
                     var10000 = class605.method4460(true, var5);
                  }

                  var6 = var10000;
                  if (~var4 > ~var6) {
                     var4 = var6;
                  }

                  var5 = (class272)class594.field8377.method2239((byte)118);
               }
            }

            label84: {
               class211 var8 = (class211)class142.field2268.method5225(true);
               if (var3) {
                  var10000 = ~var8.field3008;
               } else if (var8 == null) {
                  var7 = class444.field6480 * 16 - -21;
                  var10000 = class317.field4742;
                  if (!var3) {
                     break label84;
                  }
               } else {
                  var10000 = ~var8.field3008;
               }

               while(true) {
                  int var9;
                  if (var10000 == -2) {
                     var9 = class605.method4460(true, (class272)var8.field3011.field10341.field1553);
                     if (var3) {
                        var9 = class215.method1852(var8, -124);
                     }
                  } else {
                     var9 = class215.method1852(var8, -124);
                  }

                  if (var9 > var4) {
                     var4 = var9;
                  }

                  var8 = (class211)class142.field2268.method5227(-17856);
                  if (var8 == null) {
                     var7 = class444.field6480 * 16 - -21;
                     var10000 = class317.field4742;
                     if (!var3) {
                        break;
                     }
                  } else {
                     var10000 = ~var8.field3008;
                  }
               }
            }

            class685.field9890 = (var10000 != 0 ? 26 : 22) + class444.field6480 * 16;
            var4 += 8;
         }

         int var10 = arg0 - var4 / 2;
         if (class557.field7909 < var4 + var10) {
            var10 = -var4 + class557.field7909;
         }

         if (arg2 != 10) {
            field856 = null;
         }

         if (~var10 > -1) {
            var10 = 0;
         }

         int var11 = arg1;
         if (arg1 - -var7 > class140.field2243) {
            var11 = class140.field2243 - var7;
         }

         if (~var11 > -1) {
            var11 = 0;
         }

         class752.field10679 = var10;
         class587.field8249 = var4;
         class678.field9669 = true;
         class133.field2180 = var11;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field868[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method137(int arg0, byte arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label35: {
            if ((arg2 & 1) == 1) {
               if (this.field859.field1858) {
                  super.field7307.method4906(-2, this.field859.field1856);
                  class93.field1529[2] = 0.0F;
                  class93.field1529[1] = 0.0F;
                  class93.field1529[3] = (float)(super.field7307.field9679 % 4000) / 4000.0F;
                  class93.field1529[0] = 0.0F;
                  OpenGL.glTexGenfv(8194, 9473, class93.field1529, 0);
                  if (!var4) {
                     break label35;
                  }
               }

               int var5 = super.field7307.field9679 % 4000 * 16 / 4000;
               super.field7307.method4906(-2, this.field859.field1854[var5]);
               if (!var4) {
                  break label35;
               }
            }

            if (this.field859.field1858) {
               super.field7307.method4906(-2, this.field859.field1856);
               class93.field1529[1] = 0.0F;
               class93.field1529[0] = 0.0F;
               class93.field1529[3] = 0.0F;
               class93.field1529[2] = 0.0F;
               OpenGL.glTexGenfv(8194, 9473, class93.field1529, 0);
               if (!var4) {
                  break label35;
               }
            }

            super.field7307.method4906(-2, this.field859.field1854[0]);
         }

         ++field861;
         int var6 = 121 % ((arg1 - -57) / 60);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field868[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method136(boolean arg0, int arg1) {
      try {
         if (super.field7307.field9751 > 0) {
            float var3 = -0.5F / (float)super.field7307.field9751;
            super.field7307.method4958(1, false);
            class93.field1529[1] = 0.0F;
            class93.field1529[2] = var3;
            class93.field1529[0] = 0.0F;
            class93.field1529[3] = super.field7307.field9748 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class93.field1529, 0);
            OpenGL.glPopMatrix();
            super.field7307.method4888((float)super.field7307.field9751, 0.5F, arg1 ^ 8451);
            super.field7307.method4906(arg1 ^ -3, this.field857);
            super.field7307.method4958(0, false);
         }

         ++field867;
         this.field860.method547('\u0000', true);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(0.25F, 0.25F, 1.0F);
         if (arg1 == 3) {
            OpenGL.glMatrixMode(5888);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field868[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method616(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method617(char[] arg0) {
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
            var10005 = 24;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
