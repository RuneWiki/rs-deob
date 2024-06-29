import java.awt.Canvas;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class544 extends InputStream {
   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8184 = new String[]{method4154(method4153("\u000fy\u0014B}")), method4154(method4153("\u000fy\u0014s0\u0006k\u0012")), method4154(method4153("\u000fy\u0014E}")), method4154(method4153("\u000fy\u0014C}")), method4154(method4153("\u000fy\u0014@}"))};
   @OriginalMember(
      owner = "client!hv",
      name = "e",
      descriptor = "[F"
   )
   public static float[] field8180 = new float[]{0.0F, -1.0F, 0.0F, 0.0F};
   @OriginalMember(
      owner = "client!hv",
      name = "d",
      descriptor = "I"
   )
   public static int field8178;
   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "I"
   )
   public static int field8179;
   @OriginalMember(
      owner = "client!hv",
      name = "c",
      descriptor = "I"
   )
   public static int field8181;
   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "I"
   )
   public static int field8182;
   @OriginalMember(
      owner = "client!hv",
      name = "f",
      descriptor = "Ljava/awt/Canvas;"
   )
   public static Canvas field8183;

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method4149(int arg0, int arg1) {
      try {
         ++field8179;
         if (arg0 != 0) {
            method4152(-60);
         }

         return ~arg1 == -5 || ~arg1 == -9 || arg1 == 12 || ~arg1 == -11;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8184[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4150(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field8181;
         int var2 = class728.field10861;
         int[] var3 = class17.field223;
         int var4 = 0;
         class9 var5;
         if (var1) {
            var5 = class484.field7370[var3[var4]];
            if (var5 != null && ~var5.field1629 < -1) {
               --var5.field1629;
               if (~var5.field1629 == -1) {
                  var5.field1621 = null;
               }
            }

            ++var4;
         }

         while(~var2 < ~var4) {
            var5 = class484.field7370[var3[var4]];
            if (var5 != null && ~var5.field1629 < -1) {
               --var5.field1629;
               if (~var5.field1629 == -1) {
                  var5.field1621 = null;
               }
            }

            ++var4;
         }

         if (arg0 < 91) {
            method4149(46, 88);
         }

         int var6 = 0;
         if (var1 || var6 < class615.field8929) {
            do {
               long var7 = (long)class334.field5139[var6];
               class795 var9 = (class795)class501.field7665.method3141(var7, true);
               if (var9 != null) {
                  class466 var10 = var9.field11592;
                  if (var10.field1629 > 0) {
                     --var10.field1629;
                     if (var10.field1629 == 0) {
                        var10.field1621 = null;
                     }
                  }
               }

               ++var6;
            } while(var6 < class615.field8929);

         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field8184[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4151(boolean arg0) {
      try {
         if (arg0) {
            method4152(43);
         }

         field8183 = null;
         field8180 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8184[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         ++field8178;
         class697.method5128(30000L, 67);
         return -1;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8184[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4152(int arg0) {
      try {
         if (arg0 > 71) {
            if (class498.field7578.field4556 && class756.field11207.field8150 != -1) {
               class48.method340(class756.field11207.field8152, class756.field11207.field8150, 0);
            }

            ++field8182;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8184[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4153(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4154(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
