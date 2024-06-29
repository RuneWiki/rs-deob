import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class329 {
   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "Lgw;"
   )
   private class179 field4696 = new class179(256);
   @OriginalMember(
      owner = "client!vn",
      name = "e",
      descriptor = "Ld;"
   )
   private class160 field4698;
   @OriginalMember(
      owner = "client!vn",
      name = "j",
      descriptor = "Lcs;"
   )
   private class357 field4704;
   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4706 = new String[]{method2550(method2549("a\u001c\u000f>-")), method2550(method2549("a\u001c\u000f9-")), method2550(method2549("l\\\u000fUx")), method2550(method2549("a\u001c\u000fGly\u001bUE-")), method2550(method2549("y\u0007M\u0017")), method2550(method2549("a\u001c\u000f8-")), method2550(method2549("a\u001c\u000f?-")), method2550(method2549("a\u001c\u000f:-"))};
   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "D"
   )
   public static double field4703;
   @OriginalMember(
      owner = "client!vn",
      name = "f",
      descriptor = "I"
   )
   public static int field4697;
   @OriginalMember(
      owner = "client!vn",
      name = "i",
      descriptor = "I"
   )
   public static int field4699;
   @OriginalMember(
      owner = "client!vn",
      name = "d",
      descriptor = "I"
   )
   public static int field4700;
   @OriginalMember(
      owner = "client!vn",
      name = "h",
      descriptor = "I"
   )
   public static int field4701;
   @OriginalMember(
      owner = "client!vn",
      name = "g",
      descriptor = "I"
   )
   public static int field4705;
   @OriginalMember(
      owner = "client!vn",
      name = "c",
      descriptor = "Lhw;"
   )
   public static class141 field4702;

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "(B)V",
      line = 6
   )
   public final void method2544(byte arg0) {
      try {
         this.field4696.method1579(105, 5);
         if (arg0 > -57) {
            this.field4704 = null;
         }

         ++field4705;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4706[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(II)Lnfa;",
      line = 17
   )
   public final class706 method2545(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field4701;
         Object var4 = this.field4696.method1584((long)arg0, 1);
         if (var4 != null) {
            return (class706)var4;
         } else if (!this.field4698.method1455(arg0, 9777)) {
            return null;
         } else {
            class693 var5;
            class706 var8;
            label77: {
               var5 = this.field4698.method1456(-8988, arg0);
               int var6 = var5.field10153 ? 64 : this.field4704.field5229;
               if (!var5.field10163 || !this.field4704.method410()) {
                  int[] var7;
                  label78: {
                     if (~var5.field10155 == -3 || !class557.method4152(var5.field10167, (byte)-124)) {
                        var7 = this.field4698.method1460(0.7F, var6, arg0, false, arg1 ^ -4612, var6);
                        if (!var3) {
                           break label78;
                        }
                     }

                     var7 = this.field4698.method1459(0.7F, true, var6, arg0, 123, var6);
                  }

                  var8 = this.field4704.method2766(var5.field10161 != 0, var6, var6, (byte)104, var7);
                  if (!var3) {
                     break label77;
                  }
               }

               float[] var9 = this.field4698.method1458(false, (byte)22, var6, arg0, var6, 0.7F);
               var8 = this.field4704.method2773(var6, class296.field4146, var9, var6, 1, ~var5.field10161 != -1);
            }

            var8.method884(var5.field10171, 123, var5.field10159);
            this.field4696.method1581((long)arg0, 0, var8);
            if (arg1 != -1935) {
               field4702 = null;
            }

            return var8;
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field4706[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "c",
      descriptor = "(B)V",
      line = 67
   )
   public final void method2546(byte arg0) {
      try {
         this.field4696.method1589((byte)70);
         if (arg0 != -1) {
            field4702 = null;
         }

         ++field4700;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4706[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(B)V",
      line = 79
   )
   public static void method2547(byte arg0) {
      try {
         field4702 = null;
         if (arg0 < 73) {
            method2547((byte)56);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4706[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(IB)Lpi;",
      line = 93
   )
   public static final class521 method2548(int arg0, byte arg1) {
      boolean var2 = client.field4564;

      try {
         ++field4699;
         class521[] var3 = class189.method1649((byte)117);
         if (arg1 != -27) {
            method2547((byte)-123);
         }

         int var4 = 0;
         if (!var2 && var3.length <= var4) {
            return null;
         } else {
            do {
               class521 var5 = var3[var4];
               if (var5.field7587 == arg0) {
                  return var5;
               }

               ++var4;
            } while(var3.length > var4);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4706[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "<init>",
      descriptor = "(Lcs;Ld;)V",
      line = 123
   )
   public class329(class357 arg0, class160 arg1) {
      try {
         this.field4698 = arg1;
         this.field4704 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4706[3] + (arg0 != null ? field4706[2] : field4706[4]) + ',' + (arg1 != null ? field4706[2] : field4706[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2549(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2550(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
