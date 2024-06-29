import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class694 {
   @OriginalMember(
      owner = "client!gba",
      name = "g",
      descriptor = "Lgw;"
   )
   public class179 field10183 = new class179(20);
   @OriginalMember(
      owner = "client!gba",
      name = "e",
      descriptor = "Lgw;"
   )
   private class179 field10187 = new class179(64);
   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "Lhw;"
   )
   private class141 field10184;
   @OriginalMember(
      owner = "client!gba",
      name = "b",
      descriptor = "Lhw;"
   )
   public class141 field10186;
   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10188 = new String[]{method5051(method5050("fS\u0010|\u001f")), method5051(method5050("z\u001f_|^t\u0013W&\\5")), method5051(method5050("s\bR>")), method5051(method5050("z\u001f_|$5")), method5051(method5050("z\u001f_|!5")), method5051(method5050("z\u001f_|'5")), method5051(method5050("z\u001f_| 5")), method5051(method5050("z\u001f_|#5")), method5051(method5050("z\u001f_|&5"))};
   @OriginalMember(
      owner = "client!gba",
      name = "f",
      descriptor = "Lgh;"
   )
   public static class572 field10181 = new class572(69, 6);
   @OriginalMember(
      owner = "client!gba",
      name = "j",
      descriptor = "Lca;"
   )
   public static class320 field10185 = new class320(method5051(method5050("z\u001cS7Q")), method5051(method5050("Z\u001cS7B.")), 2);
   @OriginalMember(
      owner = "client!gba",
      name = "d",
      descriptor = "I"
   )
   public static int field10177;
   @OriginalMember(
      owner = "client!gba",
      name = "k",
      descriptor = "I"
   )
   public static int field10178;
   @OriginalMember(
      owner = "client!gba",
      name = "h",
      descriptor = "I"
   )
   public static int field10179;
   @OriginalMember(
      owner = "client!gba",
      name = "c",
      descriptor = "I"
   )
   public static int field10180;
   @OriginalMember(
      owner = "client!gba",
      name = "i",
      descriptor = "I"
   )
   public static int field10182;

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5044(byte arg0) {
      try {
         ++field10177;
         class179 var2 = this.field10187;
         synchronized(this.field10187) {
            this.field10187.method1589((byte)90);
            if (arg0 != 94) {
               method5047(-63);
            }
         }

         class179 var3 = this.field10183;
         synchronized(this.field10183) {
            this.field10183.method1589((byte)105);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10188[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method5045(int arg0, int arg1) {
      try {
         ++field10182;
         class179 var3 = this.field10187;
         synchronized(this.field10187) {
            this.field10187.method1579(-69, arg1);
         }

         if (arg0 >= 22) {
            class179 var4 = this.field10183;
            synchronized(this.field10183) {
               this.field10183.method1579(101, arg1);
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10188[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method5046(byte arg0) {
      try {
         ++field10180;
         if (arg0 == -50) {
            class179 var2 = this.field10187;
            synchronized(this.field10187) {
               this.field10187.method1591((byte)58);
            }

            class179 var3 = this.field10183;
            synchronized(this.field10183) {
               this.field10183.method1591((byte)58);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10188[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5047(int arg0) {
      try {
         if (arg0 == -1) {
            field10181 = null;
            field10185 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10188[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(IIIIIZ)V"
   )
   public static final void method5048(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var6 = client.field4564;

      try {
         ++field10179;
         if (class90.field1473 == null) {
            class444.field6473.method693(arg3 ^ 30869, -16777216, arg1, arg2, arg0, arg4);
         } else if (~class304.field4398.field4101 <= -1 && ~class304.field4398.field4101 > ~(class209.field3112 * 512) && ~class304.field4398.field4096 <= -1 && class304.field4398.field4096 < class1.field3 * 512) {
            ++class631.field9212;
            if (class304.field4398 != null && ~(class304.field4398.field4101 - (-1 + class304.field4398.method3438(false)) * 256 >> 9) == ~class770.field11213 && ~(class304.field4398.field4096 + -(256 * (class304.field4398.method3438(false) - 1)) >> 9) == ~class344.field4901) {
               class770.field11213 = -1;
               class344.field4901 = -1;
               class176.method1561(0);
            }

            class334.method2594((byte)-121);
            if (!arg5) {
               class144.method1364(-12275);
            }

            int var22;
            int var23;
            int var24;
            int var25;
            label277: {
               class772.method5588(arg3 ^ -20702);
               class164.method1494(arg0, true, arg4, -27483, arg1, arg2);
               class75.field1316 = class75.field1322;
               var22 = class395.field5805;
               var24 = class108.field1781;
               var23 = class668.field9702;
               var25 = class284.field3966;
               if (class590.field8514 != 1) {
                  if (class590.field8514 == 4) {
                     int var7 = (int)class621.field9035;
                     if (~(class463.field6770 >> 8) < ~var7) {
                        var7 = class463.field6770 >> 8;
                     }

                     if (class718.field10370[4] && ~(class734.field10557[4] + 128) < ~var7) {
                        var7 = class734.field10557[4] + 128;
                     }

                     int var8 = 16383 & (int)class756.field10975;
                     class764.method5529(var7, -1, var8, class587.field8484, class663.method4851(class66.field1224, class745.field10737, class731.field10504, 101) + -200, (var7 >> 3) * 3 + 600 << 2, var24, class243.field3500);
                     if (!var6) {
                        break label277;
                     }
                  }

                  if (class590.field8514 != 5) {
                     break label277;
                  }

                  class722.method5239(var24, arg3 + -20529);
                  if (!var6) {
                     break label277;
                  }
               }

               int var9 = (int)class621.field9035;
               if (class463.field6770 >> 8 > var9) {
                  var9 = class463.field6770 >> 8;
               }

               if (class718.field10370[4] && class734.field10557[4] + 128 > var9) {
                  var9 = class734.field10557[4] + 128;
               }

               int var10 = 16383 & (int)class756.field10975 - -class585.field8463;
               class764.method5529(var9, -1, var10, class587.field8484, -200 + class663.method4851(class304.field4398.field4096, class304.field4398.field4101, class731.field10504, arg3 ^ 20720), 600 - -((var9 >> 3) * 3) << 2, var24, class243.field3500);
            }

            int var11 = class583.field8442;
            int var12 = class494.field7193;
            int var13 = class677.field9932;
            int var14 = class414.field6073;
            int var15 = class373.field5548;
            int var16 = 0;
            int var17;
            if (var6) {
               if (class718.field10370[var16]) {
                  var17 = (int)((double)(-class103.field1685[var16]) + (double)(class103.field1685[var16] * 2 - -1) * Math.random() + Math.sin((double)class441.field6443[var16] / 100.0D * (double)class212.field3173[var16]) * (double)class734.field10557[var16]);
                  if (~var16 == -5) {
                     class414.field6073 += var17;
                     if (class414.field6073 < 1024) {
                        class414.field6073 = 1024;
                        if (var6 && class414.field6073 > 3072) {
                           class414.field6073 = 3072;
                        }
                     } else if (class414.field6073 > 3072) {
                        class414.field6073 = 3072;
                     }
                  }

                  if (~var16 == -2) {
                     class494.field7193 += var17 << 2;
                  }

                  if (~var16 == -1) {
                     class583.field8442 += var17 << 2;
                  }

                  if (var16 == 3) {
                     class373.field5548 = class373.field5548 + var17 & 16383;
                  }

                  if (~var16 == -3) {
                     class677.field9932 += var17 << 2;
                  }

                  ++var16;
               } else {
                  ++var16;
               }
            }

            while(true) {
               int var10000;
               if (~var16 <= -6) {
                  var10000 = ~class583.field8442;
                  if (!var6) {
                     if (var10000 > -1) {
                        class583.field8442 = 0;
                     }

                     if (class677.field9932 < 0) {
                        class677.field9932 = 0;
                     }

                     if (~((class479.field6989 << 9) + -1) > ~class583.field8442) {
                        class583.field8442 = (class479.field6989 << 9) + -1;
                     }

                     if (~((class357.field5100 << 9) + -1) > ~class677.field9932) {
                        class677.field9932 = (class357.field5100 << 9) + -1;
                     }

                     label282: {
                        class319.method2493((byte)-95);
                        class592.method4370(arg3 ^ 55302);
                        class444.field6473.method333(var25, var22, var23 + var25, var22 - -var24);
                        class284.method2212(12639, true);
                        if (class262.field3734) {
                           class273.method2154(class753.field10845, (byte)39);
                           if (~class75.field1316 != ~class267.field3786) {
                              class186.field2818 = true;
                           }

                           class267.field3786 = class75.field1316;
                           if (!var6) {
                              break label282;
                           }
                        }

                        class444.field6473.method380();
                        int var18 = class753.field10845;
                        if (class360.field5396 != null) {
                           class360.field5396.method480(0, class414.field6073, class373.field5548, var25, class670.field9763 << 3, var24, var22, var23, var18, class444.field6473);
                           if (!var6) {
                              break label282;
                           }
                        }

                        class444.field6473.method421(var18);
                     }

                     label283: {
                        class743.method5393(4);
                        class734.field10566.method997(class583.field8442, class494.field7193, class677.field9932, -class414.field6073 & 16383, 16383 & -class373.field5548, 16383 & -class127.field2133);
                        class444.field6473.method338(class734.field10566);
                        class444.field6473.method429(var23 / 2 + var25, var22 - -(var24 / 2), class296.field4154 << 1, class296.field4154 << 1);
                        class11.method67(class296.field4154 << 1, var24 / 2 + var22, var23 / 2 + var25, class296.field4154 << 1, 0);
                        class401.method3090(16383 & -class127.field2133, 16383 & -class373.field5548, class494.field7193, 16383 & -class414.field6073, class677.field9932, class583.field8442, (byte)-54);
                        byte var19 = class510.field7454.field11165.method3277(false) != 2 ? 1 : (byte)class631.field9212;
                        if (!class262.field3734) {
                           class628.method4600(class29.field458, class583.field8442, class494.field7193, class677.field9932, class443.field6462, class437.field6311, class145.field2374, class236.field3433, class633.field9229, class416.field6091, class304.field4398.field4090 - -1, var19, class304.field4398.field4101 >> 9, class304.field4398.field4096 >> 9, ~class510.field7454.field11179.method965(false) == -1, true, class679.field9962 ? class75.field1316 : -1, 0, false);
                           if (!var6) {
                              break label283;
                           }
                        }

                        class645.method4739(-class373.field5548 & 16383, 16383 & -class414.field6073, (byte)-86, -class127.field2133 & 16383);
                        class483.method3654(var19, true, class236.field3433, class583.field8442, (byte)-127, class304.field4398.field4090 - -1, class633.field9229, class443.field6462, class677.field9932, class416.field6091, class494.field7193, class29.field458, class304.field4398.field4096 >> 9, class75.field1316, ~class510.field7454.field11179.method965(false) == -1, class304.field4398.field4101 >> 9, class145.field2374, class437.field6311);
                     }

                     if (arg3 != 20629) {
                        field10185 = null;
                     }

                     class743.method5393(arg3 + -20625);
                     if (~class376.field5588 == -11) {
                        class767.method5546(var23, var24, 256, 256, (byte)15, var22, var25);
                        class749.method5431(var23, var24, 256, 256, var22, var25, (byte)-104);
                        class321.method2501(0, var24, var25, 256, 256, var22, var23);
                        class233.method1921(var23, var22, var25, arg3 + -20529, var24);
                     }

                     class358.method2813();
                     class494.field7193 = var12;
                     class373.field5548 = var15;
                     class583.field8442 = var11;
                     class414.field6073 = var14;
                     class677.field9932 = var13;
                     if (class201.field3018 && class70.field1247.method1295(false) == 0) {
                        class201.field3018 = false;
                     }

                     if (class201.field3018) {
                        class444.field6473.method693(10240, -16777216, var23, var24, var22, var25);
                        class263.method2107(class141.field2309, class100.field1611.method961(class385.field5684, true), false, class678.field9949, arg3 + -20627, class444.field6473);
                     }

                     class284.method2212(12639, false);
                     return;
                  }
               } else {
                  var10000 = class718.field10370[var16];
               }

               if (var10000 != 0) {
                  var17 = (int)((double)(-class103.field1685[var16]) + (double)(class103.field1685[var16] * 2 - -1) * Math.random() + Math.sin((double)class441.field6443[var16] / 100.0D * (double)class212.field3173[var16]) * (double)class734.field10557[var16]);
                  if (~var16 == -5) {
                     class414.field6073 += var17;
                     if (class414.field6073 < 1024) {
                        class414.field6073 = 1024;
                        if (var6 && class414.field6073 > 3072) {
                           class414.field6073 = 3072;
                        }
                     } else if (class414.field6073 > 3072) {
                        class414.field6073 = 3072;
                     }
                  }

                  if (~var16 == -2) {
                     class494.field7193 += var17 << 2;
                  }

                  if (~var16 == -1) {
                     class583.field8442 += var17 << 2;
                  }

                  if (var16 == 3) {
                     class373.field5548 = class373.field5548 + var17 & 16383;
                  }

                  if (~var16 == -3) {
                     class677.field9932 += var17 << 2;
                  }

                  ++var16;
               } else {
                  ++var16;
               }
            }
         } else {
            class444.field6473.method693(arg3 ^ 30869, -16777216, arg1, arg2, arg0, arg4);
         }
      } catch (RuntimeException var21) {
         throw class608.method4462(var21, field10188[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(II)Lra;"
   )
   public final class118 method5049(int arg0, int arg1) {
      try {
         ++field10178;
         class179 var3 = this.field10187;
         class118 var4;
         synchronized(this.field10187) {
            var4 = (class118)this.field10187.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field10184;
            byte[] var6;
            synchronized(this.field10184) {
               var6 = this.field10184.method1347((byte)126, arg0, arg1);
            }

            class118 var7 = new class118();
            var7.field1924 = this;
            if (var6 != null) {
               var7.method1122(new class473(var6), 121);
            }

            class179 var8 = this.field10187;
            synchronized(this.field10187) {
               this.field10187.method1581((long)arg1, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field10188[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "<init>",
      descriptor = "(Lca;ILhw;Lhw;)V"
   )
   public class694(class320 arg0, int arg1, class141 arg2, class141 arg3) {
      try {
         this.field10184 = arg2;
         this.field10186 = arg3;
         this.field10184.method1346(46, 0);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10188[1] + (arg0 != null ? field10188[0] : field10188[2]) + ',' + arg1 + ',' + (arg2 != null ? field10188[0] : field10188[2]) + ',' + (arg3 != null ? field10188[0] : field10188[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5050(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5051(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
