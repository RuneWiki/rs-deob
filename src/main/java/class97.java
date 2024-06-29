import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class97 extends class55 {
   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1254 = new String[]{method828(method827("-\u0012qtq")), method828(method827("9U>tE~")), method828(method827("8I36")), method828(method827("9U>tK~")), method828(method827("9U>tM~")), method828(method827("9U>tJ~")), method828(method827("9U>tI~")), method828(method827("9U>tO~")), method828(method827("9U>tN~")), method828(method827("9U>tD~")), method828(method827("9U>tH~"))};
   @OriginalMember(
      owner = "client!oia",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field1245 = new int[1];
   @OriginalMember(
      owner = "client!oia",
      name = "m",
      descriptor = "I"
   )
   public static int field1244;
   @OriginalMember(
      owner = "client!oia",
      name = "e",
      descriptor = "I"
   )
   public static int field1246;
   @OriginalMember(
      owner = "client!oia",
      name = "f",
      descriptor = "I"
   )
   public static int field1247;
   @OriginalMember(
      owner = "client!oia",
      name = "i",
      descriptor = "I"
   )
   public static int field1248;
   @OriginalMember(
      owner = "client!oia",
      name = "k",
      descriptor = "I"
   )
   public static int field1249;
   @OriginalMember(
      owner = "client!oia",
      name = "h",
      descriptor = "I"
   )
   public static int field1250;
   @OriginalMember(
      owner = "client!oia",
      name = "g",
      descriptor = "I"
   )
   public static int field1251;
   @OriginalMember(
      owner = "client!oia",
      name = "n",
      descriptor = "I"
   )
   public static int field1252;
   @OriginalMember(
      owner = "client!oia",
      name = "j",
      descriptor = "I"
   )
   public static int field1253;

   @OriginalMember(
      owner = "client!oia",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 5
   )
   public class97(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!oia",
      name = "b",
      descriptor = "(I)I",
      line = 8
   )
   public final int method101(int arg0) {
      try {
         if (arg0 >= -116) {
            return -101;
         } else {
            ++field1253;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1254[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(IB)I",
      line = 22
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            this.method97(76, (byte)-83);
         }

         ++field1244;
         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1254[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(I)V",
      line = 34
   )
   public final void method98(int arg0) {
      try {
         if (arg0 == 0) {
            if (super.field680 != 1 && super.field680 != 0) {
               super.field680 = this.method101(-124);
            }

            ++field1248;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1254[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "b",
      descriptor = "(BI)I",
      line = 48
   )
   public static final int method822(byte arg0, int arg1) {
      try {
         if (arg0 >= -102) {
            return 90;
         } else {
            ++field1250;
            return arg1 >>> 8;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1254[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(IZI)Z",
      line = 63
   )
   public static final boolean method823(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            method826(-107);
         }

         ++field1246;
         return ~(arg2 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1254[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "d",
      descriptor = "(I)I",
      line = 77
   )
   public final int method824(int arg0) {
      try {
         ++field1252;
         int var2 = -29 / ((36 - arg0) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1254[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 89
   )
   public class97(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Z",
      line = 93
   )
   public static final boolean method825(String arg0, byte arg1) {
      try {
         int var2 = 25 % ((arg1 - 10) / 57);
         ++field1247;
         return class675.method4905(arg0, true, 55, 10);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1254[1] + (arg0 != null ? field1254[0] : field1254[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "c",
      descriptor = "(I)V",
      line = 103
   )
   public static void method826(int arg0) {
      try {
         if (arg0 == 1) {
            field1245 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1254[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "b",
      descriptor = "(IB)V",
      line = 113
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = 83 % ((arg1 - 47) / 46);
         ++field1251;
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1254[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method827(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method828(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
