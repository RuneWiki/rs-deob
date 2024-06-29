import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class284 {
   @OriginalMember(
      owner = "client!gia",
      name = "k",
      descriptor = "Lkk;"
   )
   private class204 field3935;
   @OriginalMember(
      owner = "client!gia",
      name = "e",
      descriptor = "Lea;"
   )
   private class573 field3924;
   @OriginalMember(
      owner = "client!gia",
      name = "j",
      descriptor = "I"
   )
   public int field3941;
   @OriginalMember(
      owner = "client!gia",
      name = "f",
      descriptor = "I"
   )
   private int field3926;
   @OriginalMember(
      owner = "client!gia",
      name = "p",
      descriptor = "I"
   )
   private int field3927;
   @OriginalMember(
      owner = "client!gia",
      name = "g",
      descriptor = "[B"
   )
   public byte[] field3944;
   @OriginalMember(
      owner = "client!gia",
      name = "l",
      descriptor = "I"
   )
   private int field3934;
   @OriginalMember(
      owner = "client!gia",
      name = "m",
      descriptor = "I"
   )
   private int field3933;
   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3945 = new String[]{method2159(method2158("n@0li!")), method2159(method2158("n@0lf!")), method2159(method2158("n@0l`!")), method2159(method2158("r\u0007\u007fl\\")), method2159(method2158("g\\=.")), method2159(method2158("n@0lh!")), method2159(method2158("n@0l\u001d`G86\u001f!")), method2159(method2158("n@0lc!")), method2159(method2158("n@0ld!")), method2159(method2158("n@0lb!")), method2159(method2158("n@0lk!")), method2159(method2158("n@0le!")), method2159(method2158("n@0lg!"))};
   @OriginalMember(
      owner = "client!gia",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3931 = "";
   @OriginalMember(
      owner = "client!gia",
      name = "q",
      descriptor = "I"
   )
   public static int field3939 = -1;
   @OriginalMember(
      owner = "client!gia",
      name = "u",
      descriptor = "I"
   )
   public static int field3925;
   @OriginalMember(
      owner = "client!gia",
      name = "h",
      descriptor = "I"
   )
   public static int field3928;
   @OriginalMember(
      owner = "client!gia",
      name = "o",
      descriptor = "I"
   )
   public static int field3929;
   @OriginalMember(
      owner = "client!gia",
      name = "d",
      descriptor = "I"
   )
   public static int field3932;
   @OriginalMember(
      owner = "client!gia",
      name = "b",
      descriptor = "I"
   )
   public static int field3936;
   @OriginalMember(
      owner = "client!gia",
      name = "t",
      descriptor = "I"
   )
   public static int field3938;
   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "I"
   )
   public static int field3940;
   @OriginalMember(
      owner = "client!gia",
      name = "n",
      descriptor = "I"
   )
   public static int field3942;
   @OriginalMember(
      owner = "client!gia",
      name = "s",
      descriptor = "I"
   )
   public static int field3943;
   @OriginalMember(
      owner = "client!gia",
      name = "c",
      descriptor = "[B"
   )
   public static byte[] field3930;
   @OriginalMember(
      owner = "client!gia",
      name = "r",
      descriptor = "[[Lqia;"
   )
   private class23[][] field3937;

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(IIILr;)V",
      line = 4
   )
   public final void method2148(int arg0, int arg1, int arg2, class196 arg3) {
      try {
         ++field3932;
         class381 var5 = (class381)arg3;
         arg1 += var5.field5493 + 1;
         arg2 += var5.field5492 - -1;
         int var6 = this.field3941 * arg2 + arg1;
         int var7 = 0;
         int var8 = var5.field5485;
         int var9 = var5.field5490;
         int var10 = -var9 + this.field3941;
         int var11 = 0;
         if (arg0 >= -38) {
            field3931 = null;
         }

         if (arg2 <= 0) {
            int var12 = -arg2 + 1;
            arg2 = 1;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += this.field3941 * var12;
         }

         if (this.field3926 <= arg2 + var8) {
            int var13 = arg2 - -var8 + -this.field3926 + 1;
            var8 -= var13;
         }

         if (~arg1 >= -1) {
            int var14 = -arg1 + 1;
            arg1 = 1;
            var7 += var14;
            var11 += var14;
            var10 += var14;
            var9 -= var14;
            var6 += var14;
         }

         if (~this.field3941 >= ~(arg1 - -var9)) {
            int var15 = arg1 - (-var9 - (-this.field3941 + 1));
            var10 += var15;
            var9 -= var15;
            var11 += var15;
         }

         if (~var9 < -1 && var8 > 0) {
            class687.method5018(var11, var9, var7, var6, var10, var5.field5491, this.field3944, (byte)-88, var8);
            this.method2155(var8, 103, var9, arg2, arg1);
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field3945[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3945[3] : field3945[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(ZIII)I",
      line = 75
   )
   public static final int method2149(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         ++field3925;
         class111 var4 = class616.method4475(arg1, arg0, (byte)116);
         if (var4 == null) {
            return 0;
         } else {
            return ~arg2 <= arg3 && arg2 < var4.field1396.length ? var4.field1396[arg2] : 0;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3945[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(I[[ZIIZI)V",
      line = 92
   )
   public final void method2150(int param1, boolean[][] param2, int param3, int param4, boolean param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gia",
      name = "b",
      descriptor = "(Z)V",
      line = 281
   )
   public static final void method2151(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(IIII)V",
      line = 300
   )
   public static final void method2152(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         ++field3942;
         int var5 = -40 / ((67 - arg0) / 32);
         int var6 = class672.field9740 + arg2;
         int var7 = class533.field7595 + arg3;
         if (class663.field9659 != null && arg2 >= 0 && arg3 >= 0 && ~arg2 > ~class644.field9403 && ~class337.field4594 < ~arg3) {
            if (~class300.field4107.field6412.method1017(-101) != -1 || class564.field8045.field10701 == arg1) {
               long var8 = (long)(arg1 << 28 | var7 << 14 | var6);
               class622 var10 = (class622)class39.field556.method329((byte)104, var8);
               if (var10 == null) {
                  class780.method5616(arg1, arg2, arg3);
               } else {
                  class553 var11 = (class553)var10.field9154.method2933(2);
                  if (var11 == null) {
                     class780.method5616(arg1, arg2, arg3);
                  } else {
                     class546 var12;
                     label87: {
                        var12 = (class546)class780.method5616(arg1, arg2, arg3);
                        if (var12 == null) {
                           var12 = new class546(arg2 << 9, class731.field10698[arg1].method2219(true, arg2, arg3), arg3 << 9, arg1, arg1);
                           if (!var4) {
                              break label87;
                           }
                        }

                        var12.field7820 = var12.field7836 = -1;
                     }

                     var12.field7833 = var11.field7929;
                     var12.field7823 = var11.field7927;

                     int var10000;
                     int var10001;
                     label81:
                     while(true) {
                        class553 var13 = (class553)var10.field9154.method2940(false);
                        if (var13 != null) {
                           label102: {
                              var10000 = var12.field7823;
                              var10001 = var13.field7927;
                              if (var4) {
                                 break;
                              }

                              if (var10000 != var10001) {
                                 var12.field7820 = var13.field7927;
                                 var12.field7822 = var13.field7929;

                                 do {
                                    class553 var14;
                                    do {
                                       do {
                                          var14 = (class553)var10.field9154.method2940(false);
                                          if (var14 == null) {
                                             break label102;
                                          }
                                       } while(var12.field7823 == var14.field7927);

                                       var10000 = ~var14.field7927;
                                       var10001 = ~var12.field7820;
                                       if (var4) {
                                          break label81;
                                       }
                                    } while(var10000 == var10001 && !var4);

                                    var12.field7836 = var14.field7927;
                                    var12.field7828 = var14.field7929;
                                 } while(!var4);
                              }

                              if (!var4) {
                                 continue;
                              }
                           }
                        }

                        var10000 = arg1;
                        var10001 = 127;
                        break;
                     }

                     int var15 = class102.method851(var10000, (byte)var10001, (arg2 << 9) - -256, (arg3 << 9) + 256);
                     var12.field10693 = arg3 << 9;
                     var12.field10694 = arg2 << 9;
                     var12.field10702 = (byte)arg1;
                     var12.field7824 = 0;
                     var12.field10697 = var15;
                     var12.field10701 = (byte)arg1;
                     if (class437.method3224(arg3, true, arg2)) {
                        ++var12.field10702;
                     }

                     class121.method975(arg1, arg2, arg3, var15, var12);
                  }
               }
            }
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field3945[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(I)V",
      line = 398
   )
   public static void method2153(int arg0) {
      try {
         field3930 = null;
         field3931 = null;
         if (arg0 != -15725) {
            field3931 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3945[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(Lr;IIB)Z",
      line = 422
   )
   public final boolean method2154(class196 arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field3943;
         class381 var5 = (class381)arg0;
         arg1 += var5.field5493 - -1;
         arg2 += var5.field5492 + 1;
         int var6 = this.field3941 * arg2 + arg1;
         int var7 = var5.field5485;
         int var8 = var5.field5490;
         int var9 = -var8 + this.field3941;
         if (~arg2 >= -1) {
            int var10 = -arg2 + 1;
            arg2 = 1;
            var6 += this.field3941 * var10;
            var7 -= var10;
         }

         if (~(arg2 + var7) <= ~this.field3926) {
            int var11 = arg2 + 1 + -this.field3926 - -var7;
            var7 -= var11;
         }

         if (~arg1 >= -1) {
            int var12 = -arg1 + 1;
            var9 += var12;
            var8 -= var12;
            arg1 = 1;
            var6 += var12;
         }

         if (this.field3941 <= arg1 - -var8) {
            int var13 = var8 - -1 + -this.field3941 + arg1;
            var8 -= var13;
            var9 += var13;
         }

         if (~var8 < -1 && var7 > 0) {
            if (arg3 != -27) {
               this.method2156(true);
            }

            byte var14 = 8;
            int var15 = (var14 - 1) * this.field3941 + var9;
            return class565.method4029(var15, this.field3944, var8, var6, var7, var14, -7911);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field3945[12] + (arg0 != null ? field3945[3] : field3945[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(IIIII)V",
      line = 494
   )
   private final void method2155(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4360;

      try {
         ++field3928;
         if (this.field3937 != null) {
            int var7 = arg4 + -1 >> 7;
            int var8 = arg2 + arg4 + -2 >> 7;
            int var9 = arg3 + -1 >> 7;
            int var10 = arg3 + -1 + -1 + arg0 >> 7;
            int var11 = var7;
            if (arg1 <= 4) {
               field3930 = null;
               if (!var6 && var8 < var7) {
                  return;
               }
            } else if (var8 < var7) {
               return;
            }

            do {
               class23[] var12 = this.field3937[var11];
               int var13 = var9;
               if (var6) {
                  var12[var9].field265 = true;
                  var13 = var9 + 1;
               }

               while(true) {
                  while(var13 <= var10) {
                     var12[var13].field265 = true;
                     ++var13;
                  }

                  if (!var6) {
                     ++var11;
                     break;
                  }

                  ++var13;
               }
            } while(var8 >= var11);

         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field3945[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(Z)V",
      line = 532
   )
   public final void method2156(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         this.field3937 = new class23[this.field3934][this.field3933];
         ++field3938;
         int var3 = 0;
         byte var10000;
         if (var2) {
            var10000 = 0;
         } else if (~this.field3933 >= ~var3) {
            var10000 = arg0;
            if (!var2) {
               if (arg0 != 1) {
                  field3930 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            int var4 = var10000;
            if (var2) {
               this.field3937[var4][var3] = new class23(this.field3924, this, this.field3935, var4, var3, this.field3927, var4 * 128 + 1, var3 * 128 - -1);
               ++var4;
            }

            while(true) {
               while(~this.field3934 < ~var4) {
                  this.field3937[var4][var3] = new class23(this.field3924, this, this.field3935, var4, var3, this.field3927, var4 * 128 + 1, var3 * 128 - -1);
                  ++var4;
               }

               if (!var2) {
                  ++var3;
                  if (~this.field3933 >= ~var3) {
                     var10000 = arg0;
                     if (!var2) {
                        if (arg0 != 1) {
                           field3930 = null;
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = 0;
                  }
                  break;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3945[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(BILr;I)V",
      line = 561
   )
   public final void method2157(byte arg0, int arg1, class196 arg2, int arg3) {
      try {
         ++field3929;
         class381 var5 = (class381)arg2;
         arg3 += var5.field5492 + 1;
         if (arg0 < 17) {
            method2153(102);
         }

         arg1 += var5.field5493 + 1;
         int var6 = this.field3941 * arg3 + arg1;
         int var7 = 0;
         int var8 = var5.field5485;
         int var9 = var5.field5490;
         int var10 = -var9 + this.field3941;
         if (~arg3 >= -1) {
            int var11 = -arg3 + 1;
            arg3 = 1;
            var8 -= var11;
            var7 += var9 * var11;
            var6 += this.field3941 * var11;
         }

         int var12 = 0;
         if (~(arg3 + var8) <= ~this.field3926) {
            int var13 = var8 - this.field3926 + arg3 + 1;
            var8 -= var13;
         }

         if (arg1 <= 0) {
            int var14 = -arg1 + 1;
            var6 += var14;
            var12 += var14;
            var10 += var14;
            var9 -= var14;
            var7 += var14;
            arg1 = 1;
         }

         if (this.field3941 <= arg1 - -var9) {
            int var15 = -this.field3941 + var9 + arg1 + 1;
            var9 -= var15;
            var12 += var15;
            var10 += var15;
         }

         if (var9 > 0 && var8 > 0) {
            class540.method3888(var8, var12, var7, this.field3944, var9, var5.field5491, var10, var6, (byte)-44);
            this.method2155(var8, 86, var9, arg3, arg1);
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field3945[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3945[3] : field3945[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "<init>",
      descriptor = "(Lea;Lkk;)V",
      line = 635
   )
   public class284(class573 arg0, class204 arg1) {
      try {
         this.field3935 = arg1;
         this.field3924 = arg0;
         this.field3941 = (this.field3935.field4071 * this.field3935.field4062 >> this.field3924.field8352) + 2;
         this.field3926 = 2 - -(this.field3935.field4064 * this.field3935.field4062 >> this.field3924.field8352);
         this.field3927 = this.field3924.field8352 + 7 + -this.field3935.field4065;
         this.field3944 = new byte[this.field3941 * this.field3926];
         this.field3934 = this.field3935.field4071 >> this.field3927;
         this.field3933 = this.field3935.field4064 >> this.field3927;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3945[6] + (arg0 != null ? field3945[3] : field3945[4]) + ',' + (arg1 != null ? field3945[3] : field3945[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2158(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2159(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
