import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class4 extends class110 implements class371 {
   @OriginalMember(
      owner = "client!dq",
      name = "K",
      descriptor = "I"
   )
   private int field40;
   @OriginalMember(
      owner = "client!dq",
      name = "B",
      descriptor = "I"
   )
   private int field48;
   @OriginalMember(
      owner = "client!dq",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field53 = new String[]{method33(method32("j\u0006$_\u001e")), method33(method32("j\u0006$]\u001e")), method33(method32("j\u0006$U\u001e")), method33(method32("j\u0006$Sw&")), method33(method32("`\u0002f}")), method33(method32("uY$?K")), method33(method32("j\u0006$[\u001e")), method33(method32("j\u0006$Y\u001e")), method33(method32("j\u0006$-_`\u001e~/\u001e")), method33(method32("j\u0006$S\u001e")), method33(method32("j\u0006$V\u001e")), method33(method32("j\u0006$\\\u001e")), method33(method32("j\u0006$W\u001e")), method33(method32("j\u0006$P\u001e")), method33(method32("j\u0006$R\u001e")), method33(method32("j\u0006$Pw&")), method33(method32("j\u0006$Rw&"))};
   @OriginalMember(
      owner = "client!dq",
      name = "L",
      descriptor = "Lhha;"
   )
   public static class724 field51 = new class724(24, 1);
   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "Lfm;"
   )
   public static class164 field52 = new class164(6, 8);
   @OriginalMember(
      owner = "client!dq",
      name = "I",
      descriptor = "I"
   )
   public static int field36;
   @OriginalMember(
      owner = "client!dq",
      name = "y",
      descriptor = "I"
   )
   public static int field37;
   @OriginalMember(
      owner = "client!dq",
      name = "C",
      descriptor = "I"
   )
   public static int field38;
   @OriginalMember(
      owner = "client!dq",
      name = "M",
      descriptor = "I"
   )
   public static int field39;
   @OriginalMember(
      owner = "client!dq",
      name = "H",
      descriptor = "I"
   )
   public static int field41;
   @OriginalMember(
      owner = "client!dq",
      name = "J",
      descriptor = "I"
   )
   public static int field42;
   @OriginalMember(
      owner = "client!dq",
      name = "G",
      descriptor = "I"
   )
   public static int field43;
   @OriginalMember(
      owner = "client!dq",
      name = "D",
      descriptor = "I"
   )
   public static int field44;
   @OriginalMember(
      owner = "client!dq",
      name = "E",
      descriptor = "I"
   )
   public static int field45;
   @OriginalMember(
      owner = "client!dq",
      name = "N",
      descriptor = "I"
   )
   public static int field46;
   @OriginalMember(
      owner = "client!dq",
      name = "F",
      descriptor = "I"
   )
   public static int field47;
   @OriginalMember(
      owner = "client!dq",
      name = "A",
      descriptor = "I"
   )
   public static int field49;
   @OriginalMember(
      owner = "client!dq",
      name = "x",
      descriptor = "I"
   )
   public static int field50;

   @OriginalMember(
      owner = "client!dq",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method18(byte arg0) {
      try {
         ++field44;
         if (arg0 != -9) {
            this.method27(true);
         }

         return this.field48;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field53[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IIIILsr;BII[F)V"
   )
   public final void method19(int arg0, int arg1, int arg2, int arg3, class78 arg4, byte arg5, int arg6, int arg7, float[] arg8) {
      try {
         super.field1715.method1943(0, this);
         if (arg5 != 93) {
            field51 = null;
         }

         ++field39;
         OpenGL.glPixelStorei(3314, arg7);
         OpenGL.glTexSubImage2Df(super.field1719, 0, arg0, arg1, arg3, arg6, class186.method1672((byte)-111, arg4), 5121, arg8, arg2);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field53[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field53[5] : field53[4]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field53[5] : field53[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "<init>",
      descriptor = "(Lqs;IIZ[III)V"
   )
   public class4(class771 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, 3553, class31.field438, class779.field11371, arg1 * arg2, arg3);

      try {
         this.field40 = arg2;
         this.field48 = arg1;
         super.field1715.method1943(0, this);
         if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method1068(arg1, arg2, super.field1719, arg4, (byte)28);
         } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field1719, 0, 6408, this.field48, this.field40, 0, 32993, super.field1715.field11153, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field53[8] + (arg0 != null ? field53[5] : field53[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field53[5] : field53[4]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(FI[FI[FIBIIIFIFI)V"
   )
   public static final void method20(float arg0, int arg1, float[] arg2, int arg3, float[] arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, float arg10, int arg11, float arg12, int arg13) {
      boolean var14 = client.field10022;

      try {
         int var24 = arg1 - arg5;
         ++field49;
         int var26 = arg13 - arg11;
         int var25 = arg9 - arg3;
         float var15 = arg4[2] * (float)var25 + arg4[1] * (float)var24 + arg4[0] * (float)var26;
         float var16 = arg4[5] * (float)var25 + arg4[4] * (float)var24 + arg4[3] * (float)var26;
         float var17 = arg4[8] * (float)var25 + arg4[6] * (float)var26 + arg4[7] * (float)var24;
         if (arg6 > -14) {
            field52 = null;
         }

         float var18;
         float var19;
         label73: {
            if (arg8 != 0) {
               if (~arg8 == -2) {
                  var18 = arg12 + var15 + 0.5F;
                  var19 = arg10 + var17 + 0.5F;
                  if (!var14) {
                     break label73;
                  }
               }

               if (~arg8 == -3) {
                  var19 = -var16 + arg0 + 0.5F;
                  var18 = -var15 + arg12 + 0.5F;
                  if (!var14) {
                     break label73;
                  }
               }

               if (~arg8 != -4) {
                  if (~arg8 == -5) {
                     var18 = arg10 + var17 + 0.5F;
                     var19 = -var16 + arg0 + 0.5F;
                     if (!var14) {
                        break label73;
                     }
                  }

                  var19 = -var16 + arg0 + 0.5F;
                  var18 = -var17 + arg10 + 0.5F;
                  if (!var14) {
                     break label73;
                  }
               }

               var18 = arg12 + var15 + 0.5F;
               var19 = -var16 + arg0 + 0.5F;
               if (!var14) {
                  break label73;
               }
            }

            var18 = arg12 + var15 + 0.5F;
            var19 = -var17 + arg10 + 0.5F;
         }

         label80: {
            if (arg7 == 1) {
               float var20 = var18;
               var18 = -var19;
               var19 = var20;
               if (!var14) {
                  break label80;
               }
            }

            if (arg7 == 2) {
               var18 = -var18;
               var19 = -var19;
               if (!var14) {
                  break label80;
               }
            }

            if (~arg7 == -4) {
               float var21 = var18;
               var18 = var19;
               var19 = -var21;
            }
         }

         arg2[0] = var18;
         arg2[1] = var19;
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field53[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field53[5] : field53[4]) + ',' + arg3 + ',' + (arg4 != null ? field53[5] : field53[4]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(FI)F"
   )
   public final float method21(float arg0, int arg1) {
      try {
         if (arg1 != 11439) {
            this.field48 = -13;
         }

         ++field47;
         return arg0 / (float)this.field48;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field53[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IIILsr;IIII[B)V"
   )
   public final void method22(int arg0, int arg1, int arg2, class78 arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
      try {
         super.field1715.method1943(0, this);
         ++field42;
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg0);
         OpenGL.glTexSubImage2Dub(super.field1719, 0, arg4, arg1, arg5, arg7, class186.method1672((byte)-98, arg3), 5121, arg8, arg6);
         OpenGL.glPixelStorei(3314, 0);
         OpenGL.glPixelStorei(3317, 4);
         if (arg2 >= -17) {
            method23(-3, 78, (byte)-82, (class678)null, 47);
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field53[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field53[5] : field53[4]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field53[5] : field53[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IIBLaea;I)Lefa;"
   )
   public static final class436 method23(int arg0, int arg1, byte arg2, class678 arg3, int arg4) {
      try {
         ++field43;
         if (arg2 >= -88) {
            method20(0.56601036F, -128, (float[])null, 75, (float[])null, -57, (byte)6, 126, -107, 58, -0.21291849F, -24, -1.6977987F, 45);
         }

         if (arg3.field9791 || class122.method1209(arg0, -128) && class122.method1209(arg1, -53)) {
            return new class436(arg3, 3553, arg4, arg0, arg1);
         } else {
            return arg3.field9777 ? new class436(arg3, 34037, arg4, arg0, arg1) : new class436(arg3, arg4, arg0, arg1, class645.method4694(arg0, (byte)-128), class645.method4694(arg1, (byte)-128));
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field53[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field53[5] : field53[4]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IIII[III)V"
   )
   public final void method24(int param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IIIIII[II)V"
   )
   public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
      try {
         ++field46;
         super.field1715.method1943(0, this);
         if (arg2 != -20998) {
            method23(98, 72, (byte)39, (class678)null, 120);
         }

         OpenGL.glPixelStorei(3314, arg4);
         OpenGL.glTexSubImage2Di(super.field1719, 0, arg7, arg1, arg5, arg3, 32993, super.field1715.field11153, arg6, arg0);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field53[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field53[5] : field53[4]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "b",
      descriptor = "(FI)F"
   )
   public final float method26(float arg0, int arg1) {
      try {
         if (arg1 != -22887) {
            return 0.057016924F;
         } else {
            ++field38;
            return arg0 / (float)this.field40;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field53[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method27(boolean arg0) {
      try {
         ++field37;
         return !arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field53[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method28(byte arg0) {
      try {
         if (arg0 > -53) {
            this.method26(0.5289266F, 98);
         }

         ++field50;
         return this.field40;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field53[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IJ)Ljava/lang/String;"
   )
   public static final String method29(int arg0, long arg1) {
      boolean var3 = client.field10022;

      try {
         ++field36;
         if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (arg1 % 37L == 0L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg1;
               if (arg0 != -32611) {
                  return null;
               } else {
                  while(true) {
                     if (~var5 == -1L) {
                        StringBuffer var7 = new StringBuffer(var4);
                        if (!var3) {
                           if (!var3 && arg1 == 0L) {
                              var7.reverse();
                              var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                              return var7.toString();
                           } else {
                              do {
                                 long var8 = arg1;
                                 arg1 /= 37L;
                                 char var10 = class465.field6757[(int)(-(arg1 * 37L) + var8)];
                                 if (~var10 == -96) {
                                    int var11 = var7.length() - 1;
                                    var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                                    var10 = 160;
                                 }

                                 var7.append(var10);
                              } while(arg1 != 0L);

                              var7.reverse();
                              var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                              return var7.toString();
                           }
                        }
                     } else {
                        var5 /= 37L;
                     }

                     ++var4;
                  }
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field53[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method30(int arg0) {
      try {
         int var1 = 27 / ((arg0 - -66) / 41);
         field52 = null;
         field51 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field53[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "<init>",
      descriptor = "(Lqs;Lsr;Lob;II)V"
   )
   public class4(class771 arg0, class78 arg1, class779 arg2, int arg3, int arg4) {
      super(arg0, 3553, arg1, arg2, arg3 * arg4, false);

      try {
         this.field40 = arg4;
         this.field48 = arg3;
         super.field1715.method1943(0, this);
         OpenGL.glTexImage2Dub(super.field1719, 0, this.method1073(-2), arg3, arg4, 0, class186.method1672((byte)-114, super.field1720), class453.method3492((byte)62, super.field1714), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field53[8] + (arg0 != null ? field53[5] : field53[4]) + ',' + (arg1 != null ? field53[5] : field53[4]) + ',' + (arg2 != null ? field53[5] : field53[4]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "<init>",
      descriptor = "(Lqs;Lsr;IIZ[FII)V"
   )
   public class4(class771 arg0, class78 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class779.field11375, arg2 * arg3, arg4);

      try {
         this.field40 = arg3;
         this.field48 = arg2;
         super.field1715.method1943(0, this);
         if (!arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method1076(super.field1719, arg2, arg3, true, arg5);
         } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field1719, 0, this.method1073(-2), arg2, arg3, 0, class186.method1672((byte)-90, super.field1720), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field53[8] + (arg0 != null ? field53[5] : field53[4]) + ',' + (arg1 != null ? field53[5] : field53[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field53[5] : field53[4]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(ZZZ)V"
   )
   public final void method31(boolean arg0, boolean arg1, boolean arg2) {
      try {
         if (!arg1) {
            ++field45;
            super.field1715.method1943(0, this);
            OpenGL.glTexParameteri(super.field1719, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field1719, 10243, !arg2 ? 33071 : 10497);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field53[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "<init>",
      descriptor = "(Lqs;Lsr;IIZ[BII)V"
   )
   public class4(class771 arg0, class78 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class779.field11371, arg2 * arg3, arg4);

      try {
         label53: {
            this.field48 = arg2;
            this.field40 = arg3;
            super.field1715.method1943(0, this);
            OpenGL.glPixelStorei(3317, 1);
            if (!arg4 || ~arg7 != -1 || ~arg6 != -1) {
               OpenGL.glPixelStorei(3314, arg7);
               OpenGL.glTexImage2Dub(super.field1719, 0, this.method1073(-2), arg2, arg3, 0, class186.method1672((byte)-78, super.field1720), 5121, arg5, arg6);
               OpenGL.glPixelStorei(3314, 0);
               if (!client.field10022) {
                  break label53;
               }
            }

            this.method1072(arg2, arg3, arg5, super.field1719, -99);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field53[8] + (arg0 != null ? field53[5] : field53[4]) + ',' + (arg1 != null ? field53[5] : field53[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field53[5] : field53[4]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method32(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method33(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
