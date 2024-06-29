import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class523 extends class391 {
   @OriginalMember(
      owner = "client!to",
      name = "H",
      descriptor = "I"
   )
   private int field7976 = 0;
   @OriginalMember(
      owner = "client!to",
      name = "u",
      descriptor = "Z"
   )
   public boolean field7974 = false;
   @OriginalMember(
      owner = "client!to",
      name = "q",
      descriptor = "Lqs;"
   )
   public class100 field7970 = new class100();
   @OriginalMember(
      owner = "client!to",
      name = "D",
      descriptor = "Lqs;"
   )
   private class100 field7979 = new class100();
   @OriginalMember(
      owner = "client!to",
      name = "t",
      descriptor = "Z"
   )
   private boolean field7985 = false;
   @OriginalMember(
      owner = "client!to",
      name = "k",
      descriptor = "Laaa;"
   )
   public class743 field7973;
   @OriginalMember(
      owner = "client!to",
      name = "p",
      descriptor = "J"
   )
   private long field7965;
   @OriginalMember(
      owner = "client!to",
      name = "y",
      descriptor = "Lgl;"
   )
   public class574 field7968;
   @OriginalMember(
      owner = "client!to",
      name = "s",
      descriptor = "Lnca;"
   )
   public class257 field7972;
   @OriginalMember(
      owner = "client!to",
      name = "F",
      descriptor = "Ltia;"
   )
   public class208 field7978;
   @OriginalMember(
      owner = "client!to",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7990 = new String[]{method4044(method4043("q\u007f4\b4")), method4044(method4043("~>4ea")), method4044(method4043("kev'")), method4044(method4043("q\u007f4\f4")), method4044(method4043("q\u007f4\u00034")), method4044(method4043("q\u007f4\u00024")), method4044(method4043("q\u007f4\t4")), method4044(method4043("q\u007f4\u000f4")), method4044(method4043("q\u007f4\u000e4")), method4044(method4043("q\u007f4wukynu4")), method4044(method4043("q\u007f4\n4")), method4044(method4043("q\u007f4\r4"))};
   @OriginalMember(
      owner = "client!to",
      name = "B",
      descriptor = "I"
   )
   public int field7963;
   @OriginalMember(
      owner = "client!to",
      name = "x",
      descriptor = "I"
   )
   public static int field7964;
   @OriginalMember(
      owner = "client!to",
      name = "m",
      descriptor = "I"
   )
   public static int field7966;
   @OriginalMember(
      owner = "client!to",
      name = "K",
      descriptor = "I"
   )
   public static int field7967;
   @OriginalMember(
      owner = "client!to",
      name = "E",
      descriptor = "I"
   )
   public static int field7969;
   @OriginalMember(
      owner = "client!to",
      name = "J",
      descriptor = "I"
   )
   public static int field7975;
   @OriginalMember(
      owner = "client!to",
      name = "l",
      descriptor = "I"
   )
   public static int field7977;
   @OriginalMember(
      owner = "client!to",
      name = "w",
      descriptor = "I"
   )
   public static int field7980;
   @OriginalMember(
      owner = "client!to",
      name = "L",
      descriptor = "I"
   )
   private int field7981;
   @OriginalMember(
      owner = "client!to",
      name = "v",
      descriptor = "I"
   )
   private int field7982;
   @OriginalMember(
      owner = "client!to",
      name = "r",
      descriptor = "I"
   )
   private int field7983;
   @OriginalMember(
      owner = "client!to",
      name = "G",
      descriptor = "I"
   )
   private int field7984;
   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "I"
   )
   private int field7986;
   @OriginalMember(
      owner = "client!to",
      name = "n",
      descriptor = "I"
   )
   public static int field7987;
   @OriginalMember(
      owner = "client!to",
      name = "o",
      descriptor = "I"
   )
   private int field7988;
   @OriginalMember(
      owner = "client!to",
      name = "C",
      descriptor = "I"
   )
   private int field7989;
   @OriginalMember(
      owner = "client!to",
      name = "I",
      descriptor = "Lgm;"
   )
   public static class204 field7971;

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(JILha;)V"
   )
   public final void method4034(long arg0, int arg1, class610 arg2) {
      boolean var5 = client.field1786;

      try {
         ++field7966;
         class587 var6 = (class587)this.field7978.method1815(1);
         if (var5) {
            var6.method4385(arg2, arg0);
            var6 = (class587)this.field7978.method1817(0);
         }

         while(true) {
            if (var6 == null) {
               if (!var5) {
                  if (arg1 != 64) {
                     this.field7963 = 83;
                     return;
                  }

                  return;
               }
            } else {
               var6.method4385(arg2, arg0);
            }

            var6 = (class587)this.field7978.method1817(0);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7990[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7990[1] : field7990[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(II)Lrfa;"
   )
   public static final class481 method4035(int arg0, int arg1) {
      try {
         ++field7980;
         class481 var2 = (class481)class686.field10203.method2544(false, (long)arg1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class642.field9288.method5017(arg0, arg1, (byte)71);
            class481 var4 = new class481();
            var4.field7310 = arg1;
            if (var3 != null) {
               var4.method3735(-77, new class354(var3));
            }

            var4.method3737(true);
            if (var4.field7307 == 2 && class96.field1351.method3141((long)arg1, true) == null) {
               class96.field1351.method3143(arg0 + 93, new class668(class489.field7423), (long)arg1);
               class87.field1270[class489.field7423++] = var4;
            }

            class686.field10203.method2545((long)arg1, 108, var4);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7990[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4036(int arg0) {
      try {
         field7971 = null;
         if (arg0 != 0) {
            method4041(-10, -30, 114, (byte)1, 105, -90, -37);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7990[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(JBZILha;)V"
   )
   public final void method4037(long param1, byte param3, boolean param4, int param5, class610 param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4038(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field7975;
         if (arg0 <= -9) {
            label49: {
               if (class298.method2501(26256, class342.field5204) || class303.method2535(class342.field5204, 40)) {
                  class744.method5468(class483.field7359, class691.field10259 >> 12, class401.field6288 >> 12, 2048);
                  if (!var1) {
                     break label49;
                  }
               }

               int var2 = class476.field7251.field1683[0] >> 3;
               int var3 = class476.field7251.field1685[0] >> 3;
               if (var2 >= 0 && class513.field7828 >> 3 > var2 && ~var3 <= -1 && class475.field7230 >> 3 > var3) {
                  class744.method5468(class483.field7359, var3, var2, 2048);
                  if (!var1) {
                     break label49;
                  }
               }

               class744.method5468(0, class475.field7230 >> 4, class513.field7828 >> 4, 2048);
            }

            class690.method5082((byte)83);
            class253.method2136(true);
            class367.method3009((byte)-124);
            class199.method1753(-25930);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7990[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(IIZII)V"
   )
   public static final void method4039(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         if (arg2) {
            ++field7964;
            class566 var5 = class146.method1321((long)arg4, 4, -1428737160);
            var5.method4269((byte)-100);
            var5.field8394 = arg3;
            var5.field8398 = arg1;
            var5.field8390 = arg0;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7990[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4040(byte arg0) {
      try {
         ++field7987;
         class206.field3130 = true;
         if (arg0 < 37) {
            field7971 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7990[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(IIIBIII)V"
   )
   public static final void method4041(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1786;

      try {
         ++field7977;
         class671.method4940(arg0, true);
         int var8 = 0;
         int var9 = arg0 - arg2;
         if (var9 < 0) {
            var9 = 0;
         }

         if (arg3 > -4) {
            field7971 = null;
         }

         int var10 = arg0;
         int var11 = -arg0;
         int var12 = var9;
         int var13 = -var9;
         byte var14 = -1;
         if (class368.field5724 <= arg1 && class84.field1212 >= arg1) {
            int[] var15 = class512.field7820[arg1];
            int var16 = class47.method332(-arg0 + arg4, class182.field2833, 15989, class443.field6806);
            int var17 = class47.method332(arg0 + arg4, class182.field2833, 15989, class443.field6806);
            int var18 = class47.method332(-var9 + arg4, class182.field2833, 15989, class443.field6806);
            int var19 = class47.method332(arg4 - -var9, class182.field2833, 15989, class443.field6806);
            class689.method5076(var18, var16, (byte)57, var15, arg5);
            class689.method5076(var19, var18, (byte)57, var15, arg6);
            class689.method5076(var17, var19, (byte)57, var15, arg5);
         }

         byte var20 = -1;
         int var45;
         int var46;
         if (var7) {
            var46 = var20 + 2;
            var45 = var14 + 2;
            var11 += var45;
            var13 += var46;
            if (~var13 <= -1 && ~var9 <= -2) {
               var12 = var9 - 1;
               var13 -= var12 << 1;
               class149.field2254[var12] = var8;
            }
         } else {
            if (~var8 <= ~arg0) {
               return;
            }

            var46 = var20 + 2;
            var45 = var14 + 2;
            var11 += var45;
            var13 += var46;
            if (~var13 <= -1 && ~var9 <= -2) {
               var12 = var9 - 1;
               var13 -= var12 << 1;
               class149.field2254[var12] = var8;
            }
         }

         while(true) {
            while(true) {
               ++var8;
               if (~var11 <= -1) {
                  --var10;
                  var11 -= var10 << 1;
                  int var21 = -var10 + arg1;
                  int var22 = arg1 + var10;
                  if (~class368.field5724 >= ~var22 && var21 <= class84.field1212) {
                     int var30;
                     int var31;
                     if (var10 < var9) {
                        int var23 = class149.field2254[var10];
                        int var24 = class47.method332(arg4 + var8, class182.field2833, 15989, class443.field6806);
                        int var25 = class47.method332(arg4 - var8, class182.field2833, 15989, class443.field6806);
                        int var26 = class47.method332(arg4 + var23, class182.field2833, 15989, class443.field6806);
                        int var27 = class47.method332(-var23 + arg4, class182.field2833, 15989, class443.field6806);
                        if (~var22 >= ~class84.field1212) {
                           int[] var28 = class512.field7820[var22];
                           class689.method5076(var27, var25, (byte)57, var28, arg5);
                           class689.method5076(var26, var27, (byte)57, var28, arg6);
                           class689.method5076(var24, var26, (byte)57, var28, arg5);
                        }

                        if (class368.field5724 <= var21) {
                           int[] var29 = class512.field7820[var21];
                           class689.method5076(var27, var25, (byte)57, var29, arg5);
                           class689.method5076(var26, var27, (byte)57, var29, arg6);
                           class689.method5076(var24, var26, (byte)57, var29, arg5);
                           if (var7) {
                              var30 = class47.method332(arg4 - -var8, class182.field2833, 15989, class443.field6806);
                              var31 = class47.method332(arg4 - var8, class182.field2833, 15989, class443.field6806);
                              if (~var22 >= ~class84.field1212) {
                                 class689.method5076(var30, var31, (byte)57, class512.field7820[var22], arg5);
                              }

                              if (~class368.field5724 >= ~var21) {
                                 class689.method5076(var30, var31, (byte)57, class512.field7820[var21], arg5);
                              }
                           }
                        }
                     } else {
                        var30 = class47.method332(arg4 - -var8, class182.field2833, 15989, class443.field6806);
                        var31 = class47.method332(arg4 - var8, class182.field2833, 15989, class443.field6806);
                        if (~var22 >= ~class84.field1212) {
                           class689.method5076(var30, var31, (byte)57, class512.field7820[var22], arg5);
                        }

                        if (~class368.field5724 >= ~var21) {
                           class689.method5076(var30, var31, (byte)57, class512.field7820[var21], arg5);
                        }
                     }
                  }
               }

               int var32 = arg1 - var8;
               int var33 = arg1 + var8;
               if (~var33 <= ~class368.field5724) {
                  int var10000 = class84.field1212;
                  if (var7) {
                     if (var10000 <= var32 && ~var12 <= -2) {
                        --var12;
                        var13 -= var12 << 1;
                        class149.field2254[var12] = var8;
                     }
                     continue;
                  }

                  if (var10000 >= var32) {
                     int var34 = arg4 + var10;
                     int var35 = arg4 - var10;
                     if (class443.field6806 <= var34 && class182.field2833 >= var35) {
                        int var36 = class47.method332(var34, class182.field2833, 15989, class443.field6806);
                        int var37 = class47.method332(var35, class182.field2833, 15989, class443.field6806);
                        int var38;
                        int var39;
                        int var40;
                        int[] var41;
                        int[] var42;
                        if (~var8 <= ~var9) {
                           if (class84.field1212 >= var33) {
                              class689.method5076(var36, var37, (byte)57, class512.field7820[var33], arg5);
                           }

                           if (class368.field5724 <= var32) {
                              class689.method5076(var36, var37, (byte)57, class512.field7820[var32], arg5);
                              if (var7) {
                                 var38 = ~var8 >= ~var12 ? var12 : class149.field2254[var8];
                                 var39 = class47.method332(arg4 + var38, class182.field2833, 15989, class443.field6806);
                                 var40 = class47.method332(-var38 + arg4, class182.field2833, 15989, class443.field6806);
                                 if (var33 <= class84.field1212) {
                                    var41 = class512.field7820[var33];
                                    class689.method5076(var40, var37, (byte)57, var41, arg5);
                                    class689.method5076(var39, var40, (byte)57, var41, arg6);
                                    class689.method5076(var36, var39, (byte)57, var41, arg5);
                                 }

                                 if (~var32 <= ~class368.field5724) {
                                    var42 = class512.field7820[var32];
                                    class689.method5076(var40, var37, (byte)57, var42, arg5);
                                    class689.method5076(var39, var40, (byte)57, var42, arg6);
                                    class689.method5076(var36, var39, (byte)57, var42, arg5);
                                 }
                              }
                           }
                        } else {
                           var38 = ~var8 >= ~var12 ? var12 : class149.field2254[var8];
                           var39 = class47.method332(arg4 + var38, class182.field2833, 15989, class443.field6806);
                           var40 = class47.method332(-var38 + arg4, class182.field2833, 15989, class443.field6806);
                           if (var33 <= class84.field1212) {
                              var41 = class512.field7820[var33];
                              class689.method5076(var40, var37, (byte)57, var41, arg5);
                              class689.method5076(var39, var40, (byte)57, var41, arg6);
                              class689.method5076(var36, var39, (byte)57, var41, arg5);
                           }

                           if (~var32 <= ~class368.field5724) {
                              var42 = class512.field7820[var32];
                              class689.method5076(var40, var37, (byte)57, var42, arg5);
                              class689.method5076(var39, var40, (byte)57, var42, arg6);
                              class689.method5076(var36, var39, (byte)57, var42, arg5);
                           }
                        }
                     }
                  }
               }

               if (~var8 <= ~var10) {
                  return;
               }

               var46 += 2;
               var45 += 2;
               var11 += var45;
               var13 += var46;
               if (~var13 <= -1 && ~var12 <= -2) {
                  --var12;
                  var13 -= var12 << 1;
                  class149.field2254[var12] = var8;
               }
            }
         }
      } catch (RuntimeException var44) {
         throw class482.method3757(var44, field7990[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4042(int arg0) {
      try {
         this.field7970.field1396 = this.field7968.field8504;
         this.field7970.field1403 = this.field7968.field8502;
         this.field7970.field1397 = this.field7968.field8505;
         ++field7969;
         this.field7970.field1400 = this.field7968.field8512;
         this.field7970.field1399 = this.field7968.field8498;
         this.field7970.field1405 = this.field7968.field8506;
         this.field7970.field1395 = this.field7968.field8508;
         this.field7970.field1407 = this.field7968.field8500;
         this.field7970.field1398 = this.field7968.field8510;
         if (arg0 != 0) {
            field7971 = null;
         }

         if (~this.field7970.field1403 == ~this.field7970.field1398 && this.field7970.field1405 == this.field7970.field1398 && this.field7970.field1407 == this.field7970.field1397 && ~this.field7970.field1399 == ~this.field7970.field1397 && ~this.field7970.field1396 == ~this.field7970.field1395 && ~this.field7970.field1400 == ~this.field7970.field1396) {
            this.field7985 = true;
         } else if (this.field7985) {
            this.field7979.field1395 = this.field7970.field1395;
            this.field7985 = false;
            this.field7979.field1396 = this.field7970.field1396;
            this.field7979.field1405 = this.field7970.field1405;
            this.field7979.field1400 = this.field7970.field1400;
            this.field7979.field1398 = this.field7970.field1398;
            this.field7979.field1399 = this.field7970.field1399;
            this.field7979.field1403 = this.field7970.field1403;
            this.field7979.field1397 = this.field7970.field1397;
            this.field7979.field1407 = this.field7970.field1407;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7990[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "<init>",
      descriptor = "(Lha;Lgl;Laaa;J)V"
   )
   public class523(class610 arg0, class574 arg1, class743 arg2, long arg3) {
      try {
         this.field7973 = arg2;
         this.field7965 = arg3;
         this.field7968 = arg1;
         this.field7972 = this.field7968.method4314((byte)123);
         if (!arg0.method689() && ~this.field7972.field3887 != 0) {
            this.field7972 = class271.method2311(-92, this.field7972.field3887);
         }

         this.field7978 = new class208();
         this.field7976 = (int)((double)this.field7976 + 64.0D * Math.random());
         this.method4042(0);
         this.field7979.field1405 = this.field7970.field1405;
         this.field7979.field1396 = this.field7970.field1396;
         this.field7979.field1399 = this.field7970.field1399;
         this.field7979.field1403 = this.field7970.field1403;
         this.field7979.field1397 = this.field7970.field1397;
         this.field7979.field1395 = this.field7970.field1395;
         this.field7979.field1398 = this.field7970.field1398;
         this.field7979.field1407 = this.field7970.field1407;
         this.field7979.field1400 = this.field7970.field1400;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7990[9] + (arg0 != null ? field7990[1] : field7990[2]) + ',' + (arg1 != null ? field7990[1] : field7990[2]) + ',' + (arg2 != null ? field7990[1] : field7990[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4043(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4044(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
