import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class89 {
   @OriginalMember(
      owner = "client!gv",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   private String field1452 = field1468[5];
   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1468 = new String[]{method877(method876("G>J>m")), method877(method876("G>J;m")), method877(method876("G>J3m")), method877(method876("G>J8m")), method877(method876("[fJT8")), method877(method876("N=\b\u0016")), method877(method876("G>J0m")), method877(method876("G>J=m")), method877(method876("G>J2m")), method877(method876("G>J<m")), method877(method876("G>J9m")), method877(method876("G>J1m")), method877(method876("G>J?m"))};
   @OriginalMember(
      owner = "client!gv",
      name = "q",
      descriptor = "Lgh;"
   )
   public static class572 field1464 = new class572(13, 6);
   @OriginalMember(
      owner = "client!gv",
      name = "f",
      descriptor = "Luw;"
   )
   public static class435 field1465 = new class435(59, 0);
   @OriginalMember(
      owner = "client!gv",
      name = "r",
      descriptor = "[F"
   )
   public static float[] field1466 = new float[16384];
   @OriginalMember(
      owner = "client!gv",
      name = "o",
      descriptor = "[F"
   )
   public static float[] field1467 = new float[16384];
   @OriginalMember(
      owner = "client!gv",
      name = "s",
      descriptor = "C"
   )
   public char field1449;
   @OriginalMember(
      owner = "client!gv",
      name = "m",
      descriptor = "C"
   )
   public char field1456;
   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "I"
   )
   private int field1446;
   @OriginalMember(
      owner = "client!gv",
      name = "b",
      descriptor = "I"
   )
   public static int field1447;
   @OriginalMember(
      owner = "client!gv",
      name = "u",
      descriptor = "I"
   )
   public static int field1451;
   @OriginalMember(
      owner = "client!gv",
      name = "j",
      descriptor = "I"
   )
   public static int field1453;
   @OriginalMember(
      owner = "client!gv",
      name = "n",
      descriptor = "I"
   )
   public static int field1454;
   @OriginalMember(
      owner = "client!gv",
      name = "t",
      descriptor = "I"
   )
   public static int field1455;
   @OriginalMember(
      owner = "client!gv",
      name = "c",
      descriptor = "I"
   )
   public static int field1457;
   @OriginalMember(
      owner = "client!gv",
      name = "v",
      descriptor = "I"
   )
   public static int field1458;
   @OriginalMember(
      owner = "client!gv",
      name = "l",
      descriptor = "I"
   )
   public static int field1459;
   @OriginalMember(
      owner = "client!gv",
      name = "p",
      descriptor = "I"
   )
   public static int field1460;
   @OriginalMember(
      owner = "client!gv",
      name = "k",
      descriptor = "I"
   )
   public static int field1461;
   @OriginalMember(
      owner = "client!gv",
      name = "i",
      descriptor = "I"
   )
   public static int field1462;
   @OriginalMember(
      owner = "client!gv",
      name = "d",
      descriptor = "I"
   )
   private int field1463;
   @OriginalMember(
      owner = "client!gv",
      name = "h",
      descriptor = "Lld;"
   )
   public class178 field1448;
   @OriginalMember(
      owner = "client!gv",
      name = "g",
      descriptor = "Lld;"
   )
   private class178 field1450;

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; ~var2 > -16385; ++var2) {
         field1466[var2] = (float)Math.sin((double)var2 * var0);
         field1467[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(ZLuda;)V",
      line = 3
   )
   public final void method865(boolean arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         if (!arg0) {
            while(true) {
               int var4 = arg1.method3564((byte)-66);
               if (var4 != 0) {
                  this.method875(arg1, (byte)28, var4);
                  if (var3) {
                     break;
                  }

                  if (!var3) {
                     continue;
                  }
               }

               ++field1447;
               break;
            }

         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1468[3] + arg0 + ',' + (arg1 != null ? field1468[4] : field1468[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(Ljfa;IIB)V",
      line = 25
   )
   public static final void method866(class303 arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field1460;
         class510 var4 = arg0.method2357(-10680, class444.field6473);
         if (var4 != null) {
            class444.field6473.method333(arg2, arg1, arg0.field4308 + arg2, arg0.field4226 + arg1);
            int var5 = -69 / ((18 - arg3) / 41);
            if (class733.field10534 >= 3) {
               class444.field6473.method260(-16777216, var4, arg2, arg1);
            } else {
               class497.field7269.method3600((float)arg0.field4308 / 2.0F + (float)arg2, (float)arg0.field4226 / 2.0F + (float)arg1, 4096, (16383 & (int)(-class756.field10975)) << 2, var4, arg2, arg1);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1468[6] + (arg0 != null ? field1468[4] : field1468[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(BI)I",
      line = 50
   )
   public static final int method867(byte arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field1459;
         double var3 = (double)((16771349 & arg1) >> 16) / 256.0D;
         double var5 = (double)((arg1 & 65313) >> 8) / 256.0D;
         double var7 = (double)(255 & arg1) / 256.0D;
         double var9 = var3;
         if (var3 > var5) {
            var9 = var5;
         }

         if (var9 > var7) {
            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            var11 = var5;
         }

         if (var7 > var11) {
            var11 = var7;
         }

         if (arg0 != 74) {
            field1467 = null;
         }

         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = (var9 + var11) / 2.0D;
         if (var9 != var11) {
            if (var17 < 0.5D) {
               var15 = (var11 - var9) / (var9 + var11);
            }

            label108: {
               if (var3 == var11) {
                  var13 = (-var7 + var5) / (-var9 + var11);
                  if (!var2) {
                     break label108;
                  }
               }

               if (var5 != var11) {
                  if (var7 != var11) {
                     break label108;
                  }

                  var13 = (-var5 + var3) / (var11 - var9) + 4.0D;
                  if (!var2) {
                     break label108;
                  }
               }

               var13 = (-var3 + var7) / (var11 - var9) + 2.0D;
            }

            if (var17 >= 0.5D) {
               var15 = (var11 - var9) / (2.0D - var11 + -var9);
            }
         }

         int var21;
         int var22;
         label82: {
            double var19 = var13 / 6.0D;
            var21 = (int)(var19 * 256.0D);
            var22 = (int)(var15 * 256.0D);
            if (var22 < 0) {
               var22 = 0;
               if (!var2) {
                  break label82;
               }
            }

            if (~var22 < -256) {
               var22 = 255;
            }
         }

         int var23;
         label77: {
            var23 = (int)(var17 * 256.0D);
            if (var23 < 0) {
               var23 = 0;
               if (!var2) {
                  break label77;
               }
            }

            if (var23 > 255) {
               var23 = 255;
            }
         }

         if (var23 <= 243) {
            if (~var23 < -218) {
               var22 >>= 3;
               if (!var2) {
                  return (var22 >> 5 << 7) + ((63 & var21 >> 2) << 10) + (var23 >> 1);
               }
            }

            if (var23 <= 192) {
               if (~var23 >= -180) {
                  return (var22 >> 5 << 7) + ((63 & var21 >> 2) << 10) + (var23 >> 1);
               }

               var22 >>= 1;
               if (!var2) {
                  return (var22 >> 5 << 7) + ((63 & var21 >> 2) << 10) + (var23 >> 1);
               }
            }

            var22 >>= 2;
            if (!var2) {
               return (var22 >> 5 << 7) + ((63 & var21 >> 2) << 10) + (var23 >> 1);
            }
         }

         var22 >>= 4;
         return (var22 >> 5 << 7) + ((63 & var21 >> 2) << 10) + (var23 >> 1);
      } catch (RuntimeException var25) {
         throw class608.method4462(var25, field1468[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(II)I",
      line = 157
   )
   public final int method868(int arg0, int arg1) {
      try {
         ++field1454;
         if (this.field1448 == null) {
            return this.field1463;
         } else {
            if (arg1 != -16385) {
               this.field1449 = '5';
            }

            class459 var3 = (class459)this.field1448.method1572((long)arg0, -16289);
            return var3 == null ? this.field1463 : var3.field6727;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1468[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "b",
      descriptor = "(II)Ljava/lang/String;",
      line = 177
   )
   public final String method869(int arg0, int arg1) {
      try {
         ++field1458;
         if (this.field1448 == null) {
            return this.field1452;
         } else if (arg0 != 1) {
            return null;
         } else {
            class266 var3 = (class266)this.field1448.method1572((long)arg1, -16289);
            return var3 == null ? this.field1452 : var3.field3782;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1468[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(B)V",
      line = 206
   )
   private final void method870(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field1461;
         this.field1450 = new class178(this.field1448.method1576(0));
         if (arg0 < 80) {
            method867((byte)-82, 72);
         }

         class266 var3 = (class266)this.field1448.method1567((byte)-44);
         if (var2 || var3 != null) {
            do {
               class60 var4 = new class60(var3.field3782, (int)var3.field347);
               this.field1450.method1566(var4, 24742, class778.method5631((byte)125, var3.field3782));
               var3 = (class266)this.field1448.method1575((byte)-125);
            } while(var3 != null);

         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1468[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "b",
      descriptor = "(I)V",
      line = 229
   )
   public static void method871(int arg0) {
      try {
         field1467 = null;
         field1464 = null;
         if (arg0 >= -87) {
            field1464 = null;
         }

         field1465 = null;
         field1466 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1468[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(IB)Z",
      line = 242
   )
   public final boolean method872(int arg0, byte arg1) {
      try {
         ++field1451;
         if (arg1 != 46) {
            return false;
         } else if (this.field1448 == null) {
            return false;
         } else {
            if (this.field1450 == null) {
               this.method874(6);
            }

            class459 var3 = (class459)this.field1450.method1572((long)arg0, -16289);
            return var3 != null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1468[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)Z",
      line = 269
   )
   public final boolean method873(String arg0, boolean arg1) {
      boolean var3 = client.field4564;

      try {
         if (!arg1) {
            this.field1449 = (char)65458;
         }

         ++field1453;
         if (this.field1448 == null) {
            return false;
         } else {
            if (this.field1450 == null) {
               this.method870((byte)84);
            }

            class60 var4 = (class60)this.field1450.method1572(class778.method5631((byte)125, arg0), -16289);
            if (var3) {
               if (var4.field1139.equals(arg0)) {
                  return true;
               }

               var4 = (class60)this.field1450.method1568(0);
            }

            while(true) {
               boolean var10000;
               if (var4 == null) {
                  var10000 = false;
                  if (!var3) {
                     return false;
                  }
               } else {
                  var10000 = var4.field1139.equals(arg0);
               }

               if (var10000) {
                  return true;
               }

               var4 = (class60)this.field1450.method1568(0);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1468[9] + (arg0 != null ? field1468[4] : field1468[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(I)V",
      line = 300
   )
   private final void method874(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 == 6) {
            this.field1450 = new class178(this.field1448.method1576(0));
            ++field1455;
            class459 var3 = (class459)this.field1448.method1567((byte)-44);
            if (var2 || var3 != null) {
               do {
                  class459 var4 = new class459((int)var3.field347);
                  this.field1450.method1566(var4, arg0 + 24736, (long)var3.field6727);
                  var3 = (class459)this.field1448.method1575((byte)-128);
               } while(var3 != null);

            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1468[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(Luda;BI)V",
      line = 323
   )
   private final void method875(class473 arg0, byte arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label83: {
            if (~arg2 == -2) {
               this.field1449 = class85.method847(16, arg0.method3543(-1132613840));
               if (!var4) {
                  break label83;
               }
            }

            if (arg2 != 2) {
               if (~arg2 == -4) {
                  this.field1452 = arg0.method3566(-16496688);
                  if (!var4) {
                     break label83;
                  }
               }

               if (~arg2 == -5) {
                  this.field1463 = arg0.method3567(31871);
                  if (!var4) {
                     break label83;
                  }
               }

               if (arg2 != 5 && ~arg2 != -7) {
                  break label83;
               }

               this.field1446 = arg0.method3565(true);
               this.field1448 = new class178(class71.method752(this.field1446, true));
               int var5 = 0;
               if (var4 || ~this.field1446 < ~var5) {
                  do {
                     int var6 = arg0.method3567(31871);
                     class22 var7;
                     if (~arg2 == -6) {
                        var7 = new class266(arg0.method3566(-16496688));
                        if (var4) {
                           var7 = new class459(arg0.method3567(31871));
                        }
                     } else {
                        var7 = new class459(arg0.method3567(31871));
                     }

                     this.field1448.method1566(var7, 24742, (long)var6);
                     ++var5;
                  } while(~this.field1446 < ~var5);
               }

               if (!var4) {
                  break label83;
               }
            }

            this.field1456 = class85.method847(16, arg0.method3543(arg1 ^ -1132613844));
         }

         if (arg1 != 28) {
            this.method874(-117);
         }

         ++field1462;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1468[12] + (arg0 != null ? field1468[4] : field1468[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method876(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method877(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
