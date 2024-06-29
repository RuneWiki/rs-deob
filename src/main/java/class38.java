import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class38 extends class690 {
   @OriginalMember(
      owner = "client!ud",
      name = "m",
      descriptor = "I"
   )
   private int field441 = -1;
   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field449 = new String[]{method294(method293("uO\u0002n")), method294(method293("n^@F\u0010")), method294(method293("`\u0014@,E")), method294(method293("n^@A\u0010")), method294(method293("n^@C\u0010")), method294(method293("n^@@\u0010"))};
   @OriginalMember(
      owner = "client!ud",
      name = "o",
      descriptor = "I"
   )
   public static int field442;
   @OriginalMember(
      owner = "client!ud",
      name = "n",
      descriptor = "I"
   )
   private int field443;
   @OriginalMember(
      owner = "client!ud",
      name = "q",
      descriptor = "I"
   )
   public static int field444;
   @OriginalMember(
      owner = "client!ud",
      name = "t",
      descriptor = "I"
   )
   private int field445;
   @OriginalMember(
      owner = "client!ud",
      name = "s",
      descriptor = "I"
   )
   public static int field447;
   @OriginalMember(
      owner = "client!ud",
      name = "p",
      descriptor = "I"
   )
   private int field448;
   @OriginalMember(
      owner = "client!ud",
      name = "r",
      descriptor = "Lob;"
   )
   public static class772 field446;

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(IIILha;IIII)V"
   )
   public static final void method291(int arg0, int arg1, int arg2, class65 arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         arg3.method510(3966, arg6, arg2, arg5, arg4, arg0);
         ++field444;
         arg3.method510(3966, arg6 + 1, arg2 + 1, arg1, arg4 - 2, 16);
         arg3.method575(arg1, arg6 + 18, arg4 + arg7, arg0 + -19, 1, arg2 + 1);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field449[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field449[2] : field449[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method292(int arg0) {
      try {
         if (arg0 == 16) {
            field446 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field449[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         arg1.method1179(1, this.field441, this.field448, this.field445, this.field443);
         ++field447;
         if (arg0) {
            method291(62, -85, -92, (class65)null, -16, -10, 121, -118);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field449[3] + arg0 + ',' + (arg1 != null ? field449[2] : field449[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         this.field441 = arg0.method4280(-19104);
         ++field442;
         if (arg1 <= -19) {
            this.field443 = arg0.method4302(true);
            this.field448 = arg0.method4288((byte)115);
            this.field445 = arg0.method4288((byte)71);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field449[1] + (arg0 != null ? field449[2] : field449[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method293(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method294(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
