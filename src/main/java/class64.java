import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class64 extends class25 {
   @OriginalMember(
      owner = "client!tga",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field796 = new String[]{method530(method529("|[\u001e\u000b\u0001 ")), method530(method529("|[\u001e\u000b\u0006 ")), method530(method529("|[\u001e\u000b\f ")), method530(method529("fI\u0013I")), method530(method529("s\u0012Q\u000b7")), method530(method529("|[\u001e\u000b\r ")), method530(method529("|[\u001e\u000b\u0002 ")), method530(method529("|[\u001e\u000b\u000e "))};
   @OriginalMember(
      owner = "client!tga",
      name = "y",
      descriptor = "Lsd;"
   )
   public static class101 field790 = new class101(47, 0);
   @OriginalMember(
      owner = "client!tga",
      name = "t",
      descriptor = "I"
   )
   public static int field792 = 0;
   @OriginalMember(
      owner = "client!tga",
      name = "r",
      descriptor = "[S"
   )
   public static short[] field795 = new short[]{13, 46, 47, 60, 18, 9, 19, 12};
   @OriginalMember(
      owner = "client!tga",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field794 = false;
   @OriginalMember(
      owner = "client!tga",
      name = "q",
      descriptor = "Lcs;"
   )
   public static class358 field793 = new class358();
   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "I"
   )
   public static int field785;
   @OriginalMember(
      owner = "client!tga",
      name = "w",
      descriptor = "I"
   )
   public static int field786;
   @OriginalMember(
      owner = "client!tga",
      name = "u",
      descriptor = "I"
   )
   public static int field787;
   @OriginalMember(
      owner = "client!tga",
      name = "x",
      descriptor = "I"
   )
   public static int field788;
   @OriginalMember(
      owner = "client!tga",
      name = "v",
      descriptor = "I"
   )
   public static int field791;
   @OriginalMember(
      owner = "client!tga",
      name = "p",
      descriptor = "[Llu;"
   )
   public static class741[] field789;

   @OriginalMember(
      owner = "client!tga",
      name = "b",
      descriptor = "(Z)V",
      line = 3
   )
   public static final void method525(boolean arg0) {
      int var1 = client.field4530;

      try {
         label30: {
            ++field785;
            if (class786.field11439.method545()) {
               label27: {
                  class786.field11439.method620(class769.field11271);
                  class661.method4747(-2236);
                  if (class446.field6785) {
                     class788.method5656(-119, class769.field11271);
                     if (var1 == 0) {
                        break label27;
                     }
                  }

                  Dimension var2 = class769.field11271.getSize();
                  class786.field11439.method601(class769.field11271, var2.width, var2.height);
               }

               class786.field11439.method571(class769.field11271);
               if (var1 == 0) {
                  break label30;
               }
            }

            class428.method3261(false, -128, class261.field3566.field9464.method4225(114));
         }

         class491.method3635((byte)-19);
         if (arg0) {
            field794 = true;
         }

         class321.field4583 = true;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field796[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(IIZI)V",
      line = 34
   )
   public static final void method526(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         int var7 = arg1 << 3;
         ++field786;
         int var8 = arg3 << 3;
         int var6 = arg0 << 3;
         class317.field4533 = (float)var8;
         if (~class675.field10142 == -3) {
            class503.field7464 = var7;
            class292.field4078 = var6;
            class713.field10637 = var8;
         }

         class56.field706 = (float)var6;
         if (arg2) {
            method526(61, 35, false, 42);
         }

         class383.method2947(31332);
         class630.field9159 = true;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field796[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(IZBI)V",
      line = 58
   )
   public final void method171(int arg0, boolean arg1, byte arg2, int arg3) {
      try {
         class786.field11439.method553(arg0 + -2, arg3, super.field263.field5645 + 4, super.field263.field5637 + 2, ((class665)super.field263).field9663, 0);
         ++field791;
         class786.field11439.method553(arg0 - 1, arg3 + 1, super.field263.field5645 + 2, super.field263.field5637, 0, 0);
         if (arg2 <= 6) {
            method528(76);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field796[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(ILdh;II[I[I)Lmia;",
      line = 70
   )
   public static final class69 method527(int arg0, class338 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
      int var6 = client.field4530;

      try {
         int var7 = -30 / ((arg0 - -16) / 33);
         ++field788;
         if (!arg1.method2597(class513.field7519, class740.field10984, (byte)-109)) {
            int[] var12 = new int[arg2 * arg3];
            int var13 = 0;
            if (var6 == 0 && ~var13 <= ~arg3) {
               return new class69(arg1, arg2, arg3, var12);
            } else {
               do {
                  int var14 = arg2 * var13 + arg4[var13];
                  int var15 = 0;
                  if (var6 != 0) {
                     var12[var14++] = -16777216;
                     ++var15;
                  }

                  while(true) {
                     while(arg5[var13] > var15) {
                        var12[var14++] = -16777216;
                        ++var15;
                     }

                     if (var6 == 0) {
                        ++var13;
                        break;
                     }

                     ++var15;
                  }
               } while(~var13 > ~arg3);

               return new class69(arg1, arg2, arg3, var12);
            }
         } else {
            byte[] var8 = new byte[arg2 * arg3];
            int var9 = 0;
            if (var6 == 0 && arg3 <= var9) {
               return new class69(arg1, arg2, arg3, var8);
            } else {
               do {
                  int var10 = arg2 * var9 + arg4[var9];
                  int var11 = 0;
                  if (var6 != 0) {
                     var8[var10++] = -1;
                     ++var11;
                  }

                  while(true) {
                     while(~arg5[var9] < ~var11) {
                        var8[var10++] = -1;
                        ++var11;
                     }

                     if (var6 == 0) {
                        ++var9;
                        break;
                     }

                     ++var11;
                  }
               } while(arg3 > var9);

               return new class69(arg1, arg2, arg3, var8);
            }
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field796[2] + arg0 + ',' + (arg1 != null ? field796[4] : field796[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field796[4] : field796[3]) + ',' + (arg5 != null ? field796[4] : field796[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "<init>",
      descriptor = "(Leaa;Leaa;Lav;)V",
      line = 128
   )
   public class64(class526 arg0, class526 arg1, class665 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(IIBZ)V",
      line = 134
   )
   public final void method169(int arg0, int arg1, byte arg2, boolean arg3) {
      try {
         ++field787;
         int var5 = 121 / ((16 - arg2) / 58);
         int var6 = this.method164((byte)107) * super.field263.field5645 / 10000;
         class786.field11439.method645(arg1, arg0 - -2, var6, super.field263.field5637 + -2, ((class665)super.field263).field9666, 0);
         class786.field11439.method645(arg1 - -var6, arg0 + 2, super.field263.field5645 - var6, super.field263.field5637 - 2, 0, 0);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field796[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "b",
      descriptor = "(I)V",
      line = 147
   )
   public static void method528(int arg0) {
      try {
         field789 = null;
         field793 = null;
         field795 = null;
         field790 = null;
         if (arg0 > -12) {
            method527(-15, (class338)null, -9, 34, (int[])null, (int[])null);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field796[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method530(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
