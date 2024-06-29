import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class36 {
   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field520 = new String[]{method324(method323("\u0018gki%D")), method324(method323("\u0018gki'D")), method324(method323("\u0018gki\u0010\u0003R~5\r\u0002f\"")), method324(method323("\u0018gki&D"))};
   @OriginalMember(
      owner = "client!tfa",
      name = "k",
      descriptor = "Ltfa;"
   )
   public static class36 field509 = new class36();
   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "Ltfa;"
   )
   public static class36 field512 = new class36();
   @OriginalMember(
      owner = "client!tfa",
      name = "j",
      descriptor = "Ltfa;"
   )
   public static class36 field514 = new class36();
   @OriginalMember(
      owner = "client!tfa",
      name = "i",
      descriptor = "Ltfa;"
   )
   public static class36 field515 = new class36();
   @OriginalMember(
      owner = "client!tfa",
      name = "f",
      descriptor = "[F"
   )
   public static float[] field517 = new float[16];
   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "I"
   )
   public static int field519 = -1;
   @OriginalMember(
      owner = "client!tfa",
      name = "d",
      descriptor = "F"
   )
   public static float field518;
   @OriginalMember(
      owner = "client!tfa",
      name = "c",
      descriptor = "I"
   )
   public static int field508;
   @OriginalMember(
      owner = "client!tfa",
      name = "l",
      descriptor = "I"
   )
   public static int field510;
   @OriginalMember(
      owner = "client!tfa",
      name = "g",
      descriptor = "I"
   )
   public static int field511;
   @OriginalMember(
      owner = "client!tfa",
      name = "h",
      descriptor = "I"
   )
   public static int field513;
   @OriginalMember(
      owner = "client!tfa",
      name = "e",
      descriptor = "Loe;"
   )
   public static class214 field516;

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method320(int arg0) {
      try {
         field514 = null;
         field512 = null;
         field515 = null;
         field517 = null;
         field509 = null;
         field516 = null;
         int var1 = 32 % ((arg0 - 50) / 36);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field520[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method321(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 < 27) {
            return false;
         } else {
            ++field511;
            return (arg2 & 32768) != 0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field520[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field513;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field520[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method322(int arg0, int arg1, int arg2) {
      try {
         if (arg2 == 29295) {
            ++field508;
            class755 var3 = class317.method2325((long)arg1, arg2 + -29191, 1);
            var3.method5479(1288);
            var3.field11184 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field520[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
