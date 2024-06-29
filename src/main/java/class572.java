import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class572 {
   @OriginalMember(
      owner = "client!gh",
      name = "b",
      descriptor = "I"
   )
   public int field8265;
   @OriginalMember(
      owner = "client!gh",
      name = "e",
      descriptor = "I"
   )
   private int field8268;
   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8274 = new String[]{method4243(method4242("SNG;\tZO\u001d9H")), method4243(method4242("SNGEH")), method4243(method4242("SNGFH")), method4243(method4242("SNGDH")), method4243(method4242("SNGs\u000fgR\u001bn\u000eS\u000e"))};
   @OriginalMember(
      owner = "client!gh",
      name = "c",
      descriptor = "[Lup;"
   )
   public static class289[] field8272 = new class289[6];
   @OriginalMember(
      owner = "client!gh",
      name = "i",
      descriptor = "I"
   )
   public static int field8270 = 0;
   @OriginalMember(
      owner = "client!gh",
      name = "g",
      descriptor = "I"
   )
   public static int field8266;
   @OriginalMember(
      owner = "client!gh",
      name = "f",
      descriptor = "I"
   )
   public static int field8269;
   @OriginalMember(
      owner = "client!gh",
      name = "d",
      descriptor = "I"
   )
   public static int field8271;
   @OriginalMember(
      owner = "client!gh",
      name = "h",
      descriptor = "I"
   )
   public static int field8273;
   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "Lgh;"
   )
   public static class572 field8267;

   @OriginalMember(
      owner = "client!gh",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4239(int arg0) {
      try {
         field8267 = null;
         field8272 = null;
         int var1 = -29 % ((arg0 - 39) / 54);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8274[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class572(int arg0, int arg1) {
      try {
         this.field8265 = arg1;
         this.field8268 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8274[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4240(int arg0, int arg1) {
      try {
         if (arg1 <= 36) {
            method4239(-20);
         }

         ++field8269;
         class536 var2 = class108.method1038((long)arg0, 34, 12);
         var2.method4013((byte)126);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8274[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method4241(int arg0) {
      try {
         ++field8273;
         if (arg0 < 79) {
            method4240(-95, -105);
         }

         return this.field8268;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8274[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field8266;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8274[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4242(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4243(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
