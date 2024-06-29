import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class476 extends class347 {
   @OriginalMember(
      owner = "client!la",
      name = "i",
      descriptor = "I"
   )
   public int field7076 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!la",
      name = "k",
      descriptor = "I"
   )
   public int field7079 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!la",
      name = "r",
      descriptor = "I"
   )
   public int field7077 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!la",
      name = "n",
      descriptor = "I"
   )
   public int field7082 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!la",
      name = "j",
      descriptor = "I"
   )
   public int field7080 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!la",
      name = "m",
      descriptor = "I"
   )
   public int field7083 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!la",
      name = "q",
      descriptor = "I"
   )
   public int field7081 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!la",
      name = "s",
      descriptor = "I"
   )
   public int field7075 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!la",
      name = "p",
      descriptor = "Lad;"
   )
   public class446 field7078;
   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7085 = new String[]{method3534(method3533("c)[a\u0015")), method3534(method3533("tf[\r@")), method3534(method3533("vr\u0019#")), method3534(method3533("tf[s\u0001vn\u0001q@")), method3534(method3533("tf[\u000e@"))};
   @OriginalMember(
      owner = "client!la",
      name = "l",
      descriptor = "I"
   )
   public static int field7074;
   @OriginalMember(
      owner = "client!la",
      name = "o",
      descriptor = "I"
   )
   public static int field7084;

   @OriginalMember(
      owner = "client!la",
      name = "<init>",
      descriptor = "(Lad;)V",
      line = 51
   )
   public class476(class446 arg0) {
      try {
         this.field7078 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7085[3] + (arg0 != null ? field7085[0] : field7085[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(Ljava/lang/String;ZB)V",
      line = 12
   )
   public static final void method3531(String arg0, boolean arg1, byte arg2) {
      try {
         class726.method5260(-1, (byte)15, -1, arg0, arg1);
         ++field7084;
         if (arg2 != 106) {
            method3531((String)null, true, (byte)-46);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7085[1] + (arg0 != null ? field7085[0] : field7085[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(BII)Z",
      line = 59
   )
   public final boolean method3532(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 != 38) {
            return true;
         } else {
            ++field7074;
            if (~this.field7080 >= ~arg1 && ~arg1 >= ~this.field7079 && arg2 >= this.field7076 && arg2 <= this.field7077) {
               return true;
            } else {
               return ~this.field7075 >= ~arg1 && this.field7082 >= arg1 && this.field7081 <= arg2 && this.field7083 >= arg2;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7085[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3533(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3534(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
