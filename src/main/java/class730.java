import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class730 {
   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10396 = new String[]{method5293(method5292("\u001b>+\u001dy")), method5293(method5292("\u001b>++>% w6?\u0011|")), method5293(method5292("\u001b>+\u001ey"))};
   @OriginalMember(
      owner = "client!mj",
      name = "c",
      descriptor = "I"
   )
   public static int field10392;
   @OriginalMember(
      owner = "client!mj",
      name = "b",
      descriptor = "I"
   )
   public static int field10393;
   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "I"
   )
   public static int field10394;
   @OriginalMember(
      owner = "client!mj",
      name = "d",
      descriptor = "I"
   )
   public static int field10395;

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method5290(int arg0, int arg1, int arg2) {
      try {
         ++field10394;
         int var4 = ~arg1 <= ~class140.field2243 ? arg1 : class140.field2243;
         if (class91.field1334 == this) {
            return 0;
         } else if (class582.field8179 == this) {
            return -arg0 + var4;
         } else if (class709.field10173 == this) {
            return (-arg0 + var4) / 2;
         } else {
            if (arg2 < 102) {
               field10393 = 125;
            }

            return 0;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10396[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field10392;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10396[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(IIIZI)Z"
   )
   public static final boolean method5291(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field10395;
         if (class66.field971 && class174.field2594) {
            if (~class526.field7443 > -101) {
               return false;
            } else if (!class767.method5521(arg1, (byte)-78, arg4, arg2)) {
               return false;
            } else {
               if (arg3) {
                  method5291(-120, 37, -43, false, -48);
               }

               int var5 = arg1 << class313.field4707;
               int var6 = arg2 << class313.field4707;
               if (class216.method1865(var6, var5, class44.field655, class44.field655, arg0, class225.field3197[arg4].method5400(-1, arg2, arg1), 115)) {
                  ++class40.field622;
                  return true;
               } else {
                  return false;
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10396[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5292(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5293(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
