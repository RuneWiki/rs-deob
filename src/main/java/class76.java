import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class76 extends class606 {
   @OriginalMember(
      owner = "client!vc",
      name = "Q",
      descriptor = "Z"
   )
   public boolean field1212 = true;
   @OriginalMember(
      owner = "client!vc",
      name = "V",
      descriptor = "I"
   )
   public int field1223 = 4;
   @OriginalMember(
      owner = "client!vc",
      name = "M",
      descriptor = "I"
   )
   public int field1227 = 4;
   @OriginalMember(
      owner = "client!vc",
      name = "T",
      descriptor = "I"
   )
   public int field1225 = 0;
   @OriginalMember(
      owner = "client!vc",
      name = "E",
      descriptor = "I"
   )
   public int field1221 = 1638;
   @OriginalMember(
      owner = "client!vc",
      name = "S",
      descriptor = "I"
   )
   public int field1219 = 4;
   @OriginalMember(
      owner = "client!vc",
      name = "U",
      descriptor = "[B"
   )
   private byte[] field1222 = new byte[512];
   @OriginalMember(
      owner = "client!vc",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1229 = new String[]{method845(method844("@\r\u0001\u000fJ")), method845(method844("@\r\u0001\u0006J")), method845(method844("X\u001bC)")), method845(method844("M@\u0001k\u001f")), method845(method844("@\r\u0001\u0004J")), method845(method844("@\r\u0001\u0002J")), method845(method844("@\r\u0001\u0000J")), method845(method844("Z\u0001H\"\u0007R\u0001Z1")), method845(method844("i\u001a@5")), method845(method844("@\r\u0001\fJ")), method845(method844("i\fC$\f]")), method845(method844("@\r\u0001\rJ")), method845(method844("@\r\u0001\u000eJ"))};
   @OriginalMember(
      owner = "client!vc",
      name = "K",
      descriptor = "Z"
   )
   public static boolean field1214 = false;
   @OriginalMember(
      owner = "client!vc",
      name = "N",
      descriptor = "I"
   )
   public static int field1210;
   @OriginalMember(
      owner = "client!vc",
      name = "H",
      descriptor = "I"
   )
   public static int field1211;
   @OriginalMember(
      owner = "client!vc",
      name = "D",
      descriptor = "I"
   )
   public static int field1213;
   @OriginalMember(
      owner = "client!vc",
      name = "L",
      descriptor = "I"
   )
   public static int field1215;
   @OriginalMember(
      owner = "client!vc",
      name = "P",
      descriptor = "I"
   )
   public static int field1217;
   @OriginalMember(
      owner = "client!vc",
      name = "J",
      descriptor = "I"
   )
   public static int field1218;
   @OriginalMember(
      owner = "client!vc",
      name = "I",
      descriptor = "I"
   )
   public static int field1224;
   @OriginalMember(
      owner = "client!vc",
      name = "F",
      descriptor = "I"
   )
   public static int field1226;
   @OriginalMember(
      owner = "client!vc",
      name = "R",
      descriptor = "I"
   )
   public static int field1228;
   @OriginalMember(
      owner = "client!vc",
      name = "G",
      descriptor = "[S"
   )
   private short[] field1216;
   @OriginalMember(
      owner = "client!vc",
      name = "O",
      descriptor = "[S"
   )
   private short[] field1220;

   @OriginalMember(
      owner = "client!vc",
      name = "<init>",
      descriptor = "()V"
   )
   public class76() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      try {
         ++field1228;
         int[] var3 = super.field8645.method2632(arg1, 27230);
         if (arg0 != 0) {
            this.method9(81, 112);
         }

         if (super.field8645.field4884) {
            this.method843(var3, 19077, arg1);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1229[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(IIIIIII)I"
   )
   private final int method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         int var9 = -82 / ((arg2 - 14) / 57);
         ++field1218;
         int var10 = arg1 >> 12;
         int var11 = var10 + 1;
         if (var11 >= arg5) {
            var11 = 0;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var18;
         int var29;
         label96: {
            var12 = var10 & 255;
            var29 = arg1 & 4095;
            var13 = var29 + -4096;
            var14 = arg6 + -4096;
            var15 = var11 & 255;
            var16 = class482.field6913[var29];
            int var17 = this.field1222[arg3 + var12] & 3;
            if (~var17 < -2) {
               var18 = var17 != 2 ? -var29 + -arg6 : var29 - arg6;
               if (!var8) {
                  break label96;
               }
            }

            var18 = ~var17 != -1 ? -var29 + arg6 : var29 + arg6;
         }

         int var20;
         label97: {
            int var19 = this.field1222[arg3 + var15] & 3;
            if (var19 > 1) {
               var20 = var19 == 2 ? -arg6 + var13 : -arg6 + -var13;
               if (!var8) {
                  break label97;
               }
            }

            var20 = ~var19 != -1 ? -var13 + arg6 : var13 - -arg6;
         }

         int var21;
         int var23;
         label98: {
            var21 = ((-var18 + var20) * var16 >> 12) + var18;
            int var22 = 3 & this.field1222[arg4 + var12];
            if (~var22 < -2) {
               var23 = var22 == 2 ? -var14 + var29 : -var29 + -var14;
               if (!var8) {
                  break label98;
               }
            }

            var23 = var22 != 0 ? -var29 + var14 : var29 + var14;
         }

         int var25;
         label99: {
            int var24 = this.field1222[arg4 + var15] & 3;
            if (~var24 < -2) {
               var25 = ~var24 == -3 ? var13 - var14 : -var13 + -var14;
               if (!var8) {
                  break label99;
               }
            }

            var25 = ~var24 != -1 ? -var13 + var14 : var13 + var14;
         }

         int var26 = var23 - -((-var23 + var25) * var16 >> 12);
         return ((-var21 + var26) * arg0 >> 12) + var21;
      } catch (RuntimeException var28) {
         throw class612.method4503(var28, field1229[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method840(int arg0) {
      try {
         class521.field7326.method1045(3);
         ++field1210;
         if (arg0 != -17170) {
            method840(-88);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1229[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      boolean var2 = client.field10022;

      try {
         this.field1222 = class597.method4376(28805, this.field1225);
         ++field1217;
         if (arg0 > 118) {
            this.method841(-122);
            int var3 = this.field1219 + -1;
            if (var2 || var3 >= 1) {
               do {
                  short var4 = this.field1220[var3];
                  if (var4 > 8 || ~var4 > 7) {
                     return;
                  }

                  --this.field1219;
                  --var3;
               } while(var3 >= 1);

            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1229[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field1215;
         if (arg2 >= -6) {
            this.method839(-37, -128, -11, 50, 122, 65, -2);
         }

         if (arg1 != 0) {
            label111: {
               if (~arg1 == -2) {
                  this.field1219 = arg0.method665(false);
                  return;
               }

               if (~arg1 != -3) {
                  if (~arg1 == -4) {
                     this.field1227 = this.field1223 = arg0.method665(false);
                     return;
                  }

                  if (~arg1 == -5) {
                     this.field1225 = arg0.method665(false);
                     return;
                  }

                  if (~arg1 == -6) {
                     this.field1227 = arg0.method665(false);
                     return;
                  }

                  if (arg1 == 6) {
                     if (!var4) {
                        this.field1223 = arg0.method665(false);
                        return;
                     }
                     break label111;
                  }
               } else {
                  this.field1221 = arg0.method655((byte)116);
                  if (this.field1221 < 0) {
                     this.field1220 = new short[this.field1219];
                     int var6 = 0;
                     if (var4) {
                        this.field1220[var6] = (short)arg0.method655((byte)125);
                        ++var6;
                     }

                     while(true) {
                        while(~var6 > ~this.field1219) {
                           this.field1220[var6] = (short)arg0.method655((byte)125);
                           ++var6;
                        }

                        if (!var4) {
                           return;
                        }

                        ++var6;
                     }
                  }
               }

               return;
            }
         }

         this.field1212 = ~arg0.method665(false) == -2;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1229[4] + (arg0 != null ? field1229[3] : field1229[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method841(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(Lfea;Ljava/lang/String;IBLjava/lang/String;)Ldu;"
   )
   public static final class92 method842(class82 arg0, String arg1, int arg2, byte arg3, String arg4) {
      try {
         ++field1211;
         if (arg2 == 0) {
            return arg0.method872(arg4, false);
         } else if (~arg2 == -2) {
            try {
               Object var5 = class726.method5252(new Object[]{(new URL(class289.field4303.getCodeBase(), arg4)).toString()}, class289.field4303, arg1, 17462);
               if (var5 == null) {
                  throw new RuntimeException();
               } else {
                  class92 var6 = new class92();
                  var6.field1526 = 1;
                  return var6;
               }
            } catch (Throwable var13) {
               class92 var7 = new class92();
               var7.field1526 = 2;
               return var7;
            }
         } else if (~arg2 == -3) {
            try {
               class289.field4303.getAppletContext().showDocument(new URL(class289.field4303.getCodeBase(), arg4), field1229[10]);
               class92 var8 = new class92();
               var8.field1526 = 1;
               return var8;
            } catch (Exception var14) {
               class92 var9 = new class92();
               var9.field1526 = 2;
               return var9;
            }
         } else {
            if (arg3 <= 97) {
               field1214 = false;
            }

            if (~arg2 == -4) {
               try {
                  class726.method5254(74, class289.field4303, field1229[7]);
               } catch (Throwable var16) {
               }

               try {
                  class289.field4303.getAppletContext().showDocument(new URL(class289.field4303.getCodeBase(), arg4), field1229[8]);
                  class92 var10 = new class92();
                  var10.field1526 = 1;
                  return var10;
               } catch (Exception var15) {
                  class92 var11 = new class92();
                  var11.field1526 = 2;
                  return var11;
               }
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field1229[9] + (arg0 != null ? field1229[3] : field1229[2]) + ',' + (arg1 != null ? field1229[3] : field1229[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1229[3] : field1229[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "([III)V"
   )
   public final void method843(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field1226;
         int var5 = class693.field10001[arg2] * this.field1223;
         if (arg1 == 19077) {
            if (this.field1219 != 1) {
               short var6 = this.field1220[0];
               if (var6 > 8 || ~var6 > 7) {
                  int var7 = this.field1216[0] << 12;
                  int var8 = this.field1223 * var7 >> 12;
                  int var9 = var5 * var7 >> 12;
                  int var10 = this.field1227 * var7 >> 12;
                  int var11 = var9 >> 12;
                  int var12 = var11 - -1;
                  int var13 = var9 & 4095;
                  if (var12 >= var8) {
                     var12 = 0;
                  }

                  int var14 = this.field1222[var11 & 255] & 255;
                  int var15 = 255 & this.field1222[255 & var12];
                  int var16 = class482.field6913[var13];
                  int var17 = 0;
                  if (var4 || var17 < class563.field8014) {
                     do {
                        int var18 = class387.field5650[var17] * this.field1227;
                        int var19 = this.method839(var16, var7 * var18 >> 12, arg1 + -19142, var14, var15, var10, var13);
                        arg0[var17] = var6 * var19 >> 12;
                        ++var17;
                     } while(var17 < class563.field8014);
                  }
               }

               int var20 = 1;
               if (var4) {
                  var6 = this.field1220[var20];
               } else if (~var20 <= ~this.field1219) {
                  if (!var4) {
                     return;
                  }
               } else {
                  var6 = this.field1220[var20];
               }

               while(true) {
                  label171: {
                     int var21;
                     int var22;
                     int var23;
                     int var24;
                     int var25;
                     int var26;
                     if (var6 <= 8) {
                        if (var6 >= -8) {
                           ++var20;
                           break label171;
                        }

                        var21 = this.field1216[var20] << 12;
                        var22 = var5 * var21 >> 12;
                        var23 = this.field1227 * var21 >> 12;
                        var24 = this.field1223 * var21 >> 12;
                        var25 = var22 >> 12;
                        var26 = var25 - -1;
                        if (~var26 <= ~var24) {
                           var26 = 0;
                        }
                     } else {
                        var21 = this.field1216[var20] << 12;
                        var22 = var5 * var21 >> 12;
                        var23 = this.field1227 * var21 >> 12;
                        var24 = this.field1223 * var21 >> 12;
                        var25 = var22 >> 12;
                        var26 = var25 - -1;
                        if (~var26 <= ~var24) {
                           var26 = 0;
                        }
                     }

                     int var27 = var22 & 4095;
                     int var28 = 255 & this.field1222[var26 & 255];
                     int var29 = 255 & this.field1222[var25 & 255];
                     int var30 = class482.field6913[var27];
                     if (this.field1212 && this.field1219 + -1 == var20) {
                        int var31 = 0;
                        int var32;
                        int var33;
                        int var34;
                        if (var4) {
                           var32 = class387.field5650[var31] * this.field1227;
                           var33 = this.method839(var30, var21 * var32 >> 12, -60, var29, var28, var23, var27);
                           var34 = (var6 * var33 >> 12) + arg0[var31];
                           arg0[var31] = (var34 >> 1) + 2048;
                           ++var31;
                        }

                        while(~class563.field8014 < ~var31) {
                           var32 = class387.field5650[var31] * this.field1227;
                           var33 = this.method839(var30, var21 * var32 >> 12, -60, var29, var28, var23, var27);
                           var34 = (var6 * var33 >> 12) + arg0[var31];
                           arg0[var31] = (var34 >> 1) + 2048;
                           ++var31;
                        }

                        if (!var4) {
                           ++var20;
                           break label171;
                        }
                     }

                     int var35 = 0;
                     int var36;
                     int var37;
                     if (var4) {
                        var36 = class387.field5650[var35] * this.field1227;
                        var37 = this.method839(var30, var21 * var36 >> 12, -110, var29, var28, var23, var27);
                        arg0[var35] += var6 * var37 >> 12;
                        ++var35;
                     }

                     while(~var35 > ~class563.field8014) {
                        var36 = class387.field5650[var35] * this.field1227;
                        var37 = this.method839(var30, var21 * var36 >> 12, -110, var29, var28, var23, var27);
                        arg0[var35] += var6 * var37 >> 12;
                        ++var35;
                     }

                     ++var20;
                  }

                  if (~var20 <= ~this.field1219) {
                     if (!var4) {
                        return;
                     }
                  } else {
                     var6 = this.field1220[var20];
                  }
               }
            } else {
               short var38 = this.field1220[0];
               int var39 = this.field1216[0] << 12;
               int var40 = this.field1223 * var39 >> 12;
               int var41 = var5 * var39 >> 12;
               int var42 = this.field1227 * var39 >> 12;
               int var43 = var41 >> 12;
               int var44 = var43 + 1;
               if (~var44 <= ~var40) {
                  var44 = 0;
               }

               int var45 = var41 & 4095;
               int var46 = class482.field6913[var45];
               int var47 = 255 & this.field1222[255 & var43];
               int var48 = this.field1222[var44 & 255] & 255;
               if (!this.field1212) {
                  int var53 = 0;
                  if (var4 || ~var53 > ~class563.field8014) {
                     do {
                        int var54 = class387.field5650[var53] * this.field1227;
                        int var55 = this.method839(var46, var39 * var54 >> 12, arg1 + -19002, var47, var48, var42, var45);
                        arg0[var53] = var38 * var55 >> 12;
                        ++var53;
                     } while(~var53 > ~class563.field8014);

                  }
               } else {
                  int var49 = 0;
                  if (var4 || ~class563.field8014 < ~var49) {
                     do {
                        int var50 = class387.field5650[var49] * this.field1227;
                        int var51 = this.method839(var46, var39 * var50 >> 12, 81, var47, var48, var42, var45);
                        int var52 = var38 * var51 >> 12;
                        arg0[var49] = (var52 >> 1) + 2048;
                        ++var49;
                     } while(~class563.field8014 < ~var49);

                  }
               }
            }
         }
      } catch (RuntimeException var57) {
         throw class612.method4503(var57, field1229[1] + (arg0 != null ? field1229[3] : field1229[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method844(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method845(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
