import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class296 {
   @OriginalMember(
      owner = "client!sd",
      name = "d",
      descriptor = "Lww;"
   )
   private class339 field4142;
   @OriginalMember(
      owner = "client!sd",
      name = "f",
      descriptor = "I"
   )
   private int field4140;
   @OriginalMember(
      owner = "client!sd",
      name = "c",
      descriptor = "[Z"
   )
   private boolean[] field4143;
   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "[[I"
   )
   private int[][] field4139;
   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4145 = new String[]{method2392(method2391("fH)\u0013n")), method2392(method2391("fH)\u0017n")), method2392(method2391("n\u0002)x;")), method2392(method2391("fH)j/{Eshn")), method2392(method2391("{Yk:")), method2392(method2391("fH)\u0014n")), method2392(method2391("fH)\u0012n")), method2392(method2391("fH)\u0015n"))};
   @OriginalMember(
      owner = "client!sd",
      name = "h",
      descriptor = "Laka;"
   )
   public static class418 field4144 = new class418(26, -1);
   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "I"
   )
   public static int field4136;
   @OriginalMember(
      owner = "client!sd",
      name = "g",
      descriptor = "I"
   )
   public static int field4137;
   @OriginalMember(
      owner = "client!sd",
      name = "e",
      descriptor = "I"
   )
   public static int field4138;
   @OriginalMember(
      owner = "client!sd",
      name = "i",
      descriptor = "I"
   )
   public static int field4141;

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2386(int arg0, int arg1, int arg2) {
      try {
         ++field4141;
         int var3 = 7 / ((arg2 - -20) / 45);
         return class627.method4635((byte)-81, arg1, arg0) & class123.method1073(arg0, (byte)-128, arg1);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4145[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(II)Lwt;"
   )
   public final class523 method2387(int arg0, int arg1) {
      try {
         ++field4138;
         byte[] var3 = this.field4142.method2697(arg1, arg0, false);
         class523 var4 = new class523();
         var4.method3917(new class66(var3), (byte)-122);
         return var4;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4145[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2388(int arg0) {
      try {
         if (arg0 > 121) {
            field4144 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4145[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method2389(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field4136;
         if (~arg1 <= -1 && ~this.field4139.length < ~arg1) {
            if (this.field4143[arg1] && ~this.field4139[arg1].length < -2) {
               int var4 = this.field4140 == -1 ? 0 : 1;
               Random var5 = new Random();
               int[] var6 = new int[this.field4139[arg1].length];
               class349.method2759(this.field4139[arg1], 0, var6, arg0, var6.length);
               int var7 = var4;
               if (!var3 && ~var6.length >= ~var4) {
                  return var6;
               } else {
                  do {
                     int var8 = class145.method1178(5733, var6.length + -var4, var5) - -var4;
                     int var9 = var6[var7];
                     var6[var7] = var6[var8];
                     var6[var8] = var9;
                     ++var7;
                  } while(~var6.length < ~var7);

                  return var6;
               }
            } else {
               return this.field4139[arg1];
            }
         } else {
            return this.field4140 == -1 ? new int[0] : new int[]{this.field4140};
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field4145[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method2390(int arg0) {
      try {
         ++field4137;
         if (arg0 != 0) {
            this.method2387(-101, 50);
         }

         return ~this.field4140 != 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4145[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class296(class500 param1, int param2, class339 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2391(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2392(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
