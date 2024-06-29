import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class188 extends class125 {
   @OriginalMember(
      owner = "client!cc",
      name = "f",
      descriptor = "Luda;"
   )
   private class56 field2399;
   @OriginalMember(
      owner = "client!cc",
      name = "i",
      descriptor = "Lec;"
   )
   private class108 field2393;
   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2405 = new String[]{method1581(method1580("33\u001c\u0014S")), method1581(method1580("+~\u001cx\u0006")), method1581(method1580(">%^:")), method1581(method1580("33\u001c\u0012S")), method1581(method1580("33\u001c\u0017S")), method1581(method1580("33\u001c\u001eS")), method1581(method1580("33\u001cj\u0012>9FhS")), method1581(method1580("33\u001c\u001dS")), method1581(method1580("33\u001c\u001aS")), method1581(method1580("33\u001c\u001fS")), method1581(method1580("33\u001c\u0011S")), method1581(method1580("33\u001c\u0010S")), method1581(method1580("33\u001c\u0013S")), method1581(method1580("33\u001c\u0015S")), method1581(method1580("33\u001c\u001cS"))};
   @OriginalMember(
      owner = "client!cc",
      name = "x",
      descriptor = "I"
   )
   public static int field2389 = 0;
   @OriginalMember(
      owner = "client!cc",
      name = "s",
      descriptor = "Ljava/lang/Object;"
   )
   public static volatile Object field2401 = null;
   @OriginalMember(
      owner = "client!cc",
      name = "v",
      descriptor = "Ldp;"
   )
   public static class499 field2390 = new class499(6, 1);
   @OriginalMember(
      owner = "client!cc",
      name = "g",
      descriptor = "[F"
   )
   public static float[] field2404 = new float[2];
   @OriginalMember(
      owner = "client!cc",
      name = "n",
      descriptor = "I"
   )
   public static int field2386;
   @OriginalMember(
      owner = "client!cc",
      name = "p",
      descriptor = "I"
   )
   public static int field2387;
   @OriginalMember(
      owner = "client!cc",
      name = "j",
      descriptor = "I"
   )
   public static int field2388;
   @OriginalMember(
      owner = "client!cc",
      name = "h",
      descriptor = "I"
   )
   public static int field2391;
   @OriginalMember(
      owner = "client!cc",
      name = "q",
      descriptor = "I"
   )
   public static int field2392;
   @OriginalMember(
      owner = "client!cc",
      name = "u",
      descriptor = "I"
   )
   public static int field2394;
   @OriginalMember(
      owner = "client!cc",
      name = "o",
      descriptor = "I"
   )
   public static int field2395;
   @OriginalMember(
      owner = "client!cc",
      name = "r",
      descriptor = "I"
   )
   public static int field2396;
   @OriginalMember(
      owner = "client!cc",
      name = "k",
      descriptor = "I"
   )
   public static int field2397;
   @OriginalMember(
      owner = "client!cc",
      name = "w",
      descriptor = "I"
   )
   public static int field2398;
   @OriginalMember(
      owner = "client!cc",
      name = "m",
      descriptor = "I"
   )
   public static int field2402;
   @OriginalMember(
      owner = "client!cc",
      name = "t",
      descriptor = "I"
   )
   public static int field2403;
   @OriginalMember(
      owner = "client!cc",
      name = "l",
      descriptor = "Ljea;"
   )
   private class249 field2400;

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method346(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            ++field2394;
            super.field1630.method4022(8448, 34161, 260);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2405[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method1574(boolean arg0) {
      try {
         if (arg0) {
            method1578(101, -85, -90, -90, -18);
         }

         field2404 = null;
         field2390 = null;
         field2401 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2405[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method347(boolean arg0) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field2386;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2405[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method341(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         if (arg0 > -125) {
            this.field2399 = null;
         }

         label41: {
            if ((1 & arg2) != 1) {
               if (this.field2399.field752) {
                  super.field1630.method4006(this.field2399.field748, (byte)-18);
                  class192.field2432[3] = 0.0F;
                  class192.field2432[2] = 0.0F;
                  class192.field2432[0] = 0.0F;
                  class192.field2432[1] = 0.0F;
                  OpenGL.glTexGenfv(8194, 9473, class192.field2432, 0);
                  if (!var4) {
                     break label41;
                  }
               }

               super.field1630.method4006(this.field2399.field751[0], (byte)57);
               if (!var4) {
                  break label41;
               }
            }

            if (this.field2399.field752) {
               super.field1630.method4006(this.field2399.field748, (byte)-14);
               class192.field2432[3] = (float)(super.field1630.field7640 % 4000) / 4000.0F;
               class192.field2432[1] = 0.0F;
               class192.field2432[0] = 0.0F;
               class192.field2432[2] = 0.0F;
               OpenGL.glTexGenfv(8194, 9473, class192.field2432, 0);
               if (!var4) {
                  break label41;
               }
            }

            int var5 = super.field1630.field7640 % 4000 * 16 / 4000;
            super.field1630.method4006(this.field2399.field751[var5], (byte)-38);
         }

         ++field2396;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2405[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1575(int arg0, int arg1) {
      try {
         if (arg1 < 85) {
            field2388 = -90;
         }

         ++field2398;
         return arg0 != 1 && ~arg0 != -8;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2405[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method1576(int arg0) {
      try {
         this.field2400 = new class249(super.field1630, 2);
         ++field2387;
         this.field2400.method1977(4864, 0);
         super.field1630.method3988(-128, 1);
         super.field1630.method4022(260, 34161, 7681);
         super.field1630.method3959(arg0 + -8307, 768, 34168, 0);
         OpenGL.glTexGeni(arg0, 9472, 9216);
         OpenGL.glEnable(3168);
         super.field1630.method3988(-128, 0);
         OpenGL.glTexEnvf(8960, 34163, 2.0F);
         if (this.field2399.field752) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
         }

         this.field2400.method1976(-112);
         this.field2400.method1977(4864, 1);
         super.field1630.method3988(-128, 1);
         super.field1630.method4022(8448, 34161, 8448);
         super.field1630.method3959(arg0 ^ -8249, 768, 5890, 0);
         OpenGL.glDisable(3168);
         super.field1630.method3988(-128, 0);
         OpenGL.glTexEnvf(8960, 34163, 1.0F);
         if (this.field2399.field752) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
         }

         this.field2400.method1976(-125);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2405[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1577(byte arg0) {
      try {
         class756.method5475(arg0 ^ -8094);
         ++field2391;
         if (arg0 != -51) {
            field2401 = null;
         }

         class28.field416 = false;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2405[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(Lll;II)V"
   )
   public final void method345(class549 arg0, int arg1, int arg2) {
      try {
         if (arg1 != -23385) {
            this.method347(true);
         }

         ++field2397;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2405[3] + (arg0 != null ? field2405[1] : field2405[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method1578(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg4 != 9472) {
            field2401 = null;
         }

         class282.field3921 = arg1;
         class415.field5689 = arg3;
         class577.field8561 = arg2;
         ++field2395;
         class586.field8647 = arg0;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2405[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method343(boolean arg0, int arg1) {
      try {
         if (~super.field1630.field7733 < -1) {
            float var3 = -0.5F / (float)super.field1630.field7733;
            super.field1630.method3988(-128, 1);
            class192.field2432[3] = super.field1630.field7725 * var3 + 0.25F;
            class192.field2432[0] = 0.0F;
            class192.field2432[1] = 0.0F;
            class192.field2432[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class192.field2432, 0);
            OpenGL.glPopMatrix();
            super.field1630.method4002(arg1 ^ 8451, (float)super.field1630.field7733, 0.5F);
            super.field1630.method4006(this.field2393, (byte)92);
            super.field1630.method3988(-128, 0);
         }

         ++field2402;
         if (arg1 != 3) {
            method1578(-10, -98, 58, 89, -29);
         }

         this.field2400.method1979('\u0000', -1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(0.25F, 0.25F, 1.0F);
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2405[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "<init>",
      descriptor = "(Liu;Luda;)V"
   )
   public class188(class530 arg0, class56 arg1) {
      super(arg0);

      try {
         this.field2399 = arg1;
         this.method1576(8192);
         this.field2393 = new class108(super.field1630, 6406, 2, new byte[]{0, -1}, 6406);
         this.field2393.method971(false, 25699);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2405[6] + (arg0 != null ? field2405[1] : field2405[2]) + ',' + (arg1 != null ? field2405[1] : field2405[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method340(int arg0) {
      try {
         ++field2392;
         if (arg0 != 5) {
            field2401 = null;
         }

         this.field2400.method1979('\u0001', arg0 ^ -6);
         if (super.field1630.field7733 > 0) {
            super.field1630.method3988(-128, 1);
            super.field1630.method4006((class549)null, (byte)-25);
            super.field1630.method4002(8448, 0.0F, 1.0F);
            super.field1630.method3988(arg0 + -133, 0);
         }

         super.field1630.method4022(8448, 34161, 8448);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2405[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(BIIJ)V"
   )
   public static final void method1579(byte arg0, int arg1, int arg2, long arg3) {
      try {
         ++field2403;
         int var5 = (int)arg3 >> 14 & 31;
         int var6 = (3847156 & (int)arg3) >> 20;
         int var7 = Integer.MAX_VALUE & (int)(arg3 >>> 32);
         if (arg0 == 53) {
            if (var5 != 10 && ~var5 != -12 && ~var5 != -23) {
               class412.method3236(true, var5, 0, 0, arg1, arg2, arg0 + -53, var6, 0);
            } else {
               class294 var8;
               int var9;
               int var10;
               label33: {
                  var8 = class438.field5967.method929((byte)-84, var7);
                  if (var6 != 0 && var6 != 2) {
                     var9 = var8.field4066;
                     var10 = var8.field4038;
                     if (!client.field1481) {
                        break label33;
                     }
                  }

                  var10 = var8.field4066;
                  var9 = var8.field4038;
               }

               int var11 = var8.field4070;
               if (var6 != 0) {
                  var11 = (var11 >> -var6 + 4) + (15 & var11 << var6);
               }

               class412.method3236(true, 0, var9, var11, arg1, arg2, 0, 0, var10);
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field2405[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1580(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1581(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
