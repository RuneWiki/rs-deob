import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class396 extends class191 {
   @OriginalMember(
      owner = "client!pe",
      name = "n",
      descriptor = "J"
   )
   private long field5872 = -1L;
   @OriginalMember(
      owner = "client!pe",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   private String field5871 = null;
   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5875 = new String[]{method3088(method3087("1\u0011x Q")), method3088(method3087("/\u0001:\n")), method3088(method3087(":ZxH\u0004")), method3088(method3087("1\u0011x$Q")), method3088(method3087("1\u0011x%Q")), method3088(method3087("a\u00193\u000b\u001b$\u00068\u0007\u0014$N")), method3088(method3087(",\u0011;\u0004\u001c3\u001c7\u0015\u0011{")), method3088(method3087("1\u0011x#Q")), method3088(method3087("1\u0011x\"Q"))};
   @OriginalMember(
      owner = "client!pe",
      name = "o",
      descriptor = "J"
   )
   public static long field5869 = 0L;
   @OriginalMember(
      owner = "client!pe",
      name = "s",
      descriptor = "Lhn;"
   )
   public static class357 field5870 = new class357(method3088(method3087("\u0016 \u0004%")), method3088(method3087(".\u00120\u000f\u001a$")), method3088(method3087("\u001e\u00065")), 1);
   @OriginalMember(
      owner = "client!pe",
      name = "m",
      descriptor = "I"
   )
   public static int field5867;
   @OriginalMember(
      owner = "client!pe",
      name = "p",
      descriptor = "I"
   )
   public static int field5868;
   @OriginalMember(
      owner = "client!pe",
      name = "r",
      descriptor = "I"
   )
   public static int field5873;
   @OriginalMember(
      owner = "client!pe",
      name = "l",
      descriptor = "I"
   )
   public static int field5874;

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         if (arg1 > -97) {
            method3085(-14, 91, -26);
         }

         ++field5874;
         if (~arg0.method665(false) != -256) {
            --arg0.field945;
            this.field5872 = arg0.method680(-129);
         }

         this.field5871 = arg0.method641((byte)102);
         if (class455.field6615) {
            System.out.println(field5875[6] + this.field5872 + field5875[5] + this.field5871);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5875[4] + (arg0 != null ? field5875[2] : field5875[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3084(int arg0) {
      try {
         if (arg0 == 0) {
            field5870 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5875[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         if (arg0 >= -106) {
            field5870 = null;
         }

         ++field5867;
         arg1.method3516(this.field5871, 0, (byte)-106, this.field5872);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5875[3] + arg0 + ',' + (arg1 != null ? field5875[2] : field5875[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3085(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -1) {
            field5869 = -123L;
         }

         ++field5868;
         class437 var3 = class341.field5025[arg0][arg1];
         if (var3 != null) {
            class653.field9253 = var3.field6405;
            class337.field4992 = var3.field6403;
            class186.field2759 = var3.field6396;
         }

         class444.method3446(-1370);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5875[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method3086(int arg0) {
      try {
         if (arg0 != -8937) {
            field5870 = null;
         }

         ++field5873;
         return class615.method4523(-70, false);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5875[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3087(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3088(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
