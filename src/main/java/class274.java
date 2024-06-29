import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class274 {
   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3765 = new String[]{method2095(method2094("n\u0012Q@a)")), method2095(method2094("n\u0012Q@f)")), method2095(method2094("n\u0012Q@Qn#D\u001cLo\u0017\u0018")), method2095(method2094("z^\u001e@X")), method2095(method2094("o\u0005\\\u0002")), method2095(method2094("n\u0012Q@d)")), method2095(method2094("=\u0013_\u0002\u0018g\u0016V\bCgN\u0010A\u0005")), method2095(method2094("!]\u000e")), method2095(method2094("n\u0012Q@g)"))};
   @OriginalMember(
      owner = "client!oba",
      name = "h",
      descriptor = "I"
   )
   public static int field3764 = 0;
   @OriginalMember(
      owner = "client!oba",
      name = "e",
      descriptor = "Leg;"
   )
   public static class118 field3760 = new class118(129, 0);
   @OriginalMember(
      owner = "client!oba",
      name = "g",
      descriptor = "I"
   )
   public static int field3757;
   @OriginalMember(
      owner = "client!oba",
      name = "c",
      descriptor = "I"
   )
   public static int field3759;
   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "I"
   )
   public static int field3761;
   @OriginalMember(
      owner = "client!oba",
      name = "b",
      descriptor = "I"
   )
   public static int field3762;
   @OriginalMember(
      owner = "client!oba",
      name = "f",
      descriptor = "Lha;"
   )
   public static class66 field3758;
   @OriginalMember(
      owner = "client!oba",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3763;

   @OriginalMember(
      owner = "client!oba",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field3761;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3765[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method2090(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4360;

      try {
         ++field3762;
         if (arg4 != -4945) {
            field3760 = null;
         }

         int var6 = 0;
         if (!var5 && ~class425.field6085 >= ~var6) {
            class193.method1520(arg2, -83, arg0 + arg2, arg1 + arg3, arg3);
         } else {
            do {
               Rectangle var7 = class763.field11268[var6];
               if (var7.x + var7.width > arg3 && var7.x < arg1 + arg3 && ~arg2 > ~(var7.y + var7.height) && arg0 + arg2 > var7.y) {
                  class301.field4123[var6] = true;
               }

               ++var6;
            } while(~class425.field6085 < ~var6);

            class193.method1520(arg2, -83, arg0 + arg2, arg1 + arg3, arg3);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field3765[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2091(int arg0) {
      try {
         class264.field3636 = null;
         class467.field6722 = null;
         class427.field6124 = null;
         class455.field6465 = null;
         class747.field11072 = null;
         class541.field7771 = null;
         ++field3757;
         class215.field3075 = null;
         if (arg0 != 19963) {
            field3760 = null;
         }

         class756.field11195 = null;
         class672.field9736 = null;
         class739.field10782 = null;
         class72.field886 = null;
         class432.field6169 = null;
         class438.field6258 = null;
         class211.field3015 = null;
         class79.field974 = null;
         class506.field7346 = null;
         class160.field2285 = null;
         class534.field7618 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3765[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method2092(int arg0, class66 arg1) {
      boolean var2 = client.field4360;

      try {
         ++field3759;
         if ((~class278.field3784 <= -3 || class613.field9015) && class182.field2549 == null) {
            String var3;
            label137: {
               if (class613.field9015 && class278.field3784 < 2) {
                  var3 = class198.field2816 + class180.field2511.method1437(class608.field8920, 50) + class37.field523 + field3765[7];
                  if (!var2) {
                     break label137;
                  }
               }

               if (!class445.field6335 || !class195.field2767.method1779(81, arg0 ^ 5231) || ~class278.field3784 >= -3) {
                  class32 var4 = class521.field7496;
                  if (var4 == null) {
                     return;
                  }

                  var3 = class149.method1239(var4, true);
                  int[] var5 = null;
                  if (!class743.method5383(0, var4.field458)) {
                     if (~var4.field463 != 0) {
                        var5 = class468.field6728.method2261(-1, var4.field463).field4867;
                     } else if (class606.method4408(var4.field458, 256)) {
                        class529 var6 = (class529)class328.field4479.method329((byte)126, (long)((int)var4.field456));
                        if (var6 != null) {
                           class506 var7 = var6.field7559;
                           class745 var8 = var7.field7333;
                           if (var8.field10912 != null) {
                              var8 = var8.method5405(class21.field248, -20);
                           }

                           if (var8 != null) {
                              var5 = var8.field10921;
                           }
                        }
                     } else if (class288.method2178(var4.field458, -1010)) {
                        Object var9 = null;
                        class259 var10;
                        if (var4.field458 != 1010) {
                           var10 = class387.field5618.method3977((int)(2147483647L & var4.field456 >>> 32), (byte)75);
                        } else {
                           var10 = class387.field5618.method3977((int)var4.field456, (byte)75);
                        }

                        if (var10.field3539 != null) {
                           var10 = var10.method1984(class21.field248, 21723);
                        }

                        if (var10 != null) {
                           var5 = var10.field3566;
                        }
                     }
                  } else {
                     var5 = class468.field6728.method2261(arg0 ^ 5131, (int)var4.field456).field4867;
                  }

                  if (var5 == null) {
                     break label137;
                  }

                  var3 = var3 + class189.method1498(var5, true);
                  if (!var2) {
                     break label137;
                  }
               }

               var3 = class149.method1239(class521.field7496, true);
            }

            if (class278.field3784 > 2) {
               var3 = var3 + field3765[6] + (class278.field3784 + -2) + class180.field2504.method1437(class608.field8920, arg0 ^ -5178);
            }

            label130: {
               if (class122.field1580 == null) {
                  if (class176.field2438 == null || class185.field2620 != class134.field1715) {
                     break label130;
                  }

                  int var11 = class455.field6465.method635(class284.field3939 + 16, class684.field10070, 0, 16777215, class682.field10042, class352.field4735, var3, class622.field9159, false, class564.field8046 + 4);
                  class525.method3800((byte)-122, 16, class564.field8046 + 4, class284.field3939, class467.field6723.method1635(var3, (byte)-81) - -var11);
                  if (!var2) {
                     break label130;
                  }
               }

               class67 var12 = class122.field1580.method4938(arg1, 0);
               if (var12 == null) {
                  var12 = class455.field6465;
               }

               var12.method617(5961, class30.field437, class622.field9159, class684.field10070, class122.field1580.field9858, var3, class122.field1580.field9980, class122.field1580.field9842, class22.field256, class122.field1580.field9949, class682.field10042, class352.field4735, class122.field1580.field9904, class122.field1580.field9916, class722.field10548);
               class525.method3800((byte)-122, class722.field10548[3], class722.field10548[0], class722.field10548[1], class722.field10548[2]);
            }

            if (arg0 != -5132) {
               method2093(true);
            }
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field3765[5] + arg0 + ',' + (arg1 != null ? field3765[3] : field3765[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2093(boolean arg0) {
      try {
         if (!arg0) {
            field3763 = null;
         }

         field3763 = null;
         field3760 = null;
         field3758 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3765[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2094(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2095(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
