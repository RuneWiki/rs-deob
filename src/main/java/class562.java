import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class562 extends class247 {
   @OriginalMember(
      owner = "client!nl",
      name = "x",
      descriptor = "Ljea;"
   )
   private class6 field7991;
   @OriginalMember(
      owner = "client!nl",
      name = "A",
      descriptor = "I"
   )
   public int field7994;
   @OriginalMember(
      owner = "client!nl",
      name = "w",
      descriptor = "F"
   )
   public float field8000;
   @OriginalMember(
      owner = "client!nl",
      name = "v",
      descriptor = "I"
   )
   public int field7997;
   @OriginalMember(
      owner = "client!nl",
      name = "n",
      descriptor = "I"
   )
   public int field8008;
   @OriginalMember(
      owner = "client!nl",
      name = "r",
      descriptor = "Laea;"
   )
   private class678 field7993;
   @OriginalMember(
      owner = "client!nl",
      name = "k",
      descriptor = "[I"
   )
   private int[] field8006;
   @OriginalMember(
      owner = "client!nl",
      name = "B",
      descriptor = "I"
   )
   public int field7999;
   @OriginalMember(
      owner = "client!nl",
      name = "u",
      descriptor = "Lkb;"
   )
   private class101 field7995;
   @OriginalMember(
      owner = "client!nl",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8011 = new String[]{method4192(method4191("as\u0004\u0015a")), method4192(method4191("as\u0004\u0010a")), method4192(method4191("as\u0004\u0016a")), method4192(method4191("t1\u0004z4")), method4192(method4191("as\u0004\u0011a")), method4192(method4191("ajF8")), method4192(method4191("as\u0004\u0017a")), method4192(method4191("as\u0004h av^ja")), method4192(method4191("as\u0004\u0012a")), method4192(method4191("as\u0004\u0013a"))};
   @OriginalMember(
      owner = "client!nl",
      name = "s",
      descriptor = "S"
   )
   public static short field7992 = 320;
   @OriginalMember(
      owner = "client!nl",
      name = "o",
      descriptor = "Ljq;"
   )
   public static class211 field8001 = null;
   @OriginalMember(
      owner = "client!nl",
      name = "j",
      descriptor = "I"
   )
   public static int field7996;
   @OriginalMember(
      owner = "client!nl",
      name = "y",
      descriptor = "I"
   )
   public static int field7998;
   @OriginalMember(
      owner = "client!nl",
      name = "C",
      descriptor = "I"
   )
   public static int field8002;
   @OriginalMember(
      owner = "client!nl",
      name = "m",
      descriptor = "I"
   )
   public static int field8004;
   @OriginalMember(
      owner = "client!nl",
      name = "q",
      descriptor = "I"
   )
   public static int field8005;
   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "I"
   )
   public static int field8010;
   @OriginalMember(
      owner = "client!nl",
      name = "l",
      descriptor = "Lwu;"
   )
   private class451 field8009;
   @OriginalMember(
      owner = "client!nl",
      name = "p",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field8007;
   @OriginalMember(
      owner = "client!nl",
      name = "t",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field8003;

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(IBII)V"
   )
   public final void method4184(int arg0, byte arg1, int arg2, int arg3) {
      try {
         this.field8006[this.field7991.field10665 * arg3 + arg0] = class91.method932(this.field8006[this.field7991.field10665 * arg3 + arg0], 1 << arg2);
         ++field8005;
         if (arg1 != -28) {
            this.field7999 = -112;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8011[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "([III)V"
   )
   public final void method4185(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         int var5;
         class637 var6;
         int var7;
         int var10000;
         label231: {
            ++field8004;
            var5 = 0;
            var6 = this.field7993.field9816;
            var6.field945 = 0;
            if (this.field7993.field9826) {
               var7 = 0;
               if (var4 || ~arg2 < ~var7) {
                  do {
                     int var8 = arg0[var7];
                     short[] var9 = this.field7991.field71[var8];
                     int var10 = this.field8006[var8];
                     if (var10 != 0) {
                        if (var9 == null) {
                           ++var7;
                        } else {
                           int var11 = 0;
                           int var12 = 0;
                           if (!var4 && ~var9.length >= ~var12) {
                              ++var7;
                           } else {
                              do {
                                 if ((var10 & 1 << var11++) != 0) {
                                    ++var5;
                                    var6.method653(var9[var12++] & 65535, -100);
                                    ++var5;
                                    var6.method653(65535 & var9[var12++], arg1 ^ -65417);
                                    var6.method653(65535 & var9[var12++], -99);
                                    ++var5;
                                    if (var4) {
                                       var12 += 3;
                                    }
                                 } else {
                                    var12 += 3;
                                 }
                              } while(~var9.length < ~var12);

                              ++var7;
                           }
                        }
                     } else {
                        ++var7;
                     }
                  } while(~arg2 < ~var7);
               }

               if (!var4) {
                  var10000 = arg1;
                  if (!var4) {
                     if (arg1 != 65535) {
                        return;
                     }

                     if (var5 > 0) {
                        this.field7995.method996(5123, var6.field942, -89, var6.field945);
                        this.field7993.method4946(-16068, this.field8009, this.field7991.field106, this.field7991.field118, this.field7991.field119);
                        this.field7993.method4901((byte)-9, (8 & this.field7991.field78) != 0, this.field7994, ~(7 & this.field7991.field78) != -1);
                        if (this.field7993.field9792) {
                           this.field7993.method250(Integer.MAX_VALUE, this.field8008, this.field7999, this.field7997);
                        }

                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPushMatrix();
                        OpenGL.glScalef(1.0F / this.field8000, 1.0F / this.field8000, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field7993.method4946(-16068, this.field8009, this.field7991.field106, this.field7991.field118, this.field7991.field119);
                        this.field7993.method4952(126, 4, var5, 0, this.field7995);
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glPopMatrix();
                        OpenGL.glMatrixMode(5888);
                        return;
                     }

                     return;
                  }
                  break label231;
               }
            }

            var7 = 0;
            if (var4) {
               var10000 = arg0[var7];
            } else if (~arg2 >= ~var7) {
               var10000 = arg1;
               if (!var4) {
                  if (arg1 != 65535) {
                     return;
                  }

                  if (var5 > 0) {
                     this.field7995.method996(5123, var6.field942, -89, var6.field945);
                     this.field7993.method4946(-16068, this.field8009, this.field7991.field106, this.field7991.field118, this.field7991.field119);
                     this.field7993.method4901((byte)-9, (8 & this.field7991.field78) != 0, this.field7994, ~(7 & this.field7991.field78) != -1);
                     if (this.field7993.field9792) {
                        this.field7993.method250(Integer.MAX_VALUE, this.field8008, this.field7999, this.field7997);
                     }

                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(1.0F / this.field8000, 1.0F / this.field8000, 1.0F);
                     OpenGL.glMatrixMode(5888);
                     this.field7993.method4946(-16068, this.field8009, this.field7991.field106, this.field7991.field118, this.field7991.field119);
                     this.field7993.method4952(126, 4, var5, 0, this.field7995);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg0[var7];
            }
         }

         while(true) {
            int var13 = var10000;
            short[] var14 = this.field7991.field71[var13];
            int var15 = this.field8006[var13];
            if (var15 == 0) {
               ++var7;
            } else if (var14 == null) {
               ++var7;
            } else {
               int var16 = 0;
               int var17 = 0;
               if (var4) {
                  if (~(var15 & 1 << var16++) != -1) {
                     ++var5;
                     var6.method695(65535 & var14[var17++], (byte)-109);
                     var6.method695(var14[var17++] & 65535, (byte)-82);
                     ++var5;
                     var6.method695(var14[var17++] & 65535, (byte)-76);
                     ++var5;
                     if (var4) {
                        var17 += 3;
                     }
                  } else {
                     var17 += 3;
                  }
               }

               while(~var14.length < ~var17) {
                  if (~(var15 & 1 << var16++) != -1) {
                     ++var5;
                     var6.method695(65535 & var14[var17++], (byte)-109);
                     var6.method695(var14[var17++] & 65535, (byte)-82);
                     ++var5;
                     var6.method695(var14[var17++] & 65535, (byte)-76);
                     ++var5;
                     if (var4) {
                        var17 += 3;
                     }
                  } else {
                     var17 += 3;
                  }
               }

               ++var7;
            }

            if (~arg2 >= ~var7) {
               var10000 = arg1;
               if (!var4) {
                  if (arg1 != 65535) {
                     return;
                  }

                  if (var5 > 0) {
                     this.field7995.method996(5123, var6.field942, -89, var6.field945);
                     this.field7993.method4946(-16068, this.field8009, this.field7991.field106, this.field7991.field118, this.field7991.field119);
                     this.field7993.method4901((byte)-9, (8 & this.field7991.field78) != 0, this.field7994, ~(7 & this.field7991.field78) != -1);
                     if (this.field7993.field9792) {
                        this.field7993.method250(Integer.MAX_VALUE, this.field8008, this.field7999, this.field7997);
                     }

                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(1.0F / this.field8000, 1.0F / this.field8000, 1.0F);
                     OpenGL.glMatrixMode(5888);
                     this.field7993.method4946(-16068, this.field8009, this.field7991.field106, this.field7991.field118, this.field7991.field119);
                     this.field7993.method4952(126, 4, var5, 0, this.field7995);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg0[var7];
            }
         }
      } catch (RuntimeException var19) {
         throw class612.method4503(var19, field8011[4] + (arg0 != null ? field8011[3] : field8011[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method4186(byte arg0, int arg1) {
      try {
         int var3 = 46 % ((arg0 - 25) / 35);
         this.field8007.method3176(arg1 * 4 + 3);
         ++field7998;
         this.field8007.method3183(-1);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8011[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method4187(int arg0, byte arg1) {
      try {
         this.field8003 = this.field7993.field9685.method3170(arg0 * 4, true);
         ++field8002;
         this.field8007 = new Stream(this.field8003);
         int var3 = 33 / ((arg1 - 2) / 54);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8011[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4188(int arg0) {
      try {
         if (arg0 <= 30) {
            field8001 = null;
         }

         field8001 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8011[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method4189(int arg0, byte arg1) {
      try {
         this.field8007.method3187();
         ++field8010;
         if (arg1 != -124) {
            this.field8009 = null;
         }

         class516 var3 = this.field7993.method4897(this.field8003, false, 4, arg0 * 4, (byte)45);
         this.field8009 = new class451(var3, 5121, 4, 0);
         this.field8007 = null;
         this.field8003 = null;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8011[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(IBIIF)V"
   )
   public final void method4190(int arg0, byte arg1, int arg2, int arg3, float arg4) {
      boolean var6 = client.field10022;

      try {
         ++field7996;
         if (~this.field7994 != 0) {
            class390 var7 = this.field7993.field240.method2043(-128, this.field7994);
            int var8 = var7.field5679 & 255;
            if (~var8 != -1 && ~var7.field5668 != -5) {
               label109: {
                  int var9;
                  label105: {
                     if (arg3 < 0) {
                        var9 = 0;
                        if (!var6) {
                           break label105;
                        }
                     }

                     if (arg3 <= 127) {
                        var9 = arg3 * 131586;
                        if (!var6) {
                           break label105;
                        }
                     }

                     var9 = 16777215;
                  }

                  if (~var8 != -257) {
                     int var11 = -var8 + 256;
                     arg0 = (16711680 & (arg0 & 65280) * var11 + (var9 & 65280) * var8) + ((16711935 & arg0) * var11 + (var9 & 16711935) * var8 & -16711936) >> 8;
                     if (!var6) {
                        break label109;
                     }
                  }

                  arg0 = var9;
               }
            }

            int var12 = 255 & var7.field5677;
            if (var12 != 0) {
               var12 += 256;
               int var13 = (arg0 >> 16 & 255) * var12;
               if (var13 > 65535) {
                  var13 = 65535;
               }

               int var14 = (arg0 >> 8 & 255) * var12;
               if (var14 > 65535) {
                  var14 = 65535;
               }

               int var15 = (255 & arg0) * var12;
               if (var15 > 65535) {
                  var15 = 65535;
               }

               arg0 = (var15 >> 8) + (var13 << 8 & 16711897) + (65280 & var14);
            }
         }

         this.field8007.method3176(arg2 * 4);
         if (arg1 != 93) {
            this.field8008 = -10;
         }

         if (arg4 != 1.0F) {
            int var17;
            int var18;
            int var19;
            label76: {
               int var16 = arg0 >> 16 & 255;
               var17 = 255 & arg0 >> 8;
               var18 = 255 & arg0;
               var19 = (int)((float)var16 * arg4);
               if (~var19 > -1) {
                  var19 = 0;
                  if (!var6) {
                     break label76;
                  }
               }

               if (var19 > 255) {
                  var19 = 255;
               }
            }

            int var20;
            int var21;
            label71: {
               var20 = (int)((float)var17 * arg4);
               var21 = (int)((float)var18 * arg4);
               if (var20 >= 0) {
                  if (var20 <= 255) {
                     break label71;
                  }

                  var20 = 255;
                  if (!var6) {
                     break label71;
                  }
               }

               var20 = 0;
            }

            label64: {
               if (~var21 > -1) {
                  var21 = 0;
                  if (!var6) {
                     break label64;
                  }
               }

               if (var21 > 255) {
                  var21 = 255;
               }
            }

            arg0 = var21 | var19 << 16 | var20 << 8;
         }

         this.field8007.method3183((byte)(arg0 >> 16));
         this.field8007.method3183((byte)(arg0 >> 8));
         this.field8007.method3183((byte)arg0);
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field8011[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "<init>",
      descriptor = "(Ljea;IIIII)V"
   )
   public class562(class6 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field7991 = arg0;
         this.field7994 = arg1;
         this.field8000 = (float)arg2;
         this.field7997 = arg5;
         this.field8008 = arg3;
         this.field7993 = this.field7991.field92;
         this.field8006 = new int[this.field7991.field10666 * this.field7991.field10665];
         this.field7999 = arg4;
         this.field7995 = new class101(this.field7993, 5123, (byte[])null, 1);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8011[7] + (arg0 != null ? field8011[3] : field8011[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4191(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4192(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
