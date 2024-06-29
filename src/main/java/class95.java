import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public abstract class class95 extends class80 {
   @OriginalMember(
      owner = "client!iia",
      name = "v",
      descriptor = "S"
   )
   public short field1266;
   @OriginalMember(
      owner = "client!iia",
      name = "y",
      descriptor = "S"
   )
   public short field1268;
   @OriginalMember(
      owner = "client!iia",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1270 = new String[]{method894(method893("D\u001eN\u000e\u0000\u0005")), method894(method893("VY\u0001\u000e9")), method894(method893("C\u0002CL")), method894(method893("D\u001eN\u000e\u000e\u0005")), method894(method893("D\u001eN\u000e\u0001\u0005")), method894(method893("D\u001eN\u000e\u0001l_")), method894(method893("D\u001eN\u000e\u0007l_")), method894(method893("G\u0016HG(")), method894(method893("D\u001eN\u000e\u000b\u0005")), method894(method893("D\u001eN\u000e\u0006l_")), method894(method893("D\u001eN\u000e\u000fl_")), method894(method893("D\u001eN\u000e\bl_")), method894(method893("D\u001eN\u000e\u000el_")), method894(method893("D\u001eN\u000e\u0015l_")), method894(method893("D\u001eN\u000e\u000bl_")), method894(method893("D\u001eN\u000exD\u0019FTz\u0005")), method894(method893("D\u001eN\u000e\u0014l_"))};
   @OriginalMember(
      owner = "client!iia",
      name = "F",
      descriptor = "Z"
   )
   public static boolean field1265 = false;
   @OriginalMember(
      owner = "client!iia",
      name = "J",
      descriptor = "I"
   )
   public static int field1254;
   @OriginalMember(
      owner = "client!iia",
      name = "K",
      descriptor = "I"
   )
   public static int field1255;
   @OriginalMember(
      owner = "client!iia",
      name = "x",
      descriptor = "I"
   )
   public static int field1256;
   @OriginalMember(
      owner = "client!iia",
      name = "w",
      descriptor = "I"
   )
   public static int field1257;
   @OriginalMember(
      owner = "client!iia",
      name = "I",
      descriptor = "I"
   )
   public static int field1258;
   @OriginalMember(
      owner = "client!iia",
      name = "D",
      descriptor = "I"
   )
   public static int field1259;
   @OriginalMember(
      owner = "client!iia",
      name = "C",
      descriptor = "I"
   )
   public static int field1260;
   @OriginalMember(
      owner = "client!iia",
      name = "H",
      descriptor = "I"
   )
   public static int field1261;
   @OriginalMember(
      owner = "client!iia",
      name = "A",
      descriptor = "I"
   )
   public static int field1262;
   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "I"
   )
   public static int field1263;
   @OriginalMember(
      owner = "client!iia",
      name = "G",
      descriptor = "I"
   )
   public static int field1267;
   @OriginalMember(
      owner = "client!iia",
      name = "B",
      descriptor = "I"
   )
   public static int field1269;
   @OriginalMember(
      owner = "client!iia",
      name = "E",
      descriptor = "Lqh;"
   )
   public static class74 field1264;

   @OriginalMember(
      owner = "client!iia",
      name = "l",
      descriptor = "(I)V"
   )
   public static final void method885(int arg0) {
      boolean var1 = client.field4273;

      try {
         label39: {
            if (~class445.field6162 != -4) {
               if (~class445.field6162 != -8) {
                  if (class445.field6162 == 9) {
                     class397.method3019(67, 10);
                     if (!var1) {
                        break label39;
                     }
                  }

                  if (~class445.field6162 != -12) {
                     break label39;
                  }

                  class397.method3019(42, 12);
                  if (!var1) {
                     break label39;
                  }
               }

               class397.method3019(arg0 ^ 31, 8);
               if (!var1) {
                  break label39;
               }
            }

            class397.method3019(arg0 ^ 48, 4);
         }

         if (arg0 != 1) {
            field1265 = true;
         }

         ++field1260;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1270[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "j",
      descriptor = "(I)V"
   )
   public static final void method886(int arg0) {
      try {
         if (arg0 != 0) {
            field1264 = null;
         }

         if (class444.field6156 != null) {
            class444.field6156.method5570(-24);
         }

         ++field1256;
         if (class353.field5045 != null) {
            while(true) {
               try {
                  class353.field5045.join();
                  return;
               } catch (InterruptedException var2) {
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1270[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "([Loda;I)I"
   )
   public final int method401(class127[] arg0, int arg1) {
      try {
         ++field1269;
         if (arg1 != 1) {
            method891(-123, -28, -83, 92, -26, 15, -90, 40);
         }

         return this.method781(arg0, super.field999 >> class76.field965, (byte)-96, super.field1003 >> class76.field965);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1270[6] + (arg0 != null ? field1270[1] : field1270[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(Ld;Lqh;ILjava/awt/Canvas;Z)Lha;"
   )
   public static final class65 method887(class160 arg0, class74 arg1, int arg2, Canvas arg3, boolean arg4) {
      try {
         ++field1267;
         if (!class4.method29(255)) {
            throw new RuntimeException("");
         } else if (!class280.method2139(116, field1270[7])) {
            throw new RuntimeException("");
         } else {
            OpenGL var5 = new OpenGL();
            if (arg4) {
               field1265 = false;
            }

            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg2);
            if (~var6 == -1L) {
               throw new RuntimeException("");
            } else {
               class632 var8 = new class632(var5, arg3, var6, arg0, arg1, arg2);
               var8.method2495(-60);
               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field1270[8] + (arg0 != null ? field1270[1] : field1270[2]) + ',' + (arg1 != null ? field1270[1] : field1270[2]) + ',' + arg2 + ',' + (arg3 != null ? field1270[1] : field1270[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "b",
      descriptor = "(ZLha;)Z"
   )
   public final boolean method402(boolean arg0, class65 arg1) {
      try {
         if (!arg0) {
            return false;
         } else {
            ++field1255;
            return class239.method1794(super.field1005, super.field999 >> class76.field965, this.method782(68), super.field1003 >> class76.field965, -14401);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1270[5] + arg0 + ',' + (arg1 != null ? field1270[1] : field1270[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method397(int arg0) {
      try {
         ++field1259;
         if (arg0 != 0) {
            method892(-6);
         }

         return class426.field5961[(super.field999 >> class76.field965) + -class367.field5174 + class224.field2812][(super.field1003 >> class76.field965) + -class406.field5720 + class224.field2812];
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1270[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(II[F)[F"
   )
   public static final float[] method888(int arg0, int arg1, float[] arg2) {
      try {
         ++field1254;
         float[] var3 = new float[arg1];
         if (arg0 > -22) {
            field1265 = false;
         }

         class714.method5197(arg2, 0, var3, 0, arg1);
         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1270[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1270[1] : field1270[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "([Lu;II)V"
   )
   public static final void method889(class80[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class80 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field993;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field993 < (var7 & 1) + var6) {
               class80 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method889(arg0, arg1, var4 - 1);
         method889(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!iia",
      name = "k",
      descriptor = "(I)V"
   )
   public static final void method890(int arg0) {
      try {
         class15.field197.method797(-122);
         ++field1263;
         class604.field8418.method1698(true);
         class604.field8418.field2788.field8243 = 0;
         class604.field8418.field2796 = null;
         class604.field8418.field2797 = null;
         class273.field3651 = 0;
         class604.field8418.field2799 = null;
         class604.field8418.field2792 = 0;
         class188.method1428((byte)-83);
         if (arg0 == -16141) {
            class209.field2582 = 0;
            class593.field8197 = 0;
            class369.field5203 = null;
            class335.field4810 = null;
            class394.field5563 = null;
            class575.field7912 = null;
            class197.field2388 = 0;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1270[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method768(int arg0) {
      try {
         ++field1257;
         if (arg0 <= 110) {
            this.method783(103, (class80)null, 67, 99, false, -107, (class65)null);
         }

         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1270[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4273;

      try {
         ++field1261;
         int var9 = arg7;
         int var10 = arg3;
         int var11 = 0;
         int var12 = -arg5 + arg6;
         int var13 = -arg5 + arg3;
         int var14 = arg6 * arg6;
         int var15 = arg3 * arg3;
         int var16 = var12 * var12;
         int var17 = var13 * var13;
         int var18 = var15 << 1;
         int var19 = var14 << 1;
         int var20 = var17 << 1;
         int var21 = var16 << 1;
         int var22 = arg3 << 1;
         int var23 = var13 << 1;
         int var24 = (-var22 + 1) * var14 + var18;
         int var25 = -((var22 + -1) * var19) + var15;
         int var26 = (-var23 + 1) * var16 + var20;
         int var27 = -((var23 - 1) * var21) + var17;
         int var28 = var14 << 2;
         int var29 = var15 << 2;
         int var30 = var16 << 2;
         int var31 = var17 << 2;
         int var32 = var18 * 3;
         int var33 = (var22 + -3) * var19;
         int var34 = var20 * 3;
         int var35 = (var23 + -3) * var21;
         int var36 = var29;
         int var37 = (arg3 - 1) * var28;
         int var38 = var31;
         if (~class478.field6604 >= ~arg2 && arg2 <= class313.field4171) {
            int[] var39 = class17.field236[arg2];
            int var40 = class138.method1159(-arg6 + arg4, class663.field9442, (byte)-44, class265.field3451);
            int var41 = class138.method1159(arg4 + arg6, class663.field9442, (byte)-44, class265.field3451);
            int var42 = class138.method1159(-var12 + arg4, class663.field9442, (byte)-44, class265.field3451);
            int var43 = class138.method1159(arg4 + var12, class663.field9442, (byte)-44, class265.field3451);
            class125.method1046(arg7 + -23355, var42, var39, arg0, var40);
            class125.method1046(-23355, var43, var39, arg1, var42);
            class125.method1046(-23355, var41, var39, arg0, var43);
         }

         int var44 = (var13 + -1) * var30;
         boolean var10000;
         if (var8) {
            var10000 = arg3 <= var13;
         } else {
            if (~arg3 >= -1) {
               return;
            }

            var10000 = arg3 <= var13;
         }

         while(true) {
            while(true) {
               boolean var45 = var10000;
               if (var45) {
                  label206: {
                     if (var26 < 0) {
                        if (var8) {
                           var27 += var38;
                           var26 += var34;
                           var38 += var31;
                           ++var11;
                           var34 += var31;
                        }
                     } else {
                        if (!var8) {
                           if (var27 < 0) {
                              var26 += var34;
                              var27 += var38;
                              ++var11;
                              var34 += var31;
                              var38 += var31;
                           }

                           var27 += -var35;
                           var26 += -var44;
                           var44 -= var30;
                           var35 -= var30;
                           break label206;
                        }

                        var34 = var27;
                     }

                     while(true) {
                        while(var26 < 0) {
                           var27 += var38;
                           var26 += var34;
                           var38 += var31;
                           ++var11;
                           var34 += var31;
                        }

                        if (!var8) {
                           if (var27 < 0) {
                              var26 += var34;
                              var27 += var38;
                              ++var11;
                              var34 += var31;
                              var38 += var31;
                           }

                           var27 += -var35;
                           var26 += -var44;
                           var44 -= var30;
                           var35 -= var30;
                           break;
                        }

                        var34 = var27;
                     }
                  }
               }

               byte var10001;
               int var56;
               label168: {
                  if (~var24 > -1) {
                     if (var8) {
                        var24 += var32;
                        var25 += var36;
                        var36 += var29;
                        ++var9;
                        var32 += var29;
                     }
                  } else {
                     var56 = ~var25;
                     var10001 = -1;
                     if (!var8) {
                        break label168;
                     }

                     var32 = var56 + -1;
                  }

                  while(true) {
                     while(~var24 > -1) {
                        var24 += var32;
                        var25 += var36;
                        var36 += var29;
                        ++var9;
                        var32 += var29;
                     }

                     var56 = ~var25;
                     var10001 = -1;
                     if (!var8) {
                        break;
                     }

                     var32 = var56 + -1;
                  }
               }

               if (var56 > var10001) {
                  var24 += var32;
                  var25 += var36;
                  var36 += var29;
                  ++var9;
                  var32 += var29;
               }

               var25 += -var33;
               var24 += -var37;
               var37 -= var28;
               --var10;
               var33 -= var28;
               int var46 = -var10 + arg2;
               int var47 = arg2 - -var10;
               if (~var47 <= ~class478.field6604) {
                  int var57 = class313.field4171;
                  if (var8) {
                     var10000 = var46 <= var57;
                     continue;
                  }

                  if (var46 <= var57) {
                     label200: {
                        int var48 = class138.method1159(arg4 + var9, class663.field9442, (byte)-44, class265.field3451);
                        int var49 = class138.method1159(-var9 + arg4, class663.field9442, (byte)-44, class265.field3451);
                        if (!var45) {
                           if (~class478.field6604 >= ~var46) {
                              class125.method1046(arg7 ^ -23355, var48, class17.field236[var46], arg0, var49);
                           }

                           if (~var47 < ~class313.field4171) {
                              break label200;
                           }

                           class125.method1046(-23355, var48, class17.field236[var47], arg0, var49);
                           if (!var8) {
                              break label200;
                           }
                        }

                        int var50 = class138.method1159(arg4 + var11, class663.field9442, (byte)-44, class265.field3451);
                        int var51 = class138.method1159(-var11 + arg4, class663.field9442, (byte)-44, class265.field3451);
                        if (class478.field6604 <= var46) {
                           int[] var52 = class17.field236[var46];
                           class125.method1046(-23355, var51, var52, arg0, var49);
                           class125.method1046(-23355, var50, var52, arg1, var51);
                           class125.method1046(arg7 ^ -23355, var48, var52, arg0, var50);
                        }

                        if (class313.field4171 >= var47) {
                           int[] var53 = class17.field236[var47];
                           class125.method1046(-23355, var51, var53, arg0, var49);
                           class125.method1046(arg7 + -23355, var50, var53, arg1, var51);
                           class125.method1046(-23355, var48, var53, arg0, var50);
                        }
                     }
                  }
               }

               if (~var10 >= -1) {
                  return;
               }

               var10000 = var10 <= var13;
            }
         }
      } catch (RuntimeException var55) {
         throw class534.method3846(var55, field1270[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "m",
      descriptor = "(I)V"
   )
   public static void method892(int arg0) {
      try {
         if (arg0 != -3) {
            method890(52);
         }

         field1264 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1270[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(ILu;IIZILha;)V"
   )
   public final void method783(int arg0, class80 arg1, int arg2, int arg3, boolean arg4, int arg5, class65 arg6) {
      try {
         if (arg3 != -1) {
            this.field1266 = 22;
         }

         ++field1258;
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field1270[3] + arg0 + ',' + (arg1 != null ? field1270[1] : field1270[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1270[1] : field1270[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method771(int arg0) {
      try {
         if (arg0 <= 24) {
            method889((class80[])null, 51, -93);
         }

         ++field1262;
         return false;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1270[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         super.field999 = arg0;
         super.field1005 = (byte)arg4;
         super.field998 = arg1;
         super.field1001 = (byte)arg3;
         super.field1003 = arg2;
         this.field1266 = (short)arg6;
         this.field1268 = (short)arg5;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field1270[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method893(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method894(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
