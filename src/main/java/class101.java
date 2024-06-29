import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class101 implements class678 {
   @OriginalMember(
      owner = "client!dba",
      name = "g",
      descriptor = "I"
   )
   public int field1298;
   @OriginalMember(
      owner = "client!dba",
      name = "d",
      descriptor = "Lsq;"
   )
   public class190 field1297;
   @OriginalMember(
      owner = "client!dba",
      name = "f",
      descriptor = "I"
   )
   public int field1299;
   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "I"
   )
   public int field1301;
   @OriginalMember(
      owner = "client!dba",
      name = "i",
      descriptor = "I"
   )
   public int field1306;
   @OriginalMember(
      owner = "client!dba",
      name = "b",
      descriptor = "I"
   )
   public int field1311;
   @OriginalMember(
      owner = "client!dba",
      name = "e",
      descriptor = "I"
   )
   public int field1302;
   @OriginalMember(
      owner = "client!dba",
      name = "c",
      descriptor = "Ljh;"
   )
   public class169 field1309;
   @OriginalMember(
      owner = "client!dba",
      name = "n",
      descriptor = "I"
   )
   public int field1303;
   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1312 = new String[]{method918(method917("\u001fKW\u0019}S")), method918(method917("\u001fKW\u0019\u0004\u0012G_C\u0006S")), method918(method917("\u0000\u0007\u0018\u0019E")), method918(method917("\u0015\\Z[")), method918(method917("\u001fKW\u0019yS")), method918(method917("\u001fKW\u0019~S"))};
   @OriginalMember(
      owner = "client!dba",
      name = "l",
      descriptor = "Z"
   )
   public static volatile boolean field1308;
   @OriginalMember(
      owner = "client!dba",
      name = "j",
      descriptor = "I"
   )
   public static int field1300;
   @OriginalMember(
      owner = "client!dba",
      name = "m",
      descriptor = "I"
   )
   public static int field1305;
   @OriginalMember(
      owner = "client!dba",
      name = "k",
      descriptor = "I"
   )
   public static int field1307;
   @OriginalMember(
      owner = "client!dba",
      name = "h",
      descriptor = "Ljk;"
   )
   public static class663 field1304;
   @OriginalMember(
      owner = "client!dba",
      name = "o",
      descriptor = "Lda;"
   )
   public static class66 field1310;

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public class365 method19(int arg0) {
      try {
         ++field1307;
         int var2 = 32 % ((1 - arg0) / 55);
         return null;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1312[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method915(int arg0) {
      try {
         field1310 = null;
         field1304 = null;
         if (arg0 != 0) {
            method916(33);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1312[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method916(int arg0) {
      try {
         ++field1300;
         if (class616.field8588 == 1) {
            return class347.field4984;
         } else {
            int var1 = 52 % ((arg0 - -30) / 47);
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1312[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "<init>",
      descriptor = "(Lsq;Ljh;IIIIIII)V"
   )
   public class101(class190 arg0, class169 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field1298 = arg7;
         this.field1297 = arg0;
         this.field1299 = arg4;
         this.field1301 = arg2;
         this.field1306 = arg8;
         this.field1311 = arg5;
         this.field1302 = arg3;
         this.field1309 = arg1;
         this.field1303 = arg6;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field1312[1] + (arg0 != null ? field1312[2] : field1312[3]) + ',' + (arg1 != null ? field1312[2] : field1312[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   static {
      new class394("", 76);
      field1308 = false;
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method917(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method918(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
