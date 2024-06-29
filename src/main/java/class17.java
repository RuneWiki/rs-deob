import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class17 extends class347 {
   @OriginalMember(
      owner = "client!kh",
      name = "l",
      descriptor = "I"
   )
   public int field200;
   @OriginalMember(
      owner = "client!kh",
      name = "i",
      descriptor = "I"
   )
   public int field201;
   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field203 = new String[]{method123(method122("\"l\u001d1;")), method123(method122("2*\u001d^n")), method123(method122("'q_\u001c")), method123(method122("\"l\u001dLz'mGN;"))};
   @OriginalMember(
      owner = "client!kh",
      name = "k",
      descriptor = "I"
   )
   public static int field199;
   @OriginalMember(
      owner = "client!kh",
      name = "j",
      descriptor = "I"
   )
   public static int field202;

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(Ld;IIILjava/awt/Canvas;)Lha;",
      line = 6
   )
   public static final class66 method121(class160 arg0, int arg1, int arg2, int arg3, Canvas arg4) {
      try {
         ++field199;
         return arg2 != 7596 ? null : new class722(arg4, arg0, arg1, arg3);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field203[0] + (arg0 != null ? field203[1] : field203[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field203[1] : field203[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "<init>",
      descriptor = "(II)V",
      line = 18
   )
   public class17(int arg0, int arg1) {
      try {
         this.field200 = arg0;
         this.field201 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field203[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method122(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method123(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
