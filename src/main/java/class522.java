import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class522 extends class644 {
   @OriginalMember(
      owner = "client!bt",
      name = "u",
      descriptor = "I"
   )
   private int field7321 = -1;
   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7328 = new String[]{method3914(method3913("t5\u0004\u0002;")), method3914(method3913("anF@")), method3914(method3913("mo\u0004nn")), method3914(method3913("mo\u0004on")), method3914(method3913("mo\u0004in")), method3914(method3913("mo\u0004mn"))};
   @OriginalMember(
      owner = "client!bt",
      name = "t",
      descriptor = "Laka;"
   )
   public static class418 field7323 = new class418(55, 1);
   @OriginalMember(
      owner = "client!bt",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field7327 = false;
   @OriginalMember(
      owner = "client!bt",
      name = "s",
      descriptor = "I"
   )
   public static int field7322;
   @OriginalMember(
      owner = "client!bt",
      name = "w",
      descriptor = "I"
   )
   public static int field7324;
   @OriginalMember(
      owner = "client!bt",
      name = "x",
      descriptor = "I"
   )
   public static int field7325;
   @OriginalMember(
      owner = "client!bt",
      name = "v",
      descriptor = "I"
   )
   public static int field7326;

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         this.field7321 = arg1.method603(-2);
         ++field7324;
         if (arg0 != 11) {
            method3912(103, (class431)null);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7328[4] + arg0 + ',' + (arg1 != null ? field7328[0] : field7328[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         arg1.method5704(this.field7321, 103);
         if (arg0 != 19163) {
            this.method114(89, (class790)null);
         }

         ++field7325;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7328[2] + arg0 + ',' + (arg1 != null ? field7328[0] : field7328[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3911(byte arg0) {
      try {
         if (arg0 >= -101) {
            method3911((byte)55);
         }

         field7323 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7328[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(ILmb;)V"
   )
   public static final void method3912(int param0, class431 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3913(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3914(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
