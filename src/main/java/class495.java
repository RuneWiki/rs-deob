import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class495 {
   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7066 = new String[]{method3760(method3759("b4/\u0003")), method3760(method3759("E/5\u000e1e%c(\u0007E\u0011c\u00078m%&\u001d|")), method3760(method3759("womA ")), method3760(method3759("E/5\u000e1e%c(\u0007E\u0011c\f2a11\n.\u007f$'O9m5\"N")), method3760(method3759("y5m.u")), method3760(method3759("y5m*u")), method3760(method3759("y5m,u")), method3760(method3759("y5m-u")), method3760(method3759("y5m+u"))};
   @OriginalMember(
      owner = "client!ut",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field7059 = new int[5];
   @OriginalMember(
      owner = "client!ut",
      name = "h",
      descriptor = "I"
   )
   public static int field7060 = -1;
   @OriginalMember(
      owner = "client!ut",
      name = "b",
      descriptor = "I"
   )
   public static int field7065 = 0;
   @OriginalMember(
      owner = "client!ut",
      name = "j",
      descriptor = "I"
   )
   public static int field7056;
   @OriginalMember(
      owner = "client!ut",
      name = "e",
      descriptor = "I"
   )
   public static int field7058;
   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "I"
   )
   public static int field7061;
   @OriginalMember(
      owner = "client!ut",
      name = "i",
      descriptor = "I"
   )
   public static int field7062;
   @OriginalMember(
      owner = "client!ut",
      name = "g",
      descriptor = "I"
   )
   public static int field7063;
   @OriginalMember(
      owner = "client!ut",
      name = "d",
      descriptor = "I"
   )
   public static int field7064;
   @OriginalMember(
      owner = "client!ut",
      name = "f",
      descriptor = "Ljava/util/zip/Inflater;"
   )
   private Inflater field7057;

   @OriginalMember(
      owner = "client!ut",
      name = "<init>",
      descriptor = "()V"
   )
   public class495() {
      this(-1, 1000000, 1000000);
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(I[BLcu;)V"
   )
   public final void method3753(int arg0, byte[] arg1, class65 arg2) {
      try {
         ++field7063;
         if (arg0 != 0) {
            field7065 = 46;
         }

         if (~arg2.field942[arg2.field945] == -32 && arg2.field942[arg2.field945 + 1] == -117) {
            if (this.field7057 == null) {
               this.field7057 = new Inflater(true);
            }

            try {
               this.field7057.setInput(arg2.field942, arg2.field945 + 10, arg2.field942.length - (arg2.field945 - -10 + 8));
               this.field7057.inflate(arg1);
            } catch (Exception var5) {
               this.field7057.reset();
               throw new RuntimeException(field7066[3]);
            }

            this.field7057.reset();
         } else {
            throw new RuntimeException(field7066[1]);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7066[4] + arg0 + ',' + (arg1 != null ? field7066[2] : field7066[0]) + ',' + (arg2 != null ? field7066[2] : field7066[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method3754(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            method3755(57, 18, -15);
         }

         ++field7064;
         return (50560 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7066[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(III)Lnu;"
   )
   public static final class349 method3755(int arg0, int arg1, int arg2) {
      class312 var3 = class324.field4826[arg0][arg1][arg2];
      return var3 != null && var3.field4677 != null ? var3.field4677 : null;
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(IIIIIIILjava/lang/String;)V"
   )
   public static final void method3756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
      try {
         ++field7061;
         class239 var8 = new class239();
         var8.field3688 = arg6;
         var8.field3682 = class51.field770 + arg3;
         var8.field3686 = arg4;
         var8.field3684 = arg0;
         var8.field3690 = arg1;
         var8.field3685 = arg2;
         var8.field3680 = arg7;
         int var9 = -55 % ((-32 - arg5) / 32);
         class784.field11424.method3310(0, var8);
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field7066[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field7066[2] : field7066[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "([BI)[B"
   )
   public final byte[] method3757(byte[] arg0, int arg1) {
      try {
         ++field7056;
         class65 var3 = new class65(arg0);
         var3.field945 = arg0.length + -4;
         int var4 = var3.method704(false);
         var3.field945 = 0;
         byte[] var5 = new byte[var4];
         this.method3753(0, var5, var3);
         int var6 = 57 % ((arg1 - 23) / 52);
         return var5;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7066[7] + (arg0 != null ? field7066[2] : field7066[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3758(byte arg0) {
      try {
         int var1 = -35 % ((arg0 - 5) / 51);
         field7059 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7066[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "<init>",
      descriptor = "(III)V"
   )
   private class495(int arg0, int arg1, int arg2) {
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3759(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3760(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
