import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class57 {
   @OriginalMember(
      owner = "client!hi",
      name = "d",
      descriptor = "B"
   )
   private byte field698;
   @OriginalMember(
      owner = "client!hi",
      name = "l",
      descriptor = "I"
   )
   public int field703;
   @OriginalMember(
      owner = "client!hi",
      name = "g",
      descriptor = "I"
   )
   public int field702;
   @OriginalMember(
      owner = "client!hi",
      name = "f",
      descriptor = "I"
   )
   public int field705;
   @OriginalMember(
      owner = "client!hi",
      name = "h",
      descriptor = "I"
   )
   public int field697;
   @OriginalMember(
      owner = "client!hi",
      name = "c",
      descriptor = "I"
   )
   public int field701;
   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field709 = new String[]{method428(method427("Jd--\u0004")), method428(method427("Lxo\u0005")), method428(method427("Y#-GQ")), method428(method427("Jd-UELdwW\u0004")), method428(method427("Jd-+\u0004")), method428(method427("Jd-,\u0004")), method428(method427("Jd-*\u0004"))};
   @OriginalMember(
      owner = "client!hi",
      name = "m",
      descriptor = "Lsn;"
   )
   public static class675 field699 = new class675();
   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field706 = new int[4];
   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "I"
   )
   public static int field707 = 0;
   @OriginalMember(
      owner = "client!hi",
      name = "k",
      descriptor = "I"
   )
   public static int field696;
   @OriginalMember(
      owner = "client!hi",
      name = "i",
      descriptor = "I"
   )
   public static int field700;
   @OriginalMember(
      owner = "client!hi",
      name = "j",
      descriptor = "I"
   )
   public static int field704;
   @OriginalMember(
      owner = "client!hi",
      name = "e",
      descriptor = "Lrr;"
   )
   public static class678 field708;

   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method422(int arg0) {
      try {
         ++field704;
         int var2 = 114 % ((arg0 - -71) / 36);
         return (8 & this.field698) == 8 ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field709[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method423(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 458752) {
            return true;
         } else {
            ++field700;
            return ~(458752 & arg1) != -1 | class639.method4662(arg1, arg0, 7371) || class8.method34(arg0, 0, arg1);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field709[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method424(byte arg0) {
      try {
         ++field696;
         if (arg0 != -52) {
            field707 = 88;
         }

         return this.field698 & 7;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field709[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "<init>",
      descriptor = "()V"
   )
   public class57() {
   }

   @OriginalMember(
      owner = "client!hi",
      name = "<init>",
      descriptor = "(Lica;)V"
   )
   public class57(class354 arg0) {
      try {
         this.field698 = arg0.method2886((byte)88);
         this.field703 = arg0.method2848(-117);
         this.field702 = arg0.method2894(100);
         this.field705 = arg0.method2894(97);
         this.field697 = arg0.method2894(100);
         this.field701 = arg0.method2894(113);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field709[3] + (arg0 != null ? field709[2] : field709[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(IIILmja;Lmja;)V"
   )
   public static final void method425(int arg0, int arg1, int arg2, class269 arg3, class269 arg4) {
      class190 var5 = class739.method5427(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field2960 = arg3;
         var5.field2955 = arg4;
         int var6 = class385.field6076 == class190.field2949 ? 1 : 0;
         if (arg3.method233(false)) {
            if (arg3.method228(0)) {
               arg3.field1503 = class777.field11406[var6];
               class777.field11406[var6] = arg3;
            } else {
               arg3.field1503 = class6.field36[var6];
               class6.field36[var6] = arg3;
               class67.field884 = true;
            }
         } else {
            arg3.field1503 = class651.field9383[var6];
            class651.field9383[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method233(false)) {
               if (arg4.method228(0)) {
                  arg4.field1503 = class777.field11406[var6];
                  class777.field11406[var6] = arg4;
                  return;
               }

               arg4.field1503 = class6.field36[var6];
               class6.field36[var6] = arg4;
               class67.field884 = true;
               return;
            }

            arg4.field1503 = class651.field9383[var6];
            class651.field9383[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method426(int arg0) {
      try {
         field706 = null;
         field699 = null;
         field708 = null;
         if (arg0 != 26003) {
            field699 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field709[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method427(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method428(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
