import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class29 {
   @OriginalMember(
      owner = "client!gb",
      name = "c",
      descriptor = "Lsn;"
   )
   private class675 field350 = new class675();
   @OriginalMember(
      owner = "client!gb",
      name = "k",
      descriptor = "I"
   )
   private int field359 = 0;
   @OriginalMember(
      owner = "client!gb",
      name = "E",
      descriptor = "Lica;"
   )
   private class354 field358 = new class354(1350);
   @OriginalMember(
      owner = "client!gb",
      name = "l",
      descriptor = "Lpfa;"
   )
   public class102 field362 = new class102(15000);
   @OriginalMember(
      owner = "client!gb",
      name = "i",
      descriptor = "Z"
   )
   public boolean field365 = false;
   @OriginalMember(
      owner = "client!gb",
      name = "s",
      descriptor = "Z"
   )
   public boolean field367 = true;
   @OriginalMember(
      owner = "client!gb",
      name = "u",
      descriptor = "I"
   )
   public int field372 = 0;
   @OriginalMember(
      owner = "client!gb",
      name = "q",
      descriptor = "Luk;"
   )
   public class498 field373 = null;
   @OriginalMember(
      owner = "client!gb",
      name = "F",
      descriptor = "I"
   )
   public int field370 = 0;
   @OriginalMember(
      owner = "client!gb",
      name = "j",
      descriptor = "I"
   )
   public int field375 = 0;
   @OriginalMember(
      owner = "client!gb",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field376 = new String[]{method213(method212("p\u0013(Xi")), method213(method212("l_(5<")), method213(method212("eHj\u001a")), method213(method212("l_(7<")), method213(method212("l_(=<")), method213(method212("l_(2<")), method213(method212("l_(1<")), method213(method212("l_(3<")), method213(method212("l_(4<")), method213(method212("l_(?<")), method213(method212("l_(<<")), method213(method212("l_(0<")), method213(method212("l_(><"))};
   @OriginalMember(
      owner = "client!gb",
      name = "D",
      descriptor = "I"
   )
   public static int field344;
   @OriginalMember(
      owner = "client!gb",
      name = "w",
      descriptor = "I"
   )
   public static int field345;
   @OriginalMember(
      owner = "client!gb",
      name = "B",
      descriptor = "I"
   )
   public static int field348;
   @OriginalMember(
      owner = "client!gb",
      name = "o",
      descriptor = "I"
   )
   public static int field349;
   @OriginalMember(
      owner = "client!gb",
      name = "r",
      descriptor = "I"
   )
   public static int field351;
   @OriginalMember(
      owner = "client!gb",
      name = "h",
      descriptor = "I"
   )
   public static int field352;
   @OriginalMember(
      owner = "client!gb",
      name = "p",
      descriptor = "I"
   )
   public static int field353;
   @OriginalMember(
      owner = "client!gb",
      name = "b",
      descriptor = "I"
   )
   public static int field354;
   @OriginalMember(
      owner = "client!gb",
      name = "t",
      descriptor = "I"
   )
   public static int field356;
   @OriginalMember(
      owner = "client!gb",
      name = "d",
      descriptor = "I"
   )
   public static int field357;
   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "I"
   )
   public static int field360;
   @OriginalMember(
      owner = "client!gb",
      name = "e",
      descriptor = "I"
   )
   public int field366;
   @OriginalMember(
      owner = "client!gb",
      name = "y",
      descriptor = "I"
   )
   private int field368;
   @OriginalMember(
      owner = "client!gb",
      name = "x",
      descriptor = "I"
   )
   public int field369;
   @OriginalMember(
      owner = "client!gb",
      name = "g",
      descriptor = "I"
   )
   public int field371;
   @OriginalMember(
      owner = "client!gb",
      name = "C",
      descriptor = "Lbja;"
   )
   public class275 field346;
   @OriginalMember(
      owner = "client!gb",
      name = "n",
      descriptor = "Lce;"
   )
   public class378 field361;
   @OriginalMember(
      owner = "client!gb",
      name = "f",
      descriptor = "Lv;"
   )
   public class410 field355;
   @OriginalMember(
      owner = "client!gb",
      name = "m",
      descriptor = "Luk;"
   )
   public class498 field363;
   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "Luk;"
   )
   public class498 field364;
   @OriginalMember(
      owner = "client!gb",
      name = "v",
      descriptor = "Luk;"
   )
   public class498 field374;
   @OriginalMember(
      owner = "client!gb",
      name = "A",
      descriptor = "Lo;"
   )
   public static class747 field347;

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(Lica;B)V",
      line = 3
   )
   public static final void method201(class354 arg0, byte arg1) {
      boolean var2 = client.field1786;

      try {
         ++field353;
         byte[] var3 = new byte[24];
         if (class505.field7744 != null) {
            try {
               int var10000;
               label86: {
                  class505.field7744.method1359(0L, 127);
                  class505.field7744.method1354((byte)-33, var3);
                  int var4 = 0;
                  if (var2) {
                     var10000 = var3[var4];
                  } else if (var4 >= 24) {
                     var10000 = ~var4;
                     if (!var2) {
                        break label86;
                     }
                  } else {
                     var10000 = var3[var4];
                  }

                  label85:
                  do {
                     while(true) {
                        if (var10000 != 0) {
                           if (!var2) {
                              var10000 = ~var4;
                              break;
                           }

                           ++var4;
                        } else {
                           ++var4;
                        }

                        if (var4 >= 24) {
                           var10000 = ~var4;
                           if (!var2) {
                              break label85;
                           }
                        } else {
                           var10000 = var3[var4];
                        }
                     }
                  } while(var2);
               }

               if (var10000 <= -25) {
                  throw new IOException();
               }
            } catch (Exception var7) {
               int var5 = 0;
               if (var2) {
                  var3[var5] = -1;
                  ++var5;
               }

               while(true) {
                  while(~var5 > -25) {
                     var3[var5] = -1;
                     ++var5;
                  }

                  if (!var2) {
                     break;
                  }

                  ++var5;
               }
            }
         }

         if (arg1 == -114) {
            arg0.method2858(24, 427497672, 0, var3);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field376[1] + (arg0 != null ? field376[0] : field376[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "c",
      descriptor = "(I)V",
      line = 48
   )
   public final void method202(int arg0) {
      try {
         this.field350.method4981((byte)-78);
         ++field344;
         this.field359 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field376[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(I)V",
      line = 58
   )
   public final void method203(int arg0) {
      try {
         if (class308.field4801 % 50 == arg0) {
            this.field369 = this.field368;
            this.field368 = 0;
            this.field371 = this.field366;
            this.field366 = 0;
         }

         ++field349;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field376[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(B)V",
      line = 81
   )
   public final void method204(byte arg0) {
      try {
         ++field354;
         if (arg0 <= 109) {
            this.field362 = null;
         }

         if (this.field355 != null) {
            this.field355.method1579(-128);
            this.field355 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field376[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(II)I",
      line = 97
   )
   public static final int method205(int arg0, int arg1) {
      try {
         if (arg0 != 1023) {
            field351 = 50;
         }

         ++field360;
         return 1023 & arg1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field376[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(Lvea;B)Z",
      line = 108
   )
   public static final boolean method206(class77 arg0, byte arg1) {
      try {
         ++field352;
         if (arg0 == null) {
            return false;
         } else if (!arg0.field1019) {
            return false;
         } else if (!arg0.method725(class60.field741, true)) {
            return false;
         } else {
            if (arg1 <= 17) {
               field351 = -55;
            }

            if (class561.field8338.method3141((long)arg0.field990, true) != null) {
               return false;
            } else {
               return class563.field8365.method3141((long)arg0.field1003, true) == null;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field376[4] + (arg0 != null ? field376[0] : field376[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(ZBI)V",
      line = 137
   )
   public static final void method207(boolean arg0, byte arg1, int arg2) {
      try {
         ++field348;
         class637 var3 = arg0 ? class147.field2219 : class636.field9199;
         if (var3 != null && ~arg2 <= -1 && ~arg2 > ~var3.field9241) {
            class277 var4 = var3.field9240[arg2];
            if (var4.field4412 == arg1) {
               String var5 = var4.field4417;
               class29 var6 = class578.method4332((byte)-32);
               class577 var7 = class218.method1888(class324.field4934, arg1 + 99, var6.field361);
               var7.field8531.method2864(-26110, 3 - -class714.method5292((byte)-97, var5));
               var7.field8531.method2864(-26110, !arg0 ? 0 : 1);
               var7.field8531.method2873(arg2, (byte)95);
               var7.field8531.method2862(var5, true);
               var6.method211(var7, 116);
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field376[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(FIFIFIIFFLoga;II[B)V",
      line = 166
   )
   public static final void method208(float arg0, int arg1, float arg2, int arg3, float arg4, int arg5, int arg6, float arg7, float arg8, class62 arg9, int arg10, int arg11, byte[] arg12) {
      try {
         ++field356;

         for(int var13 = arg11; arg5 > var13; ++var13) {
            class487.method3786(86, arg7, arg4, arg9, var13, arg10, arg6, arg5, arg12, arg8, arg2, arg3, arg1, arg0);
            arg10 += arg1 * arg6;
         }

      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field376[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field376[0] : field376[2]) + ',' + arg10 + ',' + arg11 + ',' + (arg12 != null ? field376[0] : field376[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(Z)V",
      line = 185
   )
   public static void method209(boolean arg0) {
      try {
         field347 = null;
         if (!arg0) {
            field347 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field376[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "b",
      descriptor = "(I)V",
      line = 197
   )
   public final void method210(int arg0) throws IOException {
      boolean var2 = client.field1786;

      try {
         int var10000;
         int var10001;
         label40: {
            ++field345;
            if (this.field355 != null && ~this.field359 < -1) {
               this.field358.field5436 = 0;

               do {
                  class577 var3 = (class577)this.field350.method4972((byte)-84);
                  if (var3 == null) {
                     break;
                  }

                  var10000 = this.field358.field5428.length + -this.field358.field5436;
                  var10001 = var3.field8533;
                  if (var2) {
                     break label40;
                  }

                  if (var10000 < var10001) {
                     break;
                  }

                  this.field358.method2858(var3.field8533, arg0 ^ 427501845, 0, var3.field8531.field5428);
                  this.field359 -= var3.field8533;
                  var3.method2477(arg0 ^ 13925);
                  var3.field8531.method2879(1);
                  var3.method4325(false);
               } while(!var2);

               this.field355.method1578(0, this.field358.field5436, false, this.field358.field5428);
               this.field372 = 0;
               this.field368 += this.field358.field5436;
            }

            var10000 = arg0;
            var10001 = 12765;
         }

         if (var10000 != var10001) {
            this.field372 = -88;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field376[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(Lmq;I)V",
      line = 240
   )
   public final void method211(class577 arg0, int arg1) {
      try {
         ++field357;
         this.field350.method4980(arg0, 0);
         arg0.field8533 = arg0.field8531.field5436;
         if (arg1 < 114) {
            this.field364 = null;
         }

         this.field359 += arg0.field8533;
         arg0.field8531.field5436 = 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field376[3] + (arg0 != null ? field376[0] : field376[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method212(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method213(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
