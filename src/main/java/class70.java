import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class70 extends class247 {
   @OriginalMember(
      owner = "client!ic",
      name = "n",
      descriptor = "Lpha;"
   )
   private class757 field1017;
   @OriginalMember(
      owner = "client!ic",
      name = "u",
      descriptor = "Ljea;"
   )
   private class6 field1030;
   @OriginalMember(
      owner = "client!ic",
      name = "r",
      descriptor = "Laea;"
   )
   private class678 field1011;
   @OriginalMember(
      owner = "client!ic",
      name = "D",
      descriptor = "I"
   )
   private int field1022;
   @OriginalMember(
      owner = "client!ic",
      name = "p",
      descriptor = "I"
   )
   private int field1010;
   @OriginalMember(
      owner = "client!ic",
      name = "I",
      descriptor = "I"
   )
   private int field1021;
   @OriginalMember(
      owner = "client!ic",
      name = "t",
      descriptor = "I"
   )
   private int field1020;
   @OriginalMember(
      owner = "client!ic",
      name = "j",
      descriptor = "[[F"
   )
   private float[][] field1023;
   @OriginalMember(
      owner = "client!ic",
      name = "G",
      descriptor = "[[F"
   )
   private float[][] field1027;
   @OriginalMember(
      owner = "client!ic",
      name = "J",
      descriptor = "[[F"
   )
   private float[][] field1013;
   @OriginalMember(
      owner = "client!ic",
      name = "q",
      descriptor = "I"
   )
   private int field1032;
   @OriginalMember(
      owner = "client!ic",
      name = "k",
      descriptor = "Lcu;"
   )
   private class65 field1019;
   @OriginalMember(
      owner = "client!ic",
      name = "v",
      descriptor = "Lar;"
   )
   private class637 field1014;
   @OriginalMember(
      owner = "client!ic",
      name = "s",
      descriptor = "Lbga;"
   )
   private class398 field1016;
   @OriginalMember(
      owner = "client!ic",
      name = "x",
      descriptor = "Lss;"
   )
   private class723 field1009;
   @OriginalMember(
      owner = "client!ic",
      name = "H",
      descriptor = "Luba;"
   )
   private class516 field1015;
   @OriginalMember(
      owner = "client!ic",
      name = "F",
      descriptor = "Lwu;"
   )
   private class451 field1012;
   @OriginalMember(
      owner = "client!ic",
      name = "A",
      descriptor = "Lwu;"
   )
   private class451 field1025;
   @OriginalMember(
      owner = "client!ic",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1033 = new String[]{method746(method745("q#\tE\u0018")), method746(method745("cn\t(M")), method746(method745("q#\tB\u0018")), method746(method745("v5Kj")), method746(method745("q#\tG\u0018")), method746(method745("q#\t:Yv)S8\u0018")), method746(method745("q#\tD\u0018")), method746(method745("q#\tC\u0018"))};
   @OriginalMember(
      owner = "client!ic",
      name = "y",
      descriptor = "I"
   )
   public static int field1024 = -2;
   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "Lsb;"
   )
   public static class261 field1028 = new class261();
   @OriginalMember(
      owner = "client!ic",
      name = "C",
      descriptor = "I"
   )
   public static int field1007;
   @OriginalMember(
      owner = "client!ic",
      name = "m",
      descriptor = "I"
   )
   public static int field1008;
   @OriginalMember(
      owner = "client!ic",
      name = "E",
      descriptor = "I"
   )
   public static int field1018;
   @OriginalMember(
      owner = "client!ic",
      name = "l",
      descriptor = "I"
   )
   public static int field1026;
   @OriginalMember(
      owner = "client!ic",
      name = "w",
      descriptor = "I"
   )
   private int field1031;
   @OriginalMember(
      owner = "client!ic",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field1029;

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(SZ)V"
   )
   private final void method740(short arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method740((short)18, false);
         }

         label19: {
            if (!this.field1011.field9826) {
               this.field1019.method695(arg0, (byte)-23);
               if (!client.field10022) {
                  break label19;
               }
            }

            this.field1019.method653(arg0, -108);
         }

         ++field1008;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1033[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method741(int arg0) {
      try {
         if (arg0 == 1) {
            field1028 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1033[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(BIIIIII)V"
   )
   private final void method742(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         ++field1026;
         long var9 = -1L;
         int var11 = (arg1 << this.field1030.field10671) + arg2;
         int var12 = (arg4 << this.field1030.field10671) + arg3;
         int var13 = this.field1030.method5401(var11, true, var12);
         if ((127 & arg2) == 0 || ~(127 & arg3) == -1) {
            var9 = ((long)var12 & 65535L) << 16 | 65535L & (long)var11;
            class247 var14 = this.field1016.method3101(-1, var9);
            if (var14 != null) {
               this.method740(((class687)var14).field9908, true);
               return;
            }
         }

         short var15 = (short)(this.field1031++);
         if (var9 != -1L) {
            this.field1016.method3098(var9, new class687(var15), -1);
         }

         float var16;
         float var17;
         float var18;
         label115: {
            if (~arg2 != -1 || arg3 != 0) {
               if (this.field1030.field10672 != arg2 || arg3 != 0) {
                  if (this.field1030.field10672 != arg2 || this.field1030.field10672 != arg3) {
                     if (~arg2 == -1 && this.field1030.field10672 == arg3) {
                        var16 = this.field1027[arg6][arg5 + 1];
                        var17 = this.field1013[arg6][arg5 - -1];
                        var18 = this.field1023[arg6][arg5 + 1];
                        if (!var8) {
                           break label115;
                        }
                     }

                     float var19 = (float)arg2 / (float)this.field1030.field10672;
                     float var20 = (float)arg3 / (float)this.field1030.field10672;
                     float var21 = this.field1027[arg6][arg5];
                     float var22 = this.field1023[arg6][arg5];
                     float var23 = this.field1013[arg6][arg5];
                     float var24 = this.field1027[arg6 + 1][arg5];
                     float var25 = this.field1023[arg6 + 1][arg5];
                     float var26 = (this.field1027[arg6][arg5 - -1] + -var21) * var19 + var21;
                     float var27 = (this.field1023[arg6][arg5 - -1] - var22) * var19 + var22;
                     float var28 = this.field1013[arg6 - -1][arg5];
                     float var29 = (this.field1027[arg6 + 1][arg5 + 1] - var24) * var19 + var24;
                     float var30 = (this.field1013[arg6][arg5 + 1] - var23) * var19 + var23;
                     float var31 = (this.field1023[arg6 + 1][arg5 - -1] + -var25) * var19 + var25;
                     float var32 = (this.field1013[arg6 + 1][arg5 + 1] - var28) * var19 + var28;
                     var18 = (-var27 + var31) * var20 + var27;
                     var16 = (var29 - var26) * var20 + var26;
                     var17 = (var32 - var30) * var20 + var30;
                     if (!var8) {
                        break label115;
                     }
                  }

                  var18 = this.field1023[arg6 - -1][arg5 + 1];
                  var16 = this.field1027[arg6 + 1][arg5 + 1];
                  var17 = this.field1013[arg6 + 1][arg5 + 1];
                  if (!var8) {
                     break label115;
                  }
               }

               var17 = this.field1013[arg6 + 1][arg5];
               var18 = this.field1023[arg6 - -1][arg5];
               var16 = this.field1027[arg6 + 1][arg5];
               if (!var8) {
                  break label115;
               }
            }

            var18 = this.field1023[arg6][arg5];
            var17 = this.field1013[arg6][arg5];
            var16 = this.field1027[arg6][arg5];
         }

         float var33 = (float)(-var11 + this.field1017.method5474(10368));
         float var34 = (float)(this.field1017.method5470(true) - var13);
         float var35 = (float)(-var12 + this.field1017.method5469((byte)13));
         float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
         float var37 = 1.0F / var36;
         float var38 = var33 * var37;
         float var39 = var35 * var37;
         float var40 = var34 * var37;
         float var41 = var36 / (float)this.field1017.method5465((byte)115);
         float var42 = -(var41 * var41) + 1.0F;
         if (var42 < 0.0F) {
            var42 = 0.0F;
         }

         float var43 = var17 * var39 + var16 * var38 + var18 * var40;
         if (var43 < 0.0F) {
            var43 = 0.0F;
         }

         float var44 = var42 * var43 * 2.0F;
         if (var44 > 1.0F) {
            var44 = 1.0F;
         }

         int var45 = this.field1017.method5466(true);
         int var46 = (int)((float)((16714092 & var45) >> 16) * var44);
         if (var46 > 255) {
            var46 = 255;
         }

         int var47 = (int)((float)(var45 >> 8 & 255) * var44);
         if (var47 > 255) {
            var47 = 255;
         }

         int var48;
         label67: {
            var48 = (int)((float)(255 & var45) * var44);
            if (!this.field1011.field9826) {
               this.field1014.method4648(14571, (float)var11);
               this.field1014.method4648(14571, (float)var13);
               this.field1014.method4648(14571, (float)var12);
               if (!var8) {
                  break label67;
               }
            }

            this.field1014.method4649((float)var11, 1409);
            this.field1014.method4649((float)var13, arg0 + 1451);
            this.field1014.method4649((float)var12, arg0 ^ -1449);
         }

         if (~var48 < -256) {
            var48 = 255;
         }

         this.field1014.method656((byte)35, var46);
         this.field1014.method656((byte)-98, var47);
         if (arg0 != -42) {
            this.method743(126, (boolean[][])null, -110, -63, 117);
         }

         this.field1014.method656((byte)90, var48);
         this.field1014.method656((byte)43, 255);
         this.method740(var15, true);
      } catch (RuntimeException var50) {
         throw class612.method4503(var50, field1033[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(I[[ZIII)V"
   )
   public final void method743(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field10022;

      try {
         ++field1018;
         if (this.field1009 != null) {
            if (arg4 != -4817) {
               this.method743(-31, (boolean[][])null, 31, -86, -3);
            }

            if (~this.field1022 >= ~(arg0 + arg3)) {
               if (~(-arg0 + arg3) >= ~this.field1010) {
                  if (~(arg2 - -arg0) <= ~this.field1021) {
                     if (~this.field1020 <= ~(-arg0 + arg2)) {
                        int var7 = this.field1021;
                        if (var6 || this.field1020 >= var7) {
                           do {
                              int var8 = this.field1022;
                              if (var6 || ~var8 >= ~this.field1010) {
                                 do {
                                    int var9 = -arg3 + var8;
                                    int var10 = var7 - arg2;
                                    if (-arg0 < var9 && ~arg0 < ~var9 && ~(-arg0) > ~var10 && var10 < arg0 && arg1[arg0 + var9][arg0 + var10]) {
                                       this.field1011.method4911((int)(this.field1017.method5471(0) * 255.0F) << 24, (byte)114);
                                       this.field1011.method4946(-16068, this.field1025, (class451)null, this.field1012, (class451)null);
                                       this.field1011.method4952(127, 4, this.field1032, 0, this.field1009);
                                       return;
                                    }

                                    ++var8;
                                 } while(~var8 >= ~this.field1010);
                              }

                              ++var7;
                           } while(this.field1020 >= var7);

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field1033[2] + arg0 + ',' + (arg1 != null ? field1033[1] : field1033[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method744(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field1007;
         if (arg3 >= -114) {
            method741(55);
         }

         class437 var4 = class341.field5025[arg2][arg0];
         class762.method5501(arg1, -17527, var4 != null ? var4 : class418.field6116);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1033[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "<init>",
      descriptor = "(Laea;Ljea;Lpha;[I)V"
   )
   public class70(class678 param1, class6 param2, class757 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method745(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method746(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
