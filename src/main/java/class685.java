import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class685 {
   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9894 = new String[]{method4989(method4988("5\u000fZ\u0005>")), method4989(method4988("*CZjk")), method4989(method4988("?\u0018\u0018(")), method4989(method4988("5\u000fZ0y\u0002\u0019\u0006-x6E")), method4989(method4988("5\u000fZ\u0006>"))};
   @OriginalMember(
      owner = "client!db",
      name = "e",
      descriptor = "Lbu;"
   )
   public static class234 field9888 = new class234(2, 4, 4, 0);
   @OriginalMember(
      owner = "client!db",
      name = "b",
      descriptor = "I"
   )
   public static int field9889;
   @OriginalMember(
      owner = "client!db",
      name = "f",
      descriptor = "I"
   )
   public static int field9890;
   @OriginalMember(
      owner = "client!db",
      name = "c",
      descriptor = "I"
   )
   public static int field9892;
   @OriginalMember(
      owner = "client!db",
      name = "d",
      descriptor = "I"
   )
   public static int field9893;
   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "Lda;"
   )
   public static class216 field9891;

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(Lcu;B)Lhi;"
   )
   public static final class606 method4986(class65 arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         arg0.method665(false);
         ++field9889;
         int var3 = arg0.method665(false);
         class606 var4 = class309.method2530(var3, 55);
         var4.field8637 = arg0.method665(false);
         int var5 = arg0.method665(false);
         int var6 = 80 / ((arg1 - -66) / 59);
         int var7 = 0;
         int var8;
         if (var2) {
            var8 = arg0.method665(false);
            var4.method8(arg0, var8, -100);
            ++var7;
         }

         while(~var5 < ~var7) {
            var8 = arg0.method665(false);
            var4.method8(arg0, var8, -100);
            ++var7;
         }

         var4.method270((byte)121);
         return var4;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field9894[0] + (arg0 != null ? field9894[1] : field9894[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4987(int arg0) {
      try {
         field9888 = null;
         field9891 = null;
         if (arg0 != 0) {
            method4986((class65)null, (byte)-26);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9894[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class685(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!db",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9892;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9894[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4988(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4989(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
