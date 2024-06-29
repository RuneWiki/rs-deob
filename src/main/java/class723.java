import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public abstract class class723 {
   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10575 = new String[]{method5247(method5246("tM(\u001d\u00134")), method5247(method5246("tM(\u001d\u00104")), method5247(method5246("tM(\u001d\u00114"))};
   @OriginalMember(
      owner = "client!hba",
      name = "c",
      descriptor = "Llja;"
   )
   public static class728 field10572 = new class728();
   @OriginalMember(
      owner = "client!hba",
      name = "e",
      descriptor = "I"
   )
   public static int field10568;
   @OriginalMember(
      owner = "client!hba",
      name = "b",
      descriptor = "I"
   )
   public static int field10571;
   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "I"
   )
   public int field10574;
   @OriginalMember(
      owner = "client!hba",
      name = "g",
      descriptor = "J"
   )
   public static long field10573;
   @OriginalMember(
      owner = "client!hba",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field10569;
   @OriginalMember(
      owner = "client!hba",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field10570;

   @OriginalMember(
      owner = "client!hba",
      name = "b",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public final Socket method5243(int arg0) throws IOException {
      try {
         ++field10568;
         int var2 = -92 / ((arg0 - -44) / 52);
         return new Socket(this.field10569, this.field10574);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10575[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(Z)Ljava/net/Socket;"
   )
   public abstract Socket method3794(boolean arg0) throws IOException;

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5244(int arg0) {
      try {
         field10572 = null;
         if (arg0 != 3670) {
            method5245(3, 48);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10575[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(II)Lfea;"
   )
   public static final class681 method5245(int arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field10571;
         class681[] var3 = class651.method4784(arg1 + 48);
         int var4 = arg1;
         if (var2) {
            if (var3[arg1].field10025 == arg0) {
               return var3[arg1];
            }

            var4 = arg1 + 1;
         }

         while(true) {
            while(~var3.length < ~var4) {
               if (var3[var4].field10025 == arg0) {
                  return var3[var4];
               }

               ++var4;
            }

            if (!var2) {
               return null;
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10575[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5246(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5247(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
