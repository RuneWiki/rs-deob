import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class775 extends class686 {
   @OriginalMember(
      owner = "client!vu",
      name = "J",
      descriptor = "I"
   )
   private int field11297 = 0;
   @OriginalMember(
      owner = "client!vu",
      name = "t",
      descriptor = "Z"
   )
   public boolean field11298 = false;
   @OriginalMember(
      owner = "client!vu",
      name = "A",
      descriptor = "Lvi;"
   )
   public class409 field11303 = new class409();
   @OriginalMember(
      owner = "client!vu",
      name = "G",
      descriptor = "Lvi;"
   )
   private class409 field11307 = new class409();
   @OriginalMember(
      owner = "client!vu",
      name = "l",
      descriptor = "Z"
   )
   private boolean field11315 = false;
   @OriginalMember(
      owner = "client!vu",
      name = "I",
      descriptor = "Lwl;"
   )
   public class532 field11296;
   @OriginalMember(
      owner = "client!vu",
      name = "C",
      descriptor = "Ldga;"
   )
   public class712 field11300;
   @OriginalMember(
      owner = "client!vu",
      name = "r",
      descriptor = "J"
   )
   private long field11302;
   @OriginalMember(
      owner = "client!vu",
      name = "m",
      descriptor = "Lfia;"
   )
   public class351 field11305;
   @OriginalMember(
      owner = "client!vu",
      name = "p",
      descriptor = "Lpf;"
   )
   public class424 field11294;
   @OriginalMember(
      owner = "client!vu",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11317 = new String[]{method5600(method5599("OK{DD")), method5600(method5599("OK{FD")), method5600(method5599("WK9k")), method5600(method5599("B\u0010{)\u0011")), method5600(method5599("OK{CD")), method5600(method5599("OK{ED")), method5600(method5599("OK{BD")), method5600(method5599("OK{;\u0005WW!9D"))};
   @OriginalMember(
      owner = "client!vu",
      name = "F",
      descriptor = "Lfm;"
   )
   public static class164 field11291 = new class164(52, 3);
   @OriginalMember(
      owner = "client!vu",
      name = "u",
      descriptor = "[Lkp;"
   )
   public static class653[] field11301 = new class653[2048];
   @OriginalMember(
      owner = "client!vu",
      name = "q",
      descriptor = "Lfm;"
   )
   public static class164 field11306 = new class164(19, 4);
   @OriginalMember(
      owner = "client!vu",
      name = "s",
      descriptor = "I"
   )
   public int field11292;
   @OriginalMember(
      owner = "client!vu",
      name = "v",
      descriptor = "I"
   )
   public static int field11293;
   @OriginalMember(
      owner = "client!vu",
      name = "o",
      descriptor = "I"
   )
   public static int field11295;
   @OriginalMember(
      owner = "client!vu",
      name = "w",
      descriptor = "I"
   )
   public static int field11299;
   @OriginalMember(
      owner = "client!vu",
      name = "L",
      descriptor = "I"
   )
   public static int field11304;
   @OriginalMember(
      owner = "client!vu",
      name = "y",
      descriptor = "I"
   )
   public static int field11308;
   @OriginalMember(
      owner = "client!vu",
      name = "x",
      descriptor = "I"
   )
   private int field11309;
   @OriginalMember(
      owner = "client!vu",
      name = "H",
      descriptor = "I"
   )
   private int field11310;
   @OriginalMember(
      owner = "client!vu",
      name = "E",
      descriptor = "I"
   )
   private int field11311;
   @OriginalMember(
      owner = "client!vu",
      name = "B",
      descriptor = "I"
   )
   private int field11312;
   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "I"
   )
   private int field11313;
   @OriginalMember(
      owner = "client!vu",
      name = "D",
      descriptor = "I"
   )
   private int field11314;
   @OriginalMember(
      owner = "client!vu",
      name = "n",
      descriptor = "I"
   )
   private int field11316;

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(ILjga;)Ljga;"
   )
   public static final class91 method5594(int arg0, class91 arg1) {
      try {
         ++field11299;
         if (arg0 != 18307) {
            method5594(61, (class91)null);
         }

         class91 var2 = client.method5038(arg1);
         if (var2 == null) {
            var2 = arg1.field1347;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11317[1] + arg0 + ',' + (arg1 != null ? field11317[3] : field11317[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(JLha;I)V"
   )
   public final void method5595(long param1, class17 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method5596(boolean arg0) {
      try {
         if (arg0) {
            this.field11314 = -119;
         }

         this.field11303.field6008 = this.field11300.field10234;
         this.field11303.field5997 = this.field11300.field10240;
         this.field11303.field6000 = this.field11300.field10222;
         this.field11303.field6001 = this.field11300.field10243;
         this.field11303.field6005 = this.field11300.field10230;
         this.field11303.field6006 = this.field11300.field10242;
         this.field11303.field5995 = this.field11300.field10226;
         ++field11295;
         this.field11303.field5999 = this.field11300.field10236;
         this.field11303.field5998 = this.field11300.field10237;
         if (~this.field11303.field6006 == ~this.field11303.field5999 && this.field11303.field6000 == this.field11303.field5999 && ~this.field11303.field6001 == ~this.field11303.field5998 && this.field11303.field6008 == this.field11303.field5998 && this.field11303.field5997 == this.field11303.field5995 && this.field11303.field6005 == this.field11303.field5995) {
            this.field11315 = true;
         } else if (this.field11315) {
            this.field11307.field5999 = this.field11303.field5999;
            this.field11307.field5998 = this.field11303.field5998;
            this.field11307.field6000 = this.field11303.field6000;
            this.field11307.field6001 = this.field11303.field6001;
            this.field11307.field6008 = this.field11303.field6008;
            this.field11307.field5997 = this.field11303.field5997;
            this.field11307.field5995 = this.field11303.field5995;
            this.field11307.field6005 = this.field11303.field6005;
            this.field11315 = false;
            this.field11307.field6006 = this.field11303.field6006;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11317[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(ZZIJLha;)V"
   )
   public final void method5597(boolean arg0, boolean arg1, int arg2, long arg3, class17 arg4) {
      boolean var7 = client.field10022;

      try {
         label236: {
            ++field11293;
            if (this.field11298) {
               arg0 = false;
               if (!var7) {
                  break label236;
               }
            }

            if (class679.field9837 >= this.field11305.field5183) {
               if (~class702.field10118 < ~class792.field11533[class679.field9837]) {
                  arg0 = false;
                  if (!var7) {
                     break label236;
                  }
               }

               if (this.field11315) {
                  arg0 = false;
                  if (!var7) {
                     break label236;
                  }
               }

               if (this.field11305.field5164 == -1) {
                  break label236;
               }

               int var8;
               label250: {
                  var8 = (int)(-this.field11302 + arg3);
                  if (this.field11305.field5191 || ~var8 >= ~this.field11305.field5164) {
                     var8 %= this.field11305.field5164;
                     if (!var7) {
                        break label250;
                     }
                  }

                  arg0 = false;
               }

               if (!this.field11305.field5180 && this.field11305.field5204 > var8) {
                  arg0 = false;
               }

               if (!this.field11305.field5180 || this.field11305.field5204 > var8) {
                  break label236;
               }

               arg0 = false;
               if (!var7) {
                  break label236;
               }
            }

            arg0 = false;
         }

         if (arg0) {
            ++class311.field4671;
            int var9 = (this.field11303.field6006 - -this.field11303.field5999 + this.field11303.field6000) / 3;
            int var10 = (this.field11303.field6001 - -this.field11303.field5998 + this.field11303.field6008) / 3;
            int var11 = (this.field11303.field5997 - -this.field11303.field5995 + this.field11303.field6005) / 3;
            if (~this.field11303.field6003 != ~var9 || ~this.field11303.field5994 != ~var10 || this.field11303.field6002 != var11) {
               this.field11303.field5994 = var10;
               this.field11303.field6003 = var9;
               this.field11303.field6002 = var11;
               int var12 = this.field11303.field5999 - this.field11303.field6006;
               int var13 = -this.field11303.field6001 + this.field11303.field5998;
               int var14 = -this.field11303.field5997 + this.field11303.field5995;
               int var15 = -this.field11303.field6006 + this.field11303.field6000;
               int var16 = -this.field11303.field6001 + this.field11303.field6008;
               int var17 = this.field11303.field6005 - this.field11303.field5997;
               this.field11314 = var14 * var15 + -(var12 * var17);
               this.field11310 = var13 * var17 + -(var14 * var16);
               this.field11311 = var12 * var16 + -(var13 * var15);
               if (var7) {
                  this.field11311 >>= 1;
                  this.field11314 >>= 1;
                  this.field11310 >>= 1;
               }

               label197:
               while(true) {
                  while(true) {
                     if (this.field11310 <= 32767) {
                        if (var7) {
                           this.field11310 >>= 1;
                           continue;
                        }

                        if (~this.field11314 >= -32768 && ~this.field11311 >= -32768 && ~this.field11310 <= 32766 && ~this.field11314 <= 32766 && this.field11311 >= -32767) {
                           int var18 = (int)Math.sqrt((double)(this.field11311 * this.field11311 + this.field11314 * this.field11314 + this.field11310 * this.field11310));
                           if (~var18 >= -1) {
                              var18 = 1;
                           }

                           this.field11314 = this.field11314 * 32767 / var18;
                           this.field11310 = this.field11310 * 32767 / var18;
                           this.field11311 = this.field11311 * 32767 / var18;
                           if (this.field11305.field5208 > 0 || this.field11305.field5203 > 0) {
                              int var19 = (int)(Math.atan2((double)this.field11311, (double)this.field11310) * 2607.5945876176133D);
                              int var20 = (int)(Math.atan2((double)this.field11314, Math.sqrt((double)(this.field11311 * this.field11311 + this.field11310 * this.field11310))) * 2607.5945876176133D);
                              this.field11312 = -this.field11305.field5186 + this.field11305.field5208;
                              this.field11316 = -(this.field11312 >> 1) + var19 + this.field11305.field5186;
                              this.field11313 = -this.field11305.field5174 + this.field11305.field5203;
                              this.field11309 = this.field11305.field5174 + var20 + -(this.field11313 >> 1);
                           }
                           break label197;
                        }
                     }

                     this.field11311 >>= 1;
                     this.field11314 >>= 1;
                     this.field11310 >>= 1;
                  }
               }
            }

            this.field11297 += (int)(((double)(-this.field11305.field5198 + this.field11305.field5182) * Math.random() + (double)this.field11305.field5198) * (double)arg2);
            if (this.field11297 > 63) {
               int var21 = this.field11297 >> 6;
               this.field11297 &= 63;
               int var22 = 0;
               if (var7 || ~var21 < ~var22) {
                  do {
                     int var23;
                     int var24;
                     int var25;
                     label151: {
                        if (~this.field11305.field5208 >= -1 && this.field11305.field5203 <= 0) {
                           var23 = this.field11311;
                           var24 = this.field11314;
                           var25 = this.field11310;
                           if (!var7) {
                              break label151;
                           }
                        }

                        int var26 = this.field11316 - -((int)(Math.random() * (double)this.field11312));
                        int var27 = var26 & 16383;
                        int var28 = class160.field2447[var27];
                        int var29 = class160.field2446[var27];
                        int var30 = (int)(Math.random() * (double)this.field11313) + this.field11309;
                        int var31 = var30 & 8191;
                        int var32 = class160.field2447[var31];
                        int var33 = class160.field2446[var31];
                        byte var34 = 13;
                        var24 = (var33 << 1) * -1;
                        var25 = var29 * var32 >> var34;
                        var23 = var28 * var32 >> var34;
                     }

                     float var35 = (float)Math.random();
                     float var36 = (float)Math.random();
                     if (var35 + var36 > 1.0F) {
                        var36 = -var36 + 1.0F;
                        var35 = 1.0F - var35;
                     }

                     int var47;
                     int var48;
                     int var49;
                     int var50;
                     int var51;
                     int var52;
                     int var53;
                     int var56;
                     label242: {
                        float var37 = -var36 - var35 + 1.0F;
                        int var38 = (int)((float)this.field11303.field6000 * var37 + (float)this.field11303.field6006 * var35 + (float)this.field11303.field5999 * var36);
                        int var39 = (int)((float)this.field11303.field6008 * var37 + (float)this.field11303.field6001 * var35 + (float)this.field11303.field5998 * var36);
                        int var40 = (int)((float)this.field11303.field6005 * var37 + (float)this.field11303.field5997 * var35 + (float)this.field11303.field5995 * var36);
                        int var41 = (int)((float)this.field11307.field6000 * var37 + (float)this.field11307.field6006 * var35 + (float)this.field11307.field5999 * var36);
                        int var42 = (int)((float)this.field11307.field6008 * var37 + (float)this.field11307.field6001 * var35 + (float)this.field11307.field5998 * var36);
                        int var43 = (int)((float)this.field11307.field6005 * var37 + (float)this.field11307.field5997 * var35 + (float)this.field11307.field5995 * var36);
                        int var44 = var38 - var41;
                        int var45 = -var42 + var39;
                        int var46 = -var43 + var40;
                        var47 = (int)(Math.random() * (double)var44 + (double)var41);
                        var48 = (int)(Math.random() * (double)var45 + (double)var42);
                        var49 = (int)((double)var43 + Math.random() * (double)var46);
                        var50 = (int)((double)(-this.field11305.field5189 + this.field11305.field5169) * Math.random()) + this.field11305.field5189;
                        var51 = this.field11305.field5209 - -((int)(Math.random() * (double)(-this.field11305.field5209 + this.field11305.field5145)));
                        var52 = (int)((double)(-this.field11305.field5163 + this.field11305.field5207) * Math.random()) + this.field11305.field5163;
                        if (!this.field11305.field5139) {
                           var53 = (int)((double)this.field11305.field5177 + (double)this.field11305.field5155 * Math.random()) << 24 | (int)((double)this.field11305.field5159 + Math.random() * (double)this.field11305.field5158) | (int)((double)this.field11305.field5149 + (double)this.field11305.field5195 * Math.random()) << 16 | (int)(Math.random() * (double)this.field11305.field5152 + (double)this.field11305.field5148) << 8;
                           if (!var7) {
                              var56 = this.field11305.field5142;
                              if (!arg4.method190() && !this.field11305.field5192) {
                                 var56 = -1;
                              }
                              break label242;
                           }
                        }

                        double var54 = Math.random();
                        var53 = (int)(Math.random() * (double)this.field11305.field5155 + (double)this.field11305.field5177) << 24 | (int)((double)this.field11305.field5158 * var54 + (double)this.field11305.field5159) | (int)((double)this.field11305.field5195 * var54 + (double)this.field11305.field5149) << 16 | (int)((double)this.field11305.field5152 * var54 + (double)this.field11305.field5148) << 8;
                        var56 = this.field11305.field5142;
                        if (!arg4.method190() && !this.field11305.field5192) {
                           var56 = -1;
                        }
                     }

                     if (class661.field9302 != class506.field7194) {
                        class154 var57 = class742.field10567[class506.field7194];
                        class506.field7194 = 1023 & class506.field7194 - -1;
                        var57.method1483(this, var47, var48, var49, var25, var24, var23, var50, var51, var53, var52, var56, this.field11305.field5196, this.field11305.field5141);
                        if (!var7) {
                           ++var22;
                           continue;
                        }
                     }

                     new class154(this, var47, var48, var49, var25, var24, var23, var50, var51, var53, var52, var56, this.field11305.field5196, this.field11305.field5141);
                     ++var22;
                  } while(~var21 < ~var22);
               }
            }
         }

         if (!this.field11303.method3203(this.field11307, -125)) {
            class409 var59 = this.field11307;
            this.field11307 = this.field11303;
            this.field11303 = var59;
            this.field11303.field6000 = this.field11300.field10222;
            this.field11303.field5997 = this.field11300.field10240;
            this.field11303.field6006 = this.field11300.field10242;
            this.field11303.field5999 = this.field11300.field10236;
            this.field11303.field6003 = this.field11307.field6003;
            this.field11303.field5995 = this.field11300.field10226;
            this.field11303.field5998 = this.field11300.field10237;
            this.field11303.field5994 = this.field11307.field5994;
            this.field11303.field6008 = this.field11300.field10234;
            this.field11303.field6002 = this.field11307.field6002;
            this.field11303.field6005 = this.field11300.field10230;
            this.field11303.field6001 = this.field11300.field10243;
         }

         this.field11292 = 0;
         class154 var60 = (class154)this.field11294.method3307(16976);
         if (var7) {
            var60.method1482(arg3, arg2);
            ++this.field11292;
            var60 = (class154)this.field11294.method3309(true);
         }

         while(true) {
            while(var60 != null) {
               var60.method1482(arg3, arg2);
               ++this.field11292;
               var60 = (class154)this.field11294.method3309(true);
            }

            if (!var7) {
               if (arg1) {
                  field11306 = null;
               }

               class610.field8696 += this.field11292;
               return;
            }

            var60 = (class154)this.field11294.method3309(true);
         }
      } catch (RuntimeException var62) {
         throw class612.method4503(var62, field11317[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field11317[3] : field11317[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method5598(boolean arg0) {
      try {
         field11306 = null;
         field11301 = null;
         if (arg0) {
            field11308 = -19;
         }

         field11291 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11317[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "<init>",
      descriptor = "(Lha;Ldga;Lwl;J)V"
   )
   public class775(class17 arg0, class712 arg1, class532 arg2, long arg3) {
      try {
         this.field11296 = arg2;
         this.field11300 = arg1;
         this.field11302 = arg3;
         this.field11305 = this.field11300.method5176(true);
         if (!arg0.method190() && this.field11305.field5170 != -1) {
            this.field11305 = class143.method1422(this.field11305.field5170, (byte)47);
         }

         this.field11294 = new class424();
         this.field11297 = (int)((double)this.field11297 + Math.random() * 64.0D);
         this.method5596(false);
         this.field11307.field5999 = this.field11303.field5999;
         this.field11307.field5995 = this.field11303.field5995;
         this.field11307.field6000 = this.field11303.field6000;
         this.field11307.field6006 = this.field11303.field6006;
         this.field11307.field6005 = this.field11303.field6005;
         this.field11307.field6001 = this.field11303.field6001;
         this.field11307.field6008 = this.field11303.field6008;
         this.field11307.field5997 = this.field11303.field5997;
         this.field11307.field5998 = this.field11303.field5998;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11317[7] + (arg0 != null ? field11317[3] : field11317[2]) + ',' + (arg1 != null ? field11317[3] : field11317[2]) + ',' + (arg2 != null ? field11317[3] : field11317[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5599(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5600(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
