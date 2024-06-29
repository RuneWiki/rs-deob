import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class447 extends class759 {
   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6529 = new String[]{method3370(method3369("v\u000f(\u0014P7")), method3370(method3369("v\u000f(\u0014S7"))};
   @OriginalMember(
      owner = "client!ifa",
      name = "h",
      descriptor = "I"
   )
   public static int field6524 = 0;
   @OriginalMember(
      owner = "client!ifa",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field6526 = false;
   @OriginalMember(
      owner = "client!ifa",
      name = "g",
      descriptor = "I"
   )
   public static int field6528 = 0;
   @OriginalMember(
      owner = "client!ifa",
      name = "k",
      descriptor = "I"
   )
   public static int field6525;
   @OriginalMember(
      owner = "client!ifa",
      name = "i",
      descriptor = "I"
   )
   public static int field6527;

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(Lr;III[Z)Z"
   )
   public static final boolean method3366(class192 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      boolean var5 = false;
      if (class455.field6647 != class269.field3810) {
         int var6 = class530.field7721[arg1].method2287(57, arg3, arg2);

         for(int var7 = 0; var7 <= arg1; ++var7) {
            class293 var8 = class530.field7721[var7];
            if (var8 != null) {
               int var9 = var6 - var8.method2287(-64, arg3, arg2);
               if (arg4 != null) {
                  arg4[var7] = var8.method2277(arg0, arg2, var9, arg3, 0, false);
                  if (!arg4[var7]) {
                     continue;
                  }
               }

               var8.method2285(arg0, arg2, var9, arg3, 0, false);
               var5 = true;
            }
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(ZIII)I"
   )
   public static final int method3367(boolean arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         ++field6527;
         class349 var5 = class190.method1656((byte)61, arg0, arg2);
         if (var5 == null) {
            return 0;
         } else if (arg3 == -1) {
            return 0;
         } else {
            int var6 = 0;
            if (arg1 != -1596) {
               field6526 = true;
            }

            int var7 = 0;
            if (var4) {
               if (arg3 == var5.field4963[var7]) {
                  var6 += var5.field4964[var7];
               }

               ++var7;
            }

            while(true) {
               int var10000;
               if (~var5.field4964.length >= ~var7) {
                  var10000 = var6;
                  if (!var4) {
                     return var6;
                  }
               } else {
                  var10000 = arg3;
               }

               if (var10000 == var5.field4963[var7]) {
                  var6 += var5.field4964[var7];
               }

               ++var7;
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field6529[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3368(int arg0, int arg1, int arg2) {
      try {
         ++field6525;
         if (class352.method2708(109)) {
            if (class733.field10535 != arg2) {
               class154.field2452 = "";
            }

            class475.field6939 = arg0;
            class733.field10535 = arg2;
            class645.method4735(arg1, -116);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6529[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3369(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3370(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
