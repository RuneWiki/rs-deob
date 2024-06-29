import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class695 extends class529 {
   @OriginalMember(
      owner = "client!gba",
      name = "n",
      descriptor = "Lae;"
   )
   private class262 field10448;
   @OriginalMember(
      owner = "client!gba",
      name = "h",
      descriptor = "Lmv;"
   )
   private class393 field10443;
   @OriginalMember(
      owner = "client!gba",
      name = "l",
      descriptor = "[F"
   )
   private float[] field10451;
   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10453 = new String[]{method5052(method5051("r1\u001d/*=")), method5052(method5051("r1\u001d/$=")), method5052(method5051("r1\u001d/)=")), method5052(method5051("r1\u001d//=")), method5052(method5051("n}R/\u0011")), method5052(method5051("4r=S.c#M/\\\u001f\u001c,U%Z\u001d\\!-G\u0011#q\u0003f:\bh\u0003{\f\u0015o\u001at!\u0015`\u0002ahv@8A\u00015CL5:,n\u001f5s\\!L5s\\!Q5%\u0019s\u0018p+Rq\u0003f:\bh\u0003{hv@8A\u00015CL5:?n\u0000z&\u000e!L5s\\!Q5%\u0019s\u0018p+Rb\u0003y<\u000e:fT\u0007(S%Ws\\h8p+?n\u0003g7\\!L5n\\w\tg'\u0019yBa6\u0004b\u0003z!\u0018Z\\HhvN9A\u0003)UL5<?n\u0000z&\u000e!L5s\\!Q5!\u0019r\u0019y'Rb\u0003y<\u000e:fZ\u0006(Q9As\\n8p+?n\u0003g7L!L5n\\s\tf&\u0010uBa6\u0004b\u0003z!\u0018Z\\HhvN9A\u0003)UL5<(d\u0014V<\u0013s\b$s\\!Q5!\u0019r\u0019y'Ru\tm0\u0013n\u001eq\bM\\W\u001f\u001c)U<@\u0007\\!\u0003S<\u001bB\u0003z!\u0018!L5sA!\u001ep \tm\u0018;5\u0013f\u000fz<\u000eeW\u001f\u0003=S-Xs\\!\u0018|>\u0019!L5s\\!L5sA!\u001cg<\u001bs\rx}\u0010n\u000ft?'7YHhvQ-G\u00121!L5'\ts\u000e`?\u0019o\u000fps\\!Q5#\u000en\u000bg2\u0011/\u0000z0\u001dm7#g!:fE\u0012.@!5s\\m\u0005r;\b@\u0001w:\u0019o\u00185n\\q\u001ez4\u000e`\u0001;?\u0013b\ry\bJ71.svQ-G\u00121!L5#1`\u0018g:\u0004ZXHs\\!Q5(\\r\u0018t'\u0019/\u0001t'\u000eh\u0014;#\u000en\u0006p0\bh\u0003{s\u0001:fE\u0012.@!5s\\l\u001aX2\bs\u0005m\bH\\L5n\\zLf'\u001du\t;>\u001du\u001e|+Rl\u0003q6\u0010w\u0005p$\\|W\u001f\u0003=S-Xs\\!\u0005c\u001e\u001du\u001e|+'515sA!\u00175 \b`\u0018p}\u0011`\u0018g:\u0004/\u0018p+\bt\u001ep\bM\\LhhvQ-G\u00121!L5'\u0019y!t'\u000eh\u0014Ng!!L(s\u0007!\u001fa2\bdBx2\bs\u0005m}\bd\u0014a&\u000ed7%\u000e\\|W\u001f\u0003=S-Xs\\!\n[<\u0015r\tNeH\\L5sA!\u00175#\u000en\u000bg2\u0011/\u0000z0\u001dm7%}R7_Hs\u0001:fA\u00161QL5s\\o\u0003| \u0019-Lc:\u0019v<z P!\u001bz!\u0010e<z P!\u0018p+?n\u0003g7G\u000b-Q\u0017.D?Fs\u0012n\u0005f6=e\bghvE<!s\\!\u001a|6\u000bQ\u0003f}\u0004-Lx%1`\u0018g:\u0004Z\\H\u007f\\h<z G\u000b(Eg\\!Lc:\u0019v<z Rx@5>\nL\ra!\u0015y7$\u000eP!\u0005E<\u000f:fQ\u0003H!L5%\u0015d\u001bE<\u000f/\u00169s\u0011w!t'\u000eh\u0014Na!-L|\u0003\u0013rW\u001f\u0017,5L5s\nh\tb\u0003\u0013rBb\u007f\\l\u001aX2\bs\u0005m\bO\\@5:,n\u001f.Y1N:5s\\n*z4?n\u0003g7Ry@5~\nh\tb\u0003\u0013rBohvE<!s\\!\u001bz!\u0010e<z Ry@5:\nL\ra!\u0015y7%\u000eP!\u001a|6\u000bQ\u0003fhvE<!s\\!\u001bz!\u0010e<z Rx@5:\nL\ra!\u0015y7$\u000eP!\u001a|6\u000bQ\u0003fhvE<!s\\!\u001bz!\u0010e<z R{@5:\nL\ra!\u0015y7'\u000eP!\u001a|6\u000bQ\u0003fhvE<!s\\!\u001bz!\u0010e<z Rv@5:\nL\ra!\u0015y7&\u000eP!\u001a|6\u000bQ\u0003fhv@(Qs\\!\u0002z:\u000fdBm\u007f\\v\u0003g?\u0018Q\u0003f}\u0004-Lb<\u000em\bE<\u000f/\u0016.\u0000)CL5s\u0012n\u0005f6Rx@5$\u0013s\u0000q\u0003\u0013rBo\u007f\\v\u0003g?\u0018Q\u0003f}\u0004:!@\u001f\\!L{<\u0015r\t9s\u0012n\u0005f6P!\\;cL1]'aL6\\&bN4W\u001f\u0015.BL5s\u0012n\u0005f6P!\u0002z:\u000fdW\u001f\u001e)ML5s\u0012n\u0005f6P!\u0002z:\u000fd@5eH:fT\u00010!L5=\u0013h\u001fp\u0012\u0018e\u001e;+P!\u0002z:\u000fdBmhvL#Cs\\!\u0002z:\u000fdBm\u007f\\g\"z:\u000fd7{<\u0015r\tT7\u0018sBm\u000eRyW\u001f\u0012.ML5s\u0012n\u0005f6=e\bg}\u0004-L{<\u0015r\t;*G\u000b!Z\u0005\\!L{<\u0015r\t;*P!\n[<\u0015r\tN=\u0013h\u001fp\u0012\u0018e\u001e;+!/\u0015.Y1T 5s\\o\u0003| \u0019-L{<\u0015r\t9s\bt\u001ew&\u0010d\u0002v6RyW\u001f\u0017,5L5s\bd\u0014V<\u0013s\b;+P!\u0018p+1`\u0018g:\u0004Z\\H\u007f\\h8p+?n\u0003g7G\u000b(Eg\\!La6\u0004B\u0003z!\u0018/\u00159s\bd\u0014X2\bs\u0005m\bM\\@5:(d\u0014V<\u0013s\b.Y=E(5s\\n8p+?n\u0003g7L/\u0014l\u007f\\u\tm\u0010\u0013n\u001eq\u007f\\o\u0003| \u0019:fX\u001c*!L5<(d\u0014V<\u0013s\b%}\u0006-L%hvL#Cs\\!\u0003A6\u0004B\u0003z!\u00181Bb\u007f\\0W\u001f\u001e)ML5s\u0013U\tm\u0010\u0013n\u001eqbRy\u00159s\bd\u0014V<\u0013s\b9sL/]'fG\u000b!Z\u0005\\!Lz\u0007\u0019y/z<\u000ee];)\u000b-La:\u0011dBm+\u0004vW\u001f\u001e)ML5s\u0013B\u0003y<\tsBm*\u0006-L|\u0010\u0013m\u0003`!P!\u0000|4\u0014u-x1\u0015d\u0002ahvL#Cs\\!\u0003V<\u0010n\u0019g}\u000b-L|\u0010\u0013m\u0003`!RvW\u001f\u00162E")), method5052(method5051("{&\u0010m")), method5052(method5051("r1\u001d/P|=\u0015uR=")), method5052(method5051("r1\u001d/%=")), method5052(method5051("r1\u001d/+=")), method5052(method5051("r1\u001d/-=")), method5052(method5051("r1\u001d/(=")), method5052(method5051("r1\u001d/.="))};
   @OriginalMember(
      owner = "client!gba",
      name = "o",
      descriptor = "I"
   )
   public static int field10438 = 16777215;
   @OriginalMember(
      owner = "client!gba",
      name = "f",
      descriptor = "Lsd;"
   )
   public static class101 field10446 = new class101(125, -1);
   @OriginalMember(
      owner = "client!gba",
      name = "s",
      descriptor = "F"
   )
   private float field10442;
   @OriginalMember(
      owner = "client!gba",
      name = "g",
      descriptor = "I"
   )
   public static int field10437;
   @OriginalMember(
      owner = "client!gba",
      name = "k",
      descriptor = "I"
   )
   public static int field10440;
   @OriginalMember(
      owner = "client!gba",
      name = "e",
      descriptor = "I"
   )
   public static int field10441;
   @OriginalMember(
      owner = "client!gba",
      name = "j",
      descriptor = "I"
   )
   public static int field10444;
   @OriginalMember(
      owner = "client!gba",
      name = "q",
      descriptor = "I"
   )
   public static int field10445;
   @OriginalMember(
      owner = "client!gba",
      name = "m",
      descriptor = "I"
   )
   public static int field10447;
   @OriginalMember(
      owner = "client!gba",
      name = "r",
      descriptor = "I"
   )
   private int field10449;
   @OriginalMember(
      owner = "client!gba",
      name = "d",
      descriptor = "I"
   )
   public static int field10450;
   @OriginalMember(
      owner = "client!gba",
      name = "i",
      descriptor = "I"
   )
   public static int field10452;
   @OriginalMember(
      owner = "client!gba",
      name = "p",
      descriptor = "Lll;"
   )
   private class383 field10439;

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method878(int arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         ++field10444;
         if (this.field10439 != null) {
            this.field10439.method2948('\u0000', (byte)-69);
            super.field7700.method4828(1, (byte)66);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7700.field9935.method1649(arg0 + -114), arg0);
            OpenGL.glMatrixMode(5888);
            super.field7700.method4828(0, (byte)66);
            if (super.field7700.field9898 != this.field10449) {
               int var4 = super.field7700.field9898 % 5000 * 128 / 5000;
               int var5 = 0;
               if (var3 != 0) {
                  OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field10451, var4);
                  var4 += 2;
                  ++var5;
               }

               while(true) {
                  int var10000;
                  if (~var5 <= -65) {
                     var10000 = this.field10448.field3579;
                     if (var3 == 0) {
                        label28: {
                           if (var10000 != 0) {
                              this.field10442 = (float)(super.field7700.field9898 % 4000) / 4000.0F;
                              if (var3 == 0) {
                                 break label28;
                              }
                           }

                           OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                        }

                        this.field10449 = super.field7700.field9898;
                        return;
                     }
                  } else {
                     var10000 = 34336;
                  }

                  OpenGL.glProgramLocalParameter4fvARB(var10000, var5, this.field10451, var4);
                  var4 += 2;
                  ++var5;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10453[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method871(int arg0, int arg1, int arg2) {
      int var4 = client.field4530;

      try {
         ++field10452;
         if (this.field10439 != null) {
            label70: {
               super.field7700.method4828(1, (byte)66);
               if ((128 & arg0) == 0) {
                  if (~(1 & arg2) != -2) {
                     label65: {
                        if (this.field10448.field3579) {
                           super.field7700.method4818((byte)65, this.field10448.field3586);
                           if (var4 == 0) {
                              break label65;
                           }
                        }

                        super.field7700.method4818((byte)53, this.field10448.field3580[0]);
                     }

                     OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                     if (var4 == 0) {
                        break label70;
                     }
                  }

                  if (this.field10448.field3579) {
                     super.field7700.method4818((byte)-128, this.field10448.field3586);
                     OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field10442, 0.0F, 0.0F, 1.0F);
                     if (var4 == 0) {
                        break label70;
                     }
                  }

                  int var5 = super.field7700.field9898 % 4000 * 16 / 4000;
                  super.field7700.method4818((byte)-120, this.field10448.field3580[var5]);
                  OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                  if (var4 == 0) {
                     break label70;
                  }
               }

               super.field7700.method4818((byte)-123, (class689)null);
            }

            label52: {
               super.field7700.method4828(0, (byte)66);
               if (~(arg0 & 64) == -1) {
                  class115.field1369[2] = super.field7700.field9955 * super.field7700.field10009;
                  class115.field1369[0] = super.field7700.field9978 * super.field7700.field10009;
                  class115.field1369[1] = super.field7700.field10017 * super.field7700.field10009;
                  OpenGL.glProgramLocalParameter4fvARB(34336, 66, class115.field1369, 0);
                  if (var4 == 0) {
                     break label52;
                  }
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            label78: {
               int var6 = arg0 & 3;
               if (var6 == 2) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                  if (var4 == 0) {
                     break label78;
                  }
               }

               if (var6 != 3) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                  if (var4 == 0) {
                     break label78;
                  }
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }

            int var7 = 126 / ((arg1 - 75) / 37);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10453[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method5048(byte arg0) {
      try {
         this.field10439 = new class383(super.field7700, 2);
         ++field10447;
         this.field10439.method2949(false, 0);
         super.field7700.method4828(1, (byte)66);
         super.field7700.method4782(-16777216, 80);
         super.field7700.method4849(7681, 34161, 260);
         super.field7700.method4823(34166, 0, 770, (byte)95);
         super.field7700.method4828(0, (byte)66);
         OpenGL.glBindProgramARB(34336, this.field10443.field5965);
         OpenGL.glEnable(34336);
         this.field10439.method2946(407554050);
         this.field10439.method2949(false, 1);
         super.field7700.method4828(1, (byte)66);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         super.field7700.method4796(false, 0);
         super.field7700.method4823(5890, 0, 770, (byte)91);
         super.field7700.method4828(0, (byte)66);
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34336);
         OpenGL.glDisable(34820);
         if (arg0 < 103) {
            this.field10448 = null;
         }

         this.field10439.method2946(407554050);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10453[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "<init>",
      descriptor = "(Lck;Lae;)V"
   )
   public class695(class667 arg0, class262 arg1) {
      int var3 = client.field4530;
      super(arg0);

      try {
         this.field10448 = arg1;
         if (super.field7700.field9961 && ~super.field7700.field10020 <= -3) {
            this.field10443 = class21.method143(34336, super.field7700, -1, field10453[5]);
            if (this.field10443 != null) {
               int[][] var4 = class8.method71(-27, 3, 0.4F, 0, 256, 4, 64, 4, false);
               int[][] var5 = class8.method71(-86, 3, 0.4F, 8, 256, 4, 64, 4, false);
               this.field10451 = new float[32768];
               int var6 = 0;
               int var7 = 0;
               if (var3 == 0 && var7 >= 256) {
                  this.method5048((byte)116);
               } else {
                  do {
                     int[] var8 = var4[var7];
                     int[] var9 = var5[var7];
                     int var10 = 0;
                     if (var3 != 0) {
                        this.field10451[var6++] = (float)var8[var10] / 4096.0F;
                        this.field10451[var6++] = (float)var9[var10] / 4096.0F;
                        ++var10;
                     }

                     while(true) {
                        while(~var10 > -65) {
                           this.field10451[var6++] = (float)var8[var10] / 4096.0F;
                           this.field10451[var6++] = (float)var9[var10] / 4096.0F;
                           ++var10;
                        }

                        if (var3 == 0) {
                           ++var7;
                           break;
                        }

                        ++var10;
                     }
                  } while(var7 < 256);

                  this.method5048((byte)116);
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field10453[7] + (arg0 != null ? field10453[4] : field10453[6]) + ',' + (arg1 != null ? field10453[4] : field10453[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method872(int arg0, boolean arg1) {
      try {
         if (arg0 >= 12) {
            ++field10437;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10453[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method5049(int arg0) {
      try {
         field10446 = null;
         if (arg0 != 3) {
            field10438 = -90;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10453[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method873(int arg0) {
      try {
         if (arg0 != 0) {
            return false;
         } else {
            ++field10450;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10453[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method874(int arg0) {
      try {
         ++field10440;
         if (this.field10439 != null) {
            this.field10439.method2948('\u0001', (byte)-69);
            super.field7700.method4828(arg0, (byte)66);
            super.field7700.method4818((byte)109, (class689)null);
            super.field7700.method4828(0, (byte)66);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10453[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method5050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      int var8 = client.field4530;

      try {
         ++field10441;
         int var9 = 0;
         int var10 = arg5;
         int var11 = 0;
         int var12 = arg7 - arg3;
         int var13 = -arg3 + arg5;
         int var14 = arg7 * arg7;
         int var15 = arg5 * arg5;
         int var16 = var12 * var12;
         int var17 = var13 * var13;
         int var18 = var15 << 1;
         int var19 = var14 << 1;
         int var20 = var17 << 1;
         int var21 = var16 << 1;
         int var22 = arg5 << 1;
         int var23 = var13 << 1;
         int var24 = (1 - var22) * var14 + var18;
         int var25 = var15 - (var22 + -1) * var19;
         int var26 = (-var23 + 1) * var16 + var20;
         int var27 = var17 - (var23 + -1) * var21;
         int var28 = var14 << 2;
         int var29 = var15 << 2;
         int var30 = var16 << 2;
         int var31 = var17 << 2;
         int var32 = var18 * 3;
         int var33 = (var22 + -3) * var19;
         int var34 = var20 * 3;
         if (arg4 != -10663) {
            field10438 = 8;
         }

         int var35 = (var23 + -3) * var21;
         int var36 = var29;
         int var37 = (arg5 + -1) * var28;
         int var38 = var31;
         int var39 = (var13 + -1) * var30;
         boolean var10000;
         if (~arg2 <= ~class506.field7472) {
            if (class22.field234 >= arg2) {
               int[] var40 = class292.field4077[arg2];
               int var41 = class768.method5559(-arg7 + arg6, class100.field1232, class197.field2442, 71);
               int var42 = class768.method5559(arg6 + arg7, class100.field1232, class197.field2442, 71);
               int var43 = class768.method5559(-var12 + arg6, class100.field1232, class197.field2442, 71);
               int var44 = class768.method5559(arg6 + var12, class100.field1232, class197.field2442, 71);
               class47.method372(var43, var40, arg0, (byte)99, var41);
               class47.method372(var44, var40, arg1, (byte)110, var43);
               class47.method372(var42, var40, arg0, (byte)105, var44);
               if (var8 != 0) {
                  var10000 = var13 >= arg5;
               } else {
                  if (~arg5 >= -1) {
                     return;
                  }

                  var10000 = var13 >= arg5;
               }
            } else {
               if (~arg5 >= -1) {
                  return;
               }

               var10000 = var13 >= arg5;
            }
         } else {
            if (~arg5 >= -1) {
               return;
            }

            var10000 = var13 >= arg5;
         }

         while(true) {
            while(true) {
               boolean var45 = var10000;
               if (var45) {
                  label252: {
                     if (var26 < 0) {
                        if (var8 != 0) {
                           var27 += var38;
                           var26 += var34;
                           var34 += var31;
                           var38 += var31;
                           ++var11;
                        }
                     } else {
                        if (var8 == 0) {
                           if (var27 < 0) {
                              var27 += var38;
                              var26 += var34;
                              var34 += var31;
                              var38 += var31;
                              ++var11;
                           }

                           var27 += -var35;
                           var26 += -var39;
                           var35 -= var30;
                           var39 -= var30;
                           break label252;
                        }

                        var38 = var27;
                        ++var11;
                     }

                     while(true) {
                        while(var26 < 0) {
                           var27 += var38;
                           var26 += var34;
                           var34 += var31;
                           var38 += var31;
                           ++var11;
                        }

                        if (var8 == 0) {
                           if (var27 < 0) {
                              var27 += var38;
                              var26 += var34;
                              var34 += var31;
                              var38 += var31;
                              ++var11;
                           }

                           var27 += -var35;
                           var26 += -var39;
                           var35 -= var30;
                           var39 -= var30;
                           break;
                        }

                        var38 = var27;
                        ++var11;
                     }
                  }
               }

               byte var10001;
               int var56;
               label218: {
                  if (~var24 > -1) {
                     if (var8 != 0) {
                        var25 += var36;
                        var24 += var32;
                        var36 += var29;
                        ++var9;
                        var32 += var29;
                     }
                  } else {
                     var56 = ~var25;
                     var10001 = -1;
                     if (var8 == 0) {
                        break label218;
                     }

                     var32 = var56 + -1;
                  }

                  while(true) {
                     while(~var24 > -1) {
                        var25 += var36;
                        var24 += var32;
                        var36 += var29;
                        ++var9;
                        var32 += var29;
                     }

                     var56 = ~var25;
                     var10001 = -1;
                     if (var8 == 0) {
                        break;
                     }

                     var32 = var56 + -1;
                  }
               }

               if (var56 > var10001) {
                  var24 += var32;
                  var25 += var36;
                  var32 += var29;
                  ++var9;
                  var36 += var29;
               }

               var25 += -var33;
               var24 += -var37;
               var37 -= var28;
               --var10;
               var33 -= var28;
               int var46 = -var10 + arg2;
               int var47 = arg2 - -var10;
               if (~class506.field7472 >= ~var47) {
                  int var57 = class22.field234;
                  if (var8 != 0) {
                     var10000 = var46 >= var57;
                     continue;
                  }

                  if (var46 <= var57) {
                     int var48 = class768.method5559(arg6 - -var9, class100.field1232, class197.field2442, 71);
                     int var49 = class768.method5559(-var9 + arg6, class100.field1232, class197.field2442, 71);
                     int var50;
                     int var51;
                     int[] var52;
                     int[] var53;
                     if (!var45) {
                        if (~var46 <= ~class506.field7472) {
                           class47.method372(var48, class292.field4077[var46], arg0, (byte)127, var49);
                        }

                        if (class22.field234 >= var47) {
                           class47.method372(var48, class292.field4077[var47], arg0, (byte)101, var49);
                           if (var8 != 0) {
                              var50 = class768.method5559(arg6 + var11, class100.field1232, class197.field2442, arg4 ^ -10722);
                              var51 = class768.method5559(-var11 + arg6, class100.field1232, class197.field2442, 71);
                              if (~class506.field7472 >= ~var46) {
                                 var52 = class292.field4077[var46];
                                 class47.method372(var51, var52, arg0, (byte)100, var49);
                                 class47.method372(var50, var52, arg1, (byte)122, var51);
                                 class47.method372(var48, var52, arg0, (byte)96, var50);
                              }

                              if (var47 <= class22.field234) {
                                 var53 = class292.field4077[var47];
                                 class47.method372(var51, var53, arg0, (byte)99, var49);
                                 class47.method372(var50, var53, arg1, (byte)106, var51);
                                 class47.method372(var48, var53, arg0, (byte)123, var50);
                              }
                           }
                        }
                     } else {
                        var50 = class768.method5559(arg6 + var11, class100.field1232, class197.field2442, arg4 ^ -10722);
                        var51 = class768.method5559(-var11 + arg6, class100.field1232, class197.field2442, 71);
                        if (~class506.field7472 >= ~var46) {
                           var52 = class292.field4077[var46];
                           class47.method372(var51, var52, arg0, (byte)100, var49);
                           class47.method372(var50, var52, arg1, (byte)122, var51);
                           class47.method372(var48, var52, arg0, (byte)96, var50);
                        }

                        if (var47 <= class22.field234) {
                           var53 = class292.field4077[var47];
                           class47.method372(var51, var53, arg0, (byte)99, var49);
                           class47.method372(var50, var53, arg1, (byte)106, var51);
                           class47.method372(var48, var53, arg0, (byte)123, var50);
                        }
                     }
                  }
               }

               if (~var10 >= -1) {
                  return;
               }

               var10000 = var13 >= var10;
            }
         }
      } catch (RuntimeException var55) {
         throw class670.method4877(var55, field10453[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(ILbca;I)V"
   )
   public final void method870(int arg0, class689 arg1, int arg2) {
      try {
         if (arg2 == -1) {
            ++field10445;
            super.field7700.method4818((byte)80, arg1);
            super.field7700.method4796(false, arg0);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10453[12] + arg0 + ',' + (arg1 != null ? field10453[4] : field10453[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5051(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5052(char[] arg0) {
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
            var10005 = 83;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
