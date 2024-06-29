import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class37 extends class143 {
   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field904 = new String[]{method459(method458("cJ\u0017\u0001")), method459(method458("v\u0011UC\r")), method459(method458("zIU,X")), method459(method458("zIU)X")), method459(method458("zIU.X")), method459(method458("zIU/X"))};
   @OriginalMember(
      owner = "client!wv",
      name = "l",
      descriptor = "I"
   )
   public static int field894 = 0;
   @OriginalMember(
      owner = "client!wv",
      name = "m",
      descriptor = "B"
   )
   private byte field896;
   @OriginalMember(
      owner = "client!wv",
      name = "s",
      descriptor = "B"
   )
   private byte field897;
   @OriginalMember(
      owner = "client!wv",
      name = "p",
      descriptor = "I"
   )
   public static int field898;
   @OriginalMember(
      owner = "client!wv",
      name = "u",
      descriptor = "I"
   )
   public static int field899;
   @OriginalMember(
      owner = "client!wv",
      name = "t",
      descriptor = "I"
   )
   public static int field900;
   @OriginalMember(
      owner = "client!wv",
      name = "r",
      descriptor = "I"
   )
   public static int field901;
   @OriginalMember(
      owner = "client!wv",
      name = "o",
      descriptor = "I"
   )
   public static int field902;
   @OriginalMember(
      owner = "client!wv",
      name = "q",
      descriptor = "Lmh;"
   )
   public static class656 field903;
   @OriginalMember(
      owner = "client!wv",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   private String field895;

   @OriginalMember(
      owner = "client!wv",
      name = "b",
      descriptor = "(Z)V",
      line = 11
   )
   public static void method454(boolean arg0) {
      try {
         field903 = null;
         if (!arg0) {
            field894 = 116;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field904[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(Ljfa;II)I",
      line = 21
   )
   public static final int method455(class303 arg0, int arg1, int arg2) {
      try {
         if (arg1 != -1) {
            return 50;
         } else {
            ++field898;
            if (!client.method2454(arg0).method5165(arg1 + 2, arg2) && arg0.field4335 == null) {
               return -1;
            } else {
               return arg0.field4223 != null && arg0.field4223.length > arg2 ? arg0.field4223[arg2] : -1;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field904[2] + (arg0 != null ? field904[1] : field904[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(Lan;I)V",
      line = 36
   )
   public final void method456(class25 arg0, int arg1) {
      try {
         ++field901;
         arg0.field384 = this.field895;
         if (this.field895 != null) {
            arg0.field371 = this.field897;
            arg0.field379 = this.field896;
         }

         if (arg1 != 117) {
            method455((class303)null, 109, -26);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field904[5] + (arg0 != null ? field904[1] : field904[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(Luda;B)V",
      line = 64
   )
   public final void method457(class473 arg0, byte arg1) {
      try {
         this.field895 = arg0.method3529(false);
         ++field899;
         if (arg1 > -81) {
            field903 = null;
         }

         if (this.field895 != null) {
            arg0.method3564((byte)-96);
            this.field897 = arg0.method3543(-1132613840);
            this.field896 = arg0.method3543(-1132613840);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field904[3] + (arg0 != null ? field904[1] : field904[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method458(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method459(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
