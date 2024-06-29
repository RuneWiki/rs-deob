import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class383 extends class719 {
   @OriginalMember(
      owner = "client!wr",
      name = "x",
      descriptor = "I"
   )
   private int field5586 = -1;
   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "I"
   )
   private int field5593 = -1;
   @OriginalMember(
      owner = "client!wr",
      name = "I",
      descriptor = "I"
   )
   public int field5578;
   @OriginalMember(
      owner = "client!wr",
      name = "C",
      descriptor = "I"
   )
   public int field5582;
   @OriginalMember(
      owner = "client!wr",
      name = "L",
      descriptor = "I"
   )
   public int field5589;
   @OriginalMember(
      owner = "client!wr",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5594 = new String[]{method2990(method2989("!*oHH")), method2990(method2989("!*oVH")), method2990(method2989("-vo6\u001d")), method2990(method2989("8--t")), method2990(method2989("!*oJH")), method2990(method2989("!*oYH")), method2990(method2989("!*o$\t815&H")), method2990(method2989("!*o[H")), method2990(method2989("!*oWH")), method2990(method2989("!*oZH")), method2990(method2989("!*oIH"))};
   @OriginalMember(
      owner = "client!wr",
      name = "J",
      descriptor = "Lhha;"
   )
   public static class724 field5583 = new class724(25, 6);
   @OriginalMember(
      owner = "client!wr",
      name = "G",
      descriptor = "I"
   )
   public static int field5590 = 0;
   @OriginalMember(
      owner = "client!wr",
      name = "B",
      descriptor = "I"
   )
   public static int field5579;
   @OriginalMember(
      owner = "client!wr",
      name = "w",
      descriptor = "I"
   )
   public static int field5580;
   @OriginalMember(
      owner = "client!wr",
      name = "H",
      descriptor = "I"
   )
   public static int field5581;
   @OriginalMember(
      owner = "client!wr",
      name = "F",
      descriptor = "I"
   )
   public static int field5584;
   @OriginalMember(
      owner = "client!wr",
      name = "D",
      descriptor = "I"
   )
   public static int field5585;
   @OriginalMember(
      owner = "client!wr",
      name = "A",
      descriptor = "I"
   )
   public static int field5591;
   @OriginalMember(
      owner = "client!wr",
      name = "y",
      descriptor = "I"
   )
   public static int field5592;
   @OriginalMember(
      owner = "client!wr",
      name = "K",
      descriptor = "Lrr;"
   )
   public static class332 field5588;
   @OriginalMember(
      owner = "client!wr",
      name = "v",
      descriptor = "Lwm;"
   )
   public static class440 field5587;

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method2982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         int var9 = 40 % ((63 - arg7) / 59);
         ++field5591;
         super.field10293.method4906(-2, this);
         OpenGL.glCopyTexSubImage3D(super.field10295, 0, arg1, arg3, arg5, arg6, arg4, arg0, arg2);
         OpenGL.glFlush();
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field5594[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "<init>",
      descriptor = "(Laea;IIII[BI)V"
   )
   public class383(class678 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
      super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);

      try {
         this.field5578 = arg4;
         this.field5582 = arg2;
         this.field5589 = arg3;
         super.field10293.method4906(-2, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field10295, 0, super.field10288, this.field5582, this.field5589, this.field5578, 0, arg6, 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method5204(true, -1);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field5594[6] + (arg0 != null ? field5594[2] : field5594[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5594[2] : field5594[3]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method2983(String arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field5579;
         if (arg0 != null) {
            if ((~class428.field6272 > -201 || class425.field6225) && class428.field6272 < 200) {
               String var3 = class197.method1724(true, arg0);
               if (var3 != null) {
                  int var4 = 0;
                  String var5;
                  String var6;
                  if (var2) {
                     var5 = class197.method1724(true, class201.field2879[var4]);
                     if (var5 != null && var5.equals(var3)) {
                        class249.method2149(-98, arg0 + class765.field10941.method5512(-2, class777.field11340), 4);
                        return;
                     }

                     if (class428.field6276[var4] != null) {
                        var6 = class197.method1724(true, class428.field6276[var4]);
                        if (var6 != null && var6.equals(var3)) {
                           class249.method2149(-93, arg0 + class765.field10941.method5512(-2, class777.field11340), 4);
                           return;
                        }
                     }

                     ++var4;
                  }

                  while(true) {
                     int var10000;
                     if (~class428.field6272 >= ~var4) {
                        var10000 = arg1;
                        if (!var2) {
                           if (arg1 > -108) {
                              field5590 = 2;
                           }

                           int var7 = 0;
                           class242 var10;
                           class381 var11;
                           boolean var14;
                           if (var2) {
                              var14 = true;
                           } else if (class265.field4046 <= var7) {
                              var14 = class197.method1724(true, class117.field1849.field2402).equals(var3);
                              if (!var2) {
                                 if (var14) {
                                    class249.method2149(-128, class765.field10944.method5512(-2, class777.field11340), 4);
                                    return;
                                 }

                                 ++class495.field7062;
                                 var10 = class735.method5318(-123);
                                 var11 = class801.method5775(class768.field11020, 0, var10.field3718);
                                 var11.field5570.method656((byte)45, class519.method3880(false, arg0));
                                 var11.field5570.method658(arg0, -41);
                                 var10.method2111(14024, var11);
                                 return;
                              }
                           } else {
                              var14 = true;
                           }

                           while(true) {
                              String var8 = class197.method1724(var14, class321.field4793[var7]);
                              if (var8 != null && var8.equals(var3)) {
                                 class249.method2149(-6, class765.field10946.method5512(-2, class777.field11340) + arg0 + class765.field10947.method5512(-2, class777.field11340), 4);
                                 return;
                              }

                              if (class169.field2533[var7] != null) {
                                 String var9 = class197.method1724(true, class169.field2533[var7]);
                                 if (var9 != null && var9.equals(var3)) {
                                    class249.method2149(-106, class765.field10946.method5512(-2, class777.field11340) + arg0 + class765.field10947.method5512(-2, class777.field11340), 4);
                                    return;
                                 }
                              }

                              ++var7;
                              if (class265.field4046 <= var7) {
                                 var14 = class197.method1724(true, class117.field1849.field2402).equals(var3);
                                 if (!var2) {
                                    if (var14) {
                                       class249.method2149(-128, class765.field10944.method5512(-2, class777.field11340), 4);
                                       return;
                                    }

                                    ++class495.field7062;
                                    var10 = class735.method5318(-123);
                                    var11 = class801.method5775(class768.field11020, 0, var10.field3718);
                                    var11.field5570.method656((byte)45, class519.method3880(false, arg0));
                                    var11.field5570.method658(arg0, -41);
                                    var10.method2111(14024, var11);
                                    return;
                                 }
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     } else {
                        var10000 = 1;
                     }

                     var5 = class197.method1724((boolean)var10000, class201.field2879[var4]);
                     if (var5 != null && var5.equals(var3)) {
                        class249.method2149(-98, arg0 + class765.field10941.method5512(-2, class777.field11340), 4);
                        return;
                     }

                     if (class428.field6276[var4] != null) {
                        var6 = class197.method1724(true, class428.field6276[var4]);
                        if (var6 != null && var6.equals(var3)) {
                           class249.method2149(-93, arg0 + class765.field10941.method5512(-2, class777.field11340), 4);
                           return;
                        }
                     }

                     ++var4;
                  }
               }
            } else {
               class249.method2149(-100, class765.field10914.method5512(-2, class777.field11340), 4);
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field5594[1] + (arg0 != null ? field5594[2] : field5594[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "<init>",
      descriptor = "(Laea;IIII)V"
   )
   public class383(class678 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);

      try {
         this.field5578 = arg4;
         this.field5582 = arg2;
         this.field5589 = arg3;
         super.field10293.method4906(-2, this);
         OpenGL.glTexImage3Dub(super.field10295, 0, super.field10288, this.field5582, this.field5589, this.field5578, 0, class14.method117(-18924, super.field10288), 5121, (byte[])null, 0);
         this.method5204(true, -1);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5594[6] + (arg0 != null ? field5594[2] : field5594[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method2984(byte arg0) {
      try {
         field5587 = null;
         if (arg0 < 37) {
            method2983((String)null, -112);
         }

         field5583 = null;
         field5588 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5594[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method2985(int arg0) {
      try {
         ++field5580;
         class662.field9322.method1052(true);
         if (arg0 != 22257) {
            field5588 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5594[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method2986(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field5581;
         int var2 = 0;
         int var3 = -72 / ((arg0 - 36) / 63);
         int var4 = 0;
         if (var1 || ~class234.field3626 < ~var4) {
            do {
               int var5 = 0;
               if (var1) {
                  if (class393.method3046(class324.field4826, var2, -83, true, var4, var5)) {
                     ++var2;
                  }

                  if (~var2 <= -513) {
                     return;
                  }

                  ++var5;
               }

               while(true) {
                  while(~var5 > ~class209.field2989) {
                     if (class393.method3046(class324.field4826, var2, -83, true, var4, var5)) {
                        ++var2;
                     }

                     if (~var2 <= -513) {
                        return;
                     }

                     ++var5;
                  }

                  if (!var1) {
                     ++var4;
                     break;
                  }

                  if (~var2 <= -513) {
                     return;
                  }

                  ++var5;
               }
            } while(~class234.field3626 < ~var4);

         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5594[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method69(int arg0) {
      try {
         OpenGL.glFramebufferTexture3DEXT(this.field5593, this.field5586, super.field10295, 0, 0, 0);
         ++field5585;
         this.field5593 = -1;
         if (arg0 != -4249) {
            method2984((byte)-65);
         }

         this.field5586 = -1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5594[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(IIBLia;)J"
   )
   public static final long method2987(int arg0, int arg1, byte arg2, class338 arg3) {
      try {
         ++field5592;
         long var4 = 4194304L;
         long var6 = Long.MIN_VALUE;
         class544 var8 = class549.field7834.method3850(3917, arg3.method724(23976));
         long var9 = (long)(1073741824 | arg3.method733(28344) << 14 | arg0 | arg1 << 7 | arg3.method734(-5723) << 20);
         if (~var8.field7716 == -1) {
            var9 |= var6;
         }

         if (var8.field7726 == 1) {
            var9 |= var4;
         }

         if (arg2 >= -4) {
            method2985(104);
         }

         return var9 | (long)arg3.method724(23976) << 32;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field5594[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5594[2] : field5594[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "([BIBIII[BII)V"
   )
   public static final void method2988(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      boolean var9 = client.field10022;

      try {
         ++field5584;
         int var10 = -(arg7 >> 2);
         int var16 = -(arg7 & 3);
         int var11 = -arg3;
         int var10000;
         if (var9) {
            var10000 = var10;
         } else if (var11 >= 0) {
            var10000 = arg2;
            if (!var9) {
               if (arg2 >= -73) {
                  field5583 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = var10;
         }

         label106:
         while(true) {
            int var12 = var10000;
            int var10001;
            if (var9) {
               var10001 = arg1++;
               arg6[var10001] += arg0[arg4++];
               int var17 = arg1++;
               arg6[var17] += arg0[arg4++];
               int var18 = arg1++;
               arg6[var18] += arg0[arg4++];
               int var19 = arg1++;
               arg6[var19] += arg0[arg4++];
               ++var12;
            }

            while(true) {
               while(~var12 > -1) {
                  var10001 = arg1++;
                  arg6[var10001] += arg0[arg4++];
                  var10001 = arg1++;
                  arg6[var10001] += arg0[arg4++];
                  var10001 = arg1++;
                  arg6[var10001] += arg0[arg4++];
                  var10001 = arg1++;
                  arg6[var10001] += arg0[arg4++];
                  ++var12;
               }

               int var13 = var16;
               if (!var9) {
                  if (var9) {
                     var10001 = arg1++;
                     arg6[var10001] += arg0[arg4++];
                     var13 = var16 + 1;
                  }

                  while(true) {
                     while(~var13 > -1) {
                        var10001 = arg1++;
                        arg6[var10001] += arg0[arg4++];
                        ++var13;
                     }

                     arg1 += arg5;
                     arg4 += arg8;
                     if (!var9) {
                        ++var11;
                        if (var11 >= 0) {
                           var10000 = arg2;
                           if (!var9) {
                              if (arg2 >= -73) {
                                 field5583 = null;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = var10;
                        }
                        continue label106;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field5594[10] + (arg0 != null ? field5594[2] : field5594[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5594[2] : field5594[3]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2989(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2990(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
