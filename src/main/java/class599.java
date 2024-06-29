import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class599 extends class429 {
   @OriginalMember(
      owner = "client!fia",
      name = "u",
      descriptor = "B"
   )
   public byte field8642 = 5;
   @OriginalMember(
      owner = "client!fia",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8646 = new String[]{method4428(method4427("AI\u0002MV\u000f")), method4428(method4427("IU\u000f\u000f")), method4428(method4427("\\\u000eMMa")), method4428(method4427("AI\u0002M[\u000f")), method4428(method4427("AI\u0002MT\u000f")), method4428(method4427("AI\u0002MW\u000f")), method4428(method4427("AI\u0002MU\u000f"))};
   @OriginalMember(
      owner = "client!fia",
      name = "E",
      descriptor = "Z"
   )
   public static boolean field8635 = false;
   @OriginalMember(
      owner = "client!fia",
      name = "B",
      descriptor = "I"
   )
   public int field8630;
   @OriginalMember(
      owner = "client!fia",
      name = "t",
      descriptor = "I"
   )
   public static int field8631;
   @OriginalMember(
      owner = "client!fia",
      name = "A",
      descriptor = "I"
   )
   public static int field8633;
   @OriginalMember(
      owner = "client!fia",
      name = "s",
      descriptor = "I"
   )
   public int field8634;
   @OriginalMember(
      owner = "client!fia",
      name = "F",
      descriptor = "I"
   )
   public int field8638;
   @OriginalMember(
      owner = "client!fia",
      name = "v",
      descriptor = "I"
   )
   public static int field8639;
   @OriginalMember(
      owner = "client!fia",
      name = "D",
      descriptor = "I"
   )
   public static int field8640;
   @OriginalMember(
      owner = "client!fia",
      name = "r",
      descriptor = "I"
   )
   public int field8641;
   @OriginalMember(
      owner = "client!fia",
      name = "x",
      descriptor = "I"
   )
   public static int field8643;
   @OriginalMember(
      owner = "client!fia",
      name = "y",
      descriptor = "I"
   )
   public int field8644;
   @OriginalMember(
      owner = "client!fia",
      name = "w",
      descriptor = "I"
   )
   public int field8645;
   @OriginalMember(
      owner = "client!fia",
      name = "C",
      descriptor = "Lhw;"
   )
   public static class141 field8636;
   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "Lhw;"
   )
   public static class141 field8637;
   @OriginalMember(
      owner = "client!fia",
      name = "q",
      descriptor = "Z"
   )
   public boolean field8632;

   @OriginalMember(
      owner = "client!fia",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4421(int arg0) {
      try {
         field8637 = null;
         if (arg0 < -78) {
            field8636 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8646[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(BLqe;)I"
   )
   public static final int method4422(byte arg0, class491 arg1) {
      try {
         ++field8631;
         if (class560.field8147 == arg1) {
            return 9216;
         } else if (class692.field10145 != arg1) {
            if (class483.field7015 == arg1) {
               return 34066;
            } else {
               if (arg0 != 39) {
                  field8637 = null;
               }

               throw new IllegalArgumentException();
            }
         } else {
            return 34065;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8646[0] + arg0 + ',' + (arg1 != null ? field8646[2] : field8646[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method4423(int arg0) {
      try {
         ++field8639;
         int var1 = 3 / ((28 - arg0) / 56);
         if (class780.field11425 == null) {
            if (class733.field10535 == -1) {
               class641.method4698(-117, class386.field5693, class741.field10672);
            } else {
               class195.method1690(-74);
            }
         } else {
            class453.method3411((byte)40);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8646[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "([Lvca;II)V"
   )
   public static final void method4424(class294[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class294 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field4094;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field4094 < (var7 & 1) + var6) {
               class294 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method4424(arg0, arg1, var4 - 1);
         method4424(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(IIBIIII)Z"
   )
   public static final boolean method4425(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field8643;
         if (arg2 != 6) {
            return true;
         } else {
            int var7 = arg6 - -arg5;
            int var8 = arg0 + arg3;
            int var9 = arg1 + arg4;
            if (!class252.method2038(var9, var7, arg1, var9, var8, var8, -30465, arg6, var8, arg6)) {
               return false;
            } else if (!class252.method2038(var9, var7, arg1, arg1, var8, var8, -30465, var7, var8, arg6)) {
               return false;
            } else {
               if (~class359.field5370 < ~arg6) {
                  if (!class252.method2038(var9, arg6, var9, arg1, arg0, var8, -30465, arg6, var8, arg6)) {
                     return false;
                  }

                  if (!class252.method2038(arg1, arg6, var9, arg1, arg0, arg0, -30465, arg6, var8, arg6)) {
                     return false;
                  }
               } else {
                  if (!class252.method2038(var9, var7, var9, arg1, arg0, var8, -30465, var7, var8, var7)) {
                     return false;
                  }

                  if (!class252.method2038(arg1, var7, var9, arg1, arg0, arg0, -30465, var7, var8, var7)) {
                     return false;
                  }
               }

               if (~class400.field5883 < ~arg1) {
                  if (!class252.method2038(arg1, var7, arg1, arg1, arg0, var8, -30465, arg6, var8, arg6)) {
                     return false;
                  }

                  if (!class252.method2038(arg1, var7, arg1, arg1, arg0, arg0, -30465, var7, var8, arg6)) {
                     return false;
                  }
               } else {
                  if (!class252.method2038(var9, var7, var9, var9, arg0, var8, -30465, arg6, var8, arg6)) {
                     return false;
                  }

                  if (!class252.method2038(var9, var7, var9, var9, arg0, arg0, -30465, var7, var8, arg6)) {
                     return false;
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field8646[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/io/File;I)V"
   )
   public static final void method4426(String arg0, File arg1, int arg2) {
      try {
         ++field8640;
         if (arg2 < 111) {
            method4426((String)null, (File)null, 3);
         }

         class74.field1312.put(arg0, arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8646[5] + (arg0 != null ? field8646[2] : field8646[1]) + ',' + (arg1 != null ? field8646[2] : field8646[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4427(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4428(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
