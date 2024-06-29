import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class379 {
   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5275 = new String[]{method3009(method3008("\u00069\u0004R")), method3009(method3008("\u0013bF\u0010\u0004")), method3009(method3008("\u000e+\t\u0010;@")), method3009(method3008("\u000e+\t\u00108@")), method3009(method3008("\u000e+\t\u0010:@"))};
   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "Lse;"
   )
   public static class6 field5270 = new class6(11, 16);
   @OriginalMember(
      owner = "client!fga",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field5273 = false;
   @OriginalMember(
      owner = "client!fga",
      name = "b",
      descriptor = "I"
   )
   public static int field5268;
   @OriginalMember(
      owner = "client!fga",
      name = "e",
      descriptor = "I"
   )
   public int field5269;
   @OriginalMember(
      owner = "client!fga",
      name = "d",
      descriptor = "I"
   )
   public static int field5272;
   @OriginalMember(
      owner = "client!fga",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field5271;
   @OriginalMember(
      owner = "client!fga",
      name = "f",
      descriptor = "[Lhg;"
   )
   public static class529[] field5274;

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3005(int arg0) {
      try {
         field5274 = null;
         field5270 = null;
         if (arg0 != 0) {
            method3006((String)null, (byte)-118);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5275[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method3006(String arg0, byte arg1) {
      boolean var2 = client.field1481;

      try {
         ++field5268;
         if (arg0 != null) {
            if ((class202.field2575 < 200 || class221.field2771) && class202.field2575 < 200) {
               String var3 = class464.method3533((byte)87, arg0);
               if (var3 != null) {
                  byte var10000;
                  label94: {
                     int var4 = 0;
                     if (var2) {
                        var10000 = 87;
                     } else if (var4 >= class202.field2575) {
                        var10000 = 0;
                        if (!var2) {
                           break label94;
                        }
                     } else {
                        var10000 = 87;
                     }

                     while(true) {
                        String var5 = class464.method3533(var10000, class35.field495[var4]);
                        if (var5 != null && var5.equals(var3)) {
                           class632.method4663(arg0 + class606.field8941.method4490(class782.field11389, -16777216), 4, -117);
                           return;
                        }

                        if (class193.field2456[var4] != null) {
                           String var6 = class464.method3533((byte)87, class193.field2456[var4]);
                           if (var6 != null && var6.equals(var3)) {
                              class632.method4663(arg0 + class606.field8941.method4490(class782.field11389, -16777216), 4, -114);
                              return;
                           }
                        }

                        ++var4;
                        if (var4 >= class202.field2575) {
                           var10000 = 0;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = 87;
                        }
                     }
                  }

                  int var7 = var10000;
                  class594 var10;
                  class702 var11;
                  int var12;
                  if (var2) {
                     var10000 = 87;
                  } else if (~var7 <= ~class84.field1166) {
                     var10000 = class464.method3533((byte)87, class204.field2593.field11422).equals(var3);
                     if (!var2) {
                        if (var10000 != 0) {
                           class632.method4663(class606.field8944.method4490(class782.field11389, -16777216), 4, -119);
                           return;
                        }

                        ++class779.field11360;
                        var10 = class145.method1177((byte)-120);
                        var11 = class19.method142(var10.field8765, class183.field2322, (byte)-104);
                        var12 = -2 / ((arg1 - 7) / 57);
                        var11.field10264.method593(class398.method3129(12, arg0), 867770704);
                        var11.field10264.method595(-15010, arg0);
                        var10.method4423(var11, (byte)124);
                        return;
                     }
                  } else {
                     var10000 = 87;
                  }

                  while(true) {
                     String var8 = class464.method3533(var10000, class670.field9923[var7]);
                     if (var8 != null && var8.equals(var3)) {
                        class632.method4663(class606.field8946.method4490(class782.field11389, -16777216) + arg0 + class606.field8947.method4490(class782.field11389, -16777216), 4, -116);
                        return;
                     }

                     if (class211.field2685[var7] != null) {
                        String var9 = class464.method3533((byte)87, class211.field2685[var7]);
                        if (var9 != null && var9.equals(var3)) {
                           class632.method4663(class606.field8946.method4490(class782.field11389, -16777216) + arg0 + class606.field8947.method4490(class782.field11389, -16777216), 4, -113);
                           return;
                        }
                     }

                     ++var7;
                     if (~var7 <= ~class84.field1166) {
                        var10000 = class464.method3533((byte)87, class204.field2593.field11422).equals(var3);
                        if (!var2) {
                           if (var10000 != 0) {
                              class632.method4663(class606.field8944.method4490(class782.field11389, -16777216), 4, -119);
                              return;
                           }

                           ++class779.field11360;
                           var10 = class145.method1177((byte)-120);
                           var11 = class19.method142(var10.field8765, class183.field2322, (byte)-104);
                           var12 = -2 / ((arg1 - 7) / 57);
                           var11.field10264.method593(class398.method3129(12, arg0), 867770704);
                           var11.field10264.method595(-15010, arg0);
                           var10.method4423(var11, (byte)124);
                           return;
                        }
                     } else {
                        var10000 = 87;
                     }
                  }
               }
            } else {
               class632.method4663(class606.field8914.method4490(class782.field11389, -16777216), 4, -111);
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field5275[2] + (arg0 != null ? field5275[1] : field5275[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(II)I"
   )
   public static int method3007(int arg0, int arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5275[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3008(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3009(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
