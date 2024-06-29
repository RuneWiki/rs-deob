import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class779 {
   @OriginalMember(
      owner = "client!wga",
      name = "l",
      descriptor = "Ldl;"
   )
   private class70 field11367 = new class70();
   @OriginalMember(
      owner = "client!wga",
      name = "f",
      descriptor = "Ljca;"
   )
   private class712 field11376 = new class712();
   @OriginalMember(
      owner = "client!wga",
      name = "b",
      descriptor = "I"
   )
   private int field11377;
   @OriginalMember(
      owner = "client!wga",
      name = "k",
      descriptor = "I"
   )
   private int field11375;
   @OriginalMember(
      owner = "client!wga",
      name = "g",
      descriptor = "Lwia;"
   )
   private class791 field11374;
   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11378 = new String[]{method5613(method5612(">\tey/ \u0000m#-a")), method5613(method5612(">\teyVa")), method5613(method5612("'\u001bh;")), method5613(method5612(">\teyQa")), method5613(method5612("2@*yn")), method5613(method5612(">\teyPa")), method5613(method5612(">\teyRa")), method5613(method5612(">\teyWa"))};
   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field11368 = new int[13];
   @OriginalMember(
      owner = "client!wga",
      name = "j",
      descriptor = "I"
   )
   public static int field11370 = 0;
   @OriginalMember(
      owner = "client!wga",
      name = "c",
      descriptor = "I"
   )
   public static int field11373 = 0;
   @OriginalMember(
      owner = "client!wga",
      name = "e",
      descriptor = "I"
   )
   public static int field11366;
   @OriginalMember(
      owner = "client!wga",
      name = "d",
      descriptor = "I"
   )
   public static int field11369;
   @OriginalMember(
      owner = "client!wga",
      name = "i",
      descriptor = "I"
   )
   public static int field11371;
   @OriginalMember(
      owner = "client!wga",
      name = "h",
      descriptor = "I"
   )
   public static int field11372;

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(BJ)Ldl;",
      line = 18
   )
   public final class70 method5607(byte arg0, long arg1) {
      try {
         if (arg0 < 58) {
            method5611((byte)-103);
         }

         ++field11369;
         class70 var4 = (class70)this.field11374.method5681(arg1, -1);
         if (var4 != null) {
            this.field11376.method5164(var4, (byte)-105);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11378[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(I)V",
      line = 43
   )
   public final void method5608(int arg0) {
      try {
         this.field11376.method5162((byte)83);
         if (arg0 != 0) {
            this.field11367 = null;
         }

         ++field11366;
         this.field11374.method5680(true);
         this.field11367 = new class70();
         this.field11375 = this.field11377;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11378[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(JB)V",
      line = 60
   )
   public final void method5609(long arg0, byte arg1) {
      try {
         ++field11372;
         class70 var4 = (class70)this.field11374.method5681(arg0, -1);
         if (var4 != null) {
            var4.method2720(0);
            var4.method699(12);
            ++this.field11375;
         }

         if (arg1 != 32) {
            field11370 = -128;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11378[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(IJLdl;)V",
      line = 93
   )
   public final void method5610(int arg0, long arg1, class70 arg2) {
      try {
         if (arg0 == 0) {
            label28: {
               ++field11371;
               if (~this.field11375 == -1) {
                  class70 var5 = this.field11376.method5161(arg0);
                  var5.method2720(0);
                  var5.method699(12);
                  if (this.field11367 != var5) {
                     break label28;
                  }

                  class70 var6 = this.field11376.method5161(0);
                  var6.method2720(arg0);
                  var6.method699(12);
                  if (client.field4530 == 0) {
                     break label28;
                  }
               }

               --this.field11375;
            }

            this.field11374.method5682(arg1, arg2, (byte)7);
            this.field11376.method5164(arg2, (byte)-105);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11378[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11378[4] : field11378[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(B)V",
      line = 125
   )
   public static void method5611(byte arg0) {
      try {
         int var1 = -120 / ((arg0 - 64) / 35);
         field11368 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11378[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "<init>",
      descriptor = "(I)V",
      line = 147
   )
   public class779(int arg0) {
      try {
         this.field11377 = arg0;
         this.field11375 = arg0;

         int var2;
         for(var2 = 1; ~(var2 - -var2) > ~arg0; var2 += var2) {
         }

         this.field11374 = new class791(var2);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11378[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5612(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5613(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
