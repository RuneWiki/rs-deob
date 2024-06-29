import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class588 extends class676 {
   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8685 = new String[]{method4283(method4282("T#")), method4283(method4282("H$o\u0001qJ")), method4283(method4282("]7#\rr\u00185")), method4283(method4282("\u0001l\"$5")), method4283(method4282("T7o\u0001qImj\b{D;2")), method4283(method4282("T7o\u0001qImj\b{\u0012m2")), method4283(method4282("T7o\u0001qI;<\b{L;2")), method4283(method4282("\u0001l\"%5"))};
   @OriginalMember(
      owner = "client!ug",
      name = "e",
      descriptor = "I"
   )
   public static int field8683;
   @OriginalMember(
      owner = "client!ug",
      name = "f",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field8684;

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method4280(byte arg0) {
      try {
         field8684 = null;
         if (arg0 < 47) {
            method4280((byte)32);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8685[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(IB)Ljava/lang/String;",
      line = 17
   )
   public static final String method4281(int arg0, byte arg1) {
      boolean var2 = client.field4360;

      try {
         ++field8683;
         String var3 = Integer.toString(arg0);
         int var4 = var3.length() + -3;
         if (var2) {
            var3 = var3.substring(0, var4) + "," + var3.substring(var4);
            var4 -= 3;
         }

         while(true) {
            while(var4 > 0) {
               var3 = var3.substring(0, var4) + "," + var3.substring(var4);
               var4 -= 3;
            }

            if (!var2) {
               if (arg1 != 3) {
                  field8684 = null;
               }

               if (~var3.length() < -10) {
                  return field8685[6] + var3.substring(0, var3.length() + -8) + class180.field2512.method1437(class608.field8920, 50) + field8685[0] + var3 + field8685[2];
               }

               if (var3.length() > 6) {
                  return field8685[5] + var3.substring(0, var3.length() + -4) + class180.field2514.method1437(class608.field8920, 50) + field8685[0] + var3 + field8685[2];
               }

               return field8685[4] + var3 + field8685[1];
            }

            var4 -= 3;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8685[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "b",
      descriptor = "(I)Lwfa;"
   )
   public abstract class212 method484(int arg0);

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4282(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4283(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
