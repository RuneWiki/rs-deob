import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class261 {
   @OriginalMember(
      owner = "client!sb",
      name = "k",
      descriptor = "Llba;"
   )
   public class247 field4002 = new class247();
   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4013 = new String[]{method2252(method2251("/c`'")), method2252(method2251(":8\"e{")), method2252(method2251("2t\"\f.")), method2252(method2251("2t\"\u0006.")), method2252(method2251("2t\"\r.")), method2252(method2251("2t\"\u001b.")), method2252(method2251("2t\"\u0007.")), method2252(method2251("2t\"\t.")), method2252(method2251("2t\"\u0005.")), method2252(method2251("2t\"\u0002.")), method2252(method2251("2t\"\u0004.")), method2252(method2251("2t\"\u0003.")), method2252(method2251("2t\"\u0001.")), method2252(method2251("2t\"\u000e.")), method2252(method2251("2t\"\b.")), method2252(method2251("2t\"\u000f.")), method2252(method2251("2t\"wo/\u007fxu.")), method2252(method2251("2t\"\u0000.")), method2252(method2251("2t\"\n."))};
   @OriginalMember(
      owner = "client!sb",
      name = "e",
      descriptor = "I"
   )
   public static int field3995 = 0;
   @OriginalMember(
      owner = "client!sb",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field4005 = new int[3];
   @OriginalMember(
      owner = "client!sb",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field4009 = false;
   @OriginalMember(
      owner = "client!sb",
      name = "i",
      descriptor = "I"
   )
   public static int field3991;
   @OriginalMember(
      owner = "client!sb",
      name = "u",
      descriptor = "I"
   )
   public static int field3992;
   @OriginalMember(
      owner = "client!sb",
      name = "v",
      descriptor = "I"
   )
   public static int field3993;
   @OriginalMember(
      owner = "client!sb",
      name = "n",
      descriptor = "I"
   )
   public static int field3994;
   @OriginalMember(
      owner = "client!sb",
      name = "m",
      descriptor = "I"
   )
   public static int field3996;
   @OriginalMember(
      owner = "client!sb",
      name = "q",
      descriptor = "I"
   )
   public static int field3997;
   @OriginalMember(
      owner = "client!sb",
      name = "g",
      descriptor = "I"
   )
   public static int field3998;
   @OriginalMember(
      owner = "client!sb",
      name = "p",
      descriptor = "I"
   )
   public static int field3999;
   @OriginalMember(
      owner = "client!sb",
      name = "o",
      descriptor = "I"
   )
   public static int field4000;
   @OriginalMember(
      owner = "client!sb",
      name = "s",
      descriptor = "I"
   )
   public static int field4001;
   @OriginalMember(
      owner = "client!sb",
      name = "b",
      descriptor = "I"
   )
   public static int field4004;
   @OriginalMember(
      owner = "client!sb",
      name = "d",
      descriptor = "I"
   )
   public static int field4006;
   @OriginalMember(
      owner = "client!sb",
      name = "t",
      descriptor = "I"
   )
   public static int field4008;
   @OriginalMember(
      owner = "client!sb",
      name = "r",
      descriptor = "I"
   )
   public static int field4010;
   @OriginalMember(
      owner = "client!sb",
      name = "j",
      descriptor = "I"
   )
   public static int field4012;
   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "Llba;"
   )
   private class247 field4007;
   @OriginalMember(
      owner = "client!sb",
      name = "c",
      descriptor = "Ltea;"
   )
   public static class272 field4003;
   @OriginalMember(
      owner = "client!sb",
      name = "l",
      descriptor = "[Lma;"
   )
   public static class148[] field4011;

   @OriginalMember(
      owner = "client!sb",
      name = "b",
      descriptor = "(I)Llba;"
   )
   public final class247 method2235(int arg0) {
      try {
         ++field3992;
         int var2 = 91 / ((58 - arg0) / 36);
         class247 var3 = this.field4002.field3781;
         if (this.field4002 == var3) {
            return null;
         } else {
            var3.method2140((byte)-83);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4013[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(ILsb;Llba;)V"
   )
   private final void method2236(int arg0, class261 arg1, class247 arg2) {
      try {
         ++field4006;
         class247 var4 = this.field4002.field3776;
         this.field4002.field3776 = arg2.field3776;
         arg2.field3776.field3781 = this.field4002;
         if (arg0 >= -122) {
            field4011 = null;
         }

         if (this.field4002 != arg2) {
            arg2.field3776 = arg1.field4002.field3776;
            arg2.field3776.field3781 = arg2;
            var4.field3781 = arg1.field4002;
            arg1.field4002.field3776 = var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4013[11] + arg0 + ',' + (arg1 != null ? field4013[1] : field4013[0]) + ',' + (arg2 != null ? field4013[1] : field4013[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2237(int arg0) {
      boolean var2 = client.field10022;

      try {
         while(true) {
            class247 var3 = this.field4002.field3781;
            if (this.field4002 != var3) {
               var3.method2140((byte)-119);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            if (arg0 <= 47) {
               return;
            }

            ++field3996;
            this.field4007 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4013[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(Llba;I)V"
   )
   public final void method2238(class247 arg0, int arg1) {
      try {
         if (arg0.field3776 != null) {
            arg0.method2140((byte)61);
         }

         ++field3991;
         arg0.field3776 = this.field4002.field3776;
         if (arg1 == 13) {
            arg0.field3781 = this.field4002;
            arg0.field3776.field3781 = arg0;
            arg0.field3781.field3776 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4013[15] + (arg0 != null ? field4013[1] : field4013[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "c",
      descriptor = "(B)Llba;"
   )
   public final class247 method2239(byte arg0) {
      try {
         if (arg0 < 86) {
            field3995 = 41;
         }

         ++field3999;
         class247 var2 = this.field4007;
         if (this.field4002 == var2) {
            this.field4007 = null;
            return null;
         } else {
            this.field4007 = var2.field3781;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4013[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(ZILjq;I)V"
   )
   public static final void method2240(boolean arg0, int arg1, class211 arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field4012;
         if (class678.field9669) {
            int var5 = 0;
            class272 var6 = (class272)arg2.field3011.method5225(true);
            int var7;
            if (var4) {
               var7 = class605.method4460(true, var6);
               if (var7 > var5) {
                  var5 = var7;
               }

               var6 = (class272)arg2.field3011.method5227(-17856);
            }

            while(true) {
               int var10000;
               if (var6 == null) {
                  var5 += 8;
                  var10000 = arg0;
                  if (!var4) {
                     if (arg0 != 0) {
                        method2240(false, -128, (class211)null, -100);
                     }

                     int var8 = arg2.field3008 * 16 - -21;
                     class134.field2185 = (class317.field4742 ? 26 : 22) + arg2.field3008 * 16;
                     int var9 = class752.field10679 + class587.field8249;
                     if (~class557.field7909 > ~(var5 + var9)) {
                        var9 = -var5 + class752.field10679;
                     }

                     if (var9 < 0) {
                        var9 = 0;
                     }

                     int var10 = class317.field4742 ? 33 : 31;
                     int var11 = -var10 + arg3 + 13;
                     if (var8 + var11 > class140.field2243) {
                        var11 = -var8 + class140.field2243;
                     }

                     class552.field7876 = var9;
                     if (~var11 > -1) {
                        var11 = 0;
                     }

                     class674.field9446 = var11;
                     class562.field8001 = arg2;
                     class128.field2047 = var5;
                     return;
                  }
               } else {
                  var10000 = class605.method4460(true, var6);
               }

               var7 = var10000;
               if (var7 > var5) {
                  var5 = var7;
               }

               var6 = (class272)arg2.field3011.method5227(-17856);
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field4013[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4013[1] : field4013[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(ILlba;)V"
   )
   public final void method2241(int arg0, class247 arg1) {
      try {
         if (arg1.field3776 != null) {
            arg1.method2140((byte)41);
         }

         ++field4004;
         arg1.field3776 = this.field4002;
         if (arg0 != 3) {
            this.method2241(40, (class247)null);
         }

         arg1.field3781 = this.field4002.field3781;
         arg1.field3776.field3781 = arg1;
         arg1.field3781.field3776 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4013[2] + arg0 + ',' + (arg1 != null ? field4013[1] : field4013[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method2242(int arg0) {
      try {
         ++field4010;
         if (arg0 != 23702) {
            this.method2243(120);
         }

         return this.field4002.field3781 == this.field4002;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4013[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "e",
      descriptor = "(I)Llba;"
   )
   public final class247 method2243(int arg0) {
      try {
         ++field4008;
         int var2 = -64 % ((51 - arg0) / 54);
         class247 var3 = this.field4002.field3776;
         if (this.field4002 == var3) {
            this.field4007 = null;
            return null;
         } else {
            this.field4007 = var3.field3776;
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4013[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2244(int arg0) {
      try {
         field4005 = null;
         if (arg0 != -1) {
            method2244(-5);
         }

         field4011 = null;
         field4003 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4013[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(B)Llba;"
   )
   public final class247 method2245(byte arg0) {
      try {
         if (arg0 != -94) {
            return null;
         } else {
            ++field3994;
            class247 var2 = this.field4002.field3781;
            if (this.field4002 == var2) {
               this.field4007 = null;
               return null;
            } else {
               this.field4007 = var2.field3781;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4013[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "b",
      descriptor = "(B)Llba;"
   )
   public final class247 method2246(byte arg0) {
      try {
         ++field3998;
         class247 var2 = this.field4007;
         if (this.field4002 == var2) {
            this.field4007 = null;
            return null;
         } else {
            this.field4007 = var2.field3776;
            if (arg0 != 110) {
               field4009 = true;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4013[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method2247(int arg0) {
      try {
         class396.field5869 = 0L;
         class704.field10134 = "";
         ++field3997;
         if (arg0 <= -10) {
            class777.field11335 = -1;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4013[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(ILsb;)V"
   )
   public final void method2248(int arg0, class261 arg1) {
      try {
         if (arg0 != 33) {
            field3995 = 5;
         }

         ++field3993;
         this.method2236(-128, arg1, this.field4002.field3781);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4013[9] + arg0 + ',' + (arg1 != null ? field4013[1] : field4013[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method2249(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         ++field4001;
         int var3 = 0;
         class247 var4 = this.field4002.field3781;
         if (!arg0) {
            this.field4002 = null;
            if (var2) {
               ++var3;
               var4 = var4.field3781;
            }
         }

         while(true) {
            if (this.field4002 == var4) {
               if (!var2) {
                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field3781;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4013[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2250(int arg0, int arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         if (~class563.field8014 != ~arg0) {
            class387.field5650 = new int[arg0];
            int var4 = 0;
            if (var3) {
               class387.field5650[var4] = (var4 << 12) / arg0;
               ++var4;
            }

            while(true) {
               while(arg0 > var4) {
                  class387.field5650[var4] = (var4 << 12) / arg0;
                  ++var4;
               }

               class358.field5293 = arg0 - 1;
               class790.field11509 = arg0 * 32;
               if (!var3) {
                  class563.field8014 = arg0;
                  break;
               }

               ++var4;
            }
         }

         ++field4000;
         if (~class451.field6570 != ~arg1) {
            label75: {
               if (class563.field8014 == arg1) {
                  class693.field10001 = class387.field5650;
                  if (!var3) {
                     break label75;
                  }
               }

               class693.field10001 = new int[arg1];
               int var5 = 0;
               if (var3 || ~var5 > ~arg1) {
                  do {
                     class693.field10001[var5] = (var5 << 12) / arg1;
                     ++var5;
                  } while(~var5 > ~arg1);
               }
            }

            class451.field6570 = arg1;
            class801.field11660 = arg1 + -1;
         }

         if (arg2 != 32) {
            field4003 = null;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4013[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "<init>",
      descriptor = "()V"
   )
   public class261() {
      try {
         this.field4002.field3781 = this.field4002;
         this.field4002.field3776 = this.field4002;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4013[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2251(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2252(char[] arg0) {
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
            var10005 = 22;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
