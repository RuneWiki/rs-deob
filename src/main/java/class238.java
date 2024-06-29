import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class238 {
   @OriginalMember(
      owner = "client!oja",
      name = "i",
      descriptor = "Llj;"
   )
   private class304 field3616 = new class304(16);
   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "Lrr;"
   )
   private class678 field3615;
   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3623 = new String[]{method2036(method2035("lmK\u0011W+")), method2036(method2035("lmK\u0011U+")), method2036(method2035("lmK\u0011.jiCK,+")), method2036(method2035("x)\u0004\u0011o")), method2036(method2035("mrFS")), method2036(method2035("lmK\u0011S+")), method2036(method2035("lmK\u0011V+")), method2036(method2035("lmK\u0011P+")), method2036(method2035("lmK\u0011Q+")), method2036(method2035("lmK\u0011T+"))};
   @OriginalMember(
      owner = "client!oja",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field3610 = new class498(37, 4);
   @OriginalMember(
      owner = "client!oja",
      name = "g",
      descriptor = "I"
   )
   public static int field3619 = 0;
   @OriginalMember(
      owner = "client!oja",
      name = "h",
      descriptor = "Ljava/util/Random;"
   )
   public static Random field3621 = new Random();
   @OriginalMember(
      owner = "client!oja",
      name = "l",
      descriptor = "D"
   )
   public static double field3622;
   @OriginalMember(
      owner = "client!oja",
      name = "k",
      descriptor = "I"
   )
   public static int field3611;
   @OriginalMember(
      owner = "client!oja",
      name = "j",
      descriptor = "I"
   )
   public static int field3612;
   @OriginalMember(
      owner = "client!oja",
      name = "d",
      descriptor = "I"
   )
   public static int field3613;
   @OriginalMember(
      owner = "client!oja",
      name = "m",
      descriptor = "I"
   )
   public static int field3614;
   @OriginalMember(
      owner = "client!oja",
      name = "e",
      descriptor = "I"
   )
   public static int field3617;
   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "I"
   )
   public static int field3618;
   @OriginalMember(
      owner = "client!oja",
      name = "f",
      descriptor = "[Lrm;"
   )
   public static class533[] field3620;

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(IB)V",
      line = 10
   )
   public final void method2028(int arg0, byte arg1) {
      try {
         class304 var3 = this.field3616;
         synchronized(this.field3616) {
            this.field3616.method2552(arg0, 21533);
         }

         ++field3612;
         if (arg1 != 6) {
            this.field3615 = null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3623[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(IB)Lkv;",
      line = 23
   )
   public final class801 method2029(int arg0, byte arg1) {
      try {
         ++field3617;
         class304 var3 = this.field3616;
         class801 var4;
         synchronized(this.field3616) {
            var4 = (class801)this.field3616.method2544(false, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field3615;
            byte[] var6;
            synchronized(this.field3615) {
               var6 = this.field3615.method5017(30, arg0, (byte)71);
               if (arg1 != -42) {
                  this.method2034((byte)-104);
               }
            }

            class801 var7 = new class801();
            if (var6 != null) {
               var7.method5770(-1, new class354(var6));
            }

            class304 var8 = this.field3616;
            synchronized(this.field3616) {
               this.field3616.method2545((long)arg0, arg1 + 168, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field3623[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "c",
      descriptor = "(Z)V",
      line = 54
   )
   public static void method2030(boolean arg0) {
      try {
         field3610 = null;
         field3620 = null;
         field3621 = null;
         if (!arg0) {
            method2030(true);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3623[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(III)Z",
      line = 66
   )
   public static final boolean method2031(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 11760) {
            method2032(true);
         }

         ++field3613;
         return (540800 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3623[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(Z)V",
      line = 77
   )
   public static final void method2032(boolean arg0) {
      try {
         ++field3614;
         class687.field10213.method299(-17, 1, class687.field10213.field546);
         class687.field10213.method299(-17, 1, class687.field10213.field536);
         class687.field10213.method299(-17, 2, class687.field10213.field516);
         class687.field10213.method299(-17, 2, class687.field10213.field501);
         class687.field10213.method299(-17, 1, class687.field10213.field534);
         class687.field10213.method299(-17, 1, class687.field10213.field529);
         class687.field10213.method299(-17, 1, class687.field10213.field497);
         class687.field10213.method299(-17, 1, class687.field10213.field519);
         class687.field10213.method299(-17, 1, class687.field10213.field528);
         class687.field10213.method299(-17, 1, class687.field10213.field547);
         class687.field10213.method299(-17, 2, class687.field10213.field498);
         class687.field10213.method299(-17, 1, class687.field10213.field513);
         class687.field10213.method299(-17, 2, class687.field10213.field525);
         class687.field10213.method299(-17, 1, class687.field10213.field495);
         class687.field10213.method299(-17, 0, class687.field10213.field496);
         class687.field10213.method299(-17, 0, class687.field10213.field533);
         class687.field10213.method299(-17, 2, class687.field10213.field503);
         class687.field10213.method299(-17, 0, class687.field10213.field527);
         class687.field10213.method299(-17, 0, class687.field10213.field535);
         class687.field10213.method299(-17, 1, class687.field10213.field515);
         class176.method1609(-105);
         class687.field10213.method299(-17, 0, class687.field10213.field530);
         class687.field10213.method299(-17, 4, class687.field10213.field531);
         class698.method5133(-118);
         class410.method3287(arg0);
         class741.field11026 = true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3623[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(Z)V",
      line = 117
   )
   public final void method2033(boolean arg0) {
      try {
         if (arg0) {
            this.method2033(true);
         }

         class304 var2 = this.field3616;
         synchronized(this.field3616) {
            this.field3616.method2554(-117);
         }

         ++field3618;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3623[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(B)V",
      line = 131
   )
   public final void method2034(byte arg0) {
      try {
         ++field3611;
         class304 var2 = this.field3616;
         synchronized(this.field3616) {
            this.field3616.method2551(true);
         }

         int var3 = 16 % ((arg0 - 11) / 45);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3623[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 158
   )
   public class238(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field3615 = arg2;
         this.field3615.method4998((byte)-82, 30);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3623[2] + (arg0 != null ? field3623[3] : field3623[4]) + ',' + arg1 + ',' + (arg2 != null ? field3623[3] : field3623[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2035(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2036(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
