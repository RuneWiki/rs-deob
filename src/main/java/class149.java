import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class149 extends class500 {
   @OriginalMember(
      owner = "client!ls",
      name = "o",
      descriptor = "Lmda;"
   )
   public class277 field1949;
   @OriginalMember(
      owner = "client!ls",
      name = "l",
      descriptor = "I"
   )
   public int field1942;
   @OriginalMember(
      owner = "client!ls",
      name = "k",
      descriptor = "I"
   )
   public int field1946;
   @OriginalMember(
      owner = "client!ls",
      name = "q",
      descriptor = "Z"
   )
   public boolean field1940;
   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1950 = new String[]{method1247(method1246("Rhi;o")), method1247(method1246("Rhi8o")), method1247(method1246("Pn+\u0015")), method1247(method1246("RhiE.Pr3Go")), method1247(method1246("E5iW:"))};
   @OriginalMember(
      owner = "client!ls",
      name = "s",
      descriptor = "I"
   )
   public static int field1943;
   @OriginalMember(
      owner = "client!ls",
      name = "p",
      descriptor = "I"
   )
   public static int field1945;
   @OriginalMember(
      owner = "client!ls",
      name = "j",
      descriptor = "I"
   )
   public static int field1948;
   @OriginalMember(
      owner = "client!ls",
      name = "n",
      descriptor = "Z"
   )
   public boolean field1941;
   @OriginalMember(
      owner = "client!ls",
      name = "m",
      descriptor = "Z"
   )
   public boolean field1944;
   @OriginalMember(
      owner = "client!ls",
      name = "r",
      descriptor = "Z"
   )
   public boolean field1947;

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method1244(byte arg0, int arg1) {
      try {
         label20: {
            if (~class449.field6210 == -1) {
               class131.field1647.method647(-118, arg1);
               if (!client.field4273) {
                  break label20;
               }
            }

            class671.field9870 = arg1;
         }

         if (arg0 != -48) {
            field1945 = -91;
         }

         ++field1948;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1950[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1245(int arg0) {
      try {
         if (arg0 != -8035) {
            field1945 = 6;
         }

         class436.field6059 = 0L;
         class25.field324 = -1;
         ++field1943;
         class762.field11020 = "";
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1950[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "<init>",
      descriptor = "(ILmda;IZ)V"
   )
   public class149(int arg0, class277 arg1, int arg2, boolean arg3) {
      try {
         this.field1949 = arg1;
         this.field1942 = arg2;
         this.field1946 = arg0;
         this.field1940 = arg3;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1950[3] + arg0 + ',' + (arg1 != null ? field1950[4] : field1950[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1246(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1247(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
