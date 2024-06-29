import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class796 {
   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11637 = new String[]{method5739(method5738("\u000b\u0000\u007f\u0013Q")), method5739(method5738("\u0002\u0004=<")), method5739(method5738("\u0017_\u007f~\u0004")), method5739(method5738("\u000b\u0000\u007f\u0011Q")), method5739(method5738("\u000b\u0000\u007f\u0012Q"))};
   @OriginalMember(
      owner = "client!gq",
      name = "d",
      descriptor = "I"
   )
   public static int field11630;
   @OriginalMember(
      owner = "client!gq",
      name = "f",
      descriptor = "I"
   )
   public int field11631;
   @OriginalMember(
      owner = "client!gq",
      name = "e",
      descriptor = "I"
   )
   public static int field11632;
   @OriginalMember(
      owner = "client!gq",
      name = "g",
      descriptor = "I"
   )
   public int field11633;
   @OriginalMember(
      owner = "client!gq",
      name = "c",
      descriptor = "I"
   )
   public static int field11634;
   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "I"
   )
   public int field11635;
   @OriginalMember(
      owner = "client!gq",
      name = "b",
      descriptor = "I"
   )
   public int field11636;

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5735(int arg0, byte arg1) {
      try {
         ++field11634;
         if (class631.field9307 != null) {
            if (~arg0 <= -1 && arg0 < class631.field9307.field1115) {
               if (arg1 != 111) {
                  method5736(117, (byte)-115, -112, -67);
               }

               class98 var2 = class631.field9307.field1104[arg0];
               if (var2.field1298 == -1) {
                  class594 var3 = class145.method1177((byte)-109);
                  class702 var4 = class19.method142(var3.field8765, class615.field9066, (byte)-108);
                  var4.field10264.method593(2 - -class398.method3129(12, var2.field1299), 867770704);
                  var4.field10264.method611(arg0, -1344798296);
                  var4.field10264.method595(-15010, var2.field1299);
                  var3.method4423(var4, (byte)117);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field11637[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(IBII)Z"
   )
   public static final boolean method5736(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field11632;
         class596.field8821.method872(arg3, arg2, arg0, class84.field1167);
         if (arg1 < 92) {
            return true;
         } else {
            int var4 = class84.field1167[2];
            if (~var4 > -51) {
               return false;
            } else {
               class84.field1167[0] = class84.field1167[0] * class791.field11571 / var4 + class649.field9695;
               class84.field1167[1] = class554.field8139 - -(class84.field1167[1] * class221.field2772 / var4);
               class84.field1167[2] = var4;
               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field11637[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(Lgea;B)Lgk;"
   )
   public static final class607 method5737(class66 arg0, byte arg1) {
      try {
         if (arg1 < 97) {
            return null;
         } else {
            ++field11630;
            return new class607(arg0.method652((byte)-90), arg0.method652((byte)-118), arg0.method652((byte)-108), arg0.method652((byte)-90), arg0.method652((byte)80), arg0.method652((byte)19), arg0.method652((byte)57), arg0.method652((byte)-98), arg0.method645((byte)-26), arg0.method640(255));
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11637[3] + (arg0 != null ? field11637[2] : field11637[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5738(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5739(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
