import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class621 {
   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8680 = new String[]{method4520(method4519("Q!\u00009/")), method4520(method4519("I'B\u0017")), method4520(method4519("\\|\u0000Uz")), method4520(method4519("Q!\u0000:/")), method4520(method4519("Q!\u00008/")), method4520(method4519("Q!\u0000?/"))};
   @OriginalMember(
      owner = "client!vs",
      name = "c",
      descriptor = "Lbga;"
   )
   public static class378 field8675 = new class378(50, -2);
   @OriginalMember(
      owner = "client!vs",
      name = "b",
      descriptor = "I"
   )
   public static int field8676;
   @OriginalMember(
      owner = "client!vs",
      name = "f",
      descriptor = "I"
   )
   public static int field8677;
   @OriginalMember(
      owner = "client!vs",
      name = "d",
      descriptor = "I"
   )
   public static int field8678;
   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "Ldha;"
   )
   public static class84 field8679;
   @OriginalMember(
      owner = "client!vs",
      name = "e",
      descriptor = "[Lbo;"
   )
   public static class763[] field8674;

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4515(int arg0) {
      try {
         field8674 = null;
         field8675 = null;
         field8679 = null;
         int var1 = 69 % ((77 - arg0) / 37);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8680[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "([[F[[SI)[[S"
   )
   public static final short[][] method4516(float[][] arg0, short[][] arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         ++field8677;
         int var4 = 0;
         int var5;
         if (arg2 != 30926) {
            field8675 = null;
            if (var3) {
               var5 = 0;
               if (var3) {
                  arg1[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
                  ++var5;
               }
            } else {
               if (~var4 <= ~arg0.length) {
                  return arg1;
               }

               var5 = 0;
               if (var3) {
                  arg1[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
                  ++var5;
               }
            }
         } else {
            if (~var4 <= ~arg0.length) {
               return arg1;
            }

            var5 = 0;
            if (var3) {
               arg1[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~arg1[var4].length) {
               arg1[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
               ++var5;
            }

            if (!var3) {
               ++var4;
               if (~var4 <= ~arg0.length) {
                  return arg1;
               }

               var5 = 0;
               if (var3) {
                  arg1[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
                  ++var5;
               }
            } else {
               ++var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8680[3] + (arg0 != null ? field8680[2] : field8680[1]) + ',' + (arg1 != null ? field8680[2] : field8680[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method4517(byte arg0) {
      try {
         if (arg0 != -64) {
            field8674 = null;
         }

         ++field8678;
         return ~class234.field2899 < -1;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8680[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(BJ)V"
   )
   public static final void method4518(byte arg0, long arg1) {
      try {
         ++field8676;
         class624.field8714.setTime(new Date(arg1));
         if (arg0 != -2) {
            method4517((byte)-63);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8680[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4519(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4520(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
