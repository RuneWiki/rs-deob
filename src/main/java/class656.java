import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class656 {
   @OriginalMember(
      owner = "client!mh",
      name = "b",
      descriptor = "Z"
   )
   private boolean field9571 = true;
   @OriginalMember(
      owner = "client!mh",
      name = "h",
      descriptor = "I"
   )
   public int field9575 = 443;
   @OriginalMember(
      owner = "client!mh",
      name = "n",
      descriptor = "I"
   )
   public int field9580 = 43594;
   @OriginalMember(
      owner = "client!mh",
      name = "c",
      descriptor = "Z"
   )
   private boolean field9574 = false;
   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9582 = new String[]{method4825(method4824("H*\u0017r")), method4825(method4824("]qU0J")), method4825(method4824("K7U\\\u001f")), method4825(method4824("K7U_\u001f")), method4825(method4824("K7UZ\u001f")), method4825(method4824("K7U]\u001f"))};
   @OriginalMember(
      owner = "client!mh",
      name = "k",
      descriptor = "J"
   )
   public static long field9573 = 0L;
   @OriginalMember(
      owner = "client!mh",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field9578 = new int[4];
   @OriginalMember(
      owner = "client!mh",
      name = "l",
      descriptor = "I"
   )
   public static int field9577 = 0;
   @OriginalMember(
      owner = "client!mh",
      name = "d",
      descriptor = "I"
   )
   public static int field9581 = -60;
   @OriginalMember(
      owner = "client!mh",
      name = "e",
      descriptor = "Lfk;"
   )
   public static class678 field9579 = new class678();
   @OriginalMember(
      owner = "client!mh",
      name = "i",
      descriptor = "I"
   )
   public static int field9568;
   @OriginalMember(
      owner = "client!mh",
      name = "f",
      descriptor = "I"
   )
   public int field9569;
   @OriginalMember(
      owner = "client!mh",
      name = "j",
      descriptor = "I"
   )
   public static int field9572;
   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "I"
   )
   public static int field9576;
   @OriginalMember(
      owner = "client!mh",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field9570;

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4820(boolean arg0) {
      try {
         if (arg0) {
            method4820(true);
         }

         field9578 = null;
         field9579 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9582[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(Loo;B)Leca;"
   )
   public final class789 method4821(class651 arg0, byte arg1) {
      try {
         ++field9568;
         if (arg1 < 55) {
            field9581 = -72;
         }

         return arg0.method4790(this.field9574, (byte)-68, this.field9570, !this.field9571 ? this.field9580 : this.field9575);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9582[4] + (arg0 != null ? field9582[1] : field9582[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4822(int arg0) {
      boolean var2 = client.field4564;

      try {
         label28: {
            if (this.field9571) {
               if (!this.field9574) {
                  this.field9571 = false;
                  if (!var2) {
                     break label28;
                  }
               }

               this.field9574 = false;
               if (!var2) {
                  break label28;
               }
            }

            this.field9574 = true;
            this.field9571 = true;
         }

         if (arg0 != 43594) {
            this.method4823(117, (class656)null);
         }

         ++field9572;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9582[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(ILmh;)Z"
   )
   public final boolean method4823(int arg0, class656 arg1) {
      try {
         ++field9576;
         if (arg0 != 43594) {
            method4820(true);
         }

         if (arg1 == null) {
            return false;
         } else {
            return this.field9569 == arg1.field9569 && this.field9570.equals(arg1.field9570);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9582[2] + arg0 + ',' + (arg1 != null ? field9582[1] : field9582[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4824(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4825(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
