import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class445 {
   @OriginalMember(
      owner = "client!ika",
      name = "c",
      descriptor = "[B"
   )
   private byte[] field6484;
   @OriginalMember(
      owner = "client!ika",
      name = "m",
      descriptor = "I"
   )
   public int field6485;
   @OriginalMember(
      owner = "client!ika",
      name = "p",
      descriptor = "[[B"
   )
   private byte[][] field6492;
   @OriginalMember(
      owner = "client!ika",
      name = "n",
      descriptor = "I"
   )
   public int field6478;
   @OriginalMember(
      owner = "client!ika",
      name = "h",
      descriptor = "I"
   )
   public int field6490;
   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6495 = new String[]{method3354(method3353("\u0015oE)")), method3354(method3353("\u0019wP{")), method3354(method3353("\u0002\u007fP")), method3354(method3353("\u0003rN")), method3354(method3353("\u0019qVh3X")), method3354(method3353("\u0013uG?")), method3354(method3353("\u000b4\u0019h\r")), method3354(method3353("\u001exD6")), method3354(method3353("\u0004sZ#\u0003")), method3354(method3353("\u001cn")), method3354(method3353("\u001eo[*")), method3354(method3353("\u0017n")), method3354(method3353("\u0019qVhL\u0019t^2NX")), method3354(method3353("\u0019qVh8X")), method3354(method3353("\u0019qVh7X")), method3354(method3353("\u0012h")), method3354(method3353("\u0019qVh5X")), method3354(method3353("^4\u0019")), method3354(method3353("\u0019qVh:X")), method3354(method3353("\u0019qVh2X")), method3354(method3353("\u0019qVh9X")), method3354(method3353("\u0019qVh4X")), method3354(method3353("\u0019qVh6X")), method3354(method3353("\u0019qVh1X"))};
   @OriginalMember(
      owner = "client!ika",
      name = "o",
      descriptor = "Lgh;"
   )
   public static class572 field6479 = new class572(63, 0);
   @OriginalMember(
      owner = "client!ika",
      name = "i",
      descriptor = "Lld;"
   )
   public static class178 field6489 = new class178(16);
   @OriginalMember(
      owner = "client!ika",
      name = "b",
      descriptor = "S"
   )
   public static short field6494 = 32767;
   @OriginalMember(
      owner = "client!ika",
      name = "q",
      descriptor = "I"
   )
   public static int field6476;
   @OriginalMember(
      owner = "client!ika",
      name = "g",
      descriptor = "I"
   )
   public static int field6477;
   @OriginalMember(
      owner = "client!ika",
      name = "f",
      descriptor = "I"
   )
   public static int field6480;
   @OriginalMember(
      owner = "client!ika",
      name = "j",
      descriptor = "I"
   )
   public static int field6481;
   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "I"
   )
   public static int field6482;
   @OriginalMember(
      owner = "client!ika",
      name = "s",
      descriptor = "I"
   )
   public static int field6483;
   @OriginalMember(
      owner = "client!ika",
      name = "k",
      descriptor = "I"
   )
   public static int field6486;
   @OriginalMember(
      owner = "client!ika",
      name = "l",
      descriptor = "I"
   )
   public static int field6491;
   @OriginalMember(
      owner = "client!ika",
      name = "e",
      descriptor = "I"
   )
   public static int field6493;
   @OriginalMember(
      owner = "client!ika",
      name = "r",
      descriptor = "Ljt;"
   )
   public static class113 field6487;
   @OriginalMember(
      owner = "client!ika",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field6488;

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(B)V",
      line = 9
   )
   public static void method3343(byte arg0) {
      try {
         field6487 = null;
         field6479 = null;
         field6489 = null;
         field6488 = null;
         if (arg0 <= 62) {
            method3343((byte)-16);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6495[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(I[Ltd;Ljava/lang/String;I)I",
      line = 22
   )
   public final int method3344(int arg0, class476[] arg1, String arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field6491;
         int var6 = this.method3347(arg1, 0, new int[]{arg3}, arg2, class421.field6142);
         if (arg0 != -18283) {
            field6488 = null;
         }

         int var7 = 0;
         int var8 = 0;
         int var9;
         if (var5) {
            var9 = this.method3345(class421.field6142[var8], arg0 ^ -18464, arg1);
            if (var7 < var9) {
               var7 = var9;
            }

            ++var8;
         }

         while(true) {
            while(var8 < var6) {
               var9 = this.method3345(class421.field6142[var8], arg0 ^ -18464, arg1);
               if (var7 < var9) {
                  var7 = var9;
               }

               ++var8;
            }

            if (!var5) {
               return var7;
            }

            if (var7 < var7) {
               var7 = var7;
            }

            ++var8;
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field6495[21] + arg0 + ',' + (arg1 != null ? field6495[6] : field6495[10]) + ',' + (arg2 != null ? field6495[6] : field6495[10]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(Ljava/lang/String;I[Ltd;)I",
      line = 51
   )
   public final int method3345(String param1, int param2, class476[] param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(CII)I",
      line = 158
   )
   public final int method3346(char arg0, int arg1, int arg2) {
      try {
         if (arg1 != 0) {
            this.field6478 = 127;
         }

         ++field6493;
         return this.field6492 == null ? 0 : this.field6492[arg2][arg0];
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6495[22] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "([Ltd;I[ILjava/lang/String;[Ljava/lang/String;)I",
      line = 176
   )
   public final int method3347(class476[] param1, int param2, int[] param3, String param4, String[] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "([Ltd;IBLjava/lang/String;)I",
      line = 429
   )
   public final int method3348(class476[] arg0, int arg1, byte arg2, String arg3) {
      try {
         ++field6480;
         if (arg2 != -116) {
            field6479 = null;
         }

         return this.method3347(arg0, 0, new int[]{arg1}, arg3, class421.field6142);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6495[20] + (arg0 != null ? field6495[6] : field6495[10]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6495[6] : field6495[10]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(IB)I",
      line = 443
   )
   public final int method3349(int arg0, byte arg1) {
      try {
         ++field6476;
         int var3 = -86 % ((-32 - arg1) / 60);
         return 255 & this.field6484[arg0];
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6495[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(II[Ltd;ILjava/lang/String;)I",
      line = 453
   )
   public final int method3350(int arg0, int arg1, class476[] arg2, int arg3, String arg4) {
      try {
         if (~arg3 == -1) {
            arg3 = this.field6485;
         }

         ++field6477;
         int var6 = this.method3347(arg2, 0, new int[]{arg0}, arg4, class421.field6142);
         if (arg1 != 7766) {
            return -125;
         } else {
            int var7 = (var6 + -1) * arg3;
            return this.field6490 + this.field6478 + var7;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field6495[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6495[6] : field6495[10]) + ',' + arg3 + ',' + (arg4 != null ? field6495[6] : field6495[10]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)I",
      line = 474
   )
   public final int method3351(String arg0, boolean arg1) {
      try {
         ++field6486;
         return !arg1 ? 91 : this.method3345(arg0, 3957, (class476[])null);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6495[14] + (arg0 != null ? field6495[6] : field6495[10]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "<init>",
      descriptor = "([B)V",
      line = 491
   )
   public class445(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(ILjava/lang/String;I[Ltd;)Ljava/lang/String;",
      line = 612
   )
   public final String method3352(int param1, String param2, int param3, class476[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3353(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3354(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
