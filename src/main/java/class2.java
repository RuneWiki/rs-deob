import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {
   @OriginalMember(
      owner = "client!ro",
      name = "c",
      descriptor = "I"
   )
   public int field8;
   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field12 = new String[]{method17(method16("l &SZM;zN[yg")), method17(method16("l &f\u001d")), method17(method16("l &\u001b\\p&|\u0019\u001d")), method17(method16("p:dK")), method17(method16("l &e\u001d")), method17(method16("ea&\tH"))};
   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "I"
   )
   public static int field6 = 0;
   @OriginalMember(
      owner = "client!ro",
      name = "f",
      descriptor = "Ldia;"
   )
   public static class245 field7 = new class245(64);
   @OriginalMember(
      owner = "client!ro",
      name = "e",
      descriptor = "Lnw;"
   )
   public static class616 field11 = new class616(78, 3);
   @OriginalMember(
      owner = "client!ro",
      name = "d",
      descriptor = "I"
   )
   public static int field10;
   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "I"
   )
   public static int field9;

   @OriginalMember(
      owner = "client!ro",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field12[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class2(int arg0) {
      try {
         this.field8 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field12[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(Lwm;Z)V"
   )
   public static final void method14(class594 arg0, boolean arg1) {
      boolean var2 = client.field4273;

      try {
         ++field10;
         if (!arg1) {
            int var3 = 0;
            if (var2 || ~class567.field7738 < ~var3) {
               do {
                  int var4 = arg0.method4338(false);
                  int var5 = arg0.method4280(-19104);
                  if (~var5 == -65536) {
                     var5 = -1;
                  }

                  if (class580.field7961[var4] != null) {
                     class580.field7961[var4].field7687 = var5;
                  }

                  ++var3;
               } while(~class567.field7738 < ~var3);

            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field12[4] + (arg0 != null ? field12[5] : field12[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method15(byte arg0) {
      try {
         field11 = null;
         field7 = null;
         if (arg0 < 115) {
            field7 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field12[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method16(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method17(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
