import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public abstract class class688 extends class731 {
   @OriginalMember(
      owner = "client!sv",
      name = "D",
      descriptor = "S"
   )
   public short field10144;
   @OriginalMember(
      owner = "client!sv",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10145 = new String[]{method5027(method5026("O\u0016\u0018\u001eL")), method5027(method5026("ZMZ\\")), method5027(method5026("GN\u0018w\u0019")), method5027(method5026("GN\u0018\u007f\u0019")), method5027(method5026("GN\u0018\fXZQB\u000e\u0019")), method5027(method5026("GN\u0018a\u0019")), method5027(method5026("GN\u0018s\u0019")), method5027(method5026("GN\u0018u\u0019")), method5027(method5026("GN\u0018~\u0019"))};
   @OriginalMember(
      owner = "client!sv",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field10140 = new int[13];
   @OriginalMember(
      owner = "client!sv",
      name = "E",
      descriptor = "Z"
   )
   public static boolean field10137 = false;
   @OriginalMember(
      owner = "client!sv",
      name = "C",
      descriptor = "I"
   )
   public static int field10138;
   @OriginalMember(
      owner = "client!sv",
      name = "F",
      descriptor = "I"
   )
   public static int field10139;
   @OriginalMember(
      owner = "client!sv",
      name = "A",
      descriptor = "I"
   )
   public static int field10141;
   @OriginalMember(
      owner = "client!sv",
      name = "G",
      descriptor = "I"
   )
   public static int field10142;
   @OriginalMember(
      owner = "client!sv",
      name = "H",
      descriptor = "I"
   )
   public static int field10143;

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(IIIBI[B)V",
      line = 6
   )
   public static final void method5022(int arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5) {
      boolean var6 = client.field4360;

      try {
         ++field10139;
         if (~arg4 > ~arg2) {
            arg0 += arg4;
            if (arg3 != 74) {
               method5025(-74);
            }

            arg1 = arg2 - arg4 >> 2;
            int var9;
            if (var6) {
               var9 = arg0 + 1;
               arg5[arg0] = 1;
               int var10 = var9 + 1;
               arg5[var9] = 1;
               int var11 = var10 + 1;
               arg5[var10] = 1;
               arg0 = var11 + 1;
               arg5[var11] = 1;
            }

            while(true) {
               while(true) {
                  --arg1;
                  if (arg1 < 0) {
                     arg1 = arg2 - arg4 & 3;
                     if (!var6) {
                        if (!var6) {
                           --arg1;
                           if (arg1 < 0) {
                              return;
                           }
                        }

                        do {
                           arg5[arg0++] = 1;
                           --arg1;
                        } while(arg1 >= 0);

                        return;
                     }

                     arg5[arg0++] = 1;
                  } else {
                     var9 = arg0 + 1;
                     arg5[arg0] = 1;
                     arg5[var9++] = 1;
                     arg5[var9++] = 1;
                     arg0 = var9 + 1;
                     arg5[var9] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10145[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10145[0] : field10145[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(ZLha;)Z",
      line = 45
   )
   public final boolean method1762(boolean arg0, class66 arg1) {
      try {
         if (arg0) {
            return false;
         } else {
            ++field10142;
            return class227.method1768(super.field10694 >> class773.field11359, super.field10693 >> class773.field11359, (byte)7, this, super.field10702);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10145[7] + arg0 + ',' + (arg1 != null ? field10145[0] : field10145[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "i",
      descriptor = "(B)Z",
      line = 57
   )
   public final boolean method1764(byte arg0) {
      try {
         if (arg0 != -78) {
            field10140 = null;
         }

         ++field10143;
         return class506.field7334[(super.field10694 >> class773.field11359) + -class712.field10385 - -class106.field1335][(super.field10693 >> class773.field11359) + class106.field1335 + -class377.field5453];
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10145[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "h",
      descriptor = "(I)V",
      line = 68
   )
   public static final void method5023(int arg0) {
      class215.field3081 = arg0;

      for(int var1 = 0; var1 < class457.field6539; ++var1) {
         for(int var2 = 0; var2 < class16.field190; ++var2) {
            if (class663.field9659[arg0][var1][var2] == null) {
               class663.field9659[arg0][var1][var2] = new class517(arg0);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "([Lmn;Z)I",
      line = 91
   )
   public final int method1763(class389[] arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         int var4;
         int var5;
         int var6;
         label115: {
            ++field10141;
            var4 = super.field10694 >> class773.field11359;
            var5 = super.field10693 >> class773.field11359;
            var6 = 0;
            if (class712.field10385 != var4) {
               if (class712.field10385 >= var4) {
                  break label115;
               }

               var6 += 2;
               if (!var3) {
                  break label115;
               }
            }

            ++var6;
         }

         label108: {
            if (class377.field5453 == var5) {
               var6 += 3;
               if (!var3) {
                  break label108;
               }
            }

            if (~var5 > ~class377.field5453) {
               var6 += 6;
            }
         }

         int var7 = class132.field1695[var6];
         if ((this.field10144 & var7) != 0) {
            return this.method5323(var4, 87, var5, arg0);
         } else if (~this.field10144 == -2 && ~var4 < -1) {
            return this.method5323(var4 + -1, 78, var5, arg0);
         } else if (~this.field10144 == -5 && class457.field6539 >= var4) {
            return this.method5323(var4 - -1, -116, var5, arg0);
         } else if (this.field10144 == 8 && var5 > 0) {
            return this.method5323(var4, 110, var5 - 1, arg0);
         } else if (~this.field10144 == -3 && ~var5 >= ~class16.field190) {
            return this.method5323(var4, 77, var5 + 1, arg0);
         } else {
            if (!arg1) {
               method5025(-96);
            }

            if (~this.field10144 == -17 && ~var4 < -1 && ~class16.field190 <= ~var5) {
               return this.method5323(var4 + -1, 50, var5 + 1, arg0);
            } else if (~this.field10144 == -33 && ~var4 >= ~class457.field6539 && var5 <= class16.field190) {
               return this.method5323(var4 + 1, -62, var5 + 1, arg0);
            } else if (this.field10144 == 128 && var4 > 0 && ~var5 < -1) {
               return this.method5323(var4 + -1, 93, var5 - 1, arg0);
            } else if (~this.field10144 == -65 && ~class457.field6539 <= ~var4 && var5 > 0) {
               return this.method5323(var4 + 1, 124, var5 + -1, arg0);
            } else {
               throw new RuntimeException("");
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field10145[2] + (arg0 != null ? field10145[0] : field10145[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "([IBIIIIII)V",
      line = 176
   )
   public static final void method5024(int[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4360;

      try {
         ++field10138;
         if (arg1 >= -93) {
            field10140 = null;
         }

         if (arg2 > 0 && !class471.method3415(arg2, true)) {
            throw new IllegalArgumentException("");
         } else if (~arg3 < -1 && !class471.method3415(arg3, true)) {
            throw new IllegalArgumentException("");
         } else if (arg5 != 32993) {
            throw new IllegalArgumentException("");
         } else {
            int var9 = 0;
            int var10 = arg3 > arg2 ? arg2 : arg3;
            int var11 = arg2 >> 1;
            int var12 = arg3 >> 1;
            int[] var13 = arg0;
            int[] var14 = new int[var11 * var12];

            while(true) {
               OpenGL.glTexImage2Di(arg7, var9, arg6, arg2, arg3, 0, arg5, arg4, var13, 0);
               if (~var10 >= -2) {
                  return;
               }

               int var10000;
               label92: {
                  int var15 = 0;
                  int var16 = 0;
                  int var17 = arg2 + var16;
                  int[] var18 = var14;
                  int var19 = 0;
                  if (var8) {
                     var10000 = 0;
                  } else if (var12 <= var19) {
                     var14 = var13;
                     arg2 = var11;
                     arg3 = var12;
                     var13 = var18;
                     var11 >>= 1;
                     var12 >>= 1;
                     ++var9;
                     var10000 = var10 >> 1;
                     if (!var8) {
                        break label92;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     label89: {
                        int var20 = var10000;
                        if (var8) {
                           var10000 = var13[var16++];
                        } else if (~var11 >= ~var20) {
                           var17 += arg2;
                           var10000 = arg2 + var16;
                           if (!var8) {
                              break label89;
                           }
                        } else {
                           var10000 = var13[var16++];
                        }

                        while(true) {
                           int var21 = var10000;
                           int var22 = var13[var16++];
                           int var23 = var13[var17++];
                           int var24 = var21 >> 24 & 255;
                           int var25 = 255 & var21 >> 16;
                           int var26 = var13[var17++];
                           int var27 = (65340 & var21) >> 8;
                           int var28 = var21 & 255;
                           int var29 = (255 & var22 >> 8) + var27;
                           int var30 = (255 & var22 >> 24) + var24;
                           int var31 = (255 & var22) + var28;
                           int var32 = (255 & var22 >> 16) + var25;
                           int var33 = (var23 >> 24 & 255) + var30;
                           int var34 = ((65337 & var23) >> 8) + var29;
                           int var35 = (var23 >> 16 & 255) + var32;
                           int var36 = (255 & var23) + var31;
                           int var37 = ((65283 & var26) >> 8) + var34;
                           int var38 = (255 & var26 >> 16) + var35;
                           int var39 = (255 & var26) + var36;
                           int var40 = (var26 >> 24 & 255) + var33;
                           var14[var15++] = class300.method2238(class556.method3988(var39 >> 2, 255), class300.method2238(class300.method2238(class556.method3988(var40, 1020) << 22, class556.method3988(16711680, var38 << 14)), class556.method3988(65280, var37 << 6)));
                           ++var20;
                           if (~var11 >= ~var20) {
                              var17 += arg2;
                              var10000 = arg2 + var16;
                              if (!var8) {
                                 break;
                              }
                           } else {
                              var10000 = var13[var16++];
                           }
                        }
                     }

                     var16 = var10000;
                     ++var19;
                     if (var12 <= var19) {
                        var14 = var13;
                        arg2 = var11;
                        arg3 = var12;
                        var13 = var18;
                        var11 >>= 1;
                        var12 >>= 1;
                        ++var9;
                        var10000 = var10 >> 1;
                        if (!var8) {
                           break;
                        }
                     } else {
                        var10000 = 0;
                     }
                  }
               }

               var10 = var10000;
            }
         }
      } catch (RuntimeException var42) {
         throw class237.method1823(var42, field10145[5] + (arg0 != null ? field10145[0] : field10145[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "g",
      descriptor = "(I)V",
      line = 286
   )
   public static void method5025(int arg0) {
      try {
         field10140 = null;
         if (arg0 != 32338) {
            field10140 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10145[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 295
   )
   public class688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field10693 = arg2;
         super.field10694 = arg0;
         super.field10701 = (byte)arg3;
         super.field10702 = (byte)arg4;
         this.field10144 = (short)arg5;
         super.field10697 = arg1;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10145[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5026(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5027(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
