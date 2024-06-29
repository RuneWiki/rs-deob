import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class556 {
   @OriginalMember(
      owner = "client!pt",
      name = "c",
      descriptor = "I"
   )
   public int field8254;
   @OriginalMember(
      owner = "client!pt",
      name = "e",
      descriptor = "I"
   )
   public int field8252;
   @OriginalMember(
      owner = "client!pt",
      name = "i",
      descriptor = "I"
   )
   public int field8255;
   @OriginalMember(
      owner = "client!pt",
      name = "f",
      descriptor = "I"
   )
   public int field8251;
   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8262 = new String[]{method4122(method4121("$MG\u0005<:P\u001d\u0007}")), method4122(method4121(":L\u0005U")), method4122(method4121("$MG{}")), method4122(method4121("/\u0017G\u0017(")), method4122(method4121("$MGz}")), method4122(method4121("$MGx}"))};
   @OriginalMember(
      owner = "client!pt",
      name = "g",
      descriptor = "Lcs;"
   )
   public static class358 field8257 = new class358();
   @OriginalMember(
      owner = "client!pt",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field8258 = new int[1000];
   @OriginalMember(
      owner = "client!pt",
      name = "j",
      descriptor = "I"
   )
   public static int field8261 = 1;
   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "I"
   )
   public static int field8253;
   @OriginalMember(
      owner = "client!pt",
      name = "k",
      descriptor = "I"
   )
   public static int field8256;
   @OriginalMember(
      owner = "client!pt",
      name = "d",
      descriptor = "I"
   )
   public static int field8259;
   @OriginalMember(
      owner = "client!pt",
      name = "b",
      descriptor = "Leaa;"
   )
   public static class526 field8260;

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(BLch;)V",
      line = 3
   )
   public static final void method4118(byte arg0, class488 arg1) {
      int var2 = client.field4530;

      try {
         ++field8256;
         boolean var3 = false;
         arg1.method699(12);
         if (arg0 != -55) {
            field8259 = 91;
         }

         class488 var4 = (class488)class744.field11034.method5158(0);
         boolean var10000;
         if (var2 != 0) {
            var10000 = class441.method3336(1000, var4.method3622(arg0 + 73), arg1.method3622(arg0 + 73));
         } else if (var4 == null) {
            var10000 = var3;
            if (var2 == 0) {
               if (!var3) {
                  class744.field11034.method5164(arg1, (byte)-105);
                  return;
               }

               return;
            }
         } else {
            var10000 = class441.method3336(1000, var4.method3622(arg0 + 73), arg1.method3622(arg0 + 73));
         }

         do {
            while(true) {
               if (var10000) {
                  var3 = true;
                  class613.method4456(arg1, (byte)-118, var4);
                  if (var2 == 0) {
                     var10000 = var3;
                     break;
                  }

                  var4 = (class488)class744.field11034.method5163((byte)109);
               } else {
                  var4 = (class488)class744.field11034.method5163((byte)109);
               }

               if (var4 == null) {
                  var10000 = var3;
                  if (var2 == 0) {
                     if (!var3) {
                        class744.field11034.method5164(arg1, (byte)-105);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = class441.method3336(1000, var4.method3622(arg0 + 73), arg1.method3622(arg0 + 73));
               }
            }
         } while(var2 != 0);

         if (!var3) {
            class744.field11034.method5164(arg1, (byte)-105);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8262[2] + arg0 + ',' + (arg1 != null ? field8262[3] : field8262[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(IB)Lpt;",
      line = 39
   )
   public final class556 method4119(int arg0, byte arg1) {
      try {
         if (arg1 < 71) {
            field8261 = -119;
         }

         ++field8253;
         return new class556(this.field8251, arg0, this.field8255, this.field8254);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8262[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(I)V",
      line = 51
   )
   public static void method4120(int arg0) {
      try {
         field8257 = null;
         field8260 = null;
         if (arg0 < -68) {
            field8258 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8262[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "<init>",
      descriptor = "(IIII)V",
      line = 63
   )
   public class556(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field8254 = arg3;
         this.field8252 = arg1;
         this.field8255 = arg2;
         this.field8251 = arg0;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8262[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4121(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4122(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
