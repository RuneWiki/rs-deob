import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class464 extends class606 {
   @OriginalMember(
      owner = "client!it",
      name = "H",
      descriptor = "I"
   )
   private int field6748 = 4096;
   @OriginalMember(
      owner = "client!it",
      name = "I",
      descriptor = "I"
   )
   private int field6751 = 0;
   @OriginalMember(
      owner = "client!it",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6754 = new String[]{method3575(method3574("\u0019w\u0007\u001b\u000f")), method3575(method3574("\u001evE6")), method3575(method3574("\u000b-\u0007tZ")), method3575(method3574("\u0019w\u0007\u0018\u000f")), method3575(method3574("\u0019w\u0007\u0012\u000f")), method3575(method3574("\u0019w\u0007\u0019\u000f"))};
   @OriginalMember(
      owner = "client!it",
      name = "F",
      descriptor = "Lhha;"
   )
   public static class724 field6750 = new class724(32, 3);
   @OriginalMember(
      owner = "client!it",
      name = "J",
      descriptor = "I"
   )
   public static int field6752 = -1;
   @OriginalMember(
      owner = "client!it",
      name = "E",
      descriptor = "I"
   )
   public static int field6747;
   @OriginalMember(
      owner = "client!it",
      name = "G",
      descriptor = "I"
   )
   public static int field6749;
   @OriginalMember(
      owner = "client!it",
      name = "D",
      descriptor = "I"
   )
   public static int field6753;

   @OriginalMember(
      owner = "client!it",
      name = "<init>",
      descriptor = "()V"
   )
   public class464() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field6747;
         int[] var4 = super.field8645.method2632(arg1, arg0 ^ 27230);
         if (super.field8645.field4884) {
            int[] var5 = this.method4463(arg1, 13064, 0);
            int var6 = 0;
            if (var3 || class563.field8014 > var6) {
               do {
                  int var7 = var5[var6];
                  if (~var7 <= ~this.field6751) {
                     if (var7 > this.field6748) {
                        var4[var6] = this.field6748;
                        if (!var3) {
                           ++var6;
                           continue;
                        }
                     }

                     var4[var6] = var7;
                     if (var3) {
                        var4[var6] = this.field6751;
                        ++var6;
                     } else {
                        ++var6;
                     }
                  } else {
                     var4[var6] = this.field6751;
                     ++var6;
                  }
               } while(class563.field8014 > var6);
            }
         }

         return arg0 != 0 ? null : var4;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field6754[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3573(int arg0) {
      try {
         field6750 = null;
         int var1 = 7 % ((-28 - arg0) / 49);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6754[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field6753;
         int[][] var4 = super.field8649.method5536(arg0 ^ 23627, arg1);
         if (arg0 != 373) {
            field6750 = null;
         }

         if (super.field8649.field11043) {
            int[][] var5 = this.method4467(0, arg1, (byte)77);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || ~class563.field8014 < ~var12) {
               do {
                  int var13 = var6[var12];
                  int var14 = var7[var12];
                  int var15 = var8[var12];
                  if (this.field6751 <= var13) {
                     if (~var13 < ~this.field6748) {
                        var9[var12] = this.field6748;
                        if (var3) {
                           var9[var12] = var13;
                           if (var3) {
                              var9[var12] = this.field6751;
                           }
                        }
                     } else {
                        var9[var12] = var13;
                        if (var3) {
                           var9[var12] = this.field6751;
                        }
                     }
                  } else {
                     var9[var12] = this.field6751;
                  }

                  if (var14 >= this.field6751) {
                     if (~var14 >= ~this.field6748) {
                        var10[var12] = var14;
                        if (var3) {
                           var10[var12] = this.field6748;
                           if (var3) {
                              var10[var12] = this.field6751;
                           }
                        }
                     } else {
                        var10[var12] = this.field6748;
                        if (var3) {
                           var10[var12] = this.field6751;
                        }
                     }
                  } else {
                     var10[var12] = this.field6751;
                  }

                  if (~this.field6751 < ~var15) {
                     var11[var12] = this.field6751;
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  if (var15 > this.field6748) {
                     var11[var12] = this.field6748;
                     if (var3) {
                        var11[var12] = var15;
                        ++var12;
                     } else {
                        ++var12;
                     }
                  } else {
                     var11[var12] = var15;
                     ++var12;
                  }
               } while(~class563.field8014 < ~var12);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field6754[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label57: {
            label51: {
               label50: {
                  if (~arg1 != -1) {
                     if (arg1 == 1) {
                        break label50;
                     }

                     if (~arg1 != -3) {
                        break label57;
                     }

                     if (!var4) {
                        break label51;
                     }
                  }

                  this.field6751 = arg0.method685(-2);
                  if (!var4) {
                     break label57;
                  }
               }

               this.field6748 = arg0.method685(-2);
               if (!var4) {
                  break label57;
               }
            }

            super.field8641 = ~arg0.method665(false) == -2;
         }

         if (arg2 >= -6) {
            this.method8((class65)null, -88, -88);
         }

         ++field6749;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6754[0] + (arg0 != null ? field6754[2] : field6754[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3574(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!it",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3575(char[] arg0) {
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
            var10005 = 3;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
