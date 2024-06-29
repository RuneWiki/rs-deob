import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class730 implements class518 {
   @OriginalMember(
      owner = "client!ih",
      name = "g",
      descriptor = "Lada;"
   )
   public class175 field10684;
   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "Lkt;"
   )
   public class169 field10685;
   @OriginalMember(
      owner = "client!ih",
      name = "e",
      descriptor = "I"
   )
   public int field10683;
   @OriginalMember(
      owner = "client!ih",
      name = "c",
      descriptor = "I"
   )
   public int field10689;
   @OriginalMember(
      owner = "client!ih",
      name = "d",
      descriptor = "I"
   )
   public int field10688;
   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10690 = new String[]{method5320(method5319("4P\u0012|")), method5320(method5319("3MP,]4L\n.\u001c")), method5320(method5319("!\u000bP>I")), method5320(method5319("3MPR\u001c"))};
   @OriginalMember(
      owner = "client!ih",
      name = "f",
      descriptor = "I"
   )
   public static int field10686;
   @OriginalMember(
      owner = "client!ih",
      name = "b",
      descriptor = "I"
   )
   public static int field10687;

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(B)Lqca;",
      line = 12
   )
   public class127 method993(byte arg0) {
      try {
         if (arg0 != -48) {
            field10687 = -18;
         }

         ++field10686;
         return class509.field7411;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10690[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "<init>",
      descriptor = "(ILkt;Lada;II)V",
      line = 25
   )
   public class730(int arg0, class169 arg1, class175 arg2, int arg3, int arg4) {
      try {
         this.field10684 = arg2;
         this.field10685 = arg1;
         this.field10683 = arg0;
         this.field10689 = arg4;
         this.field10688 = arg3;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10690[1] + arg0 + ',' + (arg1 != null ? field10690[2] : field10690[0]) + ',' + (arg2 != null ? field10690[2] : field10690[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5319(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5320(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
