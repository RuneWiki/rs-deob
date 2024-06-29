import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class503 extends class294 {
   @OriginalMember(
      owner = "client!fk",
      name = "m",
      descriptor = "[I"
   )
   public int[] field7681 = new int[1];
   @OriginalMember(
      owner = "client!fk",
      name = "q",
      descriptor = "[I"
   )
   public int[] field7680 = new int[]{-1};
   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7684 = new String[]{method3897(method3896("i4!]A")), method3897(method3896("tq!2\u0014")), method3897(method3896("|oc\u001f")), method3897(method3896("tq!0\u0014")), method3897(method3896("F(/^\u001c")), method3897(method3896("27/")), method3897(method3896("tq!1\u0014"))};
   @OriginalMember(
      owner = "client!fk",
      name = "s",
      descriptor = "I"
   )
   public static int field7677;
   @OriginalMember(
      owner = "client!fk",
      name = "p",
      descriptor = "I"
   )
   public static int field7678;
   @OriginalMember(
      owner = "client!fk",
      name = "n",
      descriptor = "I"
   )
   public static int field7682;
   @OriginalMember(
      owner = "client!fk",
      name = "r",
      descriptor = "I"
   )
   public static int field7683;
   @OriginalMember(
      owner = "client!fk",
      name = "o",
      descriptor = "J"
   )
   public static long field7679;

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(I[IIZ[I)J",
      line = 4
   )
   private final long method3893(int arg0, int[] arg1, int arg2, boolean arg3, int[] arg4) {
      boolean var6 = client.field1786;

      try {
         ++field7677;
         long[] var7 = class717.field10745;
         long var8 = -1L;
         long var10 = var8 >>> 8 ^ var7[(int)(((long)(arg0 >> 8) ^ var8) & 255L)];
         long var12 = var10 >>> 8 ^ var7[(int)(((long)arg0 ^ var10) & 255L)];
         if (arg2 != -123439416) {
            method3894((class29)null, (byte)95);
         }

         int var14 = 0;
         long var15;
         long var17;
         long var19;
         if (var6) {
            var15 = var12 >>> 8 ^ var7[(int)(255L & (var12 ^ (long)(arg1[var14] >> 24)))];
            var17 = var15 >>> 8 ^ var7[(int)(((long)(arg1[var14] >> 16) ^ var15) & 255L)];
            var19 = var17 >>> 8 ^ var7[(int)(255L & ((long)(arg1[var14] >> 8) ^ var17))];
            var12 = var19 >>> 8 ^ var7[(int)((var19 ^ (long)arg1[var14]) & 255L)];
            ++var14;
         }

         while(true) {
            while(~var14 > ~arg1.length) {
               var15 = var12 >>> 8 ^ var7[(int)(255L & (var12 ^ (long)(arg1[var14] >> 24)))];
               var17 = var15 >>> 8 ^ var7[(int)(((long)(arg1[var14] >> 16) ^ var15) & 255L)];
               var19 = var17 >>> 8 ^ var7[(int)(255L & ((long)(arg1[var14] >> 8) ^ var17))];
               var12 = var19 >>> 8 ^ var7[(int)((var19 ^ (long)arg1[var14]) & 255L)];
               ++var14;
            }

            if (!var6) {
               if (arg4 != null) {
                  int var21 = 0;
                  if (var6 || var21 < 5) {
                     do {
                        var12 = var12 >>> 8 ^ var7[(int)(255L & (var12 ^ (long)arg4[var21]))];
                        ++var21;
                     } while(var21 < 5);
                  }
               }

               return var7[(int)(255L & ((long)(arg3 ? 1 : 0) ^ var12))] ^ var12 >>> 8;
            }

            ++var14;
         }
      } catch (RuntimeException var25) {
         throw class482.method3757(var25, field7684[3] + arg0 + ',' + (arg1 != null ? field7684[0] : field7684[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7684[0] : field7684[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(Lgb;B)Z",
      line = 53
   )
   public static final boolean method3894(class29 arg0, byte arg1) {
      boolean var2 = client.field1786;

      try {
         if (arg1 != 30) {
            field7679 = 81L;
         }

         ++field7683;

         try {
            return class273.method2320(arg0, (byte)-67);
         } catch (IOException var7) {
            if (class342.field5204 == 9) {
               arg0.field355 = null;
               return false;
            } else {
               class766.method5599((byte)-45);
               return true;
            }
         } catch (Exception var8) {
            int var10000;
            boolean var10001;
            label67: {
               String var4;
               label66: {
                  var4 = field7684[4] + (arg0.field373 != null ? arg0.field373.method3869((byte)-38) : -1) + "," + (arg0.field364 != null ? arg0.field364.method3869((byte)-40) : -1) + "," + (arg0.field374 == null ? -1 : arg0.field374.method3869((byte)-43)) + field7684[5] + arg0.field370 + "," + (class476.field7251.field1683[0] + class120.field1694) + "," + (class476.field7251.field1685[0] + class119.field1606) + field7684[5];
                  int var5 = 0;
                  if (!var2) {
                     if (~var5 <= ~arg0.field370) {
                        break label66;
                     }

                     var10000 = var5;
                     var10001 = true;
                     if (var2) {
                        break label67;
                     }

                     if (var5 >= 50) {
                        break label66;
                     }
                  }

                  do {
                     var4 = var4 + arg0.field362.field5428[var5] + ",";
                     ++var5;
                     if (~var5 <= ~arg0.field370) {
                        break;
                     }

                     var10000 = var5;
                     var10001 = true;
                     if (var2) {
                        break label67;
                     }
                  } while(var5 < 50);
               }

               class281.method2349(1, var4, var8);
               var10000 = 2;
               var10001 = false;
            }

            class321.method2638(var10000, var10001);
            return true;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field7684[6] + (arg0 != null ? field7684[0] : field7684[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(Ltf;Lqu;IZLha;II)Lka;",
      line = 96
   )
   public final class91 method3895(class456 arg0, class366 arg1, int arg2, boolean arg3, class610 arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         ++field7678;
         class91 var9 = null;
         int var10 = arg5;
         class228 var11 = null;
         if (~arg2 != 0) {
            var11 = class252.field3808.method104(-32407, arg2);
         }

         int[] var12 = this.field7680;
         if (var11 != null && var11.field3468 != null) {
            var12 = new int[var11.field3468.length];
            int var13 = 0;
            if (var8 || ~var13 > ~var11.field3468.length) {
               do {
                  int var14 = var11.field3468[var13];
                  if (var14 >= 0) {
                     if (~this.field7680.length >= ~var14) {
                        var12[var13] = -1;
                        if (var8) {
                           var12[var13] = this.field7680[var14];
                           ++var13;
                        } else {
                           ++var13;
                        }
                     } else {
                        var12[var13] = this.field7680[var14];
                        ++var13;
                     }
                  } else {
                     var12[var13] = -1;
                     if (var8) {
                        var12[var13] = this.field7680[var14];
                        ++var13;
                     } else {
                        ++var13;
                     }
                  }
               } while(~var13 > ~var11.field3468.length);
            }
         }

         if (arg1 != null) {
            var10 = arg5 | arg1.method2985(102);
         }

         if (arg6 != 31357) {
            this.method3893(110, (int[])null, 88, false, (int[])null);
         }

         long var15 = this.method3893(arg2, var12, -123439416, arg3, arg0 != null ? arg0.field6982 : null);
         if (class719.field10778 != null) {
            var9 = (class91)class719.field10778.method2544(false, var15);
         }

         if (var9 == null || ~arg4.method690(var9.method906(), var10) != -1) {
            if (var9 != null) {
               var10 = arg4.method584(var10, var9.method906());
            }

            int var10000;
            int var17;
            label262: {
               var17 = var10;
               byte var18 = 0;
               int var19 = 0;
               if (var8) {
                  var10000 = var12[var19];
               } else if (~var12.length >= ~var19) {
                  var10000 = var18;
                  if (!var8) {
                     break label262;
                  }
               } else {
                  var10000 = var12[var19];
               }

               while(true) {
                  if (var10000 != -1 && !class247.field3763.method2058(arg6 ^ -31352, var12[var19]).method1256((class69)null, arg3, arg6 + -31357)) {
                     var18 = 1;
                  }

                  ++var19;
                  if (~var12.length >= ~var19) {
                     var10000 = var18;
                     if (!var8) {
                        break;
                     }
                  } else {
                     var10000 = var12[var19];
                  }
               }
            }

            if (var10000 != 0) {
               return null;
            }

            class159[] var20 = new class159[var12.length];
            int var21 = 0;
            if (var8) {
               if (~var12[var21] != 0) {
                  var20[var21] = class247.field3763.method2058(arg6 + -31368, var12[var21]).method1248((class69)null, arg3, (byte)-119);
               }

               ++var21;
            }

            while(true) {
               while(var21 < var12.length) {
                  if (~var12[var21] != 0) {
                     var20[var21] = class247.field3763.method2058(arg6 + -31368, var12[var21]).method1248((class69)null, arg3, (byte)-119);
                  }

                  ++var21;
               }

               if (!var8) {
                  if (var11 != null && var11.field3497 != null) {
                     int var22 = 0;
                     if (var8 || var22 < var11.field3497.length) {
                        do {
                           if (var11.field3497[var22] != null) {
                              if (var20[var22] == null && !var8) {
                                 ++var22;
                              } else {
                                 int var23 = var11.field3497[var22][0];
                                 int var24 = var11.field3497[var22][1];
                                 int var25 = var11.field3497[var22][2];
                                 int var26 = var11.field3497[var22][3];
                                 int var27 = var11.field3497[var22][4];
                                 int var28 = var11.field3497[var22][5];
                                 if (~var26 == -1) {
                                    if (~var27 == -1) {
                                       if (~var28 != -1) {
                                          var20[var22].method1434(var28, var27, 733, var26);
                                       }
                                    } else {
                                       var20[var22].method1434(var28, var27, 733, var26);
                                    }
                                 } else {
                                    var20[var22].method1434(var28, var27, 733, var26);
                                 }

                                 if (var23 == 0) {
                                    if (var24 == 0) {
                                       if (var25 != 0) {
                                          var20[var22].method1431(var24, var25, var23, (byte)75);
                                          ++var22;
                                       } else {
                                          ++var22;
                                       }
                                    } else {
                                       var20[var22].method1431(var24, var25, var23, (byte)75);
                                       ++var22;
                                    }
                                 } else {
                                    var20[var22].method1431(var24, var25, var23, (byte)75);
                                    ++var22;
                                 }
                              }
                           } else {
                              ++var22;
                           }
                        } while(var22 < var11.field3497.length);
                     }
                  }

                  if (arg0 != null) {
                     var17 = var10 | 16384;
                  }

                  class159 var29 = new class159(var20, var20.length);
                  var9 = arg4.method614(var29, var17, class242.field3674, 64, 850);
                  if (arg0 != null) {
                     int var30 = 0;
                     if (var8 || var30 < 5) {
                        do {
                           int var31 = 0;
                           if (var8) {
                              if (~class176.field2771[var31][var30].length < ~arg0.field6982[var30]) {
                                 var9.method901(class416.field6444[var31][var30], class176.field2771[var31][var30][arg0.field6982[var30]]);
                              }

                              ++var31;
                           }

                           while(true) {
                              while(var31 < class176.field2771.length) {
                                 if (~class176.field2771[var31][var30].length < ~arg0.field6982[var30]) {
                                    var9.method901(class416.field6444[var31][var30], class176.field2771[var31][var30][arg0.field6982[var30]]);
                                 }

                                 ++var31;
                              }

                              if (!var8) {
                                 ++var30;
                                 break;
                              }

                              ++var31;
                           }
                        } while(var30 < 5);
                     }
                  }

                  if (class719.field10778 != null) {
                     var9.method923(var10);
                     class719.field10778.method2545(var15, arg6 + -31230, var9);
                  }
                  break;
               }

               ++var21;
            }
         }

         if (arg1 == null) {
            return var9;
         } else {
            class91 var32 = var9.method868((byte)1, var10, true);
            arg1.method2982((byte)-115, 0, var32);
            return var32;
         }
      } catch (RuntimeException var34) {
         throw class482.method3757(var34, field7684[1] + (arg0 != null ? field7684[0] : field7684[2]) + ',' + (arg1 != null ? field7684[0] : field7684[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7684[0] : field7684[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3896(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3897(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
