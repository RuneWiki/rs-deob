import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class530 {
   @OriginalMember(
      owner = "client!je",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7481 = new String[]{method3963(method3962("HVIO,")), method3963(method3962("]\r\u000b\r")), method3963(method3962("Y\u001dI$y")), method3963(method3962("Y\u001dI#y")), method3963(method3962("Y\u001dI\"y")), method3963(method3962("Y\u001dI%y")), method3963(method3962("Y\u001dI y"))};
   @OriginalMember(
      owner = "client!je",
      name = "c",
      descriptor = "I"
   )
   public static int field7475 = 0;
   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "Leu;"
   )
   public static class634 field7480 = new class634();
   @OriginalMember(
      owner = "client!je",
      name = "f",
      descriptor = "I"
   )
   public static int field7476;
   @OriginalMember(
      owner = "client!je",
      name = "e",
      descriptor = "I"
   )
   public static int field7477;
   @OriginalMember(
      owner = "client!je",
      name = "d",
      descriptor = "I"
   )
   public static int field7478;
   @OriginalMember(
      owner = "client!je",
      name = "b",
      descriptor = "I"
   )
   public static int field7479;

   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "(IILjf;BI)Z"
   )
   public static final boolean method3957(int arg0, int arg1, class565 arg2, byte arg3, int arg4) {
      try {
         int var5 = -3 / ((54 - arg3) / 35);
         ++field7478;
         if (class66.field971 && class174.field2594) {
            if (~class526.field7443 > -101) {
               return false;
            } else if (!class767.method5521(arg1, (byte)-78, arg0, arg4)) {
               return false;
            } else {
               int var6 = arg1 << class313.field4707;
               int var7 = arg4 << class313.field4707;
               int var8 = class225.field3197[arg0].method5400(-1, arg4, arg1) - 1;
               int var9 = arg2.method728(0) + var8;
               if (~arg2.field8032 == -2) {
                  if (!class366.method2883(var9, var6, var6, var8, var7, var9, var7 - -class44.field655, var6, var7, false)) {
                     return false;
                  } else if (!class366.method2883(var9, var6, var6, var8, var7, var8, class44.field655 + var7, var6, class44.field655 + var7, false)) {
                     return false;
                  } else {
                     ++class278.field4202;
                     return true;
                  }
               } else if (arg2.field8032 == 2) {
                  if (!class366.method2883(var9, class44.field655 + var6, var6, var8, class44.field655 + var7, var9, class44.field655 + var7, var6, class44.field655 + var7, false)) {
                     return false;
                  } else if (!class366.method2883(var8, var6 - -class44.field655, var6, var8, class44.field655 + var7, var9, class44.field655 + var7, class44.field655 + var6, var7 - -class44.field655, false)) {
                     return false;
                  } else {
                     ++class278.field4202;
                     return true;
                  }
               } else if (~arg2.field8032 == -5) {
                  if (!class366.method2883(var9, class44.field655 + var6, class44.field655 + var6, var8, var7, var9, class44.field655 + var7, class44.field655 + var6, var7, false)) {
                     return false;
                  } else if (!class366.method2883(var9, class44.field655 + var6, class44.field655 + var6, var8, var7, var8, var7 - -class44.field655, class44.field655 + var6, class44.field655 + var7, false)) {
                     return false;
                  } else {
                     ++class278.field4202;
                     return true;
                  }
               } else if (~arg2.field8032 == -9) {
                  if (!class366.method2883(var9, var6 - -class44.field655, var6, var8, var7, var9, var7, var6, var7, false)) {
                     return false;
                  } else if (!class366.method2883(var8, var6 - -class44.field655, var6, var8, var7, var9, var7, class44.field655 + var6, var7, false)) {
                     return false;
                  } else {
                     ++class278.field4202;
                     return true;
                  }
               } else if (~arg2.field8032 == -17) {
                  if (!class216.method1865(class744.field10587 + var7, var6, class744.field10587, class744.field10587, var9, var8, 75)) {
                     return false;
                  } else {
                     ++class278.field4202;
                     return true;
                  }
               } else if (~arg2.field8032 == -33) {
                  if (!class216.method1865(var7 - -class744.field10587, class744.field10587 + var6, class744.field10587, class744.field10587, var9, var8, 62)) {
                     return false;
                  } else {
                     ++class278.field4202;
                     return true;
                  }
               } else if (~arg2.field8032 == -65) {
                  if (!class216.method1865(var7, class744.field10587 + var6, class744.field10587, class744.field10587, var9, var8, 83)) {
                     return false;
                  } else {
                     ++class278.field4202;
                     return true;
                  }
               } else if (arg2.field8032 == 128) {
                  if (!class216.method1865(var7, var6, class744.field10587, class744.field10587, var9, var8, 46)) {
                     return false;
                  } else {
                     ++class278.field4202;
                     return true;
                  }
               } else {
                  return true;
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field7481[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7481[0] : field7481[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "(ILsa;ILqaa;IIZ)V"
   )
   public static final void method3958(int arg0, class39 arg1, int arg2, class119 arg3, int arg4, int arg5, boolean arg6) {
      try {
         class504.method3804(arg2, arg6, arg5, arg1, arg0, (byte)-91);
         if (arg4 != 128) {
            method3960((byte)124);
         }

         ++field7476;
         class778.field11344 = arg3;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7481[4] + arg0 + ',' + (arg1 != null ? field7481[0] : field7481[1]) + ',' + arg2 + ',' + (arg3 != null ? field7481[0] : field7481[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3959(boolean arg0) {
      try {
         ++field7477;
         if (!arg0) {
            method3961(14, 85, -81, 32, 28);
         }

         class794.field11554 = 0;
         class108.field1689 = 0;
         class560.field7969 = 0;
         class255.field3872 = 0;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7481[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3960(byte arg0) {
      try {
         if (arg0 != 106) {
            method3957(-104, -124, (class565)null, (byte)-23, 87);
         }

         field7480 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7481[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3961(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field7479;
         class111 var5 = class796.method5734(arg1, (long)arg4, (byte)-126);
         var5.method1087(0);
         var5.field1732 = arg3;
         var5.field1740 = arg2;
         var5.field1739 = arg0;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7481[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!je",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3962(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!je",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3963(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
