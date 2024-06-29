import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class503 {
   @OriginalMember(
      owner = "client!tt",
      name = "d",
      descriptor = "I"
   )
   public int field7172 = 0;
   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7175 = new String[]{method3803(method3802("\f\u0016VD\u001d")), method3803(method3802("\f\u0016VF\u001d")), method3803(method3802("\u0016\u0017\u0014i")), method3803(method3802("\u0003LV+H")), method3803(method3802("\f\u0016VG\u001d")), method3803(method3802("\f\u0016VA\u001d"))};
   @OriginalMember(
      owner = "client!tt",
      name = "b",
      descriptor = "I"
   )
   public static int field7170;
   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "I"
   )
   public static int field7171;
   @OriginalMember(
      owner = "client!tt",
      name = "e",
      descriptor = "I"
   )
   public static int field7173;
   @OriginalMember(
      owner = "client!tt",
      name = "c",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field7174;

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3798(byte arg0) {
      try {
         if (arg0 != -95) {
            field7174 = null;
         }

         field7174 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7175[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method3799(int arg0, String arg1) {
      try {
         if (arg0 != 0) {
            field7174 = null;
         }

         System.exit(1);
         ++field7173;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7175[5] + arg0 + ',' + (arg1 != null ? field7175[3] : field7175[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(ILcu;B)V"
   )
   private final void method3800(int arg0, class65 arg1, byte arg2) {
      try {
         ++field7170;
         if (~arg0 == -6) {
            this.field7172 = arg1.method685(-2);
         }

         if (arg2 != -111) {
            field7174 = null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7175[1] + arg0 + ',' + (arg1 != null ? field7175[3] : field7175[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   public final void method3801(int arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 != 0) {
            this.field7172 = -102;
         }

         while(true) {
            int var4 = arg1.method665(false);
            if (var4 != 0) {
               this.method3800(var4, arg1, (byte)-111);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field7171;
            break;
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7175[4] + arg0 + ',' + (arg1 != null ? field7175[3] : field7175[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3802(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3803(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
