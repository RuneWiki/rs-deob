import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class56 {
   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field695 = new String[]{method421(method420("\u0018Cp4*")), method421(method420("\u0018Cp7*")), method421(method420("\u0018Cp1*")), method421(method420("\u0018Cp3*")), method421(method420("\u0000F2\u001e")), method421(method420("\u0018Cp6*")), method421(method420("\u0015\u001dp\\\u007f")), method421(method420("\u0018Cp0*"))};
   @OriginalMember(
      owner = "client!vp",
      name = "b",
      descriptor = "I"
   )
   public static int field693 = -2;
   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "I"
   )
   public static int field694 = -1;
   @OriginalMember(
      owner = "client!vp",
      name = "f",
      descriptor = "I"
   )
   public static int field686;
   @OriginalMember(
      owner = "client!vp",
      name = "i",
      descriptor = "I"
   )
   public static int field687;
   @OriginalMember(
      owner = "client!vp",
      name = "e",
      descriptor = "I"
   )
   public static int field688;
   @OriginalMember(
      owner = "client!vp",
      name = "d",
      descriptor = "I"
   )
   public static int field689;
   @OriginalMember(
      owner = "client!vp",
      name = "h",
      descriptor = "I"
   )
   public static int field690;
   @OriginalMember(
      owner = "client!vp",
      name = "g",
      descriptor = "I"
   )
   public static int field692;
   @OriginalMember(
      owner = "client!vp",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field691;

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(IZIIIIIII)Z",
      line = 4
   )
   public static final boolean method414(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field692;
         if (~(arg0 + arg3) < ~arg2 && arg0 < arg2 + arg8) {
            if (~(arg4 + arg5) < ~arg6 && arg4 < arg6 + arg7) {
               if (arg1) {
                  field694 = -104;
               }

               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field695[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(B)V",
      line = 22
   )
   public static final void method415(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(I)V",
      line = 50
   )
   public static void method416(int arg0) {
      try {
         if (arg0 != -5001) {
            field686 = -43;
         }

         field691 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field695[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(B[B)V",
      line = 61
   )
   public static final synchronized void method417(byte param0, byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vp",
      name = "b",
      descriptor = "(IB)V",
      line = 111
   )
   public static final void method418(int arg0, byte arg1) {
      try {
         ++field688;
         if (arg1 < 62) {
            field693 = -93;
         }

         if (~class12.field156 != -2) {
            if (~class12.field156 == -3) {
               class536.field8114 = arg0;
               return;
            }
         } else {
            class632.field9145 = arg0;
         }

      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field695[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(IB)[B",
      line = 139
   )
   public static final synchronized byte[] method419(int arg0, byte arg1) {
      try {
         ++field687;
         if (~arg0 == -101 && class697.field10347 > 0) {
            byte[] var2 = class249.field3789[--class697.field10347];
            class249.field3789[class697.field10347] = null;
            return var2;
         } else if (~arg0 == -5001 && ~class297.field4681 < -1) {
            byte[] var3 = class180.field2800[--class297.field4681];
            class180.field2800[class297.field4681] = null;
            return var3;
         } else {
            if (arg1 != -81) {
               field693 = 125;
            }

            if (arg0 == 30000 && ~class193.field2990 < -1) {
               byte[] var4 = class534.field8101[--class193.field2990];
               class534.field8101[class193.field2990] = null;
               return var4;
            } else {
               if (class520.field7907 != null) {
                  for(int var5 = 0; ~class222.field3345.length < ~var5; ++var5) {
                     if (class222.field3345[var5] == arg0 && class218.field3282[var5] > 0) {
                        byte[] var6 = class520.field7907[var5][--class218.field3282[var5]];
                        class520.field7907[var5][class218.field3282[var5]] = null;
                        return var6;
                     }
                  }
               }

               return new byte[arg0];
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field695[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method420(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method421(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
