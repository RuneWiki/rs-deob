import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class250 extends class297 {
   @OriginalMember(
      owner = "client!dea",
      name = "v",
      descriptor = "I"
   )
   public int field3798 = 0;
   @OriginalMember(
      owner = "client!dea",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3802 = new String[]{method2125(method2124("W+m\u001d")), method2125(method2124("Bp/_K")), method2125(method2124("];`_w\u0011")), method2125(method2124("];`_t\u0011")), method2125(method2124("];`_u\u0011"))};
   @OriginalMember(
      owner = "client!dea",
      name = "y",
      descriptor = "I"
   )
   public static int field3801 = 0;
   @OriginalMember(
      owner = "client!dea",
      name = "A",
      descriptor = "Z"
   )
   public static boolean field3796 = false;
   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "F"
   )
   public static float field3799;
   @OriginalMember(
      owner = "client!dea",
      name = "w",
      descriptor = "I"
   )
   public static int field3795;
   @OriginalMember(
      owner = "client!dea",
      name = "x",
      descriptor = "I"
   )
   public static int field3797;
   @OriginalMember(
      owner = "client!dea",
      name = "u",
      descriptor = "I"
   )
   public static int field3800;

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(ILica;I)V"
   )
   private final void method2121(int arg0, class354 arg1, int arg2) {
      try {
         if (arg2 == 2) {
            this.field3798 = arg1.method2848(-116);
         }

         ++field3797;
         if (arg0 < 106) {
            this.field3798 = 116;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3802[4] + arg0 + ',' + (arg1 != null ? field3802[1] : field3802[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(BLica;)V"
   )
   public final void method2122(byte arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         while(true) {
            int var4 = arg1.method2855(-31007);
            if (~var4 != -1) {
               this.method2121(109, arg1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            int var5 = 48 / ((arg0 - -16) / 63);
            ++field3800;
            break;
         }

      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field3802[2] + arg0 + ',' + (arg1 != null ? field3802[1] : field3802[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method2123(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2124(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2125(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
