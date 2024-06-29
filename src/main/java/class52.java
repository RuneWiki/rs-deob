import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class52 extends class22 {
   @OriginalMember(
      owner = "client!gp",
      name = "w",
      descriptor = "Liaa;"
   )
   private class518 field1076;
   @OriginalMember(
      owner = "client!gp",
      name = "s",
      descriptor = "F"
   )
   public float field1079;
   @OriginalMember(
      owner = "client!gp",
      name = "j",
      descriptor = "I"
   )
   public int field1082;
   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "I"
   )
   public int field1069;
   @OriginalMember(
      owner = "client!gp",
      name = "m",
      descriptor = "I"
   )
   public int field1070;
   @OriginalMember(
      owner = "client!gp",
      name = "x",
      descriptor = "[I"
   )
   private int[] field1085;
   @OriginalMember(
      owner = "client!gp",
      name = "v",
      descriptor = "Lrk;"
   )
   private class35 field1075;
   @OriginalMember(
      owner = "client!gp",
      name = "A",
      descriptor = "I"
   )
   public int field1086;
   @OriginalMember(
      owner = "client!gp",
      name = "B",
      descriptor = "Lfaa;"
   )
   private class163 field1067;
   @OriginalMember(
      owner = "client!gp",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1087 = new String[]{method629(method628("~t4|z")), method629(method628("~t4{z")), method629(method628("~t4~z")), method629(method628("~t4zz")), method629(method628("b*4\u0017/")), method629(method628("~t4}z")), method629(method628("wqvU")), method629(method628("~t4\u0005;wmn\u0007z")), method629(method628("~t4\u007fz")), method629(method628("~t4xz"))};
   @OriginalMember(
      owner = "client!gp",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field1078 = false;
   @OriginalMember(
      owner = "client!gp",
      name = "t",
      descriptor = "I"
   )
   public static int field1071;
   @OriginalMember(
      owner = "client!gp",
      name = "n",
      descriptor = "I"
   )
   public static int field1072;
   @OriginalMember(
      owner = "client!gp",
      name = "C",
      descriptor = "I"
   )
   public static int field1073;
   @OriginalMember(
      owner = "client!gp",
      name = "y",
      descriptor = "I"
   )
   public static int field1074;
   @OriginalMember(
      owner = "client!gp",
      name = "l",
      descriptor = "I"
   )
   public static int field1077;
   @OriginalMember(
      owner = "client!gp",
      name = "p",
      descriptor = "I"
   )
   public static int field1083;
   @OriginalMember(
      owner = "client!gp",
      name = "u",
      descriptor = "Ljia;"
   )
   private class642 field1084;
   @OriginalMember(
      owner = "client!gp",
      name = "o",
      descriptor = "Ltn;"
   )
   public static class94 field1080;
   @OriginalMember(
      owner = "client!gp",
      name = "r",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field1081;
   @OriginalMember(
      owner = "client!gp",
      name = "k",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field1068;

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(II)V",
      line = 10
   )
   public final void method621(int arg0, int arg1) {
      try {
         if (arg0 != 17992) {
            this.field1067 = null;
         }

         ++field1083;
         this.field1081.method5086();
         class77 var3 = this.field1075.method266(4, false, this.field1068, arg1 * 4, (byte)3);
         this.field1084 = new class642(var3, 5121, 4, 0);
         this.field1081 = null;
         this.field1068 = null;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1087[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(FBIII)V",
      line = 27
   )
   public final void method622(float arg0, byte arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4564;

      try {
         if (~this.field1070 != 0) {
            class693 var7 = this.field1075.field1192.method1456(-8988, this.field1070);
            int var8 = var7.field10154 & 255;
            if (var8 != 0 && var7.field10167 != 4) {
               label109: {
                  int var9;
                  label105: {
                     if (~arg2 > -1) {
                        var9 = 0;
                        if (!var6) {
                           break label105;
                        }
                     }

                     if (arg2 > 127) {
                        var9 = 16777215;
                        if (!var6) {
                           break label105;
                        }
                     }

                     var9 = arg2 * 131586;
                  }

                  if (var8 == 256) {
                     arg3 = var9;
                     if (!var6) {
                        break label109;
                     }
                  }

                  int var11 = -var8 + 256;
                  arg3 = ((var9 & 65280) * var8 - -((arg3 & 65280) * var11) & 16711680) + ((arg3 & 16711935) * var11 + (16711935 & var9) * var8 & -16711936) >> 8;
               }
            }

            int var12 = var7.field10170 & 255;
            if (var12 != 0) {
               var12 += 256;
               int var13 = ((16711680 & arg3) >> 16) * var12;
               if (var13 > 65535) {
                  var13 = 65535;
               }

               int var14 = (255 & arg3 >> 8) * var12;
               if (var14 > 65535) {
                  var14 = 65535;
               }

               int var15 = (arg3 & 255) * var12;
               if (var15 > 65535) {
                  var15 = 65535;
               }

               arg3 = (65280 & var14) + ((var13 & -1392443648) << 8) + (var15 >> 8);
            }
         }

         ++field1077;
         if (arg1 > -106) {
            field1078 = false;
         }

         if (arg0 != 1.0F) {
            int var17;
            int var18;
            int var19;
            label76: {
               int var16 = 255 & arg3 >> 16;
               var17 = (arg3 & 65487) >> 8;
               var18 = (int)((float)var16 * arg0);
               var19 = arg3 & 255;
               if (var18 >= 0) {
                  if (var18 <= 255) {
                     break label76;
                  }

                  var18 = 255;
                  if (!var6) {
                     break label76;
                  }
               }

               var18 = 0;
            }

            int var20;
            int var21;
            label69: {
               var20 = (int)((float)var17 * arg0);
               var21 = (int)((float)var19 * arg0);
               if (~var20 > -1) {
                  var20 = 0;
                  if (!var6) {
                     break label69;
                  }
               }

               if (var20 > 255) {
                  var20 = 255;
               }
            }

            label64: {
               if (~var21 > -1) {
                  var21 = 0;
                  if (!var6) {
                     break label64;
                  }
               }

               if (~var21 < -256) {
                  var21 = 255;
               }
            }

            arg3 = var21 | var18 << 16 | var20 << 8;
         }

         this.field1081.method5085(arg4 * 4);
         this.field1081.method5084((byte)(arg3 >> 16));
         this.field1081.method5084((byte)(arg3 >> 8));
         this.field1081.method5084((byte)arg3);
      } catch (RuntimeException var23) {
         throw class608.method4462(var23, field1087[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "b",
      descriptor = "(II)V",
      line = 139
   )
   public final void method623(int arg0, int arg1) {
      try {
         ++field1074;
         this.field1068 = this.field1075.field724.method5080(arg0 * 4, true);
         if (arg1 > 47) {
            this.field1081 = new Stream(this.field1068);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1087[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(IB[I)V",
      line = 152
   )
   public final void method624(int arg0, byte arg1, int[] arg2) {
      boolean var4 = client.field4564;

      try {
         int var5;
         class543 var6;
         int var8;
         int var10000;
         label215: {
            ++field1072;
            var5 = 0;
            var6 = this.field1075.field845;
            int var7 = -79 / ((56 - arg1) / 47);
            var6.field6907 = 0;
            if (!this.field1075.field807) {
               var8 = 0;
               if (var4 || arg0 > var8) {
                  do {
                     int var9 = arg2[var8];
                     int var10 = this.field1085[var9];
                     short[] var11 = this.field1076.field7541[var9];
                     if (var10 != 0) {
                        if (var11 == null) {
                           ++var8;
                        } else {
                           int var12 = 0;
                           int var13 = 0;
                           if (!var4 && ~var13 <= ~var11.length) {
                              ++var8;
                           } else {
                              do {
                                 if ((var10 & 1 << var12++) != 0) {
                                    var6.method3582(-81, 65535 & var11[var13++]);
                                    ++var5;
                                    var6.method3582(113, 65535 & var11[var13++]);
                                    ++var5;
                                    var6.method3582(87, 65535 & var11[var13++]);
                                    ++var5;
                                    if (var4) {
                                       var13 += 3;
                                    }
                                 } else {
                                    var13 += 3;
                                 }
                              } while(~var13 > ~var11.length);

                              ++var8;
                           }
                        }
                     } else {
                        ++var8;
                     }
                  } while(arg0 > var8);
               }

               if (!var4) {
                  var10000 = ~var5;
                  if (!var4) {
                     if (var10000 < -1) {
                        this.field1067.method1488(var6.field6889, 5123, -15857, var6.field6907);
                        this.field1075.method423((byte)-87, this.field1084, this.field1076.field7564, this.field1076.field7565, this.field1076.field7560);
                        this.field1075.method412(~(this.field1076.field7549 & 7) != -1, this.field1070, (8 & this.field1076.field7549) != 0, (byte)-57);
                        if (this.field1075.field836) {
                           this.field1075.method325(Integer.MAX_VALUE, this.field1086, this.field1069, this.field1082);
                        }

                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPushMatrix();
                        OpenGL.glScalef(1.0F / this.field1079, 1.0F / this.field1079, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field1075.method423((byte)-78, this.field1084, this.field1076.field7564, this.field1076.field7565, this.field1076.field7560);
                        this.field1075.method384(this.field1067, var5, (byte)-94, 0, 4);
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
                        return;
                     }

                     return;
                  }
                  break label215;
               }
            }

            var8 = 0;
            if (var4) {
               var10000 = arg2[var8];
            } else if (~arg0 >= ~var8) {
               var10000 = ~var5;
               if (!var4) {
                  if (var10000 < -1) {
                     this.field1067.method1488(var6.field6889, 5123, -15857, var6.field6907);
                     this.field1075.method423((byte)-87, this.field1084, this.field1076.field7564, this.field1076.field7565, this.field1076.field7560);
                     this.field1075.method412(~(this.field1076.field7549 & 7) != -1, this.field1070, (8 & this.field1076.field7549) != 0, (byte)-57);
                     if (this.field1075.field836) {
                        this.field1075.method325(Integer.MAX_VALUE, this.field1086, this.field1069, this.field1082);
                     }

                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(1.0F / this.field1079, 1.0F / this.field1079, 1.0F);
                     OpenGL.glMatrixMode(5888);
                     this.field1075.method423((byte)-78, this.field1084, this.field1076.field7564, this.field1076.field7565, this.field1076.field7560);
                     this.field1075.method384(this.field1067, var5, (byte)-94, 0, 4);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg2[var8];
            }
         }

         while(true) {
            int var14 = var10000;
            short[] var15 = this.field1076.field7541[var14];
            int var16 = this.field1085[var14];
            if (var16 == 0) {
               ++var8;
            } else if (var15 == null) {
               ++var8;
            } else {
               int var17 = 0;
               int var18 = 0;
               if (var4) {
                  if (~(1 << var17++ & var16) != -1) {
                     var6.method3550(65535 & var15[var18++], 29620);
                     ++var5;
                     ++var5;
                     var6.method3550(65535 & var15[var18++], 29620);
                     var6.method3550(65535 & var15[var18++], 29620);
                     ++var5;
                     if (var4) {
                        var18 += 3;
                     }
                  } else {
                     var18 += 3;
                  }
               }

               while(var15.length > var18) {
                  if (~(1 << var17++ & var16) != -1) {
                     var6.method3550(65535 & var15[var18++], 29620);
                     ++var5;
                     ++var5;
                     var6.method3550(65535 & var15[var18++], 29620);
                     var6.method3550(65535 & var15[var18++], 29620);
                     ++var5;
                     if (var4) {
                        var18 += 3;
                     }
                  } else {
                     var18 += 3;
                  }
               }

               ++var8;
            }

            if (~arg0 >= ~var8) {
               var10000 = ~var5;
               if (!var4) {
                  if (var10000 < -1) {
                     this.field1067.method1488(var6.field6889, 5123, -15857, var6.field6907);
                     this.field1075.method423((byte)-87, this.field1084, this.field1076.field7564, this.field1076.field7565, this.field1076.field7560);
                     this.field1075.method412(~(this.field1076.field7549 & 7) != -1, this.field1070, (8 & this.field1076.field7549) != 0, (byte)-57);
                     if (this.field1075.field836) {
                        this.field1075.method325(Integer.MAX_VALUE, this.field1086, this.field1069, this.field1082);
                     }

                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(1.0F / this.field1079, 1.0F / this.field1079, 1.0F);
                     OpenGL.glMatrixMode(5888);
                     this.field1075.method423((byte)-78, this.field1084, this.field1076.field7564, this.field1076.field7565, this.field1076.field7560);
                     this.field1075.method384(this.field1067, var5, (byte)-94, 0, 4);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg2[var8];
            }
         }
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field1087[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1087[4] : field1087[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(I)V",
      line = 278
   )
   public static void method625(int arg0) {
      try {
         field1080 = null;
         if (arg0 != 15818) {
            field1080 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1087[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "b",
      descriptor = "(BI)V",
      line = 294
   )
   public final void method626(byte arg0, int arg1) {
      try {
         if (arg0 != 32) {
            this.field1070 = -95;
         }

         ++field1071;
         this.field1081.method5085(arg1 * 4 - -3);
         this.field1081.method5084(-1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1087[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(IIBI)V",
      line = 309
   )
   public final void method627(int arg0, int arg1, byte arg2, int arg3) {
      try {
         if (arg2 <= -81) {
            ++field1073;
            this.field1085[this.field1076.field4080 * arg1 - -arg3] = class93.method899(this.field1085[this.field1076.field4080 * arg1 - -arg3], 1 << arg0);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1087[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "<init>",
      descriptor = "(Liaa;IIIII)V",
      line = 321
   )
   public class52(class518 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field1076 = arg0;
         this.field1079 = (float)arg2;
         this.field1082 = arg5;
         this.field1069 = arg4;
         this.field1070 = arg1;
         this.field1085 = new int[this.field1076.field4080 * this.field1076.field4077];
         this.field1075 = this.field1076.field7537;
         this.field1086 = arg3;
         this.field1067 = new class163(this.field1075, 5123, (byte[])null, 1);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1087[7] + (arg0 != null ? field1087[4] : field1087[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method628(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method629(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
