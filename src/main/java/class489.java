import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class489 implements class490 {
   @OriginalMember(
      owner = "client!jda",
      name = "b",
      descriptor = "Lrr;"
   )
   private class678 field7418;
   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7424 = new String[]{method3800(method3799("\u001a\u001cU\u0005z")), method3800(method3799("\u000fG\u0017G")), method3800(method3799("\u000bV\u001a\u0005BI")), method3800(method3799("\u000bV\u001a\u0005;\b\\\u0012_9I")), method3800(method3799("\u000bV\u001a\u0005EI")), method3800(method3799("\u000bV\u001a\u0005FI")), method3800(method3799("\u000bV\u001a\u0005CI")), method3800(method3799("\u000bV\u001a\u0005DI"))};
   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "Lfja;"
   )
   public static class4 field7416 = new class4();
   @OriginalMember(
      owner = "client!jda",
      name = "e",
      descriptor = "I"
   )
   public static int field7423 = 0;
   @OriginalMember(
      owner = "client!jda",
      name = "d",
      descriptor = "I"
   )
   public static int field7419;
   @OriginalMember(
      owner = "client!jda",
      name = "f",
      descriptor = "I"
   )
   public static int field7420;
   @OriginalMember(
      owner = "client!jda",
      name = "c",
      descriptor = "I"
   )
   public static int field7421;
   @OriginalMember(
      owner = "client!jda",
      name = "g",
      descriptor = "I"
   )
   public static int field7422;
   @OriginalMember(
      owner = "client!jda",
      name = "h",
      descriptor = "Lti;"
   )
   public static class80 field7417;

   @OriginalMember(
      owner = "client!jda",
      name = "b",
      descriptor = "(I)Lhba;",
      line = 3
   )
   public final class430 method3794(int arg0) {
      try {
         ++field7421;
         if (arg0 != 13943) {
            method3798(true);
         }

         return class430.field6635;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7424[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(Lrr;IZI)Lnga;",
      line = 14
   )
   public static final class159 method3795(class678 arg0, int arg1, boolean arg2, int arg3) {
      try {
         ++field7420;
         byte[] var4 = arg0.method5017(arg1, arg3, (byte)71);
         if (var4 == null) {
            return null;
         } else {
            if (!arg2) {
               method3796(-1);
            }

            return new class159(var4);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7424[2] + (arg0 != null ? field7424[0] : field7424[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "<init>",
      descriptor = "(Lrr;)V",
      line = 36
   )
   public class489(class678 arg0) {
      try {
         this.field7418 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7424[3] + (arg0 != null ? field7424[0] : field7424[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "c",
      descriptor = "(I)V",
      line = 44
   )
   public static final void method3796(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(I)I",
      line = 69
   )
   public final int method3797(int arg0) {
      try {
         if (arg0 < 62) {
            this.field7418 = null;
         }

         ++field7422;
         return this.field7418.method5006((byte)111) ? 100 : this.field7418.method4997(false);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7424[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(Z)V",
      line = 90
   )
   public static void method3798(boolean arg0) {
      try {
         field7416 = null;
         if (!arg0) {
            field7417 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7424[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3799(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3800(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
