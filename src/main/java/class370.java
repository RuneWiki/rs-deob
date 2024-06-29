import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class370 extends class730 {
   @OriginalMember(
      owner = "client!du",
      name = "o",
      descriptor = "I"
   )
   private int field5747;
   @OriginalMember(
      owner = "client!du",
      name = "q",
      descriptor = "I"
   )
   private int field5743;
   @OriginalMember(
      owner = "client!du",
      name = "s",
      descriptor = "I"
   )
   private int field5749;
   @OriginalMember(
      owner = "client!du",
      name = "r",
      descriptor = "I"
   )
   private int field5746;
   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5752 = new String[]{method3030(method3029("z.\u0004l=")), method3030(method3029("z.\u0004h=")), method3030(method3029("z.\u0004j=")), method3030(method3029("z.\u0004\u0015|p2^\u0017=")), method3030(method3029("z.\u0004k=")), method3030(method3029("z.\u0004m="))};
   @OriginalMember(
      owner = "client!du",
      name = "p",
      descriptor = "I"
   )
   public static int field5744;
   @OriginalMember(
      owner = "client!du",
      name = "n",
      descriptor = "I"
   )
   public static int field5745;
   @OriginalMember(
      owner = "client!du",
      name = "t",
      descriptor = "I"
   )
   public static int field5748;
   @OriginalMember(
      owner = "client!du",
      name = "u",
      descriptor = "I"
   )
   public static int field5750;
   @OriginalMember(
      owner = "client!du",
      name = "m",
      descriptor = "I"
   )
   public static int field5751;

   @OriginalMember(
      owner = "client!du",
      name = "c",
      descriptor = "(B)Les;",
      line = 8
   )
   public static final class191 method3027(byte arg0) {
      try {
         ++field5750;
         return arg0 >= -112 ? null : class60.field737;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5752[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 23
   )
   public class370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(-1, arg4, arg5);

      try {
         this.field5747 = arg2;
         this.field5743 = arg1;
         this.field5749 = arg0;
         this.field5746 = arg3;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field5752[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(ZII)V",
      line = 34
   )
   public final void method2081(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            method3027((byte)-46);
         }

         ++field5744;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5752[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(I)Lti;",
      line = 44
   )
   public static final class80 method3028(int arg0) {
      try {
         if (arg0 != -1594584884) {
            return null;
         } else {
            ++field5748;
            return class259.field4270;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5752[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(III)V",
      line = 56
   )
   public final void method2080(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 19856) {
            this.method2080(99, -115, -107);
         }

         ++field5745;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5752[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "b",
      descriptor = "(III)V",
      line = 66
   )
   public final void method2083(int arg0, int arg1, int arg2) {
      try {
         ++field5751;
         int var4 = this.field5749 * arg2 >> 12;
         int var5 = this.field5747 * arg2 >> 12;
         int var6 = -80 % ((-13 - arg1) / 40);
         int var7 = this.field5743 * arg0 >> 12;
         int var8 = this.field5746 * arg0 >> 12;
         class669.method4930(var7, var4, (byte)116, super.field10896, var5, var8);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field5752[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3029(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3030(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
