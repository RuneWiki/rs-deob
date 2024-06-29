import java.awt.Image;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class729 extends InputStream {
   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10498 = new String[]{method5270(method5269("F*w\u0012 ")), method5270(method5269("E3")), method5270(method5269("F*w\u0013 ")), method5270(method5269("F*w\u0015 ")), method5270(method5269("Skw~u")), method5270(method5269("F05<")), method5270(method5269("F*w\"mI!q")), method5270(method5269("F*w\u0011 ")), method5270(method5269("F*w\u0014 "))};
   @OriginalMember(
      owner = "client!no",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field10496 = new int[2048];
   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "I"
   )
   public static int field10491;
   @OriginalMember(
      owner = "client!no",
      name = "g",
      descriptor = "I"
   )
   public static int field10492;
   @OriginalMember(
      owner = "client!no",
      name = "e",
      descriptor = "I"
   )
   public static int field10494;
   @OriginalMember(
      owner = "client!no",
      name = "h",
      descriptor = "I"
   )
   public static int field10495;
   @OriginalMember(
      owner = "client!no",
      name = "f",
      descriptor = "I"
   )
   public static int field10497;
   @OriginalMember(
      owner = "client!no",
      name = "b",
      descriptor = "Lhw;"
   )
   public static class141 field10490;
   @OriginalMember(
      owner = "client!no",
      name = "c",
      descriptor = "Ljava/awt/Image;"
   )
   public static Image field10493;

   @OriginalMember(
      owner = "client!no",
      name = "read",
      descriptor = "()I",
      line = 4
   )
   public final int read() {
      try {
         class624.method4569((byte)98, 30000L);
         ++field10494;
         return -1;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10498[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(I[B)Ldja;",
      line = 13
   )
   public static final class323 method5264(int arg0, byte[] arg1) {
      boolean var2 = client.field4564;

      try {
         ++field10497;
         class323 var3 = new class323();
         class473 var4 = new class473(arg1);
         var4.field6907 = var4.field6889.length + -2;
         int var5 = var4.method3565(true);
         int var6 = var4.field6889.length + -2 + -var5 + -16;
         var4.field6907 = var6;
         int var7 = var4.method3567(31871);
         var3.field4653 = var4.method3565(true);
         var3.field4644 = var4.method3565(true);
         var3.field4652 = var4.method3565(true);
         if (arg0 > -15) {
            method5266((class587)null, -60);
         }

         var3.field4645 = var4.method3565(true);
         var3.field4646 = var4.method3565(true);
         var3.field4648 = var4.method3565(true);
         int var8 = var4.method3564((byte)-90);
         if (~var8 < -1) {
            var3.field4649 = new class178[var8];
            int var9 = 0;
            if (var2 || ~var9 > ~var8) {
               do {
                  int var10 = var4.method3565(true);
                  class178 var11 = new class178(class71.method752(var10, true));
                  var3.field4649[var9] = var11;
                  if (var2 || var10-- > 0) {
                     do {
                        int var12 = var4.method3567(31871);
                        int var13 = var4.method3567(31871);
                        var11.method1566(new class459(var13), 24742, (long)var12);
                     } while(var10-- > 0);
                  }

                  ++var9;
               } while(~var9 > ~var8);
            }
         }

         var4.field6907 = 0;
         var3.field4656 = var4.method3529(false);
         var3.field4643 = new int[var7];
         int var14 = 0;
         if (!var2 && ~var6 >= ~var4.field6907) {
            return var3;
         } else {
            do {
               int var15;
               label113: {
                  var15 = var4.method3565(true);
                  if (var15 == 3) {
                     if (var3.field4647 == null) {
                        var3.field4647 = new String[var7];
                     }

                     var3.field4647[var14] = var4.method3566(-16496688).intern();
                     if (!var2) {
                        break label113;
                     }
                  }

                  if (~var15 != -55) {
                     if (var3.field4657 == null) {
                        var3.field4657 = new int[var7];
                     }

                     if (~var15 > -151 && var15 != 21 && ~var15 != -39 && ~var15 != -40) {
                        var3.field4657[var14] = var4.method3567(31871);
                        if (!var2) {
                           break label113;
                        }
                     }

                     var3.field4657[var14] = var4.method3564((byte)-98);
                     if (!var2) {
                        break label113;
                     }
                  }

                  if (var3.field4659 == null) {
                     var3.field4659 = new long[var7];
                  }

                  var3.field4659[var14] = var4.method3523(119);
               }

               var3.field4643[var14++] = var15;
            } while(~var6 < ~var4.field6907);

            return var3;
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field10498[3] + arg0 + ',' + (arg1 != null ? field10498[4] : field10498[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(IIIII)V",
      line = 116
   )
   public static final void method5265(int param0, int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(Lvia;I)Ljava/lang/String;",
      line = 151
   )
   public static final String method5266(class587 arg0, int arg1) {
      try {
         if (arg1 >= -31) {
            field10490 = null;
         }

         ++field10491;
         if (arg0.field8480 != null && ~arg0.field8480.length() != -1) {
            return arg0.field8477 != null && arg0.field8477.length() > 0 ? arg0.field8486 + class100.field1631.method961(class385.field5684, true) + arg0.field8477 + class100.field1631.method961(class385.field5684, true) + arg0.field8480 : arg0.field8486 + class100.field1631.method961(class385.field5684, true) + arg0.field8480;
         } else {
            return arg0.field8477 != null && arg0.field8477.length() > 0 ? arg0.field8486 + class100.field1631.method961(class385.field5684, true) + arg0.field8477 : arg0.field8486;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10498[7] + (arg0 != null ? field10498[4] : field10498[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(I)V",
      line = 183
   )
   public static void method5267(int arg0) {
      try {
         field10493 = null;
         field10490 = null;
         if (arg0 < 65) {
            method5266((class587)null, 22);
         }

         field10496 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10498[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(B)Ltga;",
      line = 196
   )
   public static final class63 method5268(byte arg0) {
      try {
         ++field10495;
         if (arg0 <= 3) {
            field10496 = null;
         }

         try {
            return (class63)Class.forName(field10498[1]).newInstance();
         } catch (Throwable var2) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10498[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5269(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5270(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
