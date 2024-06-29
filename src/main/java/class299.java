import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class299 {
   @OriginalMember(
      owner = "client!ria",
      name = "l",
      descriptor = "I"
   )
   public int field4265;
   @OriginalMember(
      owner = "client!ria",
      name = "i",
      descriptor = "B"
   )
   public byte field4277;
   @OriginalMember(
      owner = "client!ria",
      name = "s",
      descriptor = "I"
   )
   public int field4278;
   @OriginalMember(
      owner = "client!ria",
      name = "j",
      descriptor = "I"
   )
   private int field4272;
   @OriginalMember(
      owner = "client!ria",
      name = "e",
      descriptor = "I"
   )
   public int field4264;
   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4282 = new String[]{method2289(method2288("d\u0011Z+U>")), method2289(method2288("d\u0011Z+T>")), method2289(method2288("d\u0011Z+*\u007f\u0016Rq(>")), method2289(method2288("d\u0011Z+W>")), method2289(method2288("mV\u0015+k")), method2289(method2288("x\rWi")), method2289(method2288("d\u0011Z+R>"))};
   @OriginalMember(
      owner = "client!ria",
      name = "p",
      descriptor = "Lqb;"
   )
   public static class234 field4270 = new class234(0);
   @OriginalMember(
      owner = "client!ria",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field4279 = false;
   @OriginalMember(
      owner = "client!ria",
      name = "f",
      descriptor = "I"
   )
   public int field4262;
   @OriginalMember(
      owner = "client!ria",
      name = "k",
      descriptor = "I"
   )
   public int field4263;
   @OriginalMember(
      owner = "client!ria",
      name = "u",
      descriptor = "I"
   )
   public int field4266;
   @OriginalMember(
      owner = "client!ria",
      name = "b",
      descriptor = "I"
   )
   public int field4268;
   @OriginalMember(
      owner = "client!ria",
      name = "o",
      descriptor = "I"
   )
   public static int field4269;
   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "I"
   )
   public int field4271;
   @OriginalMember(
      owner = "client!ria",
      name = "g",
      descriptor = "I"
   )
   public int field4273;
   @OriginalMember(
      owner = "client!ria",
      name = "r",
      descriptor = "I"
   )
   public static int field4274;
   @OriginalMember(
      owner = "client!ria",
      name = "m",
      descriptor = "I"
   )
   public int field4275;
   @OriginalMember(
      owner = "client!ria",
      name = "c",
      descriptor = "I"
   )
   public static int field4276;
   @OriginalMember(
      owner = "client!ria",
      name = "q",
      descriptor = "I"
   )
   public int field4280;
   @OriginalMember(
      owner = "client!ria",
      name = "h",
      descriptor = "I"
   )
   public int field4281;
   @OriginalMember(
      owner = "client!ria",
      name = "n",
      descriptor = "Lria;"
   )
   public class299 field4261;
   @OriginalMember(
      owner = "client!ria",
      name = "d",
      descriptor = "Lod;"
   )
   public static class532 field4267;

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(IILha;)Lpg;",
      line = 4
   )
   public static final class763 method2284(int arg0, int arg1, class66 arg2) {
      try {
         ++field4276;
         class407 var3 = class204.method1563(true, arg1 + -125, arg0, arg2);
         if (arg1 != 0) {
            method2285((byte)115);
         }

         return var3 == null ? null : var3.field6218;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4282[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4282[4] : field4282[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(B)V",
      line = 24
   )
   public static void method2285(byte arg0) {
      try {
         field4270 = null;
         field4267 = null;
         if (arg0 != -60) {
            field4267 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4282[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(IIII)Lria;",
      line = 45
   )
   public final class299 method2286(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4274;
         return arg3 != 1207 ? null : new class299(this.field4272, arg2, arg0, arg1, this.field4277);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4282[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "b",
      descriptor = "(B)Lsaa;",
      line = 60
   )
   public final class344 method2287(byte arg0) {
      try {
         if (arg0 != 60) {
            this.method2287((byte)38);
         }

         ++field4269;
         return class165.method1344(this.field4272, 0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4282[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "<init>",
      descriptor = "(IIIIB)V",
      line = 81
   )
   public class299(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         this.field4265 = arg3;
         this.field4277 = arg4;
         this.field4278 = arg1;
         this.field4272 = arg0;
         this.field4264 = arg2;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4282[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2288(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2289(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
