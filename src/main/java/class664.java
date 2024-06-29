import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class664 {
   @OriginalMember(
      owner = "client!co",
      name = "r",
      descriptor = "I"
   )
   public int field9836;
   @OriginalMember(
      owner = "client!co",
      name = "q",
      descriptor = "Z"
   )
   public boolean field9838;
   @OriginalMember(
      owner = "client!co",
      name = "o",
      descriptor = "Z"
   )
   public boolean field9842;
   @OriginalMember(
      owner = "client!co",
      name = "n",
      descriptor = "[S"
   )
   public short[] field9849;
   @OriginalMember(
      owner = "client!co",
      name = "f",
      descriptor = "I"
   )
   private int field9835;
   @OriginalMember(
      owner = "client!co",
      name = "s",
      descriptor = "I"
   )
   public int field9846;
   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9852 = new String[]{method4857(method4856(":_$Q\u001e")), method4857(method4856(":_$+_7Y~)\u001e")), method4857(method4856("7Ef{")), method4857(method4856("\"\u001e$9K")), method4857(method4856(":_$T\u001e")), method4857(method4856(":_$S\u001e")), method4857(method4856(":_$V\u001e")), method4857(method4856("4Qi")), method4857(method4856(".Yd")), method4857(method4856("1Q|r_<\u0006")), method4857(method4856("1Q|rP0BoqY!")), method4857(method4856(":_$U\u001e")), method4857(method4856(":_$P\u001e")), method4857(method4856(":_$R\u001e"))};
   @OriginalMember(
      owner = "client!co",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field9848 = new int[5];
   @OriginalMember(
      owner = "client!co",
      name = "k",
      descriptor = "S"
   )
   public static short field9851 = 205;
   @OriginalMember(
      owner = "client!co",
      name = "t",
      descriptor = "I"
   )
   public static int field9831;
   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "I"
   )
   public static int field9832;
   @OriginalMember(
      owner = "client!co",
      name = "h",
      descriptor = "I"
   )
   public static int field9833;
   @OriginalMember(
      owner = "client!co",
      name = "e",
      descriptor = "I"
   )
   public static int field9834;
   @OriginalMember(
      owner = "client!co",
      name = "b",
      descriptor = "I"
   )
   public static int field9837;
   @OriginalMember(
      owner = "client!co",
      name = "m",
      descriptor = "I"
   )
   public static int field9840;
   @OriginalMember(
      owner = "client!co",
      name = "l",
      descriptor = "I"
   )
   private int field9841;
   @OriginalMember(
      owner = "client!co",
      name = "p",
      descriptor = "I"
   )
   public static int field9843;
   @OriginalMember(
      owner = "client!co",
      name = "u",
      descriptor = "I"
   )
   public static int field9844;
   @OriginalMember(
      owner = "client!co",
      name = "d",
      descriptor = "I"
   )
   private int field9845;
   @OriginalMember(
      owner = "client!co",
      name = "c",
      descriptor = "I"
   )
   private int field9847;
   @OriginalMember(
      owner = "client!co",
      name = "i",
      descriptor = "I"
   )
   private int field9850;
   @OriginalMember(
      owner = "client!co",
      name = "g",
      descriptor = "Lue;"
   )
   public class243 field9839;

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(Lgj;ILjava/lang/String;Ljava/lang/String;ZZ)V"
   )
   public static final void method4849(class736 arg0, int arg1, String arg2, String arg3, boolean arg4, boolean arg5) {
      try {
         if (arg1 <= 54) {
            field9834 = 96;
         }

         ++field9844;
         if (!arg5) {
            class505.method3818(3, arg0, (byte)97, arg2);
         } else {
            if (class736.field10758.startsWith(field9852[8]) && arg0.field10745) {
               String var6 = null;
               if (class152.field1893 != null) {
                  var6 = class152.field1893.getParameter(field9852[9]);
               }

               if (var6 == null || !var6.equals("1")) {
                  class769 var7 = class505.method3818(0, arg0, (byte)97, arg2);
                  class139.field1753 = var7;
                  class673.field9967 = arg2;
                  class667.field9879 = arg0;
                  return;
               }
            }

            if (class736.field10758.startsWith(field9852[7])) {
               String var8 = null;
               if (class152.field1893 != null) {
                  var8 = class152.field1893.getParameter(field9852[10]);
               }

               if (var8 != null && var8.equals("1") && arg4) {
                  class650.method4780(arg0, arg3, (byte)11, arg2, 1);
                  return;
               }
            }

            class505.method3818(2, arg0, (byte)97, arg2);
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field9852[6] + (arg0 != null ? field9852[3] : field9852[2]) + ',' + arg1 + ',' + (arg2 != null ? field9852[3] : field9852[2]) + ',' + (arg3 != null ? field9852[3] : field9852[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(Lww;Z)V"
   )
   public static final void method4850(class339 arg0, boolean arg1) {
      try {
         class234.field2924 = 0;
         class669.field9914 = 0;
         ++field9840;
         class363.field5037 = new class627();
         if (!arg1) {
            field9851 = -19;
         }

         class275.field3514 = new class788[1024];
         class598.field8836 = new class619[class392.field5433[class323.field4426] + 1];
         class699.field10229 = 0;
         class225.field2818 = 0;
         class174.method1490(arg0, 72);
         class580.method4341(arg0, 124);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9852[5] + (arg0 != null ? field9852[3] : field9852[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(IIIZI)V"
   )
   public final void method4851(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         this.field9847 = arg1;
         if (!arg3) {
            this.field9850 = 47;
         }

         this.field9850 = arg2;
         this.field9845 = arg0;
         ++field9832;
         this.field9841 = arg4;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field9852[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(ILha;IIIII)V"
   )
   private final void method4852(int arg0, class479 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field9839 = arg1.method491(arg0, arg3, arg2, arg5, arg4, (float)arg6);
         ++field9843;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field9852[13] + arg0 + ',' + (arg1 != null ? field9852[3] : field9852[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(IZI)V"
   )
   public final void method4853(int arg0, boolean arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field9837;
         if (arg2 != 2048) {
            method4850((class339)null, true);
         }

         int var5;
         label74: {
            if (arg1) {
               var5 = 2048;
               if (!var4) {
                  break label74;
               }
            }

            label75: {
               int var6;
               label62: {
                  label61: {
                     label60: {
                        label59: {
                           var6 = 2047 & this.field9835 - -(this.field9841 * arg0 / 50);
                           int var7 = this.field9845;
                           if (~var7 != -2) {
                              if (~var7 == -4) {
                                 break label59;
                              }

                              if (var7 == 4) {
                                 break label60;
                              }

                              if (var7 == 2) {
                                 break label61;
                              }

                              if (var7 != 5) {
                                 break label75;
                              }

                              if (!var4) {
                                 break label62;
                              }
                           }

                           var5 = (class746.field10907[var6 << 3] >> 4) + 1024;
                           if (!var4) {
                              break label74;
                           }
                        }

                        var5 = class48.field615[var6] >> 1;
                        if (!var4) {
                           break label74;
                        }
                     }

                     var5 = var6 >> 10 << 11;
                     if (!var4) {
                        break label74;
                     }
                  }

                  var5 = var6;
                  if (!var4) {
                     break label74;
                  }
               }

               var5 = (~var6 <= -1025 ? -var6 + 2048 : var6) << 1;
               if (!var4) {
                  break label74;
               }
            }

            var5 = 2048;
         }

         this.field9839.method1536(58, (float)((this.field9850 * var5 >> 11) + this.field9847) / 2048.0F);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field9852[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4854(int arg0) {
      try {
         field9848 = null;
         if (arg0 <= 27) {
            method4849((class736)null, 22, (String)null, (String)null, true, true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9852[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "<init>",
      descriptor = "()V"
   )
   protected class664() {
      try {
         if (class48.field615 == null) {
            class374.method2956(1585);
         }

         this.method4855((byte)-98);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9852[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method4855(byte arg0) {
      try {
         if (arg0 <= -33) {
            ++field9831;
            int var2 = this.field9846;
            if (var2 != 2) {
               if (~var2 == -4) {
                  this.field9845 = 1;
                  this.field9841 = 4096;
                  this.field9847 = 0;
                  this.field9850 = 2048;
                  return;
               }

               if (var2 == 4) {
                  this.field9841 = 2048;
                  this.field9845 = 4;
                  this.field9847 = 0;
                  this.field9850 = 2048;
                  return;
               }

               if (~var2 == -6) {
                  this.field9850 = 2048;
                  this.field9841 = 8192;
                  this.field9847 = 0;
                  this.field9845 = 4;
                  return;
               }

               if (var2 == 12) {
                  this.field9847 = 0;
                  this.field9841 = 2048;
                  this.field9850 = 2048;
                  this.field9845 = 2;
                  return;
               }

               if (var2 == 13) {
                  this.field9847 = 0;
                  this.field9850 = 2048;
                  this.field9841 = 8192;
                  this.field9845 = 2;
                  return;
               }

               if (var2 == 10) {
                  this.field9841 = 2048;
                  this.field9847 = 1536;
                  this.field9850 = 512;
                  this.field9845 = 3;
                  return;
               }

               if (var2 == 11) {
                  this.field9841 = 4096;
                  this.field9847 = 1536;
                  this.field9850 = 512;
                  this.field9845 = 3;
                  return;
               }

               if (~var2 == -7) {
                  this.field9841 = 2048;
                  this.field9850 = 768;
                  this.field9847 = 1280;
                  this.field9845 = 3;
                  return;
               }

               if (var2 == 7) {
                  this.field9841 = 4096;
                  this.field9847 = 1280;
                  this.field9845 = 3;
                  this.field9850 = 768;
                  return;
               }

               if (var2 == 8) {
                  this.field9847 = 1024;
                  this.field9850 = 1024;
                  this.field9841 = 2048;
                  this.field9845 = 3;
                  return;
               }

               if (~var2 == -10) {
                  this.field9845 = 3;
                  this.field9841 = 4096;
                  this.field9850 = 1024;
                  this.field9847 = 1024;
                  return;
               }

               if (~var2 == -15) {
                  this.field9841 = 2048;
                  this.field9845 = 1;
                  this.field9847 = 1280;
                  this.field9850 = 768;
                  return;
               }

               if (var2 == 15) {
                  this.field9845 = 1;
                  this.field9841 = 4096;
                  this.field9847 = 1536;
                  this.field9850 = 512;
                  return;
               }

               if (~var2 != -17) {
                  this.field9850 = 2048;
                  this.field9847 = 0;
                  this.field9845 = 0;
                  this.field9841 = 2048;
                  return;
               }

               if (!client.field1481) {
                  this.field9845 = 1;
                  this.field9847 = 1792;
                  this.field9850 = 256;
                  this.field9841 = 8192;
                  return;
               }
            }

            this.field9845 = 1;
            this.field9841 = 2048;
            this.field9850 = 2048;
            this.field9847 = 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9852[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "<init>",
      descriptor = "(Lha;Lgea;I)V"
   )
   public class664(class479 arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;
      super();

      try {
         if (class48.field615 == null) {
            class374.method2956(1585);
         }

         this.field9836 = arg1.method640(255);
         this.field9838 = ~(8 & this.field9836) != -1;
         this.field9842 = ~(this.field9836 & 16) != -1;
         this.field9836 &= 7;
         int var5 = arg1.method603(-2) << arg2;
         int var6 = arg1.method603(-2) << arg2;
         int var7 = arg1.method603(-2) << arg2;
         int var8 = arg1.method640(255);
         int var9 = var8 * 2 + 1;
         this.field9849 = new short[var9];
         int var10 = 0;
         int var12;
         int var13;
         if (var4) {
            short var11 = (short)arg1.method603(-2);
            var12 = var11 >>> 8;
            var13 = 255 & var11;
            if (var12 >= var9) {
               var12 = var9 - 1;
            }

            if (~(-var12 + var9) > ~var13) {
               var13 = -var12 + var9;
            }

            this.field9849[var10] = (short)class2.method15(var12 << 8, var13);
            ++var10;
         }

         while(true) {
            int var10000;
            if (~this.field9849.length >= ~var10) {
               var10000 = (var8 << class783.field11447) + class486.field6788;
               if (!var4) {
                  int var14 = var10000;
                  int var15 = class535.field7840 == null ? class193.field2445[class472.method3584(arg1.method603(-2), -10794) & 65535] : class535.field7840[arg1.method603(-2)];
                  int var16 = arg1.method640(255);
                  this.field9835 = (224 & var16) << 3;
                  this.field9846 = 31 & var16;
                  if (this.field9846 != 31) {
                     this.method4855((byte)-60);
                  }

                  this.method4852(var5, arg0, var6, var7, var15, var14, 1);
                  return;
               }
            } else {
               var10000 = (short)arg1.method603(-2);
            }

            int var19 = var10000;
            var12 = var19 >>> 8;
            var13 = 255 & var19;
            if (var12 >= var9) {
               var12 = var9 - 1;
            }

            if (~(-var12 + var9) > ~var13) {
               var13 = -var12 + var9;
            }

            this.field9849[var10] = (short)class2.method15(var12 << 8, var13);
            ++var10;
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field9852[1] + (arg0 != null ? field9852[3] : field9852[2]) + ',' + (arg1 != null ? field9852[3] : field9852[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4856(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4857(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
