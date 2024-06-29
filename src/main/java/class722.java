import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class722 extends class500 {
   @OriginalMember(
      owner = "client!hg",
      name = "I",
      descriptor = "I"
   )
   private int field10577;
   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "Z"
   )
   private boolean field10573;
   @OriginalMember(
      owner = "client!hg",
      name = "A",
      descriptor = "I"
   )
   private int field10572;
   @OriginalMember(
      owner = "client!hg",
      name = "u",
      descriptor = "I"
   )
   private int field10575;
   @OriginalMember(
      owner = "client!hg",
      name = "o",
      descriptor = "I"
   )
   public int field10581;
   @OriginalMember(
      owner = "client!hg",
      name = "m",
      descriptor = "I"
   )
   private int field10588;
   @OriginalMember(
      owner = "client!hg",
      name = "E",
      descriptor = "I"
   )
   private int field10583;
   @OriginalMember(
      owner = "client!hg",
      name = "x",
      descriptor = "I"
   )
   private int field10576;
   @OriginalMember(
      owner = "client!hg",
      name = "C",
      descriptor = "I"
   )
   public int field10571;
   @OriginalMember(
      owner = "client!hg",
      name = "p",
      descriptor = "Z"
   )
   private boolean field10593;
   @OriginalMember(
      owner = "client!hg",
      name = "B",
      descriptor = "I"
   )
   private int field10580;
   @OriginalMember(
      owner = "client!hg",
      name = "J",
      descriptor = "I"
   )
   private int field10574;
   @OriginalMember(
      owner = "client!hg",
      name = "q",
      descriptor = "I"
   )
   private int field10570;
   @OriginalMember(
      owner = "client!hg",
      name = "r",
      descriptor = "I"
   )
   private int field10590;
   @OriginalMember(
      owner = "client!hg",
      name = "G",
      descriptor = "I"
   )
   public int field10589;
   @OriginalMember(
      owner = "client!hg",
      name = "H",
      descriptor = "Ljava/lang/String;"
   )
   private String field10569;
   @OriginalMember(
      owner = "client!hg",
      name = "F",
      descriptor = "Ljava/lang/String;"
   )
   private String field10595;
   @OriginalMember(
      owner = "client!hg",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   private String field10586;
   @OriginalMember(
      owner = "client!hg",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   private String field10592;
   @OriginalMember(
      owner = "client!hg",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10596 = new String[]{method5252(method5251("nc\u000f\u0019\u0010")), method5252(method5251("nc\u000f\u001f\u0010")), method5252(method5251("nc\u000f\u0018\u0010")), method5252(method5251("}*\u000fuE")), method5252(method5251("hqM7")), method5252(method5251("nc\u000f\u001a\u0010")), method5252(method5251("~<\u0017\u0004\u000e2")), method5252(method5251("74\u000fn")), method5252(method5251("keB")), method5252(method5251("uqO")), method5252(method5251("nc\u000fgQhmUe\u0010")), method5252(method5251("3*\u0011")), method5252(method5251("qmO")), method5252(method5251("gtQ7]")), method5252(method5251("74\u000fm")), method5252(method5251("2*\u0018")), method5252(method5251("giEm\f")), method5252(method5251("0*\u0011")), method5252(method5251("2*\u0011")), method5252(method5251("74\u000fo")), method5252(method5251("kmB)WukG/")), method5252(method5251("jmO.@")), method5252(method5251("0*\u0010")), method5252(method5251("2*\u0010")), method5252(method5251("3*\u0010"))};
   @OriginalMember(
      owner = "client!hg",
      name = "D",
      descriptor = "I"
   )
   public static int field10587 = 2;
   @OriginalMember(
      owner = "client!hg",
      name = "k",
      descriptor = "Lbga;"
   )
   public static class378 field10582 = new class378(109, 3);
   @OriginalMember(
      owner = "client!hg",
      name = "j",
      descriptor = "I"
   )
   public static int field10578;
   @OriginalMember(
      owner = "client!hg",
      name = "v",
      descriptor = "I"
   )
   private int field10579;
   @OriginalMember(
      owner = "client!hg",
      name = "t",
      descriptor = "I"
   )
   private int field10584;
   @OriginalMember(
      owner = "client!hg",
      name = "l",
      descriptor = "I"
   )
   public static int field10585;
   @OriginalMember(
      owner = "client!hg",
      name = "n",
      descriptor = "I"
   )
   public static int field10591;
   @OriginalMember(
      owner = "client!hg",
      name = "w",
      descriptor = "I"
   )
   public static int field10594;

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(ILwm;)V"
   )
   public final void method5247(int arg0, class594 arg1) {
      try {
         arg1.method4318(5, 0);
         ++field10594;
         arg1.method4318(this.field10577, 0);
         arg1.method4318(!this.field10573 ? 0 : 1, arg0 + -10);
         arg1.method4318(this.field10572, arg0 ^ arg0);
         arg1.method4318(this.field10575, 0);
         arg1.method4318(this.field10581, 0);
         arg1.method4318(this.field10588, 0);
         arg1.method4318(this.field10571, arg0 ^ 10);
         arg1.method4318(this.field10593 ? 1 : 0, 0);
         arg1.method4284(this.field10583, -31429);
         arg1.method4318(this.field10576, 0);
         arg1.method4323(this.field10589, 1100708040);
         arg1.method4284(this.field10570, -31429);
         arg1.method4318(this.field10580, arg0 ^ 10);
         arg1.method4318(this.field10574, 0);
         arg1.method4318(this.field10590, 0);
         arg1.method4339(this.field10592, false);
         arg1.method4339(this.field10586, false);
         arg1.method4339(this.field10569, false);
         arg1.method4339(this.field10595, false);
         arg1.method4318(this.field10579, 0);
         arg1.method4284(this.field10584, -31429);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10596[2] + arg0 + ',' + (arg1 != null ? field10596[3] : field10596[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method5248(byte arg0) {
      try {
         ++field10578;
         if (this.field10592.length() > 40) {
            this.field10592 = this.field10592.substring(0, 40);
         }

         if (this.field10586.length() > 40) {
            this.field10586 = this.field10586.substring(0, 40);
         }

         if (~this.field10569.length() < -11) {
            this.field10569 = this.field10569.substring(0, 10);
         }

         int var2 = 52 / ((arg0 - 30) / 46);
         if (this.field10595.length() > 10) {
            this.field10595 = this.field10595.substring(0, 10);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10596[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5249(byte arg0) {
      try {
         field10582 = null;
         if (arg0 != -20) {
            field10582 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10596[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method5250(int arg0) {
      try {
         if (arg0 != -18643) {
            return 50;
         } else {
            ++field10585;
            byte var2 = 23;
            int var3 = var2 + class35.method270((byte)84, this.field10592);
            int var4 = var3 + class35.method270((byte)84, this.field10586);
            int var5 = var4 + class35.method270((byte)84, this.field10569);
            return var5 + class35.method270((byte)84, this.field10595);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10596[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "<init>",
      descriptor = "()V"
   )
   public class722() {
   }

   @OriginalMember(
      owner = "client!hg",
      name = "<init>",
      descriptor = "(ZLbj;)V"
   )
   public class722(boolean arg0, class255 arg1) {
      boolean var3 = client.field4273;
      super();

      try {
         if (arg0) {
            label298: {
               if (!class255.field3248.startsWith(field10596[12])) {
                  if (!class255.field3248.startsWith(field10596[8])) {
                     if (!class255.field3248.startsWith(field10596[21])) {
                        this.field10577 = 4;
                        if (!var3) {
                           break label298;
                        }
                     }

                     this.field10577 = 3;
                     if (!var3) {
                        break label298;
                     }
                  }

                  this.field10577 = 2;
                  if (!var3) {
                     break label298;
                  }
               }

               this.field10577 = 1;
            }

            label315: {
               if (class255.field3245.startsWith(field10596[16]) || class255.field3245.startsWith(field10596[6])) {
                  this.field10573 = true;
                  if (!var3) {
                     break label315;
                  }
               }

               this.field10573 = false;
            }

            label306: {
               if (this.field10577 != 1) {
                  if (~this.field10577 != -3) {
                     break label306;
                  }

                  if (~class255.field3261.indexOf(field10596[19]) != 0) {
                     this.field10572 = 20;
                     if (!var3) {
                        break label306;
                     }
                  }

                  if (class255.field3261.indexOf(field10596[7]) == -1) {
                     if (class255.field3261.indexOf(field10596[14]) == -1) {
                        break label306;
                     }

                     this.field10572 = 22;
                     if (!var3) {
                        break label306;
                     }
                  }

                  this.field10572 = 21;
                  if (!var3) {
                     break label306;
                  }
               }

               if (class255.field3261.indexOf(field10596[18]) == -1) {
                  if (~class255.field3261.indexOf(field10596[23]) == 0) {
                     if (~class255.field3261.indexOf(field10596[15]) == 0) {
                        if (~class255.field3261.indexOf(field10596[11]) == 0) {
                           if (~class255.field3261.indexOf(field10596[24]) == 0) {
                              if (~class255.field3261.indexOf(field10596[17]) == 0) {
                                 if (~class255.field3261.indexOf(field10596[22]) == 0) {
                                    break label306;
                                 }

                                 this.field10572 = 7;
                                 if (!var3) {
                                    break label306;
                                 }
                              }

                              this.field10572 = 6;
                              if (!var3) {
                                 break label306;
                              }
                           }

                           this.field10572 = 5;
                           if (!var3) {
                              break label306;
                           }
                        }

                        this.field10572 = 4;
                        if (!var3) {
                           break label306;
                        }
                     }

                     this.field10572 = 3;
                     if (!var3) {
                        break label306;
                     }
                  }

                  this.field10572 = 2;
                  if (!var3) {
                     break label306;
                  }
               }

               this.field10572 = 1;
            }

            label244: {
               if (~class255.field3263.toLowerCase().indexOf(field10596[9]) == 0) {
                  if (class255.field3263.toLowerCase().indexOf(field10596[20]) != -1) {
                     this.field10575 = 2;
                     if (!var3) {
                        break label244;
                     }
                  }

                  if (class255.field3263.toLowerCase().indexOf(field10596[13]) != -1) {
                     this.field10575 = 3;
                     if (!var3) {
                        break label244;
                     }
                  }

                  this.field10575 = 4;
                  if (!var3) {
                     break label244;
                  }
               }

               this.field10575 = 1;
            }

            int var4 = 2;
            int var5 = 0;

            label232: {
               label231: {
                  try {
                     if (var3 || ~class255.field3258.length() < ~var4) {
                        do {
                           char var6 = class255.field3258.charAt(var4);
                           if (var6 < '0' || ~var6 < -58 && !var3) {
                              break label231;
                           }

                           ++var4;
                           var5 = var5 * 10 + -48 + var6;
                        } while(~class255.field3258.length() < ~var4);
                     }
                  } catch (Exception var14) {
                     break label231;
                  }

                  if (var3) {
                     break label232;
                  }
               }

               this.field10581 = var5;
               var5 = 0;
               var4 = 1 + class255.field3258.indexOf(46, 2);
            }

            label211: {
               label210: {
                  try {
                     if (var3 || ~var4 > ~class255.field3258.length()) {
                        do {
                           char var7 = class255.field3258.charAt(var4);
                           if (~var7 > -49 || var7 > '9') {
                              break label210;
                           }

                           ++var4;
                           var5 = var5 * 10 - -var7 - 48;
                        } while(~var4 > ~class255.field3258.length());
                     }
                  } catch (Exception var13) {
                     break label210;
                  }

                  if (var3) {
                     break label211;
                  }
               }

               this.field10588 = var5;
               var5 = 0;
               var4 = class255.field3258.indexOf(95, 4) - -1;
            }

            label191: {
               label190: {
                  try {
                     if (var3 || class255.field3258.length() > var4) {
                        do {
                           char var8 = class255.field3258.charAt(var4);
                           if (var8 < '0' || var8 > '9' && !var3) {
                              break label190;
                           }

                           var5 = var5 * 10 - 48 - -var8;
                           ++var4;
                        } while(class255.field3258.length() > var4);
                     }
                  } catch (Exception var12) {
                     break label190;
                  }

                  if (var3) {
                     break label191;
                  }
               }

               this.field10583 = class155.field2005;
            }

            label170: {
               if (this.field10581 > 3) {
                  this.field10576 = class468.field6445;
                  if (!var3) {
                     break label170;
                  }
               }

               this.field10576 = 0;
            }

            label165: {
               this.field10571 = var5;
               if (arg1.field3257) {
                  this.field10593 = false;
                  if (!var3) {
                     break label165;
                  }
               }

               this.field10593 = true;
            }

            try {
               int[] var9 = HardwareInfo.getCPUInfo();
               if (var9 != null && ~var9.length == -8) {
                  this.field10580 = var9[3];
                  this.field10574 = var9[4];
                  this.field10570 = var9[2];
                  this.field10590 = var9[5];
                  this.field10589 = var9[6];
               }
            } catch (Throwable var11) {
               this.field10589 = 0;
            }
         }

         if (this.field10569 == null) {
            this.field10569 = "";
         }

         if (this.field10595 == null) {
            this.field10595 = "";
         }

         if (this.field10586 == null) {
            this.field10586 = "";
         }

         if (this.field10592 == null) {
            this.field10592 = "";
         }

         this.method5248((byte)96);
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field10596[10] + arg0 + ',' + (arg1 != null ? field10596[3] : field10596[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5251(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5252(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
