import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class114 {
   @OriginalMember(
      owner = "client!kba",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field1417;
   @OriginalMember(
      owner = "client!kba",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public String field1419;
   @OriginalMember(
      owner = "client!kba",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field1412;
   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1420 = new String[]{method994(method993("RFiI0\u0011")), method994(method993("RFiI4\u0011")), method994(method993("WQd\u000b")), method994(method993("RFiI1\u0011")), method994(method993("B\n&I\b")), method994(method993("RFiIIPJa\u0013K\u0011")), method994(method993("RFiI7\u0011")), method994(method993("RFiI6\u0011"))};
   @OriginalMember(
      owner = "client!kba",
      name = "i",
      descriptor = "Lnw;"
   )
   public static class616 field1415 = new class616(45, 7);
   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "F"
   )
   public static float field1411;
   @OriginalMember(
      owner = "client!kba",
      name = "c",
      descriptor = "I"
   )
   public static int field1410;
   @OriginalMember(
      owner = "client!kba",
      name = "f",
      descriptor = "I"
   )
   public static int field1413;
   @OriginalMember(
      owner = "client!kba",
      name = "b",
      descriptor = "I"
   )
   public static int field1414;
   @OriginalMember(
      owner = "client!kba",
      name = "h",
      descriptor = "I"
   )
   public static int field1416;
   @OriginalMember(
      owner = "client!kba",
      name = "g",
      descriptor = "I"
   )
   public static int field1418;

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "([IB[I)V"
   )
   public static final void method988(int[] param0, byte param1, int[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method989(int arg0, byte arg1) {
      try {
         ++field1413;
         class494.field6790 = arg0;
         int var2 = 36 % ((arg1 - 3) / 55);
         class590 var3 = class588.field8104;
         synchronized(class588.field8104) {
            class588.field8104.method4245(true);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1420[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method990(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field1410;
         if (arg0 < 87) {
            method990(85);
         }

         int var2 = class261.field3357;
         int[] var3 = class294.field3862;
         int var4 = 0;
         if (var1 || ~var2 < ~var4) {
            do {
               class404 var5 = class136.field1773[var3[var4]];
               if (var5 != null) {
                  class271.method2081(var5.method3060((byte)38), -512, var5);
               }

               ++var4;
            } while(~var2 < ~var4);

         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1420[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(Ldl;B)Ldl;"
   )
   public static final class69 method991(class69 arg0, byte arg1) {
      try {
         ++field1414;
         class69 var2 = arg0 == null ? new class69() : new class69(arg0);
         int var3 = -98 / ((arg1 - 17) / 49);
         var2.method659(128, 9, (byte)127);
         return var2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1420[6] + (arg0 != null ? field1420[4] : field1420[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method992(byte arg0) {
      try {
         if (arg0 != -60) {
            method990(-31);
         }

         field1415 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1420[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
   )
   public class114(String arg0, String arg1, String arg2) {
      try {
         this.field1417 = arg0;
         this.field1419 = arg1;
         this.field1412 = arg2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1420[5] + (arg0 != null ? field1420[4] : field1420[2]) + ',' + (arg1 != null ? field1420[4] : field1420[2]) + ',' + (arg2 != null ? field1420[4] : field1420[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method993(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method994(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
