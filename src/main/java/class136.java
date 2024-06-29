import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class136 {
   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1738 = new String[]{method1079(method1078("X\u0017\u001f4j")), method1079(method1078("C\u0016]\u001b")), method1079(method1078("VM\u001fY?")), method1079(method1078("X\u0017\u001f5j")), method1079(method1078("X\u0017\u001f3j")), method1079(method1078("X\u0017\u001f6j"))};
   @OriginalMember(
      owner = "client!ut",
      name = "d",
      descriptor = "I"
   )
   public static int field1729 = 0;
   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "I"
   )
   public static int field1732 = 2;
   @OriginalMember(
      owner = "client!ut",
      name = "g",
      descriptor = "Lkt;"
   )
   public static class169 field1730 = new class169();
   @OriginalMember(
      owner = "client!ut",
      name = "h",
      descriptor = "I"
   )
   public static int field1731;
   @OriginalMember(
      owner = "client!ut",
      name = "i",
      descriptor = "I"
   )
   public static int field1733;
   @OriginalMember(
      owner = "client!ut",
      name = "c",
      descriptor = "I"
   )
   public static int field1735;
   @OriginalMember(
      owner = "client!ut",
      name = "b",
      descriptor = "I"
   )
   public static int field1736;
   @OriginalMember(
      owner = "client!ut",
      name = "f",
      descriptor = "Lhba;"
   )
   public static class10 field1737;
   @OriginalMember(
      owner = "client!ut",
      name = "e",
      descriptor = "Lci;"
   )
   public static class476 field1734;

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(BLjava/lang/String;I)I"
   )
   public static final int method1074(byte arg0, String arg1, int arg2) {
      try {
         ++field1736;
         if (arg0 != 5) {
            method1077(-33, -79, 32, 59, 73, (byte[])null, (byte[])null, -8, 61);
         }

         return class550.method3949(arg1, arg2, (byte)105, true);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1738[5] + arg0 + ',' + (arg1 != null ? field1738[2] : field1738[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(IILuo;IIIIIIIII)Z"
   )
   public static final boolean method1075(int param0, int param1, class603 param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1076(byte arg0) {
      try {
         field1737 = null;
         field1730 = null;
         int var1 = -117 / ((arg0 - -56) / 63);
         field1734 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1738[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(IIIII[B[BII)V"
   )
   public static final void method1077(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, byte[] arg6, int arg7, int arg8) {
      boolean var9 = client.field4360;

      try {
         ++field1731;
         int var10 = -(arg7 >> 2);
         int var16 = -(arg7 & 3);
         if (arg1 == 0) {
            int var11 = -arg2;
            if (var9 || ~var11 > -1) {
               label88:
               do {
                  int var12 = var10;
                  int var10001;
                  if (var9) {
                     var10001 = arg0++;
                     arg6[var10001] += arg5[arg8++];
                     int var17 = arg0++;
                     arg6[var17] += arg5[arg8++];
                     int var18 = arg0++;
                     arg6[var18] += arg5[arg8++];
                     int var19 = arg0++;
                     arg6[var19] += arg5[arg8++];
                     var12 = var10 + 1;
                  }

                  while(true) {
                     while(var12 < 0) {
                        var10001 = arg0++;
                        arg6[var10001] += arg5[arg8++];
                        var10001 = arg0++;
                        arg6[var10001] += arg5[arg8++];
                        var10001 = arg0++;
                        arg6[var10001] += arg5[arg8++];
                        var10001 = arg0++;
                        arg6[var10001] += arg5[arg8++];
                        ++var12;
                     }

                     int var13 = var16;
                     if (!var9) {
                        if (var9) {
                           var10001 = arg0++;
                           arg6[var10001] += arg5[arg8++];
                           var13 = var16 + 1;
                        }

                        while(true) {
                           while(var13 < 0) {
                              var10001 = arg0++;
                              arg6[var10001] += arg5[arg8++];
                              ++var13;
                           }

                           arg0 += arg3;
                           arg8 += arg4;
                           if (!var9) {
                              ++var11;
                              continue label88;
                           }

                           ++var13;
                        }
                     }

                     ++var12;
                  }
               } while(~var11 > -1);

            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field1738[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1738[2] : field1738[1]) + ',' + (arg6 != null ? field1738[2] : field1738[1]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1078(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1079(char[] arg0) {
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
            var10005 = 99;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
