import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class639 {
   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "Lww;"
   )
   private class339 field9375;
   @OriginalMember(
      owner = "client!em",
      name = "c",
      descriptor = "I"
   )
   public int field9374;
   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9377 = new String[]{method4706(method4705("C}Q?")), method4706(method4705("He\u0013o9CaImx")), method4706(method4705("V&\u0013}-")), method4706(method4705("He\u0013\u0012x"))};
   @OriginalMember(
      owner = "client!em",
      name = "b",
      descriptor = "I"
   )
   public static int field9376;

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4704(int arg0) {
      boolean var1 = client.field1481;

      try {
         class541 var2 = (class541)class500.field6967.method288(0);
         if (var1) {
            if (class308.method2464(16, var2.field7909)) {
               class231.method1833(20, var2);
            }

            var2 = (class541)class500.field6967.method290(17958);
         }

         while(true) {
            int var10000;
            int var10001;
            if (var2 == null) {
               var10000 = arg0;
               var10001 = 26482;
               if (!var1) {
                  if (arg0 != 26482) {
                     return;
                  }

                  ++field9376;
                  return;
               }
            } else {
               var10000 = 16;
               var10001 = var2.field7909;
            }

            if (class308.method2464(var10000, var10001)) {
               class231.method1833(20, var2);
            }

            var2 = (class541)class500.field6967.method290(17958);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9377[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class639(class500 arg0, int arg1, class339 arg2) {
      new class407(64);

      try {
         this.field9375 = arg2;
         this.field9374 = this.field9375.method2691(15, 122);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9377[1] + (arg0 != null ? field9377[2] : field9377[0]) + ',' + arg1 + ',' + (arg2 != null ? field9377[2] : field9377[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4705(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4706(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
