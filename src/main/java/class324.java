import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class324 {
   @OriginalMember(
      owner = "client!ce",
      name = "h",
      descriptor = "I"
   )
   public int field4610;
   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4617 = new String[]{method2452(method2451("gB?=vjNe?7")), method2452(method2451("jR}m")), method2452(method2451("\u007f\t?/b")), method2452(method2451("gB?upWSchqc\u000f")), method2452(method2451("gB?@7")), method2452(method2451("gB?E7")), method2452(method2451("gB?D7")), method2452(method2451("gB?C7")), method2452(method2451("gB?B7"))};
   @OriginalMember(
      owner = "client!ce",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field4609 = new int[1000];
   @OriginalMember(
      owner = "client!ce",
      name = "e",
      descriptor = "[F"
   )
   public static float[] field4612 = new float[2];
   @OriginalMember(
      owner = "client!ce",
      name = "g",
      descriptor = "Lsd;"
   )
   public static class101 field4608 = new class101(109, -2);
   @OriginalMember(
      owner = "client!ce",
      name = "j",
      descriptor = "F"
   )
   public static float field4615;
   @OriginalMember(
      owner = "client!ce",
      name = "d",
      descriptor = "I"
   )
   public static int field4607;
   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "I"
   )
   public static int field4611;
   @OriginalMember(
      owner = "client!ce",
      name = "f",
      descriptor = "I"
   )
   public static int field4613;
   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "I"
   )
   public static int field4614;
   @OriginalMember(
      owner = "client!ce",
      name = "c",
      descriptor = "I"
   )
   public static int field4616;

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static void method2446(int arg0) {
      try {
         if (arg0 == 1339971298) {
            field4608 = null;
            field4609 = null;
            field4612 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4617[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(IILpl;)V",
      line = 28
   )
   public static final void method2447(int arg0, int arg1, class676 arg2) {
      try {
         ++field4616;
         if (~class130.field1612 > -51) {
            if (arg2 != null && arg2.field10178 != null && ~arg2.field10178.length < ~arg0 && arg2.field10178[arg0] != null) {
               int var3 = arg2.field10178[arg0][0];
               int var4 = var3 >> 8;
               if (~arg2.field10178[arg0].length < -2) {
                  int var5 = (int)(Math.random() * (double)arg2.field10178[arg0].length);
                  if (~var5 < -1) {
                     var4 = arg2.field10178[arg0][var5];
                  }
               }

               if (arg1 != 255) {
                  field4612 = null;
               }

               int var6 = var3 >> 5 & 7;
               int var7 = 256;
               if (arg2.field10158 != null && arg2.field10169 != null) {
                  var7 = class7.method59((byte)-92, arg2.field10169[arg0], arg2.field10158[arg0]);
               }

               if (arg2.field10160) {
                  class415.method3174(255, var4, 0, (byte)-116, var7, false, var6);
               } else {
                  class485.method3597(255, 9026, var4, 0, var7, var6);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field4617[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4617[2] : field4617[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(BIIIIII[I)V",
      line = 74
   )
   public static final void method2448(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
      int var8 = client.field4530;

      try {
         ++field4611;
         if (~arg2 < -1 && !class766.method5547(1008, arg2)) {
            throw new IllegalArgumentException("");
         } else if (arg1 > 0 && !class766.method5547(1008, arg1)) {
            throw new IllegalArgumentException("");
         } else if (arg0 > 88) {
            if (arg6 != 32993) {
               throw new IllegalArgumentException("");
            } else {
               int var9 = 0;
               int var10 = ~arg1 >= ~arg2 ? arg1 : arg2;
               int var11 = arg2 >> 1;
               int var12 = arg1 >> 1;
               int[] var13 = arg7;
               int[] var14 = new int[var11 * var12];

               while(true) {
                  OpenGL.glTexImage2Di(arg3, var9, arg4, arg2, arg1, 0, arg6, arg5, var13, 0);
                  if (~var10 >= -2) {
                     return;
                  }

                  int var10000;
                  label92: {
                     int var15 = 0;
                     int var16 = 0;
                     int var17 = arg2 + var16;
                     int var18 = 0;
                     int[] var40;
                     if (var8 != 0) {
                        var10000 = 0;
                     } else if (var18 >= var12) {
                        var40 = var14;
                        var14 = var13;
                        arg2 = var11;
                        arg1 = var12;
                        var13 = var40;
                        var11 >>= 1;
                        var10 >>= 1;
                        ++var9;
                        var10000 = var12 >> 1;
                        if (var8 == 0) {
                           break label92;
                        }
                     } else {
                        var10000 = 0;
                     }

                     while(true) {
                        label89: {
                           int var19 = var10000;
                           if (var8 != 0) {
                              var10000 = var13[var16++];
                           } else if (~var19 <= ~var11) {
                              var16 += arg2;
                              var10000 = arg2 + var17;
                              if (var8 == 0) {
                                 break label89;
                              }
                           } else {
                              var10000 = var13[var16++];
                           }

                           while(true) {
                              int var20 = var10000;
                              int var21 = var13[var16++];
                              int var22 = var13[var17++];
                              int var23 = 255 & var20 >> 8;
                              int var24 = 255 & var20;
                              int var25 = 255 & var20 >> 24;
                              int var26 = (16759201 & var20) >> 16;
                              int var27 = var13[var17++];
                              int var28 = (255 & var21 >> 24) + var25;
                              int var29 = (var21 & 255) + var24;
                              int var30 = ((16714000 & var21) >> 16) + var26;
                              int var31 = ((65439 & var21) >> 8) + var23;
                              int var32 = (var22 & 255) + var29;
                              int var33 = (255 & var22 >> 8) + var31;
                              int var34 = (255 & var22 >> 24) + var28;
                              int var35 = ((var22 & 16749409) >> 16) + var30;
                              int var36 = ((var27 & 16734785) >> 16) + var35;
                              int var37 = ((65514 & var27) >> 8) + var33;
                              int var38 = (var27 & 255) + var32;
                              int var39 = (255 & var27 >> 24) + var34;
                              var14[var15++] = class379.method2928(class379.method2928(class379.method2928(class153.method1262(var36 << 14, 16711680), class153.method1262(var39 << 22, -16777216)), class153.method1262(65280, var37 << 6)), class153.method1262(1020, var38) >> 2);
                              ++var19;
                              if (~var19 <= ~var11) {
                                 var16 += arg2;
                                 var10000 = arg2 + var17;
                                 if (var8 == 0) {
                                    break;
                                 }
                              } else {
                                 var10000 = var13[var16++];
                              }
                           }
                        }

                        var17 = var10000;
                        ++var18;
                        if (var18 >= var12) {
                           var40 = var14;
                           var14 = var13;
                           arg2 = var11;
                           arg1 = var12;
                           var13 = var40;
                           var11 >>= 1;
                           var10 >>= 1;
                           ++var9;
                           var10000 = var12 >> 1;
                           if (var8 == 0) {
                              break;
                           }
                        } else {
                           var10000 = 0;
                        }
                     }
                  }

                  var12 = var10000;
               }
            }
         }
      } catch (RuntimeException var42) {
         throw class670.method4877(var42, field4617[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field4617[2] : field4617[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 179
   )
   public final String toString() {
      try {
         ++field4607;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4617[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(Ljava/lang/String;II)V",
      line = 191
   )
   public static final void method2449(String arg0, int arg1, int arg2) {
      try {
         if (arg2 == 27501) {
            class286.method2180("", "", "", 0, 0, arg0, arg1);
            ++field4614;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4617[5] + (arg0 != null ? field4617[2] : field4617[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(I)I",
      line = 211
   )
   public final int method2450(int arg0) {
      try {
         ++field4613;
         if (arg0 != 0) {
            method2446(-121);
         }

         return this.field4610;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4617[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V",
      line = 221
   )
   public class324(String arg0, int arg1) {
      try {
         this.field4610 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4617[0] + (arg0 != null ? field4617[2] : field4617[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2451(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2452(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
