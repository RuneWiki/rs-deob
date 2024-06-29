import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class347 {
   @OriginalMember(
      owner = "client!hba",
      name = "k",
      descriptor = "I"
   )
   public int field141;
   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field148 = new String[]{method89(method88("\u00020\u00164Y")), method89(method88("\u0017kTv")), method89(method88("\u0011|Y4fQ")), method89(method88("\u0011|Y4eQ")), method89(method88("\u0011|Y4\u0018\u0010pQn\u001aQ"))};
   @OriginalMember(
      owner = "client!hba",
      name = "o",
      descriptor = "Lnda;"
   )
   public static class583 field142 = new class583();
   @OriginalMember(
      owner = "client!hba",
      name = "j",
      descriptor = "Lsd;"
   )
   public static class101 field144 = new class101(111, 6);
   @OriginalMember(
      owner = "client!hba",
      name = "i",
      descriptor = "Lsda;"
   )
   public static class269 field145 = new class269(79, 8);
   @OriginalMember(
      owner = "client!hba",
      name = "m",
      descriptor = "Lsda;"
   )
   public static class269 field146 = new class269(25, 3);
   @OriginalMember(
      owner = "client!hba",
      name = "n",
      descriptor = "I"
   )
   public static int field143;
   @OriginalMember(
      owner = "client!hba",
      name = "l",
      descriptor = "I"
   )
   public static int field147;

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(Ljava/lang/Object;IIB)[B",
      line = 4
   )
   public static final byte[] method86(Object arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg3 <= 103) {
            field145 = null;
         }

         ++field143;
         if (arg0 == null) {
            return null;
         } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[])arg0;
            return class773.method5574(var4, 0, arg2, arg1);
         } else if (arg0 instanceof class65) {
            class65 var5 = (class65)arg0;
            return var5.method535(arg1, (byte)125, arg2);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field148[2] + (arg0 != null ? field148[0] : field148[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "<init>",
      descriptor = "()V",
      line = 35
   )
   public class10() {
   }

   @OriginalMember(
      owner = "client!hba",
      name = "<init>",
      descriptor = "(I)V",
      line = 37
   )
   public class10(int arg0) {
      try {
         this.field141 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field148[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(I)V",
      line = 47
   )
   public static void method87(int arg0) {
      try {
         field145 = null;
         int var1 = 60 / ((2 - arg0) / 41);
         field146 = null;
         field142 = null;
         field144 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field148[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method88(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method89(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
