import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class121 extends class345 {
   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1952 = new String[]{method1139(method1138("F1Q\u0006\u0012")), method1139(method1138("F1Q\u0003\u0012")), method1139(method1138("F1Q\u0005\u0012")), method1139(method1138("F1Q\u0002\u0012")), method1139(method1138("F1Q\u0007\u0012"))};
   @OriginalMember(
      owner = "client!jr",
      name = "k",
      descriptor = "I"
   )
   public static int field1951 = -1;
   @OriginalMember(
      owner = "client!jr",
      name = "j",
      descriptor = "I"
   )
   public static int field1945;
   @OriginalMember(
      owner = "client!jr",
      name = "i",
      descriptor = "I"
   )
   public static int field1946;
   @OriginalMember(
      owner = "client!jr",
      name = "o",
      descriptor = "I"
   )
   public static int field1947;
   @OriginalMember(
      owner = "client!jr",
      name = "l",
      descriptor = "I"
   )
   public static int field1948;
   @OriginalMember(
      owner = "client!jr",
      name = "n",
      descriptor = "I"
   )
   public static int field1949;
   @OriginalMember(
      owner = "client!jr",
      name = "m",
      descriptor = "I"
   )
   public static int field1950;

   @OriginalMember(
      owner = "client!jr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         super.field4913 = this.method53(false);
         if (arg0 == 0) {
            ++field1950;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1952[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 > 99) {
            super.field4913 = arg0;
            ++field1945;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1952[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method1137(boolean arg0) {
      try {
         if (arg0) {
            this.method52((byte)-108, -70);
         }

         ++field1946;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1952[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class121(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            field1951 = -22;
         }

         ++field1947;
         return super.field4914.method5561(0) == class459.field6730 && super.field4914.method5560(13750) ? 0 : 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1952[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class121(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field1948;
         return arg0 > -45 ? 103 : 3;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1952[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1138(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1139(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
