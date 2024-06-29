import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class344 implements class99 {
   @OriginalMember(
      owner = "client!fp",
      name = "e",
      descriptor = "Lvd;"
   )
   private class41 field4930;
   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4935 = new String[]{method2725(method2724("B\u0015T\t")), method2725(method2724("WN\u0016Km")), method2725(method2724("J\u0010\u0016&8")), method2725(method2724("J\u0010\u0016'8")), method2725(method2724("J\u0010\u0016$8")), method2725(method2724("J\u0010\u0016YyB\tL[8")), method2725(method2724("J\u0010\u0016,8"))};
   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "F"
   )
   public static float field4931;
   @OriginalMember(
      owner = "client!fp",
      name = "c",
      descriptor = "F"
   )
   public static float field4933;
   @OriginalMember(
      owner = "client!fp",
      name = "f",
      descriptor = "I"
   )
   public static int field4928;
   @OriginalMember(
      owner = "client!fp",
      name = "d",
      descriptor = "I"
   )
   public static int field4929;
   @OriginalMember(
      owner = "client!fp",
      name = "g",
      descriptor = "I"
   )
   public static int field4932;
   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "I"
   )
   public static int field4934;

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method906(int arg0, boolean arg1) {
      try {
         if (arg1) {
            class338.field4832.method508(0, 0, class252.field3194, class41.field479, this.field4930.field478, 0);
         }

         ++field4932;
         if (arg0 != 29560) {
            this.method907(false);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4935[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method905(int arg0) {
      try {
         if (arg0 != -15238) {
            method2723((String)null, (byte)-51, 108);
         }

         ++field4929;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4935[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(Ljava/lang/String;BI)V"
   )
   public static final void method2723(String arg0, byte arg1, int arg2) {
      try {
         ++field4928;
         ++class421.field5904;
         class223 var3 = class355.method2790(13111);
         class471 var4 = class133.method1118(var3.field2787, 2, class39.field454);
         var4.field6527.method4318(class190.method1432(10524, arg0) + 1, arg1 + -100);
         if (arg1 != 100) {
            method2723((String)null, (byte)57, 40);
         }

         var4.field6527.method4301(arg2, (byte)-43);
         var4.field6527.method4332((byte)-86, arg0);
         var3.method1702((byte)-62, var4);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4935[2] + (arg0 != null ? field4935[1] : field4935[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method907(boolean arg0) {
      try {
         ++field4934;
         if (!arg0) {
            method2723((String)null, (byte)-70, -60);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4935[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "<init>",
      descriptor = "(Lvd;)V"
   )
   public class344(class41 arg0) {
      try {
         this.field4930 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4935[5] + (arg0 != null ? field4935[1] : field4935[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2724(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2725(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
