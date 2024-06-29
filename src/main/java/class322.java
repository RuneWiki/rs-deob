import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class322 {
   @OriginalMember(
      owner = "client!vw",
      name = "h",
      descriptor = "Ltv;"
   )
   private class590 field4292 = new class590(64);
   @OriginalMember(
      owner = "client!vw",
      name = "i",
      descriptor = "Lqh;"
   )
   private class74 field4290;
   @OriginalMember(
      owner = "client!vw",
      name = "e",
      descriptor = "Lqh;"
   )
   public class74 field4294;
   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4300 = new String[]{method2426(method2425("#I\u0019\r")), method2426(method2425("6\u0012[O\u0006")), method2426(method2425(";K[]\u0012#U\u0001_S")), method2426(method2425(";K[#S")), method2426(method2425(";K[%S")), method2426(method2425(";K[ S")), method2426(method2425(";K[\"S")), method2426(method2425(";K['S")), method2426(method2425(";K[$S"))};
   @OriginalMember(
      owner = "client!vw",
      name = "l",
      descriptor = "Lbga;"
   )
   public static class378 field4295 = new class378(38, 0);
   @OriginalMember(
      owner = "client!vw",
      name = "k",
      descriptor = "I"
   )
   public static int field4296 = -2;
   @OriginalMember(
      owner = "client!vw",
      name = "j",
      descriptor = "I"
   )
   public static int field4298 = 0;
   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "I"
   )
   public static int field4288;
   @OriginalMember(
      owner = "client!vw",
      name = "c",
      descriptor = "I"
   )
   public static int field4289;
   @OriginalMember(
      owner = "client!vw",
      name = "f",
      descriptor = "I"
   )
   public static int field4291;
   @OriginalMember(
      owner = "client!vw",
      name = "g",
      descriptor = "I"
   )
   public static int field4293;
   @OriginalMember(
      owner = "client!vw",
      name = "b",
      descriptor = "I"
   )
   public static int field4297;
   @OriginalMember(
      owner = "client!vw",
      name = "d",
      descriptor = "I"
   )
   public static int field4299;

   @OriginalMember(
      owner = "client!vw",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2419(int arg0) {
      try {
         class590 var2 = this.field4292;
         synchronized(this.field4292) {
            this.field4292.method4245(true);
         }

         ++field4293;
         int var3 = 92 % ((-73 - arg0) / 38);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4300[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2420(int arg0) {
      try {
         class590 var2 = this.field4292;
         synchronized(this.field4292) {
            this.field4292.method4244(true);
            if (arg0 >= -43) {
               this.method2421(53, (byte)77);
            }
         }

         ++field4288;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4300[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(IB)Lsa;"
   )
   public final class216 method2421(int arg0, byte arg1) {
      try {
         ++field4299;
         if (arg1 < 111) {
            this.field4290 = null;
         }

         class590 var3 = this.field4292;
         class216 var4;
         synchronized(this.field4292) {
            var4 = (class216)this.field4292.method4239((long)arg0, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field4290;
            byte[] var6;
            synchronized(this.field4290) {
               var6 = this.field4290.method732(arg0, 3, (byte)41);
            }

            class216 var7 = new class216();
            var7.field2675 = this;
            if (var6 != null) {
               var7.method1639(-1, new class594(var6));
            }

            class590 var8 = this.field4292;
            synchronized(this.field4292) {
               this.field4292.method4238(80, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field4300[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "([BIIIII)Z"
   )
   public static final boolean method2422(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field4291;
         boolean var7 = true;
         class594 var8 = new class594(arg0);
         int var9 = -1;

         int var10000;
         while(true) {
            int var10 = var8.method4272((byte)-71);
            if (~var10 != -1) {
               var9 += var10;
               int var11 = 0;
               var10000 = 0;
               if (var6) {
                  break;
               }

               boolean var12 = false;

               label85:
               do {
                  byte var10001;
                  while(true) {
                     if (!var12) {
                        int var13 = var8.method4338(false);
                        var10000 = ~var13;
                        var10001 = -1;
                        if (var6) {
                           break;
                        }

                        if (var10000 == -1) {
                           break label85;
                        }

                        var11 += var13 - 1;
                        int var14 = var11 & 63;
                        int var15 = (4073 & var11) >> 6;
                        int var16 = var8.method4288((byte)96) >> 2;
                        int var17 = arg3 + var15;
                        int var18 = arg2 + var14;
                        if (var17 <= 0 || var18 <= 0 || ~var17 <= ~(arg4 + -1) || ~var18 <= ~(arg1 + -1)) {
                           continue;
                        }

                        class774 var19 = class472.field6533.method3586(64, var9);
                        if (~var16 == -23 && ~class674.field9907.field8424.method3960((byte)-81) == -1 && ~var19.field11227 == -1 && var19.field11204 != 1 && !var19.field11184) {
                           continue label85;
                        }

                        var12 = true;
                        if (var19.method5549((byte)53)) {
                           continue;
                        }

                        var7 = false;
                        ++class12.field145;
                        if (!var6) {
                           continue;
                        }
                     }

                     int var20 = var8.method4338(false);
                     var10000 = ~var20;
                     var10001 = -1;
                     break;
                  }

                  if (var10000 == var10001) {
                     break;
                  }

                  var8.method4288((byte)91);
               } while(!var6);

               if (!var6) {
                  continue;
               }
            }

            var10000 = arg5;
            break;
         }

         if (var10000 != 27342) {
            field4295 = null;
         }

         return var7;
      } catch (RuntimeException var22) {
         throw class534.method3846(var22, field4300[5] + (arg0 != null ? field4300[1] : field4300[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method2423(int arg0, byte arg1) {
      try {
         class590 var3 = this.field4292;
         synchronized(this.field4292) {
            int var4 = 25 % ((arg1 - -51) / 59);
            this.field4292.method4234(2, arg0);
         }

         ++field4289;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4300[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2424(int arg0) {
      try {
         field4295 = null;
         if (arg0 <= 92) {
            method2424(64);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4300[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "<init>",
      descriptor = "(Lnc;ILqh;Lqh;)V"
   )
   public class322(class26 arg0, int arg1, class74 arg2, class74 arg3) {
      try {
         this.field4290 = arg2;
         this.field4294 = arg3;
         this.field4290.method727(3, -32767);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4300[2] + (arg0 != null ? field4300[1] : field4300[0]) + ',' + arg1 + ',' + (arg2 != null ? field4300[1] : field4300[0]) + ',' + (arg3 != null ? field4300[1] : field4300[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2425(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2426(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
