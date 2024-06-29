import java.awt.datatransfer.Clipboard;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class498 {
   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7286 = new String[]{method3757(method3756("+\u0017R\u0017")), method3757(method3756("\"\t\u0010>_")), method3757(method3756(">L\u0010U\n")), method3757(method3756("\"\t\u0010?_")), method3757(method3756("\"\t\u00109_")), method3757(method3756("\"\t\u00108_")), method3757(method3756("\f\fH\u001a\u001b,\u0006\u001e<-\f2\u001e\u0013\u0012$\u0006[\tV")), method3757(method3756("\"\t\u0010:_")), method3757(method3756("\f\fH\u001a\u001b,\u0006\u001e<-\f2\u001e\u0018\u0018(\u0012L\u001e\u00046\u0007Z[\u0013$\u0016_Z"))};
   @OriginalMember(
      owner = "client!gk",
      name = "e",
      descriptor = "Lgh;"
   )
   public static class572 field7279 = new class572(91, -2);
   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field7285 = new int[50];
   @OriginalMember(
      owner = "client!gk",
      name = "h",
      descriptor = "I"
   )
   public static int field7280;
   @OriginalMember(
      owner = "client!gk",
      name = "f",
      descriptor = "I"
   )
   public static int field7281;
   @OriginalMember(
      owner = "client!gk",
      name = "b",
      descriptor = "I"
   )
   public static int field7282;
   @OriginalMember(
      owner = "client!gk",
      name = "d",
      descriptor = "I"
   )
   public static int field7284;
   @OriginalMember(
      owner = "client!gk",
      name = "c",
      descriptor = "Ljava/awt/datatransfer/Clipboard;"
   )
   public static Clipboard field7283;
   @OriginalMember(
      owner = "client!gk",
      name = "g",
      descriptor = "Ljava/util/zip/Inflater;"
   )
   private Inflater field7278;

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(IIIII)V",
      line = 3
   )
   public static final void method3751(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg4 != 2126) {
            method3753(-88, 71, -36);
         }

         ++field7280;
         class536 var5 = class108.method1038((long)arg1, 109, 4);
         var5.method4017(24076);
         var5.field7805 = arg0;
         var5.field7798 = arg2;
         var5.field7800 = arg3;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7286[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "([BLuda;I)V",
      line = 27
   )
   public final void method3752(byte[] arg0, class473 arg1, int arg2) {
      try {
         ++field7284;
         if (arg1.field6889[arg1.field6907] == arg2 && ~arg1.field6889[arg1.field6907 - -1] == 116) {
            if (this.field7278 == null) {
               this.field7278 = new Inflater(true);
            }

            try {
               this.field7278.setInput(arg1.field6889, arg1.field6907 + 10, -8 - arg1.field6907 - (10 - arg1.field6889.length));
               this.field7278.inflate(arg0);
            } catch (Exception var5) {
               this.field7278.reset();
               throw new RuntimeException(field7286[8]);
            }

            this.field7278.reset();
         } else {
            throw new RuntimeException(field7286[6]);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7286[7] + (arg0 != null ? field7286[2] : field7286[0]) + ',' + (arg1 != null ? field7286[2] : field7286[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "<init>",
      descriptor = "()V",
      line = 50
   )
   public class498() {
      this(-1, 1000000, 1000000);
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(III)Z",
      line = 55
   )
   public static final boolean method3753(int arg0, int arg1, int arg2) {
      try {
         if (arg0 > -37) {
            field7283 = null;
         }

         ++field7282;
         return ~(arg2 & 34) != -1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7286[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "([BI)[B",
      line = 67
   )
   public final byte[] method3754(byte[] arg0, int arg1) {
      try {
         ++field7281;
         class473 var3 = new class473(arg0);
         var3.field6907 = arg0.length + -4;
         int var4 = var3.method3534((byte)118);
         var3.field6907 = 0;
         if (arg1 != 1000000) {
            return null;
         } else {
            byte[] var5 = new byte[var4];
            this.method3752(var5, var3, 31);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7286[1] + (arg0 != null ? field7286[2] : field7286[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(I)V",
      line = 88
   )
   public static void method3755(int arg0) {
      try {
         if (arg0 != -4) {
            method3753(47, 81, -113);
         }

         field7285 = null;
         field7283 = null;
         field7279 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7286[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "<init>",
      descriptor = "(III)V",
      line = 103
   )
   private class498(int arg0, int arg1, int arg2) {
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3756(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3757(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
