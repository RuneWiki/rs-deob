import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class731 extends class246 {
   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10511 = method5277(method5276("CwP\u0010\b"));
   @OriginalMember(
      owner = "client!dd",
      name = "j",
      descriptor = "S"
   )
   public static short field10505 = 320;
   @OriginalMember(
      owner = "client!dd",
      name = "p",
      descriptor = "I"
   )
   public int field10503;
   @OriginalMember(
      owner = "client!dd",
      name = "k",
      descriptor = "I"
   )
   public static int field10504;
   @OriginalMember(
      owner = "client!dd",
      name = "l",
      descriptor = "I"
   )
   public int field10506;
   @OriginalMember(
      owner = "client!dd",
      name = "o",
      descriptor = "I"
   )
   public int field10507;
   @OriginalMember(
      owner = "client!dd",
      name = "q",
      descriptor = "I"
   )
   public static int field10508;
   @OriginalMember(
      owner = "client!dd",
      name = "n",
      descriptor = "I"
   )
   public int field10509;
   @OriginalMember(
      owner = "client!dd",
      name = "m",
      descriptor = "Loha;"
   )
   public class771 field10510;

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(Lvca;[Lke;)V",
      line = 3
   )
   public static final void method5274(class294 arg0, class622[] arg1) {
      if (class628.field9153) {
         int var2 = arg0.method1366(arg1, (byte)-99);
         class49.field1047.method364(var2, arg1);
      }

      if (class455.field6647 == class269.field3810) {
         boolean var3 = false;
         boolean var4 = false;
         int var5;
         int var6;
         if (arg0 instanceof class144) {
            var5 = ((class144)arg0).field2354;
            var6 = ((class144)arg0).field2347;
         } else {
            var5 = arg0.field4101 >> class76.field1336;
            var6 = arg0.field4096 >> class76.field1336;
         }

         class49.field1047.method325(class530.field7721[0].method2287(-127, arg0.field4096, arg0.field4101), class352.method2705(var5, var6), class276.method2168(var5, var6), class211.method1792(var5, var6));
      }

      class321 var7 = arg0.method599(50, class49.field1047);
      if (var7 != null) {
         if (arg0.field4087) {
            class362[] var8 = var7.field4630;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class362 var10 = var8[var9];
               if (var10.field5406) {
                  class670.method4896(var10.field5409 + var10.field5407, 0, var10.field5411 - var10.field5409, var10.field5410 + var10.field5409, var10.field5408 - var10.field5409);
               }
            }
         }

         if (var7.field4622) {
            var7.field4623 = arg0;
            if (class593.field8538) {
               class189 var11 = class458.field6722;
               synchronized(class458.field6722) {
                  class458.field6722.method1648(var7, (byte)-97);
                  return;
               }
            }

            class458.field6722.method1648(var7, (byte)-97);
            return;
         }

         class600.method4429(-114, var7);
      }

   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(ZII)V",
      line = 75
   )
   public static final void method5275(boolean arg0, int arg1, int arg2) {
      try {
         ++field10508;
         class25 var3 = arg0 ? class513.field7481 : class626.field9110;
         if (var3 != null && ~arg2 <= -1 && var3.field369 > arg2) {
            class444 var4 = var3.field380[arg2];
            int var5 = -53 / ((arg1 - 45) / 48);
            if (~var4.field6472 == 0) {
               String var6 = var4.field6470;
               class542 var7 = class549.method4093((byte)-113, class382.field5653, class126.field2108);
               var7.field7859.method3571(255, class70.method747(var6, -9) + 3);
               var7.field7859.method3571(255, !arg0 ? 0 : 1);
               var7.field7859.method3550(arg2, 29620);
               var7.field7859.method3546((byte)-121, var6);
               class740.method5332(var7, (byte)77);
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10511 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5276(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5277(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
