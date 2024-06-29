import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class794 {
   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11624 = new String[]{method5725(method5724("\u00065F|g")), method5725(method5724("\u00065Fzg")), method5725(method5724("\u00053\u0004R")), method5725(method5724("\u00065F}g")), method5725(method5724("\u0010hF\u00102")), method5725(method5724("\u00065F\u007fg"))};
   @OriginalMember(
      owner = "client!ms",
      name = "d",
      descriptor = "I"
   )
   public static int field11620 = 0;
   @OriginalMember(
      owner = "client!ms",
      name = "e",
      descriptor = "I"
   )
   public static int field11619;
   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "I"
   )
   public static int field11622;
   @OriginalMember(
      owner = "client!ms",
      name = "b",
      descriptor = "I"
   )
   public static int field11623;
   @OriginalMember(
      owner = "client!ms",
      name = "c",
      descriptor = "Liha;"
   )
   public static class32 field11621;

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(Lha;I)V",
      line = 5
   )
   public static final void method5720(class66 arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field11623;
         int var3 = 0;
         int var4 = 0;
         if (class681.field10034) {
            var3 = class85.method755((byte)-89);
            var4 = class592.method4305((byte)102);
         }

         label100: {
            int var5 = -10660793;
            class365.method2720(class285.field3949, -16777216, class185.field2624 + var3, class357.field4796, arg0, false, class305.field4177 + var4, var5);
            class455.field6465.method620(arg1 ^ arg1, class185.field2624 + var3 + 3, -1, class305.field4177 - -var4 + 14, var5, class180.field2503.method1437(class608.field8920, 50));
            int var6 = class611.field8968.method1660(false) + var3;
            int var7 = class611.field8968.method1659((byte)-8) + var4;
            if (!class662.field9649) {
               int var8 = 0;
               class32 var9 = (class32)class627.field9216.method2933(2);
               if (var2 || var9 != null) {
                  do {
                     int var10 = (class278.field3784 + -1 + -var8) * 16 + class305.field4177 + var4 - -31;
                     class543.method3906(class185.field2624 + var3, var7, -123, var9, class285.field3949, class357.field4796, -1, var6, var10, -256, arg0, class305.field4177 + var4);
                     ++var8;
                     var9 = (class32)class627.field9216.method2940(false);
                  } while(var9 != null);
               }

               if (!var2) {
                  break label100;
               }
            }

            int var11 = 0;
            class598 var12 = (class598)class265.field3654.method3488((byte)-125);
            if (var2 || var12 != null) {
               do {
                  label71: {
                     int var13 = var11 * 16 + class305.field4177 + var4 + 31;
                     ++var11;
                     if (var12.field8785 == 1) {
                        class543.method3906(class185.field2624 + var3, var7, -120, (class32)var12.field8795.field6868.field950, class285.field3949, class357.field4796, -1, var6, var13, -256, arg0, class305.field4177 - -var4);
                        if (!var2) {
                           break label71;
                        }
                     }

                     class204.method1610(var6, -256, class357.field4796, class185.field2624 - -var3, var13, -1, var7, class305.field4177 - -var4, (byte)105, arg0, var12, class285.field3949);
                  }

                  var12 = (class598)class265.field3654.method3484(0);
               } while(var12 != null);
            }

            if (class491.field7031 != null) {
               int var10000;
               int var10001;
               label58: {
                  class365.method2720(class25.field405, -16777216, class100.field1286, class535.field7631, arg0, false, class380.field5479, var5);
                  int var14 = 0;
                  class455.field6465.method620(arg1 + -27406, class100.field1286 + 3, -1, class380.field5479 + 14, var5, class491.field7031.field8793);
                  class32 var15 = (class32)class491.field7031.field8795.method3488((byte)-128);
                  if (var2) {
                     var10000 = var14 * 16 + class380.field5479;
                     var10001 = -31;
                  } else if (var15 == null) {
                     var10000 = class535.field7631;
                     var10001 = class25.field405;
                     if (!var2) {
                        break label58;
                     }
                  } else {
                     var10000 = var14 * 16 + class380.field5479;
                     var10001 = -31;
                  }

                  while(true) {
                     int var16 = var10000 - var10001;
                     class543.method3906(class100.field1286, var7, 52, var15, class25.field405, class535.field7631, -1, var6, var16, -256, arg0, class380.field5479);
                     ++var14;
                     var15 = (class32)class491.field7031.field8795.method3484(0);
                     if (var15 == null) {
                        var10000 = class535.field7631;
                        var10001 = class25.field405;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var14 * 16 + class380.field5479;
                        var10001 = -31;
                     }
                  }
               }

               class274.method2090(var10000, var10001, class380.field5479, class100.field1286, -4945);
            }
         }

         class274.method2090(class357.field4796, class285.field3949, class305.field4177 - -var4, class185.field2624 + var3, arg1 + -32351);
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field11624[3] + (arg0 != null ? field11624[4] : field11624[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(Z)V",
      line = 94
   )
   public static void method5721(boolean arg0) {
      try {
         if (arg0) {
            field11621 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11624[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      line = 104
   )
   public static final String method5722(String arg0, byte arg1) {
      try {
         ++field11622;
         String var2 = class249.method1920((byte)-36, class652.method4778(-38, arg0));
         if (arg1 < 12) {
            return null;
         } else {
            if (var2 == null) {
               var2 = "";
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11624[5] + (arg0 != null ? field11624[4] : field11624[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(BZ)V",
      line = 121
   )
   public static final void method5723(byte arg0, boolean arg1) {
      try {
         class300.field4107.method3301(25349, class300.field4107.field6424, 0);
         if (arg0 >= -21) {
            method5720((class66)null, 75);
         }

         ++field11619;
         class300.field4107.method3301(25349, class300.field4107.field6412, 0);
         class300.field4107.method3301(25349, class300.field4107.field6408, 1);
         class300.field4107.method3301(25349, class300.field4107.field6413, 1);
         class300.field4107.method3301(25349, class300.field4107.field6448, 0);
         class300.field4107.method3301(25349, class300.field4107.field6455, 0);
         class300.field4107.method3301(25349, class300.field4107.field6449, 0);
         class300.field4107.method3301(25349, class300.field4107.field6437, 0);
         class300.field4107.method3301(25349, class300.field4107.field6411, 0);
         class300.field4107.method3301(25349, class300.field4107.field6427, 0);
         class300.field4107.method3301(25349, class300.field4107.field6423, 0);
         class300.field4107.method3301(25349, class300.field4107.field6434, 0);
         class300.field4107.method3301(25349, class300.field4107.field6431, 0);
         class300.field4107.method3301(25349, class300.field4107.field6407, 0);
         class300.field4107.method3301(25349, class300.field4107.field6453, 0);
         class300.field4107.method3301(25349, class300.field4107.field6421, 0);
         class300.field4107.method3301(25349, class300.field4107.field6436, 0);
         class300.field4107.method3301(25349, class300.field4107.field6429, 0);
         class300.field4107.method3301(25349, class300.field4107.field6450, 0);
         class11.method59(true);
         class300.field4107.method3301(25349, class300.field4107.field6444, 2);
         class300.field4107.method3301(25349, class300.field4107.field6432, 1);
         class793.method5717(5539);
         class85.method760(0);
         class101.field1292 = true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11624[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5724(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5725(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
