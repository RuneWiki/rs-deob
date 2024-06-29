import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class71 {
   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field876 = new String[]{method660(method659("z\u0011\u0007!.")), method660(method659("oJEc")), method660(method659("pQ\u0007M{")), method660(method659("pQ\u0007N{"))};
   @OriginalMember(
      owner = "client!qn",
      name = "d",
      descriptor = "I"
   )
   public static int field871 = 52;
   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "I"
   )
   public static int field867;
   @OriginalMember(
      owner = "client!qn",
      name = "i",
      descriptor = "I"
   )
   public static int field869;
   @OriginalMember(
      owner = "client!qn",
      name = "f",
      descriptor = "I"
   )
   public int field870;
   @OriginalMember(
      owner = "client!qn",
      name = "e",
      descriptor = "I"
   )
   public int field872;
   @OriginalMember(
      owner = "client!qn",
      name = "c",
      descriptor = "I"
   )
   public static int field873;
   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "I"
   )
   public int field874;
   @OriginalMember(
      owner = "client!qn",
      name = "g",
      descriptor = "Z"
   )
   public boolean field868;
   @OriginalMember(
      owner = "client!qn",
      name = "h",
      descriptor = "Z"
   )
   public boolean field875;

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(II)V",
      line = 11
   )
   public static final void method657(int arg0, int arg1) {
      try {
         ++field869;
         if (arg0 >= 16) {
            class11.method60(false);
            int var2 = class468.field6732.method3513(arg1, 0).field2737;
            if (~var2 != -1) {
               int var3 = class21.field248.field698[arg1];
               if (var2 == 6) {
                  class521.field7497 = var3;
               }

               if (var2 == 5) {
                  class501.field7267 = var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field876[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(Lbl;B)V",
      line = 43
   )
   public static final void method658(class678 arg0, byte arg1) {
      try {
         int var3;
         int var4;
         label26: {
            ++field873;
            class678 var2 = class130.method1031(94, arg0);
            if (var2 != null) {
               var3 = var2.field9904;
               var4 = var2.field9980;
               if (!client.field4360) {
                  break label26;
               }
            }

            var4 = class692.field10185;
            var3 = class237.field3310;
         }

         if (arg1 <= 87) {
            field867 = 77;
         }

         class611.method4443(false, arg0, var3, true, var4);
         class773.method5586(var4, arg0, var3, 0);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field876[2] + (arg0 != null ? field876[0] : field876[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method659(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method660(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
