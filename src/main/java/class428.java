import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class428 extends class100 {
   @OriginalMember(
      owner = "client!nr",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6287 = new String[]{method3351(method3350("\u0017\t$1>")), method3351(method3350("\u0017\t$;>")), method3351(method3350("\u0017\t$4>")), method3351(method3350("\u0017\t$3>")), method3351(method3350("\u0017\t$7>")), method3351(method3350("\u0017\t$6>")), method3351(method3350("\u0017\t$5>"))};
   @OriginalMember(
      owner = "client!nr",
      name = "r",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field6276 = new String[200];
   @OriginalMember(
      owner = "client!nr",
      name = "u",
      descriptor = "I"
   )
   public static int field6272 = 0;
   @OriginalMember(
      owner = "client!nr",
      name = "A",
      descriptor = "Lhha;"
   )
   public static class724 field6275 = new class724(78, 6);
   @OriginalMember(
      owner = "client!nr",
      name = "y",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field6286 = new BigInteger(method3351(method3350("HK:B'")), 16);
   @OriginalMember(
      owner = "client!nr",
      name = "G",
      descriptor = "I"
   )
   public static int field6269;
   @OriginalMember(
      owner = "client!nr",
      name = "C",
      descriptor = "I"
   )
   public static int field6270;
   @OriginalMember(
      owner = "client!nr",
      name = "I",
      descriptor = "I"
   )
   public static int field6274;
   @OriginalMember(
      owner = "client!nr",
      name = "D",
      descriptor = "I"
   )
   public static int field6279;
   @OriginalMember(
      owner = "client!nr",
      name = "t",
      descriptor = "I"
   )
   public static int field6284;
   @OriginalMember(
      owner = "client!nr",
      name = "E",
      descriptor = "I"
   )
   public static int field6285;
   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "Lma;"
   )
   private class148 field6271;
   @OriginalMember(
      owner = "client!nr",
      name = "F",
      descriptor = "Lma;"
   )
   public class148 field6273;
   @OriginalMember(
      owner = "client!nr",
      name = "w",
      descriptor = "Lma;"
   )
   private class148 field6278;
   @OriginalMember(
      owner = "client!nr",
      name = "x",
      descriptor = "Lma;"
   )
   private class148 field6280;
   @OriginalMember(
      owner = "client!nr",
      name = "v",
      descriptor = "Lma;"
   )
   private class148 field6282;
   @OriginalMember(
      owner = "client!nr",
      name = "H",
      descriptor = "Lma;"
   )
   private class148 field6283;
   @OriginalMember(
      owner = "client!nr",
      name = "s",
      descriptor = "Leba;"
   )
   public static class489 field6277;
   @OriginalMember(
      owner = "client!nr",
      name = "B",
      descriptor = "Z"
   )
   public static boolean field6281;

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public final void method952(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         if (arg0 == 1) {
            ++field6274;
            if (arg2) {
               int[] var5 = new int[4];
               class54.field794.method211(var5);
               class54.field794.method150(arg1, arg3, super.field1580.field8701 + arg1, super.field1580.field8708 + arg3);
               int var6 = this.field6282.method1351();
               int var7 = this.field6282.method1356();
               int var8 = this.field6278.method1351();
               int var9 = this.field6278.method1356();
               this.field6282.method1451(arg1, (-var7 + super.field1580.field8708) / 2 + arg3);
               this.field6278.method1451(-var8 + super.field1580.field8701 + arg1, (-var9 + super.field1580.field8708) / 2 + arg3);
               class54.field794.method150(arg1, arg3, arg1 - -super.field1580.field8701, this.field6283.method1356() + arg3);
               this.field6283.method1448(arg1 + var6, arg3, super.field1580.field8701 - var6 + -var8, super.field1580.field8708);
               int var10 = this.field6280.method1356();
               class54.field794.method150(arg1, super.field1580.field8708 - var10 + arg3, arg1 - -super.field1580.field8701, super.field1580.field8708 + arg3);
               this.field6280.method1448(arg1 + var6, super.field1580.field8708 + arg3 + -var10, -var6 + super.field1580.field8701 + -var8, super.field1580.field8708);
               class54.field794.method150(var5[0], var5[1], var5[2], var5[3]);
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field6287[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method988(byte arg0) {
      try {
         super.method988((byte)99);
         ++field6279;
         if (arg0 < 88) {
            method3349(-114, -111, -5);
         }

         class53 var2 = (class53)super.field1580;
         this.field6273 = class403.method3147(super.field1587, false, var2.field780);
         this.field6271 = class403.method3147(super.field1587, false, var2.field776);
         this.field6282 = class403.method3147(super.field1587, false, var2.field779);
         this.field6278 = class403.method3147(super.field1587, false, var2.field777);
         this.field6283 = class403.method3147(super.field1587, false, var2.field781);
         this.field6280 = class403.method3147(super.field1587, false, var2.field782);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6287[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "<init>",
      descriptor = "(Lsa;Lsa;Liu;)V"
   )
   public class428(class39 arg0, class39 arg1, class53 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!nr",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3348(int arg0) {
      try {
         field6275 = null;
         field6286 = null;
         field6276 = null;
         if (arg0 != 3) {
            field6281 = false;
         }

         field6277 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6287[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method984(int arg0) {
      try {
         ++field6269;
         if (!super.method984(94)) {
            return false;
         } else {
            class53 var2 = (class53)super.field1580;
            if (!super.field1587.method450(0, var2.field780)) {
               return false;
            } else if (!super.field1587.method450(0, var2.field776)) {
               return false;
            } else if (!super.field1587.method450(0, var2.field779)) {
               return false;
            } else if (!super.field1587.method450(0, var2.field777)) {
               return false;
            } else {
               if (arg0 < 67) {
                  field6272 = 97;
               }

               if (!super.field1587.method450(0, var2.field781)) {
                  return false;
               } else {
                  return super.field1587.method450(0, var2.field782);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6287[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(ZBII)V"
   )
   public final void method951(boolean arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field6284;
         int var5 = this.field6282.method1351() + arg3;
         int var6 = super.field1580.field8701 + arg3 + -this.field6278.method1351();
         int var7 = this.field6283.method1356() + arg2;
         int var8 = arg2 + super.field1580.field8708 + -this.field6280.method1356();
         int var9 = var6 - var5;
         int var10 = -var7 + var8;
         int var11 = var9 * this.method985(-80) / 10000;
         int[] var12 = new int[4];
         class54.field794.method211(var12);
         class54.field794.method150(var5, var7, var5 + var11, var8);
         this.method300(var5, (byte)104, var9, var7, var10);
         if (arg1 > 27) {
            class54.field794.method150(var5 + var11, var7, var6, var8);
            this.field6271.method1448(var5, var7, var9, var10);
            class54.field794.method150(var12[0], var12[1], var12[2], var12[3]);
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field6287[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3349(int arg0, int arg1, int arg2) {
      try {
         if (arg2 > -18) {
            return false;
         } else {
            ++field6285;
            return (arg1 & 2048) != 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6287[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(IBIII)V"
   )
   public void method300(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6270;
         if (arg1 < 101) {
            this.field6280 = null;
         }

         this.field6273.method1448(arg0, arg3, arg2, arg4);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6287[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3350(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3351(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
