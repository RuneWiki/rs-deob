import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class746 {
   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11059 = new String[]{method5438(method5437("s/c}81")), method5438(method5437("s/c}91")), method5438(method5437("bf,}\u0006")), method5438(method5437("w=n?")), method5438(method5437("s/c}:1"))};
   @OriginalMember(
      owner = "client!jga",
      name = "b",
      descriptor = "I"
   )
   public static int field11056 = 999999;
   @OriginalMember(
      owner = "client!jga",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field11058 = new int[3];
   @OriginalMember(
      owner = "client!jga",
      name = "e",
      descriptor = "F"
   )
   public static float field11057;
   @OriginalMember(
      owner = "client!jga",
      name = "c",
      descriptor = "I"
   )
   public static int field11054;
   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "I"
   )
   public static int field11055;

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(I)V",
      line = 12
   )
   public static void method5433(int arg0) {
      try {
         if (arg0 == 1) {
            field11058 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11059[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(ILjava/lang/String;Lha;IBIII)V",
      line = 24
   )
   public static final void method5434(int arg0, String arg1, class66 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
      int var8 = client.field4530;

      try {
         if (class179.field2206 == null || class611.field8961 == null) {
            label83: {
               if (class521.field7580.method3884((byte)-99, class309.field4397) && class521.field7580.method3884((byte)-99, class98.field1205)) {
                  class179.field2206 = arg2.method577(class671.method4894(class521.field7580, class309.field4397, 0), true);
                  class671 var9 = class671.method4894(class521.field7580, class98.field1205, 0);
                  class611.field8961 = arg2.method577(var9, true);
                  var9.method4886();
                  class417.field6387 = arg2.method577(var9, true);
                  if (var8 == 0) {
                     break label83;
                  }
               }

               arg2.method645(arg7, arg3, arg6, arg5, class198.field2462 | 255 - class430.field6581 << 24, 1);
            }
         }

         ++field11054;
         int var10 = 6 / ((arg4 - 8) / 45);
         if (class179.field2206 != null && class611.field8961 != null) {
            int var11 = (-(class611.field8961.method1965() * 2) + arg6) / class179.field2206.method1965();
            int var12 = 0;
            if (var8 != 0) {
               class179.field2206.method3035(class611.field8961.method1965() + arg7 + var12 * class179.field2206.method1965(), arg3);
               ++var12;
            }

            while(true) {
               while(~var11 < ~var12) {
                  class179.field2206.method3035(class611.field8961.method1965() + arg7 + var12 * class179.field2206.method1965(), arg3);
                  ++var12;
               }

               class611.field8961.method3035(arg7, arg3);
               class396 var10000 = class417.field6387;
               int var10001 = arg7 - (-arg6 - -class417.field6387.method1965());
               if (var8 == 0) {
                  var10000.method3035(var10001, arg3);
                  break;
               }

               var10000.method3035(var10001, arg3);
               ++var12;
            }
         }

         class524.field7616.method678(-16777216 | class354.field5370, arg7 + 3, -1, arg1, arg3 + 14, 0);
         arg2.method645(arg7, arg3 + arg5, arg6, arg0 - arg5, -class430.field6581 + 255 << 24 | class198.field2462, 1);
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field11059[4] + arg0 + ',' + (arg1 != null ? field11059[2] : field11059[3]) + ',' + (arg2 != null ? field11059[2] : field11059[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(III)Lnfa;",
      line = 72
   )
   public static final class707 method5435(int arg0, int arg1, int arg2) {
      class72 var3 = class353.field5360[arg0][arg1][arg2];
      return var3 == null ? null : var3.field922;
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(ZB)V",
      line = 79
   )
   public static final void method5436(boolean arg0, byte arg1) {
      try {
         ++field11055;
         if (arg1 == 35) {
            int var2 = class391.field5950;
            int var3 = class622.field9064;
            if (arg0 && class88.field1076) {
               var2 <<= 1;
               var3 = -var2;
            }

            class786.field11439.method625(var3, var2);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11059[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5437(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5438(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
