import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class4 {
   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field23 = new String[]{method19(method18("\u0014\u0004c")), method19(method18("V\u001en")), method19(method18("\u001e\u0007`Q\u007fP")), method19(method18("\u000f\u0004o")), method19(method18("V\tx\u0013W\u001a")), method19(method18("\u0015\fb")), method19(method18("\u0016\u0018m\u0013")), method19(method18("V\tm\u0013")), method19(method18("\u0014\u0004o\nF")), method19(method18("\u0003C/QC")), method19(method18("\u001e\u0007`Q|P")), method19(method18("\u001e\u0007`QJ\u0017>u\rW\u0016\n)"))};
   @OriginalMember(
      owner = "client!fja",
      name = "b",
      descriptor = "I"
   )
   public static int field18;
   @OriginalMember(
      owner = "client!fja",
      name = "e",
      descriptor = "I"
   )
   public static int field19;
   @OriginalMember(
      owner = "client!fja",
      name = "c",
      descriptor = "I"
   )
   public static int field20;
   @OriginalMember(
      owner = "client!fja",
      name = "d",
      descriptor = "I"
   )
   public static int field21;
   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "I"
   )
   public static int field22;

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method16(byte arg0) {
      try {
         if (arg0 != 86) {
            field18 = 0;
         }

         ++field22;
         return class489.field7416 == this | class225.field3424 == this;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field23[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field20;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field23[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(BLjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method17(byte arg0, String arg1) {
      try {
         ++field21;
         if (class581.field8576.startsWith(field23[3])) {
            return arg1 + field23[7];
         } else if (!class581.field8576.startsWith(field23[8])) {
            if (class581.field8576.startsWith(field23[5])) {
               return field23[0] + arg1 + field23[4];
            } else {
               if (arg0 > -95) {
                  field18 = -11;
               }

               return null;
            }
         } else {
            return field23[0] + arg1 + field23[1];
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field23[2] + arg0 + ',' + (arg1 != null ? field23[9] : field23[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method18(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method19(char[] arg0) {
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
            var10005 = 109;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
