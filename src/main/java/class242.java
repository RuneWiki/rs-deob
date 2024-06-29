import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class242 {
   @OriginalMember(
      owner = "client!dr",
      name = "p",
      descriptor = "Lsb;"
   )
   private class261 field3710 = new class261();
   @OriginalMember(
      owner = "client!dr",
      name = "d",
      descriptor = "I"
   )
   private int field3717 = 0;
   @OriginalMember(
      owner = "client!dr",
      name = "b",
      descriptor = "Lcu;"
   )
   private class65 field3716 = new class65(1350);
   @OriginalMember(
      owner = "client!dr",
      name = "y",
      descriptor = "Llw;"
   )
   public class408 field3719 = new class408(15000);
   @OriginalMember(
      owner = "client!dr",
      name = "k",
      descriptor = "Z"
   )
   public boolean field3726 = false;
   @OriginalMember(
      owner = "client!dr",
      name = "r",
      descriptor = "I"
   )
   public int field3730 = 0;
   @OriginalMember(
      owner = "client!dr",
      name = "A",
      descriptor = "Z"
   )
   public boolean field3727 = true;
   @OriginalMember(
      owner = "client!dr",
      name = "f",
      descriptor = "I"
   )
   public int field3731 = 0;
   @OriginalMember(
      owner = "client!dr",
      name = "q",
      descriptor = "I"
   )
   public int field3721 = 0;
   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "Lhha;"
   )
   public class724 field3724 = null;
   @OriginalMember(
      owner = "client!dr",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3733 = new String[]{method2119(method2118("_\u000fDY/")), method2119(method2118("_\u000fDZ/")), method2119(method2118("_\u000fDX/")), method2119(method2118("_\u000fD^/")), method2119(method2118("_\u000fD]/")), method2119(method2118("_\u000fD_/")), method2119(method2118("U\b\u0006w")), method2119(method2118("_\u000fDS/")), method2119(method2118("@SD5z")), method2119(method2118("_\u000fD\\/"))};
   @OriginalMember(
      owner = "client!dr",
      name = "g",
      descriptor = "I"
   )
   public static int field3705;
   @OriginalMember(
      owner = "client!dr",
      name = "w",
      descriptor = "I"
   )
   public static int field3706;
   @OriginalMember(
      owner = "client!dr",
      name = "x",
      descriptor = "I"
   )
   public static int field3708;
   @OriginalMember(
      owner = "client!dr",
      name = "u",
      descriptor = "I"
   )
   public static int field3709;
   @OriginalMember(
      owner = "client!dr",
      name = "o",
      descriptor = "I"
   )
   public static int field3711;
   @OriginalMember(
      owner = "client!dr",
      name = "c",
      descriptor = "I"
   )
   public static int field3712;
   @OriginalMember(
      owner = "client!dr",
      name = "l",
      descriptor = "I"
   )
   public static int field3715;
   @OriginalMember(
      owner = "client!dr",
      name = "m",
      descriptor = "I"
   )
   private int field3723;
   @OriginalMember(
      owner = "client!dr",
      name = "B",
      descriptor = "I"
   )
   public int field3725;
   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "I"
   )
   public int field3729;
   @OriginalMember(
      owner = "client!dr",
      name = "h",
      descriptor = "I"
   )
   public int field3732;
   @OriginalMember(
      owner = "client!dr",
      name = "e",
      descriptor = "Luj;"
   )
   public class292 field3718;
   @OriginalMember(
      owner = "client!dr",
      name = "n",
      descriptor = "Lup;"
   )
   public class533 field3713;
   @OriginalMember(
      owner = "client!dr",
      name = "t",
      descriptor = "Lhha;"
   )
   public class724 field3720;
   @OriginalMember(
      owner = "client!dr",
      name = "s",
      descriptor = "Lhha;"
   )
   public class724 field3722;
   @OriginalMember(
      owner = "client!dr",
      name = "v",
      descriptor = "Lhha;"
   )
   public class724 field3728;
   @OriginalMember(
      owner = "client!dr",
      name = "i",
      descriptor = "Ldu;"
   )
   public class92 field3707;
   @OriginalMember(
      owner = "client!dr",
      name = "j",
      descriptor = "[Lma;"
   )
   public static class148[] field3714;

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2110(byte arg0) {
      try {
         ++field3712;
         this.field3710.method2237(95);
         if (arg0 <= 40) {
            this.field3721 = -103;
         }

         this.field3717 = 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3733[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(ILrb;)V"
   )
   public final void method2111(int arg0, class381 arg1) {
      try {
         if (arg0 != 14024) {
            method2113((byte)-49, -36, 2);
         }

         ++field3706;
         this.field3710.method2238(arg1, 13);
         arg1.field5563 = arg1.field5570.field945;
         this.field3717 += arg1.field5563;
         arg1.field5570.field945 = 0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3733[7] + arg0 + ',' + (arg1 != null ? field3733[8] : field3733[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method2112(byte arg0) {
      try {
         field3714 = null;
         if (arg0 <= 80) {
            field3714 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3733[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method2113(byte arg0, int arg1, int arg2) {
      try {
         ++field3711;
         if (arg0 != -8) {
            method2112((byte)-88);
         }

         return class51.method553(false, arg2, arg1) | (262144 & arg2) != 0 || class266.method2276(arg2, arg1, arg0 ^ 32);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3733[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2114(int arg0) {
      try {
         if (arg0 != 0) {
            method2112((byte)95);
         }

         if (this.field3713 != null) {
            this.field3713.method2554(false);
            this.field3713 = null;
         }

         ++field3705;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3733[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2115(byte arg0) throws IOException {
      boolean var2 = client.field10022;

      try {
         ++field3709;
         if (arg0 == 0) {
            if (this.field3713 != null && this.field3717 > 0) {
               this.field3716.field945 = 0;

               while(true) {
                  class381 var3 = (class381)this.field3710.method2245((byte)-94);
                  if (var3 != null) {
                     if (var2) {
                        break;
                     }

                     if (~var3.field5563 >= ~(this.field3716.field942.length + -this.field3716.field945)) {
                        this.field3716.method694(0, var3.field5563, var3.field5570.field942, -7033);
                        this.field3717 -= var3.field5563;
                        var3.method2140((byte)62);
                        var3.field5570.method667(-3);
                        var3.method2973(52);
                        if (!var2) {
                           continue;
                        }
                     }
                  }

                  this.field3713.method2553(this.field3716.field945, 0, 0, this.field3716.field942);
                  this.field3723 += this.field3716.field945;
                  this.field3731 = 0;
                  break;
               }

            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3733[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2116(int arg0) {
      try {
         ++field3708;
         class199.method1745(972958544);
         class384.method2996(class476.field6870.field9116.method3270(-76) == 1, 22050, true, 2);
         class375.field5484 = class141.method1410(class720.field10318, 2, class729.field10389, 0, 22050);
         if (arg0 != 14885) {
            method2116(72);
         }

         class790.method5702((byte)96, true, class135.method1376(105, (class119)null));
         class486.field6943 = class141.method1410(class720.field10318, arg0 ^ 14887, class729.field10389, 1, 2048);
         class486.field6943.method5670(256, class129.field2068);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3733[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2117(int arg0) {
      try {
         if (~(class51.field770 % 50) == -1) {
            this.field3732 = this.field3723;
            this.field3725 = this.field3729;
            this.field3723 = 0;
            this.field3729 = 0;
         }

         if (arg0 >= -35) {
            this.method2114(112);
         }

         ++field3715;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3733[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2118(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2119(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
