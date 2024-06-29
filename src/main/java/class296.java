import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class296 {
   @OriginalMember(
      owner = "client!wha",
      name = "i",
      descriptor = "I"
   )
   private int field4111 = -1;
   @OriginalMember(
      owner = "client!wha",
      name = "c",
      descriptor = "Lum;"
   )
   private class550 field4116 = new class550();
   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4117 = new String[]{method2257(method2256("$Z\t_\b{")), method2257(method2256("=G\u0004\u001d")), method2257(method2256("$Z\t_\r{")), method2257(method2256("\u007f\u0012\u001a\u0004%=[\u0006\u0016qs")), method2257(method2256("sb\t\u0003?:Q\u0004\u00148i\u0012")), method2257(method2256("\u0003S\u001a\u0005\"0^\rQ8*A\u001c\u0014&sQ\u0007\u0004%'\bH")), method2257(method2256(">A")), method2257(method2256("}\u0012<\u0018&6\u0012\u001c\u0010 6\\RQ")), method2257(method2256("(\u001cF_6")), method2257(method2256("\u0016_\u0001\u0005?6@\u001bKk")), method2257(method2256("$Z\t_\n{")), method2257(method2256("sG\u0018\u0015*'W&\u0004&i")), method2257(method2256("\u0010^\t\u001f\u00186F\u001c\u0018%4A,\u0014''SF\u0010;#^\u0011%$\u0010^\t\u001f\u00186F\u001c\u0018%4A@Xqsq\u001a\u0014/6\\\u001c\u0018*?AH\u0015$s\\\u0007\u0005k>S\u001c\u0012#r\u0012;\u0014?'[\u0006\u00168}]\u001f\u001f.!\b")), method2257(method2256("sV\r\u001d?2\u001c\u0007\u0006%6@R")), method2257(method2256("$Z\t_\u000f{")), method2257(method2256("sB\u001a\u001e=:V\r\u0015")), method2257(method2256("\u001d]\u0006Q(#\u0003ZDysQ\u0000\u001092Q\u001c\u00149s\u0002\u0010")), method2257(method2256("$Z\t_\t{")), method2257(method2256("$Z\t_\u000e{")), method2257(method2256("'\b")), method2257(method2256("\u0006\\\u001a\u0014(<U\u0006\u001886VH2'2\\;\u0014?'[\u0006\u00168\u0017W\u0004\u0005*sF\u0011\u0001.s[\u0006Q/6Q\u0007\u0015.{\u001b")), method2257(method2256("$Z\t_w:\\\u0001\u0005u{"))};
   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field4110 = new class101(121, 3);
   @OriginalMember(
      owner = "client!wha",
      name = "h",
      descriptor = "Lsda;"
   )
   public static class269 field4115 = new class269(33, 2);
   @OriginalMember(
      owner = "client!wha",
      name = "f",
      descriptor = "I"
   )
   public static int field4107;
   @OriginalMember(
      owner = "client!wha",
      name = "b",
      descriptor = "I"
   )
   public static int field4109;
   @OriginalMember(
      owner = "client!wha",
      name = "g",
      descriptor = "I"
   )
   public static int field4112;
   @OriginalMember(
      owner = "client!wha",
      name = "j",
      descriptor = "I"
   )
   public static int field4113;
   @OriginalMember(
      owner = "client!wha",
      name = "d",
      descriptor = "I"
   )
   public static int field4114;
   @OriginalMember(
      owner = "client!wha",
      name = "e",
      descriptor = "J"
   )
   private long field4108;

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(IJLha;)V",
      line = 3
   )
   public static final void method2250(int arg0, long arg1, class66 arg2) {
      int var4 = client.field4530;

      try {
         class789.field11472 = 0;
         class666.field9677 = class437.field6666;
         ++field4109;
         class440.field6703 = 0;
         if (arg0 == -22406) {
            class437.field6666 = 0;
            long var5 = class188.method1462(true);
            class737 var7 = (class737)class425.field6457.method102(19230);
            if (var4 != 0) {
               if (var7.method5362(arg2, arg1)) {
                  ++class789.field11472;
               }

               var7 = (class737)class425.field6457.method95((byte)105);
            }

            while(true) {
               boolean var10000;
               if (var7 == null) {
                  var10000 = class416.field6373;
                  if (var4 == 0) {
                     if (var10000 && ~(arg1 % 100L) == -1L) {
                        System.out.println(field4117[5] + class425.field6457.method99((byte)122) + field4117[3] + class789.field11472);
                        System.out.println(field4117[9] + class440.field6703 + field4117[4] + class437.field6666 + field4117[7] + (class188.method1462(true) - var5) + field4117[6]);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = var7.method5362(arg2, arg1);
               }

               if (var10000) {
                  ++class789.field11472;
               }

               var7 = (class737)class425.field6457.method95((byte)105);
            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field4117[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4117[8] : field4117[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(ZLjj;)V",
      line = 39
   )
   private final void method2251(boolean param1, class128 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(BI)C",
      line = 114
   )
   public static final char method2252(byte arg0, int arg1) {
      try {
         ++field4113;
         int var2 = 255 & arg0;
         if (arg1 == var2) {
            throw new IllegalArgumentException(field4117[16] + Integer.toString(var2, 16) + field4117[15]);
         } else {
            if (~var2 <= -129 && var2 < 160) {
               char var3 = class777.field11352[var2 + -128];
               if (var3 == 0) {
                  var3 = '?';
               }

               var2 = var3;
            }

            return (char)var2;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4117[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(I)V",
      line = 148
   )
   public static void method2253(int arg0) {
      try {
         field4110 = null;
         field4115 = null;
         int var1 = -59 / ((18 - arg0) / 32);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4117[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(ILfa;)V",
      line = 160
   )
   public final void method2254(int param1, class244 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(IIIIIIIII)V",
      line = 189
   )
   public static final void method2255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var9 = client.field4530;

      try {
         ++field4112;
         if (!class647.method4669(arg1, (byte)-94)) {
            if (~arg0 != 0) {
               class275.field3835[arg0] = true;
            } else {
               int var10 = 0;
               if (var9 != 0) {
                  class275.field3835[var10] = true;
                  ++var10;
               }

               while(true) {
                  while(var10 < 100) {
                     class275.field3835[var10] = true;
                     ++var10;
                  }

                  if (var9 == 0) {
                     return;
                  }

                  ++var10;
               }
            }
         } else {
            int var11 = arg8;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (class446.field6785) {
               var11 = class685.field10279;
               var14 = class216.field2734;
               var12 = class198.field2464;
               var15 = class424.field6436;
               var13 = class577.field8568;
               class424.field6436 = 1;
            }

            label87: {
               if (class660.field9568[arg1] == null) {
                  class20.method137(arg4, class136.field1744[arg1], -1, arg8 + 1447, arg2, arg7, arg6, arg5, arg3, arg0, ~arg0 > -1);
                  if (var9 == 0) {
                     break label87;
                  }
               }

               class20.method137(arg4, class660.field9568[arg1], -1, arg8 + 1447, arg2, arg7, arg6, arg5, arg3, arg0, arg0 < 0);
            }

            if (class446.field6785) {
               if (arg0 >= 0 && ~class424.field6436 == -3) {
                  class458.method3442(class216.field2734, arg8 ^ 26306, class198.field2464, class685.field10279, class577.field8568);
               }

               class198.field2464 = var12;
               class216.field2734 = var14;
               class424.field6436 = var15;
               class685.field10279 = var11;
               class577.field8568 = var13;
            }
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field4117[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "<init>",
      descriptor = "(Ljj;)V",
      line = 279
   )
   public class296(class128 arg0) {
      try {
         this.method2251(true, arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4117[21] + (arg0 != null ? field4117[8] : field4117[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2256(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2257(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
