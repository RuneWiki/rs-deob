import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class383 {
   @OriginalMember(
      owner = "client!lh",
      name = "i",
      descriptor = "I"
   )
   private int field5312 = 0;
   @OriginalMember(
      owner = "client!lh",
      name = "e",
      descriptor = "I"
   )
   private int field5316 = 0;
   @OriginalMember(
      owner = "client!lh",
      name = "d",
      descriptor = "I"
   )
   private int field5320 = 0;
   @OriginalMember(
      owner = "client!lh",
      name = "l",
      descriptor = "Liu;"
   )
   private class530 field5317;
   @OriginalMember(
      owner = "client!lh",
      name = "j",
      descriptor = "Luda;"
   )
   private class56 field5315;
   @OriginalMember(
      owner = "client!lh",
      name = "m",
      descriptor = "[Loja;"
   )
   private class125[] field5323;
   @OriginalMember(
      owner = "client!lh",
      name = "g",
      descriptor = "Lpfa;"
   )
   public class248 field5322;
   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5324 = new String[]{method3041(method3040("t\u00187E-")), method3041(method3040("aCu\u0007")), method3041(method3040("c^7.x")), method3041(method3040("c^7*x")), method3041(method3040("c^7,x")), method3041(method3040("c^7(x")), method3041(method3040("c^7-x")), method3041(method3040("c^7)x")), method3041(method3040("c^7W9a_mUx"))};
   @OriginalMember(
      owner = "client!lh",
      name = "f",
      descriptor = "I"
   )
   public static int field5311;
   @OriginalMember(
      owner = "client!lh",
      name = "c",
      descriptor = "I"
   )
   public static int field5313;
   @OriginalMember(
      owner = "client!lh",
      name = "b",
      descriptor = "I"
   )
   public static int field5314;
   @OriginalMember(
      owner = "client!lh",
      name = "h",
      descriptor = "I"
   )
   public static int field5318;
   @OriginalMember(
      owner = "client!lh",
      name = "k",
      descriptor = "I"
   )
   public static int field5319;
   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field5321;

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(ZIZIII)V"
   )
   public final void method3033(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
      try {
         boolean var10 = arg2 & this.field5317.method408();
         ++field5313;
         int var7 = -95 / ((arg5 - -30) / 60);
         if (!var10 && (arg4 == 4 || ~arg4 == -9 || arg4 == 9)) {
            if (~arg4 == -5) {
               arg3 = arg1;
            }

            arg4 = 2;
         }

         if (arg4 != 0 && arg0) {
            arg4 |= Integer.MIN_VALUE;
         }

         if (~this.field5320 != ~arg4) {
            if (~this.field5320 != -1) {
               this.field5323[Integer.MAX_VALUE & this.field5320].method340(5);
            }

            if (arg4 != 0) {
               this.field5323[arg4 & Integer.MAX_VALUE].method343(arg0, 3);
               this.field5323[arg4 & Integer.MAX_VALUE].method346(true, arg0);
               this.field5323[arg4 & Integer.MAX_VALUE].method341(-126, arg3, arg1);
            }

            this.field5320 = arg4;
            this.field5316 = arg1;
            this.field5312 = arg3;
         } else if (~this.field5320 != -1) {
            this.field5323[this.field5320 & Integer.MAX_VALUE].method346(true, arg0);
            if (this.field5316 != arg1 || ~this.field5312 != ~arg3) {
               this.field5323[this.field5320 & Integer.MAX_VALUE].method341(-127, arg3, arg1);
               this.field5316 = arg1;
               this.field5312 = arg3;
            }

         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field5324[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3034(byte arg0) {
      try {
         if (arg0 == -42) {
            field5321 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5324[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(ILsa;)I"
   )
   public static final int method3035(int arg0, class783 arg1) {
      boolean var2 = client.field1481;

      try {
         ++field5311;
         int var3 = 85 % ((arg0 - 48) / 49);
         int var4 = arg1.field11441;
         class516 var5 = arg1.method71(-12710);
         if (~arg1.field125 != 0 && !arg1.field154) {
            if (arg1.field125 != var5.field7208 && arg1.field125 != var5.field7225 && ~arg1.field125 != ~var5.field7238 && ~arg1.field125 != ~var5.field7184) {
               if (arg1.field125 != var5.field7197 && arg1.field125 != var5.field7226 && arg1.field125 != var5.field7231 && ~arg1.field125 != ~var5.field7224) {
                  return var4;
               }

               var4 = arg1.field11433;
               if (!var2) {
                  return var4;
               }
            }

            var4 = arg1.field11421;
            if (!var2) {
               return var4;
            }
         }

         var4 = arg1.field11412;
         return var4;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5324[2] + arg0 + ',' + (arg1 != null ? field5324[0] : field5324[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3036(int arg0, int arg1, int arg2) {
      boolean var3 = class548.field8080[0][arg1][arg2] != null && class548.field8080[0][arg1][arg2].field10646 != null;

      for(int var4 = arg0; var4 >= 0; --var4) {
         if (class548.field8080[var4][arg1][arg2] == null) {
            class731 var5 = class548.field8080[var4][arg1][arg2] = new class731(var4);
            if (var3) {
               ++var5.field10647;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(IILll;)Z"
   )
   public final boolean method3037(int arg0, int arg1, class549 arg2) {
      try {
         ++field5318;
         if (this.field5320 == 0) {
            return false;
         } else {
            if (arg1 != 26449) {
               method3035(56, (class783)null);
            }

            this.field5323[this.field5320 & Integer.MAX_VALUE].method345(arg2, -23385, arg0);
            return true;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5324[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5324[0] : field5324[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method3038(int arg0, int arg1) {
      try {
         ++field5319;
         return arg0 <= 96 ? false : this.field5323[arg1].method347(false);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5324[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "b",
      descriptor = "(II)Z"
   )
   public static final boolean method3039(int arg0, int arg1) {
      try {
         int var2 = 83 / ((arg1 - 66) / 57);
         ++field5314;
         return ~arg0 == -1 || ~arg0 == -2 || arg0 == 2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5324[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class383(class530 arg0) {
      try {
         this.field5317 = arg0;
         this.field5315 = new class56(arg0);
         this.field5323 = new class125[10];
         this.field5323[1] = new class73(arg0);
         this.field5323[2] = new class182(arg0, this.field5315);
         this.field5323[4] = new class188(arg0, this.field5315);
         this.field5323[5] = new class212(arg0, this.field5315);
         this.field5323[6] = new class46(arg0);
         this.field5323[7] = new class545(arg0);
         this.field5323[3] = this.field5322 = new class248(arg0);
         this.field5323[8] = new class794(arg0, this.field5315);
         this.field5323[9] = new class654(arg0, this.field5315);
         if (!this.field5323[8].method347(false)) {
            this.field5323[8] = this.field5323[4];
         }

         if (!this.field5323[9].method347(false)) {
            this.field5323[9] = this.field5323[8];
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5324[8] + (arg0 != null ? field5324[0] : field5324[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3040(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3041(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
