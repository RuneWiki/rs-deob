import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class387 {
   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5651 = new String[]{method3022(method3021("maz*\u0014")), method3022(method3021("x:8h")), method3022(method3021("x%5*+>")), method3022(method3021("x%5*(>"))};
   @OriginalMember(
      owner = "client!nja",
      name = "h",
      descriptor = "B"
   )
   public byte field5643;
   @OriginalMember(
      owner = "client!nja",
      name = "m",
      descriptor = "I"
   )
   public static int field5639;
   @OriginalMember(
      owner = "client!nja",
      name = "c",
      descriptor = "I"
   )
   public int field5641;
   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "I"
   )
   public static int field5646;
   @OriginalMember(
      owner = "client!nja",
      name = "l",
      descriptor = "Ltea;"
   )
   public static class272 field5642;
   @OriginalMember(
      owner = "client!nja",
      name = "g",
      descriptor = "Lsa;"
   )
   public static class39 field5644;
   @OriginalMember(
      owner = "client!nja",
      name = "f",
      descriptor = "Les;"
   )
   public static class592 field5645;
   @OriginalMember(
      owner = "client!nja",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field5638;
   @OriginalMember(
      owner = "client!nja",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field5640;
   @OriginalMember(
      owner = "client!nja",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public String field5647;
   @OriginalMember(
      owner = "client!nja",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field5649;
   @OriginalMember(
      owner = "client!nja",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field5648;
   @OriginalMember(
      owner = "client!nja",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field5650;

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(IIIIIBIILbc;III)Z"
   )
   public static final boolean method3019(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, class663 param8, int param9, int param10, int param11) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3020(byte arg0) {
      try {
         field5644 = null;
         field5645 = null;
         int var1 = -45 % ((arg0 - -40) / 47);
         field5650 = null;
         field5648 = null;
         field5642 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5651[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3021(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3022(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
