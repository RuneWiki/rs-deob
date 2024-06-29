import java.awt.datatransfer.Clipboard;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class378 {
   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5527 = new String[]{method2951(method2950("gn*\u0019E=")), method2951(method2950("gn*\u0019D=")), method2951(method2950("gn*\u0019F=")), method2951(method2950("{\u007f'[")), method2951(method2950("n$e\u0019z")), method2951(method2950("gn*\u0019C="))};
   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "Lhha;"
   )
   public static class724 field5521 = new class724(57, 4);
   @OriginalMember(
      owner = "client!rda",
      name = "g",
      descriptor = "[Lnt;"
   )
   public static class41[] field5524 = new class41[6];
   @OriginalMember(
      owner = "client!rda",
      name = "i",
      descriptor = "I"
   )
   public static int field5518;
   @OriginalMember(
      owner = "client!rda",
      name = "c",
      descriptor = "I"
   )
   public static int field5519;
   @OriginalMember(
      owner = "client!rda",
      name = "e",
      descriptor = "I"
   )
   public static int field5522;
   @OriginalMember(
      owner = "client!rda",
      name = "b",
      descriptor = "Lvt;"
   )
   public static class127 field5523;
   @OriginalMember(
      owner = "client!rda",
      name = "f",
      descriptor = "Liia;"
   )
   public static class264 field5526;
   @OriginalMember(
      owner = "client!rda",
      name = "h",
      descriptor = "Lcc;"
   )
   public static class790 field5525;
   @OriginalMember(
      owner = "client!rda",
      name = "d",
      descriptor = "Ljava/awt/datatransfer/Clipboard;"
   )
   public static Clipboard field5520;

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(ILjava/io/File;[BI)V"
   )
   public static final void method2946(int arg0, File arg1, byte[] arg2, int arg3) throws IOException {
      try {
         ++field5522;
         DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));

         try {
            var4.readFully(arg2, 0, arg3);
         } catch (EOFException var6) {
         }

         if (arg0 == 2) {
            var4.close();
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5527[2] + arg0 + ',' + (arg1 != null ? field5527[4] : field5527[3]) + ',' + (arg2 != null ? field5527[4] : field5527[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(IIIIIILha;)Lka;"
   )
   public static final class761 method2947(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class17 arg6) {
      try {
         ++field5518;
         long var7 = (long)arg5;
         class761 var9 = (class761)class448.field6532.method1041(var7, 8);
         short var10 = 2055;
         if (var9 == null) {
            class590 var11 = class362.method2845(class571.field8096, arg5, 0, (byte)-119);
            if (var11 == null) {
               return null;
            }

            if (var11.field8349 < 13) {
               var11.method4343(2, 2);
            }

            var9 = arg6.method240(var11, var10, class376.field5495, 64, 768);
            class448.field6532.method1050(arg0 + -113, var9, var7);
         }

         class761 var12 = var9.method755((byte)2, var10, true);
         if (arg0 != arg4) {
            var12.method809(arg4);
         }

         if (arg1 != 0) {
            var12.method785(arg1);
         }

         if (arg3 != 0) {
            var12.method773(arg3);
         }

         if (~arg2 != -1) {
            var12.method799(0, arg2, 0);
         }

         return var12;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field5527[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5527[4] : field5527[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method2948(byte arg0) {
      try {
         class667.method4846(-1);
         if (arg0 > -118) {
            method2947(54, 76, 62, 109, 29, -16, (class17)null);
         }

         ++field5519;
         class622.method4576((byte)-27);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5527[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2949(byte arg0) {
      try {
         field5525 = null;
         field5524 = null;
         int var1 = 118 / ((arg0 - 49) / 40);
         field5523 = null;
         field5526 = null;
         field5520 = null;
         field5521 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5527[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2950(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2951(char[] arg0) {
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
            var10005 = 10;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
