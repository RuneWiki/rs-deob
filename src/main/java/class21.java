import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class21 extends class404 {
   @OriginalMember(
      owner = "client!gaa",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field275 = new String[]{method156(method155("vkq$R9")), method156(method155("vkq$T9")), method156(method155("vkq$W9")), method156(method155("vkq$U9"))};
   @OriginalMember(
      owner = "client!gaa",
      name = "H",
      descriptor = "Lsn;"
   )
   public static class675 field273 = new class675();
   @OriginalMember(
      owner = "client!gaa",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field274 = new int[4];
   @OriginalMember(
      owner = "client!gaa",
      name = "F",
      descriptor = "I"
   )
   public static int field270;
   @OriginalMember(
      owner = "client!gaa",
      name = "J",
      descriptor = "I"
   )
   public static int field271;
   @OriginalMember(
      owner = "client!gaa",
      name = "I",
      descriptor = "I"
   )
   public static int field272;

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(BF)V",
      line = 3
   )
   public final void method151(byte arg0, float arg1) {
      try {
         ++field272;
         super.field6319 = arg1;
         if (arg0 != -115) {
            method154(26, 122);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field275[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(IIIZ)V",
      line = 14
   )
   public final void method152(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         super.field6314 = arg2;
         super.field6301 = arg1;
         ++field270;
         super.field6312 = arg0;
         if (arg3) {
            field273 = null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field275[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "g",
      descriptor = "(I)V",
      line = 36
   )
   public static void method153(int arg0) {
      try {
         field273 = null;
         if (arg0 <= 82) {
            field274 = null;
         }

         field274 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field275[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(II)Z",
      line = 47
   )
   public static final boolean method154(int arg0, int arg1) {
      try {
         if (arg0 != -4) {
            field273 = null;
         }

         ++field271;
         return ~arg1 == -4 || ~arg1 == -8 || arg1 == 9 || ~arg1 == -12;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field275[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "<init>",
      descriptor = "(IIIIIF)V",
      line = 58
   )
   public class21(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method155(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method156(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
