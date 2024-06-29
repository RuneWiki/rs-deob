import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class587 extends class644 {
   @OriginalMember(
      owner = "client!op",
      name = "x",
      descriptor = "I"
   )
   private int field8665 = -1;
   @OriginalMember(
      owner = "client!op",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8666 = new String[]{method4377(method4376("v\"@N2")), method4377(method4376("v\"@L2")), method4377(method4376("w'\u0002a")), method4377(method4376("v\"@O2")), method4377(method4376("b|@#g")), method4377(method4376("v\"@H2"))};
   @OriginalMember(
      owner = "client!op",
      name = "A",
      descriptor = "I"
   )
   private int field8657;
   @OriginalMember(
      owner = "client!op",
      name = "y",
      descriptor = "I"
   )
   private int field8658;
   @OriginalMember(
      owner = "client!op",
      name = "v",
      descriptor = "I"
   )
   public static int field8660;
   @OriginalMember(
      owner = "client!op",
      name = "t",
      descriptor = "I"
   )
   public static int field8661;
   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "I"
   )
   public static int field8662;
   @OriginalMember(
      owner = "client!op",
      name = "w",
      descriptor = "I"
   )
   private int field8663;
   @OriginalMember(
      owner = "client!op",
      name = "u",
      descriptor = "Lww;"
   )
   public static class339 field8664;
   @OriginalMember(
      owner = "client!op",
      name = "s",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field8659;

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         ++field8662;
         if (arg0 == 19163) {
            arg1.method5692(this.field8663, this.field8665, this.field8658, (byte)-123, this.field8657);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8666[3] + arg0 + ',' + (arg1 != null ? field8666[4] : field8666[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method4374(int arg0) {
      try {
         if (arg0 != -1) {
            field8659 = null;
         }

         ++field8661;
         class502.field6981.method3201((byte)-29);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8666[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4375(byte arg0) {
      try {
         if (arg0 < 64) {
            field8659 = null;
         }

         field8664 = null;
         field8659 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8666[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         this.field8665 = arg1.method603(arg0 + -13);
         ++field8660;
         this.field8658 = arg1.method610(arg0 ^ -22);
         this.field8663 = arg1.method640(255);
         this.field8657 = arg1.method640(255);
         if (arg0 != 11) {
            field8664 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8666[5] + arg0 + ',' + (arg1 != null ? field8666[4] : field8666[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4376(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4377(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
