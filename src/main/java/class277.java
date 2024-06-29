import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class277 extends class606 {
   @OriginalMember(
      owner = "client!qp",
      name = "D",
      descriptor = "I"
   )
   private int field4186 = 2048;
   @OriginalMember(
      owner = "client!qp",
      name = "M",
      descriptor = "I"
   )
   private int field4189 = 0;
   @OriginalMember(
      owner = "client!qp",
      name = "J",
      descriptor = "I"
   )
   private int field4188 = 8192;
   @OriginalMember(
      owner = "client!qp",
      name = "G",
      descriptor = "I"
   )
   private int field4195 = 12288;
   @OriginalMember(
      owner = "client!qp",
      name = "L",
      descriptor = "I"
   )
   private int field4192 = 2048;
   @OriginalMember(
      owner = "client!qp",
      name = "R",
      descriptor = "I"
   )
   private int field4196 = 4096;
   @OriginalMember(
      owner = "client!qp",
      name = "N",
      descriptor = "I"
   )
   private int field4197 = 0;
   @OriginalMember(
      owner = "client!qp",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4201 = new String[]{method2336(method2335("KJ\u0000\\+")), method2336(method2335("KJ\u0000]+")), method2336(method2335("KJ\u0000S+")), method2336(method2335("KJ\u0000W+")), method2336(method2335("KJ\u0000_+")), method2336(method2335("A\u0014\u0000:~")), method2336(method2335("KJ\u0000U+")), method2336(method2335("TOBx")), method2336(method2335("KJ\u0000Q+"))};
   @OriginalMember(
      owner = "client!qp",
      name = "I",
      descriptor = "I"
   )
   public static int field4200 = 0;
   @OriginalMember(
      owner = "client!qp",
      name = "F",
      descriptor = "I"
   )
   public static int field4187;
   @OriginalMember(
      owner = "client!qp",
      name = "O",
      descriptor = "I"
   )
   public static int field4190;
   @OriginalMember(
      owner = "client!qp",
      name = "P",
      descriptor = "I"
   )
   public static int field4191;
   @OriginalMember(
      owner = "client!qp",
      name = "K",
      descriptor = "I"
   )
   public static int field4193;
   @OriginalMember(
      owner = "client!qp",
      name = "H",
      descriptor = "I"
   )
   public static int field4194;
   @OriginalMember(
      owner = "client!qp",
      name = "E",
      descriptor = "I"
   )
   public static int field4199;
   @OriginalMember(
      owner = "client!qp",
      name = "Q",
      descriptor = "[[B"
   )
   public static byte[][] field4198;

   @OriginalMember(
      owner = "client!qp",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2331(int arg0) {
      try {
         field4198 = null;
         if (arg0 >= -102) {
            method2334(14);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4201[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "<init>",
      descriptor = "()V"
   )
   public class277() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!qp",
      name = "b",
      descriptor = "(III)Z"
   )
   private final boolean method2332(int arg0, int arg1, int arg2) {
      try {
         ++field4193;
         int var4 = (arg0 + arg2) * this.field4195 >> 12;
         if (arg1 != -2048) {
            method2331(-107);
         }

         int var5 = class458.field6687[(var4 * 255 & 1044636) >> 12];
         int var6 = (var5 << 12) / this.field4195;
         int var7 = (var6 << 12) / this.field4188;
         int var8 = this.field4196 * var7 >> 12;
         return -arg2 + arg0 < var8 && -var8 < -arg2 + arg0;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field4201[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field4191;
         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int var5 = class693.field10001[arg1] - 2048;
            int var6 = 0;
            if (var3 || var6 < class563.field8014) {
               do {
                  int var7 = class387.field5650[var6] + -2048;
                  int var8 = var7 - -this.field4192;
                  int var9 = ~var8 <= 2047 ? var8 : var8 + 4096;
                  int var10 = ~var9 < -2049 ? var9 + -4096 : var9;
                  int var11 = var5 - -this.field4197;
                  int var12 = var11 >= -2048 ? var11 : var11 + 4096;
                  int var13 = var12 <= 2048 ? var12 : var12 + -4096;
                  int var14 = this.field4189 + var7;
                  int var15 = var14 < -2048 ? var14 - -4096 : var14;
                  int var16 = var15 > 2048 ? var15 + -4096 : var15;
                  int var17 = this.field4186 + var5;
                  int var18 = var17 < -2048 ? var17 - -4096 : var17;
                  int var19 = ~var18 < -2049 ? var18 + -4096 : var18;
                  var4[var6] = !this.method2333(true, var13, var10) ? (this.method2332(var19, -2048, var16) ? 4096 : 0) : 4096;
                  ++var6;
               } while(var6 < class563.field8014);
            }
         }

         if (arg0 != 0) {
            this.field4197 = -7;
         }

         return var4;
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field4201[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(ZII)Z"
   )
   private final boolean method2333(boolean arg0, int arg1, int arg2) {
      try {
         ++field4187;
         if (!arg0) {
            this.method270((byte)-79);
         }

         int var4 = (-arg2 + arg1) * this.field4195 >> 12;
         int var5 = class458.field6687[(var4 * 255 & 1048076) >> 12];
         int var6 = (var5 << 12) / this.field4195;
         int var7 = (var6 << 12) / this.field4188;
         int var8 = this.field4196 * var7 >> 12;
         return ~(arg2 - -arg1) > ~var8 && -var8 < arg1 + arg2;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field4201[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         ++field4199;
         class22.method299(4096);
         if (arg0 < 118) {
            this.field4197 = -120;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4201[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         if (arg2 < -6) {
            label81: {
               label80: {
                  label79: {
                     label78: {
                        label77: {
                           label76: {
                              label75: {
                                 if (arg1 != 0) {
                                    if (~arg1 == -2) {
                                       break label75;
                                    }

                                    if (~arg1 == -3) {
                                       break label76;
                                    }

                                    if (~arg1 == -4) {
                                       break label77;
                                    }

                                    if (arg1 == 4) {
                                       break label78;
                                    }

                                    if (arg1 == 5) {
                                       break label79;
                                    }

                                    if (arg1 != 6) {
                                       break label81;
                                    }

                                    if (!var4) {
                                       break label80;
                                    }
                                 }

                                 this.field4192 = arg0.method685(-2);
                                 if (!var4) {
                                    break label81;
                                 }
                              }

                              this.field4197 = arg0.method685(-2);
                              if (!var4) {
                                 break label81;
                              }
                           }

                           this.field4189 = arg0.method685(-2);
                           if (!var4) {
                              break label81;
                           }
                        }

                        this.field4186 = arg0.method685(-2);
                        if (!var4) {
                           break label81;
                        }
                     }

                     this.field4195 = arg0.method685(-2);
                     if (!var4) {
                        break label81;
                     }
                  }

                  this.field4196 = arg0.method685(-2);
                  if (!var4) {
                     break label81;
                  }
               }

               this.field4188 = arg0.method685(-2);
            }

            ++field4190;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4201[6] + (arg0 != null ? field4201[5] : field4201[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method2334(int arg0) {
      try {
         class492.field7022 = "";
         class226.field3216 = "";
         ++field4194;
         if (arg0 != 0) {
            method2331(-51);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4201[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2335(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2336(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
