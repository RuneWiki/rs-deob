import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class142 {
   @OriginalMember(
      owner = "client!pb",
      name = "f",
      descriptor = "Z"
   )
   private boolean field2261 = false;
   @OriginalMember(
      owner = "client!pb",
      name = "i",
      descriptor = "I"
   )
   public int field2264 = 443;
   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "I"
   )
   public int field2260 = 43594;
   @OriginalMember(
      owner = "client!pb",
      name = "m",
      descriptor = "Z"
   )
   private boolean field2265 = true;
   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2271 = new String[]{method1421(method1420("Zj'f\u0001")), method1421(method1420("Q&'\u000bT")), method1421(method1420("O1e$")), method1421(method1420("Q&'\rT")), method1421(method1420("\u0001x`%\u001b\u001c")), method1421(method1420("Q&'\nT")), method1421(method1420("Q&'\fT")), method1421(method1420("Q&'\tT"))};
   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "Lhha;"
   )
   public static class724 field2266 = new class724(95, 10);
   @OriginalMember(
      owner = "client!pb",
      name = "h",
      descriptor = "Lom;"
   )
   public static class722 field2268 = new class722();
   @OriginalMember(
      owner = "client!pb",
      name = "c",
      descriptor = "Lhha;"
   )
   public static class724 field2269 = new class724(42, 0);
   @OriginalMember(
      owner = "client!pb",
      name = "j",
      descriptor = "I"
   )
   public static int field2257;
   @OriginalMember(
      owner = "client!pb",
      name = "n",
      descriptor = "I"
   )
   public static int field2259;
   @OriginalMember(
      owner = "client!pb",
      name = "l",
      descriptor = "I"
   )
   public int field2262;
   @OriginalMember(
      owner = "client!pb",
      name = "g",
      descriptor = "I"
   )
   public static int field2267;
   @OriginalMember(
      owner = "client!pb",
      name = "k",
      descriptor = "I"
   )
   public static int field2270;
   @OriginalMember(
      owner = "client!pb",
      name = "e",
      descriptor = "Lvl;"
   )
   public static class340 field2263;
   @OriginalMember(
      owner = "client!pb",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field2258;

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1415(byte arg0) {
      boolean var2 = client.field10022;

      try {
         label34: {
            ++field2259;
            if (!this.field2265) {
               this.field2265 = true;
               this.field2261 = true;
               if (!var2) {
                  break label34;
               }
            }

            if (this.field2261) {
               this.field2261 = false;
               if (!var2) {
                  break label34;
               }
            }

            this.field2265 = false;
         }

         if (arg0 > -11) {
            field2263 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2271[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(BLfea;)Ldu;"
   )
   public final class92 method1416(byte arg0, class82 arg1) {
      try {
         if (arg0 != -4) {
            return null;
         } else {
            ++field2270;
            return arg1.method875(this.field2261, this.field2265 ? this.field2264 : this.field2260, this.field2258, (byte)-122);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2271[3] + arg0 + ',' + (arg1 != null ? field2271[0] : field2271[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1417(byte arg0) {
      try {
         field2266 = null;
         field2268 = null;
         field2263 = null;
         if (arg0 < 65) {
            method1417((byte)-55);
         }

         field2269 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2271[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "([IB)Ljava/lang/String;"
   )
   public static final String method1418(int[] arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2267;
         StringBuffer var3 = new StringBuffer();
         if (arg1 != 101) {
            field2268 = null;
         }

         int var4 = class100.field1590;
         int var5 = 0;
         if (!var2 && arg0.length <= var5) {
            return var3.toString();
         } else {
            do {
               class129 var6 = class78.field1245.method3830(arg0[var5], arg1 ^ 70);
               if (var6.field2063 != -1) {
                  class148 var7 = (class148)class253.field3838.method1041((long)var6.field2063, 8);
                  if (var7 == null) {
                     class433 var8 = class433.method3382(class790.field11506, var6.field2063, 0);
                     if (var8 != null) {
                        var7 = class54.field794.method187(var8, true);
                        class253.field3838.method1050(-89, var7, (long)var6.field2063);
                     }
                  }

                  if (var7 != null) {
                     class134.field2183[var4] = var7;
                     var3.append(field2271[4]).append(var4).append(">");
                     ++var4;
                  }
               }

               ++var5;
            } while(arg0.length > var5);

            return var3.toString();
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2271[5] + (arg0 != null ? field2271[0] : field2271[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(Lpb;B)Z"
   )
   public final boolean method1419(class142 arg0, byte arg1) {
      try {
         ++field2257;
         int var3 = 29 % ((54 - arg1) / 49);
         if (arg0 != null) {
            return ~this.field2262 == ~arg0.field2262 && this.field2258.equals(arg0.field2258);
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2271[1] + (arg0 != null ? field2271[0] : field2271[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1420(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1421(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
