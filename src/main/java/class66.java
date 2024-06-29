import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class66 {
   @OriginalMember(
      owner = "client!da",
      name = "r",
      descriptor = "Lha;"
   )
   private class65 field1204;
   @OriginalMember(
      owner = "client!da",
      name = "c",
      descriptor = "Lika;"
   )
   private class445 field1206;
   @OriginalMember(
      owner = "client!da",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1227 = new String[]{method726(method725("r:|\u0016f")), method726(method725("mu|{3")), method726(method725("x.>9")), method726(method725("r:|\u0004f")), method726(method725("r:|\u001cf")), method726(method725("r:|\u001ef")), method726(method725("r:|\u0010f")), method726(method725("r:|\u0007f")), method726(method725("r:|\u0000f")), method726(method725("r:|\u001ff")), method726(method725("r:|\u001bf")), method726(method725("z/")), method726(method725("q/")), method726(method725("b2?0=")), method726(method725("d>5")), method726(method725("u4\",")), method726(method725("\u007f65h")), method726(method725("s. :")), method726(method725("e3+")), method726(method725("r:|\u0018f")), method726(method725("x9!%")), method726(method725("r:|\u001af")), method726(method725("r:|\u0011f")), method726(method725("r:|i'x2&kf")), method726(method725("r:|\u0005f")), method726(method725("r:|\u0019f")), method726(method725("r:|\u001df")), method726(method725("r:|\u0013f")), method726(method725("9(:4*")), method726(method725("9(&'")), method726(method725("e331")), method726(method725("t)")), method726(method725("e331s")), method726(method725("9.")), method726(method725("cf")), method726(method725("r:|\u0001f")), method726(method725("e331s;j")), method726(method725("e/ ")), method726(method725("e/ h")), method726(method725("u4>h")), method726(method725("w)57s")), method726(method725("9: 2,")), method726(method725("98=9")), method726(method725("r:|\u0017f")), method726(method725("r:|\u0012f"))};
   @OriginalMember(
      owner = "client!da",
      name = "b",
      descriptor = "Lgh;"
   )
   public static class572 field1207 = new class572(133, 6);
   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "I"
   )
   public static int field1224 = 0;
   @OriginalMember(
      owner = "client!da",
      name = "x",
      descriptor = "[[B"
   )
   public static byte[][] field1225 = new byte[50][];
   @OriginalMember(
      owner = "client!da",
      name = "e",
      descriptor = "Lgh;"
   )
   public static class572 field1223 = new class572(23, 5);
   @OriginalMember(
      owner = "client!da",
      name = "f",
      descriptor = "I"
   )
   public static int field1201;
   @OriginalMember(
      owner = "client!da",
      name = "k",
      descriptor = "I"
   )
   public static int field1202;
   @OriginalMember(
      owner = "client!da",
      name = "t",
      descriptor = "I"
   )
   public static int field1203;
   @OriginalMember(
      owner = "client!da",
      name = "h",
      descriptor = "I"
   )
   public static int field1205;
   @OriginalMember(
      owner = "client!da",
      name = "i",
      descriptor = "I"
   )
   public static int field1208;
   @OriginalMember(
      owner = "client!da",
      name = "o",
      descriptor = "I"
   )
   public static int field1209;
   @OriginalMember(
      owner = "client!da",
      name = "q",
      descriptor = "I"
   )
   public static int field1210;
   @OriginalMember(
      owner = "client!da",
      name = "d",
      descriptor = "I"
   )
   public static int field1211;
   @OriginalMember(
      owner = "client!da",
      name = "p",
      descriptor = "I"
   )
   public static int field1212;
   @OriginalMember(
      owner = "client!da",
      name = "j",
      descriptor = "I"
   )
   public static int field1213;
   @OriginalMember(
      owner = "client!da",
      name = "v",
      descriptor = "I"
   )
   public static int field1214;
   @OriginalMember(
      owner = "client!da",
      name = "y",
      descriptor = "I"
   )
   public static int field1215;
   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "I"
   )
   public static int field1216;
   @OriginalMember(
      owner = "client!da",
      name = "n",
      descriptor = "I"
   )
   public static int field1217;
   @OriginalMember(
      owner = "client!da",
      name = "w",
      descriptor = "I"
   )
   public static int field1218;
   @OriginalMember(
      owner = "client!da",
      name = "u",
      descriptor = "I"
   )
   public static int field1219;
   @OriginalMember(
      owner = "client!da",
      name = "m",
      descriptor = "I"
   )
   public static int field1220;
   @OriginalMember(
      owner = "client!da",
      name = "s",
      descriptor = "I"
   )
   public static int field1221;
   @OriginalMember(
      owner = "client!da",
      name = "l",
      descriptor = "I"
   )
   public static int field1222;
   @OriginalMember(
      owner = "client!da",
      name = "g",
      descriptor = "I"
   )
   public static int field1226;

   @OriginalMember(
      owner = "client!da",
      name = "b",
      descriptor = "(II)I",
      line = 4
   )
   public static int method706(int arg0, int arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1227[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(I)V",
      line = 11
   )
   public static void method707(int arg0) {
      try {
         field1223 = null;
         field1207 = null;
         field1225 = null;
         if (arg0 > -51) {
            field1224 = -63;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1227[27] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(III)V",
      line = 26
   )
   private final void method708(int arg0, int arg1, int arg2) {
      try {
         class70.field1256 = arg2;
         class135.field2214 = arg2;
         class292.field4069 = 0;
         class304.field4402 = -1;
         class190.field2847 = -1;
         if (arg1 == -1) {
            arg1 = 0;
         }

         class423.field6153 = 0;
         ++field1212;
         int var4 = 20 / ((-20 - arg0) / 51);
         class668.field9696 = arg1;
         class535.field7787 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1227[26] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Ljava/lang/String;IIIIII)V",
      line = 51
   )
   public final void method709(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         ++field1216;
         if (arg0 != null) {
            this.method708(-124, arg6, arg5);
            int var9 = arg0.length();
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int var12 = 0;
            if (var8) {
               var10[var12] = (int)(Math.sin((double)arg1 / 5.0D + (double)var12 / 5.0D) * 5.0D);
               var11[var12] = (int)(Math.sin((double)arg1 / 5.0D + (double)var12 / 3.0D) * 5.0D);
               ++var12;
            }

            while(true) {
               while(~var9 < ~var12) {
                  var10[var12] = (int)(Math.sin((double)arg1 / 5.0D + (double)var12 / 5.0D) * 5.0D);
                  var11[var12] = (int)(Math.sin((double)arg1 / 5.0D + (double)var12 / 3.0D) * 5.0D);
                  ++var12;
               }

               if (!var8) {
                  if (arg3 >= -112) {
                     field1224 = -116;
                  }

                  this.method719((class476[])null, var11, true, arg2, arg0, -(this.field1206.method3351(arg0, true) / 2) + arg4, (int[])null, var10);
                  return;
               }

               ++var12;
            }
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field1227[0] + (arg0 != null ? field1227[1] : field1227[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(I[III[Ltd;IILjava/lang/String;)V",
      line = 85
   )
   public final void method710(int arg0, int[] arg1, int arg2, int arg3, class476[] arg4, int arg5, int arg6, String arg7) {
      try {
         ++field1210;
         if (arg7 != null) {
            this.method708(arg3 + 36, arg0, arg6);
            this.method723(0, arg7, arg4, arg3, arg5, (byte)16, arg1, (class510)null, arg2);
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field1227[4] + arg0 + ',' + (arg1 != null ? field1227[1] : field1227[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1227[1] : field1227[2]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field1227[1] : field1227[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIIILjava/lang/String;)V",
      line = 100
   )
   public final void method711(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
      try {
         ++field1208;
         if (arg5 != null) {
            this.method708(arg3 ^ -78, arg1, arg4);
            this.method723(arg3, arg5, (class476[])null, 0, arg2, (byte)16, (int[])null, (class510)null, arg0);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1227[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1227[1] : field1227[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "b",
      descriptor = "(IIIIILjava/lang/String;)V",
      line = 114
   )
   public final void method712(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
      try {
         ++field1205;
         if (arg5 != null) {
            if (arg2 == 5) {
               this.method708(arg2 ^ -107, arg1, arg3);
               this.method723(0, arg5, (class476[])null, 0, arg4, (byte)16, (int[])null, (class510)null, -(this.field1206.method3351(arg5, true) / 2) + arg0);
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1227[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1227[1] : field1227[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(BLjava/lang/String;)V",
      line = 138
   )
   private final void method713(byte arg0, String arg1) {
      boolean var3 = client.field4564;

      try {
         try {
            label130: {
               label123: {
                  if (arg1.startsWith(field1227[39])) {
                     class135.field2214 = -16777216 & class135.field2214 | class68.method738(arg1.substring(4), 114, 16) & 16777215;
                     if (!var3) {
                        break label123;
                     }
                  }

                  if (arg1.equals(field1227[42])) {
                     class135.field2214 = 16777215 & class70.field1256 | -16777216 & class135.field2214;
                  }
               }

               if (!arg1.startsWith(field1227[40])) {
                  if (arg1.equals(field1227[41])) {
                     class135.field2214 = class70.field1256;
                     if (!var3) {
                        break label130;
                     }
                  }

                  if (!arg1.startsWith(field1227[38])) {
                     if (arg1.equals(field1227[37])) {
                        class190.field2847 = class135.field2214 & -16777216 | 8388608;
                        if (!var3) {
                           break label130;
                        }
                     }

                     if (arg1.equals(field1227[29])) {
                        class190.field2847 = -1;
                        if (!var3) {
                           break label130;
                        }
                     }

                     if (!arg1.startsWith(field1227[34])) {
                        if (arg1.equals("u")) {
                           class304.field4402 = -16777216 & class135.field2214;
                           if (!var3) {
                              break label130;
                           }
                        }

                        if (arg1.equals(field1227[33])) {
                           class304.field4402 = -1;
                           if (!var3) {
                              break label130;
                           }
                        }

                        if (!arg1.equalsIgnoreCase(field1227[36])) {
                           if (!arg1.startsWith(field1227[32])) {
                              if (arg1.equals(field1227[30])) {
                                 class535.field7787 = class135.field2214 & -16777216;
                                 if (!var3) {
                                    break label130;
                                 }
                              }

                              if (arg1.equals(field1227[28])) {
                                 class535.field7787 = class668.field9696;
                                 if (!var3) {
                                    break label130;
                                 }
                              }

                              if (!arg1.equals(field1227[31])) {
                                 break label130;
                              }

                              this.method708(-109, class668.field9696, class70.field1256);
                              if (!var3) {
                                 break label130;
                              }
                           }

                           class535.field7787 = class135.field2214 & -16777216 | class68.method738(arg1.substring(5), arg0 + 47, 16);
                           if (!var3) {
                              break label130;
                           }
                        }

                        class535.field7787 = 0;
                        if (!var3) {
                           break label130;
                        }
                     }

                     class304.field4402 = -16777216 & class135.field2214 | class68.method738(arg1.substring(2), 121, 16);
                     if (!var3) {
                        break label130;
                     }
                  }

                  class190.field2847 = -16777216 & class135.field2214 | class68.method738(arg1.substring(4), 110, 16);
                  if (!var3) {
                     break label130;
                  }
               }

               class135.field2214 = class68.method738(arg1.substring(5), 123, 16);
            }
         } catch (Exception var5) {
         }

         ++field1213;
         if (arg0 != 68) {
            method722(23, 88);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1227[35] + arg0 + ',' + (arg1 != null ? field1227[1] : field1227[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "<init>",
      descriptor = "(Lha;Lika;)V",
      line = 213
   )
   public class66(class65 arg0, class445 arg1) {
      try {
         this.field1204 = arg0;
         this.field1206 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1227[23] + (arg0 != null ? field1227[1] : field1227[2]) + ',' + (arg1 != null ? field1227[1] : field1227[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IILjava/lang/String;III)V",
      line = 222
   )
   public final void method714(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
      try {
         ++field1218;
         if (arg5 == -16777216) {
            if (arg2 != null) {
               this.method708(96, arg0, arg4);
               this.method723(0, arg2, (class476[])null, 0, arg1, (byte)16, (int[])null, (class510)null, -this.field1206.method3351(arg2, true) + arg3);
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1227[24] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1227[1] : field1227[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V",
      line = 238
   )
   private final void method715(int arg0, String arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         ++field1215;
         int var5 = 0;
         boolean var6 = false;
         if (arg2 != -20237) {
            field1221 = -46;
         }

         int var7 = 0;
         int var10000;
         if (var4) {
            var10000 = arg1.charAt(var7);
         } else if (~var7 <= ~arg1.length()) {
            var10000 = ~var5;
            if (!var4) {
               if (var10000 < -1) {
                  class292.field4069 = (-this.field1206.method3351(arg1, true) + arg0 << 8) / var5;
                  return;
               }

               return;
            }
         } else {
            var10000 = arg1.charAt(var7);
         }

         while(true) {
            int var8 = var10000;
            if (var8 == 60) {
               var6 = true;
               if (var4) {
                  if (~var8 == -63) {
                     var6 = false;
                     if (var4) {
                        if (!var6 && ~var8 == -33) {
                           ++var5;
                        }

                        ++var7;
                     } else {
                        ++var7;
                     }
                  } else {
                     if (!var6 && ~var8 == -33) {
                        ++var5;
                     }

                     ++var7;
                  }
               } else {
                  ++var7;
               }
            } else if (~var8 == -63) {
               var6 = false;
               if (var4) {
                  if (!var6 && ~var8 == -33) {
                     ++var5;
                  }

                  ++var7;
               } else {
                  ++var7;
               }
            } else {
               if (!var6 && ~var8 == -33) {
                  ++var5;
               }

               ++var7;
            }

            if (~var7 <= ~arg1.length()) {
               var10000 = ~var5;
               if (!var4) {
                  if (var10000 < -1) {
                     class292.field4069 = (-this.field1206.method3351(arg1, true) + arg0 << 8) / var5;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg1.charAt(var7);
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field1227[3] + arg0 + ',' + (arg1 != null ? field1227[1] : field1227[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([ILjava/util/Random;BLjava/lang/String;II[Ltd;III)I",
      line = 277
   )
   public final int method716(int[] arg0, Random arg1, byte arg2, String arg3, int arg4, int arg5, class476[] arg6, int arg7, int arg8, int arg9) {
      boolean var11 = client.field4564;

      try {
         ++field1209;
         if (arg3 == null) {
            return 0;
         } else {
            arg1.setSeed((long)arg7);
            int var12 = (arg1.nextInt() & 31) + 192;
            this.method708(-85, var12 << 24 | 16777215 & arg9, var12 << 24 | arg8 & 16777215);
            int var13 = arg3.length();
            int var14 = -76 % ((arg2 - 14) / 49);
            int[] var15 = new int[var13];
            int var16 = 0;
            int var17 = 0;
            if (var11) {
               var15[var17] = var16;
               if (~(arg1.nextInt() & 3) == -1) {
                  ++var16;
               }

               ++var17;
            }

            while(true) {
               while(~var17 > ~var13) {
                  var15[var17] = var16;
                  if (~(arg1.nextInt() & 3) == -1) {
                     ++var16;
                  }

                  ++var17;
               }

               this.method719(arg6, (int[])null, true, arg4, arg3, arg5, arg0, var15);
               if (!var11) {
                  return var16;
               }

               if (var16 == -1) {
                  ++var16;
               }

               ++var17;
            }
         }
      } catch (RuntimeException var19) {
         throw class608.method4462(var19, field1227[8] + (arg0 != null ? field1227[1] : field1227[2]) + ',' + (arg1 != null ? field1227[1] : field1227[2]) + ',' + arg2 + ',' + (arg3 != null ? field1227[1] : field1227[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1227[1] : field1227[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([IIIII[Ltd;IIIILjava/lang/String;ILaa;III)I",
      line = 315
   )
   public final int method717(int[] arg0, int arg1, int arg2, int arg3, int arg4, class476[] arg5, int arg6, int arg7, int arg8, int arg9, String arg10, int arg11, class510 arg12, int arg13, int arg14, int arg15) {
      try {
         ++field1220;
         if (arg15 != 255) {
            field1222 = 30;
         }

         return this.method718(arg14, arg12, arg7, arg0, arg1, arg8, arg9, arg2, 0, arg13, arg3, 29943, arg6, arg11, arg10, arg5, arg4);
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field1227[10] + (arg0 != null ? field1227[1] : field1227[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1227[1] : field1227[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field1227[1] : field1227[2]) + ',' + arg11 + ',' + (arg12 != null ? field1227[1] : field1227[2]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ILaa;I[IIIIIIIIIIILjava/lang/String;[Ltd;I)I",
      line = 326
   )
   public final int method718(int arg0, class510 arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, String arg14, class476[] arg15, int arg16) {
      boolean var18 = client.field4564;

      try {
         ++field1219;
         if (arg14 == null) {
            return 0;
         } else {
            this.method708(arg11 ^ 29870, arg5, arg9);
            if (~arg13 == -1) {
               arg13 = this.field1206.field6485;
            }

            int[] var19;
            label149: {
               if (arg10 < this.field1206.field6490 + this.field1206.field6478 - -arg13 && arg10 < arg13 - -arg13) {
                  var19 = null;
                  if (!var18) {
                     break label149;
                  }
               }

               var19 = new int[]{arg2};
            }

            int var20 = this.field1206.method3347(arg15, 0, var19, arg14, class301.field4212);
            if (~arg8 == 0) {
               arg8 = arg10 / arg13;
               if (arg8 <= 0) {
                  arg8 = 1;
               }
            }

            if (~arg8 < -1 && arg8 <= var20) {
               class301.field4212[arg8 + -1] = this.field1206.method3352(0, class301.field4212[arg8 + -1], arg2, arg15);
               var20 = arg8;
            }

            if (~arg12 == -4 && ~var20 == -2) {
               arg12 = 1;
            }

            int var21;
            label139: {
               if (~arg12 != -1) {
                  if (arg12 == 1) {
                     var21 = (arg10 - this.field1206.field6478 - (this.field1206.field6490 - -((var20 + -1) * arg13))) / 2 + (arg6 - -this.field1206.field6478);
                     if (!var18) {
                        break label139;
                     }
                  }

                  if (~arg12 == -3) {
                     var21 = arg6 + arg10 - this.field1206.field6490 + -((var20 + -1) * arg13);
                     if (!var18) {
                        break label139;
                     }
                  }

                  int var22 = (-this.field1206.field6478 + arg10 + -this.field1206.field6490 + -((var20 - 1) * arg13)) / (var20 - -1);
                  if (~var22 > -1) {
                     var22 = 0;
                  }

                  arg13 += var22;
                  var21 = arg6 + var22 - -this.field1206.field6478;
                  if (!var18) {
                     break label139;
                  }
               }

               var21 = this.field1206.field6478 + arg6;
            }

            if (arg11 != 29943) {
               this.method716((int[])null, (Random)null, (byte)-119, (String)null, -1, 27, (class476[])null, -120, -104, -49);
            }

            int var23 = 0;
            int var10000;
            if (var18) {
               var10000 = arg0;
            } else if (var20 <= var23) {
               var10000 = var20;
               if (!var18) {
                  return var20;
               }
            } else {
               var10000 = arg0;
            }

            while(true) {
               label159: {
                  if (var10000 == 0) {
                     this.method723(arg7, class301.field4212[var23], arg15, arg16, var21, (byte)16, arg3, arg1, arg4);
                     if (!var18) {
                        break label159;
                     }
                  }

                  if (~arg0 == -2) {
                     this.method723(arg7, class301.field4212[var23], arg15, arg16, var21, (byte)16, arg3, arg1, (-this.field1206.method3351(class301.field4212[var23], true) + arg2) / 2 + arg4);
                     if (!var18) {
                        break label159;
                     }
                  }

                  if (arg0 != 2) {
                     if (var20 + -1 == var23) {
                        this.method723(arg7, class301.field4212[var23], arg15, arg16, var21, (byte)16, arg3, arg1, arg4);
                        if (!var18) {
                           break label159;
                        }
                     }

                     this.method715(arg2, class301.field4212[var23], -20237);
                     this.method723(arg7, class301.field4212[var23], arg15, arg16, var21, (byte)16, arg3, arg1, arg4);
                     class292.field4069 = 0;
                     if (!var18) {
                        break label159;
                     }
                  }

                  this.method723(arg7, class301.field4212[var23], arg15, arg16, var21, (byte)16, arg3, arg1, -this.field1206.method3351(class301.field4212[var23], true) + arg2 + arg4);
               }

               var21 += arg13;
               ++var23;
               if (var20 <= var23) {
                  var10000 = var20;
                  if (!var18) {
                     return var20;
                  }
               } else {
                  var10000 = arg0;
               }
            }
         }
      } catch (RuntimeException var25) {
         throw class608.method4462(var25, field1227[5] + arg0 + ',' + (arg1 != null ? field1227[1] : field1227[2]) + ',' + arg2 + ',' + (arg3 != null ? field1227[1] : field1227[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + (arg14 != null ? field1227[1] : field1227[2]) + ',' + (arg15 != null ? field1227[1] : field1227[2]) + ',' + arg16 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([Ltd;[IZILjava/lang/String;I[I[I)V",
      line = 429
   )
   private final void method719(class476[] param1, int[] param2, boolean param3, int param4, String param5, int param6, int[] param7, int[] param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ILjava/util/Random;III[II[Ltd;IIII[IILjava/lang/String;)I",
      line = 599
   )
   public final int method720(int arg0, Random arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, class476[] arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, String arg14) {
      boolean var16 = client.field4564;

      try {
         ++field1211;
         if (arg14 == null) {
            return 0;
         } else {
            arg1.setSeed((long)arg8);
            int var17 = 192 - -(31 & arg1.nextInt());
            if (arg2 >= -102) {
               this.method708(-95, -111, 2);
            }

            this.method708(-99, var17 << 24 | arg3 & 16777215, 16777215 & arg4 | var17 << 24);
            int var18 = arg14.length();
            int[] var19 = new int[var18];
            int var20 = 0;
            int var21 = 0;
            if (var16) {
               var19[var21] = var20;
               if ((3 & arg1.nextInt()) == 0) {
                  ++var20;
               }

               ++var21;
            }

            while(true) {
               while(var21 < var18) {
                  var19[var21] = var20;
                  if ((3 & arg1.nextInt()) == 0) {
                     ++var20;
                  }

                  ++var21;
               }

               int var22 = arg0;
               int var23 = this.field1206.field6478 + arg13;
               int var10000 = ~arg9;
               if (!var16) {
                  label80: {
                     if (var10000 != -2) {
                        if (arg9 != 2) {
                           break label80;
                        }

                        var23 = arg13 - (-arg6 + this.field1206.field6490);
                        if (!var16) {
                           break label80;
                        }
                     }

                     var23 += (arg6 - this.field1206.field6478 + -this.field1206.field6490) / 2;
                  }

                  int var24;
                  label73: {
                     var24 = -1;
                     if (arg11 == 1) {
                        var24 = this.field1206.method3351(arg14, true) - -var20;
                        var22 = (-var24 + arg10) / 2 + arg0;
                        if (!var16) {
                           break label73;
                        }
                     }

                     if (arg11 == 2) {
                        var24 = this.field1206.method3351(arg14, true) - -var20;
                        var22 += arg10 - var24;
                     }
                  }

                  this.method719(arg7, (int[])null, true, var23, arg14, var22, arg12, var19);
                  if (arg5 != null) {
                     if (var24 == -1) {
                        var24 = var20 + this.field1206.method3351(arg14, true);
                     }

                     arg5[1] = -this.field1206.field6478 + var23;
                     arg5[0] = var22;
                     arg5[3] = this.field1206.field6490 + this.field1206.field6478;
                     arg5[2] = var24;
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
         throw class608.method4462(var26, field1227[25] + arg0 + ',' + (arg1 != null ? field1227[1] : field1227[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1227[1] : field1227[2]) + ',' + arg6 + ',' + (arg7 != null ? field1227[1] : field1227[2]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + (arg12 != null ? field1227[1] : field1227[2]) + ',' + arg13 + ',' + (arg14 != null ? field1227[1] : field1227[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIBLjava/lang/String;III)V",
      line = 677
   )
   public final void method721(int param1, int param2, byte param3, String param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(II)V",
      line = 705
   )
   public static final void method722(int arg0, int arg1) {
      try {
         ++field1201;
         class755.field10968 = arg0;
         class3.field22 = arg1;
         class493.field7185 = -1;
         class632.method4645(-126);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1227[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ILjava/lang/String;[Ltd;IIB[ILaa;I)V",
      line = 717
   )
   private final void method723(int param1, String param2, class476[] param3, int param4, int param5, byte param6, int[] param7, class510 param8, int param9) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIIILjava/lang/String;II)V",
      line = 869
   )
   public final void method724(int param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public abstract void method140(char arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public abstract void method143(char arg0, int arg1, int arg2, int arg3, boolean arg4, class510 arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method725(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method726(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
