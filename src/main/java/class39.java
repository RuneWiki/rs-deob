import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class39 {
   @OriginalMember(
      owner = "client!ud",
      name = "h",
      descriptor = "Lrk;"
   )
   private class35 field933;
   @OriginalMember(
      owner = "client!ud",
      name = "d",
      descriptor = "J"
   )
   public long field935;
   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field939 = new String[]{method477(method476("v=>9")), method477(method476("cf|{\u0012")), method477(method476("m,|i\u0006v!&kG")), method477(method476("m,|\u0017G")), method477(method476("w87;\u0005k")), method477(method476("m,|\u0014G")), method477(method476("m,|\u0016G")), method477(method476("m,|3\u0006v)><\u0015}`"))};
   @OriginalMember(
      owner = "client!ud",
      name = "j",
      descriptor = "I"
   )
   public static int field928 = -1;
   @OriginalMember(
      owner = "client!ud",
      name = "k",
      descriptor = "I"
   )
   public static int field929;
   @OriginalMember(
      owner = "client!ud",
      name = "e",
      descriptor = "I"
   )
   public static int field930;
   @OriginalMember(
      owner = "client!ud",
      name = "b",
      descriptor = "I"
   )
   public static int field931;
   @OriginalMember(
      owner = "client!ud",
      name = "i",
      descriptor = "I"
   )
   public static int field932;
   @OriginalMember(
      owner = "client!ud",
      name = "f",
      descriptor = "I"
   )
   public static int field938;
   @OriginalMember(
      owner = "client!ud",
      name = "g",
      descriptor = "Lwq;"
   )
   public static class176 field934;
   @OriginalMember(
      owner = "client!ud",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field936;
   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "[Z"
   )
   public static boolean[] field937;

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method473(int arg0) {
      try {
         field934 = null;
         int var1 = -105 % ((arg0 - 24) / 37);
         field937 = null;
         field936 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field939[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "finalize",
      descriptor = "()V",
      line = 15
   )
   protected final void finalize() throws Throwable {
      try {
         this.field933.method324(this.field935, false);
         ++field929;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field939[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(IIII[B[BIII)V",
      line = 31
   )
   public static final void method474(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field4564;

      try {
         ++field930;
         int var10 = -(arg2 >> 2);
         int var16 = -(arg2 & arg7);
         int var11 = -arg1;
         if (var9 || ~var11 > -1) {
            label84:
            do {
               int var12 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg3++;
                  arg5[var10001] = (byte)(arg5[var10001] + -arg4[arg0++]);
                  int var17 = arg3++;
                  arg5[var17] = (byte)(arg5[var17] + -arg4[arg0++]);
                  int var18 = arg3++;
                  arg5[var18] = (byte)(arg5[var18] + -arg4[arg0++]);
                  int var19 = arg3++;
                  arg5[var19] = (byte)(arg5[var19] + -arg4[arg0++]);
                  var12 = var10 + 1;
               }

               while(true) {
                  while(~var12 > -1) {
                     var10001 = arg3++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg4[arg0++]);
                     var10001 = arg3++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg4[arg0++]);
                     var10001 = arg3++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg4[arg0++]);
                     var10001 = arg3++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg4[arg0++]);
                     ++var12;
                  }

                  int var13 = var16;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg3++;
                        arg5[var10001] = (byte)(arg5[var10001] + -arg4[arg0++]);
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(~var13 > -1) {
                           var10001 = arg3++;
                           arg5[var10001] = (byte)(arg5[var10001] + -arg4[arg0++]);
                           ++var13;
                        }

                        arg3 += arg8;
                        arg0 += arg6;
                        if (!var9) {
                           ++var11;
                           continue label84;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            } while(~var11 > -1);

         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field939[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field939[1] : field939[0]) + ',' + (arg5 != null ? field939[1] : field939[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(Loo;ILjava/lang/String;I)Leca;",
      line = 72
   )
   public static final class789 method475(class651 arg0, int arg1, String arg2, int arg3) {
      try {
         ++field932;
         if (arg1 != 9226) {
            field928 = -72;
         }

         return class397.method3061(arg2, field939[4], arg3, arg0, -1);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field939[5] + (arg0 != null ? field939[1] : field939[0]) + ',' + arg1 + ',' + (arg2 != null ? field939[1] : field939[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "<init>",
      descriptor = "(Lrk;J[Ltu;)V",
      line = 91
   )
   public class39(class35 arg0, long arg1, class366[] arg2) {
      try {
         this.field933 = arg0;
         this.field935 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field939[2] + (arg0 != null ? field939[1] : field939[0]) + ',' + arg1 + ',' + (arg2 != null ? field939[1] : field939[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method476(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method477(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
