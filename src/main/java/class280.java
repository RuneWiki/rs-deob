import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class280 {
   @OriginalMember(
      owner = "client!mh",
      name = "d",
      descriptor = "[I"
   )
   private int[] field4464;
   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4466 = new String[]{method2348(method2347("C\u00112\bP")), method2348(method2347("VJpJ")), method2348(method2347("UW2\u001aDVVh\u0018\u0005")), method2348(method2347("UW2e\u0005")), method2348(method2347("UW2g\u0005")), method2348(method2347("UW2d\u0005"))};
   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field4462 = new int[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};
   @OriginalMember(
      owner = "client!mh",
      name = "b",
      descriptor = "I"
   )
   public static int field4463;
   @OriginalMember(
      owner = "client!mh",
      name = "c",
      descriptor = "I"
   )
   public static int field4465;

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method2344(byte arg0) {
      try {
         field4462 = null;
         int var1 = 9 % ((31 - arg0) / 54);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4466[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "<init>",
      descriptor = "([I)V",
      line = 16
   )
   public class280(int[] arg0) {
      boolean var2 = client.field1786;
      super();

      try {
         int var3 = 1;
         if (var2) {
            var3 <<= 1;
         }

         while(true) {
            while(~var3 >= ~((arg0.length >> 1) + arg0.length)) {
               var3 <<= 1;
            }

            this.field4464 = new int[var3 - -var3];
            if (!var2) {
               int var4 = 0;
               if (var2) {
                  this.field4464[var4] = -1;
                  ++var4;
               }

               while(true) {
                  while(~var4 > ~(var3 - -var3)) {
                     this.field4464[var4] = -1;
                     ++var4;
                  }

                  int var5 = 0;
                  if (!var2) {
                     if (!var2 && arg0.length <= var5) {
                        return;
                     }

                     do {
                        int var6 = var3 + -1 & arg0[var5];
                        if (var2) {
                           var6 = var6 + 1 & var3 + -1;
                        }

                        while(this.field4464[var6 + var6 - -1] != -1) {
                           var6 = var6 + 1 & var3 + -1;
                        }

                        this.field4464[var6 + var6] = arg0[var5];
                        this.field4464[var6 - -var6 + 1] = var5++;
                     } while(arg0.length > var5);

                     return;
                  }

                  ++var4;
               }
            }

            var3 = 0;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4466[2] + (arg0 != null ? field4466[0] : field4466[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(Lica;I)Lno;",
      line = 51
   )
   public static final class696 method2345(class354 arg0, int arg1) {
      try {
         ++field4463;
         int var2 = arg0.method2855(-31007);
         class694 var3 = class389.method3142((byte)-83)[arg0.method2855(-31007)];
         class750 var4 = class666.method4919((byte)91)[arg0.method2855(arg1 ^ 31007)];
         int var5 = arg0.method2869(false);
         int var6 = arg0.method2869(false);
         int var7 = arg0.method2848(-126);
         int var8 = arg0.method2848(-107);
         int var9 = arg0.method2894(arg1 + 106);
         int var10 = arg0.method2894(98);
         int var11 = arg0.method2894(108);
         boolean var12 = ~arg0.method2855(arg1 ^ 31007) == arg1;
         return new class696(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field4466[5] + (arg0 != null ? field4466[0] : field4466[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(II)I",
      line = 85
   )
   public final int method2346(int arg0, int arg1) {
      try {
         ++field4465;
         if (arg1 >= -33) {
            field4462 = null;
         }

         int var3 = (this.field4464.length >> 1) + -1;
         int var4 = arg0 & var3;

         while(true) {
            int var5 = this.field4464[var4 + var4 + 1];
            if (var5 == -1) {
               return -1;
            }

            if (~this.field4464[var4 + var4] == ~arg0) {
               return var5;
            }

            var4 = var4 + 1 & var3;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4466[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2347(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2348(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
