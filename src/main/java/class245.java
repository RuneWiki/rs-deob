import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class245 {
   @OriginalMember(
      owner = "client!ue",
      name = "h",
      descriptor = "I"
   )
   public int field3385;
   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "I"
   )
   public int field3382;
   @OriginalMember(
      owner = "client!ue",
      name = "m",
      descriptor = "I"
   )
   public int field3387;
   @OriginalMember(
      owner = "client!ue",
      name = "e",
      descriptor = "Lgn;"
   )
   public class731 field3384;
   @OriginalMember(
      owner = "client!ue",
      name = "n",
      descriptor = "I"
   )
   public int field3379;
   @OriginalMember(
      owner = "client!ue",
      name = "d",
      descriptor = "I"
   )
   public int field3378;
   @OriginalMember(
      owner = "client!ue",
      name = "l",
      descriptor = "B"
   )
   public byte field3388;
   @OriginalMember(
      owner = "client!ue",
      name = "k",
      descriptor = "I"
   )
   public int field3380;
   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3390 = new String[]{method1868(method1867("`\u001f\u0002\u001fU")), method1868(method1867("`\u001f\u0002\u001cU")), method1868(method1867("`\u001f\u0002b\u0014{\u0013X`U")), method1868(method1867("nT\u0002p\u0000")), method1868(method1867("{\u000f@2"))};
   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "I"
   )
   public static int field3374 = 0;
   @OriginalMember(
      owner = "client!ue",
      name = "f",
      descriptor = "Lqca;"
   )
   public static class127 field3376 = new class127(4, 1);
   @OriginalMember(
      owner = "client!ue",
      name = "j",
      descriptor = "[[I"
   )
   public static int[][] field3389 = new int[][]{{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!ue",
      name = "o",
      descriptor = "F"
   )
   public static float field3372;
   @OriginalMember(
      owner = "client!ue",
      name = "p",
      descriptor = "I"
   )
   public static int field3383;
   @OriginalMember(
      owner = "client!ue",
      name = "c",
      descriptor = "I"
   )
   public static int field3386;
   @OriginalMember(
      owner = "client!ue",
      name = "g",
      descriptor = "Lec;"
   )
   public class248 field3375;
   @OriginalMember(
      owner = "client!ue",
      name = "i",
      descriptor = "Lvea;"
   )
   public class289 field3377;
   @OriginalMember(
      owner = "client!ue",
      name = "r",
      descriptor = "Lvn;"
   )
   public class332 field3381;
   @OriginalMember(
      owner = "client!ue",
      name = "q",
      descriptor = "Lfp;"
   )
   public class344 field3373;

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1865(int arg0) {
      try {
         int var2 = -63 / ((arg0 - 5) / 47);
         ++field3386;
         return ~this.field3388 == -3 || this.field3388 == 3;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3390[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1866(int arg0) {
      try {
         if (arg0 != 3887) {
            method1866(-45);
         }

         field3376 = null;
         field3389 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3390[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "<init>",
      descriptor = "(BIIIIIILgn;)V"
   )
   public class245(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class731 arg7) {
      try {
         this.field3385 = arg5;
         this.field3382 = arg3;
         this.field3387 = arg1;
         this.field3384 = arg7;
         this.field3379 = arg2;
         this.field3378 = arg4;
         this.field3388 = arg0;
         this.field3380 = arg6;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field3390[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field3390[3] : field3390[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1867(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1868(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
