import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class67 {
   @OriginalMember(
      owner = "client!da",
      name = "l",
      descriptor = "Lru;"
   )
   private class206 field821;
   @OriginalMember(
      owner = "client!da",
      name = "n",
      descriptor = "Lha;"
   )
   private class66 field820;
   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field836 = new String[]{method637(method636("Ck*\u0003\u001a")), method637(method636("\\$*jO")), method637(method636("V0hA")), method637(method636("\\$*kO")), method637(method636("\\$*eO")), method637(method636("T1")), method637(method636("Q(c\u0010")), method637(method636("[*tT")), method637(method636("]0vB")), method637(method636("_1")), method637(method636("K-}")), method637(method636("V'w]")), method637(method636("\\$*gO")), method637(method636("J c")), method637(method636("L,iH\u0014")), method637(method636("\\$*bO")), method637(method636("\\$*fO")), method637(method636("\\$*dO")), method637(method636("\\$*\u0011\u000eV,p\u0013O")), method637(method636("\\$*cO")), method637(method636("\\$*\u007fO")), method637(method636("\\$*aO")), method637(method636("\\$*{O")), method637(method636("\\$*}O")), method637(method636("\\$*`O")), method637(method636("\\$*o&\u0010")), method637(method636("\\$*l&\u0010")), method637(method636("\\$*yO")), method637(method636("\\$*|O")), method637(method636("\u0017&kA")), method637(method636("K-eI")), method637(method636("K-eIZ\u0015t")), method637(method636("[*h\u0010")), method637(method636("Y7cOZ")), method637(method636("\u00176lL\u0003")), method637(method636("K1v\u0010")), method637(method636("Mx")), method637(method636("K-eIZ")), method637(method636("\u00176p_")), method637(method636("\u0017$vJ\u0005")), method637(method636("\\$*zO")), method637(method636("Z7")), method637(method636("\u00170")), method637(method636("K1v")), method637(method636("\\$*xO"))};
   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "Loi;"
   )
   public static class80 field826 = new class80(8);
   @OriginalMember(
      owner = "client!da",
      name = "j",
      descriptor = "I"
   )
   public static int field813;
   @OriginalMember(
      owner = "client!da",
      name = "i",
      descriptor = "I"
   )
   public static int field814;
   @OriginalMember(
      owner = "client!da",
      name = "p",
      descriptor = "I"
   )
   public static int field815;
   @OriginalMember(
      owner = "client!da",
      name = "o",
      descriptor = "I"
   )
   public static int field816;
   @OriginalMember(
      owner = "client!da",
      name = "v",
      descriptor = "I"
   )
   public static int field817;
   @OriginalMember(
      owner = "client!da",
      name = "e",
      descriptor = "I"
   )
   public static int field819;
   @OriginalMember(
      owner = "client!da",
      name = "k",
      descriptor = "I"
   )
   public static int field822;
   @OriginalMember(
      owner = "client!da",
      name = "d",
      descriptor = "I"
   )
   public static int field823;
   @OriginalMember(
      owner = "client!da",
      name = "c",
      descriptor = "I"
   )
   public static int field824;
   @OriginalMember(
      owner = "client!da",
      name = "r",
      descriptor = "I"
   )
   public static int field825;
   @OriginalMember(
      owner = "client!da",
      name = "h",
      descriptor = "I"
   )
   public static int field827;
   @OriginalMember(
      owner = "client!da",
      name = "g",
      descriptor = "I"
   )
   public static int field828;
   @OriginalMember(
      owner = "client!da",
      name = "w",
      descriptor = "I"
   )
   public static int field829;
   @OriginalMember(
      owner = "client!da",
      name = "m",
      descriptor = "I"
   )
   public static int field830;
   @OriginalMember(
      owner = "client!da",
      name = "f",
      descriptor = "I"
   )
   public static int field831;
   @OriginalMember(
      owner = "client!da",
      name = "b",
      descriptor = "I"
   )
   public static int field832;
   @OriginalMember(
      owner = "client!da",
      name = "s",
      descriptor = "I"
   )
   public static int field833;
   @OriginalMember(
      owner = "client!da",
      name = "u",
      descriptor = "I"
   )
   public static int field834;
   @OriginalMember(
      owner = "client!da",
      name = "t",
      descriptor = "I"
   )
   public static int field835;
   @OriginalMember(
      owner = "client!da",
      name = "q",
      descriptor = "[Lnka;"
   )
   public static class311[] field818;

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(II[ILjava/util/Random;ILjava/lang/String;IIIII[Lbg;II[I)I"
   )
   public final int method617(int arg0, int arg1, int[] arg2, Random arg3, int arg4, String arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class492[] arg11, int arg12, int arg13, int[] arg14) {
      boolean var16 = client.field4360;

      try {
         ++field824;
         if (arg5 == null) {
            return 0;
         } else {
            if (arg0 != 5961) {
               field819 = 44;
            }

            arg3.setSeed((long)arg10);
            int var17 = (31 & arg3.nextInt()) + 192;
            this.method629(var17 << 24 | 16777215 & arg4, (byte)-91, var17 << 24 | arg9 & 16777215);
            int var18 = arg5.length();
            int[] var19 = new int[var18];
            int var20 = 0;
            int var21 = 0;
            if (var16) {
               var19[var21] = var20;
               if ((3 & arg3.nextInt()) == 0) {
                  ++var20;
               }

               ++var21;
            }

            while(true) {
               while(~var21 > ~var18) {
                  var19[var21] = var20;
                  if ((3 & arg3.nextInt()) == 0) {
                     ++var20;
                  }

                  ++var21;
               }

               int var22 = arg8;
               int var23 = arg1 - -this.field821.field2944;
               int var10000 = ~arg7;
               if (!var16) {
                  label80: {
                     if (var10000 == -2) {
                        var23 += (-this.field821.field2944 + arg6 + -this.field821.field2956) / 2;
                        if (!var16) {
                           break label80;
                        }
                     }

                     if (arg7 == 2) {
                        var23 = arg1 - (-arg6 + this.field821.field2956);
                     }
                  }

                  int var24;
                  label75: {
                     var24 = -1;
                     if (~arg13 != -2) {
                        if (~arg13 != -3) {
                           break label75;
                        }

                        var24 = var20 + this.field821.method1635(arg5, (byte)-81);
                        var22 = arg12 - var24 + arg8;
                        if (!var16) {
                           break label75;
                        }
                     }

                     var24 = var20 + this.field821.method1635(arg5, (byte)-81);
                     var22 += (-var24 + arg12) / 2;
                  }

                  this.method630((int[])null, 60, var19, arg2, arg5, var22, var23, arg11);
                  if (arg14 != null) {
                     if (var24 == -1) {
                        var24 = var20 + this.field821.method1635(arg5, (byte)-81);
                     }

                     arg14[1] = -this.field821.field2944 + var23;
                     arg14[3] = this.field821.field2956 + this.field821.field2944;
                     arg14[0] = var22;
                     arg14[2] = var24;
                  }

                  return var20;
               }

               if ((var10000 & -2) == 0) {
                  ++var20;
               }

               ++var21;
            }
         }
      } catch (RuntimeException var26) {
         throw class237.method1823(var26, field836[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field836[0] : field836[2]) + ',' + (arg3 != null ? field836[0] : field836[2]) + ',' + arg4 + ',' + (arg5 != null ? field836[0] : field836[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field836[0] : field836[2]) + ',' + arg12 + ',' + arg13 + ',' + (arg14 != null ? field836[0] : field836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Lha;IIBLll;)V"
   )
   public static final void method618(class66 arg0, int arg1, int arg2, byte arg3, class387 arg4) {
      boolean var5 = client.field4360;

      try {
         class792.field11613.method2934(0);
         ++field823;
         if (!class517.field7458) {
            class357 var6 = (class357)arg4.method2933(2);
            if (arg3 < 79) {
               field819 = 73;
               if (!var5 && var6 == null) {
                  return;
               }
            } else if (var6 == null) {
               return;
            }

            do {
               class326 var7 = class650.field9488.method5666(var6.field4793, false);
               if (class218.method1718(var7, 131)) {
                  boolean var8 = class622.method4525(var6, arg2, -109, arg0, arg1, var7);
                  if (var8) {
                     class621.method4518(5, arg0, var6, var7);
                  }
               }

               var6 = (class357)arg4.method2940(false);
            } while(var6 != null);

         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field836[23] + (arg0 != null ? field836[0] : field836[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field836[0] : field836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IILjava/lang/String;II[II[Lbg;)V"
   )
   public final void method619(int arg0, int arg1, String arg2, int arg3, int arg4, int[] arg5, int arg6, class492[] arg7) {
      try {
         ++field834;
         if (arg2 != null) {
            this.method629(arg3, (byte)-61, arg6);
            this.method621((class515)null, arg0, arg5, arg4, 0, arg2, arg7, arg1, 0);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field836[44] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field836[0] : field836[2]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field836[0] : field836[2]) + ',' + arg6 + ',' + (arg7 != null ? field836[0] : field836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIIILjava/lang/String;)V"
   )
   public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
      try {
         ++field828;
         if (arg5 != null) {
            this.method629(arg2, (byte)-102, arg4);
            this.method621((class515)null, arg1, (int[])null, 0, 0, arg5, (class492[])null, arg3, arg0);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field836[22] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field836[0] : field836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Laa;I[IIILjava/lang/String;[Lbg;II)V"
   )
   private final void method621(class515 param1, int param2, int[] param3, int param4, int param5, String param6, class492[] param7, int param8, int param9) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V"
   )
   private final void method622(boolean arg0, String arg1) {
      boolean var3 = client.field4360;

      try {
         if (!arg0) {
            field826 = null;
         }

         try {
            label131: {
               label123: {
                  if (!arg1.startsWith(field836[32])) {
                     if (!arg1.equals(field836[29])) {
                        break label123;
                     }

                     class30.field436 = 16777215 & class224.field3193 | class30.field436 & -16777216;
                     if (!var3) {
                        break label123;
                     }
                  }

                  class30.field436 = class30.field436 & -16777216 | class136.method1074((byte)5, arg1.substring(4), 16) & 16777215;
               }

               if (!arg1.startsWith(field836[33])) {
                  if (!arg1.equals(field836[39])) {
                     if (arg1.startsWith(field836[35])) {
                        class36.field519 = class30.field436 & -16777216 | class136.method1074((byte)5, arg1.substring(4), 16);
                        if (!var3) {
                           break label131;
                        }
                     }

                     if (arg1.equals(field836[43])) {
                        class36.field519 = -16777216 & class30.field436 | 8388608;
                        if (!var3) {
                           break label131;
                        }
                     }

                     if (arg1.equals(field836[38])) {
                        class36.field519 = -1;
                        if (!var3) {
                           break label131;
                        }
                     }

                     if (!arg1.startsWith(field836[36])) {
                        if (!arg1.equals("u")) {
                           if (!arg1.equals(field836[42])) {
                              if (arg1.equalsIgnoreCase(field836[31])) {
                                 class681.field10031 = 0;
                                 if (!var3) {
                                    break label131;
                                 }
                              }

                              if (!arg1.startsWith(field836[37])) {
                                 if (!arg1.equals(field836[30])) {
                                    if (arg1.equals(field836[34])) {
                                       class681.field10031 = class732.field10711;
                                       if (!var3) {
                                          break label131;
                                       }
                                    }

                                    if (!arg1.equals(field836[41])) {
                                       break label131;
                                    }

                                    this.method629(class732.field10711, (byte)-121, class224.field3193);
                                    if (!var3) {
                                       break label131;
                                    }
                                 }

                                 class681.field10031 = -16777216 & class30.field436;
                                 if (!var3) {
                                    break label131;
                                 }
                              }

                              class681.field10031 = class30.field436 & -16777216 | class136.method1074((byte)5, arg1.substring(5), 16);
                              if (!var3) {
                                 break label131;
                              }
                           }

                           class101.field1303 = -1;
                           if (!var3) {
                              break label131;
                           }
                        }

                        class101.field1303 = -16777216 & class30.field436;
                        if (!var3) {
                           break label131;
                        }
                     }

                     class101.field1303 = class30.field436 & -16777216 | class136.method1074((byte)5, arg1.substring(2), 16);
                     if (!var3) {
                        break label131;
                     }
                  }

                  class30.field436 = class224.field3193;
                  if (!var3) {
                     break label131;
                  }
               }

               class30.field436 = class136.method1074((byte)5, arg1.substring(5), 16);
            }
         } catch (Exception var5) {
         }

         ++field813;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field836[40] + arg0 + ',' + (arg1 != null ? field836[0] : field836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public abstract void method109(char arg0, int arg1, int arg2, int arg3, boolean arg4, class515 arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Ljava/lang/String;IIIIIII)V"
   )
   public final void method623(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var9 = client.field4360;

      try {
         ++field814;
         if (arg0 != null) {
            this.method629(arg6, (byte)-65, arg5);
            double var10 = 7.0D - (double)arg2 / 8.0D;
            if (var10 < 0.0D) {
               var10 = 0.0D;
            }

            int var12 = arg0.length();
            int[] var13 = new int[var12];
            int var14 = 0;
            if (var9) {
               var13[var14] = (int)(Math.sin((double)var14 / 1.5D + (double)arg7) * var10);
               ++var14;
            }

            while(true) {
               while(~var12 < ~var14) {
                  var13[var14] = (int)(Math.sin((double)var14 / 1.5D + (double)arg7) * var10);
                  ++var14;
               }

               this.method630(var13, 60, (int[])null, (int[])null, arg0, -(this.field821.method1635(arg0, (byte)-81) / 2) + arg1, arg3, (class492[])null);
               if (!var9) {
                  if (arg4 != 160) {
                     this.field821 = null;
                     return;
                  }

                  return;
               }

               ++var14;
            }
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field836[15] + (arg0 != null ? field836[0] : field836[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIILjava/lang/String;I)V"
   )
   public final void method624(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
      try {
         ++field830;
         if (arg4 != null) {
            this.method629(arg2, (byte)-85, arg5);
            this.method621((class515)null, arg0 - this.field821.method1635(arg4, (byte)-81), (int[])null, 0, arg3, arg4, (class492[])null, arg1, arg3);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field836[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field836[0] : field836[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method625(int arg0, int arg1, int arg2) {
      try {
         class74.field908 = -class650.field9523 + arg0;
         ++field816;
         if (arg1 != 24274) {
            method618((class66)null, 42, -119, (byte)75, (class387)null);
         }

         class478.field6866 = -class650.field9513 + arg2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field836[25] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIIILaa;I[IIIIIII[Lbg;Ljava/lang/String;)I"
   )
   public final int method626(int arg0, int arg1, int arg2, int arg3, int arg4, class515 arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class492[] arg14, String arg15) {
      try {
         if (arg10 != 0) {
            return -49;
         } else {
            ++field829;
            return this.method628(arg4, arg14, arg9, 0, (byte)-41, arg7, arg6, arg13, arg3, arg0, arg12, arg8, arg2, arg15, arg5, arg1, arg11);
         }
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field836[26] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field836[0] : field836[2]) + ',' + arg6 + ',' + (arg7 != null ? field836[0] : field836[2]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + (arg14 != null ? field836[0] : field836[2]) + ',' + (arg15 != null ? field836[0] : field836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public abstract void method110(char arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(BLjava/lang/String;I)V"
   )
   private final void method627(byte arg0, String arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field833;
         int var5 = 0;
         boolean var6 = false;
         int var7 = 0;
         int var10000;
         if (var4) {
            var10000 = arg1.charAt(var7);
         } else if (var7 >= arg1.length()) {
            var10000 = arg0;
            if (!var4) {
               if (arg0 != 26) {
                  return;
               }

               if (~var5 < -1) {
                  class681.field10024 = (arg2 + -this.field821.method1635(arg1, (byte)-81) << 8) / var5;
                  return;
               }

               return;
            }
         } else {
            var10000 = arg1.charAt(var7);
         }

         while(true) {
            int var8 = var10000;
            if (~var8 == -61) {
               var6 = true;
               if (var4) {
                  if (~var8 != -63) {
                     if (!var6 && ~var8 == -33) {
                        ++var5;
                        if (var4) {
                           var6 = false;
                        }
                     }
                  } else {
                     var6 = false;
                  }

                  ++var7;
               } else {
                  ++var7;
               }
            } else {
               if (~var8 != -63) {
                  if (!var6 && ~var8 == -33) {
                     ++var5;
                     if (var4) {
                        var6 = false;
                     }
                  }
               } else {
                  var6 = false;
               }

               ++var7;
            }

            if (var7 >= arg1.length()) {
               var10000 = arg0;
               if (!var4) {
                  if (arg0 != 26) {
                     return;
                  }

                  if (~var5 < -1) {
                     class681.field10024 = (arg2 + -this.field821.method1635(arg1, (byte)-81) << 8) / var5;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg1.charAt(var7);
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field836[17] + arg0 + ',' + (arg1 != null ? field836[0] : field836[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(I[Lbg;IIB[IIIIIIIILjava/lang/String;Laa;II)I"
   )
   public final int method628(int arg0, class492[] arg1, int arg2, int arg3, byte arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, String arg13, class515 arg14, int arg15, int arg16) {
      boolean var18 = client.field4360;

      try {
         ++field825;
         if (arg13 == null) {
            return 0;
         } else {
            this.method629(arg11, (byte)-65, arg16);
            if (arg9 == 0) {
               arg9 = this.field821.field2950;
            }

            if (arg4 != -41) {
               field819 = -29;
            }

            int[] var19;
            label150: {
               if (this.field821.field2944 - -arg9 + this.field821.field2956 > arg8 && arg9 + arg9 > arg8) {
                  var19 = null;
                  if (!var18) {
                     break label150;
                  }
               }

               var19 = new int[]{arg12};
            }

            if (~arg3 == 0) {
               arg3 = arg8 / arg9;
               if (~arg3 >= -1) {
                  arg3 = 1;
               }
            }

            int var20 = this.field821.method1629(false, class612.field8978, arg1, arg13, var19);
            if (~arg3 < -1 && var20 >= arg3) {
               class612.field8978[arg3 - 1] = this.field821.method1636(arg1, arg12, 10893, class612.field8978[arg3 - 1]);
               var20 = arg3;
            }

            if (~arg6 == -4 && ~var20 == -2) {
               arg6 = 1;
            }

            int var21;
            label159: {
               if (arg6 == 0) {
                  var21 = arg15 - -this.field821.field2944;
                  if (!var18) {
                     break label159;
                  }
               }

               if (arg6 == 1) {
                  var21 = this.field821.field2944 - -((-this.field821.field2944 - this.field821.field2956 - (var20 + -1) * arg9 + arg8) / 2) + arg15;
                  if (!var18) {
                     break label159;
                  }
               }

               if (arg6 != 2) {
                  int var22 = (-this.field821.field2956 + -this.field821.field2944 + arg8 + -((var20 + -1) * arg9)) / (var20 + 1);
                  if (var22 < 0) {
                     var22 = 0;
                  }

                  arg9 += var22;
                  var21 = this.field821.field2944 + var22 + arg15;
                  if (!var18) {
                     break label159;
                  }
               }

               var21 = arg15 - -arg8 - this.field821.field2956 - (var20 - 1) * arg9;
            }

            int var23 = 0;
            int var10000;
            if (var18) {
               var10000 = ~arg7;
            } else if (var23 >= var20) {
               var10000 = var20;
               if (!var18) {
                  return var20;
               }
            } else {
               var10000 = ~arg7;
            }

            while(true) {
               label138: {
                  if (var10000 != -1) {
                     if (arg7 != 1) {
                        if (arg7 == 2) {
                           this.method621(arg14, arg12 + arg2 + -this.field821.method1635(class612.field8978[var23], (byte)-81), arg5, arg10, arg4 ^ -41, class612.field8978[var23], arg1, var21, arg0);
                           if (!var18) {
                              break label138;
                           }
                        }

                        if (~(var20 - 1) == ~var23) {
                           this.method621(arg14, arg2, arg5, arg10, 0, class612.field8978[var23], arg1, var21, arg0);
                           if (!var18) {
                              break label138;
                           }
                        }

                        this.method627((byte)26, class612.field8978[var23], arg12);
                        this.method621(arg14, arg2, arg5, arg10, 0, class612.field8978[var23], arg1, var21, arg0);
                        class681.field10024 = 0;
                        if (!var18) {
                           break label138;
                        }
                     }

                     this.method621(arg14, (-this.field821.method1635(class612.field8978[var23], (byte)-81) + arg12) / 2 + arg2, arg5, arg10, 0, class612.field8978[var23], arg1, var21, arg0);
                     if (!var18) {
                        break label138;
                     }
                  }

                  this.method621(arg14, arg2, arg5, arg10, 0, class612.field8978[var23], arg1, var21, arg0);
               }

               var21 += arg9;
               ++var23;
               if (var23 >= var20) {
                  var10000 = var20;
                  if (!var18) {
                     return var20;
                  }
               } else {
                  var10000 = ~arg7;
               }
            }
         }
      } catch (RuntimeException var25) {
         throw class237.method1823(var25, field836[28] + arg0 + ',' + (arg1 != null ? field836[0] : field836[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field836[0] : field836[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + (arg13 != null ? field836[0] : field836[2]) + ',' + (arg14 != null ? field836[0] : field836[2]) + ',' + arg15 + ',' + arg16 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IBI)V"
   )
   private final void method629(int arg0, byte arg1, int arg2) {
      try {
         if (~arg0 == 0) {
            arg0 = 0;
         }

         if (arg1 <= -60) {
            class681.field10024 = 0;
            class36.field519 = -1;
            ++field832;
            class224.field3193 = arg2;
            class30.field436 = arg2;
            class393.field5684 = 0;
            class101.field1303 = -1;
            class732.field10711 = arg0;
            class681.field10031 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field836[27] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([II[I[ILjava/lang/String;II[Lbg;)V"
   )
   private final void method630(int[] param1, int param2, int[] param3, int[] param4, String param5, int param6, int param7, class492[] param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIZIILjava/lang/String;)V"
   )
   public final void method631(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, String arg6) {
      boolean var8 = client.field4360;

      try {
         ++field827;
         if (arg6 != null) {
            this.method629(arg4, (byte)-104, arg5);
            int var9 = arg6.length();
            int[] var10 = new int[var9];
            int var11 = 0;
            if (var8) {
               var10[var11] = (int)(Math.sin((double)arg2 / 5.0D + (double)var11 / 2.0D) * 5.0D);
               ++var11;
            }

            while(true) {
               while(var9 > var11) {
                  var10[var11] = (int)(Math.sin((double)arg2 / 5.0D + (double)var11 / 2.0D) * 5.0D);
                  ++var11;
               }

               if (!var8) {
                  if (arg3) {
                     this.method631(-11, 14, -56, true, -96, 72, (String)null);
                  }

                  this.method630(var10, 60, (int[])null, (int[])null, arg6, arg0 - this.field821.method1635(arg6, (byte)-81) / 2, arg1, (class492[])null);
                  return;
               }

               ++var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field836[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field836[0] : field836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IZIILjava/lang/String;I)V"
   )
   public final void method632(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5) {
      try {
         ++field831;
         if (arg4 != null) {
            if (arg1) {
               field826 = null;
            }

            this.method629(arg2, (byte)-99, arg5);
            this.method621((class515)null, arg0 + -(this.field821.method1635(arg4, (byte)-81) / 2), (int[])null, 0, 0, arg4, (class492[])null, arg3, 0);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field836[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field836[0] : field836[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method633(byte arg0) {
      try {
         int var1 = 6 % ((32 - arg0) / 40);
         field818 = null;
         field826 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field836[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "<init>",
      descriptor = "(Lha;Lru;)V"
   )
   public class67(class66 arg0, class206 arg1) {
      try {
         this.field821 = arg1;
         this.field820 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field836[18] + (arg0 != null ? field836[0] : field836[2]) + ',' + (arg1 != null ? field836[0] : field836[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ILjava/lang/String;IIIIB)V"
   )
   public final void method634(int param1, String param2, int param3, int param4, int param5, int param6, byte param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ILjava/util/Random;III[Lbg;Ljava/lang/String;[IZI)I"
   )
   public final int method635(int arg0, Random arg1, int arg2, int arg3, int arg4, class492[] arg5, String arg6, int[] arg7, boolean arg8, int arg9) {
      boolean var11 = client.field4360;

      try {
         ++field822;
         if (arg6 == null) {
            return 0;
         } else {
            arg1.setSeed((long)arg4);
            int var12 = 192 + (arg1.nextInt() & 31);
            this.method629(var12 << 24 | arg2 & 16777215, (byte)-79, var12 << 24 | 16777215 & arg3);
            int var13 = arg6.length();
            int[] var14 = new int[var13];
            int var15 = 0;
            if (arg8) {
               return -36;
            } else {
               int var16 = 0;
               if (var11) {
                  var14[var16] = var15;
                  if (~(arg1.nextInt() & 3) == -1) {
                     ++var15;
                  }

                  ++var16;
               }

               while(true) {
                  while(var13 > var16) {
                     var14[var16] = var15;
                     if (~(arg1.nextInt() & 3) == -1) {
                        ++var15;
                     }

                     ++var16;
                  }

                  this.method630((int[])null, 60, var14, arg7, arg6, arg9, arg0, arg5);
                  if (!var11) {
                     return var15;
                  }

                  if (var15 == -1) {
                     ++var15;
                  }

                  ++var16;
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field836[1] + arg0 + ',' + (arg1 != null ? field836[0] : field836[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field836[0] : field836[2]) + ',' + (arg6 != null ? field836[0] : field836[2]) + ',' + (arg7 != null ? field836[0] : field836[2]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method636(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method637(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
