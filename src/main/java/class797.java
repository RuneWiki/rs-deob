import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class797 extends class96 {
   @OriginalMember(
      owner = "client!lj",
      name = "A",
      descriptor = "I"
   )
   private int field11587;
   @OriginalMember(
      owner = "client!lj",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11595 = new String[]{method5748(method5747("Oowx8")), method5748(method5747("Oow\u007f8")), method5748(method5747("Oowy8")), method5748(method5747("Oow\u0000yMl-\u00028")), method5748(method5747("Oow}8")), method5748(method5747("Oow~8"))};
   @OriginalMember(
      owner = "client!lj",
      name = "v",
      descriptor = "F"
   )
   public static float field11590 = 0.25F;
   @OriginalMember(
      owner = "client!lj",
      name = "q",
      descriptor = "Lhha;"
   )
   public static class724 field11585 = new class724(99, 0);
   @OriginalMember(
      owner = "client!lj",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field11594 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "I"
   )
   public static int field11584;
   @OriginalMember(
      owner = "client!lj",
      name = "s",
      descriptor = "I"
   )
   public static int field11586;
   @OriginalMember(
      owner = "client!lj",
      name = "w",
      descriptor = "I"
   )
   public static int field11589;
   @OriginalMember(
      owner = "client!lj",
      name = "y",
      descriptor = "I"
   )
   public static int field11592;
   @OriginalMember(
      owner = "client!lj",
      name = "r",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field11593;
   @OriginalMember(
      owner = "client!lj",
      name = "u",
      descriptor = "[Lcka;"
   )
   public class514[] field11588;
   @OriginalMember(
      owner = "client!lj",
      name = "x",
      descriptor = "[[B"
   )
   private byte[][] field11591;

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public final boolean method5742(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            this.field11588 = null;
         }

         ++field11586;
         return this.field11588[arg1].field7290;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11595[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method5743(int arg0, int arg1) {
      try {
         ++field11592;
         if (arg1 < 16) {
            this.field11587 = 36;
         }

         return this.field11588[arg0].field7301;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11595[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5744(byte arg0) {
      try {
         field11593 = null;
         if (arg0 != 107) {
            field11590 = 0.71907073F;
         }

         field11594 = null;
         field11585 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11595[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(IB)Z"
   )
   public final boolean method5745(int arg0, byte arg1) {
      try {
         ++field11589;
         int var3 = 83 % ((49 - arg1) / 48);
         return this.field11588[arg0].field7293;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11595[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method5746(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lj",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class797(int arg0) {
      try {
         this.field11587 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11595[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5747(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5748(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
