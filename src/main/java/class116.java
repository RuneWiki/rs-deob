import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class116 {
   @OriginalMember(
      owner = "client!rja",
      name = "p",
      descriptor = "I"
   )
   public int field1455;
   @OriginalMember(
      owner = "client!rja",
      name = "j",
      descriptor = "I"
   )
   public int field1441;
   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "S"
   )
   public short field1454;
   @OriginalMember(
      owner = "client!rja",
      name = "f",
      descriptor = "I"
   )
   public int field1449;
   @OriginalMember(
      owner = "client!rja",
      name = "l",
      descriptor = "Z"
   )
   public boolean field1450;
   @OriginalMember(
      owner = "client!rja",
      name = "b",
      descriptor = "S"
   )
   public short field1457;
   @OriginalMember(
      owner = "client!rja",
      name = "h",
      descriptor = "I"
   )
   public int field1456;
   @OriginalMember(
      owner = "client!rja",
      name = "m",
      descriptor = "I"
   )
   public int field1447;
   @OriginalMember(
      owner = "client!rja",
      name = "n",
      descriptor = "S"
   )
   public short field1446;
   @OriginalMember(
      owner = "client!rja",
      name = "e",
      descriptor = "B"
   )
   public byte field1443;
   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1458 = new String[]{method936(method935("D\u0014*'&\u001e")), method936(method935("D\u0014*'Y_\u0010\"}[\u001e")), method936(method935("D\u0014*''\u001e")), method936(method935("D\u0014*'$\u001e"))};
   @OriginalMember(
      owner = "client!rja",
      name = "o",
      descriptor = "Lqca;"
   )
   public static class127 field1445 = new class127(6, 1);
   @OriginalMember(
      owner = "client!rja",
      name = "g",
      descriptor = "Lek;"
   )
   public static class536 field1448 = new class536(83, -1);
   @OriginalMember(
      owner = "client!rja",
      name = "k",
      descriptor = "I"
   )
   public static int field1452 = 0;
   @OriginalMember(
      owner = "client!rja",
      name = "c",
      descriptor = "I"
   )
   public static int field1442;
   @OriginalMember(
      owner = "client!rja",
      name = "d",
      descriptor = "I"
   )
   public static int field1451;
   @OriginalMember(
      owner = "client!rja",
      name = "i",
      descriptor = "I"
   )
   public static int field1453;
   @OriginalMember(
      owner = "client!rja",
      name = "q",
      descriptor = "Ljava/awt/Font;"
   )
   public static Font field1444;

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method932(int arg0, int arg1, int arg2) {
      try {
         ++field1442;
         class755 var3 = class317.method2325((long)arg0, arg2 + 87, arg2);
         var3.method5479(arg2 ^ 1284);
         var3.field11184 = arg1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1458[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method933(int arg0, int arg1) {
      try {
         ++field1453;
         if (arg1 != 127) {
            method934(-43);
         }

         return 127 & arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1458[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method934(int arg0) {
      try {
         field1444 = null;
         field1445 = null;
         if (arg0 != 1) {
            field1452 = -108;
         }

         field1448 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1458[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field1455 = arg11;
         this.field1441 = arg3;
         this.field1454 = (short)arg4;
         this.field1449 = arg2;
         this.field1450 = arg10;
         this.field1457 = (short)arg6;
         this.field1456 = arg1;
         this.field1447 = arg0;
         this.field1446 = (short)arg5;
         this.field1443 = (byte)arg8;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field1458[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method935(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method936(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
