import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class167 {
   @OriginalMember(
      owner = "client!rg",
      name = "f",
      descriptor = "Lpf;"
   )
   public class424 field2513 = new class424();
   @OriginalMember(
      owner = "client!rg",
      name = "g",
      descriptor = "Z"
   )
   public boolean field2516 = false;
   @OriginalMember(
      owner = "client!rg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2517 = new String[]{method1572(method1571("b\u0005\u007f~g")), method1572(method1571("~\u0017=S")), method1572(method1571("kL\u007f\u00112")), method1572(method1571("b\u0005\u007fyg")), method1572(method1571("b\u0005\u007f\u0003&~\u000b%\u0001g")), method1572(method1571("b\u0005\u007fzg")), method1572(method1571("b\u0005\u007f}g")), method1572(method1571("b\u0005\u007f{g")), method1572(method1571("b\u0005\u007f|g"))};
   @OriginalMember(
      owner = "client!rg",
      name = "e",
      descriptor = "I"
   )
   public static int field2509;
   @OriginalMember(
      owner = "client!rg",
      name = "h",
      descriptor = "I"
   )
   public static int field2510;
   @OriginalMember(
      owner = "client!rg",
      name = "d",
      descriptor = "I"
   )
   public static int field2512;
   @OriginalMember(
      owner = "client!rg",
      name = "c",
      descriptor = "I"
   )
   public static int field2514;
   @OriginalMember(
      owner = "client!rg",
      name = "b",
      descriptor = "I"
   )
   public static int field2515;
   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2511;

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(III[FIII)V"
   )
   public static final void method1565(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field10022;

      try {
         ++field2514;
         if (~arg1 < -1 && !class122.method1209(arg1, -36)) {
            throw new IllegalArgumentException("");
         } else if (~arg2 < -1 && !class122.method1209(arg2, 112)) {
            throw new IllegalArgumentException("");
         } else {
            if (arg6 < 98) {
               field2511 = null;
            }

            int var8 = class104.method1022((byte)119, arg0);
            int var9 = 0;
            int var10 = arg1 >= arg2 ? arg2 : arg1;
            int var11 = arg1 >> 1;
            int var12 = arg2 >> 1;
            float[] var13 = arg3;
            float[] var14 = new float[var11 * var12 * var8];

            while(true) {
               OpenGL.glTexImage2Df(arg4, var9, arg5, arg1, arg2, 0, arg0, 5126, var13, 0);
               if (var10 <= 1) {
                  return;
               }

               int var10000;
               label91: {
                  int var15 = arg1 * var8;
                  float[] var16 = var14;
                  int var17 = 0;
                  if (var7) {
                     var10000 = var17;
                  } else if (var17 >= var8) {
                     var14 = var13;
                     arg1 = var11;
                     var13 = var16;
                     arg2 = var12;
                     var10 >>= 1;
                     var11 >>= 1;
                     var10000 = var12 >> 1;
                     if (!var7) {
                        break label91;
                     }
                  } else {
                     var10000 = var17;
                  }

                  while(true) {
                     int var18 = var10000;
                     int var19 = var17;
                     int var20 = var15 + var17;
                     int var21 = 0;
                     if (var7 || var21 < var12) {
                        do {
                           int var22 = 0;
                           if (var7 || var22 < var11) {
                              do {
                                 float var23 = var13[var19];
                                 int var24 = var8 + var19;
                                 float var25 = var13[var24] + var23;
                                 var19 = var8 + var24;
                                 float var26 = var13[var20] + var25;
                                 int var27 = var8 + var20;
                                 float var28 = var13[var27] + var26;
                                 var14[var18] = var28 * 0.25F;
                                 var20 = var8 + var27;
                                 var18 += var8;
                                 ++var22;
                              } while(var22 < var11);
                           }

                           var20 += var15;
                           var19 += var15;
                           ++var21;
                        } while(var21 < var12);
                     }

                     ++var17;
                     if (var17 >= var8) {
                        var14 = var13;
                        arg1 = var11;
                        var13 = var16;
                        arg2 = var12;
                        var10 >>= 1;
                        var11 >>= 1;
                        var10000 = var12 >> 1;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var17;
                     }
                  }
               }

               var12 = var10000;
               ++var9;
            }
         }
      } catch (RuntimeException var30) {
         throw class612.method4503(var30, field2517[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2517[2] : field2517[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1566(int arg0, int arg1) {
      try {
         ++field2509;
         if (arg1 != 0) {
            return false;
         } else {
            return arg0 == 2 || ~arg0 == -4;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2517[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1567(byte arg0) {
      boolean var2 = client.field10022;

      try {
         while(true) {
            class731 var3 = (class731)this.field2513.method3303((byte)125);
            if (var3 != null) {
               var3.method4994((byte)-109);
               class267.method2282(var3, -7073);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            ++field2510;
            break;
         }

         if (arg0 != -110) {
            field2511 = null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2517[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(ILwba;)V"
   )
   public final void method1568(int arg0, class731 arg1) {
      boolean var3 = client.field10022;

      RuntimeException var10000;
      label124: {
         class471 var4;
         class731 var9;
         boolean var10001;
         try {
            boolean var14;
            label76: {
               ++field2515;
               var4 = arg1.field10399;
               boolean var5 = true;
               class213[] var6 = arg1.field10397;
               int var7 = 0;
               if (var3) {
                  var14 = var6[var7].field3053;
               } else if (~var6.length >= ~var7) {
                  var14 = var5;
                  if (!var3) {
                     break label76;
                  }
               } else {
                  var14 = var6[var7].field3053;
               }

               label75:
               do {
                  while(true) {
                     if (var14) {
                        var5 = false;
                        if (!var3) {
                           var14 = var5;
                           break;
                        }

                        ++var7;
                     } else {
                        ++var7;
                     }

                     if (~var6.length >= ~var7) {
                        var14 = var5;
                        if (!var3) {
                           break label75;
                        }
                     } else {
                        var14 = var6[var7].field3053;
                     }
                  }
               } while(var3);
            }

            if (var14) {
               return;
            }

            label107: {
               class731 var8;
               if (this.field2516) {
                  var8 = (class731)this.field2513.method3307(arg0 + 31288);
                  if (var3) {
                     if (var8.field10399 == var4) {
                        var8.method4994((byte)-109);
                        class267.method2282(var8, -7073);
                     }

                     var8 = (class731)this.field2513.method3309(true);
                  }
               } else {
                  var9 = (class731)this.field2513.method3307(16976);
                  if (!var3) {
                     break label107;
                  }

                  var8 = (class731)this.field2513.method3309(true);
               }

               while(true) {
                  while(var8 != null) {
                     if (var8.field10399 == var4) {
                        var8.method4994((byte)-109);
                        class267.method2282(var8, -7073);
                     }

                     var8 = (class731)this.field2513.method3309(true);
                  }

                  var9 = (class731)this.field2513.method3307(16976);
                  if (!var3) {
                     break;
                  }

                  var8 = (class731)this.field2513.method3309(true);
               }
            }

            if (arg0 != -14312) {
               return;
            }
         } catch (RuntimeException var13) {
            var10000 = var13;
            var10001 = false;
            break label124;
         }

         while(true) {
            label119: {
               try {
                  if (var9 != null) {
                     if (var4.field6837 >= var9.field10399.field6837) {
                        class171.method1590(0, var9, arg1);
                        return;
                     }
                     break label119;
                  }

                  this.field2513.method3310(0, arg1);
               } catch (RuntimeException var12) {
                  var10000 = var12;
                  var10001 = false;
                  break;
               }

               if (!var3) {
                  return;
               }
            }

            try {
               var9 = (class731)this.field2513.method3309(true);
            } catch (RuntimeException var11) {
               var10000 = var11;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var10 = var10000;
      throw class612.method4503(var10, field2517[3] + arg0 + ',' + (arg1 != null ? field2517[2] : field2517[1]) + ')');
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1569(int arg0) {
      try {
         if (arg0 != -4) {
            method1566(10, -51);
         }

         field2511 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2517[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   public static final void method1570(int arg0, class65 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2512;
         if (arg0 >= 69) {
            int var3 = 0;
            if (var2 || class477.field6875 > var3) {
               do {
                  int var4 = arg1.method682(-86);
                  int var5 = arg1.method685(-2);
                  if (var5 == 65535) {
                     var5 = -1;
                  }

                  if (class492.field7017[var4] != null) {
                     class492.field7017[var4].field11525 = var5;
                  }

                  ++var3;
               } while(class477.field6875 > var3);

            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2517[0] + arg0 + ',' + (arg1 != null ? field2517[2] : field2517[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class167(boolean arg0) {
      try {
         this.field2516 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2517[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1571(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1572(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
