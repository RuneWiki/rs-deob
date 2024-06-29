import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class438 extends class15 {
   @OriginalMember(
      owner = "client!id",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public String field5962;
   @OriginalMember(
      owner = "client!id",
      name = "A",
      descriptor = "Llja;"
   )
   public class728 field5971;
   @OriginalMember(
      owner = "client!id",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5972 = new String[]{method3386(method3385(";T6Ix")), method3386(method3385("6_{{=7^l 3=_sg5o\u0012")), method3386(method3385("i\u0010nk\"!Yw`mc\u000b8~1&X%!krTwc1;^%")), method3386(method3385("1_we97@jk6;H")), method3386(method3385("1_we97Xw}$")), method3386(method3385("i\u0010]v ;B}}m")), method3386(method3385("i\u0010Uo(\u007fq\u007fkm")), method3386(method3385("<Etb")), method3386(method3385(";T6Jx")), method3386(method3385("!Ulz9<Wk3")), method3386(method3385(")\u001e6 -")), method3386(method3385("i\u0010]v ;B}}m\u0006Xm\"pb\u00015D1<\u001d)7gb\u0010(>jb\u0000\">`rwUZkr}yv}\u0013W}3`")), method3386(method3385(";T629<Yl0x")), method3386(method3385(";T6Hx")), method3386(method3385(";T6Mx")), method3386(method3385(";T6Kx")), method3386(method3385(";T6Ox"))};
   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "Loca;"
   )
   public static class642 field5963 = null;
   @OriginalMember(
      owner = "client!id",
      name = "u",
      descriptor = "Laka;"
   )
   public static class418 field5964 = new class418(141, 10);
   @OriginalMember(
      owner = "client!id",
      name = "B",
      descriptor = "I"
   )
   public static int field5961;
   @OriginalMember(
      owner = "client!id",
      name = "C",
      descriptor = "I"
   )
   public static int field5965;
   @OriginalMember(
      owner = "client!id",
      name = "s",
      descriptor = "I"
   )
   public static int field5966;
   @OriginalMember(
      owner = "client!id",
      name = "y",
      descriptor = "I"
   )
   public static int field5968;
   @OriginalMember(
      owner = "client!id",
      name = "w",
      descriptor = "I"
   )
   public static int field5969;
   @OriginalMember(
      owner = "client!id",
      name = "x",
      descriptor = "I"
   )
   public int field5970;
   @OriginalMember(
      owner = "client!id",
      name = "v",
      descriptor = "Lwea;"
   )
   public static class104 field5967;

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(Z[[[BIBIIZ)V"
   )
   public static final void method3378(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
      int var7 = arg0 ? 1 : 0;
      class465.field6400 = 0;
      class289.field3990 = 0;
      ++class208.field2646;
      if ((arg5 & 2) == 0) {
         for(class713 var8 = class127.field1637[var7]; var8 != null; var8 = var8.field10469) {
            if (!class441.method3399(var8, arg0, arg1, arg2, arg3)) {
               class773.method5580(var8);
               if (var8.field10460 != -1) {
                  class120.field1597[class465.field6400++] = var8;
               }
            }
         }
      }

      if ((arg5 & 1) == 0) {
         for(class713 var9 = class217.field2753[var7]; var9 != null; var9 = var9.field10469) {
            if (!class441.method3399(var9, arg0, arg1, arg2, arg3)) {
               class773.method5580(var9);
               if (var9.field10460 != -1) {
                  class335.field4600[class289.field3990++] = var9;
               }
            }
         }

         for(class713 var10 = class500.field6970[var7]; var10 != null; var10 = var10.field10469) {
            if (!class441.method3399(var10, arg0, arg1, arg2, arg3)) {
               if (var10.method67(703)) {
                  class773.method5580(var10);
                  if (var10.field10460 != -1) {
                     class335.field4600[class289.field3990++] = var10;
                  }
               } else {
                  class773.method5580(var10);
                  if (var10.field10460 != -1) {
                     class120.field1597[class465.field6400++] = var10;
                  }
               }
            }
         }

         if (!arg0) {
            for(int var11 = 0; var11 < class315.field4362; ++var11) {
               if (!class441.method3399(class156.field2017[var11], arg0, arg1, arg2, arg3)) {
                  class773.method5580(class156.field2017[var11]);
                  if (class156.field2017[var11].field10460 != -1) {
                     if (class156.field2017[var11].method67(703)) {
                        class335.field4600[class289.field3990++] = class156.field2017[var11];
                     } else {
                        class120.field1597[class465.field6400++] = class156.field2017[var11];
                     }
                  }
               }
            }
         }
      }

      if (class465.field6400 > 0) {
         class380.method3022(class120.field1597, 0, class465.field6400 - 1);

         for(int var12 = 0; var12 < class465.field6400; ++var12) {
            class448.method3440(class120.field1597[var12], true, arg6);
         }
      }

      if (class446.field6036) {
         class158.field2032.method485(0, (class243[])null);
      }

      if ((arg5 & 2) == 0) {
         for(int var13 = class406.field5574; var13 < class174.field2251; ++var13) {
            if (var13 >= arg2 && arg1 != null) {
               int var14 = class276.field3516.length;
               if (class276.field3516.length + class16.field283 > class137.field1743) {
                  var14 -= class276.field3516.length + class16.field283 - class137.field1743;
               }

               int var15 = class276.field3516[0].length;
               if (class276.field3516[0].length + class274.field3507 > class181.field2297) {
                  var15 -= class276.field3516[0].length + class274.field3507 - class181.field2297;
               }

               boolean[][] var16 = class134.field1685;
               if (class739.field10826) {
                  if (class203.field2588) {
                     var16 = class372.field5217[var13];
                  }

                  for(int var17 = class313.field4344; var17 < var14; ++var17) {
                     int var18 = class16.field283 + var17 - class313.field4344;

                     for(int var19 = class483.field6723; var19 < var15; ++var19) {
                        var16[var17][var19] = false;
                        if (class276.field3516[var17][var19]) {
                           int var20 = class274.field3507 + var19 - class483.field6723;

                           for(int var21 = var13; var21 >= 0; --var21) {
                              if (class548.field8080[var21][var18][var20] != null && class548.field8080[var21][var18][var20].field10647 == var13) {
                                 if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class725.method5252(var20, var13, var18, -1)) {
                                    var16[var17][var19] = true;
                                    break;
                                 }

                                 var16[var17][var19] = false;
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               if (class203.field2588) {
                  if (arg4 >= 0) {
                     class659.field9815[var13].method941(0, 0, 0, (boolean[][])null, false, arg4, arg5);
                  } else {
                     class659.field9815[var13].method943(0, 0, 0, (boolean[][])null, false, arg5);
                  }

                  for(int var22 = 0; var22 < class500.field6974; ++var22) {
                     class700.field10259[var22].method1693(new class25(var13 + 1), (byte)-88);
                  }
               } else if (arg4 >= 0) {
                  class659.field9815[var13].method941(class699.field10231, class664.field9833, class106.field1403, class134.field1685, false, arg4, arg5);
               } else {
                  class659.field9815[var13].method943(class699.field10231, class664.field9833, class106.field1403, class134.field1685, false, arg5);
               }
            } else {
               int var23 = class276.field3516.length;
               if (class276.field3516.length + class16.field283 > class137.field1743) {
                  var23 -= class276.field3516.length + class16.field283 - class137.field1743;
               }

               int var24 = class276.field3516[0].length;
               if (class276.field3516[0].length + class274.field3507 > class181.field2297) {
                  var24 -= class276.field3516[0].length + class274.field3507 - class181.field2297;
               }

               boolean[][] var25 = class134.field1685;
               if (class739.field10826) {
                  if (class203.field2588) {
                     var25 = class372.field5217[var13];
                  }

                  for(int var26 = class313.field4344; var26 < var23; ++var26) {
                     int var27 = class16.field283 + var26 - class313.field4344;

                     for(int var28 = class483.field6723; var28 < var24; ++var28) {
                        if (class276.field3516[var26][var28] && !class725.method5252(class274.field3507 + var28 - class483.field6723, var13, var27, -1)) {
                           var25[var26][var28] = true;
                        } else {
                           var25[var26][var28] = false;
                        }
                     }
                  }
               }

               if (class203.field2588) {
                  if (arg4 >= 0) {
                     class659.field9815[var13].method941(0, 0, 0, (boolean[][])null, false, arg4, arg5);
                  } else {
                     class659.field9815[var13].method943(0, 0, 0, (boolean[][])null, false, arg5);
                  }

                  for(int var29 = 0; var29 < class500.field6974; ++var29) {
                     class700.field10259[var29].method1693(new class25(var13 + 1), (byte)-62);
                  }
               } else if (arg4 >= 0) {
                  class659.field9815[var13].method941(class699.field10231, class664.field9833, class106.field1403, class134.field1685, true, arg4, arg5);
               } else {
                  class659.field9815[var13].method943(class699.field10231, class664.field9833, class106.field1403, class134.field1685, true, arg5);
               }
            }
         }
      }

      if (class289.field3990 > 0) {
         class410.method3220(class335.field4600, 0, class289.field3990 - 1);

         for(int var30 = 0; var30 < class289.field3990; ++var30) {
            class448.method3440(class335.field4600[var30], true, arg6);
         }
      }

   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(Lwf;I)Z"
   )
   public final boolean method3379(class541 arg0, int arg1) {
      try {
         ++field5966;
         int var3 = this.method3382(false);
         arg0.method125(13582);
         if (arg1 >= -97) {
            field5967 = null;
         }

         --this.field5970;
         if (this.field5970 != 0) {
            return var3 != this.method3382(false);
         } else {
            this.method4924(-2970);
            this.method125(13582);
            --class254.field3207;
            class259.field3299.method3190(this, arg0.field7901, 8);
            return false;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5972[13] + (arg0 != null ? field5972[10] : field5972[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(BLwf;)Z"
   )
   public final boolean method3380(byte arg0, class541 arg1) {
      boolean var3 = client.field1481;

      try {
         ++field5969;
         arg1.method125(13582);
         if (arg0 < 19) {
            field5967 = null;
         }

         boolean var4 = true;
         class541 var5 = (class541)this.field5971.method5265(-125);
         boolean var10000;
         if (var3) {
            var10000 = class586.method4371(arg1.field7909, var5.field7909, (byte)83);
         } else if (var5 == null) {
            this.field5971.method5267((byte)121, arg1);
            ++this.field5970;
            var10000 = var4;
            if (!var3) {
               return var4;
            }
         } else {
            var10000 = class586.method4371(arg1.field7909, var5.field7909, (byte)83);
         }

         while(!var10000) {
            var5 = (class541)this.field5971.method5266(false);
            var4 = false;
            if (var5 == null) {
               this.field5971.method5267((byte)121, arg1);
               ++this.field5970;
               var10000 = var4;
               if (!var3) {
                  return var4;
               }
            } else {
               var10000 = class586.method4371(arg1.field7909, var5.field7909, (byte)83);
            }
         }

         class435.method3359(-25, arg1, var5);
         ++this.field5970;
         if (var4) {
            return false;
         } else {
            return true;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5972[15] + arg0 + ',' + (arg1 != null ? field5972[10] : field5972[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V"
   )
   public static final void method3381(boolean arg0, String arg1) {
      try {
         class452.field6244 = arg1;
         ++field5965;
         if (class152.field1893 != null) {
            try {
               String var4;
               label31: {
                  String var2 = class152.field1893.getParameter(field5972[3]);
                  String var3 = class152.field1893.getParameter(field5972[4]);
                  var4 = var2 + field5972[9] + arg1 + field5972[2] + var3;
                  if (arg1.length() == 0) {
                     var4 = var4 + field5972[11];
                     if (!client.field1481) {
                        break label31;
                     }
                  }

                  var4 = var4 + field5972[5] + class385.method3046((byte)-52, class163.method1353(-122) - -94608000000L) + field5972[6] + 94608000L;
               }

               class537.method4075(field5972[1] + var4 + "\"", class152.field1893, 23863);
               if (arg0) {
                  method3383(34);
               }
            } catch (Throwable var6) {
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5972[8] + arg0 + ',' + (arg1 != null ? field5972[10] : field5972[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method3382(boolean arg0) {
      try {
         ++field5968;
         if (arg0) {
            this.method3382(false);
         }

         return this.field5971.field10622.field272 != this.field5971.field10622 ? ((class541)this.field5971.field10622.field272).field7909 : -1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5972[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3383(int arg0) {
      try {
         if (arg0 != 1) {
            field5967 = null;
         }

         field5964 = null;
         field5963 = null;
         field5967 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5972[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method3384(int arg0, int arg1, int arg2) {
      try {
         ++field5961;
         int var3 = class87.method821(false, arg1 - 1, arg0 + -1) - (-class87.method821(false, arg1 + arg2, arg0 - 1) + -class87.method821(false, arg1 - 1, arg0 - -1) - class87.method821(false, arg1 + 1, arg0 + 1));
         int var4 = class87.method821(false, arg1 + -1, arg0) + class87.method821(false, arg1 - -1, arg0) + (class87.method821(false, arg1, arg0 - 1) - -class87.method821(false, arg1, arg0 - -1));
         int var5 = class87.method821(false, arg1, arg0);
         return var5 / 4 + var3 / 16 + var4 / 8;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5972[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class438(String arg0) {
      try {
         this.field5962 = arg0;
         this.field5971 = new class728();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5972[12] + (arg0 != null ? field5972[10] : field5972[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3385(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3386(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
