import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class337 extends class191 {
   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4996 = new String[]{method2699(method2698("Tf\u0015\u0012")), method2699(method2698("A=WP7")), method2699(method2698("WpW=b")), method2699(method2698("WpW8b")), method2699(method2698("WpW;b")), method2699(method2698("WpW<b"))};
   @OriginalMember(
      owner = "client!mc",
      name = "s",
      descriptor = "I"
   )
   public static int field4991 = 1;
   @OriginalMember(
      owner = "client!mc",
      name = "n",
      descriptor = "I"
   )
   public static int field4992 = -60;
   @OriginalMember(
      owner = "client!mc",
      name = "m",
      descriptor = "I"
   )
   public static int field4988;
   @OriginalMember(
      owner = "client!mc",
      name = "p",
      descriptor = "I"
   )
   public static int field4989;
   @OriginalMember(
      owner = "client!mc",
      name = "o",
      descriptor = "I"
   )
   private int field4993;
   @OriginalMember(
      owner = "client!mc",
      name = "r",
      descriptor = "I"
   )
   public static int field4995;
   @OriginalMember(
      owner = "client!mc",
      name = "q",
      descriptor = "Lqaa;"
   )
   public static class119 field4990;
   @OriginalMember(
      owner = "client!mc",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   private String field4994;

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         if (arg1 >= -97) {
            method2695(79, -123, 10, (class565)null, (class565)null);
         }

         this.field4993 = arg0.method701(255);
         ++field4995;
         this.field4994 = arg0.method640((byte)51);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4996[2] + (arg0 != null ? field4996[1] : field4996[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         ++field4989;
         if (arg0 >= -106) {
            field4990 = null;
         }

         arg1.method3536(this.field4994, (byte)72, this.field4993);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4996[5] + arg0 + ',' + (arg1 != null ? field4996[1] : field4996[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(IIILjf;Ljf;)V"
   )
   public static final void method2695(int arg0, int arg1, int arg2, class565 arg3, class565 arg4) {
      class312 var5 = class366.method2886(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field4688 = arg3;
         var5.field4689 = arg4;
         int var6 = class634.field8989 == class225.field3197 ? 1 : 0;
         if (arg3.method725(-6664)) {
            if (arg3.method723(-27)) {
               arg3.field6823 = class705.field10147[var6];
               class705.field10147[var6] = arg3;
            } else {
               arg3.field6823 = class615.field8739[var6];
               class615.field8739[var6] = arg3;
               class248.field3804 = true;
            }
         } else {
            arg3.field6823 = class399.field5912[var6];
            class399.field5912[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method725(-6664)) {
               if (arg4.method723(-118)) {
                  arg4.field6823 = class705.field10147[var6];
                  class705.field10147[var6] = arg4;
                  return;
               }

               arg4.field6823 = class615.field8739[var6];
               class615.field8739[var6] = arg4;
               class248.field3804 = true;
               return;
            }

            arg4.field6823 = class399.field5912[var6];
            class399.field5912[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2696(byte arg0) {
      try {
         field4990 = null;
         int var1 = 125 / ((arg0 - 5) / 56);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4996[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2697(int arg0, int arg1) {
      try {
         ++field4988;
         class111 var2 = class796.method5734(4, (long)arg0, (byte)-118);
         var2.method1083(-25);
         if (arg1 < 77) {
            field4992 = 5;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4996[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2698(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2699(char[] arg0) {
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
            var10005 = 19;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
