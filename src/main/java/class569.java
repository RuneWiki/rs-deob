import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class569 implements class644 {
   @OriginalMember(
      owner = "client!kga",
      name = "g",
      descriptor = "Lfk;"
   )
   public class678 field8239;
   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "I"
   )
   public int field8244;
   @OriginalMember(
      owner = "client!kga",
      name = "k",
      descriptor = "I"
   )
   public int field8240;
   @OriginalMember(
      owner = "client!kga",
      name = "n",
      descriptor = "I"
   )
   public int field8243;
   @OriginalMember(
      owner = "client!kga",
      name = "f",
      descriptor = "I"
   )
   public int field8235;
   @OriginalMember(
      owner = "client!kga",
      name = "c",
      descriptor = "Z"
   )
   public boolean field8245;
   @OriginalMember(
      owner = "client!kga",
      name = "m",
      descriptor = "I"
   )
   public int field8248;
   @OriginalMember(
      owner = "client!kga",
      name = "l",
      descriptor = "Lqda;"
   )
   public class112 field8241;
   @OriginalMember(
      owner = "client!kga",
      name = "j",
      descriptor = "I"
   )
   public int field8237;
   @OriginalMember(
      owner = "client!kga",
      name = "e",
      descriptor = "I"
   )
   public int field8246;
   @OriginalMember(
      owner = "client!kga",
      name = "b",
      descriptor = "I"
   )
   public int field8238;
   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8249 = new String[]{method4234(method4233("\u0001\f*3uB")), method4234(method4233("\u0011Ee3J")), method4234(method4233("\u0001\f*3\u000b\u0003\u0005\"i\tB")), method4234(method4233("\u0004\u001e'q")), method4234(method4233("\u0001\f*3vB"))};
   @OriginalMember(
      owner = "client!kga",
      name = "d",
      descriptor = "[Lau;"
   )
   public static class767[] field8247 = new class767[8];
   @OriginalMember(
      owner = "client!kga",
      name = "h",
      descriptor = "I"
   )
   public static int field8242;
   @OriginalMember(
      owner = "client!kga",
      name = "i",
      descriptor = "[[S"
   )
   public static short[][] field8236;

   @OriginalMember(
      owner = "client!kga",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4232(byte arg0) {
      try {
         field8236 = null;
         if (arg0 >= -59) {
            field8247 = null;
         }

         field8247 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8249[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(B)Lqg;"
   )
   public final class485 method672(byte arg0) {
      try {
         ++field8242;
         return arg0 != 83 ? null : class289.field4044;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8249[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "<init>",
      descriptor = "(ILfk;Lqda;IIIIIIIZ)V"
   )
   public class569(int arg0, class678 arg1, class112 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
      try {
         this.field8239 = arg1;
         this.field8244 = arg9;
         this.field8240 = arg6;
         this.field8243 = arg5;
         this.field8235 = arg3;
         this.field8245 = arg10;
         this.field8248 = arg4;
         this.field8241 = arg2;
         this.field8237 = arg8;
         this.field8246 = arg0;
         this.field8238 = arg7;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field8249[2] + arg0 + ',' + (arg1 != null ? field8249[1] : field8249[3]) + ',' + (arg2 != null ? field8249[1] : field8249[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4233(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4234(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
