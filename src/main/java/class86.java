import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class86 {
   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "Lc;"
   )
   private class652 field1257;
   @OriginalMember(
      owner = "client!im",
      name = "f",
      descriptor = "J"
   )
   public long field1254;
   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1262 = new String[]{method837(method836("r\r/\r=")), method837(method836("r\r/\u000f=")), method837(method836("`N/bh")), method837(method836("u\u0015m ")), method837(method836("r\r/p|u\tur=")), method837(method836("r\r/*|u\u0001m%o~H")), method837(method836("r\r/\u000e="))};
   @OriginalMember(
      owner = "client!im",
      name = "c",
      descriptor = "Let;"
   )
   public static class389 field1259 = new class389(16);
   @OriginalMember(
      owner = "client!im",
      name = "i",
      descriptor = "Lhka;"
   )
   public static class377 field1260 = new class377(2, 4);
   @OriginalMember(
      owner = "client!im",
      name = "e",
      descriptor = "Llj;"
   )
   public static class304 field1261 = new class304(4);
   @OriginalMember(
      owner = "client!im",
      name = "h",
      descriptor = "I"
   )
   public static int field1253;
   @OriginalMember(
      owner = "client!im",
      name = "g",
      descriptor = "I"
   )
   public static int field1255;
   @OriginalMember(
      owner = "client!im",
      name = "b",
      descriptor = "I"
   )
   public static int field1256;
   @OriginalMember(
      owner = "client!im",
      name = "d",
      descriptor = "I"
   )
   public static int field1258;

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(III)Z",
      line = 9
   )
   public static final boolean method833(int arg0, int arg1, int arg2) {
      try {
         ++field1253;
         if (arg1 != 0) {
            method833(-7, 32, 77);
         }

         return (1024 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1262[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "finalize",
      descriptor = "()V",
      line = 20
   )
   protected final void finalize() throws Throwable {
      try {
         this.field1257.method4764((byte)122, this.field1254);
         ++field1258;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1262[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(IIIIB)V",
      line = 31
   )
   public static final void method834(int param0, int param1, int param2, int param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!im",
      name = "<init>",
      descriptor = "(Lc;JI)V",
      line = 66
   )
   public class86(class652 arg0, long arg1, int arg2) {
      try {
         this.field1257 = arg0;
         this.field1254 = arg1;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1262[4] + (arg0 != null ? field1262[2] : field1262[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(B)V",
      line = 81
   )
   public static void method835(byte arg0) {
      try {
         field1260 = null;
         if (arg0 == -56) {
            field1261 = null;
            field1259 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1262[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method836(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method837(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
