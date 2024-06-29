import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class738 extends class347 {
   @OriginalMember(
      owner = "client!mga",
      name = "k",
      descriptor = "I"
   )
   public int field10954;
   @OriginalMember(
      owner = "client!mga",
      name = "j",
      descriptor = "I"
   )
   public int field10955;
   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10958 = new String[]{method5377(method5376("w,ex$2")), method5377(method5376("ae*x\u0018")), method5377(method5376("t>h:")), method5377(method5376("w,ex'2")), method5377(method5376("w,exYs%m\"[2"))};
   @OriginalMember(
      owner = "client!mga",
      name = "l",
      descriptor = "I"
   )
   public static int field10957 = 1400;
   @OriginalMember(
      owner = "client!mga",
      name = "m",
      descriptor = "I"
   )
   public static int field10953;
   @OriginalMember(
      owner = "client!mga",
      name = "i",
      descriptor = "I"
   )
   public static int field10956;

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5374(byte arg0) {
      try {
         ++field10956;
         if (~class261.field3566.field9428.method2175(125) == -1 && ~class551.field8158 != ~class255.field3404) {
            class153.method1263(false, class465.field6983, -1, class688.field10364, 11);
         } else {
            class410.method3131(class786.field11439, false);
            if (arg0 != -31) {
               field10957 = -98;
            }

            if (class660.field9560 != class551.field8158) {
               class571.method4231(arg0 ^ -29);
            }
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10958[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Ljava/lang/String;B)J"
   )
   public static final long method5375(String arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field10953;
         int var3 = arg0.length();
         long var4 = 0L;
         if (arg1 >= -91) {
            return 67L;
         } else {
            int var6 = 0;
            if (var2 != 0) {
               var4 = (long)arg0.charAt(var6) + (var4 << 5) + -var4;
               ++var6;
            }

            while(true) {
               while(var3 > var6) {
                  var4 = (long)arg0.charAt(var6) + (var4 << 5) + -var4;
                  ++var6;
               }

               if (var2 == 0) {
                  return var4;
               }

               var4 = var4;
               ++var6;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10958[3] + (arg0 != null ? field10958[1] : field10958[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class738(int arg0, int arg1) {
      try {
         this.field10954 = arg1;
         this.field10955 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10958[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5376(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5377(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
