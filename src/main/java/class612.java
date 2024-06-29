import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class612 extends class515 {
   @OriginalMember(
      owner = "client!id",
      name = "m",
      descriptor = "Lu;"
   )
   public class81 field8976;
   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8986 = new String[]{method4452(method4451("&c\u001f{\u000e")), method4452(method4451("&c\u001f}\u000e")), method4452(method4451("&c\u001fz\u000e")), method4452(method4451("!r]U")), method4452(method4451("4)\u001f\u0017[")), method4452(method4451("&c\u001f\u0005O!nE\u0007\u000e")), method4452(method4451("&c\u001fx\u000e")), method4452(method4451(":j")), method4452(method4451(":k"))};
   @OriginalMember(
      owner = "client!id",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8975 = null;
   @OriginalMember(
      owner = "client!id",
      name = "r",
      descriptor = "I"
   )
   public static int field8977 = -1;
   @OriginalMember(
      owner = "client!id",
      name = "n",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field8978 = new String[100];
   @OriginalMember(
      owner = "client!id",
      name = "l",
      descriptor = "Lek;"
   )
   public static class536 field8980 = new class536(39, -1);
   @OriginalMember(
      owner = "client!id",
      name = "v",
      descriptor = "I"
   )
   public static int field8979;
   @OriginalMember(
      owner = "client!id",
      name = "s",
      descriptor = "I"
   )
   public static int field8981;
   @OriginalMember(
      owner = "client!id",
      name = "u",
      descriptor = "I"
   )
   public static int field8983;
   @OriginalMember(
      owner = "client!id",
      name = "t",
      descriptor = "I"
   )
   public static int field8984;
   @OriginalMember(
      owner = "client!id",
      name = "q",
      descriptor = "Lkf;"
   )
   public static class266 field8985;
   @OriginalMember(
      owner = "client!id",
      name = "o",
      descriptor = "Luf;"
   )
   public static class474 field8982;

   @OriginalMember(
      owner = "client!id",
      name = "<init>",
      descriptor = "(Lea;II[B)V"
   )
   public class612(class573 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field8976 = class259.method1972(arg3, (byte)-127, arg1, arg2, arg0, 6406, false, 6406);
         this.field8976.method4372(false, false, (byte)59);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8986[5] + (arg0 != null ? field8986[4] : field8986[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8986[4] : field8986[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4447(int arg0) {
      try {
         field8975 = null;
         field8978 = null;
         if (arg0 == 28318) {
            field8982 = null;
            field8985 = null;
            field8980 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8986[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4448(byte arg0) {
      boolean var1 = client.field4360;

      try {
         class594.field8738 = 0;
         ++field8984;
         class534 var2 = class430.field6150.field105;
         int var3 = var2.method1176(-32768);
         int var4 = var2.method1154(true);
         int var5 = var2.method1189(0) != 1 ? 0 : 1;
         int var6 = var2.method1174((byte)-4);
         class487.method3533((byte)21);
         class100.method839(-1697555133, var6);
         int var7 = (-var2.field1856 + class430.field6150.field110) / 16;
         class636.field9306 = new int[var7][4];
         int var8 = 0;
         int var9;
         int var10;
         int var11;
         int var12;
         int var15;
         byte var10000;
         int var10001;
         if (var1) {
            var9 = 0;
            if (var1) {
               class636.field9306[var8][var9] = var2.method1164(19693);
               ++var9;
            }
         } else {
            if (~var7 >= ~var8) {
               var10000 = arg0;
               if (!var1) {
                  if (arg0 >= -60) {
                     method4448((byte)-37);
                  }

                  class356.field4787 = null;
                  class474.field6824 = new int[var7];
                  class784.field11482 = new int[var7];
                  class78.field965 = new byte[var7][];
                  class436.field6245 = new int[var7];
                  class371.field5388 = new byte[var7][];
                  class77.field962 = new int[var7];
                  class464.field6705 = null;
                  class668.field9714 = new byte[var7][];
                  class769.field11340 = new int[var7];
                  class212.field3029 = new byte[var7][];
                  var10 = 0;
                  var11 = (var4 - (class644.field9403 >> 4)) / 8;
                  if (var1) {
                     var15 = -(class337.field4594 >> 4) + var3;
                     var10001 = 8;
                  } else if (~(((class644.field9403 >> 4) + var4) / 8) > ~var11) {
                     var15 = var5;
                     var10001 = -1574872860;
                     if (!var1) {
                        class564.method4023((boolean)var5, -1574872860, 12, var4, var3);
                        return;
                     }
                  } else {
                     var15 = -(class337.field4594 >> 4) + var3;
                     var10001 = 8;
                  }

                  while(true) {
                     var12 = var15 / var10001;
                     if (var1) {
                        class436.field6245[var10] = (var11 << 8) - -var12;
                        class77.field962[var10] = class515.field7437.method2031(0, "m" + var11 + "_" + var12);
                        class474.field6824[var10] = class515.field7437.method2031(0, "l" + var11 + "_" + var12);
                        class784.field11482[var10] = class515.field7437.method2031(0, field8986[7] + var11 + "_" + var12);
                        class769.field11340[var10] = class515.field7437.method2031(0, field8986[8] + var11 + "_" + var12);
                        ++var10;
                        ++var12;
                     }

                     while(true) {
                        while(~(((class337.field4594 >> 4) + var3) / 8) <= ~var12) {
                           class436.field6245[var10] = (var11 << 8) - -var12;
                           class77.field962[var10] = class515.field7437.method2031(0, "m" + var11 + "_" + var12);
                           class474.field6824[var10] = class515.field7437.method2031(0, "l" + var11 + "_" + var12);
                           class784.field11482[var10] = class515.field7437.method2031(0, field8986[7] + var11 + "_" + var12);
                           class769.field11340[var10] = class515.field7437.method2031(0, field8986[8] + var11 + "_" + var12);
                           ++var10;
                           ++var12;
                        }

                        if (!var1) {
                           ++var11;
                           if (~(((class644.field9403 >> 4) + var4) / 8) > ~var11) {
                              var15 = var5;
                              var10001 = -1574872860;
                              if (!var1) {
                                 class564.method4023((boolean)var5, -1574872860, 12, var4, var3);
                                 return;
                              }
                           } else {
                              var15 = -(class337.field4594 >> 4) + var3;
                              var10001 = 8;
                           }
                           break;
                        }

                        ++var12;
                     }
                  }
               }
            } else {
               var10000 = 0;
            }

            var9 = var10000;
            if (var1) {
               class636.field9306[var8][var9] = var2.method1164(19693);
               ++var9;
            }
         }

         while(true) {
            while(~var9 > -5) {
               class636.field9306[var8][var9] = var2.method1164(19693);
               ++var9;
            }

            if (!var1) {
               ++var8;
               if (~var7 >= ~var8) {
                  var10000 = arg0;
                  if (!var1) {
                     if (arg0 >= -60) {
                        method4448((byte)-37);
                     }

                     class356.field4787 = null;
                     class474.field6824 = new int[var7];
                     class784.field11482 = new int[var7];
                     class78.field965 = new byte[var7][];
                     class436.field6245 = new int[var7];
                     class371.field5388 = new byte[var7][];
                     class77.field962 = new int[var7];
                     class464.field6705 = null;
                     class668.field9714 = new byte[var7][];
                     class769.field11340 = new int[var7];
                     class212.field3029 = new byte[var7][];
                     var10 = 0;
                     var11 = (var4 - (class644.field9403 >> 4)) / 8;
                     if (var1) {
                        var15 = -(class337.field4594 >> 4) + var3;
                        var10001 = 8;
                     } else if (~(((class644.field9403 >> 4) + var4) / 8) > ~var11) {
                        var15 = var5;
                        var10001 = -1574872860;
                        if (!var1) {
                           class564.method4023((boolean)var5, -1574872860, 12, var4, var3);
                           return;
                        }
                     } else {
                        var15 = -(class337.field4594 >> 4) + var3;
                        var10001 = 8;
                     }

                     while(true) {
                        var12 = var15 / var10001;
                        if (var1) {
                           class436.field6245[var10] = (var11 << 8) - -var12;
                           class77.field962[var10] = class515.field7437.method2031(0, "m" + var11 + "_" + var12);
                           class474.field6824[var10] = class515.field7437.method2031(0, "l" + var11 + "_" + var12);
                           class784.field11482[var10] = class515.field7437.method2031(0, field8986[7] + var11 + "_" + var12);
                           class769.field11340[var10] = class515.field7437.method2031(0, field8986[8] + var11 + "_" + var12);
                           ++var10;
                           ++var12;
                        }

                        while(true) {
                           while(~(((class337.field4594 >> 4) + var3) / 8) <= ~var12) {
                              class436.field6245[var10] = (var11 << 8) - -var12;
                              class77.field962[var10] = class515.field7437.method2031(0, "m" + var11 + "_" + var12);
                              class474.field6824[var10] = class515.field7437.method2031(0, "l" + var11 + "_" + var12);
                              class784.field11482[var10] = class515.field7437.method2031(0, field8986[7] + var11 + "_" + var12);
                              class769.field11340[var10] = class515.field7437.method2031(0, field8986[8] + var11 + "_" + var12);
                              ++var10;
                              ++var12;
                           }

                           if (!var1) {
                              ++var11;
                              if (~(((class644.field9403 >> 4) + var4) / 8) > ~var11) {
                                 var15 = var5;
                                 var10001 = -1574872860;
                                 if (!var1) {
                                    class564.method4023((boolean)var5, -1574872860, 12, var4, var3);
                                    return;
                                 }
                              } else {
                                 var15 = -(class337.field4594 >> 4) + var3;
                                 var10001 = 8;
                              }
                              break;
                           }

                           ++var12;
                        }
                     }
                  }
               } else {
                  var10000 = 0;
               }

               var9 = var10000;
               if (var1) {
                  class636.field9306[var8][var9] = var2.method1164(19693);
                  ++var9;
               }
            } else {
               ++var9;
            }
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field8986[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method4449(long arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg1 == 6406) {
            ++field8983;
            int var4 = class39.field553 + class564.field8045.field10694;
            int var5 = class564.field8045.field10693 - -class610.field8952;
            if (class725.field10585 - var4 < -2000 || -var4 + class725.field10585 > 2000 || -var5 + class310.field4257 < -2000 || ~(-var5 + class310.field4257) < -2001) {
               class310.field4257 = var5;
               class725.field10585 = var4;
            }

            if (class725.field10585 != var4) {
               int var7;
               label95: {
                  int var6 = var4 - class725.field10585;
                  var7 = (int)((long)var6 * arg0 / 320L);
                  if (var6 <= 0) {
                     if (~var7 == -1) {
                        var7 = -1;
                        if (!var3) {
                           break label95;
                        }
                     }

                     if (~var7 <= ~var6) {
                        break label95;
                     }

                     var7 = var6;
                     if (!var3) {
                        break label95;
                     }
                  }

                  if (var7 == 0) {
                     var7 = 1;
                     if (!var3) {
                        break label95;
                     }
                  }

                  if (var6 < var7) {
                     var7 = var6;
                  }
               }

               class725.field10585 += var7;
            }

            class273.field3753 += (float)arg0 * class480.field6887 / 6.0F;
            class117.field1467 += (float)arg0 * class718.field10477 / 6.0F;
            if (~class310.field4257 != ~var5) {
               int var9;
               label97: {
                  int var8 = var5 - class310.field4257;
                  var9 = (int)((long)var8 * arg0 / 320L);
                  if (var8 > 0) {
                     if (~var9 == -1) {
                        var9 = 1;
                        if (!var3) {
                           break label97;
                        }
                     }

                     if (var8 >= var9) {
                        break label97;
                     }

                     var9 = var8;
                     if (!var3) {
                        break label97;
                     }
                  }

                  if (var9 != 0) {
                     if (var8 <= var9) {
                        break label97;
                     }

                     var9 = var8;
                     if (!var3) {
                        break label97;
                     }
                  }

                  var9 = -1;
               }

               class310.field4257 += var9;
            }

            class591.method4298(262144);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field8986[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4450(boolean arg0) {
      try {
         ++field8979;
         class597.field8782.method334((byte)109);
         if (!arg0) {
            class629.field9235.method334((byte)107);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8986[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4451(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4452(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
