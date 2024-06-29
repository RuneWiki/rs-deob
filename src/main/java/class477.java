import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class477 extends class119 {
   @OriginalMember(
      owner = "client!rca",
      name = "k",
      descriptor = "Lrk;"
   )
   private class35 field6953;
   @OriginalMember(
      owner = "client!rca",
      name = "q",
      descriptor = "Lma;"
   )
   private class14 field6949;
   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6958 = new String[]{method3616(method3615("3\nPMi(\u0007X\u0017ki")), method3616(method3615("/\u001c]\u000f")), method3616(method3615(":G\u001fM(")), method3616(method3615("3\nPM\u0010i")), method3616(method3615("3\nPM\u0013i")), method3616(method3615("3\nPM\u0014i")), method3616(method3615("3\nPM\u001di")), method3616(method3615("3\nPM\u0012i"))};
   @OriginalMember(
      owner = "client!rca",
      name = "r",
      descriptor = "I"
   )
   public static int field6954 = 0;
   @OriginalMember(
      owner = "client!rca",
      name = "m",
      descriptor = "Lqg;"
   )
   public static class485 field6955 = new class485(9, 2);
   @OriginalMember(
      owner = "client!rca",
      name = "l",
      descriptor = "Lgh;"
   )
   public static class572 field6957 = new class572(90, 4);
   @OriginalMember(
      owner = "client!rca",
      name = "s",
      descriptor = "I"
   )
   public static int field6948;
   @OriginalMember(
      owner = "client!rca",
      name = "t",
      descriptor = "I"
   )
   public static int field6950;
   @OriginalMember(
      owner = "client!rca",
      name = "o",
      descriptor = "I"
   )
   public static int field6951;
   @OriginalMember(
      owner = "client!rca",
      name = "n",
      descriptor = "I"
   )
   public static int field6952;
   @OriginalMember(
      owner = "client!rca",
      name = "p",
      descriptor = "I"
   )
   public static int field6956;

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(Laf;B)I"
   )
   public static final int method3611(class457 arg0, byte arg1) {
      boolean var2 = client.field4564;

      try {
         if (arg1 >= -3) {
            return 33;
         } else {
            ++field6950;
            int var3 = arg0.field6698;
            class654 var4 = arg0.method5574(31482);
            if (arg0.field11284 == -1 || arg0.field11266) {
               var3 = arg0.field6659;
               if (!var2) {
                  return var3;
               }
            }

            if (~arg0.field11284 == ~var4.field9524 || arg0.field11284 == var4.field9525 || arg0.field11284 == var4.field9520 || arg0.field11284 == var4.field9539) {
               var3 = arg0.field6690;
               if (!var2) {
                  return var3;
               }
            }

            if (~arg0.field11284 == ~var4.field9515 || ~arg0.field11284 == ~var4.field9542 || ~arg0.field11284 == ~var4.field9516 || arg0.field11284 == var4.field9491) {
               var3 = arg0.field6686;
            }

            return var3;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6958[4] + (arg0 != null ? field6958[2] : field6958[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(I)Lma;"
   )
   public final class14 method1128(int arg0) {
      try {
         if (arg0 != -24197) {
            return null;
         } else {
            ++field6948;
            return this.field6949;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6958[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "<init>",
      descriptor = "(Lrk;I)V"
   )
   public class477(class35 arg0, int arg1) {
      try {
         this.field6953 = arg0;
         this.field6949 = new class14(arg0, 6408, arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6958[0] + (arg0 != null ? field6958[2] : field6958[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method3612(byte arg0) {
      try {
         field6955 = null;
         if (arg0 > -79) {
            field6957 = null;
         }

         field6957 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6958[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(BFLma;Lma;)Z"
   )
   public final boolean method3613(byte param1, float param2, class14 param3, class14 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rca",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3614(int arg0) {
      try {
         if (arg0 > -66) {
            field6955 = null;
         }

         ++field6956;
         return this.field6949.field196;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6958[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3615(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3616(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
