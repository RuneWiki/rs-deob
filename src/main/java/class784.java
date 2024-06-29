import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class784 {
   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "[B"
   )
   private byte[] field11421;
   @OriginalMember(
      owner = "client!ap",
      name = "i",
      descriptor = "[I"
   )
   private int[] field11415;
   @OriginalMember(
      owner = "client!ap",
      name = "j",
      descriptor = "[I"
   )
   private int[] field11420;
   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11426 = new String[]{method5665(method5664("`AH\u0011")), method5665(method5664("u\u001a\nS7")), method5665(method5664("oD\nA#`]PCb")), method5665(method5664("oD\n?b")), method5665(method5664("oD\n<b")), method5665(method5664("@[\u0004\u001e%jQS\u00128j\u0014B\u00128.PE\t+.BE\u0011?k\u0014")), method5665(method5664("oD\n8b")), method5665(method5664("]\\E\u0019/|\u0014G\u0012'~]H\u0018jhUM\u0011/j\u000e")), method5665(method5664("oD\n;b")), method5665(method5664("oD\n>b"))};
   @OriginalMember(
      owner = "client!ap",
      name = "h",
      descriptor = "Z"
   )
   public static volatile boolean field11418 = false;
   @OriginalMember(
      owner = "client!ap",
      name = "c",
      descriptor = "Lpf;"
   )
   public static class424 field11424 = new class424();
   @OriginalMember(
      owner = "client!ap",
      name = "b",
      descriptor = "I"
   )
   public static int field11416;
   @OriginalMember(
      owner = "client!ap",
      name = "d",
      descriptor = "I"
   )
   public static int field11417;
   @OriginalMember(
      owner = "client!ap",
      name = "f",
      descriptor = "I"
   )
   public static int field11419;
   @OriginalMember(
      owner = "client!ap",
      name = "e",
      descriptor = "I"
   )
   public static int field11422;
   @OriginalMember(
      owner = "client!ap",
      name = "g",
      descriptor = "I"
   )
   public static int field11423;
   @OriginalMember(
      owner = "client!ap",
      name = "k",
      descriptor = "I"
   )
   public static int field11425;

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(IB[BI[BI)I"
   )
   public final int method5658(int arg0, byte arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
      boolean var7 = client.field10022;

      try {
         ++field11417;
         if (arg3 == 0) {
            return 0;
         } else {
            int var21 = arg0 + arg3;
            int var8 = 0;
            int var9 = arg5;

            do {
               byte var10;
               label96: {
                  var10 = arg2[var9];
                  if (var10 >= 0) {
                     ++var8;
                     if (var7 || !var7) {
                        break label96;
                     }
                  }

                  var8 = this.field11420[var8];
               }

               int var11;
               if (~(var11 = this.field11420[var8]) > -1) {
                  arg4[arg0++] = (byte)(~var11);
                  if (~var21 >= ~arg0) {
                     break;
                  }

                  var8 = 0;
               }

               label164: {
                  if ((var10 & 64) != 0) {
                     var8 = this.field11420[var8];
                     if (!var7) {
                        break label164;
                     }
                  }

                  ++var8;
               }

               int var12;
               if ((var12 = this.field11420[var8]) < 0) {
                  arg4[arg0++] = (byte)(~var12);
                  if (~var21 >= ~arg0) {
                     break;
                  }

                  var8 = 0;
               }

               label158: {
                  if ((32 & var10) != 0) {
                     var8 = this.field11420[var8];
                     if (!var7) {
                        break label158;
                     }
                  }

                  ++var8;
               }

               int var13;
               if ((var13 = this.field11420[var8]) < 0) {
                  arg4[arg0++] = (byte)(~var13);
                  if (var21 <= arg0) {
                     break;
                  }

                  var8 = 0;
               }

               label152: {
                  if ((16 & var10) == 0) {
                     ++var8;
                     if (!var7) {
                        break label152;
                     }
                  }

                  var8 = this.field11420[var8];
               }

               int var14;
               if (~(var14 = this.field11420[var8]) > -1) {
                  arg4[arg0++] = (byte)(~var14);
                  if (~var21 >= ~arg0) {
                     break;
                  }

                  var8 = 0;
               }

               label146: {
                  if (~(var10 & 8) == -1) {
                     ++var8;
                     if (!var7) {
                        break label146;
                     }
                  }

                  var8 = this.field11420[var8];
               }

               int var15;
               if (~(var15 = this.field11420[var8]) > -1) {
                  arg4[arg0++] = (byte)(~var15);
                  if (~arg0 <= ~var21) {
                     break;
                  }

                  var8 = 0;
               }

               label140: {
                  if ((var10 & 4) != 0) {
                     var8 = this.field11420[var8];
                     if (!var7) {
                        break label140;
                     }
                  }

                  ++var8;
               }

               int var16;
               if ((var16 = this.field11420[var8]) < 0) {
                  arg4[arg0++] = (byte)(~var16);
                  if (~var21 >= ~arg0) {
                     break;
                  }

                  var8 = 0;
               }

               label134: {
                  if ((2 & var10) != 0) {
                     var8 = this.field11420[var8];
                     if (!var7) {
                        break label134;
                     }
                  }

                  ++var8;
               }

               int var17;
               if (~(var17 = this.field11420[var8]) > -1) {
                  arg4[arg0++] = (byte)(~var17);
                  if (var21 <= arg0) {
                     break;
                  }

                  var8 = 0;
               }

               label128: {
                  if ((var10 & 1) != 0) {
                     var8 = this.field11420[var8];
                     if (!var7) {
                        break label128;
                     }
                  }

                  ++var8;
               }

               int var18;
               if ((var18 = this.field11420[var8]) < 0) {
                  arg4[arg0++] = (byte)(~var18);
                  if (~arg0 <= ~var21) {
                     break;
                  }

                  var8 = 0;
               }

               ++var9;
            } while(!var7);

            if (arg1 != -103) {
               field11425 = 111;
            }

            return var9 + 1 + -arg5;
         }
      } catch (RuntimeException var20) {
         throw class612.method4503(var20, field11426[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11426[1] : field11426[0]) + ',' + arg3 + ',' + (arg4 != null ? field11426[1] : field11426[0]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(IIII[B[B)I"
   )
   public final int method5659(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
      boolean var7 = client.field10022;

      try {
         ++field11422;
         int var8 = 0;
         int var19 = arg2 + arg3;
         int var9 = arg1 << 3;
         int var10000;
         if (arg0 != -6406) {
            this.method5659(23, 116, -23, -89, (byte[])null, (byte[])null);
            if (var7) {
               var10000 = arg4[arg3] & 255;
            } else if (arg3 >= var19) {
               var10000 = (var9 - -7 >> 3) - arg1;
               if (!var7) {
                  return var10000;
               }
            } else {
               var10000 = arg4[arg3] & 255;
            }
         } else if (arg3 >= var19) {
            var10000 = (var9 - -7 >> 3) - arg1;
            if (!var7) {
               return var10000;
            }
         } else {
            var10000 = arg4[arg3] & 255;
         }

         while(true) {
            int var10 = var10000;
            int var11 = this.field11415[var10];
            byte var12 = this.field11421[var10];
            if (~var12 == -1) {
               throw new RuntimeException(field11426[5] + var10);
            }

            int var13 = var9 >> 3;
            int var14 = var9 & 7;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var20 = var14 + 24;
            arg5[var13] = (byte)(var8 = class91.method932(var15, var11 >>> var20));
            if (var13 < var16) {
               ++var13;
               var14 = var20 - 8;
               arg5[var13] = (byte)(var8 = var11 >>> var14);
               if (~var13 > ~var16) {
                  var14 -= 8;
                  ++var13;
                  arg5[var13] = (byte)(var8 = var11 >>> var14);
                  if (var16 > var13) {
                     var14 -= 8;
                     ++var13;
                     arg5[var13] = (byte)(var8 = var11 >>> var14);
                     if (~var13 > ~var16) {
                        ++var13;
                        var14 -= 8;
                        arg5[var13] = (byte)(var8 = var11 << -var14);
                     }
                  }
               }
            }

            ++arg3;
            if (arg3 >= var19) {
               var10000 = (var9 - -7 >> 3) - arg1;
               if (!var7) {
                  return var10000;
               }
            } else {
               var10000 = arg4[arg3] & 255;
            }
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field11426[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field11426[1] : field11426[0]) + ',' + (arg5 != null ? field11426[1] : field11426[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "([Ldea;II)V"
   )
   public static final void method5660(class471[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class471 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field6837;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field6837 < (var7 & 1) + var6) {
               class471 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method5660(arg0, arg1, var4 - 1);
         method5660(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5661(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field11416;
         class111 var5 = class796.method5734(18, (long)arg3 << 32 | (long)arg4, (byte)-114);
         var5.method1087(0);
         var5.field1739 = arg1;
         if (arg2 == 786971936) {
            var5.field1740 = arg0;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11426[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(ILqs;I[B)Lqo;"
   )
   public static final class170 method5662(int arg0, class771 arg1, int arg2, byte[] arg3) {
      try {
         ++field11419;
         if (arg3 != null && arg3.length != 0) {
            long var4 = OpenGL.glCreateShaderObjectARB(arg2);
            OpenGL.glShaderSourceRawARB(var4, arg3);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class174.field2597, 0);
            if (class174.field2597[0] == arg0) {
               if (class174.field2597[0] == 0) {
                  System.out.println(field11426[7]);
               }

               OpenGL.glGetObjectParameterivARB(var4, 35716, class174.field2597, 1);
               if (class174.field2597[1] > 1) {
                  byte[] var6 = new byte[class174.field2597[1]];
                  OpenGL.glGetInfoLogARB(var4, class174.field2597[1], class174.field2597, 0, var6, 0);
                  System.out.println(new String(var6));
               }

               if (class174.field2597[0] == 0) {
                  OpenGL.glDeleteObjectARB(var4);
                  return null;
               }
            }

            return new class170(arg1, var4, arg2);
         } else {
            return null;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field11426[6] + arg0 + ',' + (arg1 != null ? field11426[1] : field11426[0]) + ',' + arg2 + ',' + (arg3 != null ? field11426[1] : field11426[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class784(byte[] arg0) {
      boolean var2 = client.field10022;
      super();

      try {
         int var3 = arg0.length;
         this.field11421 = arg0;
         this.field11415 = new int[var3];
         int[] var4 = new int[33];
         this.field11420 = new int[8];
         int var5 = 0;
         int var6 = 0;
         if (var2 || ~var6 > ~var3) {
            label234:
            do {
               byte var7 = arg0[var6];
               if (~var7 == -1) {
                  ++var6;
               } else {
                  int var8 = 1 << -var7 + 32;
                  int var9 = var4[var7];
                  this.field11415[var6] = var9;
                  int var13;
                  int var10000;
                  if ((var8 & var9) == 0) {
                     label228: {
                        int var10 = var7 - 1;
                        if (var2) {
                           var10000 = var4[var10];
                        } else if (var10 < 1) {
                           var10000 = var8 | var9;
                           if (!var2) {
                              break label228;
                           }
                        } else {
                           var10000 = var4[var10];
                        }

                        label227:
                        do {
                           while(true) {
                              int var11 = var10000;
                              if (var9 != var11 && !var2) {
                                 var10000 = var8 | var9;
                                 break;
                              }

                              int var12 = 1 << -var10 + 32;
                              if ((var12 & var11) != 0) {
                                 var4[var10] = var4[var10 + -1];
                                 if (!var2) {
                                    var10000 = var8 | var9;
                                    if (!var2) {
                                       break label227;
                                    }
                                    continue;
                                 }

                                 var4[var10] = class91.method932(var12, var11);
                                 --var10;
                              } else {
                                 var4[var10] = class91.method932(var12, var11);
                                 --var10;
                              }

                              if (var10 < 1) {
                                 var10000 = var8 | var9;
                                 if (!var2) {
                                    break label227;
                                 }
                              } else {
                                 var10000 = var4[var10];
                              }
                           }
                        } while(var2);
                     }

                     var13 = var10000;
                     if (var2) {
                        var13 = var4[var7 - 1];
                     }
                  } else {
                     var13 = var4[var7 - 1];
                  }

                  var4[var7] = var13;
                  int var14 = var7 - -1;
                  if (var2) {
                     if (~var4[var14] == ~var9) {
                        var4[var14] = var13;
                     }

                     ++var14;
                  }

                  while(true) {
                     while(var14 <= 32) {
                        if (~var4[var14] == ~var9) {
                           var4[var14] = var13;
                        }

                        ++var14;
                     }

                     byte var15 = 0;
                     int var16 = 0;
                     if (!var2) {
                        int var17;
                        int var10001;
                        int var23;
                        if (var2) {
                           var17 = Integer.MIN_VALUE >>> var16;
                           if (~(var9 & var17) != -1) {
                              if (this.field11420[var15] == 0) {
                                 this.field11420[var15] = var5;
                              }

                              var23 = this.field11420[var15];
                              if (var2) {
                                 ++var23;
                              }
                           } else {
                              var23 = var15 + 1;
                           }
                        } else {
                           if (~var16 <= ~var7) {
                              this.field11420[var15] = ~var6;
                              var10000 = ~var5;
                              var10001 = ~var15;
                              if (!var2) {
                                 if (var10000 >= var10001) {
                                    var5 = var15 + 1;
                                 }

                                 ++var6;
                                 break;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var16;
                           }

                           var17 = var10000 >>> var10001;
                           if (~(var9 & var17) != -1) {
                              if (this.field11420[var15] == 0) {
                                 this.field11420[var15] = var5;
                              }

                              var23 = this.field11420[var15];
                              if (var2) {
                                 ++var23;
                              }
                           } else {
                              var23 = var15 + 1;
                           }
                        }

                        while(true) {
                           int var20;
                           if (var23 < this.field11420.length) {
                              var20 = var17 >>> 1;
                              ++var16;
                           } else {
                              int[] var18 = new int[this.field11420.length * 2];
                              int var19 = 0;
                              if (var2) {
                                 var18[var19] = this.field11420[var19];
                                 ++var19;
                              }

                              while(true) {
                                 while(~var19 > ~this.field11420.length) {
                                    var18[var19] = this.field11420[var19];
                                    ++var19;
                                 }

                                 if (!var2) {
                                    this.field11420 = var18;
                                    var20 = var17 >>> 1;
                                    ++var16;
                                    break;
                                 }

                                 ++var19;
                              }
                           }

                           if (~var16 <= ~var7) {
                              this.field11420[var23] = ~var6;
                              var10000 = ~var5;
                              var10001 = ~var23;
                              if (!var2) {
                                 if (var10000 >= var10001) {
                                    var5 = var23 + 1;
                                 }

                                 ++var6;
                                 continue label234;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var16;
                           }

                           var17 = var10000 >>> var10001;
                           if (~(var9 & var17) != -1) {
                              if (this.field11420[var23] == 0) {
                                 this.field11420[var23] = var5;
                              }

                              var23 = this.field11420[var23];
                              if (var2) {
                                 ++var23;
                              }
                           } else {
                              ++var23;
                           }
                        }
                     }

                     ++var14;
                  }
               }
            } while(~var6 > ~var3);

         }
      } catch (RuntimeException var22) {
         throw class612.method4503(var22, field11426[2] + (arg0 != null ? field11426[1] : field11426[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5663(int arg0) {
      try {
         field11424 = null;
         int var1 = -96 % ((arg0 - -34) / 46);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11426[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5664(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5665(char[] arg0) {
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
            var10005 = 52;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
