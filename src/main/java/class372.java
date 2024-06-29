import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class372 extends class297 {
   @OriginalMember(
      owner = "client!iea",
      name = "y",
      descriptor = "Loia;"
   )
   public class207 field5760;
   @OriginalMember(
      owner = "client!iea",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5766 = new String[]{method3040(method3039("\fHC\u0007")), method3040(method3039("\u000bXNEgJ")), method3040(method3039("\u0019\u0013\u0001EY")), method3040(method3039("\u000bXNE`J")), method3040(method3039("\u000bXNE\u0018\u000bSF\u001f\u001aJ")), method3040(method3039("\u000bXNEeJ")), method3040(method3039("\u000bXNEfJ"))};
   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field5761 = new int[128];
   @OriginalMember(
      owner = "client!iea",
      name = "w",
      descriptor = "I"
   )
   public static int field5762;
   @OriginalMember(
      owner = "client!iea",
      name = "x",
      descriptor = "I"
   )
   public static int field5763;
   @OriginalMember(
      owner = "client!iea",
      name = "u",
      descriptor = "I"
   )
   public static int field5765;
   @OriginalMember(
      owner = "client!iea",
      name = "v",
      descriptor = "Ljava/awt/Font;"
   )
   public static Font field5764;

   @OriginalMember(
      owner = "client!iea",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3035(int arg0) {
      try {
         field5764 = null;
         field5761 = null;
         if (arg0 >= -51) {
            method3038(4, 75, -79);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5766[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method3036(int arg0, int arg1, int arg2) {
      try {
         ++field5763;
         if (arg2 != 43) {
            return true;
         } else {
            return class618.method4547(arg0, arg1, arg2 ^ -28322) || class125.method1183(225, arg0, arg1);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5766[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "([II[Ljava/lang/Object;)V"
   )
   public static final void method3037(int[] arg0, int arg1, Object[] arg2) {
      try {
         class169.method1570(0, arg0, arg1 ^ -17844, arg2, arg0.length - 1);
         if (arg1 == 17843) {
            ++field5762;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5766[1] + (arg0 != null ? field5766[2] : field5766[0]) + ',' + arg1 + ',' + (arg2 != null ? field5766[2] : field5766[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3038(int arg0, int arg1, int arg2) {
      try {
         ++field5765;
         if (arg0 != 128) {
            field5764 = null;
         }

         return (class482.method3754(false, arg2, arg1) | (8192 & arg2) != 0 | class757.method5553(arg1, arg0 + -28412, arg2)) & class55.method411(arg1, arg2, (byte)35);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5766[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "<init>",
      descriptor = "(Loia;)V"
   )
   public class372(class207 arg0) {
      try {
         this.field5760 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5766[4] + (arg0 != null ? field5766[2] : field5766[0]) + ')');
      }
   }

   static {
      for(int var0 = 0; ~field5761.length < ~var0; ++var0) {
         field5761[var0] = -1;
      }

      for(int var1 = 65; var1 <= 90; ++var1) {
         field5761[var1] = var1 - 65;
      }

      for(int var2 = 97; ~var2 >= -123; ++var2) {
         field5761[var2] = var2 + -97 - -26;
      }

      for(int var3 = 48; ~var3 >= -58; ++var3) {
         field5761[var3] = var3 - -4;
      }

      field5761[45] = field5761[47] = 63;
      field5761[42] = field5761[43] = 62;
   }

   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3039(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3040(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
