import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class21 {
   @OriginalMember(
      owner = "client!bu",
      name = "e",
      descriptor = "Lkf;"
   )
   private class266 field241;
   @OriginalMember(
      owner = "client!bu",
      name = "j",
      descriptor = "[Z"
   )
   private boolean[] field247;
   @OriginalMember(
      owner = "client!bu",
      name = "k",
      descriptor = "I"
   )
   private int field243;
   @OriginalMember(
      owner = "client!bu",
      name = "f",
      descriptor = "[[I"
   )
   private int[][] field240;
   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field250 = new String[]{method132(method131("L)\u000f\u001ao")), method132(method131("L)\u000f\u001co")), method132(method131("@)M4")), method132(method131("L)\u000fd.@5Ufo")), method132(method131("Ur\u000fv:")), method132(method131("L)\u000f\u0019o")), method132(method131("L)\u000f\u001bo"))};
   @OriginalMember(
      owner = "client!bu",
      name = "d",
      descriptor = "Lek;"
   )
   public static class536 field239 = new class536(2, 6);
   @OriginalMember(
      owner = "client!bu",
      name = "h",
      descriptor = "Leg;"
   )
   public static class118 field245 = new class118(39, -2);
   @OriginalMember(
      owner = "client!bu",
      name = "i",
      descriptor = "I"
   )
   public static int field242;
   @OriginalMember(
      owner = "client!bu",
      name = "b",
      descriptor = "I"
   )
   public static int field244;
   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "I"
   )
   public static int field246;
   @OriginalMember(
      owner = "client!bu",
      name = "c",
      descriptor = "I"
   )
   public static int field249;
   @OriginalMember(
      owner = "client!bu",
      name = "g",
      descriptor = "Lhka;"
   )
   public static class57 field248;

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method127(byte arg0) {
      try {
         field248 = null;
         field245 = null;
         field239 = null;
         if (arg0 < 114) {
            field239 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field250[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(II)[I",
      line = 17
   )
   public final int[] method128(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field249;
         if (arg0 >= 0 && arg0 < this.field240.length) {
            if (this.field247[arg0] && ~this.field240[arg0].length < -2) {
               int var4 = this.field243 == -1 ? 0 : 1;
               Random var5 = new Random();
               int[] var6 = new int[this.field240[arg0].length];
               class242.method1853(this.field240[arg0], 0, var6, 0, var6.length);
               int var7 = var4;
               int var8;
               int var9;
               if (var3) {
                  var8 = class258.method1968((byte)-70, var5, var6.length + -var4) - -var4;
                  var9 = var6[var4];
                  var6[var4] = var6[var8];
                  var6[var8] = var9;
                  var7 = var4 + 1;
               }

               while(true) {
                  int[] var10000;
                  if (var7 >= var6.length) {
                     var8 = 28 / ((-40 - arg1) / 42);
                     var10000 = var6;
                     if (!var3) {
                        return var6;
                     }
                  } else {
                     var8 = class258.method1968((byte)-70, var5, var6.length + -var4) - -var4;
                     var10000 = var6;
                  }

                  var9 = var10000[var7];
                  var6[var7] = var6[var8];
                  var6[var8] = var9;
                  ++var7;
               }
            } else {
               return this.field240[arg0];
            }
         } else {
            return ~this.field243 != 0 ? new int[]{this.field243} : new int[0];
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field250[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(I)Z",
      line = 75
   )
   public final boolean method129(int arg0) {
      try {
         ++field246;
         int var2 = -86 % ((arg0 - 16) / 55);
         return ~this.field243 != 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field250[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V",
      line = 86
   )
   public class21(class732 param1, int param2, class266 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(IB)Lmu;",
      line = 229
   )
   public final class318 method130(int arg0, byte arg1) {
      try {
         if (arg1 > -82) {
            this.field247 = null;
         }

         ++field242;
         byte[] var3 = this.field241.method2037(false, arg0, 1);
         class318 var4 = new class318();
         var4.method2328((byte)-126, new class147(var3));
         return var4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field250[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method131(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method132(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
