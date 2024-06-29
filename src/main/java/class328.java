import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class328 {
   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "I"
   )
   private int field4871 = -1;
   @OriginalMember(
      owner = "client!vn",
      name = "i",
      descriptor = "I"
   )
   private int field4882 = 0;
   @OriginalMember(
      owner = "client!vn",
      name = "j",
      descriptor = "Lsb;"
   )
   private class261 field4877 = new class261();
   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "Z"
   )
   public boolean field4884 = false;
   @OriginalMember(
      owner = "client!vn",
      name = "p",
      descriptor = "I"
   )
   private int field4873;
   @OriginalMember(
      owner = "client!vn",
      name = "k",
      descriptor = "I"
   )
   private int field4881;
   @OriginalMember(
      owner = "client!vn",
      name = "l",
      descriptor = "[[I"
   )
   private int[][] field4874;
   @OriginalMember(
      owner = "client!vn",
      name = "o",
      descriptor = "[Lqca;"
   )
   private class134[] field4872;
   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4885 = new String[]{method2636(method2635("$:3*]")), method2636(method2635("$:3/]")), method2636(method2635("$:3(]")), method2636(method2635("\u00115sI\u001a<8dI\u00077 o\u0000\u0010$1=\bU4!q\u0005U;9|\u000e\u0010r7|\n\u001d7")), method2636(method2635("$:3-]")), method2636(method2635("$:3U\u001c<=iW]")), method2636(method2635("$:3+]")), method2636(method2635(":#.\r")), method2636(method2635(":!{\u000f\u00183:")), method2636(method2635("$:3,]")), method2636(method2635("85z\r\r")), method2636(method2635("!#.\r")), method2636(method2635("85z\u0004\u001c!7")), method2636(method2635("85z\u001d\u001d7;o\b")), method2636(method2635("61i\b\u001c>'")), method2636(method2635("85~\u0005\u001c0")), method2636(method2635("85z\u000e\u0019"))};
   @OriginalMember(
      owner = "client!vn",
      name = "g",
      descriptor = "Lhha;"
   )
   public static class724 field4869 = new class724(120, 0);
   @OriginalMember(
      owner = "client!vn",
      name = "n",
      descriptor = "Lfm;"
   )
   public static class164 field4878 = new class164(8, -1);
   @OriginalMember(
      owner = "client!vn",
      name = "d",
      descriptor = "I"
   )
   public static int field4870;
   @OriginalMember(
      owner = "client!vn",
      name = "f",
      descriptor = "I"
   )
   public static int field4875;
   @OriginalMember(
      owner = "client!vn",
      name = "c",
      descriptor = "I"
   )
   public static int field4876;
   @OriginalMember(
      owner = "client!vn",
      name = "e",
      descriptor = "I"
   )
   public static int field4879;
   @OriginalMember(
      owner = "client!vn",
      name = "h",
      descriptor = "I"
   )
   public static int field4880;
   @OriginalMember(
      owner = "client!vn",
      name = "m",
      descriptor = "I"
   )
   public static int field4883;

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Z)[[I"
   )
   public final int[][] method2629(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         if (!arg0) {
            return null;
         } else {
            ++field4875;
            if (this.field4881 != this.field4873) {
               throw new RuntimeException(field4885[3]);
            } else {
               int var3 = 0;
               if (var2) {
                  this.field4872[var3] = class5.field61;
                  ++var3;
               }

               while(true) {
                  class328 var10000;
                  if (~this.field4873 >= ~var3) {
                     var10000 = this;
                     if (!var2) {
                        return this.field4874;
                     }
                  } else {
                     var10000 = this;
                  }

                  var10000.field4872[var3] = class5.field61;
                  ++var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4885[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2630(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field4880;
         int var3 = 0;
         if (var2) {
            this.field4874[var3] = null;
            ++var3;
         }

         while(true) {
            while(this.field4873 > var3) {
               this.field4874[var3] = null;
               ++var3;
            }

            if (!var2) {
               if (arg0 < 20) {
                  method2634(-93);
               }

               this.field4872 = null;
               this.field4874 = null;
               this.field4877.method2237(109);
               this.field4877 = null;
               return;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4885[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method2631(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field4876;
         if (~class504.field7182 == -1) {
            class186.field2725.method1676(512, new class267(field4885[15]));
            if (class186.field2725.method1674((byte)21).method1763((byte)-89) != 100) {
               return 1;
            }

            if (!((class267)class186.field2725.method1674((byte)52)).method2284((byte)-119)) {
               class183.field2683.method519(102);
            }

            class504.field7182 = 1;
         }

         if (~class504.field7182 == -2) {
            class790.field11507 = class186.method1673(6410);
            class186.field2721.method1676(512, new class203(class324.field4827));
            class186.field2729.method1676(512, new class267(field4885[16]));
            class186.field2735.method1676(512, new class267(field4885[10]));
            class186.field2736.method1676(512, new class267(field4885[12]));
            class186.field2737.method1676(512, new class267(field4885[11]));
            class186.field2738.method1676(512, new class267(field4885[7]));
            class186.field2739.method1676(512, new class267(field4885[13]));
            class186.field2740.method1676(512, new class203(class199.field2876));
            class186.field2741.method1676(512, new class203(class278.field4220));
            class186.field2742.method1676(512, new class203(class324.field4825));
            class186.field2743.method1676(512, new class203(class442.field6467));
            class186.field2744.method1676(512, new class203(class344.field5067));
            class186.field2745.method1676(512, new class203(class283.field4282));
            class186.field2746.method1676(512, new class203(class184.field2712));
            class186.field2747.method1676(512, new class203(class778.field11349));
            class186.field2748.method1676(512, new class203(class517.field7316));
            class186.field2749.method1676(512, new class203(class692.field9956));
            class186.field2750.method1676(512, new class203(class435.field6370));
            class186.field2751.method1676(512, new class203(class496.field7072));
            class186.field2752.method1676(512, new class203(class290.field4346));
            class186.field2753.method1676(512, new class203(class156.field2386));
            class186.field2754.method1676(512, new class222(class448.field6520, field4885[8]));
            class186.field2755.method1676(512, new class203(class379.field5554));
            class186.field2756.method1676(512, new class203(class577.field8143));
            class186.field2757.method1676(512, new class203(class1.field5));
            class186.field2758.method1676(512, new class661(class254.field3858, field4885[14]));
            int var2 = 0;
            if (var1) {
               if (class790.field11507[var2].method1674((byte)103) == null) {
                  throw new RuntimeException();
               }

               ++var2;
            }

            while(true) {
               while(~class790.field11507.length < ~var2) {
                  if (class790.field11507[var2].method1674((byte)103) == null) {
                     throw new RuntimeException();
                  }

                  ++var2;
               }

               int var3 = 0;
               class186[] var4 = class790.field11507;
               int var5 = 0;
               if (!var1) {
                  if (var1 || var5 < var4.length) {
                     do {
                        class186 var6 = var4[var5];
                        int var7 = var6.method1671(-124);
                        int var8 = var6.method1674((byte)120).method1763((byte)-70);
                        var3 += var7 * var8 / 100;
                        ++var5;
                     } while(var5 < var4.length);
                  }

                  class504.field7182 = 2;
                  class95.field1541 = var3;
                  break;
               }

               ++var2;
            }
         }

         if (class790.field11507 == null) {
            return 100;
         } else {
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            class186[] var12 = class790.field11507;
            int var13 = 16 / ((arg0 - -2) / 61);
            int var14 = 0;
            class186 var15;
            int var16;
            int var17;
            if (var1) {
               var15 = var12[var14];
               var16 = var15.method1671(-91);
               var17 = var15.method1674((byte)34).method1763((byte)-82);
               if (var17 < 100) {
                  var11 = false;
               }

               var9 += var16;
               var10 += var16 * var17 / 100;
               ++var14;
            }

            while(~var14 > ~var12.length) {
               var15 = var12[var14];
               var16 = var15.method1671(-91);
               var17 = var15.method1674((byte)34).method1763((byte)-82);
               if (var17 < 100) {
                  var11 = false;
               }

               var9 += var16;
               var10 += var16 * var17 / 100;
               ++var14;
            }

            if (var11) {
               if (!((class267)class186.field2736.method1674((byte)120)).method2284((byte)-59)) {
                  class183.field2683.method518(57);
               }

               if (!((class267)class186.field2739.method1674((byte)60)).method2284((byte)-80)) {
                  class28.field414 = class183.field2683.method505(false);
               }

               class790.field11507 = null;
            }

            int var18 = var10 - class95.field1541;
            int var19 = var9 - class95.field1541;
            int var20 = var19 <= 0 ? 100 : var18 * 100 / var19;
            if (!var11 && ~var20 < -100) {
               var20 = 99;
            }

            return var20;
         }
      } catch (RuntimeException var22) {
         throw class612.method4503(var22, field4885[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method2632(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg1 != 27230) {
            this.field4874 = null;
         }

         ++field4883;
         if (~this.field4881 != ~this.field4873) {
            if (~this.field4873 == -2) {
               this.field4884 = ~this.field4871 != ~arg0;
               this.field4871 = arg0;
               return this.field4874[0];
            } else {
               class134 var4;
               label44: {
                  var4 = this.field4872[arg0];
                  if (var4 == null) {
                     label41: {
                        this.field4884 = true;
                        if (this.field4873 <= this.field4882) {
                           class134 var5 = (class134)this.field4877.method2243(arg1 + -27272);
                           var4 = new class134(arg0, var5.field2182);
                           this.field4872[var5.field2186] = null;
                           var5.method2140((byte)52);
                           if (!var3) {
                              break label41;
                           }
                        }

                        var4 = new class134(arg0, this.field4882);
                        ++this.field4882;
                     }

                     this.field4872[arg0] = var4;
                     if (!var3) {
                        break label44;
                     }
                  }

                  this.field4884 = false;
               }

               this.field4877.method2241(3, var4);
               return this.field4874[var4.field2182];
            }
         } else {
            this.field4884 = this.field4872[arg0] == null;
            this.field4872[arg0] = class5.field61;
            return this.field4874[arg0];
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4885[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2633(int arg0, int arg1, int arg2) {
      try {
         if (arg0 <= 5) {
            method2633(-14, 89, 125);
         }

         ++field4879;
         class111 var3 = class796.method5734(19, (long)arg2 | (long)arg1 << 32, (byte)-122);
         var3.method1083(-78);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4885[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2634(int arg0) {
      try {
         field4869 = null;
         if (arg0 != 19) {
            field4878 = null;
         }

         field4878 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4885[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class328(int arg0, int arg1, int arg2) {
      try {
         this.field4873 = arg0;
         this.field4881 = arg1;
         this.field4874 = new int[this.field4873][arg2];
         this.field4872 = new class134[this.field4881];
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4885[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2635(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2636(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
