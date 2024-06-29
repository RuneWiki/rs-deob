import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public abstract class class174 {
   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "I"
   )
   public int field2168 = 4;
   @OriginalMember(
      owner = "client!pha",
      name = "c",
      descriptor = "I"
   )
   private int field2166 = 4;
   @OriginalMember(
      owner = "client!pha",
      name = "d",
      descriptor = "[S"
   )
   private short[] field2169 = new short[512];
   @OriginalMember(
      owner = "client!pha",
      name = "i",
      descriptor = "I"
   )
   private int field2161 = 4;
   @OriginalMember(
      owner = "client!pha",
      name = "f",
      descriptor = "I"
   )
   private int field2171 = 4;
   @OriginalMember(
      owner = "client!pha",
      name = "m",
      descriptor = "I"
   )
   private int field2173 = 0;
   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2175 = new String[]{method1356(method1355("eI\n\u001f\u000e|O\u0002E\f=")), method1356(method1355("eI\n\u001fx=")), method1356(method1355("eI\n\u001f\u007f=")), method1356(method1355("eI\n\u001f{=")), method1356(method1355("eI\n\u001f~=")), method1356(method1355("eI\n\u001fy="))};
   @OriginalMember(
      owner = "client!pha",
      name = "n",
      descriptor = "Ll;"
   )
   public static class20 field2167 = new class20(64);
   @OriginalMember(
      owner = "client!pha",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field2172 = new class378(117, -1);
   @OriginalMember(
      owner = "client!pha",
      name = "h",
      descriptor = "I"
   )
   public static int field2174 = -1;
   @OriginalMember(
      owner = "client!pha",
      name = "j",
      descriptor = "I"
   )
   public static int field2162;
   @OriginalMember(
      owner = "client!pha",
      name = "k",
      descriptor = "I"
   )
   public static int field2163;
   @OriginalMember(
      owner = "client!pha",
      name = "g",
      descriptor = "I"
   )
   public static int field2165;
   @OriginalMember(
      owner = "client!pha",
      name = "b",
      descriptor = "I"
   )
   public static int field2170;
   @OriginalMember(
      owner = "client!pha",
      name = "l",
      descriptor = "[S"
   )
   private short[] field2164;

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public final void method1350(int arg0, int arg1, int arg2, byte arg3) {
      boolean var5 = client.field4273;

      try {
         ++field2163;
         int[] var6 = new int[arg1];
         int[] var7 = new int[arg0];
         int[] var8 = new int[arg2];
         int var9 = 0;
         if (var5) {
            var6[var9] = (var9 << 12) / arg1;
            ++var9;
         }

         while(true) {
            while(arg1 > var9) {
               var6[var9] = (var9 << 12) / arg1;
               ++var9;
            }

            int var10 = 0;
            if (!var5) {
               if (var5) {
                  var7[var10] = (var10 << 12) / arg0;
                  ++var10;
               }

               while(true) {
                  while(~var10 > ~arg0) {
                     var7[var10] = (var10 << 12) / arg0;
                     ++var10;
                  }

                  int var11 = 0;
                  if (!var5) {
                     if (var5) {
                        var8[var11] = (var11 << 12) / arg2;
                        ++var11;
                     }

                     while(true) {
                        while(var11 < arg2) {
                           var8[var11] = (var11 << 12) / arg2;
                           ++var11;
                        }

                        if (!var5) {
                           if (arg3 != -10) {
                              field2174 = -55;
                           }

                           this.method1043(false);
                           int var12 = 0;
                           if (!var5 && ~arg2 >= ~var12) {
                              return;
                           }

                           do {
                              int var13 = 0;
                              if (var5 || ~arg0 < ~var13) {
                                 do {
                                    int var14 = 0;
                                    if (var5 || var14 < arg1) {
                                       do {
                                          class174 var10000;
                                          label107: {
                                             int var15 = 0;
                                             if (var5) {
                                                var10000 = this;
                                             } else if (var15 >= this.field2168) {
                                                var10000 = this;
                                                if (!var5) {
                                                   break label107;
                                                }
                                             } else {
                                                var10000 = this;
                                             }

                                             while(true) {
                                                int var16 = var10000.field2164[var15] << 12;
                                                int var17 = var7[var13] * var16 >> 12;
                                                int var18 = var8[var12] * var16 >> 12;
                                                int var19 = this.field2166 * var16 >> 12;
                                                int var20 = var6[var14] * var16 >> 12;
                                                int var21 = this.field2171 * var16 >> 12;
                                                int var22 = this.field2161 * var16 >> 12;
                                                int var23 = this.field2161 * var18;
                                                int var24 = this.field2166 * var17;
                                                int var25 = this.field2171 * var20;
                                                int var26 = var25 >> 12;
                                                int var27 = var26 + 1;
                                                int var28 = var24 >> 12;
                                                int var29 = var26 & 255;
                                                int var30 = var28 + 1;
                                                int var31 = var23 >> 12;
                                                int var32 = var28 & 255;
                                                int var33 = var31 + 1;
                                                int var34;
                                                if (~var30 > ~var19) {
                                                   var34 = var30 & 255;
                                                   if (var5) {
                                                      var34 = 0;
                                                   }
                                                } else {
                                                   var34 = 0;
                                                }

                                                int var35 = var23 & 4095;
                                                if (~var21 >= ~var27) {
                                                   var27 = 0;
                                                   if (var5) {
                                                      var27 &= 255;
                                                   }
                                                } else {
                                                   var27 &= 255;
                                                }

                                                int var36;
                                                if (~var33 > ~var22) {
                                                   var36 = var33 & 255;
                                                   if (var5) {
                                                      var36 = 0;
                                                   }
                                                } else {
                                                   var36 = 0;
                                                }

                                                int var37 = var31 & 255;
                                                int var38 = var25 & 4095;
                                                int var39 = var24 & 4095;
                                                int var40 = var39 + -4096;
                                                short var41 = this.field2169[var37];
                                                int var42 = var38 - 4096;
                                                int var43 = class628.field8813[var38];
                                                int var44 = class628.field8813[var39];
                                                short var45 = this.field2169[var36];
                                                int var46 = class628.field8813[var35];
                                                int var47 = var35 + -4096;
                                                short var48 = this.field2169[var34 + var45];
                                                short var49 = this.field2169[var34 - -var41];
                                                short var50 = this.field2169[var32 + var41];
                                                short var51 = this.field2169[var32 + var45];
                                                int var52 = class536.method3864(this.field2169[var29 + var50], var39, var35, 7, var38);
                                                int var53 = class536.method3864(this.field2169[var27 + var50], var39, var35, 7, var42);
                                                int var54 = var52 - -((var53 - var52) * var43 >> 12);
                                                int var55 = class536.method3864(this.field2169[var29 + var49], var40, var35, 7, var38);
                                                int var56 = class536.method3864(this.field2169[var27 - -var49], var40, var35, 7, var42);
                                                int var57 = var55 - -((-var55 + var56) * var43 >> 12);
                                                int var58 = ((var57 - var54) * var44 >> 12) + var54;
                                                int var59 = class536.method3864(this.field2169[var29 + var51], var39, var47, arg3 ^ -15, var38);
                                                int var60 = class536.method3864(this.field2169[var27 + var51], var39, var47, 7, var42);
                                                int var61 = ((-var59 + var60) * var43 >> 12) + var59;
                                                int var62 = class536.method3864(this.field2169[var29 + var48], var40, var47, arg3 ^ -15, var38);
                                                int var63 = class536.method3864(this.field2169[var27 - -var48], var40, var47, arg3 ^ -15, var42);
                                                int var64 = ((-var62 + var63) * var43 >> 12) + var62;
                                                int var65 = var61 - -((-var61 + var64) * var44 >> 12);
                                                this.method1038((byte)-81, ((-var58 + var65) * var46 >> 12) + var58, var15);
                                                ++var15;
                                                if (var15 >= this.field2168) {
                                                   var10000 = this;
                                                   if (!var5) {
                                                      break;
                                                   }
                                                } else {
                                                   var10000 = this;
                                                }
                                             }
                                          }

                                          var10000.method1040(63);
                                          ++var14;
                                       } while(var14 < arg1);
                                    }

                                    ++var13;
                                 } while(~arg0 < ~var13);
                              }

                              ++var12;
                           } while(~arg2 < ~var12);

                           return;
                        }

                        ++var11;
                     }
                  }

                  ++var10;
               }
            }

            ++var9;
         }
      } catch (RuntimeException var67) {
         throw class534.method3846(var67, field2175[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method1043(boolean arg0);

   @OriginalMember(
      owner = "client!pha",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method1351(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field2165;
         Random var3 = new Random((long)this.field2173);
         int var4 = 0;
         if (var2) {
            this.field2169[var4] = (short)var4;
            ++var4;
         }

         while(true) {
            while(~var4 > -256) {
               this.field2169[var4] = (short)var4;
               ++var4;
            }

            int var5 = -120 % ((-7 - arg0) / 38);
            int var6 = 0;
            if (!var2) {
               if (!var2 && ~var6 <= -256) {
                  return;
               } else {
                  do {
                     int var7 = -var6 + 255;
                     int var8 = class221.method1687(var3, -48, var7);
                     short var9 = this.field2169[var8];
                     this.field2169[var8] = this.field2169[var7];
                     this.field2169[var7] = this.field2169[var7 + 256] = var9;
                     ++var6;
                  } while(~var6 > -256);

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field2175[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1352(int arg0) {
      try {
         field2172 = null;
         if (arg0 != 7890) {
            field2174 = 106;
         }

         field2167 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2175[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method1353(int arg0) {
      try {
         class239.method1795(109);
         int var1 = -52 / ((arg0 - -28) / 60);
         ++field2162;
         class775.field11283 = false;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2175[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method1354(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pha",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method1040(int arg0);

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(BII)V"
   )
   public abstract void method1038(byte arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!pha",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class174(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field2168 = arg1;
         this.field2173 = arg0;
         this.field2161 = arg4;
         this.field2171 = arg2;
         this.field2166 = arg3;
         this.method1354(29);
         this.method1351(43);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2175[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1355(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1356(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
