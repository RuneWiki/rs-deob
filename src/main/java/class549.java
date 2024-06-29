import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class549 {
   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7931 = new String[]{method4095(method4094("\b\u0012$\u0016H")), method4095(method4094("\u001bN$z\u001d")), method4095(method4094("\u000e\u0015f8")), method4095(method4094("\b\u0012$\u0015H"))};
   @OriginalMember(
      owner = "client!hr",
      name = "h",
      descriptor = "I"
   )
   public static int field7929 = -1;
   @OriginalMember(
      owner = "client!hr",
      name = "g",
      descriptor = "I"
   )
   public int field7923;
   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "I"
   )
   public int field7924;
   @OriginalMember(
      owner = "client!hr",
      name = "i",
      descriptor = "I"
   )
   public int field7926;
   @OriginalMember(
      owner = "client!hr",
      name = "b",
      descriptor = "I"
   )
   public static int field7927;
   @OriginalMember(
      owner = "client!hr",
      name = "c",
      descriptor = "I"
   )
   public int field7928;
   @OriginalMember(
      owner = "client!hr",
      name = "f",
      descriptor = "Lhw;"
   )
   public static class141 field7925;
   @OriginalMember(
      owner = "client!hr",
      name = "d",
      descriptor = "Luga;"
   )
   public static class218 field7930;
   @OriginalMember(
      owner = "client!hr",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field7922;

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4092(byte arg0) {
      try {
         field7922 = null;
         int var1 = 86 % ((22 - arg0) / 38);
         field7925 = null;
         field7930 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7931[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(BLuw;Lfj;)Lhv;"
   )
   public static final class542 method4093(byte arg0, class435 arg1, class681 arg2) {
      boolean var3 = client.field4564;

      try {
         if (arg0 != -113) {
            field7922 = null;
         }

         class542 var4;
         label52: {
            ++field7927;
            var4 = class116.method1097(0);
            var4.field7857 = arg1.field6288;
            var4.field7865 = arg1;
            if (~var4.field7857 != 0) {
               if (~var4.field7857 == 1) {
                  var4.field7859 = new class200(10000);
                  if (!var3) {
                     break label52;
                  }
               }

               if (~var4.field7857 >= -19) {
                  var4.field7859 = new class200(20);
                  if (!var3) {
                     break label52;
                  }
               }

               if (var4.field7857 > 98) {
                  var4.field7859 = new class200(260);
                  if (!var3) {
                     break label52;
                  }
               }

               var4.field7859 = new class200(100);
               if (!var3) {
                  break label52;
               }
            }

            var4.field7859 = new class200(260);
         }

         var4.field7859.method1718((byte)-119, arg2);
         var4.field7859.method1713((byte)80, var4.field7865.method3270(-3177));
         var4.field7861 = 0;
         return var4;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7931[0] + arg0 + ',' + (arg1 != null ? field7931[1] : field7931[2]) + ',' + (arg2 != null ? field7931[1] : field7931[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4094(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4095(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
