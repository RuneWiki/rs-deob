import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public abstract class class781 {
   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11457 = new String[]{method5634(method5633("\fn\t+1S")), method5634(method5633("\u0000'F+\u000f")), method5634(method5633("\u0015|\u0004i")), method5634(method5633("\fn\t+7S")), method5634(method5633("\fn\t+6S")), method5634(method5633("\fn\t+0S"))};
   @OriginalMember(
      owner = "client!wga",
      name = "d",
      descriptor = "Leg;"
   )
   public static class118 field11456 = new class118(56, 10);
   @OriginalMember(
      owner = "client!wga",
      name = "c",
      descriptor = "I"
   )
   public static int field11453;
   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "I"
   )
   public static int field11454;
   @OriginalMember(
      owner = "client!wga",
      name = "b",
      descriptor = "I"
   )
   public static int field11455;

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method5629(byte arg0) {
      try {
         if (arg0 != 106) {
            return false;
         } else {
            ++class370.field5384;
            ++field11453;
            class639.field9336 = true;
            return true;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11457[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5630(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field11454;
         if (arg3 < 109) {
            field11456 = null;
         }

         class755 var5 = class317.method2325((long)arg0, 108, 8);
         var5.method5479(1288);
         var5.field11184 = arg4;
         var5.field11181 = arg1;
         var5.field11187 = arg2;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11457[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(IZILgk;ZILgk;)I"
   )
   public static final int method5631(int arg0, boolean arg1, int arg2, class503 arg3, boolean arg4, int arg5, class503 arg6) {
      try {
         if (arg5 != 10) {
            return -96;
         } else {
            ++field11455;
            int var7 = class206.method1631(arg3, arg5 ^ 110, arg1, arg2, arg6);
            if (~var7 != -1) {
               return !arg1 ? var7 : -var7;
            } else if (arg0 == -1) {
               return 0;
            } else {
               int var8 = class206.method1631(arg3, arg5 ^ -82, arg4, arg0, arg6);
               return !arg4 ? var8 : -var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field11457[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11457[1] : field11457[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field11457[1] : field11457[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(BLsm;)Lsm;"
   )
   public abstract class299 method3123(byte arg0, class299 arg1);

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5632(int arg0) {
      try {
         field11456 = null;
         if (arg0 <= 45) {
            method5630(104, 78, -99, -70, -79);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11457[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5633(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5634(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
