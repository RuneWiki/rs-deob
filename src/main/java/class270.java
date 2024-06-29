import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class270 extends class247 {
   @OriginalMember(
      owner = "client!ju",
      name = "n",
      descriptor = "I"
   )
   public int field4134 = -1;
   @OriginalMember(
      owner = "client!ju",
      name = "j",
      descriptor = "Z"
   )
   public boolean field4137 = false;
   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4138 = new String[]{method2302(method2301("PeSzj")), method2302(method2301("PeSyj")), method2302(method2301("PeS\u0004+Ty\t\u0006j"))};
   @OriginalMember(
      owner = "client!ju",
      name = "r",
      descriptor = "[Lug;"
   )
   public static class432[] field4135 = new class432[1024];
   @OriginalMember(
      owner = "client!ju",
      name = "o",
      descriptor = "I"
   )
   public int field4129;
   @OriginalMember(
      owner = "client!ju",
      name = "k",
      descriptor = "I"
   )
   public int field4130;
   @OriginalMember(
      owner = "client!ju",
      name = "q",
      descriptor = "I"
   )
   public int field4131;
   @OriginalMember(
      owner = "client!ju",
      name = "l",
      descriptor = "I"
   )
   public int field4132;
   @OriginalMember(
      owner = "client!ju",
      name = "p",
      descriptor = "I"
   )
   public int field4133;
   @OriginalMember(
      owner = "client!ju",
      name = "m",
      descriptor = "I"
   )
   public static int field4136;

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(IZ)S"
   )
   public static final short method2299(int arg0, boolean arg1) {
      try {
         ++field4136;
         int var2 = 63 & arg0 >> 10;
         int var3 = 112 & arg0 >> 3;
         int var4 = 127 & arg0;
         if (arg1) {
            return -62;
         } else {
            int var5 = var4 <= 64 ? var3 * var4 >> 7 : (-var4 + 127) * var3 >> 7;
            int var6 = var4 + var5;
            int var7;
            if (var6 != 0) {
               var7 = (var5 << 8) / var6;
               if (!client.field10022) {
                  return (short)(var2 << 10 | var7 >> 4 << 7 | var6);
               }
            }

            var7 = var5 << 1;
            return (short)(var2 << 10 | var7 >> 4 << 7 | var6);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field4138[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2300(int arg0) {
      try {
         field4135 = null;
         if (arg0 != -637050009) {
            field4135 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4138[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class270(int arg0) {
      try {
         this.field4134 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4138[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2301(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2302(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
