import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class278 extends class249 {
   @OriginalMember(
      owner = "client!tia",
      name = "B",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field3913;
   @OriginalMember(
      owner = "client!tia",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3916 = new String[]{method2182(method2181("\n\u0015`\u000bWV")), method2182(method2181("\n\u0015`\u000bUV")), method2182(method2181("\u0010\tmI")), method2182(method2181("\u0005R/\u000bi")), method2182(method2181("\n\u0015`\u000b(\u0017\u0012hQ*V")), method2182(method2181("\n\u0015`\u000bVV"))};
   @OriginalMember(
      owner = "client!tia",
      name = "y",
      descriptor = "I"
   )
   public static int field3911;
   @OriginalMember(
      owner = "client!tia",
      name = "A",
      descriptor = "I"
   )
   public static int field3912;
   @OriginalMember(
      owner = "client!tia",
      name = "C",
      descriptor = "I"
   )
   public static int field3914;
   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "J"
   )
   public static long field3915;

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2022(byte arg0) {
      try {
         if (arg0 <= 122) {
            this.field3913 = null;
         }

         ++field3912;
         return false;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3916[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method2180(long arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (class90.field1473 != null) {
            label75: {
               if (~class590.field8514 != -2 && class590.field8514 != 5) {
                  if (~class590.field8514 != -5) {
                     break label75;
                  }

                  class283.method2208(arg0, false);
                  if (!var3) {
                     break label75;
                  }
               }

               class588.method4355(arg0, -2001);
            }
         }

         ++field3911;
         class589.method4358(class444.field6473, (long)class29.field458, 109);
         if (arg1 > -106) {
            method2180(18L, -102);
         }

         if (class277.field3907 != -1) {
            class516.method3900(class277.field3907, -1);
         }

         int var4 = 0;
         if (var3) {
            if (class178.field2749[var4]) {
               class36.field892[var4] = true;
            }

            class114.field1851[var4] = class178.field2749[var4];
            class178.field2749[var4] = false;
            ++var4;
         }

         while(true) {
            int var10000;
            if (~class656.field9577 >= ~var4) {
               class133.field2195 = class29.field458;
               class658.method4833((class303)null, (byte)59, -1, -1);
               class624.method4568(-1, -1, (byte)-60, (class303)null);
               var10000 = ~class277.field3907;
               if (!var3) {
                  if (var10000 != 0) {
                     class656.field9577 = 0;
                     class738.method5309(-4913);
                  }

                  class444.field6473.method349();
                  class625.method4574(class444.field6473, -16711936);
                  int var5 = class112.method1063((byte)100);
                  if (var5 == -1) {
                     var5 = class135.field2225;
                  }

                  if (var5 == -1) {
                     var5 = class396.field5817;
                  }

                  class250.method2027(var5, 0);
                  int var6 = class304.field4398.method3438(false) << 8;
                  class212.method1807(class304.field4398.field4090, -26663, class697.field10217, class304.field4398.field4096 + var6, class304.field4398.field4101 + var6);
                  class697.field10217 = 0;
                  return;
               }
            } else {
               var10000 = class178.field2749[var4];
            }

            if (var10000 != 0) {
               class36.field892[var4] = true;
            }

            class114.field1851[var4] = class178.field2749[var4];
            class178.field2749[var4] = false;
            ++var4;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3916[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "<init>",
      descriptor = "(Lcba;Ljava/lang/Object;I)V"
   )
   public class278(class574 arg0, Object arg1, int arg2) {
      super(arg0, arg2);

      try {
         this.field3913 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3916[4] + (arg0 != null ? field3916[3] : field3916[2]) + ',' + (arg1 != null ? field3916[3] : field3916[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "b",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method2023(byte arg0) {
      try {
         if (arg0 != 59) {
            return null;
         } else {
            ++field3914;
            return this.field3913;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3916[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2181(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2182(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
