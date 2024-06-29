import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class29 {
   @OriginalMember(
      owner = "client!qaa",
      name = "j",
      descriptor = "Leaa;"
   )
   private class526 field314;
   @OriginalMember(
      owner = "client!qaa",
      name = "l",
      descriptor = "I"
   )
   private int field319;
   @OriginalMember(
      owner = "client!qaa",
      name = "i",
      descriptor = "[[I"
   )
   private int[][] field325;
   @OriginalMember(
      owner = "client!qaa",
      name = "c",
      descriptor = "[Z"
   )
   private boolean[] field316;
   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field327 = new String[]{method211(method210("cos H")), method211(method210("i < |0")), method211(method210("v41b")), method211(method210("i < v0")), method211(method210("i < s0")), method211(method210("i < t0")), method211(method210("i < \u007f0")), method211(method210("i < \tq/4z\u000b0")), method211(method210("i < r0")), method211(method210("i < }0")), method211(method210("i < w0"))};
   @OriginalMember(
      owner = "client!qaa",
      name = "f",
      descriptor = "[Z"
   )
   public static boolean[] field318 = new boolean[200];
   @OriginalMember(
      owner = "client!qaa",
      name = "m",
      descriptor = "I"
   )
   public static int field315;
   @OriginalMember(
      owner = "client!qaa",
      name = "g",
      descriptor = "I"
   )
   public static int field317;
   @OriginalMember(
      owner = "client!qaa",
      name = "k",
      descriptor = "I"
   )
   public static int field320;
   @OriginalMember(
      owner = "client!qaa",
      name = "e",
      descriptor = "I"
   )
   public static int field321;
   @OriginalMember(
      owner = "client!qaa",
      name = "h",
      descriptor = "I"
   )
   public static int field322;
   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "I"
   )
   public static int field323;
   @OriginalMember(
      owner = "client!qaa",
      name = "d",
      descriptor = "I"
   )
   public static int field324;
   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "I"
   )
   public static int field326;

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(BI)Lhia;"
   )
   public final class73 method200(byte arg0, int arg1) {
      try {
         if (arg0 < 26) {
            return null;
         } else {
            ++field315;
            byte[] var3 = this.field314.method3899(-86, arg1, 1);
            class73 var4 = new class73();
            var4.method721(false, new class128(var3));
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field327[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method201(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field326;
         if (~arg0 <= -1 && ~arg0 > ~this.field325.length) {
            if (this.field316[arg0] && ~this.field325[arg0].length < -2) {
               int var4 = ~this.field319 == 0 ? 0 : 1;
               Random var5 = new Random();
               int[] var6 = new int[this.field325[arg0].length];
               class195.method1495(this.field325[arg0], arg1, var6, 0, var6.length);
               int var7 = var4;
               if (var3 == 0 && ~var4 <= ~var6.length) {
                  return var6;
               } else {
                  do {
                     int var8 = var4 + class413.method3157(var5, var6.length + -var4, (byte)54);
                     int var9 = var6[var7];
                     var6[var7] = var6[var8];
                     var6[var8] = var9;
                     ++var7;
                  } while(~var7 > ~var6.length);

                  return var6;
               }
            } else {
               return this.field325[arg0];
            }
         } else {
            return ~this.field319 != 0 ? new int[]{this.field319} : new int[0];
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field327[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Lada;Z)I"
   )
   public static final int method202(class173 arg0, boolean arg1) {
      try {
         ++field324;
         if (class496.field7336 != arg0) {
            if (class219.field2784 != arg0) {
               if (class309.field4402 == arg0) {
                  return 34168;
               } else if (class522.field7591 == arg0) {
                  return 34166;
               } else {
                  if (!arg1) {
                     field318 = null;
                  }

                  throw new IllegalArgumentException();
               }
            } else {
               return 34167;
            }
         } else {
            return 5890;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field327[4] + (arg0 != null ? field327[0] : field327[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(III)Llp;"
   )
   public static final class411 method203(int arg0, int arg1, int arg2) {
      class72 var3 = class353.field5360[arg0][arg1][arg2];
      return var3 == null ? null : var3.field907;
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method204(int arg0) {
      try {
         field318 = null;
         if (arg0 != 15844) {
            field318 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field327[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Lvs;)V"
   )
   public static final void method205(class616 arg0) {
      if (arg0 != null) {
         for(int var1 = 0; var1 < 2; ++var1) {
            class616 var2 = null;

            for(class616 var3 = class764.field11222[var1]; var3 != null; var3 = var3.field8996) {
               if (arg0 == var3) {
                  if (var2 != null) {
                     var2.field8996 = var3.field8996;
                  } else {
                     class764.field11222[var1] = var3.field8996;
                  }

                  class321.field4583 = true;
                  return;
               }

               var2 = var3;
            }

            class616 var4 = null;

            for(class616 var5 = class197.field2449[var1]; var5 != null; var5 = var5.field8996) {
               if (arg0 == var5) {
                  if (var4 != null) {
                     var4.field8996 = var5.field8996;
                  } else {
                     class197.field2449[var1] = var5.field8996;
                  }

                  class321.field4583 = true;
                  return;
               }

               var4 = var5;
            }

            class616 var6 = null;

            for(class616 var7 = class535.field7803[var1]; var7 != null; var7 = var7.field8996) {
               if (arg0 == var7) {
                  if (var6 != null) {
                     var6.field8996 = var7.field8996;
                  } else {
                     class535.field7803[var1] = var7.field8996;
                  }

                  class321.field4583 = true;
                  return;
               }

               var6 = var7;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method206(int arg0, int arg1, int arg2) {
      try {
         ++field323;
         class403 var3 = class453.method3410((long)arg1, true, 6);
         if (arg0 == 0) {
            var3.method3093(22144);
            var3.field6185 = arg2;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field327[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(II[BI)Ljava/lang/String;"
   )
   public static final String method207(int arg0, int arg1, byte[] arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field317;
         char[] var5 = new char[arg0];
         int var6 = arg3;
         int var7 = 0;
         if (var4 == 0 && var7 >= arg0) {
            return new String(var5, 0, arg3);
         } else {
            do {
               int var8 = 255 & arg2[arg1 + var7];
               if (~var8 != -1) {
                  if (~var8 <= -129 && ~var8 > -161) {
                     char var9 = class777.field11352[var8 + -128];
                     if (~var9 == -1) {
                        var9 = '?';
                     }

                     var8 = var9;
                  }

                  var5[var6++] = (char)var8;
               }

               ++var7;
            } while(var7 < arg0);

            return new String(var5, 0, var6);
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field327[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field327[0] : field327[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(ILjj;)V"
   )
   public static final void method208(int arg0, class128 arg1) {
      int var2 = client.field4530;

      try {
         if (arg0 != -24119) {
            method205((class616)null);
         }

         int var3 = 0;
         int var10000;
         if (var2 != 0) {
            var10000 = arg1.method1061((byte)60);
         } else if (class458.field6936 <= var3) {
            var10000 = field321 + 1;
            if (var2 == 0) {
               field321 = var10000;
               return;
            }
         } else {
            var10000 = arg1.method1061((byte)60);
         }

         while(true) {
            int var4 = var10000;
            int var5 = arg1.method1038((byte)-95);
            if (~var5 == -65536) {
               var5 = -1;
            }

            if (class67.field841[var4] != null) {
               class67.field841[var4].field11150 = var5;
            }

            ++var3;
            if (class458.field6936 <= var3) {
               var10000 = field321 + 1;
               if (var2 == 0) {
                  field321 = var10000;
                  return;
               }
            } else {
               var10000 = arg1.method1061((byte)60);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field327[1] + arg0 + ',' + (arg1 != null ? field327[0] : field327[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method209(int arg0) {
      try {
         if (arg0 != -1) {
            method205((class616)null);
         }

         ++field322;
         return this.field319 != -1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field327[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V"
   )
   public class29(class24 param1, int param2, class526 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method210(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method211(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
