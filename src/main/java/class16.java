import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 {
   @OriginalMember(
      owner = "client!ds",
      name = "k",
      descriptor = "[Lbha;"
   )
   public class601[] field185;
   @OriginalMember(
      owner = "client!ds",
      name = "b",
      descriptor = "[Lbha;"
   )
   public class601[] field184;
   @OriginalMember(
      owner = "client!ds",
      name = "f",
      descriptor = "Lah;"
   )
   public class408 field181;
   @OriginalMember(
      owner = "client!ds",
      name = "g",
      descriptor = "Lah;"
   )
   public class408 field180;
   @OriginalMember(
      owner = "client!ds",
      name = "l",
      descriptor = "Lah;"
   )
   public class408 field189;
   @OriginalMember(
      owner = "client!ds",
      name = "d",
      descriptor = "Z"
   )
   public boolean field179;
   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field191 = new String[]{method95(method94("\u0005iT2")), method95(method94("\u00102\u0016pI")), method95(method94("\u000fo\u0016\u001f\u001c")), method95(method94("\u000fo\u0016\u001d\u001c")), method95(method94("\u000fo\u0016b]\u0005uL`\u001c")), method95(method94("\u000fo\u0016\u001c\u001c"))};
   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "J"
   )
   public static long field182 = 1L;
   @OriginalMember(
      owner = "client!ds",
      name = "e",
      descriptor = "Lqd;"
   )
   public static class475 field187 = new class475("", 12);
   @OriginalMember(
      owner = "client!ds",
      name = "j",
      descriptor = "I"
   )
   public static int field183;
   @OriginalMember(
      owner = "client!ds",
      name = "h",
      descriptor = "I"
   )
   public static int field186;
   @OriginalMember(
      owner = "client!ds",
      name = "i",
      descriptor = "I"
   )
   public static int field190;
   @OriginalMember(
      owner = "client!ds",
      name = "c",
      descriptor = "Lgt;"
   )
   public static class483 field188;

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static final void method91(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(IIIIIIIILdha;Lha;IILka;I)Lka;",
      line = 901
   )
   public static final class500 method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class85 arg8, class66 arg9, int arg10, int arg11, class500 arg12, int arg13) {
      boolean var14 = client.field4360;

      try {
         ++field183;
         if (arg12 == null) {
            return null;
         } else {
            if (arg13 != 796) {
               method93(false);
            }

            int var15 = 2055;
            if (arg8 != null) {
               int var16 = var15 | arg8.method763(false, arg11, -1, -1);
               var15 = var16 & -513;
            }

            long var17 = ((long)arg5 << 48) + ((long)arg3 << 32) + (long)((arg7 << 16) + (arg2 << 24) + arg4);
            class80 var19 = class220.field3139;
            class500 var20;
            synchronized(class220.field3139) {
               var20 = (class500)class220.field3139.method725(0, var17);
            }

            if (var20 == null || ~arg9.method531(var20.method214(), var15) != -1) {
               if (var20 != null) {
                  var15 = arg9.method543(var15, var20.method214());
               }

               byte var21;
               if (arg4 != 1) {
                  if (arg4 != 2) {
                     if (arg4 != 3) {
                        if (~arg4 == -5) {
                           var21 = 18;
                        } else {
                           var21 = 21;
                        }
                     } else {
                        var21 = 15;
                     }
                  } else {
                     var21 = 12;
                  }
               } else {
                  var21 = 9;
               }

               byte var22;
               class464 var24;
               int var25;
               int[][] var26;
               int var28;
               label204: {
                  var22 = 3;
                  int[] var23 = new int[]{64, 96, 128};
                  var24 = new class464(var21 * var22 + 1, var21 * 2 * var22 + -var21, 0);
                  var25 = var24.method3366(118, 0, 0, 0);
                  var26 = new int[var22][var21];
                  int var27 = 0;
                  if (var14) {
                     var28 = var23[var27];
                  } else if (~var27 <= ~var22) {
                     var28 = 0;
                     if (!var14) {
                        break label204;
                     }
                  } else {
                     var28 = var23[var27];
                  }

                  while(true) {
                     int var29 = var23[var27];
                     int var30 = 0;
                     if (var14 || var21 > var30) {
                        do {
                           int var31 = (var30 << 14) / var21;
                           int var32 = class363.field4956[var31] * var28 >> 14;
                           int var33 = class363.field4987[var31] * var29 >> 14;
                           var26[var27][var30] = var24.method3366(122, var32, 0, var33);
                           ++var30;
                        } while(var21 > var30);
                     }

                     ++var27;
                     if (~var27 <= ~var22) {
                        var28 = 0;
                        if (!var14) {
                           break;
                        }
                     } else {
                        var28 = var23[var27];
                     }
                  }
               }

               if (var14 || ~var22 < ~var28) {
                  do {
                     int var34 = (var28 * 256 + 128) / var22;
                     int var35 = 256 - var34;
                     byte var36 = (byte)(arg2 * var34 + arg7 * var35 >> 8);
                     short var37 = (short)(((64512 & arg3) * var35 + (arg5 & 64512) * var34 & 16515072) + ((896 & arg3) * var35 + (arg5 & 896) * var34 & 229376) + (32512 & (arg3 & 127) * var35 + (127 & arg5) * var34) >> 8);
                     int var38 = 0;
                     if (var14) {
                        if (var28 == 0) {
                           var24.method3375(var37, (byte)95, var26[0][(var38 - -1) % var21], (byte)1, var36, var26[0][var38], var25, (byte)-1, (short)-1);
                           if (var14) {
                              var24.method3375(var37, (byte)70, var26[var28 + -1][(var38 + 1) % var21], (byte)1, var36, var26[var28][(var38 - -1) % var21], var26[var28 + -1][var38], (byte)-1, (short)-1);
                              var24.method3375(var37, (byte)43, var26[var28][(var38 + 1) % var21], (byte)1, var36, var26[var28][var38], var26[var28 + -1][var38], (byte)-1, (short)-1);
                              ++var38;
                           } else {
                              ++var38;
                           }
                        } else {
                           var24.method3375(var37, (byte)70, var26[var28 + -1][(var38 + 1) % var21], (byte)1, var36, var26[var28][(var38 - -1) % var21], var26[var28 + -1][var38], (byte)-1, (short)-1);
                           var24.method3375(var37, (byte)43, var26[var28][(var38 + 1) % var21], (byte)1, var36, var26[var28][var38], var26[var28 + -1][var38], (byte)-1, (short)-1);
                           ++var38;
                        }
                     }

                     while(true) {
                        while(var38 < var21) {
                           if (var28 == 0) {
                              var24.method3375(var37, (byte)95, var26[0][(var38 - -1) % var21], (byte)1, var36, var26[0][var38], var25, (byte)-1, (short)-1);
                              if (var14) {
                                 var24.method3375(var37, (byte)70, var26[var28 + -1][(var38 + 1) % var21], (byte)1, var36, var26[var28][(var38 - -1) % var21], var26[var28 + -1][var38], (byte)-1, (short)-1);
                                 var24.method3375(var37, (byte)43, var26[var28][(var38 + 1) % var21], (byte)1, var36, var26[var28][var38], var26[var28 + -1][var38], (byte)-1, (short)-1);
                                 ++var38;
                              } else {
                                 ++var38;
                              }
                           } else {
                              var24.method3375(var37, (byte)70, var26[var28 + -1][(var38 + 1) % var21], (byte)1, var36, var26[var28][(var38 - -1) % var21], var26[var28 + -1][var38], (byte)-1, (short)-1);
                              var24.method3375(var37, (byte)43, var26[var28][(var38 + 1) % var21], (byte)1, var36, var26[var28][var38], var26[var28 + -1][var38], (byte)-1, (short)-1);
                              ++var38;
                           }
                        }

                        if (!var14) {
                           ++var28;
                           break;
                        }

                        var24.method3375(var37, (byte)43, var26[var28][(var38 + 1) % var21], (byte)1, var36, var26[var28][var38], var26[var28 + -1][var38], (byte)-1, (short)-1);
                        ++var38;
                     }
                  } while(~var22 < ~var28);
               }

               var20 = arg9.method555(var24, var15, class559.field8010, 64, 768);
               class80 var39 = class220.field3139;
               synchronized(class220.field3139) {
                  class220.field3139.method723(0, var17, var20);
               }
            }

            int var40 = arg12.method199();
            int var41 = arg12.method220();
            int var42 = arg12.method197();
            int var43 = arg12.method162();
            class106 var44 = null;
            if (arg8 != null) {
               int var49 = arg8.field1102[arg11];
               var44 = class190.field2702.method4414(105, var49 >> 16);
               arg11 = var49 & 65535;
            }

            label110: {
               if (var44 == null) {
                  var20 = var20.method159((byte)3, var15, true);
                  var20.method166(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                  var20.method164(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                  if (!var14) {
                     break label110;
                  }
               }

               var20 = var20.method159((byte)3, var15, true);
               var20.method166(-var40 + var41 >> 1, 128, var43 - var42 >> 1);
               var20.method164(var40 + var41 >> 1, 0, var42 + var43 >> 1);
               var20.method3627(arg11, 29604, var44);
            }

            if (arg6 != 0) {
               var20.method227(arg6);
            }

            if (~arg10 != -1) {
               var20.method193(arg10);
            }

            if (~arg0 != -1) {
               var20.method164(0, arg0, 0);
            }

            return var20;
         }
      } catch (RuntimeException var48) {
         throw class237.method1823(var48, field191[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field191[1] : field191[0]) + ',' + (arg9 != null ? field191[1] : field191[0]) + ',' + arg10 + ',' + arg11 + ',' + (arg12 != null ? field191[1] : field191[0]) + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(Z)V",
      line = 1074
   )
   public static void method93(boolean arg0) {
      try {
         field188 = null;
         if (!arg0) {
            method92(-91, 48, -92, -43, 75, 84, -74, 64, (class85)null, (class66)null, 120, 115, (class500)null, -32);
         }

         field187 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field191[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "<init>",
      descriptor = "(Lea;)V",
      line = 1116
   )
   public class16(class573 arg0) {
      boolean var2 = client.field4360;
      super();
      this.field185 = null;
      this.field184 = null;
      this.field181 = null;
      this.field180 = null;
      this.field189 = null;

      try {
         this.field179 = arg0.field8483;
         class134.method1057(arg0, false);
         if (this.field179) {
            byte[] var3 = class345.method2527(-70, class428.field6131, false);
            this.field189 = new class408(arg0, 6410, 128, 128, 16, var3, 6410);
            byte[] var4 = class345.method2527(-104, class611.field8965, false);
            this.field180 = new class408(arg0, 6410, 128, 128, 16, var4, 6410);
            class470 var5 = arg0.field8351;
            if (var5.method3407((byte)126)) {
               class408 var7;
               label35: {
                  byte[] var6 = class345.method2527(-112, class515.field7444, false);
                  this.field181 = new class408(arg0, 6408, 128, 128, 16);
                  var7 = new class408(arg0, 6409, 128, 128, 16, var6, 6409);
                  if (var5.method3409(2.0F, true, this.field181, var7)) {
                     this.field181.method3528((byte)-99);
                     if (!var2) {
                        break label35;
                     }
                  }

                  this.field181.method3522((byte)-91);
                  this.field181 = null;
               }

               var7.method3522((byte)-91);
               return;
            }
         } else {
            Object var10000;
            int var10001;
            label63: {
               this.field184 = new class601[16];
               int var8 = 0;
               if (var2) {
                  var10000 = class428.field6131;
                  var10001 = var8 * 128 * 2 * 128;
               } else if (var8 >= 16) {
                  var10000 = this;
                  var10001 = 16;
                  if (!var2) {
                     break label63;
                  }
               } else {
                  var10000 = class428.field6131;
                  var10001 = var8 * 128 * 2 * 128;
               }

               while(true) {
                  byte[] var9 = class140.method1107(var10000, var10001, 98, 32768);
                  this.field184[var8] = new class601(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
                  ++var8;
                  if (var8 >= 16) {
                     var10000 = this;
                     var10001 = 16;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = class428.field6131;
                     var10001 = var8 * 128 * 2 * 128;
                  }
               }
            }

            ((class16)var10000).field185 = new class601[var10001];
            int var10 = 0;
            if (var2 || ~var10 > -17) {
               do {
                  byte[] var11 = class140.method1107(class611.field8965, var10 * 128 * 128 * 2, 122, 32768);
                  this.field185[var10] = new class601(arg0, 3553, 6410, 128, 128, true, var11, 6410, false);
                  ++var10;
               } while(~var10 > -17);
            }
         }

      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field191[4] + (arg0 != null ? field191[1] : field191[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method94(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method95(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
