import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class698 extends class500 {
   @OriginalMember(
      owner = "client!gba",
      name = "p",
      descriptor = "[B"
   )
   public byte[] field10184;
   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10193 = new String[]{method5077(method5076("E%_e]\n")), method5077(method5076("E%_e^\n")), method5077(method5076("L2R'")), method5077(method5076("Yi\u0010eb")), method5077(method5076("E%_e#K)W?!\n"))};
   @OriginalMember(
      owner = "client!gba",
      name = "n",
      descriptor = "J"
   )
   public static long field10183 = (long)(9.999999999E9D * Math.random());
   @OriginalMember(
      owner = "client!gba",
      name = "r",
      descriptor = "Lbga;"
   )
   public static class378 field10186 = new class378(8, 11);
   @OriginalMember(
      owner = "client!gba",
      name = "l",
      descriptor = "Lo;"
   )
   public static class31 field10187 = new class31(7, 5);
   @OriginalMember(
      owner = "client!gba",
      name = "o",
      descriptor = "I"
   )
   public static int field10190 = 765;
   @OriginalMember(
      owner = "client!gba",
      name = "j",
      descriptor = "Lbga;"
   )
   public static class378 field10189 = new class378(84, 6);
   @OriginalMember(
      owner = "client!gba",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field10192 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
   @OriginalMember(
      owner = "client!gba",
      name = "k",
      descriptor = "I"
   )
   public static int field10185;
   @OriginalMember(
      owner = "client!gba",
      name = "q",
      descriptor = "Lq;"
   )
   public static class454 field10191;
   @OriginalMember(
      owner = "client!gba",
      name = "m",
      descriptor = "Lqh;"
   )
   public static class74 field10188;

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method5074(int arg0, boolean arg1) {
      try {
         class734.method5327(arg1, class252.field3194, (byte)-108, class41.field479, class366.field5168);
         if (arg0 != 7878) {
            method5074(81, true);
         }

         ++field10185;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10193[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class698(byte[] arg0) {
      try {
         this.field10184 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10193[4] + (arg0 != null ? field10193[3] : field10193[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5075(int arg0) {
      try {
         if (arg0 > 61) {
            field10192 = null;
            field10191 = null;
            field10186 = null;
            field10189 = null;
            field10188 = null;
            field10187 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10193[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5076(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5077(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
