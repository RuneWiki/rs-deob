import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class398 {
   @OriginalMember(
      owner = "client!bga",
      name = "c",
      descriptor = "I"
   )
   private int field5901 = 0;
   @OriginalMember(
      owner = "client!bga",
      name = "o",
      descriptor = "[Llba;"
   )
   public class247[] field5896;
   @OriginalMember(
      owner = "client!bga",
      name = "r",
      descriptor = "I"
   )
   public int field5894;
   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5903 = new String[]{method3105(method3104("wz[Sz=")), method3105(method3104("wz[S\u0004|sS\t\u0006=")), method3105(method3104("wz[Sq=")), method3105(method3104("wz[S{=")), method3105(method3104("wz[S\u007f=")), method3105(method3104("wz[Ss=")), method3105(method3104("wz[S}=")), method3105(method3104("{hV\u0011")), method3105(method3104("n3\u0014SE")), method3105(method3104("wz[S~=")), method3105(method3104("wz[Sr=")), method3105(method3104("wz[S|=")), method3105(method3104("wz[Sp=")), method3105(method3104("wz[Sy="))};
   @OriginalMember(
      owner = "client!bga",
      name = "e",
      descriptor = "Lpf;"
   )
   public static class424 field5892 = new class424();
   @OriginalMember(
      owner = "client!bga",
      name = "g",
      descriptor = "[Ltq;"
   )
   public static class560[] field5898 = new class560[37];
   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "I"
   )
   public static int field5885;
   @OriginalMember(
      owner = "client!bga",
      name = "p",
      descriptor = "I"
   )
   public static int field5886;
   @OriginalMember(
      owner = "client!bga",
      name = "i",
      descriptor = "I"
   )
   public static int field5887;
   @OriginalMember(
      owner = "client!bga",
      name = "k",
      descriptor = "I"
   )
   public static int field5888;
   @OriginalMember(
      owner = "client!bga",
      name = "h",
      descriptor = "I"
   )
   public static int field5889;
   @OriginalMember(
      owner = "client!bga",
      name = "d",
      descriptor = "I"
   )
   public static int field5891;
   @OriginalMember(
      owner = "client!bga",
      name = "n",
      descriptor = "I"
   )
   public static int field5893;
   @OriginalMember(
      owner = "client!bga",
      name = "j",
      descriptor = "I"
   )
   public static int field5895;
   @OriginalMember(
      owner = "client!bga",
      name = "q",
      descriptor = "I"
   )
   public static int field5897;
   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "I"
   )
   public static int field5899;
   @OriginalMember(
      owner = "client!bga",
      name = "l",
      descriptor = "J"
   )
   private long field5900;
   @OriginalMember(
      owner = "client!bga",
      name = "f",
      descriptor = "Llba;"
   )
   private class247 field5890;
   @OriginalMember(
      owner = "client!bga",
      name = "m",
      descriptor = "Llba;"
   )
   private class247 field5902;

   @OriginalMember(
      owner = "client!bga",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method3093(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field5888;
         int var3 = arg0;
         int var4 = 0;
         if (!var2 && this.field5894 <= var4) {
            return arg0;
         } else {
            do {
               class247 var5 = this.field5896[var4];
               class247 var6 = var5.field3781;
               if (var2) {
                  ++var3;
                  var6 = var6.field3781;
               }

               while(true) {
                  while(var5 != var6) {
                     ++var3;
                     var6 = var6.field3781;
                  }

                  if (!var2) {
                     ++var4;
                     break;
                  }

                  var6 = var6.field3781;
               }
            } while(this.field5894 > var4);

            return var3;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field5903[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(I[Llba;)I"
   )
   public final int method3094(int arg0, class247[] arg1) {
      boolean var3 = client.field10022;

      try {
         ++field5899;
         int var4 = -101 % ((-57 - arg0) / 33);
         int var5 = 0;
         int var6 = 0;
         if (!var3 && ~this.field5894 >= ~var6) {
            return var5;
         } else {
            do {
               class247 var7 = this.field5896[var6];
               class247 var8 = var7.field3781;
               if (var3) {
                  arg1[var5++] = var8;
                  var8 = var8.field3781;
               }

               while(true) {
                  while(var7 != var8) {
                     arg1[var5++] = var8;
                     var8 = var8.field3781;
                  }

                  if (!var3) {
                     ++var6;
                     break;
                  }

                  var8 = var8.field3781;
               }
            } while(~this.field5894 < ~var6);

            return var5;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field5903[9] + arg0 + ',' + (arg1 != null ? field5903[8] : field5903[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "(B)Llba;"
   )
   public final class247 method3095(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field5891;
         if (~this.field5901 < -1 && this.field5896[this.field5901 + -1] != this.field5902) {
            class247 var3 = this.field5902;
            this.field5902 = var3.field3781;
            return var3;
         } else {
            class247 var10000;
            class247 var4;
            if (arg0 != -118) {
               this.field5900 = 17L;
               if (var2) {
                  var4 = this.field5896[this.field5901++].field3781;
                  var10000 = this.field5896[this.field5901 - 1];
               } else {
                  if (~this.field5901 <= ~this.field5894) {
                     return null;
                  }

                  var4 = this.field5896[this.field5901++].field3781;
                  var10000 = this.field5896[this.field5901 - 1];
               }
            } else {
               if (~this.field5901 <= ~this.field5894) {
                  return null;
               }

               var4 = this.field5896[this.field5901++].field3781;
               var10000 = this.field5896[this.field5901 - 1];
            }

            do {
               while(var10000 == var4) {
                  if (~this.field5901 <= ~this.field5894) {
                     return null;
                  }

                  var4 = this.field5896[this.field5901++].field3781;
                  var10000 = this.field5896[this.field5901 - 1];
               }

               this.field5902 = var4.field3781;
               var10000 = var4;
            } while(var2);

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5903[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3096(int arg0) {
      boolean var2 = client.field10022;

      try {
         int var3 = 0;
         class247 var4;
         if (var2) {
            var4 = this.field5896[var3];
         } else {
            if (this.field5894 <= var3) {
               if (arg0 > -111) {
                  this.method3096(66);
               }

               ++field5886;
               this.field5902 = null;
               this.field5890 = null;
               return;
            }

            var4 = this.field5896[var3];
         }

         while(true) {
            while(true) {
               class247 var5 = var4.field3781;
               if (var4 != var5) {
                  var5.method2140((byte)-104);
                  if (var2) {
                     break;
                  }

                  if (!var2) {
                     continue;
                  }

                  ++var3;
                  break;
               }

               ++var3;
               break;
            }

            if (this.field5894 <= var3) {
               if (arg0 > -111) {
                  this.method3096(66);
               }

               ++field5886;
               this.field5902 = null;
               this.field5890 = null;
               return;
            }

            var4 = this.field5896[var3];
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5903[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method3097(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(JLlba;I)V"
   )
   public final void method3098(long arg0, class247 arg1, int arg2) {
      try {
         ++field5895;
         if (arg1.field3776 != null) {
            arg1.method2140((byte)-74);
         }

         class247 var5 = this.field5896[(int)((long)(this.field5894 + arg2) & arg0)];
         arg1.field3776 = var5.field3776;
         arg1.field3781 = var5;
         arg1.field3776.field3781 = arg1;
         arg1.field3777 = arg0;
         arg1.field3781.field3776 = arg1;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5903[13] + arg0 + ',' + (arg1 != null ? field5903[8] : field5903[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3099(byte arg0) {
      try {
         ++field5893;
         return arg0 < 38 ? -36 : this.field5894;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5903[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3100(int arg0) {
      try {
         field5892 = null;
         if (arg0 == 0) {
            field5898 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5903[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(IJ)Llba;"
   )
   public final class247 method3101(int arg0, long arg1) {
      boolean var4 = client.field10022;

      try {
         ++field5889;
         this.field5900 = arg1;
         class247 var5 = this.field5896[(int)(arg1 & (long)(this.field5894 - 1))];
         if (arg0 != -1) {
            return null;
         } else {
            this.field5890 = var5.field3781;
            class247 var6;
            if (var4) {
               if (~this.field5890.field3777 == ~arg1) {
                  var6 = this.field5890;
                  this.field5890 = this.field5890.field3781;
                  return var6;
               }

               this.field5890 = this.field5890.field3781;
            }

            while(true) {
               while(this.field5890 != var5) {
                  if (~this.field5890.field3777 == ~arg1) {
                     var6 = this.field5890;
                     this.field5890 = this.field5890.field3781;
                     return var6;
                  }

                  this.field5890 = this.field5890.field3781;
               }

               this.field5890 = null;
               if (!var4) {
                  return null;
               }

               this.field5890 = this.field5890.field3781;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field5903[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "d",
      descriptor = "(I)Llba;"
   )
   public final class247 method3102(int arg0) {
      try {
         int var2 = -101 / ((arg0 - 8) / 57);
         ++field5885;
         this.field5901 = 0;
         return this.method3095((byte)-118);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5903[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "(I)Llba;"
   )
   public final class247 method3103(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field5887;
         if (this.field5890 == null) {
            return null;
         } else {
            if (arg0 != 0) {
               this.method3103(83);
            }

            class247 var3 = this.field5896[(int)((long)(this.field5894 + -1) & this.field5900)];
            class247 var4;
            if (var2) {
               if (~this.field5890.field3777 == ~this.field5900) {
                  var4 = this.field5890;
                  this.field5890 = this.field5890.field3781;
                  return var4;
               }

               this.field5890 = this.field5890.field3781;
            }

            while(true) {
               while(this.field5890 != var3) {
                  if (~this.field5890.field3777 == ~this.field5900) {
                     var4 = this.field5890;
                     this.field5890 = this.field5890.field3781;
                     return var4;
                  }

                  this.field5890 = this.field5890.field3781;
               }

               this.field5890 = null;
               if (!var2) {
                  return null;
               }

               this.field5890 = this.field5890.field3781;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5903[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class398(int arg0) {
      try {
         this.field5896 = new class247[arg0];
         this.field5894 = arg0;

         for(int var2 = 0; ~arg0 < ~var2; ++var2) {
            class247 var3 = this.field5896[var2] = new class247();
            var3.field3776 = var3;
            var3.field3781 = var3;
         }

      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5903[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3104(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3105(char[] arg0) {
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
            var10005 = 29;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
