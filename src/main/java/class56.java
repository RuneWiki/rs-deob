import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class56 {
   @OriginalMember(
      owner = "client!am",
      name = "e",
      descriptor = "J"
   )
   public long field808;
   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "I"
   )
   public int field804;
   @OriginalMember(
      owner = "client!am",
      name = "d",
      descriptor = "I"
   )
   public int field807;
   @OriginalMember(
      owner = "client!am",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field810;
   @OriginalMember(
      owner = "client!am",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field806;
   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field812 = new String[]{method587(method586("k /\u0012k")), method587(method586("d8m?")), method587(method586("qc/}>")), method587(method586("k /o*d$umk"))};
   @OriginalMember(
      owner = "client!am",
      name = "b",
      descriptor = "I"
   )
   public static int field805 = -1;
   @OriginalMember(
      owner = "client!am",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field809 = false;
   @OriginalMember(
      owner = "client!am",
      name = "f",
      descriptor = "I"
   )
   public static int field811;

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(I[BIIBI)V"
   )
   public static final void method585(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         int var7 = -101 / ((-78 - arg4) / 42);
         ++field811;
         if (~arg2 < ~arg3) {
            arg0 = -arg3 + arg2 >> 2;
            arg5 += arg3;
            int var10;
            if (var6) {
               var10 = arg5 + 1;
               arg1[arg5] = 1;
               int var11 = var10 + 1;
               arg1[var10] = 1;
               int var12 = var11 + 1;
               arg1[var11] = 1;
               arg5 = var12 + 1;
               arg1[var12] = 1;
            }

            while(true) {
               while(true) {
                  --arg0;
                  if (arg0 < 0) {
                     arg0 = -arg3 + arg2 & 3;
                     if (!var6) {
                        if (var6) {
                           arg1[arg5++] = 1;
                        }

                        while(true) {
                           --arg0;
                           if (~arg0 > -1) {
                              return;
                           }

                           arg1[arg5++] = 1;
                        }
                     }

                     arg1[arg5++] = 1;
                  } else {
                     var10 = arg5 + 1;
                     arg1[arg5] = 1;
                     arg1[var10++] = 1;
                     arg1[var10++] = 1;
                     arg5 = var10 + 1;
                     arg1[var10] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field812[0] + arg0 + ',' + (arg1 != null ? field812[2] : field812[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "<init>",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V"
   )
   public class56(int arg0, String arg1, int arg2, String arg3, long arg4) {
      try {
         this.field808 = arg4;
         this.field804 = arg0;
         this.field807 = arg2;
         this.field810 = arg3;
         this.field806 = arg1;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field812[3] + arg0 + ',' + (arg1 != null ? field812[2] : field812[1]) + ',' + arg2 + ',' + (arg3 != null ? field812[2] : field812[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method586(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method587(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
