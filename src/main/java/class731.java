import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class731 extends class500 {
   @OriginalMember(
      owner = "client!ih",
      name = "A",
      descriptor = "Lio;"
   )
   private class465 field10704;
   @OriginalMember(
      owner = "client!ih",
      name = "u",
      descriptor = "Loda;"
   )
   private class127 field10699;
   @OriginalMember(
      owner = "client!ih",
      name = "t",
      descriptor = "Lce;"
   )
   private class327 field10696;
   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "I"
   )
   private int field10711;
   @OriginalMember(
      owner = "client!ih",
      name = "r",
      descriptor = "I"
   )
   private int field10713;
   @OriginalMember(
      owner = "client!ih",
      name = "D",
      descriptor = "I"
   )
   private int field10709;
   @OriginalMember(
      owner = "client!ih",
      name = "q",
      descriptor = "I"
   )
   private int field10705;
   @OriginalMember(
      owner = "client!ih",
      name = "m",
      descriptor = "[[F"
   )
   private float[][] field10714;
   @OriginalMember(
      owner = "client!ih",
      name = "k",
      descriptor = "[[F"
   )
   private float[][] field10703;
   @OriginalMember(
      owner = "client!ih",
      name = "x",
      descriptor = "[[F"
   )
   private float[][] field10697;
   @OriginalMember(
      owner = "client!ih",
      name = "w",
      descriptor = "I"
   )
   private int field10701;
   @OriginalMember(
      owner = "client!ih",
      name = "E",
      descriptor = "Lso;"
   )
   private class499 field10706;
   @OriginalMember(
      owner = "client!ih",
      name = "B",
      descriptor = "Loia;"
   )
   private class96 field10698;
   @OriginalMember(
      owner = "client!ih",
      name = "C",
      descriptor = "Ldia;"
   )
   private class245 field10702;
   @OriginalMember(
      owner = "client!ih",
      name = "y",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field10710;
   @OriginalMember(
      owner = "client!ih",
      name = "l",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field10715;
   @OriginalMember(
      owner = "client!ih",
      name = "n",
      descriptor = "I"
   )
   private int field10700;
   @OriginalMember(
      owner = "client!ih",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10718 = new String[]{method5319(method5318("DpwYBzv\"LDf1")), method5319(method5318("4bgIDzuq\u0004\u0005:")), method5319(method5318("dpwYN")), method5319(method5318("}y,h\u0003")), method5319(method5318("H>,\u0010\u00074N/\u0001pIoB")), method5319(method5318("}y,o\u0003")), method5319(method5318("}y,n\u0003")), method5319(method5318("}y,\u0016Bzxv\u0014\u0003")), method5319(method5318("zdnF")), method5319(method5318("o?,\u0004V")), method5319(method5318("}y,i\u0003")), method5319(method5318("}y,k\u0003"))};
   @OriginalMember(
      owner = "client!ih",
      name = "o",
      descriptor = "[Lwm;"
   )
   public static class594[] field10708 = new class594[2048];
   @OriginalMember(
      owner = "client!ih",
      name = "v",
      descriptor = "I"
   )
   public static int field10707;
   @OriginalMember(
      owner = "client!ih",
      name = "j",
      descriptor = "I"
   )
   public static int field10712;
   @OriginalMember(
      owner = "client!ih",
      name = "s",
      descriptor = "I"
   )
   public static int field10716;
   @OriginalMember(
      owner = "client!ih",
      name = "p",
      descriptor = "I"
   )
   public static int field10717;

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(BI[[ZII)V"
   )
   public final void method5313(byte arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
      boolean var6 = client.field4273;

      try {
         ++field10717;
         if (this.field10698 != null) {
            if (this.field10711 <= arg3 + arg4) {
               if (~this.field10713 <= ~(-arg4 + arg3)) {
                  if (~this.field10709 >= ~(arg1 - -arg4)) {
                     if (-arg4 + arg1 <= this.field10705) {
                        if (arg0 >= -88) {
                           this.method5314(-91, 69, 6, 15, -121, -46, 84);
                        }

                        int var7 = this.field10709;
                        if (var6 || ~this.field10705 <= ~var7) {
                           do {
                              int var8 = this.field10711;
                              if (var6 || var8 <= this.field10713) {
                                 do {
                                    int var9 = -arg3 + var8;
                                    int var10 = -arg1 + var7;
                                    if (~(-arg4) > ~var9 && var9 < arg4 && ~(-arg4) > ~var10 && var10 < arg4 && arg2[arg4 + var9][arg4 + var10]) {
                                       this.field10696.method2519(-2, (byte)((int)(this.field10699.method1070(-1) * 255.0F)));
                                       this.field10696.method2580(-8833, 0, this.field10706);
                                       this.field10696.method2529(-89, this.field10696.field4685);
                                       this.field10696.method2483(this.field10700, this.field10701 / 3, 0, 0, 114, class631.field8832, this.field10698);
                                       return;
                                    }

                                    ++var8;
                                 } while(var8 <= this.field10713);
                              }

                              ++var7;
                           } while(~this.field10705 <= ~var7);

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field10718[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10718[9] : field10718[8]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   private final void method5314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4273;

      try {
         ++field10707;
         long var9 = -1L;
         int var11 = (arg5 << this.field10704.field3874) + arg2;
         int var12 = arg4 - -(arg0 << this.field10704.field3874);
         int var13 = this.field10704.method2220(120, var11, var12);
         if (~(127 & arg2) == -1 || (arg4 & 127) == 0) {
            var9 = ((long)var12 & 65535L) << 16 | (long)var11 & 65535L;
            class500 var14 = this.field10702.method1839(-124, var9);
            if (var14 != null) {
               this.method5315(106, ((class355)var14).field5062);
               return;
            }
         }

         short var15 = (short)(this.field10700++);
         if (~var9 != 0L) {
            this.field10702.method1841(var9, true, new class355(var15));
         }

         float var16;
         float var17;
         float var18;
         label119: {
            if (~arg2 == -1 && arg4 == 0) {
               var16 = this.field10714[arg1][arg3];
               var17 = this.field10697[arg1][arg3];
               var18 = this.field10703[arg1][arg3];
               if (!var8) {
                  break label119;
               }
            }

            if (~this.field10704.field3869 != ~arg2 || ~arg4 != -1) {
               if (this.field10704.field3869 == arg2 && ~this.field10704.field3869 == ~arg4) {
                  var18 = this.field10703[arg1 + 1][arg3 + 1];
                  var16 = this.field10714[arg1 + 1][arg3 + 1];
                  var17 = this.field10697[arg1 - -1][arg3 + 1];
                  if (!var8) {
                     break label119;
                  }
               }

               if (arg2 == 0 && ~this.field10704.field3869 == ~arg4) {
                  var17 = this.field10697[arg1][arg3 + 1];
                  var18 = this.field10703[arg1][arg3 + 1];
                  var16 = this.field10714[arg1][arg3 + 1];
                  if (!var8) {
                     break label119;
                  }
               }

               float var19 = (float)arg2 / (float)this.field10704.field3869;
               float var20 = (float)arg4 / (float)this.field10704.field3869;
               float var21 = this.field10697[arg1][arg3];
               float var22 = this.field10714[arg1][arg3];
               float var23 = this.field10703[arg1][arg3];
               float var24 = this.field10697[arg1 + 1][arg3];
               float var25 = this.field10714[arg1 - -1][arg3];
               float var26 = this.field10703[arg1 + 1][arg3];
               float var27 = (this.field10703[arg1][arg3 + 1] - var23) * var19 + var23;
               float var28 = (this.field10697[arg1 - -1][arg3 + 1] + -var24) * var19 + var24;
               float var29 = (this.field10714[arg1][arg3 + 1] + -var22) * var19 + var22;
               float var30 = (this.field10697[arg1][arg3 + 1] + -var21) * var19 + var21;
               float var31 = (this.field10714[arg1 + 1][arg3 + 1] - var25) * var19 + var25;
               var16 = (-var29 + var31) * var20 + var29;
               var17 = (var28 - var30) * var20 + var30;
               float var32 = (this.field10703[arg1 - -1][arg3 + 1] + -var26) * var19 + var26;
               var18 = (-var27 + var32) * var20 + var27;
               if (!var8) {
                  break label119;
               }
            }

            var18 = this.field10703[arg1 - -1][arg3];
            var17 = this.field10697[arg1 + 1][arg3];
            var16 = this.field10714[arg1 + 1][arg3];
         }

         float var33 = (float)(this.field10699.method1063(-1) - var11);
         float var34 = (float)(-var13 + this.field10699.method1065((byte)-80));
         float var35 = (float)(this.field10699.method1067(-1) + -var12);
         float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
         float var37 = 1.0F / var36;
         float var38 = var35 * var37;
         float var39 = var34 * var37;
         float var40 = var33 * var37;
         float var41 = var36 / (float)this.field10699.method1066(-1);
         float var42 = -(var41 * var41) + 1.0F;
         if (var42 < 0.0F) {
            var42 = 0.0F;
         }

         float var43 = var18 * var38 + var16 * var39 + var17 * var40;
         if (var43 < 0.0F) {
            var43 = 0.0F;
         }

         float var44 = var42 * var43 * 2.0F;
         if (var44 > 1.0F) {
            var44 = 1.0F;
         }

         int var45 = this.field10699.method1064(125);
         int var46 = (int)((float)((var45 & 16729817) >> 16) * var44);
         if (var46 > 255) {
            var46 = 255;
         }

         int var47 = (int)((float)(var45 >> 8 & 255) * var44);
         if (~var47 < -256) {
            var47 = 255;
         }

         int var48;
         label76: {
            var48 = (int)((float)(var45 & 255) * var44);
            if (!Stream.method5101()) {
               this.field10710.method5114((float)var11);
               this.field10710.method5114((float)var13);
               this.field10710.method5114((float)var12);
               if (!var8) {
                  break label76;
               }
            }

            this.field10710.method5104((float)var11);
            this.field10710.method5104((float)var13);
            this.field10710.method5104((float)var12);
         }

         if (~var48 < -256) {
            var48 = 255;
         }

         label70: {
            if (this.field10696.field4604 != 0) {
               this.field10710.method5108(var46);
               this.field10710.method5108(var47);
               this.field10710.method5108(var48);
               if (!var8) {
                  break label70;
               }
            }

            this.field10710.method5108(var48);
            this.field10710.method5108(var47);
            this.field10710.method5108(var46);
         }

         if (arg6 >= -43) {
            method5316((byte)-113);
         }

         this.field10710.method5108(255);
         this.method5315(92, var15);
      } catch (RuntimeException var50) {
         throw class534.method3846(var50, field10718[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IS)V"
   )
   private final void method5315(int arg0, short arg1) {
      try {
         int var3 = 112 % ((arg0 - -8) / 59);
         ++field10716;
         if (Stream.method5101()) {
            this.field10715.method5113(arg1);
         } else {
            this.field10715.method5102(arg1);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10718[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5316(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ih",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5317(byte arg0) {
      try {
         field10708 = null;
         if (arg0 != 42) {
            field10708 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10718[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "<init>",
      descriptor = "(Lce;Lio;Loda;[I)V"
   )
   public class731(class327 param1, class465 param2, class127 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5318(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5319(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
