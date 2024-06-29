import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class276 {
   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3776 = new String[]{method2104(method2103("[I\u0010O\u007f\u001c")), method2104(method2103("[I\u0010O}\u001c")), method2104(method2103("[I\u0010O~\u001c"))};
   @OriginalMember(
      owner = "client!oca",
      name = "d",
      descriptor = "I"
   )
   public static int field3774 = 0;
   @OriginalMember(
      owner = "client!oca",
      name = "c",
      descriptor = "Leg;"
   )
   public static class118 field3772 = new class118(124, -1);
   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "I"
   )
   public static int field3771;
   @OriginalMember(
      owner = "client!oca",
      name = "e",
      descriptor = "I"
   )
   public static int field3773;
   @OriginalMember(
      owner = "client!oca",
      name = "b",
      descriptor = "I"
   )
   public static int field3775;

   @OriginalMember(
      owner = "client!oca",
      name = "b",
      descriptor = "(I)V",
      line = 7
   )
   public static final void method2100(int arg0) {
      try {
         class266.field3701.method2378((byte)122);
         ++field3773;
         class375.field5415.method4336((byte)28);
         class427.field6121.method1096(93);
         class387.field5618.method3978(-124);
         class195.field2761.method1736(5);
         class468.field6728.method2263((byte)-96);
         class190.field2702.method4413(-704912190);
         class478.field6875.method1953(-3330);
         class631.field9253.method4276((byte)-88);
         class468.field6732.method3510((byte)6);
         if (arg0 != 0) {
            method2101((byte)-93, -8, 31);
         }

         class657.field9605.method1070((byte)-28);
         class184.field2587.method5277(-93);
         class780.field11425.method1106(67);
         class294.field4046.method4594(10);
         class61.field747.method5672(36);
         class741.field10810.method2477((byte)-1);
         class327.field4469.method1333(false);
         class685.field10097.method668((byte)-119);
         class426.field6104.method2425(-27169);
         class645.field9420.method5148(-19728);
         class247.field3409.method913(-128);
         class612.field8982.method3448((byte)-114);
         class778.field11405.method3266(arg0 ^ 70);
         class647.method4716(50);
         class319.method2364(-101);
         class573.method4176((byte)-22);
         class444.method3258((byte)10);
         class312.method2305(-161);
         class360.field4902.method715(true);
         class252.field3435.method715(true);
         class319.field4374.method715(true);
         class685.field10094.method715(true);
         class200.field2861.method715(true);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3776[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(BII)Z",
      line = 54
   )
   public static final boolean method2101(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 > -76) {
            return true;
         } else {
            ++field3771;
            return class707.method5141(arg1, (byte)-32, arg2) | (393216 & arg2) != 0 || class663.method4843((byte)-31, arg1, arg2);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3776[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(I)V",
      line = 67
   )
   public static void method2102(int arg0) {
      try {
         field3772 = null;
         if (arg0 != 0) {
            method2100(64);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3776[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2103(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2104(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
