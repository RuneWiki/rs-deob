import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class48 extends class733 {
   @OriginalMember(
      owner = "client!bt",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field636 = new String[]{method401(method400("m>\u0002g&")), method401(method400("m>\u0002`&")), method401(method400("m>\u0002a&")), method401(method400("m>\u0002d&")), method401(method400("a?@I")), method401(method400("td\u0002\u000bs")), method401(method400("m>\u0002f&"))};
   @OriginalMember(
      owner = "client!bt",
      name = "F",
      descriptor = "[Z"
   )
   public static boolean[] field633 = new boolean[8];
   @OriginalMember(
      owner = "client!bt",
      name = "I",
      descriptor = "I"
   )
   public static int field631;
   @OriginalMember(
      owner = "client!bt",
      name = "H",
      descriptor = "I"
   )
   public static int field632;
   @OriginalMember(
      owner = "client!bt",
      name = "G",
      descriptor = "I"
   )
   public static int field634;
   @OriginalMember(
      owner = "client!bt",
      name = "E",
      descriptor = "I"
   )
   public static int field635;
   @OriginalMember(
      owner = "client!bt",
      name = "J",
      descriptor = "[B"
   )
   private byte[] field630;

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(ILnu;)[Lup;"
   )
   public static final class291[] method395(int arg0, class619 arg1) {
      boolean var2 = client.field4360;

      try {
         ++field634;
         if (!arg1.method4502(55)) {
            return new class291[0];
         } else if (arg0 < 119) {
            return null;
         } else {
            class296 var3 = arg1.method4500(115);
            if (var2) {
               class661.method4825(0, 10L);
            }

            while(true) {
               int var10000;
               if (var3.field4078 != 0) {
                  var10000 = ~var3.field4078;
                  if (!var2) {
                     if (var10000 == -3) {
                        return new class291[0];
                     }

                     int[] var4 = (int[])var3.field4077;
                     class291[] var5 = new class291[var4.length >> 2];
                     int var6 = 0;
                     if (!var2 && ~var6 <= ~var5.length) {
                        return var5;
                     }

                     do {
                        class291 var7 = new class291();
                        var5[var6] = var7;
                        var7.field4019 = var4[var6 << 2];
                        var7.field4022 = var4[(var6 << 2) + 1];
                        var7.field4023 = var4[(var6 << 2) + 2];
                        var7.field4021 = var4[(var6 << 2) + 3];
                        ++var6;
                     } while(~var6 > ~var5.length);

                     return var5;
                  }
               } else {
                  var10000 = 0;
               }

               class661.method4825(var10000, 10L);
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field636[3] + arg0 + ',' + (arg1 != null ? field636[5] : field636[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method396(int arg0) {
      try {
         ++field632;
         if (!class368.field5040) {
            class480.field6887 += (12.0F - class480.field6887) / 2.0F;
            class368.field5040 = true;
            if (arg0 > -26) {
               method395(23, (class619)null);
            }

            class444.field6311 = true;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field636[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "<init>",
      descriptor = "()V"
   )
   public class48() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(BBI)V"
   )
   public final void method397(byte arg0, byte arg1, int arg2) {
      try {
         if (arg0 >= 5) {
            ++field635;
            byte var7 = (byte)((127 & arg1 >> 1) + 127);
            int var4 = arg2 * 2;
            int var10001 = var4;
            int var8 = var4 + 1;
            this.field630[var10001] = var7;
            this.field630[var8] = var7;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field636[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(IIII)[B"
   )
   public final byte[] method398(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field630 = new byte[arg1 * arg3 * arg2 * 2];
         if (arg0 != -4097) {
            return null;
         } else {
            ++field631;
            this.method2389(arg2, (byte)-126, arg3, arg1);
            return this.field630;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field636[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method399(int arg0) {
      try {
         if (arg0 != -438163134) {
            field633 = null;
         }

         field633 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field636[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method400(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method401(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
