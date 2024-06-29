import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class270 implements class518 {
   @OriginalMember(
      owner = "client!pd",
      name = "c",
      descriptor = "I"
   )
   public int field3731;
   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "I"
   )
   public int field3727;
   @OriginalMember(
      owner = "client!pd",
      name = "m",
      descriptor = "I"
   )
   public int field3725;
   @OriginalMember(
      owner = "client!pd",
      name = "j",
      descriptor = "I"
   )
   public int field3732;
   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "I"
   )
   public int field3738;
   @OriginalMember(
      owner = "client!pd",
      name = "k",
      descriptor = "I"
   )
   public int field3736;
   @OriginalMember(
      owner = "client!pd",
      name = "g",
      descriptor = "Lada;"
   )
   public class175 field3724;
   @OriginalMember(
      owner = "client!pd",
      name = "l",
      descriptor = "I"
   )
   public int field3729;
   @OriginalMember(
      owner = "client!pd",
      name = "e",
      descriptor = "Lkt;"
   )
   public class169 field3728;
   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3739 = new String[]{method2078(method2077("\u007f\u0006<0")), method2078(method2077("a\u0017~\u0014Q")), method2078(method2077("j]~r\u0004")), method2078(method2077("a\u0017~\u0015Q")), method2078(method2077("a\u0017~\u001bQ")), method2078(method2077("a\u0017~\u001eQ")), method2078(method2077("a\u0017~`\u0010\u007f\u001a$bQ"))};
   @OriginalMember(
      owner = "client!pd",
      name = "f",
      descriptor = "Leg;"
   )
   public static class118 field3735 = new class118(21, 5);
   @OriginalMember(
      owner = "client!pd",
      name = "o",
      descriptor = "I"
   )
   public static int field3726;
   @OriginalMember(
      owner = "client!pd",
      name = "d",
      descriptor = "I"
   )
   public static int field3730;
   @OriginalMember(
      owner = "client!pd",
      name = "i",
      descriptor = "I"
   )
   public static int field3733;
   @OriginalMember(
      owner = "client!pd",
      name = "h",
      descriptor = "Lfs;"
   )
   public static class582 field3737;
   @OriginalMember(
      owner = "client!pd",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field3734;

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(Lak;I)I",
      line = 14
   )
   public static final int method2074(class371 arg0, int arg1) {
      try {
         ++field3730;
         if (class14.field155 == arg0) {
            return 6407;
         } else if (class424.field6036 != arg0) {
            if (class46.field621 != arg0) {
               if (class14.field166 == arg0) {
                  return 6409;
               } else if (class227.field3212 != arg0) {
                  if (class626.field9193 == arg0) {
                     return 6145;
                  } else {
                     if (arg1 != 21) {
                        method2076(112, (File)null, (byte)75);
                     }

                     throw new IllegalStateException();
                  }
               } else {
                  return 6410;
               }
            } else {
               return 6406;
            }
         } else {
            return 6408;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3739[1] + (arg0 != null ? field3739[2] : field3739[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "(B)V",
      line = 49
   )
   public static void method2075(byte arg0) {
      try {
         field3737 = null;
         field3735 = null;
         int var1 = 40 / ((-35 - arg0) / 45);
         field3734 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3739[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(B)Lqca;",
      line = 69
   )
   public class127 method993(byte arg0) {
      try {
         ++field3726;
         return arg0 != -48 ? null : null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3739[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "<init>",
      descriptor = "(Lkt;Lada;IIIIIII)V",
      line = 80
   )
   public class270(class169 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field3731 = arg4;
         this.field3727 = arg3;
         this.field3725 = arg2;
         this.field3732 = arg8;
         this.field3738 = arg6;
         this.field3736 = arg7;
         this.field3724 = arg1;
         this.field3729 = arg5;
         this.field3728 = arg0;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field3739[6] + (arg0 != null ? field3739[2] : field3739[0]) + ',' + (arg1 != null ? field3739[2] : field3739[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(ILjava/io/File;B)[B",
      line = 96
   )
   public static final byte[] method2076(int arg0, File arg1, byte arg2) {
      try {
         ++field3733;

         try {
            byte[] var3 = new byte[arg0];
            class700.method5087(var3, arg1, (byte)-127, arg0);
            if (arg2 != -89) {
               method2076(-5, (File)null, (byte)110);
            }

            return var3;
         } catch (IOException var5) {
            return null;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3739[4] + arg0 + ',' + (arg1 != null ? field3739[2] : field3739[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2077(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2078(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
