import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class232 extends class529 {
   @OriginalMember(
      owner = "client!nt",
      name = "p",
      descriptor = "Lae;"
   )
   private class262 field2953;
   @OriginalMember(
      owner = "client!nt",
      name = "f",
      descriptor = "Lll;"
   )
   private class383 field2957;
   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2960 = new String[]{method1752(method1751("\u0019dVV\r")), method1752(method1751("\u0019dVY\r")), method1752(method1751("\u0019dVQ\r")), method1752(method1751("\u0019dVW\r")), method1752(method1751("\u0019dVU\r")), method1752(method1751("\u0019dVZ\r")), method1752(method1751("\f>V>X")), method1752(method1751("\u0019e\u0014|")), method1752(method1751("\u0019dVT\r")), method1752(method1751("\u0019dVX\r")), method1752(method1751("\u0019dV,L\u0019y\f.\r")), method1752(method1751("\u0019dVS\r")), method1752(method1751("\u0019dVR\r"))};
   @OriginalMember(
      owner = "client!nt",
      name = "e",
      descriptor = "Lsd;"
   )
   public static class101 field2952 = new class101(69, 6);
   @OriginalMember(
      owner = "client!nt",
      name = "j",
      descriptor = "I"
   )
   public static int field2945;
   @OriginalMember(
      owner = "client!nt",
      name = "d",
      descriptor = "I"
   )
   public static int field2946;
   @OriginalMember(
      owner = "client!nt",
      name = "l",
      descriptor = "I"
   )
   public static int field2947;
   @OriginalMember(
      owner = "client!nt",
      name = "r",
      descriptor = "I"
   )
   public static int field2948;
   @OriginalMember(
      owner = "client!nt",
      name = "h",
      descriptor = "I"
   )
   public static int field2949;
   @OriginalMember(
      owner = "client!nt",
      name = "n",
      descriptor = "I"
   )
   public static int field2950;
   @OriginalMember(
      owner = "client!nt",
      name = "m",
      descriptor = "I"
   )
   public static int field2951;
   @OriginalMember(
      owner = "client!nt",
      name = "o",
      descriptor = "I"
   )
   public static int field2954;
   @OriginalMember(
      owner = "client!nt",
      name = "i",
      descriptor = "I"
   )
   public static int field2955;
   @OriginalMember(
      owner = "client!nt",
      name = "k",
      descriptor = "I"
   )
   public static int field2958;
   @OriginalMember(
      owner = "client!nt",
      name = "g",
      descriptor = "I"
   )
   public static int field2959;
   @OriginalMember(
      owner = "client!nt",
      name = "q",
      descriptor = "Lsea;"
   )
   public static class725 field2956;

   @OriginalMember(
      owner = "client!nt",
      name = "<init>",
      descriptor = "(Lck;Lae;)V",
      line = 5
   )
   public class232(class667 arg0, class262 arg1) {
      super(arg0);

      try {
         this.field2953 = arg1;
         this.field2957 = new class383(arg0, 2);
         this.field2957.method2949(false, 0);
         super.field7700.method4828(1, (byte)66);
         if (this.field2953.field3579) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
         }

         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glTexGeni(8193, 9472, 9216);
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         super.field7700.method4828(0, (byte)66);
         this.field2957.method2946(407554050);
         this.field2957.method2949(false, 1);
         super.field7700.method4828(1, (byte)66);
         if (this.field2953.field3579) {
            OpenGL.glDisable(3170);
         }

         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         super.field7700.method4828(0, (byte)66);
         this.field2957.method2946(407554050);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2960[10] + (arg0 != null ? field2960[6] : field2960[7]) + ',' + (arg1 != null ? field2960[6] : field2960[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "b",
      descriptor = "(IZ)V",
      line = 37
   )
   public final void method872(int arg0, boolean arg1) {
      try {
         if (arg0 >= 12) {
            ++field2951;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2960[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(ILbca;I)V",
      line = 50
   )
   public final void method870(int arg0, class689 arg1, int arg2) {
      try {
         ++field2948;
         super.field7700.method4818((byte)-126, arg1);
         super.field7700.method4796(false, arg0);
         if (arg2 != -1) {
            field2945 = 96;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2960[12] + arg0 + ',' + (arg1 != null ? field2960[6] : field2960[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(III)V",
      line = 62
   )
   public final void method871(int arg0, int arg1, int arg2) {
      int var4 = client.field4530;

      try {
         float var5;
         float var7;
         float var8;
         label34: {
            ++field2955;
            var5 = (float)((arg0 & 3) - -1) * -5.0E-4F;
            int var6 = 28 % ((75 - arg1) / 37);
            var7 = (float)(((arg0 & 28) >> 3) + 1) * 5.0E-4F;
            var8 = ~(arg0 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
            super.field7700.method4828(1, (byte)66);
            boolean var9 = ~(128 & arg0) != -1;
            if (var9) {
               class744.field11026[0] = var8;
               class744.field11026[2] = 0.0F;
               class744.field11026[1] = 0.0F;
               class744.field11026[3] = 0.0F;
               if (var4 == 0) {
                  break label34;
               }
            }

            class744.field11026[3] = 0.0F;
            class744.field11026[0] = 0.0F;
            class744.field11026[2] = var8;
            class744.field11026[1] = 0.0F;
         }

         label29: {
            OpenGL.glTexGenfv(8192, 9474, class744.field11026, 0);
            class744.field11026[2] = 0.0F;
            class744.field11026[1] = var8;
            class744.field11026[3] = (float)super.field7700.field9898 * var5 % 1.0F;
            class744.field11026[0] = 0.0F;
            OpenGL.glTexGenfv(8193, 9474, class744.field11026, 0);
            if (!this.field2953.field3579) {
               int var10 = (int)((float)super.field7700.field9898 * var7 * 16.0F);
               super.field7700.method4818((byte)-124, this.field2953.field3578[var10 % 16]);
               if (var4 == 0) {
                  break label29;
               }
            }

            class744.field11026[0] = 0.0F;
            class744.field11026[2] = 0.0F;
            class744.field11026[1] = 0.0F;
            class744.field11026[3] = (float)super.field7700.field9898 * var7 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class744.field11026, 0);
         }

         super.field7700.method4828(0, (byte)66);
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field2960[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(IBILad;Lhja;Lha;)Z",
      line = 117
   )
   public static final boolean method1747(int arg0, byte arg1, int arg2, class446 arg3, class426 arg4, class66 arg5) {
      int var6 = client.field4530;

      try {
         ++field2954;
         int var7 = Integer.MAX_VALUE;
         int var8 = Integer.MIN_VALUE;
         int var9 = Integer.MAX_VALUE;
         int var10 = Integer.MIN_VALUE;
         if (arg4.field6493 != null) {
            var9 = -((arg4.field6511 - -arg3.field6777 + -class329.field4697) * (-class329.field4691 + class329.field4692) / (-class329.field4697 + class329.field4685)) + class329.field4692;
            var7 = (class329.field4694 - class329.field4695) * (arg3.field6780 + arg4.field6512 + -class329.field4705) / (-class329.field4705 + class329.field4686) + class329.field4695;
            var8 = (arg4.field6484 - (-arg3.field6780 + class329.field4705)) * (-class329.field4695 + class329.field4694) / (-class329.field4705 + class329.field4686) + class329.field4695;
            var10 = -((arg4.field6518 - (-arg3.field6777 - -class329.field4697)) * (-class329.field4691 + class329.field4692) / (-class329.field4697 + class329.field4685)) + class329.field4692;
         }

         class396 var11 = null;
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         if (~arg4.field6515 != 0) {
            if (arg3.field6779 && ~arg4.field6467 != 0) {
               var11 = arg4.method3237(-100, arg5, true);
            } else {
               var11 = arg4.method3237(-79, arg5, false);
            }

            if (var11 != null) {
               var12 = arg3.field6784 - (var11.method1971() + 1 >> 1);
               if (var12 < var7) {
                  var7 = var12;
               }

               var13 = arg3.field6784 - -(var11.method1971() + 1 >> 1);
               var14 = arg3.field6782 + -(var11.method1975() + 1 >> 1);
               if (var8 < var13) {
                  var8 = var13;
               }

               var15 = arg3.field6782 + (var11.method1975() + 1 >> 1);
               if (~var14 > ~var9) {
                  var9 = var14;
               }

               if (~var15 < ~var10) {
                  var10 = var15;
               }
            }
         }

         class464 var16 = null;
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         int var20 = 0;
         if (arg1 != 30) {
            return true;
         } else {
            int var21 = 0;
            int var22 = 0;
            int var23 = 0;
            int var24 = 0;
            if (arg4.field6485 != null) {
               var16 = class255.method1920((byte)-102, arg4.field6502);
               if (var16 != null) {
                  label165: {
                     var17 = class595.field8772.method5525(false, arg4.field6485, (int[])null, class288.field4046, (class396[])null);
                     var18 = (-class329.field4695 + class329.field4694) * arg4.field6472 / (-class329.field4705 + class329.field4686) + arg3.field6784;
                     var19 = arg3.field6782 - (-class329.field4691 + class329.field4692) * arg4.field6513 / (-class329.field4697 + class329.field4685);
                     if (var11 != null) {
                        var19 -= (var11.method1975() >> 1) - -(var17 * var16.method3466());
                        if (var6 == 0) {
                           break label165;
                        }
                     }

                     var19 -= var17 * var16.method3469() / 2;
                  }

                  int var25 = 0;
                  if (var6 != 0 || var25 < var17) {
                     do {
                        String var26 = class288.field4046[var25];
                        if (~(var17 + -1) < ~var25) {
                           var26 = var26.substring(0, var26.length() - 4);
                        }

                        int var27 = var16.method3471(var26);
                        if (var27 > var20) {
                           var20 = var27;
                        }

                        ++var25;
                     } while(var25 < var17);
                  }

                  var21 = arg0 + var18 + -(var20 / 2);
                  if (~var7 < ~var21) {
                     var7 = var21;
                  }

                  var22 = var20 / 2 + var18 + arg0;
                  var23 = arg2 + var19;
                  if (var22 > var8) {
                     var8 = var22;
                  }

                  if (var9 > var23) {
                     var9 = var23;
                  }

                  var24 = var16.method3466() * var17 + var19 + arg2;
                  if (~var10 > ~var24) {
                     var10 = var24;
                  }
               }
            }

            if (~var8 <= ~class329.field4695 && class329.field4694 >= var7 && ~class329.field4691 >= ~var10 && ~class329.field4692 <= ~var9) {
               class329.method2492(arg5, arg3, arg4);
               if (var11 != null) {
                  if (class705.field10553 > 0 && (class379.field5799 != -1 && class379.field5799 == arg3.field6786 || ~class606.field8893 != 0 && ~class606.field8893 == ~arg4.field6481)) {
                     int var28;
                     label136: {
                        if (~class283.field3936 >= -51) {
                           var28 = class283.field3936 * 2;
                           if (var6 == 0) {
                              break label136;
                           }
                        }

                        var28 = (-class283.field3936 + 100) * 2;
                     }

                     int var29 = 16776960 | var28 << 24;
                     arg5.method642(var11.method1965() / 2 - -7, arg3.field6782, arg1 + -29, var29, arg3.field6784);
                     arg5.method642(5 + var11.method1965() / 2, arg3.field6782, 1, var29, arg3.field6784);
                     arg5.method642(var11.method1965() / 2 + 3, arg3.field6782, 1, var29, arg3.field6784);
                     arg5.method642(1 + var11.method1965() / 2, arg3.field6782, 1, var29, arg3.field6784);
                     arg5.method642(var11.method1965() / 2, arg3.field6782, 1, var29, arg3.field6784);
                  }

                  var11.method3035(arg3.field6784 + -(var11.method1971() >> 1), arg3.field6782 - (var11.method1975() >> 1));
               }

               if (arg4.field6485 != null && var16 != null) {
                  class628.method4528(var20, arg3, 92, arg5, var16, var19, arg4, var17, var18);
               }

               if (arg4.field6515 != -1 || arg4.field6485 != null) {
                  class476 var30 = new class476(arg3);
                  var30.field7083 = var24;
                  var30.field7077 = var15;
                  var30.field7079 = var13;
                  var30.field7076 = var14;
                  var30.field7081 = var23;
                  var30.field7082 = var22;
                  var30.field7075 = var21;
                  var30.field7080 = var12;
                  class100.field1216.method4060(23, var30);
               }

               return false;
            } else {
               return true;
            }
         }
      } catch (RuntimeException var32) {
         throw class670.method4877(var32, field2960[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2960[6] : field2960[7]) + ',' + (arg4 != null ? field2960[6] : field2960[7]) + ',' + (arg5 != null ? field2960[6] : field2960[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "b",
      descriptor = "(I)V",
      line = 307
   )
   public final void method874(int arg0) {
      try {
         ++field2959;
         this.field2957.method2948('\u0001', (byte)-69);
         super.field7700.method4828(arg0, (byte)66);
         super.field7700.method4818((byte)-121, (class689)null);
         super.field7700.method4828(0, (byte)66);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2960[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(B)V",
      line = 320
   )
   public static void method1748(byte arg0) {
      try {
         field2952 = null;
         field2956 = null;
         if (arg0 != 87) {
            field2956 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2960[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "d",
      descriptor = "(I)V",
      line = 332
   )
   public static final void method1749(int arg0) {
      try {
         ++field2946;

         try {
            if (class627.field9106 == 1) {
               label57: {
                  int var1 = class663.field9609.method451(-1);
                  if (~var1 < -1 && class663.field9609.method449((byte)-35)) {
                     int var2 = var1 - class357.field5407;
                     if (var2 < 0) {
                        var2 = 0;
                     }

                     class663.field9609.method436(var2, -35);
                     return;
                  }

                  class663.field9609.method437(-1);
                  class663.field9609.method434(false);
                  class205.field2633 = null;
                  class208.field2654 = null;
                  if (class67.field837 == null) {
                     class627.field9106 = 0;
                     if (client.field4530 == 0) {
                        break label57;
                     }
                  }

                  class627.field9106 = 2;
               }
            }

            if (~class627.field9106 == -4) {
               int var3 = class663.field9609.method451(-1);
               if (class9.field136 > var3 && class663.field9609.method449((byte)-35)) {
                  int var4 = class552.field8185 + var3;
                  if (class9.field136 < var4) {
                     var4 = class9.field136;
                  }

                  class663.field9609.method436(var4, -120);
                  return;
               }

               class552.field8185 = 0;
               class627.field9106 = 0;
            }

            if (arg0 <= 94) {
               method1748((byte)86);
            }
         } catch (Exception var7) {
            var7.printStackTrace();
            class663.field9609.method437(-1);
            class67.field837 = null;
            class660.field9563 = null;
            class208.field2654 = null;
            class205.field2633 = null;
            class627.field9106 = 0;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2960[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(IZ)V",
      line = 403
   )
   public final void method878(int arg0, boolean arg1) {
      try {
         ++field2950;
         this.field2957.method2948('\u0000', (byte)-69);
         if (this.field2953.field3579) {
            super.field7700.method4828(1, (byte)66);
            super.field7700.method4818((byte)-127, this.field2953.field3577);
            super.field7700.method4828(0, (byte)66);
         }

         if (arg0 != 0) {
            this.method873(37);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2960[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "([BI)V",
      line = 424
   )
   public static final void method1750(byte[] param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nt",
      name = "c",
      descriptor = "(I)Z",
      line = 510
   )
   public final boolean method873(int arg0) {
      try {
         if (arg0 != 0) {
            return true;
         } else {
            ++field2958;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2960[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1751(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1752(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
