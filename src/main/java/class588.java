import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class class588 extends class22 {
   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8502 = new String[]{method4357(method4356("P\u0010J\"!")), method4357(method4356("P\u0010J!!"))};
   @OriginalMember(
      owner = "client!wm",
      name = "j",
      descriptor = "I"
   )
   public static int field8497 = 0;
   @OriginalMember(
      owner = "client!wm",
      name = "o",
      descriptor = "F"
   )
   public static float field8498 = 0.0F;
   @OriginalMember(
      owner = "client!wm",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field8500 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @OriginalMember(
      owner = "client!wm",
      name = "k",
      descriptor = "I"
   )
   public static int field8499;
   @OriginalMember(
      owner = "client!wm",
      name = "l",
      descriptor = "I"
   )
   public static int field8501;
   @OriginalMember(
      owner = "client!wm",
      name = "n",
      descriptor = "Leu;"
   )
   public static class503 field8496;

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(BLuda;)V"
   )
   public abstract void method133(byte arg0, class473 arg1);

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4354(byte arg0) {
      try {
         if (arg0 == -31) {
            field8496 = null;
            field8500 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8502[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(Lwga;I)V"
   )
   public abstract void method135(class778 arg0, int arg1);

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method4355(long arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field8501;
         int var4 = class342.field4855 + class304.field4398.field4101;
         int var5 = class545.field7892 + class304.field4398.field4096;
         if (~(-var4 + class587.field8484) > 1999 || ~(-var4 + class587.field8484) < -2001 || -var5 + class243.field3500 < -2000 || ~(-var5 + class243.field3500) < -2001) {
            class587.field8484 = var4;
            class243.field3500 = var5;
         }

         if (~class587.field8484 != ~var4) {
            int var7;
            label95: {
               int var6 = -class587.field8484 + var4;
               var7 = (int)((long)var6 * arg0 / 320L);
               if (var6 <= 0) {
                  if (var7 != 0) {
                     if (var6 <= var7) {
                        break label95;
                     }

                     var7 = var6;
                     if (!var3) {
                        break label95;
                     }
                  }

                  var7 = -1;
                  if (!var3) {
                     break label95;
                  }
               }

               if (~var7 == -1) {
                  var7 = 1;
                  if (!var3) {
                     break label95;
                  }
               }

               if (var7 > var6) {
                  var7 = var6;
               }
            }

            class587.field8484 += var7;
         }

         if (~class243.field3500 != ~var5) {
            int var9;
            label96: {
               int var8 = -class243.field3500 + var5;
               var9 = (int)((long)var8 * arg0 / 320L);
               if (var8 > 0) {
                  if (~var9 == -1) {
                     var9 = 1;
                     if (!var3) {
                        break label96;
                     }
                  }

                  if (var8 >= var9) {
                     break label96;
                  }

                  var9 = var8;
                  if (!var3) {
                     break label96;
                  }
               }

               if (~var9 != -1) {
                  if (~var8 >= ~var9) {
                     break label96;
                  }

                  var9 = var8;
                  if (!var3) {
                     break label96;
                  }
               }

               var9 = -1;
            }

            class243.field3500 += var9;
         }

         class621.field9035 += (float)arg0 * class348.field4948 / 6.0F;
         class756.field10975 += (float)arg0 * field8498 / 6.0F;
         class693.method5038((byte)14);
         if (arg1 != -2001) {
            method4355(-125L, -48);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field8502[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4356(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4357(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
