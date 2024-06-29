import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class414 {
   @OriginalMember(
      owner = "client!fu",
      name = "h",
      descriptor = "I"
   )
   private int field5822;
   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "J"
   )
   private long field5824;
   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5830 = new String[]{method3140(method3139("U\u0017\u0006'-")), method3140(method3139("HL\u0006Nx")), method3140(method3139("@LDe")), method3140(method3139("HL\u0006Mx")), method3140(method3139("HL\u0006Lx")), method3140(method3139("HL\u0006Ax")), method3140(method3139("HL\u0006Ox")), method3140(method3139("HL\u0006Jx")), method3140(method3139("HL\u0006Hx")), method3140(method3139("}QIm5\\\u0019D`>EPFnpHXAe5J\u0003")), method3140(method3139("HL\u000659@P\\7x")), method3140(method3139("HL\u0006Kx"))};
   @OriginalMember(
      owner = "client!fu",
      name = "d",
      descriptor = "I"
   )
   public static int field5819 = 0;
   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "I"
   )
   public static int field5820;
   @OriginalMember(
      owner = "client!fu",
      name = "g",
      descriptor = "I"
   )
   public static int field5821;
   @OriginalMember(
      owner = "client!fu",
      name = "f",
      descriptor = "I"
   )
   public static int field5823;
   @OriginalMember(
      owner = "client!fu",
      name = "e",
      descriptor = "I"
   )
   public static int field5825;
   @OriginalMember(
      owner = "client!fu",
      name = "i",
      descriptor = "I"
   )
   public static int field5826;
   @OriginalMember(
      owner = "client!fu",
      name = "k",
      descriptor = "I"
   )
   public static int field5827;
   @OriginalMember(
      owner = "client!fu",
      name = "j",
      descriptor = "I"
   )
   public static int field5828;
   @OriginalMember(
      owner = "client!fu",
      name = "c",
      descriptor = "I"
   )
   public static int field5829;

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(BLsfa;)V"
   )
   private final void method3131(byte arg0, class727 arg1) {
      try {
         this.field5824 |= (long)(arg1.field10649 << class727.field10656 * this.field5822++);
         if (arg0 <= -85) {
            ++field5825;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5830[1] + arg0 + ',' + (arg1 != null ? field5830[0] : field5830[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(Lor;B[Lmba;)Lon;"
   )
   public static final class356 method3132(class670 arg0, byte arg1, class445[] arg2) {
      boolean var3 = client.field4273;

      try {
         ++field5820;
         int var4 = 0;
         if (var3) {
            if (arg2[var4] == null || ~arg2[var4].field6161 >= -1L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            if (var4 >= arg2.length) {
               int var5 = -122 % ((86 - arg1) / 38);
               long var6 = OpenGL.glCreateProgramObjectARB();
               int var8 = 0;
               if (var3) {
                  break;
               }

               if (var3) {
                  OpenGL.glAttachObjectARB(var6, arg2[var8].field6161);
                  ++var8;
               }

               while(true) {
                  while(var8 < arg2.length) {
                     OpenGL.glAttachObjectARB(var6, arg2[var8].field6161);
                     ++var8;
                  }

                  OpenGL.glLinkProgramARB(var6);
                  OpenGL.glGetObjectParameterivARB(var6, 35714, class312.field4139, 0);
                  if (!var3) {
                     if (~class312.field4139[0] == -1) {
                        if (~class312.field4139[0] == -1) {
                           System.out.println(field5830[9]);
                        }

                        OpenGL.glGetObjectParameterivARB(var6, 35716, class312.field4139, 1);
                        if (~class312.field4139[1] < -2) {
                           byte[] var9 = new byte[class312.field4139[1]];
                           OpenGL.glGetInfoLogARB(var6, class312.field4139[1], class312.field4139, 0, var9, 0);
                           System.out.println(new String(var9));
                        }

                        if (~class312.field4139[0] == -1) {
                           int var10 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var6, arg2[var10].field6161);
                              ++var10;
                           }

                           while(true) {
                              while(arg2.length > var10) {
                                 OpenGL.glDetachObjectARB(var6, arg2[var10].field6161);
                                 ++var10;
                              }

                              OpenGL.glDeleteObjectARB(var6);
                              if (!var3) {
                                 return null;
                              }

                              ++var10;
                           }
                        }
                     }

                     return new class356(arg0, var6, arg2);
                  }

                  ++var8;
               }
            }

            if (arg2[var4] == null || ~arg2[var4].field6161 >= -1L) {
               break;
            }

            ++var4;
         }

         return null;
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field5830[8] + (arg0 != null ? field5830[0] : field5830[2]) + ',' + arg1 + ',' + (arg2 != null ? field5830[0] : field5830[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3133(byte arg0) {
      try {
         int var2 = -27 % ((-43 - arg0) / 47);
         ++field5828;
         return this.field5822;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5830[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3134(boolean arg0) {
      try {
         if (arg0) {
            field5819 = 124;
         }

         ++field5826;
         if (class356.field5079 == null) {
            class167 var1 = new class167();
            byte[] var2 = var1.method1317(true, 16, 128, 128);
            class356.field5079 = class622.method4524(var2, false, 103);
         }

         if (class771.field11117 == null) {
            class15 var3 = new class15();
            byte[] var4 = var3.method115(128, (byte)117, 16, 128);
            class771.field11117 = class622.method4524(var4, false, 93);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5830[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "(IB)Lsfa;"
   )
   public final class727 method3135(int arg0, byte arg1) {
      try {
         ++field5823;
         int var3 = -93 % ((59 - arg1) / 60);
         return class727.method5292(this.method3137(arg0, -8885), -13504);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5830[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "(II)Z"
   )
   public static final boolean method3136(int arg0, int arg1) {
      try {
         ++field5827;
         if (arg1 <= 50) {
            field5819 = -63;
         }

         return ~arg0 == -22 || arg0 == 20 || arg0 == 51 || arg0 == 47 || ~arg0 == -31 || ~arg0 == -61 || ~arg0 == -14;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5830[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "<init>",
      descriptor = "(Lsfa;)V"
   )
   public class414(class727 arg0) {
      try {
         this.field5822 = 1;
         this.field5824 = (long)arg0.field10649;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5830[10] + (arg0 != null ? field5830[0] : field5830[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "<init>",
      descriptor = "([Lsfa;)V"
   )
   public class414(class727[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method3137(int arg0, int arg1) {
      try {
         ++field5821;
         if (arg1 != -8885) {
            this.field5822 = -128;
         }

         return (int)(this.field5824 >> class727.field10656 * arg0) & 15;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5830[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method3138(int arg0, byte arg1) {
      try {
         ++field5829;
         class446 var2 = class635.method4607(121, (long)arg0, 7);
         var2.method3312(-121);
         if (arg1 != -59) {
            field5819 = -50;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5830[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3139(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3140(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
