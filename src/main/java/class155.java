import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class155 {
   @OriginalMember(
      owner = "client!bi",
      name = "d",
      descriptor = "Llja;"
   )
   private class728 field2001;
   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2006 = new String[]{method1317(method1316("$8{L\u0005")), method1317(method1316("($9b")), method1317(method1316("=\u007f{ P")), method1317(method1316("$8{2D(8!0\u0005")), method1317(method1316("$8{O\u0005"))};
   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "I"
   )
   public static int field1999 = 0;
   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "I"
   )
   public static int field2003;
   @OriginalMember(
      owner = "client!bi",
      name = "e",
      descriptor = "I"
   )
   public static int field2004;
   @OriginalMember(
      owner = "client!bi",
      name = "c",
      descriptor = "I"
   )
   public static int field2005;
   @OriginalMember(
      owner = "client!bi",
      name = "g",
      descriptor = "J"
   )
   public static long field2000;
   @OriginalMember(
      owner = "client!bi",
      name = "f",
      descriptor = "Loe;"
   )
   private class15 field2002;

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(B)Loe;"
   )
   public final class15 method1314(byte arg0) {
      try {
         ++field2003;
         class15 var2 = this.field2002;
         if (this.field2001.field10622 == var2) {
            this.field2002 = null;
            return null;
         } else {
            if (arg0 < 26) {
               this.method1314((byte)-89);
            }

            this.field2002 = var2.field272;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2006[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "<init>",
      descriptor = "()V"
   )
   public class155() {
   }

   @OriginalMember(
      owner = "client!bi",
      name = "<init>",
      descriptor = "(Llja;)V"
   )
   public class155(class728 arg0) {
      try {
         this.field2001 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2006[3] + (arg0 != null ? field2006[2] : field2006[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(I)Loe;"
   )
   public final class15 method1315(int arg0) {
      try {
         if (arg0 != 0) {
            field1999 = 10;
         }

         ++field2005;
         class15 var2 = this.field2001.field10622.field272;
         if (this.field2001.field10622 == var2) {
            this.field2002 = null;
            return null;
         } else {
            this.field2002 = var2.field272;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2006[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1316(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1317(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
