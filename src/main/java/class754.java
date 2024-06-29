import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qka")
public class class754 extends class67 {
   @OriginalMember(
      owner = "client!qka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11184 = new String[]{method5537(method5536("\u0001\u001aCb|X")), method5537(method5536("\u0001\u001aCbsX")), method5537(method5536("\u0001\u001aCbxX")), method5537(method5536("\u0001\u001aCb}X")), method5537(method5536("\u0001\u001aCbrX")), method5537(method5536("\u0001\u001aCb{X")), method5537(method5536("\u0001\u001aCbyX")), method5537(method5536("\u0001\u001aCb\u007fX")), method5537(method5536("\u0001\u001aCb~X"))};
   @OriginalMember(
      owner = "client!qka",
      name = "n",
      descriptor = "I"
   )
   public static int field11172;
   @OriginalMember(
      owner = "client!qka",
      name = "v",
      descriptor = "I"
   )
   public static int field11173;
   @OriginalMember(
      owner = "client!qka",
      name = "k",
      descriptor = "I"
   )
   public static int field11174;
   @OriginalMember(
      owner = "client!qka",
      name = "u",
      descriptor = "I"
   )
   public static int field11175;
   @OriginalMember(
      owner = "client!qka",
      name = "t",
      descriptor = "I"
   )
   public static int field11177;
   @OriginalMember(
      owner = "client!qka",
      name = "r",
      descriptor = "I"
   )
   public static int field11178;
   @OriginalMember(
      owner = "client!qka",
      name = "l",
      descriptor = "I"
   )
   public static int field11179;
   @OriginalMember(
      owner = "client!qka",
      name = "o",
      descriptor = "I"
   )
   public static int field11180;
   @OriginalMember(
      owner = "client!qka",
      name = "m",
      descriptor = "I"
   )
   public static int field11182;
   @OriginalMember(
      owner = "client!qka",
      name = "s",
      descriptor = "I"
   )
   public static int field11183;
   @OriginalMember(
      owner = "client!qka",
      name = "p",
      descriptor = "Lrr;"
   )
   public static class678 field11181;
   @OriginalMember(
      owner = "client!qka",
      name = "q",
      descriptor = "Lvba;"
   )
   public static class735 field11176;

   @OriginalMember(
      owner = "client!qka",
      name = "d",
      descriptor = "(I)I",
      line = 3
   )
   public final int method5531(int arg0) {
      try {
         if (arg0 != 480102311) {
            return -94;
         } else {
            ++field11180;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11184[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "(II)I",
      line = 17
   )
   public final int method161(int arg0, int arg1) {
      try {
         if (arg1 > -74) {
            return -111;
         } else {
            ++field11182;
            return 3;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11184[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "(IIIIII)Z",
      line = 35
   )
   public static final boolean method5532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         if (arg3 != 2753) {
            method5532(125, -4, -100, -29, 119, 92);
         }

         ++field11183;
         int var7 = arg1;
         int var10000;
         if (var6) {
            var10000 = arg5;
         } else if (arg4 < arg1) {
            var10000 = 0;
            if (!var6) {
               return false;
            }
         } else {
            var10000 = arg5;
         }

         while(true) {
            int var8 = var10000;
            if (var6) {
               if (class415.field6440[var7][var8] == arg2 && ~class692.field10300[var7][var8] >= -2) {
                  return true;
               }

               ++var8;
            }

            while(true) {
               while(arg0 >= var8) {
                  if (class415.field6440[var7][var8] == arg2 && ~class692.field10300[var7][var8] >= -2) {
                     return true;
                  }

                  ++var8;
               }

               if (!var6) {
                  ++var7;
                  if (arg4 < var7) {
                     var10000 = 0;
                     if (!var6) {
                        return false;
                     }
                  } else {
                     var10000 = arg5;
                  }
                  break;
               }

               ++var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field11184[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "b",
      descriptor = "(IB)I",
      line = 66
   )
   public static final int method5533(int arg0, byte arg1) {
      boolean var2 = client.field1786;

      try {
         byte var3;
         label42: {
            ++field11179;
            if (arg0 > 12000) {
               class238.method2032(false);
               var3 = 4;
               if (!var2) {
                  break label42;
               }
            }

            if (arg0 > 5000) {
               var3 = 3;
               class143.method1299(1);
               if (!var2) {
                  break label42;
               }
            }

            if (~arg0 >= -2001) {
               class491.method3804(true, true);
               var3 = 1;
               if (!var2) {
                  break label42;
               }
            }

            class713.method5285((byte)-84);
            var3 = 2;
         }

         if (~class687.field10213.field507.method3440(480102311) != -3) {
            class687.field10213.method299(-17, 2, class687.field10213.field494);
            class473.method3678(2744, 2, false);
         }

         class388.method3135(0);
         if (arg1 >= -71) {
            method5532(-40, -100, -53, -54, -75, -19);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11184[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "(B)V",
      line = 113
   )
   public final void method158(byte arg0) {
      try {
         super.field877 = this.method162(0);
         ++field11175;
         if (arg0 != -69) {
            this.method5531(-69);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11184[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "b",
      descriptor = "(B)V",
      line = 124
   )
   public static final void method5534(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field11174;
         int var2 = -51 / ((arg0 - -29) / 51);
         class102 var3 = class510.field7801.field362;
         int var4 = 0;
         if (var1 || var4 < class36.field442) {
            do {
               int var5 = class77.field1024[var4];
               class466 var6 = ((class795)class501.field7665.method3141((long)var5, true)).field11592;
               int var7 = var3.method2855(-31007);
               if (~(var7 & 2) != -1) {
                  var7 += var3.method2855(-31007) << 8;
               }

               if ((512 & var7) != 0) {
                  var7 += var3.method2855(-31007) << 16;
               }

               if (~(32 & var7) != -1) {
                  var6.field1621 = var3.method2843(-1);
                  var6.field1629 = 100;
               }

               if ((var7 & 32768) != 0) {
                  int var8 = var3.method2848(-112);
                  var6.field1634 = var3.method2857((byte)125);
                  var6.field1597 = var3.method2877(-31130);
                  var6.field1620 = var8 & 32767;
                  var6.field1631 = (var8 & 32768) != 0;
                  var6.field1600 = var6.field1634 + var6.field1620 + class308.field4801;
               }

               if ((8192 & var7) != 0) {
                  int var9 = var3.method2857((byte)125);
                  int[] var10 = new int[var9];
                  int[] var11 = new int[var9];
                  int var12 = 0;
                  if (!var1 && var12 >= var9) {
                     var6.method1101((byte)-63, var10, var11);
                  } else {
                     while(true) {
                        int var13 = var3.method2848(-121);
                        if (~(var13 & 49152) == -49153) {
                           int var14 = var3.method2834(7183);
                           var10[var12] = class119.method1087(var14, var13 << 16);
                           if (var1) {
                              var10[var12] = var13;
                           }
                        } else {
                           var10[var12] = var13;
                        }

                        var11[var12] = var3.method2834(7183);
                        ++var12;
                        if (var12 >= var9) {
                           var6.method1101((byte)-63, var10, var11);
                           break;
                        }
                     }
                  }
               }

               if ((var7 & 256) != 0) {
                  var6.field1662 = var3.method2886((byte)88);
                  var6.field1669 = var3.method2837((byte)-87);
                  var6.field1658 = var3.method2837((byte)-102);
                  var6.field1663 = (byte)var3.method2877(-31130);
                  var6.field1661 = class308.field4801 + var3.method2834(7183);
                  var6.field1665 = class308.field4801 - -var3.method2861((byte)54);
               }

               if ((var7 & 2048) != 0) {
                  int var15 = var6.field7072.field5272.length;
                  int var16 = 0;
                  if (var6.field7072.field5291 != null) {
                     var16 = var6.field7072.field5291.length;
                  }

                  int var17 = 0;
                  if (var6.field7072.field5293 != null) {
                     var17 = var6.field7072.field5293.length;
                  }

                  int var18 = var3.method2877(-31130);
                  if (~(var18 & 1) == -2) {
                     var6.field7083 = null;
                  } else {
                     int[] var19 = null;
                     if (~(2 & var18) == -3) {
                        var19 = new int[var15];
                        int var20 = 0;
                        if (var1 || var20 < var15) {
                           do {
                              var19[var20] = var3.method2867(23);
                              ++var20;
                           } while(var20 < var15);
                        }
                     }

                     short[] var21 = null;
                     if (~(var18 & 4) == -5) {
                        var21 = new short[var16];
                        int var22 = 0;
                        if (var1 || var22 < var16) {
                           do {
                              var21[var22] = (short)var3.method2867(54);
                              ++var22;
                           } while(var22 < var16);
                        }
                     }

                     short[] var23 = null;
                     if ((8 & var18) == 8) {
                        var23 = new short[var17];
                        int var24 = 0;
                        if (var1 || var24 < var17) {
                           do {
                              var23[var24] = (short)var3.method2848(-113);
                              ++var24;
                           } while(var24 < var17);
                        }
                     }

                     long var25 = (long)(var6.field7088++) << 32 | (long)var5;
                     var6.field7083 = new class317(var25, var19, var21, var23);
                     if (var1) {
                        var6.field7083 = null;
                     }
                  }
               }

               if ((var7 & 128) != 0) {
                  var6.field7085 = var3.method2867(67);
                  var6.field7080 = var3.method2834(7183);
               }

               if ((16 & var7) != 0) {
                  int[] var27 = new int[4];
                  int var28 = 0;
                  if (var1) {
                     var27[var28] = var3.method2834(7183);
                     if (~var27[var28] == -65536) {
                        var27[var28] = -1;
                     }

                     ++var28;
                  }

                  while(true) {
                     while(~var28 > -5) {
                        var27[var28] = var3.method2834(7183);
                        if (~var27[var28] == -65536) {
                           var27[var28] = -1;
                        }

                        ++var28;
                     }

                     int var29 = var3.method2868(1318266360);
                     if (!var1) {
                        class113.method1059(2, var6, var29, true, var27);
                        break;
                     }

                     if (2 == -65536) {
                        var27[var28] = -1;
                     }

                     ++var28;
                  }
               }

               if (~(4 & var7) != -1) {
                  int var30 = var3.method2868(1318266360);
                  if (var30 > 0) {
                     int var31 = 0;
                     if (var1 || ~var31 > ~var30) {
                        do {
                           int var32;
                           int var33;
                           int var34;
                           int var35;
                           label322: {
                              var32 = -1;
                              var33 = -1;
                              var34 = var3.method2896(0);
                              var35 = -1;
                              if (var34 != 32767) {
                                 if (var34 == 32766) {
                                    var34 = -1;
                                    if (!var1) {
                                       break label322;
                                    }
                                 }

                                 var33 = var3.method2896(0);
                                 if (!var1) {
                                    break label322;
                                 }
                              }

                              var34 = var3.method2896(0);
                              var33 = var3.method2896(0);
                              var32 = var3.method2896(0);
                              var35 = var3.method2896(0);
                           }

                           int var36 = var3.method2896(0);
                           int var37 = var3.method2877(-31130);
                           var6.method1096(17065, var35, class308.field4801, var33, var34, var36, var37, var32);
                           ++var31;
                        } while(~var31 > ~var30);
                     }
                  }
               }

               if ((var7 & 8) != 0) {
                  var6.field1649 = var3.method2867(119);
                  if (var6.field1649 == 65535) {
                     var6.field1649 = -1;
                  }
               }

               if (~(524288 & var7) != -1) {
                  var6.field7089 = var3.method2848(-99);
                  if (~var6.field7089 == -65536) {
                     var6.field7089 = var6.field7072.field5288;
                  }
               }

               if ((262144 & var7) != 0) {
                  int var38 = var3.method2848(-101);
                  if (~var38 == -65536) {
                     var38 = -1;
                  }

                  int var39 = var3.method2885((byte)75);
                  int var40 = var3.method2857((byte)124);
                  int var41 = var40 & 7;
                  int var42 = 15 & var40 >> 3;
                  if (var42 == 15) {
                     var42 = -1;
                  }

                  var6.method1098(var42, false, (byte)79, var39, var38, 2, var41);
               }

               if (~(var7 & 64) != -1) {
                  if (var6.field7072.method2786(24931)) {
                     class205.method1789(var6, 9);
                  }

                  var6.method3618(-10000, class412.field6401.method791((byte)-84, var3.method2867(25)));
                  var6.method1104(-2620, var6.field7072.field5250);
                  var6.field1677 = var6.field7072.field5279 << 3;
                  if (var6.field7072.method2786(24931)) {
                     class346.method2795(var6, (class9)null, var6.field1506, 0, (byte)92, (class333)null, var6.field1683[0], var6.field1685[0]);
                  }
               }

               if (~(var7 & 1024) != -1) {
                  var6.field1664 = var3.method2886((byte)88);
                  var6.field1673 = var3.method2886((byte)88);
                  var6.field1667 = var3.method2837((byte)-108);
                  var6.field1676 = var3.method2889(true);
                  var6.field1659 = var3.method2861((byte)111) - -class308.field4801;
                  var6.field1675 = var3.method2834(7183) - -class308.field4801;
                  var6.field1671 = var3.method2877(-31130);
                  var6.field1667 += var6.field1683[0];
                  var6.field1690 = 0;
                  var6.field1676 += var6.field1685[0];
                  var6.field1673 += var6.field1685[0];
                  var6.field1688 = 1;
                  var6.field1664 += var6.field1683[0];
               }

               if (~(var7 & 131072) != -1) {
                  int var43 = var6.field7072.field5282.length;
                  int var44 = 0;
                  if (var6.field7072.field5291 != null) {
                     var44 = var6.field7072.field5291.length;
                  }

                  byte var45 = 0;
                  if (var6.field7072.field5293 != null) {
                     var44 = var6.field7072.field5293.length;
                  }

                  int var46 = var3.method2857((byte)123);
                  if (~(1 & var46) != -2) {
                     int[] var47 = null;
                     if (~(var46 & 2) == -3) {
                        var47 = new int[var43];
                        int var48 = 0;
                        if (var1) {
                           var47[var48] = var3.method2867(54);
                           ++var48;
                        }

                        while(~var43 < ~var48) {
                           var47[var48] = var3.method2867(54);
                           ++var48;
                        }
                     }

                     short[] var49 = null;
                     if (~(4 & var46) == -5) {
                        var49 = new short[var44];
                        int var50 = 0;
                        if (var1 || var50 < var44) {
                           do {
                              var49[var50] = (short)var3.method2861((byte)89);
                              ++var50;
                           } while(var50 < var44);
                        }
                     }

                     short[] var51 = null;
                     if (~(var46 & 8) == -9) {
                        var51 = new short[var45];
                        int var52 = 0;
                        if (var1 || ~var52 > ~var45) {
                           do {
                              var51[var52] = (short)var3.method2834(7183);
                              ++var52;
                           } while(~var52 > ~var45);
                        }
                     }

                     long var53 = (long)(var6.field7092++) << 32 | (long)var5;
                     new class317(var53, var47, var49, var51);
                  }
               }

               if ((var7 & 4096) != 0) {
                  int var55 = var3.method2834(7183);
                  int var56 = var3.method2885((byte)-114);
                  if (var55 == 65535) {
                     var55 = -1;
                  }

                  int var57 = var3.method2857((byte)117);
                  int var58 = 7 & var57;
                  int var59 = (120 & var57) >> 3;
                  if (~var59 == -16) {
                     var59 = -1;
                  }

                  var6.method1098(var59, false, (byte)79, var56, var55, 1, var58);
               }

               if ((1 & var7) != 0) {
                  int var60 = var3.method2834(7183);
                  int var61 = var3.method2860(true);
                  if (var60 == 65535) {
                     var60 = -1;
                  }

                  int var62 = var3.method2868(1318266360);
                  int var63 = 7 & var62;
                  int var64 = (var62 & 122) >> 3;
                  if (var64 == 15) {
                     var64 = -1;
                  }

                  var6.method1098(var64, false, (byte)79, var61, var60, 0, var63);
               }

               if ((16384 & var7) != 0) {
                  int var65 = var3.method2857((byte)117);
                  int[] var66 = new int[var65];
                  int[] var67 = new int[var65];
                  int[] var68 = new int[var65];
                  int var69 = 0;
                  if (!var1 && var65 <= var69) {
                     class507.method3939(var6, var66, var68, var67, true);
                  } else {
                     while(true) {
                        int var70 = var3.method2861((byte)53);
                        if (~var70 == -65536) {
                           var70 = -1;
                        }

                        var66[var69] = var70;
                        var67[var69] = var3.method2855(-31007);
                        var68[var69] = var3.method2848(-102);
                        ++var69;
                        if (var65 <= var69) {
                           class507.method3939(var6, var66, var68, var67, true);
                           break;
                        }
                     }
                  }
               }

               if ((65536 & var7) != 0) {
                  var6.field7095 = var3.method2843(-1);
                  if (!"".equals(var6.field7095)) {
                     if (var6.field7095.equals(var6.field7072.field5264)) {
                        var6.field7095 = var6.field7072.field5264;
                        ++var4;
                     } else {
                        ++var4;
                     }
                  } else {
                     var6.field7095 = var6.field7072.field5264;
                     ++var4;
                  }
               } else {
                  ++var4;
               }
            } while(var4 < class36.field442);

         }
      } catch (RuntimeException var72) {
         throw class482.method3757(var72, field11184[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "(IZ)V",
      line = 614
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field11178;
         super.field877 = arg0;
         if (!arg1) {
            method5533(86, (byte)-117);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11184[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "b",
      descriptor = "(I)I",
      line = 625
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            return -63;
         } else {
            ++field11173;
            return super.field881.method292((byte)127) == class619.field9004 && super.field881.method298(96) ? 0 : 1;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11184[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 640
   )
   public class754(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!qka",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 646
   )
   public class754(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!qka",
      name = "c",
      descriptor = "(I)V",
      line = 650
   )
   public static void method5535(int arg0) {
      try {
         field11181 = null;
         field11176 = null;
         if (arg0 != 0) {
            field11177 = -24;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11184[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5536(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5537(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
