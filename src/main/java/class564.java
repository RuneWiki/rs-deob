import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class564 extends class458 implements class272 {
   @OriginalMember(
      owner = "client!ur",
      name = "I",
      descriptor = "I"
   )
   private int field8039;
   @OriginalMember(
      owner = "client!ur",
      name = "v",
      descriptor = "I"
   )
   private int field8043;
   @OriginalMember(
      owner = "client!ur",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8051 = new String[]{method4026(method4025("600\u0002\u0010-+j\u0000Q")), method4026(method4025("-7rR")), method4026(method4025("8l0\u0010\u0004")), method4026(method4025("600iQ")), method4026(method4025("600}Q")), method4026(method4025("600|Q")), method4026(method4025("600jQ")), method4026(method4025("600oQ")), method4026(method4025("600mQ")), method4026(method4025("600zQ")), method4026(method4025("600kQ")), method4026(method4025("600hQ")), method4026(method4025("600\u007f8k")), method4026(method4025("600\u007fQ")), method4026(method4025("600lQ"))};
   @OriginalMember(
      owner = "client!ur",
      name = "A",
      descriptor = "Leg;"
   )
   public static class118 field8042 = new class118(134, 1);
   @OriginalMember(
      owner = "client!ur",
      name = "y",
      descriptor = "I"
   )
   public static int field8046 = -1;
   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "I"
   )
   public static int field8049 = 0;
   @OriginalMember(
      owner = "client!ur",
      name = "K",
      descriptor = "Leg;"
   )
   public static class118 field8048 = new class118(95, 28);
   @OriginalMember(
      owner = "client!ur",
      name = "w",
      descriptor = "[F"
   )
   public static float[] field8050 = new float[]{0.0F, -1.0F, 0.0F, 0.0F};
   @OriginalMember(
      owner = "client!ur",
      name = "x",
      descriptor = "I"
   )
   public static int field8031;
   @OriginalMember(
      owner = "client!ur",
      name = "O",
      descriptor = "I"
   )
   public static int field8032;
   @OriginalMember(
      owner = "client!ur",
      name = "J",
      descriptor = "I"
   )
   public static int field8033;
   @OriginalMember(
      owner = "client!ur",
      name = "E",
      descriptor = "I"
   )
   public static int field8034;
   @OriginalMember(
      owner = "client!ur",
      name = "C",
      descriptor = "I"
   )
   public static int field8035;
   @OriginalMember(
      owner = "client!ur",
      name = "H",
      descriptor = "I"
   )
   public static int field8036;
   @OriginalMember(
      owner = "client!ur",
      name = "F",
      descriptor = "I"
   )
   public static int field8037;
   @OriginalMember(
      owner = "client!ur",
      name = "B",
      descriptor = "I"
   )
   public static int field8038;
   @OriginalMember(
      owner = "client!ur",
      name = "D",
      descriptor = "I"
   )
   public static int field8040;
   @OriginalMember(
      owner = "client!ur",
      name = "N",
      descriptor = "I"
   )
   public static int field8041;
   @OriginalMember(
      owner = "client!ur",
      name = "G",
      descriptor = "I"
   )
   public static int field8044;
   @OriginalMember(
      owner = "client!ur",
      name = "M",
      descriptor = "Lrv;"
   )
   public static class121 field8045;
   @OriginalMember(
      owner = "client!ur",
      name = "L",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8047;

   @OriginalMember(
      owner = "client!ur",
      name = "<init>",
      descriptor = "(Lwi;Lak;II[FII)V",
      line = 3
   )
   public class564(class494 arg0, class371 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class301.field4121, arg2 * arg3, false);

      try {
         this.field8039 = arg3;
         this.field8043 = arg2;
         super.field6592.method2804(this, -2);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Df(super.field6589, 0, this.method3345((byte)-29), arg2, arg3, 0, class270.method2074(super.field6582, 21), 5126, arg4, arg5 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8051[0] + (arg0 != null ? field8051[2] : field8051[1]) + ',' + (arg1 != null ? field8051[2] : field8051[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8051[2] : field8051[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(B)I",
      line = 16
   )
   public final int method272(byte arg0) {
      try {
         ++field8033;
         if (arg0 != -13) {
            this.method272((byte)-55);
         }

         return this.field8039;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8051[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(IILak;III[BII)V",
      line = 27
   )
   public final void method276(int arg0, int arg1, class371 arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         ++field8040;
         if (arg3 == -8262) {
            super.field6592.method2804(this, -2);
            if (~arg1 == -1) {
               arg1 = arg7;
            }

            OpenGL.glPixelStorei(3317, 1);
            if (~arg1 != ~arg7) {
               OpenGL.glPixelStorei(3314, arg1);
            }

            OpenGL.glTexSubImage2Dub(super.field6589, 0, arg8, arg4, arg7, arg0, class270.method2074(arg2, 21), 5121, arg6, arg5);
            if (~arg1 != ~arg7) {
               OpenGL.glPixelStorei(3314, 0);
            }

            OpenGL.glPixelStorei(3317, 4);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field8051[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8051[2] : field8051[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8051[2] : field8051[1]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(Z)Z",
      line = 54
   )
   public final boolean method279(boolean arg0) {
      try {
         if (!arg0) {
            return false;
         } else {
            ++field8038;
            return false;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8051[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "c",
      descriptor = "(I)I",
      line = 65
   )
   public static final int method4022(int arg0) {
      try {
         ++field8032;
         if (class707.field10328 == null) {
            return 0;
         } else {
            if (arg0 != 4) {
               field8050 = null;
            }

            return class707.field10328.length * 2;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8051[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(FB)F",
      line = 80
   )
   public final float method282(float arg0, byte arg1) {
      try {
         if (arg1 != 26) {
            this.method275((int[])null, -40, 53, -11, (byte)24, 17, 89);
         }

         ++field8034;
         return arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8051[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "<init>",
      descriptor = "(Lwi;Lak;II[BII)V",
      line = 91
   )
   public class564(class494 arg0, class371 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class301.field4117, arg2 * arg3, false);

      try {
         this.field8039 = arg3;
         this.field8043 = arg2;
         super.field6592.method2804(this, -2);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Dub(super.field6589, 0, this.method3345((byte)-29), arg2, arg3, 0, class270.method2074(super.field6582, 21), 5121, arg4, arg5);
         OpenGL.glPixelStorei(3314, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8051[0] + (arg0 != null ? field8051[2] : field8051[1]) + ',' + (arg1 != null ? field8051[2] : field8051[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8051[2] : field8051[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "<init>",
      descriptor = "(Lwi;Lak;Lria;II)V",
      line = 107
   )
   public class564(class494 arg0, class371 arg1, class301 arg2, int arg3, int arg4) {
      super(arg0, 34037, arg1, arg2, arg3 * arg4, false);

      try {
         this.field8043 = arg3;
         this.field8039 = arg4;
         super.field6592.method2804(this, -2);
         OpenGL.glTexImage2Dub(super.field6589, 0, this.method3345((byte)-29), arg3, arg4, 0, class270.method2074(super.field6582, 21), class311.method2300(16756, super.field6590), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8051[0] + (arg0 != null ? field8051[2] : field8051[1]) + ',' + (arg1 != null ? field8051[2] : field8051[1]) + ',' + (arg2 != null ? field8051[2] : field8051[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(ZIIII)V",
      line = 118
   )
   public static final void method4023(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4360;

      try {
         ++field8037;
         if (arg0 || ~class72.field877 != ~arg3 || ~class53.field676 != ~arg4 || ~class561.field8019 != ~class169.field2359 && class300.field4107.field6412.method1017(-6) != 1) {
            class169.field2359 = class561.field8019;
            class53.field676 = arg4;
            class72.field877 = arg3;
            if (~class300.field4107.field6412.method1017(-25) == -2) {
               class169.field2359 = 0;
            }

            int var8;
            int var9;
            int var10000;
            label487: {
               class731.method5321(arg2, (byte)-96);
               class626.method4545(class383.field5543, true, class347.field4690, 2, class180.field2491.method1437(class608.field8920, arg1 + 1574872910), class427.field6124);
               int var6 = class672.field9740;
               int var7 = class533.field7595;
               class672.field9740 = (class72.field877 - (class644.field9403 >> 4)) * 8;
               class533.field7595 = (class53.field676 - (class337.field4594 >> 4)) * 8;
               class70.field863 = class650.method4737(class72.field877 * 8, class53.field676 * 8);
               class543.field7801 = null;
               var8 = -var6 + class672.field9740;
               var9 = -var7 + class533.field7595;
               if (~arg2 == -13) {
                  int var10 = 0;
                  if (var5 || var10 < class213.field3041) {
                     do {
                        class529 var11 = class566.field8074[var10];
                        if (var11 == null) {
                           ++var10;
                        } else {
                           class506 var12 = var11.field7559;
                           int var13 = 0;
                           if (var5) {
                              var12.field3888[var13] -= var8;
                              var12.field3884[var13] -= var9;
                              ++var13;
                           }

                           while(true) {
                              while(~var13 > -11) {
                                 var12.field3888[var13] -= var8;
                                 var12.field3884[var13] -= var9;
                                 ++var13;
                              }

                              var12.field10694 -= var8 * 512;
                              if (!var5) {
                                 var12.field10693 -= var9 * 512;
                                 ++var10;
                                 break;
                              }

                              var12.field3884[var13] -= var9;
                              ++var13;
                           }
                        }
                     } while(var10 < class213.field3041);
                  }

                  if (!var5) {
                     break label487;
                  }
               }

               boolean var14 = false;
               class475.field6836 = 0;
               int var15 = class644.field9403 * 512 + -512;
               int var16 = (class337.field4594 + -1) * 512;
               int var17 = 0;
               if (var5 || ~class213.field3041 < ~var17) {
                  do {
                     class529 var18 = class566.field8074[var17];
                     if (var18 == null) {
                        ++var17;
                     } else {
                        class506 var19 = var18.field7559;
                        var19.field10693 -= var9 * 512;
                        var19.field10694 -= var8 * 512;
                        if (~var19.field10694 <= -1 && ~var15 <= ~var19.field10694 && var19.field10693 >= 0 && var16 >= var19.field10693) {
                           label391: {
                              byte var20 = 1;
                              int var21 = 0;
                              if (var5) {
                                 var19.field3888[var21] -= var8;
                                 var19.field3884[var21] -= var9;
                                 var10000 = var19.field3888[var21];
                              } else if (~var21 <= -11) {
                                 var10000 = var20;
                                 if (!var5) {
                                    break label391;
                                 }
                              } else {
                                 var19.field3888[var21] -= var8;
                                 var19.field3884[var21] -= var9;
                                 var10000 = var19.field3888[var21];
                              }

                              while(true) {
                                 if (var10000 >= 0) {
                                    if (~class644.field9403 < ~var19.field3888[var21]) {
                                       if (var19.field3884[var21] >= 0) {
                                          if (~var19.field3884[var21] <= ~class337.field4594) {
                                             var20 = 0;
                                             ++var21;
                                          } else {
                                             ++var21;
                                          }
                                       } else {
                                          var20 = 0;
                                          ++var21;
                                       }
                                    } else {
                                       var20 = 0;
                                       ++var21;
                                    }
                                 } else {
                                    var20 = 0;
                                    ++var21;
                                 }

                                 if (~var21 <= -11) {
                                    var10000 = var20;
                                    if (!var5) {
                                       break;
                                    }
                                 } else {
                                    var19.field3888[var21] -= var8;
                                    var19.field3884[var21] -= var9;
                                    var10000 = var19.field3888[var21];
                                 }
                              }
                           }

                           if (var10000 != 0) {
                              class352.field4728[class475.field6836++] = var19.field3862;
                              if (!var5) {
                                 ++var17;
                                 continue;
                              }
                           }

                           var19.method3673((class745)null, arg1 + 1574872738);
                           var18.method3165(113);
                           var14 = true;
                           if (!var5) {
                              ++var17;
                              continue;
                           }
                        }

                        var19.method3673((class745)null, 18);
                        var18.method3165(115);
                        var14 = true;
                        ++var17;
                     }
                  } while(~class213.field3041 < ~var17);
               }

               if (var14) {
                  class213.field3041 = class328.field4479.method326((byte)-113);
                  class328.field4479.method330(class566.field8074, 16764596);
               }
            }

            int var22 = 0;
            if (var5 || ~var22 > -2049) {
               do {
                  class121 var23 = class380.field5483[var22];
                  if (var23 == null) {
                     ++var22;
                  } else {
                     int var24 = 0;
                     if (var5) {
                        var23.field3888[var24] -= var8;
                        var23.field3884[var24] -= var9;
                        ++var24;
                     }

                     while(true) {
                        while(var24 < 10) {
                           var23.field3888[var24] -= var8;
                           var23.field3884[var24] -= var9;
                           ++var24;
                        }

                        var23.field10693 -= var9 * 512;
                        if (!var5) {
                           var23.field10694 -= var8 * 512;
                           ++var22;
                           break;
                        }

                        var23.field3884[var24] -= var9;
                        ++var24;
                     }
                  }
               } while(~var22 > -2049);
            }

            class339[] var25 = class170.field2378;
            int var26 = 0;
            class339 var27;
            if (var5) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field4614 -= var9 * 512;
                  var27.field4610 -= var8 * 512;
               }

               ++var26;
            }

            while(~var25.length < ~var26) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field4614 -= var9 * 512;
                  var27.field4610 -= var8 * 512;
               }

               ++var26;
            }

            class294 var28;
            label208: {
               var28 = (class294)class402.field5818.method2933(2);
               if (var5) {
                  var28.field4051 -= var8;
                  var28.field4056 -= var9;
               } else if (var28 == null) {
                  var28 = (class294)class761.field11242.method2933(2);
                  if (!var5) {
                     break label208;
                  }
               } else {
                  var28.field4051 -= var8;
                  var28.field4056 -= var9;
               }

               while(true) {
                  if (~class594.field8738 != -5) {
                     if (~var28.field4051 <= -1) {
                        if (var28.field4056 >= 0) {
                           if (var28.field4051 < class644.field9403) {
                              if (class337.field4594 <= var28.field4056) {
                                 var28.method3165(127);
                              }
                           } else {
                              var28.method3165(127);
                           }
                        } else {
                           var28.method3165(127);
                        }
                     } else {
                        var28.method3165(127);
                     }
                  }

                  var28 = (class294)class402.field5818.method2940(false);
                  if (var28 == null) {
                     var28 = (class294)class761.field11242.method2933(2);
                     if (!var5) {
                        break;
                     }
                  } else {
                     var28.field4051 -= var8;
                     var28.field4056 -= var9;
                  }
               }
            }

            if (var5) {
               var28.field4051 -= var8;
               var28.field4056 -= var9;
               if (class594.field8738 != 4) {
                  if (var28.field4051 >= 0) {
                     if (var28.field4056 >= 0) {
                        if (class644.field9403 > var28.field4051) {
                           if (~var28.field4056 <= ~class337.field4594) {
                              var28.method3165(arg1 + 1574872980);
                              var28 = (class294)class761.field11242.method2940(false);
                           } else {
                              var28 = (class294)class761.field11242.method2940(false);
                           }
                        } else {
                           var28.method3165(arg1 + 1574872980);
                           var28 = (class294)class761.field11242.method2940(false);
                        }
                     } else {
                        var28.method3165(arg1 + 1574872980);
                        var28 = (class294)class761.field11242.method2940(false);
                     }
                  } else {
                     var28.method3165(arg1 + 1574872980);
                     var28 = (class294)class761.field11242.method2940(false);
                  }
               } else {
                  var28 = (class294)class761.field11242.method2940(false);
               }
            }

            while(true) {
               byte var10001;
               if (var28 == null) {
                  var10000 = class594.field8738;
                  var10001 = 4;
                  if (!var5) {
                     if (var10000 != 4) {
                        class622 var29 = (class622)class39.field556.method328(1745388291);
                        if (var5 || var29 != null) {
                           do {
                              int var30 = (int)(16383L & var29.field6137);
                              int var31 = -class672.field9740 + var30;
                              int var32 = (int)(16383L & var29.field6137 >> 14);
                              int var33 = -class533.field7595 + var32;
                              if (var31 < 0 || ~var33 > -1 || var31 >= class644.field9403 || ~class337.field4594 >= ~var33) {
                                 var29.method3165(121);
                              }

                              var29 = (class622)class39.field556.method325(arg1 + 1574868231);
                           } while(var29 != null);
                        }
                     }

                     if (~class755.field11185 != -1) {
                        class755.field11185 -= var8;
                        class140.field1791 -= var9;
                     }

                     label474: {
                        class581.method4209((byte)88);
                        if (arg2 != 12) {
                           class754.field11175 -= var9;
                           class188.field2679 -= var9;
                           class463.field6650 -= var8;
                           class27.field415 -= var8;
                           class224.field3188 -= var8 * 512;
                           class782.field11465 -= var9 * 512;
                           if (Math.abs(var8) <= class644.field9403 && Math.abs(var9) <= class337.field4594) {
                              break label474;
                           }

                           class85.method760(arg1 ^ -1574872860);
                           if (!var5) {
                              break label474;
                           }
                        }

                        if (class380.field5481 == 4) {
                           class310.field4257 -= var9 * 512;
                           class760.field11239 -= var8 * 512;
                           class725.field10585 -= var8 * 512;
                           class157.field2236 -= var9 * 512;
                           if (!var5) {
                              break label474;
                           }
                        }

                        class25.field376 = -1;
                        class744.field10854 = -1;
                        class380.field5481 = 1;
                     }

                     class788.method5688(0);
                     class188.method1492(arg1 ^ 1574872859);
                     class636.field9304.method2934(arg1 + 1574872860);
                     class552.field7922.method2934(arg1 ^ arg1);
                     class477.field6863.method5525(6798);
                     class57.method445((byte)-75);
                     return;
                  }
               } else {
                  var28.field4051 -= var8;
                  var28.field4056 -= var9;
                  var10000 = class594.field8738;
                  var10001 = 4;
               }

               if (var10000 != var10001) {
                  if (var28.field4051 >= 0) {
                     if (var28.field4056 >= 0) {
                        if (class644.field9403 > var28.field4051) {
                           if (~var28.field4056 <= ~class337.field4594) {
                              var28.method3165(arg1 + 1574872980);
                              var28 = (class294)class761.field11242.method2940(false);
                           } else {
                              var28 = (class294)class761.field11242.method2940(false);
                           }
                        } else {
                           var28.method3165(arg1 + 1574872980);
                           var28 = (class294)class761.field11242.method2940(false);
                        }
                     } else {
                        var28.method3165(arg1 + 1574872980);
                        var28 = (class294)class761.field11242.method2940(false);
                     }
                  } else {
                     var28.method3165(arg1 + 1574872980);
                     var28 = (class294)class761.field11242.method2940(false);
                  }
               } else {
                  var28 = (class294)class761.field11242.method2940(false);
               }
            }
         }
      } catch (RuntimeException var35) {
         throw class237.method1823(var35, field8051[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(IF)F",
      line = 394
   )
   public final float method274(int arg0, float arg1) {
      try {
         ++field8035;
         return arg0 != 11535 ? -0.68958724F : arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8051[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(ZZZ)V",
      line = 405
   )
   public final void method277(boolean arg0, boolean arg1, boolean arg2) {
      try {
         ++field8041;
         if (!arg0) {
            this.field8039 = -26;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8051[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "([IIIIBII)V",
      line = 416
   )
   public final void method275(int[] param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ur",
      name = "d",
      descriptor = "(I)V",
      line = 441
   )
   public static void method4024(int arg0) {
      try {
         field8050 = null;
         if (arg0 == 512) {
            field8048 = null;
            field8042 = null;
            field8045 = null;
            field8047 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8051[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(B[IIIIIII)V",
      line = 459
   )
   public final void method281(byte arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         super.field6592.method2804(this, -2);
         if (arg7 == 0) {
            arg7 = arg6;
         }

         ++field8036;
         if (~arg6 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
         }

         if (arg0 != -2) {
            field8049 = 66;
         }

         OpenGL.glTexSubImage2Di(super.field6589, 0, arg2, arg5, arg6, arg3, 32993, super.field6592.field7163, arg1, arg4);
         if (~arg6 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8051[13] + arg0 + ',' + (arg1 != null ? field8051[2] : field8051[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "b",
      descriptor = "(Z)I",
      line = 481
   )
   public final int method283(boolean arg0) {
      try {
         ++field8031;
         if (!arg0) {
            method4024(42);
         }

         return this.field8043;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8051[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "<init>",
      descriptor = "(Lwi;II[III)V",
      line = 492
   )
   public class564(class494 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      super(arg0, 34037, class424.field6036, class301.field4117, arg1 * arg2, false);

      try {
         this.field8043 = arg1;
         this.field8039 = arg2;
         super.field6592.method2804(this, -2);
         OpenGL.glPixelStorei(3314, arg5);
         OpenGL.glTexImage2Di(super.field6589, 0, 6408, this.field8043, this.field8039, 0, 32993, super.field6592.field7163, arg3, arg4 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8051[0] + (arg0 != null ? field8051[2] : field8051[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8051[2] : field8051[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4025(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4026(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
