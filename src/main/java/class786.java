import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class786 extends class622 {
   @OriginalMember(
      owner = "client!sw",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11514 = new String[]{method5668(method5667("\u000bc7O*")), method5668(method5667("\u0016au`")), method5668(method5667("\u000bc7M*")), method5668(method5667("\u0003:7\"\u007f")), method5668(method5667("\u000bc7N*")), method5668(method5667("\u000bc7I*")), method5668(method5667("\u000bc7H*"))};
   @OriginalMember(
      owner = "client!sw",
      name = "F",
      descriptor = "I"
   )
   public static int field11509;
   @OriginalMember(
      owner = "client!sw",
      name = "C",
      descriptor = "I"
   )
   public static int field11510;
   @OriginalMember(
      owner = "client!sw",
      name = "H",
      descriptor = "I"
   )
   public static int field11511;
   @OriginalMember(
      owner = "client!sw",
      name = "G",
      descriptor = "I"
   )
   public static int field11512;
   @OriginalMember(
      owner = "client!sw",
      name = "E",
      descriptor = "[Luk;"
   )
   public static class271[] field11513;

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public final void method1814(int arg0, int arg1, byte arg2, int arg3) {
      try {
         super.field9066 = arg3;
         ++field11512;
         int var5 = 25 / ((arg2 - -62) / 32);
         super.field9064 = arg0;
         super.field9072 = arg1;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field11514[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method5664(byte arg0, int arg1, int arg2) {
      try {
         ++field11510;
         if (arg0 > -6) {
            return false;
         } else {
            return class250.method2026((byte)91, arg1, arg2) | ~(393216 & arg2) != -1 || class455.method3422(93, arg2, arg1) || class292.method2274((byte)102, arg1, arg2);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11514[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class786(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!sw",
      name = "g",
      descriptor = "(B)V"
   )
   public static void method5665(byte arg0) {
      try {
         field11513 = null;
         if (arg0 != -93) {
            method5665((byte)-12);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11514[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(I[[I)V"
   )
   public static final void method5666(int arg0, int[][] arg1) {
      try {
         if (arg0 <= 42) {
            method5664((byte)122, -117, 99);
         }

         ++field11511;
         class448.field6542 = arg1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11514[2] + arg0 + ',' + (arg1 != null ? field11514[3] : field11514[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(FZ)V"
   )
   public final void method1812(float arg0, boolean arg1) {
      try {
         if (arg1) {
            method5665((byte)-1);
         }

         ++field11509;
         super.field9076 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11514[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5667(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5668(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
