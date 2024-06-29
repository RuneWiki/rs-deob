import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class242 {
   @OriginalMember(
      owner = "client!jd",
      name = "h",
      descriptor = "I"
   )
   private int field3015 = -1;
   @OriginalMember(
      owner = "client!jd",
      name = "u",
      descriptor = "Z"
   )
   private boolean field3019 = true;
   @OriginalMember(
      owner = "client!jd",
      name = "f",
      descriptor = "I"
   )
   private int field3020;
   @OriginalMember(
      owner = "client!jd",
      name = "e",
      descriptor = "[Lbp;"
   )
   private class408[] field3018;
   @OriginalMember(
      owner = "client!jd",
      name = "r",
      descriptor = "I"
   )
   private int field3021;
   @OriginalMember(
      owner = "client!jd",
      name = "m",
      descriptor = "I"
   )
   private int field3028;
   @OriginalMember(
      owner = "client!jd",
      name = "o",
      descriptor = "I"
   )
   private int field3029;
   @OriginalMember(
      owner = "client!jd",
      name = "t",
      descriptor = "[Lbp;"
   )
   private class408[] field3023;
   @OriginalMember(
      owner = "client!jd",
      name = "k",
      descriptor = "Lbp;"
   )
   private class408 field3032;
   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3035 = new String[]{method1818(method1817("qU17z")), method1818(method1817("`\u001f1Z/")), method1818(method1817("d\u000esu")), method1818(method1817("`\u001f1%nd\u0012k'/")), method1818(method1817("`\u001f1[/")), method1818(method1817("`\u001f1\\/")), method1818(method1817("`\u001f1Q/")), method1818(method1817("`\u001f1]/")), method1818(method1817("`\u001f1^/")), method1818(method1817("`\u001f1X/")), method1818(method1817("`\u001f1_/"))};
   @OriginalMember(
      owner = "client!jd",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field3027 = new int[1];
   @OriginalMember(
      owner = "client!jd",
      name = "l",
      descriptor = "I"
   )
   public static int field3014;
   @OriginalMember(
      owner = "client!jd",
      name = "g",
      descriptor = "I"
   )
   private int field3016;
   @OriginalMember(
      owner = "client!jd",
      name = "c",
      descriptor = "I"
   )
   public static int field3017;
   @OriginalMember(
      owner = "client!jd",
      name = "q",
      descriptor = "I"
   )
   public static int field3022;
   @OriginalMember(
      owner = "client!jd",
      name = "d",
      descriptor = "I"
   )
   public static int field3025;
   @OriginalMember(
      owner = "client!jd",
      name = "s",
      descriptor = "I"
   )
   public static int field3030;
   @OriginalMember(
      owner = "client!jd",
      name = "j",
      descriptor = "I"
   )
   public static int field3031;
   @OriginalMember(
      owner = "client!jd",
      name = "i",
      descriptor = "I"
   )
   private int field3033;
   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "I"
   )
   public static int field3034;
   @OriginalMember(
      owner = "client!jd",
      name = "v",
      descriptor = "Lgq;"
   )
   public static class544 field3026;
   @OriginalMember(
      owner = "client!jd",
      name = "n",
      descriptor = "Lbo;"
   )
   private class763 field3013;
   @OriginalMember(
      owner = "client!jd",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field3024;

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1809(int arg0) {
      try {
         field3027 = null;
         field3024 = null;
         if (arg0 == 4096) {
            field3026 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3035[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method1810(int arg0, boolean arg1) {
      try {
         ++field3034;
         if (arg0 != 0) {
            field3026 = null;
         }

         int var2 = class616.field8588;
         if (var2 != 0) {
            if (var2 == 1) {
               return class347.field4984;
            }

            if (var2 != 2) {
               return 0;
            }

            if (!client.field4273) {
               return 0;
            }
         }

         return arg1 ? 0 : class347.field4984;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3035[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1811(int arg0, int arg1, int arg2) {
      try {
         ++field3017;
         if (arg2 != -1) {
            return false;
         } else {
            return ~(arg1 & 50560) != -1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3035[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(B[IILvp;)Lhs;"
   )
   public static final class346 method1812(byte arg0, int[] arg1, int arg2, class200 arg3) {
      boolean var4 = client.field4273;

      try {
         ++field3014;
         int[] var5 = null;
         int[] var6 = null;
         int[] var7 = null;
         float[][] var8 = null;
         if (arg3.field2458 != null) {
            int var9 = arg3.field2436;
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            int[] var13 = new int[var9];
            int[] var14 = new int[var9];
            int[] var15 = new int[var9];
            int var16 = 0;
            if (var4) {
               var10[var16] = Integer.MAX_VALUE;
               var11[var16] = -2147483647;
               var12[var16] = Integer.MAX_VALUE;
               var13[var16] = -2147483647;
               var14[var16] = Integer.MAX_VALUE;
               var15[var16] = -2147483647;
               ++var16;
            }

            while(true) {
               while(~var9 < ~var16) {
                  var10[var16] = Integer.MAX_VALUE;
                  var11[var16] = -2147483647;
                  var12[var16] = Integer.MAX_VALUE;
                  var13[var16] = -2147483647;
                  var14[var16] = Integer.MAX_VALUE;
                  var15[var16] = -2147483647;
                  ++var16;
               }

               int[] var10000 = new int[var9];
               if (!var4) {
                  int var33;
                  label175: {
                     var5 = var10000;
                     int var17 = 0;
                     if (var4) {
                        var33 = arg1[var17];
                     } else if (~arg2 >= ~var17) {
                        var33 = var9;
                        if (!var4) {
                           break label175;
                        }
                     } else {
                        var33 = arg1[var17];
                     }

                     while(true) {
                        int var18 = var33;
                        if (arg3.field2458[var18] == -1) {
                           ++var17;
                        } else {
                           int var19 = 255 & arg3.field2458[var18];
                           int var20 = 0;
                           if (!var4 && var20 >= 3) {
                              ++var17;
                           } else {
                              while(true) {
                                 short var21;
                                 if (~var20 == -1) {
                                    var21 = arg3.field2453[var18];
                                    if (var4) {
                                       if (~var20 == -2) {
                                          var21 = arg3.field2434[var18];
                                          if (var4) {
                                             var21 = arg3.field2417[var18];
                                          }
                                       } else {
                                          var21 = arg3.field2417[var18];
                                       }
                                    }
                                 } else if (~var20 == -2) {
                                    var21 = arg3.field2434[var18];
                                    if (var4) {
                                       var21 = arg3.field2417[var18];
                                    }
                                 } else {
                                    var21 = arg3.field2417[var18];
                                 }

                                 int var22 = arg3.field2423[var21];
                                 int var23 = arg3.field2424[var21];
                                 int var24 = arg3.field2448[var21];
                                 if (~var22 > ~var10[var19]) {
                                    var10[var19] = var22;
                                 }

                                 if (~var22 < ~var11[var19]) {
                                    var11[var19] = var22;
                                 }

                                 if (~var12[var19] < ~var23) {
                                    var12[var19] = var23;
                                 }

                                 if (~var23 < ~var13[var19]) {
                                    var13[var19] = var23;
                                 }

                                 if (var24 < var14[var19]) {
                                    var14[var19] = var24;
                                 }

                                 if (var24 > var15[var19]) {
                                    var15[var19] = var24;
                                 }

                                 ++var20;
                                 if (var20 >= 3) {
                                    ++var17;
                                    break;
                                 }
                              }
                           }
                        }

                        if (~arg2 >= ~var17) {
                           var33 = var9;
                           if (!var4) {
                              break;
                           }
                        } else {
                           var33 = arg1[var17];
                        }
                     }
                  }

                  var8 = new float[var33][];
                  var7 = new int[var9];
                  var6 = new int[var9];
                  int var25 = 0;
                  if (var4 || ~var25 > ~var9) {
                     do {
                        byte var26 = arg3.field2439[var25];
                        if (~var26 >= -1) {
                           ++var25;
                        } else {
                           float var28;
                           float var29;
                           float var30;
                           label208: {
                              var5[var25] = (var10[var25] + var11[var25]) / 2;
                              var6[var25] = (var12[var25] + var13[var25]) / 2;
                              var7[var25] = (var14[var25] + var15[var25]) / 2;
                              if (var26 == 1) {
                                 int var27 = arg3.field2428[var25];
                                 if (var27 != 0) {
                                    label115: {
                                       if (var27 > 0) {
                                          var28 = (float)var27 / 1024.0F;
                                          var29 = 1.0F;
                                          if (!var4) {
                                             break label115;
                                          }
                                       }

                                       var28 = 1.0F;
                                       var29 = (float)(-var27) / 1024.0F;
                                       if (var4) {
                                          var28 = 1.0F;
                                          var29 = 1.0F;
                                       }
                                    }
                                 } else {
                                    var28 = 1.0F;
                                    var29 = 1.0F;
                                 }

                                 var30 = 64.0F / (float)arg3.field2414[var25];
                                 if (!var4) {
                                    break label208;
                                 }
                              }

                              if (~var26 != -3) {
                                 var28 = (float)arg3.field2457[var25] / 1024.0F;
                                 var30 = (float)arg3.field2414[var25] / 1024.0F;
                                 var29 = (float)arg3.field2428[var25] / 1024.0F;
                                 if (!var4) {
                                    break label208;
                                 }
                              }

                              var29 = 64.0F / (float)arg3.field2428[var25];
                              var28 = 64.0F / (float)arg3.field2457[var25];
                              var30 = 64.0F / (float)arg3.field2414[var25];
                           }

                           var8[var25] = class615.method4468(var30, 98, arg3.field2412[var25], arg3.field2430[var25], arg3.field2432[var25], var28, var29, class743.method5375(255, arg3.field2441[var25]));
                           ++var25;
                        }
                     } while(~var25 > ~var9);
                  }
                  break;
               }

               var10000[var16] = -2147483647;
               ++var16;
            }
         }

         if (arg0 <= 73) {
            method1812((byte)78, (int[])null, 25, (class200)null);
         }

         return new class346(var5, var6, var7, var8);
      } catch (RuntimeException var32) {
         throw class534.method3846(var32, field3035[6] + arg0 + ',' + (arg1 != null ? field3035[0] : field3035[2]) + ',' + arg2 + ',' + (arg3 != null ? field3035[0] : field3035[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1813(byte arg0) {
      boolean var2 = client.field4273;

      try {
         ++field3030;
         if (this.field3018 != null) {
            int var3 = 0;
            if (var2) {
               this.field3018[var3].method3099();
               ++var3;
            }

            while(~this.field3018.length < ~var3) {
               this.field3018[var3].method3099();
               ++var3;
            }
         }

         this.field3013 = null;
         if (arg0 <= 30) {
            this.field3020 = -51;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3035[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1814(int arg0, int arg1) {
      try {
         ++field3031;
         if (~arg1 != -13 && arg1 != 52 && arg1 != 17 && ~arg1 != -16 && arg1 != 1008) {
            if (arg0 > -30) {
               method1812((byte)111, (int[])null, -40, (class200)null);
            }

            return arg1 == 20 || ~arg1 == -1008;
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3035[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(ILha;B)Z"
   )
   public final boolean method1815(int arg0, class65 arg1, byte arg2) {
      boolean var4 = client.field4273;

      try {
         if (arg2 != -80) {
            return true;
         } else {
            if (~this.field3015 != ~arg0) {
               this.field3015 = arg0;
               int var5 = class558.method4015(arg0, false);
               if (var5 > 512) {
                  var5 = 512;
               }

               if (var5 <= 0) {
                  var5 = 1;
               }

               if (this.field3016 != var5) {
                  this.field3016 = var5;
                  this.field3013 = null;
               }

               if (this.field3018 != null) {
                  this.field3033 = 0;
                  int[] var6 = new int[this.field3018.length];
                  int var7 = 0;
                  if (!var4 && var7 >= this.field3018.length) {
                     class315.method2365(this.field3033 + -1, var6, true, 0, this.field3023);
                  } else {
                     while(true) {
                        class408 var8 = this.field3018[var7];
                        if (var8.method3103(this.field3029, this.field3020, this.field3021, this.field3015)) {
                           var6[this.field3033] = var8.field5757;
                           this.field3023[this.field3033++] = var8;
                        }

                        ++var7;
                        if (var7 >= this.field3018.length) {
                           class315.method2365(this.field3033 + -1, var6, true, 0, this.field3023);
                           break;
                        }
                     }
                  }
               }

               this.field3019 = true;
            }

            ++field3025;
            boolean var9 = false;
            if (this.field3019) {
               this.field3019 = false;
               int var10 = this.field3033 - 1;
               if (var4 || var10 >= 0) {
                  do {
                     boolean var11 = this.field3023[var10].method3098(arg1, this.field3032);
                     this.field3019 |= !var11;
                     var9 |= var11;
                     --var10;
                  } while(var10 >= 0);
               }
            }

            return var9;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field3035[5] + arg0 + ',' + (arg1 != null ? field3035[0] : field3035[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "<init>",
      descriptor = "(I[Lbp;IIII)V"
   )
   public class242(int arg0, class408[] arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field3020 = arg4;
         this.field3018 = arg1;
         this.field3021 = arg5;
         this.field3028 = arg0;
         this.field3029 = arg3;
         if (arg1 == null) {
            this.field3023 = null;
            this.field3032 = null;
         } else {
            this.field3023 = new class408[arg1.length];
            this.field3032 = arg2 < 0 ? null : arg1[arg2];
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field3035[3] + arg0 + ',' + (arg1 != null ? field3035[0] : field3035[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(IIIZIIIIILha;)V"
   )
   public final void method1816(int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, class65 param10) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1817(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1818(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
