import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class266 extends class22 {
   @OriginalMember(
      owner = "client!fga",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field3782;
   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3784 = new String[]{method2123(method2122("Eg4yP")), method2123(method2122("X.{y\u0011W's#\u0013\u0016")), method2123(method2122("P<v;")), method2123(method2122("X.{yl\u0016")), method2123(method2122("\u001e\u001a w")), method2123(method2122("X.{yo\u0016"))};
   @OriginalMember(
      owner = "client!fga",
      name = "m",
      descriptor = "J"
   )
   public static long field3780 = 0L;
   @OriginalMember(
      owner = "client!fga",
      name = "l",
      descriptor = "I"
   )
   public static int field3781;
   @OriginalMember(
      owner = "client!fga",
      name = "k",
      descriptor = "I"
   )
   public static int field3783;

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(II)Ldja;",
      line = 7
   )
   public static final class323 method2120(int arg0, int arg1) {
      try {
         ++field3783;
         class323 var2 = (class323)class201.field3007.method162((long)arg0, 116);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class647.field9406.method1347((byte)123, arg0, 0);
            if (arg1 >= -62) {
               field3780 = -12L;
            }

            if (var3 != null && var3.length > 1) {
               class323 var4;
               try {
                  var4 = class729.method5264(-17, var3);
               } catch (Exception var7) {
                  throw new RuntimeException(var7.getMessage() + field3784[4] + arg0);
               }

               class201.field3007.method164((long)arg0, var4, (byte)40);
               return var4;
            } else {
               return null;
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3784[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "<init>",
      descriptor = "()V",
      line = 46
   )
   public class266() {
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(B)V",
      line = 49
   )
   public static final void method2121(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fga",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 73
   )
   public class266(String arg0) {
      try {
         this.field3782 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3784[1] + (arg0 != null ? field3784[0] : field3784[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2122(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2123(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
