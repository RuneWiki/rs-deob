import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class331 extends class562 {
   @OriginalMember(
      owner = "client!hfa",
      name = "H",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field4500;
   @OriginalMember(
      owner = "client!hfa",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4504 = new String[]{method2450(method2449("\u0012i\u0014\u001e#R")), method2450(method2449("\u0012i\u0014\u001e\\\u0013a\u001cD^R")), method2450(method2449("\u0001![\u001e\u001d")), method2450(method2449("\u0014z\u0019\\")), method2450(method2449("\u0012i\u0014\u001e$R")), method2450(method2449("\u0012i\u0014\u001e\"R")), method2450(method2449("\u0012i\u0014\u001e%R"))};
   @OriginalMember(
      owner = "client!hfa",
      name = "D",
      descriptor = "I"
   )
   public static int field4499;
   @OriginalMember(
      owner = "client!hfa",
      name = "G",
      descriptor = "I"
   )
   public static int field4501;
   @OriginalMember(
      owner = "client!hfa",
      name = "A",
      descriptor = "I"
   )
   public static int field4502;
   @OriginalMember(
      owner = "client!hfa",
      name = "J",
      descriptor = "I"
   )
   public static int field4503;

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(ZIIZI)V",
      line = 8
   )
   public static final void method2445(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         if (!arg0) {
            ++field4501;
            class217.method1712(28041);
            class609.field8945 = 0L;
            int var5 = class713.method5178(-120);
            if (~arg2 == -4 || var5 == 3) {
               arg3 = true;
            }

            if (!class383.field5543.method526()) {
               arg3 = true;
            }

            class316.method2319(arg4, -5750, arg1, var5, arg3, arg2);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4504[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(IZZ)V",
      line = 29
   )
   public static final void method2446(int arg0, boolean arg1, boolean arg2) {
      boolean var3 = client.field4360;

      try {
         ++field4503;
         class111 var4 = class616.method4475(arg0, arg1, (byte)56);
         if (var4 != null) {
            int var5 = 0;
            if (var3) {
               var4.field1391[var5] = -1;
               var4.field1396[var5] = 0;
               ++var5;
            }

            while(true) {
               while(var5 < var4.field1391.length) {
                  var4.field1391[var5] = -1;
                  var4.field1396[var5] = 0;
                  ++var5;
               }

               if (!var3) {
                  if (arg2) {
                     return;
                  }

                  return;
               }

               ++var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4504[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "c",
      descriptor = "(I)Ljava/lang/Object;",
      line = 55
   )
   public final Object method2447(int arg0) {
      try {
         ++field4499;
         return arg0 < 16 ? null : this.field4500;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4504[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "<init>",
      descriptor = "(Liv;Ljava/lang/Object;I)V",
      line = 67
   )
   public class331(class107 arg0, Object arg1, int arg2) {
      super(arg0, arg2);

      try {
         this.field4500 = arg1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4504[1] + (arg0 != null ? field4504[2] : field4504[3]) + ',' + (arg1 != null ? field4504[2] : field4504[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(I)Z",
      line = 76
   )
   public final boolean method2448(int arg0) {
      try {
         ++field4502;
         return arg0 != 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4504[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2449(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2450(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
