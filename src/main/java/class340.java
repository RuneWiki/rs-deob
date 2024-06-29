import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class340 {
   @OriginalMember(
      owner = "client!vl",
      name = "e",
      descriptor = "Liw;"
   )
   private class107 field5006 = new class107(128);
   @OriginalMember(
      owner = "client!vl",
      name = "h",
      descriptor = "Lsa;"
   )
   private class39 field5013;
   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5015 = new String[]{method2712(method2711("]S\"F.")), method2712(method2711("]S\"A.")), method2712(method2711("]S\"C.")), method2712(method2711("EJ`n")), method2712(method2711("P\u0011\",{")), method2712(method2711("]S\"D.")), method2712(method2711("]S\">oEVx<.")), method2712(method2711("]S\"E.")), method2712(method2711("]S\"G.")), method2712(method2711("]S\"@."))};
   @OriginalMember(
      owner = "client!vl",
      name = "i",
      descriptor = "I"
   )
   public static int field5003 = 0;
   @OriginalMember(
      owner = "client!vl",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field5005 = new int[64];
   @OriginalMember(
      owner = "client!vl",
      name = "d",
      descriptor = "I"
   )
   public static int field5004;
   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "I"
   )
   public static int field5007;
   @OriginalMember(
      owner = "client!vl",
      name = "k",
      descriptor = "I"
   )
   public static int field5008;
   @OriginalMember(
      owner = "client!vl",
      name = "c",
      descriptor = "I"
   )
   public static int field5009;
   @OriginalMember(
      owner = "client!vl",
      name = "f",
      descriptor = "I"
   )
   public static int field5010;
   @OriginalMember(
      owner = "client!vl",
      name = "g",
      descriptor = "I"
   )
   public static int field5011;
   @OriginalMember(
      owner = "client!vl",
      name = "j",
      descriptor = "I"
   )
   public static int field5012;
   @OriginalMember(
      owner = "client!vl",
      name = "l",
      descriptor = "I"
   )
   public static int field5014;

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2704(byte arg0) {
      try {
         class107 var2 = this.field5006;
         synchronized(this.field5006) {
            this.field5006.method1052(true);
         }

         ++field5014;
         if (arg0 < 7) {
            this.method2709(-12);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5015[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2705(int arg0, int arg1) {
      try {
         class107 var3 = this.field5006;
         synchronized(this.field5006) {
            this.field5006.method1048(arg0, -8543);
            if (arg1 != 1314) {
               this.method2708(-21, (byte)50);
            }
         }

         ++field5010;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5015[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2706(int arg0) {
      try {
         field5005 = null;
         if (arg0 != 2) {
            method2710(113, (String)null, true);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5015[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(Lda;Ljga;ILwm;ILjava/lang/String;BILaa;III)V"
   )
   public static final void method2707(class216 arg0, class91 arg1, int arg2, class440 arg3, int arg4, String arg5, byte arg6, int arg7, class684 arg8, int arg9, int arg10, int arg11) {
      try {
         int var12;
         label67: {
            ++field5009;
            if (~class306.field4639 != -5) {
               var12 = (int)class86.field1312 - -class647.field9122 & 16383;
               if (!client.field10022) {
                  break label67;
               }
            }

            var12 = (int)class86.field1312 & 16383;
         }

         int var13 = 10 + Math.max(arg1.field1513 / 2, arg1.field1452 / 2);
         int var14 = arg7 * arg7 + arg11 * arg11;
         if (arg6 == -101) {
            if (var13 * var13 >= var14) {
               int var15 = class160.field2447[var12];
               int var16 = class160.field2446[var12];
               if (~class306.field4639 != -5) {
                  var15 = var15 * 256 / (class455.field6620 + 256);
                  var16 = var16 * 256 / (class455.field6620 + 256);
               }

               int var17 = arg7 * var16 + arg11 * var15 >> 14;
               int var18 = arg11 * var16 + -(arg7 * var15) >> 14;
               int var19 = arg3.method3431(arg5, 100, (class148[])null, 127);
               int var20 = arg3.method3424(arg5, (class148[])null, -119, 100, 0);
               int var21 = var17 - var19 / 2;
               if (var21 >= -arg1.field1513 && var21 <= arg1.field1513 && -arg1.field1452 <= var18 && arg1.field1452 >= var18) {
                  arg0.method1870(arg4, (int[])null, 0, arg1.field1452 / 2 + -var18 + -var20 + -arg10 + arg2, 1, arg1.field1513 / 2 + (var21 - -arg4), 0, 0, arg9, arg8, arg5, var19, (byte)-124, (class148[])null, 50, arg2);
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field5015[2] + (arg0 != null ? field5015[4] : field5015[3]) + ',' + (arg1 != null ? field5015[4] : field5015[3]) + ',' + arg2 + ',' + (arg3 != null ? field5015[4] : field5015[3]) + ',' + arg4 + ',' + (arg5 != null ? field5015[4] : field5015[3]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field5015[4] : field5015[3]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(IB)Lc;"
   )
   public final class266 method2708(int arg0, byte arg1) {
      try {
         ++field5004;
         class107 var3 = this.field5006;
         class266 var4;
         synchronized(this.field5006) {
            if (arg1 < 56) {
               this.field5013 = null;
            }

            var4 = (class266)this.field5006.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field5013;
            byte[] var6;
            synchronized(this.field5013) {
               var6 = this.field5013.method460((byte)-11, arg0, 1);
            }

            class266 var7 = new class266();
            if (var6 != null) {
               var7.method2278(false, new class65(var6));
            }

            class107 var8 = this.field5006;
            synchronized(this.field5006) {
               this.field5006.method1050(-71, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field5015[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2709(int arg0) {
      try {
         ++field5007;
         class107 var2 = this.field5006;
         synchronized(this.field5006) {
            if (arg0 <= 117) {
               method2710(123, (String)null, true);
            }

            this.field5006.method1045(3);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5015[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(ILjava/lang/String;Z)V"
   )
   public static final void method2710(int arg0, String arg1, boolean arg2) {
      boolean var3 = client.field10022;

      try {
         String var16 = arg1.toLowerCase();
         ++field5012;
         short[] var4 = new short[16];
         int var5 = 0;
         int var6 = arg2 ? 32768 : 0;
         int var7 = (arg2 ? class164.field2488.field1555 : class164.field2488.field1562) + var6;
         int var8 = var6;
         if (var3 || ~var7 < ~var6) {
            do {
               class365 var9 = class164.field2488.method967((byte)-93, var8);
               if (!var9.field5408) {
                  ++var8;
               } else if (var9.method2867((byte)118).toLowerCase().indexOf(var16) == -1) {
                  ++var8;
               } else {
                  if (~var5 <= -51) {
                     class455.field6611 = null;
                     class425.field6208 = -1;
                     return;
                  }

                  if (var4.length > var5) {
                     var4[var5++] = (short)var8;
                     ++var8;
                  } else {
                     short[] var10 = new short[var4.length * 2];
                     int var11 = 0;
                     if (var3) {
                        var10[var11] = var4[var11];
                        ++var11;
                     }

                     while(true) {
                        while(var5 > var11) {
                           var10[var11] = var4[var11];
                           ++var11;
                        }

                        if (!var3) {
                           var4 = var10;
                           var10[var5++] = (short)var8;
                           ++var8;
                           break;
                        }

                        var10[var11] = var4[var11];
                        ++var11;
                     }
                  }
               }
            } while(~var7 < ~var8);
         }

         class431.field6342 = 0;
         class425.field6208 = var5;
         class455.field6611 = var4;
         String[] var12 = new String[class425.field6208];
         int var13 = 0;
         if (var3) {
            var12[var13] = class164.field2488.method967((byte)-108, var4[var13]).method2867((byte)104);
            ++var13;
         }

         while(true) {
            while(var13 < class425.field6208) {
               var12[var13] = class164.field2488.method967((byte)-108, var4[var13]).method2867((byte)104);
               ++var13;
            }

            class609.method4486(class455.field6611, var12, true);
            if (!var3) {
               if (arg0 != -1) {
                  method2707((class216)null, (class91)null, 105, (class440)null, 99, (String)null, (byte)-71, -42, (class684)null, -85, 25, -20);
                  return;
               }

               return;
            }

            ++var13;
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field5015[7] + arg0 + ',' + (arg1 != null ? field5015[4] : field5015[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class340(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field5013 = arg2;
         this.field5013.method434((byte)-106, 1);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5015[6] + (arg0 != null ? field5015[4] : field5015[3]) + ',' + arg1 + ',' + (arg2 != null ? field5015[4] : field5015[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2711(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2712(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
