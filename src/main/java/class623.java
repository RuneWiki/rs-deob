import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class623 {
   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9085 = new String[]{method4505(method4504("@[\u0002l*")), method4505(method4504("EK@A")), method4505(method4504("@[\u0002o*")), method4505(method4504("P\u0010\u0002\u0003\u007f")), method4505(method4504("X\u0004@_")), method4505(method4504("@[\u0002i*")), method4505(method4504("@[\u0002h*")), method4505(method4504("@[\u0002k*")), method4505(method4504("@[\u0002n*"))};
   @OriginalMember(
      owner = "client!ke",
      name = "k",
      descriptor = "Lpn;"
   )
   public static class776 field9078 = new class776();
   @OriginalMember(
      owner = "client!ke",
      name = "g",
      descriptor = "I"
   )
   public static int field9083 = 0;
   @OriginalMember(
      owner = "client!ke",
      name = "e",
      descriptor = "I"
   )
   public int field9074;
   @OriginalMember(
      owner = "client!ke",
      name = "c",
      descriptor = "I"
   )
   public static int field9075;
   @OriginalMember(
      owner = "client!ke",
      name = "l",
      descriptor = "I"
   )
   public int field9076;
   @OriginalMember(
      owner = "client!ke",
      name = "d",
      descriptor = "I"
   )
   public static int field9077;
   @OriginalMember(
      owner = "client!ke",
      name = "b",
      descriptor = "I"
   )
   public static int field9079;
   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "I"
   )
   private int field9080;
   @OriginalMember(
      owner = "client!ke",
      name = "f",
      descriptor = "I"
   )
   public static int field9081;
   @OriginalMember(
      owner = "client!ke",
      name = "h",
      descriptor = "I"
   )
   public static int field9084;
   @OriginalMember(
      owner = "client!ke",
      name = "j",
      descriptor = "Lbk;"
   )
   public static class394 field9082;
   @OriginalMember(
      owner = "client!ke",
      name = "i",
      descriptor = "Lod;"
   )
   public class532 field9073;

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(Ljj;B)V"
   )
   public final void method4498(class128 arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         while(true) {
            int var4 = arg0.method1104(255);
            if (var4 != 0) {
               this.method4503(arg0, 13326, var4);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            int var5 = -5 / ((arg1 - -50) / 58);
            ++field9079;
            break;
         }

      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9085[5] + (arg0 != null ? field9085[3] : field9085[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(B)Lnia;"
   )
   public final synchronized class671 method4499(byte arg0) {
      try {
         if (arg0 > -61) {
            method4500(false);
         }

         ++field9075;
         class671 var2 = (class671)this.field9073.field7779.method5454((long)this.field9080, 18261);
         if (var2 != null) {
            return var2;
         } else {
            class671 var3 = class671.method4894(this.field9073.field7771, this.field9080, 0);
            if (var3 != null) {
               this.field9073.field7779.method5455(-2049, var3, (long)this.field9080);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9085[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4500(boolean arg0) {
      try {
         if (arg0) {
            field9083 = -54;
         }

         field9082 = null;
         field9078 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9085[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(IILiaa;)V"
   )
   public static final void method4501(int arg0, int arg1, class520 arg2) {
      int var3 = client.field4530;

      try {
         ++field9084;
         if (arg0 != 17328) {
            field9082 = null;
         }

         boolean var4 = ~arg2.method3829(-72, 1) == -2;
         if (var4) {
            class356.field5401[class276.field3852++] = arg1;
         }

         int var5 = arg2.method3829(-48, 2);
         class687 var6 = class661.field9578[arg1];
         if (var5 == 0) {
            if (var4) {
               var6.field10336 = false;
            } else if (~class741.field10996 == ~arg1) {
               throw new RuntimeException(field9085[4]);
            } else {
               class757 var7;
               label190: {
                  var7 = class252.field3369[arg1] = new class757();
                  var7.field11166 = (var6.field6116[0] + class669.field10064 >> 6) + ((var6.field9010 << 28) - -(var6.field6114[0] + class718.field10676 >> 6 << 14));
                  if (~var6.field10321 != 0) {
                     var7.field11165 = var6.field10321;
                     if (var3 == 0) {
                        break label190;
                     }
                  }

                  var7.field11165 = var6.field6077.method5632((byte)-109);
               }

               var7.field11162 = var6.field10318;
               var7.field11164 = var6.field10302;
               var7.field11169 = var6.field6048;
               if (~var6.field10311 < -1) {
                  class425.method3229(2, var6);
               }

               class661.field9578[arg1] = null;
               if (arg2.method3829(-64, 1) != 0) {
                  class578.method4264(arg1, arg2, (byte)61);
               }

            }
         } else if (~var5 == -2) {
            int var9;
            int var10;
            label299: {
               int var8 = arg2.method3829(-21, 3);
               var9 = var6.field6114[0];
               var10 = var6.field6116[0];
               if (~var8 == -1) {
                  --var9;
                  --var10;
                  if (var3 == 0) {
                     break label299;
                  }
               }

               if (~var8 != -2) {
                  if (var8 == 2) {
                     ++var9;
                     --var10;
                     if (var3 == 0) {
                        break label299;
                     }
                  }

                  if (~var8 != -4) {
                     if (var8 == 4) {
                        ++var9;
                        if (var3 == 0) {
                           break label299;
                        }
                     }

                     if (~var8 != -6) {
                        if (var8 == 6) {
                           ++var10;
                           if (var3 == 0) {
                              break label299;
                           }
                        }

                        if (var8 != 7) {
                           break label299;
                        }

                        ++var10;
                        ++var9;
                        if (var3 == 0) {
                           break label299;
                        }
                     }

                     --var9;
                     ++var10;
                     if (var3 == 0) {
                        break label299;
                     }
                  }

                  --var9;
                  if (var3 == 0) {
                     break label299;
                  }
               }

               --var10;
            }

            if (!var4) {
               var6.method4997(true, class790.field11482[arg1], var9, var10);
            } else {
               var6.field10342 = var10;
               var6.field10349 = var9;
               var6.field10336 = true;
            }
         } else if (~var5 == -3) {
            int var12;
            int var13;
            label272: {
               int var11 = arg2.method3829(-41, 4);
               var12 = var6.field6114[0];
               var13 = var6.field6116[0];
               if (var11 != 0) {
                  if (var11 != 1) {
                     if (var11 == 2) {
                        var13 -= 2;
                        if (var3 == 0) {
                           break label272;
                        }
                     }

                     if (~var11 != -4) {
                        if (var11 != 4) {
                           if (~var11 != -6) {
                              if (~var11 == -7) {
                                 var12 += 2;
                                 --var13;
                                 if (var3 == 0) {
                                    break label272;
                                 }
                              }

                              if (~var11 == -8) {
                                 var12 -= 2;
                                 if (var3 == 0) {
                                    break label272;
                                 }
                              }

                              if (~var11 == -9) {
                                 var12 += 2;
                                 if (var3 == 0) {
                                    break label272;
                                 }
                              }

                              if (var11 != 9) {
                                 if (var11 != 10) {
                                    if (var11 == 11) {
                                       var13 += 2;
                                       var12 -= 2;
                                       if (var3 == 0) {
                                          break label272;
                                       }
                                    }

                                    if (var11 == 12) {
                                       var13 += 2;
                                       --var12;
                                       if (var3 == 0) {
                                          break label272;
                                       }
                                    }

                                    if (~var11 == -14) {
                                       var13 += 2;
                                       if (var3 == 0) {
                                          break label272;
                                       }
                                    }

                                    if (~var11 != -15) {
                                       if (var11 != 15) {
                                          break label272;
                                       }

                                       var12 += 2;
                                       var13 += 2;
                                       if (var3 == 0) {
                                          break label272;
                                       }
                                    }

                                    var13 += 2;
                                    ++var12;
                                    if (var3 == 0) {
                                       break label272;
                                    }
                                 }

                                 ++var13;
                                 var12 += 2;
                                 if (var3 == 0) {
                                    break label272;
                                 }
                              }

                              var12 -= 2;
                              ++var13;
                              if (var3 == 0) {
                                 break label272;
                              }
                           }

                           --var13;
                           var12 -= 2;
                           if (var3 == 0) {
                              break label272;
                           }
                        }

                        var12 += 2;
                        var13 -= 2;
                        if (var3 == 0) {
                           break label272;
                        }
                     }

                     ++var12;
                     var13 -= 2;
                     if (var3 == 0) {
                        break label272;
                     }
                  }

                  --var12;
                  var13 -= 2;
                  if (var3 == 0) {
                     break label272;
                  }
               }

               var13 -= 2;
               var12 -= 2;
            }

            if (!var4) {
               var6.method4997(true, class790.field11482[arg1], var12, var13);
            } else {
               var6.field10349 = var12;
               var6.field10336 = true;
               var6.field10342 = var13;
            }
         } else {
            int var14 = arg2.method3829(arg0 ^ -17367, 1);
            if (var14 == 0) {
               int var15 = arg2.method3829(arg0 + -17447, 12);
               int var16 = var15 >> 10;
               int var17 = (993 & var15) >> 5;
               if (~var17 < -16) {
                  var17 -= 32;
               }

               int var18 = 31 & var15;
               if (var18 > 15) {
                  var18 -= 32;
               }

               int var19;
               int var20;
               label279: {
                  var19 = var6.field6114[0] + var17;
                  var20 = var6.field6116[0] + var18;
                  if (!var4) {
                     var6.method4997(true, class790.field11482[arg1], var19, var20);
                     if (var3 == 0) {
                        break label279;
                     }
                  }

                  var6.field10342 = var20;
                  var6.field10336 = true;
                  var6.field10349 = var19;
               }

               var6.field9010 = var6.field9005 = (byte)(var6.field9010 + var16 & 3);
               if (class598.method4378(var19, (byte)-64, var20)) {
                  ++var6.field9005;
               }

               if (~class741.field10996 == ~arg1) {
                  if (class551.field8158 != var6.field9010) {
                     class321.field4583 = true;
                  }

                  class551.field8158 = var6.field9010;
               }

            } else {
               int var22;
               int var25;
               int var26;
               label289: {
                  int var21 = arg2.method3829(-39, 30);
                  var22 = var21 >> 28;
                  int var23 = var21 >> 14 & 16383;
                  int var24 = var21 & 16383;
                  var25 = (16383 & var6.field6114[0] + class718.field10676 + var23) - class718.field10676;
                  var26 = (16383 & var6.field6116[0] + class669.field10064 + var24) - class669.field10064;
                  if (var4) {
                     var6.field10349 = var25;
                     var6.field10336 = true;
                     var6.field10342 = var26;
                     if (var3 == 0) {
                        break label289;
                     }
                  }

                  var6.method4997(true, class790.field11482[arg1], var25, var26);
               }

               var6.field9010 = var6.field9005 = (byte)(3 & var6.field9010 + var22);
               if (class598.method4378(var25, (byte)-64, var26)) {
                  ++var6.field9005;
               }

               if (class741.field10996 == arg1) {
                  class551.field8158 = var6.field9010;
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class670.method4877(var28, field9085[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9085[3] : field9085[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(IZIII)V"
   )
   public static final void method4502(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field9077;
         int var6 = 0;
         if (!arg1) {
            method4500(true);
         }

         int var7 = arg3;
         int var8 = -arg3;
         byte var9 = -1;
         int var10 = class768.method5559(arg2 + arg3, class100.field1232, class197.field2442, 71);
         int var11 = class768.method5559(arg2 - arg3, class100.field1232, class197.field2442, 71);
         class47.method372(var10, class292.field4077[arg4], arg0, (byte)127, var11);
         int var10000;
         int var10001;
         int var22;
         if (var5 != 0) {
            var22 = var9 + 2;
            var10000 = var8;
            var10001 = var22;
         } else {
            if (arg3 <= var6) {
               return;
            }

            var22 = var9 + 2;
            var10000 = var8;
            var10001 = var22;
         }

         while(true) {
            while(true) {
               var8 = var10000 + var10001;
               if (var8 > 0) {
                  --var7;
                  var8 -= var7 << 1;
                  int var12 = -var7 + arg4;
                  int var13 = arg4 - -var7;
                  if (var13 >= class506.field7472 && ~class22.field234 <= ~var12) {
                     int var14 = class768.method5559(arg2 - -var6, class100.field1232, class197.field2442, 71);
                     int var15 = class768.method5559(-var6 + arg2, class100.field1232, class197.field2442, 71);
                     if (class22.field234 >= var13) {
                        class47.method372(var14, class292.field4077[var13], arg0, (byte)98, var15);
                     }

                     if (~class506.field7472 >= ~var12) {
                        class47.method372(var14, class292.field4077[var12], arg0, (byte)108, var15);
                     }
                  }
               }

               ++var6;
               int var16 = arg4 - var6;
               int var17 = arg4 - -var6;
               if (var17 < class506.field7472) {
                  break;
               }

               var10000 = var16;
               var10001 = class22.field234;
               if (var5 == 0) {
                  if (var16 <= var10001) {
                     int var18 = class768.method5559(arg2 + var7, class100.field1232, class197.field2442, 71);
                     int var19 = class768.method5559(-var7 + arg2, class100.field1232, class197.field2442, 71);
                     if (~var17 >= ~class22.field234) {
                        class47.method372(var18, class292.field4077[var17], arg0, (byte)110, var19);
                     }

                     if (var16 >= class506.field7472) {
                        class47.method372(var18, class292.field4077[var16], arg0, (byte)112, var19);
                     }
                  }
                  break;
               }
            }

            if (var7 <= var6) {
               return;
            }

            var22 += 2;
            var10000 = var8;
            var10001 = var22;
         }
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field9085[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(Ljj;II)V"
   )
   private final void method4503(class128 arg0, int arg1, int arg2) {
      try {
         label31: {
            ++field9081;
            if (arg2 != 1) {
               if (~arg2 != -3) {
                  break label31;
               }

               this.field9076 = arg0.method1104(255);
               this.field9074 = arg0.method1104(255);
               if (client.field4530 == 0) {
                  break label31;
               }
            }

            this.field9080 = arg0.method1038((byte)-124);
         }

         if (arg1 != 13326) {
            this.method4499((byte)-40);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9085[6] + (arg0 != null ? field9085[3] : field9085[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4504(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4505(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
