import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class428 {
   @OriginalMember(
      owner = "client!rm",
      name = "c",
      descriptor = "Lgw;"
   )
   private class179 field6192 = new class179(256);
   @OriginalMember(
      owner = "client!rm",
      name = "d",
      descriptor = "Ld;"
   )
   private class160 field6189;
   @OriginalMember(
      owner = "client!rm",
      name = "h",
      descriptor = "Lrk;"
   )
   private class35 field6186;
   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6194 = new String[]{method3237(method3236("\u0003\u0001il\u0013")), method3237(method3236("\u0003\u0001ii\u0013")), method3237(method3236("\u0003\u0001ih\u0013")), method3237(method3236("\u0003\u0001i\u0011R\u001f\u00053\u0013\u0013")), method3237(method3236("\nBi\u0003F")), method3237(method3236("\u001f\u0019+A")), method3237(method3236("\u0003\u0001io\u0013"))};
   @OriginalMember(
      owner = "client!rm",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field6191 = false;
   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "Leb;"
   )
   public static class650 field6190 = new class650(2, 4);
   @OriginalMember(
      owner = "client!rm",
      name = "i",
      descriptor = "I"
   )
   public static int field6193 = 0;
   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "I"
   )
   public static int field6185;
   @OriginalMember(
      owner = "client!rm",
      name = "e",
      descriptor = "I"
   )
   public static int field6187;
   @OriginalMember(
      owner = "client!rm",
      name = "f",
      descriptor = "I"
   )
   public static int field6188;

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(BI)Lkv;",
      line = 4
   )
   public final class281 method3231(byte arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field6185;
         Object var4 = this.field6192.method1584((long)arg1, 1);
         if (var4 != null) {
            return (class281)var4;
         } else if (!this.field6189.method1455(arg1, 9777)) {
            return null;
         } else if (arg0 != -38) {
            return null;
         } else {
            class693 var5;
            class281 var8;
            label78: {
               var5 = this.field6189.method1456(-8988, arg1);
               int var6 = var5.field10153 ? 64 : this.field6186.field720;
               if (!var5.field10163 || !this.field6186.method410()) {
                  int[] var7;
                  label79: {
                     if (~var5.field10155 == -3 || !class557.method4152(var5.field10167, (byte)-94)) {
                        var7 = this.field6189.method1460(0.7F, var6, arg1, false, arg0 + 5555, var6);
                        if (!var3) {
                           break label79;
                        }
                     }

                     var7 = this.field6189.method1459(0.7F, true, var6, arg1, arg0 ^ -93, var6);
                  }

                  var8 = new class281(this.field6186, 3553, 6408, var6, var6, var5.field10161 != 0, var7, 0, 0, false);
                  if (!var3) {
                     break label78;
                  }
               }

               float[] var9 = this.field6189.method1458(false, (byte)22, var6, arg1, var6, 0.7F);
               var8 = new class281(this.field6186, 3553, 34842, var6, var6, var5.field10161 != 0, var9, 6408);
            }

            var8.method2195(var5.field10159, (byte)-59, var5.field10171);
            this.field6192.method1581((long)arg1, 0, var8);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field6194[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(Lvca;)V",
      line = 52
   )
   public static final void method3232(class294 arg0) {
      if (arg0 != null) {
         for(int var1 = 0; var1 < 2; ++var1) {
            class294 var2 = null;

            for(class294 var3 = class529.field7698[var1]; var3 != null; var3 = var3.field4088) {
               if (arg0 == var3) {
                  if (var2 != null) {
                     var2.field4088 = var3.field4088;
                  } else {
                     class529.field7698[var1] = var3.field4088;
                  }

                  class186.field2818 = true;
                  return;
               }

               var2 = var3;
            }

            class294 var4 = null;

            for(class294 var5 = class559.field8137[var1]; var5 != null; var5 = var5.field4088) {
               if (arg0 == var5) {
                  if (var4 != null) {
                     var4.field4088 = var5.field4088;
                  } else {
                     class559.field8137[var1] = var5.field4088;
                  }

                  class186.field2818 = true;
                  return;
               }

               var4 = var5;
            }

            class294 var6 = null;

            for(class294 var7 = class389.field5744[var1]; var7 != null; var7 = var7.field4088) {
               if (arg0 == var7) {
                  if (var6 != null) {
                     var6.field4088 = var7.field4088;
                  } else {
                     class389.field5744[var1] = var7.field4088;
                  }

                  class186.field2818 = true;
                  return;
               }

               var6 = var7;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "(B)V",
      line = 129
   )
   public static void method3233(byte arg0) {
      try {
         int var1 = 6 % ((41 - arg0) / 50);
         field6190 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6194[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(B)V",
      line = 140
   )
   public final void method3234(byte arg0) {
      try {
         this.field6192.method1579(111, 5);
         ++field6188;
         if (arg0 != 110) {
            this.method3235(68);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6194[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(I)V",
      line = 152
   )
   public final void method3235(int arg0) {
      try {
         ++field6187;
         if (arg0 < 75) {
            this.field6186 = null;
         }

         this.field6192.method1589((byte)54);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6194[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "<init>",
      descriptor = "(Lrk;Ld;)V",
      line = 176
   )
   public class428(class35 arg0, class160 arg1) {
      try {
         this.field6189 = arg1;
         this.field6186 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6194[3] + (arg0 != null ? field6194[4] : field6194[5]) + ',' + (arg1 != null ? field6194[4] : field6194[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3236(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3237(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
