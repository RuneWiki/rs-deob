import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class732 {
   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "Lsb;"
   )
   private class261 field10404;
   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10413 = new String[]{method5303(method5302(">m9a\u0019")), method5303(method5302(">m9g\u0019")), method5303(method5302("6~{O")), method5303(method5302(">m9\u001fX6bc\u001d\u0019")), method5303(method5302("#%9\rL")), method5303(method5302(">m9`\u0019")), method5303(method5302(">m9b\u0019"))};
   @OriginalMember(
      owner = "client!ff",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field10406 = false;
   @OriginalMember(
      owner = "client!ff",
      name = "e",
      descriptor = "I"
   )
   public static int field10411 = 0;
   @OriginalMember(
      owner = "client!ff",
      name = "i",
      descriptor = "[J"
   )
   public static long[] field10410 = new long[32];
   @OriginalMember(
      owner = "client!ff",
      name = "d",
      descriptor = "Lhha;"
   )
   public static class724 field10412 = new class724(7, 8);
   @OriginalMember(
      owner = "client!ff",
      name = "g",
      descriptor = "I"
   )
   public static int field10405;
   @OriginalMember(
      owner = "client!ff",
      name = "c",
      descriptor = "I"
   )
   public static int field10407;
   @OriginalMember(
      owner = "client!ff",
      name = "h",
      descriptor = "I"
   )
   public static int field10409;
   @OriginalMember(
      owner = "client!ff",
      name = "f",
      descriptor = "Llba;"
   )
   private class247 field10408;

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(ILsb;)V"
   )
   public final void method5298(int arg0, class261 arg1) {
      try {
         if (arg0 != 32) {
            this.field10404 = null;
         }

         ++field10409;
         this.field10404 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10413[6] + arg0 + ',' + (arg1 != null ? field10413[4] : field10413[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "b",
      descriptor = "(I)Llba;"
   )
   public final class247 method5299(int arg0) {
      try {
         ++field10405;
         class247 var2 = this.field10404.field4002.field3781;
         if (this.field10404.field4002 == var2) {
            this.field10408 = null;
            return null;
         } else {
            if (arg0 <= 113) {
               this.method5299(-51);
            }

            this.field10408 = var2.field3781;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10413[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "<init>",
      descriptor = "()V"
   )
   public class732() {
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5300(byte arg0) {
      try {
         field10410 = null;
         if (arg0 != -126) {
            method5300((byte)106);
         }

         field10412 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10413[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "<init>",
      descriptor = "(Lsb;)V"
   )
   public class732(class261 arg0) {
      try {
         this.field10404 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10413[3] + (arg0 != null ? field10413[4] : field10413[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(I)Llba;"
   )
   public final class247 method5301(int arg0) {
      try {
         if (arg0 != 0) {
            field10410 = null;
         }

         ++field10407;
         class247 var2 = this.field10408;
         if (this.field10404.field4002 == var2) {
            this.field10408 = null;
            return null;
         } else {
            this.field10408 = var2.field3781;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10413[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5302(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5303(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
