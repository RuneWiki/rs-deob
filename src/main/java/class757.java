import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class757 {
   @OriginalMember(
      owner = "client!sha",
      name = "l",
      descriptor = "[I"
   )
   private int[] field10991 = new int[5];
   @OriginalMember(
      owner = "client!sha",
      name = "o",
      descriptor = "I"
   )
   public int field10989 = 500;
   @OriginalMember(
      owner = "client!sha",
      name = "i",
      descriptor = "I"
   )
   public int field10990 = 0;
   @OriginalMember(
      owner = "client!sha",
      name = "f",
      descriptor = "I"
   )
   private int field10992 = 100;
   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "[I"
   )
   private int[] field10996 = new int[5];
   @OriginalMember(
      owner = "client!sha",
      name = "r",
      descriptor = "I"
   )
   private int field10997 = 0;
   @OriginalMember(
      owner = "client!sha",
      name = "c",
      descriptor = "[I"
   )
   private int[] field10995 = new int[5];
   @OriginalMember(
      owner = "client!sha",
      name = "t",
      descriptor = "[I"
   )
   private static int[] field10986 = new int[32768];
   @OriginalMember(
      owner = "client!sha",
      name = "s",
      descriptor = "[I"
   )
   private static int[] field10988;
   @OriginalMember(
      owner = "client!sha",
      name = "g",
      descriptor = "[I"
   )
   private static int[] field10985;
   @OriginalMember(
      owner = "client!sha",
      name = "n",
      descriptor = "[I"
   )
   private static int[] field11000;
   @OriginalMember(
      owner = "client!sha",
      name = "h",
      descriptor = "[I"
   )
   private static int[] field11002;
   @OriginalMember(
      owner = "client!sha",
      name = "w",
      descriptor = "[I"
   )
   private static int[] field11001;
   @OriginalMember(
      owner = "client!sha",
      name = "k",
      descriptor = "[I"
   )
   private static int[] field11003;
   @OriginalMember(
      owner = "client!sha",
      name = "d",
      descriptor = "[I"
   )
   private static int[] field11004;
   @OriginalMember(
      owner = "client!sha",
      name = "j",
      descriptor = "Lwea;"
   )
   private class165 field10980;
   @OriginalMember(
      owner = "client!sha",
      name = "q",
      descriptor = "Lwea;"
   )
   private class165 field10981;
   @OriginalMember(
      owner = "client!sha",
      name = "e",
      descriptor = "Lwea;"
   )
   private class165 field10982;
   @OriginalMember(
      owner = "client!sha",
      name = "u",
      descriptor = "Lwea;"
   )
   private class165 field10984;
   @OriginalMember(
      owner = "client!sha",
      name = "y",
      descriptor = "Lwea;"
   )
   private class165 field10987;
   @OriginalMember(
      owner = "client!sha",
      name = "v",
      descriptor = "Lwea;"
   )
   private class165 field10993;
   @OriginalMember(
      owner = "client!sha",
      name = "p",
      descriptor = "Lwea;"
   )
   private class165 field10994;
   @OriginalMember(
      owner = "client!sha",
      name = "m",
      descriptor = "Lwea;"
   )
   private class165 field10998;
   @OriginalMember(
      owner = "client!sha",
      name = "b",
      descriptor = "Lwea;"
   )
   private class165 field10999;
   @OriginalMember(
      owner = "client!sha",
      name = "x",
      descriptor = "Ljca;"
   )
   private class711 field10983;

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(III)I"
   )
   private final int method5479(int arg0, int arg1, int arg2) {
      if (arg2 == 1) {
         return (arg0 & 32767) < 16384 ? arg1 : -arg1;
      } else if (arg2 == 2) {
         return field10988[arg0 & 32767] * arg1 >> 14;
      } else if (arg2 == 3) {
         return ((arg0 & 32767) * arg1 >> 14) - arg1;
      } else {
         return arg2 == 4 ? field10986[arg0 / 2607 & 32767] * arg1 : 0;
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method5480(int arg0, int arg1) {
      class365.method2858(field10985, 0, arg0);
      if (arg1 < 10) {
         return field10985;
      } else {
         double var3 = (double)arg0 / ((double)arg1 + 0.0D);
         this.field10993.method1501();
         this.field10984.method1501();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field10994 != null) {
            this.field10994.method1501();
            this.field10987.method1501();
            var5 = (int)((double)(this.field10994.field2605 - this.field10994.field2608) * 32.768D / var3);
            var6 = (int)((double)this.field10994.field2608 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field10981 != null) {
            this.field10981.method1501();
            this.field10998.method1501();
            var8 = (int)((double)(this.field10981.field2605 - this.field10981.field2608) * 32.768D / var3);
            var9 = (int)((double)this.field10981.field2608 * 32.768D / var3);
         }

         for(int var11 = 0; var11 < 5; ++var11) {
            if (this.field10995[var11] != 0) {
               field11001[var11] = 0;
               field11003[var11] = (int)((double)this.field10991[var11] * var3);
               field11000[var11] = (this.field10995[var11] << 14) / 100;
               field11004[var11] = (int)((double)(this.field10993.field2605 - this.field10993.field2608) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field10996[var11]) / var3);
               field11002[var11] = (int)((double)this.field10993.field2608 * 32.768D / var3);
            }
         }

         for(int var12 = 0; var12 < arg0; ++var12) {
            int var39 = this.field10993.method1502(arg0);
            int var40 = this.field10984.method1502(arg0);
            if (this.field10994 != null) {
               int var41 = this.field10994.method1502(arg0);
               int var42 = this.field10987.method1502(arg0);
               var39 += this.method5479(var7, var42, this.field10994.field2606) >> 1;
               var7 += (var5 * var41 >> 16) + var6;
            }

            if (this.field10981 != null) {
               int var43 = this.field10981.method1502(arg0);
               int var44 = this.field10998.method1502(arg0);
               var40 = var40 * ((this.method5479(var10, var44, this.field10981.field2606) >> 1) + 32768) >> 15;
               var10 += (var8 * var43 >> 16) + var9;
            }

            for(int var45 = 0; var45 < 5; ++var45) {
               if (this.field10995[var45] != 0) {
                  int var46 = field11003[var45] + var12;
                  if (var46 < arg0) {
                     field10985[var46] += this.method5479(field11001[var45], field11000[var45] * var40 >> 15, this.field10993.field2606);
                     field11001[var45] += (field11004[var45] * var39 >> 16) + field11002[var45];
                  }
               }
            }
         }

         if (this.field10980 != null) {
            this.field10980.method1501();
            this.field10982.method1501();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;

            for(int var16 = 0; var16 < arg0; ++var16) {
               int var17 = this.field10980.method1502(arg0);
               int var18 = this.field10982.method1502(arg0);
               int var19;
               if (var15) {
                  var19 = ((this.field10980.field2605 - this.field10980.field2608) * var17 >> 8) + this.field10980.field2608;
               } else {
                  var19 = ((this.field10980.field2605 - this.field10980.field2608) * var18 >> 8) + this.field10980.field2608;
               }

               var13 += 256;
               if (var13 >= var19) {
                  var13 = 0;
                  var15 = !var15;
               }

               if (var15) {
                  field10985[var16] = 0;
               }
            }
         }

         if (this.field10997 > 0 && this.field10992 > 0) {
            int var20 = (int)((double)this.field10997 * var3);

            for(int var21 = var20; var21 < arg0; ++var21) {
               field10985[var21] += field10985[var21 - var20] * this.field10992 / 100;
            }
         }

         if (this.field10983.field10327[0] > 0 || this.field10983.field10327[1] > 0) {
            this.field10999.method1501();
            int var22 = this.field10999.method1502(arg0 + 1);
            int var23 = this.field10983.method5171(0, (float)var22 / 65536.0F);
            int var24 = this.field10983.method5171(1, (float)var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
               int var25 = 0;
               int var26 = var24;
               if (var24 > arg0 - var23) {
                  var26 = arg0 - var23;
               }

               while(var25 < var26) {
                  int var35 = (int)((long)field10985[var23 + var25] * (long)class711.field10330 >> 16);

                  for(int var36 = 0; var36 < var23; ++var36) {
                     var35 += (int)((long)field10985[var23 + var25 - 1 - var36] * (long)class711.field10328[0][var36] >> 16);
                  }

                  for(int var37 = 0; var37 < var25; ++var37) {
                     var35 -= (int)((long)field10985[var25 - 1 - var37] * (long)class711.field10328[1][var37] >> 16);
                  }

                  field10985[var25] = var35;
                  var22 = this.field10999.method1502(arg0 + 1);
                  ++var25;
               }

               int var27 = 128;

               while(true) {
                  if (var27 > arg0 - var23) {
                     var27 = arg0 - var23;
                  }

                  while(var25 < var27) {
                     int var32 = (int)((long)field10985[var23 + var25] * (long)class711.field10330 >> 16);

                     for(int var33 = 0; var33 < var23; ++var33) {
                        var32 += (int)((long)field10985[var23 + var25 - 1 - var33] * (long)class711.field10328[0][var33] >> 16);
                     }

                     for(int var34 = 0; var34 < var24; ++var34) {
                        var32 -= (int)((long)field10985[var25 - 1 - var34] * (long)class711.field10328[1][var34] >> 16);
                     }

                     field10985[var25] = var32;
                     var22 = this.field10999.method1502(arg0 + 1);
                     ++var25;
                  }

                  if (var25 >= arg0 - var23) {
                     while(var25 < arg0) {
                        int var28 = 0;

                        for(int var29 = var23 + var25 - arg0; var29 < var23; ++var29) {
                           var28 += (int)((long)field10985[var23 + var25 - 1 - var29] * (long)class711.field10328[0][var29] >> 16);
                        }

                        for(int var30 = 0; var30 < var24; ++var30) {
                           var28 -= (int)((long)field10985[var25 - 1 - var30] * (long)class711.field10328[1][var30] >> 16);
                        }

                        field10985[var25] = var28;
                        this.field10999.method1502(arg0 + 1);
                        ++var25;
                     }
                     break;
                  }

                  var23 = this.field10983.method5171(0, (float)var22 / 65536.0F);
                  var24 = this.field10983.method5171(1, (float)var22 / 65536.0F);
                  var27 += 128;
               }
            }
         }

         for(int var38 = 0; var38 < arg0; ++var38) {
            if (field10985[var38] < -32768) {
               field10985[var38] = -32768;
            }

            if (field10985[var38] > 32767) {
               field10985[var38] = 32767;
            }
         }

         return field10985;
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "()V"
   )
   public static void method5481() {
      field10985 = null;
      field10986 = null;
      field10988 = null;
      field11001 = null;
      field11003 = null;
      field11000 = null;
      field11004 = null;
      field11002 = null;
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(Luda;)V"
   )
   public final void method5482(class473 arg0) {
      this.field10993 = new class165();
      this.field10993.method1503(arg0);
      this.field10984 = new class165();
      this.field10984.method1503(arg0);
      int var2 = arg0.method3564((byte)-115);
      if (var2 != 0) {
         --arg0.field6907;
         this.field10994 = new class165();
         this.field10994.method1503(arg0);
         this.field10987 = new class165();
         this.field10987.method1503(arg0);
      }

      int var3 = arg0.method3564((byte)-53);
      if (var3 != 0) {
         --arg0.field6907;
         this.field10981 = new class165();
         this.field10981.method1503(arg0);
         this.field10998 = new class165();
         this.field10998.method1503(arg0);
      }

      int var4 = arg0.method3564((byte)-50);
      if (var4 != 0) {
         --arg0.field6907;
         this.field10980 = new class165();
         this.field10980.method1503(arg0);
         this.field10982 = new class165();
         this.field10982.method1503(arg0);
      }

      for(int var5 = 0; var5 < 10; ++var5) {
         int var6 = arg0.method3586(125);
         if (var6 == 0) {
            break;
         }

         this.field10995[var5] = var6;
         this.field10996[var5] = arg0.method3531(-12504);
         this.field10991[var5] = arg0.method3586(121);
      }

      this.field10997 = arg0.method3586(112);
      this.field10992 = arg0.method3586(116);
      this.field10989 = arg0.method3565(true);
      this.field10990 = arg0.method3565(true);
      this.field10983 = new class711();
      this.field10999 = new class165();
      this.field10983.method5174(arg0, this.field10999);
   }

   static {
      Random var0 = new Random(0L);

      for(int var1 = 0; var1 < 32768; ++var1) {
         field10986[var1] = (var0.nextInt() & 2) - 1;
      }

      field10988 = new int[32768];

      for(int var2 = 0; var2 < 32768; ++var2) {
         field10988[var2] = (int)(Math.sin((double)var2 / 5215.1903D) * 16384.0D);
      }

      field10985 = new int[220500];
      field11000 = new int[5];
      field11002 = new int[5];
      field11001 = new int[5];
      field11003 = new int[5];
      field11004 = new int[5];
   }
}
