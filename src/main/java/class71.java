import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class71 {
   @OriginalMember(
      owner = "client!rga",
      name = "b",
      descriptor = "B"
   )
   public byte field953;
   @OriginalMember(
      owner = "client!rga",
      name = "c",
      descriptor = "S"
   )
   public short field951;
   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "B"
   )
   public byte field949;
   @OriginalMember(
      owner = "client!rga",
      name = "d",
      descriptor = "Llp;"
   )
   public class83 field952;
   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field954 = new String[]{method703(method702("E\u0016&G,")), method703(method702("PMd\u0005")), method703(method702("L_iG\u0013\u0016")), method703(method702("L_iGmWVa\u001do\u0016"))};
   @OriginalMember(
      owner = "client!rga",
      name = "e",
      descriptor = "I"
   )
   public static int field950;

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(Ljava/lang/String;I)[B"
   )
   public static final byte[] method700(String arg0, int arg1) {
      try {
         ++field950;
         int var2 = arg0.length();
         if (var2 == 0) {
            return new byte[0];
         } else {
            int var4;
            label35: {
               int var3 = -4 & var2 - -3;
               var4 = var3 / 4 * 3;
               if (arg1 + var3 < var2 && class376.method2968(arg0.charAt(var3 + -2), -1) != -1) {
                  if (~var2 < ~(var3 + -1) && ~class376.method2968(arg0.charAt(var3 - 1), arg1 ^ 1) != 0) {
                     break label35;
                  }

                  --var4;
                  if (!client.field1481) {
                     break label35;
                  }
               }

               var4 -= 2;
            }

            byte[] var5 = new byte[var4];
            class778.method5620(var5, 0, -4403, arg0);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field954[2] + (arg0 != null ? field954[0] : field954[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(Lr;III[Z)V"
   )
   public static final void method701(class114 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      if (class659.field9815 != class569.field8364) {
         int var5 = class373.field5223[arg1].method3288(arg2, (byte)121, arg3);

         for(int var6 = 0; var6 <= arg1; ++var6) {
            if (arg4 == null || arg4[var6]) {
               class423 var7 = class373.field5223[var6];
               if (var7 != null) {
                  var7.method950(arg0, arg2, var5 - var7.method3288(arg2, (byte)121, arg3), arg3, 0, false);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!rga",
      name = "<init>",
      descriptor = "(Llp;III)V"
   )
   public class71(class83 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field953 = (byte)arg3;
         this.field951 = (short)arg1;
         this.field949 = (byte)arg2;
         this.field952 = arg0;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field954[3] + (arg0 != null ? field954[0] : field954[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method702(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method703(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
