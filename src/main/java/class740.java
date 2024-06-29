import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class740 implements class678 {
   @OriginalMember(
      owner = "client!ge",
      name = "q",
      descriptor = "Ljh;"
   )
   public class169 field10778;
   @OriginalMember(
      owner = "client!ge",
      name = "h",
      descriptor = "I"
   )
   public int field10779;
   @OriginalMember(
      owner = "client!ge",
      name = "l",
      descriptor = "I"
   )
   public int field10776;
   @OriginalMember(
      owner = "client!ge",
      name = "g",
      descriptor = "I"
   )
   public int field10775;
   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "I"
   )
   public int field10774;
   @OriginalMember(
      owner = "client!ge",
      name = "k",
      descriptor = "Z"
   )
   public boolean field10772;
   @OriginalMember(
      owner = "client!ge",
      name = "r",
      descriptor = "I"
   )
   public int field10782;
   @OriginalMember(
      owner = "client!ge",
      name = "i",
      descriptor = "Lsq;"
   )
   public class190 field10781;
   @OriginalMember(
      owner = "client!ge",
      name = "b",
      descriptor = "I"
   )
   public int field10784;
   @OriginalMember(
      owner = "client!ge",
      name = "m",
      descriptor = "I"
   )
   public int field10773;
   @OriginalMember(
      owner = "client!ge",
      name = "e",
      descriptor = "I"
   )
   public int field10783;
   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10790 = new String[]{method5366(method5365("\u001c1\u0014&[")), method5366(method5365("\u0015!V\t")), method5366(method5365("\u001c1\u0014#[")), method5366(method5365("\u0000z\u0014K\u000e")), method5366(method5365("\u001c1\u0014Y\u001a\u0015=N[[")), method5366(method5365("\u001c1\u0014'[")), method5366(method5365("\u001c1\u0014 [")), method5366(method5365("\u001c1\u0014![")), method5366(method5365("\u001c1\u0014$["))};
   @OriginalMember(
      owner = "client!ge",
      name = "d",
      descriptor = "Lbga;"
   )
   public static class378 field10777 = new class378(61, 6);
   @OriginalMember(
      owner = "client!ge",
      name = "s",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10787 = new String[100];
   @OriginalMember(
      owner = "client!ge",
      name = "o",
      descriptor = "I"
   )
   public static int field10770;
   @OriginalMember(
      owner = "client!ge",
      name = "f",
      descriptor = "I"
   )
   public static int field10771;
   @OriginalMember(
      owner = "client!ge",
      name = "t",
      descriptor = "I"
   )
   public static int field10780;
   @OriginalMember(
      owner = "client!ge",
      name = "j",
      descriptor = "I"
   )
   public static int field10785;
   @OriginalMember(
      owner = "client!ge",
      name = "c",
      descriptor = "I"
   )
   public static int field10788;
   @OriginalMember(
      owner = "client!ge",
      name = "p",
      descriptor = "I"
   )
   public static int field10789;
   @OriginalMember(
      owner = "client!ge",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field10786;

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(Ljava/io/File;[BBI)V"
   )
   public static final void method5360(File arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
      try {
         ++field10785;
         if (arg2 > -119) {
            method5363((byte[])null, true, (byte)83);
         }

         DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));

         try {
            var4.readFully(arg1, 0, arg3);
         } catch (EOFException var6) {
         }

         var4.close();
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10790[6] + (arg0 != null ? field10790[3] : field10790[1]) + ',' + (arg1 != null ? field10790[3] : field10790[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public final class365 method19(int arg0) {
      try {
         int var2 = -58 / ((1 - arg0) / 55);
         ++field10788;
         return class287.field3797;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10790[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(FFFI)F"
   )
   public static final float method5361(float arg0, float arg1, float arg2, int arg3) {
      try {
         ++field10771;
         return arg3 <= 86 ? -0.37670684F : (arg1 - arg0) * arg2 + arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10790[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(IB[B)[B"
   )
   public static final byte[] method5362(int arg0, byte arg1, byte[] arg2) {
      try {
         ++field10789;
         if (arg1 <= 82) {
            method5363((byte[])null, false, (byte)90);
         }

         byte[] var3 = new byte[arg0];
         class714.method5200(arg2, 0, var3, 0, arg0);
         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10790[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10790[3] : field10790[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "([BZB)V"
   )
   public static final void method5363(byte[] arg0, boolean arg1, byte arg2) {
      boolean var3 = client.field4273;

      try {
         if (class305.field4053 == null) {
            class305.field4053 = new class594(20000);
         }

         int var4 = -112 / ((arg2 - -31) / 43);
         ++field10770;
         class305.field4053.method4321(arg0.length, 0, 110909448, arg0);
         if (arg1) {
            class296.method2228(class305.field4053.field8227, -3);
            class182.field2252 = new class78[class567.field7738];
            int var5 = 0;
            int var6 = class532.field7285;
            class78 var7;
            if (var3) {
               var7 = class281.method2144(var6, true);
               if (var7 != null) {
                  class182.field2252[var5++] = var7;
               }

               ++var6;
            }

            while(true) {
               int var10000;
               if (class697.field10180 < var6) {
                  class134.field1744 = false;
                  var10000 = -25005;
                  if (!var3) {
                     class663.field9450 = class792.method5708(-25005);
                     class305.field4053 = null;
                     return;
                  }
               } else {
                  var10000 = var6;
               }

               var7 = class281.method2144(var10000, true);
               if (var7 != null) {
                  class182.field2252[var5++] = var7;
               }

               ++var6;
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10790[7] + (arg0 != null ? field10790[3] : field10790[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5364(byte arg0) {
      try {
         field10787 = null;
         field10777 = null;
         field10786 = null;
         if (arg0 != -40) {
            method5362(-14, (byte)-92, (byte[])null);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10790[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "<init>",
      descriptor = "(ILsq;Ljh;IIIIIIIZ)V"
   )
   public class740(int arg0, class190 arg1, class169 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
      try {
         this.field10778 = arg2;
         this.field10779 = arg4;
         this.field10776 = arg8;
         this.field10775 = arg7;
         this.field10774 = arg3;
         this.field10772 = arg10;
         this.field10782 = arg0;
         this.field10781 = arg1;
         this.field10784 = arg6;
         this.field10773 = arg9;
         this.field10783 = arg5;
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field10790[4] + arg0 + ',' + (arg1 != null ? field10790[3] : field10790[1]) + ',' + (arg2 != null ? field10790[3] : field10790[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5365(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5366(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
