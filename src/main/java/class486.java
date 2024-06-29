import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class486 extends class673 {
   @OriginalMember(
      owner = "client!sg",
      name = "r",
      descriptor = "I"
   )
   public int field6786;
   @OriginalMember(
      owner = "client!sg",
      name = "p",
      descriptor = "I"
   )
   public int field6782;
   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6789 = new String[]{method3693(method3692("\\b\u0017\"R")), method3693(method3692("\\b\u0017_\u0013AlM]R")), method3693(method3692("\\b\u0017!R")), method3693(method3692("ApU\u000f")), method3693(method3692("T+\u0017M\u0007")), method3693(method3692("\\b\u0017 R"))};
   @OriginalMember(
      owner = "client!sg",
      name = "m",
      descriptor = "I"
   )
   public static int field6784 = 0;
   @OriginalMember(
      owner = "client!sg",
      name = "n",
      descriptor = "D"
   )
   public static double field6785;
   @OriginalMember(
      owner = "client!sg",
      name = "q",
      descriptor = "I"
   )
   public static int field6781;
   @OriginalMember(
      owner = "client!sg",
      name = "l",
      descriptor = "I"
   )
   public static int field6783;
   @OriginalMember(
      owner = "client!sg",
      name = "o",
      descriptor = "I"
   )
   public static int field6787;
   @OriginalMember(
      owner = "client!sg",
      name = "s",
      descriptor = "I"
   )
   public static int field6788;

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3689(int arg0, int arg1) {
      try {
         ++field6781;
         if (arg0 != 0) {
            method3689(95, 15);
         }

         return arg1 >>> 8;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6789[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(Lgea;B)Ljg;"
   )
   public static final class773 method3690(class66 arg0, byte arg1) {
      try {
         ++field6787;
         class228 var2 = class306.method2444(arg0, 118);
         if (arg1 > -33) {
            return null;
         } else {
            int var3 = arg0.method603(-2);
            int var4 = arg0.method603(-2);
            int var5 = arg0.method603(-2);
            int var6 = arg0.method603(-2);
            int var7 = arg0.method603(-2);
            int var8 = arg0.method603(-2);
            return new class773(var2.field2861, var2.field2857, var2.field2855, var2.field2854, var2.field2853, var2.field2850, var2.field2856, var2.field2859, var2.field2862, var3, var4, var5, var6, var7, var8);
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field6789[2] + (arg0 != null ? field6789[4] : field6789[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3691(byte arg0) {
      try {
         ++field6783;
         class419.field5722 = new class642[class168.field2196.method2703((byte)126)][];
         class778.field11337 = new class642[class168.field2196.method2703((byte)126)][];
         if (arg0 != -98) {
            field6788 = 80;
         }

         class316.field4369 = new boolean[class168.field2196.method2703((byte)126)];
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6789[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class486(int arg0, int arg1) {
      try {
         this.field6786 = arg1;
         this.field6782 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6789[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3692(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3693(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
