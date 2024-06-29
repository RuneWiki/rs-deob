import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class590 implements class10 {
   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8518 = new String[]{method4364(method4363("]-C\u001f\u0001")), method4364(method4363("MiCpT")), method4364(method4363("Hv\u0001]"))};
   @OriginalMember(
      owner = "client!kj",
      name = "c",
      descriptor = "S"
   )
   public static short field8515 = 32767;
   @OriginalMember(
      owner = "client!kj",
      name = "b",
      descriptor = "I"
   )
   public static int field8514;
   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "I"
   )
   public static int field8516;
   @OriginalMember(
      owner = "client!kj",
      name = "d",
      descriptor = "I"
   )
   public static int field8517;

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(ILhm;[IJ)Ljava/lang/String;"
   )
   public final String method64(int arg0, class230 arg1, int[] arg2, long arg3) {
      try {
         ++field8516;
         if (class542.field7860 == arg1) {
            class89 var6 = class289.field4048.method4077(arg2[0], -2);
            return var6.method869(1, (int)arg3);
         } else if (arg0 != 0) {
            return null;
         } else if (class223.field3327 != arg1 && class431.field6250 != arg1) {
            return class497.field7267 != arg1 && class290.field4055 != arg1 && class281.field3939 != arg1 ? null : class289.field4048.method4077(arg2[0], -2).method869(1, (int)arg3);
         } else {
            class439 var7 = class408.field5993.method845((byte)-29, (int)arg3);
            return var7.field6353;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8518[1] + arg0 + ',' + (arg1 != null ? field8518[0] : field8518[2]) + ',' + (arg2 != null ? field8518[0] : field8518[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4363(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4364(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
