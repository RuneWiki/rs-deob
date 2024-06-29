import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {
   @OriginalMember(
      owner = "client!us",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7 = new String[]{method6(method5("\u0001j$n\u001d")), method6(method5("\u00141f,")), method6(method5("\u000f7$\u0002H")), method6(method5("\u000f7$\u0004H")), method6(method5("\u000f7$\u0001H")), method6(method5("\u000f7$\u0003H"))};
   @OriginalMember(
      owner = "client!us",
      name = "f",
      descriptor = "I"
   )
   public static int field3 = 104;
   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "I"
   )
   public static int field1;
   @OriginalMember(
      owner = "client!us",
      name = "c",
      descriptor = "I"
   )
   public static int field2;
   @OriginalMember(
      owner = "client!us",
      name = "e",
      descriptor = "I"
   )
   public static int field4;
   @OriginalMember(
      owner = "client!us",
      name = "d",
      descriptor = "I"
   )
   public static int field5;
   @OriginalMember(
      owner = "client!us",
      name = "b",
      descriptor = "I"
   )
   public static int field6;

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4564;

      try {
         if (arg0 != 1) {
            field1 = -58;
         }

         ++field6;
         if (~arg4 != -9 && arg4 != 16) {
            class600 var8 = class90.field1473[arg3][arg1][arg2];
            if (var8 != null) {
               label49: {
                  if (arg4 != 1) {
                     if (arg4 != 2) {
                        break label49;
                     }

                     var8.field8652 = 0;
                     if (!var5) {
                        break label49;
                     }
                  }

                  var8.field8655 = 0;
               }
            }

            class583.method4327(-10073);
         } else {
            int var6 = 0;
            if (var5 || class778.field11382 > var6) {
               do {
                  class743 var7 = class256.field3636[var6];
                  if (~var7.field10710 == ~arg4 && ~var7.field10698 == ~arg1 && var7.field10706 == arg2 || ~var7.field10699 == ~arg1 && ~var7.field10706 == ~arg2) {
                     if (~class778.field11382 != ~var6) {
                        class365.method2853(class256.field3636, var6 + 1, class256.field3636, var6, class256.field3636.length + -1 + -var6);
                     }

                     --class778.field11382;
                     return;
                  }

                  ++var6;
               } while(class778.field11382 > var6);

            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field7[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(ILjfa;Lha;II)V"
   )
   public static final void method2(int param0, class303 param1, class65 param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method3(int arg0, int arg1, boolean arg2) {
      try {
         ++field5;
         if (!arg2) {
            return true;
         } else {
            return (arg0 & 50560) != 0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(ZIIIIII)V"
   )
   public static final void method4(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field4;
         if (arg6 != 19491) {
            method2(-125, (class303)null, (class65)null, 73, -8);
         }

         if ((!arg0 ? class510.field7454.field11152.method684(false) : class510.field7454.field11169.method684(false)) != 0 && arg1 != 0 && class621.field9054 < 50 && arg2 != -1) {
            class123.field1969[class621.field9054++] = new class377((byte)(!arg0 ? 2 : 3), arg2, arg1, arg4, arg5, 0, arg3, (class294)null);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!us",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!us",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method6(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
