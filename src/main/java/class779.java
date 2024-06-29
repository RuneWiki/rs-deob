import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class779 extends class673 {
   @OriginalMember(
      owner = "client!ej",
      name = "l",
      descriptor = "J"
   )
   public long field11356;
   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11365 = new String[]{method5629(method5628("^\r\u0012#%")), method5629(method5628("^\r\u0012^dU\u000eH\\%")), method5629(method5628("U\u0012P\u000e")), method5629(method5628("@I\u0012Lp")), method5629(method5628("^\r\u0012!%")), method5629(method5628("^\r\u0012 %"))};
   @OriginalMember(
      owner = "client!ej",
      name = "q",
      descriptor = "I"
   )
   public static int field11361 = 0;
   @OriginalMember(
      owner = "client!ej",
      name = "t",
      descriptor = "Lse;"
   )
   public static class6 field11358 = new class6(73, 0);
   @OriginalMember(
      owner = "client!ej",
      name = "s",
      descriptor = "[[Z"
   )
   public static boolean[][] field11363 = new boolean[][]{new boolean[4], {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, new boolean[4], {false, true, false, true}, new boolean[4]};
   @OriginalMember(
      owner = "client!ej",
      name = "p",
      descriptor = "I"
   )
   public static int field11364 = 0;
   @OriginalMember(
      owner = "client!ej",
      name = "r",
      descriptor = "I"
   )
   public static int field11357;
   @OriginalMember(
      owner = "client!ej",
      name = "n",
      descriptor = "I"
   )
   public static int field11359;
   @OriginalMember(
      owner = "client!ej",
      name = "o",
      descriptor = "I"
   )
   public static int field11360;
   @OriginalMember(
      owner = "client!ej",
      name = "m",
      descriptor = "I"
   )
   public static int field11362;

   @OriginalMember(
      owner = "client!ej",
      name = "<init>",
      descriptor = "()V"
   )
   public class779() {
   }

   @OriginalMember(
      owner = "client!ej",
      name = "<init>",
      descriptor = "(J)V"
   )
   public class779(long arg0) {
      try {
         this.field11356 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11365[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(BLgea;)Lsja;"
   )
   public static final class70 method5625(byte arg0, class66 arg1) {
      boolean var2 = client.field1481;

      try {
         ++field11359;
         if (arg0 != 51) {
            return null;
         } else {
            arg1.method640(255);
            int var3 = arg1.method640(arg0 + 204);
            class70 var4 = class285.method2320(var3, 27);
            var4.field938 = arg1.method640(arg0 ^ 204);
            int var5 = arg1.method640(arg0 + 204);
            int var6 = 0;
            int var7;
            if (var2) {
               var7 = arg1.method640(arg0 + 204);
               var4.method550(-92, arg1, var7);
               ++var6;
            }

            while(~var5 < ~var6) {
               var7 = arg1.method640(arg0 + 204);
               var4.method550(-92, arg1, var7);
               ++var6;
            }

            var4.method552(arg0 + -144);
            return var4;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field11365[4] + arg0 + ',' + (arg1 != null ? field11365[3] : field11365[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5626(byte arg0) {
      try {
         field11358 = null;
         int var1 = -108 % ((arg0 - 15) / 39);
         field11363 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11365[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method5627(int arg0, int arg1, int arg2) {
      try {
         ++field11357;
         if (arg1 >= -41) {
            method5626((byte)52);
         }

         class487 var3 = class2.method12((long)arg2, 1, (byte)43);
         var3.method3694(-21792);
         var3.field6794 = arg0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11365[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5628(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5629(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
