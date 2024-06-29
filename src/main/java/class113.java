import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class113 {
   @OriginalMember(
      owner = "client!naa",
      name = "c",
      descriptor = "I"
   )
   private int field1548;
   @OriginalMember(
      owner = "client!naa",
      name = "e",
      descriptor = "I"
   )
   public int field1541;
   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1550 = new String[]{method1064(method1063("\u0003\u0014F\u000bg\u0002&SWz\u0003\u0012\u000f")), method1064(method1063("\u0003\u0014F\u000bRE")), method1064(method1063("\u0003\u0014F\u000bPE")), method1064(method1063("\u0003\u0000KI")), method1064(method1063("\u0016[\t\u000bn")), method1064(method1063("\u0003\u0014F\u000b/\u0004\u001bNQ-E")), method1064(method1063("\u0003\u0014F\u000bWE")), method1064(method1063("\u0003\u0014F\u000bQE")), method1064(method1063("\u0003\u0014F\u000bVE"))};
   @OriginalMember(
      owner = "client!naa",
      name = "b",
      descriptor = "Lhr;"
   )
   public static class666 field1543 = new class666();
   @OriginalMember(
      owner = "client!naa",
      name = "d",
      descriptor = "Lnaa;"
   )
   public static class113 field1546 = new class113(51, -1);
   @OriginalMember(
      owner = "client!naa",
      name = "g",
      descriptor = "I"
   )
   public static int field1540;
   @OriginalMember(
      owner = "client!naa",
      name = "i",
      descriptor = "I"
   )
   public static int field1542;
   @OriginalMember(
      owner = "client!naa",
      name = "f",
      descriptor = "I"
   )
   public static int field1544;
   @OriginalMember(
      owner = "client!naa",
      name = "j",
      descriptor = "I"
   )
   public static int field1545;
   @OriginalMember(
      owner = "client!naa",
      name = "h",
      descriptor = "I"
   )
   public static int field1547;
   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field1549;

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(ILica;)Lsw;"
   )
   public static final class70 method1058(int arg0, class354 arg1) {
      boolean var2 = client.field1786;

      try {
         ++field1540;
         arg1.method2855(arg0 + -60551);
         if (arg0 != 29544) {
            return null;
         } else {
            int var3 = arg1.method2855(-31007);
            class70 var4 = class637.method4651(var3, -39);
            var4.field920 = arg1.method2855(-31007);
            int var5 = arg1.method2855(-31007);
            int var6 = 0;
            if (!var2 && ~var6 <= ~var5) {
               var4.method275(false);
               return var4;
            } else {
               do {
                  int var7 = arg1.method2855(-31007);
                  var4.method274(arg0 + -29545, var7, arg1);
                  ++var6;
               } while(~var6 > ~var5);

               var4.method275(false);
               return var4;
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field1550[2] + arg0 + ',' + (arg1 != null ? field1550[4] : field1550[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(ILuaa;IZ[I)V"
   )
   public static final void method1059(int arg0, class119 arg1, int arg2, boolean arg3, int[] arg4) {
      boolean var5 = client.field1786;

      try {
         if (arg1.field1603 != null) {
            class366 var8;
            int var10000;
            label174: {
               byte var6 = 1;
               int var7 = 0;
               if (var5) {
                  var10000 = arg4[var7];
               } else if (~arg1.field1603.length >= ~var7) {
                  var8 = arg1.field1657;
                  var10000 = var6;
                  if (!var5) {
                     break label174;
                  }
               } else {
                  var10000 = arg4[var7];
               }

               label173:
               do {
                  while(true) {
                     if (var10000 != arg1.field1603[var7]) {
                        var6 = 0;
                        if (!var5) {
                           var8 = arg1.field1657;
                           var10000 = var6;
                           break;
                        }

                        ++var7;
                     } else {
                        ++var7;
                     }

                     if (~arg1.field1603.length >= ~var7) {
                        var8 = arg1.field1657;
                        var10000 = var6;
                        if (!var5) {
                           break label173;
                        }
                     } else {
                        var10000 = arg4[var7];
                     }
                  }
               } while(var5);
            }

            if (var10000 != 0 && var8.method2991(125)) {
               class82 var9 = arg1.field1657.method2975(false);
               int var10 = var9.field1186;
               if (~var10 == -2) {
                  var8.method2976(-113, arg2);
               }

               if (var10 == 2) {
                  var8.method2980(0);
               }
            }
         }

         ++field1544;
         boolean var11 = true;
         if (arg0 != 2) {
            method1058(49, (class354)null);
         }

         int var12 = 0;
         if (var5) {
            if (~arg4[var12] != 0) {
               var11 = false;
            }
         } else if (arg4.length <= var12) {
            if (!var5) {
               if (var11) {
                  arg1.field1603 = arg4;
                  arg1.field1657.method2996(arg2, (byte)-52);
                  if (arg3) {
                     arg1.field1690 = arg1.field1688;
                     return;
                  }
               }

               return;
            }

            if (var11) {
               var11 = false;
            }
         } else if (~arg4[var12] != 0) {
            var11 = false;
         }

         while(true) {
            if (arg1.field1603 != null) {
               if (~arg1.field1603[var12] != 0) {
                  if (class314.field4861.method4845(arg4[var12], false).field1165 >= class314.field4861.method4845(arg1.field1603[var12], false).field1165) {
                     arg1.field1603 = arg4;
                     arg1.field1657.method2996(arg2, (byte)-52);
                     if (arg3) {
                        arg1.field1690 = arg1.field1688;
                     }

                     ++var12;
                  } else {
                     ++var12;
                  }
               } else {
                  arg1.field1603 = arg4;
                  arg1.field1657.method2996(arg2, (byte)-52);
                  if (arg3) {
                     arg1.field1690 = arg1.field1688;
                  }

                  ++var12;
               }
            } else {
               arg1.field1603 = arg4;
               arg1.field1657.method2996(arg2, (byte)-52);
               if (arg3) {
                  arg1.field1690 = arg1.field1688;
               }

               ++var12;
            }

            if (arg4.length <= var12) {
               if (!var5) {
                  if (var11) {
                     arg1.field1603 = arg4;
                     arg1.field1657.method2996(arg2, (byte)-52);
                     if (arg3) {
                        arg1.field1690 = arg1.field1688;
                        return;
                     }
                  }

                  return;
               }

               if (var11) {
                  var11 = false;
               }
            } else if (~arg4[var12] != 0) {
               var11 = false;
            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field1550[8] + arg0 + ',' + (arg1 != null ? field1550[4] : field1550[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1550[4] : field1550[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field1542;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1550[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1060(boolean arg0) {
      try {
         field1549 = null;
         if (arg0) {
            field1546 = null;
            field1543 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1550[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1061(int arg0) {
      try {
         ++field1545;
         if (arg0 != 1) {
            field1543 = null;
         }

         return this.field1548;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1550[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method1062(int arg0, int arg1, int arg2) {
      try {
         ++field1547;
         int var3 = 1;

         while(arg2 > 1) {
            if ((1 & arg2) != 0) {
               var3 = arg0 * var3;
            }

            arg2 >>= 1;
            arg0 *= arg0;
         }

         int var4 = -127 / ((arg1 - -36) / 42);
         if (~arg2 == -2) {
            return arg0 * var3;
         } else {
            return var3;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1550[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class113(int arg0, int arg1) {
      try {
         this.field1548 = arg0;
         this.field1541 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1550[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1063(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1064(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
