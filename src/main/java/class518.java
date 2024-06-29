import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class518 {
   @OriginalMember(
      owner = "client!bn",
      name = "c",
      descriptor = "I"
   )
   public int field7245;
   @OriginalMember(
      owner = "client!bn",
      name = "h",
      descriptor = "S"
   )
   public short field7248;
   @OriginalMember(
      owner = "client!bn",
      name = "d",
      descriptor = "Z"
   )
   public boolean field7241;
   @OriginalMember(
      owner = "client!bn",
      name = "g",
      descriptor = "I"
   )
   public int field7243;
   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "S"
   )
   public short field7242;
   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "I"
   )
   public int field7250;
   @OriginalMember(
      owner = "client!bn",
      name = "i",
      descriptor = "I"
   )
   public int field7249;
   @OriginalMember(
      owner = "client!bn",
      name = "k",
      descriptor = "B"
   )
   public byte field7247;
   @OriginalMember(
      owner = "client!bn",
      name = "j",
      descriptor = "S"
   )
   public short field7246;
   @OriginalMember(
      owner = "client!bn",
      name = "e",
      descriptor = "I"
   )
   public int field7244;
   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7252 = new String[]{method3893(method3892("hM0\fKdJj\u000e\n")), method3893(method3892("hM0q\n"))};
   @OriginalMember(
      owner = "client!bn",
      name = "f",
      descriptor = "Lifa;"
   )
   public static class75 field7251 = new class75(7, 7);

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3891(int arg0) {
      try {
         if (arg0 != 16821) {
            field7251 = null;
         }

         field7251 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7252[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field7245 = arg0;
         this.field7248 = (short)arg5;
         this.field7241 = arg10;
         this.field7243 = arg3;
         this.field7242 = (short)arg6;
         this.field7250 = arg11;
         this.field7249 = arg2;
         this.field7247 = (byte)arg8;
         this.field7246 = (short)arg4;
         this.field7244 = arg1;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field7252[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3892(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3893(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
