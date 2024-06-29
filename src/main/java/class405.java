import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class405 extends class22 {
   @OriginalMember(
      owner = "client!ml",
      name = "q",
      descriptor = "Lrk;"
   )
   public class35 field5976;
   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5982 = new String[]{method3125(method3124("0A\u00106Q")), method3125(method3124("0A\u00102Q")), method3125(method3124("0A\u00101Q")), method3125(method3124("0A\u00108Q")), method3125(method3124("0A\u0010<Q")), method3125(method3124("0A\u00107Q")), method3125(method3124("&\u0003\u0010^\u0004")), method3125(method3124("3XR\u001c")), method3125(method3124("0A\u0010L\u00103DJNQ"))};
   @OriginalMember(
      owner = "client!ml",
      name = "j",
      descriptor = "Lgh;"
   )
   public static class572 field5975 = new class572(86, 3);
   @OriginalMember(
      owner = "client!ml",
      name = "m",
      descriptor = "[Lgg;"
   )
   public static class184[] field5979 = new class184[128];
   @OriginalMember(
      owner = "client!ml",
      name = "r",
      descriptor = "I"
   )
   public static int field5973;
   @OriginalMember(
      owner = "client!ml",
      name = "n",
      descriptor = "I"
   )
   public static int field5974;
   @OriginalMember(
      owner = "client!ml",
      name = "p",
      descriptor = "I"
   )
   public static int field5977;
   @OriginalMember(
      owner = "client!ml",
      name = "s",
      descriptor = "I"
   )
   public static int field5978;
   @OriginalMember(
      owner = "client!ml",
      name = "k",
      descriptor = "I"
   )
   public static int field5980;
   @OriginalMember(
      owner = "client!ml",
      name = "o",
      descriptor = "I"
   )
   public static int field5981;
   @OriginalMember(
      owner = "client!ml",
      name = "l",
      descriptor = "Z"
   )
   public boolean field5972;

   @OriginalMember(
      owner = "client!ml",
      name = "e",
      descriptor = "(I)I"
   )
   public int method3112(int arg0) {
      try {
         if (arg0 != 1) {
            return -26;
         } else {
            ++field5977;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5982[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(Lkv;ILkv;I)V"
   )
   public abstract void method3113(class281 arg0, int arg1, class281 arg2, int arg3);

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method3114(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "(I)[Lfk;"
   )
   public static final class678[] method3115(int arg0) {
      try {
         if (arg0 != 86) {
            method3119(-40);
         }

         ++field5981;
         return new class678[]{class503.field7334, class594.field8571, class656.field9579};
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5982[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method3116(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method3117(boolean arg0) {
      try {
         ++field5978;
         if (arg0) {
            this.method3123((byte)101);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5982[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "g",
      descriptor = "(I)Z"
   )
   public abstract boolean method3118(int arg0);

   @OriginalMember(
      owner = "client!ml",
      name = "<init>",
      descriptor = "(Lrk;)V"
   )
   public class405(class35 arg0) {
      try {
         this.field5976 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5982[8] + (arg0 != null ? field5982[6] : field5982[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3119(int arg0) {
      try {
         field5975 = null;
         field5979 = null;
         if (arg0 != 3) {
            field5975 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5982[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method3120(byte arg0) {
      try {
         int var2 = -55 % ((31 - arg0) / 42);
         ++field5974;
         return this.field5972;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5982[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method3121(int arg0);

   @OriginalMember(
      owner = "client!ml",
      name = "c",
      descriptor = "(B)Z"
   )
   public abstract boolean method3122(byte arg0);

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method3123(byte arg0) {
      try {
         if (arg0 > 0) {
            this.method3112(68);
         }

         ++field5973;
         return false;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5982[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3124(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3125(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
