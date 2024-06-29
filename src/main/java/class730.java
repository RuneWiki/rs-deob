import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public abstract class class730 {
   @OriginalMember(
      owner = "client!eba",
      name = "j",
      descriptor = "I"
   )
   public int field10899;
   @OriginalMember(
      owner = "client!eba",
      name = "i",
      descriptor = "I"
   )
   public int field10892;
   @OriginalMember(
      owner = "client!eba",
      name = "b",
      descriptor = "I"
   )
   public int field10896;
   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10904 = new String[]{method5387(method5386("BA&65\u000f")), method5387(method5386("BA&6NNM.lL\u000f")), method5387(method5386("BA&6:\u000f")), method5387(method5386("BA&64\u000f"))};
   @OriginalMember(
      owner = "client!eba",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field10894 = false;
   @OriginalMember(
      owner = "client!eba",
      name = "g",
      descriptor = "[Z"
   )
   public static boolean[] field10897 = new boolean[100];
   @OriginalMember(
      owner = "client!eba",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field10898 = new class498(72, 1);
   @OriginalMember(
      owner = "client!eba",
      name = "f",
      descriptor = "I"
   )
   public static int field10903 = 2;
   @OriginalMember(
      owner = "client!eba",
      name = "k",
      descriptor = "F"
   )
   public static float field10902 = 0.0F;
   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "I"
   )
   public static int field10900 = 0;
   @OriginalMember(
      owner = "client!eba",
      name = "c",
      descriptor = "I"
   )
   public static int field10893;
   @OriginalMember(
      owner = "client!eba",
      name = "l",
      descriptor = "I"
   )
   public static int field10895;
   @OriginalMember(
      owner = "client!eba",
      name = "h",
      descriptor = "I"
   )
   public static int field10901;

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(IIIIIIB)I"
   )
   public static final int method5383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
      try {
         int var10 = arg5 & 3;
         if (arg6 != 100) {
            method5384((byte)-33);
         }

         ++field10895;
         if ((arg4 & 1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
         }

         if (var10 == 0) {
            return arg0;
         } else if (var10 == 1) {
            return arg1;
         } else {
            return ~var10 == -3 ? -arg0 + 7 + 1 + -arg3 : -arg1 + 7 - (arg2 + -1);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field10904[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(ZII)V"
   )
   public abstract void method2081(boolean arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!eba",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5384(byte arg0) {
      try {
         if (class374.field5836 == null) {
            class140 var1 = new class140();
            byte[] var2 = var1.method1280(16, 255, 128, 128);
            class374.field5836 = class408.method3272(false, var2, 0);
         }

         ++field10893;
         if (class228.field3484 == null) {
            class265 var3 = new class265();
            byte[] var4 = var3.method2287(128, 128, true, 16);
            class228.field3484 = class408.method3272(false, var4, 0);
         }

         if (arg0 > -83) {
            field10894 = true;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10904[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "b",
      descriptor = "(III)V"
   )
   public abstract void method2083(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5385(byte arg0) {
      try {
         field10898 = null;
         int var1 = -25 % ((arg0 - -58) / 55);
         field10897 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10904[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class730(int arg0, int arg1, int arg2) {
      try {
         this.field10899 = arg2;
         this.field10892 = arg0;
         this.field10896 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10904[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method2080(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5386(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5387(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
