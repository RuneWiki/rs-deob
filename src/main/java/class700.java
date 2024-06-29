import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class700 extends class204 {
   @OriginalMember(
      owner = "client!ab",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10204 = new String[]{method5086(method5085("$'8%T")), method5086(method5085(")/")), method5086(method5085("$'8#T")), method5086(method5085("$'8-T")), method5086(method5085("$'8$T")), method5086(method5085("$'8\"T")), method5086(method5085("(,u\u0015\u00136*p\u0013"))};
   @OriginalMember(
      owner = "client!ab",
      name = "Y",
      descriptor = "Lnw;"
   )
   public static class616 field10199 = new class616(29, 18);
   @OriginalMember(
      owner = "client!ab",
      name = "M",
      descriptor = "I"
   )
   public static int field10197;
   @OriginalMember(
      owner = "client!ab",
      name = "X",
      descriptor = "I"
   )
   public static int field10198;
   @OriginalMember(
      owner = "client!ab",
      name = "V",
      descriptor = "I"
   )
   public static int field10200;
   @OriginalMember(
      owner = "client!ab",
      name = "ab",
      descriptor = "I"
   )
   public static int field10202;
   @OriginalMember(
      owner = "client!ab",
      name = "U",
      descriptor = "J"
   )
   public static long field10201;
   @OriginalMember(
      owner = "client!ab",
      name = "Z",
      descriptor = "Lnt;"
   )
   public static class234 field10203;

   @OriginalMember(
      owner = "client!ab",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method5081(byte arg0) {
      try {
         field10199 = null;
         field10203 = null;
         if (arg0 < 31) {
            field10201 = 119L;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10204[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field10197;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (arg1 < 26) {
            return null;
         } else {
            if (super.field2644.field6719 && this.method1540(-1)) {
               int[] var5 = var4[0];
               int[] var6 = var4[1];
               int[] var7 = var4[2];
               int var8 = arg0 % super.field2503 * super.field2503;
               int var9 = 0;
               if (var3 || ~class576.field7916 < ~var9) {
                  do {
                     int var10 = super.field2513[var9 % super.field2508 + var8];
                     var7[var9] = class743.method5375(255, var10) << 4;
                     var6[var9] = class743.method5375(var10 >> 4, 4080);
                     var5[var9] = class743.method5375(16711680, var10) >> 12;
                     ++var9;
                  } while(~class576.field7916 < ~var9);
               }
            }

            return var4;
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field10204[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method5082(int arg0, int arg1) {
      try {
         ++field10200;
         if (~class445.field6162 == -8) {
            if (arg1 != 58) {
               field10203 = null;
            }

            if (~class545.field7442 == -1 && class617.field8606 == 0) {
               class766.field11046 = arg0;
               class397.method3019(87, 9);
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10204[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "k",
      descriptor = "(I)V"
   )
   public static final void method5083(int arg0) {
      try {
         ++field10202;
         if (arg0 < 19) {
            method5082(-52, -29);
         }

         if (class255.field3263.toLowerCase().indexOf(field10204[6]) != -1) {
            class720.field10540[223] = 28;
            class720.field10540[190] = 72;
            class720.field10540[187] = 27;
            class720.field10540[191] = 73;
            class720.field10540[188] = 71;
            class720.field10540[220] = 74;
            class720.field10540[189] = 26;
            class720.field10540[192] = 58;
            class720.field10540[219] = 42;
            class720.field10540[222] = 59;
            class720.field10540[186] = 57;
            class720.field10540[221] = 43;
         } else {
            label21: {
               class720.field10540[61] = 27;
               class720.field10540[93] = 43;
               class720.field10540[46] = 72;
               class720.field10540[47] = 73;
               if (class255.field3239 == null) {
                  class720.field10540[192] = 58;
                  class720.field10540[222] = 59;
                  if (!client.field4273) {
                     break label21;
                  }
               }

               class720.field10540[520] = 59;
               class720.field10540[222] = 58;
               class720.field10540[192] = 28;
            }

            class720.field10540[45] = 26;
            class720.field10540[59] = 57;
            class720.field10540[92] = 74;
            class720.field10540[44] = 71;
            class720.field10540[91] = 42;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10204[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "l",
      descriptor = "(I)Lnia;"
   )
   public static final class675 method5084(int arg0) {
      try {
         ++field10198;

         try {
            int var1 = -82 % ((arg0 - -43) / 47);
            return (class675)Class.forName(field10204[1]).newInstance();
         } catch (Throwable var3) {
            return new class112();
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10204[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5085(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5086(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
