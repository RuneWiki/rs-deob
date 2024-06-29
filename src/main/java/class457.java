import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class457 {
   @OriginalMember(
      owner = "client!uba",
      name = "k",
      descriptor = "B"
   )
   private byte field6258;
   @OriginalMember(
      owner = "client!uba",
      name = "d",
      descriptor = "I"
   )
   public int field6265;
   @OriginalMember(
      owner = "client!uba",
      name = "e",
      descriptor = "I"
   )
   public int field6259;
   @OriginalMember(
      owner = "client!uba",
      name = "g",
      descriptor = "I"
   )
   public int field6257;
   @OriginalMember(
      owner = "client!uba",
      name = "c",
      descriptor = "I"
   )
   public int field6264;
   @OriginalMember(
      owner = "client!uba",
      name = "j",
      descriptor = "I"
   )
   public int field6262;
   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6268 = new String[]{method3363(method3362("F\u0001P\t")), method3363(method3362("]\u0016]K\nA\u001aU\u0011\b\u0000")), method3363(method3362("SZ\u0012KK")), method3363(method3362("]\u0016]Kw\u0000")), method3363(method3362("]\u0016]Kr\u0000")), method3363(method3362("]\u0016]Ku\u0000")), method3363(method3362("]\u0016]Kt\u0000"))};
   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "I"
   )
   public static int field6260;
   @OriginalMember(
      owner = "client!uba",
      name = "b",
      descriptor = "I"
   )
   public static int field6263;
   @OriginalMember(
      owner = "client!uba",
      name = "i",
      descriptor = "I"
   )
   public static int field6266;
   @OriginalMember(
      owner = "client!uba",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field6267;
   @OriginalMember(
      owner = "client!uba",
      name = "f",
      descriptor = "[Lok;"
   )
   public static class267[] field6261;

   @OriginalMember(
      owner = "client!uba",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3358(int arg0) {
      try {
         if (arg0 != 0) {
            method3358(111);
         }

         field6261 = null;
         field6267 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6268[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3359(int arg0) {
      try {
         if (arg0 != 0) {
            this.field6265 = 103;
         }

         ++field6260;
         return (8 & this.field6258) != 8 ? 0 : 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6268[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3360(int arg0) {
      try {
         ++field6266;
         if (arg0 > -37) {
            this.field6259 = -59;
         }

         return 7 & this.field6258;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6268[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3361(int arg0, int arg1, int arg2) {
      try {
         ++field6263;
         if (arg2 != 5722) {
            method3361(102, 120, -66);
         }

         return (1024 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6268[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "<init>",
      descriptor = "()V"
   )
   public class457() {
   }

   @OriginalMember(
      owner = "client!uba",
      name = "<init>",
      descriptor = "(Lwm;)V"
   )
   public class457(class594 arg0) {
      try {
         this.field6258 = arg0.method4340(409855200);
         this.field6265 = arg0.method4280(-19104);
         this.field6259 = arg0.method4302(true);
         this.field6257 = arg0.method4302(true);
         this.field6264 = arg0.method4302(true);
         this.field6262 = arg0.method4302(true);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6268[1] + (arg0 != null ? field6268[2] : field6268[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3362(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3363(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
