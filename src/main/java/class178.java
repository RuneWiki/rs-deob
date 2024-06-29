import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class178 {
   @OriginalMember(
      owner = "client!ld",
      name = "f",
      descriptor = "I"
   )
   private int field2754 = 0;
   @OriginalMember(
      owner = "client!ld",
      name = "e",
      descriptor = "[Lub;"
   )
   public class22[] field2750;
   @OriginalMember(
      owner = "client!ld",
      name = "d",
      descriptor = "I"
   )
   public int field2751;
   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2755 = new String[]{method1578(method1577("Y|]VM")), method1578(method1577("Y|]PM")), method1578(method1577("Y|]^M")), method1578(method1577("[m\u001fy")), method1578(method1577("N6];\u0018")), method1578(method1577("Y|]QM")), method1578(method1577("Y|]SM")), method1578(method1577("Y|]_M")), method1578(method1577("Y|]RM")), method1578(method1577("Y|]WM")), method1578(method1577("Y|]\\M")), method1578(method1577("Y|]TM")), method1578(method1577("Y|])\f[q\u0007+M")), method1578(method1577("Y|]]M"))};
   @OriginalMember(
      owner = "client!ld",
      name = "s",
      descriptor = "Lej;"
   )
   public static class133 field2744 = new class133();
   @OriginalMember(
      owner = "client!ld",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field2745 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
   @OriginalMember(
      owner = "client!ld",
      name = "c",
      descriptor = "[Z"
   )
   public static boolean[] field2749 = new boolean[100];
   @OriginalMember(
      owner = "client!ld",
      name = "q",
      descriptor = "I"
   )
   public static int field2736;
   @OriginalMember(
      owner = "client!ld",
      name = "n",
      descriptor = "I"
   )
   public static int field2738;
   @OriginalMember(
      owner = "client!ld",
      name = "g",
      descriptor = "I"
   )
   public static int field2739;
   @OriginalMember(
      owner = "client!ld",
      name = "r",
      descriptor = "I"
   )
   public static int field2740;
   @OriginalMember(
      owner = "client!ld",
      name = "l",
      descriptor = "I"
   )
   public static int field2741;
   @OriginalMember(
      owner = "client!ld",
      name = "i",
      descriptor = "I"
   )
   public static int field2742;
   @OriginalMember(
      owner = "client!ld",
      name = "h",
      descriptor = "I"
   )
   public static int field2743;
   @OriginalMember(
      owner = "client!ld",
      name = "o",
      descriptor = "I"
   )
   public static int field2747;
   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "I"
   )
   public static int field2748;
   @OriginalMember(
      owner = "client!ld",
      name = "m",
      descriptor = "I"
   )
   public static int field2752;
   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "J"
   )
   private long field2746;
   @OriginalMember(
      owner = "client!ld",
      name = "p",
      descriptor = "Lub;"
   )
   private class22 field2737;
   @OriginalMember(
      owner = "client!ld",
      name = "k",
      descriptor = "Lub;"
   )
   private class22 field2753;

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lub;IJ)V"
   )
   public final void method1566(class22 arg0, int arg1, long arg2) {
      try {
         ++field2747;
         if (arg0.field343 != null) {
            arg0.method154(8);
         }

         if (arg1 == 24742) {
            class22 var5 = this.field2750[(int)(arg2 & (long)(this.field2751 - 1))];
            arg0.field346 = var5;
            arg0.field343 = var5.field343;
            arg0.field343.field346 = arg0;
            arg0.field346.field343 = arg0;
            arg0.field347 = arg2;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2755[5] + (arg0 != null ? field2755[4] : field2755[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(B)Lub;"
   )
   public final class22 method1567(byte arg0) {
      try {
         ++field2743;
         if (arg0 != -44) {
            return null;
         } else {
            this.field2754 = 0;
            return this.method1575((byte)-119);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2755[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(I)Lub;"
   )
   public final class22 method1568(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field2740;
         if (arg0 != 0) {
            return null;
         } else if (this.field2737 == null) {
            return null;
         } else {
            class22 var3 = this.field2750[(int)(this.field2746 & (long)(this.field2751 + -1))];
            class22 var4;
            if (var2) {
               if (~this.field2737.field347 == ~this.field2746) {
                  var4 = this.field2737;
                  this.field2737 = this.field2737.field346;
                  return var4;
               }

               this.field2737 = this.field2737.field346;
            }

            while(true) {
               while(this.field2737 != var3) {
                  if (~this.field2737.field347 == ~this.field2746) {
                     var4 = this.field2737;
                     this.field2737 = this.field2737.field346;
                     return var4;
                  }

                  this.field2737 = this.field2737.field346;
               }

               this.field2737 = null;
               if (!var2) {
                  return null;
               }

               this.field2737 = this.field2737.field346;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2755[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(I[Lub;)I"
   )
   public final int method1569(int arg0, class22[] arg1) {
      boolean var3 = client.field4564;

      try {
         ++field2739;
         int var4 = arg0;
         int var5 = 0;
         if (!var3 && this.field2751 <= var5) {
            return arg0;
         } else {
            do {
               class22 var6 = this.field2750[var5];
               class22 var7 = var6.field346;
               if (var3) {
                  arg1[var4++] = var7;
                  var7 = var7.field346;
               }

               while(true) {
                  while(var6 != var7) {
                     arg1[var4++] = var7;
                     var7 = var7.field346;
                  }

                  if (!var3) {
                     ++var5;
                     break;
                  }

                  var7 = var7.field346;
               }
            } while(this.field2751 > var5);

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field2755[9] + arg0 + ',' + (arg1 != null ? field2755[4] : field2755[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1570(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field2736;
         int var3 = 0;
         class178 var10000;
         class22 var4;
         if (var2) {
            var4 = this.field2750[var3];
         } else {
            if (~this.field2751 >= ~var3) {
               var10000 = this;
               if (!var2) {
                  this.field2737 = null;
                  if (arg0 != 15) {
                     this.method1570((byte)-27);
                  }

                  this.field2753 = null;
                  return;
               }
            } else {
               var10000 = this;
            }

            var4 = var10000.field2750[var3];
         }

         while(true) {
            while(true) {
               class22 var5 = var4.field346;
               if (var4 != var5) {
                  var5.method154(arg0 + -123);
                  if (var2) {
                     break;
                  }

                  if (!var2) {
                     continue;
                  }

                  ++var3;
                  break;
               }

               ++var3;
               break;
            }

            if (~this.field2751 >= ~var3) {
               var10000 = this;
               if (!var2) {
                  this.field2737 = null;
                  if (arg0 != 15) {
                     this.method1570((byte)-27);
                  }

                  this.field2753 = null;
                  return;
               }
            } else {
               var10000 = this;
            }

            var4 = var10000.field2750[var3];
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2755[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1571(int arg0) {
      boolean var2 = client.field4564;

      try {
         int var3 = -101 % ((42 - arg0) / 32);
         ++field2748;
         int var4 = 0;
         int var5 = 0;
         if (!var2 && var5 >= this.field2751) {
            return var4;
         } else {
            do {
               class22 var6 = this.field2750[var5];
               class22 var7 = var6.field346;
               if (var2) {
                  ++var4;
                  var7 = var7.field346;
               }

               while(true) {
                  while(var6 != var7) {
                     ++var4;
                     var7 = var7.field346;
                  }

                  if (!var2) {
                     ++var5;
                     break;
                  }

                  var7 = var7.field346;
               }
            } while(var5 < this.field2751);

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field2755[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(JI)Lub;"
   )
   public final class22 method1572(long arg0, int arg1) {
      boolean var4 = client.field4564;

      try {
         ++field2742;
         this.field2746 = arg0;
         if (arg1 != -16289) {
            this.method1572(115L, -33);
         }

         class22 var5 = this.field2750[(int)((long)(this.field2751 - 1) & arg0)];
         this.field2737 = var5.field346;
         class22 var6;
         if (var4) {
            if (this.field2737.field347 == arg0) {
               var6 = this.field2737;
               this.field2737 = this.field2737.field346;
               return var6;
            }

            this.field2737 = this.field2737.field346;
         }

         while(true) {
            while(this.field2737 != var5) {
               if (this.field2737.field347 == arg0) {
                  var6 = this.field2737;
                  this.field2737 = this.field2737.field346;
                  return var6;
               }

               this.field2737 = this.field2737.field346;
            }

            this.field2737 = null;
            if (!var4) {
               return null;
            }

            this.field2737 = this.field2737.field346;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2755[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IILvg;B)V"
   )
   public static final void method1573(int arg0, int arg1, class59 arg2, byte arg3) {
      boolean var4 = client.field4564;

      try {
         ++field2738;
         if (class442.field6452) {
            int var5 = 0;
            class587 var6 = (class587)arg2.field1134.method5680(false);
            int var7;
            if (var4) {
               var7 = class485.method3665(var6, -85);
               if (var5 < var7) {
                  var5 = var7;
               }

               var6 = (class587)arg2.field1134.method5676(-13612);
            }

            while(true) {
               int var10000;
               if (var6 == null) {
                  var5 += 8;
                  var10000 = arg2.field1133 * 16;
                  if (!var4) {
                     class640.field9329 = var10000 + (class234.field3420 ? 26 : 22);
                     int var8 = arg2.field1133 * 16 + 21;
                     int var9 = class733.field10544 + class582.field8424;
                     if (~class720.field10406 > ~(var5 + var9)) {
                        var9 = class582.field8424 - var5;
                     }

                     if (var9 < 0) {
                        var9 = 0;
                     }

                     int var10 = !class234.field3420 ? 31 : 33;
                     int var11 = -var10 + arg0 + 13;
                     if (~(var11 - -var8) < ~class218.field3296) {
                        var11 = -var8 + class218.field3296;
                     }

                     class401.field5898 = var9;
                     if (~var11 > -1) {
                        var11 = 0;
                     }

                     class470.field6832 = var5;
                     int var12 = 31 / ((arg3 - 43) / 54);
                     class82.field1380 = var11;
                     class636.field9268 = arg2;
                     return;
                  }
               } else {
                  var10000 = class485.method3665(var6, -85);
               }

               var7 = var10000;
               if (var5 < var7) {
                  var5 = var7;
               }

               var6 = (class587)arg2.field1134.method5676(-13612);
            }
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field2755[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2755[4] : field2755[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method1574(byte arg0) {
      try {
         if (arg0 != -126) {
            field2749 = null;
         }

         field2749 = null;
         field2744 = null;
         field2745 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2755[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "d",
      descriptor = "(B)Lub;"
   )
   public final class22 method1575(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field2741;
         if (~this.field2754 < -1 && this.field2750[this.field2754 - 1] != this.field2753) {
            class22 var3 = this.field2753;
            this.field2753 = var3.field346;
            return var3;
         } else {
            while(this.field2754 < this.field2751) {
               class22 var4 = this.field2750[this.field2754++].field346;
               class22 var10000 = this.field2750[this.field2754 + -1];

               while(var10000 != var4) {
                  this.field2753 = var4.field346;
                  var10000 = var4;
                  if (!var2) {
                     return var4;
                  }
               }
            }

            if (arg0 > -116) {
               this.method1570((byte)-21);
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2755[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1576(int arg0) {
      try {
         ++field2752;
         if (arg0 != 0) {
            method1574((byte)37);
         }

         return this.field2751;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2755[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class178(int arg0) {
      try {
         this.field2750 = new class22[arg0];
         this.field2751 = arg0;

         for(int var2 = 0; ~var2 > ~arg0; ++var2) {
            class22 var3 = this.field2750[var2] = new class22();
            var3.field343 = var3;
            var3.field346 = var3;
         }

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2755[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1577(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1578(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
