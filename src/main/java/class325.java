import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class325 implements class776 {
   @OriginalMember(
      owner = "client!le",
      name = "F",
      descriptor = "[Lcg;"
   )
   private class147[] field4340 = new class147[9];
   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "I"
   )
   private int field4361 = -1;
   @OriginalMember(
      owner = "client!le",
      name = "v",
      descriptor = "I"
   )
   private int field4363 = 0;
   @OriginalMember(
      owner = "client!le",
      name = "g",
      descriptor = "Lor;"
   )
   private class670 field4343;
   @OriginalMember(
      owner = "client!le",
      name = "B",
      descriptor = "I"
   )
   private int field4347;
   @OriginalMember(
      owner = "client!le",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4369 = new String[]{method2464(method2463("(9 IH")), method2464(method2463("*)bj")), method2464(method2463("?r (\u001d")), method2464(method2463("dt")), method2464(method2463("(9 AH")), method2464(method2463("dq0&\\'3b;\u0006\":h`\u0006z")), method2464(method2463("x?aj]'?me\u0003'b")), method2464(method2463("x?aj]\":h`\u0006\"b")), method2464(method2463("(9 WH")), method2464(method2463("(9 JH")), method2464(method2463("(9 DH")), method2464(method2463("(9 KH")), method2464(method2463("(9 EH")), method2464(method2463("(9 TH")), method2464(method2463("(9 BH")), method2464(method2463("(9 `\t*=bo\u001a!t")), method2464(method2463("(9 @H")), method2464(method2463("(9 LH")), method2464(method2463("(9 :\t*5z8H")), method2464(method2463("(9 NH")), method2464(method2463("(9 HH")), method2464(method2463("(9 VH")), method2464(method2463("(9 MH")), method2464(method2463("(9 OH")), method2464(method2463("(9 CH")), method2464(method2463("(9 GH"))};
   @OriginalMember(
      owner = "client!le",
      name = "l",
      descriptor = "I"
   )
   public static int field4354 = -1;
   @OriginalMember(
      owner = "client!le",
      name = "u",
      descriptor = "I"
   )
   public static int field4365 = 4;
   @OriginalMember(
      owner = "client!le",
      name = "c",
      descriptor = "Lbga;"
   )
   public static class378 field4346 = new class378(7, 9);
   @OriginalMember(
      owner = "client!le",
      name = "o",
      descriptor = "Lbga;"
   )
   public static class378 field4366 = new class378(91, 6);
   @OriginalMember(
      owner = "client!le",
      name = "t",
      descriptor = "I"
   )
   private int field4336;
   @OriginalMember(
      owner = "client!le",
      name = "q",
      descriptor = "I"
   )
   public static int field4337;
   @OriginalMember(
      owner = "client!le",
      name = "f",
      descriptor = "I"
   )
   public static int field4338;
   @OriginalMember(
      owner = "client!le",
      name = "i",
      descriptor = "I"
   )
   public static int field4339;
   @OriginalMember(
      owner = "client!le",
      name = "w",
      descriptor = "I"
   )
   public static int field4341;
   @OriginalMember(
      owner = "client!le",
      name = "y",
      descriptor = "I"
   )
   public static int field4342;
   @OriginalMember(
      owner = "client!le",
      name = "x",
      descriptor = "I"
   )
   public static int field4344;
   @OriginalMember(
      owner = "client!le",
      name = "D",
      descriptor = "I"
   )
   public static int field4345;
   @OriginalMember(
      owner = "client!le",
      name = "n",
      descriptor = "I"
   )
   public static int field4348;
   @OriginalMember(
      owner = "client!le",
      name = "m",
      descriptor = "I"
   )
   public static int field4349;
   @OriginalMember(
      owner = "client!le",
      name = "p",
      descriptor = "I"
   )
   public static int field4350;
   @OriginalMember(
      owner = "client!le",
      name = "C",
      descriptor = "I"
   )
   public static int field4351;
   @OriginalMember(
      owner = "client!le",
      name = "r",
      descriptor = "I"
   )
   public static int field4352;
   @OriginalMember(
      owner = "client!le",
      name = "h",
      descriptor = "I"
   )
   private int field4353;
   @OriginalMember(
      owner = "client!le",
      name = "e",
      descriptor = "I"
   )
   public static int field4355;
   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "I"
   )
   public static int field4356;
   @OriginalMember(
      owner = "client!le",
      name = "G",
      descriptor = "I"
   )
   public static int field4357;
   @OriginalMember(
      owner = "client!le",
      name = "d",
      descriptor = "I"
   )
   public static int field4358;
   @OriginalMember(
      owner = "client!le",
      name = "s",
      descriptor = "I"
   )
   public static int field4359;
   @OriginalMember(
      owner = "client!le",
      name = "j",
      descriptor = "I"
   )
   private int field4360;
   @OriginalMember(
      owner = "client!le",
      name = "E",
      descriptor = "I"
   )
   public static int field4362;
   @OriginalMember(
      owner = "client!le",
      name = "k",
      descriptor = "I"
   )
   public static int field4364;
   @OriginalMember(
      owner = "client!le",
      name = "A",
      descriptor = "[Lbo;"
   )
   public static class763[] field4368;
   @OriginalMember(
      owner = "client!le",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field4367;

   @OriginalMember(
      owner = "client!le",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2445(int arg0) {
      try {
         if (arg0 != -511) {
            this.field4353 = 68;
         }

         OpenGL.glBindFramebufferEXT(36008, this.field4347);
         ++field4344;
         this.field4363 |= 1;
         this.field4361 = this.method2449((byte)109);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4369[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2446(int arg0, byte arg1) {
      try {
         if (this.field4340[arg0] != null) {
            this.field4340[arg0].method317(0);
         }

         if (arg1 == 81) {
            ++field4362;
            this.field4336 &= ~(1 << arg0);
            this.field4340[arg0] = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4369[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method2447(int arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36160, 0);
         ++field4352;
         this.field4363 &= -5;
         if (arg0 != -21057) {
            this.field4353 = -23;
         }

         this.field4361 = this.method2449((byte)109);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4369[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2448(int arg0) {
      try {
         field4366 = null;
         field4367 = null;
         if (arg0 != -1) {
            method2448(-33);
         }

         field4368 = null;
         field4346 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4369[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "c",
      descriptor = "(B)I"
   )
   private final int method2449(byte arg0) {
      try {
         ++field4350;
         if (arg0 != 109) {
            return 51;
         } else if ((this.field4363 & 4) != 0) {
            return 36160;
         } else if ((2 & this.field4363) != 0) {
            return 36009;
         } else {
            return (1 & this.field4363) != 0 ? 36008 : -1;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4369[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2450(byte arg0) {
      try {
         ++field4351;
         OpenGL.glBindFramebufferEXT(36009, 0);
         this.field4363 &= -3;
         if (arg0 >= 17) {
            this.field4361 = this.method2449((byte)109);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4369[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(IZLaha;)V"
   )
   public static final void method2451(int param0, boolean param1, class404 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(ILfh;BI)V"
   )
   public final void method2452(int arg0, class681 arg1, byte arg2, int arg3) {
      try {
         ++field4364;
         int var5 = 103 / ((52 - arg2) / 41);
         this.method2458(0, arg0, arg3, -1, arg1);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4369[0] + arg0 + ',' + (arg1 != null ? field4369[2] : field4369[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method2453(int arg0) {
      try {
         ++field4339;
         int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field4361);
         if (arg0 < 60) {
            this.method2447(2);
         }

         return ~var2 == -36054;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4369[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2454(int arg0) {
      try {
         ++field4358;
         OpenGL.glBindFramebufferEXT(36160, this.field4347);
         this.field4363 |= 4;
         if (arg0 == -18096) {
            this.field4361 = this.method2449((byte)109);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4369[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(ILmj;I)V"
   )
   public final void method2455(int arg0, class684 arg1, int arg2) {
      try {
         int var4 = -38 / ((arg2 - 13) / 39);
         ++field4348;
         this.method2459(0, 36008, arg1, arg0);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4369[9] + arg0 + ',' + (arg1 != null ? field4369[2] : field4369[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2456(int arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36008, 0);
         ++field4345;
         if (arg0 != 14461) {
            this.method2455(55, (class684)null, 80);
         }

         this.field4363 &= -2;
         this.field4361 = this.method2449((byte)109);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4369[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2457(byte arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36009, this.field4347);
         if (arg0 <= 25) {
            this.method2445(85);
         }

         ++field4338;
         this.field4363 |= 2;
         this.field4361 = this.method2449((byte)109);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4369[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(IIIILfh;)V"
   )
   private final void method2458(int arg0, int arg1, int arg2, int arg3, class681 arg4) {
      try {
         ++field4355;
         if (this.field4361 == -1) {
            throw new RuntimeException();
         } else {
            int var6;
            label41: {
               var6 = 1 << arg2;
               if (~(~var6 & this.field4336) == arg3) {
                  this.field4360 = arg4.field10000;
                  this.field4353 = arg4.field10000;
                  if (!client.field4273) {
                     break label41;
                  }
               }

               if (~this.field4360 != ~arg4.field10000 || ~this.field4353 != ~arg4.field10000) {
                  throw new RuntimeException();
               }
            }

            arg4.method4982(this.field4361, arg0, class296.field3885[arg2], -121, arg1);
            this.field4340[arg2] = arg4;
            this.field4336 |= var6;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4369[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4369[2] : field4369[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(IILmj;I)V"
   )
   private final void method2459(int arg0, int arg1, class684 arg2, int arg3) {
      try {
         ++field4341;
         if (arg1 == 36008) {
            if (~this.field4361 == 0) {
               throw new RuntimeException();
            } else {
               int var5;
               label45: {
                  var5 = 1 << arg3;
                  if (~(this.field4336 & ~var5) == -1) {
                     this.field4353 = arg2.field10044;
                     this.field4360 = arg2.field10040;
                     if (!client.field4273) {
                        break label45;
                     }
                  }

                  if (~this.field4360 != ~arg2.field10040 || this.field4353 != arg2.field10044) {
                     throw new RuntimeException();
                  }
               }

               arg2.method5002(-6, class296.field3885[arg3], this.field4361, arg0);
               this.field4340[arg3] = arg2;
               this.field4336 |= var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4369[25] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4369[2] : field4369[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field4343.method4839(0, this.field4347);
         ++field4356;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4369[15] + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2460(int arg0, int arg1) {
      try {
         ++field4337;
         if (~this.field4361 == 0) {
            throw new RuntimeException();
         } else {
            OpenGL.glDrawBuffer(class296.field3885[arg1]);
            if (arg0 != -6052) {
               this.field4360 = -94;
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4369[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(ZILpaa;)V"
   )
   public final void method2461(boolean arg0, int arg1, class655 arg2) {
      try {
         ++field4357;
         if (~this.field4361 == 0) {
            throw new RuntimeException();
         } else {
            int var4 = 1 << arg1;
            if (~(~var4 & this.field4336) != -1) {
               if (this.field4360 != arg2.field9159 || this.field4353 != arg2.field9164) {
                  throw new RuntimeException();
               }
            } else {
               this.field4360 = arg2.field9159;
               this.field4353 = arg2.field9164;
            }

            arg2.method4733((byte)-120, class296.field3885[arg1], this.field4361);
            this.field4340[arg1] = arg2;
            this.field4336 |= var4;
            if (!arg0) {
               method2448(-109);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4369[24] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4369[2] : field4369[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method2462(boolean arg0, int arg1) {
      try {
         ++field4342;
         if (this.field4361 == -1) {
            throw new RuntimeException();
         } else {
            if (!arg0) {
               field4346 = null;
            }

            OpenGL.glReadBuffer(class296.field3885[arg1]);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4369[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class325(class670 arg0) {
      try {
         if (!arg0.field9857) {
            throw new IllegalStateException("");
         } else {
            this.field4343 = arg0;
            OpenGL.glGenFramebuffersEXT(1, class415.field5840, 0);
            this.field4347 = class415.field5840[0];
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4369[18] + (arg0 != null ? field4369[2] : field4369[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2463(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2464(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
