import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class553 {
   @OriginalMember(
      owner = "client!rfa",
      name = "e",
      descriptor = "Lda;"
   )
   public class447 field8129 = null;
   @OriginalMember(
      owner = "client!rfa",
      name = "b",
      descriptor = "Lkv;"
   )
   public class19 field8134 = null;
   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8137 = new String[]{method4186(method4185(")d\u0014h")), method4186(method4185("<?V*,")), method4186(method4185("5w\u0019*m.\u007f\u0011poo")), method4186(method4185("5w\u0019*\u0010o")), method4186(method4185("5w\u0019*\u0012o")), method4186(method4185("5w\u0019*\u0013o"))};
   @OriginalMember(
      owner = "client!rfa",
      name = "g",
      descriptor = "Laka;"
   )
   public static class418 field8130 = new class418(108, 10);
   @OriginalMember(
      owner = "client!rfa",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field8133 = new class418(10, 4);
   @OriginalMember(
      owner = "client!rfa",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field8136 = false;
   @OriginalMember(
      owner = "client!rfa",
      name = "h",
      descriptor = "I"
   )
   public static int field8131;
   @OriginalMember(
      owner = "client!rfa",
      name = "f",
      descriptor = "I"
   )
   public static int field8132;
   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "Los;"
   )
   public static class277 field8135;

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4182(byte arg0) {
      try {
         field8130 = null;
         field8135 = null;
         field8133 = null;
         if (arg0 != -125) {
            method4183(-28);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8137[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4183(int arg0) {
      try {
         if (arg0 != 22744) {
            method4184((Canvas)null, 4, -96, (class102)null, -9);
         }

         class149.field1852 = -2;
         class623.field9218 = 0;
         ++field8132;
         class681.field10031 = -2;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8137[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;IILd;I)Lha;"
   )
   public static final class479 method4184(Canvas arg0, int arg1, int arg2, class102 arg3, int arg4) {
      try {
         ++field8131;
         return arg2 != -30722 ? null : new class195(arg0, arg3, arg4, arg1);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8137[4] + (arg0 != null ? field8137[1] : field8137[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8137[1] : field8137[0]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "<init>",
      descriptor = "(Lda;)V"
   )
   public class553(class447 arg0) {
      try {
         this.field8129 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8137[2] + (arg0 != null ? field8137[1] : field8137[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "<init>",
      descriptor = "(Lda;Lkv;)V"
   )
   public class553(class447 arg0, class19 arg1) {
      try {
         this.field8134 = arg1;
         this.field8129 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8137[2] + (arg0 != null ? field8137[1] : field8137[0]) + ',' + (arg1 != null ? field8137[1] : field8137[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4185(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4186(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
