import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class552 implements Runnable {
   @OriginalMember(
      owner = "client!via",
      name = "r",
      descriptor = "I"
   )
   private int field8257 = 0;
   @OriginalMember(
      owner = "client!via",
      name = "c",
      descriptor = "I"
   )
   private int field8263 = 0;
   @OriginalMember(
      owner = "client!via",
      name = "k",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field8259;
   @OriginalMember(
      owner = "client!via",
      name = "o",
      descriptor = "I"
   )
   private int field8254;
   @OriginalMember(
      owner = "client!via",
      name = "e",
      descriptor = "[B"
   )
   private byte[] field8246;
   @OriginalMember(
      owner = "client!via",
      name = "n",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field8255;
   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8266 = new String[]{method4200(method4199("\t\u0013[\u0005")), method4200(method4199("\u0011\u000fVG(\u000e\b^\u001d*O")), method4200(method4199("\u001cH\u0019Gi")), method4200(method4199("\u0011\u000fVGUO")), method4200(method4199("\u0011\u000fVGf\u0012\b\u001f")), method4200(method4199("\u0011\u000fVGVO")), method4200(method4199("\u0011\u000fVGRO")), method4200(method4199("\u0011\u000fVG^O")), method4200(method4199("\u0011\u000fVGWO")), method4200(method4199("\u0011\u000fVGSO")), method4200(method4199("\u0011\u000fVG]O")), method4200(method4199("\u0011\u000fVGQO")), method4200(method4199("\u0011\u000fVG\\O")), method4200(method4199("\u0011\u000fVGPO"))};
   @OriginalMember(
      owner = "client!via",
      name = "h",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field8262 = new Hashtable();
   @OriginalMember(
      owner = "client!via",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field8264 = false;
   @OriginalMember(
      owner = "client!via",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8265 = "";
   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "I"
   )
   public static int field8247;
   @OriginalMember(
      owner = "client!via",
      name = "t",
      descriptor = "I"
   )
   public static int field8248;
   @OriginalMember(
      owner = "client!via",
      name = "p",
      descriptor = "I"
   )
   public static int field8250;
   @OriginalMember(
      owner = "client!via",
      name = "j",
      descriptor = "I"
   )
   public static int field8251;
   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "I"
   )
   public static int field8252;
   @OriginalMember(
      owner = "client!via",
      name = "f",
      descriptor = "I"
   )
   public static int field8253;
   @OriginalMember(
      owner = "client!via",
      name = "s",
      descriptor = "I"
   )
   public static int field8256;
   @OriginalMember(
      owner = "client!via",
      name = "l",
      descriptor = "I"
   )
   public static int field8258;
   @OriginalMember(
      owner = "client!via",
      name = "i",
      descriptor = "I"
   )
   public static int field8260;
   @OriginalMember(
      owner = "client!via",
      name = "g",
      descriptor = "I"
   )
   public static int field8261;
   @OriginalMember(
      owner = "client!via",
      name = "q",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field8249;

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method4189(int arg0) {
      try {
         if (arg0 != 2) {
            field8265 = null;
         }

         field8262 = null;
         field8265 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8266[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(B)V",
      line = 18
   )
   public final void method4190(byte arg0) {
      try {
         ++field8261;
         this.field8259 = new class363();
         int var2 = -36 / ((37 - arg0) / 62);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8266[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(ILha;I)V",
      line = 28
   )
   public static final void method4191(int arg0, class610 arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         ++field8252;
         if (class439.field6716 && class665.field9966) {
            if (class387.field6084) {
               class224.field3398 = class754.field11176.method4639(-14239);
            }

            class200.field3071 = 0;
            class269.field4362 = 0;
            class467.field7105 = 0;
            int[] var4 = arg1.method669();
            class5.field24 = (int)((float)var4[2] / 3.0F);
            class799.field11632 = (int)((float)var4[3] / 3.0F);
            arg1.method611(class263.field4319);
            if ((int)((float)class263.field4319[0] / 3.0F) != class211.field3196 || ~((int)((float)class263.field4319[1] / 3.0F)) != ~class105.field1456) {
               class105.field1456 = (int)((float)class263.field4319[1] / 3.0F);
               class211.field3196 = (int)((float)class263.field4319[0] / 3.0F);
               class327.field4984 = new int[class211.field3196 * class105.field1456];
               class56.field686 = class211.field3196 >> 1;
               class106.field1480 = class105.field1456 >> 1;
            }

            class109.field1508 = arg1.method605();
            class717.field10736 = 0;
            int var5 = 57 % ((arg0 - -45) / 45);
            int var6 = 0;
            if (var3) {
               class41.method290(class463.field7035[var6], arg1, false, arg2);
               ++var6;
            }

            while(true) {
               while(var6 < class410.field6383) {
                  class41.method290(class463.field7035[var6], arg1, false, arg2);
                  ++var6;
               }

               int var7 = 0;
               if (!var3) {
                  if (var3) {
                     class41.method290(class681.field10157[var7], arg1, false, arg2);
                     ++var7;
                  }

                  while(true) {
                     while(~var7 > ~class292.field4635) {
                        class41.method290(class681.field10157[var7], arg1, false, arg2);
                        ++var7;
                     }

                     int var8 = 0;
                     if (!var3) {
                        if (var3) {
                           class41.method290(class293.field4646[var8], arg1, false, arg2);
                           ++var8;
                        }

                        while(true) {
                           while(var8 < class711.field10691) {
                              class41.method290(class293.field4646[var8], arg1, false, arg2);
                              ++var8;
                           }

                           class84.field1223 = 0;
                           if (!var3) {
                              if (class717.field10736 > 0) {
                                 int var9 = class327.field4984.length;
                                 int var10 = -var9 + var9 & 7;
                                 int var11 = 0;
                                 if (var3) {
                                    class327.field4984[var11++] = Integer.MAX_VALUE;
                                    class327.field4984[var11++] = Integer.MAX_VALUE;
                                    class327.field4984[var11++] = Integer.MAX_VALUE;
                                    class327.field4984[var11++] = Integer.MAX_VALUE;
                                    class327.field4984[var11++] = Integer.MAX_VALUE;
                                    class327.field4984[var11++] = Integer.MAX_VALUE;
                                    class327.field4984[var11++] = Integer.MAX_VALUE;
                                    class327.field4984[var11++] = Integer.MAX_VALUE;
                                 }

                                 while(true) {
                                    while(~var11 > ~var10) {
                                       class327.field4984[var11++] = Integer.MAX_VALUE;
                                       class327.field4984[var11++] = Integer.MAX_VALUE;
                                       class327.field4984[var11++] = Integer.MAX_VALUE;
                                       class327.field4984[var11++] = Integer.MAX_VALUE;
                                       class327.field4984[var11++] = Integer.MAX_VALUE;
                                       class327.field4984[var11++] = Integer.MAX_VALUE;
                                       class327.field4984[var11++] = Integer.MAX_VALUE;
                                       class327.field4984[var11++] = Integer.MAX_VALUE;
                                    }

                                    if (!var3) {
                                       if (var3) {
                                          class327.field4984[var11++] = Integer.MAX_VALUE;
                                       }

                                       while(~var9 < ~var11) {
                                          class327.field4984[var11++] = Integer.MAX_VALUE;
                                       }

                                       class69.field908 = 1;
                                       int var12 = 0;
                                       if (var3 || ~class717.field10736 < ~var12) {
                                          do {
                                             class409 var13 = class366.field5665[var12];
                                             class230.method1982(var13.field6376[1], var13.field6376[0], 116, var13.field6367[1], var13.field6370[1], var13.field6370[3], var13.field6367[3], var13.field6367[0], var13.field6376[3], var13.field6370[0]);
                                             class230.method1982(var13.field6376[2], var13.field6376[1], -26, var13.field6367[2], var13.field6370[2], var13.field6370[3], var13.field6367[3], var13.field6367[1], var13.field6376[3], var13.field6370[1]);
                                             ++var12;
                                          } while(~class717.field10736 < ~var12);
                                       }

                                       class69.field908 = 2;
                                       break;
                                    }

                                    class327.field4984[var11++] = Integer.MAX_VALUE;
                                 }
                              }

                              if (class387.field6084) {
                                 class125.field1800 = class754.field11176.method4639(-14239) + -class224.field3398;
                                 return;
                              }

                              return;
                           }

                           ++var8;
                        }
                     }

                     ++var7;
                  }
               }

               ++var6;
            }
         } else {
            class717.field10736 = 0;
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field8266[9] + arg0 + ',' + (arg1 != null ? field8266[2] : field8266[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "(I)V",
      line = 132
   )
   public final void method4192(int arg0) {
      try {
         ++field8256;
         synchronized(this) {
            if (this.field8249 == null) {
               this.field8249 = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.field8255.join();
         } catch (InterruptedException var4) {
         }

         if (arg0 != 16776960) {
            this.field8263 = -85;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8266[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(IJ)V",
      line = 155
   )
   public static final void method4193(int arg0, long arg1) {
      try {
         ++field8250;
         class406.field6327.setTime(new Date(arg1));
         if (arg0 != 27444) {
            field8265 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8266[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(ILha;IIBI)V",
      line = 171
   )
   public static final void method4194(int arg0, class610 arg1, int arg2, int arg3, byte arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field8248;
         arg1.method629(arg0, arg5, arg0 + arg2, arg3 + arg5);
         arg1.method4502(arg0, 0, -16777216, arg2, arg5, arg3);
         if (~class598.field8777 <= -101) {
            int var8;
            int var9;
            label91: {
               float var7 = (float)class60.field759 / (float)class60.field757;
               var8 = arg2;
               var9 = arg3;
               if (!(var7 < 1.0F)) {
                  var8 = (int)((float)arg3 / var7);
                  if (!var6) {
                     break label91;
                  }
               }

               var9 = (int)((float)arg2 * var7);
            }

            int var24 = (-var8 + arg2) / 2 + arg0;
            int var25 = (-var9 + arg3) / 2 + arg5;
            if (class753.field11170 == null || ~arg2 != ~class753.field11170.method2104() || ~class753.field11170.method2095() != ~arg3) {
               class60.method444(class60.field774, class60.field763 - -class60.field759, class60.field774 - -class60.field757, class60.field763, var24, var25, var24 + var8, var25 - -var9);
               class60.method447(arg1);
               class753.field11170 = arg1.method630(var24, var25, var8, var9, false);
            }

            class753.field11170.method4959(var24, var25);
            int var10 = class503.field7682 * var8 / class60.field757;
            if (arg4 == 84) {
               int var11 = class561.field8340 * var9 / class60.field759;
               int var12 = class43.field574 * var8 / class60.field757 + var24;
               int var13 = -(class781.field11452 * var9 / class60.field759) + var9 + var25 + -var11;
               int var14 = -1996554240;
               if (class410.field6382 == class103.field1438) {
                  var14 = -1996488705;
               }

               arg1.method631(var12, var13, var10, var11, var14, 1);
               arg1.method602(var12, var13, var10, var11, var14, 0);
               if (~class475.field7231 < -1) {
                  int var15;
                  label58: {
                     if (~class241.field3658 >= -51) {
                        var15 = class241.field3658 * 5;
                        if (!var6) {
                           break label58;
                        }
                     }

                     var15 = (-class241.field3658 + 100) * 5;
                  }

                  class28 var16 = (class28)class60.field747.method4972((byte)-84);
                  if (var6 || var16 != null) {
                     do {
                        class77 var17 = class60.field744.method133(var16.field332, 36);
                        if (class29.method206(var17, (byte)65)) {
                           label102: {
                              if (~class739.field10981 == ~var16.field332) {
                                 int var18 = var24 - -(var16.field336 * var8 / class60.field757);
                                 int var19 = (class60.field759 - var16.field335) * var9 / class60.field759 + var25;
                                 arg1.method4502(var18 + -2, 0, var15 << 24 | 16776960, 4, var19 - 2, 4);
                                 if (!var6) {
                                    break label102;
                                 }
                              }

                              if (~class600.field8790 != 0 && ~class600.field8790 == ~var17.field1003) {
                                 int var20 = var24 - -(var16.field336 * var8 / class60.field757);
                                 int var21 = (-var16.field335 + class60.field759) * var9 / class60.field759 + var25;
                                 arg1.method4502(var20 - 2, 0, var15 << 24 | 16776960, 4, var21 + -2, 4);
                              }
                           }
                        }

                        var16 = (class28)class60.field747.method4975((byte)127);
                     } while(var16 != null);

                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field8266[8] + arg0 + ',' + (arg1 != null ? field8266[2] : field8266[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "run",
      descriptor = "()V",
      line = 264
   )
   public final void run() {
      boolean var1 = client.field1786;

      try {
         ++field8253;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label57: {
                     if (this.field8249 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (~this.field8263 != -1) {
                        if (~this.field8263 < ~this.field8257) {
                           var3 = -this.field8257 + this.field8263 + -1;
                           if (!var1) {
                              break label57;
                           }
                        }

                        var3 = -this.field8257 + this.field8254;
                        if (!var1) {
                           break label57;
                        }
                     }

                     var3 = -this.field8257 - 1 + this.field8254;
                  }

                  if (var3 > 0) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var15) {
                     if (var1) {
                        break;
                     }
                  }
               }
            }

            int var4;
            try {
               var4 = this.field8259.read(this.field8246, this.field8257, var3);
               if (~var4 == 0) {
                  throw new EOFException();
               }
            } catch (IOException var17) {
               IOException var5 = var17;
               synchronized(this) {
                  this.field8249 = var5;
                  return;
               }
            }

            synchronized(this) {
               this.field8257 = (this.field8257 - -var4) % this.field8254;
            }
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field8266[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "(B)V",
      line = 325
   )
   public static final void method4195(byte arg0) {
      try {
         class513.field7827 = 200;
         ++field8258;
         class730.field10901 = (int)((double)class513.field7828 * 34.46D);
         if (arg0 <= -15) {
            class730.field10901 <<= 2;
            if (class351.field5356.method594()) {
               class730.field10901 += 512;
            }

            class753.method5528(-26506, false);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8266[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(BLjava/lang/String;)V",
      line = 349
   )
   public static final void method4196(byte arg0, String arg1) {
      try {
         ++field8260;
         class577 var2 = class262.method2277(32347);
         if (arg0 < -112) {
            var2.field8531.method2864(-26110, class389.field6130.field4916);
            var2.field8531.method2873(0, (byte)-59);
            int var3 = var2.field8531.field5436;
            var2.field8531.method2873(659, (byte)-60);
            int[] var4 = class746.method5479(var2, 0);
            int var5 = var2.field8531.field5436;
            var2.field8531.method2862(arg1, true);
            var2.field8531.method2864(-26110, class493.field7455);
            var2.field8531.field5436 += 7;
            var2.field8531.method2844(var2.field8531.field5436, var5, var4, 1);
            var2.field8531.method2882((byte)22, -var3 + var2.field8531.field5436);
            class510.field7800.method211(var2, 122);
            class425.field6575 = 0;
            class159.field2363 = 1;
            class18.field238 = 0;
            class56.field693 = -3;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8266[5] + arg0 + ',' + (arg1 != null ? field8266[2] : field8266[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "<init>",
      descriptor = "(Ljava/io/InputStream;I)V",
      line = 463
   )
   public class552(InputStream arg0, int arg1) {
      try {
         this.field8259 = arg0;
         this.field8254 = arg1 + 1;
         this.field8246 = new byte[this.field8254];
         this.field8255 = new Thread(this);
         this.field8255.setDaemon(true);
         this.field8255.start();
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8266[1] + (arg0 != null ? field8266[2] : field8266[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "([BIBI)I",
      line = 383
   )
   public final int method4197(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
      boolean var5 = client.field1786;

      try {
         ++field8247;
         if (~arg3 <= -1 && arg1 >= 0 && arg1 - -arg3 <= arg0.length) {
            synchronized(this) {
               int var8;
               label54: {
                  int var7 = 57 / ((82 - arg2) / 39);
                  if (this.field8257 >= this.field8263) {
                     var8 = -this.field8263 + this.field8257;
                     if (!var5) {
                        break label54;
                     }
                  }

                  var8 = -this.field8263 + this.field8254 + this.field8257;
               }

               if (~var8 > ~arg3) {
                  arg3 = var8;
               }

               if (arg3 == 0 && this.field8249 != null) {
                  throw new IOException(this.field8249.toString());
               } else {
                  label46: {
                     if (~this.field8254 <= ~(this.field8263 + arg3)) {
                        class107.method1027(this.field8246, this.field8263, arg0, arg1, arg3);
                        if (!var5) {
                           break label46;
                        }
                     }

                     int var9 = -this.field8263 + this.field8254;
                     class107.method1027(this.field8246, this.field8263, arg0, arg1, var9);
                     class107.method1027(this.field8246, 0, arg0, arg1 + var9, -var9 + arg3);
                  }

                  this.field8263 = (this.field8263 + arg3) % this.field8254;
                  this.notifyAll();
                  return arg3;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field8266[7] + (arg0 != null ? field8266[2] : field8266[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(II)Z",
      line = 426
   )
   public final boolean method4198(int arg0, int arg1) throws IOException {
      try {
         ++field8251;
         if (~arg0 < arg1 && ~arg0 > ~this.field8254) {
            synchronized(this) {
               int var4;
               label35: {
                  if (~this.field8263 >= ~this.field8257) {
                     var4 = this.field8257 - this.field8263;
                     if (!client.field1786) {
                        break label35;
                     }
                  }

                  var4 = -this.field8263 + this.field8254 - -this.field8257;
               }

               if (~var4 > ~arg0) {
                  if (this.field8249 != null) {
                     throw new IOException(this.field8249.toString());
                  } else {
                     this.notifyAll();
                     return false;
                  }
               } else {
                  return true;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field8266[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4199(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4200(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
