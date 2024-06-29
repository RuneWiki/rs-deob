import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class189 {
   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2942 = method1690(method1689("JZF\u00038"));
   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "I"
   )
   public static int field2940;
   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "I"
   )
   public static int field2941;

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(IIILbm;Lbm;)V"
   )
   public static final void method1687(int arg0, int arg1, int arg2, class484 arg3, class484 arg4) {
      class190 var5 = class739.method5427(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field2953 = arg3;
         var5.field2951 = arg4;
         int var6 = class385.field6076 == class190.field2949 ? 1 : 0;
         if (arg3.method233(false)) {
            if (arg3.method228(0)) {
               arg3.field1503 = class777.field11406[var6];
               class777.field11406[var6] = arg3;
            } else {
               arg3.field1503 = class6.field36[var6];
               class6.field36[var6] = arg3;
               class67.field884 = true;
            }
         } else {
            arg3.field1503 = class651.field9383[var6];
            class651.field9383[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method233(false)) {
               if (arg4.method228(0)) {
                  arg4.field1503 = class777.field11406[var6];
                  class777.field11406[var6] = arg4;
                  return;
               }

               arg4.field1503 = class6.field36[var6];
               class6.field36[var6] = arg4;
               class67.field884 = true;
               return;
            }

            arg4.field1503 = class651.field9383[var6];
            class651.field9383[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1688(byte arg0) {
      try {
         class429.field6629.method5390(false, 5);
         ++field2941;
         class29.field347.method5490(5, arg0 + 5576);
         class738.field10964.method3776(5, -90);
         class102.field1434.method1417(arg0 ^ -6510, 5);
         class412.field6401.method790(5, (byte)-113);
         class247.field3763.method2057((byte)-118, 5);
         class314.field4861.method4841(5, 2);
         class317.field4896.method1643(5, arg0 ^ -6973);
         class228.field3467.method1033(118, 5);
         class479.field7291.method498((byte)122, 5);
         if (arg0 != -107) {
            method1688((byte)22);
         }

         class750.field11119.method3165(5, 48);
         class750.field11116.method3448((byte)45, 5);
         class252.field3808.method102(16768129, 5);
         class508.field7776.method132(5, (byte)9);
         class230.field3520.method4012(5, (byte)116);
         class610.field8879.method178(true, 5);
         class293.field4644.method979(48, 5);
         class739.field10975.method3603((byte)-75, 5);
         class88.field1274.method2028(5, (byte)6);
         class342.field5201.method1142(5, -1);
         class581.field8578.method5194(-67, 5);
         class649.field9349.method5134(1, 5);
         class523.field7971.method1780(true, 5);
         class194.method1719(116, 5);
         class775.method5631(50, (byte)-112);
         class482.method3753(50, 6251);
         class671.method4946(5, 109);
         class573.method4308(5, arg0 ^ -16711787);
         class86.field1261.method2552(5, 21533);
         class97.field1358.method2552(5, 21533);
         class384.field6050.method2552(5, arg0 ^ -21624);
         class355.field5443.method2552(5, 21533);
         class469.field7131.method2552(5, 21533);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2942 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1689(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1690(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
