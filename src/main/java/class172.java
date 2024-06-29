import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class172 extends class70 {
   @OriginalMember(
      owner = "client!pja",
      name = "I",
      descriptor = "I"
   )
   private int field2231 = 32768;
   @OriginalMember(
      owner = "client!pja",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2236 = new String[]{method1482(method1481("kJ\u0007\u001a\b3")), method1482(method1481("kJ\u0007\u001a\u000b3")), method1482(method1481("kJ\u0007\u001a\u00053")), method1482(method1481("kJ\u0007\u001a\u00033")), method1482(method1481("uU\nX")), method1482(method1481("`\u000eH\u001a:")), method1482(method1481("kJ\u0007\u001a\u00043"))};
   @OriginalMember(
      owner = "client!pja",
      name = "N",
      descriptor = "F"
   )
   public static float field2230;
   @OriginalMember(
      owner = "client!pja",
      name = "M",
      descriptor = "I"
   )
   public static int field2229;
   @OriginalMember(
      owner = "client!pja",
      name = "J",
      descriptor = "I"
   )
   public static int field2232;
   @OriginalMember(
      owner = "client!pja",
      name = "O",
      descriptor = "I"
   )
   public static int field2233;
   @OriginalMember(
      owner = "client!pja",
      name = "K",
      descriptor = "I"
   )
   public static int field2234;
   @OriginalMember(
      owner = "client!pja",
      name = "L",
      descriptor = "I"
   )
   public static int field2235;

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label48: {
            label42: {
               if (~arg2 != -1) {
                  if (arg2 != 1) {
                     break label48;
                  }

                  if (!var4) {
                     break label42;
                  }
               }

               this.field2231 = arg1.method603(-2) << 4;
               if (!var4) {
                  break label48;
               }
            }

            super.field930 = arg1.method640(255) == 1;
         }

         if (arg0 >= -34) {
            this.method547(39, -97);
         }

         ++field2229;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2236[6] + arg0 + ',' + (arg1 != null ? field2236[5] : field2236[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         if (arg0 > -36) {
            field2230 = -0.027592082F;
         }

         class704.method5119(true);
         ++field2232;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2236[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 != -63) {
            this.method552(-74);
         }

         ++field2234;
         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int[] var5 = this.method690(-91, 1, arg1);
            int[] var6 = this.method690(arg0 ^ -78, 2, arg1);
            int var7 = 0;
            if (var3 || class262.field3328 > var7) {
               do {
                  int var8 = 255 & var5[var7] >> 4;
                  int var9 = var6[var7] * this.field2231 >> 12;
                  int var10 = class123.field1612[var8] * var9 >> 12;
                  int var11 = class794.field11620[var8] * var9 >> 12;
                  int var12 = class174.field2249 & (var10 >> 12) + var7;
                  int var13 = class623.field9205 & (var11 >> 12) + arg1;
                  int[] var14 = this.method690(97, 0, var13);
                  var4[var7] = var14[var12];
                  ++var7;
               } while(class262.field3328 > var7);
            }
         }

         return var4;
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field2236[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field2233;
         int[][] var4 = super.field926.method2860(0, arg1);
         if (arg0 != -6752) {
            return null;
         } else {
            if (super.field926.field5048) {
               int[] var5 = this.method690(arg0 + 6810, 1, arg1);
               int[] var6 = this.method690(arg0 + 6644, 2, arg1);
               int[] var7 = var4[0];
               int[] var8 = var4[1];
               int[] var9 = var4[2];
               int var10 = 0;
               if (var3 || var10 < class262.field3328) {
                  do {
                     int var11 = var5[var10] * 255 >> 12 & 255;
                     int var12 = var6[var10] * this.field2231 >> 12;
                     int var13 = class123.field1612[var11] * var12 >> 12;
                     int var14 = class794.field11620[var11] * var12 >> 12;
                     int var15 = class174.field2249 & var10 - -(var13 >> 12);
                     int var16 = class623.field9205 & (var14 >> 12) + arg1;
                     int[][] var17 = this.method696(var16, 0, 32767);
                     var7[var10] = var17[0][var15];
                     var8[var10] = var17[1][var15];
                     var9[var10] = var17[2][var15];
                     ++var10;
                  } while(var10 < class262.field3328);
               }
            }

            return var4;
         }
      } catch (RuntimeException var19) {
         throw class93.method866(var19, field2236[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(Lsa;I[I[I[I)V"
   )
   public static final void method1480(class783 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
      boolean var5 = client.field1481;

      try {
         int var6 = 0;
         int var10000;
         if (var5) {
            var10000 = arg4[var6];
         } else if (var6 >= arg4.length) {
            var10000 = arg1;
            if (!var5) {
               if (arg1 != 1) {
                  field2230 = 0.35203F;
               }

               ++field2235;
               return;
            }
         } else {
            var10000 = arg4[var6];
         }

         while(true) {
            int var10001;
            label194:
            while(true) {
               label192: {
                  int var7 = var10000;
                  int var8 = arg3[var6];
                  int var9 = arg2[var6];
                  int var10 = 0;
                  if (!var5) {
                     if (var8 == 0) {
                        ++var6;
                        var10000 = var6;
                        var10001 = arg4.length;
                        break label192;
                     }

                     var10000 = arg0.field134.length;
                     var10001 = var10;
                     if (var5) {
                        break;
                     }

                     if (var10000 <= var10) {
                        ++var6;
                        var10000 = var6;
                        var10001 = arg4.length;
                        break label192;
                     }
                  }

                  while(true) {
                     if (~(var8 & 1) != -1) {
                        if (~var7 != 0) {
                           class238 var11 = class532.field7812.method2473((byte)86, var7);
                           int var12 = var11.field3004;
                           class287 var13 = arg0.field134[var10];
                           if (var13 != null) {
                              if (~var13.field3978 == ~var7) {
                                 if (var12 == 0) {
                                    var13 = arg0.field134[var10] = null;
                                 } else if (~var12 == -2) {
                                    var13.field3974 = 0;
                                    var13.field3973 = 1;
                                    var13.field3969 = var9;
                                    var13.field3972 = 0;
                                    var13.field3976 = 0;
                                    if (!arg0.field148) {
                                       class774.method5586(arg0, var11, 1673748489, 0);
                                       if (var5 && ~var12 == -3) {
                                          var13.field3974 = 0;
                                          if (var5 && ~var11.field3021 <= ~class532.field7812.method2473((byte)86, var13.field3978).field3021) {
                                             var13 = arg0.field134[var10] = null;
                                          }
                                       }
                                    }
                                 } else if (~var12 == -3) {
                                    var13.field3974 = 0;
                                    if (var5 && ~var11.field3021 <= ~class532.field7812.method2473((byte)86, var13.field3978).field3021) {
                                       var13 = arg0.field134[var10] = null;
                                    }
                                 }
                              } else if (~var11.field3021 <= ~class532.field7812.method2473((byte)86, var13.field3978).field3021) {
                                 var13 = arg0.field134[var10] = null;
                              }
                           }

                           if (var13 == null) {
                              class287 var14 = arg0.field134[var10] = new class287();
                              var14.field3978 = var7;
                              var14.field3969 = var9;
                              var14.field3972 = 0;
                              var14.field3974 = 0;
                              var14.field3976 = 0;
                              var14.field3973 = 1;
                              if (!arg0.field148) {
                                 class774.method5586(arg0, var11, 1673748489, 0);
                                 if (var5) {
                                    arg0.field134[var10] = null;
                                 }
                              }
                           }

                           ++var10;
                           var8 >>>= 1;
                        } else {
                           arg0.field134[var10] = null;
                           ++var10;
                           var8 >>>= 1;
                        }
                     } else {
                        ++var10;
                        var8 >>>= 1;
                     }

                     if (var8 == 0) {
                        ++var6;
                        var10000 = var6;
                        var10001 = arg4.length;
                        break;
                     }

                     var10000 = arg0.field134.length;
                     var10001 = var10;
                     if (var5) {
                        break label194;
                     }

                     if (var10000 <= var10) {
                        ++var6;
                        var10000 = var6;
                        var10001 = arg4.length;
                        break;
                     }
                  }
               }

               if (var10000 >= var10001) {
                  var10000 = arg1;
                  if (!var5) {
                     if (arg1 != 1) {
                        field2230 = 0.35203F;
                     }

                     ++field2235;
                     return;
                  }
               } else {
                  var10000 = arg4[var6];
               }
            }

            if (var10000 >= var10001) {
               var10000 = arg1;
               if (!var5) {
                  if (arg1 != 1) {
                     field2230 = 0.35203F;
                  }

                  ++field2235;
                  return;
               }
            } else {
               var10000 = arg4[var6];
            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field2236[3] + (arg0 != null ? field2236[5] : field2236[4]) + ',' + arg1 + ',' + (arg2 != null ? field2236[5] : field2236[4]) + ',' + (arg3 != null ? field2236[5] : field2236[4]) + ',' + (arg4 != null ? field2236[5] : field2236[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "<init>",
      descriptor = "()V"
   )
   public class172() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1481(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1482(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
