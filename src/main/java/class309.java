import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class309 {
   @OriginalMember(
      owner = "client!tha",
      name = "f",
      descriptor = "Ltv;"
   )
   private class590 field4099 = new class590(64);
   @OriginalMember(
      owner = "client!tha",
      name = "h",
      descriptor = "Lqh;"
   )
   private class74 field4102;
   @OriginalMember(
      owner = "client!tha",
      name = "c",
      descriptor = "I"
   )
   public int field4097;
   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4105 = new String[]{method2321(method2320("\u001ero^eB")), method2321(method2320("\u0004ob\u001c")), method2321(method2320("\u00114 ^Z")), method2321(method2320("\u001ero^\u001b\u0003tg\u0004\u0019B")), method2321(method2320("\u001ero^fB")), method2321(method2320("\u001ero^dB"))};
   @OriginalMember(
      owner = "client!tha",
      name = "i",
      descriptor = "D"
   )
   public static double field4101 = -1.0D;
   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "I"
   )
   public static int field4103 = 0;
   @OriginalMember(
      owner = "client!tha",
      name = "d",
      descriptor = "I"
   )
   public static int field4096;
   @OriginalMember(
      owner = "client!tha",
      name = "g",
      descriptor = "I"
   )
   public static int field4098;
   @OriginalMember(
      owner = "client!tha",
      name = "e",
      descriptor = "I"
   )
   public static int field4100;
   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "I"
   )
   public static int field4104;

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V"
   )
   public static final void method2317(String arg0, String arg1, int arg2) {
      try {
         ++field4100;
         if (arg0.length() <= 320) {
            if (class521.method3770(true)) {
               class605.field8473.method1697(arg2 ^ 83);
               class149.method1245(arg2 + -8040);
               class631.field8834 = arg0;
               class616.field8591 = arg1;
               class397.method3019(-83, arg2);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4105[0] + (arg0 != null ? field4105[2] : field4105[1]) + ',' + (arg1 != null ? field4105[2] : field4105[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2318(int arg0) {
      try {
         ++field4096;
         if (arg0 != 21465) {
            method2317((String)null, (String)null, -101);
         }

         if (class366.field5168 != -1) {
            int var1 = class242.field3026.method1581(69);
            int var2 = class242.field3026.method1572(false);
            class554 var3 = (class554)class746.field10840.method3855(arg0 + -21352);
            if (var3 != null) {
               var1 = var3.method3705(true);
               var2 = var3.method3707((byte)-77);
            }

            int var4 = 0;
            int var5 = 0;
            if (class775.field11283) {
               var4 = class101.method916(-127);
               var5 = class291.method2190(-122);
            }

            class224.method1719((byte)-121, var1, class366.field5168, var4, var2, var1 + var4, class41.field479 + var5, class252.field3194 + var4, var4, var5, var2 - -var5, var5);
            if (class432.field6030 != null) {
               class708.method5149(true, var2 + var5, var1 + var4);
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4105[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(II)Lpfa;"
   )
   public final class313 method2319(int arg0, int arg1) {
      try {
         ++field4098;
         class590 var3 = this.field4099;
         class313 var4;
         synchronized(this.field4099) {
            var4 = (class313)this.field4099.method4239((long)arg1, 0);
         }

         if (var4 != null) {
            return var4;
         } else if (arg0 != 320) {
            return null;
         } else {
            class74 var5 = this.field4102;
            byte[] var6;
            synchronized(this.field4102) {
               var6 = this.field4102.method732(arg1, 19, (byte)40);
            }

            class313 var7 = new class313();
            if (var6 != null) {
               var7.method2356(new class594(var6), (byte)83);
            }

            class590 var8 = this.field4099;
            synchronized(this.field4099) {
               this.field4099.method4238(87, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field4105[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class309(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field4102 = arg2;
         this.field4097 = this.field4102.method727(19, -32767);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4105[3] + (arg0 != null ? field4105[2] : field4105[1]) + ',' + arg1 + ',' + (arg2 != null ? field4105[2] : field4105[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2320(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2321(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
