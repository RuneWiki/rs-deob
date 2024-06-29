import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class590 {
   @OriginalMember(
      owner = "client!tv",
      name = "c",
      descriptor = "Lhha;"
   )
   private class549 field8150;
   @OriginalMember(
      owner = "client!tv",
      name = "f",
      descriptor = "I"
   )
   private int field8140;
   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "I"
   )
   private int field8131;
   @OriginalMember(
      owner = "client!tv",
      name = "v",
      descriptor = "Ldia;"
   )
   private class245 field8148;
   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8151 = new String[]{method4251(method4250("p8jg ")), method4251(method4250("p8jw ")), method4251(method4250("l;\"Pee ")), method4251(method4250("p8ju ")), method4251(method4250("n/#Qd")), method4251(method4250("n/'Zaf")), method4251(method4250("n/#B`a!6W")), method4251(method4250("`+0Wah=")), method4251(method4250("n/#[aw-")), method4251(method4250("w9wR")), method4251(method4250("l9wR")), method4251(method4250("n/#Rp")), method4251(method4250("j;(Z")), method4251(method4250("\u007f`j\u0018u")), method4251(method4250("p8j| ")), method4251(method4250("p8jz ")), method4251(method4250("wp'E")), method4251(method4250("p8j\u007f ")), method4251(method4250("p8jr ")), method4251(method4250("p8j{ ")), method4251(method4250("p8jp ")), method4251(method4250("[,(Wfo")), method4251(method4250("p8jx ")), method4251(method4250("[:+F")), method4251(method4250("h!#Qm`!1B")), method4251(method4250("p8j~ ")), method4251(method4250("p8jq ")), method4251(method4250("p8jt ")), method4251(method4250("p8js ")), method4251(method4250("p8j\naj'0\b ")), method4251(method4250("p8jf ")), method4251(method4250("p8jy ")), method4251(method4250("p8j} "))};
   @OriginalMember(
      owner = "client!tv",
      name = "j",
      descriptor = "I"
   )
   public static int field8130 = 52;
   @OriginalMember(
      owner = "client!tv",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field8144 = new int[1000];
   @OriginalMember(
      owner = "client!tv",
      name = "l",
      descriptor = "I"
   )
   public static int field8128;
   @OriginalMember(
      owner = "client!tv",
      name = "w",
      descriptor = "I"
   )
   public static int field8129;
   @OriginalMember(
      owner = "client!tv",
      name = "i",
      descriptor = "I"
   )
   public static int field8132;
   @OriginalMember(
      owner = "client!tv",
      name = "h",
      descriptor = "I"
   )
   public static int field8133;
   @OriginalMember(
      owner = "client!tv",
      name = "t",
      descriptor = "I"
   )
   public static int field8134;
   @OriginalMember(
      owner = "client!tv",
      name = "o",
      descriptor = "I"
   )
   public static int field8135;
   @OriginalMember(
      owner = "client!tv",
      name = "q",
      descriptor = "I"
   )
   public static int field8136;
   @OriginalMember(
      owner = "client!tv",
      name = "d",
      descriptor = "I"
   )
   public static int field8137;
   @OriginalMember(
      owner = "client!tv",
      name = "e",
      descriptor = "I"
   )
   public static int field8138;
   @OriginalMember(
      owner = "client!tv",
      name = "m",
      descriptor = "I"
   )
   public static int field8139;
   @OriginalMember(
      owner = "client!tv",
      name = "p",
      descriptor = "I"
   )
   public static int field8141;
   @OriginalMember(
      owner = "client!tv",
      name = "b",
      descriptor = "I"
   )
   public static int field8142;
   @OriginalMember(
      owner = "client!tv",
      name = "r",
      descriptor = "I"
   )
   public static int field8145;
   @OriginalMember(
      owner = "client!tv",
      name = "u",
      descriptor = "I"
   )
   public static int field8146;
   @OriginalMember(
      owner = "client!tv",
      name = "s",
      descriptor = "I"
   )
   public static int field8147;
   @OriginalMember(
      owner = "client!tv",
      name = "k",
      descriptor = "I"
   )
   public static int field8149;
   @OriginalMember(
      owner = "client!tv",
      name = "n",
      descriptor = "Lqh;"
   )
   public static class74 field8143;

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(ZIJLjava/lang/Object;)V"
   )
   public final void method4233(boolean arg0, int arg1, long arg2, Object arg3) {
      boolean var6 = client.field4273;

      RuntimeException var10000;
      label44: {
         boolean var10001;
         try {
            ++field8134;
            if (this.field8140 < arg1) {
               throw new IllegalStateException(field8151[16]);
            }

            this.method4235(100, arg2);
            this.field8131 -= arg1;
            if (arg0) {
               return;
            }
         } catch (RuntimeException var11) {
            var10000 = var11;
            var10001 = false;
            break label44;
         }

         while(true) {
            class86 var7;
            label39: {
               try {
                  if (this.field8131 < 0) {
                     var7 = (class86)this.field8150.method3966(false);
                     break label39;
                  }

                  var7 = new class509(arg3, arg1);
                  this.field8148.method1841(arg2, true, var7);
                  this.field8150.method3968(var7, (byte)-92);
                  var7.field7452 = 0L;
               } catch (RuntimeException var10) {
                  var10000 = var10;
                  var10001 = false;
                  break;
               }

               if (!var6) {
                  return;
               }
            }

            try {
               this.method4240(2, var7);
            } catch (RuntimeException var9) {
               var10000 = var9;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var8 = var10000;
      throw class534.method3846(var8, field8151[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8151[13] : field8151[12]) + ')');
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method4234(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(IJ)V"
   )
   private final void method4235(int arg0, long arg1) {
      try {
         ++field8149;
         if (arg0 != 100) {
            field8144 = null;
         }

         class86 var4 = (class86)this.field8148.method1839(-4, arg1);
         this.method4240(2, var4);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8151[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "b",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method4236(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field8147;
         class86 var3 = (class86)this.field8148.method1847(arg0 ^ -24446);
         if (arg0 != -24321) {
            return null;
         } else {
            Object var4;
            do {
               if (var3 == null) {
                  return null;
               }

               var4 = var3.method268((byte)123);
               if (var4 != null) {
                  break;
               }

               class86 var5 = var3;
               var3 = (class86)this.field8148.method1847(126);
               var5.method3609(111);
               var5.method3943(-4);
               this.field8131 += var5.field1110;
            } while(!var2);

            return var4;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8151[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method4237(byte arg0) {
      boolean var2 = client.field4273;

      try {
         ++field8138;
         int var3 = 0;
         class86 var4 = (class86)this.field8150.method3964((byte)71);
         if (var2) {
            if (!var4.method269(134)) {
               ++var3;
            }

            var4 = (class86)this.field8150.method3965(true);
         }

         while(true) {
            byte var10000;
            if (var4 == null) {
               var10000 = arg0;
               if (!var2) {
                  if (arg0 != 34) {
                     field8144 = null;
                  }

                  return var3;
               }
            } else {
               var10000 = var4.method269(134);
            }

            if (var10000 == 0) {
               ++var3;
            }

            var4 = (class86)this.field8150.method3965(true);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8151[27] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(ILjava/lang/Object;J)V"
   )
   public final void method4238(int arg0, Object arg1, long arg2) {
      try {
         this.method4233(false, 1, arg2, arg1);
         ++field8141;
         if (arg0 < 20) {
            this.field8131 = -27;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8151[14] + arg0 + ',' + (arg1 != null ? field8151[13] : field8151[12]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(JI)Ljava/lang/Object;"
   )
   public final Object method4239(long arg0, int arg1) {
      try {
         ++field8145;
         if (arg1 != 0) {
            return null;
         } else {
            class86 var4 = (class86)this.field8148.method1839(-122, arg0);
            if (var4 == null) {
               return null;
            } else {
               Object var5 = var4.method268((byte)-97);
               if (var5 == null) {
                  var4.method3609(120);
                  var4.method3943(-4);
                  this.field8131 += var4.field1110;
                  return null;
               } else {
                  if (var4.method269(134)) {
                     class509 var6 = new class509(var5, var4.field1110);
                     this.field8148.method1841(var4.field6862, true, var6);
                     this.field8150.method3968(var6, (byte)-103);
                     var6.field7452 = 0L;
                     var4.method3609(93);
                     var4.method3943(-4);
                     if (!client.field4273) {
                        return var5;
                     }
                  }

                  this.field8150.method3968(var4, (byte)-99);
                  var4.field7452 = 0L;
                  return var5;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8151[31] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(ILkl;)V"
   )
   private final void method4240(int arg0, class86 arg1) {
      try {
         ++field8136;
         if (arg1 != null) {
            arg1.method3609(arg0 ^ 84);
            arg1.method3943(-4);
            this.field8131 += arg1.field1110;
         }

         if (arg0 != 2) {
            this.method4241((byte)104);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8151[20] + arg0 + ',' + (arg1 != null ? field8151[13] : field8151[12]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method4241(byte arg0) {
      boolean var2 = client.field4273;

      try {
         if (arg0 != -71) {
            this.method4242(-124);
         }

         ++field8146;
         class86 var3 = (class86)this.field8148.method1850(0);
         if (!var2 && var3 == null) {
            return null;
         } else {
            Object var4;
            while(true) {
               var4 = var3.method268((byte)126);
               if (var4 != null) {
                  break;
               }

               class86 var5 = var3;
               var3 = (class86)this.field8148.method1847(122);
               var5.method3609(101);
               var5.method3943(arg0 ^ 69);
               this.field8131 += var5.field1110;
               if (var2) {
                  break;
               }

               if (var3 == null) {
                  return null;
               }
            }

            return var4;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8151[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4242(int arg0) {
      try {
         ++field8137;
         return arg0 != 0 ? 47 : this.field8131;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8151[28] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4243(byte arg0) {
      try {
         field8144 = null;
         field8143 = null;
         int var1 = 36 / ((arg0 - 63) / 47);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8151[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class590(int arg0) {
      this(arg0, arg0);
   }

   @OriginalMember(
      owner = "client!tv",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method4244(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method4245(boolean arg0) {
      try {
         this.field8150.method3970(117);
         if (!arg0) {
            this.field8131 = 109;
         }

         ++field8129;
         this.field8148.method1851(-68);
         this.field8131 = this.field8140;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8151[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public static final void method4246(class65 arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         if (arg1 != -87) {
            method4246((class65)null, (byte)-109);
         }

         class271.field3594 = new class686[class671.field9873.length];
         ++field8128;
         int var3 = 0;
         if (var2 || var3 < class671.field9873.length) {
            do {
               int var4 = class671.field9873[var3];
               class663 var5 = class287.method2176(var4, 44, class14.field185);
               class66 var6 = arg0.method496(var5, class267.method2046(class240.field2987, var4), true);
               class271.field3594[var3] = new class686(var6, var5);
               ++var3;
            } while(var3 < class671.field9873.length);

         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8151[19] + (arg0 != null ? field8151[13] : field8151[12]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(Ljava/lang/String;Lbj;IILjava/lang/String;)Lvea;"
   )
   public static final class289 method4247(String arg0, class255 arg1, int arg2, int arg3, String arg4) {
      try {
         ++field8139;
         int var5 = 19 / ((arg3 - -28) / 40);
         if (arg2 == 0) {
            return arg1.method1943(arg0, 26502);
         } else if (arg2 == 1) {
            try {
               Object var6 = class164.method1306(arg4, -29876, class126.field1586, new Object[]{(new URL(class126.field1586.getCodeBase(), arg0)).toString()});
               if (var6 == null) {
                  throw new RuntimeException();
               } else {
                  class289 var7 = new class289();
                  var7.field3826 = 1;
                  return var7;
               }
            } catch (Throwable var14) {
               class289 var8 = new class289();
               var8.field3826 = 2;
               return var8;
            }
         } else if (arg2 == 2) {
            try {
               class126.field1586.getAppletContext().showDocument(new URL(class126.field1586.getCodeBase(), arg0), field8151[21]);
               class289 var9 = new class289();
               var9.field3826 = 1;
               return var9;
            } catch (Exception var15) {
               class289 var10 = new class289();
               var10.field3826 = 2;
               return var10;
            }
         } else if (~arg2 == -4) {
            try {
               class164.method1307(-22955, class126.field1586, field8151[24]);
            } catch (Throwable var17) {
            }

            try {
               class126.field1586.getAppletContext().showDocument(new URL(class126.field1586.getCodeBase(), arg0), field8151[23]);
               class289 var11 = new class289();
               var11.field3826 = 1;
               return var11;
            } catch (Exception var16) {
               class289 var12 = new class289();
               var12.field3826 = 2;
               return var12;
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field8151[22] + (arg0 != null ? field8151[13] : field8151[12]) + ',' + (arg1 != null ? field8151[13] : field8151[12]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8151[13] : field8151[12]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "d",
      descriptor = "(B)I"
   )
   public static final int method4248(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field8133;
         if (~class42.field494 == -1) {
            class8.field85.method70(0, new class476(field8151[5]));
            if (~class8.field85.method73((byte)-123).method1010(true) != -101) {
               return 1;
            }

            if (!((class476)class8.field85.method73((byte)95)).method3475(-1)) {
               class15.field197.method800((byte)-90);
            }

            class42.field494 = 1;
         }

         if (~class42.field494 == -2) {
            class288.field3813 = class8.method72(false);
            class8.field84.method70(0, new class767(class150.field1959));
            class8.field86.method70(0, new class476(field8151[4]));
            class8.field87.method70(0, new class476(field8151[11]));
            class8.field88.method70(0, new class476(field8151[8]));
            class8.field89.method70(0, new class476(field8151[9]));
            class8.field90.method70(0, new class476(field8151[10]));
            class8.field91.method70(0, new class476(field8151[6]));
            class8.field92.method70(0, new class767(class226.field2842));
            class8.field93.method70(0, new class767(class462.field6334));
            class8.field94.method70(0, new class767(class532.field7277));
            class8.field95.method70(0, new class767(class156.field2009));
            class8.field96.method70(0, new class767(class335.field4809));
            class8.field97.method70(0, new class767(class281.field3754));
            class8.field98.method70(0, new class767(class737.field10752));
            class8.field99.method70(0, new class767(class355.field5060));
            class8.field100.method70(0, new class767(class310.field4108));
            class8.field101.method70(0, new class767(class12.field144));
            class8.field102.method70(0, new class767(class771.field11128));
            class8.field103.method70(0, new class767(class698.field10188));
            class8.field104.method70(0, new class767(class554.field7626));
            class8.field105.method70(0, new class767(class92.field1232));
            class8.field106.method70(0, new class119(class327.field4426, field8151[2]));
            class8.field107.method70(0, new class767(class21.field261));
            class8.field108.method70(0, new class767(class694.field10159));
            class8.field109.method70(0, new class767(class194.field2365));
            class8.field110.method70(0, new class612(class554.field7627, field8151[7]));
            int var2 = 0;
            if (var1) {
               if (class288.field3813[var2].method73((byte)-57) == null) {
                  throw new RuntimeException();
               }

               ++var2;
            }

            while(true) {
               while(var2 < class288.field3813.length) {
                  if (class288.field3813[var2].method73((byte)-57) == null) {
                     throw new RuntimeException();
                  }

                  ++var2;
               }

               int var3 = 0;
               class8[] var4 = class288.field3813;
               int var5 = 0;
               if (!var1) {
                  if (var1 || ~var5 > ~var4.length) {
                     do {
                        class8 var6 = var4[var5];
                        int var7 = var6.method65(71);
                        int var8 = var6.method73((byte)-127).method1010(true);
                        var3 += var7 * var8 / 100;
                        ++var5;
                     } while(~var5 > ~var4.length);
                  }

                  class356.field5078 = var3;
                  class42.field494 = 2;
                  break;
               }

               ++var2;
            }
         }

         if (class288.field3813 == null) {
            return 100;
         } else {
            int var9 = 0;
            if (arg0 < 69) {
               method4246((class65)null, (byte)-92);
            }

            int var10 = 0;
            boolean var11 = true;
            class8[] var12 = class288.field3813;
            int var13 = 0;
            class8 var14;
            int var15;
            int var16;
            if (var1) {
               var14 = var12[var13];
               var15 = var14.method65(121);
               var16 = var14.method73((byte)100).method1010(true);
               if (~var16 > -101) {
                  var11 = false;
               }

               var10 += var15 * var16 / 100;
               var9 += var15;
               ++var13;
            }

            while(var13 < var12.length) {
               var14 = var12[var13];
               var15 = var14.method65(121);
               var16 = var14.method73((byte)100).method1010(true);
               if (~var16 > -101) {
                  var11 = false;
               }

               var10 += var15 * var16 / 100;
               var9 += var15;
               ++var13;
            }

            if (var11) {
               if (!((class476)class8.field88.method73((byte)111)).method3475(-1)) {
                  class15.field197.method797(104);
               }

               if (!((class476)class8.field91.method73((byte)91)).method3475(-1)) {
                  class46.field534 = class15.field197.method799(0);
               }

               class288.field3813 = null;
            }

            int var17 = var9 - class356.field5078;
            int var18 = var10 - class356.field5078;
            int var19 = ~var17 < -1 ? var18 * 100 / var17 : 100;
            if (!var11 && var19 > 99) {
               var19 = 99;
            }

            return var19;
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field8151[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method4249(int arg0) {
      try {
         ++field8132;
         return arg0 != 5283 ? -45 : this.field8140;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8151[30] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class590(int arg0, int arg1) {
      this.field8150 = new class549();

      try {
         this.field8140 = arg0;
         this.field8131 = arg0;

         int var3;
         for(var3 = 1; arg0 > var3 - -var3 && var3 < arg1; var3 += var3) {
         }

         this.field8148 = new class245(var3);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8151[29] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4250(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4251(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
