import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class218 extends class70 {
   @OriginalMember(
      owner = "client!ku",
      name = "L",
      descriptor = "[S"
   )
   private short[] field2767 = new short[257];
   @OriginalMember(
      owner = "client!ku",
      name = "S",
      descriptor = "I"
   )
   private int field2765 = 0;
   @OriginalMember(
      owner = "client!ku",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2769 = new String[]{method1777(method1776("\u001dpIcb")), method1777(method1776("\u001dpIab")), method1777(method1776("\u001dpIbb")), method1777(method1776("\u001dpIjb")), method1777(method1776("5p\u0015P/Vj\u0017C8\u0017q\u000eI$Vw\u0002W?\u001fw\u0002Uj\u0017qGJ/\u0017v\u0013\u0006>\u0001jGK+\u0004n\u0002T9")), method1777(method1776("\u001dpIib")), method1777(method1776("\u001dpIeb")), method1777(method1776("\r+I\b7")), method1777(method1776("\u0018p\u000bJ"))};
   @OriginalMember(
      owner = "client!ku",
      name = "Q",
      descriptor = "I"
   )
   public static int field2757;
   @OriginalMember(
      owner = "client!ku",
      name = "M",
      descriptor = "I"
   )
   public static int field2758;
   @OriginalMember(
      owner = "client!ku",
      name = "T",
      descriptor = "I"
   )
   public static int field2759;
   @OriginalMember(
      owner = "client!ku",
      name = "P",
      descriptor = "I"
   )
   public static int field2760;
   @OriginalMember(
      owner = "client!ku",
      name = "R",
      descriptor = "I"
   )
   public static int field2761;
   @OriginalMember(
      owner = "client!ku",
      name = "K",
      descriptor = "I"
   )
   public static int field2763;
   @OriginalMember(
      owner = "client!ku",
      name = "I",
      descriptor = "I"
   )
   public static int field2764;
   @OriginalMember(
      owner = "client!ku",
      name = "J",
      descriptor = "[I"
   )
   private int[] field2762;
   @OriginalMember(
      owner = "client!ku",
      name = "O",
      descriptor = "[I"
   )
   private int[] field2768;
   @OriginalMember(
      owner = "client!ku",
      name = "N",
      descriptor = "[[I"
   )
   private int[][] field2766;

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         if (arg0 > -34) {
            this.field2767 = null;
         }

         if (~arg2 == -1) {
            this.field2765 = arg1.method640(255);
            this.field2766 = new int[arg1.method640(255)][2];
            int var5 = 0;
            if (var4 || var5 < this.field2766.length) {
               do {
                  this.field2766[var5][0] = arg1.method603(-2);
                  this.field2766[var5][1] = arg1.method603(-2);
                  ++var5;
               } while(var5 < this.field2766.length);
            }
         }

         ++field2760;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2769[6] + arg0 + ',' + (arg1 != null ? field2769[7] : field2769[8]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method1773(byte arg0) {
      try {
         ++field2764;
         int[] var2 = this.field2766[0];
         if (arg0 > -49) {
            this.field2767 = null;
         }

         int[] var3 = this.field2766[1];
         int[] var4 = this.field2766[this.field2766.length - 2];
         int[] var5 = this.field2766[this.field2766.length + -1];
         this.field2762 = new int[]{-var3[0] - -var2[0] + var2[0], var2[1] - var3[1] + var2[1]};
         this.field2768 = new int[]{var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1]};
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2769[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "b",
      descriptor = "(II)[I"
   )
   private final int[] method1774(int arg0, int arg1) {
      try {
         ++field2763;
         if (arg0 < 0) {
            return this.field2762;
         } else if (~this.field2766.length >= ~arg0) {
            return this.field2768;
         } else {
            if (arg1 != -19870) {
               this.field2768 = null;
            }

            return this.field2766[arg0];
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2769[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "<init>",
      descriptor = "()V"
   )
   public class218() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field2761;
         if (arg0 != -63) {
            this.method550(-36, (class66)null, 112);
         }

         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int[] var5 = this.method690(105, 0, arg1);
            int var6 = 0;
            if (var3 || var6 < class262.field3328) {
               do {
                  int var7 = var5[var6] >> 4;
                  if (~var7 > -1) {
                     var7 = 0;
                  }

                  if (var7 > 256) {
                     var7 = 256;
                  }

                  var4[var6] = this.field2767[var7];
                  ++var6;
               } while(var6 < class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field2769[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         ++field2758;
         if (this.field2766 == null) {
            this.field2766 = new int[][]{new int[2], {4096, 4096}};
         }

         if (~this.field2766.length > -3) {
            throw new RuntimeException(field2769[4]);
         } else {
            if (this.field2765 == 2) {
               this.method1773((byte)-121);
            }

            if (arg0 > -36) {
               this.method1775((byte)45);
            }

            class704.method5119(true);
            this.method1775((byte)-89);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2769[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method1775(byte arg0) {
      boolean var2 = client.field1481;

      try {
         if (arg0 != -89) {
            this.method552(-106);
         }

         ++field2759;
         int var3 = this.field2765;
         int var10000;
         int var10001;
         if (~var3 != -3) {
            if (~var3 != -2) {
               int var32 = 0;
               if (!var2 && var32 >= 257) {
                  return;
               } else {
                  do {
                     int var39;
                     label198: {
                        int var33 = var32 << 4;
                        int var34 = 1;
                        int[] var35;
                        int[] var36;
                        int var37;
                        int var38;
                        if (var2) {
                           var10000 = ~this.field2766[var34][0];
                           var10001 = ~var33;
                        } else if (this.field2766.length - 1 <= var34) {
                           var35 = this.field2766[var34 + -1];
                           var36 = this.field2766[var34];
                           var37 = (-var35[0] + var33 << 12) / (var36[0] + -var35[0]);
                           var38 = 4096 - var37;
                           var39 = var35[1] * var38 - -(var36[1] * var37) >> 12;
                           var10000 = ~var39;
                           var10001 = 32767;
                           if (!var2) {
                              break label198;
                           }
                        } else {
                           var10000 = ~this.field2766[var34][0];
                           var10001 = ~var33;
                        }

                        label197:
                        do {
                           while(true) {
                              if (var10000 < var10001) {
                                 if (!var2) {
                                    var35 = this.field2766[var34 + -1];
                                    var36 = this.field2766[var34];
                                    var37 = (-var35[0] + var33 << 12) / (var36[0] + -var35[0]);
                                    var38 = 4096 - var37;
                                    var39 = var35[1] * var38 - -(var36[1] * var37) >> 12;
                                    var10000 = ~var39;
                                    var10001 = 32767;
                                    break;
                                 }

                                 ++var34;
                              } else {
                                 ++var34;
                              }

                              if (this.field2766.length - 1 <= var34) {
                                 var35 = this.field2766[var34 + -1];
                                 var36 = this.field2766[var34];
                                 var37 = (-var35[0] + var33 << 12) / (var36[0] + -var35[0]);
                                 var38 = 4096 - var37;
                                 var39 = var35[1] * var38 - -(var36[1] * var37) >> 12;
                                 var10000 = ~var39;
                                 var10001 = 32767;
                                 if (!var2) {
                                    break label197;
                                 }
                              } else {
                                 var10000 = ~this.field2766[var34][0];
                                 var10001 = ~var33;
                              }
                           }
                        } while(var2);
                     }

                     if (var10000 >= var10001) {
                        var39 = -32767;
                     }

                     if (~var39 <= -32769) {
                        var39 = 32767;
                     }

                     this.field2767[var32] = (short)var39;
                     ++var32;
                  } while(var32 < 257);

                  return;
               }
            }

            if (!var2) {
               int var23 = 0;
               if (!var2 && ~var23 <= -258) {
                  return;
               }

               do {
                  int var31;
                  label158: {
                     int var24 = var23 << 4;
                     int var25 = 1;
                     int[] var26;
                     int[] var27;
                     int var28;
                     int var29;
                     int var30;
                     if (var2) {
                        var10000 = ~var24;
                        var10001 = ~this.field2766[var25][0];
                     } else if (~var25 <= ~(this.field2766.length - 1)) {
                        var26 = this.field2766[var25 + -1];
                        var27 = this.field2766[var25];
                        var28 = (-var26[0] + var24 << 12) / (var27[0] + -var26[0]);
                        var29 = 4096 - class123.field1612[(8164 & var28) >> 5] >> 1;
                        var30 = -var29 + 4096;
                        var31 = var26[1] * var30 + var27[1] * var29 >> 12;
                        var10000 = var31;
                        var10001 = -32768;
                        if (!var2) {
                           break label158;
                        }
                     } else {
                        var10000 = ~var24;
                        var10001 = ~this.field2766[var25][0];
                     }

                     label157:
                     do {
                        while(true) {
                           if (var10000 > var10001) {
                              if (!var2) {
                                 var26 = this.field2766[var25 + -1];
                                 var27 = this.field2766[var25];
                                 var28 = (-var26[0] + var24 << 12) / (var27[0] + -var26[0]);
                                 var29 = 4096 - class123.field1612[(8164 & var28) >> 5] >> 1;
                                 var30 = -var29 + 4096;
                                 var31 = var26[1] * var30 + var27[1] * var29 >> 12;
                                 var10000 = var31;
                                 var10001 = -32768;
                                 break;
                              }

                              ++var25;
                           } else {
                              ++var25;
                           }

                           if (~var25 <= ~(this.field2766.length - 1)) {
                              var26 = this.field2766[var25 + -1];
                              var27 = this.field2766[var25];
                              var28 = (-var26[0] + var24 << 12) / (var27[0] + -var26[0]);
                              var29 = 4096 - class123.field1612[(8164 & var28) >> 5] >> 1;
                              var30 = -var29 + 4096;
                              var31 = var26[1] * var30 + var27[1] * var29 >> 12;
                              var10000 = var31;
                              var10001 = -32768;
                              if (!var2) {
                                 break label157;
                              }
                           } else {
                              var10000 = ~var24;
                              var10001 = ~this.field2766[var25][0];
                           }
                        }
                     } while(var2);
                  }

                  if (var10000 <= var10001) {
                     var31 = -32767;
                  }

                  if (var31 >= 32768) {
                     var31 = 32767;
                  }

                  this.field2767[var23] = (short)var31;
                  ++var23;
               } while(~var23 > -258);

               return;
            }
         }

         int var4 = 0;
         if (var2 || var4 < 257) {
            do {
               int var22;
               label118: {
                  int var5 = var4 << 4;
                  int var6 = 1;
                  int[] var7;
                  int[] var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var16;
                  int var17;
                  int var19;
                  int var20;
                  int var21;
                  if (var2) {
                     var10000 = this.field2766[var6][0];
                     var10001 = var5;
                  } else if (~(this.field2766.length + -1) >= ~var6) {
                     var7 = this.field2766[var6 + -1];
                     var8 = this.field2766[var6];
                     var9 = this.method1774(var6 + -2, -19870)[1];
                     var10 = var7[1];
                     var11 = var8[1];
                     var12 = this.method1774(var6 + 1, -19870)[1];
                     var13 = (-var7[0] + var5 << 12) / (var8[0] + -var7[0]);
                     var14 = var13 * var13 >> 12;
                     var15 = -var11 + var12 - -var10 + -var9;
                     var16 = -var10 + -var15 + var9;
                     var17 = -var9 + var11;
                     var19 = (var13 * var15 >> 12) * var14 >> 12;
                     var20 = var14 * var16 >> 12;
                     var21 = var13 * var17 >> 12;
                     var22 = var10 + var21 + var19 + var20;
                     var10000 = var22;
                     var10001 = -32768;
                     if (!var2) {
                        break label118;
                     }
                  } else {
                     var10000 = this.field2766[var6][0];
                     var10001 = var5;
                  }

                  label117:
                  do {
                     while(true) {
                        if (var10000 > var10001) {
                           if (!var2) {
                              var7 = this.field2766[var6 + -1];
                              var8 = this.field2766[var6];
                              var9 = this.method1774(var6 + -2, -19870)[1];
                              var10 = var7[1];
                              var11 = var8[1];
                              var12 = this.method1774(var6 + 1, -19870)[1];
                              var13 = (-var7[0] + var5 << 12) / (var8[0] + -var7[0]);
                              var14 = var13 * var13 >> 12;
                              var15 = -var11 + var12 - -var10 + -var9;
                              var16 = -var10 + -var15 + var9;
                              var17 = -var9 + var11;
                              var19 = (var13 * var15 >> 12) * var14 >> 12;
                              var20 = var14 * var16 >> 12;
                              var21 = var13 * var17 >> 12;
                              var22 = var10 + var21 + var19 + var20;
                              var10000 = var22;
                              var10001 = -32768;
                              break;
                           }

                           ++var6;
                        } else {
                           ++var6;
                        }

                        if (~(this.field2766.length + -1) >= ~var6) {
                           var7 = this.field2766[var6 + -1];
                           var8 = this.field2766[var6];
                           var9 = this.method1774(var6 + -2, -19870)[1];
                           var10 = var7[1];
                           var11 = var8[1];
                           var12 = this.method1774(var6 + 1, -19870)[1];
                           var13 = (-var7[0] + var5 << 12) / (var8[0] + -var7[0]);
                           var14 = var13 * var13 >> 12;
                           var15 = -var11 + var12 - -var10 + -var9;
                           var16 = -var10 + -var15 + var9;
                           var17 = -var9 + var11;
                           var19 = (var13 * var15 >> 12) * var14 >> 12;
                           var20 = var14 * var16 >> 12;
                           var21 = var13 * var17 >> 12;
                           var22 = var10 + var21 + var19 + var20;
                           var10000 = var22;
                           var10001 = -32768;
                           if (!var2) {
                              break label117;
                           }
                        } else {
                           var10000 = this.field2766[var6][0];
                           var10001 = var5;
                        }
                     }
                  } while(var2);
               }

               if (var10000 <= var10001) {
                  var22 = -32767;
               }

               if (var22 >= 32768) {
                  var22 = 32767;
               }

               this.field2767[var4] = (short)var22;
               ++var4;
            } while(var4 < 257);

         }
      } catch (RuntimeException var41) {
         throw class93.method866(var41, field2769[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1776(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1777(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
