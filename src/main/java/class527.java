import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class527 implements class765 {
   @OriginalMember(
      owner = "client!ve",
      name = "f",
      descriptor = "Lkf;"
   )
   private class264 field7683;
   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7688 = new String[]{method3952(method3951("\u0011\u0010Z\u007fX")), method3952(method3951("\u0011\u0010ZqX")), method3952(method3951("\u0011\u0010Z\u0004\u0019\t\u001c\u0000\u0006X")), method3952(method3951("\u001c[Z\u0016\r")), method3952(method3951("\t\u0000\u0018T")), method3952(method3951("\u0011\u0010Z{X")), method3952(method3951("\u0011\u0010ZyX")), method3952(method3951("\u0011\u0010ZzX"))};
   @OriginalMember(
      owner = "client!ve",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field7681 = false;
   @OriginalMember(
      owner = "client!ve",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7687 = new String[]{method3952(method3951("\u0002\u001b")), method3952(method3951("\u0003\u0010")), method3952(method3951("\u0001\u0007")), method3952(method3951("\u0017\u0001")), method3952(method3951("\t\u0019"))};
   @OriginalMember(
      owner = "client!ve",
      name = "g",
      descriptor = "Luw;"
   )
   public static class435 field7679 = new class435(34, -1);
   @OriginalMember(
      owner = "client!ve",
      name = "h",
      descriptor = "F"
   )
   public static float field7685;
   @OriginalMember(
      owner = "client!ve",
      name = "i",
      descriptor = "I"
   )
   public static int field7678;
   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "I"
   )
   public static int field7680;
   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "I"
   )
   public static int field7684;
   @OriginalMember(
      owner = "client!ve",
      name = "e",
      descriptor = "I"
   )
   public static int field7686;
   @OriginalMember(
      owner = "client!ve",
      name = "d",
      descriptor = "Leca;"
   )
   public static class789 field7682;

   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3949(byte arg0) {
      try {
         ++field7678;
         if (arg0 == -80) {
            class23.field355.method1589((byte)122);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7688[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method61(int arg0) {
      try {
         if (arg0 == -15367) {
            ++field7686;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7688[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3950(int arg0) {
      try {
         if (arg0 == -23908) {
            field7679 = null;
            field7682 = null;
            field7687 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7688[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method59(byte arg0) {
      try {
         int var2 = 4 % ((arg0 - 62) / 51);
         ++field7680;
         return true;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7688[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "<init>",
      descriptor = "(Lkf;)V"
   )
   public class527(class264 arg0) {
      try {
         this.field7683 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7688[2] + (arg0 != null ? field7688[3] : field7688[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method58(boolean arg0, int arg1) {
      try {
         if (arg1 != 9124) {
            this.method61(23);
         }

         if (arg0) {
            class444.field6473.method295(0, 0, class720.field10406, class218.field3296, this.field7683.field3750, 0);
         }

         ++field7684;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7688[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3951(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3952(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
