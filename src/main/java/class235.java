import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class235 {
   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3279 = new String[]{method1816(method1815("J$C_}")), method1816(method1815("J$C]}")), method1816(method1815("J$C^}")), method1816(method1815("J$CX}"))};
   @OriginalMember(
      owner = "client!nt",
      name = "b",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field3277 = new Color[]{new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "I"
   )
   public static int field3273;
   @OriginalMember(
      owner = "client!nt",
      name = "f",
      descriptor = "I"
   )
   public static int field3274;
   @OriginalMember(
      owner = "client!nt",
      name = "e",
      descriptor = "I"
   )
   public static int field3275;
   @OriginalMember(
      owner = "client!nt",
      name = "d",
      descriptor = "I"
   )
   public static int field3276;
   @OriginalMember(
      owner = "client!nt",
      name = "c",
      descriptor = "[Lmha;"
   )
   public static class439[] field3278;

   @OriginalMember(
      owner = "client!nt",
      name = "b",
      descriptor = "(III)B",
      line = 3
   )
   public static final byte method1811(int arg0, int arg1, int arg2) {
      try {
         if (arg1 >= -66) {
            method1813(true);
         }

         ++field3274;
         if (arg2 != 9) {
            return 0;
         } else {
            return (byte)(~(1 & arg0) == -1 ? 1 : 2);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3279[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "b",
      descriptor = "(Z)V",
      line = 24
   )
   public static void method1812(boolean arg0) {
      try {
         if (arg0) {
            field3278 = null;
         }

         field3277 = null;
         field3278 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3279[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(Z)[Lep;",
      line = 38
   )
   public static final class446[] method1813(boolean arg0) {
      try {
         ++field3275;
         if (arg0) {
            method1811(-99, 109, 85);
         }

         return new class446[]{class474.field6828, class187.field2659, class271.field3743};
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3279[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(III)B",
      line = 53
   )
   public static final byte method1814(int arg0, int arg1, int arg2) {
      try {
         ++field3276;
         if (arg2 != 9) {
            return 0;
         } else if (arg1 != -41) {
            return 108;
         } else {
            return (byte)((arg0 & 1) == 0 ? 1 : 2);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3279[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1815(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1816(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
