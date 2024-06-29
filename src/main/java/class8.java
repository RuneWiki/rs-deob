import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class465 {
   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field132 = new String[]{method80(method79("{vv\u00024")), method80(method79("{vv\u00074")), method80(method79("{vv\f4")), method80(method79("{vv\u00034")), method80(method79("{vv\u00004")), method80(method79("{vv\u00054")), method80(method79("{vv\u00014")), method80(method79("t7vja")), method80(method79("{vv\u000e4")), method80(method79("al4(")), method80(method79("{vv\r4")), method80(method79("{vv\u00064"))};
   @OriginalMember(
      owner = "client!to",
      name = "l",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field129 = new Color[]{new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277)};
   @OriginalMember(
      owner = "client!to",
      name = "i",
      descriptor = "I"
   )
   public static int field122;
   @OriginalMember(
      owner = "client!to",
      name = "m",
      descriptor = "I"
   )
   public static int field123;
   @OriginalMember(
      owner = "client!to",
      name = "o",
      descriptor = "I"
   )
   public static int field124;
   @OriginalMember(
      owner = "client!to",
      name = "n",
      descriptor = "I"
   )
   public static int field125;
   @OriginalMember(
      owner = "client!to",
      name = "k",
      descriptor = "I"
   )
   public static int field126;
   @OriginalMember(
      owner = "client!to",
      name = "f",
      descriptor = "I"
   )
   public static int field127;
   @OriginalMember(
      owner = "client!to",
      name = "h",
      descriptor = "I"
   )
   public static int field128;
   @OriginalMember(
      owner = "client!to",
      name = "g",
      descriptor = "I"
   )
   public static int field130;
   @OriginalMember(
      owner = "client!to",
      name = "j",
      descriptor = "I"
   )
   public static int field131;

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(Z)V",
      line = 3
   )
   public final void method69(boolean arg0) {
      try {
         ++field131;
         if (super.field6980.field9464.method4223((byte)87) && !class638.method4593(-341283472, super.field6980.field9464.method4225(108))) {
            super.field6984 = 0;
         }

         if (super.field6984 < 0 || super.field6984 > 2) {
            super.field6984 = this.method78(16726277);
         }

         if (arg0) {
            field129 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field132[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(IB)I",
      line = 20
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = 38 / ((arg1 - -51) / 60);
         ++field125;
         return !class638.method4593(-341283472, super.field6980.field9464.method4225(89)) ? 3 : 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field132[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 34
   )
   public class8(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(IIFIIIIIZ)[[I",
      line = 38
   )
   public static final int[][] method71(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
      int var9 = client.field4530;

      try {
         ++field126;
         int[][] var10 = new int[arg4][arg6];
         class309 var11 = new class309();
         var11.field4386 = arg7;
         var11.field4400 = arg1;
         var11.field4384 = (int)(arg2 * 4096.0F);
         var11.field4393 = arg8;
         if (arg0 > -4) {
            field129 = null;
         }

         var11.field4387 = arg5;
         var11.method708((byte)-106);
         class92.method845(arg4, -1115237556, arg6);
         int var12 = 0;
         if (var9 != 0) {
            var11.method2335(var10[var12], (byte)81, var12);
            ++var12;
         }

         while(true) {
            while(~var12 > ~arg4) {
               var11.method2335(var10[var12], (byte)81, var12);
               ++var12;
            }

            if (var9 == 0) {
               return var10;
            }

            ++var12;
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field132[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "b",
      descriptor = "(I)I",
      line = 71
   )
   public final int method72(int arg0) {
      try {
         if (arg0 < 81) {
            field129 = null;
         }

         ++field122;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field132[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "c",
      descriptor = "(Z)Z",
      line = 83
   )
   public final boolean method73(boolean arg0) {
      try {
         ++field123;
         if (arg0) {
            return false;
         } else {
            return class638.method4593(-341283472, super.field6980.field9464.method4225(106));
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field132[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I",
      line = 99
   )
   public static final int method74(String arg0, int arg1) {
      int var2 = client.field4530;

      try {
         ++field128;
         if (arg1 <= 6) {
            field129 = null;
         }

         int var3 = 0;
         if (var2 != 0) {
            if (class574.field8547[var3].equalsIgnoreCase(arg0)) {
               return var3;
            }

            ++var3;
         }

         while(true) {
            while(~var3 > ~class574.field8547.length) {
               if (class574.field8547[var3].equalsIgnoreCase(arg0)) {
                  return var3;
               }

               ++var3;
            }

            if (var2 == 0) {
               return -1;
            }

            if (-1 != 0) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field132[8] + (arg0 != null ? field132[7] : field132[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "d",
      descriptor = "(Z)V",
      line = 120
   )
   public static void method75(boolean arg0) {
      try {
         if (!arg0) {
            method75(false);
         }

         field129 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field132[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "c",
      descriptor = "(I)V",
      line = 133
   )
   public static final void method76(int arg0) {
      try {
         ++field127;
         if (class367.field5530) {
            class544 var1 = class241.method1793(-1, class200.field2500, class209.field2658);
            if (arg0 == 30687) {
               if (var1 != null && var1.field7914 != null) {
                  class662 var2 = new class662();
                  var2.field9589 = var1;
                  var2.field9595 = var1.field7914;
                  class265.method2019(var2);
               }

               class444.field6754 = -1;
               class192.field2407 = -1;
               class367.field5530 = false;
               if (var1 != null) {
                  class140.method1188(var1, (byte)-124);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field132[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "b",
      descriptor = "(II)V",
      line = 164
   )
   public final void method77(int arg0, int arg1) {
      try {
         ++field130;
         super.field6984 = arg1;
         if (arg0 != -14812) {
            field129 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field132[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 177
   )
   public class8(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(I)I",
      line = 180
   )
   public final int method78(int arg0) {
      try {
         ++field124;
         return arg0 != 16726277 ? -39 : 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field132[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method79(String arg0) {
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
   private static String method80(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
