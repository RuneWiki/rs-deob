import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class466 extends class184 {
   @OriginalMember(
      owner = "client!jc",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6721 = new String[]{method3391(method3390("7%}Pb")), method3391(method3390("&h}?7")), method3391(method3390("\"~?\u0012")), method3391(method3390("&h}=7")), method3391(method3390("&h}<7"))};
   @OriginalMember(
      owner = "client!jc",
      name = "I",
      descriptor = "I"
   )
   public static int field6715;
   @OriginalMember(
      owner = "client!jc",
      name = "L",
      descriptor = "I"
   )
   public static int field6718;
   @OriginalMember(
      owner = "client!jc",
      name = "H",
      descriptor = "I"
   )
   public static int field6719;
   @OriginalMember(
      owner = "client!jc",
      name = "G",
      descriptor = "I"
   )
   public int field6720;
   @OriginalMember(
      owner = "client!jc",
      name = "K",
      descriptor = "Lnha;"
   )
   public class342 field6717;
   @OriginalMember(
      owner = "client!jc",
      name = "J",
      descriptor = "[B"
   )
   public byte[] field6716;

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(Z)[B",
      line = 6
   )
   public final byte[] method1464(boolean arg0) {
      try {
         ++field6719;
         if (!arg0) {
            this.method1464(false);
         }

         if (super.field2586) {
            throw new RuntimeException();
         } else {
            return this.field6716;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6721[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "c",
      descriptor = "(B)I",
      line = 27
   )
   public final int method1462(byte arg0) {
      try {
         ++field6715;
         if (super.field2586) {
            return 0;
         } else {
            return arg0 >= -9 ? 39 : 100;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6721[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(Lha;B)V",
      line = 42
   )
   public static final void method3389(class66 arg0, byte arg1) {
      boolean var2 = client.field4360;

      try {
         ++field6718;
         int var3 = -20 % ((-48 - arg1) / 63);
         int var4 = 0;
         int var5 = 0;
         if (class681.field10034) {
            var4 = class85.method755((byte)-114);
            var5 = class592.method4305((byte)103);
         }

         int var6;
         int var7;
         int var8;
         int var9;
         byte var10;
         int var11;
         int var12;
         int var10000;
         label228: {
            var6 = class185.field2624 + var4;
            var7 = class305.field4177 + var5;
            var8 = class285.field3949;
            var9 = class357.field4796 + -3;
            var10 = 20;
            class161.method1345(class185.field2624 + var4, class357.field4796, class180.field2503.method1437(class608.field8920, 50), arg0, class285.field3949, (byte)109, var10, class305.field4177 - -var5);
            var11 = var4 + class611.field8968.method1660(false);
            var12 = var5 + class611.field8968.method1659((byte)126);
            if (!class662.field9649) {
               int var13 = 0;
               class32 var14 = (class32)class627.field9216.method2933(2);
               if (var2 || var14 != null) {
                  do {
                     int var15 = (-var13 + class278.field3784 + -1) * 16 + var7 + 13 + var10;
                     if (class185.field2624 + var4 < var11 && class185.field2624 + var4 + class285.field3949 > var11 && var15 + -13 < var12 && var12 < var15 + 4 && var14.field469) {
                        arg0.method496(class185.field2624 - -var4, var15 + -12, class285.field3949, 16, class290.field4015 | 255 - class318.field4336 << 24, 1);
                     }

                     ++var13;
                     var14 = (class32)class627.field9216.method2940(false);
                  } while(var14 != null);
               }

               if (!var2) {
                  break label228;
               }
            }

            int var16 = 0;
            class598 var17 = (class598)class265.field3654.method3488((byte)-115);
            if (var2 || var17 != null) {
               do {
                  int var18 = var16 * 16 + var10 + 13 + var7;
                  ++var16;
                  if (class185.field2624 + var4 < var11 && var11 < class185.field2624 + var4 + class285.field3949 && ~var12 < ~(var18 + -13) && ~var12 > ~(var18 + 4) && (var17.field8785 > 1 || ((class32)var17.field8795.field6868.field950).field469)) {
                     arg0.method496(class185.field2624 + var4, var18 + -12, class285.field3949, 16, -class318.field4336 + 255 << 24 | class290.field4015, 1);
                  }

                  var17 = (class598)class265.field3654.method3484(0);
               } while(var17 != null);
            }

            if (class491.field7031 != null) {
               label167: {
                  class161.method1345(class100.field1286, class535.field7631, class491.field7031.field8793, arg0, class25.field405, (byte)41, var10, class380.field5479);
                  int var19 = 0;
                  class32 var20 = (class32)class491.field7031.field8795.method3488((byte)-115);
                  if (var2) {
                     var10000 = var19 * 16 + var10 + class380.field5479 + 13;
                  } else if (var20 == null) {
                     var10000 = -111;
                     if (!var2) {
                        break label167;
                     }
                  } else {
                     var10000 = var19 * 16 + var10 + class380.field5479 + 13;
                  }

                  while(true) {
                     int var21 = var10000;
                     ++var19;
                     if (~class100.field1286 > ~var11 && var11 < class25.field405 + class100.field1286 && ~var12 < ~(var21 + -13) && var21 + 4 > var12 && var20.field469) {
                        arg0.method496(class100.field1286, var21 - 12, class25.field405, 16, -class318.field4336 + 255 << 24 | class290.field4015, 1);
                     }

                     var20 = (class32)class491.field7031.field8795.method3484(0);
                     if (var20 == null) {
                        var10000 = -111;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var19 * 16 + var10 + class380.field5479 + 13;
                     }
                  }
               }

               class516.method3757((byte)var10000, arg0, class100.field1286, class380.field5479, class535.field7631, class25.field405, var10);
            }
         }

         label217: {
            class516.method3757((byte)-37, arg0, class185.field2624 + var4, class305.field4177 + var5, class357.field4796, class285.field3949, var10);
            if (class662.field9649) {
               int var22 = 0;
               class598 var23 = (class598)class265.field3654.method3488((byte)-119);
               if (var2 || var23 != null) {
                  do {
                     label143: {
                        int var24 = class305.field4177 + var5 + var10 - (-13 - var22 * 16);
                        if (var23.field8785 != 1) {
                           class204.method1610(var11, class507.field7385 | -16777216, class357.field4796, class185.field2624 + var4, var24, -16777216 | class139.field1770, var12, class305.field4177 + var5, (byte)105, arg0, var23, class285.field3949);
                           if (!var2) {
                              break label143;
                           }
                        }

                        class543.method3906(class185.field2624 - -var4, var12, -119, (class32)var23.field8795.field6868.field950, class285.field3949, class357.field4796, class139.field1770 | -16777216, var11, var24, class507.field7385 | -16777216, arg0, class305.field4177 - -var5);
                     }

                     ++var22;
                     var23 = (class598)class265.field3654.method3484(0);
                  } while(var23 != null);
               }

               if (class491.field7031 == null) {
                  break label217;
               }

               int var10001;
               int var10002;
               int var10003;
               label130: {
                  int var25 = 0;
                  class32 var26 = (class32)class491.field7031.field8795.method3488((byte)-128);
                  if (var2) {
                     var10000 = var10 + 13;
                     var10001 = class380.field5479;
                     var10002 = var25;
                     var10003 = 16;
                  } else if (var26 == null) {
                     var10000 = class535.field7631;
                     var10001 = class25.field405;
                     var10002 = class380.field5479;
                     var10003 = class100.field1286;
                     if (!var2) {
                        break label130;
                     }
                  } else {
                     var10000 = var10 + 13;
                     var10001 = class380.field5479;
                     var10002 = var25;
                     var10003 = 16;
                  }

                  while(true) {
                     int var27 = var10000 + var10001 + var10002 * var10003;
                     class543.method3906(class100.field1286, var12, 26, var26, class25.field405, class535.field7631, class139.field1770 | -16777216, var11, var27, -16777216 | class507.field7385, arg0, class380.field5479);
                     ++var25;
                     var26 = (class32)class491.field7031.field8795.method3484(0);
                     if (var26 == null) {
                        var10000 = class535.field7631;
                        var10001 = class25.field405;
                        var10002 = class380.field5479;
                        var10003 = class100.field1286;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var10 + 13;
                        var10001 = class380.field5479;
                        var10002 = var25;
                        var10003 = 16;
                     }
                  }
               }

               class274.method2090(var10000, var10001, var10002, var10003, -4945);
               if (!var2) {
                  break label217;
               }
            }

            int var28 = 0;
            class32 var29 = (class32)class627.field9216.method2933(2);
            if (var2 || var29 != null) {
               do {
                  int var30 = 13 - -((-var28 + class278.field3784 + -1) * 16) + var7 + var10;
                  class543.method3906(var6, var12, -109, var29, var8, var9, -16777216 | class139.field1770, var11, var30, -16777216 | class507.field7385, arg0, var7);
                  ++var28;
                  var29 = (class32)class627.field9216.method2940(false);
               } while(var29 != null);
            }
         }

         class274.method2090(class357.field4796, class285.field3949, class305.field4177 + var5, class185.field2624 + var4, -4945);
      } catch (RuntimeException var32) {
         throw class237.method1823(var32, field6721[1] + (arg0 != null ? field6721[0] : field6721[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3390(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3391(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
