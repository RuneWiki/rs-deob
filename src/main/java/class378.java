import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class378 {
   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5719 = new String[]{method2925(method2924("#%I\u0014*")), method2925(method2924("#%I\u0017*")), method2925(method2924("#%I!m\u00069\u0015<l2e"))};
   @OriginalMember(
      owner = "client!vh",
      name = "b",
      descriptor = "I"
   )
   public static int field5715;
   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "I"
   )
   public static int field5716;
   @OriginalMember(
      owner = "client!vh",
      name = "d",
      descriptor = "I"
   )
   public static int field5717;
   @OriginalMember(
      owner = "client!vh",
      name = "c",
      descriptor = "I"
   )
   public static int field5718;

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(III)I",
      line = 9
   )
   public final int method2922(int arg0, int arg1, int arg2) {
      try {
         ++field5717;
         int var4 = ~class411.field6305 < ~arg0 ? class411.field6305 : arg0;
         if (arg1 <= 105) {
            this.toString();
         }

         if (class436.field6657 == this) {
            return 0;
         } else if (class536.field7815 == this) {
            return -arg2 + var4;
         } else {
            return class397.field6094 == this ? (-arg2 + var4) / 2 : 0;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5719[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 31
   )
   public final String toString() {
      try {
         ++field5715;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5719[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(I)V",
      line = 41
   )
   public static final void method2923(int arg0) {
      int var1 = client.field4530;

      try {
         ++field5718;
         if (class731.field10851 == null || class724.field10777 == null) {
            class724.field10777 = new int[256];
            class731.field10851 = new int[256];
            int var2 = 0;
            if (var1 != 0 || var2 < 256) {
               do {
                  double var3 = (double)var2 / 255.0D * 6.283185307179586D;
                  class731.field10851[var2] = (int)(Math.sin(var3) * 4096.0D);
                  class724.field10777[var2] = (int)(Math.cos(var3) * 4096.0D);
                  ++var2;
               } while(var2 < 256);
            }
         }

         int var5 = 95 / ((arg0 - -52) / 59);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5719[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2924(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2925(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
