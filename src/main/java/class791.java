import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class791 extends class174 {
   @OriginalMember(
      owner = "client!f",
      name = "q",
      descriptor = "[I"
   )
   private int[] field11570;
   @OriginalMember(
      owner = "client!f",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11578 = new String[]{method5707(method5706("?,3D")), method5707(method5706("?,0D")), method5707(method5706("?,<D")), method5707(method5706("\",\\Bi")), method5707(method5706("7w\u001e\u0000")), method5707(method5706("?,#D")), method5707(method5706("?,N\u0005z0vLD")), method5707(method5706("?,\"D")), method5707(method5706("?,1D")), method5707(method5706("?,5D")), method5707(method5706("?,=D"))};
   @OriginalMember(
      owner = "client!f",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field11573 = new int[32];
   @OriginalMember(
      owner = "client!f",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field11576 = new int[32];
   @OriginalMember(
      owner = "client!f",
      name = "y",
      descriptor = "I"
   )
   public static int field11563;
   @OriginalMember(
      owner = "client!f",
      name = "A",
      descriptor = "I"
   )
   public static int field11564;
   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "I"
   )
   public static int field11565;
   @OriginalMember(
      owner = "client!f",
      name = "t",
      descriptor = "I"
   )
   public static int field11567;
   @OriginalMember(
      owner = "client!f",
      name = "x",
      descriptor = "I"
   )
   private int field11568;
   @OriginalMember(
      owner = "client!f",
      name = "w",
      descriptor = "I"
   )
   public static int field11569;
   @OriginalMember(
      owner = "client!f",
      name = "v",
      descriptor = "I"
   )
   public static int field11571;
   @OriginalMember(
      owner = "client!f",
      name = "u",
      descriptor = "I"
   )
   public static int field11572;
   @OriginalMember(
      owner = "client!f",
      name = "C",
      descriptor = "I"
   )
   public static int field11574;
   @OriginalMember(
      owner = "client!f",
      name = "o",
      descriptor = "I"
   )
   private int field11575;
   @OriginalMember(
      owner = "client!f",
      name = "p",
      descriptor = "[B"
   )
   private byte[] field11566;
   @OriginalMember(
      owner = "client!f",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field11577;

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1043(boolean arg0) {
      try {
         if (arg0) {
            method5705(-94, -125, -81, (class501)null, 17, 30, 15, -17, -9, -118, 81, (class61)null, (class65)null, 26);
         }

         this.field11568 = 0;
         this.field11575 = 0;
         ++field11564;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11578[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method5702(int arg0, int arg1) {
      try {
         int var2 = 33 / ((arg1 - 27) / 32);
         ++field11572;
         return (260882 & arg0) >> 11;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11578[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(IIB)V"
   )
   public void method117(int arg0, int arg1, byte arg2) {
      try {
         this.field11566[this.field11568++] = (byte)(class743.method5375(arg2 >> 1, 127) + 127);
         if (arg0 != -513) {
            field11577 = null;
         }

         ++field11563;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field11578[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method1038(byte arg0, int arg1, int arg2) {
      try {
         ++field11567;
         this.field11575 += this.field11570[arg2] * arg1 >> 12;
         if (arg0 != -81) {
            method5702(120, 11);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field11578[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(Lvi;BIIIILvi;III)V"
   )
   public static final void method5703(class569 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8, int arg9) {
      try {
         ++field11571;
         int var10 = arg0.method3067(true);
         if (var10 != -1) {
            Object var11 = null;
            class763 var12 = (class763)class661.field9435.method4239((long)var10, arg1 ^ 110);
            if (var12 == null) {
               class267[] var13 = class267.method2055(class354.field5051, var10, 0);
               if (var13 == null) {
                  return;
               }

               var12 = class338.field4832.method549(var13[0], true);
               class661.field9435.method4238(84, var12, (long)var10);
            }

            class169.method1326(arg6.field1003, arg5, arg4 >> 1, (byte)-127, arg6.field1001, 0, arg6.method3060((byte)38) * 256, arg6.field999, arg2 >> 1, arg3);
            if (arg1 != 110) {
               field11577 = null;
            }

            int var14 = class140.field1862[0] + -18 + arg8;
            int var15 = class140.field1862[1] + arg9 - 70;
            int var16 = arg7 / 4 * 18 + var14;
            int var17 = arg7 % 4 * 18 + var15;
            var12.method5482(var16, var17);
            if (arg0 == arg6) {
               class338.field4832.method575(-256, var17 + -1, 18, 18, 1, var16 + -1);
            }

            class534.method3842(0, var16 - -18, var17 + 18, var17 + -1, var16 + -1);
            class301 var18 = class611.method4447(false);
            var18.field3973 = var17;
            var18.field3966 = var17 + 16;
            var18.field3969 = var16;
            var18.field3974 = var16 + 16;
            var18.field3968 = arg0;
            class106.field1361.method3116(var18, 93);
         }
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field11578[7] + (arg0 != null ? field11578[3] : field11578[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field11578[3] : field11578[4]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method5704(int arg0) {
      try {
         field11576 = null;
         field11573 = null;
         field11577 = null;
         if (arg0 < 26) {
            field11576 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11578[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class791(int param1, int param2, int param3, int param4, int param5, float param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(IIILka;IIIIIIILmk;Lha;I)Lka;"
   )
   public static final class501 method5705(int arg0, int arg1, int arg2, class501 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class61 arg11, class65 arg12, int arg13) {
      boolean var14 = client.field4273;

      try {
         ++field11569;
         if (arg5 != 423572548) {
            field11576 = null;
         }

         if (arg3 == null) {
            return null;
         } else {
            int var15 = 2055;
            if (arg11 != null) {
               int var16 = var15 | arg11.method458(arg10, false, -128, -1);
               var15 = var16 & -513;
            }

            long var17 = ((long)arg2 << 48) + ((long)((arg1 << 16) + (arg8 << 24) + arg13) - -((long)arg6 << 32));
            class590 var19 = class588.field8104;
            class501 var20;
            synchronized(class588.field8104) {
               var20 = (class501)class588.field8104.method4239(var17, 0);
            }

            if (var20 == null || ~arg12.method540(var20.method341(), var15) != -1) {
               if (var20 != null) {
                  var15 = arg12.method503(var15, var20.method341());
               }

               byte var21;
               if (arg13 != 1) {
                  if (~arg13 == -3) {
                     var21 = 12;
                  } else if (arg13 == 3) {
                     var21 = 15;
                  } else if (arg13 != 4) {
                     var21 = 21;
                  } else {
                     var21 = 18;
                  }
               } else {
                  var21 = 9;
               }

               byte var22;
               class200 var24;
               int var25;
               int[][] var26;
               int var28;
               label191: {
                  var22 = 3;
                  int[] var23 = new int[]{64, 96, 128};
                  var24 = new class200(var21 * var22 + 1, var22 * 2 * var21 + -var21, 0);
                  var25 = var24.method1509(0, 30705, 0, 0);
                  var26 = new int[var22][var21];
                  int var27 = 0;
                  if (var14) {
                     var28 = var23[var27];
                  } else if (~var27 <= ~var22) {
                     var28 = 0;
                     if (!var14) {
                        break label191;
                     }
                  } else {
                     var28 = var23[var27];
                  }

                  while(true) {
                     int var29 = var23[var27];
                     int var30 = 0;
                     if (var14 || ~var21 < ~var30) {
                        do {
                           int var31 = (var30 << 14) / var21;
                           int var32 = class192.field2342[var31] * var28 >> 14;
                           int var33 = class192.field2341[var31] * var29 >> 14;
                           var26[var27][var30] = var24.method1509(var32, 30705, 0, var33);
                           ++var30;
                        } while(~var21 < ~var30);
                     }

                     ++var27;
                     if (~var27 <= ~var22) {
                        var28 = 0;
                        if (!var14) {
                           break;
                        }
                     } else {
                        var28 = var23[var27];
                     }
                  }
               }

               if (var14 || var28 < var22) {
                  do {
                     int var34 = (var28 * 256 + 128) / var22;
                     int var35 = -var34 + 256;
                     byte var36 = (byte)(arg1 * var35 + arg8 * var34 >> 8);
                     short var37 = (short)(((arg2 & 64512) * var34 + (64512 & arg6) * var35 & 16515072) + (229376 & (arg2 & 896) * var34 + (arg6 & 896) * var35) + (32512 & (127 & arg2) * var34 + (arg6 & 127) * var35) >> 8);
                     int var38 = 0;
                     if (var14) {
                        if (~var28 != -1) {
                           var24.method1508(var36, (byte)1, (byte)-1, var26[var28][(var38 + 1) % var21], var26[var28 - 1][var38], var26[var28 - 1][(var38 + 1) % var21], (short)-1, var37, -100);
                           var24.method1508(var36, (byte)1, (byte)-1, var26[var28][var38], var26[var28 + -1][var38], var26[var28][(var38 + 1) % var21], (short)-1, var37, arg5 ^ -423572528);
                           if (var14) {
                              var24.method1508(var36, (byte)1, (byte)-1, var26[0][var38], var25, var26[0][(var38 + 1) % var21], (short)-1, var37, -95);
                              ++var38;
                           } else {
                              ++var38;
                           }
                        } else {
                           var24.method1508(var36, (byte)1, (byte)-1, var26[0][var38], var25, var26[0][(var38 + 1) % var21], (short)-1, var37, -95);
                           ++var38;
                        }
                     }

                     while(true) {
                        while(var21 > var38) {
                           if (~var28 != -1) {
                              var24.method1508(var36, (byte)1, (byte)-1, var26[var28][(var38 + 1) % var21], var26[var28 - 1][var38], var26[var28 - 1][(var38 + 1) % var21], (short)-1, var37, -100);
                              var24.method1508(var36, (byte)1, (byte)-1, var26[var28][var38], var26[var28 + -1][var38], var26[var28][(var38 + 1) % var21], (short)-1, var37, arg5 ^ -423572528);
                              if (var14) {
                                 var24.method1508(var36, (byte)1, (byte)-1, var26[0][var38], var25, var26[0][(var38 + 1) % var21], (short)-1, var37, -95);
                                 ++var38;
                              } else {
                                 ++var38;
                              }
                           } else {
                              var24.method1508(var36, (byte)1, (byte)-1, var26[0][var38], var25, var26[0][(var38 + 1) % var21], (short)-1, var37, -95);
                              ++var38;
                           }
                        }

                        if (!var14) {
                           ++var28;
                           break;
                        }

                        var24.method1508(var36, (byte)1, (byte)-1, var26[0][var38], var25, var26[0][(var38 + 1) % var21], (short)-1, var37, -95);
                        ++var38;
                     }
                  } while(var28 < var22);
               }

               var20 = arg12.method573(var24, var15, class494.field6790, 64, 768);
               class590 var39 = class588.field8104;
               synchronized(class588.field8104) {
                  class588.field8104.method4238(arg5 ^ 423572603, var20, var17);
               }
            }

            int var40 = arg3.method334();
            int var41 = arg3.method329();
            int var42 = arg3.method345();
            int var43 = arg3.method357();
            class477 var44 = null;
            if (arg11 != null) {
               int var49 = arg11.field667[arg10];
               var44 = class392.field5479.method1478(66, var49 >> 16);
               arg10 = var49 & 65535;
            }

            label107: {
               if (var44 == null) {
                  var20 = var20.method338((byte)3, var15, true);
                  var20.method342(var41 - var40 >> 1, 128, -var42 + var43 >> 1);
                  var20.method343(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                  if (!var14) {
                     break label107;
                  }
               }

               var20 = var20.method338((byte)3, var15, true);
               var20.method342(var41 - var40 >> 1, 128, -var42 + var43 >> 1);
               var20.method343(var40 + var41 >> 1, 0, var42 - -var43 >> 1);
               var20.method3622(var44, 514937473, arg10);
            }

            if (~arg4 != -1) {
               var20.method360(arg4);
            }

            if (arg0 != 0) {
               var20.method331(arg0);
            }

            if (arg7 != 0) {
               var20.method343(0, arg7, 0);
            }

            return var20;
         }
      } catch (RuntimeException var48) {
         throw class534.method3846(var48, field11578[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11578[3] : field11578[4]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field11578[3] : field11578[4]) + ',' + (arg12 != null ? field11578[3] : field11578[4]) + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1040(int arg0) {
      try {
         if (arg0 < 45) {
            this.field11568 = -4;
         }

         this.field11575 = Math.abs(this.field11575);
         ++field11565;
         if (~this.field11575 <= -4097) {
            this.field11575 = 4095;
         }

         this.method117(-513, this.field11568++, (byte)(this.field11575 >> 4));
         this.field11575 = 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11578[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5706(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5707(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
