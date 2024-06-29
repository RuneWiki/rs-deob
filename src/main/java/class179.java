import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class179 extends class505 {
   @OriginalMember(
      owner = "client!bka",
      name = "C",
      descriptor = "I"
   )
   private int field2466 = -1;
   @OriginalMember(
      owner = "client!bka",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2476 = new String[]{method1436(method1435("X/(G\r\u0012")), method1436(method1435("X/(G\u000f\u0012")), method1436(method1435("T1%\u0005")), method1436(method1435("AjgG8")), method1436(method1435("X/(G\u0004\u0012")), method1436(method1435("X/(G\u0002\u0012")), method1436(method1435("X/(G\u000e\u0012"))};
   @OriginalMember(
      owner = "client!bka",
      name = "A",
      descriptor = "I"
   )
   public static int field2465 = -1;
   @OriginalMember(
      owner = "client!bka",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field2469 = new int[5];
   @OriginalMember(
      owner = "client!bka",
      name = "s",
      descriptor = "B"
   )
   private byte field2471;
   @OriginalMember(
      owner = "client!bka",
      name = "x",
      descriptor = "I"
   )
   public static int field2468;
   @OriginalMember(
      owner = "client!bka",
      name = "t",
      descriptor = "I"
   )
   private int field2470;
   @OriginalMember(
      owner = "client!bka",
      name = "y",
      descriptor = "I"
   )
   public static int field2472;
   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "I"
   )
   public static int field2473;
   @OriginalMember(
      owner = "client!bka",
      name = "w",
      descriptor = "I"
   )
   public static int field2474;
   @OriginalMember(
      owner = "client!bka",
      name = "B",
      descriptor = "I"
   )
   public static int field2475;
   @OriginalMember(
      owner = "client!bka",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private String field2467;

   @OriginalMember(
      owner = "client!bka",
      name = "b",
      descriptor = "(III)Lkp;",
      line = 16
   )
   public static final class517 method1431(int arg0, int arg1, int arg2) {
      if (class663.field9659[arg0][arg1][arg2] == null) {
         boolean var3 = class663.field9659[0][arg1][arg2] != null && class663.field9659[0][arg1][arg2].field7467 != null;
         if (var3 && arg0 >= class154.field2185 - 1) {
            return null;
         }

         class408.method3072(arg0, arg1, arg2);
      }

      return class663.field9659[arg0][arg1][arg2];
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(ILwf;)V",
      line = 29
   )
   public final void method1338(int arg0, class147 arg1) {
      try {
         ++field2473;
         this.field2466 = arg1.method1211(-26166);
         if (arg0 >= 105) {
            this.field2471 = arg1.method1162(4);
            this.field2470 = arg1.method1211(-26166);
            arg1.method1207(false);
            this.field2467 = arg1.method1204(2119550368);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2476[5] + arg0 + ',' + (arg1 != null ? field2476[3] : field2476[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(III)I",
      line = 46
   )
   public static final int method1432(int arg0, int arg1, int arg2) {
      try {
         ++field2468;
         int var3 = class772.method5580(arg1 + -2129526602, arg0 + -1, arg2 - 1) + class772.method5580(-2129536883, arg0 + -1, arg2 + 1) + (class772.method5580(arg1 + -2129526602, arg0 + 1, arg2 + -1) - -class772.method5580(-2129536883, arg0 + 1, arg2 + 1));
         int var4 = class772.method5580(-2129536883, arg0, arg2 + -1) - -class772.method5580(-2129536883, arg0, arg2 + 1) - -class772.method5580(arg1 ^ 2129530714, arg0 + -1, arg2) - -class772.method5580(-2129536883, arg0 - -1, arg2);
         int var5 = class772.method5580(-2129536883, arg0, arg2);
         if (arg1 != -10281) {
            field2469 = null;
         }

         return var3 / 16 - (-(var4 / 8) + -(var5 / 4));
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2476[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(Ldda;Z)V",
      line = 68
   )
   public final void method1339(class405 arg0, boolean arg1) {
      try {
         ++field2475;
         class578 var3 = arg0.field5854[this.field2466];
         var3.field8530 = this.field2471;
         if (!arg1) {
            this.field2470 = -110;
         }

         var3.field8533 = this.field2470;
         var3.field8532 = this.field2467;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2476[4] + (arg0 != null ? field2476[3] : field2476[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "c",
      descriptor = "(I)V",
      line = 87
   )
   public static final void method1433(int arg0) {
      boolean var1 = client.field4360;

      try {
         if (arg0 != 5) {
            field2465 = 68;
         }

         ++field2472;
         int var2 = 0;
         if (var1 || ~var2 > ~class613.field9016.length) {
            do {
               int var3 = 0;
               if (var1 || ~var3 > ~class613.field9016[0].length) {
                  do {
                     int var4 = 0;
                     if (var1) {
                        class613.field9016[var2][var3][var4] = 0;
                        ++var4;
                     }

                     while(true) {
                        while(var4 < class613.field9016[0][0].length) {
                           class613.field9016[var2][var3][var4] = 0;
                           ++var4;
                        }

                        if (!var1) {
                           ++var3;
                           break;
                        }

                        ++var4;
                     }
                  } while(~var3 > ~class613.field9016[0].length);
               }

               ++var2;
            } while(~var2 > ~class613.field9016.length);

         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2476[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(B)V",
      line = 122
   )
   public static void method1434(byte arg0) {
      try {
         int var1 = 82 % ((arg0 - 86) / 32);
         field2469 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2476[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1435(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1436(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
