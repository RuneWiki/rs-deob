import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public abstract class class175 extends class70 {
   @OriginalMember(
      owner = "client!dfa",
      name = "A",
      descriptor = "I"
   )
   public int field2172;
   @OriginalMember(
      owner = "client!dfa",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2177 = new String[]{method1393(method1392("A|\u0018Q.Lt\u0010\u000b,\r")), method1393(method1392("A|\u0018Q[\r")), method1393(method1392("^4WQo")), method1393(method1392("A|\u0018QX\r")), method1393(method1392("Ko\u0015\u0013")), method1393(method1392("A|\u0018Q^\r"))};
   @OriginalMember(
      owner = "client!dfa",
      name = "x",
      descriptor = "I"
   )
   public static int field2176 = -1;
   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "F"
   )
   public static float field2171;
   @OriginalMember(
      owner = "client!dfa",
      name = "B",
      descriptor = "I"
   )
   public static int field2173;
   @OriginalMember(
      owner = "client!dfa",
      name = "y",
      descriptor = "I"
   )
   public static int field2174;
   @OriginalMember(
      owner = "client!dfa",
      name = "C",
      descriptor = "Lvl;"
   )
   public static class15 field2175;

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(ILln;I)V"
   )
   public static final void method1389(int arg0, class397 arg1, int arg2) {
      try {
         ++field2174;
         if (arg2 <= -75) {
            if (arg1.field6101 != null) {
               int var3 = arg1.field6101[arg0 + 1];
               if (~arg1.field6072 != ~var3) {
                  arg1.field6043 = 0;
                  arg1.field6053 = 0;
                  arg1.field6030 = 0;
                  arg1.field6045 = 1;
                  arg1.field6119 = arg1.field6121;
                  arg1.field6072 = var3;
                  if (arg1.field6072 != -1) {
                     class718.method5194(arg1, arg1.field6043, class576.field8554.method3189(arg1.field6072, (byte)-45), true);
                     return;
                  }
               }
            }

         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2177[3] + arg0 + ',' + (arg1 != null ? field2177[2] : field2177[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method1390(int arg0) {
      try {
         field2175 = null;
         if (arg0 != -4221) {
            method1389(53, (class397)null, -2);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2177[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "g",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public abstract Object method1192(int arg0);

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(B)Z"
   )
   public abstract boolean method1191(byte arg0);

   @OriginalMember(
      owner = "client!dfa",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class175(int arg0) {
      try {
         this.field2172 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2177[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(ZIII)I"
   )
   public static final int method1391(boolean arg0, int arg1, int arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field2173;
         class5 var5 = class289.method2200(arg3, 0, arg0);
         if (var5 == null) {
            return 0;
         } else if (~arg2 == 0) {
            return 0;
         } else {
            int var6 = 0;
            if (arg1 != -1) {
               field2175 = null;
            }

            int var7 = 0;
            if (var4 != 0) {
               if (var5.field88[var7] == arg2) {
                  var6 += var5.field87[var7];
               }

               ++var7;
            }

            while(true) {
               int var10000;
               if (var7 >= var5.field87.length) {
                  var10000 = var6;
                  if (var4 == 0) {
                     return var6;
                  }
               } else {
                  var10000 = var5.field88[var7];
               }

               if (var10000 == arg2) {
                  var6 += var5.field87[var7];
               }

               ++var7;
            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field2177[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1392(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1393(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
