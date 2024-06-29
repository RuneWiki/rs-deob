import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class class550 {
   @OriginalMember(
      owner = "client!lga",
      name = "i",
      descriptor = "Lmu;"
   )
   public class258 field8234;
   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8237 = new String[]{method4178(method4177("\u000bh<r\"O")), method4178(method4177("\tz10")), method4178(method4177("\u001c!sr\u0018")), method4178(method4177("\u000bh<rY\u000ea4([O")), method4178(method4177("\u000bh<r4O")), method4178(method4177("\u000bh<r-O")), method4178(method4177("\u000bh<r!O")), method4178(method4177("\u000bh<r5O")), method4178(method4177("\u000bh<r.O")), method4178(method4177("\u000bh<r(O")), method4178(method4177("\u000bh<r/O"))};
   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "Luk;"
   )
   public static class498 field8236 = new class498(10, -2);
   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "I"
   )
   public static int field8228;
   @OriginalMember(
      owner = "client!lga",
      name = "h",
      descriptor = "I"
   )
   public static int field8229;
   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "I"
   )
   public static int field8230;
   @OriginalMember(
      owner = "client!lga",
      name = "g",
      descriptor = "I"
   )
   public static int field8231;
   @OriginalMember(
      owner = "client!lga",
      name = "f",
      descriptor = "I"
   )
   public static int field8232;
   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "I"
   )
   public static int field8233;
   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "I"
   )
   public static int field8235;

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(BZ)V"
   )
   public abstract void method78(byte arg0, boolean arg1);

   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "(I)V"
   )
   public void method77(int arg0) {
      try {
         if (arg0 == -2) {
            ++field8233;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8237[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(ZB)V"
   )
   public abstract void method73(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!lga",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4175(int arg0) {
      try {
         if (arg0 > 18) {
            field8236 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8237[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(B)Lln;"
   )
   public static final class433 method4176(byte arg0) {
      try {
         ++field8231;
         if (class244.field3715 < class529.field8026.length) {
            return class529.field8026[class244.field3715++];
         } else {
            return arg0 != 38 ? null : null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8237[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "(B)Z"
   )
   public abstract boolean method69(byte arg0);

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method72(int arg0);

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(I)V"
   )
   public void method74(int arg0) {
      try {
         if (arg0 == -29053) {
            ++field8232;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8237[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(B)V"
   )
   public void method75(byte arg0) {
      try {
         int var2 = 97 / ((arg0 - 39) / 58);
         ++field8230;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8237[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "(I)V"
   )
   public void method68(int arg0) {
      try {
         ++field8235;
         if (arg0 != 10) {
            this.method71(42, (byte)68, (class428)null);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8237[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "(I)V"
   )
   public void method70(int arg0) {
      try {
         if (arg0 != -2) {
            field8236 = null;
         }

         ++field8229;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8237[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "(B)V"
   )
   public void method76(byte arg0) {
      try {
         if (arg0 == 71) {
            ++field8228;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8237[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(BII)V"
   )
   public abstract void method67(byte arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!lga",
      name = "<init>",
      descriptor = "(Lmu;)V"
   )
   public class550(class258 arg0) {
      try {
         this.field8234 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8237[3] + (arg0 != null ? field8237[2] : field8237[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IBLwm;)V"
   )
   public abstract void method71(int arg0, byte arg1, class428 arg2);

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4177(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4178(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
