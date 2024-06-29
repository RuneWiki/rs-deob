import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 implements class678 {
   @OriginalMember(
      owner = "client!sja",
      name = "e",
      descriptor = "I"
   )
   public int field131;
   @OriginalMember(
      owner = "client!sja",
      name = "b",
      descriptor = "I"
   )
   public int field132;
   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "Ljh;"
   )
   public class169 field128;
   @OriginalMember(
      owner = "client!sja",
      name = "g",
      descriptor = "Lsq;"
   )
   public class190 field129;
   @OriginalMember(
      owner = "client!sja",
      name = "f",
      descriptor = "I"
   )
   public int field130;
   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field135 = new String[]{method91(method90("\u000eJ//_U")), method91(method90("\u0013U\"m")), method91(method90("\u0006\u000e`/f")), method91(method90("\u000eJ//'\u0014N'u%U")), method91(method90("\u000eJ//ZU"))};
   @OriginalMember(
      owner = "client!sja",
      name = "c",
      descriptor = "I"
   )
   public static int field133;
   @OriginalMember(
      owner = "client!sja",
      name = "d",
      descriptor = "I"
   )
   public static int field134;

   @OriginalMember(
      owner = "client!sja",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method89(int arg0) {
      try {
         class104.field1322.method4245(true);
         if (arg0 <= 76) {
            method89(-61);
         }

         ++field133;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field135[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public class365 method19(int arg0) {
      try {
         ++field134;
         int var2 = -82 % ((arg0 - 1) / 55);
         return class539.field7364;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field135[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "<init>",
      descriptor = "(ILsq;Ljh;II)V"
   )
   public class11(int arg0, class190 arg1, class169 arg2, int arg3, int arg4) {
      try {
         this.field131 = arg3;
         this.field132 = arg4;
         this.field128 = arg2;
         this.field129 = arg1;
         this.field130 = arg0;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field135[3] + arg0 + ',' + (arg1 != null ? field135[2] : field135[1]) + ',' + (arg2 != null ? field135[2] : field135[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method90(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method91(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
