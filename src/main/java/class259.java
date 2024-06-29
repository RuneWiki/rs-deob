import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class259 {
   @OriginalMember(
      owner = "client!dea",
      name = "g",
      descriptor = "J"
   )
   private long field3301 = -1L;
   @OriginalMember(
      owner = "client!dea",
      name = "c",
      descriptor = "I"
   )
   private int field3305 = 0;
   @OriginalMember(
      owner = "client!dea",
      name = "i",
      descriptor = "J"
   )
   private long field3321 = -1L;
   @OriginalMember(
      owner = "client!dea",
      name = "l",
      descriptor = "Lti;"
   )
   private class468 field3319;
   @OriginalMember(
      owner = "client!dea",
      name = "s",
      descriptor = "J"
   )
   private long field3317;
   @OriginalMember(
      owner = "client!dea",
      name = "e",
      descriptor = "J"
   )
   private long field3306;
   @OriginalMember(
      owner = "client!dea",
      name = "p",
      descriptor = "[B"
   )
   private byte[] field3316;
   @OriginalMember(
      owner = "client!dea",
      name = "q",
      descriptor = "J"
   )
   private long field3308;
   @OriginalMember(
      owner = "client!dea",
      name = "v",
      descriptor = "[B"
   )
   private byte[] field3311;
   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3324 = new String[]{method1989(method1988("},x\u0004")), method1989(method1988("hw:F|")), method1989(method1988("w<uFG;")), method1989(method1988("w<uFD;")), method1989(method1988("w<uFE;")), method1989(method1988("w<uFH;")), method1989(method1988("w<uF=z7}\u001c?;")), method1989(method1988("w<uFJ;")), method1989(method1988("w<uFK;")), method1989(method1988("w<uFI;")), method1989(method1988("w<uFC;")), method1989(method1988("30zHgz5qH")), method1989(method1988("Z7b\tmz=4\u001bdv24\u001cn3")), method1989(method1988("w<uFF;")), method1989(method1988("w<uF@;")), method1989(method1988("w<uFB;"))};
   @OriginalMember(
      owner = "client!dea",
      name = "j",
      descriptor = "I"
   )
   public static int field3302;
   @OriginalMember(
      owner = "client!dea",
      name = "m",
      descriptor = "I"
   )
   public static int field3303;
   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "I"
   )
   public static int field3304;
   @OriginalMember(
      owner = "client!dea",
      name = "w",
      descriptor = "I"
   )
   public static int field3307;
   @OriginalMember(
      owner = "client!dea",
      name = "u",
      descriptor = "I"
   )
   public static int field3309;
   @OriginalMember(
      owner = "client!dea",
      name = "h",
      descriptor = "I"
   )
   private int field3310;
   @OriginalMember(
      owner = "client!dea",
      name = "t",
      descriptor = "I"
   )
   public static int field3313;
   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "I"
   )
   public static int field3314;
   @OriginalMember(
      owner = "client!dea",
      name = "k",
      descriptor = "I"
   )
   public static int field3315;
   @OriginalMember(
      owner = "client!dea",
      name = "o",
      descriptor = "I"
   )
   public static int field3318;
   @OriginalMember(
      owner = "client!dea",
      name = "f",
      descriptor = "I"
   )
   public static int field3322;
   @OriginalMember(
      owner = "client!dea",
      name = "n",
      descriptor = "I"
   )
   public static int field3323;
   @OriginalMember(
      owner = "client!dea",
      name = "d",
      descriptor = "J"
   )
   private long field3312;
   @OriginalMember(
      owner = "client!dea",
      name = "r",
      descriptor = "Lln;"
   )
   public static class401 field3320;

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(IJ)V"
   )
   public final void method1977(int arg0, long arg1) throws IOException {
      try {
         if (arg0 != 6825) {
            this.method1987(-64);
         }

         ++field3309;
         if (~arg1 > -1L) {
            throw new IOException(field3324[12] + arg1 + field3324[11] + this.method1987(-115));
         } else {
            this.field3308 = arg1;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3324[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(I[B)V"
   )
   public final void method1978(int arg0, byte[] arg1) throws IOException {
      try {
         ++field3318;
         this.method1982(arg1.length, arg1, (byte)115, 0);
         if (arg0 != 681) {
            method1984(-114, -97, -39, (byte)-125, false, -83, 89);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3324[15] + arg0 + ',' + (arg1 != null ? field3324[1] : field3324[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1979(int arg0) {
      try {
         field3320 = null;
         if (arg0 != 0) {
            field3320 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3324[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1980(byte arg0) throws IOException {
      try {
         ++field3304;
         if (arg0 <= 82) {
            field3322 = -118;
         }

         this.method1983(-1);
         this.field3319.method3435(false);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3324[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(ZI[BI)V"
   )
   public final void method1981(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field4273;

      try {
         ++field3314;

         try {
            if (~((long)arg1 + this.field3308) < ~this.field3306) {
               this.field3306 = (long)arg1 + this.field3308;
            }

            if (~this.field3321 != 0L && (~this.field3321 < ~this.field3308 || this.field3308 > (long)this.field3305 + this.field3321)) {
               this.method1983(-1);
            }

            if (this.field3321 != -1L && (long)this.field3311.length + this.field3321 < this.field3308 - -((long)arg1)) {
               int var6 = (int)((long)this.field3311.length - this.field3308 + this.field3321);
               class714.method5200(arg2, arg3, this.field3311, (int)(-this.field3321 + this.field3308), var6);
               arg3 += var6;
               this.field3308 += (long)var6;
               arg1 -= var6;
               this.field3305 = this.field3311.length;
               this.method1983(-1);
            }

            if (arg0) {
               this.field3311 = null;
            }

            if (this.field3311.length >= arg1) {
               if (arg1 > 0) {
                  if (~this.field3321 == 0L) {
                     this.field3321 = this.field3308;
                  }

                  class714.method5200(arg2, arg3, this.field3311, (int)(-this.field3321 + this.field3308), arg1);
                  this.field3308 += (long)arg1;
                  if (~(-this.field3321 + this.field3308) < ~((long)this.field3305)) {
                     this.field3305 = (int)(-this.field3321 + this.field3308);
                  }

               }
            } else {
               if (~this.field3312 != ~this.field3308) {
                  this.field3319.method3432(this.field3308, -76);
                  this.field3312 = this.field3308;
               }

               this.field3319.method3430(arg3, arg1, arg2, (byte)126);
               this.field3312 += (long)arg1;
               if (this.field3312 > this.field3317) {
                  this.field3317 = this.field3312;
               }

               long var7;
               label101: {
                  var7 = -1L;
                  if (this.field3308 >= this.field3301 && ~this.field3308 > ~((long)this.field3310 + this.field3301)) {
                     var7 = this.field3308;
                     if (!var5) {
                        break label101;
                     }
                  }

                  if (this.field3301 >= this.field3308 && this.field3301 < (long)arg1 + this.field3308) {
                     var7 = this.field3301;
                  }
               }

               long var9;
               label129: {
                  var9 = -1L;
                  if (this.field3301 >= this.field3308 - -((long)arg1) || ~((long)arg1 + this.field3308) < ~((long)this.field3310 + this.field3301)) {
                     if (~this.field3308 <= ~((long)this.field3310 + this.field3301) || this.field3301 - -((long)this.field3310) > (long)arg1 + this.field3308) {
                        break label129;
                     }

                     var9 = this.field3301 - -((long)this.field3310);
                     if (!var5) {
                        break label129;
                     }
                  }

                  var9 = (long)arg1 + this.field3308;
               }

               if (var7 > -1L && ~var7 > ~var9) {
                  int var11 = (int)(var9 - var7);
                  class714.method5200(arg2, (int)(-this.field3308 + var7 + (long)arg3), this.field3316, (int)(-this.field3301 + var7), var11);
               }

               this.field3308 += (long)arg1;
            }
         } catch (IOException var14) {
            this.field3312 = -1L;
            throw var14;
         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field3324[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3324[1] : field3324[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(I[BBI)V"
   )
   public final void method1982(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
      boolean var5 = client.field4273;

      try {
         ++field3302;
         if (arg2 >= 89) {
            try {
               if (arg1.length < arg3 - -arg0) {
                  throw new ArrayIndexOutOfBoundsException(arg0 + arg3 + -arg1.length);
               }

               if (this.field3321 != -1L && this.field3321 <= this.field3308 && ~((long)arg0 + this.field3308) >= ~((long)this.field3305 + this.field3321)) {
                  class714.method5200(this.field3311, (int)(-this.field3321 + this.field3308), arg1, arg3, arg0);
                  this.field3308 += (long)arg0;
                  return;
               }

               long var6 = this.field3308;
               int var8 = arg3;
               int var9 = arg0;
               if (this.field3301 <= this.field3308 && ~(this.field3301 - -((long)this.field3310)) < ~this.field3308) {
                  int var10 = (int)(-this.field3308 - -this.field3301 + (long)this.field3310);
                  if (~arg0 > ~var10) {
                     var10 = arg0;
                  }

                  class714.method5200(this.field3316, (int)(-this.field3301 + this.field3308), arg1, arg3, var10);
                  this.field3308 += (long)var10;
                  arg0 -= var10;
                  arg3 += var10;
               }

               int var10000;
               label174: {
                  label173: {
                     if (this.field3316.length >= arg0) {
                        if (arg0 <= 0) {
                           long var23;
                           var10000 = (var23 = this.field3321 - -1L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
                           if (!var5) {
                              break label174;
                           }
                           break label173;
                        }

                        this.method1985(0);
                        int var11 = arg0;
                        if (~this.field3310 > ~arg0) {
                           var11 = this.field3310;
                        }

                        class714.method5200(this.field3316, 0, arg1, arg3, var11);
                        arg0 -= var11;
                        this.field3308 += (long)var11;
                        arg3 += var11;
                        if (!var5) {
                           long var24;
                           var10000 = (var24 = this.field3321 - -1L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
                           if (!var5) {
                              break label174;
                           }
                           break label173;
                        }
                     }

                     this.field3319.method3432(this.field3308, 124);
                     this.field3312 = this.field3308;
                     if (var5) {
                        var10000 = this.field3319.method3434((byte)-83, arg0, arg3, arg1);
                     } else if (~arg0 >= -1) {
                        long var25;
                        var10000 = (var25 = this.field3321 - -1L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
                        if (!var5) {
                           break label174;
                        }
                     } else {
                        var10000 = this.field3319.method3434((byte)-83, arg0, arg3, arg1);
                     }
                  }

                  label166:
                  while(true) {
                     while(true) {
                        int var12 = var10000;
                        if (~var12 != 0) {
                           arg3 += var12;
                           this.field3312 += (long)var12;
                           this.field3308 += (long)var12;
                           arg0 -= var12;
                           if (~arg0 >= -1) {
                              long var26;
                              var10000 = (var26 = this.field3321 - -1L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
                              if (!var5) {
                                 break label166;
                              }
                           } else {
                              var10000 = this.field3319.method3434((byte)-83, arg0, arg3, arg1);
                           }
                        } else {
                           long var27;
                           var10000 = (var27 = this.field3321 - -1L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                           if (!var5) {
                              break label166;
                           }
                        }
                     }
                  }
               }

               if (var10000 != 0) {
                  if (this.field3321 > this.field3308 && ~arg0 < -1) {
                     label194: {
                        int var13 = (int)(this.field3321 - this.field3308) + arg3;
                        if (~var13 < ~(arg3 - -arg0)) {
                           var13 = arg0 + arg3;
                           if (!var5 && arg3 >= var13) {
                              break label194;
                           }
                        } else if (arg3 >= var13) {
                           break label194;
                        }

                        do {
                           --arg0;
                           arg1[arg3++] = 0;
                           ++this.field3308;
                        } while(arg3 < var13);
                     }
                  }

                  long var14;
                  long var16;
                  label110: {
                     var14 = -1L;
                     var16 = -1L;
                     if (this.field3321 >= var6 && ~this.field3321 > ~(var6 - -((long)var9))) {
                        var14 = this.field3321;
                        if (!var5) {
                           break label110;
                        }
                     }

                     if (~this.field3321 >= ~var6 && var6 < (long)this.field3305 + this.field3321) {
                        var14 = var6;
                     }
                  }

                  label104: {
                     if (this.field3321 - -((long)this.field3305) > var6 && ~(this.field3321 - -((long)this.field3305)) >= ~(var6 - -((long)var9))) {
                        var16 = (long)this.field3305 + this.field3321;
                        if (!var5) {
                           break label104;
                        }
                     }

                     if (~this.field3321 > ~((long)var9 + var6) && ~((long)this.field3305 + this.field3321) <= ~((long)var9 + var6)) {
                        var16 = (long)var9 + var6;
                     }
                  }

                  if (var14 > -1L && var14 < var16) {
                     int var18 = (int)(-var14 + var16);
                     class714.method5200(this.field3311, (int)(-this.field3321 + var14), arg1, (int)(-var6 + var14) + var8, var18);
                     if (~var16 < ~this.field3308) {
                        arg0 = (int)((long)arg0 - (-this.field3308 + var16));
                        this.field3308 = var16;
                     }
                  }
               }
            } catch (IOException var21) {
               this.field3312 = -1L;
               throw var21;
            }

            if (arg0 > 0) {
               throw new EOFException();
            }
         }
      } catch (RuntimeException var22) {
         throw class534.method3846(var22, field3324[2] + arg0 + ',' + (arg1 != null ? field3324[1] : field3324[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method1983(int arg0) throws IOException {
      boolean var2 = client.field4273;

      try {
         ++field3303;
         if ((long)arg0 != this.field3321) {
            if (~this.field3321 != ~this.field3312) {
               this.field3319.method3432(this.field3321, arg0 ^ 112);
               this.field3312 = this.field3321;
            }

            this.field3319.method3430(0, this.field3305, this.field3311, (byte)126);
            this.field3312 += (long)this.field3305;
            if (~this.field3312 < ~this.field3317) {
               this.field3317 = this.field3312;
            }

            long var3;
            label74: {
               var3 = -1L;
               if (~this.field3321 > ~this.field3301 || (long)this.field3310 + this.field3301 <= this.field3321) {
                  if (~this.field3301 > ~this.field3321 || ~((long)this.field3305 + this.field3321) >= ~this.field3301) {
                     break label74;
                  }

                  var3 = this.field3301;
                  if (!var2) {
                     break label74;
                  }
               }

               var3 = this.field3321;
            }

            long var5;
            label50: {
               var5 = -1L;
               if (this.field3321 - -((long)this.field3305) > this.field3301 && (long)this.field3305 + this.field3321 <= (long)this.field3310 + this.field3301) {
                  var5 = (long)this.field3305 + this.field3321;
                  if (!var2) {
                     break label50;
                  }
               }

               if (~((long)this.field3310 + this.field3301) < ~this.field3321 && (long)this.field3310 + this.field3301 <= (long)this.field3305 + this.field3321) {
                  var5 = this.field3301 - -((long)this.field3310);
               }
            }

            if (var3 > -1L && ~var5 < ~var3) {
               int var7 = (int)(-var3 + var5);
               class714.method5200(this.field3311, (int)(-this.field3321 + var3), this.field3316, (int)(-this.field3301 + var3), var7);
            }

            this.field3305 = 0;
            this.field3321 = -1L;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field3324[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(IIIBZII)V"
   )
   public static final void method1984(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6) {
      try {
         ++field3323;
         class772.field11146 = arg6;
         if (arg3 <= 125) {
            method1979(-77);
         }

         class27.field338 = arg0;
         class13.field162 = arg5;
         class291.field3842 = arg1;
         class508.field7042 = arg2;
         if (arg4 && ~class291.field3842 <= -101) {
            class737.field10747 = class27.field338 * 512 - -256;
            class532.field7284 = class772.field11146 * 512 + 256;
            class331.field4733 = class687.method5016(class737.field10747, class239.field2981, class532.field7284, 2) + -class13.field162;
         }

         class635.field8977 = 2;
         class552.field7597 = -1;
         class721.field10567 = -1;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field3324[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method1985(int arg0) throws IOException {
      boolean var2 = client.field4273;

      try {
         ++field3315;
         this.field3310 = arg0;
         if (~this.field3312 != ~this.field3308) {
            this.field3319.method3432(this.field3308, 102);
            this.field3312 = this.field3308;
         }

         this.field3301 = this.field3308;
         if (var2 || ~this.field3310 > ~this.field3316.length) {
            do {
               int var3 = this.field3316.length - this.field3310;
               if (var3 > 200000000) {
                  var3 = 200000000;
               }

               int var4 = this.field3319.method3434((byte)-83, var3, this.field3310, this.field3316);
               if (~var4 == 0) {
                  break;
               }

               this.field3312 += (long)var4;
               this.field3310 += var4;
            } while(~this.field3310 > ~this.field3316.length);
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3324[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "e",
      descriptor = "(I)J"
   )
   public final long method1986(int arg0) {
      try {
         ++field3307;
         if (arg0 >= -112) {
            this.field3305 = -111;
         }

         return this.field3306;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3324[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "c",
      descriptor = "(I)Ljava/io/File;"
   )
   private final File method1987(int arg0) {
      try {
         if (arg0 >= -105) {
            this.method1986(-38);
         }

         ++field3313;
         return this.field3319.method3433(24150);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3324[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "<init>",
      descriptor = "(Lti;II)V"
   )
   public class259(class468 arg0, int arg1, int arg2) throws IOException {
      try {
         this.field3319 = arg0;
         this.field3306 = this.field3317 = arg0.method3429(137);
         this.field3316 = new byte[arg1];
         this.field3308 = 0L;
         this.field3311 = new byte[arg2];
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3324[6] + (arg0 != null ? field3324[1] : field3324[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1988(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1989(char[] arg0) {
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
            var10005 = 89;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
