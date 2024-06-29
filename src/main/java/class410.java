import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class410 {
   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6384 = new String[]{method3289(method3288("\u0015\u00036L")), method3289(method3288("\u0015\u00034L")), method3289(method3288("\u0015\u00037L"))};
   @OriginalMember(
      owner = "client!v",
      name = "d",
      descriptor = "Ltv;"
   )
   public static class311 field6382 = null;
   @OriginalMember(
      owner = "client!v",
      name = "b",
      descriptor = "I"
   )
   public static int field6380;
   @OriginalMember(
      owner = "client!v",
      name = "c",
      descriptor = "I"
   )
   public static int field6381;
   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "I"
   )
   public static int field6383;

   @OriginalMember(
      owner = "client!v",
      name = "b",
      descriptor = "(I)V",
      line = 9
   )
   public static final void method3284(int arg0) {
      try {
         ++field6381;
         class572.field8466.method2551(true);
         if (arg0 != 16288) {
            field6383 = 13;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6384[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "()V",
      line = 21
   )
   public static final void method3285() {
      class154.field2298 = class154.field2299;
   }

   @OriginalMember(
      owner = "client!v",
      name = "d",
      descriptor = "(I)V",
      line = 24
   )
   public static void method3286(int arg0) {
      try {
         if (arg0 == -9260) {
            field6382 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6384[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(Z)V",
      line = 36
   )
   public static final void method3287(boolean arg0) {
      try {
         if (arg0) {
            method3284(36);
         }

         ++field6380;
         class253.field3817 = true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6384[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(IIZ[B)V"
   )
   public abstract void method1578(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException;

   @OriginalMember(
      owner = "client!v",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method1581(int arg0);

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(II)Z"
   )
   public abstract boolean method1583(int arg0, int arg1) throws IOException;

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method1579(int arg0);

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(I[BII)I"
   )
   public abstract int method1584(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3288(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3289(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
