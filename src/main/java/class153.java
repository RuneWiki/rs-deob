import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class153 {
   @OriginalMember(
      owner = "client!fea",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   private String field2168 = field2171[3];
   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2171 = new String[]{method1291(method1290("\u0004L}\u0000nJ")), method1291(method1290("\u0004L}\u0000gJ")), method1291(method1290("\u0004L}\u0000lJ")), method1291(method1290("\f\\pB")), method1291(method1290("\u0019\u00072\u0000T")), method1291(method1290("\u0004L}\u0000dJ")), method1291(method1290("\u0004L}\u0000`J")), method1291(method1290("\u0004L}\u0000hJ")), method1291(method1290("\u0004L}\u0000eJ")), method1291(method1290("\u0004L}\u0000fJ")), method1291(method1290("\u0004L}\u0000cJ")), method1291(method1290("\u0004L}\u0000oJ")), method1291(method1290("\u0004L}\u0000aJ")), method1291(method1290("\u0004L}\u0000bJ")), method1291(method1290("\u0004L}\u0000mJ")), method1291(method1290("\u0004L}\u0000kJ")), method1291(method1290("\u0004L}\u0000jJ"))};
   @OriginalMember(
      owner = "client!fea",
      name = "d",
      descriptor = "Lek;"
   )
   public static class536 field2152 = new class536(53, -1);
   @OriginalMember(
      owner = "client!fea",
      name = "e",
      descriptor = "C"
   )
   public char field2156;
   @OriginalMember(
      owner = "client!fea",
      name = "k",
      descriptor = "C"
   )
   public char field2159;
   @OriginalMember(
      owner = "client!fea",
      name = "o",
      descriptor = "I"
   )
   public static int field2148;
   @OriginalMember(
      owner = "client!fea",
      name = "b",
      descriptor = "I"
   )
   public static int field2149;
   @OriginalMember(
      owner = "client!fea",
      name = "q",
      descriptor = "I"
   )
   public static int field2150;
   @OriginalMember(
      owner = "client!fea",
      name = "l",
      descriptor = "I"
   )
   public static int field2151;
   @OriginalMember(
      owner = "client!fea",
      name = "r",
      descriptor = "I"
   )
   public static int field2153;
   @OriginalMember(
      owner = "client!fea",
      name = "p",
      descriptor = "I"
   )
   public static int field2154;
   @OriginalMember(
      owner = "client!fea",
      name = "j",
      descriptor = "I"
   )
   private int field2155;
   @OriginalMember(
      owner = "client!fea",
      name = "i",
      descriptor = "I"
   )
   private int field2158;
   @OriginalMember(
      owner = "client!fea",
      name = "v",
      descriptor = "I"
   )
   public static int field2160;
   @OriginalMember(
      owner = "client!fea",
      name = "f",
      descriptor = "I"
   )
   public static int field2161;
   @OriginalMember(
      owner = "client!fea",
      name = "u",
      descriptor = "I"
   )
   public static int field2162;
   @OriginalMember(
      owner = "client!fea",
      name = "w",
      descriptor = "I"
   )
   public static int field2164;
   @OriginalMember(
      owner = "client!fea",
      name = "t",
      descriptor = "I"
   )
   public static int field2165;
   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "I"
   )
   public static int field2166;
   @OriginalMember(
      owner = "client!fea",
      name = "g",
      descriptor = "I"
   )
   public static int field2167;
   @OriginalMember(
      owner = "client!fea",
      name = "s",
      descriptor = "I"
   )
   public static int field2170;
   @OriginalMember(
      owner = "client!fea",
      name = "h",
      descriptor = "Lwv;"
   )
   private class37 field2157;
   @OriginalMember(
      owner = "client!fea",
      name = "m",
      descriptor = "Llc;"
   )
   public static class676 field2163;
   @OriginalMember(
      owner = "client!fea",
      name = "c",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field2169;

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Z"
   )
   public final boolean method1275(String arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field2151;
         if (this.field2169 == null) {
            return false;
         } else {
            if (this.field2157 == null) {
               this.method1278((byte)88);
            }

            class704 var4 = (class704)this.field2157.method329((byte)-21, class312.method2304((byte)-86, arg0));
            int var5 = -14 / ((arg1 - 61) / 55);
            if (var3) {
               if (var4.field10279.equals(arg0)) {
                  return true;
               }

               var4 = (class704)this.field2157.method333(false);
            }

            while(true) {
               boolean var10000;
               if (var4 == null) {
                  var10000 = false;
                  if (!var3) {
                     return false;
                  }
               } else {
                  var10000 = var4.field10279.equals(arg0);
               }

               if (var10000) {
                  return true;
               }

               var4 = (class704)this.field2157.method333(false);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2171[2] + (arg0 != null ? field2171[4] : field2171[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method1276(int arg0, int arg1) {
      try {
         ++field2161;
         if (this.field2169 == null) {
            return this.field2155;
         } else {
            int var3 = -86 % ((73 - arg0) / 50);
            if (this.field2169 instanceof class37) {
               class713 var4 = (class713)((class37)this.field2169).method329((byte)-72, (long)arg1);
               return var4 != null ? var4.field10388 : this.field2155;
            } else {
               Integer[] var5 = (Integer[])this.field2169;
               if (~arg1 <= -1 && ~var5.length < ~arg1) {
                  Integer var6 = var5[arg1];
                  return var6 != null ? var6 : this.field2155;
               } else {
                  return this.field2155;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2171[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method1277(boolean arg0) {
      try {
         if (!arg0) {
            ++field2160;
            int var1 = 0;
            if (class300.field4107 != null) {
               var1 = class300.field4107.field6444.method1135(-115);
            }

            if (var1 != 2) {
               if (var1 != 1) {
                  class692.field10185 = class689.field10151;
                  class237.field3310 = class79.field982;
                  class278.field3787 = 0;
                  class150.field2097 = 0;
               } else {
                  int var2 = class79.field982 > 1024 ? 1024 : class79.field982;
                  int var3 = class689.field10151 > 768 ? 768 : class689.field10151;
                  class150.field2097 = (-var2 + class79.field982) / 2;
                  class237.field3310 = var2;
                  class692.field10185 = var3;
                  class278.field3787 = 0;
               }
            } else {
               int var4 = ~class79.field982 >= -801 ? class79.field982 : 800;
               int var5 = class689.field10151 <= 600 ? class689.field10151 : 600;
               class237.field3310 = var4;
               class150.field2097 = (class79.field982 - var4) / 2;
               class278.field3787 = 0;
               class692.field10185 = var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2171[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method1278(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field2150;
         if (arg0 >= 82) {
            if (this.field2169 instanceof class37) {
               class37 var6 = (class37)this.field2169;
               this.field2157 = new class37(var6.method332(0));
               class181 var7 = (class181)var6.method328(1745388291);
               if (var2 || var7 != null) {
                  do {
                     class704 var8 = new class704(var7.field2546, (int)var7.field6137);
                     this.field2157.method336(-1, class312.method2304((byte)-86, var7.field2546), var8);
                     var7 = (class181)var6.method325(-4629);
                  } while(var7 != null);

               }
            } else {
               String[] var3 = (String[])this.field2169;
               this.field2157 = new class37(class350.method2552(false, var3.length));
               int var4 = 0;
               class704 var5;
               if (var2) {
                  if (var3[var4] != null) {
                     var5 = new class704(var3[var4], var4);
                     this.field2157.method336(-1, class312.method2304((byte)-86, var3[var4]), var5);
                  }

                  ++var4;
               }

               while(true) {
                  while(~var3.length < ~var4) {
                     if (var3[var4] != null) {
                        var5 = new class704(var3[var4], var4);
                        this.field2157.method336(-1, class312.method2304((byte)-86, var3[var4]), var5);
                     }

                     ++var4;
                  }

                  if (!var2) {
                     return;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field2171[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(Lwf;I)Lf;"
   )
   public static final class790 method1279(class147 arg0, int arg1) {
      try {
         ++field2166;
         String var2 = arg0.method1204(2119550368);
         class169 var3 = class515.method3747(-30483)[arg0.method1143(-15465)];
         class175 var4 = class784.method5643(-12551)[arg0.method1143(-15465)];
         int var5 = arg0.method1187((byte)-66);
         int var6 = arg0.method1187((byte)-83);
         int var7 = arg0.method1143(-15465);
         int var8 = arg0.method1143(-15465);
         int var9 = arg0.method1143(-15465);
         int var10 = arg0.method1211(-26166);
         int var11 = arg0.method1211(-26166);
         if (arg1 <= 111) {
            method1277(true);
         }

         int var12 = arg0.method1164(19693);
         int var13 = arg0.method1164(19693);
         int var14 = arg0.method1164(19693);
         return new class790(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field2171[16] + (arg0 != null ? field2171[4] : field2171[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method1280(boolean arg0) {
      try {
         ++field2164;
         return !arg0 ? -58 : this.field2158;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2171[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(IIIIIZ)V"
   )
   public static final void method1281(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var6 = client.field4360;

      try {
         ++field2167;
         if (class663.field9659 == null) {
            class383.field5543.method533(-16777216, arg1, arg4, arg0, (byte)124, arg2);
         } else if (~class564.field8045.field10694 <= -1 && ~(class644.field9403 * 512) < ~class564.field8045.field10694 && ~class564.field8045.field10693 <= -1 && ~class564.field8045.field10693 > ~(class337.field4594 * 512)) {
            ++class154.field2197;
            if (class564.field8045 != null && class564.field8045.field10694 + -((class564.field8045.method972(-1) - 1) * 256) >> 9 == class755.field11185 && ~(class564.field8045.field10693 - class564.field8045.method972(-1) * 256 + 256 >> 9) == ~class140.field1791) {
               class140.field1791 = -1;
               class755.field11185 = -1;
               class561.method4013(arg3 + -14953);
            }

            class56.method435((byte)-89);
            if (!arg5) {
               class72.method662((byte)116);
            }

            int var22;
            int var23;
            int var24;
            int var25;
            label266: {
               class79.method712(-104);
               class437.method3223(true, arg0, arg1, arg4, arg2, 95);
               var23 = class101.field1297;
               var24 = class571.field8123;
               class298.field4088 = class298.field4090;
               var25 = class338.field4603;
               var22 = class711.field10373;
               if (~class380.field5481 == -2) {
                  int var7 = (int)class273.field3753;
                  if (class532.field7591 >> 8 > var7) {
                     var7 = class532.field7591 >> 8;
                  }

                  if (class491.field7034[4] && var7 < class135.field1725[4] + 128) {
                     var7 = class135.field1725[4] + 128;
                  }

                  int var8 = (int)class117.field1467 + class681.field10030 & 16383;
                  class472.method3420(var8, class102.method851(class561.field8019, (byte)127, class564.field8045.field10694, class564.field8045.field10693) + -200, class310.field4257, (byte)-98, var7, var24, (var7 >> 3) * 3 + 600 << 2, class725.field10585);
                  if (!var6) {
                     break label266;
                  }
               }

               if (~class380.field5481 == -5) {
                  int var9 = (int)class273.field3753;
                  if (~(class532.field7591 >> 8) < ~var9) {
                     var9 = class532.field7591 >> 8;
                  }

                  if (class491.field7034[4] && var9 < class135.field1725[4] + 128) {
                     var9 = class135.field1725[4] + 128;
                  }

                  int var10 = (int)class117.field1467 & 16383;
                  class472.method3420(var10, class102.method851(class561.field8019, (byte)127, class760.field11239, class157.field2236) - 200, class310.field4257, (byte)-61, var9, var24, (var9 >> 3) * 3 + 600 << 2, class725.field10585);
                  if (!var6) {
                     break label266;
                  }
               }

               if (~class380.field5481 == -6) {
                  class641.method4636(1, var24);
               }
            }

            int var11 = class224.field3188;
            int var12 = class421.field6021;
            int var13 = class782.field11465;
            int var14 = class207.field2966;
            int var15 = class10.field96;
            int var16 = 0;
            int var17;
            if (var6) {
               if (class491.field7034[var16]) {
                  var17 = (int)((double)(-class690.field10162[var16]) + Math.random() * (double)(class690.field10162[var16] * 2 + 1) + Math.sin((double)class179.field2469[var16] / 100.0D * (double)class733.field10718[var16]) * (double)class135.field1725[var16]);
                  if (~var16 == -2) {
                     class421.field6021 += var17 << 2;
                  }

                  if (var16 == 2) {
                     class782.field11465 += var17 << 2;
                  }

                  if (~var16 == -5) {
                     class207.field2966 += var17;
                     if (class207.field2966 >= 1024) {
                        if (class207.field2966 > 3072) {
                           class207.field2966 = 3072;
                           if (var6) {
                              class207.field2966 = 1024;
                           }
                        }
                     } else {
                        class207.field2966 = 1024;
                     }
                  }

                  if (~var16 == -4) {
                     class10.field96 = class10.field96 - -var17 & 16383;
                  }

                  if (var16 == 0) {
                     class224.field3188 += var17 << 2;
                  }

                  ++var16;
               } else {
                  ++var16;
               }
            }

            while(true) {
               int var10000;
               if (~var16 <= -6) {
                  var10000 = ~class224.field3188;
                  if (!var6) {
                     if (var10000 > arg3) {
                        class224.field3188 = 0;
                     }

                     if (~class782.field11465 > -1) {
                        class782.field11465 = 0;
                     }

                     if (~class224.field3188 < ~((class457.field6539 << 9) - 1)) {
                        class224.field3188 = (class457.field6539 << 9) + -1;
                     }

                     if ((class16.field190 << 9) + -1 < class782.field11465) {
                        class782.field11465 = (class16.field190 << 9) - 1;
                     }

                     label271: {
                        class793.method5716(arg3 + -78);
                        class62.method473((byte)123);
                        class383.field5543.method592(var23, var25, var23 - -var22, var24 + var25);
                        class123.method995(-2, true);
                        if (!class681.field10034) {
                           class383.field5543.method523();
                           int var18 = class342.field4647;
                           if (class566.field8064 == null) {
                              class383.field5543.method495(var18);
                              if (!var6) {
                                 break label271;
                              }
                           }

                           class566.field8064.method3890(class209.field2977 << 3, var18, 111, var24, var22, var23, class10.field96, var25, class383.field5543, class207.field2966);
                           if (!var6) {
                              break label271;
                           }
                        }

                        class575.method4183((byte)-61, class342.field4647);
                        if (~class756.field11206 != ~class298.field4088) {
                           class171.field2384 = true;
                        }

                        class756.field11206 = class298.field4088;
                     }

                     label272: {
                        class581.method4207(50);
                        class89.field1160.method1232(class224.field3188, class421.field6021, class782.field11465, 16383 & -class207.field2966, 16383 & -class10.field96, -class723.field10552 & 16383);
                        class383.field5543.method532(class89.field1160);
                        class383.field5543.method492(var22 / 2 + var23, var25 - -(var24 / 2), class301.field4124 << 1, class301.field4124 << 1);
                        class388.method2950(var24 / 2 + var25, class301.field4124 << 1, class301.field4124 << 1, var22 / 2 + var23, (byte)60);
                        class705.method5133(class782.field11465, 16383 & -class10.field96, class224.field3188, -class207.field2966 & 16383, class421.field6021, 16383 & -class723.field10552, -15160);
                        byte var19 = class300.field4107.field6413.method3360(-91) == 2 ? (byte)class154.field2197 : 1;
                        if (!class681.field10034) {
                           class34.method300(class96.field1234, class224.field3188, class421.field6021, class782.field11465, class706.field10315, class115.field1427, class18.field206, class457.field6526, class441.field6283, class336.field4576, class564.field8045.field10701 - -1, var19, class564.field8045.field10694 >> 9, class564.field8045.field10693 >> 9, class300.field4107.field6411.method3581(100) == 0, true, class183.field2581 ? class298.field4088 : -1, 0, false);
                           if (!var6) {
                              break label272;
                           }
                        }

                        class779.method5611(16383 & -class207.field2966, 0, -class723.field10552 & 16383, -class10.field96 & 16383);
                        class414.method3098(class421.field6021, class300.field4107.field6411.method3581(-119) == 0, class224.field3188, class96.field1234, class564.field8045.field10701 + 1, class782.field11465, class336.field4576, class18.field206, true, class564.field8045.field10694 >> 9, class115.field1427, (byte)-88, class441.field6283, class706.field10315, class564.field8045.field10693 >> 9, class298.field4088, class457.field6526, var19);
                     }

                     class581.method4207(50);
                     if (class622.field9156 == 11) {
                        class586.method4269(-15326, var23, 256, 256, var25, var22, var24);
                        class158.method1321(256, var23, var25, var22, var24, 2, 256);
                        class322.method2387(var24, var23, (byte)-72, 256, var25, 256, var22);
                        class342.method2511(var22, -66, var24, var25, var23);
                     }

                     class524.method3796();
                     class207.field2966 = var14;
                     class782.field11465 = var13;
                     class421.field6021 = var12;
                     class224.field3188 = var11;
                     class10.field96 = var15;
                     if (class738.field10777 && ~class667.field9694.method3022(0) == -1) {
                        class738.field10777 = false;
                     }

                     if (class738.field10777) {
                        class383.field5543.method533(-16777216, var23, var25, var22, (byte)61, var24);
                        class626.method4545(class383.field5543, false, class347.field4690, arg3 ^ -3, class180.field2491.method1437(class608.field8920, 50), class427.field6124);
                     }

                     class123.method995(-2, false);
                     return;
                  }
               } else {
                  var10000 = class491.field7034[var16];
               }

               if (var10000 != 0) {
                  var17 = (int)((double)(-class690.field10162[var16]) + Math.random() * (double)(class690.field10162[var16] * 2 + 1) + Math.sin((double)class179.field2469[var16] / 100.0D * (double)class733.field10718[var16]) * (double)class135.field1725[var16]);
                  if (~var16 == -2) {
                     class421.field6021 += var17 << 2;
                  }

                  if (var16 == 2) {
                     class782.field11465 += var17 << 2;
                  }

                  if (~var16 == -5) {
                     class207.field2966 += var17;
                     if (class207.field2966 >= 1024) {
                        if (class207.field2966 > 3072) {
                           class207.field2966 = 3072;
                           if (var6) {
                              class207.field2966 = 1024;
                           }
                        }
                     } else {
                        class207.field2966 = 1024;
                     }
                  }

                  if (~var16 == -4) {
                     class10.field96 = class10.field96 - -var17 & 16383;
                  }

                  if (var16 == 0) {
                     class224.field3188 += var17 << 2;
                  }

                  ++var16;
               } else {
                  ++var16;
               }
            }
         } else {
            class383.field5543.method533(-16777216, arg1, arg4, arg0, (byte)73, arg2);
         }
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field2171[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method1282(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field2153;
         int var2 = arg0;
         int var3 = 0;
         if (var1 || var3 < class644.field9403) {
            do {
               int var4 = 0;
               if (var1) {
                  if (class135.method1071(var4, true, var3, var2, class663.field9659, (byte)11)) {
                     ++var2;
                  }

                  if (var2 >= 512) {
                     return;
                  }

                  ++var4;
               }

               while(true) {
                  while(var4 < class337.field4594) {
                     if (class135.method1071(var4, true, var3, var2, class663.field9659, (byte)11)) {
                        ++var2;
                     }

                     if (var2 >= 512) {
                        return;
                     }

                     ++var4;
                  }

                  if (!var1) {
                     ++var3;
                     break;
                  }

                  if (var2 >= 512) {
                     return;
                  }

                  ++var4;
               }
            } while(var3 < class644.field9403);

         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2171[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method1283(int arg0) {
      boolean var2 = client.field4360;

      try {
         label69: {
            if (!(this.field2169 instanceof class37)) {
               Integer[] var3 = (Integer[])this.field2169;
               this.field2157 = new class37(class350.method2552(false, var3.length));
               int var4 = 0;
               class713 var5;
               if (var2) {
                  if (var3[var4] != null) {
                     var5 = new class713(var4);
                     this.field2157.method336(-1, (long)var3[var4], var5);
                  }

                  ++var4;
               }

               while(true) {
                  while(~var4 > ~var3.length) {
                     if (var3[var4] != null) {
                        var5 = new class713(var4);
                        this.field2157.method336(-1, (long)var3[var4], var5);
                     }

                     ++var4;
                  }

                  if (!var2) {
                     if (!var2) {
                        break label69;
                     }
                     break;
                  }

                  ++var4;
               }
            }

            class37 var6 = (class37)this.field2169;
            this.field2157 = new class37(var6.method332(arg0 ^ -801));
            class713 var7 = (class713)var6.method328(1745388291);
            if (var2 || var7 != null) {
               do {
                  class713 var8 = new class713((int)var7.field6137);
                  this.field2157.method336(arg0 + 800, (long)var7.field10388, var8);
                  var7 = (class713)var6.method325(-4629);
               } while(var7 != null);
            }
         }

         ++field2162;
         if (arg0 != -801) {
            this.method1288((class147)null, 27, (byte)-100);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field2171[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1284(int arg0) {
      try {
         if (arg0 == -1) {
            field2163 = null;
            field2152 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2171[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(ILwf;)V"
   )
   public final void method1285(int arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         while(true) {
            int var4 = arg1.method1143(-15465);
            if (var4 != 0) {
               this.method1288(arg1, var4, (byte)-86);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field2170;
            break;
         }

         if (arg0 != 0) {
            this.field2159 = (char)65417;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2171[12] + arg0 + ',' + (arg1 != null ? field2171[4] : field2171[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1286(int arg0) {
      try {
         class731.method5321(12, (byte)-109);
         ++field2165;
         if (arg0 != 32056) {
            field2163 = null;
         }

         class211.method1671((byte)-77);
         System.gc();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2171[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public final boolean method1287(int arg0, boolean arg1) {
      try {
         ++field2154;
         if (!arg1) {
            this.field2156 = (char)65486;
         }

         if (this.field2169 == null) {
            return false;
         } else {
            if (this.field2157 == null) {
               this.method1283(-801);
            }

            class713 var3 = (class713)this.field2157.method329((byte)-83, (long)arg0);
            return var3 != null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2171[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(Lwf;IB)V"
   )
   private final void method1288(class147 arg0, int arg1, byte arg2) {
      boolean var4 = client.field4360;

      try {
         ++field2148;
         int var5 = -89 / ((arg2 - -24) / 51);
         if (~arg1 != -2) {
            if (~arg1 == -3) {
               this.field2156 = class312.method2306(true, arg0.method1162(4));
            } else if (arg1 != 3) {
               if (~arg1 == -5) {
                  this.field2155 = arg0.method1164(19693);
               } else if (arg1 != 5 && ~arg1 != -7) {
                  if (arg1 != 7) {
                     if (~arg1 == -9) {
                        int var6 = arg0.method1211(-26166);
                        this.field2158 = arg0.method1211(-26166);
                        Integer[] var7 = new Integer[var6];
                        int var8 = 0;
                        if (!var4 && this.field2158 <= var8) {
                           this.field2169 = var7;
                           return;
                        } else {
                           do {
                              int var9 = arg0.method1211(-26166);
                              var7[var9] = new Integer(arg0.method1164(19693));
                              ++var8;
                           } while(this.field2158 > var8);

                           this.field2169 = var7;
                           return;
                        }
                     }
                  } else {
                     int var10 = arg0.method1211(-26166);
                     this.field2158 = arg0.method1211(-26166);
                     String[] var11 = new String[var10];
                     int var12 = 0;
                     if (var4 || var12 < this.field2158) {
                        do {
                           int var13 = arg0.method1211(-26166);
                           var11[var13] = arg0.method1204(2119550368);
                           ++var12;
                        } while(var12 < this.field2158);
                     }

                     this.field2169 = var11;
                  }

               } else {
                  this.field2158 = arg0.method1211(-26166);
                  class37 var14 = new class37(class350.method2552(false, this.field2158));
                  int var15 = 0;
                  if (!var4 && ~this.field2158 >= ~var15) {
                     this.field2169 = var14;
                  } else {
                     do {
                        int var16 = arg0.method1164(19693);
                        class428 var17;
                        if (arg1 != 5) {
                           var17 = new class713(arg0.method1164(19693));
                           if (var4) {
                              var17 = new class181(arg0.method1204(2119550368));
                           }
                        } else {
                           var17 = new class181(arg0.method1204(2119550368));
                        }

                        var14.method336(-1, (long)var16, var17);
                        ++var15;
                     } while(~this.field2158 < ~var15);

                     this.field2169 = var14;
                  }
               }
            } else {
               this.field2168 = arg0.method1204(2119550368);
            }
         } else {
            this.field2159 = class312.method2306(true, arg0.method1162(4));
         }
      } catch (RuntimeException var19) {
         throw class237.method1823(var19, field2171[14] + (arg0 != null ? field2171[4] : field2171[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(BI)Ljava/lang/String;"
   )
   public final String method1289(byte arg0, int arg1) {
      try {
         ++field2149;
         if (this.field2169 == null) {
            return this.field2168;
         } else {
            if (arg0 != -118) {
               this.method1278((byte)87);
            }

            if (this.field2169 instanceof class37) {
               class181 var3 = (class181)((class37)this.field2169).method329((byte)101, (long)arg1);
               return var3 != null ? var3.field2546 : this.field2168;
            } else {
               String[] var4 = (String[])this.field2169;
               if (~arg1 <= -1 && var4.length > arg1) {
                  String var5 = var4[arg1];
                  return var5 != null ? var5 : this.field2168;
               } else {
                  return this.field2168;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2171[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1290(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1291(char[] arg0) {
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
            var10005 = 41;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
