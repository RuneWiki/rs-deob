import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class308 {
   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4805 = new String[]{method2586(method2585("M\u00176fyh\u0015j{x\\I")), method2586(method2585("@O6<k")), method2586(method2585("U\u0014t~")), method2586(method2585("M\u00176P>")), method2586(method2585("M\u00176S>"))};
   @OriginalMember(
      owner = "client!vv",
      name = "d",
      descriptor = "I"
   )
   public static int field4801 = 0;
   @OriginalMember(
      owner = "client!vv",
      name = "c",
      descriptor = "I"
   )
   public static int field4802 = -1;
   @OriginalMember(
      owner = "client!vv",
      name = "e",
      descriptor = "I"
   )
   public static int field4800;
   @OriginalMember(
      owner = "client!vv",
      name = "b",
      descriptor = "I"
   )
   public static int field4803;
   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "I"
   )
   public static int field4804;

   @OriginalMember(
      owner = "client!vv",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 3
   )
   public final String toString() {
      try {
         ++field4800;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4805[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(Lbn;I)V",
      line = 11
   )
   public static final void method2583(class188 arg0, int arg1) {
      try {
         ++field4803;
         if (arg0.field2936 != null) {
            arg0.field2936.field608 = 0;
         }

         arg0.field2938 = false;
         class188 var2 = arg0.method394();
         if (arg1 >= -24) {
            field4802 = 88;
         }

         while(var2 != null) {
            method2583(var2, -128);
            var2 = arg0.method375();
         }

      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4805[3] + (arg0 != null ? field4805[1] : field4805[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(Lgj;Lrr;Lti;ILrr;Lrr;)Z",
      line = 36
   )
   public static final boolean method2584(class761 arg0, class678 arg1, class80 arg2, int arg3, class678 arg4, class678 arg5) {
      boolean var6 = client.field1786;

      try {
         class542.field8171 = arg5;
         class44.field589 = new int[16];
         class259.field4270 = arg2;
         class16.field214 = arg0;
         class57.field708 = arg1;
         ++field4804;
         class610.field8872 = arg4;
         int var7 = -2 % ((-74 - arg3) / 41);
         int var8 = 0;
         if (var6) {
            class44.field589[var8] = 255;
            ++var8;
         }

         while(true) {
            while(var8 < 16) {
               class44.field589[var8] = 255;
               ++var8;
            }

            if (!var6) {
               return true;
            }

            ++var8;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field4805[4] + (arg0 != null ? field4805[1] : field4805[2]) + ',' + (arg1 != null ? field4805[1] : field4805[2]) + ',' + (arg2 != null ? field4805[1] : field4805[2]) + ',' + arg3 + ',' + (arg4 != null ? field4805[1] : field4805[2]) + ',' + (arg5 != null ? field4805[1] : field4805[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2585(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2586(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
