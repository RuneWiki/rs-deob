import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class555 extends class366 {
   @OriginalMember(
      owner = "client!m",
      name = "q",
      descriptor = "I"
   )
   public int field8145;
   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8149 = new String[]{method4194(method4193("_\u0015~_")), method4194(method4193("_\u0015{_")), method4194(method4193("I\u0015\u0012Y1")), method4194(method4193("\\NP\u001b")), method4194(method4193("_\u0015y_")), method4194(method4193("_\u0015z_")), method4194(method4193("_\u0015\u0000\u001e\"[O\u0002_"))};
   @OriginalMember(
      owner = "client!m",
      name = "n",
      descriptor = "Ljava/util/Random;"
   )
   public static Random field8146 = new Random();
   @OriginalMember(
      owner = "client!m",
      name = "r",
      descriptor = "I"
   )
   public static int field8144;
   @OriginalMember(
      owner = "client!m",
      name = "p",
      descriptor = "I"
   )
   public static int field8147;
   @OriginalMember(
      owner = "client!m",
      name = "o",
      descriptor = "I"
   )
   public static int field8148;

   @OriginalMember(
      owner = "client!m",
      name = "<init>",
      descriptor = "(ILiba;Lbu;III)V"
   )
   public class555(int arg0, class237 arg1, class596 arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field8145 = arg5;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field8149[6] + arg0 + ',' + (arg1 != null ? field8149[2] : field8149[3]) + ',' + (arg2 != null ? field8149[2] : field8149[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method4190(int arg0) {
      try {
         class254.method2043(1);
         ++field8144;
         if (arg0 != 3005) {
            field8146 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8149[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public final class499 method842(byte arg0) {
      try {
         ++field8148;
         int var2 = 83 / ((4 - arg0) / 37);
         return class188.field2390;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8149[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(I[BLjava/io/File;I)V"
   )
   public static final void method4191(int arg0, byte[] arg1, File arg2, int arg3) throws IOException {
      try {
         ++field8147;
         DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));

         try {
            var4.readFully(arg1, 0, arg0);
            if (arg3 < 55) {
               field8146 = null;
            }
         } catch (EOFException var6) {
         }

         var4.close();
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8149[4] + arg0 + ',' + (arg1 != null ? field8149[2] : field8149[3]) + ',' + (arg2 != null ? field8149[2] : field8149[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4192(int arg0) {
      try {
         if (arg0 < -69) {
            field8146 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8149[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4193(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4194(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
