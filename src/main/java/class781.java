import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class781 {
   @OriginalMember(
      owner = "client!au",
      name = "m",
      descriptor = "Lsia;"
   )
   private class407 field11382 = new class407(256);
   @OriginalMember(
      owner = "client!au",
      name = "c",
      descriptor = "Liu;"
   )
   private class530 field11379;
   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "Ld;"
   )
   private class102 field11376;
   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11388 = new String[]{method5641(method5640("7\u0019\u001c\rO")), method5641(method5640("8\u0019^\"")), method5641(method5640("7\u0019\u001c\nO")), method5641(method5640("-B\u001c`\u001a")), method5641(method5640("7\u0019\u001c\u000fO")), method5641(method5640("7\u0019\u001c\u000bO")), method5641(method5640("7\u0019\u001c\bO")), method5641(method5640("7\u0019\u001c\tO")), method5641(method5640("7\u0019\u001c\fO")), method5641(method5640("7\u0019\u001cr\u000e8\u0005FpO"))};
   @OriginalMember(
      owner = "client!au",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field11374 = new class418(54, 4);
   @OriginalMember(
      owner = "client!au",
      name = "f",
      descriptor = "Llia;"
   )
   public static class633 field11380 = new class633(method5641(method5640("\u001a%d\u000b")), "", "", 0);
   @OriginalMember(
      owner = "client!au",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field11383 = new int[50];
   @OriginalMember(
      owner = "client!au",
      name = "h",
      descriptor = "I"
   )
   public static int field11385 = -1;
   @OriginalMember(
      owner = "client!au",
      name = "n",
      descriptor = "I"
   )
   public static int field11375;
   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "I"
   )
   public static int field11377;
   @OriginalMember(
      owner = "client!au",
      name = "j",
      descriptor = "I"
   )
   public static int field11378;
   @OriginalMember(
      owner = "client!au",
      name = "k",
      descriptor = "I"
   )
   public static int field11381;
   @OriginalMember(
      owner = "client!au",
      name = "i",
      descriptor = "I"
   )
   public static int field11384;
   @OriginalMember(
      owner = "client!au",
      name = "e",
      descriptor = "I"
   )
   public static int field11386;
   @OriginalMember(
      owner = "client!au",
      name = "l",
      descriptor = "Lfja;"
   )
   public static class201 field11387;

   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5633(int arg0) {
      try {
         this.field11382.method3201((byte)124);
         ++field11377;
         if (arg0 != 0) {
            this.method5633(-80);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11388[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(II)Ltia;"
   )
   public static final class17 method5634(int arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field11384;
         if (arg0 > -118) {
            method5636((String)null, -82, (char)65417);
         }

         class17[] var3 = class757.method5483(-111);
         int var4 = 0;
         if (!var2 && ~var4 <= ~var3.length) {
            return null;
         } else {
            do {
               class17 var5 = var3[var4];
               if (var5.field287 == arg1) {
                  return var5;
               }

               ++var4;
            } while(~var4 > ~var3.length);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11388[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "([Ljava/lang/Object;[IZ)V"
   )
   public static final void method5635(Object[] arg0, int[] arg1, boolean arg2) {
      try {
         class573.method4298(arg0, arg1, arg1.length + -1, 0, (byte)-124);
         ++field11378;
         if (arg2) {
            method5635((Object[])null, (int[])null, true);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11388[2] + (arg0 != null ? field11388[3] : field11388[1]) + ',' + (arg1 != null ? field11388[3] : field11388[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(Ljava/lang/String;IC)I"
   )
   public static final int method5636(String arg0, int arg1, char arg2) {
      boolean var3 = client.field1481;

      try {
         ++field11381;
         int var4 = 0;
         int var5 = arg0.length();
         int var6 = arg1;
         if (var3) {
            if (~arg2 == ~arg0.charAt(arg1)) {
               ++var4;
            }

            var6 = arg1 + 1;
         }

         while(true) {
            int var10000;
            if (var6 >= var5) {
               var10000 = var4;
               if (!var3) {
                  return var4;
               }
            } else {
               var10000 = ~arg2;
            }

            if (var10000 == ~arg0.charAt(var6)) {
               ++var4;
            }

            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field11388[7] + (arg0 != null ? field11388[3] : field11388[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5637(int arg0) {
      try {
         field11387 = null;
         field11380 = null;
         if (arg0 == 22953) {
            field11374 = null;
            field11383 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11388[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5638(int arg0) {
      try {
         ++field11386;
         if (arg0 != 0) {
            field11385 = 50;
         }

         this.field11382.method3197(5, 5);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11388[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "<init>",
      descriptor = "(Liu;Ld;)V"
   )
   public class781(class530 arg0, class102 arg1) {
      try {
         this.field11379 = arg0;
         this.field11376 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11388[9] + (arg0 != null ? field11388[3] : field11388[1]) + ',' + (arg1 != null ? field11388[3] : field11388[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(ZI)Lkk;"
   )
   public final class266 method5639(boolean arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field11375;
         Object var4 = this.field11382.method3192((long)arg1, (byte)-120);
         if (arg0) {
            return null;
         } else if (var4 != null) {
            return (class266)var4;
         } else if (!this.field11376.method915(arg1, 127)) {
            return null;
         } else {
            class668 var5;
            class266 var8;
            label76: {
               var5 = this.field11376.method911(arg1, -86);
               int var6 = !var5.field9901 ? this.field11379.field7629 : 64;
               if (!var5.field9896 || !this.field11379.method399()) {
                  int[] var7;
                  label47: {
                     if (~var5.field9898 != -3 && class188.method1575(var5.field9911, 118)) {
                        var7 = this.field11376.method913(var6, arg1, true, 127, 0.7F, var6);
                        if (!var3) {
                           break label47;
                        }
                     }

                     var7 = this.field11376.method914(arg1, var6, var6, false, 0.7F, true);
                  }

                  var8 = new class266(this.field11379, 3553, 6408, var6, var6, ~var5.field9900 != -1, var7, 0, 0, false);
                  if (!var3) {
                     break label76;
                  }
               }

               float[] var9 = this.field11376.method916(false, -29003, 0.7F, var6, var6, arg1);
               var8 = new class266(this.field11379, 3553, 34842, var6, var6, ~var5.field9900 != -1, var9, 6408);
            }

            var8.method2121(0, var5.field9902, var5.field9906);
            this.field11382.method3190(var8, (long)arg1, 8);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field11388[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5640(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5641(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
