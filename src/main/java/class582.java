import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class582 {
   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8185 = new String[]{method4284(method4283("9\u0007n/\u0014z")), method4284(method4283("9\u0007n/\u0012z")), method4284(method4283(")N!/-")), method4284(method4283("9\u0007n/\u0011z")), method4284(method4283("<\u0015cm")), method4284(method4283("9\u0007n/\u0013z"))};
   @OriginalMember(
      owner = "client!kga",
      name = "g",
      descriptor = "I"
   )
   public static int field8174 = 7000;
   @OriginalMember(
      owner = "client!kga",
      name = "j",
      descriptor = "I"
   )
   public static int field8178 = field8174;
   @OriginalMember(
      owner = "client!kga",
      name = "e",
      descriptor = "Lmj;"
   )
   public static class730 field8179 = new class730();
   @OriginalMember(
      owner = "client!kga",
      name = "b",
      descriptor = "Lhha;"
   )
   public static class724 field8182 = new class724(15, 4);
   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "C"
   )
   public char field8173;
   @OriginalMember(
      owner = "client!kga",
      name = "f",
      descriptor = "I"
   )
   public static int field8172;
   @OriginalMember(
      owner = "client!kga",
      name = "i",
      descriptor = "I"
   )
   public int field8175;
   @OriginalMember(
      owner = "client!kga",
      name = "c",
      descriptor = "I"
   )
   public int field8176;
   @OriginalMember(
      owner = "client!kga",
      name = "l",
      descriptor = "I"
   )
   public static int field8177;
   @OriginalMember(
      owner = "client!kga",
      name = "d",
      descriptor = "I"
   )
   public static int field8180;
   @OriginalMember(
      owner = "client!kga",
      name = "h",
      descriptor = "I"
   )
   public int field8181;
   @OriginalMember(
      owner = "client!kga",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field8183;
   @OriginalMember(
      owner = "client!kga",
      name = "m",
      descriptor = "[Ldea;"
   )
   public static class471[] field8184;

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(BILcu;)V"
   )
   private final void method4279(byte arg0, int arg1, class65 arg2) {
      try {
         ++field8177;
         if (arg0 != -81) {
            this.field8176 = 92;
         }

         if (~arg1 != -2) {
            if (arg1 == 3) {
               this.field8175 = arg2.method685(-2);
               this.field8181 = arg2.method665(false);
               this.field8176 = arg2.method665(false);
               return;
            }
         } else {
            this.field8173 = class571.method4230(arg2.method638(true), -1);
         }

      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8185[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8185[2] : field8185[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   public final void method4280(int arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         while(true) {
            int var4 = arg1.method665(false);
            if (~var4 != -1) {
               this.method4279((byte)-81, var4, arg1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 != 4) {
               return;
            }

            ++field8172;
            break;
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8185[5] + arg0 + ',' + (arg1 != null ? field8185[2] : field8185[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4281(int arg0) {
      try {
         field8183 = null;
         field8184 = null;
         int var1 = 117 / ((64 - arg0) / 51);
         field8182 = null;
         field8179 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8185[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "b",
      descriptor = "(I)[Ldi;"
   )
   public static final class577[] method4282(int arg0) {
      try {
         if (arg0 != 7000) {
            return null;
         } else {
            ++field8180;
            return new class577[]{class555.field7889, class556.field7899, class197.field2850, class33.field484, class25.field359, class220.field3142, class776.field11331, class294.field4385, class196.field2831, class543.field7660};
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8185[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4283(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4284(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
