import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class698 {
   @OriginalMember(
      owner = "client!vfa",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field10220;
   @OriginalMember(
      owner = "client!vfa",
      name = "b",
      descriptor = "I"
   )
   public int field10222;
   @OriginalMember(
      owner = "client!vfa",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field10224;
   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "I"
   )
   public int field10223;
   @OriginalMember(
      owner = "client!vfa",
      name = "f",
      descriptor = "J"
   )
   public long field10225;
   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10226 = new String[]{method5075(method5074("&\u0001\u001c\u001a-x")), method5075(method5074(">\u0012\u0011X")), method5075(method5074("&\u0001\u001c\u001a.x")), method5075(method5074("+IS\u001a\u0012")), method5075(method5074("&\u0001\u001c\u001aS9\t\u0014@Qx"))};
   @OriginalMember(
      owner = "client!vfa",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10219 = null;
   @OriginalMember(
      owner = "client!vfa",
      name = "e",
      descriptor = "I"
   )
   public static int field10221;

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(Z)V",
      line = 4
   )
   public static void method5072(boolean arg0) {
      try {
         field10219 = null;
         if (!arg0) {
            field10219 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10226[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(ILoha;)V",
      line = 15
   )
   public static final void method5073(int param0, class771 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "<init>",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V",
      line = 126
   )
   public class698(int arg0, String arg1, int arg2, String arg3, long arg4) {
      try {
         this.field10220 = arg1;
         this.field10222 = arg0;
         this.field10224 = arg3;
         this.field10223 = arg2;
         this.field10225 = arg4;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10226[4] + arg0 + ',' + (arg1 != null ? field10226[3] : field10226[1]) + ',' + arg2 + ',' + (arg3 != null ? field10226[3] : field10226[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5074(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5075(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
