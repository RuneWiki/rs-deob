import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class90 extends class347 {
   @OriginalMember(
      owner = "client!rf",
      name = "j",
      descriptor = "[B"
   )
   public byte[] field1084;
   @OriginalMember(
      owner = "client!rf",
      name = "i",
      descriptor = "Lwia;"
   )
   public class791 field1085;

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "()V"
   )
   public final void method821() {
      this.field1085 = null;
   }

   @OriginalMember(
      owner = "client!rf",
      name = "b",
      descriptor = "()V"
   )
   public final void method822() {
      if (this.field1085 == null) {
         this.field1085 = new class791(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var1[9] = var2[9] = 128;
         class673 var3 = new class673(this.field1084);
         int var4 = var3.method4912();

         for(int var5 = 0; var5 < var4; ++var5) {
            var3.method4902(var5);
            var3.method4901(var5);
            var3.method4904(var5);
         }

         label53:
         do {
            while(true) {
               int var6 = var3.method4908();
               int var7 = var3.field10122[var6];

               while(var3.field10122[var6] == var7) {
                  var3.method4902(var6);
                  int var8 = var3.method4913(var6);
                  if (var8 == 1) {
                     var3.method4900();
                     var3.method4904(var6);
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
                        class78 var19 = (class78)this.field1085.method5681((long)var18, -1);
                        if (var19 == null) {
                           var19 = new class78(new byte[128]);
                           this.field1085.method5682((long)var18, var19, (byte)7);
                        }

                        var19.field974[var16] = 1;
                     }
                  }

                  var3.method4901(var6);
                  var3.method4904(var6);
               }
            }
         } while(!var3.method4910());

      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(Leaa;II)Lrf;"
   )
   public static final class90 method823(class526 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method3899(-66, arg2, arg1);
      return var3 == null ? null : new class90(new class128(var3));
   }

   @OriginalMember(
      owner = "client!rf",
      name = "<init>",
      descriptor = "(Ljj;)V"
   )
   private class90(class128 arg0) {
      arg0.field1590 = arg0.field1552.length - 3;
      int var2 = arg0.method1104(255);
      int var3 = arg0.method1038((byte)-104);
      int var4 = var2 * 10 + 14;
      arg0.field1590 = 0;
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
            int var78 = arg0.method1104(255);
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
      int var17 = arg0.field1590;
      int var18 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(int var19 = 0; var19 < var18; ++var19) {
         arg0.method1065(false);
      }

      int var20 = arg0.field1590 - var17 + var16;
      int var21 = arg0.field1590;
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
         var34 = var34 + arg0.method1104(255) & 127;
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
      int var37 = arg0.field1590;
      arg0.field1590 += var32;
      int var38 = arg0.field1590;
      arg0.field1590 += var11;
      int var39 = arg0.field1590;
      arg0.field1590 += var10;
      int var40 = arg0.field1590;
      arg0.field1590 += var9;
      int var41 = arg0.field1590;
      arg0.field1590 += var22;
      int var42 = arg0.field1590;
      arg0.field1590 += var24;
      int var43 = arg0.field1590;
      arg0.field1590 += var26;
      int var44 = arg0.field1590;
      arg0.field1590 += var7 + var8 + var11;
      int var45 = arg0.field1590;
      arg0.field1590 += var7;
      int var46 = arg0.field1590;
      arg0.field1590 += var33;
      int var47 = arg0.field1590;
      arg0.field1590 += var8;
      int var48 = arg0.field1590;
      arg0.field1590 += var23;
      int var49 = arg0.field1590;
      arg0.field1590 += var25;
      int var50 = arg0.field1590;
      arg0.field1590 += var27;
      int var51 = arg0.field1590;
      arg0.field1590 += var12;
      int var52 = arg0.field1590;
      arg0.field1590 += var9;
      int var53 = arg0.field1590;
      arg0.field1590 += var28;
      int var54 = arg0.field1590;
      arg0.field1590 += var29;
      int var55 = arg0.field1590;
      arg0.field1590 += var30;
      int var56 = arg0.field1590;
      arg0.field1590 += var31;
      int var57 = arg0.field1590;
      arg0.field1590 += var5 * 3;
      this.field1084 = new byte[var20];
      class128 var58 = new class128(this.field1084);
      var58.method1094(-56, 1297377380);
      var58.method1094(-109, 6);
      var58.method1103(var2 > 1 ? 1 : 0, -16);
      var58.method1103(var2, -62);
      var58.method1103(var3, -81);
      arg0.field1590 = var17;
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
         var58.method1094(-38, 1297379947);
         var58.field1590 += 4;
         int var69 = var58.field1590;
         int var70 = -1;

         while(true) {
            while(true) {
               int var71 = arg0.method1065(false);
               var58.method1050(var71, false);
               int var72 = arg0.field1552[var36++] & 255;
               boolean var73 = var70 != var72;
               var70 = var72 & 15;
               if (var72 == 7) {
                  if (var73) {
                     var58.method1085(255, (byte)-11);
                  }

                  var58.method1085(47, (byte)-11);
                  var58.method1085(0, (byte)-11);
                  var58.method1095(var58.field1590 - var69, 255);
                  continue label223;
               }

               if (var72 == 23) {
                  if (var73) {
                     var58.method1085(255, (byte)-11);
                  }

                  var58.method1085(81, (byte)-11);
                  var58.method1085(3, (byte)-11);
                  var58.method1085(arg0.field1552[var57++], (byte)-11);
                  var58.method1085(arg0.field1552[var57++], (byte)-11);
                  var58.method1085(arg0.field1552[var57++], (byte)-11);
               } else {
                  var59 ^= var72 >> 4;
                  if (var70 == 0) {
                     if (var73) {
                        var58.method1085(var59 + 144, (byte)-11);
                     }

                     var60 += arg0.field1552[var44++];
                     var61 += arg0.field1552[var45++];
                     var58.method1085(var60 & 127, (byte)-11);
                     var58.method1085(var61 & 127, (byte)-11);
                  } else if (var70 == 1) {
                     if (var73) {
                        var58.method1085(var59 + 128, (byte)-11);
                     }

                     var60 += arg0.field1552[var44++];
                     var62 += arg0.field1552[var47++];
                     var58.method1085(var60 & 127, (byte)-11);
                     var58.method1085(var62 & 127, (byte)-11);
                  } else if (var70 == 2) {
                     if (var73) {
                        var58.method1085(var59 + 176, (byte)-11);
                     }

                     var67 = var67 + arg0.field1552[var21++] & 127;
                     var58.method1085(var67, (byte)-11);
                     byte var74;
                     if (var67 != 0 && var67 != 32) {
                        if (var67 == 1) {
                           var74 = arg0.field1552[var41++];
                        } else if (var67 == 33) {
                           var74 = arg0.field1552[var48++];
                        } else if (var67 == 7) {
                           var74 = arg0.field1552[var42++];
                        } else if (var67 == 39) {
                           var74 = arg0.field1552[var49++];
                        } else if (var67 == 10) {
                           var74 = arg0.field1552[var43++];
                        } else if (var67 == 42) {
                           var74 = arg0.field1552[var50++];
                        } else if (var67 == 99) {
                           var74 = arg0.field1552[var53++];
                        } else if (var67 == 98) {
                           var74 = arg0.field1552[var54++];
                        } else if (var67 == 101) {
                           var74 = arg0.field1552[var55++];
                        } else if (var67 == 100) {
                           var74 = arg0.field1552[var56++];
                        } else if (var67 != 64 && var67 != 65 && var67 != 120 && var67 != 121 && var67 != 123) {
                           var74 = arg0.field1552[var46++];
                        } else {
                           var74 = arg0.field1552[var37++];
                        }
                     } else {
                        var74 = arg0.field1552[var51++];
                     }

                     int var75 = var66[var67] + var74;
                     var66[var67] = var75;
                     var58.method1085(var75 & 127, (byte)-11);
                  } else if (var70 == 3) {
                     if (var73) {
                        var58.method1085(var59 + 224, (byte)-11);
                     }

                     int var76 = var63 + arg0.field1552[var52++];
                     var63 = var76 + (arg0.field1552[var40++] << 7);
                     var58.method1085(var63 & 127, (byte)-11);
                     var58.method1085(var63 >> 7 & 127, (byte)-11);
                  } else if (var70 == 4) {
                     if (var73) {
                        var58.method1085(var59 + 208, (byte)-11);
                     }

                     var64 += arg0.field1552[var39++];
                     var58.method1085(var64 & 127, (byte)-11);
                  } else if (var70 == 5) {
                     if (var73) {
                        var58.method1085(var59 + 160, (byte)-11);
                     }

                     var60 += arg0.field1552[var44++];
                     var65 += arg0.field1552[var38++];
                     var58.method1085(var60 & 127, (byte)-11);
                     var58.method1085(var65 & 127, (byte)-11);
                  } else {
                     if (var70 != 6) {
                        throw new RuntimeException();
                     }

                     if (var73) {
                        var58.method1085(var59 + 192, (byte)-11);
                     }

                     var58.method1085(arg0.field1552[var51++], (byte)-11);
                  }
               }
            }
         }
      }

   }
}
