import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class376 extends class588 {
   @OriginalMember(
      owner = "client!vh",
      name = "s",
      descriptor = "J"
   )
   private long field5582 = -1L;
   @OriginalMember(
      owner = "client!vh",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   private String field5585 = null;
   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5590 = new String[]{method2941(method2940("\u0005\u0012E5H")), method2941(method2940("S\u0017\u000e\u001b\u0002\u0016\b\u0005\u0017\r\u0016@")), method2941(method2940("\u001e\u001f\u0006\u0014\u0005\u0001\u0012\n\u0005\bI")), method2941(method2940("\bTEX\u001d")), method2941(method2940("\u001d\u000f\u0007\u001a")), method2941(method2940("\u0005\u0012E>H")), method2941(method2940("\u0005\u0012E7H")), method2941(method2940("\u0005\u0012E4H"))};
   @OriginalMember(
      owner = "client!vh",
      name = "v",
      descriptor = "I"
   )
   public static int field5588 = 0;
   @OriginalMember(
      owner = "client!vh",
      name = "t",
      descriptor = "Ljava/util/Random;"
   )
   public static Random field5589 = new Random();
   @OriginalMember(
      owner = "client!vh",
      name = "w",
      descriptor = "I"
   )
   public static int field5583;
   @OriginalMember(
      owner = "client!vh",
      name = "p",
      descriptor = "I"
   )
   public static int field5584;
   @OriginalMember(
      owner = "client!vh",
      name = "u",
      descriptor = "I"
   )
   public static int field5587;
   @OriginalMember(
      owner = "client!vh",
      name = "q",
      descriptor = "[[B"
   )
   public static byte[][] field5586;

   @OriginalMember(
      owner = "client!vh",
      name = "b",
      descriptor = "(B)V",
      line = 4
   )
   public static void method2938(byte arg0) {
      try {
         field5589 = null;
         field5586 = null;
         int var1 = 27 / ((arg0 - 52) / 46);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5590[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(BLuda;)V",
      line = 29
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         ++field5587;
         if (~arg1.method3564((byte)-78) != -256) {
            --arg1.field6907;
            this.field5582 = arg1.method3523(-115);
         }

         this.field5585 = arg1.method3529(false);
         if (class168.field2631) {
            System.out.println(field5590[2] + this.field5582 + field5590[1] + this.field5585);
         }

         int var3 = 5 % ((arg0 - -26) / 33);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5590[5] + arg0 + ',' + (arg1 != null ? field5590[3] : field5590[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(IIIIIB)V",
      line = 51
   )
   public static final void method2939(int param0, int param1, int param2, int param3, int param4, byte param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(Lwga;I)V",
      line = 85
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         arg0.method5630(this.field5582, this.field5585, 0);
         ++field5583;
         if (arg1 >= -120) {
            field5589 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5590[7] + (arg0 != null ? field5590[3] : field5590[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2940(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2941(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
