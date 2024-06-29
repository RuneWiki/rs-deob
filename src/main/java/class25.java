import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class25 extends class686 {
   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field362 = new String[]{method320(method319(";\u001f\u000bq\u000f")), method320(method319(";\u001f\u000b\u007f\u000f")), method320(method319(";\u001f\u000b~\u000f")), method320(method319(">\u0000IZ")), method320(method319(";\u001f\u000bp\u000f")), method320(method319("+[\u000b\u0018Z"))};
   @OriginalMember(
      owner = "client!kj",
      name = "l",
      descriptor = "Lhha;"
   )
   public static class724 field353 = new class724(126, 8);
   @OriginalMember(
      owner = "client!kj",
      name = "t",
      descriptor = "Lhha;"
   )
   public static class724 field354 = new class724(94, 3);
   @OriginalMember(
      owner = "client!kj",
      name = "o",
      descriptor = "Ldi;"
   )
   public static class577 field359 = new class577(4, 1);
   @OriginalMember(
      owner = "client!kj",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field361 = false;
   @OriginalMember(
      owner = "client!kj",
      name = "m",
      descriptor = "I"
   )
   public static int field352;
   @OriginalMember(
      owner = "client!kj",
      name = "u",
      descriptor = "I"
   )
   public static int field355;
   @OriginalMember(
      owner = "client!kj",
      name = "s",
      descriptor = "I"
   )
   public static int field357;
   @OriginalMember(
      owner = "client!kj",
      name = "r",
      descriptor = "I"
   )
   public static int field360;
   @OriginalMember(
      owner = "client!kj",
      name = "p",
      descriptor = "Lkj;"
   )
   public class25 field356;
   @OriginalMember(
      owner = "client!kj",
      name = "q",
      descriptor = "Lkj;"
   )
   public class25 field358;

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method315(int arg0) {
      try {
         ++field357;
         if (this.field356 != null) {
            if (arg0 != -10441) {
               this.method315(48);
            }

            this.field356.field358 = this.field358;
            this.field358.field356 = this.field356;
            this.field356 = null;
            this.field358 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field362[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method316(int arg0) {
      try {
         if (arg0 < 63) {
            method316(-112);
         }

         field359 = null;
         field353 = null;
         field354 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field362[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method317(int arg0, byte arg1) {
      try {
         class448.field6532.method1048(arg0, -8543);
         ++field352;
         if (arg1 != -21) {
            field360 = -15;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field362[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "([I[Ljava/lang/Object;B)V"
   )
   public static final void method318(int[] arg0, Object[] arg1, byte arg2) {
      try {
         class525.method3933(arg0, arg1, arg0.length + -1, 14845, 0);
         if (arg2 < -100) {
            ++field355;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field362[4] + (arg0 != null ? field362[5] : field362[3]) + ',' + (arg1 != null ? field362[5] : field362[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method319(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method320(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
