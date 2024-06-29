import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class365 {
   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "I"
   )
   public int field5154;
   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5157 = new String[]{method2829(method2828("\"S\u0018\u007ffk")), method2829(method2828("\"S\u0018\u007fek")), method2829(method2828("\"S\u0018\u007fS,f\r#N-RQ")), method2829(method2828("\"S\u0018\u007f\u001b*[\u0010%\u0019k"))};
   @OriginalMember(
      owner = "client!afa",
      name = "d",
      descriptor = "I"
   )
   public static int field5152;
   @OriginalMember(
      owner = "client!afa",
      name = "b",
      descriptor = "I"
   )
   public static int field5153;
   @OriginalMember(
      owner = "client!afa",
      name = "c",
      descriptor = "I"
   )
   public static int field5155;
   @OriginalMember(
      owner = "client!afa",
      name = "e",
      descriptor = "I"
   )
   public static int field5156;

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(BC)Z"
   )
   public static final boolean method2826(byte arg0, char arg1) {
      try {
         if (arg0 != -49) {
            method2827(-47, false);
         }

         ++field5156;
         return ~arg1 <= -49 && arg1 <= '9' || arg1 >= 'A' && ~arg1 >= -91 || arg1 >= 'a' && ~arg1 >= -123;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5157[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method2827(int arg0, boolean arg1) {
      try {
         if (arg1) {
            label22: {
               if (~class619.field8658 == -2) {
                  class369.field5190 = arg0;
                  if (!client.field4273) {
                     break label22;
                  }
               }

               if (class619.field8658 == 2) {
                  class654.field9151 = arg0;
               }
            }

            ++field5155;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5157[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field5153;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5157[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class365(int arg0, int arg1) {
      try {
         this.field5154 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5157[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2828(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2829(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
