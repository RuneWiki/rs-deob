import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class358 implements class447 {
   @OriginalMember(
      owner = "client!qga",
      name = "C",
      descriptor = "I"
   )
   private int field5523 = 0;
   @OriginalMember(
      owner = "client!qga",
      name = "f",
      descriptor = "[Ltea;"
   )
   private class323[] field5540 = new class323[9];
   @OriginalMember(
      owner = "client!qga",
      name = "g",
      descriptor = "I"
   )
   private int field5546 = -1;
   @OriginalMember(
      owner = "client!qga",
      name = "p",
      descriptor = "Lc;"
   )
   private class652 field5530;
   @OriginalMember(
      owner = "client!qga",
      name = "E",
      descriptor = "I"
   )
   private int field5524;
   @OriginalMember(
      owner = "client!qga",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5552 = new String[]{method2941(method2940("^BiD)\u0007")), method2941(method2940("APd\u0006")), method2941(method2940("T\u000b&D\u0010")), method2941(method2940("^BiD&\u0007")), method2941(method2940("^BiD/\u0007")), method2941(method2940("^BiD%\u0007")), method2941(method2940("^BiD.\u0007")), method2941(method2940("^BiD$\u0007")), method2941(method2940("^BiD+\u0007")), method2941(method2940("^BiD(\u0007")), method2941(method2940("^BiD,\u0007")), method2941(method2940("^BiD\"\u0007")), method2941(method2940("^BiD\u000bFKi\u0006\u0004U@ ")), method2941(method2940("^BiD \u0007")), method2941(method2940("^BiD=\u0007")), method2941(method2940("^BiDQFKa\u001eS\u0007")), method2941(method2940("^BiD#\u0007")), method2941(method2940("^BiD*\u0007")), method2941(method2940("^BiD'\u0007")), method2941(method2940("^BiD!\u0007")), method2941(method2940("^BiD<\u0007"))};
   @OriginalMember(
      owner = "client!qga",
      name = "l",
      descriptor = "I"
   )
   public static int field5525 = 0;
   @OriginalMember(
      owner = "client!qga",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5541 = null;
   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "I"
   )
   public static int field5547 = 0;
   @OriginalMember(
      owner = "client!qga",
      name = "k",
      descriptor = "Lfq;"
   )
   public static class374 field5551 = null;
   @OriginalMember(
      owner = "client!qga",
      name = "j",
      descriptor = "I"
   )
   public static int field5522;
   @OriginalMember(
      owner = "client!qga",
      name = "r",
      descriptor = "I"
   )
   public static int field5526;
   @OriginalMember(
      owner = "client!qga",
      name = "s",
      descriptor = "I"
   )
   public static int field5527;
   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "I"
   )
   public static int field5528;
   @OriginalMember(
      owner = "client!qga",
      name = "D",
      descriptor = "I"
   )
   public static int field5529;
   @OriginalMember(
      owner = "client!qga",
      name = "v",
      descriptor = "I"
   )
   public static int field5531;
   @OriginalMember(
      owner = "client!qga",
      name = "n",
      descriptor = "I"
   )
   private int field5532;
   @OriginalMember(
      owner = "client!qga",
      name = "d",
      descriptor = "I"
   )
   public static int field5533;
   @OriginalMember(
      owner = "client!qga",
      name = "m",
      descriptor = "I"
   )
   public static int field5534;
   @OriginalMember(
      owner = "client!qga",
      name = "e",
      descriptor = "I"
   )
   public static int field5535;
   @OriginalMember(
      owner = "client!qga",
      name = "t",
      descriptor = "I"
   )
   public static int field5536;
   @OriginalMember(
      owner = "client!qga",
      name = "y",
      descriptor = "I"
   )
   public static int field5537;
   @OriginalMember(
      owner = "client!qga",
      name = "w",
      descriptor = "I"
   )
   public static int field5538;
   @OriginalMember(
      owner = "client!qga",
      name = "q",
      descriptor = "I"
   )
   public static int field5539;
   @OriginalMember(
      owner = "client!qga",
      name = "o",
      descriptor = "I"
   )
   public static int field5542;
   @OriginalMember(
      owner = "client!qga",
      name = "u",
      descriptor = "I"
   )
   private int field5543;
   @OriginalMember(
      owner = "client!qga",
      name = "i",
      descriptor = "I"
   )
   public static int field5544;
   @OriginalMember(
      owner = "client!qga",
      name = "c",
      descriptor = "I"
   )
   private int field5545;
   @OriginalMember(
      owner = "client!qga",
      name = "h",
      descriptor = "I"
   )
   public static int field5548;
   @OriginalMember(
      owner = "client!qga",
      name = "B",
      descriptor = "I"
   )
   public static int field5549;
   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "I"
   )
   public static int field5550;

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public final void method2923(byte arg0) {
      try {
         ++field5537;
         OpenGL.glBindFramebufferEXT(36009, this.field5524);
         this.field5523 |= 2;
         if (arg0 == -58) {
            this.field5546 = this.method2924(arg0 ^ 23787);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5552[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "e",
      descriptor = "(I)I",
      line = 16
   )
   private final int method2924(int arg0) {
      try {
         ++field5534;
         if ((this.field5523 & 4) != 0) {
            return 36160;
         } else {
            if (arg0 != -23763) {
               this.method2936(-46);
            }

            if ((2 & this.field5523) != 0) {
               return 36009;
            } else {
               return ~(this.field5523 & 1) != -1 ? 36008 : -1;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5552[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "(B)V",
      line = 39
   )
   public final void method2925(byte arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36008, this.field5524);
         if (arg0 > -2) {
            this.method2930((byte)-89, -19);
         }

         ++field5536;
         this.field5523 |= 1;
         this.field5546 = this.method2924(-23763);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5552[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(I)V",
      line = 61
   )
   public final void method2926(int arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36160, this.field5524);
         if (arg0 == -21720) {
            ++field5544;
            this.field5523 |= 4;
            this.field5546 = this.method2924(-23763);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5552[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(Ldda;II)V",
      line = 75
   )
   public final void method2927(class688 arg0, int arg1, int arg2) {
      try {
         ++field5549;
         if (~this.field5546 == 0) {
            throw new RuntimeException();
         } else {
            if (arg2 <= 3) {
               field5525 = 108;
            }

            int var4 = 1 << arg1;
            if ((this.field5545 & ~var4) != 0) {
               if (~this.field5543 != ~arg0.field10225 || ~this.field5532 != ~arg0.field10222) {
                  throw new RuntimeException();
               }
            } else {
               this.field5543 = arg0.field10225;
               this.field5532 = arg0.field10222;
            }

            arg0.method5068(class306.field4785[arg1], this.field5546, (byte)59);
            this.field5540[arg1] = arg0;
            this.field5545 |= var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5552[0] + (arg0 != null ? field5552[2] : field5552[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "d",
      descriptor = "(I)V",
      line = 106
   )
   public final void method2928(int arg0) {
      try {
         ++field5528;
         if (arg0 != 6150) {
            this.method2937(25, 112);
         }

         OpenGL.glBindFramebufferEXT(36160, 0);
         this.field5523 &= -5;
         this.field5546 = this.method2924(arg0 + -29913);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5552[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "d",
      descriptor = "(B)Z",
      line = 120
   )
   public final boolean method2929(byte arg0) {
      try {
         ++field5550;
         if (arg0 != -80) {
            field5551 = null;
         }

         int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field5546);
         return var2 == 36053;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5552[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(BI)V",
      line = 143
   )
   public final void method2930(byte arg0, int arg1) {
      try {
         ++field5531;
         if (arg0 <= 90) {
            this.method2924(92);
         }

         if (~this.field5546 == 0) {
            throw new RuntimeException();
         } else {
            OpenGL.glDrawBuffer(class306.field4785[arg1]);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5552[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(IIILps;)V",
      line = 159
   )
   public final void method2931(int arg0, int arg1, int arg2, class553 arg3) {
      try {
         ++field5527;
         this.method2939(arg0, arg3, arg0 + -5125, arg2, arg1);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5552[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5552[2] : field5552[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(IILbka;)V",
      line = 171
   )
   public final void method2932(int arg0, int arg1, class396 arg2) {
      try {
         ++field5539;
         this.method2935(arg1, arg2, 4, 0);
         if (arg0 != 10409) {
            this.method2933(125, -85);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5552[17] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5552[2] : field5552[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(II)V",
      line = 182
   )
   public final void method2933(int arg0, int arg1) {
      try {
         if (this.field5540[arg0] != null) {
            this.field5540[arg0].method1683((byte)-117);
         }

         ++field5548;
         this.field5545 &= ~(1 << arg0);
         if (arg1 != -16640) {
            this.method2929((byte)-111);
         }

         this.field5540[arg0] = null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5552[20] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "c",
      descriptor = "(B)V",
      line = 197
   )
   public static void method2934(byte arg0) {
      try {
         if (arg0 != 1) {
            method2934((byte)-10);
         }

         field5551 = null;
         field5541 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5552[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "<init>",
      descriptor = "(Lc;)V",
      line = 350
   )
   public class358(class652 arg0) {
      try {
         if (!arg0.field9737) {
            throw new IllegalStateException("");
         } else {
            this.field5530 = arg0;
            OpenGL.glGenFramebuffersEXT(1, class781.field11445, 0);
            this.field5524 = class781.field11445[0];
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5552[15] + (arg0 != null ? field5552[2] : field5552[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(ILbka;II)V",
      line = 218
   )
   private final void method2935(int arg0, class396 arg1, int arg2, int arg3) {
      try {
         ++field5526;
         if (~this.field5546 == 0) {
            throw new RuntimeException();
         } else {
            int var5;
            label43: {
               var5 = 1 << arg0;
               if ((~var5 & this.field5545) == 0) {
                  this.field5543 = arg1.field6215;
                  this.field5532 = arg1.field6218;
                  if (!client.field1786) {
                     break label43;
                  }
               }

               if (~this.field5543 != ~arg1.field6215 || this.field5532 != arg1.field6218) {
                  throw new RuntimeException();
               }
            }

            arg1.method3191(class306.field4785[arg0], arg3, this.field5546, (byte)125);
            this.field5540[arg0] = arg1;
            this.field5545 |= var5;
            if (arg2 != 4) {
               this.method2932(8, 81, (class396)null);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5552[5] + arg0 + ',' + (arg1 != null ? field5552[2] : field5552[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "(I)V",
      line = 250
   )
   public final void method2936(int arg0) {
      try {
         ++field5533;
         OpenGL.glBindFramebufferEXT(36009, 0);
         this.field5523 &= -3;
         this.field5546 = this.method2924(-23763);
         if (arg0 != -19025) {
            this.method2937(-36, 98);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5552[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "(II)V",
      line = 264
   )
   public final void method2937(int arg0, int arg1) {
      try {
         ++field5542;
         if (~this.field5546 == arg1) {
            throw new RuntimeException();
         } else {
            OpenGL.glReadBuffer(class306.field4785[arg0]);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5552[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "c",
      descriptor = "(I)V",
      line = 282
   )
   public final void method2938(int arg0) {
      try {
         ++field5538;
         if (arg0 >= -14) {
            this.method2937(38, -67);
         }

         OpenGL.glBindFramebufferEXT(36008, 0);
         this.field5523 &= -2;
         this.field5546 = this.method2924(-23763);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5552[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "finalize",
      descriptor = "()V",
      line = 308
   )
   protected final void finalize() throws Throwable {
      try {
         ++field5535;
         this.field5530.method4740(512, this.field5524);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5552[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(ILps;III)V",
      line = 318
   )
   private final void method2939(int arg0, class553 arg1, int arg2, int arg3, int arg4) {
      try {
         ++field5522;
         if (this.field5546 == -1) {
            throw new RuntimeException();
         } else {
            if (arg2 != -5125) {
               this.method2931(41, 87, 84, (class553)null);
            }

            int var6 = 1 << arg4;
            if (~(this.field5545 & ~var6) != -1) {
               if (~this.field5543 != ~arg1.field8270 || ~this.field5532 != ~arg1.field8270) {
                  throw new RuntimeException();
               }
            } else {
               this.field5532 = arg1.field8270;
               this.field5543 = arg1.field8270;
            }

            arg1.method4203((byte)-79, arg3, arg0, this.field5546, class306.field4785[arg4]);
            this.field5540[arg4] = arg1;
            this.field5545 |= var6;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field5552[6] + arg0 + ',' + (arg1 != null ? field5552[2] : field5552[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2940(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2941(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
