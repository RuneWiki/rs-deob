import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class316 extends class757 {
   @OriginalMember(
      owner = "client!nba",
      name = "m",
      descriptor = "Lee;"
   )
   private class707 field4221;
   @OriginalMember(
      owner = "client!nba",
      name = "p",
      descriptor = "Laga;"
   )
   private class697 field4226;
   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4232 = new String[]{method2376(method2375("vYd~\\~Yvm")), method2376(method2375("tTb7q2")), method2376(method2375("tTb7\u007f2")), method2376(method2375("tTb7|2")), method2376(method2375("tTb7s2")), method2376(method2375("tTb7p2")), method2376(method2375("tTb7}2")), method2376(method2375("tTb7~2")), method2376(method2375("tTb7{2")), method2376(method2375("tTb7z2")), method2376(method2375("tCou")), method2376(method2375("tTb7\u0005sXjm\u00072")), method2376(method2375("a\u0018-7D")), method2376(method2375("tTb7x2"))};
   @OriginalMember(
      owner = "client!nba",
      name = "l",
      descriptor = "I"
   )
   public static int field4223 = 0;
   @OriginalMember(
      owner = "client!nba",
      name = "j",
      descriptor = "I"
   )
   public static int field4218;
   @OriginalMember(
      owner = "client!nba",
      name = "q",
      descriptor = "I"
   )
   public static int field4219;
   @OriginalMember(
      owner = "client!nba",
      name = "r",
      descriptor = "I"
   )
   public static int field4220;
   @OriginalMember(
      owner = "client!nba",
      name = "k",
      descriptor = "I"
   )
   public static int field4222;
   @OriginalMember(
      owner = "client!nba",
      name = "i",
      descriptor = "I"
   )
   public static int field4224;
   @OriginalMember(
      owner = "client!nba",
      name = "n",
      descriptor = "I"
   )
   public static int field4225;
   @OriginalMember(
      owner = "client!nba",
      name = "f",
      descriptor = "I"
   )
   public static int field4227;
   @OriginalMember(
      owner = "client!nba",
      name = "g",
      descriptor = "I"
   )
   public static int field4228;
   @OriginalMember(
      owner = "client!nba",
      name = "o",
      descriptor = "I"
   )
   public static int field4229;
   @OriginalMember(
      owner = "client!nba",
      name = "e",
      descriptor = "I"
   )
   public static int field4230;
   @OriginalMember(
      owner = "client!nba",
      name = "h",
      descriptor = "Lqh;"
   )
   public static class74 field4231;

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method386(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         float var5;
         float var6;
         float var7;
         label38: {
            ++field4228;
            var5 = (float)((3 & arg0) + 1) * -5.0E-4F;
            var6 = (float)(((arg0 & 25) >> 3) + 1) * 5.0E-4F;
            var7 = ~(64 & arg0) == -1 ? 4.8828125E-4F : 9.765625E-4F;
            super.field10974.method4841(1, 33984);
            boolean var8 = ~(128 & arg0) != -1;
            if (var8) {
               class580.field7962[0] = var7;
               class580.field7962[1] = 0.0F;
               class580.field7962[2] = 0.0F;
               class580.field7962[3] = 0.0F;
               if (!var4) {
                  break label38;
               }
            }

            class580.field7962[1] = 0.0F;
            class580.field7962[0] = 0.0F;
            class580.field7962[3] = 0.0F;
            class580.field7962[2] = var7;
         }

         OpenGL.glTexGenfv(8192, 9474, class580.field7962, 0);
         class580.field7962[0] = 0.0F;
         class580.field7962[1] = var7;
         class580.field7962[3] = (float)super.field10974.field9711 * var5 % 1.0F;
         class580.field7962[2] = 0.0F;
         OpenGL.glTexGenfv(8193, 9474, class580.field7962, 0);
         if (arg1 < -118) {
            label32: {
               if (!this.field4221.field10264) {
                  int var9 = (int)((float)super.field10974.field9711 * var6 * 16.0F);
                  super.field10974.method4848(false, this.field4221.field10263[var9 % 16]);
                  if (!var4) {
                     break label32;
                  }
               }

               class580.field7962[0] = 0.0F;
               class580.field7962[3] = (float)super.field10974.field9711 * var6 % 1.0F;
               class580.field7962[1] = 0.0F;
               class580.field7962[2] = 0.0F;
               OpenGL.glTexGenfv(8194, 9473, class580.field7962, 0);
            }

            super.field10974.method4841(0, 33984);
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field4232[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(IIIIIII)I"
   )
   public static final int method2371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         int var10 = arg0 & 3;
         ++field4225;
         if (~(arg6 & 1) == -2) {
            int var7 = arg5;
            arg5 = arg4;
            arg4 = var7;
         }

         if (arg2 != -16508) {
            field4223 = 126;
         }

         if (var10 == 0) {
            return arg1;
         } else if (~var10 == -2) {
            return arg3;
         } else {
            return var10 == 2 ? -arg5 - -1 + -arg1 + 7 : 7 - (arg4 - 1) + -arg3;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4232[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2372(int arg0) {
      try {
         field4231 = null;
         if (arg0 != -24622) {
            field4231 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4232[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method385(boolean arg0, int arg1) {
      try {
         ++field4230;
         if (arg1 != 500) {
            this.field4221 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4232[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "<init>",
      descriptor = "(Lor;Lee;)V"
   )
   public class316(class670 arg0, class707 arg1) {
      super(arg0);

      try {
         this.field4221 = arg1;
         this.field4226 = new class697(arg0, 2);
         this.field4226.method5069(124, 0);
         super.field10974.method4841(1, 33984);
         if (this.field4221.field10264) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
         }

         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glTexGeni(8193, 9472, 9216);
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         super.field10974.method4841(0, 33984);
         this.field4226.method5068((byte)119);
         this.field4226.method5069(-2, 1);
         super.field10974.method4841(1, 33984);
         if (this.field4221.field10264) {
            OpenGL.glDisable(3170);
         }

         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         super.field10974.method4841(0, 33984);
         this.field4226.method5068((byte)119);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4232[11] + (arg0 != null ? field4232[12] : field4232[10]) + ',' + (arg1 != null ? field4232[12] : field4232[10]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(BILmd;)V"
   )
   public final void method387(byte arg0, int arg1, class573 arg2) {
      try {
         if (arg0 == -96) {
            super.field10974.method4848(false, arg2);
            ++field4227;
            super.field10974.method4879(0, arg1);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4232[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4232[12] : field4232[10]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method392(int arg0) {
      try {
         if (arg0 < 110) {
            this.field4226 = null;
         }

         ++field4220;
         return true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4232[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "(ZI)V"
   )
   public static final void method2373(boolean arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         class223[] var3 = class605.field8475;
         int var4 = 0;
         class223 var5;
         if (var2) {
            var5 = var3[var4];
            var5.method1697(63);
            ++var4;
         }

         while(~var4 > ~var3.length) {
            var5 = var3[var4];
            var5.method1697(63);
            ++var4;
         }

         ++field4222;
         class639.method4629(-126);
         class749.method5415(true);
         class481.method3503();
         int var6 = 0;
         if (var2) {
            class331.field4738[var6].method1158((byte)-116);
            ++var6;
         }

         while(true) {
            while(var6 < 4) {
               class331.field4738[var6].method1158((byte)-116);
               ++var6;
            }

            class179.method1380(false, 51);
            System.gc();
            class109.method964(2, 17818);
            int var7 = -97 % ((arg1 - 59) / 56);
            class215.field2664 = -1;
            class694.field10136 = false;
            class191.method1437((byte)95);
            class367.method2837((byte)47, true);
            class593.method4263(839);
            class362.method2816((byte)11);
            class150.method1248(-74);
            if (!var2) {
               if (arg0) {
                  class397.method3019(-90, 13);
                  return;
               }

               class397.method3019(-121, 3);

               try {
                  class164.method1307(-22955, class126.field1586, field4232[0]);
                  return;
               } catch (Throwable var9) {
                  return;
               }
            }

            ++var6;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4232[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method388(byte arg0) {
      try {
         ++field4229;
         int var2 = -103 / ((48 - arg0) / 63);
         this.field4226.method5070('\u0001', 4);
         super.field10974.method4841(1, 33984);
         super.field10974.method4848(false, (class573)null);
         super.field10974.method4841(0, 33984);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4232[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method391(int arg0, boolean arg1) {
      try {
         if (arg0 >= 24) {
            this.field4226.method5070('\u0000', 4);
            ++field4218;
            if (this.field4221.field10264) {
               super.field10974.method4841(1, 33984);
               super.field10974.method4848(false, this.field4221.field10260);
               super.field10974.method4841(0, 33984);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4232[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(IIB)V"
   )
   public static final void method2374(int arg0, int arg1, byte arg2) {
      boolean var3 = client.field4273;

      try {
         ++field4224;
         if (class633.field8958 != null) {
            int var4 = class498.field6856;
            int var5 = class124.field1540;
            class727.method5291(arg0, arg1, 2);
            if (arg2 > 90) {
               label61: {
                  if (class616.field8588 != 0) {
                     if (class616.field8588 != 1 || class599.field8362 != null && ~class498.field6856 == ~var4 && class124.field1540 == var5) {
                        break label61;
                     }

                     class599.field8362 = new class165[class498.field6856 * class124.field1540];
                     int var6 = 0;
                     if (var3) {
                        class599.field8362[var6] = class633.field8958.method495(class633.field8958.method590(class477.field6599, class182.field2249), class633.field8958.method531(class477.field6599, class182.field2249));
                        ++var6;
                     }

                     while(true) {
                        while(~class599.field8362.length < ~var6) {
                           class599.field8362[var6] = class633.field8958.method495(class633.field8958.method590(class477.field6599, class182.field2249), class633.field8958.method531(class477.field6599, class182.field2249));
                           ++var6;
                        }

                        class302.field4001 = new int[class498.field6856 * class124.field1540];
                        class492.field6769 = 1;
                        if (!var3) {
                           if (!var3) {
                              break label61;
                           }
                           break;
                        }

                        ++var6;
                     }
                  }

                  class771.field11096 = null;
                  class771.field11096 = class633.field8958.method495(class633.field8958.method590(class40.field462, class459.field6289), class633.field8958.method531(class40.field462, class459.field6289));
               }

               class591.field8180 = true;
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4232[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2375(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2376(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
