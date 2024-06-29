import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class148 {
   @OriginalMember(
      owner = "client!ro",
      name = "h",
      descriptor = "J"
   )
   private long field2237 = -1L;
   @OriginalMember(
      owner = "client!ro",
      name = "s",
      descriptor = "I"
   )
   private int field2239 = 0;
   @OriginalMember(
      owner = "client!ro",
      name = "w",
      descriptor = "J"
   )
   private long field2235 = -1L;
   @OriginalMember(
      owner = "client!ro",
      name = "n",
      descriptor = "Ltq;"
   )
   private class441 field2249;
   @OriginalMember(
      owner = "client!ro",
      name = "c",
      descriptor = "J"
   )
   private long field2238;
   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "J"
   )
   private long field2233;
   @OriginalMember(
      owner = "client!ro",
      name = "k",
      descriptor = "J"
   )
   private long field2230;
   @OriginalMember(
      owner = "client!ro",
      name = "f",
      descriptor = "[B"
   )
   private byte[] field2250;
   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "[B"
   )
   private byte[] field2234;
   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2252 = new String[]{method1363(method1362("hJ\u0004\b[")), method1363(method1362("a\u000b\u0004e\u000e")), method1363(method1362("}\u0011FJ")), method1363(method1362("a\u000b\u0004n\u000e")), method1363(method1362("a\u000b\u0004l\u000e")), method1363(method1362("a\u000b\u0004\u001aO}\r^\u0018\u000e")), method1363(method1362("a\u000b\u0004g\u000e")), method1363(method1362("Z\n\\GJz\u0000\nUCv\u000f\nRI3")), method1363(method1362("a\u000b\u0004`\u000e")), method1363(method1362("3\rD\u0006@z\bO\u0006")), method1363(method1362("a\u000b\u0004c\u000e")), method1363(method1362("a\u000b\u0004o\u000e")), method1363(method1362("a\u000b\u0004a\u000e")), method1363(method1362("a\u000b\u0004d\u000e")), method1363(method1362("a\u000b\u0004b\u000e"))};
   @OriginalMember(
      owner = "client!ro",
      name = "d",
      descriptor = "I"
   )
   public static int field2244 = 0;
   @OriginalMember(
      owner = "client!ro",
      name = "i",
      descriptor = "I"
   )
   public static int field2229;
   @OriginalMember(
      owner = "client!ro",
      name = "v",
      descriptor = "I"
   )
   public static int field2231;
   @OriginalMember(
      owner = "client!ro",
      name = "u",
      descriptor = "I"
   )
   public static int field2236;
   @OriginalMember(
      owner = "client!ro",
      name = "g",
      descriptor = "I"
   )
   public static int field2240;
   @OriginalMember(
      owner = "client!ro",
      name = "l",
      descriptor = "I"
   )
   public static int field2241;
   @OriginalMember(
      owner = "client!ro",
      name = "o",
      descriptor = "I"
   )
   public static int field2242;
   @OriginalMember(
      owner = "client!ro",
      name = "t",
      descriptor = "I"
   )
   public static int field2243;
   @OriginalMember(
      owner = "client!ro",
      name = "q",
      descriptor = "I"
   )
   public static int field2245;
   @OriginalMember(
      owner = "client!ro",
      name = "e",
      descriptor = "I"
   )
   public static int field2246;
   @OriginalMember(
      owner = "client!ro",
      name = "r",
      descriptor = "I"
   )
   private int field2247;
   @OriginalMember(
      owner = "client!ro",
      name = "j",
      descriptor = "I"
   )
   public static int field2248;
   @OriginalMember(
      owner = "client!ro",
      name = "m",
      descriptor = "I"
   )
   public static int field2251;
   @OriginalMember(
      owner = "client!ro",
      name = "p",
      descriptor = "J"
   )
   private long field2232;

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1352(byte arg0) throws IOException {
      try {
         if (arg0 != -3) {
            this.field2237 = -33L;
         }

         this.method1357(0);
         ++field2251;
         this.field2249.method3477((byte)126);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2252[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "([BIIB)V"
   )
   public final void method1353(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
      boolean var5 = client.field1786;

      try {
         if (arg3 <= 91) {
            method1358((class28)null, -59, (class77)null, (class610)null, (byte)81, -75);
         }

         ++field2242;

         try {
            if (~(arg1 + arg2) < ~arg0.length) {
               throw new ArrayIndexOutOfBoundsException(arg1 + arg2 + -arg0.length);
            }

            if (this.field2235 != -1L && this.field2235 <= this.field2230 && ~(this.field2230 - -((long)arg2)) >= ~((long)this.field2239 + this.field2235)) {
               class107.method1027(this.field2250, (int)(-this.field2235 + this.field2230), arg0, arg1, arg2);
               this.field2230 += (long)arg2;
               return;
            }

            long var6 = this.field2230;
            int var8 = arg1;
            int var9 = arg2;
            if (this.field2237 <= this.field2230 && (long)this.field2247 + this.field2237 > this.field2230) {
               int var10 = (int)(-this.field2230 + this.field2237 + (long)this.field2247);
               if (arg2 < var10) {
                  var10 = arg2;
               }

               class107.method1027(this.field2234, (int)(this.field2230 - this.field2237), arg0, arg1, var10);
               this.field2230 += (long)var10;
               arg1 += var10;
               arg2 -= var10;
            }

            int var10000;
            label179: {
               label178: {
                  if (~this.field2234.length <= ~arg2) {
                     if (~arg2 >= -1) {
                        long var23;
                        var10000 = (var23 = this.field2235 - -1L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
                        if (!var5) {
                           break label179;
                        }
                        break label178;
                     }

                     this.method1356(112);
                     int var11 = arg2;
                     if (~arg2 < ~this.field2247) {
                        var11 = this.field2247;
                     }

                     class107.method1027(this.field2234, 0, arg0, arg1, var11);
                     this.field2230 += (long)var11;
                     arg2 -= var11;
                     arg1 += var11;
                     if (!var5) {
                        long var24;
                        var10000 = (var24 = this.field2235 - -1L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
                        if (!var5) {
                           break label179;
                        }
                        break label178;
                     }
                  }

                  this.field2249.method3478(this.field2230, -1);
                  this.field2232 = this.field2230;
                  if (var5) {
                     var10000 = this.field2249.method3473(arg0, arg2, arg1, (byte)-119);
                  } else if (arg2 <= 0) {
                     long var25;
                     var10000 = (var25 = this.field2235 - -1L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
                     if (!var5) {
                        break label179;
                     }
                  } else {
                     var10000 = this.field2249.method3473(arg0, arg2, arg1, (byte)-119);
                  }
               }

               label171:
               while(true) {
                  while(true) {
                     int var12 = var10000;
                     if (var12 != -1) {
                        this.field2230 += (long)var12;
                        arg2 -= var12;
                        this.field2232 += (long)var12;
                        arg1 += var12;
                        if (arg2 <= 0) {
                           long var26;
                           var10000 = (var26 = this.field2235 - -1L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
                           if (!var5) {
                              break label171;
                           }
                        } else {
                           var10000 = this.field2249.method3473(arg0, arg2, arg1, (byte)-119);
                        }
                     } else {
                        long var27;
                        var10000 = (var27 = this.field2235 - -1L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                        if (!var5) {
                           break label171;
                        }
                     }
                  }
               }
            }

            if (var10000 != 0) {
               if (~this.field2235 < ~this.field2230 && ~arg2 < -1) {
                  label200: {
                     int var13 = (int)(-this.field2230 + this.field2235) + arg1;
                     if (~var13 < ~(arg1 + arg2)) {
                        var13 = arg1 + arg2;
                        if (!var5 && arg1 >= var13) {
                           break label200;
                        }
                     } else if (arg1 >= var13) {
                        break label200;
                     }

                     do {
                        arg0[arg1++] = 0;
                        --arg2;
                        ++this.field2230;
                     } while(arg1 < var13);
                  }
               }

               long var14;
               label207: {
                  var14 = -1L;
                  if (var6 > this.field2235 || (long)var9 + var6 <= this.field2235) {
                     if (var6 < this.field2235 || var6 >= (long)this.field2239 + this.field2235) {
                        break label207;
                     }

                     var14 = var6;
                     if (!var5) {
                        break label207;
                     }
                  }

                  var14 = this.field2235;
               }

               long var16;
               label103: {
                  var16 = -1L;
                  if (~((long)this.field2239 + this.field2235) < ~var6 && (long)this.field2239 + this.field2235 <= (long)var9 + var6) {
                     var16 = (long)this.field2239 + this.field2235;
                     if (!var5) {
                        break label103;
                     }
                  }

                  if (this.field2235 < (long)var9 + var6 && ~((long)var9 + var6) >= ~((long)this.field2239 + this.field2235)) {
                     var16 = (long)var9 + var6;
                  }
               }

               if (~var14 < 0L && var16 > var14) {
                  int var18 = (int)(-var14 + var16);
                  class107.method1027(this.field2250, (int)(-this.field2235 + var14), arg0, (int)(-var6 + var14) + var8, var18);
                  if (~var16 < ~this.field2230) {
                     arg2 = (int)((long)arg2 - (var16 - this.field2230));
                     this.field2230 = var16;
                  }
               }
            }
         } catch (IOException var21) {
            this.field2232 = -1L;
            throw var21;
         }

         if (~arg2 < -1) {
            throw new EOFException();
         }
      } catch (RuntimeException var22) {
         throw class482.method3757(var22, field2252[14] + (arg0 != null ? field2252[0] : field2252[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(B[B)V"
   )
   public final void method1354(byte arg0, byte[] arg1) throws IOException {
      try {
         ++field2240;
         this.method1353(arg1, 0, arg1.length, (byte)105);
         if (arg0 != -33) {
            this.field2247 = -78;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2252[1] + arg0 + ',' + (arg1 != null ? field2252[0] : field2252[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(Z)J"
   )
   public final long method1355(boolean arg0) {
      try {
         ++field2229;
         if (!arg0) {
            this.method1355(true);
         }

         return this.field2233;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2252[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method1356(int arg0) throws IOException {
      boolean var2 = client.field1786;

      try {
         this.field2247 = 0;
         ++field2248;
         if (~this.field2232 != ~this.field2230) {
            this.field2249.method3478(this.field2230, -1);
            this.field2232 = this.field2230;
         }

         if (arg0 < 60) {
            this.method1355(true);
         }

         this.field2237 = this.field2230;
         if (var2 || ~this.field2234.length < ~this.field2247) {
            do {
               int var3 = this.field2234.length + -this.field2247;
               if (~var3 < -200000001) {
                  var3 = 200000000;
               }

               int var4 = this.field2249.method3473(this.field2234, var3, this.field2247, (byte)-73);
               if (var4 == -1) {
                  break;
               }

               this.field2232 += (long)var4;
               this.field2247 += var4;
            } while(~this.field2234.length < ~this.field2247);
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2252[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method1357(int arg0) throws IOException {
      boolean var2 = client.field1786;

      try {
         if (~this.field2235 != 0L) {
            if (~this.field2235 != ~this.field2232) {
               this.field2249.method3478(this.field2235, -1);
               this.field2232 = this.field2235;
            }

            this.field2249.method3474((byte)127, this.field2250, 0, this.field2239);
            this.field2232 += (long)this.field2239;
            if (this.field2232 > this.field2238) {
               this.field2238 = this.field2232;
            }

            long var3;
            label78: {
               var3 = -1L;
               if (this.field2235 < this.field2237 || ~((long)this.field2247 + this.field2237) >= ~this.field2235) {
                  if (this.field2235 > this.field2237 || this.field2237 >= (long)this.field2239 + this.field2235) {
                     break label78;
                  }

                  var3 = this.field2237;
                  if (!var2) {
                     break label78;
                  }
               }

               var3 = this.field2235;
            }

            long var5;
            label53: {
               var5 = -1L;
               if (this.field2237 < (long)this.field2239 + this.field2235 && ~(this.field2237 - -((long)this.field2247)) <= ~((long)this.field2239 + this.field2235)) {
                  var5 = (long)this.field2239 + this.field2235;
                  if (!var2) {
                     break label53;
                  }
               }

               if (~this.field2235 > ~((long)this.field2247 + this.field2237) && ~(this.field2235 - -((long)this.field2239)) <= ~((long)this.field2247 + this.field2237)) {
                  var5 = (long)this.field2247 + this.field2237;
               }
            }

            if (~var3 < 0L && var3 < var5) {
               int var7 = (int)(var5 - var3);
               class107.method1027(this.field2250, (int)(var3 - this.field2235), this.field2234, (int)(-this.field2237 + var3), var7);
            }

            this.field2239 = 0;
            this.field2235 = -1L;
         }

         if (arg0 == 0) {
            ++field2246;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field2252[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(Lkb;ILvea;Lha;BI)Z"
   )
   public static final boolean method1358(class28 arg0, int arg1, class77 arg2, class610 arg3, byte arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field2241;
         int var7 = -110 % ((arg4 - 23) / 38);
         int var8 = Integer.MAX_VALUE;
         int var9 = Integer.MIN_VALUE;
         int var10 = Integer.MAX_VALUE;
         int var11 = Integer.MIN_VALUE;
         if (arg2.field1010 != null) {
            var8 = class60.field761 - -((arg0.field336 + arg2.field1030 + -class60.field776) * (-class60.field761 + class60.field769) / (-class60.field776 + class60.field765));
            var11 = -((class60.field767 - class60.field772) * (-class60.field762 + arg0.field335 + arg2.field996) / (-class60.field762 + class60.field758)) + class60.field767;
            var9 = (-class60.field776 + arg0.field336 + arg2.field1005) * (-class60.field761 + class60.field769) / (-class60.field776 + class60.field765) + class60.field761;
            var10 = -((class60.field767 - class60.field772) * (arg0.field335 + arg2.field995 + -class60.field762) / (-class60.field762 + class60.field758)) + class60.field767;
         }

         class672 var12 = null;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         if (arg2.field1009 != -1) {
            if (arg0.field333 && ~arg2.field1035 != 0) {
               var12 = arg2.method727(117, true, arg3);
            } else {
               var12 = arg2.method727(124, false, arg3);
            }

            if (var12 != null) {
               var13 = arg0.field338 + -(1 + var12.method2106() >> 1);
               var14 = arg0.field338 - -(var12.method2106() + 1 >> 1);
               if (~var13 > ~var8) {
                  var8 = var13;
               }

               if (var14 > var9) {
                  var9 = var14;
               }

               var15 = arg0.field339 + -(var12.method2108() + 1 >> 1);
               if (var10 > var15) {
                  var10 = var15;
               }

               var16 = arg0.field339 - -(1 + var12.method2108() >> 1);
               if (var16 > var11) {
                  var11 = var16;
               }
            }
         }

         class343 var17 = null;
         int var18 = 0;
         int var19 = 0;
         int var20 = 0;
         int var21 = 0;
         int var22 = 0;
         int var23 = 0;
         int var24 = 0;
         int var25 = 0;
         if (arg2.field1013 != null) {
            var17 = class154.method1395(arg2.field1021, 1);
            if (var17 != null) {
               label162: {
                  var18 = class632.field9131.method5123(false, class259.field4269, (class672[])null, arg2.field1013, (int[])null);
                  var20 = -((class60.field767 - class60.field772) * arg2.field1015 / (-class60.field762 + class60.field758)) + arg0.field339;
                  var19 = (-class60.field761 + class60.field769) * arg2.field1001 / (-class60.field776 + class60.field765) + arg0.field338;
                  if (var12 == null) {
                     var20 -= var17.method2771() * var18 / 2;
                     if (!var6) {
                        break label162;
                     }
                  }

                  var20 -= (var12.method2108() >> 1) - -(var18 * var17.method2768());
               }

               int var26 = 0;
               if (var6 || ~var18 < ~var26) {
                  do {
                     String var27 = class259.field4269[var26];
                     if (var18 - 1 > var26) {
                        var27 = var27.substring(0, -4 + var27.length());
                     }

                     int var28 = var17.method2773(var27);
                     if (~var28 < ~var21) {
                        var21 = var28;
                     }

                     ++var26;
                  } while(~var18 < ~var26);
               }

               var22 = -(var21 / 2) + var19 - -arg1;
               if (var8 > var22) {
                  var8 = var22;
               }

               var23 = var21 / 2 + var19 + arg1;
               var24 = arg5 + var20;
               if (~var9 > ~var23) {
                  var9 = var23;
               }

               if (var10 > var24) {
                  var10 = var24;
               }

               var25 = arg5 + var20 + var18 * var17.method2768();
               if (~var11 > ~var25) {
                  var11 = var25;
               }
            }
         }

         if (~class60.field761 >= ~var9 && ~class60.field769 <= ~var8 && var11 >= class60.field772 && ~class60.field767 <= ~var10) {
            class60.method465(arg3, arg0, arg2);
            if (var12 != null) {
               if (class475.field7231 > 0 && (~class739.field10981 != 0 && ~class739.field10981 == ~arg0.field332 || ~class600.field8790 != 0 && class600.field8790 == arg2.field1003)) {
                  int var29;
                  label133: {
                     if (~class241.field3658 < -51) {
                        var29 = (-class241.field3658 + 100) * 2;
                        if (!var6) {
                           break label133;
                        }
                     }

                     var29 = class241.field3658 * 2;
                  }

                  int var30 = var29 << 24 | 16776960;
                  arg3.method4503(869, var30, arg0.field339, var12.method2104() / 2 - -7, arg0.field338);
                  arg3.method4503(869, var30, arg0.field339, 5 + var12.method2104() / 2, arg0.field338);
                  arg3.method4503(869, var30, arg0.field339, 3 + var12.method2104() / 2, arg0.field338);
                  arg3.method4503(869, var30, arg0.field339, 1 + var12.method2104() / 2, arg0.field338);
                  arg3.method4503(869, var30, arg0.field339, var12.method2104() / 2, arg0.field338);
               }

               var12.method4959(arg0.field338 - (var12.method2106() >> 1), arg0.field339 + -(var12.method2108() >> 1));
            }

            if (arg2.field1013 != null && var17 != null) {
               class178.method1623(arg3, true, var21, arg2, var18, arg0, var20, var19, var17);
            }

            if (arg2.field1009 != -1 || arg2.field1013 != null) {
               class719 var31 = new class719(arg0);
               var31.field10776 = var24;
               var31.field10769 = var13;
               var31.field10773 = var15;
               var31.field10775 = var16;
               var31.field10777 = var22;
               var31.field10781 = var14;
               var31.field10771 = var23;
               var31.field10770 = var25;
               class788.field11542.method4980(var31, 0);
            }

            return false;
         } else {
            return true;
         }
      } catch (RuntimeException var33) {
         throw class482.method3757(var33, field2252[12] + (arg0 != null ? field2252[0] : field2252[2]) + ',' + arg1 + ',' + (arg2 != null ? field2252[0] : field2252[2]) + ',' + (arg3 != null ? field2252[0] : field2252[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method1359(long arg0, int arg1) throws IOException {
      try {
         ++field2236;
         if (arg1 >= 123) {
            if (~arg0 > -1L) {
               throw new IOException(field2252[7] + arg0 + field2252[9] + this.method1361((byte)101));
            } else {
               this.field2230 = arg0;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2252[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(III[B)V"
   )
   public final void method1360(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      boolean var5 = client.field1786;

      try {
         ++field2245;

         try {
            if (~this.field2233 > ~((long)arg1 + this.field2230)) {
               this.field2233 = this.field2230 - -((long)arg1);
            }

            if (this.field2235 != -1L && (this.field2235 > this.field2230 || ~this.field2230 < ~(this.field2235 - -((long)this.field2239)))) {
               this.method1357(0);
            }

            if (arg2 == 2755) {
               if (this.field2235 != -1L && ~((long)arg1 + this.field2230) < ~((long)this.field2250.length + this.field2235)) {
                  int var6 = (int)((long)this.field2250.length - this.field2230 - -this.field2235);
                  class107.method1027(arg3, arg0, this.field2250, (int)(-this.field2235 + this.field2230), var6);
                  arg1 -= var6;
                  arg0 += var6;
                  this.field2230 += (long)var6;
                  this.field2239 = this.field2250.length;
                  this.method1357(arg2 + -2755);
               }

               if (~arg1 >= ~this.field2250.length) {
                  if (~arg1 < -1) {
                     if (this.field2235 == -1L) {
                        this.field2235 = this.field2230;
                     }

                     class107.method1027(arg3, arg0, this.field2250, (int)(-this.field2235 + this.field2230), arg1);
                     this.field2230 += (long)arg1;
                     if ((long)this.field2239 < this.field2230 - this.field2235) {
                        this.field2239 = (int)(-this.field2235 + this.field2230);
                     }

                  }
               } else {
                  if (this.field2232 != this.field2230) {
                     this.field2249.method3478(this.field2230, -1);
                     this.field2232 = this.field2230;
                  }

                  this.field2249.method3474((byte)127, arg3, arg0, arg1);
                  this.field2232 += (long)arg1;
                  if (this.field2232 > this.field2238) {
                     this.field2238 = this.field2232;
                  }

                  long var7;
                  label101: {
                     var7 = -1L;
                     if (~this.field2237 >= ~this.field2230 && (long)this.field2247 + this.field2237 > this.field2230) {
                        var7 = this.field2230;
                        if (!var5) {
                           break label101;
                        }
                     }

                     if (this.field2237 >= this.field2230 && ~(this.field2230 - -((long)arg1)) < ~this.field2237) {
                        var7 = this.field2237;
                     }
                  }

                  long var9;
                  label130: {
                     var9 = -1L;
                     if (~(this.field2230 - -((long)arg1)) >= ~this.field2237 || ~((long)this.field2247 + this.field2237) > ~((long)arg1 + this.field2230)) {
                        if (~(this.field2237 - -((long)this.field2247)) >= ~this.field2230 || ~((long)arg1 + this.field2230) > ~(this.field2237 - -((long)this.field2247))) {
                           break label130;
                        }

                        var9 = (long)this.field2247 + this.field2237;
                        if (!var5) {
                           break label130;
                        }
                     }

                     var9 = (long)arg1 + this.field2230;
                  }

                  if (var7 > -1L && ~var7 > ~var9) {
                     int var11 = (int)(-var7 + var9);
                     class107.method1027(arg3, (int)((long)arg0 - -var7 + -this.field2230), this.field2234, (int)(var7 - this.field2237), var11);
                  }

                  this.field2230 += (long)arg1;
               }
            }
         } catch (IOException var14) {
            this.field2232 = -1L;
            throw var14;
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field2252[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2252[0] : field2252[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "(B)Ljava/io/File;"
   )
   private final File method1361(byte arg0) {
      try {
         ++field2243;
         return arg0 != 101 ? null : this.field2249.method3475(true);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2252[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "<init>",
      descriptor = "(Ltq;II)V"
   )
   public class148(class441 arg0, int arg1, int arg2) throws IOException {
      try {
         this.field2249 = arg0;
         this.field2233 = this.field2238 = arg0.method3476((byte)-91);
         this.field2230 = 0L;
         this.field2250 = new byte[arg2];
         this.field2234 = new byte[arg1];
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2252[5] + (arg0 != null ? field2252[0] : field2252[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1362(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1363(char[] arg0) {
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
            var10005 = 100;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
