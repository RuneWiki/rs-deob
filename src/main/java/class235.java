import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class235 implements class505 {
   @OriginalMember(
      owner = "client!em",
      name = "j",
      descriptor = "Lkv;"
   )
   private class281 field2981;
   @OriginalMember(
      owner = "client!em",
      name = "e",
      descriptor = "Les;"
   )
   private class402 field2988;
   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2992 = new String[]{method1767(method1766("}\u0018d\u0002M")), method1767(method1766("hC&@")), method1767(method1766("c[dj\u0018")), method1767(method1766("c[do\u0018")), method1767(method1766("c[di\u0018")), method1767(method1766("c[dh\u0018")), method1767(method1766("c[dm\u0018")), method1767(method1766("c[de\u0018")), method1767(method1766("c[dn\u0018")), method1767(method1766("c[d\u0010Yh_>\u0012\u0018")), method1767(method1766("c[dk\u0018"))};
   @OriginalMember(
      owner = "client!em",
      name = "i",
      descriptor = "I"
   )
   public static int field2982;
   @OriginalMember(
      owner = "client!em",
      name = "c",
      descriptor = "I"
   )
   public static int field2983;
   @OriginalMember(
      owner = "client!em",
      name = "g",
      descriptor = "I"
   )
   public static int field2984;
   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "I"
   )
   public static int field2985;
   @OriginalMember(
      owner = "client!em",
      name = "f",
      descriptor = "I"
   )
   public static int field2987;
   @OriginalMember(
      owner = "client!em",
      name = "h",
      descriptor = "I"
   )
   public static int field2990;
   @OriginalMember(
      owner = "client!em",
      name = "b",
      descriptor = "I"
   )
   public static int field2991;
   @OriginalMember(
      owner = "client!em",
      name = "d",
      descriptor = "Lat;"
   )
   public static class396 field2989;
   @OriginalMember(
      owner = "client!em",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field2986;

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(B)I",
      line = 3
   )
   public static final int method1761(byte arg0) {
      int var1 = client.field4530;

      try {
         ++field2991;
         int var2 = 68 / ((64 - arg0) / 47);
         if (class331.field4741 == null) {
            if (!class750.field11111 && class585.field8681 != null) {
               return class585.field8681.field4331;
            }

            int var3 = class723.field10766.method368((byte)106);
            int var4 = class723.field10766.method366(true);
            if (!class16.field194) {
               if (var3 <= class319.field4561 || class712.field10630 + class319.field4561 <= var3) {
                  return -1;
               }

               int var5;
               int var10000;
               label439: {
                  var5 = -1;
                  int var6 = 0;
                  if (var1 != 0) {
                     var10000 = class382.field5859;
                  } else if (~var6 <= ~class354.field5375) {
                     var10000 = ~var5;
                     if (var1 == 0) {
                        break label439;
                     }
                  } else {
                     var10000 = class382.field5859;
                  }

                  while(true) {
                     int var8;
                     if (var10000 == 0) {
                        int var7 = (class354.field5375 + -1 + -var6) * 16 + class10.field147 + 31;
                        if (~var4 < ~(var7 - 13)) {
                           if (var4 <= var7 + 3) {
                              var5 = var6;
                              if (var1 != 0) {
                                 var8 = (class354.field5375 + -1 + -var6) * 16 + 33 + class10.field147;
                                 if (var4 > var8 + -13 && ~var4 >= ~(var8 + 3)) {
                                    var5 = var6;
                                 }

                                 ++var6;
                              } else {
                                 ++var6;
                              }
                           } else {
                              ++var6;
                           }
                        } else {
                           ++var6;
                        }
                     } else {
                        var8 = (class354.field5375 + -1 + -var6) * 16 + 33 + class10.field147;
                        if (var4 > var8 + -13 && ~var4 >= ~(var8 + 3)) {
                           var5 = var6;
                        }

                        ++var6;
                     }

                     if (~var6 <= ~class354.field5375) {
                        var10000 = ~var5;
                        if (var1 == 0) {
                           break;
                        }
                     } else {
                        var10000 = class382.field5859;
                     }
                  }
               }

               if (var10000 == 0) {
                  return -1;
               }

               int var9 = 0;
               class144 var10 = new class144(class459.field6947);
               class303 var11 = (class303)var10.method1194(127);
               if (var1 != 0) {
                  if (var9++ == var5) {
                     return var11.field4331;
                  }

                  var11 = (class303)var10.method1198((byte)96);
               }

               while(true) {
                  while(var11 != null) {
                     if (var9++ == var5) {
                        return var11.field4331;
                     }

                     var11 = (class303)var10.method1198((byte)96);
                  }

                  if (var1 == 0) {
                     if (var1 == 0) {
                        return -1;
                     }
                     break;
                  }

                  var11 = (class303)var10.method1198((byte)96);
               }
            }

            if (var3 > class319.field4561 && ~(class712.field10630 + class319.field4561) < ~var3) {
               int var12 = -1;
               int var13 = 0;
               int var14;
               int var15;
               if (var1 != 0) {
                  if (class382.field5859) {
                     var14 = var13 * 16 + class10.field147 + 33;
                     if (~var4 < ~(var14 + -13)) {
                        if (~var4 >= ~(var14 + 3)) {
                           var12 = var13;
                           if (var1 != 0) {
                              var15 = var13 * 16 + 31 + class10.field147;
                              if (var15 + -13 < var4 && ~(var15 + 3) <= ~var4) {
                                 var12 = var13;
                              }

                              ++var13;
                           } else {
                              ++var13;
                           }
                        } else {
                           ++var13;
                        }
                     } else {
                        ++var13;
                     }
                  } else {
                     var15 = var13 * 16 + 31 + class10.field147;
                     if (var15 + -13 < var4 && ~(var15 + 3) <= ~var4) {
                        var12 = var13;
                     }

                     ++var13;
                  }
               }

               label371:
               while(true) {
                  while(class554.field8214 > var13) {
                     if (class382.field5859) {
                        var14 = var13 * 16 + class10.field147 + 33;
                        if (~var4 < ~(var14 + -13)) {
                           if (~var4 >= ~(var14 + 3)) {
                              var12 = var13;
                              if (var1 != 0) {
                                 var15 = var13 * 16 + 31 + class10.field147;
                                 if (var15 + -13 < var4 && ~(var15 + 3) <= ~var4) {
                                    var12 = var13;
                                 }

                                 ++var13;
                              } else {
                                 ++var13;
                              }
                           } else {
                              ++var13;
                           }
                        } else {
                           ++var13;
                        }
                     } else {
                        var15 = var13 * 16 + 31 + class10.field147;
                        if (var15 + -13 < var4 && ~(var15 + 3) <= ~var4) {
                           var12 = var13;
                        }

                        ++var13;
                     }
                  }

                  if (var1 == 0) {
                     if (var12 == -1) {
                        return -1;
                     }

                     int var16 = 0;
                     class39 var17 = new class39(class744.field11034);
                     class488 var18 = (class488)var17.method267((byte)35);
                     if (var1 != 0) {
                        if (var16++ == var12) {
                           return ((class303)var18.field7218.field10622.field881).field4331;
                        }

                        var18 = (class488)var17.method271(1);
                     }

                     while(true) {
                        while(var18 != null) {
                           if (var16++ == var12) {
                              return ((class303)var18.field7218.field10622.field881).field4331;
                           }

                           var18 = (class488)var17.method271(1);
                        }

                        if (var1 == 0) {
                           if (var1 == 0) {
                              return -1;
                           }
                           break label371;
                        }

                        var18 = (class488)var17.method271(1);
                     }
                  }

                  var15 = var12 + -1;
                  if (var15 + -13 < var4 && ~(var15 + 3) <= ~var4) {
                     var12 = var13;
                  }

                  ++var13;
               }
            }

            if (class352.field5348 != null && class501.field7452 < var3 && ~var3 > ~(class707.field10582 + class501.field7452)) {
               int var19 = -1;
               int var20 = 0;
               int var21;
               int var22;
               if (var1 != 0) {
                  if (class382.field5859) {
                     var21 = var20 * 16 + 33 + class276.field3848;
                     if (var21 + -13 < var4) {
                        if (var4 <= var21 - -3) {
                           var19 = var20;
                           if (var1 != 0) {
                              var22 = class276.field3848 + 31 - -(var20 * 16);
                              if (var22 + -13 < var4 && ~(var22 + 3) <= ~var4) {
                                 var19 = var20;
                              }

                              ++var20;
                           } else {
                              ++var20;
                           }
                        } else {
                           ++var20;
                        }
                     } else {
                        ++var20;
                     }
                  } else {
                     var22 = class276.field3848 + 31 - -(var20 * 16);
                     if (var22 + -13 < var4 && ~(var22 + 3) <= ~var4) {
                        var19 = var20;
                     }

                     ++var20;
                  }
               }

               while(true) {
                  while(~class352.field5348.field7211 < ~var20) {
                     if (class382.field5859) {
                        var21 = var20 * 16 + 33 + class276.field3848;
                        if (var21 + -13 < var4) {
                           if (var4 <= var21 - -3) {
                              var19 = var20;
                              if (var1 != 0) {
                                 var22 = class276.field3848 + 31 - -(var20 * 16);
                                 if (var22 + -13 < var4 && ~(var22 + 3) <= ~var4) {
                                    var19 = var20;
                                 }

                                 ++var20;
                              } else {
                                 ++var20;
                              }
                           } else {
                              ++var20;
                           }
                        } else {
                           ++var20;
                        }
                     } else {
                        var22 = class276.field3848 + 31 - -(var20 * 16);
                        if (var22 + -13 < var4 && ~(var22 + 3) <= ~var4) {
                           var19 = var20;
                        }

                        ++var20;
                     }
                  }

                  if (var1 == 0) {
                     if (var19 == -1) {
                        break;
                     }

                     int var23 = 0;
                     class39 var24 = new class39(class352.field5348.field7218);
                     class303 var25 = (class303)var24.method267((byte)35);
                     if (var1 != 0) {
                        if (var23++ == var19) {
                           return var25.field4331;
                        }

                        var25 = (class303)var24.method271(1);
                     }

                     while(true) {
                        while(var25 != null) {
                           if (var23++ == var19) {
                              return var25.field4331;
                           }

                           var25 = (class303)var24.method271(1);
                        }

                        if (var1 == 0) {
                           if (var1 != 0) {
                              return class585.field8681.field4331;
                           }

                           return -1;
                        }

                        var25 = (class303)var24.method271(1);
                     }
                  }

                  var22 = var19 - -1;
                  if (var22 + -13 < var4 && ~(var22 + 3) <= ~var4) {
                     var19 = var20;
                  }

                  ++var20;
               }
            }
         }

         return -1;
      } catch (RuntimeException var27) {
         throw class670.method4877(var27, field2992[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(BII)Z",
      line = 194
   )
   public static final boolean method1762(byte arg0, int arg1, int arg2) {
      try {
         ++field2983;
         if (arg0 != -81) {
            field2986 = false;
         }

         return class507.method3759(-1, arg2, arg1) | ~(2048 & arg2) != -1 || class625.method4509(arg2, arg1, true);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2992[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(I)V",
      line = 205
   )
   public final void method165(int arg0) {
      try {
         if (arg0 == 25668) {
            ++field2984;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2992[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(BLjava/lang/String;ILda;II)I",
      line = 216
   )
   private final int method1763(byte arg0, String arg1, int arg2, class67 arg3, int arg4, int arg5) {
      try {
         if (arg0 != 82) {
            this.method168(false);
         }

         ++field2990;
         return arg3.method664(arg2 + arg5, 0, arg2 + arg4, 0, arg1, 0, this.field2981.field3902, (class512)null, (class396[])null, 0, this.field2981.field3904, -1, (int[])null, this.field2981.field3911 - arg2 * 2, this.field2981.field3910 - arg2 * 2, 0);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2992[10] + arg0 + ',' + (arg1 != null ? field2992[0] : field2992[1]) + ',' + arg2 + ',' + (arg3 != null ? field2992[0] : field2992[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(Z)Z",
      line = 229
   )
   public final boolean method168(boolean arg0) {
      try {
         ++field2985;
         return arg0 ? true : this.field2988.method3085(864);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2992[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "<init>",
      descriptor = "(Les;Lkv;)V",
      line = 247
   )
   public class235(class402 arg0, class281 arg1) {
      try {
         this.field2981 = arg1;
         this.field2988 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2992[9] + (arg0 != null ? field2992[0] : field2992[1]) + ',' + (arg1 != null ? field2992[0] : field2992[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(ZI)V",
      line = 256
   )
   public final void method90(boolean arg0, int arg1) {
      try {
         int var3 = -119 % ((arg1 - -91) / 35);
         ++field2987;
         class717 var4 = this.field2988.method3087(this.field2981.field3903, -1);
         if (var4 != null) {
            int var5 = this.field2981.field3913.method4343(15, class189.field2365, this.field2981.field3910) - -this.field2981.field3909;
            int var6 = this.field2981.field3905.method2922(class663.field9630, 126, this.field2981.field3911) + this.field2981.field3912;
            if (this.field2981.field3915) {
               class786.field11439.method553(var5, var6, this.field2981.field3910, this.field2981.field3911, this.field2981.field3908, 0);
            }

            int var7 = var6 + 12 * this.method1763((byte)82, var4.field10662, 5, class524.field7616, var6, var5);
            int var12 = var7 + 8;
            if (this.field2981.field3915) {
               class786.field11439.method588(var5, var12, this.field2981.field3910 + var5 - 1, var12, this.field2981.field3908, 0);
            }

            var7 = var12 + 1;
            int var8 = var7 + 12 * this.method1763((byte)82, var4.field10663, 5, class524.field7616, var7, var5);
            int var13 = var8 + 5;
            int var10000 = var13 + this.method1763((byte)82, var4.field10664, 5, class524.field7616, var13, var5) * 12;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field2992[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "b",
      descriptor = "(I)V",
      line = 288
   )
   public static void method1764(int arg0) {
      try {
         field2989 = null;
         if (arg0 != 3) {
            field2989 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2992[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(ILnn;)Z",
      line = 298
   )
   public static final boolean method1765(int arg0, class436 arg1) {
      try {
         if (arg0 > -74) {
            method1764(-107);
         }

         ++field2982;
         return class272.field3785 == arg1 || class547.field8115 == arg1 || class366.field5503 == arg1 || class532.field7775 == arg1 || class628.field9128 == arg1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2992[2] + arg0 + ',' + (arg1 != null ? field2992[0] : field2992[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1766(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1767(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
