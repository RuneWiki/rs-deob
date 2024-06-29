import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class358 {
   @OriginalMember(
      owner = "client!ng",
      name = "c",
      descriptor = "I"
   )
   public int field5355 = 128;
   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "I"
   )
   public int field5363 = 128;
   @OriginalMember(
      owner = "client!ng",
      name = "h",
      descriptor = "I"
   )
   public int field5359;
   @OriginalMember(
      owner = "client!ng",
      name = "l",
      descriptor = "I"
   )
   public int field5354;
   @OriginalMember(
      owner = "client!ng",
      name = "d",
      descriptor = "I"
   )
   public int field5356;
   @OriginalMember(
      owner = "client!ng",
      name = "k",
      descriptor = "I"
   )
   public int field5353;
   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5364 = new String[]{method2819(method2818("0\u0016{Jm")), method2819(method2818("%_{'8")), method2819(method2818("%M9\b")), method2819(method2818("%_{!8")), method2819(method2818("%_{Xy%Q!Z8")), method2819(method2818("%_{ 8")), method2819(method2818("%_{%8")), method2819(method2818("%_{\"8"))};
   @OriginalMember(
      owner = "client!ng",
      name = "n",
      descriptor = "F"
   )
   public static float field5350 = 1.0F;
   @OriginalMember(
      owner = "client!ng",
      name = "m",
      descriptor = "Liw;"
   )
   public static class332 field5361 = new class332();
   @OriginalMember(
      owner = "client!ng",
      name = "i",
      descriptor = "I"
   )
   public static int field5351;
   @OriginalMember(
      owner = "client!ng",
      name = "e",
      descriptor = "I"
   )
   public static int field5352;
   @OriginalMember(
      owner = "client!ng",
      name = "j",
      descriptor = "I"
   )
   public static int field5357;
   @OriginalMember(
      owner = "client!ng",
      name = "b",
      descriptor = "I"
   )
   public static int field5358;
   @OriginalMember(
      owner = "client!ng",
      name = "f",
      descriptor = "I"
   )
   public static int field5360;
   @OriginalMember(
      owner = "client!ng",
      name = "g",
      descriptor = "Lgha;"
   )
   public static class363 field5362;

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method2812(byte arg0) {
      try {
         if (arg0 < 101) {
            method2812((byte)64);
         }

         field5361 = null;
         field5362 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5364[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "()V",
      line = 18
   )
   public static final void method2813() {
      for(int var0 = 0; var0 < class103.field1682; ++var0) {
         class144 var1 = class649.field9413[var0];
         class62.method675(var1, true);
         class649.field9413[var0] = null;
      }

      class103.field1682 = 0;
   }

   @OriginalMember(
      owner = "client!ng",
      name = "b",
      descriptor = "(B)V",
      line = 33
   )
   public static final void method2814(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(Lng;B)V",
      line = 935
   )
   public final void method2815(class358 arg0, byte arg1) {
      try {
         if (arg1 < -124) {
            ++field5358;
            this.field5353 = arg0.field5353;
            this.field5354 = arg0.field5354;
            this.field5359 = arg0.field5359;
            this.field5363 = arg0.field5363;
            this.field5355 = arg0.field5355;
            this.field5356 = arg0.field5356;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5364[1] + (arg0 != null ? field5364[0] : field5364[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "<init>",
      descriptor = "(I)V",
      line = 996
   )
   public class358(int arg0) {
      try {
         this.field5359 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5364[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 1003
   )
   private class358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field5354 = arg5;
         this.field5356 = arg4;
         this.field5353 = arg3;
         this.field5363 = arg1;
         this.field5359 = arg0;
         this.field5355 = arg2;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5364[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(II)Lhm;",
      line = 955
   )
   public static final class230 method2816(int arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field5351;
         class230[] var3 = class289.method2244((byte)-63);
         int var4 = arg1;
         if (var2) {
            if (~var3[arg1].field3379 == ~arg0) {
               return var3[arg1];
            }

            var4 = arg1 + 1;
         }

         while(true) {
            while(~var3.length < ~var4) {
               if (~var3[var4].field3379 == ~arg0) {
                  return var3[var4];
               }

               ++var4;
            }

            if (!var2) {
               return null;
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5364[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(I)Lng;",
      line = 977
   )
   public final class358 method2817(int arg0) {
      try {
         ++field5360;
         if (arg0 > -7) {
            this.field5353 = -34;
         }

         return new class358(this.field5359, this.field5363, this.field5355, this.field5353, this.field5356, this.field5354);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5364[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2818(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2819(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
