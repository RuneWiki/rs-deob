import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class612 {
   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9016 = new String[]{method4514(method4513("~L\u0002\u0012%")), method4514(method4513("~L\u0002\u0011%"))};
   @OriginalMember(
      owner = "client!dn",
      name = "c",
      descriptor = "I"
   )
   public static int field9012 = 2;
   @OriginalMember(
      owner = "client!dn",
      name = "d",
      descriptor = "I"
   )
   public static int field9014;
   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "I"
   )
   public static int field9015;
   @OriginalMember(
      owner = "client!dn",
      name = "b",
      descriptor = "J"
   )
   public static long field9013;

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method4511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         ++field9014;
         if (arg0 > -68) {
            method4512(-39);
         }

         int var8 = -arg1 + arg6;
         int var9 = arg1 + arg3;
         int var10 = arg3;
         if (var7) {
            class385.method3045(arg5, arg2, class237.field3001[arg3], arg4, (byte)-100);
            var10 = arg3 + 1;
         }

         while(true) {
            while(~var9 < ~var10) {
               class385.method3045(arg5, arg2, class237.field3001[var10], arg4, (byte)-100);
               ++var10;
            }

            int var11 = -arg1 + arg2;
            int var12 = arg6;
            if (!var7) {
               if (var7) {
                  class385.method3045(arg5, arg2, class237.field3001[arg6], arg4, (byte)-82);
                  var12 = arg6 - 1;
               }

               while(true) {
                  while(var12 > var8) {
                     class385.method3045(arg5, arg2, class237.field3001[var12], arg4, (byte)-82);
                     --var12;
                  }

                  int var13 = arg4 - -arg1;
                  int var14 = var9;
                  if (!var7) {
                     if (!var7 && var9 > var8) {
                        return;
                     }

                     do {
                        int[] var15 = class237.field3001[var14];
                        class385.method3045(arg5, var13, var15, arg4, (byte)-108);
                        class385.method3045(arg5, arg2, var15, var11, (byte)-87);
                        ++var14;
                     } while(var14 <= var8);

                     return;
                  }

                  --var12;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field9016[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4512(int arg0) {
      try {
         ++field9015;
         class553.field8135.method2187(-108, 5);
         class215.field2735.method195(5, -19321);
         class3.field44.method2176(5, 121);
         class438.field5967.method928(arg0 ^ 101, 5);
         class270.field3460.method5196(5, -68);
         class166.field2126.method5572(5, (byte)-15);
         class532.field7812.method2474((byte)-112, 5);
         class49.field688.method3864(5, false);
         class781.field11387.method1660(5, (byte)125);
         class496.field6922.method3523(5, -109);
         class118.field1541.method1784(5, -109);
         class449.field6093.method161(98, 5);
         class754.field11043.method2620(5, (byte)-117);
         class237.field3002.method4933((byte)8, 5);
         class327.field4526.method1603(false, 5);
         class566.field8336.method1215(5, 0);
         class778.field11334.method5299(71, 5);
         class263.field3339.method2098((byte)-77, 5);
         class720.field10555.method3229(5, -126);
         class784.field11462.method2045(5, -23);
         class215.field2731.method5041(5, -324);
         class339.field4639.method2611(5, (byte)127);
         class45.field579.method3472(arg0 + 92, 5);
         class506.method3821(5, (byte)29);
         class465.method3540(50, arg0 ^ 5);
         class106.method942(3, 50);
         class66.method629(255, 5);
         class328.method2605(5, -1);
         class507.field7062.method3197(5, 5);
         class693.field10170.method3197(arg0, 5);
         class321.field4410.method3197(arg0, 5);
         class286.field3959.method3197(5, 5);
         class256.field3218.method3197(arg0, 5);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9016[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4513(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4514(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
