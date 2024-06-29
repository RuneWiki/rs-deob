import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class573 extends class629 {
   @OriginalMember(
      owner = "client!lba",
      name = "M",
      descriptor = "I"
   )
   public int field8278 = 4;
   @OriginalMember(
      owner = "client!lba",
      name = "P",
      descriptor = "I"
   )
   public int field8283 = 1638;
   @OriginalMember(
      owner = "client!lba",
      name = "G",
      descriptor = "I"
   )
   public int field8285 = 0;
   @OriginalMember(
      owner = "client!lba",
      name = "O",
      descriptor = "I"
   )
   public int field8290 = 4;
   @OriginalMember(
      owner = "client!lba",
      name = "T",
      descriptor = "I"
   )
   public int field8289 = 4;
   @OriginalMember(
      owner = "client!lba",
      name = "H",
      descriptor = "Z"
   )
   public boolean field8293 = true;
   @OriginalMember(
      owner = "client!lba",
      name = "N",
      descriptor = "[B"
   )
   private byte[] field8292 = new byte[512];
   @OriginalMember(
      owner = "client!lba",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8294 = new String[]{method4251(method4250("zu\u0000[+>")), method4251(method4250("m9O[\u0013")), method4251(method4250("xb\r\u0019")), method4251(method4250("zu\u0000[<>")), method4251(method4250("zu\u0000[ >")), method4251(method4250("zu\u0000[!>")), method4251(method4250("zu\u0000[#>")), method4251(method4250("zu\u0000[?>")), method4251(method4250("zu\u0000[$>")), method4251(method4250("zu\u0000[>>")), method4251(method4250("zu\u0000['>"))};
   @OriginalMember(
      owner = "client!lba",
      name = "L",
      descriptor = "I"
   )
   public static int field8275;
   @OriginalMember(
      owner = "client!lba",
      name = "I",
      descriptor = "I"
   )
   public static int field8276;
   @OriginalMember(
      owner = "client!lba",
      name = "E",
      descriptor = "I"
   )
   public static int field8277;
   @OriginalMember(
      owner = "client!lba",
      name = "J",
      descriptor = "I"
   )
   public static int field8279;
   @OriginalMember(
      owner = "client!lba",
      name = "Q",
      descriptor = "I"
   )
   public static int field8280;
   @OriginalMember(
      owner = "client!lba",
      name = "F",
      descriptor = "I"
   )
   public static int field8281;
   @OriginalMember(
      owner = "client!lba",
      name = "S",
      descriptor = "I"
   )
   public static int field8282;
   @OriginalMember(
      owner = "client!lba",
      name = "D",
      descriptor = "I"
   )
   public static int field8284;
   @OriginalMember(
      owner = "client!lba",
      name = "U",
      descriptor = "I"
   )
   public static int field8286;
   @OriginalMember(
      owner = "client!lba",
      name = "V",
      descriptor = "I"
   )
   public static int field8288;
   @OriginalMember(
      owner = "client!lba",
      name = "R",
      descriptor = "[S"
   )
   private short[] field8287;
   @OriginalMember(
      owner = "client!lba",
      name = "K",
      descriptor = "[S"
   )
   private short[] field8291;

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(I[II)V"
   )
   public final void method4244(int param1, int[] param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "([BBI)[B"
   )
   public static final byte[] method4245(byte[] arg0, byte arg1, int arg2) {
      try {
         ++field8281;
         byte[] var3 = new byte[arg2];
         if (arg1 <= 73) {
            method4247(-121, -95, (byte)67, -1, 94, 30, 117, 75);
         }

         class365.method2856(arg0, 0, var3, 0, arg2);
         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8294[4] + (arg0 != null ? field8294[1] : field8294[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(IIIIIII)I"
   )
   private final int method4246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         ++field8282;
         int var9 = arg1 >> 12;
         int var10 = var9 + 1;
         int var28 = arg1 & 4095;
         int var11 = var9 & 255;
         if (arg6 <= var10) {
            var10 = 0;
         }

         int var12 = arg4 + -4096;
         int var13 = var28 + -4096;
         if (arg2 <= 8) {
            method4245((byte[])null, (byte)6, -123);
         }

         int var14;
         int var15;
         int var17;
         label100: {
            var14 = var10 & 255;
            var15 = class267.field3787[var28];
            int var16 = 3 & this.field8292[arg0 + var11];
            if (~var16 >= -2) {
               var17 = var16 == 0 ? var28 + arg4 : -var28 + arg4;
               if (!var8) {
                  break label100;
               }
            }

            var17 = var16 != 2 ? -var28 - arg4 : var28 - arg4;
         }

         int var19;
         label101: {
            int var18 = this.field8292[arg0 + var14] & 3;
            if (var18 > 1) {
               var19 = var18 == 2 ? -arg4 + var13 : -var13 - arg4;
               if (!var8) {
                  break label101;
               }
            }

            var19 = var18 != 0 ? arg4 - var13 : arg4 + var13;
         }

         int var21;
         int var22;
         label102: {
            int var20 = 3 & this.field8292[arg5 + var11];
            var21 = ((var19 - var17) * var15 >> 12) + var17;
            if (var20 <= 1) {
               var22 = ~var20 != -1 ? var12 - var28 : var28 + var12;
               if (!var8) {
                  break label102;
               }
            }

            var22 = ~var20 == -3 ? -var12 + var28 : -var28 + -var12;
         }

         int var24;
         label103: {
            int var23 = this.field8292[arg5 + var14] & 3;
            if (var23 > 1) {
               var24 = ~var23 != -3 ? -var12 + -var13 : var13 - var12;
               if (!var8) {
                  break label103;
               }
            }

            var24 = ~var23 == -1 ? var12 + var13 : -var13 + var12;
         }

         int var25 = var22 - -((-var22 + var24) * var15 >> 12);
         return ((-var21 + var25) * arg3 >> 12) + var21;
      } catch (RuntimeException var27) {
         throw class608.method4462(var27, field8294[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method901(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8284;
         this.field8292 = class138.method1288(arg0 ^ 245880873, this.field8285);
         this.method4249((byte)-75);
         if (arg0 == 245880940) {
            int var3 = this.field8290 + -1;
            if (var2 || var3 >= 1) {
               do {
                  short var4 = this.field8287[var3];
                  if (var4 > 8 || var4 < -8) {
                     return;
                  }

                  --this.field8290;
                  --var3;
               } while(var3 >= 1);

            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8294[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "<init>",
      descriptor = "()V"
   )
   public class573() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(IIBIIIII)V"
   )
   public static final void method4247(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4564;

      try {
         ++field8279;
         if (arg2 != -60) {
            field8277 = -56;
         }

         class452 var9 = null;
         class452 var10 = (class452)class372.field5536.method2579(-801);
         if (var8 || var10 != null) {
            do {
               if (~var10.field6625 == ~arg3 && ~var10.field6622 == ~arg7 && ~var10.field6613 == ~arg5 && var10.field6616 == arg6) {
                  var9 = var10;
                  break;
               }

               var10 = (class452)class372.field5536.method2583(1);
            } while(var10 != null);
         }

         while(var8) {
         }

         if (var9 == null) {
            var9 = new class452();
            var9.field6616 = arg6;
            var9.field6613 = arg5;
            var9.field6622 = arg7;
            var9.field6625 = arg3;
            if (~arg7 <= -1 && ~arg5 <= -1 && arg7 < class209.field3112 && class1.field3 > arg5) {
               class206.method1752((byte)29, var9);
            }

            class372.field5536.method2585(var9, 48);
         }

         var9.field6615 = arg4;
         var9.field6624 = true;
         var9.field6619 = false;
         var9.field6618 = arg1;
         var9.field6612 = arg0;
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field8294[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(IIBIIII)I"
   )
   public static final int method4248(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field8286;
         int var7 = 10 % ((arg2 - 67) / 49);
         int var11 = arg1 & 3;
         if ((1 & arg6) == 1) {
            int var8 = arg3;
            arg3 = arg0;
            arg0 = var8;
         }

         if (var11 == 0) {
            return arg4;
         } else if (~var11 == -2) {
            return -arg3 - (-1 - -arg5) + 7;
         } else {
            return var11 == 2 ? -arg0 - -1 + -arg4 + 7 : arg5;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8294[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         ++field8288;
         if (arg1 != 0) {
            this.method45(11, 98);
         }

         if (arg2 != 0) {
            label111: {
               if (arg2 == 1) {
                  this.field8290 = arg0.method3564((byte)-119);
                  return;
               }

               if (arg2 != 2) {
                  if (~arg2 == -4) {
                     this.field8278 = this.field8289 = arg0.method3564((byte)-123);
                     return;
                  }

                  if (arg2 == 4) {
                     this.field8285 = arg0.method3564((byte)-115);
                     return;
                  }

                  if (~arg2 == -6) {
                     this.field8278 = arg0.method3564((byte)-55);
                     return;
                  }

                  if (arg2 == 6) {
                     if (!var4) {
                        this.field8289 = arg0.method3564((byte)-116);
                        return;
                     }
                     break label111;
                  }
               } else {
                  this.field8283 = arg0.method3538(-128);
                  if (~this.field8283 > -1) {
                     this.field8287 = new short[this.field8290];
                     int var6 = 0;
                     if (var4) {
                        this.field8287[var6] = (short)arg0.method3538(-128);
                        ++var6;
                     }

                     while(true) {
                        while(var6 < this.field8290) {
                           this.field8287[var6] = (short)arg0.method3538(-128);
                           ++var6;
                        }

                        if (!var4) {
                           return;
                        }

                        ++var6;
                     }
                  }
               }

               return;
            }
         }

         this.field8293 = ~arg0.method3564((byte)-69) == -2;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8294[0] + (arg0 != null ? field8294[1] : field8294[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method4249(byte arg0) {
      boolean var2 = client.field4564;

      try {
         label64: {
            ++field8276;
            if (~this.field8283 < -1) {
               this.field8291 = new short[this.field8290];
               this.field8287 = new short[this.field8290];
               int var3 = 0;
               if (var2) {
                  this.field8287[var3] = (short)((int)(4096.0D * Math.pow((double)((float)this.field8283 / 4096.0F), (double)var3)));
                  this.field8291[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                  ++var3;
               }

               while(true) {
                  while(var3 < this.field8290) {
                     this.field8287[var3] = (short)((int)(4096.0D * Math.pow((double)((float)this.field8283 / 4096.0F), (double)var3)));
                     this.field8291[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                     ++var3;
                  }

                  if (!var2) {
                     if (!var2) {
                        break label64;
                     }
                     break;
                  }

                  ++var3;
               }
            }

            if (this.field8287 != null && this.field8287.length == this.field8290) {
               this.field8291 = new short[this.field8290];
               int var4 = 0;
               if (var2 || ~var4 > ~this.field8290) {
                  do {
                     this.field8291[var4] = (short)((int)Math.pow(2.0D, (double)var4));
                     ++var4;
                  } while(~var4 > ~this.field8290);
               }
            }
         }

         if (arg0 != -75) {
            this.method45(5, 42);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8294[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      try {
         ++field8275;
         int[] var3 = super.field9161.method3870((byte)56, arg0);
         if (super.field9161.field7474) {
            this.method4244(0, var3, arg0);
         }

         if (arg1 != 2048) {
            this.field8285 = 6;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8294[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4250(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4251(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
