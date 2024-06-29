import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class442 extends class70 {
   @OriginalMember(
      owner = "client!sw",
      name = "L",
      descriptor = "I"
   )
   private int field6002 = 12288;
   @OriginalMember(
      owner = "client!sw",
      name = "Q",
      descriptor = "I"
   )
   private int field5999 = 2048;
   @OriginalMember(
      owner = "client!sw",
      name = "K",
      descriptor = "I"
   )
   private int field6006 = 0;
   @OriginalMember(
      owner = "client!sw",
      name = "R",
      descriptor = "I"
   )
   private int field6008 = 8192;
   @OriginalMember(
      owner = "client!sw",
      name = "I",
      descriptor = "I"
   )
   private int field6004 = 2048;
   @OriginalMember(
      owner = "client!sw",
      name = "O",
      descriptor = "I"
   )
   private int field5997 = 4096;
   @OriginalMember(
      owner = "client!sw",
      name = "M",
      descriptor = "I"
   )
   private int field6001 = 0;
   @OriginalMember(
      owner = "client!sw",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6011 = new String[]{method3407(method3406("V$k+ ")), method3407(method3406("V$k# ")), method3407(method3406("V$k  ")), method3407(method3406("V$k! ")), method3407(method3406("V$k( ")), method3407(method3406("V$k, ")), method3407(method3406("K&)\b")), method3407(method3406("^}kJu")), method3407(method3406("V$k' "))};
   @OriginalMember(
      owner = "client!sw",
      name = "T",
      descriptor = "I"
   )
   public static int field5998;
   @OriginalMember(
      owner = "client!sw",
      name = "W",
      descriptor = "I"
   )
   public static int field6000;
   @OriginalMember(
      owner = "client!sw",
      name = "P",
      descriptor = "I"
   )
   public static int field6003;
   @OriginalMember(
      owner = "client!sw",
      name = "N",
      descriptor = "I"
   )
   public static int field6005;
   @OriginalMember(
      owner = "client!sw",
      name = "U",
      descriptor = "I"
   )
   public static int field6007;
   @OriginalMember(
      owner = "client!sw",
      name = "V",
      descriptor = "I"
   )
   public static int field6009;
   @OriginalMember(
      owner = "client!sw",
      name = "S",
      descriptor = "I"
   )
   public static int field6010;

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(IBI)Z"
   )
   private final boolean method3402(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 > -21) {
            this.field6002 = -6;
         }

         ++field6003;
         int var4 = (-arg0 + arg2) * this.field6002 >> 12;
         int var5 = class123.field1612[255 & var4 * 255 >> 12];
         int var6 = (var5 << 12) / this.field6002;
         int var7 = (var6 << 12) / this.field6008;
         int var8 = this.field5997 * var7 >> 12;
         return ~(arg0 + arg2) > ~var8 && -var8 < arg0 + arg2;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field6011[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         if (arg0 < -36) {
            class704.method5119(true);
            ++field6000;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6011[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label82: {
            label81: {
               label80: {
                  label79: {
                     label78: {
                        label77: {
                           label76: {
                              if (arg2 != 0) {
                                 if (arg2 == 1) {
                                    break label76;
                                 }

                                 if (arg2 == 2) {
                                    break label77;
                                 }

                                 if (arg2 == 3) {
                                    break label78;
                                 }

                                 if (~arg2 == -5) {
                                    break label79;
                                 }

                                 if (arg2 == 5) {
                                    break label80;
                                 }

                                 if (~arg2 != -7) {
                                    break label82;
                                 }

                                 if (!var4) {
                                    break label81;
                                 }
                              }

                              this.field6004 = arg1.method603(-2);
                              if (!var4) {
                                 break label82;
                              }
                           }

                           this.field6001 = arg1.method603(-2);
                           if (!var4) {
                              break label82;
                           }
                        }

                        this.field6006 = arg1.method603(-2);
                        if (!var4) {
                           break label82;
                        }
                     }

                     this.field5999 = arg1.method603(-2);
                     if (!var4) {
                        break label82;
                     }
                  }

                  this.field6002 = arg1.method603(-2);
                  if (!var4) {
                     break label82;
                  }
               }

               this.field5997 = arg1.method603(-2);
               if (!var4) {
                  break label82;
               }
            }

            this.field6008 = arg1.method603(-2);
         }

         ++field6005;
         if (arg0 >= -34) {
            this.field6001 = 45;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6011[8] + arg0 + ',' + (arg1 != null ? field6011[7] : field6011[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field6009;
         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int var5 = class502.field6979[arg1] - 2048;
            int var6 = 0;
            if (var3 || ~class262.field3328 < ~var6) {
               do {
                  int var7 = class17.field290[var6] + -2048;
                  int var8 = this.field6004 + var7;
                  int var9 = var8 < -2048 ? var8 + 4096 : var8;
                  int var10 = var9 > 2048 ? var9 + -4096 : var9;
                  int var11 = this.field6001 + var5;
                  int var12 = var11 >= -2048 ? var11 : var11 - -4096;
                  int var13 = var12 > 2048 ? var12 + -4096 : var12;
                  int var14 = this.field6006 + var7;
                  int var15 = ~var14 <= 2047 ? var14 : var14 + 4096;
                  int var16 = ~var15 >= -2049 ? var15 : var15 + -4096;
                  int var17 = this.field5999 + var5;
                  int var18 = ~var17 > 2047 ? var17 - -4096 : var17;
                  int var19 = ~var18 >= -2049 ? var18 : var18 - 4096;
                  var4[var6] = !this.method3402(var10, (byte)-55, var13) ? (this.method3405(false, var16, var19) ? 4096 : 0) : 4096;
                  ++var6;
               } while(~class262.field3328 < ~var6);
            }
         }

         return arg0 != -63 ? null : var4;
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field6011[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method3403(int arg0, int arg1) {
      try {
         ++field6007;
         class487 var2 = class2.method12((long)arg1, 10, (byte)43);
         if (arg0 >= 0) {
            var2.method3696(-11118);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6011[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method3404(boolean arg0, int arg1) {
      try {
         ++field6010;
         int var2 = class373.field5225;
         if (arg1 == 4096) {
            int var3 = class370.field5153;
            if (arg0 && class400.field5500) {
               var2 <<= 1;
               var3 = -var2;
            }

            class629.field9294.method406(var3, var2);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6011[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(ZII)Z"
   )
   private final boolean method3405(boolean arg0, int arg1, int arg2) {
      try {
         ++field5998;
         if (arg0) {
            this.field6008 = 29;
         }

         int var4 = (arg2 - -arg1) * this.field6002 >> 12;
         int var5 = class123.field1612[(var4 * 255 & 1045826) >> 12];
         int var6 = (var5 << 12) / this.field6002;
         int var7 = (var6 << 12) / this.field6008;
         int var8 = this.field5997 * var7 >> 12;
         return arg2 - arg1 < var8 && -arg1 + arg2 > -var8;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field6011[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "<init>",
      descriptor = "()V"
   )
   public class442() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3406(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3407(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
