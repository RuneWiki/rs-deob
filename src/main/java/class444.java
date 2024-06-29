import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class444 {
   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6475 = new String[]{method3342(method3341("z|cjG")), method3342(method3341("z|ciG"))};
   @OriginalMember(
      owner = "client!ad",
      name = "d",
      descriptor = "B"
   )
   public byte field6472;
   @OriginalMember(
      owner = "client!ad",
      name = "f",
      descriptor = "I"
   )
   public int field6471;
   @OriginalMember(
      owner = "client!ad",
      name = "g",
      descriptor = "I"
   )
   public static int field6474;
   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "Lhw;"
   )
   public static class141 field6469;
   @OriginalMember(
      owner = "client!ad",
      name = "c",
      descriptor = "Lika;"
   )
   public static class445 field6468;
   @OriginalMember(
      owner = "client!ad",
      name = "e",
      descriptor = "Lha;"
   )
   public static class65 field6473;
   @OriginalMember(
      owner = "client!ad",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field6470;

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3339(boolean arg0) {
      try {
         field6468 = null;
         if (arg0) {
            method3339(true);
         }

         field6473 = null;
         field6469 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6475[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method3340(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field6474;
         class399 var2 = (class399)class298.field4166.method2579(-801);
         if (arg0 < 96) {
            method3339(true);
         }

         if (var2 == null) {
            return false;
         } else {
            int var3 = 0;
            if (var1) {
               if (var2.field5873[var3] != null && var2.field5873[var3].field11542 == 0) {
                  return false;
               }

               if (var2.field5865[var3] != null) {
                  if (var2.field5865[var3].field11542 == 0) {
                     return false;
                  }

                  ++var3;
               } else {
                  ++var3;
               }
            }

            while(true) {
               while(~var2.field5868 < ~var3) {
                  if (var2.field5873[var3] != null && var2.field5873[var3].field11542 == 0) {
                     return false;
                  }

                  if (var2.field5865[var3] != null) {
                     if (var2.field5865[var3].field11542 == 0) {
                        return false;
                     }

                     ++var3;
                  } else {
                     ++var3;
                  }
               }

               if (!var1) {
                  return true;
               }

               if (false) {
                  return false;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6475[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3341(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3342(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
