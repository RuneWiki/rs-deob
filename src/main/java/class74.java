import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class74 {
   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "Loi;"
   )
   private class80 field909 = new class80(64);
   @OriginalMember(
      owner = "client!wc",
      name = "b",
      descriptor = "Lkf;"
   )
   private class266 field910;
   @OriginalMember(
      owner = "client!wc",
      name = "e",
      descriptor = "Lkf;"
   )
   private class266 field911;
   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field917 = new String[]{method682(method681("/Px\u0001j")), method682(method681("#\u001dx\u0013~:\u0017\"\u0011?")), method682(method681(":\u000b:C")), method682(method681("#\u001dxm?")), method682(method681(":\u0018")), method682(method681("#\u001dxn?")), method682(method681("#\u001dxl?")), method682(method681("'D:]"))};
   @OriginalMember(
      owner = "client!wc",
      name = "i",
      descriptor = "I"
   )
   public static int field908 = -1;
   @OriginalMember(
      owner = "client!wc",
      name = "g",
      descriptor = "I"
   )
   public static int field912;
   @OriginalMember(
      owner = "client!wc",
      name = "d",
      descriptor = "I"
   )
   public static int field913;
   @OriginalMember(
      owner = "client!wc",
      name = "f",
      descriptor = "I"
   )
   public static int field914;
   @OriginalMember(
      owner = "client!wc",
      name = "c",
      descriptor = "I"
   )
   public static int field915;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!wc",
      name = "h",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field916;

   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4360;

      try {
         ++field912;
         if (arg3 >= 0 && arg5 >= 0 && ~arg3 > ~(class644.field9403 - 1) && arg5 < class337.field4594 + -1) {
            label156: {
               if (class663.field9659 == null) {
                  return;
               }

               if (~arg0 == -1) {
                  class604 var9 = (class604)class45.method381(arg2, arg3, arg5);
                  class604 var10 = (class604)class30.method271(arg2, arg3, arg5);
                  if (var9 != null && arg4 != 2) {
                     label164: {
                        if (var9 instanceof class617) {
                           ((class617)var9).field9094.method1296(arg1, false);
                           if (!var8) {
                              break label164;
                           }
                        }

                        class357.method2662(arg3, arg1, arg0, arg4, var9.method236(28154), arg5, arg2, arg6, -123);
                     }
                  }

                  if (var10 == null) {
                     break label156;
                  }

                  if (var10 instanceof class617) {
                     ((class617)var10).field9094.method1296(arg1, false);
                     if (!var8) {
                        break label156;
                     }
                  }

                  class357.method2662(arg3, arg1, arg0, arg4, var10.method236(28154), arg5, arg2, arg6, arg7 + -113);
                  if (!var8) {
                     break label156;
                  }
               }

               if (arg0 != 1) {
                  if (~arg0 == -3) {
                     class604 var11 = (class604)class691.method5042(arg2, arg3, arg5, field916 != null ? field916 : (field916 = method680(field917[4])));
                     if (var11 == null) {
                        break label156;
                     }

                     if (~arg4 == -12) {
                        arg4 = 10;
                     }

                     if (var11 instanceof class288) {
                        ((class288)var11).field3999.method1296(arg1, false);
                        if (!var8) {
                           break label156;
                        }
                     }

                     class357.method2662(arg3, arg1, arg0, arg4, var11.method236(arg7 + 28151), arg5, arg2, arg6, arg7 ^ -128);
                     if (!var8) {
                        break label156;
                     }
                  }

                  if (arg0 != 3) {
                     break label156;
                  }

                  class604 var12 = (class604)class216.method1708(arg2, arg3, arg5);
                  if (var12 == null) {
                     break label156;
                  }

                  if (!(var12 instanceof class238)) {
                     class357.method2662(arg3, arg1, arg0, arg4, var12.method236(28154), arg5, arg2, arg6, -119);
                     if (!var8) {
                        break label156;
                     }
                  }

                  ((class238)var12).field3312.method1296(arg1, false);
                  if (!var8) {
                     break label156;
                  }
               }

               class604 var13 = (class604)class500.method3630(arg2, arg3, arg5);
               if (var13 != null) {
                  label161: {
                     if (var13 instanceof class609) {
                        ((class609)var13).field8929.method1296(arg1, false);
                        if (!var8) {
                           break label161;
                        }
                     }

                     int var14 = var13.method236(28154);
                     if (arg4 != 4 && ~arg4 != -6) {
                        if (~arg4 == -7) {
                           class357.method2662(arg3, arg1, arg0, 4, var14, arg5, arg2, arg6 + 4, arg7 + -122);
                           if (!var8) {
                              break label161;
                           }
                        }

                        if (arg4 == 7) {
                           class357.method2662(arg3, arg1, arg0, 4, var14, arg5, arg2, (3 & arg6 + 2) - -4, arg7 + -124);
                           if (!var8) {
                              break label161;
                           }
                        }

                        if (arg4 != 8) {
                           break label161;
                        }

                        class357.method2662(arg3, arg1, arg0, 4, var14, arg5, arg2, arg6 + 4, -105);
                        class357.method2662(arg3, arg1, arg0, 4, var14, arg5, arg2, (arg6 + 2 & 3) + 4, -100);
                        if (!var8) {
                           break label161;
                        }
                     }

                     class357.method2662(arg3, arg1, arg0, 4, var14, arg5, arg2, arg6, arg7 + -107);
                  }
               }
            }
         }

         if (arg7 != 3) {
            method678((class534)null, -97, 121);
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field917[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "(Lbda;II)V"
   )
   public static final void method678(class534 arg0, int arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field915;
         boolean var4 = ~arg0.method3844(1, 0) == -2;
         if (var4) {
            class266.field3682[class753.field11133++] = arg1;
         }

         int var5 = arg0.method3844(2, arg2 + 30416);
         class121 var6 = class380.field5483[arg1];
         if (var5 == 0) {
            if (var4) {
               var6.field1574 = false;
            } else if (class358.field4891 == arg1) {
               throw new RuntimeException(field917[7]);
            } else {
               class71 var7;
               label191: {
                  var7 = class430.field6153[arg1] = new class71();
                  var7.field872 = (var6.field3888[0] + class672.field9740 >> 6 << 14) + ((var6.field10701 << 28) - -(var6.field3884[0] + class533.field7595 >> 6));
                  if (var6.field1545 == -1) {
                     var7.field874 = var6.field3876.method2847(16383);
                     if (!var3) {
                        break label191;
                     }
                  }

                  var7.field874 = var6.field1545;
               }

               var7.field870 = var6.field3857;
               var7.field868 = var6.field1535;
               var7.field875 = var6.field1555;
               if (~var6.field1546 < -1) {
                  class787.method5682(true, var6);
               }

               class380.field5483[arg1] = null;
               if (~arg0.method3844(1, 0) != -1) {
                  class26.method258(arg0, false, arg1);
               }

            }
         } else if (var5 == 1) {
            int var9;
            int var10;
            label221: {
               int var8 = arg0.method3844(3, 0);
               var9 = var6.field3888[0];
               var10 = var6.field3884[0];
               if (~var8 != -1) {
                  if (var8 != 1) {
                     if (var8 != 2) {
                        if (~var8 == -4) {
                           --var9;
                           if (!var3) {
                              break label221;
                           }
                        }

                        if (~var8 == -5) {
                           ++var9;
                           if (!var3) {
                              break label221;
                           }
                        }

                        if (~var8 != -6) {
                           if (var8 != 6) {
                              if (var8 != 7) {
                                 break label221;
                              }

                              ++var10;
                              ++var9;
                              if (!var3) {
                                 break label221;
                              }
                           }

                           ++var10;
                           if (!var3) {
                              break label221;
                           }
                        }

                        --var9;
                        ++var10;
                        if (!var3) {
                           break label221;
                        }
                     }

                     ++var9;
                     --var10;
                     if (!var3) {
                        break label221;
                     }
                  }

                  --var10;
                  if (!var3) {
                     break label221;
                  }
               }

               --var10;
               --var9;
            }

            if (var4) {
               var6.field1574 = true;
               var6.field1523 = var10;
               var6.field1572 = var9;
            } else {
               var6.method977(var10, class187.field2660[arg1], var9, (byte)42);
            }
         } else if (var5 == 2) {
            int var12;
            int var13;
            label302: {
               int var11 = arg0.method3844(4, arg2 + 30416);
               var12 = var6.field3888[0];
               var13 = var6.field3884[0];
               if (var11 == 0) {
                  var13 -= 2;
                  var12 -= 2;
                  if (!var3) {
                     break label302;
                  }
               }

               if (~var11 == -2) {
                  --var12;
                  var13 -= 2;
                  if (!var3) {
                     break label302;
                  }
               }

               if (var11 != 2) {
                  if (~var11 != -4) {
                     if (var11 == 4) {
                        var12 += 2;
                        var13 -= 2;
                        if (!var3) {
                           break label302;
                        }
                     }

                     if (var11 == 5) {
                        --var13;
                        var12 -= 2;
                        if (!var3) {
                           break label302;
                        }
                     }

                     if (~var11 != -7) {
                        if (~var11 != -8) {
                           if (var11 == 8) {
                              var12 += 2;
                              if (!var3) {
                                 break label302;
                              }
                           }

                           if (var11 == 9) {
                              ++var13;
                              var12 -= 2;
                              if (!var3) {
                                 break label302;
                              }
                           }

                           if (var11 != 10) {
                              if (~var11 != -12) {
                                 if (var11 != 12) {
                                    if (var11 == 13) {
                                       var13 += 2;
                                       if (!var3) {
                                          break label302;
                                       }
                                    }

                                    if (var11 != 14) {
                                       if (~var11 != -16) {
                                          break label302;
                                       }

                                       var13 += 2;
                                       var12 += 2;
                                       if (!var3) {
                                          break label302;
                                       }
                                    }

                                    ++var12;
                                    var13 += 2;
                                    if (!var3) {
                                       break label302;
                                    }
                                 }

                                 --var12;
                                 var13 += 2;
                                 if (!var3) {
                                    break label302;
                                 }
                              }

                              var13 += 2;
                              var12 -= 2;
                              if (!var3) {
                                 break label302;
                              }
                           }

                           var12 += 2;
                           ++var13;
                           if (!var3) {
                              break label302;
                           }
                        }

                        var12 -= 2;
                        if (!var3) {
                           break label302;
                        }
                     }

                     var12 += 2;
                     --var13;
                     if (!var3) {
                        break label302;
                     }
                  }

                  var13 -= 2;
                  ++var12;
                  if (!var3) {
                     break label302;
                  }
               }

               var13 -= 2;
            }

            if (var4) {
               var6.field1574 = true;
               var6.field1572 = var12;
               var6.field1523 = var13;
            } else {
               var6.method977(var13, class187.field2660[arg1], var12, (byte)119);
            }
         } else {
            int var14 = arg0.method3844(1, 0);
            if (var14 == 0) {
               int var15 = arg0.method3844(12, 0);
               int var16 = var15 >> 10;
               int var17 = (var15 & 1017) >> 5;
               if (var17 > 15) {
                  var17 -= 32;
               }

               int var18 = var15 & 31;
               if (~var18 < -16) {
                  var18 -= 32;
               }

               int var19;
               int var20;
               label281: {
                  var19 = var6.field3888[0] - -var17;
                  var20 = var6.field3884[0] - -var18;
                  if (var4) {
                     var6.field1574 = true;
                     var6.field1572 = var19;
                     var6.field1523 = var20;
                     if (!var3) {
                        break label281;
                     }
                  }

                  var6.method977(var20, class187.field2660[arg1], var19, (byte)119);
               }

               var6.field10701 = var6.field10702 = (byte)(var6.field10701 + var16 & 3);
               if (class437.method3224(var20, true, var19)) {
                  ++var6.field10702;
               }

               if (class358.field4891 == arg1) {
                  if (class561.field8019 != var6.field10701) {
                     class171.field2384 = true;
                  }

                  class561.field8019 = var6.field10701;
               }

            } else {
               int var21 = arg0.method3844(30, 0);
               if (arg2 == -30416) {
                  int var22;
                  int var25;
                  int var26;
                  label289: {
                     var22 = var21 >> 28;
                     int var23 = var21 >> 14 & 16383;
                     int var24 = 16383 & var21;
                     var25 = (16383 & class672.field9740 + var23 + var6.field3888[0]) + -class672.field9740;
                     var26 = (var6.field3884[0] + class533.field7595 - -var24 & 16383) + -class533.field7595;
                     if (var4) {
                        var6.field1574 = true;
                        var6.field1523 = var26;
                        var6.field1572 = var25;
                        if (!var3) {
                           break label289;
                        }
                     }

                     var6.method977(var26, class187.field2660[arg1], var25, (byte)89);
                  }

                  var6.field10701 = var6.field10702 = (byte)(var6.field10701 + var22 & 3);
                  if (class437.method3224(var26, true, var25)) {
                     ++var6.field10702;
                  }

                  if (class358.field4891 == arg1) {
                     class561.field8019 = var6.field10701;
                  }
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class237.method1823(var28, field917[6] + (arg0 != null ? field917[0] : field917[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "(II)Lcv;"
   )
   public final class595 method679(int arg0, int arg1) {
      try {
         ++field914;
         class595 var3 = (class595)this.field909.method725(0, (long)arg0);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label25: {
               if (arg1 >= ~arg0) {
                  var4 = this.field911.method2037(false, 32767 & arg0, 0);
                  if (!client.field4360) {
                     break label25;
                  }
               }

               var4 = this.field910.method2037(false, arg0, 0);
            }

            class595 var5 = new class595();
            if (var4 != null) {
               var5.method4323((byte)-32, new class147(var4));
            }

            if (arg0 >= 32768) {
               var5.method4320(-118);
            }

            this.field909.method723(0, (long)arg0, var5);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field917[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "<init>",
      descriptor = "(ILkf;Lkf;)V"
   )
   public class74(int arg0, class266 arg1, class266 arg2) {
      try {
         this.field910 = arg1;
         this.field911 = arg2;
         if (this.field910 != null) {
            this.field910.method2060(2, 0);
         }

         if (this.field911 != null) {
            this.field911.method2060(2, 0);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field917[1] + arg0 + ',' + (arg1 != null ? field917[0] : field917[2]) + ',' + (arg2 != null ? field917[0] : field917[2]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method680(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method681(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method682(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
