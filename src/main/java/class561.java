import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class561 {
   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "Laea;"
   )
   private class678 field7981;
   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7990 = new String[]{method4183(method4182("\u001c59J\u0018\u001b6pJ\u001b\u0006:$\f\u0005\n+\u0002I\u001b\u0000>6\u0017}\u001c59J\u0018\u001b6pZ\u0012\nip_\u0016\u0004+<I$\u0000!5\u0017}\u001c59J\u0018\u001b6p_\u0016\u0004+<I\u0005Z\u001fpD\u0012\u0000<8X:\b+k&\u0001\u000624\f\u001a\b2>\u0004^I ZJ\u001b\u0006:$\f\u0013\u0011{m\f\u0003\f#$Y\u0005\fh\u0014\u0004\u001f\f27D\u0003$: \u0000W\u001f>3\u001f_D(1A\u0007\u0005>\u0003E\r\fu(\u0000WYu`\u0000WYu`\u0005\\\u000e7\u000fx\u0012\u0011\u0018?C\u0005\r\u0000`qY\u0011\"*\u0005Y\u001b{}\f\u0003\f#$Y\u0005\fh\u0014\u0004\u001f\f27D\u0003$: \u0000W\u001f>3\u001f_\u001a:=\\\u001b\f\b9V\u0012G#|\fGGk|\fGGky\u0007\u0010\u0005\u0004\u0004I\u000f*4?^\u00132k\r\u0002\u000f\u0010!y\u0002\u0005RQ6@\u0018\b/pH\u000eIfpX\u0012\u0011/%^\u0012Z\u001fxD\u0012\u0000<8X:\b+|\f\u0001\f8c\u0004GGk|\fZ\u001a:=\\\u001b\f\b9V\u0012G\"|\fGGky\u0007\u0010\u0005\u0004\u0004I\u000f*4?^\u00132k\r\u0002\u000f\u0010!y\u0002\u0005IvpX\u0012\u0011/%^\u0012Z\u001fxD\u0012\u0000<8X:\b+|\f\u0001\f8c\u0004GGk|\f\u0004\b6 @\u0012:2*IY\u0010wp\u001cYYr{K\u001b6\u000f5T4\u00064\"H,Y\u0006~T\u000e\u0013r~^Lc<<s1\u001b:7o\u0018\u00054\"\fJI-5OCAk~\u0019\\\u00074\"A\u0016\u00052*I_\u001f>3\u001f_\r#|\f\u0013\u0010wp^\u0014\u0019\t5@\u001e\f=y\u0005]Yue\u0000W\u001d>(X\u0002\u001b>ch_\u0001>9K\u001f\u001d\u00161\\[I<<s#\f#\u0013C\u0018\u001b?\u000b\u001c*G#)V^G)y\u0017}\u0014Q")), method4183(method4182("\u000581\u00023A")), method4183(method4182("\u000581\u0002K\u000059XIA")), method4183(method4182("\u0012u~\u0002\n")), method4183(method4182("\u0007.<@")), method4183(method4182("\u0001>9K\u001f\u001d\u00161\\")), method4183(method4182("\u000581\u00026A")), method4183(method4182("\u001b8 ~\u0012\u000525J")), method4183(method4182("\u001a:=\\\u001b\f\b9V\u0012")), method4183(method4182("\u000581\u00022A")), method4183(method4182("\u000581\u00025A")), method4183(method4182("\u000581\u00024A")), method4183(method4182("\u000581\u00021A"))};
   @OriginalMember(
      owner = "client!lca",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field7982 = false;
   @OriginalMember(
      owner = "client!lca",
      name = "b",
      descriptor = "J"
   )
   public static long field7989 = 0L;
   @OriginalMember(
      owner = "client!lca",
      name = "f",
      descriptor = "Lgq;"
   )
   public static class200 field7986 = new class200();
   @OriginalMember(
      owner = "client!lca",
      name = "e",
      descriptor = "I"
   )
   public static int field7980;
   @OriginalMember(
      owner = "client!lca",
      name = "d",
      descriptor = "I"
   )
   public static int field7983;
   @OriginalMember(
      owner = "client!lca",
      name = "i",
      descriptor = "I"
   )
   public static int field7984;
   @OriginalMember(
      owner = "client!lca",
      name = "c",
      descriptor = "I"
   )
   public static int field7985;
   @OriginalMember(
      owner = "client!lca",
      name = "h",
      descriptor = "I"
   )
   public static int field7987;
   @OriginalMember(
      owner = "client!lca",
      name = "g",
      descriptor = "Lpk;"
   )
   private class627 field7988;

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(FLwr;ILwr;)Z"
   )
   public final boolean method4176(float arg0, class383 arg1, int arg2, class383 arg3) {
      boolean var5 = client.field10022;

      try {
         ++field7987;
         if (!this.method4178(false)) {
            return false;
         } else {
            class603 var6 = this.field7981.field9810;
            class352 var7 = new class352(this.field7981, 6408, arg1.field5582, arg1.field5589);
            this.field7981.method4964(true, var6);
            int var8 = 0;
            var6.method4441(0, var7, arg2 + arg2);
            if (var6.method4442(0)) {
               int var10000;
               label48: {
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glMatrixMode(5889);
                  OpenGL.glPushMatrix();
                  OpenGL.glLoadIdentity();
                  OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
                  OpenGL.glPushAttrib(2048);
                  OpenGL.glViewport(0, 0, arg1.field5582, arg1.field5589);
                  OpenGL.glUseProgramObjectARB(this.field7988.field8952);
                  OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.field7988.field8952, field7990[5]), 0);
                  OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.field7988.field8952, field7990[7]), 1.0F / arg0);
                  OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.field7988.field8952, field7990[8]), 1.0F / (float)arg3.field5582, 1.0F / (float)arg3.field5589);
                  int var9 = 0;
                  if (var5) {
                     var10000 = var9;
                  } else if (var9 >= arg1.field5578) {
                     OpenGL.glUseProgramObjectARB(0L);
                     OpenGL.glPopAttrib();
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                     var10000 = 1;
                     if (!var5) {
                        break label48;
                     }
                  } else {
                     var10000 = var9;
                  }

                  while(true) {
                     float var10 = (float)var10000 / (float)arg1.field5578;
                     this.field7981.method4906(-2, arg3);
                     OpenGL.glBegin(7);
                     OpenGL.glTexCoord3f(0.0F, 0.0F, var10);
                     OpenGL.glVertex2f(0.0F, 0.0F);
                     OpenGL.glTexCoord3f(1.0F, 0.0F, var10);
                     OpenGL.glVertex2f(1.0F, 0.0F);
                     OpenGL.glTexCoord3f(1.0F, 1.0F, var10);
                     OpenGL.glVertex2f(1.0F, 1.0F);
                     OpenGL.glTexCoord3f(0.0F, 1.0F, var10);
                     OpenGL.glVertex2f(0.0F, 1.0F);
                     OpenGL.glEnd();
                     arg1.method2982(arg1.field5582, 0, arg1.field5589, 0, 0, var9, 0, -34);
                     ++var9;
                     if (var9 >= arg1.field5578) {
                        OpenGL.glUseProgramObjectARB(0L);
                        OpenGL.glPopAttrib();
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
                        var10000 = 1;
                        if (!var5) {
                           break;
                        }
                     } else {
                        var10000 = var9;
                     }
                  }
               }

               var8 = var10000;
               OpenGL.glPopMatrix();
            }

            var6.method4444(arg2 + 15, 0);
            this.field7981.method4951((byte)-124, var6);
            return (boolean)var8;
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field7990[6] + arg0 + ',' + (arg1 != null ? field7990[3] : field7990[4]) + ',' + arg2 + ',' + (arg3 != null ? field7990[3] : field7990[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4177(byte arg0) {
      try {
         field7986 = null;
         if (arg0 != 10) {
            method4179(28, 87, -128, -15, true, -82, -37, -107);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7990[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method4178(boolean arg0) {
      try {
         if (this.field7981.field9729 && this.field7981.field9730 && this.field7988 == null) {
            class631 var2 = class319.method2581(35632, field7990[0], this.field7981, -4176);
            if (var2 != null) {
               this.field7988 = class686.method4991(true, this.field7981, new class631[]{var2});
            }
         }

         if (arg0) {
            this.method4176(0.84665185F, (class383)null, 24, (class383)null);
         }

         ++field7984;
         return this.field7988 != null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7990[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(IIIIZIII)V"
   )
   public static final void method4179(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field10022;

      try {
         ++field7985;
         int var9 = arg3 - -arg5;
         int var10 = -arg5 + arg2;
         int var11 = arg3;
         if (var8) {
            class100.method989(arg1, (byte)22, arg6, arg0, class788.field11482[arg3]);
            var11 = arg3 + 1;
         }

         while(true) {
            int var10000;
            byte var10001;
            if (~var11 <= ~var9) {
               var10000 = arg4;
               var10001 = 0;
               if (!var8) {
                  if (arg4 != 0) {
                     field7989 = -116L;
                  }

                  int var12 = arg2;
                  if (var8) {
                     class100.method989(arg1, (byte)22, arg6, arg0, class788.field11482[arg2]);
                     var12 = arg2 - 1;
                  }

                  while(true) {
                     while(~var10 > ~var12) {
                        class100.method989(arg1, (byte)22, arg6, arg0, class788.field11482[var12]);
                        --var12;
                     }

                     int var13 = arg6 - arg5;
                     int var14 = arg1 + arg5;
                     int var15 = var9;
                     if (!var8) {
                        if (!var8 && var9 > var10) {
                           return;
                        }

                        do {
                           int[] var16 = class788.field11482[var15];
                           class100.method989(arg1, (byte)22, var14, arg0, var16);
                           class100.method989(var14, (byte)22, var13, arg7, var16);
                           class100.method989(var13, (byte)22, arg6, arg0, var16);
                           ++var15;
                        } while(var15 <= var10);

                        return;
                     }

                     --var12;
                  }
               }
            } else {
               var10000 = arg1;
               var10001 = 22;
            }

            class100.method989(var10000, var10001, arg6, arg0, class788.field11482[var11]);
            ++var11;
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field7990[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(II[BIIII)V"
   )
   public static final void method4180(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field10022;

      try {
         ++field7980;
         if (arg1 > 0 && !class122.method1209(arg1, arg3 ^ -122)) {
            throw new IllegalArgumentException("");
         } else if (~arg5 < -1 && !class122.method1209(arg5, -23)) {
            throw new IllegalArgumentException("");
         } else {
            int var8 = class104.method1022((byte)113, arg0);
            int var9 = arg3;
            int var10 = ~arg5 >= ~arg1 ? arg5 : arg1;
            int var11 = arg1 >> 1;
            int var12 = arg5 >> 1;
            byte[] var13 = arg2;
            byte[] var14 = new byte[var11 * var12 * var8];

            while(true) {
               OpenGL.glTexImage2Dub(arg6, var9, arg4, arg1, arg5, 0, arg0, 5121, var13, 0);
               if (~var10 >= -2) {
                  return;
               }

               int var10000;
               label97: {
                  int var15 = arg1 * var8;
                  byte[] var16 = var14;
                  int var17 = 0;
                  if (var7) {
                     var10000 = var17;
                  } else if (~var17 <= ~var8) {
                     var14 = var13;
                     var13 = var16;
                     arg1 = var11;
                     arg5 = var12;
                     var11 >>= 1;
                     var12 >>= 1;
                     ++var9;
                     var10000 = var10 >> 1;
                     if (!var7) {
                        break label97;
                     }
                  } else {
                     var10000 = var17;
                  }

                  while(true) {
                     int var18 = var10000;
                     int var19 = var17;
                     int var20 = var15 + var17;
                     int var21 = 0;
                     if (var7 || ~var21 > ~var12) {
                        do {
                           label91: {
                              int var22 = 0;
                              if (var7) {
                                 var10000 = var13[var19];
                              } else if (var22 >= var11) {
                                 var19 += var15;
                                 var10000 = var15 + var20;
                                 if (!var7) {
                                    break label91;
                                 }
                              } else {
                                 var10000 = var13[var19];
                              }

                              while(true) {
                                 int var23 = var10000;
                                 int var24 = var8 + var19;
                                 int var25 = var13[var24] + var23;
                                 int var26 = var13[var20] + var25;
                                 var19 = var8 + var24;
                                 int var27 = var8 + var20;
                                 int var28 = var13[var27] + var26;
                                 var20 = var8 + var27;
                                 var14[var18] = (byte)(var28 >> 2);
                                 var18 += var8;
                                 ++var22;
                                 if (var22 >= var11) {
                                    var19 += var15;
                                    var10000 = var15 + var20;
                                    if (!var7) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var13[var19];
                                 }
                              }
                           }

                           var20 = var10000;
                           ++var21;
                        } while(~var21 > ~var12);
                     }

                     ++var17;
                     if (~var17 <= ~var8) {
                        var14 = var13;
                        var13 = var16;
                        arg1 = var11;
                        arg5 = var12;
                        var11 >>= 1;
                        var12 >>= 1;
                        ++var9;
                        var10000 = var10 >> 1;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var17;
                     }
                  }
               }

               var10 = var10000;
            }
         }
      } catch (RuntimeException var30) {
         throw class612.method4503(var30, field7990[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7990[3] : field7990[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(ILhn;)Z"
   )
   public static final boolean method4181(int arg0, class357 arg1) {
      try {
         ++field7983;
         if (arg0 > -79) {
            method4180(79, -42, (byte[])null, 19, 59, -54, -86);
         }

         return class396.field5870 == arg1 || class550.field7866 == arg1 || class13.field193 == arg1 || class522.field7369 == arg1 || class454.field6599 == arg1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7990[10] + arg0 + ',' + (arg1 != null ? field7990[3] : field7990[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class561(class678 arg0) {
      try {
         this.field7981 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7990[2] + (arg0 != null ? field7990[3] : field7990[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4182(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4183(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
