import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class534 {
   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7833 = method4061(method4060("\u001dh\u0018li"));
   @OriginalMember(
      owner = "client!tc",
      name = "b",
      descriptor = "F"
   )
   public static float field7832;
   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "I"
   )
   public static int field7831;

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4059(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field7831;
         if (class207.field2630 != null) {
            int var2 = 0;
            if (var1) {
               class207.field2630[var2] = null;
               ++var2;
            }

            while(true) {
               while(class484.field6739 > var2) {
                  class207.field2630[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class207.field2630 = null;
                  break;
               }

               ++var2;
            }
         }

         if (class541.field7917 != null) {
            int var3 = 0;
            if (var1) {
               class541.field7917[var3] = null;
               ++var3;
            }

            while(true) {
               while(~class347.field4754 < ~var3) {
                  class541.field7917[var3] = null;
                  ++var3;
               }

               if (!var1) {
                  class541.field7917 = null;
                  break;
               }

               ++var3;
            }
         }

         if (class37.field532 != null) {
            int var4 = 0;
            if (var1) {
               class37.field532[var4] = null;
               ++var4;
            }

            while(true) {
               while(class367.field5120 > var4) {
                  class37.field532[var4] = null;
                  ++var4;
               }

               if (!var1) {
                  class37.field532 = null;
                  break;
               }

               ++var4;
            }
         }

         class46.field586 = null;
         class362.field5024 = -1;
         class277.field3541 = -1;
         class379.field5274 = null;
         class566.field8330 = null;
         if (arg0 != 0) {
            field7832 = 1.257459F;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7833 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4060(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4061(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
