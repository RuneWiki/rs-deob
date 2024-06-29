import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class204 extends class96 {
   @OriginalMember(
      owner = "client!iv",
      name = "u",
      descriptor = "I"
   )
   public int field2910 = 0;
   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2912 = new String[]{method1773(method1772(":|V6\u0003")), method1773(method1772("/'\u0014t")), method1773(method1772("($VYV")), method1773(method1772("($V[V")), method1773(method1772("50\n}\u001837\u000bp")), method1773(method1772("($VZV")), method1773(method1772("($V\\V"))};
   @OriginalMember(
      owner = "client!iv",
      name = "s",
      descriptor = "I"
   )
   public static int field2907;
   @OriginalMember(
      owner = "client!iv",
      name = "q",
      descriptor = "I"
   )
   public static int field2908;
   @OriginalMember(
      owner = "client!iv",
      name = "r",
      descriptor = "I"
   )
   public static int field2909;
   @OriginalMember(
      owner = "client!iv",
      name = "t",
      descriptor = "I"
   )
   public static int field2911;

   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1768(byte arg0) {
      try {
         ++field2907;
         if (class693.field9999 != class479.field6892) {
            try {
               class726.method5254(109, class183.field2683, field2912[4]);
               if (arg0 >= 76) {
                  ;
               }
            } catch (Throwable var2) {
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2912[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   public final void method1769(int arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         while(true) {
            int var4 = arg1.method665(false);
            if (~var4 != -1) {
               this.method1771(arg1, var4, -117);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            int var5 = 104 % ((arg0 - -45) / 53);
            ++field2911;
            break;
         }

      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2912[2] + arg0 + ',' + (arg1 != null ? field2912[0] : field2912[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1770(int arg0) {
      try {
         if (~class22.field325 == -2 || ~class22.field325 == -4 || class22.field325 != class150.field2313 && (class22.field325 == 0 || ~class150.field2313 == -1)) {
            class261.field3995 = 0;
            class157.field2391 = 0;
            class573.field8110.method3096(-125);
         }

         ++field2909;
         class150.field2313 = class22.field325;
         if (arg0 <= -48) {
            ;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2912[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   private final void method1771(class65 arg0, int arg1, int arg2) {
      try {
         if (~arg1 == -3) {
            this.field2910 = arg0.method685(-2);
         }

         ++field2908;
         if (arg2 >= -84) {
            this.method1769(-36, (class65)null);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2912[6] + (arg0 != null ? field2912[0] : field2912[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1772(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1773(char[] arg0) {
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
            var10005 = 82;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
