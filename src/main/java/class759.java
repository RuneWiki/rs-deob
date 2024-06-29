import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class759 {
   @OriginalMember(
      owner = "client!ro",
      name = "k",
      descriptor = "Liw;"
   )
   private class107 field10841 = new class107(64);
   @OriginalMember(
      owner = "client!ro",
      name = "n",
      descriptor = "I"
   )
   public int field10848 = 0;
   @OriginalMember(
      owner = "client!ro",
      name = "j",
      descriptor = "Lsa;"
   )
   private class39 field10835;
   @OriginalMember(
      owner = "client!ro",
      name = "e",
      descriptor = "I"
   )
   public int field10843;
   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10849 = new String[]{method5485(method5484("W}o\f}")), method5485(method5484("W}o\t}")), method5485(method5484("W}o\u000f}")), method5485(method5484("W}o\u000b}")), method5485(method5484("^<of(")), method5485(method5484("Kg-$")), method5485(method5484("W}ot<K{5v}")), method5485(method5484("W}o\r}")), method5485(method5484("W}o\n}")), method5485(method5484("W}o\u000e}"))};
   @OriginalMember(
      owner = "client!ro",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field10839 = new int[6];
   @OriginalMember(
      owner = "client!ro",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field10846 = false;
   @OriginalMember(
      owner = "client!ro",
      name = "l",
      descriptor = "I"
   )
   public static int field10836;
   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "I"
   )
   public static int field10837;
   @OriginalMember(
      owner = "client!ro",
      name = "h",
      descriptor = "I"
   )
   public static int field10838;
   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "I"
   )
   public static int field10840;
   @OriginalMember(
      owner = "client!ro",
      name = "c",
      descriptor = "I"
   )
   public static int field10842;
   @OriginalMember(
      owner = "client!ro",
      name = "d",
      descriptor = "I"
   )
   public static int field10845;
   @OriginalMember(
      owner = "client!ro",
      name = "g",
      descriptor = "I"
   )
   public static int field10847;
   @OriginalMember(
      owner = "client!ro",
      name = "m",
      descriptor = "Ld;"
   )
   public static class672 field10844;

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5477(int arg0) {
      try {
         field10844 = null;
         field10839 = null;
         if (arg0 != -20009) {
            field10846 = false;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10849[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method5478(boolean arg0) {
      try {
         ++field10847;
         class107 var2 = this.field10841;
         synchronized(this.field10841) {
            this.field10841.method1045(3);
         }

         if (arg0) {
            this.method5478(true);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10849[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(IB)Lai;"
   )
   public final class376 method5479(int arg0, byte arg1) {
      try {
         ++field10840;
         class107 var3 = this.field10841;
         class376 var4;
         synchronized(this.field10841) {
            var4 = (class376)this.field10841.method1041((long)arg0, arg1 + 20);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field10835;
            byte[] var6;
            synchronized(this.field10835) {
               var6 = this.field10835.method460((byte)-11, arg0, 4);
            }

            class376 var7 = new class376();
            var7.field5499 = arg0;
            var7.field5505 = this;
            if (arg1 != -12) {
               this.field10848 = -56;
            }

            if (var6 != null) {
               var7.method2935(new class65(var6), 116);
            }

            var7.method2936(-18299);
            class107 var8 = this.field10841;
            synchronized(this.field10841) {
               this.field10841.method1050(arg1 + -53, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field10849[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5480(int arg0) {
      try {
         class130.field2085.method4652(-23729);
         ++field10842;
         if (arg0 == 3030) {
            class387.field5645.method1557((byte)-26);
            class183.field2683.method506(false);
            class729.field10389.setBackground(Color.black);
            class58.field838 = -1;
            class130.field2085 = class57.method589(class729.field10389, (byte)114);
            class387.field5645 = class19.method268(-75, class729.field10389, true);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10849[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5481(int arg0, int arg1, int arg2) {
      try {
         ++field10845;
         if (arg1 != 0) {
            return false;
         } else {
            return (arg0 & 458752) != 0 | class237.method2091(arg2, arg0, -19540) || class190.method1688(arg1 + 22296, arg2, arg0);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10849[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5482(int arg0, int arg1) {
      try {
         if (arg0 <= -119) {
            ++field10838;
            class107 var3 = this.field10841;
            synchronized(this.field10841) {
               this.field10841.method1048(arg1, -8543);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10849[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5483(int arg0) {
      try {
         if (arg0 == 64) {
            ++field10837;
            class107 var2 = this.field10841;
            synchronized(this.field10841) {
               this.field10841.method1052(true);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10849[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class759(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field10835 = arg2;
         this.field10843 = this.field10835.method434((byte)-106, 4);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10849[6] + (arg0 != null ? field10849[4] : field10849[5]) + ',' + arg1 + ',' + (arg2 != null ? field10849[4] : field10849[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5484(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5485(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
