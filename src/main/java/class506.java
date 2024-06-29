import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class506 implements class490 {
   @OriginalMember(
      owner = "client!ue",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   private String field7751;
   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7757 = new String[]{method3933(method3932("n$1!>")), method3933(method3932("{\u007fsc")), method3933(method3932("`o13*{ck1k")), method3933(method3932("`o1Lk")), method3933(method3932("`o1Kk")), method3933(method3932("`o1Nk")), method3933(method3932("`o1Mk")), method3933(method3932("`o1Ik")), method3933(method3932(")ipc~%:yis%4")), method3933(method3932(")ipc~slyis%4")), method3933(method3932(")ipc~v:yis%4")), method3933(method3932(")ipc~sl,?s%4")), method3933(method3932(")ipc~sl}?s%4")), method3933(method3932(")ipc~!:yis%4")), method3933(method3932(")ipc~sl(?s%4")), method3933(method3932(")ipc~-:yis%4")), method3933(method3932("`o1Jk")), method3933(method3932(")ipc~sl/?s%4"))};
   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "Luk;"
   )
   public static class498 field7753 = new class498(59, 6);
   @OriginalMember(
      owner = "client!ue",
      name = "f",
      descriptor = "Luk;"
   )
   public static class498 field7754 = new class498(67, 12);
   @OriginalMember(
      owner = "client!ue",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field7756 = false;
   @OriginalMember(
      owner = "client!ue",
      name = "h",
      descriptor = "I"
   )
   public static int field7746;
   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "I"
   )
   public static int field7747;
   @OriginalMember(
      owner = "client!ue",
      name = "g",
      descriptor = "I"
   )
   public static int field7749;
   @OriginalMember(
      owner = "client!ue",
      name = "j",
      descriptor = "I"
   )
   public static int field7750;
   @OriginalMember(
      owner = "client!ue",
      name = "k",
      descriptor = "I"
   )
   public static int field7752;
   @OriginalMember(
      owner = "client!ue",
      name = "c",
      descriptor = "I"
   )
   public static int field7755;
   @OriginalMember(
      owner = "client!ue",
      name = "i",
      descriptor = "Z"
   )
   private boolean field7748;

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(III)Ljava/lang/String;",
      line = 6
   )
   public static final String method3928(int arg0, int arg1, int arg2) {
      try {
         ++field7749;
         int var3 = arg1 - arg0;
         if (~var3 > arg2) {
            return field7757[17];
         } else if (~var3 > 5) {
            return field7757[11];
         } else if (var3 < -3) {
            return field7757[14];
         } else if (~var3 > -1) {
            return field7757[12];
         } else if (~var3 < -10) {
            return field7757[8];
         } else if (var3 > 6) {
            return field7757[13];
         } else if (~var3 < -4) {
            return field7757[15];
         } else {
            return ~var3 < -1 ? field7757[10] : field7757[9];
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7757[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(IBIIIILuaa;)V",
      line = 44
   )
   public static final void method3929(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class119 arg6) {
      try {
         class724.method5348(arg6.field1505, arg6.field1494, (byte)-105, arg2, arg4, arg0, arg5, arg6.field1506, arg3, 0);
         ++field7750;
         if (arg1 != -69) {
            field7756 = true;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7757[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7757[0] : field7757[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "(I)Lhba;",
      line = 55
   )
   public final class430 method3794(int arg0) {
      try {
         ++field7752;
         if (arg0 != 13943) {
            this.method3797(115);
         }

         return class430.field6638;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7757[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "c",
      descriptor = "(I)V",
      line = 70
   )
   public static void method3930(int arg0) {
      try {
         field7754 = null;
         if (arg0 < 27) {
            method3929(-70, (byte)13, -93, 75, -5, 46, (class119)null);
         }

         field7753 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7757[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(Z)Z",
      line = 83
   )
   public final boolean method3931(boolean arg0) {
      try {
         if (arg0) {
            this.field7748 = true;
         }

         ++field7746;
         return this.field7748;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7757[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(I)I",
      line = 95
   )
   public final int method3797(int arg0) {
      try {
         ++field7747;
         int var2 = class324.method2650(-1, this.field7751);
         if (var2 >= 0 && ~var2 >= -101) {
            return var2;
         } else {
            this.field7748 = true;
            return arg0 <= 62 ? -70 : 100;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7757[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 115
   )
   public class506(String arg0) {
      try {
         this.field7751 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7757[2] + (arg0 != null ? field7757[0] : field7757[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3932(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3933(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
