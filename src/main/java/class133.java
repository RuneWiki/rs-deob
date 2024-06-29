import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class133 extends class515 {
   @OriginalMember(
      owner = "client!gd",
      name = "j",
      descriptor = "Lqk;"
   )
   private class118 field2176;
   @OriginalMember(
      owner = "client!gd",
      name = "x",
      descriptor = "Ldm;"
   )
   private class274 field2165;
   @OriginalMember(
      owner = "client!gd",
      name = "k",
      descriptor = "[F"
   )
   private float[] field2162;
   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2181 = new String[]{method1371(method1370("uAC\u0005\u000f")), method1371(method1370("uAC\u0006\u000f")), method1371(method1370("uAC\u000f\u000f")), method1371(method1370("?\bSl")), method1371(method1370("uAC\u000b\u000f")), method1371(method1370("uAC\b\u000f")), method1371(method1370("uAC\u0004\u000f")), method1371(method1370("uAC\n\u000f")), method1371(method1370("uAC\u0007\u000f")), method1371(method1370("uACpN|L\u0019r\u000f")), method1371(method1370("i\u000bCbZ")), method1371(method1370("3\u0004,\u001eedU\\b\u0017\u0018j=\u0018n]kMlf@g2<HaL\u0019%H|z\u0004\"QsW\u0004-If\u001eg\rsFw$\u000e\u00072L=#T2\u0005Ml\u00072\u0005Ml\u001a2S\b>Sw]C<HaL\u0019%H|\u001eg\rsFw$\u000e\u00072L.#K}P\u001fl\u00072\u0005Ml\u001a2S\b>Sw]C/H~J\u001fw-Sq9\u001enP\u0005M%sw].#H`AMl\u00072\u0018M:B`Q\b4\tf@\u0015/H}W\t\u0017\u0017O\u001eg\u0003rFu8\u0018\u00072J.#K}P\u001fl\u00072\u0005Ml\u001a2W\b?R~QC/H~J\u001fw-]p9\u001crF\u0005M#sw].#H`A]l\u00072\u0018M>BaP\u00018\tf@\u0015/H}W\t\u0017\u0017O\u001eg\u0003rFu8\u0018\u00072J9)_QJ\u0002>C#\u0005Ml\u001a2W\b?R~QC8BjF\u0002#Uv~\\\u0011\u001c\u0018j8\u0018wGqMlHTJ\n\u000fH}W\tl\u00072\u0005PlUwV\u0018 S<C\u0002+D}J\u001f(\u001c\u0018u,\u001ef_\u0005MlS{H\bl\u00072\u0005Ml\u00072\u0005PlW`J\n>F\u007f\u000b\u0001#DsI6z\u0012O\u001eg\u001cf@d l\u00072Q\u0018>EgI\b\"Dw\u0005Ml\u001a2U\u001f#@`D\u0000bK}F\f |$\u00110w-Bd?\rj2\u0005M NuM\u0019\rJpL\b\"S2\u0018M<U}B\u001f-J<I\u0002/F~~[zz)\u0005g\u001cf@d l\u00072U -S`L\u0015\u0017\u0013O\u0005Ml\u001a2^M?SsQ\bbJsQ\u001f%_<U\u001f#MwF\u0019%H|\u0005\u0010w-Bd?\rj2\u0005M!Q_D\u0019>Nj~Y\u0011\u00072\u0018M7\u0007aQ\f8B<H\f8U{]C!Hv@\u0001:NwRM1\u001c\u0018u,\u001ef_\u0005MlNdh\f8U{]6xz2\u0005Pl\\2V\u0019-Sw\u000b\u0000-S`L\u0015bSw]\u00199Uw~\\\u0011\u0007o\u001eg\u001cf@d l\u00072Q\b4jsQ\u001f%_I\u00110l\u0007/\u0005\u0016lTfD\u0019)\t\u007fD\u0019>Nj\u000b\u0019)_fP\u001f)|\"xM1\u001c\u0018u,\u001ef_\u0005MlA\\J\u0004?BI\u0013Y\u0011\u00072\u0005Pl\\2U\u001f#@`D\u0000bK}F\f |\"\u000bCz\u0014O\u0005\u0010w-F` \u001c\u00072\u0005M\"H{V\b`\u0007dL\b;w}VAlP}W\u0001(w}VAlSw].#H`AVFfVa?\ttA\u0005\u0003#Na@,(C`\u001eg\bw&\u0005MlQ{@\u001a\u001cHa\u000b\u0015`\u0007\u007fS -S`L\u0015\u0017\u0017O\tM%w}VVFcB\u0011Ml\u0007dL\b;w}VC5\u000b2H\u001b\u0001FfW\u00044|#xAlNBJ\u001ew-VuYl\u00072S\u0004)PBJ\u001eb]>\u0005\u0000:jsQ\u001f%_I\u00170`\u0007{u\u0002?\u001c\u0018a=x\u00072\u0005\u001b%Beu\u0002?\te\tM!Q_D\u0019>Nj~^\u0011\u000b2L=#T)/ \u0003q2\u0005M#a}B.#H`AC4\u000b2\b\u001b%Beu\u0002?\th\u001eg\bw&\u0005MlP}W\u0001(w}VC4\u000b2L\u001b\u0001FfW\u00044|\"xAlQ{@\u001a\u001cHa\u001eg\bw&\u0005MlP}W\u0001(w}VC5\u000b2L\u001b\u0001FfW\u00044|#xAlQ{@\u001a\u001cHa\u001eg\bw&\u0005MlP}W\u0001(w}VC6\u000b2L\u001b\u0001FfW\u00044| xAlQ{@\u001a\u001cHa\u001eg\bw&\u0005MlP}W\u0001(w}VC;\u000b2L\u001b\u0001FfW\u00044|!xAlQ{@\u001a\u001cHa\u001eg\rcV\u0005MlI}L\u001e)\tj\tM;H`I\t\u001cHa\u000b\u0015`\u0007eJ\u001f CBJ\u001eb])v8\u000e\u00072\u0005\u0003#Na@C5\u000b2R\u0002>Kvu\u0002?\th\tM;H`I\t\u001cHa\u000b\u0015wjGiMl\u0007|J\u0004?B>\u0005\u0003#Na@Al\u0017<\u0015]|\u0016 \u0017]{\u0017!\u0014_y\u001c\u0018c?\u000f\u00072\u0005\u0003#Na@AlI}L\u001e)\u001c\u0018h8\u0000\u00072\u0005\u0003#Na@AlI}L\u001e)\u000b2\u0013Yw-Sw!l\u00072K\u0002%Twd\t(U<]AlI}L\u001e)\tj\u001eg\u0001hD\u0005MlI}L\u001e)\tj\tM*i}L\u001e)||J\u0004?BSA\t>\tjxC4\u001c\u0018d?\u0000\u00072\u0005\u0003#Na@,(C`\u000b\u0015`\u0007|J\u0004?B<\\VFj]sMl\u0007|J\u0004?B<\\AlA\\J\u0004?BIK\u0002%Twd\t(U<]0b^)/ \u0019k2\u0005M\"H{V\b`\u0007|J\u0004?B>\u0005\u00199UpP\u0001)Iq@C4\u001c\u0018a=x\u00072\u0005\u0019)_QJ\u0002>C<]AlSw] -S`L\u0015\u0017\u0017O\tM%sw].#H`AVFcB\u0011Ml\u0007f@\u0015\u000fH}W\tb^>\u0005\u0019)__D\u0019>Nj~\\\u0011\u000b2L9)_QJ\u0002>C)/,\bc2\u0005M#sw].#H`A]b_k\tM8Bjf\u0002#Uv\tM\"H{V\bw-_j;l\u00072J9)_QJ\u0002>C\"\u000b\u0017`\u0007\"\u001eg\u0001hD\u0005MlHF@\u0015\u000fH}W\t|\te\tM}\u001c\u0018h8\u0000\u00072\u0005\u0002\u0018Bjf\u0002#Uv\u0014C4^>\u0005\u0019)_QJ\u0002>C>\u0005]b\u0016 \u0010VFj]sMl\u0007}q\b4d}J\u001f(\u0016<_\u001a`\u0007fL\u0000)\tj]\u0015;\u001c\u0018h8\u0000\u00072\u0005\u0002\u000fH~J\u0018>\tj\\\u0017`\u0007{f\u0002 HgWAlK{B\u00058f\u007fG\u0004)If\u001eg\u0001hD\u0005MlHQJ\u0001#R`\u000b\u001a`\u0007{f\u0002 HgWC;\u001c\u0018`#\b")), method1371(method1370("|P\u0001 ")), method1371(method1370("uAC\t\u000f")), method1371(method1370("uAC\r\u000f")), method1371(method1370("uAC\u000e\u000f"))};
   @OriginalMember(
      owner = "client!gd",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field2173 = new int[120];
   @OriginalMember(
      owner = "client!gd",
      name = "v",
      descriptor = "F"
   )
   private float field2164;
   @OriginalMember(
      owner = "client!gd",
      name = "m",
      descriptor = "I"
   )
   public static int field2163;
   @OriginalMember(
      owner = "client!gd",
      name = "t",
      descriptor = "I"
   )
   public static int field2166;
   @OriginalMember(
      owner = "client!gd",
      name = "o",
      descriptor = "I"
   )
   public static int field2168;
   @OriginalMember(
      owner = "client!gd",
      name = "i",
      descriptor = "I"
   )
   public static int field2169;
   @OriginalMember(
      owner = "client!gd",
      name = "u",
      descriptor = "I"
   )
   public static int field2170;
   @OriginalMember(
      owner = "client!gd",
      name = "s",
      descriptor = "I"
   )
   public static int field2171;
   @OriginalMember(
      owner = "client!gd",
      name = "h",
      descriptor = "I"
   )
   public static int field2172;
   @OriginalMember(
      owner = "client!gd",
      name = "f",
      descriptor = "I"
   )
   public static int field2174;
   @OriginalMember(
      owner = "client!gd",
      name = "r",
      descriptor = "I"
   )
   public static int field2175;
   @OriginalMember(
      owner = "client!gd",
      name = "n",
      descriptor = "I"
   )
   public static int field2177;
   @OriginalMember(
      owner = "client!gd",
      name = "p",
      descriptor = "I"
   )
   private int field2178;
   @OriginalMember(
      owner = "client!gd",
      name = "l",
      descriptor = "I"
   )
   public static int field2179;
   @OriginalMember(
      owner = "client!gd",
      name = "q",
      descriptor = "I"
   )
   public static int field2180;
   @OriginalMember(
      owner = "client!gd",
      name = "g",
      descriptor = "Lgca;"
   )
   private class50 field2167;

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method1365(byte arg0) {
      try {
         this.field2167 = new class50(super.field7307, 2);
         int var2 = 26 / ((arg0 - -46) / 61);
         ++field2174;
         this.field2167.method544(0, 73);
         super.field7307.method4958(1, false);
         super.field7307.method4911(-16777216, (byte)107);
         super.field7307.method4931(260, 7681, 0);
         super.field7307.method4933(770, 34166, 0, true);
         super.field7307.method4958(0, false);
         OpenGL.glBindProgramARB(34336, this.field2165.field4180);
         OpenGL.glEnable(34336);
         this.field2167.method545((byte)93);
         this.field2167.method544(1, 40);
         super.field7307.method4958(1, false);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         super.field7307.method4947(false, 0);
         super.field7307.method4933(770, 5890, 0, true);
         super.field7307.method4958(0, false);
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34336);
         OpenGL.glDisable(34820);
         this.field2167.method545((byte)93);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2181[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "b",
      descriptor = "(ZI)I"
   )
   public static final int method1366(boolean arg0, int arg1) {
      try {
         ++field2168;
         if (arg1 != 0) {
            method1366(true, -55);
         }

         int var2 = class217.field3113;
         if (var2 != 0) {
            if (~var2 == -2) {
               return class519.field7320;
            }

            if (~var2 != -3) {
               return 0;
            }

            if (!client.field10022) {
               return 0;
            }
         }

         return !arg0 ? class519.field7320 : 0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2181[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method132(int arg0, boolean arg1) {
      try {
         if (arg0 != -15) {
            field2173 = null;
         }

         ++field2169;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2181[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method135(int arg0) {
      try {
         if (arg0 != 19455) {
            return true;
         } else {
            ++field2166;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2181[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "<init>",
      descriptor = "(Laea;Lqk;)V"
   )
   public class133(class678 arg0, class118 arg1) {
      boolean var3 = client.field10022;
      super(arg0);

      try {
         this.field2176 = arg1;
         if (super.field7307.field9804 && super.field7307.field9811 >= 2) {
            this.field2165 = class367.method2891(34336, 72, field2181[11], super.field7307);
            if (this.field2165 != null) {
               int[][] var4 = class28.method354(3, 64, false, 0, 256, 0, 4, 4, 0.4F);
               int[][] var5 = class28.method354(3, 64, false, 0, 256, 8, 4, 4, 0.4F);
               int var6 = 0;
               this.field2162 = new float[32768];
               int var7 = 0;
               if (!var3 && var7 >= 256) {
                  this.method1365((byte)-111);
               } else {
                  do {
                     int[] var8 = var4[var7];
                     int[] var9 = var5[var7];
                     int var10 = 0;
                     if (var3) {
                        this.field2162[var6++] = (float)var8[var10] / 4096.0F;
                        this.field2162[var6++] = (float)var9[var10] / 4096.0F;
                        ++var10;
                     }

                     while(true) {
                        while(var10 < 64) {
                           this.field2162[var6++] = (float)var8[var10] / 4096.0F;
                           this.field2162[var6++] = (float)var9[var10] / 4096.0F;
                           ++var10;
                        }

                        if (!var3) {
                           ++var7;
                           break;
                        }

                        ++var10;
                     }
                  } while(var7 < 256);

                  this.method1365((byte)-111);
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field2181[9] + (arg0 != null ? field2181[10] : field2181[12]) + ',' + (arg1 != null ? field2181[10] : field2181[12]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "c",
      descriptor = "(ZI)V"
   )
   public static final void method1367(boolean arg0, int arg1) {
      try {
         ++field2170;
         if (arg1 != class772.field11182.length()) {
            class137.method1389(-124, field2181[3] + class772.field11182);
            class260.method2231(class772.field11182, arg1 ^ 126, false, arg0);
            class112.field1775 = 0;
            if (!arg0) {
               class772.field11182 = "";
               class454.field6601 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2181[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(ILln;I)V"
   )
   public final void method131(int arg0, class719 arg1, int arg2) {
      try {
         int var4 = 73 % ((-44 - arg0) / 41);
         ++field2171;
         super.field7307.method4906(-2, arg1);
         super.field7307.method4947(false, arg2);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2181[14] + arg0 + ',' + (arg1 != null ? field2181[10] : field2181[12]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method137(int arg0, byte arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field2177;
         if (this.field2167 != null) {
            label67: {
               super.field7307.method4958(1, false);
               if (~(128 & arg2) != -1) {
                  super.field7307.method4906(-2, (class719)null);
                  if (!var4) {
                     break label67;
                  }
               }

               if (~(arg0 & 1) == -2) {
                  if (!this.field2176.field1858) {
                     int var5 = super.field7307.field9679 % 4000 * 16 / 4000;
                     super.field7307.method4906(-2, this.field2176.field1854[var5]);
                     OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                     if (!var4) {
                        break label67;
                     }
                  }

                  super.field7307.method4906(-2, this.field2176.field1856);
                  OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field2164, 0.0F, 0.0F, 1.0F);
                  if (!var4) {
                     break label67;
                  }
               }

               label49: {
                  if (!this.field2176.field1858) {
                     super.field7307.method4906(-2, this.field2176.field1854[0]);
                     if (!var4) {
                        break label49;
                     }
                  }

                  super.field7307.method4906(-2, this.field2176.field1856);
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }

            label44: {
               super.field7307.method4958(0, false);
               int var6 = 15 / ((arg1 - -57) / 60);
               if ((64 & arg2) != 0) {
                  OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                  if (!var4) {
                     break label44;
                  }
               }

               class563.field8016[2] = super.field7307.field9807 * super.field7307.field9799;
               class563.field8016[1] = super.field7307.field9807 * super.field7307.field9794;
               class563.field8016[0] = super.field7307.field9807 * super.field7307.field9796;
               OpenGL.glProgramLocalParameter4fvARB(34336, 66, class563.field8016, 0);
            }

            int var7 = arg2 & 3;
            if (var7 == 2) {
               OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var7 == 3) {
               OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
               OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field2181[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1368(byte arg0) {
      try {
         if (arg0 == 68) {
            field2173 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2181[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method133(boolean arg0) {
      try {
         ++field2175;
         if (this.field2167 != null) {
            this.field2167.method547('\u0001', true);
            super.field7307.method4958(1, false);
            super.field7307.method4906(-2, (class719)null);
            super.field7307.method4958(0, arg0);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2181[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method136(boolean arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field2163;
         if (this.field2167 != null) {
            this.field2167.method547('\u0000', true);
            if (arg1 != 3) {
               this.field2178 = -105;
            }

            super.field7307.method4958(1, false);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7307.field9716.method2399(0), 0);
            OpenGL.glMatrixMode(5888);
            super.field7307.method4958(0, false);
            if (~super.field7307.field9679 != ~this.field2178) {
               int var4 = super.field7307.field9679 % 5000 * 128 / 5000;
               int var5 = 0;
               if (var3) {
                  OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field2162, var4);
                  var4 += 2;
                  ++var5;
               }

               while(true) {
                  int var10000;
                  if (var5 >= 64) {
                     var10000 = this.field2176.field1858;
                     if (!var3) {
                        label31: {
                           if (var10000 != 0) {
                              this.field2164 = (float)(super.field7307.field9679 % 4000) / 4000.0F;
                              if (!var3) {
                                 break label31;
                              }
                           }

                           OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                        }

                        this.field2178 = super.field7307.field9679;
                        return;
                     }
                  } else {
                     var10000 = 34336;
                  }

                  OpenGL.glProgramLocalParameter4fvARB(var10000, var5, this.field2162, var4);
                  var4 += 2;
                  ++var5;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2181[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(BII)I"
   )
   public static final int method1369(byte arg0, int arg1, int arg2) {
      try {
         ++field2172;
         double var3 = Math.log((double)arg2) / Math.log(2.0D);
         double var5 = Math.log((double)arg1) / Math.log(2.0D);
         double var7 = Math.random() * (var3 - var5) + var5;
         return arg0 < 99 ? 27 : (int)(Math.pow(2.0D, var7) + 0.5D);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2181[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   static {
      int var0 = 0;

      for(int var1 = 0; ~var1 > -121; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field2173[var1] = var0 / 4;
      }

   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1370(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1371(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
