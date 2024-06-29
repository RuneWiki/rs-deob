import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class207 {
   @OriginalMember(
      owner = "client!sh",
      name = "t",
      descriptor = "J"
   )
   private long field2950 = -1L;
   @OriginalMember(
      owner = "client!sh",
      name = "g",
      descriptor = "I"
   )
   private int field2949 = 0;
   @OriginalMember(
      owner = "client!sh",
      name = "h",
      descriptor = "J"
   )
   private long field2943 = -1L;
   @OriginalMember(
      owner = "client!sh",
      name = "x",
      descriptor = "Lnea;"
   )
   private class610 field2938;
   @OriginalMember(
      owner = "client!sh",
      name = "i",
      descriptor = "J"
   )
   private long field2935;
   @OriginalMember(
      owner = "client!sh",
      name = "d",
      descriptor = "J"
   )
   private long field2946;
   @OriginalMember(
      owner = "client!sh",
      name = "c",
      descriptor = "[B"
   )
   private byte[] field2948;
   @OriginalMember(
      owner = "client!sh",
      name = "y",
      descriptor = "J"
   )
   private long field2940;
   @OriginalMember(
      owner = "client!sh",
      name = "m",
      descriptor = "[B"
   )
   private byte[] field2934;
   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2956 = new String[]{method1795(method1794("\u00152\u0019w-")), method1795(method1794("F3Y\u0014c\u000f6R\u0014")), method1795(method1794("/4AUi\u000f>\u0017G`\u00031\u0017@jF")), method1795(method1794("\u00152\u0019\u007f-")), method1795(method1794("\u001dt\u0019\u001ax")), method1795(method1794("\b/[X")), method1795(method1794("\u00152\u0019s-")), method1795(method1794("\u00152\u0019p-")), method1795(method1794("\u00152\u0019~-")), method1795(method1794("\u00152\u0019v-")), method1795(method1794("\u00152\u0019q-")), method1795(method1794("\u00152\u0019|-")), method1795(method1794("\u00152\u0019\bl\b3C\n-")), method1795(method1794("\u00152\u0019}-")), method1795(method1794("\u00152\u0019x-")), method1795(method1794("\u00152\u0019u-")), method1795(method1794("\u00152\u0019r-"))};
   @OriginalMember(
      owner = "client!sh",
      name = "u",
      descriptor = "I"
   )
   public static int field2939 = 1403;
   @OriginalMember(
      owner = "client!sh",
      name = "k",
      descriptor = "F"
   )
   public static float field2931;
   @OriginalMember(
      owner = "client!sh",
      name = "l",
      descriptor = "I"
   )
   public static int field2932;
   @OriginalMember(
      owner = "client!sh",
      name = "e",
      descriptor = "I"
   )
   public static int field2933;
   @OriginalMember(
      owner = "client!sh",
      name = "j",
      descriptor = "I"
   )
   public static int field2936;
   @OriginalMember(
      owner = "client!sh",
      name = "s",
      descriptor = "I"
   )
   public static int field2937;
   @OriginalMember(
      owner = "client!sh",
      name = "r",
      descriptor = "I"
   )
   private int field2941;
   @OriginalMember(
      owner = "client!sh",
      name = "b",
      descriptor = "I"
   )
   public static int field2944;
   @OriginalMember(
      owner = "client!sh",
      name = "w",
      descriptor = "I"
   )
   public static int field2945;
   @OriginalMember(
      owner = "client!sh",
      name = "p",
      descriptor = "I"
   )
   public static int field2947;
   @OriginalMember(
      owner = "client!sh",
      name = "n",
      descriptor = "I"
   )
   public static int field2951;
   @OriginalMember(
      owner = "client!sh",
      name = "o",
      descriptor = "I"
   )
   public static int field2952;
   @OriginalMember(
      owner = "client!sh",
      name = "q",
      descriptor = "I"
   )
   public static int field2953;
   @OriginalMember(
      owner = "client!sh",
      name = "v",
      descriptor = "I"
   )
   public static int field2954;
   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "I"
   )
   public static int field2955;
   @OriginalMember(
      owner = "client!sh",
      name = "f",
      descriptor = "J"
   )
   private long field2942;

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "([BZ)V"
   )
   public final void method1782(byte[] arg0, boolean arg1) throws IOException {
      try {
         this.method1787(0, -23385, arg0, arg0.length);
         if (arg1) {
            this.field2935 = -90L;
         }

         ++field2945;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2956[13] + (arg0 != null ? field2956[4] : field2956[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "c",
      descriptor = "(B)I"
   )
   public static final int method1783(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field2955;
         if (class696.field10048 == null) {
            if (!class678.field9669 && class143.field2272 != null) {
               return class143.field2272.field4160;
            }

            int var2 = class387.field5645.method1549(-104);
            int var3 = class387.field5645.method1560((byte)-80);
            int var10000;
            if (class392.field5703) {
               if (class752.field10679 < var2 && ~(class752.field10679 - -class587.field8249) < ~var2) {
                  int var4 = -1;
                  int var5 = 0;
                  int var6;
                  int var7;
                  if (var1) {
                     if (class317.field4742) {
                        var6 = var5 * 16 + class133.field2180 - -33;
                        if (var3 > var6 - 13) {
                           if (var3 <= var6 - -3) {
                              var4 = var5;
                              if (var1) {
                                 var7 = var5 * 16 + 31 + class133.field2180;
                                 if (var3 > var7 + -13 && var3 <= var7 + 3) {
                                    var4 = var5;
                                 }

                                 ++var5;
                              } else {
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                     } else {
                        var7 = var5 * 16 + 31 + class133.field2180;
                        if (var3 > var7 + -13 && var3 <= var7 + 3) {
                           var4 = var5;
                        }

                        ++var5;
                     }
                  }

                  label342:
                  while(true) {
                     if (class444.field6480 <= var5) {
                        var10000 = ~var4;
                        if (!var1) {
                           if (var10000 == 0) {
                              return arg0 != -114 ? -84 : -1;
                           }

                           int var8 = 0;
                           class162 var9 = new class162(class142.field2268);
                           class211 var10 = (class211)var9.method1525(32768);
                           if (var1) {
                              if (~var4 == ~(var8++)) {
                                 return ((class272)var10.field3011.field10341.field1553).field4160;
                              }

                              var10 = (class211)var9.method1527(false);
                           }

                           while(true) {
                              while(var10 != null) {
                                 if (~var4 == ~(var8++)) {
                                    return ((class272)var10.field3011.field10341.field1553).field4160;
                                 }

                                 var10 = (class211)var9.method1527(false);
                              }

                              if (!var1) {
                                 if (!var1) {
                                    return arg0 != -114 ? -84 : -1;
                                 }
                                 break label342;
                              }

                              var10 = (class211)var9.method1527(false);
                           }
                        }
                     } else {
                        var10000 = class317.field4742;
                     }

                     if (var10000 != 0) {
                        var6 = var5 * 16 + class133.field2180 - -33;
                        if (var3 > var6 - 13) {
                           if (var3 <= var6 - -3) {
                              var4 = var5;
                              if (var1) {
                                 var7 = var5 * 16 + 31 + class133.field2180;
                                 if (var3 > var7 + -13 && var3 <= var7 + 3) {
                                    var4 = var5;
                                 }

                                 ++var5;
                              } else {
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                     } else {
                        var7 = var5 * 16 + 31 + class133.field2180;
                        if (var3 > var7 + -13 && var3 <= var7 + 3) {
                           var4 = var5;
                        }

                        ++var5;
                     }
                  }
               }

               if (class562.field8001 == null || var2 <= class552.field7876 || ~var2 <= ~(class552.field7876 + class128.field2047)) {
                  return arg0 != -114 ? -84 : -1;
               }

               int var11;
               label243: {
                  var11 = -1;
                  int var12 = 0;
                  if (var1) {
                     var10000 = class317.field4742;
                  } else if (~var12 <= ~class562.field8001.field3008) {
                     var10000 = ~var11;
                     if (!var1) {
                        break label243;
                     }
                  } else {
                     var10000 = class317.field4742;
                  }

                  while(true) {
                     int var14;
                     if (var10000 != 0) {
                        int var13 = var12 * 16 + class674.field9446 + 33;
                        if (var13 - 13 < var3) {
                           if (var13 + 3 >= var3) {
                              var11 = var12;
                              if (var1) {
                                 var14 = var12 * 16 + 31 + class674.field9446;
                                 if (var14 + -13 < var3 && var14 + 3 >= var3) {
                                    var11 = var12;
                                 }

                                 ++var12;
                              } else {
                                 ++var12;
                              }
                           } else {
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     } else {
                        var14 = var12 * 16 + 31 + class674.field9446;
                        if (var14 + -13 < var3 && var14 + 3 >= var3) {
                           var11 = var12;
                        }

                        ++var12;
                     }

                     if (~var12 <= ~class562.field8001.field3008) {
                        var10000 = ~var11;
                        if (!var1) {
                           break;
                        }
                     } else {
                        var10000 = class317.field4742;
                     }
                  }
               }

               if (var10000 == 0) {
                  return arg0 != -114 ? -84 : -1;
               }

               int var15 = 0;
               class162 var16 = new class162(class562.field8001.field3011);
               class272 var17 = (class272)var16.method1525(32768);
               if (var1) {
                  if (var15++ == var11) {
                     return var17.field4160;
                  }

                  var17 = (class272)var16.method1527(false);
               }

               while(true) {
                  while(var17 != null) {
                     if (var15++ == var11) {
                        return var17.field4160;
                     }

                     var17 = (class272)var16.method1527(false);
                  }

                  if (!var1) {
                     if (!var1) {
                        return arg0 != -114 ? -84 : -1;
                     }
                     break;
                  }

                  var17 = (class272)var16.method1527(false);
               }
            }

            if (var2 > class752.field10679 && class752.field10679 + class587.field8249 > var2) {
               int var18;
               label167: {
                  var18 = -1;
                  int var19 = 0;
                  if (var1) {
                     var10000 = class317.field4742;
                  } else if (~var19 <= ~class687.field9909) {
                     var10000 = ~var18;
                     if (!var1) {
                        break label167;
                     }
                  } else {
                     var10000 = class317.field4742;
                  }

                  while(true) {
                     int var21;
                     if (var10000 != 0) {
                        int var20 = (-var19 + -1 + class687.field9909) * 16 + class133.field2180 + 33;
                        if (~(var20 + -13) > ~var3) {
                           if (var3 <= var20 - -3) {
                              var18 = var19;
                              if (var1) {
                                 var21 = (class687.field9909 + -1 + -var19) * 16 + 31 + class133.field2180;
                                 if (var21 - 13 < var3 && ~var3 >= ~(var21 + 3)) {
                                    var18 = var19;
                                 }

                                 ++var19;
                              } else {
                                 ++var19;
                              }
                           } else {
                              ++var19;
                           }
                        } else {
                           ++var19;
                        }
                     } else {
                        var21 = (class687.field9909 + -1 + -var19) * 16 + 31 + class133.field2180;
                        if (var21 - 13 < var3 && ~var3 >= ~(var21 + 3)) {
                           var18 = var19;
                        }

                        ++var19;
                     }

                     if (~var19 <= ~class687.field9909) {
                        var10000 = ~var18;
                        if (!var1) {
                           break;
                        }
                     } else {
                        var10000 = class317.field4742;
                     }
                  }
               }

               if (var10000 != 0) {
                  int var22 = 0;
                  class732 var23 = new class732(class594.field8377);
                  class272 var24 = (class272)var23.method5299(125);
                  if (var1 || var24 != null) {
                     do {
                        if (~var18 == ~(var22++)) {
                           return var24.field4160;
                        }

                        var24 = (class272)var23.method5301(arg0 ^ -114);
                     } while(var24 != null);
                  }
               }
            }
         }

         return arg0 != -114 ? -84 : -1;
      } catch (RuntimeException var26) {
         throw class612.method4503(var26, field2956[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(FIFFLgb;IFIFII)[B"
   )
   public static final byte[] method1784(float arg0, int arg1, float arg2, float arg3, class570 arg4, int arg5, float arg6, int arg7, float arg8, int arg9, int arg10) {
      try {
         ++field2936;
         byte[] var11 = new byte[arg9 * arg10 * arg1];
         class791.method5710(arg9, arg5, arg2, arg10, var11, true, arg4, arg0, 0, arg8, arg1, arg6, arg3);
         if (arg7 != -31506) {
            method1792((class39)null, (int[])null, (class39)null, (byte)38);
         }

         return var11;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field2956[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2956[4] : field2956[5]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "([BIIB)V"
   )
   public final void method1785(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
      boolean var5 = client.field10022;

      try {
         ++field2954;

         try {
            if (~this.field2946 > ~((long)arg1 + this.field2940)) {
               this.field2946 = (long)arg1 + this.field2940;
            }

            if (~this.field2950 != 0L && (this.field2950 > this.field2940 || ~((long)this.field2949 + this.field2950) > ~this.field2940)) {
               this.method1791((byte)-107);
            }

            if (~this.field2950 != 0L && (long)arg1 + this.field2940 > this.field2950 - -((long)this.field2948.length)) {
               int var6 = (int)((long)this.field2948.length + -this.field2940 + this.field2950);
               class474.method3640(arg0, arg2, this.field2948, (int)(-this.field2950 + this.field2940), var6);
               arg2 += var6;
               this.field2940 += (long)var6;
               arg1 -= var6;
               this.field2949 = this.field2948.length;
               this.method1791((byte)-75);
            }

            if (this.field2948.length >= arg1) {
               if (~arg1 < -1) {
                  if (~this.field2950 == 0L) {
                     this.field2950 = this.field2940;
                  }

                  class474.method3640(arg0, arg2, this.field2948, (int)(this.field2940 - this.field2950), arg1);
                  this.field2940 += (long)arg1;
                  if (~((long)this.field2949) > ~(this.field2940 - this.field2950)) {
                     this.field2949 = (int)(-this.field2950 + this.field2940);
                  }

               } else if (arg3 < 81) {
                  field2939 = 51;
               }
            } else {
               if (this.field2942 != this.field2940) {
                  this.field2938.method4493(this.field2940, 11);
                  this.field2942 = this.field2940;
               }

               this.field2938.method4491(1, arg0, arg2, arg1);
               this.field2942 += (long)arg1;
               if (this.field2942 > this.field2935) {
                  this.field2935 = this.field2942;
               }

               long var7;
               long var9;
               label138: {
                  var7 = -1L;
                  var9 = -1L;
                  if (~this.field2940 > ~this.field2943 || ~this.field2940 <= ~((long)this.field2941 + this.field2943)) {
                     if (this.field2940 > this.field2943 || ~this.field2943 <= ~(this.field2940 - -((long)arg1))) {
                        break label138;
                     }

                     var7 = this.field2943;
                     if (!var5) {
                        break label138;
                     }
                  }

                  var7 = this.field2940;
               }

               label139: {
                  if (this.field2943 >= (long)arg1 + this.field2940 || (long)arg1 + this.field2940 > (long)this.field2941 + this.field2943) {
                     if (~((long)this.field2941 + this.field2943) >= ~this.field2940 || (long)this.field2941 + this.field2943 > (long)arg1 + this.field2940) {
                        break label139;
                     }

                     var9 = (long)this.field2941 + this.field2943;
                     if (!var5) {
                        break label139;
                     }
                  }

                  var9 = this.field2940 - -((long)arg1);
               }

               if (~var7 < 0L && var9 > var7) {
                  int var11 = (int)(-var7 + var9);
                  class474.method3640(arg0, (int)((long)arg2 + var7 + -this.field2940), this.field2934, (int)(-this.field2943 + var7), var11);
               }

               this.field2940 += (long)arg1;
            }
         } catch (IOException var14) {
            this.field2942 = -1L;
            throw var14;
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field2956[3] + (arg0 != null ? field2956[4] : field2956[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(Z)V"
   )
   private final void method1786(boolean arg0) throws IOException {
      boolean var2 = client.field10022;

      try {
         this.field2941 = 0;
         ++field2951;
         if (this.field2942 != this.field2940) {
            this.field2938.method4493(this.field2940, 90);
            this.field2942 = this.field2940;
         }

         this.field2943 = this.field2940;
         int var10000;
         int var10001;
         int var3;
         if (var2) {
            var3 = -this.field2941 + this.field2934.length;
            if (var3 > 200000000) {
               var3 = 200000000;
            }
         } else {
            if (this.field2941 >= this.field2934.length) {
               var10000 = arg0;
               var10001 = 1;
               if (!var2) {
                  if (arg0 != 1) {
                     this.method1790(-9);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = -this.field2941;
               var10001 = this.field2934.length;
            }

            var3 = var10000 + var10001;
            if (var3 > 200000000) {
               var3 = 200000000;
            }
         }

         while(true) {
            while(true) {
               int var4 = this.field2938.method4492(9236, var3, this.field2941, this.field2934);
               if (var4 != -1) {
                  this.field2941 += var4;
                  this.field2942 += (long)var4;
                  if (this.field2941 >= this.field2934.length) {
                     var10000 = arg0;
                     var10001 = 1;
                     if (!var2) {
                        if (arg0 != 1) {
                           this.method1790(-9);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = -this.field2941;
                     var10001 = this.field2934.length;
                  }

                  var3 = var10000 + var10001;
                  if (var3 > 200000000) {
                     var3 = 200000000;
                  }
               } else {
                  if (!var2) {
                     if (arg0 != 1) {
                        this.method1790(-9);
                        return;
                     }

                     return;
                  }

                  var3 = arg0 + 1;
                  if (var3 > 200000000) {
                     var3 = 200000000;
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2956[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method1787(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field10022;

      try {
         ++field2932;

         try {
            if (~arg2.length > ~(arg0 + arg3)) {
               throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }

            if (~this.field2950 != 0L && this.field2950 <= this.field2940 && ~((long)arg3 + this.field2940) >= ~((long)this.field2949 + this.field2950)) {
               class474.method3640(this.field2948, (int)(-this.field2950 + this.field2940), arg2, arg0, arg3);
               this.field2940 += (long)arg3;
               return;
            }

            if (arg1 != -23385) {
               this.field2941 = -114;
            }

            long var6 = this.field2940;
            int var8 = arg0;
            int var9 = arg3;
            if (this.field2940 >= this.field2943 && ~this.field2940 > ~((long)this.field2941 + this.field2943)) {
               int var10 = (int)(-this.field2940 - (-this.field2943 - (long)this.field2941));
               if (var10 > arg3) {
                  var10 = arg3;
               }

               class474.method3640(this.field2934, (int)(-this.field2943 + this.field2940), arg2, arg0, var10);
               arg0 += var10;
               this.field2940 += (long)var10;
               arg3 -= var10;
            }

            int var10000;
            label181: {
               label180: {
                  if (~arg3 >= ~this.field2934.length) {
                     if (arg3 <= 0) {
                        long var23;
                        var10000 = (var23 = this.field2950 - -1L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
                        if (!var5) {
                           break label181;
                        }
                        break label180;
                     }

                     this.method1786(true);
                     int var11 = arg3;
                     if (this.field2941 < arg3) {
                        var11 = this.field2941;
                     }

                     class474.method3640(this.field2934, 0, arg2, arg0, var11);
                     this.field2940 += (long)var11;
                     arg3 -= var11;
                     arg0 += var11;
                     if (!var5) {
                        long var24;
                        var10000 = (var24 = this.field2950 - -1L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
                        if (!var5) {
                           break label181;
                        }
                        break label180;
                     }
                  }

                  this.field2938.method4493(this.field2940, 21);
                  this.field2942 = this.field2940;
                  if (var5) {
                     var10000 = this.field2938.method4492(9236, arg3, arg0, arg2);
                  } else if (~arg3 >= -1) {
                     long var25;
                     var10000 = (var25 = this.field2950 - -1L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
                     if (!var5) {
                        break label181;
                     }
                  } else {
                     var10000 = this.field2938.method4492(9236, arg3, arg0, arg2);
                  }
               }

               label173:
               while(true) {
                  while(true) {
                     int var12 = var10000;
                     if (var12 != -1) {
                        arg0 += var12;
                        this.field2940 += (long)var12;
                        arg3 -= var12;
                        this.field2942 += (long)var12;
                        if (~arg3 >= -1) {
                           long var26;
                           var10000 = (var26 = this.field2950 - -1L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
                           if (!var5) {
                              break label173;
                           }
                        } else {
                           var10000 = this.field2938.method4492(9236, arg3, arg0, arg2);
                        }
                     } else {
                        long var27;
                        var10000 = (var27 = this.field2950 - -1L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                        if (!var5) {
                           break label173;
                        }
                     }
                  }
               }
            }

            if (var10000 != 0) {
               if (~this.field2950 < ~this.field2940 && ~arg3 < -1) {
                  int var13 = (int)(-this.field2940 + this.field2950) + arg0;
                  if (~var13 < ~(arg0 - -arg3)) {
                     var13 = arg0 + arg3;
                     if (var5) {
                        arg2[arg0++] = 0;
                        --arg3;
                        ++this.field2940;
                     }
                  }

                  while(~arg0 > ~var13) {
                     arg2[arg0++] = 0;
                     --arg3;
                     ++this.field2940;
                  }
               }

               long var14;
               long var16;
               label208: {
                  var14 = -1L;
                  var16 = -1L;
                  if (this.field2950 < var6 || ~((long)var9 + var6) >= ~this.field2950) {
                     if (~this.field2950 < ~var6 || var6 >= (long)this.field2949 + this.field2950) {
                        break label208;
                     }

                     var14 = var6;
                     if (!var5) {
                        break label208;
                     }
                  }

                  var14 = this.field2950;
               }

               label209: {
                  if (~var6 <= ~((long)this.field2949 + this.field2950) || ~((long)this.field2949 + this.field2950) < ~((long)var9 + var6)) {
                     if ((long)var9 + var6 <= this.field2950 || (long)var9 + var6 > (long)this.field2949 + this.field2950) {
                        break label209;
                     }

                     var16 = var6 - -((long)var9);
                     if (!var5) {
                        break label209;
                     }
                  }

                  var16 = this.field2950 - -((long)this.field2949);
               }

               if (var14 > -1L && var14 < var16) {
                  int var18 = (int)(var16 - var14);
                  class474.method3640(this.field2948, (int)(var14 - this.field2950), arg2, (int)(-var6 + var14) + var8, var18);
                  if (~this.field2940 > ~var16) {
                     arg3 = (int)((long)arg3 - (var16 - this.field2940));
                     this.field2940 = var16;
                  }
               }
            }
         } catch (IOException var21) {
            this.field2942 = -1L;
            throw var21;
         }

         if (~arg3 < -1) {
            throw new EOFException();
         }
      } catch (RuntimeException var22) {
         throw class612.method4503(var22, field2956[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2956[4] : field2956[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method1788(long arg0, int arg1) throws IOException {
      try {
         if (arg1 == 0) {
            ++field2933;
            if (~arg0 > -1L) {
               throw new IOException(field2956[2] + arg0 + field2956[1] + this.method1793(false));
            } else {
               this.field2940 = arg0;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2956[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1789(byte arg0) throws IOException {
      try {
         this.method1791((byte)119);
         int var2 = 5 % ((arg0 - -55) / 46);
         ++field2944;
         this.field2938.method4494((byte)122);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2956[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method1790(int arg0) {
      try {
         if (arg0 != -3) {
            return -45L;
         } else {
            ++field2947;
            return this.field2946;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2956[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method1791(byte arg0) throws IOException {
      boolean var2 = client.field10022;

      try {
         ++field2952;
         int var3 = 80 / ((-19 - arg0) / 43);
         if (this.field2950 != -1L) {
            if (~this.field2950 != ~this.field2942) {
               this.field2938.method4493(this.field2950, 109);
               this.field2942 = this.field2950;
            }

            this.field2938.method4491(1, this.field2948, 0, this.field2949);
            this.field2942 += (long)this.field2949;
            if (this.field2935 < this.field2942) {
               this.field2935 = this.field2942;
            }

            long var4;
            long var6;
            label79: {
               var4 = -1L;
               var6 = -1L;
               if (~this.field2950 > ~this.field2943 || ~(this.field2943 - -((long)this.field2941)) >= ~this.field2950) {
                  if (this.field2950 > this.field2943 || this.field2943 >= (long)this.field2949 + this.field2950) {
                     break label79;
                  }

                  var4 = this.field2943;
                  if (!var2) {
                     break label79;
                  }
               }

               var4 = this.field2950;
            }

            label81: {
               if (this.field2943 >= this.field2950 - -((long)this.field2949) || ~((long)this.field2941 + this.field2943) > ~((long)this.field2949 + this.field2950)) {
                  if (this.field2950 >= this.field2943 - -((long)this.field2941) || ~((long)this.field2941 + this.field2943) < ~((long)this.field2949 + this.field2950)) {
                     break label81;
                  }

                  var6 = this.field2943 - -((long)this.field2941);
                  if (!var2) {
                     break label81;
                  }
               }

               var6 = (long)this.field2949 + this.field2950;
            }

            if (~var4 < 0L && ~var4 > ~var6) {
               int var8 = (int)(var6 - var4);
               class474.method3640(this.field2948, (int)(-this.field2950 + var4), this.field2934, (int)(-this.field2943 + var4), var8);
            }

            this.field2949 = 0;
            this.field2950 = -1L;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2956[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(Lsa;[ILsa;B)V"
   )
   public static final void method1792(class39 arg0, int[] arg1, class39 arg2, byte arg3) {
      try {
         if (arg3 != 49) {
            method1784(-0.33944538F, 49, 0.19038798F, 0.45558748F, (class570)null, -10, -1.1279572F, -38, 0.055035625F, -67, -96);
         }

         ++field2953;
         class793.field11535 = arg2;
         if (arg1 != null) {
            class556.field7901 = arg1;
         }

         class222.field3159 = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2956[11] + (arg0 != null ? field2956[4] : field2956[5]) + ',' + (arg1 != null ? field2956[4] : field2956[5]) + ',' + (arg2 != null ? field2956[4] : field2956[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "b",
      descriptor = "(Z)Ljava/io/File;"
   )
   private final File method1793(boolean arg0) {
      try {
         if (arg0) {
            this.field2941 = -100;
         }

         ++field2937;
         return this.field2938.method4497((byte)-93);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2956[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "<init>",
      descriptor = "(Lnea;II)V"
   )
   public class207(class610 arg0, int arg1, int arg2) throws IOException {
      try {
         this.field2938 = arg0;
         this.field2946 = this.field2935 = arg0.method4495(1191);
         this.field2948 = new byte[arg2];
         this.field2940 = 0L;
         this.field2934 = new byte[arg1];
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2956[12] + (arg0 != null ? field2956[4] : field2956[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1794(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1795(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
