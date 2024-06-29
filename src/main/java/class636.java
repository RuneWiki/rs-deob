import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class636 implements class770 {
   @OriginalMember(
      owner = "client!pe",
      name = "f",
      descriptor = "Lmu;"
   )
   private class318 field9302;
   @OriginalMember(
      owner = "client!pe",
      name = "j",
      descriptor = "[Lqa;"
   )
   private class261[] field9301;
   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9309 = new String[]{method4604(method4603("\u0000T5\"A")), method4604(method4603("\u001eDw\u0001")), method4604(method4603("\u0000T5Q\u0000\u001eXoSA")), method4604(method4603("\u000b\u001f5C\u0014")), method4604(method4603("\u0000T5)A")), method4604(method4603("\u0000T5.A")), method4604(method4603("\u0000T5'A")), method4604(method4603("\u0000T5=A")), method4604(method4603("\u0000T5#A")), method4604(method4603("\u0000T5/A")), method4604(method4603("\u0000T5%A")), method4604(method4603("\u0000T5,A"))};
   @OriginalMember(
      owner = "client!pe",
      name = "q",
      descriptor = "Lll;"
   )
   public static class387 field9304 = new class387();
   @OriginalMember(
      owner = "client!pe",
      name = "p",
      descriptor = "Lek;"
   )
   public static class536 field9305 = new class536(75, 3);
   @OriginalMember(
      owner = "client!pe",
      name = "b",
      descriptor = "I"
   )
   public static int field9308 = 4;
   @OriginalMember(
      owner = "client!pe",
      name = "d",
      descriptor = "I"
   )
   public static int field9307 = 0;
   @OriginalMember(
      owner = "client!pe",
      name = "g",
      descriptor = "I"
   )
   public static int field9292;
   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "I"
   )
   public static int field9293;
   @OriginalMember(
      owner = "client!pe",
      name = "k",
      descriptor = "I"
   )
   public static int field9295;
   @OriginalMember(
      owner = "client!pe",
      name = "m",
      descriptor = "I"
   )
   public static int field9296;
   @OriginalMember(
      owner = "client!pe",
      name = "c",
      descriptor = "I"
   )
   public static int field9297;
   @OriginalMember(
      owner = "client!pe",
      name = "i",
      descriptor = "I"
   )
   public static int field9298;
   @OriginalMember(
      owner = "client!pe",
      name = "o",
      descriptor = "I"
   )
   public static int field9299;
   @OriginalMember(
      owner = "client!pe",
      name = "e",
      descriptor = "I"
   )
   public static int field9300;
   @OriginalMember(
      owner = "client!pe",
      name = "n",
      descriptor = "Lha;"
   )
   private class66 field9303;
   @OriginalMember(
      owner = "client!pe",
      name = "l",
      descriptor = "Z"
   )
   private boolean field9294;
   @OriginalMember(
      owner = "client!pe",
      name = "h",
      descriptor = "[[I"
   )
   public static int[][] field9306;

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(B)I",
      line = 4
   )
   public final int method3862(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field9299;
         int var3 = 0;
         if (arg0 > -93) {
            return 78;
         } else {
            class261[] var4 = this.field9301;
            int var5 = 0;
            class261 var6;
            if (var2) {
               var6 = var4[var5];
               if (var6 != null) {
                  if (var6.method860(9201)) {
                     ++var3;
                  }
               } else {
                  ++var3;
               }

               ++var5;
            }

            while(~var5 > ~var4.length) {
               var6 = var4[var5];
               if (var6 != null) {
                  if (var6.method860(9201)) {
                     ++var3;
                  }
               } else {
                  ++var3;
               }

               ++var5;
            }

            return var3 * 100 / this.field9301.length;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field9309[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(BJ)Z",
      line = 31
   )
   public final boolean method3866(byte arg0, long arg1) {
      try {
         ++field9300;
         if (arg0 != 76) {
            field9307 = 116;
         }

         return class133.method1054(-29025) >= (long)this.field9302.field4332 + arg1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9309[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(II)Z",
      line = 46
   )
   public static final boolean method4600(int arg0, int arg1) {
      try {
         if (arg0 > -119) {
            return true;
         } else {
            ++field9295;
            return ~arg1 == -8 || arg1 == 9;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9309[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "([Lbg;B)V",
      line = 60
   )
   public static final void method4601(class492[] param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(IZ)V",
      line = 89
   )
   public final void method3870(int arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         boolean var9 = true;
         ++field9293;
         class261[] var4 = this.field9301;
         if (arg0 != -21996) {
            this.method3862((byte)101);
         }

         int var5 = 0;
         if (!var3 && ~var5 <= ~var4.length) {
            this.field9294 = false;
         } else {
            do {
               class261 var6 = var4[var5];
               if (var6 != null) {
                  if (!var9) {
                     if (!this.field9294) {
                        var6.method861((byte)-84, false);
                        ++var5;
                     } else {
                        var6.method861((byte)-84, true);
                        ++var5;
                     }
                  } else {
                     var6.method861((byte)-84, true);
                     ++var5;
                  }
               } else {
                  ++var5;
               }
            } while(~var5 > ~var4.length);

            this.field9294 = false;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field9309[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "b",
      descriptor = "(I)I",
      line = 115
   )
   public final int method3857(int arg0) {
      try {
         ++field9297;
         if (arg0 != -23485) {
            method4600(-95, 36);
         }

         return this.field9302.field4333;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9309[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "c",
      descriptor = "(B)V",
      line = 127
   )
   public static void method4602(byte arg0) {
      try {
         field9305 = null;
         field9304 = null;
         if (arg0 != -86) {
            method4602((byte)16);
         }

         field9306 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9309[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(I)V",
      line = 140
   )
   public final void method3865(int arg0) {
      try {
         if (arg0 == -32047) {
            ++field9298;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9309[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "b",
      descriptor = "(B)V",
      line = 150
   )
   public final void method3864(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field9296;
         if (class383.field5543 != this.field9303) {
            this.field9303 = class383.field5543;
            this.field9294 = true;
         }

         this.field9303.method495(0);
         class261[] var3 = this.field9301;
         int var4 = 0;
         if (!var2 && var3.length <= var4) {
            if (arg0 != 1) {
               this.method3865(-59);
            }
         } else {
            do {
               class261 var5 = var3[var4];
               if (var5 != null) {
                  var5.method862(arg0 ^ -23682);
               }

               ++var4;
            } while(var3.length > var4);

            if (arg0 != 1) {
               this.method3865(-59);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9309[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "(Lmu;Lra;)V",
      line = 185
   )
   public class636(class318 param1, class119 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4603(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4604(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
