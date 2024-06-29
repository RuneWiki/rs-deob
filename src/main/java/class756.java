import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class756 {
   @OriginalMember(
      owner = "client!eaa",
      name = "e",
      descriptor = "I"
   )
   public int field11196 = 2048;
   @OriginalMember(
      owner = "client!eaa",
      name = "h",
      descriptor = "I"
   )
   public int field11204 = 0;
   @OriginalMember(
      owner = "client!eaa",
      name = "g",
      descriptor = "I"
   )
   public int field11205 = 2048;
   @OriginalMember(
      owner = "client!eaa",
      name = "b",
      descriptor = "I"
   )
   public int field11206 = 0;
   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11208 = new String[]{method5550(method5549("\u0019~FcK")), method5550(method5549("\f%\u0004!")), method5550(method5549("\u00069\u001a(U\u0016<\u0007*_\fp")), method5550(method5549("\u00071\tcrJ")), method5550(method5549("O}Vm")), method5550(method5549("\u00071\tcsJ")), method5550(method5549("\u00071\tcwJ")), method5550(method5549("\u00071\tcuJ")), method5550(method5549("\u00071\tctJ"))};
   @OriginalMember(
      owner = "client!eaa",
      name = "l",
      descriptor = "[F"
   )
   public static float[] field11199 = new float[2];
   @OriginalMember(
      owner = "client!eaa",
      name = "m",
      descriptor = "I"
   )
   public static int field11198 = 0;
   @OriginalMember(
      owner = "client!eaa",
      name = "f",
      descriptor = "Luk;"
   )
   public static class498 field11195 = new class498(91, -2);
   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "I"
   )
   public static int field11197;
   @OriginalMember(
      owner = "client!eaa",
      name = "k",
      descriptor = "I"
   )
   public static int field11200;
   @OriginalMember(
      owner = "client!eaa",
      name = "c",
      descriptor = "I"
   )
   public static int field11201;
   @OriginalMember(
      owner = "client!eaa",
      name = "j",
      descriptor = "I"
   )
   public static int field11203;
   @OriginalMember(
      owner = "client!eaa",
      name = "i",
      descriptor = "Llaa;"
   )
   public static class541 field11207;
   @OriginalMember(
      owner = "client!eaa",
      name = "d",
      descriptor = "Lqda;"
   )
   public static class697 field11202;

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method5544(int arg0, int arg1, boolean arg2) {
      try {
         ++field11200;
         if (!arg2) {
            return false;
         } else {
            return (arg0 & 2048) != 0;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11208[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(Lica;II)V"
   )
   private final void method5545(class354 arg0, int arg1, int arg2) {
      try {
         ++field11203;
         if (arg2 > 81) {
            if (~arg1 == -2) {
               this.field11206 = arg0.method2855(-31007);
            } else {
               if (~arg1 != -3) {
                  if (~arg1 == -4) {
                     this.field11196 = arg0.method2848(-108);
                     return;
                  }

                  if (arg1 == 4) {
                     this.field11204 = arg0.method2869(false);
                     return;
                  }
               } else {
                  this.field11205 = arg0.method2848(-121);
               }

            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11208[7] + (arg0 != null ? field11208[0] : field11208[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(ILica;)V"
   )
   public final void method5546(int arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         while(true) {
            int var4 = arg1.method2855(-31007);
            if (var4 != 0) {
               this.method5545(arg1, var4, arg0 + 86);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field11201;
            break;
         }

         if (arg0 != 0) {
            method5544(-4, -16, false);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11208[6] + arg0 + ',' + (arg1 != null ? field11208[0] : field11208[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method5547(int arg0, String arg1) {
      boolean var2 = client.field1786;

      try {
         if (arg0 != 0) {
            method5547(54, (String)null);
         }

         ++field11197;
         String var3 = null;
         int var4 = arg1.indexOf(field11208[4]);
         if (~var4 <= -1) {
            var3 = arg1.substring(0, var4 + 4);
            arg1 = arg1.substring(var4 + 4);
         }

         if (arg1.startsWith(field11208[2])) {
            int var5 = arg1.indexOf(" ", field11208[2].length());
            if (~var5 <= -1) {
               int var6 = arg1.length();
               arg1 = arg1.substring(0, var5) + " ";
               int var7 = var5 + 1;
               if (var2 || ~var6 < ~var7) {
                  do {
                     arg1 = arg1 + "*";
                     ++var7;
                  } while(~var6 < ~var7);
               }
            }
         }

         return var3 == null ? arg1 : var3 + arg1;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field11208[3] + arg0 + ',' + (arg1 != null ? field11208[0] : field11208[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5548(boolean arg0) {
      try {
         if (arg0) {
            method5544(54, 42, false);
         }

         field11202 = null;
         field11207 = null;
         field11199 = null;
         field11195 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11208[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5549(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5550(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
