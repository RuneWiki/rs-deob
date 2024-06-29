import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class664 extends class428 {
   @OriginalMember(
      owner = "client!sp",
      name = "n",
      descriptor = "[B"
   )
   public byte[] field9661;
   @OriginalMember(
      owner = "client!sp",
      name = "m",
      descriptor = "Lwv;"
   )
   public class37 field9662;

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(Lkf;II)Lsp;",
      line = 4
   )
   public static final class664 method4849(class266 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method2037(false, arg2, arg1);
      return var3 == null ? null : new class664(new class147(var3));
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "()V",
      line = 12
   )
   public final void method4850() {
      this.field9662 = null;
   }

   @OriginalMember(
      owner = "client!sp",
      name = "b",
      descriptor = "()V",
      line = 15
   )
   public final void method4851() {
      if (this.field9662 == null) {
         this.field9662 = new class37(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var1[9] = var2[9] = 128;
         class643 var3 = new class643(this.field9661);
         int var4 = var3.method4655();

         for(int var5 = 0; var5 < var4; ++var5) {
            var3.method4652(var5);
            var3.method4654(var5);
            var3.method4657(var5);
         }

         label53:
         do {
            while(true) {
               int var6 = var3.method4647();
               int var7 = var3.field9393[var6];

               while(var3.field9393[var6] == var7) {
                  var3.method4652(var6);
                  int var8 = var3.method4642(var6);
                  if (var8 == 1) {
                     var3.method4649();
                     var3.method4657(var6);
                     continue label53;
                  }

                  int var9 = var8 & 240;
                  if (var9 == 176) {
                     int var10 = var8 & 15;
                     int var11 = var8 >> 8 & 127;
                     int var12 = var8 >> 16 & 127;
                     if (var11 == 0) {
                        var1[var10] = (var12 << 14) + (var1[var10] & -2080769);
                     }

                     if (var11 == 32) {
                        var1[var10] = (var12 << 7) + (var1[var10] & -16257);
                     }
                  }

                  if (var9 == 192) {
                     int var13 = var8 & 15;
                     int var14 = var8 >> 8 & 127;
                     var2[var13] = var1[var13] + var14;
                  }

                  if (var9 == 144) {
                     int var15 = var8 & 15;
                     int var16 = var8 >> 8 & 127;
                     int var17 = var8 >> 16 & 127;
                     if (var17 > 0) {
                        int var18 = var2[var15];
                        class83 var19 = (class83)this.field9662.method329((byte)-24, (long)var18);
                        if (var19 == null) {
                           var19 = new class83(new byte[128]);
                           this.field9662.method336(-1, (long)var18, var19);
                        }

                        var19.field1081[var16] = 1;
                     }
                  }

                  var3.method4654(var6);
                  var3.method4657(var6);
               }
            }
         } while(!var3.method4653());

      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "<init>",
      descriptor = "(Lwf;)V",
      line = 126
   )
   private class664(class147 arg0) {
      arg0.field1856 = arg0.field1889.length - 3;
      int var2 = arg0.method1143(-15465);
      int var3 = arg0.method1211(-26166);
      int var4 = var2 * 10 + 14;
      arg0.field1856 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      for(int var13 = 0; var13 < var2; ++var13) {
         int var77 = -1;

         while(true) {
            int var78 = arg0.method1143(-15465);
            if (var77 != var78) {
               ++var4;
            }

            var77 = var78 & 15;
            if (var78 == 7) {
               break;
            }

            if (var78 == 23) {
               ++var5;
            } else if (var77 == 0) {
               ++var7;
            } else if (var77 == 1) {
               ++var8;
            } else if (var77 == 2) {
               ++var6;
            } else if (var77 == 3) {
               ++var9;
            } else if (var77 == 4) {
               ++var10;
            } else if (var77 == 5) {
               ++var11;
            } else {
               if (var77 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      int var14 = var5 * 5 + var4;
      int var15 = (var7 + var8 + var6 + var9 + var11) * 2 + var14;
      int var16 = var10 + var12 + var15;
      int var17 = arg0.field1856;
      int var18 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(int var19 = 0; var19 < var18; ++var19) {
         arg0.method1198(115);
      }

      int var20 = arg0.field1856 - var17 + var16;
      int var21 = arg0.field1856;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;
      int var29 = 0;
      int var30 = 0;
      int var31 = 0;
      int var32 = 0;
      int var33 = 0;
      int var34 = 0;

      for(int var35 = 0; var35 < var6; ++var35) {
         var34 = var34 + arg0.method1143(-15465) & 127;
         if (var34 != 0 && var34 != 32) {
            if (var34 == 1) {
               ++var22;
            } else if (var34 == 33) {
               ++var23;
            } else if (var34 == 7) {
               ++var24;
            } else if (var34 == 39) {
               ++var25;
            } else if (var34 == 10) {
               ++var26;
            } else if (var34 == 42) {
               ++var27;
            } else if (var34 == 99) {
               ++var28;
            } else if (var34 == 98) {
               ++var29;
            } else if (var34 == 101) {
               ++var30;
            } else if (var34 == 100) {
               ++var31;
            } else if (var34 != 64 && var34 != 65 && var34 != 120 && var34 != 121 && var34 != 123) {
               ++var33;
            } else {
               ++var32;
            }
         } else {
            ++var12;
         }
      }

      int var36 = 0;
      int var37 = arg0.field1856;
      arg0.field1856 += var32;
      int var38 = arg0.field1856;
      arg0.field1856 += var11;
      int var39 = arg0.field1856;
      arg0.field1856 += var10;
      int var40 = arg0.field1856;
      arg0.field1856 += var9;
      int var41 = arg0.field1856;
      arg0.field1856 += var22;
      int var42 = arg0.field1856;
      arg0.field1856 += var24;
      int var43 = arg0.field1856;
      arg0.field1856 += var26;
      int var44 = arg0.field1856;
      arg0.field1856 += var7 + var8 + var11;
      int var45 = arg0.field1856;
      arg0.field1856 += var7;
      int var46 = arg0.field1856;
      arg0.field1856 += var33;
      int var47 = arg0.field1856;
      arg0.field1856 += var8;
      int var48 = arg0.field1856;
      arg0.field1856 += var23;
      int var49 = arg0.field1856;
      arg0.field1856 += var25;
      int var50 = arg0.field1856;
      arg0.field1856 += var27;
      int var51 = arg0.field1856;
      arg0.field1856 += var12;
      int var52 = arg0.field1856;
      arg0.field1856 += var9;
      int var53 = arg0.field1856;
      arg0.field1856 += var28;
      int var54 = arg0.field1856;
      arg0.field1856 += var29;
      int var55 = arg0.field1856;
      arg0.field1856 += var30;
      int var56 = arg0.field1856;
      arg0.field1856 += var31;
      int var57 = arg0.field1856;
      arg0.field1856 += var5 * 3;
      this.field9661 = new byte[var20];
      class147 var58 = new class147(this.field9661);
      var58.method1160(120, 1297377380);
      var58.method1160(119, 6);
      var58.method1185(var2 > 1 ? 1 : 0, true);
      var58.method1185(var2, true);
      var58.method1185(var3, true);
      arg0.field1856 = var17;
      int var59 = 0;
      int var60 = 0;
      int var61 = 0;
      int var62 = 0;
      int var63 = 0;
      int var64 = 0;
      int var65 = 0;
      int[] var66 = new int[128];
      int var67 = 0;

      label223:
      for(int var68 = 0; var68 < var2; ++var68) {
         var58.method1160(105, 1297379947);
         var58.field1856 += 4;
         int var69 = var58.field1856;
         int var70 = -1;

         while(true) {
            while(true) {
               int var71 = arg0.method1198(109);
               var58.method1146(var71, 851057944);
               int var72 = arg0.field1889[var36++] & 255;
               boolean var73 = var70 != var72;
               var70 = var72 & 15;
               if (var72 == 7) {
                  if (var73) {
                     var58.method1186(255, 0);
                  }

                  var58.method1186(47, 0);
                  var58.method1186(0, 0);
                  var58.method1179(false, var58.field1856 - var69);
                  continue label223;
               }

               if (var72 == 23) {
                  if (var73) {
                     var58.method1186(255, 0);
                  }

                  var58.method1186(81, 0);
                  var58.method1186(3, 0);
                  var58.method1186(arg0.field1889[var57++], 0);
                  var58.method1186(arg0.field1889[var57++], 0);
                  var58.method1186(arg0.field1889[var57++], 0);
               } else {
                  var59 ^= var72 >> 4;
                  if (var70 == 0) {
                     if (var73) {
                        var58.method1186(var59 + 144, 0);
                     }

                     var60 += arg0.field1889[var44++];
                     var61 += arg0.field1889[var45++];
                     var58.method1186(var60 & 127, 0);
                     var58.method1186(var61 & 127, 0);
                  } else if (var70 == 1) {
                     if (var73) {
                        var58.method1186(var59 + 128, 0);
                     }

                     var60 += arg0.field1889[var44++];
                     var62 += arg0.field1889[var47++];
                     var58.method1186(var60 & 127, 0);
                     var58.method1186(var62 & 127, 0);
                  } else if (var70 == 2) {
                     if (var73) {
                        var58.method1186(var59 + 176, 0);
                     }

                     var67 = var67 + arg0.field1889[var21++] & 127;
                     var58.method1186(var67, 0);
                     byte var74;
                     if (var67 != 0 && var67 != 32) {
                        if (var67 == 1) {
                           var74 = arg0.field1889[var41++];
                        } else if (var67 == 33) {
                           var74 = arg0.field1889[var48++];
                        } else if (var67 == 7) {
                           var74 = arg0.field1889[var42++];
                        } else if (var67 == 39) {
                           var74 = arg0.field1889[var49++];
                        } else if (var67 == 10) {
                           var74 = arg0.field1889[var43++];
                        } else if (var67 == 42) {
                           var74 = arg0.field1889[var50++];
                        } else if (var67 == 99) {
                           var74 = arg0.field1889[var53++];
                        } else if (var67 == 98) {
                           var74 = arg0.field1889[var54++];
                        } else if (var67 == 101) {
                           var74 = arg0.field1889[var55++];
                        } else if (var67 == 100) {
                           var74 = arg0.field1889[var56++];
                        } else if (var67 != 64 && var67 != 65 && var67 != 120 && var67 != 121 && var67 != 123) {
                           var74 = arg0.field1889[var46++];
                        } else {
                           var74 = arg0.field1889[var37++];
                        }
                     } else {
                        var74 = arg0.field1889[var51++];
                     }

                     int var75 = var66[var67] + var74;
                     var66[var67] = var75;
                     var58.method1186(var75 & 127, 0);
                  } else if (var70 == 3) {
                     if (var73) {
                        var58.method1186(var59 + 224, 0);
                     }

                     int var76 = var63 + arg0.field1889[var52++];
                     var63 = var76 + (arg0.field1889[var40++] << 7);
                     var58.method1186(var63 & 127, 0);
                     var58.method1186(var63 >> 7 & 127, 0);
                  } else if (var70 == 4) {
                     if (var73) {
                        var58.method1186(var59 + 208, 0);
                     }

                     var64 += arg0.field1889[var39++];
                     var58.method1186(var64 & 127, 0);
                  } else if (var70 == 5) {
                     if (var73) {
                        var58.method1186(var59 + 160, 0);
                     }

                     var60 += arg0.field1889[var44++];
                     var65 += arg0.field1889[var38++];
                     var58.method1186(var60 & 127, 0);
                     var58.method1186(var65 & 127, 0);
                  } else {
                     if (var70 != 6) {
                        throw new RuntimeException();
                     }

                     if (var73) {
                        var58.method1186(var59 + 192, 0);
                     }

                     var58.method1186(arg0.field1889[var51++], 0);
                  }
               }
            }
         }
      }

   }
}
