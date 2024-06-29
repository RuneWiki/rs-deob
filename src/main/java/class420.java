import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class420 {
   @OriginalMember(
      owner = "client!df",
      name = "g",
      descriptor = "Ldw;"
   )
   private class748 field6407 = new class748(64);
   @OriginalMember(
      owner = "client!df",
      name = "c",
      descriptor = "Leaa;"
   )
   private class526 field6404;
   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6408 = new String[]{method3209(method3208("\u0006ZAJO")), method3209(method3208("\u0013\u0001\u0003\b")), method3209(method3208("\u0019\u0012A'\u001a")), method3209(method3208("\u0019\u0012A%\u001a")), method3209(method3208("\u0019\u0012AX[\u0013\u001d\u001bZ\u001a")), method3209(method3208("\u0019\u0012A&\u001a")), method3209(method3208("\u0019\u0012A \u001a"))};
   @OriginalMember(
      owner = "client!df",
      name = "f",
      descriptor = "[F"
   )
   public static float[] field6402 = new float[2];
   @OriginalMember(
      owner = "client!df",
      name = "b",
      descriptor = "Lsda;"
   )
   public static class269 field6406 = new class269(45, 7);
   @OriginalMember(
      owner = "client!df",
      name = "d",
      descriptor = "I"
   )
   public static int field6401;
   @OriginalMember(
      owner = "client!df",
      name = "e",
      descriptor = "I"
   )
   public static int field6403;
   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "I"
   )
   public static int field6405;

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(II)Lrl;"
   )
   public final class752 method3204(int arg0, int arg1) {
      try {
         ++field6401;
         class748 var3 = this.field6407;
         class752 var4;
         synchronized(this.field6407) {
            var4 = (class752)this.field6407.method5454((long)arg1, arg0 ^ 39697652);
            if (arg0 != 39713697) {
               this.field6404 = null;
            }
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field6404;
            byte[] var6;
            synchronized(this.field6404) {
               var6 = this.field6404.method3899(-90, arg1, 5);
            }

            class752 var7 = new class752();
            if (var6 != null) {
               var7.method5475(new class128(var6), true);
            }

            class748 var8 = this.field6407;
            synchronized(this.field6407) {
               this.field6407.method5455(-2049, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6408[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3205(byte arg0) {
      try {
         field6406 = null;
         field6402 = null;
         if (arg0 != 78) {
            field6406 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6408[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(IIIIIILpl;ILka;IIIILha;)Lka;"
   )
   public static final class497 method3206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class676 arg6, int arg7, class497 arg8, int arg9, int arg10, int arg11, int arg12, class66 arg13) {
      int var14 = client.field4530;

      try {
         ++field6405;
         if (arg8 == null) {
            return null;
         } else {
            int var15 = 2055;
            if (arg6 != null) {
               int var16 = var15 | arg6.method4940(-86, arg0, -1, false);
               var15 = var16 & -513;
            }

            long var17 = ((long)arg9 << 48) + ((long)arg12 << 32) + (long)((arg1 << 16) + (arg4 << 24) + arg11);
            class748 var19 = class413.field6322;
            class497 var20;
            synchronized(class413.field6322) {
               var20 = (class497)class413.field6322.method5454(var17, arg10 ^ -12150);
            }

            if (var20 == null || arg13.method632(var20.method326(), var15) != 0) {
               if (var20 != null) {
                  var15 = arg13.method560(var15, var20.method326());
               }

               byte var21;
               if (~arg11 == -2) {
                  var21 = 9;
               } else if (~arg11 == -3) {
                  var21 = 12;
               } else if (arg11 == 3) {
                  var21 = 15;
               } else if (arg11 == 4) {
                  var21 = 18;
               } else {
                  var21 = 21;
               }

               byte var22;
               class134 var24;
               int var25;
               int[][] var26;
               int var28;
               label192: {
                  var22 = 3;
                  int[] var23 = new int[]{64, 96, 128};
                  var24 = new class134(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
                  var25 = var24.method1141(-1, 0, 0, 0);
                  var26 = new int[var22][var21];
                  int var27 = 0;
                  if (var14 != 0) {
                     var28 = var23[var27];
                  } else if (var22 <= var27) {
                     var28 = 0;
                     if (var14 == 0) {
                        break label192;
                     }
                  } else {
                     var28 = var23[var27];
                  }

                  while(true) {
                     int var29 = var23[var27];
                     int var30 = 0;
                     if (var14 != 0 || var21 > var30) {
                        do {
                           int var31 = (var30 << 14) / var21;
                           int var32 = class689.field10389[var31] * var28 >> 14;
                           int var33 = class689.field10391[var31] * var29 >> 14;
                           var26[var27][var30] = var24.method1141(-1, var32, var33, 0);
                           ++var30;
                        } while(var21 > var30);
                     }

                     ++var27;
                     if (var22 <= var27) {
                        var28 = 0;
                        if (var14 == 0) {
                           break;
                        }
                     } else {
                        var28 = var23[var27];
                     }
                  }
               }

               if (var14 != 0 || var22 > var28) {
                  do {
                     int var34 = (var28 * 256 + 128) / var22;
                     int var35 = 256 - var34;
                     byte var36 = (byte)(arg1 * var35 + arg4 * var34 >> 8);
                     short var37 = (short)(((arg9 & 896) * var34 + (arg12 & 896) * var35 & 229376) + ((arg9 & 64512) * var34 + (arg12 & 64512) * var35 & 16515072) + ((arg9 & 127) * var34 + (arg12 & 127) * var35 & 32512) >> 8);
                     int var38 = 0;
                     if (var14 != 0) {
                        if (var28 != 0) {
                           var24.method1144(var37, arg10 ^ 26690, var36, (byte)-1, var26[var28 - 1][(var38 + 1) % var21], var26[var28][(var38 - -1) % var21], (short)-1, (byte)1, var26[var28 + -1][var38]);
                           var24.method1144(var37, -106, var36, (byte)-1, var26[var28][(var38 + 1) % var21], var26[var28][var38], (short)-1, (byte)1, var26[var28 + -1][var38]);
                           if (var14 != 0) {
                              var24.method1144(var37, arg10 ^ 26735, var36, (byte)-1, var26[0][(var38 + 1) % var21], var26[0][var38], (short)-1, (byte)1, var25);
                              ++var38;
                           } else {
                              ++var38;
                           }
                        } else {
                           var24.method1144(var37, arg10 ^ 26735, var36, (byte)-1, var26[0][(var38 + 1) % var21], var26[0][var38], (short)-1, (byte)1, var25);
                           ++var38;
                        }
                     }

                     while(true) {
                        while(~var21 < ~var38) {
                           if (var28 != 0) {
                              var24.method1144(var37, arg10 ^ 26690, var36, (byte)-1, var26[var28 - 1][(var38 + 1) % var21], var26[var28][(var38 - -1) % var21], (short)-1, (byte)1, var26[var28 + -1][var38]);
                              var24.method1144(var37, -106, var36, (byte)-1, var26[var28][(var38 + 1) % var21], var26[var28][var38], (short)-1, (byte)1, var26[var28 + -1][var38]);
                              if (var14 != 0) {
                                 var24.method1144(var37, arg10 ^ 26735, var36, (byte)-1, var26[0][(var38 + 1) % var21], var26[0][var38], (short)-1, (byte)1, var25);
                                 ++var38;
                              } else {
                                 ++var38;
                              }
                           } else {
                              var24.method1144(var37, arg10 ^ 26735, var36, (byte)-1, var26[0][(var38 + 1) % var21], var26[0][var38], (short)-1, (byte)1, var25);
                              ++var38;
                           }
                        }

                        if (var14 == 0) {
                           ++var28;
                           break;
                        }

                        var24.method1144(var37, arg10 ^ 26735, var36, (byte)-1, var26[0][(var38 + 1) % var21], var26[0][var38], (short)-1, (byte)1, var25);
                        ++var38;
                     }
                  } while(var22 > var28);
               }

               var20 = arg13.method547(var24, var15, class728.field10825, 64, 768);
               class748 var39 = class413.field6322;
               synchronized(class413.field6322) {
                  class413.field6322.method5455(-2049, var20, var17);
               }
            }

            int var40 = arg8.method344();
            int var41 = arg8.method306();
            int var42 = arg8.method342();
            int var43 = arg8.method300();
            class441 var44 = null;
            if (arg6 != null) {
               int var49 = arg6.field10165[arg0];
               var44 = class576.field8554.method3192(-28532, var49 >> 16);
               arg0 = var49 & 65535;
            }

            if (arg10 != -26657) {
               method3205((byte)-68);
            }

            label106: {
               if (var44 != null) {
                  var20 = var20.method343((byte)3, var15, true);
                  var20.method346(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                  var20.method303(var40 + var41 >> 1, 0, var42 - -var43 >> 1);
                  var20.method3703(arg0, var44, -14080);
                  if (var14 == 0) {
                     break label106;
                  }
               }

               var20 = var20.method343((byte)3, var15, true);
               var20.method346(var41 - var40 >> 1, 128, -var42 + var43 >> 1);
               var20.method303(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            }

            if (arg3 != 0) {
               var20.method340(arg3);
            }

            if (arg5 != 0) {
               var20.method310(arg5);
            }

            if (~arg2 != -1) {
               var20.method303(0, arg2, 0);
            }

            return var20;
         }
      } catch (RuntimeException var48) {
         throw class670.method4877(var48, field6408[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6408[0] : field6408[1]) + ',' + arg7 + ',' + (arg8 != null ? field6408[0] : field6408[1]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + (arg13 != null ? field6408[0] : field6408[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(Lii;I)I"
   )
   public static final int method3207(class579 arg0, int arg1) {
      try {
         ++field6403;
         if (arg1 != 17835) {
            return -13;
         } else if (class70.field883 == arg0) {
            return 6407;
         } else if (class75.field963 != arg0) {
            if (class740.field10984 == arg0) {
               return 6406;
            } else if (class128.field1559 == arg0) {
               return 6409;
            } else if (class158.field2002 == arg0) {
               return 6410;
            } else if (class614.field8987 == arg0) {
               return 6145;
            } else {
               throw new IllegalStateException();
            }
         } else {
            return 6408;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6408[3] + (arg0 != null ? field6408[0] : field6408[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V"
   )
   public class420(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field6404 = arg2;
         this.field6404.method3875(0, 5);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6408[4] + (arg0 != null ? field6408[0] : field6408[1]) + ',' + arg1 + ',' + (arg2 != null ? field6408[0] : field6408[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3208(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3209(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
