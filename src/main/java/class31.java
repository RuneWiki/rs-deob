import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class31 extends class673 {
   @OriginalMember(
      owner = "client!nia",
      name = "r",
      descriptor = "I"
   )
   private int field459;
   @OriginalMember(
      owner = "client!nia",
      name = "s",
      descriptor = "Z"
   )
   private boolean field443;
   @OriginalMember(
      owner = "client!nia",
      name = "H",
      descriptor = "I"
   )
   private int field453;
   @OriginalMember(
      owner = "client!nia",
      name = "l",
      descriptor = "I"
   )
   private int field457;
   @OriginalMember(
      owner = "client!nia",
      name = "B",
      descriptor = "I"
   )
   public int field439;
   @OriginalMember(
      owner = "client!nia",
      name = "t",
      descriptor = "I"
   )
   private int field448;
   @OriginalMember(
      owner = "client!nia",
      name = "A",
      descriptor = "I"
   )
   public int field460;
   @OriginalMember(
      owner = "client!nia",
      name = "x",
      descriptor = "I"
   )
   private int field450;
   @OriginalMember(
      owner = "client!nia",
      name = "E",
      descriptor = "Z"
   )
   private boolean field440;
   @OriginalMember(
      owner = "client!nia",
      name = "C",
      descriptor = "I"
   )
   private int field451;
   @OriginalMember(
      owner = "client!nia",
      name = "n",
      descriptor = "I"
   )
   private int field438;
   @OriginalMember(
      owner = "client!nia",
      name = "L",
      descriptor = "I"
   )
   private int field447;
   @OriginalMember(
      owner = "client!nia",
      name = "D",
      descriptor = "I"
   )
   public int field461;
   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "I"
   )
   private int field452;
   @OriginalMember(
      owner = "client!nia",
      name = "o",
      descriptor = "I"
   )
   private int field464;
   @OriginalMember(
      owner = "client!nia",
      name = "I",
      descriptor = "Ljava/lang/String;"
   )
   private String field441;
   @OriginalMember(
      owner = "client!nia",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   private String field446;
   @OriginalMember(
      owner = "client!nia",
      name = "G",
      descriptor = "Ljava/lang/String;"
   )
   private String field458;
   @OriginalMember(
      owner = "client!nia",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   private String field449;
   @OriginalMember(
      owner = "client!nia",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field465 = new String[]{method254(method253(" D\u0018")), method254(method253("!D\u0018")), method254(method253("t\u0007L\u000bx")), method254(method253("x\u0003KO#f\u0005NI")), method254(method253("x\u000bK")), method254(method253("{\u0003I\u0013p|\u0004AIr=")), method254(method253("#D\u0019")), method254(method253("$Z\u0006\b")), method254(method253("nD\u0006\u00131")), method254(method253("#D\u0018")), method254(method253("$Z\u0006\u000b")), method254(method253("y\u0003FH4")), method254(method253("!D\u0011")), method254(method253("t\u001aXQ)")), method254(method253(" D\u0019")), method254(method253("mR\u001ebz!")), method254(method253("!D\u0019")), method254(method253("b\u0003F")), method254(method253("f\u001fF")), method254(method253("{\u001fDQ")), method254(method253("$Z\u0006\t")), method254(method253("{\u0003I\u0013\b=")), method254(method253("{\u0003I\u0013\u000f=")), method254(method253("{\u0003I\u0013\r=")), method254(method253("{\u0003I\u0013\n=")), method254(method253("{\u0003I\u0013\t="))};
   @OriginalMember(
      owner = "client!nia",
      name = "u",
      descriptor = "I"
   )
   public static int field442;
   @OriginalMember(
      owner = "client!nia",
      name = "K",
      descriptor = "I"
   )
   public static int field445;
   @OriginalMember(
      owner = "client!nia",
      name = "w",
      descriptor = "I"
   )
   public static int field454;
   @OriginalMember(
      owner = "client!nia",
      name = "F",
      descriptor = "I"
   )
   public static int field456;
   @OriginalMember(
      owner = "client!nia",
      name = "J",
      descriptor = "I"
   )
   private int field462;
   @OriginalMember(
      owner = "client!nia",
      name = "v",
      descriptor = "I"
   )
   private int field463;
   @OriginalMember(
      owner = "client!nia",
      name = "q",
      descriptor = "Ltca;"
   )
   public static class613 field444;
   @OriginalMember(
      owner = "client!nia",
      name = "y",
      descriptor = "Lfo;"
   )
   public static class682 field455;

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method247(boolean arg0) {
      try {
         field444 = null;
         if (!arg0) {
            method247(true);
         }

         field455 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field465[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method248(byte arg0) {
      try {
         ++field454;
         byte var2 = 23;
         int var3 = var2 + class392.method3097(this.field449, false);
         if (arg0 <= 23) {
            return 127;
         } else {
            int var4 = var3 + class392.method3097(this.field446, false);
            int var5 = var4 + class392.method3097(this.field458, false);
            return var5 + class392.method3097(this.field441, false);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field465[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(BLgea;)V"
   )
   public final void method249(byte arg0, class66 arg1) {
      try {
         arg1.method593(5, arg0 + 867770784);
         ++field442;
         arg1.method593(this.field459, 867770704);
         arg1.method593(!this.field443 ? 0 : 1, 867770704);
         arg1.method593(this.field453, 867770704);
         arg1.method593(this.field457, 867770704);
         arg1.method593(this.field439, 867770704);
         arg1.method593(this.field448, arg0 + 867770784);
         arg1.method593(this.field460, 867770704);
         arg1.method593(this.field440 ? 1 : 0, 867770704);
         arg1.method611(this.field451, -1344798296);
         arg1.method593(this.field450, 867770704);
         arg1.method637((byte)103, this.field461);
         arg1.method611(this.field447, arg0 ^ 1344798232);
         arg1.method593(this.field464, 867770704);
         if (arg0 != -80) {
            this.field447 = -50;
         }

         arg1.method593(this.field452, arg0 + 867770784);
         arg1.method593(this.field438, 867770704);
         arg1.method597((byte)-105, this.field449);
         arg1.method597((byte)-105, this.field446);
         arg1.method597((byte)-105, this.field458);
         arg1.method597((byte)-105, this.field441);
         arg1.method593(this.field463, 867770704);
         arg1.method611(this.field462, -1344798296);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field465[24] + arg0 + ',' + (arg1 != null ? field465[8] : field465[19]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(Lco;)V"
   )
   public static final void method250(class664 arg0) {
      if (class77.field1023 < 65535) {
         class243 var1 = arg0.field9839;
         class375.field5241[class77.field1023] = arg0;
         class436.field5952[class77.field1023] = false;
         ++class77.field1023;
         int var2 = arg0.field9836;
         if (arg0.field9842) {
            var2 = 0;
         }

         int var3 = arg0.field9836;
         if (arg0.field9838) {
            var3 = class174.field2251 - 1;
         }

         for(int var4 = var2; var4 <= var3; ++var4) {
            int var5 = 0;
            int var6 = var1.method1928(49) - var1.method1933(false) + class486.field6788 >> class783.field11447;
            if (var6 < 0) {
               var5 -= var6;
               var6 = 0;
            }

            int var7 = var1.method1928(106) + var1.method1933(false) - class486.field6788 >> class783.field11447;
            if (var7 >= class181.field2297) {
               var7 = class181.field2297 - 1;
            }

            for(int var8 = var6; var8 <= var7; ++var8) {
               short var9 = arg0.field9849[var5++];
               int var10 = (var1.method1927((byte)-8) - var1.method1933(false) + class486.field6788 >> class783.field11447) + (var9 >>> 8);
               int var11 = (var9 & 255) + var10 - 1;
               if (var10 < 0) {
                  var10 = 0;
               }

               if (var11 >= class137.field1743) {
                  var11 = class137.field1743 - 1;
               }

               for(int var12 = var10; var12 <= var11; ++var12) {
                  long var13 = class314.field4356[var4][var12][var8];
                  if ((var13 & 65535L) == 0L) {
                     class314.field4356[var4][var12][var8] = var13 | (long)class77.field1023;
                  } else if ((var13 & 4294901760L) == 0L) {
                     class314.field4356[var4][var12][var8] = var13 | (long)class77.field1023 << 16;
                  } else if ((var13 & 281470681743360L) == 0L) {
                     class314.field4356[var4][var12][var8] = var13 | (long)class77.field1023 << 32;
                  } else if ((var13 & -281474976710656L) == 0L) {
                     class314.field4356[var4][var12][var8] = var13 | (long)class77.field1023 << 48;
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method251(byte arg0) {
      try {
         ++field456;
         if (this.field449.length() > 40) {
            this.field449 = this.field449.substring(0, 40);
         }

         if (~this.field446.length() < -41) {
            this.field446 = this.field446.substring(0, 40);
         }

         if (this.field458.length() > 10) {
            this.field458 = this.field458.substring(0, 10);
         }

         if (~this.field441.length() < -11) {
            this.field441 = this.field441.substring(0, 10);
         }

         if (arg0 >= -101) {
            this.field439 = 92;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field465[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(Lgea;II)V"
   )
   public static final void method252(class66 arg0, int arg1, int arg2) {
      try {
         if (arg1 == 24) {
            if (class532.field7811 != null) {
               try {
                  class532.field7811.method4049(0L, arg1 ^ -25);
                  class532.field7811.method4045(arg2, -1, arg0.field859, 24);
               } catch (Exception var4) {
               }
            }

            ++field445;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field465[21] + (arg0 != null ? field465[8] : field465[19]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "<init>",
      descriptor = "()V"
   )
   public class31() {
   }

   @OriginalMember(
      owner = "client!nia",
      name = "<init>",
      descriptor = "(ZLgj;)V"
   )
   public class31(boolean arg0, class736 arg1) {
      boolean var3 = client.field1481;
      super();

      try {
         if (arg0) {
            label303: {
               if (!class736.field10758.startsWith(field465[17])) {
                  if (!class736.field10758.startsWith(field465[4])) {
                     if (!class736.field10758.startsWith(field465[11])) {
                        this.field459 = 4;
                        if (!var3) {
                           break label303;
                        }
                     }

                     this.field459 = 3;
                     if (!var3) {
                        break label303;
                     }
                  }

                  this.field459 = 2;
                  if (!var3) {
                     break label303;
                  }
               }

               this.field459 = 1;
            }

            label320: {
               if (class736.field10757.startsWith(field465[2]) || class736.field10757.startsWith(field465[15])) {
                  this.field443 = true;
                  if (!var3) {
                     break label320;
                  }
               }

               this.field443 = false;
            }

            label311: {
               if (this.field459 != 1) {
                  if (this.field459 != 2) {
                     break label311;
                  }

                  if (~class736.field10756.indexOf(field465[20]) == 0) {
                     if (~class736.field10756.indexOf(field465[7]) == 0) {
                        if (~class736.field10756.indexOf(field465[10]) == 0) {
                           break label311;
                        }

                        this.field453 = 22;
                        if (!var3) {
                           break label311;
                        }
                     }

                     this.field453 = 21;
                     if (!var3) {
                        break label311;
                     }
                  }

                  this.field453 = 20;
                  if (!var3) {
                     break label311;
                  }
               }

               if (~class736.field10756.indexOf(field465[1]) == 0) {
                  if (class736.field10756.indexOf(field465[16]) == -1) {
                     if (~class736.field10756.indexOf(field465[12]) != 0) {
                        this.field453 = 3;
                        if (!var3) {
                           break label311;
                        }
                     }

                     if (class736.field10756.indexOf(field465[0]) != -1) {
                        this.field453 = 4;
                        if (!var3) {
                           break label311;
                        }
                     }

                     if (~class736.field10756.indexOf(field465[14]) != 0) {
                        this.field453 = 5;
                        if (!var3) {
                           break label311;
                        }
                     }

                     if (class736.field10756.indexOf(field465[9]) == -1) {
                        if (class736.field10756.indexOf(field465[6]) == -1) {
                           break label311;
                        }

                        this.field453 = 7;
                        if (!var3) {
                           break label311;
                        }
                     }

                     this.field453 = 6;
                     if (!var3) {
                        break label311;
                     }
                  }

                  this.field453 = 2;
                  if (!var3) {
                     break label311;
                  }
               }

               this.field453 = 1;
            }

            label249: {
               if (~class736.field10732.toLowerCase().indexOf(field465[18]) == 0) {
                  if (class736.field10732.toLowerCase().indexOf(field465[3]) == -1) {
                     if (class736.field10732.toLowerCase().indexOf(field465[13]) == -1) {
                        this.field457 = 4;
                        if (!var3) {
                           break label249;
                        }
                     }

                     this.field457 = 3;
                     if (!var3) {
                        break label249;
                     }
                  }

                  this.field457 = 2;
                  if (!var3) {
                     break label249;
                  }
               }

               this.field457 = 1;
            }

            int var4 = 2;
            int var5 = 0;

            label237: {
               label236: {
                  try {
                     if (var3 || var4 < class736.field10751.length()) {
                        do {
                           char var6 = class736.field10751.charAt(var4);
                           if (~var6 > -49 || var6 > '9' && !var3) {
                              break label236;
                           }

                           ++var4;
                           var5 = var5 * 10 + (var6 - '0');
                        } while(var4 < class736.field10751.length());
                     }
                  } catch (Exception var14) {
                     break label236;
                  }

                  if (var3) {
                     break label237;
                  }
               }

               this.field439 = var5;
               var5 = 0;
               var4 = class736.field10751.indexOf(46, 2) + 1;
            }

            label216: {
               label215: {
                  try {
                     if (var3 || var4 < class736.field10751.length()) {
                        do {
                           char var7 = class736.field10751.charAt(var4);
                           if (~var7 > -49 || var7 > '9' && !var3) {
                              break label215;
                           }

                           var5 = var5 * 10 + var7 + -48;
                           ++var4;
                        } while(var4 < class736.field10751.length());
                     }
                  } catch (Exception var13) {
                     break label215;
                  }

                  if (var3) {
                     break label216;
                  }
               }

               this.field448 = var5;
               var5 = 0;
               var4 = class736.field10751.indexOf(95, 4) - -1;
            }

            label195: {
               label194: {
                  try {
                     if (var3 || ~var4 > ~class736.field10751.length()) {
                        do {
                           char var8 = class736.field10751.charAt(var4);
                           if (~var8 > -49 || var8 > '9' && !var3) {
                              break label194;
                           }

                           var5 = var5 * 10 - -var8 - 48;
                           ++var4;
                        } while(~var4 > ~class736.field10751.length());
                     }
                  } catch (Exception var12) {
                     break label194;
                  }

                  if (var3) {
                     break label195;
                  }
               }

               this.field460 = var5;
            }

            label174: {
               if (this.field439 > 3) {
                  this.field450 = class100.field1321;
                  if (!var3) {
                     break label174;
                  }
               }

               this.field450 = 0;
            }

            label169: {
               if (arg1.field10745) {
                  this.field440 = false;
                  if (!var3) {
                     break label169;
                  }
               }

               this.field440 = true;
            }

            this.field451 = class578.field8565;

            try {
               int[] var9 = HardwareInfo.getCPUInfo();
               if (var9 != null && ~var9.length == -8) {
                  this.field438 = var9[5];
                  this.field447 = var9[2];
                  this.field461 = var9[6];
                  this.field452 = var9[4];
                  this.field464 = var9[3];
               }
            } catch (Throwable var11) {
               this.field461 = 0;
            }
         }

         if (this.field441 == null) {
            this.field441 = "";
         }

         if (this.field446 == null) {
            this.field446 = "";
         }

         if (this.field458 == null) {
            this.field458 = "";
         }

         if (this.field449 == null) {
            this.field449 = "";
         }

         this.method251((byte)-102);
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field465[5] + arg0 + ',' + (arg1 != null ? field465[8] : field465[19]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method253(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method254(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
