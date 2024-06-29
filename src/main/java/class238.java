import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class238 {
   @OriginalMember(
      owner = "client!mn",
      name = "r",
      descriptor = "I"
   )
   public int field3008 = -1;
   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "Z"
   )
   public boolean field3005 = false;
   @OriginalMember(
      owner = "client!mn",
      name = "u",
      descriptor = "I"
   )
   public int field3021 = 5;
   @OriginalMember(
      owner = "client!mn",
      name = "d",
      descriptor = "I"
   )
   public int field3027 = -1;
   @OriginalMember(
      owner = "client!mn",
      name = "E",
      descriptor = "I"
   )
   public int field3004 = 2;
   @OriginalMember(
      owner = "client!mn",
      name = "y",
      descriptor = "Z"
   )
   public boolean field3018 = false;
   @OriginalMember(
      owner = "client!mn",
      name = "e",
      descriptor = "I"
   )
   public int field3014 = -1;
   @OriginalMember(
      owner = "client!mn",
      name = "v",
      descriptor = "I"
   )
   public int field3015 = -1;
   @OriginalMember(
      owner = "client!mn",
      name = "F",
      descriptor = "Z"
   )
   public boolean field3030 = false;
   @OriginalMember(
      owner = "client!mn",
      name = "A",
      descriptor = "I"
   )
   public int field3022 = 99;
   @OriginalMember(
      owner = "client!mn",
      name = "n",
      descriptor = "Z"
   )
   public boolean field3020 = false;
   @OriginalMember(
      owner = "client!mn",
      name = "o",
      descriptor = "I"
   )
   public int field3034 = -1;
   @OriginalMember(
      owner = "client!mn",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3037 = new String[]{method1907(method1906("k\u00144\u0011\u0013")), method1907(method1906("~OvS")), method1907(method1906("}T4~F")), method1907(method1906("}T4xF")), method1907(method1906("}T4}F")), method1907(method1906("}T4yF")), method1907(method1906("}T4|F")), method1907(method1906("}T4{F")), method1907(method1906("}T4zF"))};
   @OriginalMember(
      owner = "client!mn",
      name = "b",
      descriptor = "I"
   )
   public static int field3009 = 0;
   @OriginalMember(
      owner = "client!mn",
      name = "w",
      descriptor = "Ldp;"
   )
   public static class499 field3011 = new class499(0, 1);
   @OriginalMember(
      owner = "client!mn",
      name = "l",
      descriptor = "Ldp;"
   )
   public static class499 field3033 = new class499(8, 1);
   @OriginalMember(
      owner = "client!mn",
      name = "c",
      descriptor = "S"
   )
   public static short field3036 = 1;
   @OriginalMember(
      owner = "client!mn",
      name = "D",
      descriptor = "Lse;"
   )
   public static class6 field3035 = new class6(71, 2);
   @OriginalMember(
      owner = "client!mn",
      name = "j",
      descriptor = "I"
   )
   public static int field3013;
   @OriginalMember(
      owner = "client!mn",
      name = "t",
      descriptor = "I"
   )
   public static int field3016;
   @OriginalMember(
      owner = "client!mn",
      name = "k",
      descriptor = "I"
   )
   public static int field3019;
   @OriginalMember(
      owner = "client!mn",
      name = "p",
      descriptor = "I"
   )
   public static int field3024;
   @OriginalMember(
      owner = "client!mn",
      name = "G",
      descriptor = "I"
   )
   public int field3025;
   @OriginalMember(
      owner = "client!mn",
      name = "x",
      descriptor = "I"
   )
   public static int field3029;
   @OriginalMember(
      owner = "client!mn",
      name = "g",
      descriptor = "I"
   )
   public static int field3031;
   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "Lff;"
   )
   public class310 field3012;
   @OriginalMember(
      owner = "client!mn",
      name = "C",
      descriptor = "[I"
   )
   public int[] field3006;
   @OriginalMember(
      owner = "client!mn",
      name = "q",
      descriptor = "[I"
   )
   private int[] field3010;
   @OriginalMember(
      owner = "client!mn",
      name = "f",
      descriptor = "[I"
   )
   public int[] field3017;
   @OriginalMember(
      owner = "client!mn",
      name = "s",
      descriptor = "[I"
   )
   public int[] field3023;
   @OriginalMember(
      owner = "client!mn",
      name = "m",
      descriptor = "[I"
   )
   public int[] field3026;
   @OriginalMember(
      owner = "client!mn",
      name = "h",
      descriptor = "[I"
   )
   public int[] field3028;
   @OriginalMember(
      owner = "client!mn",
      name = "i",
      descriptor = "[Z"
   )
   public boolean[] field3007;
   @OriginalMember(
      owner = "client!mn",
      name = "B",
      descriptor = "[[I"
   )
   public int[][] field3032;

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(IIIIBIBLka;)Lka;"
   )
   public final class232 method1899(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, byte arg6, class232 arg7) {
      try {
         ++field3031;
         int var9 = this.field3023[arg5];
         int var16 = this.field3026[arg5];
         class670 var10 = this.field3012.method2475((byte)59, var16 >> 16);
         int var17 = var16 & 65535;
         if (var10 == null) {
            return arg7.method1256(arg6, arg3, true);
         } else {
            class670 var11 = null;
            if ((this.field3018 || class350.field4799) && ~arg0 != 0 && ~this.field3026.length < ~arg0) {
               int var15 = this.field3026[arg0];
               var11 = this.field3012.method2475((byte)125, var15 >> 16);
               arg0 = var15 & 65535;
            }

            if (this.field3020) {
               arg3 |= 512;
            }

            if (var10.method4889(-114, var17)) {
               arg3 |= 128;
            }

            if (var10.method4890(var17, 3)) {
               arg3 |= 256;
            }

            if (var10.method4891(var17, 119)) {
               arg3 |= 1024;
            }

            if (var11 != null) {
               if (var11.method4889(-56, arg0)) {
                  arg3 |= 128;
               }

               if (var11.method4890(arg0, 3)) {
                  arg3 |= 256;
               }

               if (var11.method4891(arg0, 119)) {
                  arg3 |= 1024;
               }
            }

            if (arg4 >= -33) {
               this.field3032 = null;
            }

            arg3 |= 32;
            class232 var12 = arg7.method1256(arg6, arg3, true);
            var12.method1836(arg2 - 1, this.field3020, (byte)-102, arg1, var9, var11, var17, var10, arg0);
            return var12;
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field3037[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field3037[0] : field3037[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1900(int arg0) {
      try {
         field3011 = null;
         field3033 = null;
         field3035 = null;
         int var1 = 117 % ((39 - arg0) / 40);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3037[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(Lgea;II)V"
   )
   private final void method1901(class66 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(IZILka;II)Lka;"
   )
   public final class232 method1902(int arg0, boolean arg1, int arg2, class232 arg3, int arg4, int arg5) {
      try {
         ++field3029;
         int var7 = this.field3023[arg2];
         int var8 = this.field3026[arg2];
         class670 var9 = this.field3012.method2475((byte)47, var8 >> 16);
         int var10 = var8 & 65535;
         if (var9 == null) {
            return arg3.method1256((byte)1, arg4, true);
         } else {
            class670 var11 = null;
            if ((this.field3018 || class350.field4799) && arg5 != -1 && ~this.field3026.length < ~arg5) {
               int var19 = this.field3026[arg5];
               var11 = this.field3012.method2475((byte)-124, var19 >> 16);
               arg5 = var19 & 65535;
            }

            class670 var12 = null;
            class670 var13 = null;
            int var14 = 0;
            int var15 = 0;
            if (this.field3010 != null) {
               if (arg2 < this.field3010.length) {
                  var14 = this.field3010[arg2];
                  if (~var14 != -65536) {
                     var12 = this.field3012.method2475((byte)87, var14 >> 16);
                     var14 &= 65535;
                  }
               }

               if ((this.field3018 || class350.field4799) && arg5 != -1 && this.field3010.length > arg5) {
                  var15 = this.field3010[arg5];
                  if (var15 != 65535) {
                     var13 = this.field3012.method2475((byte)104, var15 >> 16);
                     var15 &= 65535;
                  }
               }
            }

            if (this.field3020) {
               arg4 |= 512;
            }

            if (var9.method4889(127, var10)) {
               arg4 |= 128;
            }

            if (var9.method4890(var10, 3)) {
               arg4 |= 256;
            }

            if (var9.method4891(var10, 122)) {
               arg4 |= 1024;
            }

            if (var12 != null) {
               if (var12.method4889(-58, var14)) {
                  arg4 |= 128;
               }

               if (var12.method4890(var14, 3)) {
                  arg4 |= 256;
               }

               if (var12.method4891(var14, 120)) {
                  arg4 |= 1024;
               }
            }

            if (var11 != null) {
               if (var11.method4889(126, arg5)) {
                  arg4 |= 128;
               }

               if (var11.method4890(arg5, 3)) {
                  arg4 |= 256;
               }

               if (var11.method4891(arg5, 125)) {
                  arg4 |= 1024;
               }
            }

            if (var13 != null) {
               if (var13.method4889(-93, var15)) {
                  arg4 |= 128;
               }

               if (var13.method4890(var15, 3)) {
                  arg4 |= 256;
               }

               if (var13.method4891(var15, 123)) {
                  arg4 |= 1024;
               }
            }

            arg4 |= 32;
            class232 var16 = arg3.method1256((byte)1, arg4, arg1);
            var16.method1836(arg0 + -1, this.field3020, (byte)-102, 0, var7, var11, var10, var9, arg5);
            if (var12 != null) {
               var16.method1836(arg0 + -1, this.field3020, (byte)-102, 0, var7, var13, var14, var12, var15);
            }

            return var16;
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field3037[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3037[0] : field3037[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(IZII)I"
   )
   public final int method1903(int arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field3016;
         int var5 = 0;
         if (arg3 != 1024) {
            return -26;
         } else {
            int var6 = 0;
            int var7 = this.field3026[arg2];
            class670 var8 = null;
            class670 var9 = this.field3012.method2475((byte)51, var7 >> 16);
            int var10 = var7 & 65535;
            if (var9 == null) {
               return var5;
            } else {
               if ((this.field3018 || class350.field4799) && arg0 != -1 && ~this.field3026.length < ~arg0) {
                  int var11 = this.field3026[arg0];
                  var8 = this.field3012.method2475((byte)-100, var11 >> 16);
                  var6 = var11 & 65535;
               }

               if (this.field3020) {
                  var5 |= 512;
               }

               if (var9.method4889(-13, var10)) {
                  var5 |= 128;
               }

               if (var9.method4890(var10, 3)) {
                  var5 |= 256;
               }

               if (var9.method4891(var10, 120)) {
                  var5 |= 1024;
               }

               if (var8 != null) {
                  if (var8.method4889(127, var6)) {
                     var5 |= 128;
                  }

                  if (var8.method4890(var6, 3)) {
                     var5 |= 256;
                  }

                  if (var8.method4891(var6, arg3 ^ 1139)) {
                     var5 |= 1024;
                  }
               }

               if (this.field3010 != null && arg1) {
                  if (this.field3010.length > arg2) {
                     int var12 = this.field3010[arg2];
                     if (~var12 != -65536) {
                        class670 var13 = this.field3012.method2475((byte)-118, var12 >> 16);
                        int var14 = var12 & 65535;
                        if (var13 != null) {
                           if (var13.method4889(arg3 + -1046, var14)) {
                              var5 |= 128;
                           }

                           if (var13.method4890(var14, 3)) {
                              var5 |= 256;
                           }

                           if (var13.method4891(var14, 117)) {
                              var5 |= 1024;
                           }
                        }
                     }
                  }

                  if ((this.field3018 || class350.field4799) && arg0 != -1 && ~this.field3010.length < ~arg0) {
                     int var15 = this.field3010[arg0];
                     if (~var15 != -65536) {
                        class670 var16 = this.field3012.method2475((byte)-102, var15 >> 16);
                        int var17 = var15 & 65535;
                        if (var16 != null) {
                           if (var16.method4889(-1, var17)) {
                              var5 |= 128;
                           }

                           if (var16.method4890(var17, 3)) {
                              var5 |= 256;
                           }

                           if (var16.method4891(var17, 123)) {
                              var5 |= 1024;
                           }
                        }
                     }
                  }
               }

               return var5 | 32;
            }
         }
      } catch (RuntimeException var19) {
         throw class93.method866(var19, field3037[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(Lgea;I)V"
   )
   public final void method1904(class66 arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         while(true) {
            int var4 = arg0.method640(255);
            if (var4 != 0) {
               this.method1901(arg0, -667577680, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field3013;
            break;
         }

         if (arg1 != -22246) {
            this.field3032 = null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3037[5] + (arg0 != null ? field3037[0] : field3037[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1905(boolean arg0) {
      try {
         if (this.field3027 == -1) {
            label31: {
               if (this.field3007 == null) {
                  this.field3027 = 0;
                  if (!client.field1481) {
                     break label31;
                  }
               }

               this.field3027 = 2;
            }
         }

         ++field3024;
         if (arg0) {
            method1900(18);
         }

         if (~this.field3008 == 0) {
            if (this.field3007 != null) {
               this.field3008 = 2;
            } else {
               this.field3008 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3037[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1906(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1907(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
