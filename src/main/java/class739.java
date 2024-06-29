import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class739 extends class70 {
   @OriginalMember(
      owner = "client!nv",
      name = "L",
      descriptor = "I"
   )
   private int field10822 = 2000;
   @OriginalMember(
      owner = "client!nv",
      name = "K",
      descriptor = "I"
   )
   private int field10818 = 4096;
   @OriginalMember(
      owner = "client!nv",
      name = "Q",
      descriptor = "I"
   )
   private int field10827 = 0;
   @OriginalMember(
      owner = "client!nv",
      name = "N",
      descriptor = "I"
   )
   private int field10828 = 16;
   @OriginalMember(
      owner = "client!nv",
      name = "J",
      descriptor = "I"
   )
   private int field10829 = 0;
   @OriginalMember(
      owner = "client!nv",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10830 = new String[]{method5369(method5368("T\u000fs`n")), method5369(method5368("T\f1I")), method5369(method5368("AWs\u000b;")), method5369(method5368("T\u000fsin")), method5369(method5368("T\u000fsfn")), method5369(method5368("T\u000fsjn")), method5369(method5368("T\u000fsan"))};
   @OriginalMember(
      owner = "client!nv",
      name = "M",
      descriptor = "I"
   )
   public static int field10819;
   @OriginalMember(
      owner = "client!nv",
      name = "S",
      descriptor = "I"
   )
   public static int field10820;
   @OriginalMember(
      owner = "client!nv",
      name = "I",
      descriptor = "I"
   )
   public static int field10823;
   @OriginalMember(
      owner = "client!nv",
      name = "O",
      descriptor = "I"
   )
   public static int field10824;
   @OriginalMember(
      owner = "client!nv",
      name = "R",
      descriptor = "I"
   )
   public static int field10825;
   @OriginalMember(
      owner = "client!nv",
      name = "T",
      descriptor = "J"
   )
   public static long field10821;
   @OriginalMember(
      owner = "client!nv",
      name = "P",
      descriptor = "Z"
   )
   public static boolean field10826;

   @OriginalMember(
      owner = "client!nv",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method5366(int arg0) {
      try {
         class223.field2792 = class387.field5363;
         class139.field1755 = arg0;
         ++field10825;
         class413.field5674 = 1;
         String var1 = null;
         if (class226.field2825 != null) {
            class66 var2 = new class66(class226.field2825);
            var1 = class550.method4166(37, var2.method660(arg0 + 116));
            class10.field235 = var2.method660(125);
         }

         if (var1 == null) {
            class419.method3265((byte)-103, 35);
         } else {
            class670.method4886(var1, (byte)115, "", true, false);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10830[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label64: {
            label63: {
               label62: {
                  label61: {
                     label60: {
                        if (~arg2 != -1) {
                           if (~arg2 == -2) {
                              break label60;
                           }

                           if (arg2 == 2) {
                              break label61;
                           }

                           if (~arg2 == -4) {
                              break label62;
                           }

                           if (arg2 != 4) {
                              break label64;
                           }

                           if (!var4) {
                              break label63;
                           }
                        }

                        this.field10827 = arg1.method640(255);
                        if (!var4) {
                           break label64;
                        }
                     }

                     this.field10822 = arg1.method603(-2);
                     if (!var4) {
                        break label64;
                     }
                  }

                  this.field10828 = arg1.method640(255);
                  if (!var4) {
                     break label64;
                  }
               }

               this.field10829 = arg1.method603(-2);
               if (!var4) {
                  break label64;
               }
            }

            this.field10818 = arg1.method603(-2);
         }

         if (arg0 > -34) {
            field10826 = true;
         }

         ++field10823;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10830[4] + arg0 + ',' + (arg1 != null ? field10830[2] : field10830[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "([BB)Llha;"
   )
   public static final class36 method5367(byte[] arg0, byte arg1) {
      boolean var2 = client.field1481;

      try {
         ++field10820;
         class36 var3 = new class36();
         class66 var4 = new class66(arg0);
         var4.field864 = var4.field859.length - 2;
         int var5 = var4.method603(-2);
         int var6 = var4.field859.length + -2 + -16 - var5;
         var4.field864 = var6;
         int var7 = var4.method610(125);
         var3.field510 = var4.method603(-2);
         var3.field504 = var4.method603(-2);
         var3.field499 = var4.method603(-2);
         if (arg1 >= -67) {
            method5366(50);
         }

         var3.field511 = var4.method603(-2);
         var3.field509 = var4.method603(-2);
         var3.field497 = var4.method603(-2);
         int var8 = var4.method640(255);
         if (~var8 < -1) {
            var3.field506 = new class227[var8];
            int var9 = 0;
            if (var2 || ~var9 > ~var8) {
               do {
                  int var10 = var4.method603(-2);
                  class227 var11 = new class227(class109.method978(-1, var10));
                  var3.field506[var9] = var11;
                  if (var2 || var10-- > 0) {
                     do {
                        int var12 = var4.method610(-99);
                        int var13 = var4.method610(126);
                        var11.method1808((long)var12, new class278(var13), 26459);
                     } while(var10-- > 0);
                  }

                  ++var9;
               } while(~var9 > ~var8);
            }
         }

         var4.field864 = 0;
         var3.field500 = var4.method654((byte)-118);
         var3.field508 = new int[var7];
         int var14 = 0;
         if (!var2 && var6 <= var4.field864) {
            return var3;
         } else {
            do {
               int var15;
               label115: {
                  var15 = var4.method603(-2);
                  if (~var15 == -4) {
                     if (var3.field498 == null) {
                        var3.field498 = new String[var7];
                     }

                     var3.field498[var14] = var4.method606(11856).intern();
                     if (!var2) {
                        break label115;
                     }
                  }

                  if (var15 != 54) {
                     if (var3.field512 == null) {
                        var3.field512 = new int[var7];
                     }

                     if (var15 >= 150 || var15 == 21 || ~var15 == -39 || var15 == 39) {
                        var3.field512[var14] = var4.method640(255);
                        if (!var2) {
                           break label115;
                        }
                     }

                     var3.field512[var14] = var4.method610(126);
                     if (!var2) {
                        break label115;
                     }
                  }

                  if (var3.field505 == null) {
                     var3.field505 = new long[var7];
                  }

                  var3.field505[var14] = var4.method660(108);
               }

               var3.field508[var14++] = var15;
            } while(var6 > var4.field864);

            return var3;
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field10830[0] + (arg0 != null ? field10830[2] : field10830[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field10819;
         int[] var4 = super.field940.method119(false, arg1);
         if (arg0 != -63) {
            this.field10829 = 41;
         }

         if (super.field940.field270) {
            int var5 = this.field10818 >> 1;
            int[][] var6 = super.field940.method117((byte)-101);
            Random var7 = new Random((long)this.field10827);
            int var8 = 0;
            int var10000;
            if (var3) {
               var10000 = this.field10818 <= 0 ? this.field10829 : this.field10829 - -class145.method1178(5733, this.field10818, var7) - var5;
            } else {
               if (~this.field10822 >= ~var8) {
                  return var4;
               }

               var10000 = this.field10818 <= 0 ? this.field10829 : this.field10829 - -class145.method1178(5733, this.field10818, var7) - var5;
            }

            while(true) {
               label151: {
                  int var9 = var10000;
                  int var10 = var9 >> 4 & 255;
                  int var11 = class145.method1178(5733, class262.field3328, var7);
                  int var12 = class145.method1178(5733, class99.field1313, var7);
                  int var13 = (class123.field1612[var10] * this.field10828 >> 12) + var11;
                  int var14 = (class794.field11620[var10] * this.field10828 >> 12) + var12;
                  int var15 = var14 - var12;
                  int var16 = -var11 + var13;
                  if (var16 == 0) {
                     if (~var15 == -1) {
                        ++var8;
                        break label151;
                     }

                     if (~var16 > -1) {
                        var16 = -var16;
                     }
                  } else if (~var16 > -1) {
                     var16 = -var16;
                  }

                  boolean var17;
                  int var18;
                  int var19;
                  if (var15 < 0) {
                     var15 = -var15;
                     var17 = ~var15 < ~var16;
                     if (var17) {
                        var18 = var11;
                        var19 = var13;
                        var11 = var12;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                     }
                  } else {
                     var17 = ~var15 < ~var16;
                     if (var17) {
                        var18 = var11;
                        var19 = var13;
                        var11 = var12;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                     }
                  }

                  int var22;
                  int var23;
                  int var24;
                  int var25;
                  int var26;
                  int var27;
                  int var28;
                  if (var13 < var11) {
                     int var20 = var11;
                     var11 = var13;
                     var13 = var20;
                     var22 = var14;
                     var23 = -var11 + var20;
                     var24 = -var14 + var12;
                     var25 = -var23 / 2;
                     var26 = 2048 / var23;
                     var27 = 1024 - (class145.method1178(5733, 4096, var7) >> 2);
                     var28 = var14 >= var12 ? -1 : 1;
                     if (var24 < 0) {
                        var24 = -var24;
                     }
                  } else {
                     var22 = var12;
                     var23 = -var11 + var13;
                     var24 = -var12 + var14;
                     var25 = -var23 / 2;
                     var26 = 2048 / var23;
                     var27 = 1024 - (class145.method1178(5733, 4096, var7) >> 2);
                     var28 = var12 >= var14 ? -1 : 1;
                     if (var24 < 0) {
                        var24 = -var24;
                     }
                  }

                  int var29 = var11;
                  if (!var3 && var11 >= var13) {
                     ++var8;
                  } else {
                     while(true) {
                        int var30 = (-var11 + var29) * var26 + 1024 + var27;
                        int var31 = class174.field2249 & var29;
                        int var32 = var22 & class623.field9205;
                        if (var17) {
                           var6[var32][var31] = var30;
                           if (var3) {
                              var6[var31][var32] = var30;
                           }
                        } else {
                           var6[var31][var32] = var30;
                        }

                        var25 += var24;
                        if (~var25 < -1) {
                           var25 += -var23;
                           var22 += var28;
                        }

                        ++var29;
                        if (var29 >= var13) {
                           ++var8;
                           break;
                        }
                     }
                  }
               }

               if (~this.field10822 >= ~var8) {
                  break;
               }

               var10000 = this.field10818 <= 0 ? this.field10829 : this.field10829 - -class145.method1178(5733, this.field10818, var7) - var5;
            }
         }

         return var4;
      } catch (RuntimeException var34) {
         throw class93.method866(var34, field10830[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "<init>",
      descriptor = "()V"
   )
   public class739() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!nv",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         if (arg0 >= -36) {
            this.method331((byte)40, 91);
         }

         ++field10824;
         class704.method5119(true);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10830[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5368(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5369(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
