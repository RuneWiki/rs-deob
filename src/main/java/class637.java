import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class637 extends class294 {
   @OriginalMember(
      owner = "client!aka",
      name = "A",
      descriptor = "Ljava/lang/String;"
   )
   public String field9227 = null;
   @OriginalMember(
      owner = "client!aka",
      name = "v",
      descriptor = "I"
   )
   public int field9241 = 0;
   @OriginalMember(
      owner = "client!aka",
      name = "E",
      descriptor = "Z"
   )
   private boolean field9238 = true;
   @OriginalMember(
      owner = "client!aka",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9242 = new String[]{method4661(method4660(" rKd.i")), method4661(method4660(":7\u0004d\u0015")), method4661(method4660(" rKd+i")), method4661(method4660("/lF&")), method4661(method4660(" rKd)i")), method4661(method4660(" rKd*i")), method4661(method4660(" rKd\"i")), method4661(method4660(" rKd/i")), method4661(method4660(" rKdT(wC>Vi")), method4661(method4660(" rKd i")), method4661(method4660(" rKd-i")), method4661(method4660(" rKd,i")), method4661(method4660(" rKd!i"))};
   @OriginalMember(
      owner = "client!aka",
      name = "m",
      descriptor = "B"
   )
   public byte field9229;
   @OriginalMember(
      owner = "client!aka",
      name = "u",
      descriptor = "B"
   )
   public byte field9234;
   @OriginalMember(
      owner = "client!aka",
      name = "r",
      descriptor = "I"
   )
   public static int field9221;
   @OriginalMember(
      owner = "client!aka",
      name = "p",
      descriptor = "I"
   )
   public static int field9222;
   @OriginalMember(
      owner = "client!aka",
      name = "D",
      descriptor = "I"
   )
   public static int field9223;
   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "I"
   )
   public static int field9225;
   @OriginalMember(
      owner = "client!aka",
      name = "y",
      descriptor = "I"
   )
   public static int field9226;
   @OriginalMember(
      owner = "client!aka",
      name = "C",
      descriptor = "I"
   )
   public static int field9231;
   @OriginalMember(
      owner = "client!aka",
      name = "o",
      descriptor = "I"
   )
   public static int field9233;
   @OriginalMember(
      owner = "client!aka",
      name = "q",
      descriptor = "I"
   )
   public static int field9235;
   @OriginalMember(
      owner = "client!aka",
      name = "x",
      descriptor = "I"
   )
   public static int field9236;
   @OriginalMember(
      owner = "client!aka",
      name = "t",
      descriptor = "I"
   )
   public static int field9239;
   @OriginalMember(
      owner = "client!aka",
      name = "B",
      descriptor = "J"
   )
   public long field9230;
   @OriginalMember(
      owner = "client!aka",
      name = "w",
      descriptor = "Z"
   )
   private boolean field9237;
   @OriginalMember(
      owner = "client!aka",
      name = "n",
      descriptor = "[I"
   )
   private int[] field9228;
   @OriginalMember(
      owner = "client!aka",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field9232;
   @OriginalMember(
      owner = "client!aka",
      name = "s",
      descriptor = "[Lae;"
   )
   public class277[] field9240;
   @OriginalMember(
      owner = "client!aka",
      name = "G",
      descriptor = "[Ljq;"
   )
   public static class672[] field9224;

   @OriginalMember(
      owner = "client!aka",
      name = "b",
      descriptor = "(II)V",
      line = 8
   )
   private final void method4650(int arg0, int arg1) {
      try {
         if (arg1 == 1) {
            ++field9225;
            if (this.field9240 == null) {
               this.field9240 = new class277[arg0];
            } else {
               class107.method1022(this.field9240, 0, this.field9240 = new class277[arg0], 0, this.field9241);
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9242[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "c",
      descriptor = "(II)Lsw;",
      line = 23
   )
   public static final class70 method4651(int arg0, int arg1) {
      try {
         ++field9233;
         if (~arg0 != -1) {
            if (arg0 == 1) {
               return new class293();
            }

            if (arg0 == 2) {
               return new class2();
            }

            if (arg0 == 3) {
               return new class442();
            }

            if (arg0 == 4) {
               return new class327();
            }

            if (arg0 == 5) {
               return new class663();
            }

            if (arg0 == 6) {
               return new class546();
            }

            if (arg0 == 7) {
               return new class620();
            }

            if (arg0 == 8) {
               return new class176();
            }

            if (arg0 == 9) {
               return new class599();
            }

            if (~arg0 == -11) {
               return new class530();
            }

            if (arg0 == 11) {
               return new class452();
            }

            if (~arg0 == -13) {
               return new class548();
            }

            if (arg0 == 13) {
               return new class360();
            }

            if (arg0 == 14) {
               return new class66();
            }

            if (arg0 == 15) {
               return new class118();
            }

            if (~arg0 == -17) {
               return new class645();
            }

            if (~arg0 == -18) {
               return new class749();
            }

            if (arg0 == 18) {
               return new class669();
            }

            if (arg0 == 19) {
               return new class283();
            }

            if (arg0 == 20) {
               return new class89();
            }

            if (arg0 == 21) {
               return new class154();
            }

            if (~arg0 == -23) {
               return new class201();
            }

            if (arg0 == 23) {
               return new class768();
            }

            if (~arg0 == -25) {
               return new class105();
            }

            if (~arg0 == -26) {
               return new class592();
            }

            if (arg0 == 26) {
               return new class256();
            }

            if (arg0 == 27) {
               return new class193();
            }

            if (arg0 == 28) {
               return new class144();
            }

            if (~arg0 == -30) {
               return new class152();
            }

            if (~arg0 == -31) {
               return new class573();
            }

            if (~arg0 == -32) {
               return new class687();
            }

            if (~arg0 == -33) {
               return new class38();
            }

            if (arg0 == 33) {
               return new class110();
            }

            if (arg0 == 34) {
               return new class798();
            }

            if (arg0 == 35) {
               return new class693();
            }

            if (arg0 == 36) {
               return new class784();
            }

            if (arg0 == 37) {
               return new class95();
            }

            if (~arg0 == -39) {
               return new class397();
            }

            if (arg0 != 39) {
               if (arg1 != -39) {
                  method4653(110);
               }

               return null;
            }

            if (!client.field1786) {
               return new class483();
            }
         }

         return new class420();
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9242[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(Lae;I)V",
      line = 342
   )
   public final void method4652(class277 arg0, int arg1) {
      try {
         if (this.field9240 == null || this.field9241 >= this.field9240.length) {
            this.method4650(this.field9241 + 5, 1);
         }

         ++field9236;
         if (arg1 < 31) {
            this.field9229 = 81;
         }

         this.field9240[this.field9241++] = arg0;
         this.field9228 = null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9242[2] + (arg0 != null ? field9242[1] : field9242[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(I)V",
      line = 360
   )
   public static void method4653(int arg0) {
      try {
         field9232 = null;
         if (arg0 == 458752) {
            field9224 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9242[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(ILjava/lang/String;)I",
      line = 378
   )
   public final int method4654(int arg0, String arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9223;
         if (arg0 != -1) {
            this.method4655(-29, -91);
         }

         int var4 = 0;
         if (var3) {
            if (this.field9240[var4].field4417.equalsIgnoreCase(arg1)) {
               return var4;
            }

            ++var4;
         }

         while(true) {
            while(this.field9241 > var4) {
               if (this.field9240[var4].field4417.equalsIgnoreCase(arg1)) {
                  return var4;
               }

               ++var4;
            }

            if (!var3) {
               return -1;
            }

            if (-1 != 0) {
               return var4;
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9242[4] + arg0 + ',' + (arg1 != null ? field9242[1] : field9242[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(II)V",
      line = 406
   )
   public final void method4655(int arg0, int arg1) {
      try {
         --this.field9241;
         if (arg0 != 5185) {
            method4656(-110, (byte)-33, -60);
         }

         label19: {
            ++field9222;
            if (~this.field9241 != -1) {
               class107.method1022(this.field9240, arg1 + 1, this.field9240, arg1, -arg1 + this.field9241);
               if (!client.field1786) {
                  break label19;
               }
            }

            this.field9240 = null;
         }

         this.field9228 = null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9242[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(IBI)Z",
      line = 431
   )
   public static final boolean method4656(int arg0, byte arg1, int arg2) {
      try {
         ++field9231;
         if (arg1 <= 125) {
            method4653(88);
         }

         return class385.method3118(arg0, 117, arg2) | (arg0 & 458752) != 0 || class508.method3945(arg2, -2108543543, arg0);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9242[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "<init>",
      descriptor = "(Lica;)V",
      line = 576
   )
   public class637(class354 arg0) {
      try {
         this.method4658(arg0, 1574);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9242[8] + (arg0 != null ? field9242[1] : field9242[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "b",
      descriptor = "(I)[I",
      line = 451
   )
   public final int[] method4657(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field9239;
         if (this.field9228 == null) {
            this.field9228 = new int[this.field9241];
            String[] var3 = new String[this.field9241];
            int var4 = 0;
            if (var2) {
               var3[var4] = this.field9240[var4].field4417;
               this.field9228[var4] = var4++;
            }

            while(true) {
               while(~var4 > ~this.field9241) {
                  var3[var4] = this.field9240[var4].field4417;
                  this.field9228[var4] = var4++;
               }

               int[] var10000 = this.field9228;
               if (!var2) {
                  class331.method2700(var10000, 0, var3);
                  break;
               }

               var10000[0] = var4++;
            }
         }

         if (arg0 != 0) {
            this.field9241 = -12;
         }

         return this.field9228;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9242[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(Lica;I)V",
      line = 481
   )
   private final void method4658(class354 arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9235;
         int var4 = arg0.method2855(arg1 ^ -32569);
         if (~(2 & var4) != -1) {
            this.field9238 = true;
         }

         if ((1 & var4) != 0) {
            this.field9237 = true;
         }

         super.field4655 = arg0.method2898(32109);
         this.field9230 = arg0.method2898(32109);
         this.field9227 = arg0.method2843(-1);
         if (arg1 != 1574) {
            this.field9238 = false;
         }

         arg0.method2855(-31007);
         this.field9229 = arg0.method2886((byte)88);
         this.field9234 = arg0.method2886((byte)88);
         this.field9241 = arg0.method2848(-124);
         if (~this.field9241 < -1) {
            this.field9240 = new class277[this.field9241];
            int var5 = 0;
            if (var3 || var5 < this.field9241) {
               do {
                  class277 var6 = new class277();
                  if (this.field9237) {
                     arg0.method2898(32109);
                  }

                  if (this.field9238) {
                     var6.field4417 = arg0.method2843(arg1 ^ -1575);
                  }

                  var6.field4412 = arg0.method2886((byte)88);
                  var6.field4413 = arg0.method2848(-106);
                  this.field9240[var5] = var6;
                  ++var5;
               } while(var5 < this.field9241);

            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9242[6] + (arg0 != null ? field9242[1] : field9242[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(ZII)V",
      line = 538
   )
   public static final void method4659(boolean arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         if (class326.field4957 != 0) {
            label40: {
               if (~arg1 <= -1) {
                  class44.field589[arg1] = arg2;
                  if (!var3) {
                     break label40;
                  }
               }

               int var4 = 0;
               if (var3) {
                  class44.field589[var4] = arg2;
                  ++var4;
               }

               while(~var4 > -17) {
                  class44.field589[var4] = arg2;
                  ++var4;
               }
            }
         }

         ++field9226;
         class259.field4270.method777(111, arg1, arg2);
         if (!arg0) {
            field9232 = null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9242[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4660(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4661(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
