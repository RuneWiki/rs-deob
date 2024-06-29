import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class17 {
   @OriginalMember(
      owner = "client!tfa",
      name = "c",
      descriptor = "Llj;"
   )
   private class304 field228 = new class304(128);
   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "Llj;"
   )
   public class304 field234 = new class304(64);
   @OriginalMember(
      owner = "client!tfa",
      name = "f",
      descriptor = "Lrr;"
   )
   private class678 field225;
   @OriginalMember(
      owner = "client!tfa",
      name = "i",
      descriptor = "Lrr;"
   )
   public class678 field230;
   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field235 = new String[]{method138(method137("+%q1\u0007w")), method138(method137("+%q1\u0000w")), method138(method137("$m>1?")), method138(method137("16|s")), method138(method137("+%q1~6-yk|w")), method138(method137("+%q1\u0003w")), method138(method137("+%q1\u0004w")), method138(method137("+%q1\u0006w")), method138(method137("+%q1\u0001w")), method138(method137("+%q1\u0005w"))};
   @OriginalMember(
      owner = "client!tfa",
      name = "d",
      descriptor = "I"
   )
   public static int field229 = 0;
   @OriginalMember(
      owner = "client!tfa",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field223 = new int[2048];
   @OriginalMember(
      owner = "client!tfa",
      name = "g",
      descriptor = "I"
   )
   public static int field222;
   @OriginalMember(
      owner = "client!tfa",
      name = "h",
      descriptor = "I"
   )
   public static int field224;
   @OriginalMember(
      owner = "client!tfa",
      name = "k",
      descriptor = "I"
   )
   public static int field226;
   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "I"
   )
   public static int field227;
   @OriginalMember(
      owner = "client!tfa",
      name = "m",
      descriptor = "I"
   )
   public static int field231;
   @OriginalMember(
      owner = "client!tfa",
      name = "l",
      descriptor = "I"
   )
   public static int field232;
   @OriginalMember(
      owner = "client!tfa",
      name = "j",
      descriptor = "I"
   )
   public static int field233;

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(I)V",
      line = 13
   )
   public final void method130(int arg0) {
      try {
         ++field222;
         class304 var2 = this.field228;
         synchronized(this.field228) {
            this.field228.method2554(arg0 + -123);
         }

         class304 var3 = this.field234;
         synchronized(this.field234) {
            this.field234.method2554(-104);
            if (arg0 != 0) {
               this.method133(103, 122);
            }

         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field235[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(B)V",
      line = 29
   )
   public static void method131(byte arg0) {
      try {
         field223 = null;
         if (arg0 >= -4) {
            method134(-9, -14L);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field235[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(IB)V",
      line = 42
   )
   public final void method132(int arg0, byte arg1) {
      try {
         ++field224;
         if (arg1 != 9) {
            this.field225 = null;
         }

         class304 var3 = this.field228;
         synchronized(this.field228) {
            this.field228.method2552(arg0, arg1 + 21524);
         }

         class304 var4 = this.field234;
         synchronized(this.field234) {
            this.field234.method2552(arg0, 21533);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field235[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(II)Lvea;",
      line = 59
   )
   public final class77 method133(int arg0, int arg1) {
      try {
         ++field233;
         class304 var3 = this.field228;
         class77 var4;
         synchronized(this.field228) {
            var4 = (class77)this.field228.method2544(false, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field225;
            byte[] var6;
            synchronized(this.field225) {
               var6 = this.field225.method5017(arg1, arg0, (byte)71);
            }

            class77 var7 = new class77();
            var7.field990 = arg0;
            var7.field1000 = this;
            if (var6 != null) {
               var7.method731(new class354(var6), false);
            }

            var7.method724(1);
            class304 var8 = this.field228;
            synchronized(this.field228) {
               this.field228.method2545((long)arg0, 124, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field235[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(IJ)V",
      line = 88
   )
   public static final void method134(int arg0, long arg1) {
      try {
         if (arg0 == 36) {
            ++field227;
            class406.field6326.setTime(new Date(arg1));
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field235[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "(I)V",
      line = 107
   )
   public final void method135(int arg0) {
      try {
         class304 var2 = this.field228;
         synchronized(this.field228) {
            if (arg0 > -53) {
               this.field234 = null;
            }

            this.field228.method2551(true);
         }

         ++field231;
         class304 var3 = this.field234;
         synchronized(this.field234) {
            this.field234.method2551(true);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field235[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(III)V",
      line = 123
   )
   public final void method136(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 22865) {
            method131((byte)55);
         }

         ++field232;
         this.field228 = new class304(arg2);
         this.field234 = new class304(arg0);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field235[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "<init>",
      descriptor = "(Ltv;ILrr;Lrr;)V",
      line = 144
   )
   public class17(class311 arg0, int arg1, class678 arg2, class678 arg3) {
      try {
         this.field225 = arg2;
         this.field230 = arg3;
         this.field225.method4998((byte)-82, 36);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field235[4] + (arg0 != null ? field235[2] : field235[3]) + ',' + arg1 + ',' + (arg2 != null ? field235[2] : field235[3]) + ',' + (arg3 != null ? field235[2] : field235[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method137(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method138(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
