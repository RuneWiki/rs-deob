import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class285 extends class55 {
   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3956 = new String[]{method2163(method2162("8.w}7")), method2163(method2162("8.wz7")), method2163(method2162("8.ws7")), method2163(method2162("8.w|7")), method2163(method2162("8.w~7")), method2163(method2162("8.wx7"))};
   @OriginalMember(
      owner = "client!jl",
      name = "m",
      descriptor = "[J"
   )
   public static long[] field3952 = new long[10];
   @OriginalMember(
      owner = "client!jl",
      name = "k",
      descriptor = "I"
   )
   public static int field3946;
   @OriginalMember(
      owner = "client!jl",
      name = "n",
      descriptor = "I"
   )
   public static int field3947;
   @OriginalMember(
      owner = "client!jl",
      name = "h",
      descriptor = "I"
   )
   public static int field3949;
   @OriginalMember(
      owner = "client!jl",
      name = "g",
      descriptor = "I"
   )
   public static int field3950;
   @OriginalMember(
      owner = "client!jl",
      name = "e",
      descriptor = "I"
   )
   public static int field3951;
   @OriginalMember(
      owner = "client!jl",
      name = "l",
      descriptor = "I"
   )
   public static int field3953;
   @OriginalMember(
      owner = "client!jl",
      name = "i",
      descriptor = "I"
   )
   public static int field3954;
   @OriginalMember(
      owner = "client!jl",
      name = "f",
      descriptor = "I"
   )
   public static int field3955;
   @OriginalMember(
      owner = "client!jl",
      name = "j",
      descriptor = "[Lcka;"
   )
   public static class187[] field3948;

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public final void method98(int arg0) {
      try {
         if (arg0 == 0) {
            if (~super.field680 > -1 && super.field680 > 4) {
               super.field680 = this.method101(-124);
            }

            ++field3947;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3956[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "b",
      descriptor = "(I)I",
      line = 17
   )
   public final int method101(int arg0) {
      try {
         ++field3953;
         if (super.field683.method3307(false).method4358(-117) > 1) {
            return 4;
         } else {
            return arg0 > -116 ? 81 : 2;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3956[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "c",
      descriptor = "(I)I",
      line = 32
   )
   public final int method2160(int arg0) {
      try {
         int var2 = -36 % ((arg0 - 36) / 41);
         ++field3954;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3956[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 42
   )
   public class285(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(IB)I",
      line = 46
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            this.method98(-7);
         }

         ++field3951;
         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3956[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "b",
      descriptor = "(IB)V",
      line = 66
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = 98 / ((arg1 - 47) / 46);
         ++field3946;
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3956[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 76
   )
   public class285(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jl",
      name = "d",
      descriptor = "(I)V",
      line = 79
   )
   public static void method2161(int arg0) {
      try {
         if (arg0 >= -83) {
            field3952 = null;
         }

         field3948 = null;
         field3952 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3956[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2162(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2163(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
