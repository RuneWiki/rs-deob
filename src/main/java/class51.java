import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class51 implements class678 {
   @OriginalMember(
      owner = "client!kaa",
      name = "c",
      descriptor = "I"
   )
   public int field566;
   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field570 = new String[]{method417(method416("rf\u0012hO1")), method417(method416("rf\u0012h2pi\u001a201")), method417(method416("rf\u0012hL1"))};
   @OriginalMember(
      owner = "client!kaa",
      name = "e",
      descriptor = "I"
   )
   public static int field567 = 0;
   @OriginalMember(
      owner = "client!kaa",
      name = "d",
      descriptor = "J"
   )
   public static long field569 = 0L;
   @OriginalMember(
      owner = "client!kaa",
      name = "b",
      descriptor = "I"
   )
   public static int field565;
   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "I"
   )
   public static int field568;

   @OriginalMember(
      owner = "client!kaa",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class51(int arg0) {
      try {
         this.field566 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field570[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   public static final void method415(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         int var6;
         int var7;
         label19: {
            ++field568;
            float var5 = (float)class618.field8636 / (float)class618.field8642;
            var6 = arg2;
            var7 = arg0;
            if (var5 < 1.0F) {
               var7 = (int)((float)arg2 * var5);
               if (!client.field4273) {
                  break label19;
               }
            }

            var6 = (int)((float)arg0 / var5);
         }

         int var11 = arg3 - (arg2 - var6) / 2;
         int var10 = arg1 - (-var7 + arg0) / 2;
         class791.field11574 = class618.field8642 * var11 / var6;
         class575.field7911 = -1;
         if (arg4 <= -39) {
            class231.field2870 = -(class618.field8636 * var10 / var7) + class618.field8636;
            class226.field2841 = -1;
            class245.method1842(54);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field570[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public final class365 method19(int arg0) {
      try {
         ++field565;
         int var2 = -47 / ((1 - arg0) / 55);
         return class343.field4908;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field570[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method416(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method417(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
