import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class455 extends class294 {
   @OriginalMember(
      owner = "client!jea",
      name = "m",
      descriptor = "Z"
   )
   public boolean field6958 = true;
   @OriginalMember(
      owner = "client!jea",
      name = "u",
      descriptor = "Z"
   )
   public boolean field6968 = false;
   @OriginalMember(
      owner = "client!jea",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6971 = new String[]{method3563(method3562("?J%kM}")), method3563(method3562("?J%kL}")), method3563(method3562("?J%kN}"))};
   @OriginalMember(
      owner = "client!jea",
      name = "A",
      descriptor = "I"
   )
   public static int field6957 = 0;
   @OriginalMember(
      owner = "client!jea",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   public static String field6963 = "";
   @OriginalMember(
      owner = "client!jea",
      name = "o",
      descriptor = "Lhka;"
   )
   public static class377 field6955 = new class377(5, 8);
   @OriginalMember(
      owner = "client!jea",
      name = "B",
      descriptor = "I"
   )
   public int field6951;
   @OriginalMember(
      owner = "client!jea",
      name = "C",
      descriptor = "I"
   )
   public int field6952;
   @OriginalMember(
      owner = "client!jea",
      name = "r",
      descriptor = "I"
   )
   public int field6953;
   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "I"
   )
   public int field6956;
   @OriginalMember(
      owner = "client!jea",
      name = "D",
      descriptor = "I"
   )
   public int field6959;
   @OriginalMember(
      owner = "client!jea",
      name = "x",
      descriptor = "I"
   )
   public int field6960;
   @OriginalMember(
      owner = "client!jea",
      name = "s",
      descriptor = "I"
   )
   public static int field6961;
   @OriginalMember(
      owner = "client!jea",
      name = "w",
      descriptor = "I"
   )
   public int field6962;
   @OriginalMember(
      owner = "client!jea",
      name = "F",
      descriptor = "I"
   )
   public static int field6964;
   @OriginalMember(
      owner = "client!jea",
      name = "n",
      descriptor = "I"
   )
   public int field6965;
   @OriginalMember(
      owner = "client!jea",
      name = "q",
      descriptor = "I"
   )
   public static int field6966;
   @OriginalMember(
      owner = "client!jea",
      name = "y",
      descriptor = "I"
   )
   public int field6967;
   @OriginalMember(
      owner = "client!jea",
      name = "p",
      descriptor = "I"
   )
   public int field6970;
   @OriginalMember(
      owner = "client!jea",
      name = "E",
      descriptor = "Lrr;"
   )
   public static class678 field6954;
   @OriginalMember(
      owner = "client!jea",
      name = "t",
      descriptor = "Lff;"
   )
   public class752 field6969;

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public static final void method3559(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         int var7 = arg2 << 3;
         ++field6964;
         int var8 = arg3 << 3;
         int var6 = arg1 << 3;
         if (class648.field9340 == 2) {
            class317.field4895 = var6;
            class674.field10029 = var7;
            class703.field10589 = var8;
         }

         class417.field6456 = (float)var6;
         class357.field5520 = (float)var8;
         class109.method1042(19795);
         class479.field7286 = arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6971[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3560(byte arg0) {
      try {
         if (arg0 != 73) {
            method3559(false, 76, -19, -54);
         }

         class399.field6252 = 0;
         class53.field660 = 0;
         class14.field177 = 0;
         class787.field11538 = 0;
         ++field6966;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6971[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3561(boolean arg0) {
      try {
         field6955 = null;
         if (arg0) {
            method3561(false);
         }

         field6954 = null;
         field6963 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6971[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3562(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3563(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
