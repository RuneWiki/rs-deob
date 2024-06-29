import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class454 {
   @OriginalMember(
      owner = "client!q",
      name = "c",
      descriptor = "Z"
   )
   private boolean field6238 = false;
   @OriginalMember(
      owner = "client!q",
      name = "k",
      descriptor = "I"
   )
   public int field6239 = 43594;
   @OriginalMember(
      owner = "client!q",
      name = "d",
      descriptor = "I"
   )
   public int field6241 = 443;
   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "Z"
   )
   private boolean field6240 = true;
   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6249 = new String[]{method3353(method3352("\u001b7U\u0006")), method3353(method3352("\u0004lxB")), method3353(method3352("\u00117:\u0000.")), method3353(method3352("\u001b7P\u0006")), method3353(method3352("Jj}T6P")), method3353(method3352("\u001b7V\u0006")), method3353(method3352("\rwd\u001ds\u0007pg\u0014")), method3353(method3352("\rwd\u001as\u001fr.")), method3353(method3352("\rwd\u001fs\u001avg\u0014")), method3353(method3352("JigG)\u000f#")), method3353(method3352("\rwd\u001cs\u001avg\u0014")), method3353(method3352("\u001b7W\u0006")), method3353(method3352("\u001b7Q\u0006"))};
   @OriginalMember(
      owner = "client!q",
      name = "g",
      descriptor = "I"
   )
   public int field6242;
   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "I"
   )
   public static int field6243;
   @OriginalMember(
      owner = "client!q",
      name = "j",
      descriptor = "I"
   )
   public static int field6245;
   @OriginalMember(
      owner = "client!q",
      name = "i",
      descriptor = "I"
   )
   public static int field6246;
   @OriginalMember(
      owner = "client!q",
      name = "f",
      descriptor = "I"
   )
   public static int field6248;
   @OriginalMember(
      owner = "client!q",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field6244;
   @OriginalMember(
      owner = "client!q",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field6247;

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(ILq;)Z"
   )
   public final boolean method3347(int arg0, class454 arg1) {
      try {
         ++field6248;
         if (arg0 <= 27) {
            this.field6241 = 60;
         }

         if (arg1 == null) {
            return false;
         } else {
            return ~this.field6242 == ~arg1.field6242 && this.field6244.equals(arg1.field6244);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6249[0] + arg0 + ',' + (arg1 != null ? field6249[2] : field6249[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3348(byte arg0) {
      try {
         if (arg0 <= -93) {
            ++field6246;
            if (!this.field6240) {
               this.field6238 = true;
               this.field6240 = true;
            } else if (!this.field6238) {
               this.field6240 = false;
            } else {
               this.field6238 = false;
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6249[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3349(byte arg0) {
      try {
         int var1 = 34 % ((-8 - arg0) / 42);
         field6247 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6249[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3350(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(Lbj;I)Lvea;"
   )
   public final class289 method3351(class255 arg0, int arg1) {
      try {
         ++field6245;
         if (arg1 < 87) {
            this.field6242 = 111;
         }

         return arg0.method1944(this.field6238, 30526, this.field6244, !this.field6240 ? this.field6239 : this.field6241);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6249[11] + (arg0 != null ? field6249[2] : field6249[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3352(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3353(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
