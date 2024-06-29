import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class272 extends class22 {
   @OriginalMember(
      owner = "client!oba",
      name = "o",
      descriptor = "Luba;"
   )
   public class451 field3851;
   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3855 = new String[]{method2152(method2151("F*\u0006g\u0005@&\u000e=\u0007\u0001")), method2152(method2151("G=\u000b%")), method2152(method2151("RfIgD")), method2152(method2151("F*\u0006gz\u0001")), method2152(method2151("F*\u0006g}\u0001")), method2152(method2151("\\$")), method2152(method2151("\\%")), method2152(method2151("F*\u0006g{\u0001")), method2152(method2151("F*\u0006gx\u0001"))};
   @OriginalMember(
      owner = "client!oba",
      name = "k",
      descriptor = "I"
   )
   public static int field3849;
   @OriginalMember(
      owner = "client!oba",
      name = "l",
      descriptor = "I"
   )
   public static int field3850;
   @OriginalMember(
      owner = "client!oba",
      name = "n",
      descriptor = "I"
   )
   public static int field3852;
   @OriginalMember(
      owner = "client!oba",
      name = "m",
      descriptor = "I"
   )
   public static int field3853;
   @OriginalMember(
      owner = "client!oba",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field3854;

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2147(byte arg0) {
      try {
         ++field3850;

         try {
            if (arg0 < -15) {
               if (~class203.field3034 == -2) {
                  int var1 = class657.field9595.method4302(-20607);
                  if (var1 > 0 && class657.field9595.method4288(30244)) {
                     int var2 = var1 - class217.field3288;
                     if (~var2 > -1) {
                        var2 = 0;
                     }

                     class657.field9595.method4321(var2, (byte)107);
                     return;
                  }

                  label49: {
                     class657.field9595.method4287(38);
                     class657.field9595.method4308((byte)22);
                     if (class710.field10318 == null) {
                        class203.field3034 = 0;
                        if (!client.field4564) {
                           break label49;
                        }
                     }

                     class203.field3034 = 2;
                  }

                  class436.field6297 = null;
                  class535.field7789 = null;
               }

               if (class203.field3034 == 3) {
                  int var3 = class657.field9595.method4302(-20607);
                  if (class435.field6292 > var3 && class657.field9595.method4288(30244)) {
                     int var4 = class66.field1222 + var3;
                     if (~class435.field6292 > ~var4) {
                        var4 = class435.field6292;
                     }

                     class657.field9595.method4321(var4, (byte)114);
                  } else {
                     class66.field1222 = 0;
                     class203.field3034 = 0;
                  }
               }
            }
         } catch (Exception var7) {
            var7.printStackTrace();
            class657.field9595.method4287(38);
            class436.field6297 = null;
            class710.field10318 = null;
            class548.field7918 = null;
            class535.field7789 = null;
            class203.field3034 = 0;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3855[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2148(int arg0) {
      boolean var1 = client.field4564;

      try {
         class22.method155((byte)-110, class510.field7454.field11163.method4660(false));
         ++field3849;
         int var2 = (class583.field8442 >> 12) + (class347.field4939 >> 3);
         int var3 = (class753.field10887 >> 3) + (class677.field9932 >> 12);
         class731.field10504 = class304.field4398.field4090 = 0;
         class304.field4398.method3437(-128, 8, 8);
         byte var4 = 18;
         if (arg0 != 100) {
            field3854 = null;
         }

         int var7;
         label66: {
            class213.field3183 = new int[var4];
            class131.field2180 = new int[var4];
            class733.field10553 = new int[var4];
            class360.field5391 = new byte[var4][];
            class631.field9200 = new int[var4];
            class629.field9178 = new int[var4];
            class205.field3058 = new int[var4];
            class719.field10376 = new byte[var4][];
            class245.field3526 = new byte[var4][];
            class64.field1171 = new byte[var4][];
            class487.field7079 = new int[var4][4];
            class756.field10978 = new byte[var4][];
            int var5 = 0;
            int var6 = (-(class209.field3112 >> 4) + var2) / 8;
            if (var1) {
               var7 = (-(class1.field3 >> 4) + var3) / 8;
            } else if (((class209.field3112 >> 4) + var2) / 8 < var6) {
               var7 = var5;
               if (!var1) {
                  break label66;
               }
            } else {
               var7 = (-(class1.field3 >> 4) + var3) / 8;
            }

            while(true) {
               if (var1 || var7 <= ((class1.field3 >> 4) + var3) / 8) {
                  do {
                     int var8 = (var6 << 8) - -var7;
                     class733.field10553[var5] = var8;
                     class205.field3058[var5] = class515.field7506.method1329(arg0 + -101, "m" + var6 + "_" + var7);
                     class213.field3183[var5] = class515.field7506.method1329(-1, "l" + var6 + "_" + var7);
                     class629.field9178[var5] = class515.field7506.method1329(-1, "n" + var6 + "_" + var7);
                     class131.field2180[var5] = class515.field7506.method1329(-1, field3855[6] + var6 + "_" + var7);
                     class631.field9200[var5] = class515.field7506.method1329(-1, field3855[5] + var6 + "_" + var7);
                     if (~class629.field9178[var5] == 0) {
                        class205.field3058[var5] = -1;
                        class213.field3183[var5] = -1;
                        class131.field2180[var5] = -1;
                        class631.field9200[var5] = -1;
                     }

                     ++var5;
                     ++var7;
                  } while(var7 <= ((class1.field3 >> 4) + var3) / 8);
               }

               ++var6;
               if (((class209.field3112 >> 4) + var2) / 8 < var6) {
                  var7 = var5;
                  if (!var1) {
                     break;
                  }
               } else {
                  var7 = (-(class1.field3 >> 4) + var3) / 8;
               }
            }
         }

         if (var1) {
            class629.field9178[var7] = -1;
            class205.field3058[var7] = -1;
            class213.field3183[var7] = -1;
            class131.field2180[var7] = -1;
            class631.field9200[var7] = -1;
            ++var7;
         }

         while(true) {
            while(var7 < class629.field9178.length) {
               class629.field9178[var7] = -1;
               class205.field3058[var7] = -1;
               class213.field3183[var7] = -1;
               class131.field2180[var7] = -1;
               class631.field9200[var7] = -1;
               ++var7;
            }

            if (!var1) {
               byte var9;
               label37: {
                  if (class376.field5588 == 3) {
                     var9 = 4;
                     if (!var1) {
                        break label37;
                     }
                  }

                  var9 = 8;
               }

               class668.method4882(false, var9, 0, var2, var3);
               return;
            }

            ++var7;
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field3855[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method2149(int arg0, String arg1) {
      boolean var2 = client.field4564;

      try {
         ++field3852;
         if (!class342.field4858.field9456) {
            return -1;
         } else if (class74.field1312.containsKey(arg1)) {
            return 100;
         } else {
            String var3 = class624.method4570(arg1, (byte)64);
            if (var3 == null) {
               return -1;
            } else {
               String var4 = class649.field9415 + var3;
               if (!class599.field8637.method1336("", var4, -1)) {
                  return -1;
               } else if (!class599.field8637.method1320(var4, -77)) {
                  return class599.field8637.method1350(var4, (byte)-58);
               } else {
                  byte[] var5 = class599.field8637.method1348(var4, "", 116);
                  Object var6 = null;

                  File var7;
                  try {
                     var7 = class286.method2224((byte)-127, var3);
                     if (arg0 >= -44) {
                        field3853 = 99;
                     }
                  } catch (RuntimeException var12) {
                     return -1;
                  }

                  if (var5 != null && var7 != null) {
                     boolean var8;
                     label107: {
                        var8 = true;
                        byte[] var9 = class486.method3672(var7, false);
                        if (var9 == null || ~var5.length != ~var9.length) {
                           var8 = false;
                           if (!var2) {
                              break label107;
                           }
                        }

                        int var10 = 0;
                        if (var2 || ~var9.length < ~var10) {
                           do {
                              if (~var5[var10] != ~var9[var10]) {
                                 var8 = false;
                                 if (!var2) {
                                    break;
                                 }
                              }

                              ++var10;
                           } while(~var9.length < ~var10);
                        }
                     }

                     try {
                        if (!var8) {
                           class342.field4858.method4781(var7, var5, (byte)72);
                        }
                     } catch (Throwable var13) {
                        return -1;
                     }

                     class599.method4426(arg1, var7, 127);
                     return 100;
                  } else {
                     return -1;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field3855[3] + arg0 + ',' + (arg1 != null ? field3855[2] : field3855[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2150(int arg0) {
      try {
         if (arg0 != -1) {
            field3854 = null;
         }

         field3854 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3855[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "<init>",
      descriptor = "(Luba;)V"
   )
   public class272(class451 arg0) {
      try {
         this.field3851 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3855[0] + (arg0 != null ? field3855[2] : field3855[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2151(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2152(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
