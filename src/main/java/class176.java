import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class176 {
   @OriginalMember(
      owner = "client!wq",
      name = "D",
      descriptor = "I"
   )
   private int field2691 = 32;
   @OriginalMember(
      owner = "client!wq",
      name = "s",
      descriptor = "Z"
   )
   private boolean field2703 = false;
   @OriginalMember(
      owner = "client!wq",
      name = "j",
      descriptor = "J"
   )
   private long field2696 = class57.method650(105);
   @OriginalMember(
      owner = "client!wq",
      name = "h",
      descriptor = "[Lhu;"
   )
   private class142[] field2705 = new class142[8];
   @OriginalMember(
      owner = "client!wq",
      name = "t",
      descriptor = "Z"
   )
   private boolean field2711 = true;
   @OriginalMember(
      owner = "client!wq",
      name = "f",
      descriptor = "J"
   )
   private long field2713 = 0L;
   @OriginalMember(
      owner = "client!wq",
      name = "A",
      descriptor = "I"
   )
   private int field2707 = 0;
   @OriginalMember(
      owner = "client!wq",
      name = "x",
      descriptor = "[Lhu;"
   )
   private class142[] field2714 = new class142[8];
   @OriginalMember(
      owner = "client!wq",
      name = "c",
      descriptor = "J"
   )
   private long field2717 = 0L;
   @OriginalMember(
      owner = "client!wq",
      name = "p",
      descriptor = "I"
   )
   private int field2716 = 0;
   @OriginalMember(
      owner = "client!wq",
      name = "k",
      descriptor = "I"
   )
   private int field2715 = 0;
   @OriginalMember(
      owner = "client!wq",
      name = "v",
      descriptor = "I"
   )
   private int field2706 = 0;
   @OriginalMember(
      owner = "client!wq",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2718 = new String[]{method1564(method1563("R\\TO*")), method1564(method1563("R\\TM*")), method1564(method1563("KX\u0016f")), method1564(method1563("^\u0003T$\u007f")), method1564(method1563("R\\TD*")), method1564(method1563("R\\TA*")), method1564(method1563("R\\TK*")), method1564(method1563("R\\TC*")), method1564(method1563("R\\T@*")), method1564(method1563("R\\TB*")), method1564(method1563("R\\TH*")), method1564(method1563("R\\TI*")), method1564(method1563("R\\TN*")), method1564(method1563("R\\TL*")), method1564(method1563("R\\TF*"))};
   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "I"
   )
   public static int field2688;
   @OriginalMember(
      owner = "client!wq",
      name = "r",
      descriptor = "I"
   )
   public static int field2689;
   @OriginalMember(
      owner = "client!wq",
      name = "u",
      descriptor = "I"
   )
   public static int field2690;
   @OriginalMember(
      owner = "client!wq",
      name = "d",
      descriptor = "I"
   )
   public static int field2692;
   @OriginalMember(
      owner = "client!wq",
      name = "y",
      descriptor = "I"
   )
   public static int field2693;
   @OriginalMember(
      owner = "client!wq",
      name = "q",
      descriptor = "I"
   )
   public static int field2694;
   @OriginalMember(
      owner = "client!wq",
      name = "E",
      descriptor = "I"
   )
   public static int field2695;
   @OriginalMember(
      owner = "client!wq",
      name = "m",
      descriptor = "I"
   )
   public static int field2697;
   @OriginalMember(
      owner = "client!wq",
      name = "C",
      descriptor = "I"
   )
   public static int field2698;
   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "I"
   )
   public static int field2699;
   @OriginalMember(
      owner = "client!wq",
      name = "w",
      descriptor = "I"
   )
   public static int field2700;
   @OriginalMember(
      owner = "client!wq",
      name = "B",
      descriptor = "I"
   )
   public static int field2701;
   @OriginalMember(
      owner = "client!wq",
      name = "b",
      descriptor = "I"
   )
   public static int field2704;
   @OriginalMember(
      owner = "client!wq",
      name = "n",
      descriptor = "I"
   )
   public int field2708;
   @OriginalMember(
      owner = "client!wq",
      name = "l",
      descriptor = "I"
   )
   public int field2709;
   @OriginalMember(
      owner = "client!wq",
      name = "g",
      descriptor = "I"
   )
   public static int field2710;
   @OriginalMember(
      owner = "client!wq",
      name = "i",
      descriptor = "I"
   )
   private int field2712;
   @OriginalMember(
      owner = "client!wq",
      name = "o",
      descriptor = "Lhu;"
   )
   private class142 field2687;
   @OriginalMember(
      owner = "client!wq",
      name = "e",
      descriptor = "[I"
   )
   public int[] field2702;

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(Lhu;II)V",
      line = 3
   )
   private final void method1555(class142 arg0, int arg1, int arg2) {
      try {
         ++field2698;
         int var4 = arg1 >> 5;
         if (arg2 != -32061) {
            this.field2696 = -3L;
         }

         label26: {
            class142 var5 = this.field2705[var4];
            if (var5 == null) {
               this.field2714[var4] = arg0;
               if (!client.field4564) {
                  break label26;
               }
            }

            var5.field2342 = arg0;
         }

         this.field2705[var4] = arg0;
         arg0.field2343 = arg1;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2718[8] + (arg0 != null ? field2718[3] : field2718[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "([II)V",
      line = 25
   )
   private final void method1556(int[] arg0, int arg1) {
      int var3 = arg1;
      if (class483.field7024) {
         var3 = arg1 << 1;
      }

      class365.method2858(arg0, 0, var3);
      this.field2715 -= arg1;
      if (this.field2687 != null && this.field2715 <= 0) {
         this.field2715 += class755.field10967 >> 4;
         class458.method3446(this.field2687, (byte)46);
         this.method1555(this.field2687, this.field2687.method1357(), -32061);
         int var4 = 0;
         int var5 = 255;
         int var6 = 7;

         label107:
         while(var5 != 0) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  class142 var10 = null;
                  class142 var11 = this.field2714[var7];

                  label101:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label101;
                        }

                        class500 var12 = var11.field2340;
                        if (var12 != null && var12.field7295 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field2342;
                        } else {
                           var11.field2341 = true;
                           int var13 = var11.method88();
                           var4 += var13;
                           if (var12 != null) {
                              var12.field7295 += var13;
                           }

                           if (var4 >= this.field2691) {
                              break label107;
                           }

                           class142 var14 = var11.method90();
                           if (var14 != null) {
                              int var15 = var11.field2343;

                              while(var14 != null) {
                                 this.method1555(var14, var15 * var14.method1357() >> 8, -32061);
                                 var14 = var11.method87();
                              }
                           }

                           class142 var16 = var11.field2342;
                           var11.field2342 = null;
                           if (var10 == null) {
                              this.field2714[var7] = var16;
                           } else {
                              var10.field2342 = var16;
                           }

                           if (var16 == null) {
                              this.field2705[var7] = var10;
                           }

                           var11 = var16;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }

            --var6;
         }

         for(int var17 = 0; var17 < 8; ++var17) {
            class142 var18 = this.field2714[var17];
            this.field2714[var17] = this.field2705[var17] = null;

            while(var18 != null) {
               class142 var19 = var18.field2342;
               var18.field2342 = null;
               var18 = var19;
            }
         }
      }

      if (this.field2715 < 0) {
         this.field2715 = 0;
      }

      if (this.field2687 != null) {
         this.field2687.method85(arg0, 0, arg1);
      }

      this.field2696 = class57.method650(92);
   }

   @OriginalMember(
      owner = "client!wq",
      name = "d",
      descriptor = "(I)V",
      line = 183
   )
   public final synchronized void method1557(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(Z)V",
      line = 303
   )
   public final synchronized void method1558(boolean arg0) {
      try {
         ++field2704;
         this.field2711 = arg0;

         try {
            this.method728();
         } catch (Exception var3) {
            this.method727();
            this.field2717 = class57.method650(107) + 2000L;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2718[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "c",
      descriptor = "(I)V",
      line = 319
   )
   public void method729(int arg0) throws Exception {
      try {
         ++field2688;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2718[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "b",
      descriptor = "(I)V",
      line = 327
   )
   public final synchronized void method1559(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field2694;
         if (class46.field1007 != null) {
            boolean var3 = true;
            int var4 = 0;
            if (var2) {
               if (class46.field1007.field4484[var4] == this) {
                  class46.field1007.field4484[var4] = null;
               }

               if (class46.field1007.field4484[var4] != null) {
                  var3 = false;
                  ++var4;
               } else {
                  ++var4;
               }
            }

            while(true) {
               while(var4 < 2) {
                  if (class46.field1007.field4484[var4] == this) {
                     class46.field1007.field4484[var4] = null;
                  }

                  if (class46.field1007.field4484[var4] != null) {
                     var3 = false;
                     ++var4;
                  } else {
                     ++var4;
                  }
               }

               if (!var2) {
                  if (var3) {
                     class46.field1007.field4486 = true;
                     if (var2) {
                        class624.method4569((byte)98, 50L);
                     }

                     while(class46.field1007.field4481) {
                        class624.method4569((byte)98, 50L);
                     }

                     class46.field1007 = null;
                  }
                  break;
               }

               var3 = var3;
               ++var4;
            }
         }

         this.method727();
         this.field2703 = true;
         if (arg0 > -64) {
            this.method1560(22, (class142)null);
         }

         this.field2702 = null;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2718[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(ILhu;)V",
      line = 371
   )
   public final synchronized void method1560(int arg0, class142 arg1) {
      try {
         ++field2697;
         if (arg0 == 32) {
            this.field2687 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2718[4] + arg0 + ',' + (arg1 != null ? field2718[3] : field2718[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(I)V",
      line = 392
   )
   public static final void method1561(int arg0) {
      try {
         ++field2710;
         class536 var1 = class108.method1038((long)arg0, 37, 15);
         var1.method4013((byte)126);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2718[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V",
      line = 403
   )
   public void method731(Component arg0) throws Exception {
      try {
         ++field2693;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2718[13] + (arg0 != null ? field2718[3] : field2718[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "c",
      descriptor = "()V",
      line = 411
   )
   public void method732() throws Exception {
      try {
         ++field2700;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2718[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(IB)V",
      line = 429
   )
   private final void method1562(int arg0, byte arg1) {
      try {
         this.field2715 -= arg0;
         int var3 = -93 % ((arg1 - -36) / 45);
         ++field2695;
         if (this.field2715 < 0) {
            this.field2715 = 0;
         }

         if (this.field2687 != null) {
            this.field2687.method86(arg0);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2718[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "d",
      descriptor = "()I",
      line = 448
   )
   public int method730() throws Exception {
      try {
         ++field2689;
         return this.field2708;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2718[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "b",
      descriptor = "()V",
      line = 456
   )
   public void method728() throws Exception {
      try {
         ++field2701;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2718[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "()V",
      line = 463
   )
   public void method727() {
      try {
         ++field2692;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2718[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1563(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1564(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
