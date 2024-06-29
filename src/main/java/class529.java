import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class529 {
   @OriginalMember(
      owner = "client!hg",
      name = "j",
      descriptor = "B"
   )
   public byte field7409;
   @OriginalMember(
      owner = "client!hg",
      name = "h",
      descriptor = "[I"
   )
   public int[] field7406;
   @OriginalMember(
      owner = "client!hg",
      name = "k",
      descriptor = "B"
   )
   public byte field7413;
   @OriginalMember(
      owner = "client!hg",
      name = "n",
      descriptor = "[I"
   )
   public int[] field7418;
   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "[I"
   )
   public int[] field7410;
   @OriginalMember(
      owner = "client!hg",
      name = "c",
      descriptor = "S"
   )
   public short field7420;
   @OriginalMember(
      owner = "client!hg",
      name = "s",
      descriptor = "S"
   )
   public short field7411;
   @OriginalMember(
      owner = "client!hg",
      name = "e",
      descriptor = "S"
   )
   public short field7408;
   @OriginalMember(
      owner = "client!hg",
      name = "f",
      descriptor = "[S"
   )
   public short[] field7419;
   @OriginalMember(
      owner = "client!hg",
      name = "q",
      descriptor = "[S"
   )
   public short[] field7423;
   @OriginalMember(
      owner = "client!hg",
      name = "d",
      descriptor = "[S"
   )
   public short[] field7421;
   @OriginalMember(
      owner = "client!hg",
      name = "r",
      descriptor = "S"
   )
   public short field7412;
   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7425 = new String[]{method3954(method3953("W\u0000L;0")), method3954(method3953("W\u0000L<0")), method3954(method3953("W\u0000LDqQ\u000e\u0016F0")), method3954(method3953("W\u0000L90")), method3954(method3953("V\u0006\u0003")), method3954(method3953("W\u0000L=0")), method3954(method3953("W\u0000L:0"))};
   @OriginalMember(
      owner = "client!hg",
      name = "g",
      descriptor = "Laka;"
   )
   public static class418 field7417 = new class418(2, -1);
   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "Ldja;"
   )
   public static class45 field7424 = new class45(1);
   @OriginalMember(
      owner = "client!hg",
      name = "l",
      descriptor = "I"
   )
   public static int field7407;
   @OriginalMember(
      owner = "client!hg",
      name = "m",
      descriptor = "I"
   )
   public static int field7415;
   @OriginalMember(
      owner = "client!hg",
      name = "p",
      descriptor = "I"
   )
   public static int field7416;
   @OriginalMember(
      owner = "client!hg",
      name = "o",
      descriptor = "I"
   )
   public static int field7422;
   @OriginalMember(
      owner = "client!hg",
      name = "i",
      descriptor = "Lgj;"
   )
   public static class736 field7414;

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(IIIIIIIIIIII)V"
   )
   public static final void method3948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field7416;
         if (class792.method5717((byte)-98, arg1)) {
            if (arg10 > -115) {
               method3949(true);
            }

            if (class778.field11337[arg1] != null) {
               client.method993(class778.field11337[arg1], -1, arg0, arg3, arg5, arg6, arg11, arg7, arg2, arg4, arg9, arg8);
            } else {
               client.method993(class419.field5722[arg1], -1, arg0, arg3, arg5, arg6, arg11, arg7, arg2, arg4, arg9, arg8);
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field7425[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3949(boolean arg0) {
      boolean var1 = client.field1481;

      try {
         int var2 = 0;
         if (var1) {
            class203.field2587[var2] = false;
            ++var2;
         }

         while(true) {
            while(~var2 > -6) {
               class203.field2587[var2] = false;
               ++var2;
            }

            ++field7415;
            if (!var1) {
               if (!arg0) {
                  method3951((byte)-97);
               }

               class267.field3374 = 0;
               class561.field8209 = -1;
               class62.field791 = 0;
               class623.field9221 = -1;
               class574.field8442 = -1;
               class81.field1137 = -1;
               class784.field11454 = 1;
               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7425[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3950(byte arg0) {
      try {
         field7417 = null;
         field7424 = null;
         if (arg0 >= -97) {
            field7424 = null;
         }

         field7414 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7425[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "(B)Lvo;"
   )
   public static final class384 method3951(byte arg0) {
      try {
         ++field7422;

         try {
            return arg0 != -25 ? null : (class384)Class.forName(field7425[4]).newInstance();
         } catch (Throwable var2) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7425[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3952(int arg0, int arg1, int arg2) {
      try {
         ++field7407;
         if (arg1 >= -17) {
            method3951((byte)-127);
         }

         return (class286.method2326(arg0, arg2, (byte)100) | class735.method5321(arg2, arg0, 126) | class182.method1530(arg2, false, arg0)) & class646.method4749(arg2, (byte)-94, arg0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7425[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "<init>",
      descriptor = "(IIIIIIIIIIIIII)V"
   )
   public class529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
      try {
         this.field7409 = (byte)arg0;
         this.field7406 = new int[4];
         this.field7413 = (byte)arg1;
         this.field7418 = new int[4];
         this.field7410 = new int[4];
         this.field7410[1] = arg3;
         this.field7410[2] = arg4;
         this.field7410[3] = arg5;
         this.field7410[0] = arg2;
         this.field7418[2] = arg8;
         this.field7418[3] = arg9;
         this.field7418[1] = arg7;
         this.field7418[0] = arg6;
         this.field7406[3] = arg13;
         this.field7406[2] = arg12;
         this.field7406[1] = arg11;
         this.field7406[0] = arg10;
         this.field7420 = (short)(arg2 >> class783.field11447);
         this.field7411 = (short)(arg4 >> class783.field11447);
         this.field7408 = (short)(arg10 >> class783.field11447);
         this.field7419 = new short[4];
         this.field7423 = new short[4];
         this.field7421 = new short[4];
         this.field7412 = (short)(arg12 >> class783.field11447);
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field7425[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3953(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3954(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
