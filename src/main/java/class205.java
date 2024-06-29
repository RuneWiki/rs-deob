import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class205 {
   @OriginalMember(
      owner = "client!vb",
      name = "i",
      descriptor = "I"
   )
   public int field3054 = 128;
   @OriginalMember(
      owner = "client!vb",
      name = "b",
      descriptor = "I"
   )
   public int field3059 = 128;
   @OriginalMember(
      owner = "client!vb",
      name = "j",
      descriptor = "I"
   )
   public int field3060;
   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "I"
   )
   public int field3051;
   @OriginalMember(
      owner = "client!vb",
      name = "m",
      descriptor = "I"
   )
   public int field3053;
   @OriginalMember(
      owner = "client!vb",
      name = "g",
      descriptor = "I"
   )
   public int field3056;
   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3064 = new String[]{method1748(method1747("[<$x\u000e")), method1748(method1747("[<${\u000e")), method1748(method1747("C+fV")), method1748(method1747("Vp$\u0014[")), method1748(method1747("[<$~\u000e")), method1748(method1747("[<$y\u000e")), method1748(method1747("[<$\u0006OC7~\u0004\u000e"))};
   @OriginalMember(
      owner = "client!vb",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field3052 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!vb",
      name = "d",
      descriptor = "I"
   )
   public static int field3055;
   @OriginalMember(
      owner = "client!vb",
      name = "f",
      descriptor = "I"
   )
   public static int field3057;
   @OriginalMember(
      owner = "client!vb",
      name = "c",
      descriptor = "I"
   )
   public static int field3062;
   @OriginalMember(
      owner = "client!vb",
      name = "h",
      descriptor = "I"
   )
   public static int field3063;
   @OriginalMember(
      owner = "client!vb",
      name = "l",
      descriptor = "Lsm;"
   )
   public static class297 field3061;
   @OriginalMember(
      owner = "client!vb",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field3058;

   @OriginalMember(
      owner = "client!vb",
      name = "b",
      descriptor = "(B)V",
      line = 4
   )
   public static final void method1743(byte arg0) {
      try {
         ++field3055;
         if (class595.field8589 != -1) {
            class277.method2174(-1, class595.field8589, 9923, false, -1);
            class595.field8589 = -1;
         }

         if (arg0 != -54) {
            field3052 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3064[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(ILvb;)V",
      line = 32
   )
   public final void method1744(int arg0, class205 arg1) {
      try {
         this.field3059 = arg1.field3059;
         this.field3054 = arg1.field3054;
         ++field3062;
         this.field3053 = arg1.field3053;
         this.field3051 = arg1.field3051;
         if (arg0 != 128) {
            field3058 = null;
         }

         this.field3060 = arg1.field3060;
         this.field3056 = arg1.field3056;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3064[1] + arg0 + ',' + (arg1 != null ? field3064[3] : field3064[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(B)Lvb;",
      line = 50
   )
   public final class205 method1745(byte arg0) {
      try {
         if (arg0 > -102) {
            this.field3059 = -44;
         }

         ++field3057;
         return new class205(this.field3060, this.field3059, this.field3054, this.field3056, this.field3051, this.field3053);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3064[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "<init>",
      descriptor = "(I)V",
      line = 81
   )
   public class205(int arg0) {
      try {
         this.field3060 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3064[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 88
   )
   private class205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field3051 = arg4;
         this.field3053 = arg5;
         this.field3060 = arg0;
         this.field3054 = arg2;
         this.field3056 = arg3;
         this.field3059 = arg1;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3064[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(I)V",
      line = 70
   )
   public static void method1746(int arg0) {
      try {
         field3058 = null;
         field3061 = null;
         if (arg0 == 128) {
            field3052 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3064[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1747(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1748(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
