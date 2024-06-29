import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class214 {
   @OriginalMember(
      owner = "client!oe",
      name = "q",
      descriptor = "I"
   )
   private int field3053 = 0;
   @OriginalMember(
      owner = "client!oe",
      name = "u",
      descriptor = "J"
   )
   private long field3061 = -1L;
   @OriginalMember(
      owner = "client!oe",
      name = "w",
      descriptor = "J"
   )
   private long field3059 = -1L;
   @OriginalMember(
      owner = "client!oe",
      name = "t",
      descriptor = "Lpl;"
   )
   private class679 field3060;
   @OriginalMember(
      owner = "client!oe",
      name = "r",
      descriptor = "J"
   )
   private long field3062;
   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "J"
   )
   private long field3049;
   @OriginalMember(
      owner = "client!oe",
      name = "p",
      descriptor = "[B"
   )
   private byte[] field3051;
   @OriginalMember(
      owner = "client!oe",
      name = "o",
      descriptor = "[B"
   )
   private byte[] field3065;
   @OriginalMember(
      owner = "client!oe",
      name = "l",
      descriptor = "J"
   )
   private long field3054;
   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3067 = new String[]{method1696(method1695("\u001d9\u0011O+")), method1696(method1695("\u001d9\u0011@+")), method1696(method1695("R5Q%e\u001b0Z%")), method1696(method1695(";2Ido\u001b8\u001fvf\u00177\u001fqlR")), method1696(method1695("\u001d9\u00119j\u001c5K;+")), method1696(method1695("\tr\u0011+~")), method1696(method1695("\u001c)Si")), method1696(method1695("\u001e3Xbf\u00165Q")), method1696(method1695("\u0018=Xqk\u00173Md")), method1696(method1695("\u00072Eds")), method1696(method1695("\u001d,Zkp\u001c")), method1696(method1695("\u00100^kh\\+L")), method1696(method1695("\u0006>V")), method1696(method1695("R,Lly\u0017f")), method1696(method1695("\u001e/Hu#\u00023L?")), method1696(method1695("\u001d9\u0011B+")), method1696(method1695("\u001e/HuqR,Pv9")), method1696(method1695("\b=O")), method1696(method1695("\u001d9\u0011C+")), method1696(method1695("\u001d9\u0011A+")), method1696(method1695("\u001d9\u0011M+")), method1696(method1695("\u001d9\u0011G+")), method1696(method1695("\u001d9\u0011N+")), method1696(method1695("\u001d9\u0011F+")), method1696(method1695("\u001d9\u0011L+")), method1696(method1695("\u001d9\u0011D+"))};
   @OriginalMember(
      owner = "client!oe",
      name = "k",
      descriptor = "I"
   )
   public static int field3064 = 0;
   @OriginalMember(
      owner = "client!oe",
      name = "v",
      descriptor = "I"
   )
   public static int field3044;
   @OriginalMember(
      owner = "client!oe",
      name = "i",
      descriptor = "I"
   )
   public static int field3045;
   @OriginalMember(
      owner = "client!oe",
      name = "s",
      descriptor = "I"
   )
   public static int field3046;
   @OriginalMember(
      owner = "client!oe",
      name = "d",
      descriptor = "I"
   )
   public static int field3047;
   @OriginalMember(
      owner = "client!oe",
      name = "c",
      descriptor = "I"
   )
   public static int field3048;
   @OriginalMember(
      owner = "client!oe",
      name = "n",
      descriptor = "I"
   )
   public static int field3050;
   @OriginalMember(
      owner = "client!oe",
      name = "h",
      descriptor = "I"
   )
   public static int field3052;
   @OriginalMember(
      owner = "client!oe",
      name = "g",
      descriptor = "I"
   )
   public static int field3056;
   @OriginalMember(
      owner = "client!oe",
      name = "b",
      descriptor = "I"
   )
   public static int field3057;
   @OriginalMember(
      owner = "client!oe",
      name = "e",
      descriptor = "I"
   )
   private int field3058;
   @OriginalMember(
      owner = "client!oe",
      name = "j",
      descriptor = "I"
   )
   public static int field3063;
   @OriginalMember(
      owner = "client!oe",
      name = "f",
      descriptor = "I"
   )
   public static int field3066;
   @OriginalMember(
      owner = "client!oe",
      name = "m",
      descriptor = "J"
   )
   private long field3055;

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method1684(int arg0) throws IOException {
      boolean var2 = client.field4360;

      try {
         ++field3052;
         if (arg0 >= -119) {
            this.method1689(34);
         }

         this.field3058 = 0;
         if (~this.field3055 != ~this.field3054) {
            this.field3060.method4959(this.field3054, (byte)2);
            this.field3055 = this.field3054;
         }

         this.field3059 = this.field3054;
         if (var2 || ~this.field3058 > ~this.field3051.length) {
            do {
               int var3 = this.field3051.length + -this.field3058;
               if (~var3 < -200000001) {
                  var3 = 200000000;
               }

               int var4 = this.field3060.method4956(this.field3051, this.field3058, var3, (byte)-42);
               if (~var4 == 0) {
                  break;
               }

               this.field3055 += (long)var4;
               this.field3058 += var4;
            } while(~this.field3058 > ~this.field3051.length);
         }

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3067[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(I[BBI)V"
   )
   public final void method1685(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
      boolean var5 = client.field4360;

      try {
         ++field3045;

         try {
            if (arg2 == 49) {
               if (~((long)arg0 + this.field3054) < ~this.field3049) {
                  this.field3049 = this.field3054 - -((long)arg0);
               }

               if (~this.field3061 != 0L && (~this.field3061 < ~this.field3054 || this.field3061 - -((long)this.field3053) < this.field3054)) {
                  this.method1693(7530);
               }

               if (this.field3061 != -1L && this.field3061 - -((long)this.field3065.length) < (long)arg0 + this.field3054) {
                  int var6 = (int)(-this.field3054 + this.field3061 + (long)this.field3065.length);
                  class242.method1848(arg1, arg3, this.field3065, (int)(-this.field3061 + this.field3054), var6);
                  arg3 += var6;
                  arg0 -= var6;
                  this.field3054 += (long)var6;
                  this.field3053 = this.field3065.length;
                  this.method1693(arg2 ^ 7515);
               }

               if (~this.field3065.length <= ~arg0) {
                  if (~arg0 < -1) {
                     if (this.field3061 == -1L) {
                        this.field3061 = this.field3054;
                     }

                     class242.method1848(arg1, arg3, this.field3065, (int)(this.field3054 - this.field3061), arg0);
                     this.field3054 += (long)arg0;
                     if ((long)this.field3053 < this.field3054 - this.field3061) {
                        this.field3053 = (int)(-this.field3061 + this.field3054);
                     }

                  }
               } else {
                  if (this.field3055 != this.field3054) {
                     this.field3060.method4959(this.field3054, (byte)2);
                     this.field3055 = this.field3054;
                  }

                  this.field3060.method4958(arg3, arg0, arg1, 1);
                  this.field3055 += (long)arg0;
                  if (this.field3062 < this.field3055) {
                     this.field3062 = this.field3055;
                  }

                  long var7;
                  long var9;
                  label100: {
                     var7 = -1L;
                     var9 = -1L;
                     if (~this.field3059 >= ~this.field3054 && this.field3059 - -((long)this.field3058) > this.field3054) {
                        var7 = this.field3054;
                        if (!var5) {
                           break label100;
                        }
                     }

                     if (this.field3054 <= this.field3059 && ~this.field3059 > ~((long)arg0 + this.field3054)) {
                        var7 = this.field3059;
                     }
                  }

                  label130: {
                     if (~this.field3059 <= ~((long)arg0 + this.field3054) || (long)arg0 + this.field3054 > (long)this.field3058 + this.field3059) {
                        if (this.field3054 >= (long)this.field3058 + this.field3059 || ~(this.field3054 - -((long)arg0)) > ~((long)this.field3058 + this.field3059)) {
                           break label130;
                        }

                        var9 = (long)this.field3058 + this.field3059;
                        if (!var5) {
                           break label130;
                        }
                     }

                     var9 = (long)arg0 + this.field3054;
                  }

                  if (var7 > -1L && ~var7 > ~var9) {
                     int var11 = (int)(var9 - var7);
                     class242.method1848(arg1, (int)((long)arg3 + var7 + -this.field3054), this.field3051, (int)(-this.field3059 + var7), var11);
                  }

                  this.field3054 += (long)arg0;
               }
            }
         } catch (IOException var14) {
            this.field3055 = -1L;
            throw var14;
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field3067[25] + arg0 + ',' + (arg1 != null ? field3067[5] : field3067[6]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(ZJ)V"
   )
   public final void method1686(boolean arg0, long arg1) throws IOException {
      try {
         ++field3046;
         if (arg1 < 0L) {
            throw new IOException(field3067[3] + arg1 + field3067[2] + this.method1689(-16222));
         } else {
            this.field3054 = arg1;
            if (!arg0) {
               this.field3060 = null;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3067[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(I[BII)V"
   )
   public final void method1687(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      boolean var5 = client.field4360;

      try {
         ++field3050;

         try {
            if (~(arg0 + arg2) < ~arg1.length) {
               throw new ArrayIndexOutOfBoundsException(-arg1.length + arg0 + arg2);
            }

            if (this.field3061 != -1L && ~this.field3061 >= ~this.field3054 && (long)arg0 + this.field3054 <= (long)this.field3053 + this.field3061) {
               class242.method1848(this.field3065, (int)(-this.field3061 + this.field3054), arg1, arg2, arg0);
               this.field3054 += (long)arg0;
               return;
            }

            long var6 = this.field3054;
            int var8 = arg2;
            int var9 = arg0;
            if (~this.field3059 >= ~this.field3054 && ~((long)this.field3058 + this.field3059) < ~this.field3054) {
               int var10 = (int)((long)this.field3058 - (-this.field3059 + this.field3054));
               if (var10 > arg0) {
                  var10 = arg0;
               }

               class242.method1848(this.field3051, (int)(-this.field3059 + this.field3054), arg1, arg2, var10);
               arg2 += var10;
               arg0 -= var10;
               this.field3054 += (long)var10;
            }

            label162: {
               if (~this.field3051.length > ~arg0) {
                  this.field3060.method4959(this.field3054, (byte)2);
                  this.field3055 = this.field3054;
                  if (var5 || arg0 > 0) {
                     do {
                        int var11 = this.field3060.method4956(arg1, arg2, arg0, (byte)-41);
                        if (var11 == -1) {
                           break;
                        }

                        this.field3055 += (long)var11;
                        arg2 += var11;
                        this.field3054 += (long)var11;
                        arg0 -= var11;
                     } while(arg0 > 0);
                  }

                  if (!var5) {
                     break label162;
                  }
               }

               if (arg0 > 0) {
                  this.method1684(arg3 + -125);
                  int var12 = arg0;
                  if (arg0 > this.field3058) {
                     var12 = this.field3058;
                  }

                  class242.method1848(this.field3051, 0, arg1, arg2, var12);
                  arg2 += var12;
                  this.field3054 += (long)var12;
                  arg0 -= var12;
               }
            }

            if (arg3 != 0) {
               this.field3049 = -64L;
            }

            if (this.field3061 != -1L) {
               if (this.field3061 > this.field3054 && ~arg0 < -1) {
                  label182: {
                     int var13 = (int)(-this.field3054 + this.field3061) + arg2;
                     if (arg0 + arg2 < var13) {
                        var13 = arg2 - -arg0;
                        if (!var5 && var13 <= arg2) {
                           break label182;
                        }
                     } else if (var13 <= arg2) {
                        break label182;
                     }

                     do {
                        --arg0;
                        arg1[arg2++] = 0;
                        ++this.field3054;
                     } while(var13 > arg2);
                  }
               }

               long var14;
               long var16;
               label190: {
                  var14 = -1L;
                  var16 = -1L;
                  if (var6 > this.field3061 || (long)var9 + var6 <= this.field3061) {
                     if (~var6 > ~this.field3061 || (long)this.field3053 + this.field3061 <= var6) {
                        break label190;
                     }

                     var14 = var6;
                     if (!var5) {
                        break label190;
                     }
                  }

                  var14 = this.field3061;
               }

               label192: {
                  if (~var6 <= ~((long)this.field3053 + this.field3061) || (long)this.field3053 + this.field3061 > (long)var9 + var6) {
                     if (this.field3061 >= (long)var9 + var6 || var6 - -((long)var9) > (long)this.field3053 + this.field3061) {
                        break label192;
                     }

                     var16 = (long)var9 + var6;
                     if (!var5) {
                        break label192;
                     }
                  }

                  var16 = (long)this.field3053 + this.field3061;
               }

               if (~var14 < 0L && ~var14 > ~var16) {
                  int var18 = (int)(var16 - var14);
                  class242.method1848(this.field3065, (int)(-this.field3061 + var14), arg1, var8 - -((int)(-var6 + var14)), var18);
                  if (~var16 < ~this.field3054) {
                     arg0 = (int)((long)arg0 - (var16 - this.field3054));
                     this.field3054 = var16;
                  }
               }
            }
         } catch (IOException var21) {
            this.field3055 = -1L;
            throw var21;
         }

         if (~arg0 < -1) {
            throw new EOFException();
         }
      } catch (RuntimeException var22) {
         throw class237.method1823(var22, field3067[19] + arg0 + ',' + (arg1 != null ? field3067[5] : field3067[6]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "([BI)V"
   )
   public final void method1688(byte[] arg0, int arg1) throws IOException {
      try {
         this.method1687(arg0.length, arg0, arg1, 0);
         ++field3044;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3067[20] + (arg0 != null ? field3067[5] : field3067[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "d",
      descriptor = "(I)Ljava/io/File;"
   )
   private final File method1689(int arg0) {
      try {
         if (arg0 != -16222) {
            this.method1689(98);
         }

         ++field3047;
         return this.field3060.method4961(false);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3067[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1690(int arg0, int arg1) {
      try {
         ++field3063;
         if (~arg0 != 0) {
            if (class603.field8873[arg0]) {
               class361.field4924.method2030(arg0, -1);
               class547.field7851[arg0] = null;
               class428.field6127[arg0] = null;
               class603.field8873[arg0] = false;
               if (arg1 <= 67) {
                  field3064 = 59;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3067[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "f",
      descriptor = "(I)J"
   )
   public final long method1691(int arg0) {
      try {
         if (arg0 != 5640) {
            this.method1691(123);
         }

         ++field3056;
         return this.field3049;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3067[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1692(int arg0) throws IOException {
      try {
         ++field3048;
         this.method1693(7530);
         if (arg0 < 17) {
            method1690(39, -12);
         }

         this.field3060.method4960(true);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3067[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method1693(int arg0) throws IOException {
      boolean var2 = client.field4360;

      try {
         ++field3057;
         if (this.field3061 != -1L) {
            if (this.field3061 != this.field3055) {
               this.field3060.method4959(this.field3061, (byte)2);
               this.field3055 = this.field3061;
            }

            this.field3060.method4958(0, this.field3053, this.field3065, arg0 ^ 7531);
            this.field3055 += (long)this.field3053;
            if (this.field3055 > this.field3062) {
               this.field3062 = this.field3055;
            }

            long var3;
            label65: {
               var3 = -1L;
               if (~this.field3061 <= ~this.field3059 && this.field3061 < (long)this.field3058 + this.field3059) {
                  var3 = this.field3061;
                  if (!var2) {
                     break label65;
                  }
               }

               if (~this.field3059 <= ~this.field3061 && this.field3059 < (long)this.field3053 + this.field3061) {
                  var3 = this.field3059;
               }
            }

            long var5;
            label78: {
               var5 = -1L;
               if (this.field3059 >= (long)this.field3053 + this.field3061 || (long)this.field3053 + this.field3061 > (long)this.field3058 + this.field3059) {
                  if ((long)this.field3058 + this.field3059 <= this.field3061 || this.field3061 - -((long)this.field3053) < this.field3059 - -((long)this.field3058)) {
                     break label78;
                  }

                  var5 = (long)this.field3058 + this.field3059;
                  if (!var2) {
                     break label78;
                  }
               }

               var5 = (long)this.field3053 + this.field3061;
            }

            if (var3 > -1L && ~var5 < ~var3) {
               int var7 = (int)(var5 - var3);
               class242.method1848(this.field3065, (int)(-this.field3061 + var3), this.field3051, (int)(-this.field3059 + var3), var7);
            }

            this.field3053 = 0;
            this.field3061 = -1L;
         }

         if (arg0 != 7530) {
            this.method1689(125);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field3067[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1694(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field3066;
         if (class542.field7787 != 0 && class542.field7787 != 10) {
            try {
               short var2;
               label656: {
                  if (class100.field1288 != 0) {
                     var2 = 2000;
                     if (!var1) {
                        break label656;
                     }
                  }

                  var2 = 250;
               }

               if (class235.field3273 != 2 || ~class542.field7787 != -21 && ~class722.field10544 != -43) {
                  ++class9.field83;
               }

               if (class336.field4578 && ~class542.field7787 <= -7) {
                  var2 = 6000;
               }

               if (var2 < class9.field83) {
                  class136.field1737.method54((byte)90);
                  if (~class100.field1288 <= -4) {
                     class542.field7787 = 0;
                     class244.method1858(-5, 0);
                     return;
                  }

                  label640: {
                     if (class235.field3273 == 2) {
                        class526.field7533.method3187((byte)-26);
                        if (!var1) {
                           break label640;
                        }
                     }

                     class679.field10017.method3187((byte)-26);
                  }

                  class9.field83 = 0;
                  class542.field7787 = 1;
                  ++class100.field1288;
               }

               if (~class542.field7787 == -2) {
                  label633: {
                     if (class235.field3273 != 2) {
                        class136.field1737.field97 = class679.field10017.method3185((byte)-119, class316.field4304);
                        if (!var1) {
                           break label633;
                        }
                     }

                     class136.field1737.field97 = class526.field7533.method3185((byte)-107, class316.field4304);
                  }

                  class542.field7787 = 2;
               }

               if (class542.field7787 == 2) {
                  if (class136.field1737.field97.field4078 == 2) {
                     throw new IOException();
                  }

                  if (class136.field1737.field97.field4078 != 1) {
                     return;
                  }

                  class447 var3;
                  label667: {
                     class136.field1737.field102 = class733.method5334((Socket)class136.field1737.field97.field4077, (byte)-127, 15000);
                     class136.field1737.field97 = null;
                     class136.field1737.method50(126);
                     var3 = class319.method2367((byte)50);
                     if (!class336.field4578) {
                        var3.field6359.method1186(class555.field7940.field4260, 0);
                        if (!var1) {
                           break label667;
                        }
                     }

                     var3.field6359.method1186(class555.field7968.field4260, 0);
                     var3.field6359.method1185(0, true);
                     int var4 = var3.field6359.field1856;
                     var3.field6359.method1160(90, 655);
                     if (class235.field3273 == 2) {
                        var3.field6359.method1186(~class622.field9156 == -15 ? 1 : 0, 0);
                     }

                     class147 var5 = class432.method3192((byte)-107);
                     var5.method1186(class203.field2883, 0);
                     var5.method1185((int)(Math.random() * 9.9999999E7D), true);
                     var5.method1186(class608.field8920, 0);
                     var5.method1160(103, class564.field8049);
                     int var6 = 0;
                     if (var1) {
                        var5.method1160(97, (int)(9.9999999E7D * Math.random()));
                        ++var6;
                     }

                     while(true) {
                        while(~var6 > -7) {
                           var5.method1160(97, (int)(9.9999999E7D * Math.random()));
                           ++var6;
                        }

                        var5.method1169(11065, class168.field2353);
                        var5.method1186(class134.field1715.field10710, 0);
                        var5.method1186((int)(Math.random() * 9.9999999E7D), 0);
                        var5.method1152(class140.field1790, class498.field7219, 0);
                        var3.field6359.method1193((byte)-117, var5.field1889, 0, var5.field1856);
                        class534 var10000 = var3.field6359;
                        int var10002 = -var4 + var3.field6359.field1856;
                        if (!var1) {
                           var10000.method1161(-639922104, var10002);
                           break;
                        }

                        var10000.method1160(-639922104, var10002);
                        ++var6;
                     }
                  }

                  class136.field1737.method55(13256, var3);
                  class136.field1737.method52((byte)94);
                  class542.field7787 = 3;
               }

               if (class542.field7787 == 3) {
                  label670: {
                     if (!class136.field1737.field102.method1380(1, false)) {
                        return;
                     }

                     class136.field1737.field102.method1379(1, 0, class136.field1737.field105.field1889, -1);
                     int var7 = class136.field1737.field105.field1889[0] & 255;
                     if (~var7 != -1) {
                        class542.field7787 = 0;
                        class244.method1858(var7, 0);
                        class136.field1737.method54((byte)115);
                        class614.method4464(105);
                        return;
                     }

                     if (class336.field4578) {
                        class542.field7787 = 4;
                        if (!var1) {
                           break label670;
                        }
                     }

                     class542.field7787 = 8;
                  }
               }

               if (~class542.field7787 == -5) {
                  if (!class136.field1737.field102.method1380(2, false)) {
                     return;
                  }

                  class136.field1737.field102.method1379(2, 0, class136.field1737.field105.field1889, -1);
                  class136.field1737.field105.field1856 = 0;
                  class136.field1737.field105.field1856 = class136.field1737.field105.method1211(-26166);
                  class542.field7787 = 5;
               }

               if (~class542.field7787 == -6) {
                  if (!class136.field1737.field102.method1380(class136.field1737.field105.field1856, false)) {
                     return;
                  }

                  class136.field1737.field102.method1379(class136.field1737.field105.field1856, 0, class136.field1737.field105.field1889, -1);
                  class136.field1737.field105.method1181(class559.field8012, -2042076373);
                  class136.field1737.field105.field1856 = 0;
                  String var8 = class136.field1737.field105.method1180((byte)92);
                  class136.field1737.field105.field1856 = 0;
                  String var9 = field3067[10];
                  if (!class435.field6231 || class676.method4913(1, var8, (byte)-97, class316.field4304, var9).field4078 == 2) {
                     class787.method5680(~class300.field4107.field6419.method391(-95) == -2, var8, var9, true, (byte)18, class316.field4304);
                  }

                  class542.field7787 = 6;
               }

               if (class542.field7787 == 6) {
                  if (!class136.field1737.field102.method1380(1, false)) {
                     return;
                  }

                  class136.field1737.field102.method1379(1, 0, class136.field1737.field105.field1889, -1);
                  if (~(class136.field1737.field105.field1889[0] & 255) == -2) {
                     class542.field7787 = 7;
                  }
               }

               if (class542.field7787 == 7) {
                  if (!class136.field1737.field102.method1380(16, false)) {
                     return;
                  }

                  class136.field1737.field102.method1379(16, 0, class136.field1737.field105.field1889, -1);
                  class136.field1737.field105.field1856 = 16;
                  class136.field1737.field105.method1181(class559.field8012, -2042076373);
                  class136.field1737.field105.field1856 = 0;
                  class284.field3931 = class43.field597 = class727.method5302(class136.field1737.field105.method1207(false), -27867);
                  class484.field6927 = class136.field1737.field105.method1207(false);
                  class542.field7787 = 8;
               }

               if (class542.field7787 == 8) {
                  class447 var10;
                  label674: {
                     class136.field1737.field105.field1856 = 0;
                     class136.field1737.method50(-15);
                     var10 = class319.method2367((byte)50);
                     class534 var11 = var10.field6359;
                     if (~class235.field3273 != -3) {
                        class310 var12;
                        label571: {
                           if (class336.field4578) {
                              var12 = class555.field7969;
                              if (!var1) {
                                 break label571;
                              }
                           }

                           var12 = class555.field7959;
                        }

                        var11.method1186(var12.field4260, 0);
                        var11.method1185(0, true);
                        int var13 = var11.field1856;
                        int var14 = var11.field1856;
                        if (!class336.field4578) {
                           var11.method1160(84, 655);
                           class147 var15 = class424.method3134((byte)79);
                           var11.method1193((byte)-120, var15.field1889, 0, var15.field1856);
                           var14 = var11.field1856;
                           var11.method1195((byte)74, class284.field3931);
                        }

                        var11.method1186(class134.field1715.field10710, 0);
                        var11.method1186(class608.field8920, 0);
                        class550.method3942(-57, var11);
                        var11.method1195((byte)54, class612.field8975);
                        var11.method1160(85, class564.field8049);
                        class11.method62(7984, var11);
                        var11.method1158(var11.field1856, class559.field8012, -126, var14);
                        var11.method1161(-639922104, -var13 + var11.field1856);
                        if (!var1) {
                           break label674;
                        }
                     }

                     class310 var16;
                     label566: {
                        if (!class336.field4578) {
                           var16 = class555.field7956;
                           if (!var1) {
                              break label566;
                           }
                        }

                        var16 = class555.field7969;
                     }

                     var11.method1186(var16.field4260, 0);
                     var11.method1185(0, true);
                     int var17 = var11.field1856;
                     int var18 = var11.field1856;
                     if (!class336.field4578) {
                        var11.method1160(77, 655);
                        var11.method1186(~class622.field9156 != -15 ? 0 : 1, 0);
                        int var19 = var11.field1856;
                        class147 var20 = class424.method3134((byte)87);
                        var11.method1193((byte)-124, var20.field1889, 0, var20.field1856);
                        var18 = var11.field1856;
                        var11.method1195((byte)106, class284.field3931);
                     }

                     var11.method1186(class686.field10122, 0);
                     var11.method1186(class713.method5178(-124), 0);
                     var11.method1185(class237.field3310, true);
                     var11.method1185(class692.field10185, true);
                     var11.method1186(class300.field4107.field6421.method3555(107), 0);
                     class550.method3942(-29, var11);
                     var11.method1195((byte)71, class612.field8975);
                     var11.method1160(99, class564.field8049);
                     class147 var21 = class300.field4107.method3303(28116);
                     var11.method1186(var21.field1856, 0);
                     var11.method1193((byte)-98, var21.field1889, 0, var21.field1856);
                     class539.field7710 = true;
                     class147 var22 = new class147(class169.field2360.method790((byte)110));
                     class169.field2360.method789(var22, (byte)-87);
                     var11.method1193((byte)-114, var22.field1889, 0, var22.field1889.length);
                     var11.method1160(112, class370.field5384);
                     var11.method1169(11065, class428.field6133);
                     var11.method1186(class58.field715 != null ? 1 : 0, 0);
                     if (class58.field715 != null) {
                        var11.method1195((byte)84, class58.field715);
                     }

                     var11.method1186(class464.method3371(field3067[8], -18) ? 1 : 0, 0);
                     var11.method1186(!class435.field6231 ? 0 : 1, 0);
                     class11.method62(7984, var11);
                     var11.method1158(var11.field1856, class559.field8012, -125, var18);
                     var11.method1161(-639922104, var11.field1856 - var17);
                  }

                  class136.field1737.method55(13256, var10);
                  class136.field1737.method52((byte)94);
                  class136.field1737.field106 = new class594(class559.field8012);
                  int var23 = 0;
                  if (var1) {
                     class559.field8012[var23] += 50;
                     ++var23;
                  }

                  while(true) {
                     while(var23 < 4) {
                        class559.field8012[var23] += 50;
                        ++var23;
                     }

                     class136.field1737.field105.method3842(class559.field8012, (byte)0);
                     class542.field7787 = 9;
                     if (!var1) {
                        class559.field8012 = null;
                        break;
                     }

                     ++var23;
                  }
               }

               if (~class542.field7787 == -10) {
                  label698: {
                     if (!class136.field1737.field102.method1380(1, false)) {
                        return;
                     }

                     class136.field1737.field102.method1379(1, 0, class136.field1737.field105.field1889, -1);
                     int var24 = class136.field1737.field105.field1889[0] & 255;
                     if (~var24 != -22) {
                        if (~var24 != -30 && var24 != 45) {
                           if (~var24 != -2) {
                              if (var24 != 2) {
                                 if (var24 == 15) {
                                    class136.field1737.field110 = -2;
                                    class542.field7787 = 19;
                                    if (!var1) {
                                       break label698;
                                    }
                                 }

                                 if (~var24 == -24 && class100.field1288 < 3) {
                                    ++class100.field1288;
                                    class542.field7787 = 1;
                                    class9.field83 = 0;
                                    class136.field1737.field102.method1377(false);
                                    class136.field1737.field102 = null;
                                    return;
                                 }

                                 if (~var24 != -43) {
                                    if (class328.field4476 && !class336.field4578 && ~class203.field2883 != 0 && ~var24 == -36) {
                                       class336.field4578 = true;
                                       class542.field7787 = 1;
                                       class9.field83 = 0;
                                       class136.field1737.field102.method1377(false);
                                       class136.field1737.field102 = null;
                                       return;
                                    }

                                    class542.field7787 = 0;
                                    class244.method1858(var24, 0);
                                    class136.field1737.field102.method1377(false);
                                    class136.field1737.field102 = null;
                                    class614.method4464(-42);
                                    return;
                                 }

                                 class542.field7787 = 20;
                                 class244.method1858(var24, 0);
                                 return;
                              }

                              class542.field7787 = 13;
                              if (!var1) {
                                 break label698;
                              }
                           }

                           class542.field7787 = 10;
                           class244.method1858(var24, 0);
                           return;
                        }

                        class542.field7787 = 18;
                        class668.field9712 = var24;
                        if (!var1) {
                           break label698;
                        }
                     }

                     class542.field7787 = 12;
                  }
               }

               if (class542.field7787 == 11) {
                  class136.field1737.method50(-22);
                  class447 var25 = class319.method2367((byte)50);
                  class534 var26 = var25.field6359;
                  var26.method3847((byte)99, class136.field1737.field106);
                  var26.method3846(class555.field7965.field4260, 70);
                  class136.field1737.method55(13256, var25);
                  class136.field1737.method52((byte)94);
                  class542.field7787 = 9;
               } else if (class542.field7787 == 12) {
                  if (class136.field1737.field102.method1380(1, false)) {
                     class136.field1737.field102.method1379(1, 0, class136.field1737.field105.field1889, -1);
                     int var27 = 255 & class136.field1737.field105.field1889[0];
                     class542.field7787 = 0;
                     class708.field10343 = var27 * 50;
                     class244.method1858(21, 0);
                     class136.field1737.field102.method1377(false);
                     class136.field1737.field102 = null;
                     class614.method4464(-40);
                  }
               } else if (class542.field7787 == 20) {
                  if (class136.field1737.field102.method1380(2, false)) {
                     class136.field1737.field102.method1379(2, 0, class136.field1737.field105.field1889, -1);
                     class165.field2329 = (class136.field1737.field105.field1889[0] << 8 & 65280) - -(255 & class136.field1737.field105.field1889[1]);
                     class542.field7787 = 9;
                  }
               } else if (class542.field7787 == 18) {
                  if (class136.field1737.field102.method1380(1, false)) {
                     class136.field1737.field102.method1379(1, 0, class136.field1737.field105.field1889, -1);
                     class542.field7787 = 0;
                     class517.field7455 = class136.field1737.field105.field1889[0] & 255;
                     class244.method1858(class668.field9712, 0);
                     class136.field1737.field102.method1377(false);
                     class136.field1737.field102 = null;
                     class614.method4464(-14);
                  }
               } else if (class542.field7787 == 13) {
                  if (class136.field1737.field102.method1380(1, false)) {
                     class136.field1737.field102.method1379(1, 0, class136.field1737.field105.field1889, -1);
                     class542.field7787 = 14;
                     class748.field11075 = 255 & class136.field1737.field105.field1889[0];
                  }
               } else {
                  if (arg0 >= -53) {
                     method1694(99);
                  }

                  if (class542.field7787 == 14) {
                     label681: {
                        class534 var28 = class136.field1737.field105;
                        if (class235.field3273 == 2) {
                           if (!class136.field1737.field102.method1380(class748.field11075, false)) {
                              return;
                           }

                           class136.field1737.field102.method1379(class748.field11075, 0, var28.field1889, -1);
                           var28.field1856 = 0;
                           class295.field4073 = var28.method1143(-15465);
                           class276.field3774 = var28.method1143(-15465);
                           class387.field5602 = var28.method1143(-15465) == 1;
                           class213.field3036 = ~var28.method1143(-15465) == -2;
                           class29.field433 = var28.method1143(-15465) == 1;
                           class34.field491 = ~var28.method1143(-15465) == -2;
                           class358.field4891 = var28.method1211(-26166);
                           class379.field5466 = var28.method1143(-15465) == 1;
                           class333.field4539 = var28.method1201((byte)69);
                           class88.field1148 = var28.method1143(-15465) == 1;
                           class387.field5618.method3979(-2, class88.field1148);
                           class468.field6728.method2256((byte)124, class88.field1148);
                           class195.field2761.method1731(class88.field1148, (byte)97);
                           if (!var1) {
                              break label681;
                           }
                        }

                        if (!class136.field1737.field102.method1380(class748.field11075, false)) {
                           return;
                        }

                        class136.field1737.field102.method1379(class748.field11075, 0, var28.field1889, -1);
                        var28.field1856 = 0;
                        class295.field4073 = var28.method1143(-15465);
                        class276.field3774 = var28.method1143(-15465);
                        class387.field5602 = var28.method1143(-15465) == 1;
                        class213.field3036 = ~var28.method1143(-15465) == -2;
                        class29.field433 = ~var28.method1143(-15465) == -2;
                        class283.field3922 = var28.method1207(false);
                        class602.field8849 = class283.field3922 + -class133.method1054(-29025) + -var28.method1170(121);
                        int var29 = var28.method1143(-15465);
                        class379.field5466 = ~(var29 & 1) != -1;
                        class387.field5615 = (2 & var29) != 0;
                        class253.field3447 = var28.method1164(19693);
                        class138.field1766 = ~var28.method1143(-15465) == -2;
                        class730.field10687 = var28.method1164(19693);
                        class445.field6341 = var28.method1211(-26166);
                        class656.field9596 = var28.method1211(-26166);
                        class3.field15 = var28.method1211(-26166);
                        class86.field1133 = var28.method1164(19693);
                        class733.field10729 = class316.field4304.method4493(class86.field1133, 85);
                        class141.field1797 = var28.method1143(-15465);
                        class597.field8775 = var28.method1211(-26166);
                        class622.field9158 = var28.method1211(-26166);
                        class218.field3116 = var28.method1143(-15465) == 1;
                        class564.field8045.field1575 = class564.field8045.field1556 = class564.field8047 = var28.method1180((byte)87);
                        class460.field6633 = var28.method1143(-15465);
                        class225.field3199 = var28.method1164(19693);
                        class705.field10290 = var28.method1143(-15465) == 1;
                        class333.field4546 = new class431();
                        class333.field4546.field6156 = var28.method1211(-26166);
                        if (class333.field4546.field6156 == 65535) {
                           class333.field4546.field6156 = -1;
                        }

                        class333.field4546.field6161 = var28.method1180((byte)85);
                        if (class435.field6230 != class290.field4016) {
                           class333.field4546.field6158 = class333.field4546.field6156 + 50000;
                           class333.field4546.field6163 = class333.field4546.field6156 + 40000;
                        }

                        if (class716.field10409 != class290.field4016 && (class408.field5903 != class290.field4016 || ~class295.field4073 > -3) && (class526.field7533.method3186(443, class393.field5689) || class526.field7533.method3186(443, class192.field2726))) {
                           class70.method651((byte)-63);
                        }
                     }

                     label738: {
                        if (class387.field5602 && !class29.field433 || class379.field5466) {
                           try {
                              class548.method3934(class216.field3093, false, field3067[17]);
                              break label738;
                           } catch (Throwable var37) {
                              if (!class677.field9803) {
                                 break label738;
                              }

                              try {
                                 class216.field3093.getAppletContext().showDocument(new URL(class216.field3093.getCodeBase(), field3067[11]), field3067[12]);
                                 break label738;
                              } catch (Exception var36) {
                                 if (!var1) {
                                    break label738;
                                 }
                              }
                           }
                        }

                        try {
                           class548.method3934(class216.field3093, false, field3067[9]);
                        } catch (Throwable var35) {
                        }
                     }

                     if (class435.field6230 == class290.field4016) {
                        try {
                           class548.method3934(class216.field3093, false, field3067[7]);
                        } catch (Throwable var34) {
                        }
                     }

                     if (class235.field3273 != 2) {
                        class542.field7787 = 0;
                        class244.method1858(2, 0);
                        class670.method4880((byte)-99);
                        class731.method5321(7, (byte)-115);
                        class136.field1737.field116 = null;
                        return;
                     }

                     class542.field7787 = 16;
                  }

                  if (class542.field7787 == 16) {
                     if (!class136.field1737.field102.method1380(3, false)) {
                        return;
                     }

                     class136.field1737.field102.method1379(3, 0, class136.field1737.field105.field1889, -1);
                     class542.field7787 = 17;
                  }

                  if (~class542.field7787 == -18) {
                     class534 var30 = class136.field1737.field105;
                     var30.field1856 = 0;
                     if (var30.method3851(0)) {
                        if (!class136.field1737.field102.method1380(1, false)) {
                           return;
                        }

                        class136.field1737.field102.method1379(1, 3, var30.field1889, -1);
                     }

                     class136.field1737.field116 = class244.method1859((byte)117)[var30.method3849(-125)];
                     class136.field1737.field110 = var30.method1211(-26166);
                     class542.field7787 = 15;
                  }

                  if (~class542.field7787 == -16) {
                     if (class136.field1737.field102.method1380(class136.field1737.field110, false)) {
                        int var31;
                        label457: {
                           class136.field1737.field102.method1379(class136.field1737.field110, 0, class136.field1737.field105.field1889, -1);
                           class136.field1737.field105.field1856 = 0;
                           class542.field7787 = 0;
                           var31 = class136.field1737.field110;
                           class244.method1858(2, 0);
                           class137.method1085(0);
                           class598.method4348(class136.field1737.field105, -8932);
                           class72.field877 = -1;
                           if (class675.field9783 == class136.field1737.field116) {
                              class37.method335(false);
                              if (!var1) {
                                 break label457;
                              }
                           }

                           class612.method4448((byte)-78);
                        }

                        if (~class136.field1737.field105.field1856 != ~var31) {
                           throw new RuntimeException(field3067[14] + class136.field1737.field105.field1856 + field3067[13] + var31);
                        } else {
                           class136.field1737.field116 = null;
                        }
                     }
                  } else if (~class542.field7787 == -20) {
                     if (~class136.field1737.field110 == 1) {
                        if (!class136.field1737.field102.method1380(2, false)) {
                           return;
                        }

                        class136.field1737.field102.method1379(2, 0, class136.field1737.field105.field1889, -1);
                        class136.field1737.field105.field1856 = 0;
                        class136.field1737.field110 = class136.field1737.field105.method1211(-26166);
                     }

                     if (class136.field1737.field102.method1380(class136.field1737.field110, false)) {
                        class136.field1737.field102.method1379(class136.field1737.field110, 0, class136.field1737.field105.field1889, -1);
                        class136.field1737.field105.field1856 = 0;
                        class542.field7787 = 0;
                        int var32 = class136.field1737.field110;
                        class244.method1858(15, 0);
                        class728.method5311(-1);
                        class598.method4348(class136.field1737.field105, -8932);
                        if (class136.field1737.field105.field1856 != var32) {
                           throw new RuntimeException(field3067[16] + class136.field1737.field105.field1856 + field3067[13] + var32);
                        } else {
                           class136.field1737.field116 = null;
                        }
                     }
                  }
               }
            } catch (IOException var38) {
               class136.field1737.method54((byte)103);
               if (~class100.field1288 > -4) {
                  label449: {
                     if (class235.field3273 != 2) {
                        class679.field10017.method3187((byte)-26);
                        if (!var1) {
                           break label449;
                        }
                     }

                     class526.field7533.method3187((byte)-26);
                  }

                  class9.field83 = 0;
                  ++class100.field1288;
                  class542.field7787 = 1;
               } else {
                  class542.field7787 = 0;
                  class244.method1858(-4, 0);
                  class614.method4464(121);
               }
            }
         }
      } catch (RuntimeException var39) {
         throw class237.method1823(var39, field3067[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "<init>",
      descriptor = "(Lpl;II)V"
   )
   public class214(class679 arg0, int arg1, int arg2) throws IOException {
      try {
         this.field3060 = arg0;
         this.field3049 = this.field3062 = arg0.method4954(48);
         this.field3051 = new byte[arg1];
         this.field3065 = new byte[arg2];
         this.field3054 = 0L;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3067[4] + (arg0 != null ? field3067[5] : field3067[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1695(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1696(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
