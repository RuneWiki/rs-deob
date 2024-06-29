import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class319 {
   @OriginalMember(
      owner = "client!nb",
      name = "k",
      descriptor = "I"
   )
   public int field4371 = 128;
   @OriginalMember(
      owner = "client!nb",
      name = "f",
      descriptor = "I"
   )
   public int field4372 = 128;
   @OriginalMember(
      owner = "client!nb",
      name = "m",
      descriptor = "I"
   )
   public int field4362;
   @OriginalMember(
      owner = "client!nb",
      name = "i",
      descriptor = "I"
   )
   public int field4373;
   @OriginalMember(
      owner = "client!nb",
      name = "j",
      descriptor = "I"
   )
   public int field4366;
   @OriginalMember(
      owner = "client!nb",
      name = "d",
      descriptor = "I"
   )
   public int field4367;
   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4376 = new String[]{method2370(method2369("o(m\u0010\"o#7\u0012c")), method2370(method2369("o(moc")), method2370(method2369("o(mhc")), method2370(method2369("o?/@")), method2370(method2369("zdm\u00026")), method2370(method2369("o(mkc")), method2370(method2369("C?*@/;ju\u0019~")), method2370(method2369(",g}\f")), method2370(method2369("o(mjc")), method2370(method2369("o(mic")), method2370(method2369("i?%J&`$")), method2370(method2369("k+$H3")), method2370(method2369("k+$A\"r)")), method2370(method2369("k+$X#d%1M")), method2370(method2369("r=pH")), method2370(method2369("o(mmc")), method2370(method2369("e/7M\"m9")), method2370(method2369("k+$K'")), method2370(method2369("k+ @\"c")), method2370(method2369("i=pH")), method2370(method2369("o(mnc"))};
   @OriginalMember(
      owner = "client!nb",
      name = "l",
      descriptor = "Loi;"
   )
   public static class80 field4374 = new class80(8);
   @OriginalMember(
      owner = "client!nb",
      name = "e",
      descriptor = "I"
   )
   public static int field4363;
   @OriginalMember(
      owner = "client!nb",
      name = "c",
      descriptor = "I"
   )
   public static int field4364;
   @OriginalMember(
      owner = "client!nb",
      name = "h",
      descriptor = "I"
   )
   public static int field4365;
   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "I"
   )
   public static int field4368;
   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "I"
   )
   public static int field4369;
   @OriginalMember(
      owner = "client!nb",
      name = "n",
      descriptor = "I"
   )
   public static int field4370;
   @OriginalMember(
      owner = "client!nb",
      name = "g",
      descriptor = "Ljava/lang/Thread;"
   )
   public static Thread field4375;

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(Z)Lnb;"
   )
   public final class319 method2362(boolean arg0) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field4368;
            return new class319(this.field4362, this.field4371, this.field4372, this.field4373, this.field4367, this.field4366);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4376[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method2363(class66 arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field4364;
         int var3 = 0;
         int var4 = 0;
         if (class681.field10034) {
            var3 = class85.method755((byte)-78);
            var4 = class592.method4305((byte)69);
         }

         arg0.method592(var3, var4, class237.field3310 - -var3, 350 - -var4);
         arg0.method496(var3, var4, class237.field3310, 350, class715.field10401 << 24 | 3351159, 1);
         class193.method1520(var4, arg1 + -26665, var4 + 350, class237.field3310 + var3, var3);
         if (arg1 == 26584) {
            int var6;
            int var10000;
            int var10001;
            label87: {
               int var5 = 350 / class408.field5894;
               if (~class234.field3265 < -1) {
                  label88: {
                     var6 = -class408.field5894 + 346 + -4;
                     int var7 = var5 * var6 / (var5 + -1 - -class234.field3265);
                     int var8 = 4;
                     if (~class234.field3265 < -2) {
                        var8 += (class234.field3265 - (class141.field1799 + 1)) * (var6 - var7) / (class234.field3265 + -1);
                     }

                     arg0.method496(class237.field3310 + var3 + -16, var4 - -var8, 12, var7, 3351159 | class715.field10401 << 24, 2);
                     int var9 = class141.field1799;
                     if (!var2) {
                        if (~(class141.field1799 + var5) >= ~var9) {
                           break label88;
                        }

                        var10000 = class234.field3265;
                        var10001 = var9;
                        if (var2) {
                           break label87;
                        }

                        if (var10000 <= var9) {
                           break label88;
                        }
                     }

                     do {
                        String[] var10 = class527.method3811(-29619, class65.field793[var9], '\b');
                        int var11 = (class237.field3310 + -8 + -16) / var10.length;
                        int var12 = 0;
                        if (var2 || ~var10.length < ~var12) {
                           do {
                              int var13 = var11 * var12 + 8;
                              arg0.method592(var3 + var13, var4, var3 + var11 + var13 + -8, var4 - -350);
                              class427.field6124.method620(0, var3 + var13, -16777216, var4 - 2 - (-class141.field1799 + var9) * class408.field5894 + -class117.field1459 + -class347.field4690.field2956 + 350, -1, class237.method1826(-119, var10[var12]));
                              ++var12;
                           } while(~var10.length < ~var12);
                        }

                        ++var9;
                        if (~(class141.field1799 + var5) >= ~var9) {
                           break;
                        }

                        var10000 = class234.field3265;
                        var10001 = var9;
                        if (var2) {
                           break label87;
                        }
                     } while(var10000 > var9);
                  }
               }

               class215.field3075.method624(class237.field3310 + var3 + -25, var4 - 20 + 350, -16777216, 0, field4376[6], -1);
               arg0.method592(var3, var4, var3 - -class237.field3310, var4 + 350);
               arg0.method603(class237.field3310, -1, arg1 + -26583, var3, -class117.field1459 + 350 + var4);
               class455.field6465.method620(0, var3 + 10, -16777216, var4 + -1 - -350 + -class467.field6723.field2956, -1, field4376[7] + class237.method1826(-115, class96.field1242));
               if (!class80.field1035) {
                  return;
               }

               var6 = -1;
               var10000 = ~(class96.field1234 % 30);
               var10001 = -16;
            }

            if (var10000 < var10001) {
               var6 = 16777215;
            }

            arg0.method585(-class467.field6723.field2956 + 350 + -11 + var4, class467.field6723.method1635(field4376[7] + class237.method1826(-86, class96.field1242).substring(0, class168.field2346), (byte)-81) + var3 + 10, true, 12, var6);
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field4376[5] + (arg0 != null ? field4376[4] : field4376[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2364(int arg0) {
      try {
         if (arg0 != -101) {
            field4375 = null;
         }

         ++field4369;
         class493.field7038.method715(true);
         class409.field5909.method715(true);
         class198.field2811.method715(true);
         class155.field2212.method715(true);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4376[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2365(int arg0) {
      try {
         field4374 = null;
         field4375 = null;
         if (arg0 != -30809) {
            field4375 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4376[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(BLnb;)V"
   )
   public final void method2366(byte arg0, class319 arg1) {
      try {
         ++field4370;
         if (arg0 != -96) {
            method2368((byte)41);
         }

         this.field4371 = arg1.field4371;
         this.field4367 = arg1.field4367;
         this.field4373 = arg1.field4373;
         this.field4366 = arg1.field4366;
         this.field4372 = arg1.field4372;
         this.field4362 = arg1.field4362;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4376[9] + arg0 + ',' + (arg1 != null ? field4376[4] : field4376[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(B)Lij;"
   )
   public static final class447 method2367(byte arg0) {
      try {
         if (arg0 != 50) {
            field4375 = null;
         }

         ++field4363;
         class447 var1 = class75.method685(-70);
         var1.field6358 = null;
         var1.field6354 = 0;
         var1.field6359 = new class534(5000);
         return var1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4376[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "(B)I"
   )
   public static final int method2368(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field4365;
         if (~class128.field1641 == -1) {
            class433.field6184.method3201((byte)-84, new class527(field4376[18]));
            if (~class433.field6184.method3197(1).method2561(-29119) != -101) {
               return 1;
            }

            if (!((class527)class433.field6184.method3197(1)).method3813(-126)) {
               class220.field3148.method2899((byte)80);
            }

            class128.field1641 = 1;
         }

         if (~class128.field1641 == -2) {
            class615.field9032 = class433.method3200((byte)-99);
            class433.field6183.method3201((byte)-84, new class351(class223.field3171));
            class433.field6185.method3201((byte)-84, new class527(field4376[17]));
            class433.field6186.method3201((byte)-84, new class527(field4376[11]));
            class433.field6187.method3201((byte)-84, new class527(field4376[12]));
            class433.field6188.method3201((byte)-84, new class527(field4376[14]));
            class433.field6189.method3201((byte)-84, new class527(field4376[19]));
            class433.field6190.method3201((byte)-84, new class527(field4376[13]));
            class433.field6191.method3201((byte)-84, new class351(class387.field5601));
            class433.field6192.method3201((byte)-84, new class351(class252.field3436));
            class433.field6193.method3201((byte)-84, new class351(class418.field6003));
            class433.field6194.method3201((byte)-84, new class351(class617.field9088));
            class433.field6195.method3201((byte)-84, new class351(class249.field3427));
            class433.field6196.method3201((byte)-84, new class351(class666.field9672));
            class433.field6197.method3201((byte)-84, new class351(class612.field8985));
            class433.field6198.method3201((byte)-84, new class351(class80.field1051));
            class433.field6199.method3201((byte)-84, new class351(class170.field2370));
            class433.field6200.method3201((byte)-84, new class351(class778.field11397));
            class433.field6201.method3201((byte)-84, new class351(class86.field1135));
            class433.field6202.method3201((byte)-84, new class351(class446.field6347));
            class433.field6203.method3201((byte)-84, new class351(class259.field3556));
            class433.field6204.method3201((byte)-84, new class351(class635.field9288));
            class433.field6205.method3201((byte)-84, new class777(class342.field4638, field4376[10]));
            class433.field6206.method3201((byte)-84, new class351(class49.field653));
            class433.field6207.method3201((byte)-84, new class351(class595.field8745));
            class433.field6208.method3201((byte)-84, new class351(class487.field6954));
            class433.field6209.method3201((byte)-84, new class547(class77.field960, field4376[16]));
            int var2 = 0;
            if (var1) {
               if (class615.field9032[var2].method3197(arg0 + -12) == null) {
                  throw new RuntimeException();
               }

               ++var2;
            }

            while(true) {
               while(~var2 > ~class615.field9032.length) {
                  if (class615.field9032[var2].method3197(arg0 + -12) == null) {
                     throw new RuntimeException();
                  }

                  ++var2;
               }

               int var3 = 0;
               class433[] var4 = class615.field9032;
               int var5 = 0;
               if (!var1) {
                  if (var1 || ~var4.length < ~var5) {
                     do {
                        class433 var6 = var4[var5];
                        int var7 = var6.method3195(arg0 + 45);
                        int var8 = var6.method3197(arg0 + -12).method2561(-29119);
                        var3 += var7 * var8 / 100;
                        ++var5;
                     } while(~var4.length < ~var5);
                  }

                  class794.field11620 = var3;
                  class128.field1641 = 2;
                  break;
               }

               ++var2;
            }
         }

         if (class615.field9032 == null) {
            return 100;
         } else {
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            if (arg0 != 13) {
               method2365(70);
            }

            class433[] var12 = class615.field9032;
            int var13 = 0;
            class433 var14;
            int var15;
            int var16;
            if (var1) {
               var14 = var12[var13];
               var15 = var14.method3195(arg0 + 73);
               var16 = var14.method3197(arg0 + -12).method2561(arg0 + -29132);
               var9 += var15;
               var10 += var15 * var16 / 100;
               if (~var16 > -101) {
                  var11 = false;
               }

               ++var13;
            }

            while(var13 < var12.length) {
               var14 = var12[var13];
               var15 = var14.method3195(arg0 + 73);
               var16 = var14.method3197(arg0 + -12).method2561(arg0 + -29132);
               var9 += var15;
               var10 += var15 * var16 / 100;
               if (~var16 > -101) {
                  var11 = false;
               }

               ++var13;
            }

            if (var11) {
               if (!((class527)class433.field6187.method3197(1)).method3813(-126)) {
                  class220.field3148.method2898((byte)-38);
               }

               if (!((class527)class433.field6190.method3197(1)).method3813(-13)) {
                  class257.field3487 = class220.field3148.method2892((byte)8);
               }

               class615.field9032 = null;
            }

            int var17 = var9 - class794.field11620;
            int var18 = var10 - class794.field11620;
            int var19 = var17 > 0 ? var18 * 100 / var17 : 100;
            if (!var11 && var19 > 99) {
               var19 = 99;
            }

            return var19;
         }
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field4376[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class319(int arg0) {
      try {
         this.field4362 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4376[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field4362 = arg0;
         this.field4373 = arg3;
         this.field4366 = arg5;
         this.field4371 = arg1;
         this.field4367 = arg4;
         this.field4372 = arg2;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field4376[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2369(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2370(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
