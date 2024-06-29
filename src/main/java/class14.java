import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class14 {
   @OriginalMember(
      owner = "client!mc",
      name = "m",
      descriptor = "Llj;"
   )
   private class304 field175 = new class304(64);
   @OriginalMember(
      owner = "client!mc",
      name = "f",
      descriptor = "Lrr;"
   )
   private class678 field185;
   @OriginalMember(
      owner = "client!mc",
      name = "g",
      descriptor = "Led;"
   )
   public class47 field187;
   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field188 = new String[]{method109(method108("\u001aY|0")), method109(method108("\u000f\u0002>r2")), method109(method108("\u0019O>\u001bg")), method109(method108("\u0019O>\u001ag")), method109(method108("\u0019O>\u0014g")), method109(method108("\u0019O>\u001eg")), method109(method108("\u0019O>`&\u001aEdbg")), method109(method108("\u0019O>\u001dg")), method109(method108("\u0019O>\u001fg")), method109(method108("\u0019O>\u0019g")), method109(method108("\u0019O>\u0018g"))};
   @OriginalMember(
      owner = "client!mc",
      name = "c",
      descriptor = "I"
   )
   public static int field178 = 0;
   @OriginalMember(
      owner = "client!mc",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field183 = new int[]{0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
   @OriginalMember(
      owner = "client!mc",
      name = "e",
      descriptor = "[C"
   )
   public static char[] field182 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   @OriginalMember(
      owner = "client!mc",
      name = "k",
      descriptor = "I"
   )
   public static int field177 = 0;
   @OriginalMember(
      owner = "client!mc",
      name = "o",
      descriptor = "I"
   )
   public static int field173;
   @OriginalMember(
      owner = "client!mc",
      name = "n",
      descriptor = "I"
   )
   public static int field174;
   @OriginalMember(
      owner = "client!mc",
      name = "j",
      descriptor = "I"
   )
   public static int field176;
   @OriginalMember(
      owner = "client!mc",
      name = "l",
      descriptor = "I"
   )
   public static int field179;
   @OriginalMember(
      owner = "client!mc",
      name = "d",
      descriptor = "I"
   )
   public static int field180;
   @OriginalMember(
      owner = "client!mc",
      name = "b",
      descriptor = "I"
   )
   public static int field184;
   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "I"
   )
   public static int field186;
   @OriginalMember(
      owner = "client!mc",
      name = "i",
      descriptor = "[Z"
   )
   public static boolean[] field181;

   @OriginalMember(
      owner = "client!mc",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method100(byte arg0) {
      try {
         field182 = null;
         field183 = null;
         field181 = null;
         if (arg0 < 76) {
            field181 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field188[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "([IIIIIIIB)V"
   )
   public static final void method101(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
      boolean var8 = client.field1786;

      try {
         ++field186;
         if (~arg1 < -1 && !class140.method1285(arg1, -11925)) {
            throw new IllegalArgumentException("");
         } else if (arg4 > 0 && !class140.method1285(arg4, -11925)) {
            throw new IllegalArgumentException("");
         } else if (arg5 != 32993) {
            throw new IllegalArgumentException("");
         } else {
            int var9 = 0;
            int var10 = arg4 > arg1 ? arg1 : arg4;
            int var11 = arg1 >> 1;
            int var12 = arg4 >> 1;
            if (arg7 > 50) {
               int[] var13 = arg0;
               int[] var14 = new int[var11 * var12];

               while(true) {
                  OpenGL.glTexImage2Di(arg3, var9, arg2, arg1, arg4, 0, arg5, arg6, var13, 0);
                  if (~var10 >= -2) {
                     return;
                  }

                  int var10000;
                  label92: {
                     int var15 = 0;
                     int var16 = 0;
                     int var17 = arg1 + var16;
                     int[] var18 = var14;
                     int var19 = 0;
                     if (var8) {
                        var10000 = 0;
                     } else if (~var19 <= ~var12) {
                        var14 = var13;
                        arg1 = var11;
                        var13 = var18;
                        arg4 = var12;
                        var10 >>= 1;
                        var11 >>= 1;
                        var10000 = var12 >> 1;
                        if (!var8) {
                           break label92;
                        }
                     } else {
                        var10000 = 0;
                     }

                     while(true) {
                        label89: {
                           int var20 = var10000;
                           if (var8) {
                              var10000 = var13[var16++];
                           } else if (~var20 <= ~var11) {
                              var17 += arg1;
                              var10000 = arg1 + var16;
                              if (!var8) {
                                 break label89;
                              }
                           } else {
                              var10000 = var13[var16++];
                           }

                           while(true) {
                              int var21 = var10000;
                              int var22 = var13[var16++];
                              int var23 = var13[var17++];
                              int var24 = (16768129 & var21) >> 16;
                              int var25 = var13[var17++];
                              int var26 = 255 & var21 >> 8;
                              int var27 = var21 & 255;
                              int var28 = var21 >> 24 & 255;
                              int var29 = (var22 >> 16 & 255) + var24;
                              int var30 = (var22 >> 24 & 255) + var28;
                              int var31 = (var22 >> 8 & 255) + var26;
                              int var32 = (255 & var22) + var27;
                              int var33 = (var23 >> 8 & 255) + var31;
                              int var34 = (255 & var23 >> 16) + var29;
                              int var35 = (var23 >> 24 & 255) + var30;
                              int var36 = (var23 & 255) + var32;
                              int var37 = (var25 >> 16 & 255) + var34;
                              int var38 = (var25 >> 24 & 255) + var35;
                              int var39 = (255 & var25) + var36;
                              int var40 = ((var25 & 65473) >> 8) + var33;
                              var14[var15++] = class119.method1087(class408.method3277(1020, var39) >> 2, class119.method1087(class119.method1087(class408.method3277(var37, 1020) << 14, class408.method3277(1020, var38) << 22), class408.method3277(1020, var40) << 6));
                              ++var20;
                              if (~var20 <= ~var11) {
                                 var17 += arg1;
                                 var10000 = arg1 + var16;
                                 if (!var8) {
                                    break;
                                 }
                              } else {
                                 var10000 = var13[var16++];
                              }
                           }
                        }

                        var16 = var10000;
                        ++var19;
                        if (~var19 <= ~var12) {
                           var14 = var13;
                           arg1 = var11;
                           var13 = var18;
                           arg4 = var12;
                           var10 >>= 1;
                           var11 >>= 1;
                           var10000 = var12 >> 1;
                           if (!var8) {
                              break;
                           }
                        } else {
                           var10000 = 0;
                        }
                     }
                  }

                  var12 = var10000;
                  ++var9;
               }
            }
         }
      } catch (RuntimeException var42) {
         throw class482.method3757(var42, field188[2] + (arg0 != null ? field188[1] : field188[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method102(int arg0, int arg1) {
      try {
         if (arg0 != 16768129) {
            field178 = 14;
         }

         class304 var3 = this.field175;
         synchronized(this.field175) {
            this.field175.method2552(arg1, 21533);
         }

         ++field179;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field188[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "([S[Ljava/lang/String;Z)V"
   )
   public static final void method103(short[] arg0, String[] arg1, boolean arg2) {
      try {
         class713.method5284(arg1, arg1.length + -1, -1, arg0, 0);
         ++field173;
         if (arg2) {
            method100((byte)89);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field188[8] + (arg0 != null ? field188[1] : field188[0]) + ',' + (arg1 != null ? field188[1] : field188[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(II)Lwq;"
   )
   public final class228 method104(int arg0, int arg1) {
      try {
         ++field184;
         class304 var3 = this.field175;
         class228 var4;
         synchronized(this.field175) {
            var4 = (class228)this.field175.method2544(false, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field185;
            byte[] var6;
            synchronized(this.field185) {
               var6 = this.field185.method5017(32, arg1, (byte)71);
            }

            class228 var7 = new class228();
            var7.field3514 = this;
            if (var6 != null) {
               var7.method1970(new class354(var6), 0);
            }

            class304 var8 = this.field175;
            synchronized(this.field175) {
               if (arg0 != -32407) {
                  return null;
               } else {
                  this.field175.method2545((long)arg1, 108, var7);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field188[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method105(int arg0) {
      try {
         if (arg0 != 246) {
            field181 = null;
         }

         ++field174;
         class304 var2 = this.field175;
         synchronized(this.field175) {
            this.field175.method2551(true);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field188[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method106(byte arg0) {
      try {
         class304 var2 = this.field175;
         synchronized(this.field175) {
            this.field175.method2554(-116);
         }

         ++field176;
         if (arg0 != -121) {
            field178 = 17;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field188[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(Luaa;B)V"
   )
   public static final void method107(class119 arg0, byte arg1) {
      try {
         ++field180;
         class366 var2 = arg0.field1657;
         if (~class308.field4801 == ~arg0.field1675 || !var2.method2991(113) || var2.method2990(1, (byte)122)) {
            int var3 = -arg0.field1659 + arg0.field1675;
            int var4 = -arg0.field1659 + class308.field4801;
            int var5 = arg0.field1664 * 512 - -(256 * arg0.method61((byte)70));
            int var6 = arg0.field1673 * 512 + 256 * arg0.method61((byte)70);
            int var7 = arg0.field1667 * 512 - -(256 * arg0.method61((byte)70));
            int var8 = arg0.field1676 * 512 + arg0.method61((byte)70) * 256;
            arg0.field1505 = ((-var4 + var3) * var5 + var4 * var7) / var3;
            arg0.field1494 = ((var3 - var4) * var6 - -(var4 * var8)) / var3;
         }

         arg0.field1682 = 0;
         if (~arg0.field1671 == -1) {
            arg0.method1103(70, 8192, false);
         }

         if (~arg0.field1671 == -2) {
            arg0.method1103(65, 12288, false);
         }

         if (~arg0.field1671 == -3) {
            arg0.method1103(arg1 + -40, 0, false);
         }

         if (arg1 == 117) {
            if (~arg0.field1671 == -4) {
               arg0.method1103(88, 4096, false);
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field188[9] + (arg0 != null ? field188[1] : field188[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "<init>",
      descriptor = "(Ltv;ILrr;Led;)V"
   )
   public class14(class311 arg0, int arg1, class678 arg2, class47 arg3) {
      try {
         this.field185 = arg2;
         this.field185.method4998((byte)-82, 32);
         this.field187 = arg3;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field188[6] + (arg0 != null ? field188[1] : field188[0]) + ',' + arg1 + ',' + (arg2 != null ? field188[1] : field188[0]) + ',' + (arg3 != null ? field188[1] : field188[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method108(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method109(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
