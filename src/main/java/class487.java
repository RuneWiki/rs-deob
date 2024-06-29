import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class487 extends class81 {
   @OriginalMember(
      owner = "client!qg",
      name = "g",
      descriptor = "Lck;"
   )
   private class667 field7202;
   @OriginalMember(
      owner = "client!qg",
      name = "h",
      descriptor = "Lvu;"
   )
   private class355 field7205;
   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7209 = new String[]{method3616(method3615("]v\tJ\\")), method3616(method3615("]v\tK\\")), method3616(method3615("]v\tE\\")), method3616(method3615("BdKc")), method3616(method3615("W?\t!\t")), method3616(method3615("]v\tH\\")), method3616(method3615("]v\t3\u001dBxS1\\")), method3616(method3615("]v\tF\\")), method3616(method3615("]v\tL\\")), method3616(method3615("]v\tG\\"))};
   @OriginalMember(
      owner = "client!qg",
      name = "o",
      descriptor = "Lsd;"
   )
   public static class101 field7206 = new class101(70, 0);
   @OriginalMember(
      owner = "client!qg",
      name = "m",
      descriptor = "I"
   )
   public static int field7199;
   @OriginalMember(
      owner = "client!qg",
      name = "k",
      descriptor = "I"
   )
   public static int field7200;
   @OriginalMember(
      owner = "client!qg",
      name = "f",
      descriptor = "I"
   )
   public static int field7201;
   @OriginalMember(
      owner = "client!qg",
      name = "l",
      descriptor = "I"
   )
   public static int field7203;
   @OriginalMember(
      owner = "client!qg",
      name = "i",
      descriptor = "I"
   )
   public static int field7204;
   @OriginalMember(
      owner = "client!qg",
      name = "n",
      descriptor = "I"
   )
   public static int field7207;
   @OriginalMember(
      owner = "client!qg",
      name = "j",
      descriptor = "Lnn;"
   )
   public static class436 field7208;

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(Lvu;Lvu;BF)Z"
   )
   public final boolean method3609(class355 param1, class355 param2, byte param3, float param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(IIFLjs;IIFFFIF)[B"
   )
   public static final byte[] method3610(int arg0, int arg1, float arg2, class348 arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, float arg10) {
      try {
         int var11 = -29 / ((67 - arg1) / 49);
         ++field7207;
         byte[] var12 = new byte[arg0 * arg5 * arg9];
         class600.method4386(0, arg2, (byte)-125, var12, arg5, arg0, arg7, arg9, arg6, arg10, arg3, arg4, arg8);
         return var12;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field7209[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7209[4] : field7209[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "(Z)Lvu;"
   )
   public final class355 method758(boolean arg0) {
      try {
         ++field7203;
         return arg0 ? null : this.field7205;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7209[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(ZBI)Lvw;"
   )
   public static final class319 method3611(boolean arg0, byte arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field7204;
         class14[] var4 = class751.field11113;
         synchronized(class751.field11113) {
            if (arg1 != -48) {
               field7206 = null;
            }

            class319 var5;
            label46: {
               if (~class751.field11113.length < ~arg2 && !class751.field11113[arg2].method103(false)) {
                  var5 = (class319)class751.field11113[arg2].method97(0);
                  var5.method4413((byte)112);
                  int var10002 = class130.field1614[arg2]--;
                  if (var3 == 0) {
                     break label46;
                  }
               }

               var5 = new class319();
               var5.field4560 = new class655[arg2];
               int var6 = 0;
               if (var3 != 0 || var6 < arg2) {
                  do {
                     var5.field4560[var6] = new class655();
                     ++var6;
                  } while(var6 < arg2);
               }
            }

            var5.field4566 = arg0;
            return var5;
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field7209[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3612(byte arg0) {
      try {
         field7208 = null;
         field7206 = null;
         int var1 = -8 / ((arg0 - 64) / 44);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7209[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(IIIIIIZ)V"
   )
   public static final void method3613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      int var7 = client.field4530;

      try {
         if (!arg6) {
            method3612((byte)46);
         }

         label55: {
            if (~arg4 != -9 && arg4 != 16) {
               class72 var8 = class353.field5360[arg2][arg5][arg3];
               if (var8 == null) {
                  var8 = new class72(arg2);
               }

               label44: {
                  if (~arg4 == -2) {
                     var8.field908 = (short)arg1;
                     var8.field909 = (short)arg0;
                     if (var7 == 0) {
                        break label44;
                     }
                  }

                  if (~arg4 == -3) {
                     var8.field914 = (short)arg0;
                     var8.field912 = (short)arg1;
                  }
               }

               if (!class227.field2907) {
                  break label55;
               }

               class749.method5463((byte)-64);
               if (var7 == 0) {
                  break label55;
               }
            }

            if (arg4 != 8) {
               int var9 = (arg5 << class459.field6950) - -class768.field11264;
               int var10 = -class768.field11264 + var9;
               int var11 = arg3 << class459.field6950;
               int var12 = class768.field11264 + var11;
               int var13 = class147.field1843[arg2].method2235(arg3, 2116912585, arg5 + 1);
               int var14 = class147.field1843[arg2].method2235(arg3 - -1, 2116912585, arg5);
               class368.field5540[class601.field8821++] = new class246(arg4, arg2, var9, var10, var10, var9, var13, var14, -arg0 + var14, -arg0 + var13, var11, var12, var12, var11);
               if (var7 == 0) {
                  break label55;
               }
            }

            int var15 = arg5 << class459.field6950;
            int var16 = class768.field11264 + var15;
            int var17 = arg3 << class459.field6950;
            int var18 = var17 - -class768.field11264;
            int var19 = class147.field1843[arg2].method2235(arg3, 2116912585, arg5);
            int var20 = class147.field1843[arg2].method2235(arg3 - -1, 2116912585, arg5 + 1);
            class368.field5540[class601.field8821++] = new class246(arg4, arg2, var15, var16, var16, var15, var19, var20, -arg0 + var20, -arg0 + var19, var17, var18, var18, var17);
         }

         ++field7200;
      } catch (RuntimeException var22) {
         throw class670.method4877(var22, field7209[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "<init>",
      descriptor = "(Lck;I)V"
   )
   public class487(class667 arg0, int arg1) {
      try {
         this.field7202 = arg0;
         this.field7205 = new class355(arg0, 6408, arg1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7209[6] + (arg0 != null ? field7209[4] : field7209[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3614(byte arg0) {
      try {
         int var2 = 110 % ((arg0 - 52) / 63);
         ++field7201;
         return this.field7205.field5386;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7209[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3615(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3616(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
