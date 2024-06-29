import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class372 {
   @OriginalMember(
      owner = "client!po",
      name = "i",
      descriptor = "Loe;"
   )
   private class15 field5205 = new class15();
   @OriginalMember(
      owner = "client!po",
      name = "m",
      descriptor = "Llja;"
   )
   private class728 field5213 = new class728();
   @OriginalMember(
      owner = "client!po",
      name = "g",
      descriptor = "I"
   )
   private int field5211;
   @OriginalMember(
      owner = "client!po",
      name = "l",
      descriptor = "I"
   )
   private int field5215;
   @OriginalMember(
      owner = "client!po",
      name = "e",
      descriptor = "Lhv;"
   )
   private class227 field5214;
   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5219 = new String[]{method2950(method2949("E=\u0015#\b")), method2950(method2949("N|\u0015H]")), method2950(method2949("PfWa")), method2950(method2949("N|\u0015N]")), method2950(method2949("N|\u0015O]")), method2950(method2949("N|\u00151\u001cPzO3]")), method2950(method2949("N|\u0015L]")), method2950(method2949("N|\u0015I]"))};
   @OriginalMember(
      owner = "client!po",
      name = "h",
      descriptor = "[Lqn;"
   )
   public static class532[] field5210 = new class532[37];
   @OriginalMember(
      owner = "client!po",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field5212 = new int[1000];
   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "Laka;"
   )
   public static class418 field5204 = new class418(94, 1);
   @OriginalMember(
      owner = "client!po",
      name = "c",
      descriptor = "Laka;"
   )
   public static class418 field5218 = new class418(35, -1);
   @OriginalMember(
      owner = "client!po",
      name = "j",
      descriptor = "D"
   )
   public static double field5203;
   @OriginalMember(
      owner = "client!po",
      name = "p",
      descriptor = "I"
   )
   public static int field5206;
   @OriginalMember(
      owner = "client!po",
      name = "n",
      descriptor = "I"
   )
   public static int field5207;
   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "I"
   )
   public static int field5208;
   @OriginalMember(
      owner = "client!po",
      name = "f",
      descriptor = "I"
   )
   public static int field5209;
   @OriginalMember(
      owner = "client!po",
      name = "k",
      descriptor = "Ljo;"
   )
   public static class376 field5216;
   @OriginalMember(
      owner = "client!po",
      name = "d",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field5217;

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2944(int arg0) {
      try {
         field5217 = null;
         field5210 = null;
         field5204 = null;
         if (arg0 != -91) {
            field5210 = null;
         }

         field5212 = null;
         field5218 = null;
         field5216 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5219[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(ZJ)V"
   )
   public final void method2945(boolean arg0, long arg1) {
      try {
         ++field5207;
         class15 var4 = (class15)this.field5214.method1818(-1, arg1);
         if (var4 != null) {
            var4.method4924(-2970);
            var4.method125(13582);
            ++this.field5211;
         }

         if (!arg0) {
            field5217 = null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5219[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(Loe;ZJ)V"
   )
   public final void method2946(class15 arg0, boolean arg1, long arg2) {
      try {
         label29: {
            ++field5208;
            if (this.field5211 != 0) {
               --this.field5211;
               if (!client.field1481) {
                  break label29;
               }
            }

            class15 var5 = this.field5213.method5262(arg1);
            var5.method4924(-2970);
            var5.method125(13582);
            if (this.field5205 == var5) {
               class15 var6 = this.field5213.method5262(true);
               var6.method4924(-2970);
               var6.method125(13582);
            }
         }

         this.field5214.method1808(arg2, arg0, 26459);
         if (!arg1) {
            this.method2947(124L, 13);
         }

         this.field5213.method5267((byte)125, arg0);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5219[1] + (arg0 != null ? field5219[0] : field5219[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(JI)Loe;"
   )
   public final class15 method2947(long arg0, int arg1) {
      try {
         ++field5206;
         if (arg1 != 28581) {
            this.method2946((class15)null, false, -24L);
         }

         class15 var4 = (class15)this.field5214.method1818(-1, arg0);
         if (var4 != null) {
            this.field5213.method5267((byte)110, var4);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5219[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2948(int arg0) {
      try {
         ++field5209;
         this.field5213.method5264(-127);
         if (arg0 != -9206) {
            field5203 = -1.6104300545284354D;
         }

         this.field5214.method1809(true);
         this.field5205 = new class15();
         this.field5211 = this.field5215;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5219[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class372(int arg0) {
      try {
         this.field5211 = arg0;
         this.field5215 = arg0;

         int var2;
         for(var2 = 1; arg0 > var2 + var2; var2 += var2) {
         }

         this.field5214 = new class227(var2);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5219[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2949(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2950(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
