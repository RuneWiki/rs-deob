import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class639 extends class96 {
   @OriginalMember(
      owner = "client!tga",
      name = "h",
      descriptor = "Lqk;"
   )
   public class419 field9251;
   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9252 = new String[]{method4670(method4669("iohsq5")), method4670(method4669("f&'sK")), method4670(method4669("s}e1")), method4670(method4669("=4j2Z no;P{n7c")), method4670(method4669("iohsu5")), method4670(method4669("iohs\ntf`)\b5")), method4670(method4669("rxl3\\n")), method4670(method4669("iohss5")), method4670(method4669("iohst5")), method4670(method4669("iohsp5")), method4670(method4669("iohsw5")), method4670(method4669("iohsr5"))};
   @OriginalMember(
      owner = "client!tga",
      name = "l",
      descriptor = "I"
   )
   public static int field9243;
   @OriginalMember(
      owner = "client!tga",
      name = "m",
      descriptor = "I"
   )
   public static int field9244;
   @OriginalMember(
      owner = "client!tga",
      name = "j",
      descriptor = "I"
   )
   public static int field9246;
   @OriginalMember(
      owner = "client!tga",
      name = "p",
      descriptor = "I"
   )
   public static int field9247;
   @OriginalMember(
      owner = "client!tga",
      name = "i",
      descriptor = "I"
   )
   public static int field9248;
   @OriginalMember(
      owner = "client!tga",
      name = "k",
      descriptor = "I"
   )
   public static int field9249;
   @OriginalMember(
      owner = "client!tga",
      name = "n",
      descriptor = "Luha;"
   )
   public static class514 field9250;
   @OriginalMember(
      owner = "client!tga",
      name = "o",
      descriptor = "Lrr;"
   )
   public static class678 field9245;

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method4662(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 7371) {
            method4662(127, 14, 83);
         }

         ++field9244;
         return ~(34 & arg0) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9252[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(Ljava/lang/String;ILsu;I)Lbja;",
      line = 15
   )
   public static final class275 method4663(String arg0, int arg1, class289 arg2, int arg3) {
      try {
         if (arg3 != 0) {
            return null;
         } else {
            ++field9249;
            return class785.method5700(field9252[6], arg1, -59, arg2, arg0);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9252[7] + (arg0 != null ? field9252[1] : field9252[2]) + ',' + arg1 + ',' + (arg2 != null ? field9252[1] : field9252[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(Lds;I)Ljava/lang/String;",
      line = 29
   )
   public static final String method4664(class525 arg0, int arg1) {
      try {
         ++field9247;
         if (arg1 != 13241) {
            field9245 = null;
         }

         return arg0.field8002 + field9252[3];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9252[4] + (arg0 != null ? field9252[1] : field9252[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "b",
      descriptor = "(III)V",
      line = 40
   )
   public static final void method4665(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         label147: {
            if (!(class60.field751 < class60.field748)) {
               if (!(class60.field748 < class60.field751)) {
                  break label147;
               }

               class60.field751 = (float)((double)class60.field751 - (double)class60.field751 / 30.0D);
               if (class60.field748 > class60.field751) {
                  class60.field751 = class60.field748;
               }

               class240.method2043(-1);
               class60.field749 = (int)class60.field751 >> 1;
               class60.field746 = class329.method2684(true, class60.field749);
               if (!var3) {
                  break label147;
               }
            }

            class60.field751 = (float)((double)class60.field751 / 30.0D + (double)class60.field751);
            if (class60.field748 < class60.field751) {
               class60.field751 = class60.field748;
            }

            class240.method2043(arg0);
            class60.field749 = (int)class60.field751 >> 1;
            class60.field746 = class329.method2684(true, class60.field749);
         }

         ++field9246;
         if (class177.field2774 != arg0 && class230.field3525 != -1) {
            int var4 = class177.field2774 - class354.field5389;
            if (var4 < 2 || ~var4 < -3) {
               var4 /= 8;
            }

            int var5 = -class546.field8195 + class230.field3525;
            if (var5 < 2 || var5 > 2) {
               var5 /= 8;
            }

            class354.field5389 += var4;
            if (var4 == 0 && var5 == 0) {
               class230.field3525 = -1;
               class177.field2774 = -1;
            }

            class546.field8195 += var5;
            class240.method2043(arg0);
         }

         label121: {
            if (class475.field7231 > 0) {
               --class241.field3658;
               if (~class241.field3658 != -1) {
                  break label121;
               }

               --class475.field7231;
               class241.field3658 = 100;
               if (!var3) {
                  break label121;
               }
            }

            class600.field8790 = -1;
            class739.field10981 = -1;
         }

         if (class633.field9158 && class788.field11542 != null) {
            class719 var6 = (class719)class788.field11542.method4972((byte)-84);
            if (var3 || var6 != null) {
               do {
                  label110: {
                     class77 var7 = class60.field744.method133(var6.field10774.field332, 36);
                     if (var6.method5318(arg0 + 15795, arg1, arg2)) {
                        if (var7.field997 != null) {
                           if (var7.field997[4] != null) {
                              class91.method921(-1, true, (long)var6.field10774.field332, var7.field1003, true, false, false, -1, var7.field997[4], var7.field985, 0, (long)var6.field10774.field332, 1012);
                           }

                           if (var7.field997[3] != null) {
                              class91.method921(-1, true, (long)var6.field10774.field332, var7.field1003, true, false, false, -1, var7.field997[3], var7.field985, 0, (long)var6.field10774.field332, 1001);
                           }

                           if (var7.field997[2] != null) {
                              class91.method921(-1, true, (long)var6.field10774.field332, var7.field1003, true, false, false, -1, var7.field997[2], var7.field985, 0, (long)var6.field10774.field332, 1009);
                           }

                           if (var7.field997[1] != null) {
                              class91.method921(-1, true, (long)var6.field10774.field332, var7.field1003, true, false, false, -1, var7.field997[1], var7.field985, 0, (long)var6.field10774.field332, 1006);
                           }

                           if (var7.field997[0] != null) {
                              class91.method921(-1, true, (long)var6.field10774.field332, var7.field1003, true, false, false, -1, var7.field997[0], var7.field985, 0, (long)var6.field10774.field332, 1003);
                           }
                        }

                        if (!var6.field10774.field333) {
                           var6.field10774.field333 = true;
                           class469.method3645(class409.field6378, var6.field10774.field332, var7.field1003);
                        }

                        if (!var6.field10774.field333) {
                           break label110;
                        }

                        class469.method3645(class212.field3223, var6.field10774.field332, var7.field1003);
                        if (!var3) {
                           break label110;
                        }
                     }

                     if (var6.field10774.field333) {
                        var6.field10774.field333 = false;
                        class469.method3645(class78.field1039, var6.field10774.field332, var7.field1003);
                     }
                  }

                  var6 = (class719)class788.field11542.method4975((byte)94);
               } while(var6 != null);

            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9252[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(Z)V",
      line = 179
   )
   public static final void method4666(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(B)V",
      line = 4563
   )
   public static void method4667(byte arg0) {
      try {
         if (arg0 != -22) {
            method4664((class525)null, 68);
         }

         field9250 = null;
         field9245 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9252[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(BLfq;Lha;)V",
      line = 4578
   )
   public static final void method4668(byte arg0, class374 arg1, class610 arg2) {
      try {
         if (arg0 != 92) {
            method4662(70, 81, -77);
         }

         ++field9243;
         boolean var3 = class247.field3763.method2049(arg1.field5875 ? class476.field7251.field98 : null, arg2, arg1.field5808, arg1.field5927, arg1.field5935, (byte)28, arg1.field5958, -16777216 | arg1.field5955) == null;
         if (var3) {
            class581.field8574.method4980(new class674(arg1.field5927, arg1.field5958, arg1.field5808, -16777216 | arg1.field5955, arg1.field5935, arg1.field5875), arg0 ^ 92);
            class573.method4310((byte)-82, arg1);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9252[8] + arg0 + ',' + (arg1 != null ? field9252[1] : field9252[2]) + ',' + (arg2 != null ? field9252[1] : field9252[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "<init>",
      descriptor = "(Lc;II[B)V",
      line = 4596
   )
   public class639(class652 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field9251 = class425.method3369(arg1, arg0, arg3, (byte)77, 6406, arg2, 6406, false);
         this.field9251.method3192(false, false, false);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9252[5] + (arg0 != null ? field9252[1] : field9252[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9252[1] : field9252[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4669(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4670(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
