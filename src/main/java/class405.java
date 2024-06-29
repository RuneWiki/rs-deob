import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class405 {
   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5960 = new String[]{method3156(method3155("\u000ez#4I")), method3156(method3155("\u000ez#6I"))};
   @OriginalMember(
      owner = "client!tv",
      name = "b",
      descriptor = "I"
   )
   public static int field5957 = 0;
   @OriginalMember(
      owner = "client!tv",
      name = "c",
      descriptor = "F"
   )
   public static float field5959;
   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "I"
   )
   public static int field5955;
   @OriginalMember(
      owner = "client!tv",
      name = "d",
      descriptor = "I"
   )
   public static int field5956;
   @OriginalMember(
      owner = "client!tv",
      name = "e",
      descriptor = "I"
   )
   public static int field5958;

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method3152(int arg0, int arg1, boolean arg2) {
      try {
         ++field5956;
         if (!arg2) {
            return false;
         } else {
            return (16 & arg0) != 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5960[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3153(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -26058) {
            method3152(113, 68, true);
         }

         ++field5955;
         return (arg1 & 55) != 0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5960[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(Ldea;)V"
   )
   public static final void method3154(class471 arg0) {
      class720.field10315.method248(arg0.field6832, arg0.field6829 + (arg0.method728(0) >> 1), arg0.field6833, class527.field7458);
      arg0.field6825 = class527.field7458[0];
      arg0.field6830 = class527.field7458[1];
      arg0.field6837 = class527.field7458[2];
   }

   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3155(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3156(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
