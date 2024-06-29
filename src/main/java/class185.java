import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class185 {
   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2279 = new String[]{method1415(method1414(">GRK")), method1415(method1414("+\u001c\u0010\t\u0016")), method1415(method1414("3Y_\t(x")), method1415(method1414("3Y_\t)x")), method1415(method1414("3Y_\t*x")), method1415(method1414("3Y_\t.x")), method1415(method1414("3Y_\t/x"))};
   @OriginalMember(
      owner = "client!cka",
      name = "f",
      descriptor = "Lgka;"
   )
   public static class394 field2270 = new class394("", 17);
   @OriginalMember(
      owner = "client!cka",
      name = "e",
      descriptor = "I"
   )
   private int field2271;
   @OriginalMember(
      owner = "client!cka",
      name = "d",
      descriptor = "I"
   )
   public static int field2272;
   @OriginalMember(
      owner = "client!cka",
      name = "g",
      descriptor = "I"
   )
   public static int field2273;
   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "I"
   )
   public static int field2274;
   @OriginalMember(
      owner = "client!cka",
      name = "h",
      descriptor = "I"
   )
   public static int field2275;
   @OriginalMember(
      owner = "client!cka",
      name = "b",
      descriptor = "I"
   )
   public int field2277;
   @OriginalMember(
      owner = "client!cka",
      name = "i",
      descriptor = "I"
   )
   public int field2278;
   @OriginalMember(
      owner = "client!cka",
      name = "c",
      descriptor = "Lqba;"
   )
   public class429 field2276;

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1409(int arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field2275;
         if (class603.method4400(2, arg0)) {
            int var3 = 126 % ((47 - arg1) / 58);
            class657[] var4 = class468.field6451[arg0];
            int var5 = 0;
            if (var2 || ~var4.length < ~var5) {
               do {
                  class657 var6 = var4[var5];
                  if (var6 != null) {
                     var6.field9370 = 0;
                     var6.field9238 = 1;
                     var6.field9343 = 0;
                  }

                  ++var5;
               } while(~var4.length < ~var5);

            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2279[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(IZLwm;)V"
   )
   private final void method1410(int arg0, boolean arg1, class594 arg2) {
      try {
         label30: {
            ++field2272;
            if (~arg0 == -2) {
               this.field2271 = arg2.method4280(-19104);
               if (!client.field4273) {
                  break label30;
               }
            }

            if (arg0 == 2) {
               this.field2277 = arg2.method4288((byte)123);
               this.field2278 = arg2.method4288((byte)122);
            }
         }

         if (!arg1) {
            this.field2277 = 6;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2279[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2279[1] : field2279[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(I)Lok;"
   )
   public final synchronized class267 method1411(int arg0) {
      try {
         ++field2274;
         class267 var2 = (class267)this.field2276.field5985.method4239((long)this.field2271, arg0);
         if (var2 != null) {
            return var2;
         } else {
            class267 var3 = class267.method2050(this.field2276.field5984, this.field2271, 0);
            if (var3 != null) {
               this.field2276.field5985.method4238(98, var3, (long)this.field2271);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2279[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1412(boolean arg0) {
      try {
         if (arg0) {
            method1412(false);
         }

         field2270 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2279[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(Lwm;I)V"
   )
   public final void method1413(class594 arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != 32220) {
            field2270 = null;
         }

         ++field2273;

         do {
            int var4 = arg0.method4288((byte)86);
            if (~var4 == -1) {
               break;
            }

            this.method1410(var4, true, arg0);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2279[2] + (arg0 != null ? field2279[1] : field2279[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1414(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1415(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
