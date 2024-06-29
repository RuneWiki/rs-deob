import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class426 {
   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6585 = new String[]{method3380(method3379("S9@Bc\u0011")), method3380(method3379("S9@B`\u0011"))};
   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "I"
   )
   public static int field6582 = 0;
   @OriginalMember(
      owner = "client!jia",
      name = "d",
      descriptor = "I"
   )
   public int field6580;
   @OriginalMember(
      owner = "client!jia",
      name = "e",
      descriptor = "I"
   )
   public static int field6584;
   @OriginalMember(
      owner = "client!jia",
      name = "g",
      descriptor = "Liba;"
   )
   public static class343 field6581;
   @OriginalMember(
      owner = "client!jia",
      name = "f",
      descriptor = "Lkja;"
   )
   public static class647 field6579;
   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "Lrr;"
   )
   public static class678 field6578;
   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field6583;

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public static void method3377(byte arg0) {
      try {
         field6578 = null;
         if (arg0 >= 125) {
            field6581 = null;
            field6579 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6585[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(Z)V",
      line = 18
   )
   public static final void method3378(boolean arg0) {
      boolean var1 = client.field1786;

      try {
         ++field6584;
         if (class366.field5697 != null) {
            class157[] var2 = class366.field5697;
            int var3 = 0;
            class157 var4;
            if (var1) {
               var4 = var2[var3];
               var4.method858(45);
               ++var3;
            }

            while(~var2.length < ~var3) {
               var4 = var2[var3];
               var4.method858(45);
               ++var3;
            }
         }

         if (arg0) {
            field6581 = null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6585[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3379(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3380(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
