import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class32 extends class78 implements class434 {
   @OriginalMember(
      owner = "client!ga",
      name = "Y",
      descriptor = "Z"
   )
   private boolean field401 = true;
   @OriginalMember(
      owner = "client!ga",
      name = "ab",
      descriptor = "Lwh;"
   )
   public class522 field389;
   @OriginalMember(
      owner = "client!ga",
      name = "fb",
      descriptor = "Z"
   )
   private boolean field392;
   @OriginalMember(
      owner = "client!ga",
      name = "ob",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field411 = new String[]{method243(method242("\u0019u\u0003}\u0017")), method243(method242("\f.A?")), method243(method242("\u0005:\u0003\u0017B")), method243(method242("\u0005:\u0003\u001aB")), method243(method242("\u0005:\u0003\u0002B")), method243(method242("\u0005:\u0003\u001dB")), method243(method242("\u0005:\u0003\u0011B")), method243(method242("\u0005:\u0003\u001cB")), method243(method242("\u0005:\u0003\u0005B")), method243(method242("\u0005:\u0003\u0019B")), method243(method242("\u0005:\u0003\u0000B")), method243(method242("\u0005:\u0003o\u0003\f2YmB")), method243(method242("\u0005:\u0003\u0018B")), method243(method242("\u0005:\u0003\u0007B")), method243(method242("\u0005:\u0003\u0016B")), method243(method242("\u0005:\u0003\u001bB")), method243(method242("\u0005:\u0003\u0010B")), method243(method242("\u0005:\u0003\u001fB")), method243(method242("\u0005:\u0003\u001eB")), method243(method242("\u0005:\u0003\u0006B")), method243(method242("\u0005:\u0003\u0003B")), method243(method242("\u0005:\u0003\u0014B")), method243(method242("\u0005:\u0003\u0012B"))};
   @OriginalMember(
      owner = "client!ga",
      name = "nb",
      descriptor = "I"
   )
   public static int field387;
   @OriginalMember(
      owner = "client!ga",
      name = "ib",
      descriptor = "I"
   )
   public static int field388;
   @OriginalMember(
      owner = "client!ga",
      name = "cb",
      descriptor = "I"
   )
   public static int field390;
   @OriginalMember(
      owner = "client!ga",
      name = "hb",
      descriptor = "I"
   )
   public static int field391;
   @OriginalMember(
      owner = "client!ga",
      name = "R",
      descriptor = "I"
   )
   public static int field393;
   @OriginalMember(
      owner = "client!ga",
      name = "W",
      descriptor = "I"
   )
   public static int field394;
   @OriginalMember(
      owner = "client!ga",
      name = "Z",
      descriptor = "I"
   )
   public static int field395;
   @OriginalMember(
      owner = "client!ga",
      name = "db",
      descriptor = "I"
   )
   public static int field396;
   @OriginalMember(
      owner = "client!ga",
      name = "Q",
      descriptor = "I"
   )
   public static int field397;
   @OriginalMember(
      owner = "client!ga",
      name = "S",
      descriptor = "I"
   )
   public static int field398;
   @OriginalMember(
      owner = "client!ga",
      name = "V",
      descriptor = "I"
   )
   public static int field399;
   @OriginalMember(
      owner = "client!ga",
      name = "T",
      descriptor = "I"
   )
   public static int field400;
   @OriginalMember(
      owner = "client!ga",
      name = "lb",
      descriptor = "I"
   )
   public static int field402;
   @OriginalMember(
      owner = "client!ga",
      name = "X",
      descriptor = "I"
   )
   public static int field403;
   @OriginalMember(
      owner = "client!ga",
      name = "kb",
      descriptor = "I"
   )
   public static int field404;
   @OriginalMember(
      owner = "client!ga",
      name = "mb",
      descriptor = "I"
   )
   public static int field405;
   @OriginalMember(
      owner = "client!ga",
      name = "eb",
      descriptor = "I"
   )
   public static int field406;
   @OriginalMember(
      owner = "client!ga",
      name = "bb",
      descriptor = "I"
   )
   public static int field408;
   @OriginalMember(
      owner = "client!ga",
      name = "gb",
      descriptor = "I"
   )
   public static int field409;
   @OriginalMember(
      owner = "client!ga",
      name = "U",
      descriptor = "Lrr;"
   )
   public static class678 field407;
   @OriginalMember(
      owner = "client!ga",
      name = "jb",
      descriptor = "Lil;"
   )
   private class680 field410;

   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "(Lha;I)V",
      line = 7
   )
   public final void method49(class610 arg0, int arg1) {
      try {
         ++field398;
         class91 var3 = this.field389.method4020(arg0, true, true, -3893, 262144);
         if (var3 != null) {
            class401 var4 = arg0.method640();
            var4.method1542(super.field1505, super.field1495, super.field1494);
            this.field389.method4027(false, super.field1040, super.field1044, true, super.field1049, super.field1042, var3, var4, arg0);
         }

         if (arg1 != -16) {
            this.field389 = null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field411[17] + (arg0 != null ? field411[0] : field411[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(ILha;)Lil;",
      line = 27
   )
   public final class680 method41(int arg0, class610 arg1) {
      try {
         ++field396;
         if (arg0 != 4058) {
            this.field392 = true;
         }

         return this.field410;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field411[15] + arg0 + ',' + (arg1 != null ? field411[0] : field411[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(Lha;B)V",
      line = 38
   )
   public final void method227(class610 arg0, byte arg1) {
      try {
         ++field395;
         this.field389.method4026(arg0, (byte)114);
         int var3 = 114 / ((30 - arg1) / 34);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field411[8] + (arg0 != null ? field411[0] : field411[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "g",
      descriptor = "(I)Z",
      line = 48
   )
   public final boolean method228(int arg0) {
      try {
         if (arg0 != 0) {
            this.method241(126);
         }

         ++field394;
         return this.field401;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field411[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(Z[[[BIBIIZ)V",
      line = 60
   )
   public static final void method229(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
      int var7 = arg0 ? 1 : 0;
      class711.field10690 = 0;
      class127.field1832 = 0;
      ++class406.field6331;
      if ((arg5 & 2) == 0) {
         for(class109 var8 = class6.field36[var7]; var8 != null; var8 = var8.field1503) {
            if (!class745.method5474(var8, arg0, arg1, arg2, arg3)) {
               class699.method5146(var8);
               if (var8.field1498 != -1) {
                  class478.field7280[class711.field10690++] = var8;
               }
            }
         }
      }

      if ((arg5 & 1) == 0) {
         for(class109 var9 = class777.field11406[var7]; var9 != null; var9 = var9.field1503) {
            if (!class745.method5474(var9, arg0, arg1, arg2, arg3)) {
               class699.method5146(var9);
               if (var9.field1498 != -1) {
                  class19.field241[class127.field1832++] = var9;
               }
            }
         }

         for(class109 var10 = class651.field9383[var7]; var10 != null; var10 = var10.field1503) {
            if (!class745.method5474(var10, arg0, arg1, arg2, arg3)) {
               if (var10.method228(0)) {
                  class699.method5146(var10);
                  if (var10.field1498 != -1) {
                     class19.field241[class127.field1832++] = var10;
                  }
               } else {
                  class699.method5146(var10);
                  if (var10.field1498 != -1) {
                     class478.field7280[class711.field10690++] = var10;
                  }
               }
            }
         }

         if (!arg0) {
            for(int var11 = 0; var11 < class108.field1485; ++var11) {
               if (!class745.method5474(class395.field6195[var11], arg0, arg1, arg2, arg3)) {
                  class699.method5146(class395.field6195[var11]);
                  if (class395.field6195[var11].field1498 != -1) {
                     if (class395.field6195[var11].method228(0)) {
                        class19.field241[class127.field1832++] = class395.field6195[var11];
                     } else {
                        class478.field7280[class711.field10690++] = class395.field6195[var11];
                     }
                  }
               }
            }
         }
      }

      if (class711.field10690 > 0) {
         class749.method5505(class478.field7280, 0, class711.field10690 - 1);

         for(int var12 = 0; var12 < class711.field10690; ++var12) {
            class738.method5421(class478.field7280[var12], true, arg6);
         }
      }

      if (class535.field8107) {
         class546.field8193.method696(0, (class404[])null);
      }

      if ((arg5 & 2) == 0) {
         for(int var13 = class684.field10177; var13 < class461.field7016; ++var13) {
            if (var13 >= arg2 && arg1 != null) {
               int var14 = class717.field10755.length;
               if (class717.field10755.length + class356.field5484 > class247.field3734) {
                  var14 -= class717.field10755.length + class356.field5484 - class247.field3734;
               }

               int var15 = class717.field10755[0].length;
               if (class717.field10755[0].length + class775.field11389 > class365.field5634) {
                  var15 -= class717.field10755[0].length + class775.field11389 - class365.field5634;
               }

               boolean[][] var16 = class247.field3755;
               if (class492.field7436) {
                  if (class116.field1566) {
                     var16 = class392.field6153[var13];
                  }

                  for(int var17 = class68.field899; var17 < var14; ++var17) {
                     int var18 = class356.field5484 + var17 - class68.field899;

                     for(int var19 = class471.field7169; var19 < var15; ++var19) {
                        var16[var17][var19] = false;
                        if (class717.field10755[var17][var19]) {
                           int var20 = class775.field11389 + var19 - class471.field7169;

                           for(int var21 = var13; var21 >= 0; --var21) {
                              if (class711.field10694[var21][var18][var20] != null && class711.field10694[var21][var18][var20].field2954 == var13) {
                                 if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !client.method1174(var20, var13, var18, 121)) {
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

               if (class116.field1566) {
                  if (arg4 >= 0) {
                     class385.field6076[var13].method1130(0, 0, 0, (boolean[][])null, false, arg4, arg5);
                  } else {
                     class385.field6076[var13].method1119(0, 0, 0, (boolean[][])null, false, arg5);
                  }

                  for(int var22 = 0; var22 < class774.field11384; ++var22) {
                     class659.field9842[var22].method3536(new class27(var13 + 1), 98);
                  }
               } else if (arg4 >= 0) {
                  class385.field6076[var13].method1130(class487.field7409, class701.field10446, class382.field6038, class247.field3755, false, arg4, arg5);
               } else {
                  class385.field6076[var13].method1119(class487.field7409, class701.field10446, class382.field6038, class247.field3755, false, arg5);
               }
            } else {
               int var23 = class717.field10755.length;
               if (class717.field10755.length + class356.field5484 > class247.field3734) {
                  var23 -= class717.field10755.length + class356.field5484 - class247.field3734;
               }

               int var24 = class717.field10755[0].length;
               if (class717.field10755[0].length + class775.field11389 > class365.field5634) {
                  var24 -= class717.field10755[0].length + class775.field11389 - class365.field5634;
               }

               boolean[][] var25 = class247.field3755;
               if (class492.field7436) {
                  if (class116.field1566) {
                     var25 = class392.field6153[var13];
                  }

                  for(int var26 = class68.field899; var26 < var23; ++var26) {
                     int var27 = class356.field5484 + var26 - class68.field899;

                     for(int var28 = class471.field7169; var28 < var24; ++var28) {
                        if (class717.field10755[var26][var28] && !client.method1174(class775.field11389 + var28 - class471.field7169, var13, var27, 40)) {
                           var25[var26][var28] = true;
                        } else {
                           var25[var26][var28] = false;
                        }
                     }
                  }
               }

               if (class116.field1566) {
                  if (arg4 >= 0) {
                     class385.field6076[var13].method1130(0, 0, 0, (boolean[][])null, false, arg4, arg5);
                  } else {
                     class385.field6076[var13].method1119(0, 0, 0, (boolean[][])null, false, arg5);
                  }

                  for(int var29 = 0; var29 < class774.field11384; ++var29) {
                     class659.field9842[var29].method3536(new class27(var13 + 1), 97);
                  }
               } else if (arg4 >= 0) {
                  class385.field6076[var13].method1130(class487.field7409, class701.field10446, class382.field6038, class247.field3755, true, arg4, arg5);
               } else {
                  class385.field6076[var13].method1119(class487.field7409, class701.field10446, class382.field6038, class247.field3755, true, arg5);
               }
            }
         }
      }

      if (class127.field1832 > 0) {
         class520.method4010(class19.field241, 0, class127.field1832 - 1);

         for(int var30 = 0; var30 < class127.field1832; ++var30) {
            class738.method5421(class19.field241[var30], true, arg6);
         }
      }

   }

   @OriginalMember(
      owner = "client!ga",
      name = "h",
      descriptor = "(I)I",
      line = 361
   )
   public final int method230(int arg0) {
      try {
         if (arg0 != 2) {
            this.field401 = true;
         }

         ++field404;
         return this.field389.method4019((byte)-61);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field411[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "(B)I",
      line = 373
   )
   public final int method231(byte arg0) {
      try {
         ++field406;
         if (arg0 != -42) {
            this.field389 = null;
         }

         return this.field389.field7926;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field411[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(I)V",
      line = 387
   )
   public final void method232(int arg0) {
      try {
         ++field390;
         int var2 = -40 % ((arg0 - 54) / 59);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field411[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "(Z)Z",
      line = 399
   )
   public final boolean method233(boolean arg0) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field397;
            return false;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field411[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "d",
      descriptor = "(B)Z",
      line = 413
   )
   public final boolean method45(byte arg0) {
      try {
         ++field387;
         if (arg0 > -108) {
            this.field389 = null;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field411[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "f",
      descriptor = "(I)V",
      line = 424
   )
   public final void method57(int arg0) {
      try {
         int var2 = -51 / ((-51 - arg0) / 60);
         ++field400;
         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field411[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(ILff;)V",
      line = 434
   )
   public final void method234(int arg0, class752 arg1) {
      try {
         if (arg0 > -9) {
            this.method241(34);
         }

         this.field389.method4021(arg1, (byte)78);
         ++field405;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field411[3] + arg0 + ',' + (arg1 != null ? field411[0] : field411[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(BLha;)Lpga;",
      line = 446
   )
   public final class788 method56(byte arg0, class610 arg1) {
      boolean var3 = client.field1786;

      try {
         ++field399;
         class91 var4 = this.field389.method4020(arg1, true, false, -3893, 2048);
         if (var4 == null) {
            return null;
         } else {
            class401 var5 = arg1.method640();
            var5.method1542(super.field1505, super.field1495, super.field1494);
            if (arg0 != -20) {
               this.method232(103);
            }

            class788 var6;
            label58: {
               var6 = class333.method2708((byte)121, 1, this.field392);
               this.field389.method4027(true, super.field1040, super.field1044, true, super.field1049, super.field1042, var4, var5, arg1);
               if (!class334.field5143) {
                  var4.method897(var5, var6.field11545[0], 0);
                  if (!var3) {
                     break label58;
                  }
               }

               var4.method905(var5, var6.field11545[0], class591.field8709, 0);
            }

            if (this.field389.field7951 != null) {
               label52: {
                  class43 var7 = this.field389.field7951.method5459();
                  if (class334.field5143) {
                     arg1.method641(var7, class591.field8709);
                     if (!var3) {
                        break label52;
                     }
                  }

                  arg1.method652(var7);
               }
            }

            this.field401 = var4.method892() || this.field389.field7951 != null;
            if (this.field410 == null) {
               this.field410 = class404.method3254(arg0 + 54, super.field1494, super.field1495, var4, super.field1505);
               if (!var3) {
                  return var6;
               }
            }

            class336.method2739(this.field410, (byte)53, var4, super.field1494, super.field1495, super.field1505);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field411[2] + arg0 + ',' + (arg1 != null ? field411[0] : field411[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(Lr;III[Z)V",
      line = 493
   )
   public static final void method235(class273 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      if (class385.field6076 != class190.field2949) {
         int var5 = class96.field1355[arg1].method2312(arg2, arg3, -50);

         for(int var6 = 0; var6 <= arg1; ++var6) {
            if (arg4 == null || arg4[var6]) {
               class271 var7 = class96.field1355[var6];
               if (var7 != null) {
                  var7.method1123(arg0, arg2, var5 - var7.method2312(arg2, arg3, -103), arg3, 0, false);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ga",
      name = "<init>",
      descriptor = "(Lha;Lru;IIIIIZIIIIIII)V",
      line = 523
   )
   public class32(class610 arg0, class333 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field5100 == -2, class293.method2470(arg13, arg12, (byte)-70));

      try {
         this.field389 = new class522(arg0, arg1, arg12, arg13, super.field1506, arg3, this, arg7, arg14);
         this.field392 = ~arg1.field5071 != -1 && !arg7;
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field411[11] + (arg0 != null ? field411[0] : field411[1]) + ',' + (arg1 != null ? field411[0] : field411[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(B)I",
      line = 532
   )
   public final int method236(byte arg0) {
      try {
         ++field408;
         if (arg0 != -11) {
            field407 = null;
         }

         return this.field389.field7930;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field411[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "c",
      descriptor = "(I)I",
      line = 544
   )
   public final int method237(int arg0) {
      try {
         if (arg0 != 28440) {
            field407 = null;
         }

         ++field393;
         return this.field389.field7957;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field411[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(Lha;I)V",
      line = 563
   )
   public final void method238(class610 arg0, int arg1) {
      try {
         int var3 = -8 / ((-20 - arg1) / 62);
         ++field409;
         this.field389.method4023(arg0, -1);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field411[10] + (arg0 != null ? field411[0] : field411[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "k",
      descriptor = "(I)I",
      line = 574
   )
   public final int method239(int arg0) {
      try {
         int var2 = 111 / ((-44 - arg0) / 39);
         ++field388;
         return this.field389.method4028(35);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field411[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "e",
      descriptor = "(B)V",
      line = 586
   )
   public static void method240(byte arg0) {
      try {
         field407 = null;
         if (arg0 < 59) {
            method229(false, (byte[][][])null, 101, (byte)-44, -11, 88, true);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field411[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "(I)Z",
      line = 596
   )
   public final boolean method241(int arg0) {
      try {
         ++field403;
         if (arg0 != -18128) {
            this.field401 = true;
         }

         return this.field389.method4029((byte)-24);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field411[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(Lha;IIZ)Z",
      line = 607
   )
   public final boolean method43(class610 arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field402;
         class91 var5 = this.field389.method4020(arg0, arg3, false, -3893, 131072);
         if (var5 == null) {
            return false;
         } else {
            class401 var6 = arg0.method640();
            var6.method1542(super.field1505, super.field1495, super.field1494);
            return !class334.field5143 ? var5.method886(arg2, arg1, var6, false, 0) : var5.method912(arg2, arg1, var6, false, 0, class591.field8709);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field411[20] + (arg0 != null ? field411[0] : field411[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(IIILha;ZILbaa;)V",
      line = 624
   )
   public final void method44(int arg0, int arg1, int arg2, class610 arg3, boolean arg4, int arg5, class109 arg6) {
      try {
         ++field391;
         if (arg1 != 0) {
            this.method227((class610)null, (byte)-114);
         }

         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field411[22] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field411[0] : field411[1]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field411[0] : field411[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method242(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method243(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
