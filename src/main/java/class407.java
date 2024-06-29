import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class407 {
   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5989 = new String[]{method3129(method3128("KA|\u0007")), method3129(method3128("^\u001a>E4")), method3129(method3128("QY>)a"))};
   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "I"
   )
   public static int field5988;

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(ILuba;)I",
      line = 7
   )
   public static final int method3127(int arg0, class451 arg1) {
      boolean var2 = client.field4564;

      try {
         ++field5988;
         class15 var3 = arg1.field6586;
         if (var3.field230 != null) {
            var3 = var3.method111(class616.field8951, -2690);
            if (var3 == null) {
               return -1;
            }
         }

         int var4 = var3.field217;
         class654 var5 = arg1.method5574(31482);
         if (arg1.field11284 != arg0 && !arg1.field11266) {
            if (arg1.field11284 != var5.field9524 && arg1.field11284 != var5.field9525 && ~arg1.field11284 != ~var5.field9520 && ~arg1.field11284 != ~var5.field9539) {
               if (arg1.field11284 != var5.field9515 && ~arg1.field11284 != ~var5.field9542 && ~arg1.field11284 != ~var5.field9516 && ~arg1.field11284 != ~var5.field9491) {
                  return var4;
               }

               var4 = var3.field252;
               if (!var2) {
                  return var4;
               }
            }

            var4 = var3.field272;
            if (!var2) {
               return var4;
            }
         }

         var4 = var3.field259;
         return var4;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5989[2] + arg0 + ',' + (arg1 != null ? field5989[1] : field5989[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(Lpea;I)Lpea;"
   )
   public abstract class754 method3126(class754 arg0, int arg1);

   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3128(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3129(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
