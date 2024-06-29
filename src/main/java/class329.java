import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class329 {
   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "Lsia;"
   )
   private class407 field4550 = new class407(256);
   @OriginalMember(
      owner = "client!pn",
      name = "g",
      descriptor = "Lww;"
   )
   private class339 field4548;
   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4556 = new String[]{method2618(method2617("`Bx{a")), method2618(method2617("~Y:U")), method2618(method2617("k\u0002x\u00174")), method2618(method2617("`Bxza")), method2618(method2617("`Bx~a")), method2618(method2617("`Bx\u007fa")), method2618(method2617("`Bx}a")), method2618(method2617("`Bxxa")), method2618(method2617("`Bx\u0005 ~E\"\u0007a")), method2618(method2617("`Bx|a")), method2618(method2617("`Bxqa"))};
   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "Ldl;"
   )
   public static class78 field4545 = null;
   @OriginalMember(
      owner = "client!pn",
      name = "c",
      descriptor = "I"
   )
   public static int field4546;
   @OriginalMember(
      owner = "client!pn",
      name = "d",
      descriptor = "I"
   )
   public static int field4547;
   @OriginalMember(
      owner = "client!pn",
      name = "h",
      descriptor = "I"
   )
   public static int field4549;
   @OriginalMember(
      owner = "client!pn",
      name = "i",
      descriptor = "I"
   )
   public static int field4551;
   @OriginalMember(
      owner = "client!pn",
      name = "f",
      descriptor = "I"
   )
   public static int field4552;
   @OriginalMember(
      owner = "client!pn",
      name = "k",
      descriptor = "I"
   )
   public static int field4553;
   @OriginalMember(
      owner = "client!pn",
      name = "j",
      descriptor = "I"
   )
   public static int field4554;
   @OriginalMember(
      owner = "client!pn",
      name = "e",
      descriptor = "Lww;"
   )
   public static class339 field4555;

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method2609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         label35: {
            if (arg6 < class415.field5689 || arg2 > class282.field3921 || arg5 < class577.field8561 || ~class586.field8647 > ~arg7) {
               class173.method1484(arg4, arg2, arg5, arg0, 64, arg1, arg7, arg6);
               if (!client.field1481) {
                  break label35;
               }
            }

            class323.method2537(arg7, arg4, arg0, -6279, arg5, arg1, arg2, arg6);
         }

         ++field4553;
         if (arg3 <= 38) {
            method2616(-78);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4556[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "(IB)Lgo;"
   )
   public final class494 method2610(int arg0, byte arg1) {
      try {
         ++field4551;
         class407 var3 = this.field4550;
         class494 var4;
         synchronized(this.field4550) {
            if (arg1 != 37) {
               this.field4550 = null;
            }

            var4 = (class494)this.field4550.method3192((long)arg0, (byte)-120);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field4548;
            byte[] var6;
            synchronized(this.field4548) {
               var6 = this.field4548.method2697(arg0, 26, false);
            }

            class494 var7 = new class494();
            if (var6 != null) {
               var7.method3756(6970, new class66(var6));
            }

            class407 var8 = this.field4550;
            synchronized(this.field4550) {
               this.field4550.method3190(var7, (long)arg0, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field4556[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2611(int arg0, byte arg1) {
      try {
         class407 var3 = this.field4550;
         synchronized(this.field4550) {
            this.field4550.method3197(5, arg0);
            if (arg1 <= 77) {
               method2609(48, -29, 119, 16, -8, -62, -22, 66);
            }
         }

         ++field4547;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4556[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(Lha;IIILid;IIIIIII)V"
   )
   public static final void method2612(class479 arg0, int arg1, int arg2, int arg3, class438 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         if (arg5 > arg10 && arg7 + arg10 > arg5 && ~(arg9 - 13) > ~arg8 && ~arg8 > ~(arg9 + 3)) {
            arg1 = arg3;
         }

         ++field4554;
         if (arg6 > -67) {
            field4545 = null;
         }

         String var12 = class568.method4268(-111, arg4);
         class98.field1306.method3434(class476.field6643, 0, arg10 + 3, 125, arg9, arg1, class175.field2255, var12);
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field4556[3] + (arg0 != null ? field4556[2] : field4556[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4556[2] : field4556[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2613(int arg0) {
      try {
         class407 var2 = this.field4550;
         synchronized(this.field4550) {
            this.field4550.method3201((byte)-74);
         }

         ++field4549;
         if (arg0 != 256) {
            method2616(96);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4556[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2614(int arg0) {
      try {
         ++field4546;
         class407 var2 = this.field4550;
         synchronized(this.field4550) {
            this.field4550.method3187(-23825);
            if (arg0 != -27198) {
               method2609(4, -23, -72, -7, 6, -93, 118, 27);
            }

         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4556[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(BI)Ltk;"
   )
   public static final class111 method2615(byte arg0, int arg1) {
      try {
         if (arg0 < 108) {
            field4545 = null;
         }

         ++field4552;
         return class504.field7037 && class503.field6992 <= arg1 && arg1 <= class568.field8356 ? class490.field6838[-class503.field6992 + arg1] : null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4556[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2616(int arg0) {
      try {
         field4555 = null;
         if (arg0 != 256) {
            method2615((byte)11, -97);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4556[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class329(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field4548 = arg2;
         this.field4548.method2691(26, 4);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4556[8] + (arg0 != null ? field4556[2] : field4556[1]) + ',' + arg1 + ',' + (arg2 != null ? field4556[2] : field4556[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2617(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2618(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
