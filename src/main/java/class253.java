import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class253 extends class191 {
   @OriginalMember(
      owner = "client!os",
      name = "o",
      descriptor = "I"
   )
   private int field3840 = -1;
   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3844 = new String[]{method2171(method2170("l}$K\u0006")), method2171(method2170("m{fc")), method2171(method2170("x $!S")), method2171(method2170("l}$J\u0006")), method2171(method2170("l}$L\u0006")), method2171(method2170("l}$M\u0006"))};
   @OriginalMember(
      owner = "client!os",
      name = "m",
      descriptor = "Liw;"
   )
   public static class107 field3838 = new class107(8);
   @OriginalMember(
      owner = "client!os",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field3843 = false;
   @OriginalMember(
      owner = "client!os",
      name = "q",
      descriptor = "Lfm;"
   )
   public static class164 field3842 = new class164(78, 1);
   @OriginalMember(
      owner = "client!os",
      name = "n",
      descriptor = "B"
   )
   private byte field3836;
   @OriginalMember(
      owner = "client!os",
      name = "l",
      descriptor = "I"
   )
   public static int field3837;
   @OriginalMember(
      owner = "client!os",
      name = "p",
      descriptor = "I"
   )
   public static int field3839;
   @OriginalMember(
      owner = "client!os",
      name = "r",
      descriptor = "I"
   )
   public static int field3841;

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2168(int arg0) {
      try {
         field3838 = null;
         if (arg0 != 1) {
            method2168(108);
         }

         field3842 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3844[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         ++field3839;
         this.field3840 = arg0.method685(-2);
         if (arg1 >= -97) {
            method2169((class91)null, (byte)-35);
         }

         this.field3836 = arg0.method638(true);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3844[4] + (arg0 != null ? field3844[2] : field3844[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(Ljga;B)V"
   )
   public static final void method2169(class91 arg0, byte arg1) {
      try {
         if (arg1 > -4) {
            method2169((class91)null, (byte)-102);
         }

         ++field3837;
         if (arg0.field1403 == 5 && ~arg0.field1428 != 0) {
            class351.method2773(class54.field794, (byte)74, arg0);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3844[3] + (arg0 != null ? field3844[2] : field3844[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         if (arg0 < -106) {
            ++field3841;
            arg1.method3535(this.field3836, this.field3840, (byte)36);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3844[5] + arg0 + ',' + (arg1 != null ? field3844[2] : field3844[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2170(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2171(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
