import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class173 {
   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2401 = new String[]{method1406(method1405("\u0010,_#+")), method1406(method1405("\u000b(\u001d\u000e")), method1406(method1405("\u001es_L~"))};
   @OriginalMember(
      owner = "client!uq",
      name = "b",
      descriptor = "I"
   )
   public static int field2400 = -1;
   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "I"
   )
   public static int field2399;

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(Lrga;I[[B)V",
      line = 5
   )
   public static final void method1404(class253 arg0, int arg1, byte[][] arg2) {
      boolean var3 = client.field4360;

      try {
         ++field2399;
         int var4 = class371.field5388.length;
         if (arg1 > 124) {
            int var5 = 0;
            if (var3 || ~var5 > ~var4) {
               do {
                  byte[] var6 = arg2[var5];
                  if (var6 != null) {
                     int var7 = (class436.field6245[var5] >> 8) * 64 + -class672.field9740;
                     int var8 = (class436.field6245[var5] & 255) * 64 + -class533.field7595;
                     class581.method4207(50);
                     arg0.method1930(var6, class383.field5543, var7, class767.field11309, 0, var8);
                  }

                  ++var5;
               } while(~var5 > ~var4);

            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field2401[0] + (arg0 != null ? field2401[2] : field2401[1]) + ',' + arg1 + ',' + (arg2 != null ? field2401[2] : field2401[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1405(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1406(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
