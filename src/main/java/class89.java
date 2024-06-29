import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class89 extends class673 {
   @OriginalMember(
      owner = "client!rda",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field1204;
   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1210 = new String[]{method833(method832("\u0017;V\u001fY\f1^E[M")), method833(method832("\u001eq\u0019\u001f\u0018")), method833(method832("\u000b*[]")), method833(method832("\u0017;V\u001f$M")), method833(method832("\u0017;V\u001f'M"))};
   @OriginalMember(
      owner = "client!rda",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field1208 = false;
   @OriginalMember(
      owner = "client!rda",
      name = "q",
      descriptor = "F"
   )
   public static float field1206;
   @OriginalMember(
      owner = "client!rda",
      name = "m",
      descriptor = "I"
   )
   public static int field1207;
   @OriginalMember(
      owner = "client!rda",
      name = "n",
      descriptor = "I"
   )
   public static int field1209;
   @OriginalMember(
      owner = "client!rda",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field1205;

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method830(byte arg0) {
      try {
         field1205 = null;
         int var1 = -92 / ((-15 - arg0) / 63);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1210[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(BLnk;)Z"
   )
   public static final boolean method831(byte arg0, class484 arg1) {
      try {
         if (arg0 != -105) {
            method830((byte)-120);
         }

         ++field1209;
         return arg1 == null ? false : class280.method2205(arg1.field6730, -123, -arg1.field6729 + arg1.field6727, -arg1.field6728 + arg1.field6726, arg1.field6728, arg1.field6729, -arg1.field6730 + arg1.field6735);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1210[3] + arg0 + ',' + (arg1 != null ? field1210[1] : field1210[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "<init>",
      descriptor = "()V"
   )
   public class89() {
   }

   @OriginalMember(
      owner = "client!rda",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class89(String arg0, int arg1) {
      try {
         this.field1204 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1210[0] + (arg0 != null ? field1210[1] : field1210[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method832(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method833(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
