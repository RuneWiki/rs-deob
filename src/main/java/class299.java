import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class299 {
   @OriginalMember(
      owner = "client!ria",
      name = "d",
      descriptor = "I"
   )
   private int field4174 = 0;
   @OriginalMember(
      owner = "client!ria",
      name = "l",
      descriptor = "J"
   )
   private long field4170 = -1L;
   @OriginalMember(
      owner = "client!ria",
      name = "p",
      descriptor = "J"
   )
   private long field4176 = -1L;
   @OriginalMember(
      owner = "client!ria",
      name = "i",
      descriptor = "Liga;"
   )
   private class479 field4184;
   @OriginalMember(
      owner = "client!ria",
      name = "m",
      descriptor = "J"
   )
   private long field4177;
   @OriginalMember(
      owner = "client!ria",
      name = "g",
      descriptor = "J"
   )
   private long field4188;
   @OriginalMember(
      owner = "client!ria",
      name = "o",
      descriptor = "[B"
   )
   private byte[] field4178;
   @OriginalMember(
      owner = "client!ria",
      name = "b",
      descriptor = "J"
   )
   private long field4175;
   @OriginalMember(
      owner = "client!ria",
      name = "x",
      descriptor = "[B"
   )
   private byte[] field4181;
   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4195 = new String[]{method2339(method2338("RQ8X*\b")), method2339(method2338("RQ8X-\b")), method2339(method2338("NM5\u001a")), method2339(method2338("[\u0016wX\u0015")), method2339(method2338("RQ8X,\b")), method2339(method2338("RQ8X+\b")), method2339(method2338("RQ8XTIV0\u0002V\b")), method2339(method2338("RQ8X)\b")), method2339(method2338("RQ8X#\b")), method2339(method2338("RQ8X\"\b")), method2339(method2338("iV/\u0017\u0004I\\y\u0005\rESy\u0002\u0007\u0000")), method2339(method2338("RQ8X!\b")), method2339(method2338("\u0000Q7V\u000eIT<V")), method2339(method2338("RQ8X/\b")), method2339(method2338("RQ8X \b")), method2339(method2338("RQ8X.\b"))};
   @OriginalMember(
      owner = "client!ria",
      name = "n",
      descriptor = "Luw;"
   )
   public static class435 field4185 = new class435(88, -1);
   @OriginalMember(
      owner = "client!ria",
      name = "e",
      descriptor = "Lgw;"
   )
   public static class179 field4191 = new class179(64);
   @OriginalMember(
      owner = "client!ria",
      name = "y",
      descriptor = "Lgh;"
   )
   public static class572 field4193 = new class572(111, 0);
   @OriginalMember(
      owner = "client!ria",
      name = "r",
      descriptor = "I"
   )
   public static int field4171;
   @OriginalMember(
      owner = "client!ria",
      name = "f",
      descriptor = "I"
   )
   private int field4172;
   @OriginalMember(
      owner = "client!ria",
      name = "v",
      descriptor = "I"
   )
   public static int field4173;
   @OriginalMember(
      owner = "client!ria",
      name = "w",
      descriptor = "I"
   )
   public static int field4179;
   @OriginalMember(
      owner = "client!ria",
      name = "u",
      descriptor = "I"
   )
   public static int field4180;
   @OriginalMember(
      owner = "client!ria",
      name = "j",
      descriptor = "I"
   )
   public static int field4182;
   @OriginalMember(
      owner = "client!ria",
      name = "s",
      descriptor = "I"
   )
   public static int field4183;
   @OriginalMember(
      owner = "client!ria",
      name = "k",
      descriptor = "I"
   )
   public static int field4187;
   @OriginalMember(
      owner = "client!ria",
      name = "t",
      descriptor = "I"
   )
   public static int field4189;
   @OriginalMember(
      owner = "client!ria",
      name = "c",
      descriptor = "I"
   )
   public static int field4190;
   @OriginalMember(
      owner = "client!ria",
      name = "q",
      descriptor = "I"
   )
   public static int field4194;
   @OriginalMember(
      owner = "client!ria",
      name = "h",
      descriptor = "J"
   )
   private long field4186;
   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field4192;

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method2327(int arg0) {
      try {
         if (arg0 != 3564) {
            this.method2327(-7);
         }

         ++field4171;
         return this.field4188;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4195[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2328(byte arg0) {
      try {
         field4192 = null;
         field4193 = null;
         field4185 = null;
         if (arg0 != -1) {
            method2334(-54, (class112)null, 118, (byte)49, 40, (class678)null, 74, 38, 37, -75, -112, -107);
         }

         field4191 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4195[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(I[BII)V"
   )
   public final void method2329(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      boolean var5 = client.field4564;

      try {
         ++field4182;

         try {
            if (this.field4188 < (long)arg3 + this.field4175) {
               this.field4188 = (long)arg3 + this.field4175;
            }

            if (this.field4176 != -1L && (this.field4176 > this.field4175 || ~this.field4175 < ~(this.field4176 - -((long)this.field4174)))) {
               this.method2333((byte)87);
            }

            if (this.field4176 != -1L && ~((long)this.field4178.length + this.field4176) > ~((long)arg3 + this.field4175)) {
               int var6 = (int)((long)this.field4178.length - (this.field4175 - this.field4176));
               class365.method2856(arg1, arg2, this.field4178, (int)(-this.field4176 + this.field4175), var6);
               this.field4175 += (long)var6;
               arg2 += var6;
               arg3 -= var6;
               this.field4174 = this.field4178.length;
               this.method2333((byte)115);
            }

            if (arg3 <= this.field4178.length) {
               if (arg0 > ~arg3) {
                  if (this.field4176 == -1L) {
                     this.field4176 = this.field4175;
                  }

                  class365.method2856(arg1, arg2, this.field4178, (int)(-this.field4176 + this.field4175), arg3);
                  this.field4175 += (long)arg3;
                  if (~(-this.field4176 + this.field4175) < ~((long)this.field4174)) {
                     this.field4174 = (int)(-this.field4176 + this.field4175);
                  }

               }
            } else {
               if (~this.field4186 != ~this.field4175) {
                  this.field4184.method3623(-14285, this.field4175);
                  this.field4186 = this.field4175;
               }

               this.field4184.method3630(arg2, arg3, arg0 + -7, arg1);
               this.field4186 += (long)arg3;
               if (~this.field4177 > ~this.field4186) {
                  this.field4177 = this.field4186;
               }

               long var7;
               long var9;
               label98: {
                  var7 = -1L;
                  var9 = -1L;
                  if (this.field4170 <= this.field4175 && (long)this.field4172 + this.field4170 > this.field4175) {
                     var7 = this.field4175;
                     if (!var5) {
                        break label98;
                     }
                  }

                  if (~this.field4175 >= ~this.field4170 && (long)arg3 + this.field4175 > this.field4170) {
                     var7 = this.field4170;
                  }
               }

               label125: {
                  if (this.field4170 >= (long)arg3 + this.field4175 || (long)arg3 + this.field4175 > (long)this.field4172 + this.field4170) {
                     if (this.field4175 >= (long)this.field4172 + this.field4170 || ~((long)this.field4172 + this.field4170) < ~((long)arg3 + this.field4175)) {
                        break label125;
                     }

                     var9 = (long)this.field4172 + this.field4170;
                     if (!var5) {
                        break label125;
                     }
                  }

                  var9 = (long)arg3 + this.field4175;
               }

               if (var7 > -1L && var9 > var7) {
                  int var11 = (int)(-var7 + var9);
                  class365.method2856(arg1, (int)((long)arg2 + var7 - this.field4175), this.field4181, (int)(var7 - this.field4170), var11);
               }

               this.field4175 += (long)arg3;
            }
         } catch (IOException var14) {
            this.field4186 = -1L;
            throw var14;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field4195[9] + arg0 + ',' + (arg1 != null ? field4195[3] : field4195[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method2330(int arg0) throws IOException {
      boolean var2 = client.field4564;

      try {
         ++field4189;
         this.field4172 = 0;
         if (this.field4186 != this.field4175) {
            this.field4184.method3623(-14285, this.field4175);
            this.field4186 = this.field4175;
         }

         this.field4170 = this.field4175;
         int var10000;
         int var10001;
         int var3;
         if (var2) {
            var3 = this.field4181.length - this.field4172;
            if (~var3 < -200000001) {
               var3 = 200000000;
            }
         } else {
            if (this.field4181.length <= this.field4172) {
               var10000 = arg0;
               var10001 = -200000001;
               if (!var2) {
                  if (arg0 != -200000001) {
                     this.method2337(127);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this.field4181.length;
               var10001 = this.field4172;
            }

            var3 = var10000 - var10001;
            if (~var3 < -200000001) {
               var3 = 200000000;
            }
         }

         while(true) {
            while(true) {
               int var4 = this.field4184.method3626(this.field4181, var3, this.field4172, (byte)-117);
               if (~var4 != 0) {
                  this.field4186 += (long)var4;
                  this.field4172 += var4;
                  if (this.field4181.length <= this.field4172) {
                     var10000 = arg0;
                     var10001 = -200000001;
                     if (!var2) {
                        if (arg0 != -200000001) {
                           this.method2337(127);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = this.field4181.length;
                     var10001 = this.field4172;
                  }

                  var3 = var10000 - var10001;
                  if (~var3 < -200000001) {
                     var3 = 200000000;
                  }
               } else {
                  if (!var2) {
                     if (arg0 != -200000001) {
                        this.method2337(127);
                        return;
                     }

                     return;
                  }

                  var3 = arg0 - -200000001;
                  if (~var3 < -200000001) {
                     var3 = 200000000;
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4195[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(JZ)V"
   )
   public final void method2331(long arg0, boolean arg1) throws IOException {
      try {
         if (!arg1) {
            field4185 = null;
         }

         ++field4179;
         if (arg0 < 0L) {
            throw new IOException(field4195[10] + arg0 + field4195[12] + this.method2337(-24235));
         } else {
            this.field4175 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4195[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "([BI)V"
   )
   public final void method2332(byte[] arg0, int arg1) throws IOException {
      try {
         this.method2335(-1, arg0.length, arg0, arg1);
         ++field4187;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4195[1] + (arg0 != null ? field4195[3] : field4195[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method2333(byte arg0) throws IOException {
      boolean var2 = client.field4564;

      try {
         if (this.field4176 != -1L) {
            if (this.field4186 != this.field4176) {
               this.field4184.method3623(-14285, this.field4176);
               this.field4186 = this.field4176;
            }

            this.field4184.method3630(0, this.field4174, -95, this.field4178);
            this.field4186 += (long)this.field4174;
            if (this.field4177 < this.field4186) {
               this.field4177 = this.field4186;
            }

            long var3;
            label61: {
               var3 = -1L;
               if (this.field4170 <= this.field4176 && this.field4176 < (long)this.field4172 + this.field4170) {
                  var3 = this.field4176;
                  if (!var2) {
                     break label61;
                  }
               }

               if (this.field4170 >= this.field4176 && ~((long)this.field4174 + this.field4176) < ~this.field4170) {
                  var3 = this.field4170;
               }
            }

            long var5;
            label73: {
               var5 = -1L;
               if (~this.field4170 <= ~(this.field4176 - -((long)this.field4174)) || (long)this.field4174 + this.field4176 > (long)this.field4172 + this.field4170) {
                  if (this.field4176 >= (long)this.field4172 + this.field4170 || (long)this.field4174 + this.field4176 < (long)this.field4172 + this.field4170) {
                     break label73;
                  }

                  var5 = (long)this.field4172 + this.field4170;
                  if (!var2) {
                     break label73;
                  }
               }

               var5 = (long)this.field4174 + this.field4176;
            }

            if (var3 > -1L && ~var3 > ~var5) {
               int var7 = (int)(-var3 + var5);
               class365.method2856(this.field4178, (int)(-this.field4176 + var3), this.field4181, (int)(-this.field4170 + var3), var7);
            }

            this.field4174 = 0;
            this.field4176 = -1L;
         }

         int var8 = 118 / ((arg0 - 42) / 40);
         ++field4194;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field4195[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(ILqda;IBILfk;IIIIII)V"
   )
   public static final void method2334(int arg0, class112 arg1, int arg2, byte arg3, int arg4, class678 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         class459.field6732 = arg5;
         class773.field11327 = null;
         class573.field8277 = arg9;
         class563.field8193 = arg0;
         class52.field1080 = null;
         class60.field1145 = arg8;
         class13.field192 = arg6;
         class173.field2671 = arg1;
         if (arg3 > 38) {
            class317.field4577 = arg11;
            class424.field6169 = arg10;
            ++field4173;
            class220.field3313 = arg2;
            class290.field4059 = arg4;
            class710.field10320 = null;
            class152.field2428 = arg7;
            class315.method2440((byte)127);
            class308.field4439 = true;
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field4195[4] + arg0 + ',' + (arg1 != null ? field4195[3] : field4195[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4195[3] : field4195[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method2335(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field4564;

      try {
         ++field4190;

         try {
            if (arg2.length < arg1 + arg3) {
               throw new ArrayIndexOutOfBoundsException(arg3 - (-arg1 - -arg2.length));
            }

            if ((long)arg0 != this.field4176 && ~this.field4175 <= ~this.field4176 && (long)this.field4174 + this.field4176 >= this.field4175 - -((long)arg1)) {
               class365.method2856(this.field4178, (int)(-this.field4176 + this.field4175), arg2, arg3, arg1);
               this.field4175 += (long)arg1;
               return;
            }

            long var6 = this.field4175;
            int var8 = arg3;
            int var9 = arg1;
            if (~this.field4170 >= ~this.field4175 && ~((long)this.field4172 + this.field4170) < ~this.field4175) {
               int var10 = (int)((long)this.field4172 - (-this.field4170 + this.field4175));
               if (~var10 < ~arg1) {
                  var10 = arg1;
               }

               class365.method2856(this.field4181, (int)(this.field4175 - this.field4170), arg2, arg3, var10);
               this.field4175 += (long)var10;
               arg3 += var10;
               arg1 -= var10;
            }

            int var12;
            if (arg1 <= this.field4181.length) {
               if (~arg1 < -1) {
                  this.method2330(arg0 ^ 200000000);
                  var12 = arg1;
                  if (~this.field4172 > ~arg1) {
                     var12 = this.field4172;
                  }

                  class365.method2856(this.field4181, 0, arg2, arg3, var12);
                  arg3 += var12;
                  this.field4175 += (long)var12;
                  arg1 -= var12;
               }
            } else {
               this.field4184.method3623(arg0 ^ 14284, this.field4175);
               this.field4186 = this.field4175;
               if (var5 || ~arg1 < -1) {
                  do {
                     int var11 = this.field4184.method3626(arg2, arg1, arg3, (byte)-112);
                     if (~var11 == 0) {
                        break;
                     }

                     this.field4175 += (long)var11;
                     this.field4186 += (long)var11;
                     arg3 += var11;
                     arg1 -= var11;
                  } while(~arg1 < -1);
               }

               if (var5 && ~arg1 < -1) {
                  this.method2330(arg0 ^ 200000000);
                  var12 = arg1;
                  if (~this.field4172 > ~arg1) {
                     var12 = this.field4172;
                  }

                  class365.method2856(this.field4181, 0, arg2, arg3, var12);
                  arg3 += var12;
                  this.field4175 += (long)var12;
                  arg1 -= var12;
               }
            }

            if (this.field4176 != -1L) {
               if (this.field4176 > this.field4175 && arg1 > 0) {
                  label188: {
                     int var13 = arg3 - -((int)(-this.field4175 + this.field4176));
                     if (~(arg1 + arg3) > ~var13) {
                        var13 = arg1 + arg3;
                        if (!var5 && arg3 >= var13) {
                           break label188;
                        }
                     } else if (arg3 >= var13) {
                        break label188;
                     }

                     do {
                        arg2[arg3++] = 0;
                        --arg1;
                        ++this.field4175;
                     } while(arg3 < var13);
                  }
               }

               long var14;
               label196: {
                  var14 = -1L;
                  if (var6 > this.field4176 || ~this.field4176 <= ~((long)var9 + var6)) {
                     if (~var6 > ~this.field4176 || var6 >= (long)this.field4174 + this.field4176) {
                        break label196;
                     }

                     var14 = var6;
                     if (!var5) {
                        break label196;
                     }
                  }

                  var14 = this.field4176;
               }

               long var16;
               label102: {
                  var16 = -1L;
                  if (var6 < (long)this.field4174 + this.field4176 && var6 - -((long)var9) >= (long)this.field4174 + this.field4176) {
                     var16 = this.field4176 - -((long)this.field4174);
                     if (!var5) {
                        break label102;
                     }
                  }

                  if (~this.field4176 > ~((long)var9 + var6) && ~((long)var9 + var6) >= ~((long)this.field4174 + this.field4176)) {
                     var16 = (long)var9 + var6;
                  }
               }

               if (~var14 < 0L && ~var14 > ~var16) {
                  int var18 = (int)(-var14 + var16);
                  class365.method2856(this.field4178, (int)(var14 - this.field4176), arg2, (int)(-var6 + var14) + var8, var18);
                  if (~var16 < ~this.field4175) {
                     arg1 = (int)((long)arg1 - (-this.field4175 + var16));
                     this.field4175 = var16;
                  }
               }
            }
         } catch (IOException var21) {
            this.field4186 = -1L;
            throw var21;
         }

         if (arg1 > 0) {
            throw new EOFException();
         }
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field4195[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4195[3] : field4195[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method2336(int arg0) throws IOException {
      try {
         if (arg0 >= -94) {
            this.method2327(63);
         }

         ++field4180;
         this.method2333((byte)-67);
         this.field4184.method3627((byte)2);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4195[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "b",
      descriptor = "(I)Ljava/io/File;"
   )
   private final File method2337(int arg0) {
      try {
         ++field4183;
         if (arg0 != -24235) {
            method2334(-71, (class112)null, 8, (byte)44, 13, (class678)null, 40, -100, -128, 114, -15, 64);
         }

         return this.field4184.method3624(1);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4195[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "<init>",
      descriptor = "(Liga;II)V"
   )
   public class299(class479 arg0, int arg1, int arg2) throws IOException {
      try {
         this.field4184 = arg0;
         this.field4188 = this.field4177 = arg0.method3625(-7269);
         this.field4178 = new byte[arg2];
         this.field4175 = 0L;
         this.field4181 = new byte[arg1];
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4195[6] + (arg0 != null ? field4195[3] : field4195[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2338(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2339(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
