import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class607 {
   @OriginalMember(
      owner = "client!gu",
      name = "e",
      descriptor = "I"
   )
   private int field8906 = 0;
   @OriginalMember(
      owner = "client!gu",
      name = "h",
      descriptor = "Lwv;"
   )
   private class37 field8907;
   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8911 = new String[]{method4425(method4424("U\u0018k:B")), method4425(method4424("\\\u0018)\u0014")), method4425(method4424("U\u0018kD\u0003\\\u00041FB")), method4425(method4424("ICkV\u0017")), method4425(method4424("U\u0018k;B")), method4425(method4424("U\u0018k9B"))};
   @OriginalMember(
      owner = "client!gu",
      name = "g",
      descriptor = "Leg;"
   )
   public static class118 field8903 = new class118(3, 6);
   @OriginalMember(
      owner = "client!gu",
      name = "b",
      descriptor = "I"
   )
   public static int field8904;
   @OriginalMember(
      owner = "client!gu",
      name = "f",
      descriptor = "I"
   )
   public static int field8905;
   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "I"
   )
   public static int field8910;
   @OriginalMember(
      owner = "client!gu",
      name = "c",
      descriptor = "Loh;"
   )
   private class428 field8909;
   @OriginalMember(
      owner = "client!gu",
      name = "d",
      descriptor = "Lda;"
   )
   public static class67 field8908;

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static void method4421(int arg0) {
      try {
         if (arg0 < 40) {
            field8903 = null;
         }

         field8903 = null;
         field8908 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8911[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "b",
      descriptor = "(B)Loh;",
      line = 19
   )
   public final class428 method4422(byte arg0) {
      try {
         ++field8905;
         int var2 = -106 % ((73 - arg0) / 40);
         this.field8906 = 0;
         return this.method4423((byte)-76);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8911[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(B)Loh;",
      line = 36
   )
   public final class428 method4423(byte arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0 > -72) {
            return null;
         } else {
            ++field8910;
            if (~this.field8906 < -1 && this.field8907.field534[this.field8906 + -1] != this.field8909) {
               class428 var3 = this.field8909;
               this.field8909 = var3.field6126;
               return var3;
            } else {
               while(this.field8907.field521 > this.field8906) {
                  class428 var4 = this.field8907.field534[this.field8906++].field6126;
                  class428 var10000 = var4;

                  while(var10000 != this.field8907.field534[this.field8906 - 1]) {
                     this.field8909 = var4.field6126;
                     var10000 = var4;
                     if (!var2) {
                        return var4;
                     }
                  }
               }

               return null;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8911[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "<init>",
      descriptor = "()V",
      line = 72
   )
   public class607() {
   }

   @OriginalMember(
      owner = "client!gu",
      name = "<init>",
      descriptor = "(Lwv;)V",
      line = 74
   )
   public class607(class37 arg0) {
      try {
         this.field8907 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8911[2] + (arg0 != null ? field8911[3] : field8911[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4424(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4425(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
