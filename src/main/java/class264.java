import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class264 implements class644 {
   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "I"
   )
   public int field3750;
   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3752 = new String[]{method2113(method2112("\u0018\\nZb")), method2113(method2112("\u0018\\n'#\u001dS4%b")), method2113(method2112("\b\u0014n57")), method2113(method2112("\u001dO,w")), method2113(method2112("\u0018\\nYb"))};
   @OriginalMember(
      owner = "client!kf",
      name = "c",
      descriptor = "I"
   )
   public static int field3749;
   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "I"
   )
   public static int field3751;

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(ILes;)V"
   )
   public static final void method2111(int arg0, class400 arg1) {
      try {
         ++field3749;
         if (arg0 == -25109) {
            class206.field3081 = arg1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3752[4] + arg0 + ',' + (arg1 != null ? field3752[2] : field3752[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(B)Lqg;"
   )
   public final class485 method672(byte arg0) {
      try {
         ++field3751;
         return arg0 != 83 ? null : class443.field6458;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3752[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class264(int arg0) {
      try {
         this.field3750 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3752[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2112(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2113(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
