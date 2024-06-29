import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class473 extends OutputStream {
   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7068 = new String[]{method3524(method3523("C.>b")), method3524(method3523("Vu| P")), method3524(method3523("N2|L\u0005")), method3524(method3523("N2|O\u0005")), method3524(method3523("N2|M\u0005")), method3524(method3523("N2|y_D/7&")), method3524(method3523("N2|J\u0005"))};
   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field7063 = new int[4096];
   @OriginalMember(
      owner = "client!ci",
      name = "b",
      descriptor = "Lsda;"
   )
   public static class269 field7065 = new class269(26, 3);
   @OriginalMember(
      owner = "client!ci",
      name = "f",
      descriptor = "I"
   )
   public static int field7062;
   @OriginalMember(
      owner = "client!ci",
      name = "c",
      descriptor = "I"
   )
   public static int field7064;
   @OriginalMember(
      owner = "client!ci",
      name = "e",
      descriptor = "I"
   )
   public static int field7066;
   @OriginalMember(
      owner = "client!ci",
      name = "d",
      descriptor = "I"
   )
   public static int field7067;

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3519(byte arg0) {
      try {
         field7063 = null;
         if (arg0 != 73) {
            method3520((byte)63, (String)null, 34);
         }

         field7065 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7068[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field7064;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7068[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(BLjava/lang/String;I)V"
   )
   public static final void method3520(byte arg0, String arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field7067;
         int var4 = class287.field4026;
         int[] var5 = class33.field372;
         boolean var6 = false;
         if (arg0 >= -59) {
            method3522(118, -12, -39);
         }

         int var7 = 0;
         if (var3 != 0 || ~var4 < ~var7) {
            do {
               class687 var8 = class661.field9578[var5[var7]];
               if (var8 != null && class693.field10418 != var8 && var8.field10332 != null && var8.field10332.equalsIgnoreCase(arg1)) {
                  var6 = true;
                  if (~arg2 != -2) {
                     if (~arg2 == -5) {
                        ++client.field4515;
                        class180 var9 = class486.method3603(class656.field9530, (byte)-70, class48.field583);
                        var9.field2211.method1103(var5[var7], -60);
                        var9.field2211.method1085(0, (byte)-11);
                        class763.method5527(false, var9);
                        if (var3 == 0) {
                           break;
                        }
                     }

                     if (arg2 != 5) {
                        if (arg2 == 6) {
                           ++class498.field7383;
                           class180 var10 = class486.method3603(class545.field8098, (byte)-65, class48.field583);
                           var10.field2211.method1085(0, (byte)-11);
                           var10.field2211.method1096((byte)-107, var5[var7]);
                           class763.method5527(false, var10);
                           if (var3 == 0) {
                              break;
                           }
                        }

                        if (arg2 == 7) {
                           ++class285.field4006;
                           class180 var11 = class486.method3603(class236.field2998, (byte)-28, class48.field583);
                           var11.field2211.method1096((byte)-107, var5[var7]);
                           var11.field2211.method1042(0, 103);
                           class763.method5527(false, var11);
                           if (var3 == 0) {
                              break;
                           }
                        }

                        if (~arg2 != -10) {
                           break;
                        }

                        class180 var12 = class486.method3603(class312.field4464, (byte)-9, class48.field583);
                        var12.field2211.method1085(0, (byte)-11);
                        var12.field2211.method1096((byte)-107, var5[var7]);
                        class763.method5527(false, var12);
                        if (var3 == 0) {
                           break;
                        }
                     }

                     ++class551.field8157;
                     class180 var13 = class486.method3603(class144.field1820, (byte)-85, class48.field583);
                     var13.field2211.method1042(0, -53);
                     var13.field2211.method1103(var5[var7], -31);
                     class763.method5527(false, var13);
                     if (var3 == 0) {
                        break;
                     }
                  }

                  ++class350.field5305;
                  class180 var14 = class486.method3603(class139.field1786, (byte)-70, class48.field583);
                  var14.field2211.method1048(0, 0);
                  var14.field2211.method1096((byte)-107, var5[var7]);
                  class763.method5527(false, var14);
                  if (var3 == 0) {
                     break;
                  }
               }

               ++var7;
            } while(~var4 < ~var7);
         }

         if (!var6) {
            class324.method2449(class204.field2585.method1562((byte)-75, class728.field10827) + arg1, 4, 27501);
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field7068[2] + arg0 + ',' + (arg1 != null ? field7068[1] : field7068[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method3521(int arg0, int arg1, int arg2) {
      try {
         ++field7062;
         int var3 = -45 % ((-46 - arg1) / 61);
         class284 var4 = class208.field2653[arg0][arg2];
         if (var4 != null) {
            class131.field1628 = var4.field3987;
            class412.field6315 = var4.field3997;
            class9.field138 = var4.field3990;
         }

         class511.method3798(-1019394622);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7068[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3522(int arg0, int arg1, int arg2) {
      try {
         ++field7066;
         if (arg2 != 0) {
            return true;
         } else {
            return (1048832 & arg1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7068[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3523(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3524(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
