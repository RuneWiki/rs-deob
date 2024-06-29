import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class272 extends class96 {
   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "I"
   )
   public int field4151;
   @OriginalMember(
      owner = "client!tea",
      name = "t",
      descriptor = "I"
   )
   public int field4160;
   @OriginalMember(
      owner = "client!tea",
      name = "s",
      descriptor = "J"
   )
   public long field4166;
   @OriginalMember(
      owner = "client!tea",
      name = "D",
      descriptor = "I"
   )
   public int field4159;
   @OriginalMember(
      owner = "client!tea",
      name = "r",
      descriptor = "J"
   )
   public long field4155;
   @OriginalMember(
      owner = "client!tea",
      name = "G",
      descriptor = "Z"
   )
   public boolean field4165;
   @OriginalMember(
      owner = "client!tea",
      name = "I",
      descriptor = "Ljava/lang/String;"
   )
   public String field4152;
   @OriginalMember(
      owner = "client!tea",
      name = "F",
      descriptor = "I"
   )
   public int field4163;
   @OriginalMember(
      owner = "client!tea",
      name = "x",
      descriptor = "I"
   )
   public int field4161;
   @OriginalMember(
      owner = "client!tea",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   public String field4162;
   @OriginalMember(
      owner = "client!tea",
      name = "y",
      descriptor = "Z"
   )
   public boolean field4153;
   @OriginalMember(
      owner = "client!tea",
      name = "H",
      descriptor = "Z"
   )
   public boolean field4157;
   @OriginalMember(
      owner = "client!tea",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4167 = new String[]{method2312(method2311(";\b>e")), method2312(method2311("!\u00183'\u0007<\u0013;}\u0005}")), method2312(method2311(".S|'F")), method2312(method2311("!\u00183'z}")), method2312(method2311("!\u00183'y}")), method2312(method2311("!\u00183'x}"))};
   @OriginalMember(
      owner = "client!tea",
      name = "w",
      descriptor = "Lhha;"
   )
   public static class724 field4150 = new class724(123, 1);
   @OriginalMember(
      owner = "client!tea",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field4164 = false;
   @OriginalMember(
      owner = "client!tea",
      name = "A",
      descriptor = "Lhha;"
   )
   public static class724 field4158 = new class724(128, 6);
   @OriginalMember(
      owner = "client!tea",
      name = "u",
      descriptor = "I"
   )
   public static int field4149;
   @OriginalMember(
      owner = "client!tea",
      name = "E",
      descriptor = "I"
   )
   public static int field4156;
   @OriginalMember(
      owner = "client!tea",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   public String field4154;

   @OriginalMember(
      owner = "client!tea",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2308(byte arg0) {
      try {
         field4150 = null;
         if (arg0 != 7) {
            method2309((char)65500, 73);
         }

         field4158 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4167[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(CI)C"
   )
   public static final char method2309(char arg0, int arg1) {
      try {
         ++field4149;
         if (arg0 == 198) {
            return 'E';
         } else if (arg0 == 230) {
            return 'e';
         } else if (arg0 == 223) {
            return 's';
         } else if (arg0 == 338) {
            return 'E';
         } else {
            if (arg1 != 255) {
               method2308((byte)57);
            }

            return (char)(~arg0 == -340 ? 'e' : '\u0000');
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4167[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method2310(class17 arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field4156;
         int var3 = 0;
         int var4 = 0;
         if (class563.field8012) {
            var3 = class425.method3319(0);
            var4 = class630.method4620((byte)85);
         }

         int var5;
         int var6;
         int var7;
         int var8;
         byte var9;
         int var10;
         int var11;
         int var10000;
         int var10002;
         label232: {
            var5 = class752.field10679 - -var3;
            var6 = class133.field2180 + var4;
            var7 = class587.field8249;
            var8 = class685.field9890 - 3;
            var9 = 20;
            class776.method5604(-65, class133.field2180 - -var4, class685.field9890, arg0, var9, class752.field10679 + var3, class587.field8249, class765.field10927.method5512(-2, class777.field11340));
            var10 = class387.field5645.method1549(-71) - -var3;
            var11 = class387.field5645.method1560((byte)111) + var4;
            if (!class392.field5703) {
               int var12 = 0;
               class272 var13 = (class272)class594.field8377.method2245((byte)-94);
               if (var2 || var13 != null) {
                  do {
                     int var14 = var6 + var9 - (-13 - (class687.field9909 - (1 - -var12)) * 16);
                     ++var12;
                     if (~var10 < ~(class752.field10679 + var3) && var10 < class587.field8249 + var3 + class752.field10679 && var11 > var14 + -13 && var14 - -4 > var11 && var13.field4165) {
                        arg0.method226(class752.field10679 + var3, var14 + -12, class587.field8249, 16, -class791.field11524 + 255 << 24 | class448.field6523, 1);
                     }

                     var13 = (class272)class594.field8377.method2239((byte)109);
                  } while(var13 != null);
               }

               if (!var2) {
                  break label232;
               }
            }

            int var15 = 0;
            class211 var16 = (class211)class142.field2268.method5225(true);
            if (var2 || var16 != null) {
               do {
                  int var17 = var15 * 16 + var6 + 13 + var9;
                  if (class752.field10679 + var3 < var10 && ~var10 > ~(class752.field10679 - (-class587.field8249 + -var3)) && ~(var17 + -13) > ~var11 && ~(var17 + 4) < ~var11 && (~var16.field3008 < -2 || ((class272)var16.field3011.field10341.field1553).field4165)) {
                     arg0.method226(class752.field10679 + var3, var17 + -12, class587.field8249, 16, class448.field6523 | -class791.field11524 + 255 << 24, 1);
                  }

                  ++var15;
                  var16 = (class211)class142.field2268.method5227(-17856);
               } while(var16 != null);
            }

            if (class562.field8001 != null) {
               byte var10001;
               label171: {
                  class776.method5604(-91, class674.field9446, class134.field2185, arg0, var9, class552.field7876, class128.field2047, class562.field8001.field3012);
                  int var18 = 0;
                  class272 var19 = (class272)class562.field8001.field3011.method5225(true);
                  if (var2) {
                     var10000 = class674.field9446 - -13 + var9;
                     var10001 = 16;
                     var10002 = var18;
                  } else if (var19 == null) {
                     var10000 = class128.field2047;
                     var10001 = var9;
                     var10002 = 1;
                     if (!var2) {
                        break label171;
                     }
                  } else {
                     var10000 = class674.field9446 - -13 + var9;
                     var10001 = 16;
                     var10002 = var18;
                  }

                  while(true) {
                     int var20 = var10000 + var10001 * var10002;
                     ++var18;
                     if (~class552.field7876 > ~var10 && ~(class552.field7876 + class128.field2047) < ~var10 && var20 + -13 < var11 && var20 + 4 > var11 && var19.field4165) {
                        arg0.method226(class552.field7876, var20 + -12, class128.field2047, 16, class448.field6523 | -class791.field11524 + 255 << 24, 1);
                     }

                     var19 = (class272)class562.field8001.field3011.method5227(-17856);
                     if (var19 == null) {
                        var10000 = class128.field2047;
                        var10001 = var9;
                        var10002 = 1;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = class674.field9446 - -13 + var9;
                        var10001 = 16;
                        var10002 = var18;
                     }
                  }
               }

               class61.method622(var10000, var10001, (boolean)var10002, arg0, class134.field2185, class552.field7876, class674.field9446);
            }
         }

         if (arg1 >= -111) {
            field4150 = null;
         }

         label221: {
            class61.method622(class587.field8249, var9, true, arg0, class685.field9890, class752.field10679 + var3, class133.field2180 + var4);
            if (class392.field5703) {
               int var21 = 0;
               class211 var22 = (class211)class142.field2268.method5225(true);
               if (var2 || var22 != null) {
                  do {
                     label146: {
                        int var23 = var21 * 16 + class133.field2180 + var4 - -var9 + 13;
                        ++var21;
                        if (~var22.field3008 == -2) {
                           class526.method3942(var23, class690.field9937 | -16777216, arg0, class133.field2180 + var4, class94.field1532 | -16777216, class685.field9890, class587.field8249, (class272)var22.field3011.field10341.field1553, var10, var11, 5, class752.field10679 + var3);
                           if (!var2) {
                              break label146;
                           }
                        }

                        class537.method4003(var11, (byte)-73, -16777216 | class690.field9937, var23, var10, class685.field9890, class133.field2180 + var4, class94.field1532 | -16777216, arg0, class752.field10679 + var3, class587.field8249, var22);
                     }

                     var22 = (class211)class142.field2268.method5227(-17856);
                  } while(var22 != null);
               }

               if (class562.field8001 == null) {
                  break label221;
               }

               int var32;
               label133: {
                  int var24 = 0;
                  class272 var25 = (class272)class562.field8001.field3011.method5225(true);
                  if (var2) {
                     var10000 = var24 * 16;
                     var32 = 13;
                     var10002 = class674.field9446;
                  } else if (var25 == null) {
                     var10000 = -29;
                     var32 = class128.field2047;
                     var10002 = class674.field9446;
                     if (!var2) {
                        break label133;
                     }
                  } else {
                     var10000 = var24 * 16;
                     var32 = 13;
                     var10002 = class674.field9446;
                  }

                  while(true) {
                     int var26 = var10000 + var32 + var10002 + var9;
                     class526.method3942(var26, -16777216 | class690.field9937, arg0, class674.field9446, -16777216 | class94.field1532, class134.field2185, class128.field2047, var25, var10, var11, 5, class552.field7876);
                     ++var24;
                     var25 = (class272)class562.field8001.field3011.method5227(-17856);
                     if (var25 == null) {
                        var10000 = -29;
                        var32 = class128.field2047;
                        var10002 = class674.field9446;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var24 * 16;
                        var32 = 13;
                        var10002 = class674.field9446;
                     }
                  }
               }

               class480.method3673(var10000, var32, var10002, class552.field7876, class134.field2185);
               if (!var2) {
                  break label221;
               }
            }

            int var27 = 0;
            class272 var28 = (class272)class594.field8377.method2245((byte)-94);
            if (var2 || var28 != null) {
               do {
                  int var29 = (class687.field9909 + -1 + -var27) * 16 + var6 + var9 + 13;
                  ++var27;
                  class526.method3942(var29, class690.field9937 | -16777216, arg0, var6, -16777216 | class94.field1532, var8, var7, var28, var10, var11, 5, var5);
                  var28 = (class272)class594.field8377.method2239((byte)92);
               } while(var28 != null);
            }
         }

         class480.method3673(-58, class587.field8249, class133.field2180 + var4, class752.field10679 + var3, class685.field9890);
      } catch (RuntimeException var31) {
         throw class612.method4503(var31, field4167[4] + (arg0 != null ? field4167[2] : field4167[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V"
   )
   public class272(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
      try {
         this.field4151 = arg7;
         this.field4160 = arg2;
         this.field4166 = arg5;
         this.field4159 = arg3;
         this.field4155 = arg10;
         this.field4165 = arg8;
         this.field4152 = arg1;
         this.field4163 = arg6;
         this.field4161 = arg4;
         this.field4162 = arg0;
         this.field4153 = arg11;
         this.field4157 = arg9;
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field4167[1] + (arg0 != null ? field4167[2] : field4167[0]) + ',' + (arg1 != null ? field4167[2] : field4167[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2311(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2312(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
