import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class730 extends class305 {
   @OriginalMember(
      owner = "client!waa",
      name = "w",
      descriptor = "Loe;"
   )
   public class210 field10499;
   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10502 = new String[]{method5273(method5272("[\u0013\"\u0012@\u0004")), method5273(method5272("W\\m\u0012|")), method5273(method5272("B\u0007/P")), method5273(method5272("[\u0013\"\u0012=E\u001c*H?\u0004"))};
   @OriginalMember(
      owner = "client!waa",
      name = "x",
      descriptor = "I"
   )
   public static int field10500;
   @OriginalMember(
      owner = "client!waa",
      name = "v",
      descriptor = "I"
   )
   public static int field10501;

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(Luda;ILmba;)Lk;",
      line = 5
   )
   public static final class589 method5271(class473 arg0, int arg1, class439 arg2) {
      boolean var3 = client.field4564;

      try {
         ++field10501;
         class589 var4 = new class589(arg2);
         int var5 = arg0.method3564((byte)-104);
         boolean var6 = ~(var5 & 1) != -1;
         boolean var7 = (var5 & 2) != 0;
         boolean var8 = ~(var5 & 4) != -1;
         if (var6) {
            var4.field8503[0] = arg0.method3565(true);
            var4.field8512[0] = arg0.method3565(true);
            if (~arg2.field6386 != 0 || ~arg2.field6381 != 0) {
               var4.field8503[1] = arg0.method3565(true);
               var4.field8512[1] = arg0.method3565(true);
            }

            if (~arg2.field6404 != 0 || ~arg2.field6396 != 0) {
               var4.field8503[2] = arg0.method3565(true);
               var4.field8512[2] = arg0.method3565(true);
            }
         }

         boolean var9 = (8 & var5) != arg1;
         if (var7) {
            var4.field8509[0] = arg0.method3565(true);
            var4.field8505[0] = arg0.method3565(true);
            if (~arg2.field6348 != 0 || arg2.field6356 != -1) {
               var4.field8509[1] = arg0.method3565(true);
               var4.field8505[1] = arg0.method3565(true);
            }
         }

         if (var8) {
            int var10 = arg0.method3565(true);
            int[] var11 = new int[]{class66.method706(var10, 15), class66.method706(245, var10) >> 4, class66.method706(var10 >> 8, 15), class66.method706(15, var10 >> 12)};
            int var12 = 0;
            if (var3 || var12 < 4) {
               do {
                  if (var11[var12] != 15) {
                     var4.field8511[var11[var12]] = (short)arg0.method3565(true);
                  }

                  ++var12;
               } while(var12 < 4);
            }
         }

         if (var9) {
            int var13 = arg0.method3564((byte)-88);
            int[] var14 = new int[]{class66.method706(15, var13), class66.method706(var13, 254) >> 4};
            int var15 = 0;
            if (var3 || ~var15 > -3) {
               do {
                  if (~var14[var15] != -16) {
                     var4.field8510[var14[var15]] = (short)arg0.method3565(true);
                  }

                  ++var15;
               } while(~var15 > -3);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field10502[0] + (arg0 != null ? field10502[1] : field10502[2]) + ',' + arg1 + ',' + (arg2 != null ? field10502[1] : field10502[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "<init>",
      descriptor = "(Loe;)V",
      line = 98
   )
   public class730(class210 arg0) {
      try {
         this.field10499 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10502[3] + (arg0 != null ? field10502[1] : field10502[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5272(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5273(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
