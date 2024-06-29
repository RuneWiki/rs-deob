import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class674 {
   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9772 = new String[]{method4901(method4900("\u007fK,/s9")), method4901(method4900("\u007fW!m")), method4901(method4900("j\fc/O")), method4901(method4900("\u007fK,/q9")), method4901(method4900("\u007fK,/p9"))};
   @OriginalMember(
      owner = "client!nia",
      name = "m",
      descriptor = "I"
   )
   public int field9757;
   @OriginalMember(
      owner = "client!nia",
      name = "k",
      descriptor = "I"
   )
   public int field9758;
   @OriginalMember(
      owner = "client!nia",
      name = "e",
      descriptor = "I"
   )
   public int field9759;
   @OriginalMember(
      owner = "client!nia",
      name = "o",
      descriptor = "I"
   )
   public int field9760;
   @OriginalMember(
      owner = "client!nia",
      name = "g",
      descriptor = "I"
   )
   public int field9761;
   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "I"
   )
   public int field9762;
   @OriginalMember(
      owner = "client!nia",
      name = "j",
      descriptor = "I"
   )
   public int field9763;
   @OriginalMember(
      owner = "client!nia",
      name = "c",
      descriptor = "I"
   )
   public static int field9764;
   @OriginalMember(
      owner = "client!nia",
      name = "f",
      descriptor = "I"
   )
   public static int field9765;
   @OriginalMember(
      owner = "client!nia",
      name = "d",
      descriptor = "I"
   )
   public int field9766;
   @OriginalMember(
      owner = "client!nia",
      name = "l",
      descriptor = "I"
   )
   public static int field9767;
   @OriginalMember(
      owner = "client!nia",
      name = "b",
      descriptor = "I"
   )
   public int field9768;
   @OriginalMember(
      owner = "client!nia",
      name = "n",
      descriptor = "I"
   )
   public int field9769;
   @OriginalMember(
      owner = "client!nia",
      name = "h",
      descriptor = "I"
   )
   public int field9770;
   @OriginalMember(
      owner = "client!nia",
      name = "i",
      descriptor = "I"
   )
   public int field9771;

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(BLnia;)Z",
      line = 3
   )
   public final boolean method4897(byte arg0, class674 arg1) {
      try {
         if (arg0 >= -96) {
            this.field9762 = 100;
         }

         ++field9764;
         return this.field9766 == arg1.field9766 && this.field9763 == arg1.field9763 && ~this.field9762 == ~arg1.field9762;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9772[3] + arg0 + ',' + (arg1 != null ? field9772[2] : field9772[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(IILrw;FIFIFFIF)[B",
      line = 26
   )
   public static final byte[] method4898(int arg0, int arg1, class791 arg2, float arg3, int arg4, float arg5, int arg6, float arg7, float arg8, int arg9, float arg10) {
      try {
         ++field9765;
         byte[] var11 = new byte[arg6 * arg9 * arg4];
         if (arg1 <= 107) {
            return null;
         } else {
            class559.method4008(arg0, 0, 0, arg2, arg5, var11, arg10, arg4, arg3, arg7, arg9, arg8, arg6);
            return var11;
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field9772[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9772[2] : field9772[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(Lkf;Lefa;Lkf;Lkf;Lfs;I)Z",
      line = 45
   )
   public static final boolean method4899(class266 arg0, class197 arg1, class266 arg2, class266 arg3, class582 arg4, int arg5) {
      boolean var6 = client.field4360;

      try {
         class270.field3737 = arg4;
         class17.field196 = arg0;
         class738.field10771 = arg2;
         class3.field19 = arg1;
         ++field9767;
         class325.field4408 = arg3;
         class352.field4733 = new int[16];
         int var7 = 0;
         if (arg5 != -17) {
            return false;
         } else {
            while(true) {
               if (~var7 <= -17) {
                  if (!var6) {
                     return true;
                  }
               } else {
                  class352.field4733[var7] = 255;
               }

               ++var7;
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field9772[4] + (arg0 != null ? field9772[2] : field9772[1]) + ',' + (arg1 != null ? field9772[2] : field9772[1]) + ',' + (arg2 != null ? field9772[2] : field9772[1]) + ',' + (arg3 != null ? field9772[2] : field9772[1]) + ',' + (arg4 != null ? field9772[2] : field9772[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4900(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4901(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
