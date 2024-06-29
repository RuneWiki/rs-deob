import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class735 extends class238 {
   @OriginalMember(
      owner = "client!ki",
      name = "X",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10582 = new String[]{method5299(method5298("\u0000\u000e>-K")), method5299(method5298("\u0000\u000e>.K")), method5299(method5298("\u0005\u0012|\r")), method5299(method5298("\u0000\u000e>,K")), method5299(method5298("\u0010I>O\u001e")), method5299(method5298("\u0000\u000e>1K")), method5299(method5298("\u0000\u000e>/K"))};
   @OriginalMember(
      owner = "client!ki",
      name = "W",
      descriptor = "I"
   )
   public static int field10577;
   @OriginalMember(
      owner = "client!ki",
      name = "T",
      descriptor = "I"
   )
   public static int field10578;
   @OriginalMember(
      owner = "client!ki",
      name = "U",
      descriptor = "I"
   )
   public static int field10580;
   @OriginalMember(
      owner = "client!ki",
      name = "S",
      descriptor = "I"
   )
   public static int field10581;
   @OriginalMember(
      owner = "client!ki",
      name = "V",
      descriptor = "Lpi;"
   )
   public static class521 field10579;

   @OriginalMember(
      owner = "client!ki",
      name = "i",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method5294(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(ILeba;Lha;)I",
      line = 47
   )
   public static final int method5295(int arg0, class612 arg1, class65 arg2) {
      try {
         int var3 = -111 % ((arg0 - 79) / 46);
         ++field10581;
         if (~arg1.field8878 != 0) {
            return arg1.field8878;
         } else {
            if (arg1.field8877 != -1) {
               class693 var4 = arg2.field1192.method1456(-8988, arg1.field8877);
               if (!var4.field10175) {
                  return var4.field10162;
               }
            }

            return arg1.field8884;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10582[6] + arg0 + ',' + (arg1 != null ? field10582[4] : field10582[2]) + ',' + (arg2 != null ? field10582[4] : field10582[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(JLhw;IIIZI)V",
      line = 71
   )
   public static final void method5296(long arg0, class141 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
      try {
         ++field10580;
         class682.method4978(arg3, arg1, arg2, arg5, arg6, arg0, (byte)0, arg4);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10582[3] + arg0 + ',' + (arg1 != null ? field10582[4] : field10582[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "h",
      descriptor = "(I)V",
      line = 81
   )
   public static void method5297(int arg0) {
      try {
         if (arg0 == -1) {
            field10579 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10582[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(II)[[I",
      line = 93
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field10577;
         int[][] var4 = super.field9169.method785((byte)39, arg0);
         if (arg1 != 0) {
            method5297(-65);
         }

         if (super.field9169.field1332 && this.method1952((byte)-85)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg0 % super.field3459 * super.field3459;
            int var9 = 0;
            if (var3 || class66.field1214 > var9) {
               do {
                  int var10 = super.field3456[var9 % super.field3457 + var8];
                  var7[var9] = class66.method706(var10 << 4, 4080);
                  var6[var9] = class66.method706(var10, 65280) >> 4;
                  var5[var9] = class66.method706(var10 >> 12, 4080);
                  ++var9;
               } while(class66.field1214 > var9);
            }
         }

         return var4;
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field10582[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5298(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5299(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
