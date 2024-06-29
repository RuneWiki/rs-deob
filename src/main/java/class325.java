import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class325 {
   @OriginalMember(
      owner = "client!qja",
      name = "g",
      descriptor = "Ldw;"
   )
   private class748 field4620 = new class748(64);
   @OriginalMember(
      owner = "client!qja",
      name = "d",
      descriptor = "Leaa;"
   )
   private class526 field4625;
   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4626 = new String[]{method2460(method2459("\u001b~=RIB")), method2460(method2459("\u001b~=RHB")), method2460(method2459("\u001b~=RNB")), method2460(method2459("\u001b~=ROB")), method2460(method2459("\u001b~=RLB")), method2460(method2459("\u0011:rRp")), method2460(method2459("\u0004a0\u0010")), method2460(method2459("\u001b~=R1\u0003z5\b3B")), method2460(method2459("\u001b~=RKB"))};
   @OriginalMember(
      owner = "client!qja",
      name = "e",
      descriptor = "Lcs;"
   )
   public static class358 field4618 = new class358();
   @OriginalMember(
      owner = "client!qja",
      name = "h",
      descriptor = "I"
   )
   public static int field4619;
   @OriginalMember(
      owner = "client!qja",
      name = "f",
      descriptor = "I"
   )
   public static int field4621;
   @OriginalMember(
      owner = "client!qja",
      name = "c",
      descriptor = "I"
   )
   public static int field4622;
   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "I"
   )
   public static int field4623;
   @OriginalMember(
      owner = "client!qja",
      name = "b",
      descriptor = "I"
   )
   public static int field4624;

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2453(byte arg0) {
      try {
         int var1 = -64 / ((-1 - arg0) / 49);
         field4618 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4626[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2454(int arg0) {
      try {
         class748 var2 = this.field4620;
         synchronized(this.field4620) {
            this.field4620.method5445(697465426);
            if (arg0 != -4377) {
               this.method2457(-79, -123);
            }
         }

         ++field4619;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4626[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2455(byte arg0) {
      try {
         class748 var2 = this.field4620;
         synchronized(this.field4620) {
            this.field4620.method5451(-120);
         }

         ++field4623;
         if (arg0 <= 74) {
            this.field4620 = null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4626[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(IB)Loea;"
   )
   public final class622 method2456(int arg0, byte arg1) {
      try {
         ++field4622;
         class748 var3 = this.field4620;
         class622 var4;
         synchronized(this.field4620) {
            var4 = (class622)this.field4620.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else if (arg1 != 9) {
            return null;
         } else {
            class526 var5 = this.field4625;
            byte[] var6;
            synchronized(this.field4625) {
               var6 = this.field4625.method3899(-61, arg0, 54);
            }

            class622 var7 = new class622();
            if (var6 != null) {
               var7.method4492(false, new class128(var6));
            }

            class748 var8 = this.field4620;
            synchronized(this.field4620) {
               this.field4620.method5455(-2049, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field4626[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2457(int arg0, int arg1) {
      try {
         class748 var3 = this.field4620;
         synchronized(this.field4620) {
            this.field4620.method5453(arg0, false);
            int var4 = -101 % ((66 - arg1) / 54);
         }

         ++field4621;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4626[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method2458(int arg0) {
      try {
         ++field4624;
         if (arg0 != 29461) {
            return -109;
         } else {
            return class4.field85 == 1 ? class706.field10569 : 0;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4626[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V"
   )
   public class325(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field4625 = arg2;
         if (this.field4625 != null) {
            this.field4625.method3875(0, 54);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4626[7] + (arg0 != null ? field4626[5] : field4626[6]) + ',' + arg1 + ',' + (arg2 != null ? field4626[5] : field4626[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2459(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2460(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
