import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class75 {
   @OriginalMember(
      owner = "client!nw",
      name = "e",
      descriptor = "Llj;"
   )
   private class304 field969 = new class304(256);
   @OriginalMember(
      owner = "client!nw",
      name = "c",
      descriptor = "Lmu;"
   )
   private class258 field971;
   @OriginalMember(
      owner = "client!nw",
      name = "b",
      descriptor = "Ld;"
   )
   private class150 field964;
   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field973 = new String[]{method717(method716("i^tN1")), method717(method716("|\u00056\f")), method717(method716("|\u0007t%d")), method717(method716("|\u0007t#d")), method717(method716("|\u0007t\"d")), method717(method716("|\u0007t!d")), method717(method716("|\u0007t\\%|\u0019.^d")), method717(method716("|\u0007t$d")), method717(method716("|\u0007t&d"))};
   @OriginalMember(
      owner = "client!nw",
      name = "h",
      descriptor = "I"
   )
   public static int field965;
   @OriginalMember(
      owner = "client!nw",
      name = "f",
      descriptor = "I"
   )
   public static int field966;
   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "I"
   )
   public static int field967;
   @OriginalMember(
      owner = "client!nw",
      name = "g",
      descriptor = "I"
   )
   public static int field968;
   @OriginalMember(
      owner = "client!nw",
      name = "d",
      descriptor = "I"
   )
   public static int field970;
   @OriginalMember(
      owner = "client!nw",
      name = "i",
      descriptor = "I"
   )
   public static int field972;

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(II)Lbc;",
      line = 6
   )
   public final class282 method710(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field970;
         Object var4 = this.field969.method2544(false, (long)arg0);
         if (var4 != null) {
            return (class282)var4;
         } else if (!this.field964.method1372(-110, arg0)) {
            return null;
         } else if (arg1 != 64) {
            return null;
         } else {
            class453 var5;
            class282 var8;
            label64: {
               var5 = this.field964.method1373(arg0, (byte)-54);
               int var6 = !var5.field6933 ? this.field971.field4159 : 64;
               if (var5.field6940 && this.field971.method617()) {
                  float[] var7 = this.field964.method1376(var6, arg0, false, (byte)-126, 0.7F, var6);
                  var8 = this.field971.method2224(-109, var7, ~var5.field6936 != -1, class364.field5628, var6, var6);
                  if (!var3) {
                     break label64;
                  }
               }

               int[] var9;
               label74: {
                  if (~var5.field6927 == -3 || !class329.method2685(arg1 + 10963, var5.field6924)) {
                     var9 = this.field964.method1374(-2395, var6, false, arg0, 0.7F, var6);
                     if (!var3) {
                        break label74;
                     }
                  }

                  var9 = this.field964.method1375(var6, 0.7F, true, var6, arg0, arg1 + -9261);
               }

               var8 = this.field971.method2177(~var5.field6936 != -1, arg1 ^ -65, var6, var9, var6);
            }

            var8.method2358(-3545, var5.field6937, var5.field6938);
            this.field969.method2545((long)arg0, arg1 ^ 43, var8);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field973[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(I[BIB)Ljava/lang/String;",
      line = 55
   )
   public static final String method711(int arg0, byte[] arg1, int arg2, byte arg3) {
      boolean var4 = client.field1786;

      try {
         ++field965;
         char[] var5 = new char[arg0];
         int var6 = 0;
         if (arg3 != 62) {
            method711(-37, (byte[])null, -126, (byte)99);
         }

         int var7 = arg2;
         int var8 = arg0 + arg2;
         if (!var4 && ~var8 >= ~arg2) {
            return new String(var5, 0, var6);
         } else {
            do {
               int var9 = arg1[var7++] & 255;
               int var10;
               if (var9 < 128) {
                  if (var9 == 0) {
                     var10 = 65533;
                     if (var4) {
                        var10 = var9;
                     }
                  } else {
                     var10 = var9;
                  }
               } else {
                  label145: {
                     if (var9 >= 192) {
                        if (var9 >= 224) {
                           if (var9 < 240) {
                              if (var8 > var7 + 1 && (192 & arg1[var7]) == 128 && ~(arg1[var7 + 1] & 192) == -129) {
                                 var10 = 61440 & var9 << 12 | 4032 & arg1[var7++] << 6 | arg1[var7++] & 63;
                                 if (~var10 <= -2049) {
                                    break label145;
                                 }

                                 var10 = 65533;
                                 if (!var4) {
                                    break label145;
                                 }
                              }

                              var10 = 65533;
                              if (!var4) {
                                 break label145;
                              }
                           }

                           if (var9 >= 248) {
                              var10 = 65533;
                              if (!var4) {
                                 break label145;
                              }
                           }

                           if (~(var7 + 2) > ~var8 && (arg1[var7] & 192) == 128 && ~(192 & arg1[var7 + 1]) == -129 && ~(arg1[var7 - -2] & 192) == -129) {
                              int var11 = arg1[var7++] << 12 & 258048 | 1835008 & var9 << 18 | 4032 & arg1[var7++] << 6 | arg1[var7++] & 63;
                              if (~var11 > -65537 || var11 > 1114111) {
                                 var10 = 65533;
                                 if (!var4) {
                                    break label145;
                                 }
                              }

                              var10 = 65533;
                              if (!var4) {
                                 break label145;
                              }
                           }

                           var10 = 65533;
                           if (!var4) {
                              break label145;
                           }
                        }

                        if (var7 < var8 && (192 & arg1[var7]) == 128) {
                           var10 = arg1[var7++] & 63 | var9 << 6 & 1984;
                           if (var10 >= 128) {
                              break label145;
                           }

                           var10 = 65533;
                           if (!var4) {
                              break label145;
                           }
                        }

                        var10 = 65533;
                        if (!var4) {
                           break label145;
                        }
                     }

                     var10 = 65533;
                     if (var4) {
                        if (var9 == 0) {
                           var10 = 65533;
                           if (var4) {
                              var10 = var9;
                           }
                        } else {
                           var10 = var9;
                        }
                     }
                  }
               }

               var5[var6++] = (char)var10;
            } while(~var8 < ~var7);

            return new String(var5, 0, var6);
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field973[8] + arg0 + ',' + (arg1 != null ? field973[0] : field973[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(B)V",
      line = 148
   )
   public final void method712(byte arg0) {
      try {
         this.field969.method2552(5, 21533);
         if (arg0 != 17) {
            this.field964 = null;
         }

         ++field968;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field973[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(IIII)Luaa;",
      line = 161
   )
   public static final class119 method713(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         ++field967;
         class190 var5 = class711.field10694[arg2][arg1][arg0];
         if (var5 == null) {
            return null;
         } else if (arg3 < 123) {
            return null;
         } else {
            class119 var6 = null;
            int var7 = -1;
            class605 var8 = var5.field2962;

            while(true) {
               class78 var10000;
               if (var8 == null) {
                  var10000 = var6;
                  if (!var4) {
                     return var6;
                  }
               } else {
                  var10000 = var8.field8839;
               }

               class78 var9 = var10000;
               if (var9 instanceof class119) {
                  class119 var10 = (class119)var9;
                  int var11 = 256 * (-1 + var10.method61((byte)70)) + 252;
                  int var12 = -var11 + var10.field1505 >> 9;
                  int var13 = -var11 + var10.field1494 >> 9;
                  int var14 = var10.field1505 + var11 >> 9;
                  int var15 = var10.field1494 + var11 >> 9;
                  if (arg1 >= var12 && arg0 >= var13 && var14 >= arg1 && ~arg0 >= ~var15) {
                     int var16 = (-arg0 + 1 + var15) * (var14 + 1 + -arg1);
                     if (~var7 > ~var16) {
                        var6 = var10;
                        var7 = var16;
                     }
                  }
               }

               var8 = var8.field8840;
            }
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field973[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "([BIIIIII[BB)V",
      line = 221
   )
   public static final void method714(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, byte arg8) {
      boolean var9 = client.field1786;

      try {
         ++field972;
         int var10 = -(arg4 >> 2);
         int var16 = -(arg4 & 3);
         int var11 = -arg6;
         int var10000;
         if (var9) {
            var10000 = var10;
         } else if (~var11 <= -1) {
            var10000 = arg8;
            if (!var9) {
               if (arg8 != -105) {
                  return;
               }

               return;
            }
         } else {
            var10000 = var10;
         }

         label105:
         while(true) {
            int var12 = var10000;
            int var10001;
            if (var9) {
               var10001 = arg3++;
               arg0[var10001] += arg7[arg1++];
               int var17 = arg3++;
               arg0[var17] += arg7[arg1++];
               int var18 = arg3++;
               arg0[var18] += arg7[arg1++];
               int var19 = arg3++;
               arg0[var19] += arg7[arg1++];
               ++var12;
            }

            while(true) {
               while(~var12 > -1) {
                  var10001 = arg3++;
                  arg0[var10001] += arg7[arg1++];
                  var10001 = arg3++;
                  arg0[var10001] += arg7[arg1++];
                  var10001 = arg3++;
                  arg0[var10001] += arg7[arg1++];
                  var10001 = arg3++;
                  arg0[var10001] += arg7[arg1++];
                  ++var12;
               }

               int var13 = var16;
               if (!var9) {
                  if (var9) {
                     var10001 = arg3++;
                     arg0[var10001] += arg7[arg1++];
                     var13 = var16 + 1;
                  }

                  while(true) {
                     while(~var13 > -1) {
                        var10001 = arg3++;
                        arg0[var10001] += arg7[arg1++];
                        ++var13;
                     }

                     arg1 += arg2;
                     arg3 += arg5;
                     if (!var9) {
                        ++var11;
                        if (~var11 <= -1) {
                           var10000 = arg8;
                           if (!var9) {
                              if (arg8 != -105) {
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = var10;
                        }
                        continue label105;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field973[2] + (arg0 != null ? field973[0] : field973[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field973[0] : field973[1]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(I)V",
      line = 267
   )
   public final void method715(int arg0) {
      try {
         this.field969.method2551(true);
         if (arg0 > -40) {
            this.field971 = null;
         }

         ++field966;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field973[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "<init>",
      descriptor = "(Lmu;Ld;)V",
      line = 280
   )
   public class75(class258 arg0, class150 arg1) {
      try {
         this.field971 = arg0;
         this.field964 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field973[6] + (arg0 != null ? field973[0] : field973[1]) + ',' + (arg1 != null ? field973[0] : field973[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method716(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method717(char[] arg0) {
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
            var10005 = 112;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
