import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oka")
public class class384 extends class500 {
   @OriginalMember(
      owner = "client!oka",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5399 = new String[]{method2952(method2951("\u0018+ebo_")), method2952(method2951("\u0018+ebh_")), method2952(method2951("2\u000fB")), method2952(method2951("\u0018+ebl_")), method2952(method2951("\fn*bP")), method2952(method2951("\u00195h ")), method2952(method2951("\u0018+ebi_")), method2952(method2951("\u0018+ebn_"))};
   @OriginalMember(
      owner = "client!oka",
      name = "E",
      descriptor = "Lnw;"
   )
   public static class616 field5395 = new class616(92, 1);
   @OriginalMember(
      owner = "client!oka",
      name = "q",
      descriptor = "I"
   )
   public int field5370;
   @OriginalMember(
      owner = "client!oka",
      name = "k",
      descriptor = "I"
   )
   public int field5371;
   @OriginalMember(
      owner = "client!oka",
      name = "x",
      descriptor = "I"
   )
   public int field5372;
   @OriginalMember(
      owner = "client!oka",
      name = "y",
      descriptor = "I"
   )
   public int field5373;
   @OriginalMember(
      owner = "client!oka",
      name = "o",
      descriptor = "I"
   )
   public static int field5375;
   @OriginalMember(
      owner = "client!oka",
      name = "I",
      descriptor = "I"
   )
   public static int field5376;
   @OriginalMember(
      owner = "client!oka",
      name = "D",
      descriptor = "I"
   )
   public int field5377;
   @OriginalMember(
      owner = "client!oka",
      name = "B",
      descriptor = "I"
   )
   public static int field5378;
   @OriginalMember(
      owner = "client!oka",
      name = "m",
      descriptor = "I"
   )
   public int field5382;
   @OriginalMember(
      owner = "client!oka",
      name = "n",
      descriptor = "I"
   )
   public int field5383;
   @OriginalMember(
      owner = "client!oka",
      name = "p",
      descriptor = "I"
   )
   public int field5385;
   @OriginalMember(
      owner = "client!oka",
      name = "C",
      descriptor = "I"
   )
   public static int field5386;
   @OriginalMember(
      owner = "client!oka",
      name = "t",
      descriptor = "I"
   )
   public int field5387;
   @OriginalMember(
      owner = "client!oka",
      name = "v",
      descriptor = "I"
   )
   public int field5388;
   @OriginalMember(
      owner = "client!oka",
      name = "l",
      descriptor = "I"
   )
   public int field5389;
   @OriginalMember(
      owner = "client!oka",
      name = "w",
      descriptor = "I"
   )
   public int field5390;
   @OriginalMember(
      owner = "client!oka",
      name = "K",
      descriptor = "I"
   )
   public int field5391;
   @OriginalMember(
      owner = "client!oka",
      name = "r",
      descriptor = "I"
   )
   public int field5392;
   @OriginalMember(
      owner = "client!oka",
      name = "G",
      descriptor = "I"
   )
   public int field5393;
   @OriginalMember(
      owner = "client!oka",
      name = "L",
      descriptor = "I"
   )
   public int field5394;
   @OriginalMember(
      owner = "client!oka",
      name = "A",
      descriptor = "I"
   )
   public int field5396;
   @OriginalMember(
      owner = "client!oka",
      name = "H",
      descriptor = "I"
   )
   public static int field5397;
   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "I"
   )
   public static int field5398;
   @OriginalMember(
      owner = "client!oka",
      name = "j",
      descriptor = "Ljh;"
   )
   public static class169 field5381;
   @OriginalMember(
      owner = "client!oka",
      name = "u",
      descriptor = "Lop;"
   )
   public class201 field5379;
   @OriginalMember(
      owner = "client!oka",
      name = "F",
      descriptor = "Lmia;"
   )
   public class68 field5384;
   @OriginalMember(
      owner = "client!oka",
      name = "s",
      descriptor = "Lmo;"
   )
   public class783 field5380;
   @OriginalMember(
      owner = "client!oka",
      name = "J",
      descriptor = "Lin;"
   )
   public class98 field5374;

   @OriginalMember(
      owner = "client!oka",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method2946(boolean arg0) {
      try {
         if (!arg0) {
            field5381 = null;
            field5395 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5399[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(BC)Z"
   )
   public static final boolean method2947(byte arg0, char arg1) {
      try {
         ++field5376;
         if (arg0 > -82) {
            field5397 = 120;
         }

         if (arg1 >= ' ' && arg1 <= '~') {
            return true;
         } else if (arg1 >= 160 && arg1 <= 255) {
            return true;
         } else {
            return arg1 == 8364 || ~arg1 == -339 || ~arg1 == -8213 || ~arg1 == -340 || arg1 == 376;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5399[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(ILjava/lang/String;Z)V"
   )
   public static final void method2948(int arg0, String arg1, boolean arg2) {
      try {
         if (arg0 >= -97) {
            field5397 = -42;
         }

         ++field5386;
         class488.method3547(-1, (byte)-81, arg2, -1, arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5399[3] + arg0 + ',' + (arg1 != null ? field5399[4] : field5399[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2949(int arg0) {
      try {
         this.field5384 = null;
         ++field5375;
         this.field5379 = null;
         if (arg0 != 160) {
            this.field5393 = 73;
         }

         this.field5374 = null;
         this.field5380 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5399[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(B)Lfia;"
   )
   public static final class605 method2950(byte arg0) {
      boolean var1 = client.field4273;

      try {
         if (arg0 != 101) {
            field5397 = -92;
         }

         ++field5378;
         class468 var2 = null;
         class605 var3 = new class605(class381.field5334, 0);

         try {
            class289 var4 = class61.field671.method1946("", true, (byte)-114);
            if (var1) {
               class173.method1347(33, 1L);
            }

            while(true) {
               int var10000;
               if (var4.field3826 != 0) {
                  var10000 = var4.field3826;
                  if (!var1) {
                     if (var10000 == 1) {
                        var2 = (class468)var4.field3830;
                        byte[] var5 = new byte[(int)var2.method3429(137)];
                        int var6 = 0;
                        if (var1 || ~var5.length < ~var6) {
                           do {
                              int var7 = var2.method3434((byte)-83, var5.length - var6, var6, var5);
                              if (var7 == -1) {
                                 throw new IOException(field5399[2]);
                              }

                              var6 += var7;
                           } while(~var5.length < ~var6);
                        }

                        var3 = new class605(new class594(var5), class381.field5334, 0);
                     }
                     break;
                  }
               } else {
                  var10000 = 33;
               }

               class173.method1347(var10000, 1L);
            }
         } catch (Exception var10) {
         }

         try {
            if (var2 != null) {
               var2.method3435(false);
            }
         } catch (Exception var9) {
         }

         return var3;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field5399[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2951(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2952(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
