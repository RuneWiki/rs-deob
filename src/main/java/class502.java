import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public abstract class class502 {
   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7169 = new String[]{method3797(method3796("U!{*r")), method3797(method3796("@z9h")), method3797(method3796("Ih4*Ml'"))};
   @OriginalMember(
      owner = "client!gga",
      name = "c",
      descriptor = "I"
   )
   public static int field7166;
   @OriginalMember(
      owner = "client!gga",
      name = "b",
      descriptor = "I"
   )
   public static int field7167;
   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "I"
   )
   public static int field7168;

   @OriginalMember(
      owner = "client!gga",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method324(int arg0);

   @OriginalMember(
      owner = "client!gga",
      name = "b",
      descriptor = "(III)V"
   )
   public abstract void method327(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!gga",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method337(int arg0);

   @OriginalMember(
      owner = "client!gga",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method329(int arg0);

   @OriginalMember(
      owner = "client!gga",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method326(int arg0);

   @OriginalMember(
      owner = "client!gga",
      name = "b",
      descriptor = "()V"
   )
   public abstract void method335();

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(III[I)V"
   )
   public abstract void method332(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method333(int arg0);

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "()Lgga;"
   )
   public abstract class502 method338();

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method336(int[] arg0);

   @OriginalMember(
      owner = "client!gga",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method331(int arg0);

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(Lgga;)V"
   )
   public abstract void method323(class502 arg0);

   @OriginalMember(
      owner = "client!gga",
      name = "c",
      descriptor = "(III[I)V"
   )
   public abstract void method334(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method322(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!gga",
      name = "b",
      descriptor = "(III[I)V"
   )
   public abstract void method330(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "([IIIB[I)V"
   )
   public static final void method3795(int[] arg0, int arg1, int arg2, byte arg3, int[] arg4) {
      boolean var5 = client.field10022;

      try {
         if (arg1 < arg2) {
            int var6 = (arg1 - -arg2) / 2;
            int var7 = arg1;
            int var8 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var8;
            int var9 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var9;
            int var10 = ~var8 != Integer.MIN_VALUE ? 1 : 0;
            int var11 = arg1;
            int var12;
            int var13;
            if (var5) {
               if (~(var8 - -(var10 & arg1)) < ~arg0[arg1]) {
                  var12 = arg0[arg1];
                  arg0[arg1] = arg0[arg1];
                  arg0[arg1] = var12;
                  var13 = arg4[arg1];
                  arg4[arg1] = arg4[arg1];
                  var7 = arg1 + 1;
                  arg4[arg1] = var13;
                  var11 = arg1 + 1;
               } else {
                  var11 = arg1 + 1;
               }
            }

            while(true) {
               while(arg2 > var11) {
                  if (~(var8 - -(var10 & var11)) < ~arg0[var11]) {
                     var12 = arg0[var11];
                     arg0[var11] = arg0[var7];
                     arg0[var7] = var12;
                     var13 = arg4[var11];
                     arg4[var11] = arg4[var7];
                     arg4[var7++] = var13;
                     ++var11;
                  } else {
                     ++var11;
                  }
               }

               arg0[arg2] = arg0[var7];
               arg0[var7] = var8;
               arg4[arg2] = arg4[var7];
               arg4[var7] = var9;
               method3795(arg0, arg1, var7 + -1, (byte)-27, arg4);
               int var10001 = var7 + 1;
               if (!var5) {
                  method3795(arg0, var10001, arg2, (byte)-80, arg4);
                  break;
               }

               var12 = arg0[var10001];
               arg0[var11] = arg0[var7];
               arg0[var7] = var12;
               var13 = arg4[var11];
               arg4[var11] = arg4[var7];
               arg4[var7++] = var13;
               ++var11;
            }
         }

         if (arg3 >= -22) {
            method3795((int[])null, -81, 98, (byte)-37, (int[])null);
         }

         ++field7167;
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field7169[2] + (arg0 != null ? field7169[0] : field7169[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7169[0] : field7169[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3796(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3797(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
