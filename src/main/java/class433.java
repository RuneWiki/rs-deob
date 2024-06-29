import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class433 extends class629 {
   @OriginalMember(
      owner = "client!ln",
      name = "q",
      descriptor = "I"
   )
   public int field6660 = -1;
   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6666 = new String[]{method3421(method3420("2\u0005nHR")), method3421(method3420("2\u0005nJR")), method3421(method3420("2\u0005nKR"))};
   @OriginalMember(
      owner = "client!ln",
      name = "t",
      descriptor = "F"
   )
   public static float field6664;
   @OriginalMember(
      owner = "client!ln",
      name = "p",
      descriptor = "I"
   )
   public static int field6659;
   @OriginalMember(
      owner = "client!ln",
      name = "u",
      descriptor = "I"
   )
   public int field6662;
   @OriginalMember(
      owner = "client!ln",
      name = "r",
      descriptor = "I"
   )
   public static int field6663;
   @OriginalMember(
      owner = "client!ln",
      name = "s",
      descriptor = "I"
   )
   public static int field6665;
   @OriginalMember(
      owner = "client!ln",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   public String field6658;
   @OriginalMember(
      owner = "client!ln",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public String field6661;

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3417(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -22089) {
            return true;
         } else {
            ++field6659;
            return ~(arg1 & 2048) != -1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6666[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3418(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6663;
         class566 var5 = class146.method1321((long)arg0, 10, -1428737160);
         var5.method4269((byte)-109);
         var5.field8398 = arg1;
         var5.field8390 = arg4;
         var5.field8394 = arg3;
         if (arg2 != 2048) {
            field6664 = 0.11425798F;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6666[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "d",
      descriptor = "(I)Ljia;"
   )
   public final class426 method3419(int arg0) {
      try {
         ++field6665;
         if (arg0 != -1) {
            this.field6662 = 82;
         }

         return class31.field382[super.field9100];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6666[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3420(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3421(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
