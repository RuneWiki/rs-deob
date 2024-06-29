import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class606 {
   @OriginalMember(
      owner = "client!uo",
      name = "j",
      descriptor = "I"
   )
   public int field8487;
   @OriginalMember(
      owner = "client!uo",
      name = "m",
      descriptor = "I"
   )
   public int field8484;
   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8495 = new String[]{method4430(method4429("]24\u0006|")), method4430(method4429("]24}=F4n\u007f|")), method4430(method4429("]24\u0005|")), method4430(method4429("]24\u0004|")), method4430(method4429("Ss4o)")), method4430(method4429("]24\u0000|")), method4430(method4429("F(v-")), method4430(method4429("]24\u0003|")), method4430(method4429("]24\u0007|")), method4430(method4429("]24\u0002|"))};
   @OriginalMember(
      owner = "client!uo",
      name = "i",
      descriptor = "Lw;"
   )
   public static class317 field8483 = new class317();
   @OriginalMember(
      owner = "client!uo",
      name = "d",
      descriptor = "[S"
   )
   public static short[] field8493 = new short[256];
   @OriginalMember(
      owner = "client!uo",
      name = "h",
      descriptor = "I"
   )
   public static int field8479;
   @OriginalMember(
      owner = "client!uo",
      name = "k",
      descriptor = "I"
   )
   public static int field8480;
   @OriginalMember(
      owner = "client!uo",
      name = "l",
      descriptor = "I"
   )
   public int field8481;
   @OriginalMember(
      owner = "client!uo",
      name = "o",
      descriptor = "I"
   )
   public static int field8486;
   @OriginalMember(
      owner = "client!uo",
      name = "p",
      descriptor = "I"
   )
   public static int field8488;
   @OriginalMember(
      owner = "client!uo",
      name = "g",
      descriptor = "I"
   )
   public int field8489;
   @OriginalMember(
      owner = "client!uo",
      name = "c",
      descriptor = "I"
   )
   public static int field8490;
   @OriginalMember(
      owner = "client!uo",
      name = "n",
      descriptor = "I"
   )
   public static int field8491;
   @OriginalMember(
      owner = "client!uo",
      name = "e",
      descriptor = "I"
   )
   public int field8492;
   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "I"
   )
   public static int field8494;
   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "Lkh;"
   )
   public class17 field8485;
   @OriginalMember(
      owner = "client!uo",
      name = "f",
      descriptor = "Luo;"
   )
   public class606 field8482;

   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4422(int arg0) {
      try {
         if (arg0 <= 0) {
            field8493 = null;
         }

         field8493 = null;
         field8483 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8495[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(ZII)V"
   )
   public static final void method4423(boolean arg0, int arg1, int arg2) {
      try {
         ++field8480;
         class772 var3 = !arg0 ? class38.field446 : class154.field1994;
         if (var3 != null && ~arg1 <= -1 && ~arg1 > ~var3.field11137) {
            class696 var4 = var3.field11132[arg1];
            if (~var4.field10170 == 0) {
               String var5 = var4.field10164;
               class223 var6 = class355.method2790(13111);
               if (arg2 < -108) {
                  class471 var7 = class133.method1118(var6.field2787, 2, class208.field2552);
                  var7.field6527.method4318(3 + class190.method1432(10524, var5), 0);
                  var7.field6527.method4318(!arg0 ? 0 : 1, 0);
                  var7.field6527.method4284(arg1, -31429);
                  var7.field6527.method4332((byte)-87, var5);
                  var6.method1702((byte)-118, var7);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field8495[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "([[[Lcea;I)V"
   )
   public static final void method4424(class225[][][] arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field8479;
         int var3 = 0;
         if (arg1 < 57) {
            field8493 = null;
            if (!var2 && ~var3 <= ~arg0.length) {
               return;
            }
         } else if (~var3 <= ~arg0.length) {
            return;
         }

         do {
            class225[][] var4 = arg0[var3];
            int var5 = 0;
            if (var2 || ~var4.length < ~var5) {
               do {
                  int var6 = 0;
                  if (var2 || ~var4[var5].length < ~var6) {
                     do {
                        class225 var7 = var4[var5][var6];
                        if (var7 == null) {
                           ++var6;
                        } else {
                           if (var7.field2820 instanceof class712) {
                              ((class712)var7.field2820).method2271(10190);
                           }

                           if (var7.field2824 instanceof class712) {
                              ((class712)var7.field2824).method2271(10190);
                              if (var7.field2822 instanceof class712) {
                                 ((class712)var7.field2822).method2271(10190);
                              }
                           } else if (var7.field2822 instanceof class712) {
                              ((class712)var7.field2822).method2271(10190);
                           }

                           if (var7.field2831 instanceof class712) {
                              ((class712)var7.field2831).method2271(10190);
                              if (var7.field2830 instanceof class712) {
                                 ((class712)var7.field2830).method2271(10190);
                              }
                           } else if (var7.field2830 instanceof class712) {
                              ((class712)var7.field2830).method2271(10190);
                           }

                           class752 var8 = var7.field2821;
                           class47 var9;
                           if (var2) {
                              var9 = var8.field10922;
                              if (var9 instanceof class712) {
                                 ((class712)var9).method2271(10190);
                              }

                              var8 = var8.field10923;
                           }

                           while(var8 != null) {
                              var9 = var8.field10922;
                              if (var9 instanceof class712) {
                                 ((class712)var9).method2271(10190);
                              }

                              var8 = var8.field10923;
                           }

                           ++var6;
                        }
                     } while(~var4[var5].length < ~var6);
                  }

                  ++var5;
               } while(~var4.length < ~var5);
            }

            ++var3;
         } while(~var3 > ~arg0.length);

      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field8495[7] + (arg0 != null ? field8495[4] : field8495[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(I)Lsb;"
   )
   public final class307 method4425(int arg0) {
      try {
         ++field8488;
         return arg0 != -1 ? null : class505.method3645(-101, this.field8487);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8495[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(II)Luo;"
   )
   public final class606 method4426(int arg0, int arg1) {
      try {
         ++field8491;
         if (arg1 < 25) {
            this.field8487 = 122;
         }

         return new class606(this.field8487, arg0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8495[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIILeb;)V"
   )
   public static final void method4427(int arg0, int arg1, int arg2, class657 arg3) {
      try {
         ++field8486;
         class423.field5944 = arg3;
         if (arg0 != 0) {
            method4423(false, 54, 113);
         }

         class310.field4111 = arg2;
         class249.field3122 = arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8495[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8495[4] : field8495[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4428(byte arg0) {
      try {
         int var1 = 46 % ((-35 - arg0) / 46);
         ++field8490;
         class558.field7654.method4245(true);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8495[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class606(int arg0, int arg1) {
      try {
         this.field8487 = arg0;
         this.field8484 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8495[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4429(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4430(char[] arg0) {
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
            var10005 = 93;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
