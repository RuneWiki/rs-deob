import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class389 {
   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5948 = new String[]{method2990(method2989("\n\u0005Y\u001c\u000b")), method2990(method2989("\n\u0005Y\u001f\u000b")), method2990(method2989("\n\u0005Y\u001d\u000b"))};
   @OriginalMember(
      owner = "client!he",
      name = "d",
      descriptor = "Loi;"
   )
   public static class79 field5946 = new class79(7, 2);
   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field5947 = new String[]{method2990(method2989("(\u0001\u0019")), method2990(method2989("$\u0005\u0015")), method2990(method2989("/\u0001\u0005")), method2990(method2989("#\u0010\u0005")), method2990(method2989("/\u0001\u000e")), method2990(method2989("(\u0015\u0019")), method2990(method2989("(\u0015\u001b")), method2990(method2989("#\u0015\u0010")), method2990(method2989("1\u0005\u0007")), method2990(method2989("-\u0003\u0003")), method2990(method2989(",\u000f\u0001")), method2990(method2989("&\u0005\u0014"))};
   @OriginalMember(
      owner = "client!he",
      name = "f",
      descriptor = "I"
   )
   public static int field5944;
   @OriginalMember(
      owner = "client!he",
      name = "c",
      descriptor = "I"
   )
   public static int field5945;
   @OriginalMember(
      owner = "client!he",
      name = "e",
      descriptor = "Lhe;"
   )
   public class389 field5942;
   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "Llu;"
   )
   public class741 field5943;

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(IB)V",
      line = 5
   )
   public static final void method2986(int arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field5945;
         if (class647.method4669(arg0, (byte)-66)) {
            class544[] var3 = class136.field1744[arg0];
            if (arg1 == 123) {
               int var4 = 0;
               if (var2 != 0 || ~var4 > ~var3.length) {
                  do {
                     class544 var5 = var3[var4];
                     if (var5 != null) {
                        var5.field7936 = 0;
                        var5.field7972 = 1;
                        var5.field7989 = 0;
                     }

                     ++var4;
                  } while(~var4 > ~var3.length);

               }
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5948[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "(I)V",
      line = 40
   )
   public final void method2987(int arg0) {
      try {
         ++field5944;
         if (class302.field4314 < 500) {
            this.field5942 = class426.field6514;
            this.field5943 = null;
            class426.field6514 = this;
            if (arg0 != 1) {
               this.field5943 = null;
            }

            ++class302.field4314;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5948[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(I)V",
      line = 61
   )
   public static void method2988(int arg0) {
      try {
         field5947 = null;
         if (arg0 == 7729) {
            field5946 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5948[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2989(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2990(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
