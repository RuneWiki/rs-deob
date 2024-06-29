import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class104 {
   @OriginalMember(
      owner = "client!wea",
      name = "f",
      descriptor = "Z"
   )
   public boolean field1344 = false;
   @OriginalMember(
      owner = "client!wea",
      name = "c",
      descriptor = "Lsia;"
   )
   private class407 field1343 = new class407(64);
   @OriginalMember(
      owner = "client!wea",
      name = "h",
      descriptor = "Lsia;"
   )
   public class407 field1355 = new class407(500);
   @OriginalMember(
      owner = "client!wea",
      name = "r",
      descriptor = "Lsia;"
   )
   public class407 field1356 = new class407(30);
   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "Lsia;"
   )
   public class407 field1357 = new class407(50);
   @OriginalMember(
      owner = "client!wea",
      name = "l",
      descriptor = "Lww;"
   )
   private class339 field1354;
   @OriginalMember(
      owner = "client!wea",
      name = "n",
      descriptor = "Lww;"
   )
   public class339 field1340;
   @OriginalMember(
      owner = "client!wea",
      name = "e",
      descriptor = "Z"
   )
   public boolean field1352;
   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1359 = new String[]{method934(method933("q\u0006z)d.")), method934(method933("q\u0006z)o.")), method934(method933("q\u0006z)k.")), method934(method933("q\u0006z)l.")), method934(method933("q\u0006z)i.")), method934(method933("q\u0006z)n.")), method934(method933("q\u0006z)h.")), method934(method933("}M5)P")), method934(method933("h\u0016wk")), method934(method933("q\u0006z)\u0011o\rrs\u0013.")), method934(method933("q\u0006z)j.")), method934(method933("q\u0006z)g.")), method934(method933("q\u0006z)e."))};
   @OriginalMember(
      owner = "client!wea",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field1339 = new int[1];
   @OriginalMember(
      owner = "client!wea",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field1351 = true;
   @OriginalMember(
      owner = "client!wea",
      name = "s",
      descriptor = "I"
   )
   public static int field1341;
   @OriginalMember(
      owner = "client!wea",
      name = "m",
      descriptor = "I"
   )
   public static int field1342;
   @OriginalMember(
      owner = "client!wea",
      name = "g",
      descriptor = "I"
   )
   public static int field1345;
   @OriginalMember(
      owner = "client!wea",
      name = "t",
      descriptor = "I"
   )
   public static int field1346;
   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "I"
   )
   public static int field1347;
   @OriginalMember(
      owner = "client!wea",
      name = "o",
      descriptor = "I"
   )
   public static int field1348;
   @OriginalMember(
      owner = "client!wea",
      name = "q",
      descriptor = "I"
   )
   public static int field1349;
   @OriginalMember(
      owner = "client!wea",
      name = "d",
      descriptor = "I"
   )
   public static int field1350;
   @OriginalMember(
      owner = "client!wea",
      name = "i",
      descriptor = "I"
   )
   public static int field1353;
   @OriginalMember(
      owner = "client!wea",
      name = "p",
      descriptor = "I"
   )
   public int field1358;

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(Lww;II)Lra;"
   )
   public static final class402 method923(class339 arg0, int arg1, int arg2) {
      try {
         if (arg1 != -1) {
            method923((class339)null, 71, -77);
         }

         ++field1346;
         byte[] var3 = arg0.method2700(arg2, -2);
         return var3 == null ? null : new class402(var3);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1359[10] + (arg0 != null ? field1359[7] : field1359[8]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method924(int arg0) {
      try {
         field1339 = null;
         if (arg0 != 64) {
            method924(56);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1359[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method925(int arg0) {
      try {
         ++field1341;
         class407 var2 = this.field1343;
         synchronized(this.field1343) {
            this.field1343.method3201((byte)116);
         }

         class407 var3 = this.field1355;
         synchronized(this.field1355) {
            this.field1355.method3201((byte)-74);
         }

         class407 var4 = this.field1356;
         synchronized(this.field1356) {
            this.field1356.method3201((byte)-58);
         }

         class407 var5 = this.field1357;
         synchronized(this.field1357) {
            this.field1357.method3201((byte)124);
         }

         int var6 = -11 % ((58 - arg0) / 43);
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field1359[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method926(boolean arg0, int arg1) {
      try {
         ++field1353;
         if (!arg0 == this.field1352) {
            this.field1352 = arg0;
            this.method925(-127);
            int var3 = -120 / ((6 - arg1) / 42);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1359[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method927(int arg0) {
      try {
         if (arg0 != 64) {
            this.field1340 = null;
         }

         class407 var2 = this.field1343;
         synchronized(this.field1343) {
            this.field1343.method3187(-23825);
         }

         ++field1349;
         class407 var3 = this.field1355;
         synchronized(this.field1355) {
            this.field1355.method3187(-23825);
         }

         class407 var4 = this.field1356;
         synchronized(this.field1356) {
            this.field1356.method3187(-23825);
         }

         class407 var5 = this.field1357;
         synchronized(this.field1357) {
            this.field1357.method3187(-23825);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field1359[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method928(int arg0, int arg1) {
      try {
         ++field1348;
         class407 var3 = this.field1343;
         synchronized(this.field1343) {
            this.field1343.method3197(5, arg1);
         }

         class407 var4 = this.field1355;
         synchronized(this.field1355) {
            if (arg0 < 18) {
               return;
            }

            this.field1355.method3197(5, arg1);
         }

         class407 var5 = this.field1356;
         synchronized(this.field1356) {
            this.field1356.method3197(5, arg1);
         }

         class407 var6 = this.field1357;
         synchronized(this.field1357) {
            this.field1357.method3197(5, arg1);
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field1359[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(BI)Lfia;"
   )
   public final class294 method929(byte arg0, int arg1) {
      try {
         ++field1342;
         class407 var3 = this.field1343;
         class294 var4;
         synchronized(this.field1343) {
            if (arg0 > -76) {
               this.field1352 = false;
            }

            var4 = (class294)this.field1343.method3192((long)arg1, (byte)-105);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field1354;
            byte[] var6;
            synchronized(this.field1354) {
               var6 = this.field1354.method2697(class473.method3588(arg1, -12954), class370.method2916(arg1, (byte)-83), false);
            }

            class294 var7 = new class294();
            var7.field4110 = arg1;
            var7.field4107 = this;
            if (var6 != null) {
               var7.method2373((byte)27, new class66(var6));
            }

            var7.method2368(-1);
            if (var7.field4068) {
               var7.field4032 = false;
               var7.field4039 = 0;
            }

            if (!this.field1352 && var7.field4104) {
               var7.field4103 = null;
               var7.field4048 = null;
            }

            class407 var8 = this.field1343;
            synchronized(this.field1343) {
               this.field1343.method3190(var7, (long)arg1, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field1359[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method930(boolean arg0, int arg1) {
      try {
         ++field1347;
         if (arg1 < -18) {
            if (!arg0 == this.field1344) {
               this.field1344 = arg0;
               this.method925(114);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1359[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method931(int arg0, byte arg1) {
      try {
         if (arg1 != -124) {
            method924(-102);
         }

         ++field1350;
         this.field1343 = new class407(arg0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1359[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method932(int arg0, byte arg1) {
      try {
         this.field1358 = arg0;
         ++field1345;
         class407 var3 = this.field1355;
         synchronized(this.field1355) {
            this.field1355.method3201((byte)113);
         }

         class407 var4 = this.field1356;
         synchronized(this.field1356) {
            this.field1356.method3201((byte)-89);
         }

         class407 var5 = this.field1357;
         synchronized(this.field1357) {
            this.field1357.method3201((byte)98);
            int var6 = -127 / ((arg1 - 33) / 34);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field1359[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "<init>",
      descriptor = "(Lkb;IZLww;Lww;)V"
   )
   public class104(class500 arg0, int arg1, boolean arg2, class339 arg3, class339 arg4) {
      try {
         this.field1354 = arg3;
         this.field1340 = arg4;
         this.field1352 = arg2;
         if (this.field1354 != null) {
            int var6 = -1 + this.field1354.method2703((byte)126);
            this.field1354.method2691(var6, -83);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1359[9] + (arg0 != null ? field1359[7] : field1359[8]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1359[7] : field1359[8]) + ',' + (arg4 != null ? field1359[7] : field1359[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method933(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method934(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
