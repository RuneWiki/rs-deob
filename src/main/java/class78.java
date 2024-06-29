import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class78 extends class347 {
   @OriginalMember(
      owner = "client!naa",
      name = "o",
      descriptor = "[B"
   )
   public byte[] field974;
   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field981 = new String[]{method748(method747("T;@\u000f\u000b\u0012")), method748(method747("T;@\u000f\r\u0012")), method748(method747("T/MM")), method748(method747("At\u000f\u000f4")), method748(method747("T;@\u000fuS4HUw\u0012")), method748(method747("T;@\u000f\b\u0012")), method748(method747("T;@\u000f\n\u0012"))};
   @OriginalMember(
      owner = "client!naa",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field973 = false;
   @OriginalMember(
      owner = "client!naa",
      name = "l",
      descriptor = "I"
   )
   public static int field978 = -1;
   @OriginalMember(
      owner = "client!naa",
      name = "m",
      descriptor = "I"
   )
   public static int field975;
   @OriginalMember(
      owner = "client!naa",
      name = "n",
      descriptor = "I"
   )
   public static int field976;
   @OriginalMember(
      owner = "client!naa",
      name = "k",
      descriptor = "I"
   )
   public static int field977;
   @OriginalMember(
      owner = "client!naa",
      name = "p",
      descriptor = "I"
   )
   public static int field979;
   @OriginalMember(
      owner = "client!naa",
      name = "j",
      descriptor = "I"
   )
   public static int field980;

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(I[SBI[Ljava/lang/String;)V"
   )
   public static final void method743(int arg0, short[] arg1, byte arg2, int arg3, String[] arg4) {
      int var5 = client.field4530;

      try {
         if (arg3 < arg0) {
            int var6 = (arg0 + arg3) / 2;
            int var7 = arg3;
            String var8 = arg4[var6];
            arg4[var6] = arg4[arg0];
            arg4[arg0] = var8;
            short var9 = arg1[var6];
            arg1[var6] = arg1[arg0];
            arg1[arg0] = var9;
            int var10 = arg3;
            String var11;
            short var12;
            if (var5 != 0) {
               if (var8 != null) {
                  if (arg4[arg3] != null) {
                     if (~(arg3 & 1) < ~arg4[arg3].compareTo(var8)) {
                        var11 = arg4[arg3];
                        arg4[arg3] = arg4[arg3];
                        arg4[arg3] = var11;
                        var12 = arg1[arg3];
                        arg1[arg3] = arg1[arg3];
                        var7 = arg3 + 1;
                        arg1[arg3] = var12;
                        var10 = arg3 + 1;
                     } else {
                        var10 = arg3 + 1;
                     }
                  } else {
                     var10 = arg3 + 1;
                  }
               } else {
                  var11 = arg4[arg3];
                  arg4[arg3] = arg4[arg3];
                  arg4[arg3] = var11;
                  var12 = arg1[arg3];
                  arg1[arg3] = arg1[arg3];
                  var7 = arg3 + 1;
                  arg1[arg3] = var12;
                  var10 = arg3 + 1;
               }
            }

            while(true) {
               while(~var10 > ~arg0) {
                  if (var8 != null) {
                     if (arg4[var10] != null) {
                        if (~(var10 & 1) < ~arg4[var10].compareTo(var8)) {
                           var11 = arg4[var10];
                           arg4[var10] = arg4[var7];
                           arg4[var7] = var11;
                           var12 = arg1[var10];
                           arg1[var10] = arg1[var7];
                           arg1[var7++] = var12;
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        ++var10;
                     }
                  } else {
                     var11 = arg4[var10];
                     arg4[var10] = arg4[var7];
                     arg4[var7] = var11;
                     var12 = arg1[var10];
                     arg1[var10] = arg1[var7];
                     arg1[var7++] = var12;
                     ++var10;
                  }
               }

               arg4[arg0] = arg4[var7];
               arg4[var7] = var8;
               arg1[arg0] = arg1[var7];
               arg1[var7] = var9;
               method743(var7 + -1, arg1, (byte)78, arg3, arg4);
               if (var5 == 0) {
                  method743(arg0, arg1, (byte)107, var7 + 1, arg4);
                  break;
               }

               if (arg0 < ~arg4[var10].compareTo(var8)) {
                  var11 = arg4[var10];
                  arg4[var10] = arg4[var7];
                  arg4[var7] = var11;
                  var12 = arg1[var10];
                  arg1[var10] = arg1[var7];
                  arg1[var7++] = var12;
                  ++var10;
               } else {
                  ++var10;
               }
            }
         }

         ++field975;
         if (arg2 <= 71) {
            method746(-80, (class128)null);
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field981[1] + arg0 + ',' + (arg1 != null ? field981[3] : field981[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field981[3] : field981[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(IIZB)Leaa;"
   )
   public static final class526 method744(int arg0, int arg1, boolean arg2, byte arg3) {
      try {
         if (arg3 != 88) {
            field973 = false;
         }

         ++field976;
         class332 var4 = null;
         if (class712.field10629 != null) {
            var4 = new class332(arg1, class712.field10629, class503.field7468[arg1], 1000000);
         }

         class277.field3859[arg1] = class594.field8757.method2086(var4, (byte)90, arg1, class687.field10353);
         class277.field3859[arg1].method4665(-1);
         return new class526(class277.field3859[arg1], arg2, arg0);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field981[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public static final void method745(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(ILjj;)Ltca;"
   )
   public static final class183 method746(int arg0, class128 arg1) {
      try {
         ++field977;
         String var2 = arg1.method1083((byte)89);
         class590 var3 = class721.method5223(-105)[arg1.method1104(arg0 ^ 8519)];
         class378 var4 = class168.method1358(0)[arg1.method1104(255)];
         int var5 = arg1.method1066(arg0 ^ 24135);
         int var6 = arg1.method1066(32767);
         int var7 = arg1.method1104(arg0 ^ 8519);
         int var8 = arg1.method1104(arg0 ^ 8519);
         if (arg0 != 8632) {
            field978 = 125;
         }

         int var9 = arg1.method1104(arg0 ^ 8519);
         int var10 = arg1.method1038((byte)-108);
         int var11 = arg1.method1038((byte)-94);
         int var12 = arg1.method1041(4758);
         int var13 = arg1.method1041(4758);
         int var14 = arg1.method1041(4758);
         return new class183(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field981[5] + arg0 + ',' + (arg1 != null ? field981[3] : field981[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class78(byte[] arg0) {
      try {
         this.field974 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field981[4] + (arg0 != null ? field981[3] : field981[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method747(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method748(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
