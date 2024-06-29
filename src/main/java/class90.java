import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class90 {
   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1328 = new String[]{method915(method914(",=l\u001fi")), method915(method914("7-.1")), method915(method914("\"vls<")), method915(method914(",=l\u001ci"))};
   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "I"
   )
   public static int field1325;
   @OriginalMember(
      owner = "client!ue",
      name = "c",
      descriptor = "I"
   )
   public static int field1326;
   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "I"
   )
   public static int field1327;

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;Ld;B)Lha;"
   )
   public static final class17 method912(int arg0, Canvas arg1, class672 arg2, byte arg3) {
      try {
         ++field1326;
         if (arg3 != -120) {
            method912(102, (Canvas)null, (class672)null, (byte)-50);
         }

         return new class678(arg1, arg2, arg0);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1328[3] + arg0 + ',' + (arg1 != null ? field1328[2] : field1328[1]) + ',' + (arg2 != null ? field1328[2] : field1328[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(IIZI)I"
   )
   public static final int method913(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         ++field1325;
         if (~(8 & class644.field9070[arg3][arg0][arg1]) != -1) {
            return 0;
         } else if (arg3 > 0 && ~(class644.field9070[1][arg0][arg1] & 2) != -1) {
            return arg3 + -1;
         } else {
            return !arg2 ? -1 : arg3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1328[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method914(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method915(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
