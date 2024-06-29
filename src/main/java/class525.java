import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class525 extends class80 {
   @OriginalMember(
      owner = "client!mi",
      name = "x",
      descriptor = "S"
   )
   public short field7186;
   @OriginalMember(
      owner = "client!mi",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7190 = new String[]{method3795(method3794("_E\u0013AU\u0016\u000fNT\u0016_E")), method3795(method3794("\u001c\u001dRH")), method3795(method3794("\u001f\u0001\u0010c\u0013")), method3795(method3794("R\u0018MMA\u0017R")), method3795(method3794("\tF\u0010\nF")), method3795(method3794("\u0015\u0018W\u0015\u001b\u0002\u0007M\u001e")), method3795(method3794("\u001f\u0001\u0010g\u0013")), method3795(method3794("\u001f\u0001\u0010azZ")), method3795(method3794("\u001f\u0001\u0010gzZ")), method3795(method3794("\u001f\u0001\u0010\u0018R\u001c\u0001J\u001a\u0013")), method3795(method3794("\u001f\u0001\u0010fzZ"))};
   @OriginalMember(
      owner = "client!mi",
      name = "w",
      descriptor = "Lkda;"
   )
   public static class411 field7188 = new class411();
   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "F"
   )
   public static float field7189;
   @OriginalMember(
      owner = "client!mi",
      name = "C",
      descriptor = "I"
   )
   public static int field7183;
   @OriginalMember(
      owner = "client!mi",
      name = "v",
      descriptor = "I"
   )
   public static int field7184;
   @OriginalMember(
      owner = "client!mi",
      name = "y",
      descriptor = "I"
   )
   public static int field7185;
   @OriginalMember(
      owner = "client!mi",
      name = "A",
      descriptor = "I"
   )
   public static int field7187;

   @OriginalMember(
      owner = "client!mi",
      name = "j",
      descriptor = "(I)V"
   )
   public static void method3791(int arg0) {
      try {
         if (arg0 < 32) {
            field7189 = -1.5086491F;
         }

         field7188 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7190[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)V"
   )
   public static final void method3792(int arg0, int arg1, int arg2, Class arg3) {
      class225 var4 = class111.field1404[arg0][arg1][arg2];
      if (var4 != null) {
         for(class752 var5 = var4.field2821; var5 != null; var5 = var5.field10923) {
            class47 var6 = var5.field10922;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field547 == arg1 && var6.field540 == arg2) {
               class367.method2835(var6, false);
               return;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "b",
      descriptor = "(ZLha;)Z"
   )
   public final boolean method402(boolean arg0, class65 arg1) {
      try {
         ++field7185;
         if (!arg0) {
            field7189 = -0.6823248F;
         }

         return class486.method3534(super.field999 >> class76.field965, super.field1003 >> class76.field965, -17319, super.field1005);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7190[7] + arg0 + ',' + (arg1 != null ? field7190[4] : field7190[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "([Loda;I)I"
   )
   public final int method401(class127[] arg0, int arg1) {
      try {
         if (arg1 != 1) {
            return -80;
         } else {
            ++field7183;
            return this.method781(arg0, super.field999 >> class76.field965, (byte)-88, super.field1003 >> class76.field965);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7190[8] + (arg0 != null ? field7190[4] : field7190[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(IILme;)V"
   )
   public static final void method3793(int arg0, int arg1, class206 arg2) {
      try {
         class359.field5117 = false;
         class173.field2159 = 0;
         if (arg1 > -1) {
            method3793(104, 32, (class206)null);
         }

         ++field7184;
         class581.method4177(0, arg2);
         class8.method64(arg2, 1);
         if (class359.field5117) {
            System.out.println(field7190[0]);
         }

         if (arg2.field8243 != arg0) {
            throw new RuntimeException(field7190[5] + arg2.field8243 + field7190[3] + arg0);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7190[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7190[4] : field7190[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field1003 = arg2;
         super.field999 = arg0;
         super.field1001 = (byte)arg3;
         super.field1005 = (byte)arg4;
         super.field998 = arg1;
         this.field7186 = (short)arg5;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field7190[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method397(int arg0) {
      try {
         ++field7187;
         if (arg0 != 0) {
            this.field7186 = -8;
         }

         return class426.field5961[(super.field999 >> class76.field965) + (-class367.field5174 - -class224.field2812)][(super.field1003 >> class76.field965) + -class406.field5720 + class224.field2812];
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7190[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3794(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3795(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
