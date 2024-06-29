import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class595 {
   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8755 = new String[]{method4430(method4429("<sY\u0003R")), method4430(method4429("<sY\u0004R")), method4430(method4429("2<Yo\u0007")), method4430(method4429("'g\u001b-")), method4430(method4429("<sY\u0002R")), method4430(method4429("<sY\u0005R")), method4430(method4429("<sY\u0000R"))};
   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "I"
   )
   public static int field8749;
   @OriginalMember(
      owner = "client!ua",
      name = "b",
      descriptor = "I"
   )
   public static int field8751;
   @OriginalMember(
      owner = "client!ua",
      name = "d",
      descriptor = "I"
   )
   public static int field8752;
   @OriginalMember(
      owner = "client!ua",
      name = "c",
      descriptor = "I"
   )
   public static int field8753;
   @OriginalMember(
      owner = "client!ua",
      name = "e",
      descriptor = "I"
   )
   public static int field8754;
   @OriginalMember(
      owner = "client!ua",
      name = "g",
      descriptor = "Lcl;"
   )
   public static class141 field8748;
   @OriginalMember(
      owner = "client!ua",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field8750;

   @OriginalMember(
      owner = "client!ua",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4424(int arg0) {
      try {
         if (arg0 != -29646) {
            field8750 = null;
         }

         field8750 = null;
         field8748 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8755[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4425(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(ZLica;)Lvd;"
   )
   public static final class512 method4426(boolean arg0, class354 arg1) {
      try {
         ++field8749;
         int var2 = arg1.method2894(111);
         if (arg0) {
            method4428(true, (byte)24, false);
         }

         return new class512(var2);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8755[4] + arg0 + ',' + (arg1 != null ? field8755[2] : field8755[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(ILrr;)V"
   )
   public static final void method4427(int arg0, class678 arg1) {
      try {
         if (arg0 != -1) {
            method4425(-12);
         }

         class642.field9288 = arg1;
         ++field8753;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8755[6] + arg0 + ',' + (arg1 != null ? field8755[2] : field8755[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(ZBZ)V"
   )
   public static final void method4428(boolean arg0, byte arg1, boolean arg2) {
      try {
         ++field8751;
         if (arg0) {
            --class79.field1053;
            if (class79.field1053 == 0) {
               class77.field1028 = null;
            }
         }

         if (arg1 != -107) {
            field8748 = null;
         }

         if (arg2) {
            --class48.field628;
            if (~class48.field628 == -1) {
               class228.field3503 = null;
               return;
            }
         }

      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8755[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4429(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4430(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
