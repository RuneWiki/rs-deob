import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class648 {
   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9468 = new String[]{method4724(method4723("\u0005\u000f\u001d\u0004F")), method4724(method4723("\u0005\u000f\u001d\u0007F"))};
   @OriginalMember(
      owner = "client!tl",
      name = "e",
      descriptor = "I"
   )
   public int field9460;
   @OriginalMember(
      owner = "client!tl",
      name = "d",
      descriptor = "I"
   )
   public static int field9461;
   @OriginalMember(
      owner = "client!tl",
      name = "b",
      descriptor = "I"
   )
   public static int field9462;
   @OriginalMember(
      owner = "client!tl",
      name = "g",
      descriptor = "I"
   )
   public static int field9463;
   @OriginalMember(
      owner = "client!tl",
      name = "c",
      descriptor = "I"
   )
   public int field9464;
   @OriginalMember(
      owner = "client!tl",
      name = "f",
      descriptor = "I"
   )
   public int field9465;
   @OriginalMember(
      owner = "client!tl",
      name = "h",
      descriptor = "I"
   )
   public static int field9466;
   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "I"
   )
   public int field9467;

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(III)I",
      line = 4
   )
   public static final int method4721(int arg0, int arg1, int arg2) {
      try {
         ++field9461;
         double var3 = Math.log((double)arg1) / Math.log(2.0D);
         double var5 = Math.log((double)arg0) / Math.log(2.0D);
         double var7 = var5 + (-var5 + var3) * Math.random();
         if (arg2 != -49) {
            field9463 = -81;
         }

         return (int)(0.5D + Math.pow(2.0D, var7));
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field9468[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(CI)Z",
      line = 22
   )
   public static final boolean method4722(char arg0, int arg1) {
      try {
         ++field9466;
         int var2 = 88 % ((-19 - arg1) / 33);
         return ~arg0 <= -49 && ~arg0 >= -58;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9468[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4723(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4724(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
