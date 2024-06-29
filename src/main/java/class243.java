import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class243 {
   @OriginalMember(
      owner = "client!eha",
      name = "m",
      descriptor = "[[Lar;"
   )
   private class194[][] field3690;
   @OriginalMember(
      owner = "client!eha",
      name = "b",
      descriptor = "[I"
   )
   private int[] field3698;
   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "[I"
   )
   private int[] field3687;
   @OriginalMember(
      owner = "client!eha",
      name = "f",
      descriptor = "[[Lar;"
   )
   private class194[][] field3694;
   @OriginalMember(
      owner = "client!eha",
      name = "p",
      descriptor = "[I"
   )
   private int[] field3701;
   @OriginalMember(
      owner = "client!eha",
      name = "c",
      descriptor = "I"
   )
   private int field3702;
   @OriginalMember(
      owner = "client!eha",
      name = "x",
      descriptor = "Lvi;"
   )
   private class371 field3693;
   @OriginalMember(
      owner = "client!eha",
      name = "g",
      descriptor = "Lgfa;"
   )
   private class631 field3689;
   @OriginalMember(
      owner = "client!eha",
      name = "u",
      descriptor = "Lgfa;"
   )
   private class631 field3691;
   @OriginalMember(
      owner = "client!eha",
      name = "v",
      descriptor = "Lqq;"
   )
   private class800 field3699;
   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3706 = new String[]{method2079(method2078("! <\u0005^l")), method2079(method2078("*=1G")), method2079(method2078("! <\u0005[l")), method2079(method2078("?fs\u0005e")), method2079(method2078("! <\u0005]l")), method2079(method2078("! <\u0005Ql")), method2079(method2078("! <\u0005_l")), method2079(method2078("! <\u0005Rl")), method2079(method2078("! <\u0005Yl")), method2079(method2078("! <\u0005$-&4_&l")), method2079(method2078("7-)j{'-.Xq&$8")), method2079(method2078(".\"")), method2079(method2078("('<O(")), method2079(method2078(".)+J6()3L6\u0017</Bv#")), method2079(method2078("! <\u0005Pl")), method2079(method2078(".)+J6()3L66-;G}'<sj{'-.Xq&$8dz.->_")), method2079(method2078(".)+J6()3L6\u0016=3_q)-")), method2079(method2078(".)+J6()3L6\u0007$<Xk")), method2079(method2078("! <\u0005Zl")), method2079(method2078("! <\u0005\\l"))};
   @OriginalMember(
      owner = "client!eha",
      name = "s",
      descriptor = "I"
   )
   public static int field3682 = 0;
   @OriginalMember(
      owner = "client!eha",
      name = "h",
      descriptor = "I"
   )
   public static int field3685 = 0;
   @OriginalMember(
      owner = "client!eha",
      name = "i",
      descriptor = "I"
   )
   public static int field3683 = 0;
   @OriginalMember(
      owner = "client!eha",
      name = "d",
      descriptor = "I"
   )
   public static int field3684;
   @OriginalMember(
      owner = "client!eha",
      name = "l",
      descriptor = "I"
   )
   public static int field3686;
   @OriginalMember(
      owner = "client!eha",
      name = "e",
      descriptor = "I"
   )
   public static int field3688;
   @OriginalMember(
      owner = "client!eha",
      name = "r",
      descriptor = "I"
   )
   public static int field3692;
   @OriginalMember(
      owner = "client!eha",
      name = "q",
      descriptor = "I"
   )
   public static int field3695;
   @OriginalMember(
      owner = "client!eha",
      name = "w",
      descriptor = "I"
   )
   public static int field3696;
   @OriginalMember(
      owner = "client!eha",
      name = "k",
      descriptor = "I"
   )
   public static int field3697;
   @OriginalMember(
      owner = "client!eha",
      name = "j",
      descriptor = "I"
   )
   public static int field3700;
   @OriginalMember(
      owner = "client!eha",
      name = "t",
      descriptor = "I"
   )
   public static int field3703;
   @OriginalMember(
      owner = "client!eha",
      name = "o",
      descriptor = "I"
   )
   public static int field3704;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!eha",
      name = "n",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3705;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method2077(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z",
      line = 3
   )
   public static final boolean method2067(Class arg0, String arg1, int arg2) {
      try {
         ++field3692;
         Class var3 = (Class)class640.field9277.get(arg1);
         if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
         } else if (arg2 != 0) {
            return true;
         } else {
            File var4 = null;
            if (var4 == null) {
               var4 = (File)class552.field8262.get(arg1);
            }

            if (var4 != null) {
               try {
                  var4 = new File(var4.getCanonicalPath());
                  Class var5 = Class.forName(field3706[16]);
                  Class var6 = Class.forName(field3706[15]);
                  Method var7 = var6.getDeclaredMethod(field3706[10], Boolean.TYPE);
                  Method var8 = var5.getDeclaredMethod(field3706[12], Class.forName(field3706[17]), Class.forName(field3706[13]));
                  var7.invoke(var8, Boolean.TRUE);
                  var8.invoke(Runtime.getRuntime(), arg0, var4.getPath());
                  var7.invoke(var8, Boolean.FALSE);
                  class640.field9277.put(arg1, arg0);
                  return true;
               } catch (NoSuchMethodException var10) {
                  System.load(var4.getPath());
                  class640.field9277.put(arg1, field3705 != null ? field3705 : (field3705 = method2077(field3706[11])));
                  return true;
               } catch (Throwable var11) {
               }
            }

            return false;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field3706[14] + (arg0 != null ? field3706[3] : field3706[1]) + ',' + (arg1 != null ? field3706[3] : field3706[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(Lmu;Lfca;BI)V",
      line = 73
   )
   public final void method2068(class258 param1, class43 param2, byte param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(IIIIIII[ILfr;III[IZI)I",
      line = 233
   )
   public static final int method2069(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, class482 param8, int param9, int param10, int param11, int[] param12, boolean param13, int param14) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eha",
      name = "b",
      descriptor = "(ILmu;)V",
      line = 407
   )
   public final void method2070(int arg0, class258 arg1) {
      try {
         ++field3684;
         if (arg0 == 730746924) {
            this.field3689.method1537(24, 786336, arg0 ^ 730728135);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3706[2] + arg0 + ',' + (arg1 != null ? field3706[3] : field3706[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(Lmu;Z)V",
      line = 420
   )
   private final void method2071(class258 arg0, boolean arg1) {
      try {
         arg0.method2219(true, 117);
         ++field3695;
         arg0.method2213(arg1, (byte)120);
         if (class596.field8759 != arg0.field4177) {
            arg0.method679(class596.field8759);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3706[5] + (arg0 != null ? field3706[3] : field3706[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(ILmu;)V",
      line = 434
   )
   private final void method2072(int arg0, class258 arg1) {
      try {
         ++field3696;
         class596.field8759 = arg1.field4177;
         arg1.method2189((byte)-26);
         arg1.method2213(false, (byte)120);
         arg1.method2219(false, arg0 + 385293552);
         if (arg0 != -385293652) {
            field3682 = -26;
         }

         arg1.method2205(true);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3706[6] + arg0 + ',' + (arg1 != null ? field3706[3] : field3706[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(IBLmu;)V",
      line = 449
   )
   private final void method2073(int arg0, byte arg1, class258 arg2) {
      try {
         ++field3697;
         class596.field8759 = arg2.field4177;
         arg2.method2178((float)arg0, arg1 ^ 3);
         arg2.method2251((byte)76);
         arg2.method2213(false, (byte)120);
         arg2.method2219(false, -115);
         arg2.method2205(true);
         if (arg1 != 11) {
            this.field3694 = null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3706[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3706[3] : field3706[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(Lmu;II)V",
      line = 465
   )
   private final void method2074(class258 arg0, int arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         ++field3688;
         int var5 = arg2;
         class504 var6 = arg0.method2200(255);
         float var7 = var6.field7710;
         float var8 = var6.field7720;
         float var9 = var6.field7713;
         float var10 = var6.field7697;
         float var11 = var6.field7709;
         float var12 = var6.field7690;
         float var13 = var7 + var10;
         float var14 = var8 + var11;
         float var15 = var9 + var12;
         float var16 = -var10 + var7;
         float var17 = -var11 + var8;
         float var18 = var9 - var12;
         float var19 = var10 - var7;
         float var20 = -var8 + var11;
         float var21 = -var9 + var12;
         Buffer var22 = this.field3689.method1535(true, -105);
         if (var22 != null) {
            int var10000;
            Stream var23;
            int var24;
            class243 var75;
            byte var76;
            label480: {
               var23 = arg0.method2245((byte)73, var22);
               if (Stream.method5249()) {
                  label282: {
                     var24 = arg1 - 1;
                     if (var4) {
                        var10000 = ~this.field3687[var24] >= -65 ? this.field3687[var24] : 64;
                     } else if (var24 < 0) {
                        if (!var4) {
                           break label282;
                        }

                        var10000 = 64;
                     } else {
                        var10000 = ~this.field3687[var24] >= -65 ? this.field3687[var24] : 64;
                     }

                     while(true) {
                        int var25 = var10000;
                        if (~var25 >= -1) {
                           --var24;
                        } else {
                           int var26 = var25 - 1;
                           class194 var27;
                           int var28;
                           byte var29;
                           byte var30;
                           byte var31;
                           byte var32;
                           float var33;
                           float var34;
                           float var35;
                           int var36;
                           if (var4) {
                              var27 = this.field3694[var24][var26];
                              var28 = var27.field3011;
                              var29 = (byte)(var28 >> 16);
                              var30 = (byte)(var28 >> 8);
                              var31 = (byte)var28;
                              var32 = (byte)(var28 >>> 24);
                              var33 = (float)(var27.field3005 >> 12);
                              var34 = (float)(var27.field3009 >> 12);
                              var35 = (float)(var27.field3014 >> 12);
                              var36 = var27.field3013 >> 12;
                              var23.method5248((float)(-var36) * var13 + var33);
                              var23.method5248((float)(-var36) * var14 + var34);
                              var23.method5248((float)(-var36) * var15 + var35);
                              if (~arg0.field4192 != -1) {
                                 var23.method5244(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method5247(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5247(var29, var30, var31, var32);
                              }

                              var23.method5248(0.0F);
                              var23.method5248(0.0F);
                              var23.method5248((float)var36 * var16 + var33);
                              var23.method5248((float)var36 * var17 + var34);
                              var23.method5248((float)var36 * var18 + var35);
                              if (arg0.field4192 != 0) {
                                 var23.method5244(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method5247(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5247(var29, var30, var31, var32);
                              }

                              var23.method5248(1.0F);
                              var23.method5248(0.0F);
                              var23.method5248((float)var36 * var13 + var33);
                              var23.method5248((float)var36 * var14 + var34);
                              var23.method5248((float)var36 * var15 + var35);
                              if (arg0.field4192 != 0) {
                                 var23.method5244(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method5247(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5247(var29, var30, var31, var32);
                              }

                              var23.method5248(1.0F);
                              var23.method5248(1.0F);
                              var23.method5248((float)var36 * var19 + var33);
                              var23.method5248((float)var36 * var20 + var34);
                              var23.method5248((float)var36 * var21 + var35);
                              if (~arg0.field4192 != -1) {
                                 var23.method5244(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method5247(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5247(var29, var30, var31, var32);
                              }

                              var23.method5248(0.0F);
                              ++var5;
                              var23.method5248(1.0F);
                              --var26;
                           }

                           while(true) {
                              if (~var26 > -1) {
                                 var75 = this;
                                 if (!var4) {
                                    if (~this.field3687[var24] >= -65) {
                                       --var24;
                                       break;
                                    }

                                    int var37 = this.field3687[var24] - 64 - 1;
                                    int var38 = this.field3701[var37] + -1;
                                    if (!var4 && ~var38 > -1) {
                                       --var24;
                                       break;
                                    }

                                    do {
                                       class194 var39 = this.field3690[var37][var38];
                                       int var40 = var39.field3011;
                                       byte var41 = (byte)(var40 >> 16);
                                       byte var42 = (byte)(var40 >> 8);
                                       byte var43 = (byte)var40;
                                       byte var44 = (byte)(var40 >>> 24);
                                       float var45 = (float)(var39.field3005 >> 12);
                                       float var46 = (float)(var39.field3009 >> 12);
                                       float var47 = (float)(var39.field3014 >> 12);
                                       int var48 = var39.field3013 >> 12;
                                       var23.method5248((float)(-var48) * var13 + var45);
                                       var23.method5248((float)(-var48) * var14 + var46);
                                       var23.method5248((float)(-var48) * var15 + var47);
                                       if (arg0.field4192 != 0) {
                                          var23.method5244(var41, var42, var43, var44);
                                          if (var4) {
                                             var23.method5247(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method5247(var41, var42, var43, var44);
                                       }

                                       var23.method5248(0.0F);
                                       var23.method5248(0.0F);
                                       var23.method5248((float)var48 * var16 + var45);
                                       var23.method5248((float)var48 * var17 + var46);
                                       var23.method5248((float)var48 * var18 + var47);
                                       if (~arg0.field4192 == -1) {
                                          var23.method5247(var41, var42, var43, var44);
                                          if (var4) {
                                             var23.method5244(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method5244(var41, var42, var43, var44);
                                       }

                                       var23.method5248(1.0F);
                                       var23.method5248(0.0F);
                                       var23.method5248((float)var48 * var13 + var45);
                                       var23.method5248((float)var48 * var14 + var46);
                                       var23.method5248((float)var48 * var15 + var47);
                                       if (~arg0.field4192 != -1) {
                                          var23.method5244(var41, var42, var43, var44);
                                          if (var4) {
                                             var23.method5247(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method5247(var41, var42, var43, var44);
                                       }

                                       var23.method5248(1.0F);
                                       var23.method5248(1.0F);
                                       var23.method5248((float)var48 * var19 + var45);
                                       var23.method5248((float)var48 * var20 + var46);
                                       var23.method5248((float)var48 * var21 + var47);
                                       if (~arg0.field4192 != -1) {
                                          var23.method5244(var41, var42, var43, var44);
                                          if (var4) {
                                             var23.method5247(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method5247(var41, var42, var43, var44);
                                       }

                                       var23.method5248(0.0F);
                                       var23.method5248(1.0F);
                                       ++var5;
                                       --var38;
                                    } while(~var38 <= -1);

                                    --var24;
                                    break;
                                 }
                              } else {
                                 var75 = this;
                              }

                              var27 = var75.field3694[var24][var26];
                              var28 = var27.field3011;
                              var29 = (byte)(var28 >> 16);
                              var30 = (byte)(var28 >> 8);
                              var31 = (byte)var28;
                              var32 = (byte)(var28 >>> 24);
                              var33 = (float)(var27.field3005 >> 12);
                              var34 = (float)(var27.field3009 >> 12);
                              var35 = (float)(var27.field3014 >> 12);
                              var36 = var27.field3013 >> 12;
                              var23.method5248((float)(-var36) * var13 + var33);
                              var23.method5248((float)(-var36) * var14 + var34);
                              var23.method5248((float)(-var36) * var15 + var35);
                              if (~arg0.field4192 != -1) {
                                 var23.method5244(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method5247(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5247(var29, var30, var31, var32);
                              }

                              var23.method5248(0.0F);
                              var23.method5248(0.0F);
                              var23.method5248((float)var36 * var16 + var33);
                              var23.method5248((float)var36 * var17 + var34);
                              var23.method5248((float)var36 * var18 + var35);
                              if (arg0.field4192 != 0) {
                                 var23.method5244(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method5247(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5247(var29, var30, var31, var32);
                              }

                              var23.method5248(1.0F);
                              var23.method5248(0.0F);
                              var23.method5248((float)var36 * var13 + var33);
                              var23.method5248((float)var36 * var14 + var34);
                              var23.method5248((float)var36 * var15 + var35);
                              if (arg0.field4192 != 0) {
                                 var23.method5244(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method5247(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5247(var29, var30, var31, var32);
                              }

                              var23.method5248(1.0F);
                              var23.method5248(1.0F);
                              var23.method5248((float)var36 * var19 + var33);
                              var23.method5248((float)var36 * var20 + var34);
                              var23.method5248((float)var36 * var21 + var35);
                              if (~arg0.field4192 != -1) {
                                 var23.method5244(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method5247(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method5247(var29, var30, var31, var32);
                              }

                              var23.method5248(0.0F);
                              ++var5;
                              var23.method5248(1.0F);
                              --var26;
                           }
                        }

                        if (var24 < 0) {
                           if (!var4) {
                              break;
                           }

                           var10000 = 64;
                        } else {
                           var10000 = ~this.field3687[var24] >= -65 ? this.field3687[var24] : 64;
                        }
                     }
                  }

                  if (!var4) {
                     var23.method5253();
                     var76 = this.field3689.method1534(arg2 ^ -11);
                     if (!var4) {
                        if (var76 != 0) {
                           arg0.method1507(this.field3689, 0, (byte)15);
                           arg0.method1507(this.field3691, 1, (byte)15);
                           arg0.method1502(this.field3693, 125);
                           arg0.method1493((byte)-100, var5 * 2, 0, 0, this.field3699, class331.field5019, var5 * 4);
                           return;
                        }

                        return;
                     }

                     var10000 = var76 >= -65 ? this.field3687[var24] : 64;
                     break label480;
                  }
               }

               var24 = arg1 + -1;
               if (var4) {
                  var10000 = ~this.field3687[var24] >= -65 ? this.field3687[var24] : 64;
               } else if (var24 < 0) {
                  var23.method5253();
                  var76 = this.field3689.method1534(arg2 ^ -11);
                  if (!var4) {
                     if (var76 != 0) {
                        arg0.method1507(this.field3689, 0, (byte)15);
                        arg0.method1507(this.field3691, 1, (byte)15);
                        arg0.method1502(this.field3693, 125);
                        arg0.method1493((byte)-100, var5 * 2, 0, 0, this.field3699, class331.field5019, var5 * 4);
                        return;
                     }

                     return;
                  }

                  var10000 = var76 >= -65 ? this.field3687[var24] : 64;
               } else {
                  var10000 = ~this.field3687[var24] >= -65 ? this.field3687[var24] : 64;
               }
            }

            while(true) {
               int var49 = var10000;
               if (~var49 >= -1) {
                  --var24;
               } else {
                  int var50 = var49 + -1;
                  class194 var51;
                  int var52;
                  byte var53;
                  byte var54;
                  byte var55;
                  byte var56;
                  float var57;
                  float var58;
                  float var59;
                  int var60;
                  if (var4) {
                     var51 = this.field3694[var24][var50];
                     var52 = var51.field3011;
                     var53 = (byte)(var52 >> 16);
                     var54 = (byte)(var52 >> 8);
                     var55 = (byte)var52;
                     var56 = (byte)(var52 >>> 24);
                     var57 = (float)(var51.field3005 >> 12);
                     var58 = (float)(var51.field3009 >> 12);
                     var59 = (float)(var51.field3014 >> 12);
                     var60 = var51.field3013 >> 12;
                     var23.method5241((float)(-var60) * var13 + var57);
                     var23.method5241((float)(-var60) * var14 + var58);
                     var23.method5241((float)(-var60) * var15 + var59);
                     if (arg0.field4192 != 0) {
                        var23.method5244(var53, var54, var55, var56);
                        if (var4) {
                           var23.method5247(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5247(var53, var54, var55, var56);
                     }

                     var23.method5241(0.0F);
                     var23.method5241(0.0F);
                     var23.method5241((float)var60 * var16 + var57);
                     var23.method5241((float)var60 * var17 + var58);
                     var23.method5241((float)var60 * var18 + var59);
                     if (arg0.field4192 != 0) {
                        var23.method5244(var53, var54, var55, var56);
                        if (var4) {
                           var23.method5247(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5247(var53, var54, var55, var56);
                     }

                     var23.method5241(1.0F);
                     var23.method5241(0.0F);
                     var23.method5241((float)var60 * var13 + var57);
                     var23.method5241((float)var60 * var14 + var58);
                     var23.method5241((float)var60 * var15 + var59);
                     if (~arg0.field4192 == -1) {
                        var23.method5247(var53, var54, var55, var56);
                        if (var4) {
                           var23.method5244(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5244(var53, var54, var55, var56);
                     }

                     var23.method5241(1.0F);
                     var23.method5241(1.0F);
                     var23.method5241((float)var60 * var19 + var57);
                     var23.method5241((float)var60 * var20 + var58);
                     var23.method5241((float)var60 * var21 + var59);
                     if (~arg0.field4192 == -1) {
                        var23.method5247(var53, var54, var55, var56);
                        if (var4) {
                           var23.method5244(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5244(var53, var54, var55, var56);
                     }

                     var23.method5241(0.0F);
                     var23.method5241(1.0F);
                     ++var5;
                     --var50;
                  }

                  while(true) {
                     if (var50 < 0) {
                        var75 = this;
                        if (!var4) {
                           if (this.field3687[var24] <= 64) {
                              --var24;
                              break;
                           }

                           int var61 = this.field3687[var24] + -64 + -1;
                           int var62 = this.field3701[var61] + -1;
                           if (!var4 && var62 < 0) {
                              --var24;
                              break;
                           }

                           do {
                              class194 var63 = this.field3690[var61][var62];
                              int var64 = var63.field3011;
                              byte var65 = (byte)(var64 >> 16);
                              byte var66 = (byte)(var64 >> 8);
                              byte var67 = (byte)var64;
                              byte var68 = (byte)(var64 >>> 24);
                              float var69 = (float)(var63.field3005 >> 12);
                              float var70 = (float)(var63.field3009 >> 12);
                              float var71 = (float)(var63.field3014 >> 12);
                              int var72 = var63.field3013 >> 12;
                              var23.method5241((float)(-var72) * var13 + var69);
                              var23.method5241((float)(-var72) * var14 + var70);
                              var23.method5241((float)(-var72) * var15 + var71);
                              if (arg0.field4192 == 0) {
                                 var23.method5247(var65, var66, var67, var68);
                                 if (var4) {
                                    var23.method5244(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method5244(var65, var66, var67, var68);
                              }

                              var23.method5241(0.0F);
                              var23.method5241(0.0F);
                              var23.method5241((float)var72 * var16 + var69);
                              var23.method5241((float)var72 * var17 + var70);
                              var23.method5241((float)var72 * var18 + var71);
                              if (arg0.field4192 == 0) {
                                 var23.method5247(var65, var66, var67, var68);
                                 if (var4) {
                                    var23.method5244(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method5244(var65, var66, var67, var68);
                              }

                              var23.method5241(1.0F);
                              var23.method5241(0.0F);
                              var23.method5241((float)var72 * var13 + var69);
                              var23.method5241((float)var72 * var14 + var70);
                              var23.method5241((float)var72 * var15 + var71);
                              if (arg0.field4192 != 0) {
                                 var23.method5244(var65, var66, var67, var68);
                                 if (var4) {
                                    var23.method5247(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method5247(var65, var66, var67, var68);
                              }

                              var23.method5241(1.0F);
                              var23.method5241(1.0F);
                              var23.method5241((float)var72 * var19 + var69);
                              var23.method5241((float)var72 * var20 + var70);
                              var23.method5241((float)var72 * var21 + var71);
                              if (~arg0.field4192 != -1) {
                                 var23.method5244(var65, var66, var67, var68);
                                 if (var4) {
                                    var23.method5247(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method5247(var65, var66, var67, var68);
                              }

                              var23.method5241(0.0F);
                              var23.method5241(1.0F);
                              ++var5;
                              --var62;
                           } while(var62 >= 0);

                           --var24;
                           break;
                        }
                     } else {
                        var75 = this;
                     }

                     var51 = var75.field3694[var24][var50];
                     var52 = var51.field3011;
                     var53 = (byte)(var52 >> 16);
                     var54 = (byte)(var52 >> 8);
                     var55 = (byte)var52;
                     var56 = (byte)(var52 >>> 24);
                     var57 = (float)(var51.field3005 >> 12);
                     var58 = (float)(var51.field3009 >> 12);
                     var59 = (float)(var51.field3014 >> 12);
                     var60 = var51.field3013 >> 12;
                     var23.method5241((float)(-var60) * var13 + var57);
                     var23.method5241((float)(-var60) * var14 + var58);
                     var23.method5241((float)(-var60) * var15 + var59);
                     if (arg0.field4192 != 0) {
                        var23.method5244(var53, var54, var55, var56);
                        if (var4) {
                           var23.method5247(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5247(var53, var54, var55, var56);
                     }

                     var23.method5241(0.0F);
                     var23.method5241(0.0F);
                     var23.method5241((float)var60 * var16 + var57);
                     var23.method5241((float)var60 * var17 + var58);
                     var23.method5241((float)var60 * var18 + var59);
                     if (arg0.field4192 != 0) {
                        var23.method5244(var53, var54, var55, var56);
                        if (var4) {
                           var23.method5247(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5247(var53, var54, var55, var56);
                     }

                     var23.method5241(1.0F);
                     var23.method5241(0.0F);
                     var23.method5241((float)var60 * var13 + var57);
                     var23.method5241((float)var60 * var14 + var58);
                     var23.method5241((float)var60 * var15 + var59);
                     if (~arg0.field4192 == -1) {
                        var23.method5247(var53, var54, var55, var56);
                        if (var4) {
                           var23.method5244(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5244(var53, var54, var55, var56);
                     }

                     var23.method5241(1.0F);
                     var23.method5241(1.0F);
                     var23.method5241((float)var60 * var19 + var57);
                     var23.method5241((float)var60 * var20 + var58);
                     var23.method5241((float)var60 * var21 + var59);
                     if (~arg0.field4192 == -1) {
                        var23.method5247(var53, var54, var55, var56);
                        if (var4) {
                           var23.method5244(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method5244(var53, var54, var55, var56);
                     }

                     var23.method5241(0.0F);
                     var23.method5241(1.0F);
                     ++var5;
                     --var50;
                  }
               }

               if (var24 < 0) {
                  var23.method5253();
                  var76 = this.field3689.method1534(arg2 ^ -11);
                  if (!var4) {
                     if (var76 != 0) {
                        arg0.method1507(this.field3689, 0, (byte)15);
                        arg0.method1507(this.field3691, 1, (byte)15);
                        arg0.method1502(this.field3693, 125);
                        arg0.method1493((byte)-100, var5 * 2, 0, 0, this.field3699, class331.field5019, var5 * 4);
                        return;
                     }

                     return;
                  }

                  var10000 = var76 >= -65 ? this.field3687[var24] : 64;
               } else {
                  var10000 = ~this.field3687[var24] >= -65 ? this.field3687[var24] : 64;
               }
            }
         }
      } catch (RuntimeException var74) {
         throw class482.method3757(var74, field3706[18] + (arg0 != null ? field3706[3] : field3706[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(B)V",
      line = 860
   )
   public final void method2075(byte arg0) {
      try {
         ++field3704;
         this.field3689.method1533(16966);
         if (arg0 != 41) {
            this.method2071((class258)null, true);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3706[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "<init>",
      descriptor = "(Lmu;)V",
      line = 915
   )
   public class243(class258 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(ZLjava/lang/String;)I",
      line = 897
   )
   public static final int method2076(boolean arg0, String arg1) {
      try {
         ++field3686;
         if (arg0) {
            field3682 = 60;
         }

         return class367.method3001(-25122, true, 10, arg1);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3706[8] + arg0 + ',' + (arg1 != null ? field3706[3] : field3706[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2078(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2079(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
