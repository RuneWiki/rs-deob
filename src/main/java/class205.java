import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class205 extends class198 {
   @OriginalMember(
      owner = "client!li",
      name = "k",
      descriptor = "I"
   )
   private int field2614;
   @OriginalMember(
      owner = "client!li",
      name = "r",
      descriptor = "I"
   )
   private int field2612;
   @OriginalMember(
      owner = "client!li",
      name = "l",
      descriptor = "I"
   )
   private int field2615;
   @OriginalMember(
      owner = "client!li",
      name = "s",
      descriptor = "Lfm;"
   )
   private class281 field2619;
   @OriginalMember(
      owner = "client!li",
      name = "t",
      descriptor = "I"
   )
   private int field2620;
   @OriginalMember(
      owner = "client!li",
      name = "p",
      descriptor = "I"
   )
   private int field2613;
   @OriginalMember(
      owner = "client!li",
      name = "m",
      descriptor = "I"
   )
   private int field2622;
   @OriginalMember(
      owner = "client!li",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2623 = new String[]{method1700(method1699("w1\u000ew;")), method1700(method1699("w1\u000ey;")), method1700(method1699("`v\u000e\u0010n")), method1700(method1699("w1\u000e\u0002zu1T\u0000;")), method1700(method1699("u-LR")), method1700(method1699("w1\u000e};")), method1700(method1699("w1\u000ev;"))};
   @OriginalMember(
      owner = "client!li",
      name = "i",
      descriptor = "Lse;"
   )
   public static class6 field2621 = new class6(52, 15);
   @OriginalMember(
      owner = "client!li",
      name = "n",
      descriptor = "I"
   )
   public static int field2610;
   @OriginalMember(
      owner = "client!li",
      name = "o",
      descriptor = "I"
   )
   public static int field2611;
   @OriginalMember(
      owner = "client!li",
      name = "j",
      descriptor = "I"
   )
   public static int field2617;
   @OriginalMember(
      owner = "client!li",
      name = "u",
      descriptor = "I"
   )
   public static int field2618;
   @OriginalMember(
      owner = "client!li",
      name = "q",
      descriptor = "Ltt;"
   )
   private class531 field2616;

   @OriginalMember(
      owner = "client!li",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1696(int arg0) {
      try {
         field2621 = null;
         if (arg0 != 0) {
            field2621 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2623[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "a",
      descriptor = "(I)Ltt;"
   )
   public final class531 method1645(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field2618;
         if (this.field2616 == null) {
            class102 var3;
            boolean var4;
            int var5;
            int var9;
            label89: {
               class478.field6651[2] = this.field2614;
               class478.field6651[0] = this.field2620;
               class478.field6651[3] = this.field2622;
               var3 = this.field2619.field6667;
               class478.field6651[5] = this.field2615;
               class478.field6651[1] = this.field2613;
               class478.field6651[4] = this.field2612;
               var4 = false;
               var5 = 0;
               int var6 = 0;
               if (var2) {
                  if (!var3.method915(class478.field6651[var6], 126)) {
                     return null;
                  }
               } else if (~var6 <= -7) {
                  var9 = 0;
                  if (!var2) {
                     break label89;
                  }
               } else if (!var3.method915(class478.field6651[var6], 126)) {
                  return null;
               }

               while(true) {
                  class668 var7 = var3.method911(class478.field6651[var6], 93);
                  int var8 = var7.field9901 ? 64 : 128;
                  if (~var7.field9900 < -1) {
                     var4 = true;
                  }

                  if (var5 < var8) {
                     var5 = var8;
                  }

                  ++var6;
                  if (~var6 <= -7) {
                     var9 = 0;
                     if (!var2) {
                        break;
                     }
                  } else if (!var3.method915(class478.field6651[var6], 126)) {
                     return null;
                  }
               }
            }

            if (var2) {
               class108.field1441[var9] = var3.method913(var5, class478.field6651[var9], false, 123, 1.0F, var5);
               ++var9;
            }

            while(true) {
               while(~var9 > -7) {
                  class108.field1441[var9] = var3.method913(var5, class478.field6651[var9], false, 123, 1.0F, var5);
                  ++var9;
               }

               if (!var2) {
                  this.field2616 = this.field2619.method1427(var4, -8, var5, class108.field1441);
                  break;
               }

               ++var9;
            }
         }

         return arg0 != 8192 ? null : this.field2616;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field2623[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1697(int arg0, int arg1) {
      try {
         ++field2611;
         if (arg1 == 1) {
            if (~class157.field2022 == -8) {
               if (~class623.field9218 == -1 && ~class571.field8393 == -1) {
                  class139.field1755 = arg0;
                  class577.method4324((byte)-127, 9);
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2623[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method1698(int arg0) {
      try {
         ++field2617;
         class20.method155((byte)-128);
         class652.field9742 = false;
         if (arg0 != 0) {
            method1696(-9);
         }

         class436.method3369(class338.field4629, -127, class99.field1314, class664.field9834, class457.field6293);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2623[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "<init>",
      descriptor = "(Lfm;IIIIII)V"
   )
   public class205(class281 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field2614 = arg3;
         this.field2612 = arg5;
         this.field2615 = arg6;
         this.field2619 = arg0;
         this.field2620 = arg1;
         this.field2613 = arg2;
         this.field2622 = arg4;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field2623[3] + (arg0 != null ? field2623[2] : field2623[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1699(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!li",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1700(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
