import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class21 implements Runnable {
   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "[Lil;"
   )
   public volatile class7[] field263 = new class7[2];
   @OriginalMember(
      owner = "client!bu",
      name = "f",
      descriptor = "Z"
   )
   public volatile boolean field267 = false;
   @OriginalMember(
      owner = "client!bu",
      name = "g",
      descriptor = "Z"
   )
   public volatile boolean field266 = false;
   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field269 = new String[]{method184(method183("%\t2j\u007f)T")), method184(method183("%\t2Y\"")), method184(method183("%\t2[\""))};
   @OriginalMember(
      owner = "client!bu",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field268 = false;
   @OriginalMember(
      owner = "client!bu",
      name = "c",
      descriptor = "I"
   )
   public static int field260;
   @OriginalMember(
      owner = "client!bu",
      name = "d",
      descriptor = "I"
   )
   public static int field262;
   @OriginalMember(
      owner = "client!bu",
      name = "e",
      descriptor = "I"
   )
   public static int field265;
   @OriginalMember(
      owner = "client!bu",
      name = "i",
      descriptor = "Lbj;"
   )
   public class255 field264;
   @OriginalMember(
      owner = "client!bu",
      name = "h",
      descriptor = "Lqh;"
   )
   public static class74 field261;

   @OriginalMember(
      owner = "client!bu",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4273;

      try {
         ++field262;
         this.field266 = true;

         try {
            if (var1 || !this.field267) {
               do {
                  int var2 = 0;
                  if (var1 || ~var2 > -3) {
                     do {
                        class7 var3 = this.field263[var2];
                        if (var3 != null) {
                           var3.method55(115);
                        }

                        ++var2;
                     } while(~var2 > -3);
                  }

                  class173.method1347(-128, 10L);
                  class219.method1660(-27299, this.field264, (Object)null);
               } while(!this.field267);
            }
         } catch (Exception var12) {
            class106.method940((String)null, var12, (byte)-33);
         } finally {
            Object var8 = null;
            this.field266 = false;
         }

      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field269[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method180(byte arg0) {
      try {
         field261 = null;
         if (arg0 > -103) {
            method182(-4, 115, 51);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field269[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method181(int arg0, int arg1) {
      try {
         if (arg1 != 2) {
            field265 = 62;
         }

         ++field260;
         return arg0 >>> 7;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field269[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(III)Lbs;"
   )
   public static final class718 method182(int arg0, int arg1, int arg2) {
      class225 var3 = class111.field1404[arg0][arg1][arg2];
      return var3 == null ? null : var3.field2830;
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method183(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method184(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
