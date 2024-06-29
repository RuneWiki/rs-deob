import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class321 extends class347 implements class114 {
   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4590 = new String[]{method2434(method2433("qw\u0017t\u0010")), method2434(method2433("qw\u0017w\u0010")), method2434(method2433("qw\u0017q\u0010")), method2434(method2433("qw\u0017u\u0010")), method2434(method2433("qw\u0017p\u0010")), method2434(method2433("qw\u0017{\u0010")), method2434(method2433("qw\u0017r\u0010")), method2434(method2433("qw\u0017v\u0010"))};
   @OriginalMember(
      owner = "client!bv",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field4583 = true;
   @OriginalMember(
      owner = "client!bv",
      name = "q",
      descriptor = "[Lfs;"
   )
   public static class581[] field4575 = new class581[50];
   @OriginalMember(
      owner = "client!bv",
      name = "v",
      descriptor = "C"
   )
   public char field4587;
   @OriginalMember(
      owner = "client!bv",
      name = "n",
      descriptor = "I"
   )
   public static int field4576;
   @OriginalMember(
      owner = "client!bv",
      name = "j",
      descriptor = "I"
   )
   public int field4578;
   @OriginalMember(
      owner = "client!bv",
      name = "u",
      descriptor = "I"
   )
   public int field4579;
   @OriginalMember(
      owner = "client!bv",
      name = "o",
      descriptor = "I"
   )
   public static int field4580;
   @OriginalMember(
      owner = "client!bv",
      name = "i",
      descriptor = "I"
   )
   public static int field4581;
   @OriginalMember(
      owner = "client!bv",
      name = "m",
      descriptor = "I"
   )
   public static int field4582;
   @OriginalMember(
      owner = "client!bv",
      name = "w",
      descriptor = "I"
   )
   public static int field4585;
   @OriginalMember(
      owner = "client!bv",
      name = "r",
      descriptor = "I"
   )
   public int field4586;
   @OriginalMember(
      owner = "client!bv",
      name = "t",
      descriptor = "I"
   )
   public static int field4588;
   @OriginalMember(
      owner = "client!bv",
      name = "k",
      descriptor = "I"
   )
   public static int field4589;
   @OriginalMember(
      owner = "client!bv",
      name = "l",
      descriptor = "J"
   )
   public long field4577;
   @OriginalMember(
      owner = "client!bv",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field4584;

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(Z)I",
      line = 5
   )
   public final int method956(boolean arg0) {
      try {
         if (!arg0) {
            return 18;
         } else {
            ++field4576;
            return this.field4586;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4590[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "b",
      descriptor = "(III)Z",
      line = 19
   )
   public static final boolean method2430(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 50) {
            method2430(-127, 93, -19);
         }

         ++field4581;
         return false;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4590[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "b",
      descriptor = "(Z)V",
      line = 30
   )
   public static final void method2431(boolean arg0) {
      int var1 = client.field4530;

      try {
         if (arg0) {
            ++field4585;
            class372 var2 = (class372)class699.field10495.method4071((byte)126);
            if (var1 != 0 || var2 != null) {
               do {
                  label81: {
                     class1 var3 = var2.field5658;
                     if (~var3.field16 <= ~class314.field4488) {
                        if (~class314.field4488 > ~var3.field19) {
                           break label81;
                        }

                        var3.method13((byte)6);
                        if (~var3.field40 < -1) {
                           class726 var4 = (class726)class259.field3509.method5681((long)(var3.field40 - 1), -1);
                           if (var4 != null) {
                              class155 var5 = var4.field10794;
                              if (var5.field9003 >= 0 && class323.field4603 * 512 > var5.field9003 && ~var5.field9007 <= -1 && ~var5.field9007 > ~(class178.field2197 * 512)) {
                                 var3.method7(var5.field9003, class314.field4488, var5.field9007, class368.method2858(var5.field9007, (byte)-11, var5.field9003, var3.field9010) + -var3.field49, -21);
                              }
                           }
                        }

                        if (~var3.field40 > -1) {
                           class687 var7;
                           label75: {
                              int var6 = -var3.field40 + -1;
                              if (class741.field10996 == var6) {
                                 var7 = class693.field10418;
                                 if (var1 == 0) {
                                    break label75;
                                 }
                              }

                              var7 = class661.field9578[var6];
                           }

                           if (var7 != null && ~var7.field9003 <= -1 && ~(class323.field4603 * 512) < ~var7.field9003 && var7.field9007 >= 0 && ~var7.field9007 > ~(class178.field2197 * 512)) {
                              var3.method7(var7.field9003, class314.field4488, var7.field9007, class368.method2858(var7.field9007, (byte)-11, var7.field9003, var3.field9010) + -var3.field49, -75);
                           }
                        }

                        var3.method8((byte)88, class65.field800);
                        class117.method978(var3, true);
                        if (var1 == 0) {
                           break label81;
                        }
                     }

                     var2.method2720(0);
                     var3.method22((byte)-39);
                  }

                  var2 = (class372)class699.field10495.method4059((byte)-24);
               } while(var2 != null);

            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field4590[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(B)I",
      line = 98
   )
   public final int method959(byte arg0) {
      try {
         ++field4588;
         if (arg0 > -67) {
            this.method958(103);
         }

         return this.field4579;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4590[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "e",
      descriptor = "(I)V",
      line = 112
   )
   public static void method2432(int arg0) {
      try {
         field4575 = null;
         if (arg0 != -1) {
            method2430(-57, -25, -25);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4590[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "b",
      descriptor = "(B)I",
      line = 137
   )
   public final int method957(byte arg0) {
      try {
         if (arg0 != 57) {
            this.method956(false);
         }

         ++field4582;
         return this.field4578;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4590[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(I)C",
      line = 148
   )
   public final char method958(int arg0) {
      try {
         ++field4580;
         if (arg0 != 22585) {
            method2430(110, 14, -99);
         }

         return this.field4587;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4590[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "b",
      descriptor = "(I)J",
      line = 159
   )
   public final long method955(int arg0) {
      try {
         if (arg0 >= -44) {
            field4575 = null;
         }

         ++field4589;
         return this.field4577;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4590[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2433(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2434(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
