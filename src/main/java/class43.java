import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class43 extends class606 {
   @OriginalMember(
      owner = "client!gja",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field651 = new String[]{method493(method492("%M6&\u0002j")), method493(method492("%M6&\bj")), method493(method492("%M6&\u0005j")), method493(method492(",R;d")), method493(method492("%M6&\u0001j")), method493(method492("9\ty&=")), method493(method492("%M6&\u0003j"))};
   @OriginalMember(
      owner = "client!gja",
      name = "G",
      descriptor = "I"
   )
   public static int field645;
   @OriginalMember(
      owner = "client!gja",
      name = "F",
      descriptor = "I"
   )
   public static int field646;
   @OriginalMember(
      owner = "client!gja",
      name = "I",
      descriptor = "I"
   )
   public static int field647;
   @OriginalMember(
      owner = "client!gja",
      name = "D",
      descriptor = "I"
   )
   public static int field649;
   @OriginalMember(
      owner = "client!gja",
      name = "E",
      descriptor = "I"
   )
   public static int field650;
   @OriginalMember(
      owner = "client!gja",
      name = "H",
      descriptor = "[Ljha;"
   )
   private class315[] field648;

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label109: {
            if (~arg1 != -1) {
               if (arg1 != 1) {
                  break label109;
               }

               super.field8641 = arg0.method665(false) == 1;
               if (!var4) {
                  break label109;
               }
            }

            this.field648 = new class315[arg0.method665(false)];
            int var5 = 0;
            if (var4 || var5 < this.field648.length) {
               do {
                  label93: {
                     int var6 = arg0.method665(false);
                     if (~var6 != -1) {
                        if (var6 == 1) {
                           break label93;
                        }

                        if (~var6 == -3) {
                           this.field648[var5] = class702.method5126(arg0, 19506);
                           if (var4) {
                              this.field648[var5] = class129.method1315(0, arg0);
                              ++var5;
                           } else {
                              ++var5;
                           }
                           continue;
                        }

                        if (var6 != 3) {
                           ++var5;
                           continue;
                        }

                        if (!var4) {
                           this.field648[var5] = class129.method1315(0, arg0);
                           ++var5;
                           continue;
                        }
                     }

                     this.field648[var5] = class650.method4739((byte)-99, arg0);
                     if (!var4) {
                        ++var5;
                        continue;
                     }
                  }

                  this.field648[var5] = class444.method3447(-85, arg0);
                  if (var4) {
                     this.field648[var5] = class702.method5126(arg0, 19506);
                     if (var4) {
                        this.field648[var5] = class129.method1315(0, arg0);
                        ++var5;
                     } else {
                        ++var5;
                     }
                  } else {
                     ++var5;
                  }
               } while(var5 < this.field648.length);
            }
         }

         ++field649;
         if (arg2 > -6) {
            this.field648 = null;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field651[4] + (arg0 != null ? field651[5] : field651[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "<init>",
      descriptor = "()V"
   )
   public class43() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      try {
         ++field650;
         if (arg0 != 0) {
            return null;
         } else {
            int[] var3 = super.field8645.method2632(arg1, 27230);
            if (super.field8645.field4884) {
               this.method491(super.field8645.method2629(true), false);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field651[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field645;
         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (arg0 != 373) {
            return null;
         } else {
            if (super.field8649.field11043) {
               int var5 = class563.field8014;
               int var6 = class451.field6570;
               int[][] var7 = new int[var6][var5];
               int[][][] var8 = super.field8649.method5541((byte)97);
               this.method491(var7, false);
               int var9 = 0;
               if (var3 || var9 < class451.field6570) {
                  do {
                     int[] var10 = var7[var9];
                     int[][] var11 = var8[var9];
                     int[] var12 = var11[0];
                     int[] var13 = var11[1];
                     int[] var14 = var11[2];
                     int var15 = 0;
                     if (var3 || ~class563.field8014 < ~var15) {
                        do {
                           int var16 = var10[var15];
                           var14[var15] = class697.method5101(var16, 255) << 4;
                           var13[var15] = class697.method5101(65280, var16) >> 4;
                           var12[var15] = class697.method5101(var16, 16711680) >> 12;
                           ++var15;
                        } while(~class563.field8014 < ~var15);
                     }

                     ++var9;
                  } while(var9 < class451.field6570);
               }
            }

            return var4;
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field651[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method490(byte arg0, int arg1) {
      try {
         ++field647;
         if (arg0 >= 104) {
            class111 var2 = class796.method5734(7, (long)arg1, (byte)-109);
            var2.method1083(-111);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field651[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "([[IZ)V"
   )
   private final void method491(int[][] arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         ++field646;
         int var4 = class563.field8014;
         int var5 = class451.field6570;
         if (!arg1) {
            class37.method418((byte)-82, arg0);
            class609.method4487(class358.field5293, class801.field11660, -107, 0, 0);
            if (this.field648 != null) {
               int var6 = 0;
               if (var3 || this.field648.length > var6) {
                  do {
                     class315 var7 = this.field648[var6];
                     int var8 = var7.field4718;
                     int var9 = var7.field4717;
                     if (~var8 <= -1) {
                        if (var9 < 0) {
                           var7.method1886((byte)-126, var4, var5);
                           if (!var3) {
                              ++var6;
                              continue;
                           }
                        }

                        var7.method1883(var5, var4, false);
                        if (var3) {
                           if (~var9 <= -1) {
                              var7.method1887(-1, var5, var4);
                           }

                           ++var6;
                        } else {
                           ++var6;
                        }
                     } else {
                        if (~var9 <= -1) {
                           var7.method1887(-1, var5, var4);
                        }

                        ++var6;
                     }
                  } while(this.field648.length > var6);

               }
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field651[6] + (arg0 != null ? field651[5] : field651[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method492(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method493(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
