import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class551 extends class247 {
   @OriginalMember(
      owner = "client!eda",
      name = "k",
      descriptor = "[B"
   )
   public byte[] field7869;
   @OriginalMember(
      owner = "client!eda",
      name = "j",
      descriptor = "Lbga;"
   )
   public class398 field7870;

   @OriginalMember(
      owner = "client!eda",
      name = "b",
      descriptor = "()V"
   )
   public final void method4130() {
      if (this.field7870 == null) {
         this.field7870 = new class398(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var1[9] = var2[9] = 128;
         class35 var3 = new class35(this.field7869);
         int var4 = var3.method398();

         for(int var5 = 0; var5 < var4; ++var5) {
            var3.method407(var5);
            var3.method400(var5);
            var3.method402(var5);
         }

         label53:
         do {
            while(true) {
               int var6 = var3.method405();
               int var7 = var3.field520[var6];

               while(var3.field520[var6] == var7) {
                  var3.method407(var6);
                  int var8 = var3.method404(var6);
                  if (var8 == 1) {
                     var3.method403();
                     var3.method402(var6);
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
                        class793 var19 = (class793)this.field7870.method3101(-1, (long)var18);
                        if (var19 == null) {
                           var19 = new class793(new byte[128]);
                           this.field7870.method3098((long)var18, var19, -1);
                        }

                        var19.field11536[var16] = 1;
                     }
                  }

                  var3.method400(var6);
                  var3.method402(var6);
               }
            }
         } while(!var3.method397());

      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "<init>",
      descriptor = "(Lcu;)V"
   )
   private class551(class65 arg0) {
      arg0.field945 = arg0.field942.length - 3;
      int var2 = arg0.method665(false);
      int var3 = arg0.method685(-2);
      int var4 = var2 * 10 + 14;
      arg0.field945 = 0;
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
            int var78 = arg0.method665(false);
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
      int var17 = arg0.field945;
      int var18 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(int var19 = 0; var19 < var18; ++var19) {
         arg0.method669((byte)-123);
      }

      int var20 = arg0.field945 - var17 + var16;
      int var21 = arg0.field945;
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
         var34 = var34 + arg0.method665(false) & 127;
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
      int var37 = arg0.field945;
      arg0.field945 += var32;
      int var38 = arg0.field945;
      arg0.field945 += var11;
      int var39 = arg0.field945;
      arg0.field945 += var10;
      int var40 = arg0.field945;
      arg0.field945 += var9;
      int var41 = arg0.field945;
      arg0.field945 += var22;
      int var42 = arg0.field945;
      arg0.field945 += var24;
      int var43 = arg0.field945;
      arg0.field945 += var26;
      int var44 = arg0.field945;
      arg0.field945 += var7 + var8 + var11;
      int var45 = arg0.field945;
      arg0.field945 += var7;
      int var46 = arg0.field945;
      arg0.field945 += var33;
      int var47 = arg0.field945;
      arg0.field945 += var8;
      int var48 = arg0.field945;
      arg0.field945 += var23;
      int var49 = arg0.field945;
      arg0.field945 += var25;
      int var50 = arg0.field945;
      arg0.field945 += var27;
      int var51 = arg0.field945;
      arg0.field945 += var12;
      int var52 = arg0.field945;
      arg0.field945 += var9;
      int var53 = arg0.field945;
      arg0.field945 += var28;
      int var54 = arg0.field945;
      arg0.field945 += var29;
      int var55 = arg0.field945;
      arg0.field945 += var30;
      int var56 = arg0.field945;
      arg0.field945 += var31;
      int var57 = arg0.field945;
      arg0.field945 += var5 * 3;
      this.field7869 = new byte[var20];
      class65 var58 = new class65(this.field7869);
      var58.method674(-124, 1297377380);
      var58.method674(-26, 6);
      var58.method653(var2 > 1 ? 1 : 0, -121);
      var58.method653(var2, -94);
      var58.method653(var3, -88);
      arg0.field945 = var17;
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
         var58.method674(-44, 1297379947);
         var58.field945 += 4;
         int var69 = var58.field945;
         int var70 = -1;

         while(true) {
            while(true) {
               int var71 = arg0.method669((byte)-117);
               var58.method677(var71, 13323);
               int var72 = arg0.field942[var36++] & 255;
               boolean var73 = var70 != var72;
               var70 = var72 & 15;
               if (var72 == 7) {
                  if (var73) {
                     var58.method656((byte)-120, 255);
                  }

                  var58.method656((byte)102, 47);
                  var58.method656((byte)46, 0);
                  var58.method679(var58.field945 - var69, (byte)-36);
                  continue label223;
               }

               if (var72 == 23) {
                  if (var73) {
                     var58.method656((byte)-120, 255);
                  }

                  var58.method656((byte)-114, 81);
                  var58.method656((byte)73, 3);
                  var58.method656((byte)-97, arg0.field942[var57++]);
                  var58.method656((byte)-90, arg0.field942[var57++]);
                  var58.method656((byte)57, arg0.field942[var57++]);
               } else {
                  var59 ^= var72 >> 4;
                  if (var70 == 0) {
                     if (var73) {
                        var58.method656((byte)58, var59 + 144);
                     }

                     var60 += arg0.field942[var44++];
                     var61 += arg0.field942[var45++];
                     var58.method656((byte)63, var60 & 127);
                     var58.method656((byte)-99, var61 & 127);
                  } else if (var70 == 1) {
                     if (var73) {
                        var58.method656((byte)-103, var59 + 128);
                     }

                     var60 += arg0.field942[var44++];
                     var62 += arg0.field942[var47++];
                     var58.method656((byte)117, var60 & 127);
                     var58.method656((byte)43, var62 & 127);
                  } else if (var70 == 2) {
                     if (var73) {
                        var58.method656((byte)-99, var59 + 176);
                     }

                     var67 = var67 + arg0.field942[var21++] & 127;
                     var58.method656((byte)56, var67);
                     byte var74;
                     if (var67 != 0 && var67 != 32) {
                        if (var67 == 1) {
                           var74 = arg0.field942[var41++];
                        } else if (var67 == 33) {
                           var74 = arg0.field942[var48++];
                        } else if (var67 == 7) {
                           var74 = arg0.field942[var42++];
                        } else if (var67 == 39) {
                           var74 = arg0.field942[var49++];
                        } else if (var67 == 10) {
                           var74 = arg0.field942[var43++];
                        } else if (var67 == 42) {
                           var74 = arg0.field942[var50++];
                        } else if (var67 == 99) {
                           var74 = arg0.field942[var53++];
                        } else if (var67 == 98) {
                           var74 = arg0.field942[var54++];
                        } else if (var67 == 101) {
                           var74 = arg0.field942[var55++];
                        } else if (var67 == 100) {
                           var74 = arg0.field942[var56++];
                        } else if (var67 != 64 && var67 != 65 && var67 != 120 && var67 != 121 && var67 != 123) {
                           var74 = arg0.field942[var46++];
                        } else {
                           var74 = arg0.field942[var37++];
                        }
                     } else {
                        var74 = arg0.field942[var51++];
                     }

                     int var75 = var66[var67] + var74;
                     var66[var67] = var75;
                     var58.method656((byte)-98, var75 & 127);
                  } else if (var70 == 3) {
                     if (var73) {
                        var58.method656((byte)-114, var59 + 224);
                     }

                     int var76 = var63 + arg0.field942[var52++];
                     var63 = var76 + (arg0.field942[var40++] << 7);
                     var58.method656((byte)77, var63 & 127);
                     var58.method656((byte)-110, var63 >> 7 & 127);
                  } else if (var70 == 4) {
                     if (var73) {
                        var58.method656((byte)105, var59 + 208);
                     }

                     var64 += arg0.field942[var39++];
                     var58.method656((byte)-97, var64 & 127);
                  } else if (var70 == 5) {
                     if (var73) {
                        var58.method656((byte)-114, var59 + 160);
                     }

                     var60 += arg0.field942[var44++];
                     var65 += arg0.field942[var38++];
                     var58.method656((byte)-102, var60 & 127);
                     var58.method656((byte)112, var65 & 127);
                  } else {
                     if (var70 != 6) {
                        throw new RuntimeException();
                     }

                     if (var73) {
                        var58.method656((byte)102, var59 + 192);
                     }

                     var58.method656((byte)-119, arg0.field942[var51++]);
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "()V"
   )
   public final void method4131() {
      this.field7870 = null;
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(Lsa;II)Leda;"
   )
   public static final class551 method4132(class39 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method460((byte)-11, arg2, arg1);
      return var3 == null ? null : new class551(new class65(var3));
   }
}
