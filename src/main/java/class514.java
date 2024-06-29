import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class514 extends class458 implements class297 {
   @OriginalMember(
      owner = "client!lda",
      name = "w",
      descriptor = "I"
   )
   private int field7427;
   @OriginalMember(
      owner = "client!lda",
      name = "x",
      descriptor = "I"
   )
   private int field7432;
   @OriginalMember(
      owner = "client!lda",
      name = "v",
      descriptor = "I"
   )
   private int field7428;
   @OriginalMember(
      owner = "client!lda",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7434 = new String[]{method3743(method3742("[^Y 5\u001f")), method3743(method3742("YOTb")), method3743(method3742("[^Y J^TQzH\u001f")), method3743(method3742("L\u0014\u0016 \u000b")), method3743(method3742("[^Y 7\u001f")), method3743(method3742("[^Y 4\u001f")), method3743(method3742("[^Y 2\u001f"))};
   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "I"
   )
   public static int field7429;
   @OriginalMember(
      owner = "client!lda",
      name = "A",
      descriptor = "I"
   )
   public static int field7430;
   @OriginalMember(
      owner = "client!lda",
      name = "y",
      descriptor = "I"
   )
   public static int field7431;
   @OriginalMember(
      owner = "client!lda",
      name = "C",
      descriptor = "I"
   )
   public static int field7433;

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static final void method3738(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field7429;
         class534 var2 = class430.field6150.field105;
         if (arg0 < 50) {
            method3739((byte[])null, 109, -36, 29);
         }

         int var3 = 0;
         if (var1 || ~var3 > ~class214.field3064) {
            do {
               int var4 = class271.field3745[var3];
               class506 var5 = ((class529)class328.field4479.method329((byte)101, (long)var4)).field7559;
               int var6 = var2.method1143(-15465);
               if (~(var6 & 4) != -1) {
                  var6 += var2.method1143(-15465) << 8;
               }

               if ((512 & var6) != 0) {
                  var6 += var2.method1143(-15465) << 16;
               }

               if (~(8 & var6) != -1) {
                  int var7 = var2.method1189(0);
                  if (var7 > 0) {
                     int var8 = 0;
                     if (var1 || var8 < var7) {
                        do {
                           int var9;
                           int var10;
                           int var11;
                           int var12;
                           label253: {
                              var9 = -1;
                              var10 = -1;
                              var11 = -1;
                              var12 = var2.method1145((byte)34);
                              if (var12 != 32767) {
                                 if (var12 != 32766) {
                                    var10 = var2.method1145((byte)61);
                                    if (!var1) {
                                       break label253;
                                    }
                                 }

                                 var12 = -1;
                                 if (!var1) {
                                    break label253;
                                 }
                              }

                              var12 = var2.method1145((byte)55);
                              var10 = var2.method1145((byte)62);
                              var9 = var2.method1145((byte)68);
                              var11 = var2.method1145((byte)40);
                           }

                           int var13 = var2.method1145((byte)111);
                           int var14 = var2.method1189(0);
                           var5.method2131(class96.field1234, var10, (byte)16, var11, var14, var13, var9, var12);
                           ++var8;
                        } while(var8 < var7);
                     }
                  }
               }

               if ((var6 & 16) != 0) {
                  int[] var15 = new int[4];
                  int var16 = 0;
                  if (var1) {
                     var15[var16] = var2.method1210((byte)126);
                     if (~var15[var16] == -65536) {
                        var15[var16] = -1;
                     }

                     ++var16;
                  }

                  while(true) {
                     while(~var16 > -5) {
                        var15[var16] = var2.method1210((byte)126);
                        if (~var15[var16] == -65536) {
                           var15[var16] = -1;
                        }

                        ++var16;
                     }

                     int var17 = var2.method1143(-15465);
                     if (!var1) {
                        class596.method4330(var17, var5, -1, var15);
                        break;
                     }

                     if (var17 == -65536) {
                        var15[var16] = -1;
                     }

                     ++var16;
                  }
               }

               if ((var6 & 8192) != 0) {
                  int var18 = var5.field7333.field10860.length;
                  int var19 = 0;
                  if (var5.field7333.field10866 != null) {
                     var19 = var5.field7333.field10866.length;
                  }

                  int var20 = 0;
                  if (var5.field7333.field10932 != null) {
                     var20 = var5.field7333.field10932.length;
                  }

                  int var21 = var2.method1143(-15465);
                  if (~(1 & var21) == -2) {
                     var5.field7357 = null;
                  } else {
                     int[] var22 = null;
                     if ((2 & var21) == 2) {
                        var22 = new int[var18];
                        int var23 = 0;
                        if (var1) {
                           var22[var23] = var2.method1211(-26166);
                           ++var23;
                        }

                        while(~var18 < ~var23) {
                           var22[var23] = var2.method1211(-26166);
                           ++var23;
                        }
                     }

                     short[] var24 = null;
                     if ((var21 & 4) == 4) {
                        var24 = new short[var19];
                        int var25 = 0;
                        if (var1) {
                           var24[var25] = (short)var2.method1211(-26166);
                           ++var25;
                        }

                        while(var25 < var19) {
                           var24[var25] = (short)var2.method1211(-26166);
                           ++var25;
                        }
                     }

                     short[] var26 = null;
                     if ((var21 & 8) == 8) {
                        var26 = new short[var20];
                        int var27 = 0;
                        if (var1) {
                           var26[var27] = (short)var2.method1176(-32768);
                           ++var27;
                        }

                        while(var27 < var20) {
                           var26[var27] = (short)var2.method1176(-32768);
                           ++var27;
                        }
                     }

                     long var28 = (long)(var5.field7338++) << 32 | (long)var4;
                     var5.field7357 = new class164(var28, var22, var24, var26);
                     if (var1) {
                        var5.field7357 = null;
                     }
                  }
               }

               if (~(2 & var6) != -1) {
                  var5.field3857 = var2.method1211(-26166);
                  if (~var5.field3857 == -65536) {
                     var5.field3857 = -1;
                  }
               }

               if ((256 & var6) != 0) {
                  var5.field3790 = var2.method1168(128);
                  var5.field3808 = var2.method1206((byte)-92);
                  var5.field3812 = var2.method1206((byte)-93);
                  var5.field3800 = (byte)var2.method1189(0);
                  var5.field3815 = class96.field1234 - -var2.method1176(-32768);
                  var5.field3865 = class96.field1234 + var2.method1210((byte)126);
               }

               if (~(524288 & var6) != -1) {
                  var5.field7349 = var2.method1176(-32768);
                  if (~var5.field7349 == -65536) {
                     var5.field7349 = var5.field7333.field10889;
                  }
               }

               if (~(var6 & 262144) != -1) {
                  int var30 = var5.field7333.field10890.length;
                  int var31 = 0;
                  if (var5.field7333.field10866 != null) {
                     var31 = var5.field7333.field10866.length;
                  }

                  if (var5.field7333.field10932 != null) {
                     var31 = var5.field7333.field10932.length;
                  }

                  byte var32 = 0;
                  int var33 = var2.method1174((byte)122);
                  if (~(var33 & 1) != -2) {
                     int[] var34 = null;
                     if ((var33 & 2) == 2) {
                        var34 = new int[var30];
                        int var35 = 0;
                        if (var1) {
                           var34[var35] = var2.method1211(-26166);
                           ++var35;
                        }

                        while(~var30 < ~var35) {
                           var34[var35] = var2.method1211(-26166);
                           ++var35;
                        }
                     }

                     short[] var36 = null;
                     if ((4 & var33) == 4) {
                        var36 = new short[var31];
                        int var37 = 0;
                        if (var1) {
                           var36[var37] = (short)var2.method1154(true);
                           ++var37;
                        }

                        while(~var31 < ~var37) {
                           var36[var37] = (short)var2.method1154(true);
                           ++var37;
                        }
                     }

                     short[] var38 = null;
                     if (~(8 & var33) == -9) {
                        var38 = new short[var32];
                        int var39 = 0;
                        if (var1) {
                           var38[var39] = (short)var2.method1176(-32768);
                           ++var39;
                        }

                        while(var32 > var39) {
                           var38[var39] = (short)var2.method1176(-32768);
                           ++var39;
                        }
                     }

                     long var40 = (long)var4 | (long)(var5.field7359++) << 32;
                     new class164(var40, var34, var36, var38);
                  }
               }

               if (~(var6 & 64) != -1) {
                  var5.field7337 = var2.method1176(-32768);
                  var5.field7353 = var2.method1211(-26166);
               }

               if ((var6 & 128) != 0) {
                  if (var5.field7333.method5402((byte)-100)) {
                     class414.method3096(var5, (byte)103);
                  }

                  var5.method3673(class195.field2761.method1732(11268, var2.method1210((byte)126)), -108);
                  var5.method2118(false, var5.field7333.field10909);
                  var5.field3842 = var5.field7333.field10881 << 3;
                  if (var5.field7333.method5402((byte)93)) {
                     class695.method5062((class121)null, (class259)null, var5.field10701, var5.field3884[0], var5.field3888[0], var5, 256, 0);
                  }
               }

               if ((var6 & 4096) != 0) {
                  int var42 = var2.method1176(-32768);
                  int var43 = var2.method1192((byte)38);
                  if (var42 == 65535) {
                     var42 = -1;
                  }

                  int var44 = var2.method1194(14623);
                  int var45 = 7 & var44;
                  int var46 = var44 >> 3 & 15;
                  if (~var46 == -16) {
                     var46 = -1;
                  }

                  var5.method2127(var45, (byte)-25, 1, var42, var46, var43);
               }

               if ((65536 & var6) != 0) {
                  int var47 = var2.method1211(-26166);
                  int var48 = var2.method1167((byte)117);
                  if (var47 == 65535) {
                     var47 = -1;
                  }

                  int var49 = var2.method1143(-15465);
                  int var50 = 7 & var49;
                  int var51 = 15 & var49 >> 3;
                  if (var51 == 15) {
                     var51 = -1;
                  }

                  var5.method2127(var50, (byte)-25, 2, var47, var51, var48);
               }

               if ((var6 & 32768) != 0) {
                  int var52 = var2.method1143(-15465);
                  int[] var53 = new int[var52];
                  int[] var54 = new int[var52];
                  int[] var55 = new int[var52];
                  int var56 = 0;
                  if (!var1 && ~var56 <= ~var52) {
                     class571.method4084(var55, var54, var53, 3882, var5);
                  } else {
                     while(true) {
                        int var57 = var2.method1154(true);
                        if (~var57 == -65536) {
                           var57 = -1;
                        }

                        var53[var56] = var57;
                        var54[var56] = var2.method1189(0);
                        var55[var56] = var2.method1210((byte)126);
                        ++var56;
                        if (~var56 <= ~var52) {
                           class571.method4084(var55, var54, var53, 3882, var5);
                           break;
                        }
                     }
                  }
               }

               if ((16384 & var6) != 0) {
                  int var58 = var2.method1143(-15465);
                  int[] var59 = new int[var58];
                  int[] var60 = new int[var58];
                  int var61 = 0;
                  if (!var1 && var58 <= var61) {
                     var5.method2126(var60, -82, var59);
                  } else {
                     while(true) {
                        label415: {
                           int var62 = var2.method1154(true);
                           if (~(var62 & 49152) != -49153) {
                              var59[var61] = var62;
                              if (!var1) {
                                 var60[var61] = var2.method1210((byte)126);
                                 ++var61;
                                 break label415;
                              }
                           }

                           int var63 = var2.method1211(-26166);
                           var59[var61] = class300.method2238(var63, var62 << 16);
                           var60[var61] = var2.method1210((byte)126);
                           ++var61;
                        }

                        if (var58 <= var61) {
                           var5.method2126(var60, -82, var59);
                           break;
                        }
                     }
                  }
               }

               if ((var6 & 32) != 0) {
                  int var64 = var2.method1211(-26166);
                  int var65 = var2.method1167((byte)122);
                  if (~var64 == -65536) {
                     var64 = -1;
                  }

                  int var66 = var2.method1174((byte)127);
                  int var67 = 7 & var66;
                  int var68 = 15 & var66 >> 3;
                  if (var68 == 15) {
                     var68 = -1;
                  }

                  var5.method2127(var67, (byte)-25, 0, var64, var68, var65);
               }

               if ((var6 & 1) != 0) {
                  var5.field3811 = var2.method1204(2119550368);
                  var5.field3839 = 100;
               }

               if ((2048 & var6) != 0) {
                  var5.field3873 = var2.method1162(4);
                  var5.field3835 = var2.method1168(128);
                  var5.field3853 = var2.method1171(-128);
                  var5.field3818 = var2.method1171(-128);
                  var5.field3795 = var2.method1211(-26166) - -class96.field1234;
                  var5.field3832 = var2.method1176(-32768) - -class96.field1234;
                  var5.field3848 = var2.method1143(-15465);
                  var5.field3873 += var5.field3888[0];
                  var5.field3886 = 0;
                  var5.field3853 += var5.field3888[0];
                  var5.field3818 += var5.field3884[0];
                  var5.field3835 += var5.field3884[0];
                  var5.field3891 = 1;
               }

               if ((var6 & 131072) != 0) {
                  var5.field7342 = var2.method1204(2119550368);
                  if (!"".equals(var5.field7342)) {
                     if (var5.field7342.equals(var5.field7333.field10882)) {
                        var5.field7342 = var5.field7333.field10882;
                     }
                  } else {
                     var5.field7342 = var5.field7333.field10882;
                  }
               }

               if ((1024 & var6) != 0) {
                  int var69 = var2.method1154(true);
                  var5.field3878 = var2.method1194(14623);
                  var5.field3803 = var2.method1194(14623);
                  var5.field3877 = ~(var69 & 32768) != -1;
                  var5.field3847 = 32767 & var69;
                  var5.field3819 = class96.field1234 - -var5.field3847 + var5.field3878;
               }

               ++var3;
            } while(~var3 > ~class214.field3064);

         }
      } catch (RuntimeException var71) {
         throw class237.method1823(var71, field7434[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "<init>",
      descriptor = "(Lwi;Lak;III[B)V",
      line = 499
   )
   public class514(class494 arg0, class371 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, 32879, arg1, class301.field4117, arg2 * arg4 * arg3, false);

      try {
         this.field7427 = arg4;
         this.field7432 = arg2;
         this.field7428 = arg3;
         super.field6592.method2804(this, -2);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field6589, 0, this.method3345((byte)-29), this.field7432, this.field7428, this.field7427, 0, class270.method2074(super.field6582, 21), 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field7434[2] + (arg0 != null ? field7434[3] : field7434[1]) + ',' + (arg1 != null ? field7434[3] : field7434[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7434[3] : field7434[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "([BIII)I",
      line = 513
   )
   public static final int method3739(byte[] arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         ++field7430;
         int var5 = -1;
         int var6 = arg2;
         int var7 = -41 / ((50 - arg3) / 61);
         if (var4) {
            var5 = class171.field2383[255 & (var5 ^ arg0[arg2])] ^ var5 >>> 8;
            var6 = arg2 + 1;
         }

         while(true) {
            while(~arg1 < ~var6) {
               var5 = class171.field2383[255 & (var5 ^ arg0[var6])] ^ var5 >>> 8;
               ++var6;
            }

            int var8 = ~var5;
            if (!var4) {
               return var8;
            }

            var5 = var8;
            ++var6;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field7434[5] + (arg0 != null ? field7434[3] : field7434[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "f",
      descriptor = "(B)I",
      line = 535
   )
   public static final int method3740(byte arg0) {
      boolean var1 = client.field4360;

      try {
         if (arg0 != -62) {
            return -10;
         } else {
            byte var3;
            label39: {
               ++field7433;
               if (~class409.field5915 <= -97) {
                  int var2 = class608.method4428(100);
                  if (~var2 < -101) {
                     if (var2 <= 500) {
                        var3 = 3;
                        class417.method3116((byte)-105);
                        if (!var1) {
                           break label39;
                        }
                     }

                     if (var2 <= 1000) {
                        class692.method5049((byte)72);
                        var3 = 2;
                        if (!var1) {
                           break label39;
                        }
                     }

                     var3 = 1;
                     class794.method5723((byte)-41, true);
                     if (!var1) {
                        break label39;
                     }
                  }

                  class540.method3889((byte)101);
                  var3 = 4;
                  if (!var1) {
                     break label39;
                  }
               }

               class794.method5723((byte)-35, true);
               var3 = 1;
            }

            if (~class300.field4107.field6419.method391(112) != -1) {
               class300.field4107.method3301(arg0 ^ -25401, class300.field4107.field6406, 0);
               class42.method358(0, -3, false);
            }

            class441.method3246(arg0 ^ -62);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7434[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(IIIIZI)V",
      line = 599
   )
   public static final void method3741(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
      try {
         ++field7431;
         if (~arg0 == ~arg3) {
            class487.method3535(arg2, arg1, arg3, 1493, arg5);
         } else if (arg4) {
            if (-arg3 + arg2 >= class457.field6528 && ~class348.field4702 <= ~(arg2 - -arg3) && ~class245.field3374 >= ~(arg1 - arg0) && class699.field10237 >= arg0 + arg1) {
               class708.method5151(arg2, arg1, 31, arg3, arg5, arg0);
            } else {
               class290.method2186(-9880, arg0, arg2, arg5, arg3, arg1);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7434[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3742(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3743(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
