import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class750 {
   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11121 = new String[]{method5513(method5512(";{[IHt")), method5513(method5512(";{[INt")), method5513(method5512(";{[I~3MN\u0015c2y\u0012")), method5513(method5512(";{[IIt")), method5513(method5512(";{[IKt"))};
   @OriginalMember(
      owner = "client!gea",
      name = "b",
      descriptor = "Ljw;"
   )
   public static class779 field11114 = new class779(1, 2, 2, 0);
   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "I"
   )
   public static int field11113;
   @OriginalMember(
      owner = "client!gea",
      name = "e",
      descriptor = "I"
   )
   public static int field11115;
   @OriginalMember(
      owner = "client!gea",
      name = "h",
      descriptor = "I"
   )
   public static int field11117;
   @OriginalMember(
      owner = "client!gea",
      name = "g",
      descriptor = "I"
   )
   public static int field11118;
   @OriginalMember(
      owner = "client!gea",
      name = "f",
      descriptor = "I"
   )
   public static int field11120;
   @OriginalMember(
      owner = "client!gea",
      name = "d",
      descriptor = "Lpaa;"
   )
   public static class392 field11119;
   @OriginalMember(
      owner = "client!gea",
      name = "c",
      descriptor = "Lkca;"
   )
   public static class438 field11116;

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(III)I",
      line = 4
   )
   public final int method5508(int arg0, int arg1, int arg2) {
      try {
         ++field11120;
         if (arg0 <= 42) {
            field11116 = null;
         }

         int var4 = class692.field10301 > arg1 ? class692.field10301 : arg1;
         if (class68.field888 == this) {
            return 0;
         } else if (class389.field6105 == this) {
            return -arg2 + var4;
         } else {
            return class58.field712 == this ? (-arg2 + var4) / 2 : 0;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11121[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(IIIII)V",
      line = 28
   )
   public static final void method5509(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg2 == 2) {
            if (~class368.field5724 >= ~arg0 && ~class84.field1212 <= ~arg0) {
               int var7 = class47.method332(arg1, class182.field2833, 15989, class443.field6806);
               int var8 = class47.method332(arg4, class182.field2833, 15989, class443.field6806);
               class602.method4454(var7, var8, arg0, arg3, (byte)-67);
            }

            ++field11115;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11121[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(B)V",
      line = 54
   )
   public static final void method5510(byte arg0) {
      try {
         if (arg0 >= -44) {
            field11119 = null;
         }

         class304 var1 = class594.field8740;
         synchronized(class594.field8740) {
            class594.field8740.method2554(-99);
         }

         ++field11117;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11121[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 73
   )
   public final String toString() {
      try {
         ++field11113;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11121[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(I)V",
      line = 81
   )
   public static void method5511(int arg0) {
      try {
         if (arg0 >= -7) {
            method5511(-45);
         }

         field11116 = null;
         field11119 = null;
         field11114 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11121[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5512(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5513(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
