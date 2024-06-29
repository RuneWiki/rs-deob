import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class600 {
   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8815 = new String[]{method4391(method4390("H3Jyd\u0002")), method4391(method4390("H3Jya\u0002")), method4391(method4390("Qu\u0005y]")), method4391(method4390("D.G;")), method4391(method4390("H3Jyc\u0002"))};
   @OriginalMember(
      owner = "client!bha",
      name = "c",
      descriptor = "I"
   )
   public static int field8812;
   @OriginalMember(
      owner = "client!bha",
      name = "b",
      descriptor = "I"
   )
   public static int field8813;
   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "I"
   )
   public static int field8814;

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(IFB[BIIFIFFLjs;IF)V"
   )
   public static final void method4386(int param0, float param1, byte param2, byte[] param3, int param4, int param5, float param6, int param7, float param8, float param9, class348 param10, int param11, float param12) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(BLjava/lang/String;)I"
   )
   public static final int method4387(byte arg0, String arg1) {
      int var2 = client.field4530;

      try {
         ++field8812;
         if (!class646.field9407.field10710) {
            return -1;
         } else if (arg0 != -77) {
            return -107;
         } else if (class360.field5435.containsKey(arg1)) {
            return 100;
         } else {
            String var3 = class269.method2081(arg1, false);
            if (var3 == null) {
               return -1;
            } else {
               String var4 = class399.field6136 + var3;
               if (!class669.field10066.method3892(arg0 + 147, var4, "")) {
                  return -1;
               } else if (!class669.field10066.method3886(arg0 + 203, var4)) {
                  return class669.field10066.method3900(true, var4);
               } else {
                  byte[] var5 = class669.field10066.method3878(false, var4, "");
                  Object var6 = null;

                  File var7;
                  try {
                     var7 = class533.method3954(var3, (byte)-104);
                  } catch (RuntimeException var12) {
                     return -1;
                  }

                  if (var5 != null && var7 != null) {
                     boolean var8;
                     label95: {
                        var8 = true;
                        byte[] var9 = class663.method4755(var7, (byte)97);
                        if (var9 != null && var5.length == var9.length) {
                           int var10 = 0;
                           if (var2 != 0) {
                              if (var5[var10] != var9[var10]) {
                                 var8 = false;
                                 if (var2 == 0) {
                                    break label95;
                                 }
                              }

                              ++var10;
                           }

                           while(true) {
                              while(~var10 > ~var9.length) {
                                 if (var5[var10] != var9[var10]) {
                                    var8 = false;
                                    if (var2 == 0) {
                                       break label95;
                                    }
                                 }

                                 ++var10;
                              }

                              if (var2 == 0) {
                                 if (var2 == 0) {
                                    break label95;
                                 }
                                 break;
                              }

                              ++var10;
                           }
                        }

                        var8 = false;
                     }

                     try {
                        if (!var8) {
                           class646.field9407.method5208(var5, var7, 93);
                        }
                     } catch (Throwable var13) {
                        return -1;
                     }

                     class67.method665(arg1, var7, -3307);
                     return 100;
                  } else {
                     return -1;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field8815[4] + arg0 + ',' + (arg1 != null ? field8815[2] : field8815[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4388(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(III)Llp;"
   )
   public static final class411 method4389(int arg0, int arg1, int arg2) {
      class72 var3 = class353.field5360[arg0][arg1][arg2];
      return var3 == null ? null : var3.field915;
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4390(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4391(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
