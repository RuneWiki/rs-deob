import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class393 {
   @OriginalMember(
      owner = "client!he",
      name = "m",
      descriptor = "Z"
   )
   private boolean field5552;
   @OriginalMember(
      owner = "client!he",
      name = "d",
      descriptor = "Lor;"
   )
   public class670 field5557;
   @OriginalMember(
      owner = "client!he",
      name = "j",
      descriptor = "I"
   )
   private int field5550;
   @OriginalMember(
      owner = "client!he",
      name = "n",
      descriptor = "I"
   )
   private int field5554;
   @OriginalMember(
      owner = "client!he",
      name = "i",
      descriptor = "I"
   )
   public int field5556;
   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5559 = new String[]{method2998(method2997("sj\u001cL:")), method2998(method2997("uz^e")), method2998(method2997("`!\u001c'o")), method2998(method2997("sj\u001c5{ufF7:")), method2998(method2997("sj\u001cH:")), method2998(method2997("sj\u001cJ:")), method2998(method2997("sj\u001cN:")), method2998(method2997("sj\u001co{un^`h~'")), method2998(method2997("sj\u001cK:")), method2998(method2997("sj\u001cM:")), method2998(method2997("D|FhfrlWewvj\\}a"))};
   @OriginalMember(
      owner = "client!he",
      name = "g",
      descriptor = "J"
   )
   public static long field5547 = -1L;
   @OriginalMember(
      owner = "client!he",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field5551 = new class378(108, 2);
   @OriginalMember(
      owner = "client!he",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field5558 = false;
   @OriginalMember(
      owner = "client!he",
      name = "l",
      descriptor = "I"
   )
   public static int field5545;
   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "I"
   )
   public static int field5546;
   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "I"
   )
   public static int field5548;
   @OriginalMember(
      owner = "client!he",
      name = "f",
      descriptor = "I"
   )
   public static int field5549;
   @OriginalMember(
      owner = "client!he",
      name = "c",
      descriptor = "I"
   )
   public static int field5553;
   @OriginalMember(
      owner = "client!he",
      name = "k",
      descriptor = "I"
   )
   public static int field5555;

   @OriginalMember(
      owner = "client!he",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2991(int arg0) {
      try {
         if (arg0 == 12) {
            field5551 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5559[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "d",
      descriptor = "(I)[Ljh;"
   )
   public static final class169[] method2992(int arg0) {
      try {
         if (arg0 < 75) {
            return null;
         } else {
            ++field5549;
            return new class169[]{class639.field9013, class100.field1291, class532.field7275};
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5559[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method751(boolean arg0);

   @OriginalMember(
      owner = "client!he",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field5557.method4860(this.field5556, false, this.field5554);
         ++field5548;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5559[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(ILwm;)Ljava/lang/String;"
   )
   public static final String method2993(int arg0, class594 arg1) {
      try {
         if (arg0 != 35044) {
            field5558 = true;
         }

         ++field5553;
         return class419.method3170(32767, arg1, false);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5559[0] + arg0 + ',' + (arg1 != null ? field5559[2] : field5559[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(IB[B)V"
   )
   public final void method2994(int arg0, byte arg1, byte[] arg2) {
      try {
         if (arg1 > -74) {
            this.field5550 = -71;
         }

         ++field5546;
         this.method751(false);
         if (arg0 <= this.field5554) {
            OpenGL.glBufferSubDataARBub(this.field5550, 0, arg0, arg2, 0);
         } else {
            OpenGL.glBufferDataARBub(this.field5550, arg0, arg2, 0, !this.field5552 ? 35044 : 35040);
            this.field5557.field9729 += -this.field5554 + arg0;
            this.field5554 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5559[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5559[2] : field5559[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method2995(int arg0, int arg1) {
      try {
         ++field5555;
         if (arg0 != 6407 && ~arg0 != -34844 && arg0 != 34837) {
            if (arg0 != 6408 && arg0 != 34842 && arg0 != 34836) {
               if (arg0 != 6406 && arg0 != 34844) {
                  if (~arg0 != -6410 && ~arg0 != -34847) {
                     if (arg0 != arg1 && arg0 != 34847) {
                        if (arg0 == 6402) {
                           return 6402;
                        } else {
                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 6410;
                     }
                  } else {
                     return 6409;
                  }
               } else {
                  return 6406;
               }
            } else {
               return 6408;
            }
         } else {
            return 6407;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5559[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "<init>",
      descriptor = "(Lor;I[BIZ)V"
   )
   public class393(class670 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      try {
         this.field5552 = arg4;
         this.field5557 = arg0;
         this.field5550 = arg1;
         this.field5554 = arg3;
         OpenGL.glGenBuffersARB(1, class427.field5965, 0);
         this.field5556 = class427.field5965[0];
         this.method751(false);
         OpenGL.glBufferDataARBub(arg1, this.field5554, arg2, 0, !this.field5552 ? 35044 : 35040);
         this.field5557.field9729 += this.field5554;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5559[3] + (arg0 != null ? field5559[2] : field5559[1]) + ',' + arg1 + ',' + (arg2 != null ? field5559[2] : field5559[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(ILd;Lha;)V"
   )
   public static final void method2996(int arg0, class160 arg1, class65 arg2) {
      boolean var3 = client.field4273;

      try {
         ++field5545;
         if (class618.field8615 != null) {
            if (~class93.field1236 > -11) {
               if (!class618.field8608.method741(-16463, class618.field8615.field1576)) {
                  class93.field1236 = class554.field7627.method710(0, class618.field8615.field1576) / 10;
                  return;
               }

               class588.method4223(true);
               class93.field1236 = 10;
            }

            if (~class93.field1236 == -11) {
               class618.field8627 = class618.field8615.field1590 >> 6 << 6;
               class618.field8644 = class618.field8615.field1584 >> 6 << 6;
               class618.field8642 = (class618.field8615.field1583 >> 6 << 6) + -class618.field8644 - -64;
               class618.field8636 = (class618.field8615.field1570 >> 6 << 6) + -class618.field8627 + 64;
               int[] var4 = new int[3];
               int var5 = -1;
               int var6 = -1;
               if (class618.field8615.method1057((class278.field3709.field1003 >> 9) + class17.field237, class278.field3709.field1001, var4, (byte)-119, (class278.field3709.field999 >> 9) + class752.field10921)) {
                  var5 = var4[1] + -class618.field8644;
                  var6 = var4[2] - class618.field8627;
               }

               label212: {
                  if (!class619.field8655 && var5 >= 0 && ~var5 > ~class618.field8642 && var6 >= 0 && ~var6 > ~class618.field8636) {
                     int var7 = var6 + (int)(Math.random() * 10.0D) + -5;
                     int var8 = var5 + -5 + (int)(Math.random() * 10.0D);
                     class791.field11574 = var8;
                     class231.field2870 = var7;
                     if (!var3) {
                        break label212;
                     }
                  }

                  if (~class302.field3979 == 0 || class244.field3059 == -1) {
                     class618.field8615.method1053(class618.field8615.field1578 & 16383, var4, (class618.field8615.field1578 & 268427944) >> 14, -23237);
                     class231.field2870 = var4[2] + -class618.field8627;
                     class791.field11574 = var4[1] - class618.field8644;
                     if (!var3) {
                        break label212;
                     }
                  }

                  class618.field8615.method1053(class244.field3059, var4, class302.field3979, -23237);
                  class619.field8655 = false;
                  if (var4 != null) {
                     class231.field2870 = var4[2] + -class618.field8627;
                     class791.field11574 = var4[1] + -class618.field8644;
                  }

                  class244.field3059 = -1;
                  class302.field3979 = -1;
               }

               label157: {
                  if (class618.field8615.field1579 != 37) {
                     if (~class618.field8615.field1579 != -51) {
                        if (class618.field8615.field1579 != 75) {
                           if (~class618.field8615.field1579 != -101) {
                              if (~class618.field8615.field1579 == -201) {
                                 class618.field8619 = 16.0F;
                                 class618.field8618 = 16.0F;
                                 if (!var3) {
                                    break label157;
                                 }
                              }

                              class618.field8619 = 8.0F;
                              class618.field8618 = 8.0F;
                              if (!var3) {
                                 break label157;
                              }
                           }

                           class618.field8619 = 8.0F;
                           class618.field8618 = 8.0F;
                           if (!var3) {
                              break label157;
                           }
                        }

                        class618.field8619 = 6.0F;
                        class618.field8618 = 6.0F;
                        if (!var3) {
                           break label157;
                        }
                     }

                     class618.field8619 = 4.0F;
                     class618.field8618 = 4.0F;
                     if (!var3) {
                        break label157;
                     }
                  }

                  class618.field8619 = 3.0F;
                  class618.field8618 = 3.0F;
               }

               class618.field8620 = (int)class618.field8619 >> 1;
               class618.field8622 = class701.method5087(125, class618.field8620);
               class245.method1842(105);
               class618.method4489();
               class572.field7867 = new class536();
               class618.field8625 += -2 + (int)(5.0D * Math.random());
               if (~class618.field8625 > 7) {
                  class618.field8625 = -8;
               }

               if (~class618.field8625 < -9) {
                  class618.field8625 = 8;
               }

               class618.field8623 += (int)(5.0D * Math.random()) - 2;
               if (~class618.field8623 > 15) {
                  class618.field8623 = -16;
               }

               if (class618.field8623 > 16) {
                  class618.field8623 = 16;
               }

               class618.method4496(arg1, class618.field8625 >> 2 << 10, class618.field8623 >> 1);
               class618.field8609.method5238((byte)-126, 256, 1024);
               class618.field8616.method2381(256, 256, 31);
               class618.field8611.method3592(0, 4096);
               class402.field5645.method2779(0, 256);
               class93.field1236 = 20;
            } else if (class93.field1236 == 20) {
               class784.method5648(true, true);
               class618.method4485(arg2, class618.field8625, class618.field8623);
               class93.field1236 = 60;
               class784.method5648(true, true);
               class132.method1107((byte)-8);
            } else if (~class93.field1236 != -61) {
               if (~class93.field1236 == -71) {
                  class524.field7181 = new class84(arg2, 11, true, class204.field2515);
                  class93.field1236 = 73;
                  class784.method5648(true, true);
                  class132.method1107((byte)-8);
               } else if (class93.field1236 == 73) {
                  class264.field3446 = new class84(arg2, 12, true, class204.field2515);
                  class93.field1236 = 76;
                  class784.method5648(true, true);
                  class132.method1107((byte)-8);
               } else if (~class93.field1236 == -77) {
                  class621.field8679 = new class84(arg2, 14, true, class204.field2515);
                  class93.field1236 = 79;
                  class784.method5648(true, true);
                  class132.method1107((byte)-8);
               } else if (class93.field1236 == 79) {
                  class469.field6491 = new class84(arg2, 17, true, class204.field2515);
                  class93.field1236 = 82;
                  class784.method5648(true, true);
                  class132.method1107((byte)-8);
               } else if (class93.field1236 == 82) {
                  class76.field953 = new class84(arg2, 19, true, class204.field2515);
                  class93.field1236 = 85;
                  class784.method5648(true, true);
                  class132.method1107((byte)-8);
               } else if (class93.field1236 == 85) {
                  class522.field7146 = new class84(arg2, 22, true, class204.field2515);
                  class93.field1236 = 88;
                  class784.method5648(true, true);
                  class132.method1107((byte)-8);
               } else {
                  if (arg0 != -1) {
                     method2995(-23, -20);
                  }

                  if (class93.field1236 == 88) {
                     class178.field2210 = new class84(arg2, 26, true, class204.field2515);
                     class93.field1236 = 91;
                     class784.method5648(true, true);
                     class132.method1107((byte)-8);
                  } else {
                     class509.field7051 = new class84(arg2, 30, true, class204.field2515);
                     class93.field1236 = 100;
                     class784.method5648(true, true);
                     class132.method1107((byte)-8);
                     System.gc();
                  }
               }
            } else {
               label195: {
                  if (!class618.field8608.method731(class618.field8615.field1576 + field5559[10], (byte)102)) {
                     class618.field8626 = new class263(0);
                     if (!var3) {
                        break label195;
                     }
                  }

                  if (!class618.field8608.method741(-16463, class618.field8615.field1576 + field5559[10])) {
                     return;
                  }

                  class618.field8626 = class90.method860(class56.field607, class618.field8608, class618.field8615.field1576 + field5559[10], (byte)-121);
               }

               class618.method4481();
               class93.field1236 = 70;
               class784.method5648(true, true);
               class132.method1107((byte)-8);
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field5559[9] + arg0 + ',' + (arg1 != null ? field5559[2] : field5559[1]) + ',' + (arg2 != null ? field5559[2] : field5559[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "<init>",
      descriptor = "(Lor;ILjaclib/memory/Buffer;IZ)V"
   )
   public class393(class670 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      try {
         this.field5557 = arg0;
         this.field5554 = arg3;
         this.field5552 = arg4;
         this.field5550 = arg1;
         OpenGL.glGenBuffersARB(1, class427.field5965, 0);
         this.field5556 = class427.field5965[0];
         this.method751(false);
         OpenGL.glBufferDataARBa(arg1, this.field5554, arg2.getAddress(), this.field5552 ? 35040 : 35044);
         this.field5557.field9729 += this.field5554;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5559[3] + (arg0 != null ? field5559[2] : field5559[1]) + ',' + arg1 + ',' + (arg2 != null ? field5559[2] : field5559[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2997(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2998(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
