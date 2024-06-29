import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class27 {
   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field305 = new String[]{method193(method192("0DlAC~")), method193(method192("-\b#A\u007f")), method193(method192("8Sa\u0003"))};
   @OriginalMember(
      owner = "client!fba",
      name = "c",
      descriptor = "I"
   )
   public static int field301;
   @OriginalMember(
      owner = "client!fba",
      name = "d",
      descriptor = "I"
   )
   public static int field302;
   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "J"
   )
   public static long field303;
   @OriginalMember(
      owner = "client!fba",
      name = "b",
      descriptor = "J"
   )
   public static long field304;

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(IIIIIIIILjfa;ILha;I)V"
   )
   public static final void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class303 arg8, int arg9, class66 arg10, int arg11) {
      try {
         ++field302;
         if (arg3 == -1473285856) {
            if (~arg5 > ~arg7 && ~(arg5 + arg11) < ~arg7 && ~(arg6 + -13) > ~arg2 && ~arg2 > ~(arg6 - -3) && arg8.field4329) {
               arg0 = arg9;
            }

            int[] var12 = null;
            if (!class57.method476(true, arg8.field4333)) {
               if (~arg8.field4332 == 0) {
                  if (!class550.method4065(arg8.field4333, arg3 + 1473285971)) {
                     if (class132.method1129(arg8.field4333, -109)) {
                        Object var13 = null;
                        class557 var14;
                        if (~arg8.field4333 != -1010) {
                           var14 = class151.field1896.method5072(30, (int)(2147483647L & arg8.field4324 >>> 32));
                        } else {
                           var14 = class151.field1896.method5072(30, (int)arg8.field4324);
                        }

                        if (var14.field8320 != null) {
                           var14 = var14.method4125(class597.field8793, 119);
                        }

                        if (var14 != null) {
                           var12 = var14.field8271;
                        }
                     }
                  } else {
                     class726 var15 = (class726)class259.field3509.method5681((long)((int)arg8.field4324), -1);
                     if (var15 != null) {
                        class155 var16 = var15.field10794;
                        class369 var17 = var16.field1971;
                        if (var17.field5590 != null) {
                           var17 = var17.method2872(true, class597.field8793);
                        }

                        if (var17 != null) {
                           var12 = var17.field5564;
                        }
                     }
                  }
               } else {
                  var12 = class54.field616.method1689(arg8.field4332, (byte)-104).field1128;
               }
            } else {
               var12 = class54.field616.method1689((int)arg8.field4324, (byte)89).field1128;
            }

            String var18 = class63.method520((byte)-114, arg8);
            if (var12 != null) {
               var18 = var18 + class163.method1331(var12, -1);
            }

            class524.field7616.method676(class75.field966, class280.field3894, var18, arg6, arg0, arg5 + 3, arg3 + 1473285961, 0);
            if (arg8.field4319) {
               class689.field10392.method3035(arg5 + 5 + class173.field2160.method5532(var18, -88), arg6 + -12);
            }
         }
      } catch (RuntimeException var20) {
         throw class670.method4877(var20, field305[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field305[1] : field305[2]) + ',' + arg9 + ',' + (arg10 != null ? field305[1] : field305[2]) + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method192(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method193(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
