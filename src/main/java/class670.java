import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class670 extends class347 {
   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "Lvda;"
   )
   private class192 field10091;
   @OriginalMember(
      owner = "client!lca",
      name = "y",
      descriptor = "Llja;"
   )
   private class744 field10082;
   @OriginalMember(
      owner = "client!lca",
      name = "s",
      descriptor = "Ldh;"
   )
   private class338 field10069;
   @OriginalMember(
      owner = "client!lca",
      name = "B",
      descriptor = "I"
   )
   private int field10083;
   @OriginalMember(
      owner = "client!lca",
      name = "D",
      descriptor = "I"
   )
   private int field10089;
   @OriginalMember(
      owner = "client!lca",
      name = "C",
      descriptor = "I"
   )
   private int field10068;
   @OriginalMember(
      owner = "client!lca",
      name = "r",
      descriptor = "I"
   )
   private int field10087;
   @OriginalMember(
      owner = "client!lca",
      name = "H",
      descriptor = "[[F"
   )
   private float[][] field10093;
   @OriginalMember(
      owner = "client!lca",
      name = "t",
      descriptor = "[[F"
   )
   private float[][] field10086;
   @OriginalMember(
      owner = "client!lca",
      name = "p",
      descriptor = "[[F"
   )
   private float[][] field10076;
   @OriginalMember(
      owner = "client!lca",
      name = "q",
      descriptor = "I"
   )
   private int field10078;
   @OriginalMember(
      owner = "client!lca",
      name = "l",
      descriptor = "Lwia;"
   )
   private class791 field10077;
   @OriginalMember(
      owner = "client!lca",
      name = "m",
      descriptor = "Lhi;"
   )
   private class215 field10085;
   @OriginalMember(
      owner = "client!lca",
      name = "G",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field10088;
   @OriginalMember(
      owner = "client!lca",
      name = "o",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field10084;
   @OriginalMember(
      owner = "client!lca",
      name = "n",
      descriptor = "Lgp;"
   )
   private class53 field10081;
   @OriginalMember(
      owner = "client!lca",
      name = "w",
      descriptor = "I"
   )
   private int field10073;
   @OriginalMember(
      owner = "client!lca",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10094 = new String[]{method4879(method4878("T\"1\u0005o\u0010")), method4879(method4878("Co~\u0005Z")), method4879(method4878("T\"1\u0005\u001bQ/9_\u0019\u0010")), method4879(method4878("V4<G")), method4879(method4878("T\"1\u0005f\u0010")), method4879(method4878("T\"1\u0005d\u0010")), method4879(method4878("T\"1\u0005c\u0010")), method4879(method4878("T\"1\u0005a\u0010")), method4879(method4878("T\"1\u0005e\u0010")), method4879(method4878("T\"1\u0005b\u0010"))};
   @OriginalMember(
      owner = "client!lca",
      name = "j",
      descriptor = "Lhn;"
   )
   public static class751 field10071 = new class751(1, 7);
   @OriginalMember(
      owner = "client!lca",
      name = "k",
      descriptor = "I"
   )
   public static int field10070;
   @OriginalMember(
      owner = "client!lca",
      name = "i",
      descriptor = "I"
   )
   public static int field10072;
   @OriginalMember(
      owner = "client!lca",
      name = "u",
      descriptor = "I"
   )
   public static int field10074;
   @OriginalMember(
      owner = "client!lca",
      name = "v",
      descriptor = "I"
   )
   public static int field10075;
   @OriginalMember(
      owner = "client!lca",
      name = "x",
      descriptor = "I"
   )
   public static int field10079;
   @OriginalMember(
      owner = "client!lca",
      name = "F",
      descriptor = "I"
   )
   public static int field10080;
   @OriginalMember(
      owner = "client!lca",
      name = "A",
      descriptor = "I"
   )
   public static int field10090;
   @OriginalMember(
      owner = "client!lca",
      name = "E",
      descriptor = "I"
   )
   public static int field10092;

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method4870(int arg0, int arg1) {
      try {
         int var2 = -12 / ((arg0 - -15) / 42);
         ++field10070;
         return ~arg1 == -4 || arg1 == 4;
      } catch (RuntimeException var4) {
         throw method4877(var4, field10094[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4871(int arg0) {
      try {
         if (arg0 == 1) {
            field10071 = null;
         }
      } catch (RuntimeException var2) {
         throw method4877(var2, field10094[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(IS)V"
   )
   private final void method4872(int arg0, short arg1) {
      try {
         ++field10074;
         if (arg0 != 4) {
            method4877((Throwable)null, (String)null);
         }

         if (Stream.method5098()) {
            this.field10084.method5087(arg1);
         } else {
            this.field10084.method5088(arg1);
         }
      } catch (RuntimeException var4) {
         throw method4877(var4, field10094[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(IIIIBII)V"
   )
   private final void method4873(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      int var8 = client.field4530;

      try {
         ++field10072;
         long var9 = -1L;
         if (arg4 == -18) {
            int var11 = (arg2 << this.field10091.field4086) + arg5;
            int var12 = arg1 - -(arg6 << this.field10091.field4086);
            int var13 = this.field10091.method2236((byte)98, var11, var12);
            if (~(127 & arg5) == -1 || ~(127 & arg1) == -1) {
               var9 = 65535L << 16 & (long)var12 << 16 | 65535L & (long)var11;
               class347 var14 = this.field10077.method5681(var9, arg4 + 17);
               if (var14 != null) {
                  this.method4872(4, ((class169)var14).field2100);
                  return;
               }
            }

            short var15 = (short)(this.field10073++);
            if (~var9 != 0L) {
               this.field10077.method5682(var9, new class169(var15), (byte)7);
            }

            float var16;
            float var17;
            float var18;
            label124: {
               if (~arg5 != -1 || arg1 != 0) {
                  if (this.field10091.field4080 != arg5 || ~arg1 != -1) {
                     if (this.field10091.field4080 != arg5 || this.field10091.field4080 != arg1) {
                        if (~arg5 == -1 && ~this.field10091.field4080 == ~arg1) {
                           var16 = this.field10093[arg3][arg0 + 1];
                           var17 = this.field10086[arg3][arg0 + 1];
                           var18 = this.field10076[arg3][arg0 + 1];
                           if (var8 == 0) {
                              break label124;
                           }
                        }

                        float var19 = (float)arg5 / (float)this.field10091.field4080;
                        float var20 = (float)arg1 / (float)this.field10091.field4080;
                        float var21 = this.field10076[arg3][arg0];
                        float var22 = this.field10093[arg3][arg0];
                        float var23 = this.field10086[arg3][arg0];
                        float var24 = this.field10076[arg3 + 1][arg0];
                        float var25 = this.field10093[arg3 + 1][arg0];
                        float var26 = (this.field10086[arg3][arg0 - -1] + -var23) * var19 + var23;
                        float var27 = (this.field10076[arg3 + 1][arg0 + 1] + -var24) * var19 + var24;
                        float var28 = (this.field10093[arg3 + 1][arg0 + 1] + -var25) * var19 + var25;
                        float var29 = this.field10086[arg3 + 1][arg0];
                        float var30 = (this.field10093[arg3][arg0 - -1] + -var22) * var19 + var22;
                        float var31 = (this.field10076[arg3][arg0 - -1] - var21) * var19 + var21;
                        var16 = (-var30 + var28) * var20 + var30;
                        var18 = (-var31 + var27) * var20 + var31;
                        float var32 = (this.field10086[arg3 - -1][arg0 + 1] + -var29) * var19 + var29;
                        var17 = (-var26 + var32) * var20 + var26;
                        if (var8 == 0) {
                           break label124;
                        }
                     }

                     var18 = this.field10076[arg3 + 1][arg0 + 1];
                     var16 = this.field10093[arg3 + 1][arg0 - -1];
                     var17 = this.field10086[arg3 + 1][arg0 + 1];
                     if (var8 == 0) {
                        break label124;
                     }
                  }

                  var17 = this.field10086[arg3 + 1][arg0];
                  var18 = this.field10076[arg3 + 1][arg0];
                  var16 = this.field10093[arg3 + 1][arg0];
                  if (var8 == 0) {
                     break label124;
                  }
               }

               var17 = this.field10086[arg3][arg0];
               var18 = this.field10076[arg3][arg0];
               var16 = this.field10093[arg3][arg0];
            }

            float var33 = (float)(-var11 + this.field10082.method5420(true));
            float var34 = (float)(this.field10082.method5423(3378) + -var13);
            float var35 = (float)(this.field10082.method5425((byte)-81) - var12);
            float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
            float var37 = 1.0F / var36;
            float var38 = var33 * var37;
            float var39 = var35 * var37;
            float var40 = var34 * var37;
            float var41 = var36 / (float)this.field10082.method5424(34065);
            float var42 = -(var41 * var41) + 1.0F;
            if (var42 < 0.0F) {
               var42 = 0.0F;
            }

            float var43 = var17 * var39 + var16 * var40 + var18 * var38;
            if (var43 < 0.0F) {
               var43 = 0.0F;
            }

            float var44 = var42 * var43 * 2.0F;
            if (var44 > 1.0F) {
               var44 = 1.0F;
            }

            int var45 = this.field10082.method5421(-108);
            int var46 = (int)((float)(255 & var45 >> 16) * var44);
            if (var46 > 255) {
               var46 = 255;
            }

            int var47 = (int)((float)(255 & var45 >> 8) * var44);
            if (var47 > 255) {
               var47 = 255;
            }

            int var48;
            label75: {
               var48 = (int)((float)(var45 & 255) * var44);
               if (Stream.method5098()) {
                  this.field10088.method5084((float)var11);
                  this.field10088.method5084((float)var13);
                  this.field10088.method5084((float)var12);
                  if (var8 == 0) {
                     break label75;
                  }
               }

               this.field10088.method5089((float)var11);
               this.field10088.method5089((float)var13);
               this.field10088.method5089((float)var12);
            }

            if (var48 > 255) {
               var48 = 255;
            }

            label69: {
               if (~this.field10069.field5034 != -1) {
                  this.field10088.method5095(var46);
                  this.field10088.method5095(var47);
                  this.field10088.method5095(var48);
                  if (var8 == 0) {
                     break label69;
                  }
               }

               this.field10088.method5095(var48);
               this.field10088.method5095(var47);
               this.field10088.method5095(var46);
            }

            this.field10088.method5095(255);
            this.method4872(arg4 + 22, var15);
         }
      } catch (RuntimeException var50) {
         throw method4877(var50, field10094[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method4874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         if (arg1 == 1) {
            ++field10080;
            class437.field6663[class486.field7191++] = new class246(arg0, arg6, arg7, arg4, arg4, arg7, arg2, arg8, arg8, arg2, arg5, arg5, arg3, arg3);
         }
      } catch (RuntimeException var10) {
         throw method4877(var10, field10094[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(Ljava/lang/String;IBLjava/lang/String;)V"
   )
   public static final void method4875(String arg0, int arg1, byte arg2, String arg3) {
      try {
         class149.field1859 = arg1;
         class448.field6805 = 2;
         if (arg2 <= 107) {
            method4875((String)null, 18, (byte)59, (String)null);
         }

         ++field10079;
         class18.method127(false, arg0, false, 0, arg3);
      } catch (RuntimeException var5) {
         throw method4877(var5, field10094[7] + (arg0 != null ? field10094[1] : field10094[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10094[1] : field10094[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(III[[ZI)V"
   )
   public final void method4876(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
      int var6 = client.field4530;

      try {
         ++field10092;
         if (this.field10085 != null) {
            if (arg2 - -arg4 >= this.field10083) {
               int var7 = -26 / ((-46 - arg0) / 53);
               if (-arg4 + arg2 <= this.field10089) {
                  if (~this.field10068 >= ~(arg1 + arg4)) {
                     if (~(-arg4 + arg1) >= ~this.field10087) {
                        int var8 = this.field10068;
                        if (var6 != 0 || var8 <= this.field10087) {
                           do {
                              int var9 = this.field10083;
                              if (var6 != 0 || ~this.field10089 <= ~var9) {
                                 do {
                                    int var10 = var9 - arg2;
                                    int var11 = -arg1 + var8;
                                    if (~(-arg4) > ~var10 && ~var10 > ~arg4 && ~var11 < ~(-arg4) && arg4 > var11 && arg3[arg4 + var10][arg4 + var11]) {
                                       this.field10069.method2566(-1463654256, (byte)((int)(this.field10082.method5422((byte)84) * 255.0F)));
                                       this.field10069.method2659(116, this.field10081, 0);
                                       this.field10069.method2642(this.field10069.field5111, (byte)118);
                                       this.field10069.method2628(this.field10073, 0, 0, 16, class260.field3546, this.field10078 / 3, this.field10085);
                                       return;
                                    }

                                    ++var9;
                                 } while(~this.field10089 <= ~var9);
                              }

                              ++var8;
                           } while(var8 <= this.field10087);

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw method4877(var13, field10094[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10094[1] : field10094[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ljda;"
   )
   public static final class236 method4877(Throwable arg0, String arg1) {
      ++field10090;
      class236 var2;
      if (!(arg0 instanceof class236)) {
         var2 = new class236(arg0, arg1);
      } else {
         var2 = (class236)arg0;
         var2.field2994 = var2.field2994 + ' ' + arg1;
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!lca",
      name = "<init>",
      descriptor = "(Ldh;Lvda;Llja;[I)V"
   )
   public class670(class338 param1, class192 param2, class744 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4878(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4879(char[] arg0) {
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
            var10005 = 65;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
