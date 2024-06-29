import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class755 extends class515 {
   @OriginalMember(
      owner = "client!bq",
      name = "q",
      descriptor = "Z"
   )
   private boolean field10809 = false;
   @OriginalMember(
      owner = "client!bq",
      name = "f",
      descriptor = "Z"
   )
   private boolean field10810 = false;
   @OriginalMember(
      owner = "client!bq",
      name = "j",
      descriptor = "Lqk;"
   )
   private class118 field10805;
   @OriginalMember(
      owner = "client!bq",
      name = "l",
      descriptor = "Lpk;"
   )
   private class627 field10804;
   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10811 = new String[]{method5460(method5459("i*C\u000eK")), method5460(method5459("i*C\u0000K")), method5460(method5459("|:\u001b#&s+\u0002(\u0006e/")), method5460(method5459("x8\f*\u0006")), method5460(method5459("\u007f2\u0000#")), method5460(method5459("i)\b'\b\\:\u0019#\u0011D=\u000b5\u0006\u007f")), method5460(method5459("i)\b'\b\\:\u0019#\u0011O>\u001d2\u000b")), method5460(method5459("i*C\u0003K")), method5460(method5459("|:\u001b#*e/\b(\u0010b/\u0014")), method5460(method5459("e.\u0001*")), method5460(method5459("puCh\u001e")), method5460(method5459("i*C\u0007K")), method5460(method5459("~5\u0004 \fy6M \u000fd:\u0019f\u0017b6\b}i~5\u0004 \fy6M \u000fd:\u0019f\u0010h:\u0001#X\u0001-\f4\u001ab5\nf\u0015n8^f\u0014}\r\b4\u0017n#VL\u0015j)\u0014/\rl{\u000b*\fj/M1\u0002\u007f>\u001f\u0002\u0006{/\u0005}i}4\u0004\"Cf:\u0004(K\"{\u0016L\u0014j/\b4'n+\u0019.C6{\n*<F.\u00012\n_>\u0015\u0005\fd)\tvMq`g0\u0006hoM#\u0000]>\u001f2\u0006s{Pf\u0004g\u0004 )\u0007n7;/\u0006|\u0016\f2\u0011b#G!\u000fT\r\b4\u0017n#VL\u0014}\r\b4\u0017n#C>C6{\t)\u0017#<\u0001\u0019-d)\u0000'\u000fF:\u00194\ns\u0000]\u001bO+>\u000e\u0010\u0006y/\b>Ms\"\u0017oX\u0001,\u001b\u0010\u0006y/\b>Mr{Pf\u0007d/E!\u000fT\u0015\u00024\u000ej7 '\u0017y2\u0015\u001dRVwM#\u0000]>\u001f2\u0006su\u0015?\u0019\"`g1\u0015]>\u001f2\u0006su\u0017f^+?\u00022Kl72\b\fy6\f*.j/\u001f/\u001bPi0jCn8;#\u0011\u007f>\u0015h\u001br!D}il72\u0012\u0006s\u0018\u0002)\u0011o\u0000]\u001bMs{Pf\u0007d/E!\u000fT\u000f\b>\u0017~)\b\u000b\u0002\u007f)\u0004>8;\u00066v>'{\n*<F.\u00012\n_>\u0015\u0005\fd)\tvJ!(\u000e'\u000fn`g!\u000fT\u000f\b> d4\u001f\"8;\u0006C?C6{\t)\u0017#<\u0001\u00197n#\u00193\u0011n\u0016\f2\u0011b#6v>Pj0jCl72\u000b\u0016g/\u0004\u0012\u0006s\u0018\u0002)\u0011okDl\u0010h:\u0001#X\u0001<\u0001\u00197n#.)\fy?6v>%!M{C\u007f2\u0000#X\u0001<\u0001\u00197n#.)\fy?6v>%,M{C:u]}il72\u0000\fl\u001d\u001f'\u0004H4\u00024\u0007+fMwM;v\u000e*\u0002f+En\u0004g\u0004+)\u0004%>\u0003\"Hn8;#\u0011\u007f>\u0015h\u0019\"q\n*<M4\nh\u0010h:\u0001#O+kCvO+jCvJ0Q\n*<[4\u001e/\u0017b4\u0003f^+=\u00194\u0002e(\u000b)\u0011fsD}ivQ")), method5460(method5459("i*Cz\ne2\u0019xK")), method5460(method5459("}:\u001f?\ne<M0\u0006hhM1\u0015]>\u001f2\u0006s`g0\u0002y\"\u0004(\u0004+=\u0001)\u0002\u007f{\u001a'\u0017n))#\u0013\u007f3VL\u0016e2\u000b)\u0011f{\u001b#\u00008{\u001e3\rO2\u001f}i~5\u0004 \fy6M0\u0006hoM5\u0016e\u0018\u0002*\f~)VL\u0016e2\u000b)\u0011f{\u000b*\fj/M5\u0016e\u001e\u00156\fe>\u00032X\u0001.\u0003/\u0005d)\u0000f\u0015n8_f\u0014j-\b\u000f\r\u007f>\u00035\n\u007f\"VL\u0016e2\u000b)\u0011f{\u000b*\fj/M1\u0002}>(>\u0013d5\b(\u00170Q\u0018(\nm4\u001f+Cm7\u0002'\u0017+9\u001f#\u0002`\f\f2\u0006y\u001f\b6\u0017c`g3\rb=\u00024\u000e+=\u0001)\u0002\u007f{\u000f4\u0006j0:'\u0017n)\" \u0005x>\u0019}i~5\u0004 \fy6M5\u0002f+\u0001#\u00118\u001fM(\fy6\f*0j6\u001d*\u0006y`g3\rb=\u00024\u000e+(\f+\u0013g>\u001f\u0005\u0016i>M#\r}\u0016\f60j6\u001d*\u0006y`g0\fb?M+\u0002b5EoCpQ\u001b#\u0000?{\u001a(-d)\u0000'\u000f+fM2\u0006s/\u00184\u00068\u001fE(\fy6\f*0j6\u001d*\u0006ywM!\u000fT\u000f\b> d4\u001f\"8;\u0006C>\u001aqrC4\u0001l:VL\u0014e\u0015\u00024\u000ej7C>\u001aq{PfQ%kG1\rE4\u001f+\u0002gu\u0015?\u0019&jCvX\u0001-\b%P+,\u0003\u0010\u0006h/\u00024C6{\u0003)\u0011f:\u0001/\u0019ns\u001a05n)\u0019#\u001b\"`g0\u0006hhM1\rY>\u000b*\u0006h/\u0004)\r+fM4\u0006m7\b%\u0017#,\u0003\u0010\u0006h/\u00024O+,\u0003\b\fy6\f*Ms\"\u0017oX\u0001-\b%P+>\u00030 d7\u00023\u0011+fM2\u0006s/\u00184\u0006H.\u000f#Kn5\u001b\u000b\u0002{\b\f+\u0013g>\u001fjC|5?#\u0005g>\u000e2\nd5Dh\u0011l9VL\u0015n8Yf\u0010{>\u000e3\u000fj).)\u000fd.\u001ff^+(\u0018( d7\u00023\u0011!+\u00021Kh7\f+\u0013#v\t)\u0017#(\u0018('b)Af\u0014e\t\b \u000fn8\u0019/\ferAfS%kAfR%kDjCx.\u0003\u0003\u001b{4\u0003#\r\u007frVL\u0005g4\f2Cx3\u00024\u0006M:\u000e2\fy{Pf\u0000g:\u00006K|:\u0019#\u0011O>\u001d2\u000b$9\u001f#\u0002`\f\f2\u0006y\u001f\b6\u0017cv\u000f4\u0006j0:'\u0017n)\" \u0005x>\u0019l\u0014e\u0015\u00024\u000ej7C1O+kCvO+jCvJ0Q\u000b*\fj/M1\u0002}>+'\u0000\u007f4\u001ff^++\u00021K:u]k\u0010c4\u001f#%j8\u0019)\u0011'{\u001a'\u0015n\u001e\u00156\fe>\u00032J&kCsX\u0001,\f0\u0006M:\u000e2\fy{PfN?u]l\u0014j-\b\u0000\u0002h/\u00024I|:\u001b#%j8\u0019)\u0011 jCvX\u0001=\u0001)\u0002\u007f{\u0003\"\f\u007f>M{Co4\u0019n\u0014e\r\b%\u0017d)Af\u0014e\u0015\u00024\u000ej7C>\u001aqrVL\u0005g4\f2Cm)\b5\rn7M{C{4\u001anR%k@'\u0001xs\u0003\"\f\u007f>DjC:u]oX\u0001-\b%W+(\u00184\u0005j8\b\u0005\fg4\u00184C6{\u0000/\u001b#-\b%W#>\u00030 d7\u00023\u0011'{\u000b4\u0006x5\b*Ix3\u00024\u0006M:\u000e2\fyrAfK|:\u001b#*e/\b(\u0010b/\u0014h\u001b!,\u0003\b\fy6\f*M|,\u001a1J ,\f0\u0006B5\u0019#\rx2\u0019?MrwM1\u0002}>+'\u0000\u007f4\u001foHx+\b%\u0016g:\u001f\u0005\fg4\u00184Ix3\u00024\u0006M:\u000e2\fy`g!\u000fT\u001d\u001f'\u0004H4\u0001)\u0011+fM0\u0006hoE+\nss\u001e3\u0011m:\u000e# d7\u00023\u0011%)\n$O+<\u0001\u0019%d<C%\fg4\u001fh\u0011l9Af\u0004g\u0004+)\u0004M)\f! d4\u001f\"J'{\u001e3\u0011m:\u000e# d7\u00023\u0011%:D}ivQ")), method5460(method5459("i*C\u000fK")), method5460(method5459("i*C\u0005K")), method5460(method5459("i*C\u0001K")), method5460(method5459("i*C\fK")), method5460(method5459("x.\u0003\u0003\u001b{4\u0003#\r\u007f")), method5460(method5459("n5\u001b\u000b\u0002{\b\f+\u0013g>\u001f")), method5460(method5459("e4\u001f+\u0002g\b\f+\u0013g>\u001f")), method5460(method5459("i*C\u0004K")), method5460(method5459("x.\u0003\u0002\ny")), method5460(method5459("x.\u0003\u0005\fg4\u00184"))};
   @OriginalMember(
      owner = "client!bq",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field10798 = new int[2];
   @OriginalMember(
      owner = "client!bq",
      name = "h",
      descriptor = "Lhha;"
   )
   public static class724 field10803 = new class724(108, 10);
   @OriginalMember(
      owner = "client!bq",
      name = "p",
      descriptor = "F"
   )
   public static float field10796;
   @OriginalMember(
      owner = "client!bq",
      name = "r",
      descriptor = "I"
   )
   public static int field10795;
   @OriginalMember(
      owner = "client!bq",
      name = "s",
      descriptor = "I"
   )
   public static int field10797;
   @OriginalMember(
      owner = "client!bq",
      name = "i",
      descriptor = "I"
   )
   public static int field10799;
   @OriginalMember(
      owner = "client!bq",
      name = "n",
      descriptor = "I"
   )
   public static int field10800;
   @OriginalMember(
      owner = "client!bq",
      name = "t",
      descriptor = "I"
   )
   public static int field10801;
   @OriginalMember(
      owner = "client!bq",
      name = "o",
      descriptor = "I"
   )
   public static int field10802;
   @OriginalMember(
      owner = "client!bq",
      name = "k",
      descriptor = "I"
   )
   public static int field10806;
   @OriginalMember(
      owner = "client!bq",
      name = "u",
      descriptor = "I"
   )
   public static int field10807;
   @OriginalMember(
      owner = "client!bq",
      name = "m",
      descriptor = "I"
   )
   public static int field10808;

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method137(int arg0, byte arg1, int arg2) {
      try {
         int var4 = -90 / ((-57 - arg1) / 60);
         ++field10800;
         if (this.field10809) {
            int var5 = 1 << (arg2 & 3);
            float var6 = (float)(1 << ((58 & arg2) >> 3)) / 32.0F;
            int var7 = 65535 & arg0;
            float var8 = (float)((199534 & arg0) >> 16) / 8.0F;
            float var9 = (float)(15 & arg0 >> 19) / 16.0F;
            float var10 = (float)(arg0 >> 23 & 15) / 16.0F;
            int var11 = (2093964250 & arg0) >> 27;
            long var12 = this.field10804.field8952;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, field10811[4]), (float)(super.field7307.field9679 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, field10811[3]), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, field10811[6]), (float)var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, field10811[5]), var8);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var12, field10811[8]), var10, var9);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var12, field10811[2]), (float)var11);
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field10811[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method5455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field10022;

      try {
         ++field10808;
         if (arg1 <= -94) {
            int var8 = arg6 - arg5;
            int var9 = arg2 - -arg5;
            int var10 = arg2;
            if (var7) {
               class100.method989(arg4, (byte)22, arg3, arg0, class788.field11482[arg2]);
               var10 = arg2 + 1;
            }

            while(true) {
               while(~var9 < ~var10) {
                  class100.method989(arg4, (byte)22, arg3, arg0, class788.field11482[var10]);
                  ++var10;
               }

               int var11 = arg3 - arg5;
               int var12 = arg6;
               if (!var7) {
                  if (var7) {
                     class100.method989(arg4, (byte)22, arg3, arg0, class788.field11482[arg6]);
                     var12 = arg6 - 1;
                  }

                  while(true) {
                     while(var8 < var12) {
                        class100.method989(arg4, (byte)22, arg3, arg0, class788.field11482[var12]);
                        --var12;
                     }

                     int var13 = arg4 + arg5;
                     int var14 = var9;
                     if (!var7) {
                        if (!var7 && ~var8 > ~var9) {
                           return;
                        }

                        do {
                           int[] var15 = class788.field11482[var14];
                           class100.method989(arg4, (byte)22, var13, arg0, var15);
                           class100.method989(var11, (byte)22, arg3, arg0, var15);
                           ++var14;
                        } while(~var8 <= ~var14);

                        return;
                     }

                     --var12;
                  }
               }

               ++var10;
            }
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field10811[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method133(boolean arg0) {
      try {
         if (this.field10809) {
            super.field7307.method4958(1, false);
            super.field7307.method4906(-2, (class719)null);
            super.field7307.method4958(0, arg0);
            super.field7307.method4906(-2, (class719)null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field10809 = false;
         }

         if (arg0) {
            this.method133(true);
         }

         ++field10806;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10811[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method132(int arg0, boolean arg1) {
      try {
         if (arg0 != -15) {
            this.field10809 = true;
         }

         ++field10801;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10811[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method5456(int arg0) {
      int var1 = -1;

      for(int var2 = 0; var2 < class14.field198 - 1; ++var2) {
         if (arg0 < class364.field5373[var2] + class320.field4779[var2]) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         var1 = class14.field198 - 1;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(ILln;I)V"
   )
   public final void method131(int arg0, class719 arg1, int arg2) {
      try {
         if (!this.field10809) {
            super.field7307.method4906(-2, arg1);
            super.field7307.method4947(false, arg2);
         }

         ++field10795;
         int var4 = 34 / ((-44 - arg0) / 41);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10811[11] + arg0 + ',' + (arg1 != null ? field10811[10] : field10811[9]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method135(int arg0) {
      try {
         ++field10802;
         if (arg0 != 19455) {
            method5455(-55, -77, 29, -12, -117, -2, 40);
         }

         return this.field10810;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10811[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method136(boolean arg0, int arg1) {
      try {
         ++field10797;
         class763 var3 = super.field7307.method4895((byte)-120);
         if (this.field10810 && var3 != null) {
            float var4 = 1.0F + (-Math.abs(super.field7307.field9758[1]) + 1.0F) * 2.0F;
            super.field7307.method4958(1, false);
            super.field7307.method4906(-2, var3);
            super.field7307.method4958(0, false);
            super.field7307.method4906(-2, this.field10805.field1853);
            long var5 = this.field10804.field8952;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field10811[21]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field10811[20]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field10811[23]), -super.field7307.field9758[0], -super.field7307.field9758[1], -super.field7307.field9758[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, field10811[24]), super.field7307.field9796 * var4, super.field7307.field9794 * var4, super.field7307.field9799 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, field10811[19]), Math.abs(super.field7307.field9758[1]) * 928.0F + 64.0F);
            this.field10809 = true;
         }

         if (arg1 != 3) {
            this.method133(true);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10811[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "b",
      descriptor = "(IZ)V"
   )
   public static final void method5457(int arg0, boolean arg1) {
      boolean var2 = client.field10022;

      try {
         ++field10807;
         if (arg1) {
            method5455(-105, -77, 80, -65, -114, 42, -87);
         }

         if (class394.field5712 != arg0) {
            if (~arg0 == -15 || ~arg0 == -16) {
               class492.method3741(74);
            }

            if (~arg0 != -15 && class567.field8053 != null) {
               class567.field8053.method2554(false);
               class567.field8053 = null;
            }

            if (~arg0 == -4) {
               class320.method2585(-115, class7.field130 != class26.field366);
            }

            if (~arg0 == -8) {
               class522.method3902(arg1, class7.field130 != class664.field9360);
            }

            label173: {
               if (arg0 == 5 || ~arg0 == -14) {
                  class478.method3660(40);
                  if (!var2) {
                     break label173;
                  }
               }

               if (arg0 == 6 || ~arg0 == -10 && class394.field5712 != 10) {
                  class492.method3741(96);
               }
            }

            if (class391.method3038(103, class394.field5712)) {
               class324.field4825.field564 = 2;
               class344.field5067.field564 = 2;
               class442.field6467.field564 = 2;
               class283.field4282.field564 = 2;
               class184.field2712.field564 = 2;
               class778.field11349.field564 = 2;
               class517.field7316.field564 = 2;
            }

            if (class391.method3038(104, arg0)) {
               class124.field1984 = 0;
               class548.field7805 = 1;
               class462.field6723 = 1;
               class702.field10113 = 0;
               class161.field2455 = 0;
               class182.method1647(true, -18228);
               class324.field4825.field564 = 1;
               class344.field5067.field564 = 1;
               class442.field6467.field564 = 1;
               class283.field4282.field564 = 1;
               class184.field2712.field564 = 1;
               class778.field11349.field564 = 1;
               class517.field7316.field564 = 1;
            }

            if (~arg0 == -13 || arg0 == 3) {
               class204.method1768((byte)124);
            }

            boolean var3 = ~arg0 == -3 || class783.method5655(arg0, 0) || class239.method2100(arg0, true);
            boolean var4 = ~class394.field5712 == -3 || class783.method5655(class394.field5712, 0) || class239.method2100(class394.field5712, true);
            if (var3 != var4) {
               label161: {
                  if (!var3) {
                     class34.method387(1, 2);
                     class456.field6660.method4729((byte)-61, true);
                     if (!var2) {
                        break label161;
                     }
                  }

                  label103: {
                     class24.field344 = class289.field4302;
                     if (~class476.field6870.field9121.method3775(-91) == -1) {
                        class34.method387(1, 2);
                        if (!var2) {
                           break label103;
                        }
                     }

                     class625.method4597(class476.field6870.field9121.method3775(-124), class289.field4302, false, 0, class580.field8166, -103, 2);
                     class108.method1060(false);
                  }

                  class456.field6660.method4729((byte)-124, false);
               }
            }

            if (class391.method3038(122, arg0) || ~arg0 == -15 || arg0 == 15) {
               class54.field794.method171();
            }

            class394.field5712 = arg0;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10811[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method5458(boolean arg0) {
      try {
         field10798 = null;
         if (arg0) {
            field10798 = null;
         }

         field10803 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10811[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "<init>",
      descriptor = "(Laea;Lqk;)V"
   )
   public class755(class678 arg0, class118 arg1) {
      super(arg0);

      try {
         this.field10805 = arg1;
         if (this.field10805.field1853 != null && super.field7307.field9747 && super.field7307.field9730) {
            class631 var3 = class319.method2581(35633, field10811[12], super.field7307, -4176);
            class631 var4 = class319.method2581(35632, field10811[14], super.field7307, -4176);
            this.field10804 = class686.method4991(true, super.field7307, new class631[]{var3, var4});
            this.field10810 = this.field10804 != null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10811[13] + (arg0 != null ? field10811[10] : field10811[9]) + ',' + (arg1 != null ? field10811[10] : field10811[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5459(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5460(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
