import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class497 {
   @OriginalMember(
      owner = "client!aja",
      name = "i",
      descriptor = "I"
   )
   public int field7568 = 128;
   @OriginalMember(
      owner = "client!aja",
      name = "l",
      descriptor = "I"
   )
   public int field7564 = 128;
   @OriginalMember(
      owner = "client!aja",
      name = "c",
      descriptor = "I"
   )
   public int field7563;
   @OriginalMember(
      owner = "client!aja",
      name = "d",
      descriptor = "I"
   )
   public int field7566;
   @OriginalMember(
      owner = "client!aja",
      name = "b",
      descriptor = "I"
   )
   public int field7573;
   @OriginalMember(
      owner = "client!aja",
      name = "k",
      descriptor = "I"
   )
   public int field7572;
   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7575 = new String[]{method3866(method3865("C<AH\u0014\n")), method3866(method3865("C<AH\u0012\n")), method3866(method3865("C<AH\u0011\n")), method3866(method3865("C<AHlK8I\u0012n\n")), method3866(method3865("Yx\u000eH-")), method3866(method3865("C<AH\u0013\n")), method3866(method3865("L#L\n")), method3866(method3865("C<AH\u0015\n"))};
   @OriginalMember(
      owner = "client!aja",
      name = "j",
      descriptor = "Lsn;"
   )
   public static class675 field7567 = new class675();
   @OriginalMember(
      owner = "client!aja",
      name = "f",
      descriptor = "I"
   )
   public static int field7565;
   @OriginalMember(
      owner = "client!aja",
      name = "e",
      descriptor = "I"
   )
   public static int field7569;
   @OriginalMember(
      owner = "client!aja",
      name = "h",
      descriptor = "I"
   )
   public static int field7570;
   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "I"
   )
   public static int field7571;
   @OriginalMember(
      owner = "client!aja",
      name = "g",
      descriptor = "I"
   )
   public static int field7574;

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(I)Laja;",
      line = 7
   )
   public final class497 method3860(int arg0) {
      try {
         if (arg0 != -25262) {
            return null;
         } else {
            ++field7574;
            return new class497(this.field7563, this.field7564, this.field7568, this.field7572, this.field7566, this.field7573);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7575[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(B)V",
      line = 19
   )
   public static void method3861(byte arg0) {
      try {
         field7567 = null;
         if (arg0 != 5) {
            method3863(56, (String)null);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7575[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(ILaja;)V",
      line = 29
   )
   public final void method3862(int arg0, class497 arg1) {
      try {
         if (arg0 == 128) {
            ++field7571;
            this.field7564 = arg1.field7564;
            this.field7572 = arg1.field7572;
            this.field7573 = arg1.field7573;
            this.field7563 = arg1.field7563;
            this.field7568 = arg1.field7568;
            this.field7566 = arg1.field7566;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7575[5] + arg0 + ',' + (arg1 != null ? field7575[4] : field7575[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "<init>",
      descriptor = "(I)V",
      line = 70
   )
   public class497(int arg0) {
      try {
         this.field7563 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7575[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 88
   )
   private class497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field7568 = arg2;
         this.field7566 = arg4;
         this.field7573 = arg5;
         this.field7572 = arg3;
         this.field7563 = arg0;
         this.field7564 = arg1;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7575[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(ILjava/lang/String;)V",
      line = 52
   )
   public static final void method3863(int arg0, String arg1) {
      try {
         class242.method2064("", 0, "", arg1, arg0 + -3688, "", 0);
         if (arg0 != 3687) {
            field7569 = -80;
         }

         ++field7565;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7575[7] + arg0 + ',' + (arg1 != null ? field7575[4] : field7575[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(II)Z",
      line = 78
   )
   public static final boolean method3864(int arg0, int arg1) {
      try {
         if (arg0 > -115) {
            return false;
         } else {
            ++field7570;
            return ~arg1 == -1 || ~arg1 == -3;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7575[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3865(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3866(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
