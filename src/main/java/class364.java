import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class364 implements class421 {
   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "Lrj;"
   )
   private class782 field5065 = class206.field2625;
   @OriginalMember(
      owner = "client!df",
      name = "u",
      descriptor = "Lwn;"
   )
   public class576 field5053;
   @OriginalMember(
      owner = "client!df",
      name = "o",
      descriptor = "I"
   )
   public int field5055;
   @OriginalMember(
      owner = "client!df",
      name = "p",
      descriptor = "Ldja;"
   )
   public class45 field5056;
   @OriginalMember(
      owner = "client!df",
      name = "c",
      descriptor = "I"
   )
   private int field5057;
   @OriginalMember(
      owner = "client!df",
      name = "m",
      descriptor = "Z"
   )
   private boolean field5070;
   @OriginalMember(
      owner = "client!df",
      name = "b",
      descriptor = "Llea;"
   )
   public class574 field5058;
   @OriginalMember(
      owner = "client!df",
      name = "g",
      descriptor = "I"
   )
   private int field5060;
   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5072 = new String[]{method2877(method2876("b:`rv")), method2877(method2876("b:`qv")), method2877(method2876("b:`pv")), method2877(method2876("b:`\u007fv")), method2877(method2876("}r`\u0012#")), method2877(method2876("h)\"P")), method2877(method2876("b:`uv")), method2877(method2876("b:`\u00007h5:\u0002v")), method2877(method2876("b:`{v")), method2877(method2876("r9\"Y~")), method2877(method2876("b:`zv")), method2877(method2876("b:`xv")), method2877(method2876("b:`Z7h=\"U$ct")), method2877(method2876("b:`tv")), method2877(method2876("b:`}v")), method2877(method2876("b:`yv")), method2877(method2876("b:`vv"))};
   @OriginalMember(
      owner = "client!df",
      name = "k",
      descriptor = "I"
   )
   public static int field5052 = 0;
   @OriginalMember(
      owner = "client!df",
      name = "t",
      descriptor = "Ll;"
   )
   public static class292 field5066 = new class292("", 18);
   @OriginalMember(
      owner = "client!df",
      name = "n",
      descriptor = "I"
   )
   public static int field5050;
   @OriginalMember(
      owner = "client!df",
      name = "h",
      descriptor = "I"
   )
   public static int field5051;
   @OriginalMember(
      owner = "client!df",
      name = "e",
      descriptor = "I"
   )
   public static int field5054;
   @OriginalMember(
      owner = "client!df",
      name = "s",
      descriptor = "I"
   )
   public static int field5059;
   @OriginalMember(
      owner = "client!df",
      name = "f",
      descriptor = "I"
   )
   public static int field5061;
   @OriginalMember(
      owner = "client!df",
      name = "l",
      descriptor = "I"
   )
   public static int field5062;
   @OriginalMember(
      owner = "client!df",
      name = "d",
      descriptor = "I"
   )
   public static int field5063;
   @OriginalMember(
      owner = "client!df",
      name = "j",
      descriptor = "I"
   )
   public static int field5064;
   @OriginalMember(
      owner = "client!df",
      name = "q",
      descriptor = "I"
   )
   public static int field5067;
   @OriginalMember(
      owner = "client!df",
      name = "r",
      descriptor = "I"
   )
   public static int field5068;
   @OriginalMember(
      owner = "client!df",
      name = "v",
      descriptor = "I"
   )
   public static int field5069;
   @OriginalMember(
      owner = "client!df",
      name = "i",
      descriptor = "I"
   )
   public static int field5071;

   @OriginalMember(
      owner = "client!df",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.method2871((byte)-128);
         ++field5064;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5072[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(ZI)V"
   )
   private final void method2863(boolean arg0, int arg1) {
      try {
         if (arg0) {
            this.field5065 = null;
         }

         this.field5058.field3769 -= arg1;
         ++field5061;
         this.field5058.field3769 += this.method2869(true);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5072[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(IBII)V"
   )
   public static final void method2864(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field5069;
         if (arg1 >= -20) {
            method2870(-88);
         }

         String var4 = field5072[9] + arg3 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 63) + "," + (arg2 & 63);
         System.out.println(var4);
         class192.method1596(true, false, var4, true);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5072[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(II[BII)V"
   )
   public final void method2865(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field5063;
         if (~arg1 < -1 && !class181.method1525((byte)-16, arg1)) {
            throw new IllegalArgumentException("");
         } else if (arg4 > 0 && !class181.method1525((byte)-124, arg4)) {
            throw new IllegalArgumentException("");
         } else if (arg3 == 1) {
            int var7 = this.field5056.field576;
            int var8 = 0;
            int var9 = ~arg4 < ~arg1 ? arg1 : arg4;
            int var10 = arg1 >> 1;
            int var11 = arg4 >> 1;
            byte[] var12 = arg2;
            byte[] var13 = new byte[var7 * var10 * var11];

            while(true) {
               OpenGL.glTexImage2Dub(arg0, var8, this.method2866(false), arg1, arg4, 0, class615.method4531(-33, this.field5056), 5121, var12, 0);
               if (var9 <= 1) {
                  return;
               }

               int var10000;
               label101: {
                  int var14 = arg1 * var7;
                  byte[] var15 = var13;
                  int var16 = 0;
                  if (var6) {
                     var10000 = var16;
                  } else if (var7 <= var16) {
                     var13 = var12;
                     arg4 = var11;
                     var12 = var15;
                     arg1 = var10;
                     var11 >>= 1;
                     var9 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var6) {
                        break label101;
                     }
                  } else {
                     var10000 = var16;
                  }

                  while(true) {
                     int var17 = var10000;
                     int var18 = var16;
                     int var19 = var16 - -var14;
                     int var20 = 0;
                     if (var6 || ~var11 < ~var20) {
                        do {
                           label95: {
                              int var21 = 0;
                              if (var6) {
                                 var10000 = var12[var18];
                              } else if (var10 <= var21) {
                                 var18 += var14;
                                 var10000 = var14 + var19;
                                 if (!var6) {
                                    break label95;
                                 }
                              } else {
                                 var10000 = var12[var18];
                              }

                              while(true) {
                                 int var22 = var10000;
                                 int var23 = var7 + var18;
                                 int var24 = var12[var23] + var22;
                                 var18 = var7 + var23;
                                 int var25 = var12[var19] + var24;
                                 int var26 = var7 + var19;
                                 int var27 = var12[var26] + var25;
                                 var19 = var7 + var26;
                                 var13[var17] = (byte)(var27 >> 2);
                                 var17 += var7;
                                 ++var21;
                                 if (var10 <= var21) {
                                    var18 += var14;
                                    var10000 = var14 + var19;
                                    if (!var6) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var12[var18];
                                 }
                              }
                           }

                           var19 = var10000;
                           ++var20;
                        } while(~var11 < ~var20);
                     }

                     ++var16;
                     if (var7 <= var16) {
                        var13 = var12;
                        arg4 = var11;
                        var12 = var15;
                        arg1 = var10;
                        var11 >>= 1;
                        var9 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var16;
                     }
                  }
               }

               var10 = var10000;
               ++var8;
            }
         }
      } catch (RuntimeException var29) {
         throw class93.method866(var29, field5072[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5072[4] : field5072[5]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method2866(boolean arg0) {
      try {
         ++field5068;
         if (arg0) {
            return -32;
         } else {
            if (class576.field8541 != this.field5053) {
               if (class576.field8544 != this.field5053) {
                  if (class576.field8545 == this.field5053) {
                     if (class519.field7274 == this.field5056) {
                        return 34837;
                     }

                     if (class606.field8967 == this.field5056) {
                        return 34836;
                     }

                     if (class673.field9968 == this.field5056) {
                        return 34838;
                     }

                     if (class529.field7424 == this.field5056) {
                        return 34840;
                     }

                     if (class7.field88 == this.field5056) {
                        return 34841;
                     }

                     if (class439.field5979 == this.field5056) {
                        return 6145;
                     }
                  }
               } else {
                  if (class519.field7274 == this.field5056) {
                     return 34843;
                  }

                  if (class606.field8967 == this.field5056) {
                     return 34842;
                  }

                  if (class673.field9968 == this.field5056) {
                     return 34844;
                  }

                  if (class529.field7424 == this.field5056) {
                     return 34846;
                  }

                  if (class7.field88 == this.field5056) {
                     return 34847;
                  }

                  if (class439.field5979 == this.field5056) {
                     return 6145;
                  }
               }
            } else {
               if (class519.field7274 == this.field5056) {
                  return 6407;
               }

               if (class606.field8967 == this.field5056) {
                  return 6408;
               }

               if (class673.field9968 == this.field5056) {
                  return 6406;
               }

               if (class529.field7424 == this.field5056) {
                  return 6409;
               }

               if (class7.field88 == this.field5056) {
                  return 6410;
               }

               if (class439.field5979 == this.field5056) {
                  return 6145;
               }
            }

            throw new IllegalStateException();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5072[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(IIILlka;)V"
   )
   public static final void method2867(int arg0, int arg1, int arg2, class403 arg3) {
      class731 var4 = class254.method2039(arg0, arg1, arg2);
      if (var4 != null) {
         var4.field10649 = arg3;
         int var5 = class659.field9815 == class569.field8364 ? 1 : 0;
         if (arg3.method69((byte)118)) {
            if (arg3.method67(703)) {
               arg3.field10469 = class217.field2753[var5];
               class217.field2753[var5] = arg3;
               return;
            }

            arg3.field10469 = class127.field1637[var5];
            class127.field1637[var5] = arg3;
            class323.field4420 = true;
            return;
         }

         arg3.field10469 = class500.field6970[var5];
         class500.field6970[var5] = arg3;
      }

   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(Lrj;B)V"
   )
   public final void method2868(class782 arg0, byte arg1) {
      try {
         if (arg1 == -57) {
            ++field5067;
            if (this.field5065 != arg0) {
               this.field5065 = arg0;
               this.method2875((byte)-107);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5072[14] + (arg0 != null ? field5072[4] : field5072[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "b",
      descriptor = "(Z)I"
   )
   private final int method2869(boolean arg0) {
      try {
         ++field5071;
         int var2 = this.field5056.field576 * this.field5057 * this.field5053.field8536;
         if (!arg0) {
            this.field5058 = null;
         }

         return this.field5070 ? var2 * 4 / 3 : var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5072[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2870(int arg0) {
      try {
         field5066 = null;
         if (arg0 <= 65) {
            method2867(-98, -85, -58, (class403)null);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5072[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method2871(byte arg0) {
      try {
         ++field5054;
         if (arg0 < -113) {
            if (this.field5060 > 0) {
               this.field5058.method4303(95, this.field5060, this.method2869(true));
               this.field5060 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5072[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(III[II)V"
   )
   public final void method2872(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field5062;
         if (arg4 > 0 && !class181.method1525((byte)-70, arg4)) {
            throw new IllegalArgumentException("");
         } else if (~arg1 < -1 && !class181.method1525((byte)-122, arg1)) {
            throw new IllegalArgumentException("");
         } else if (class606.field8967 != this.field5056) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = 0;
            int var8 = ~arg4 > ~arg1 ? arg4 : arg1;
            int var9 = 67 / ((-56 - arg2) / 51);
            int var10 = arg4 >> 1;
            int var11 = arg1 >> 1;
            int[] var12 = arg3;
            int[] var13 = new int[var10 * var11];

            while(true) {
               OpenGL.glTexImage2Di(arg0, var7, this.method2866(false), arg4, arg1, 0, 32993, this.field5058.field8524, var12, 0);
               if (~var8 >= -2) {
                  return;
               }

               int var10000;
               label88: {
                  int var14 = 0;
                  int var15 = 0;
                  int var16 = arg4 + var15;
                  int var17 = 0;
                  int[] var39;
                  if (var6) {
                     var10000 = 0;
                  } else if (var17 >= var11) {
                     var39 = var13;
                     var13 = var12;
                     arg4 = var10;
                     var12 = var39;
                     arg1 = var11;
                     var11 >>= 1;
                     ++var7;
                     var10 >>= 1;
                     var10000 = var8 >> 1;
                     if (!var6) {
                        break label88;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     label85: {
                        int var18 = var10000;
                        if (var6) {
                           var10000 = var12[var15++];
                        } else if (~var10 >= ~var18) {
                           var16 += arg4;
                           var10000 = arg4 + var15;
                           if (!var6) {
                              break label85;
                           }
                        } else {
                           var10000 = var12[var15++];
                        }

                        while(true) {
                           int var19 = var10000;
                           int var20 = var12[var15++];
                           int var21 = var12[var16++];
                           int var22 = 255 & var19;
                           int var23 = 255 & var19 >> 24;
                           int var24 = (var19 & 65443) >> 8;
                           int var25 = 255 & var19 >> 16;
                           int var26 = var12[var16++];
                           int var27 = (var20 >> 16 & 255) + var25;
                           int var28 = ((var20 & 65361) >> 8) + var24;
                           int var29 = (255 & var20 >> 24) + var23;
                           int var30 = (var20 & 255) + var22;
                           int var31 = (255 & var21 >> 24) + var29;
                           int var32 = (255 & var21) + var30;
                           int var33 = ((var21 & 65529) >> 8) + var28;
                           int var34 = ((16721339 & var21) >> 16) + var27;
                           int var35 = ((var26 & 16742779) >> 16) + var34;
                           int var36 = ((65489 & var26) >> 8) + var33;
                           int var37 = (var26 >> 24 & 255) + var31;
                           int var38 = (255 & var26) + var32;
                           var13[var14++] = class2.method15(class2.method15(class2.method15(class109.method974(1020, var37) << 22, class109.method974(16711680, var35 << 14)), class109.method974(var36 << 6, 65280)), class109.method974(var38 >> 2, 255));
                           ++var18;
                           if (~var10 >= ~var18) {
                              var16 += arg4;
                              var10000 = arg4 + var15;
                              if (!var6) {
                                 break;
                              }
                           } else {
                              var10000 = var12[var15++];
                           }
                        }
                     }

                     var15 = var10000;
                     ++var17;
                     if (var17 >= var11) {
                        var39 = var13;
                        var13 = var12;
                        arg4 = var10;
                        var12 = var39;
                        arg1 = var11;
                        var11 >>= 1;
                        ++var7;
                        var10 >>= 1;
                        var10000 = var8 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = 0;
                     }
                  }
               }

               var8 = var10000;
            }
         }
      } catch (RuntimeException var41) {
         throw class93.method866(var41, field5072[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5072[4] : field5072[5]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2873(byte arg0) {
      try {
         ++field5059;
         int var2 = this.field5058.method2294(arg0 + -15523);
         int var3 = this.field5058.field8514[var2];
         if (this.field5055 != var3) {
            if (var3 != 0) {
               OpenGL.glBindTexture(var3, 0);
               OpenGL.glDisable(var3);
            }

            OpenGL.glEnable(this.field5055);
            this.field5058.field8514[var2] = this.field5055;
         }

         OpenGL.glBindTexture(this.field5055, this.field5060);
         if (arg0 != 2) {
            method2870(71);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5072[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "<init>",
      descriptor = "(Llea;ILdja;Lwn;IZ)V"
   )
   public class364(class574 arg0, int arg1, class45 arg2, class576 arg3, int arg4, boolean arg5) {
      try {
         this.field5053 = arg3;
         this.field5055 = arg1;
         this.field5056 = arg2;
         this.field5057 = arg4;
         this.field5070 = arg5;
         this.field5058 = arg0;
         OpenGL.glGenTextures(1, class745.field10870, 0);
         this.field5060 = class745.field10870[0];
         this.method2875((byte)-23);
         this.method2863(false, 0);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5072[7] + (arg0 != null ? field5072[4] : field5072[5]) + ',' + arg1 + ',' + (arg2 != null ? field5072[4] : field5072[5]) + ',' + (arg3 != null ? field5072[4] : field5072[5]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(III[FI)V"
   )
   public final void method2874(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field5050;
         if (arg2 > 0 && !class181.method1525((byte)-32, arg2)) {
            throw new IllegalArgumentException("");
         } else if (~arg4 < -1 && !class181.method1525((byte)-38, arg4)) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = this.field5056.field576;
            int var8 = arg1;
            int var9 = arg2 >= arg4 ? arg4 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg4 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var10 * var11 * var7];

            while(true) {
               OpenGL.glTexImage2Df(arg0, var8, this.method2866(false), arg2, arg4, 0, class615.method4531(arg1 ^ -63, this.field5056), 5126, var12, 0);
               if (var9 <= 1) {
                  return;
               }

               int var10000;
               label87: {
                  int var14 = arg2 * var7;
                  float[] var15 = var13;
                  int var16 = 0;
                  if (var6) {
                     var10000 = var16;
                  } else if (var16 >= var7) {
                     var13 = var12;
                     var12 = var15;
                     arg4 = var11;
                     arg2 = var10;
                     var9 >>= 1;
                     ++var8;
                     var10 >>= 1;
                     var10000 = var11 >> 1;
                     if (!var6) {
                        break label87;
                     }
                  } else {
                     var10000 = var16;
                  }

                  while(true) {
                     int var17 = var10000;
                     int var18 = var16;
                     int var19 = var16 - -var14;
                     int var20 = 0;
                     if (var6 || ~var11 < ~var20) {
                        do {
                           int var21 = 0;
                           if (var6 || ~var10 < ~var21) {
                              do {
                                 float var22 = var12[var18];
                                 int var23 = var7 + var18;
                                 float var24 = var12[var23] + var22;
                                 var18 = var7 + var23;
                                 float var25 = var12[var19] + var24;
                                 int var26 = var7 + var19;
                                 float var27 = var12[var26] + var25;
                                 var19 = var7 + var26;
                                 var13[var17] = var27 * 0.25F;
                                 var17 += var7;
                                 ++var21;
                              } while(~var10 < ~var21);
                           }

                           var19 += var14;
                           var18 += var14;
                           ++var20;
                        } while(~var11 < ~var20);
                     }

                     ++var16;
                     if (var16 >= var7) {
                        var13 = var12;
                        var12 = var15;
                        arg4 = var11;
                        arg2 = var10;
                        var9 >>= 1;
                        ++var8;
                        var10 >>= 1;
                        var10000 = var11 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var16;
                     }
                  }
               }

               var11 = var10000;
            }
         }
      } catch (RuntimeException var29) {
         throw class93.method866(var29, field5072[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5072[4] : field5072[5]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method2875(byte arg0) {
      try {
         this.field5058.method2265(this, (byte)-122);
         if (arg0 > -20) {
            this.field5053 = null;
         }

         ++field5051;
         if (class206.field2625 == this.field5065) {
            OpenGL.glTexParameteri(this.field5055, 10241, this.field5070 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5055, 10240, 9729);
         } else {
            OpenGL.glTexParameteri(this.field5055, 10241, !this.field5070 ? 9728 : 9984);
            OpenGL.glTexParameteri(this.field5055, 10240, 9728);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5072[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2876(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2877(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
