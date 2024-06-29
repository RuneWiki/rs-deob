import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class671 extends class247 {
   @OriginalMember(
      owner = "client!iq",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   public String field9416;
   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9419 = new String[]{method4868(method4867("\u0003Lz\u001cC")), method4868(method4867("\u0003Lz\u0018C")), method4868(method4867("\u0011\u0013zs\u0016")), method4868(method4867("\u0004H81")), method4868(method4867("\u0003Lza\u0002\u0004T cC")), method4868(method4867("\u0003Lz\u001eC")), method4868(method4867("\u0003Lz\u0019C")), method4868(method4867("\u0003Lz\u001fC"))};
   @OriginalMember(
      owner = "client!iq",
      name = "l",
      descriptor = "Lhha;"
   )
   public static class724 field9417 = new class724(44, 6);
   @OriginalMember(
      owner = "client!iq",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field9418 = new int[500];
   @OriginalMember(
      owner = "client!iq",
      name = "r",
      descriptor = "I"
   )
   public static int field9410;
   @OriginalMember(
      owner = "client!iq",
      name = "o",
      descriptor = "I"
   )
   public static int field9411;
   @OriginalMember(
      owner = "client!iq",
      name = "j",
      descriptor = "I"
   )
   public static int field9412;
   @OriginalMember(
      owner = "client!iq",
      name = "k",
      descriptor = "I"
   )
   public static int field9413;
   @OriginalMember(
      owner = "client!iq",
      name = "n",
      descriptor = "I"
   )
   public static int field9414;
   @OriginalMember(
      owner = "client!iq",
      name = "p",
      descriptor = "J"
   )
   public static long field9415;

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4862(byte arg0) {
      try {
         if (arg0 != -94) {
            method4865((byte)1);
         }

         ++field9414;
         class366.field5423.method1052(true);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9419[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4863(int arg0) throws class37 {
      try {
         if (arg0 == -29289) {
            label19: {
               if (class217.field3113 == 1) {
                  class712.field10231.method182(class235.field3639, class519.field7320);
                  if (!client.field10022) {
                     break label19;
                  }
               }

               class712.field10231.method182(0, 0);
            }

            ++field9412;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9419[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method4864(int arg0, byte arg1) {
      try {
         ++field9410;
         class319.field4772 = arg0;
         class465.field6756.method1052(true);
         if (arg1 > -9) {
            method4862((byte)22);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9419[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4865(byte arg0) {
      try {
         if (arg0 != -9) {
            method4862((byte)29);
         }

         field9418 = null;
         field9417 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9419[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "<init>",
      descriptor = "()V"
   )
   public class671() {
   }

   @OriginalMember(
      owner = "client!iq",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class671(String arg0, int arg1) {
      try {
         this.field9416 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9419[4] + (arg0 != null ? field9419[2] : field9419[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4866(int arg0, int arg1) {
      try {
         class501.field7146 = -1;
         class460.field6701 = arg1;
         class287.field4295 = arg0;
         ++field9413;
         class746.field10608 = 100;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9419[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4867(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4868(char[] arg0) {
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
            var10005 = 61;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
