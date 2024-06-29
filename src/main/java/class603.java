import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class603 implements class373 {
   @OriginalMember(
      owner = "client!sd",
      name = "B",
      descriptor = "I"
   )
   private int field8593 = 0;
   @OriginalMember(
      owner = "client!sd",
      name = "x",
      descriptor = "[Lbaa;"
   )
   private class491[] field8594 = new class491[9];
   @OriginalMember(
      owner = "client!sd",
      name = "h",
      descriptor = "I"
   )
   private int field8605 = -1;
   @OriginalMember(
      owner = "client!sd",
      name = "s",
      descriptor = "Laea;"
   )
   private class678 field8598;
   @OriginalMember(
      owner = "client!sd",
      name = "r",
      descriptor = "I"
   )
   private int field8599;
   @OriginalMember(
      owner = "client!sd",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8614 = new String[]{method4451(method4450("cV\u0005\u0019N")), method4451(method4450("v\rG[")), method4451(method4450("k\u001c\u0005\u007f\u001b")), method4451(method4450("k\u001c\u0005z\u001b")), method4451(method4450("k\u001c\u0005g\u001b")), method4451(method4450("k\u001c\u0005r\u001b")), method4451(method4450("k\u001c\u0005QZv\u0019G^I}P")), method4451(method4450("k\u001c\u0005u\u001b")), method4451(method4450("k\u001c\u0005|\u001b")), method4451(method4450("k\u001c\u0005v\u001b")), method4451(method4450("k\u001c\u0005\u000bZv\u0011_\t\u001b")), method4451(method4450("k\u001c\u0005{\u001b")), method4451(method4450("k\u001c\u0005~\u001b")), method4451(method4450("k\u001c\u0005t\u001b")), method4451(method4450("k\u001c\u0005y\u001b")), method4451(method4450("k\u001c\u0005f\u001b")), method4451(method4450("k\u001c\u0005s\u001b")), method4451(method4450("k\u001c\u0005q\u001b")), method4451(method4450("k\u001c\u0005p\u001b")), method4451(method4450("k\u001c\u0005x\u001b")), method4451(method4450("k\u001c\u0005}\u001b"))};
   @OriginalMember(
      owner = "client!sd",
      name = "k",
      descriptor = "Lhha;"
   )
   public static class724 field8588 = new class724(16, 6);
   @OriginalMember(
      owner = "client!sd",
      name = "t",
      descriptor = "Lfm;"
   )
   public static class164 field8603 = new class164(53, 7);
   @OriginalMember(
      owner = "client!sd",
      name = "o",
      descriptor = "I"
   )
   public static int field8587;
   @OriginalMember(
      owner = "client!sd",
      name = "g",
      descriptor = "I"
   )
   public static int field8589;
   @OriginalMember(
      owner = "client!sd",
      name = "f",
      descriptor = "I"
   )
   public static int field8590;
   @OriginalMember(
      owner = "client!sd",
      name = "d",
      descriptor = "I"
   )
   public static int field8591;
   @OriginalMember(
      owner = "client!sd",
      name = "q",
      descriptor = "I"
   )
   private int field8592;
   @OriginalMember(
      owner = "client!sd",
      name = "n",
      descriptor = "I"
   )
   public static int field8595;
   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "I"
   )
   public static int field8596;
   @OriginalMember(
      owner = "client!sd",
      name = "m",
      descriptor = "I"
   )
   public static int field8597;
   @OriginalMember(
      owner = "client!sd",
      name = "y",
      descriptor = "I"
   )
   public static int field8600;
   @OriginalMember(
      owner = "client!sd",
      name = "i",
      descriptor = "I"
   )
   public static int field8601;
   @OriginalMember(
      owner = "client!sd",
      name = "j",
      descriptor = "I"
   )
   public static int field8602;
   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "I"
   )
   public static int field8604;
   @OriginalMember(
      owner = "client!sd",
      name = "v",
      descriptor = "I"
   )
   public static int field8606;
   @OriginalMember(
      owner = "client!sd",
      name = "c",
      descriptor = "I"
   )
   private int field8607;
   @OriginalMember(
      owner = "client!sd",
      name = "w",
      descriptor = "I"
   )
   public static int field8608;
   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "I"
   )
   public static int field8609;
   @OriginalMember(
      owner = "client!sd",
      name = "e",
      descriptor = "I"
   )
   public static int field8610;
   @OriginalMember(
      owner = "client!sd",
      name = "u",
      descriptor = "I"
   )
   public static int field8611;
   @OriginalMember(
      owner = "client!sd",
      name = "l",
      descriptor = "I"
   )
   private int field8612;
   @OriginalMember(
      owner = "client!sd",
      name = "p",
      descriptor = "I"
   )
   public static int field8613;

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2925(int arg0) {
      try {
         ++field8606;
         OpenGL.glBindFramebufferEXT(36008, this.field8599);
         this.field8593 |= 1;
         this.field8605 = this.method4446((byte)95);
         if (arg0 != -17801) {
            this.method2924((byte)112);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8614[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2921(int arg0) {
      try {
         if (arg0 != 12646) {
            method4448(96);
         }

         OpenGL.glBindFramebufferEXT(36008, 0);
         ++field8609;
         this.field8593 &= -2;
         this.field8605 = this.method4446((byte)123);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8614[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2923(boolean arg0) {
      try {
         ++field8587;
         OpenGL.glBindFramebufferEXT(36009, 0);
         this.field8593 &= -3;
         if (!arg0) {
            this.field8605 = this.method4446((byte)112);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8614[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(IBLcfa;I)V"
   )
   public final void method4439(int arg0, byte arg1, class763 arg2, int arg3) {
      try {
         this.method4443(arg0, 0, arg2, arg3, arg1 + 36160);
         if (arg1 == -107) {
            ++field8597;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8614[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8614[0] : field8614[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(ILmn;II)V"
   )
   private final void method4440(int arg0, class8 arg1, int arg2, int arg3) {
      try {
         ++field8590;
         if (~this.field8605 == 0) {
            throw new RuntimeException();
         } else {
            int var5;
            label43: {
               var5 = 1 << arg0;
               if ((~var5 & this.field8607) == 0) {
                  this.field8592 = arg1.field141;
                  this.field8612 = arg1.field140;
                  if (!client.field10022) {
                     break label43;
                  }
               }

               if (this.field8592 != arg1.field141 || this.field8612 != arg1.field140) {
                  throw new RuntimeException();
               }
            }

            arg1.method65(this.field8605, (byte)48, arg3, class61.field876[arg0]);
            this.field8594[arg0] = arg1;
            if (arg2 <= -56) {
               this.field8607 |= var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8614[19] + arg0 + ',' + (arg1 != null ? field8614[0] : field8614[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(ILlka;I)V"
   )
   public final void method4441(int arg0, class352 arg1, int arg2) {
      try {
         ++field8602;
         if (~this.field8605 == 0) {
            throw new RuntimeException();
         } else {
            if (arg2 != 2) {
               this.field8594 = null;
            }

            int var4 = 1 << arg0;
            if (~(this.field8607 & ~var4) != -1) {
               if (this.field8592 != arg1.field5221 || this.field8612 != arg1.field5216) {
                  throw new RuntimeException();
               }
            } else {
               this.field8592 = arg1.field5221;
               this.field8612 = arg1.field5216;
            }

            arg1.method2777(class61.field876[arg0], 36161, this.field8605);
            this.field8594[arg0] = arg1;
            this.field8607 |= var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8614[18] + arg0 + ',' + (arg1 != null ? field8614[0] : field8614[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method4442(int arg0) {
      try {
         ++field8604;
         if (arg0 != 0) {
            method4448(-113);
         }

         int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field8605);
         return var2 == 36053;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8614[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(IILcfa;II)V"
   )
   private final void method4443(int arg0, int arg1, class763 arg2, int arg3, int arg4) {
      try {
         ++field8600;
         if (~this.field8605 == 0) {
            throw new RuntimeException();
         } else {
            int var6;
            label43: {
               var6 = 1 << arg0;
               if (~(this.field8607 & ~var6) == -1) {
                  this.field8592 = arg2.field10884;
                  this.field8612 = arg2.field10884;
                  if (!client.field10022) {
                     break label43;
                  }
               }

               if (this.field8592 != arg2.field10884 || this.field8612 != arg2.field10884) {
                  throw new RuntimeException();
               }
            }

            arg2.method5507(arg3, this.field8605, class61.field876[arg0], 97, arg1);
            this.field8594[arg0] = arg2;
            if (arg4 != 36053) {
               this.method2921(45);
            }

            this.field8607 |= var6;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8614[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8614[0] : field8614[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method4444(int arg0, int arg1) {
      try {
         if (arg0 != 16) {
            this.method2922((byte)-69);
         }

         if (this.field8594[arg1] != null) {
            this.field8594[arg1].method69(-4249);
         }

         ++field8596;
         this.field8607 &= ~(1 << arg1);
         this.field8594[arg1] = null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8614[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2922(byte arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36160, this.field8599);
         ++field8595;
         this.field8593 |= 4;
         if (arg0 == -79) {
            this.field8605 = this.method4446((byte)100);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8614[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method4445(int arg0, byte arg1) {
      try {
         ++field8613;
         int var3 = 107 % ((arg1 - -41) / 36);
         if (~this.field8605 == 0) {
            throw new RuntimeException();
         } else {
            OpenGL.glDrawBuffer(class61.field876[arg0]);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8614[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2924(byte arg0) {
      try {
         ++field8589;
         OpenGL.glBindFramebufferEXT(36009, this.field8599);
         if (arg0 != 60) {
            this.field8593 = 82;
         }

         this.field8593 |= 2;
         this.field8605 = this.method4446((byte)125);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8614[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2920(int arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36160, 0);
         if (arg0 != 25796) {
            this.field8607 = -117;
         }

         ++field8608;
         this.field8593 &= -5;
         this.field8605 = this.method4446((byte)116);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8614[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field8610;
         this.field8598.method4919(4, this.field8599);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8614[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "c",
      descriptor = "(B)I"
   )
   private final int method4446(byte arg0) {
      try {
         ++field8611;
         if (arg0 < 92) {
            field8588 = null;
         }

         if (~(this.field8593 & 4) != -1) {
            return 36160;
         } else if ((2 & this.field8593) != 0) {
            return 36009;
         } else {
            return ~(1 & this.field8593) != -1 ? 36008 : -1;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8614[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(BLmn;I)V"
   )
   public final void method4447(byte arg0, class8 arg1, int arg2) {
      try {
         this.method4440(arg2, arg1, -63, 0);
         if (arg0 > 97) {
            ++field8601;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8614[2] + arg0 + ',' + (arg1 != null ? field8614[0] : field8614[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method4448(int arg0) {
      try {
         field8603 = null;
         if (arg0 == -1) {
            field8588 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8614[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method4449(int arg0, byte arg1) {
      try {
         ++field8591;
         if (arg1 < 40) {
            this.method4442(97);
         }

         if (~this.field8605 == 0) {
            throw new RuntimeException();
         } else {
            OpenGL.glReadBuffer(class61.field876[arg0]);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8614[20] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class603(class678 arg0) {
      try {
         if (!arg0.field9729) {
            throw new IllegalStateException("");
         } else {
            this.field8598 = arg0;
            OpenGL.glGenFramebuffersEXT(1, class576.field8139, 0);
            this.field8599 = class576.field8139[0];
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8614[10] + (arg0 != null ? field8614[0] : field8614[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4450(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4451(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
