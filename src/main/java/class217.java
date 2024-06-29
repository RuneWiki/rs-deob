import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class217 extends class305 {
   @OriginalMember(
      owner = "client!rea",
      name = "C",
      descriptor = "Llu;"
   )
   public class740 field3286;
   @OriginalMember(
      owner = "client!rea",
      name = "v",
      descriptor = "Led;"
   )
   public class732 field3284;
   @OriginalMember(
      owner = "client!rea",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3289 = new String[]{method1850(method1849("wtJS:-")), method1850(method1849("wtJS8-")), method1850(method1849("~?\u0005S\u0004")), method1850(method1849("wtJSEl\u007fB\tG-")), method1850(method1849("kdG\u0011")), method1850(method1849("wtJS;-"))};
   @OriginalMember(
      owner = "client!rea",
      name = "x",
      descriptor = "Lgh;"
   )
   public static class572 field3282 = new class572(87, 2);
   @OriginalMember(
      owner = "client!rea",
      name = "D",
      descriptor = "Lgw;"
   )
   public static class179 field3287 = new class179(8);
   @OriginalMember(
      owner = "client!rea",
      name = "A",
      descriptor = "I"
   )
   public int field3276;
   @OriginalMember(
      owner = "client!rea",
      name = "w",
      descriptor = "I"
   )
   public static int field3277;
   @OriginalMember(
      owner = "client!rea",
      name = "y",
      descriptor = "I"
   )
   public int field3278;
   @OriginalMember(
      owner = "client!rea",
      name = "H",
      descriptor = "I"
   )
   public int field3280;
   @OriginalMember(
      owner = "client!rea",
      name = "F",
      descriptor = "I"
   )
   public static int field3281;
   @OriginalMember(
      owner = "client!rea",
      name = "G",
      descriptor = "I"
   )
   public int field3283;
   @OriginalMember(
      owner = "client!rea",
      name = "E",
      descriptor = "I"
   )
   public int field3285;
   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "I"
   )
   public static int field3288;
   @OriginalMember(
      owner = "client!rea",
      name = "B",
      descriptor = "[B"
   )
   public static byte[] field3279;

   @OriginalMember(
      owner = "client!rea",
      name = "b",
      descriptor = "(Z)V",
      line = 3
   )
   public final void method1846(boolean arg0) {
      try {
         if (arg0) {
            this.field3285 = this.field3286.field10654;
            ++field3277;
            this.field3283 = this.field3286.field10662;
            this.field3276 = this.field3286.field10652;
            if (this.field3286.field10657 != null) {
               this.field3286.field10657.method986(this.field3284.field10521, this.field3284.field10520, this.field3284.field10528, class464.field6782);
            }

            this.field3280 = class464.field6782[2];
            this.field3278 = class464.field6782[0];
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3289[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(III)V",
      line = 29
   )
   public static final void method1847(int arg0, int arg1, int arg2) {
      try {
         ++field3281;
         if (arg2 == 0) {
            if (class294.field4103 != class128.field2145) {
               if (!class681.method4970(1, 0, -3, 1, false, arg1, 0, arg0, 0)) {
                  class681.method4970(1, 0, -2, 1, false, arg1, 0, arg0, 0);
               }
            } else if (!class681.method4970(1, 0, -2, 1, false, arg1, 0, arg0, 0)) {
               class681.method4970(1, 0, -3, 1, false, arg1, 0, arg0, 0);
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3289[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(I)V",
      line = 54
   )
   public static void method1848(int arg0) {
      try {
         if (arg0 != 9632) {
            field3282 = null;
         }

         field3287 = null;
         field3282 = null;
         field3279 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3289[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "<init>",
      descriptor = "(Llu;Lpja;)V",
      line = 84
   )
   public class217(class740 arg0, class42 arg1) {
      try {
         this.field3286 = arg0;
         this.field3284 = this.field3286.method5334((byte)-126);
         this.method1846(true);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3289[3] + (arg0 != null ? field3289[2] : field3289[4]) + ',' + (arg1 != null ? field3289[2] : field3289[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1849(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1850(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
