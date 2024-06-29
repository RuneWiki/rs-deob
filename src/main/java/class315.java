import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class315 extends class297 {
   @OriginalMember(
      owner = "client!hc",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4876 = new String[]{method2617(method2616("\u0010/Xj*")), method2617(method2616("\u0010/Xo*")), method2617(method2616("\u00169\u001a@")), method2617(method2616("\u0010/Xh*")), method2617(method2616("\u0003bX\u0002\u007f")), method2617(method2616("\u0010/Xn*")), method2617(method2616("\u0010/Xd*")), method2617(method2616("\u0010/Xm*")), method2617(method2616("\b}Dsd\r \u001a")), method2617(method2616("\u001a}Dsd\r \u001a")), method2617(method2616("\b}Gsd\r \u001a")), method2617(method2616("\u0010/Xk*"))};
   @OriginalMember(
      owner = "client!hc",
      name = "x",
      descriptor = "I"
   )
   public static int field4864 = -1;
   @OriginalMember(
      owner = "client!hc",
      name = "u",
      descriptor = "I"
   )
   public static int field4863;
   @OriginalMember(
      owner = "client!hc",
      name = "y",
      descriptor = "I"
   )
   public static int field4866;
   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "I"
   )
   public static int field4867;
   @OriginalMember(
      owner = "client!hc",
      name = "D",
      descriptor = "I"
   )
   public static int field4870;
   @OriginalMember(
      owner = "client!hc",
      name = "F",
      descriptor = "I"
   )
   public static int field4872;
   @OriginalMember(
      owner = "client!hc",
      name = "v",
      descriptor = "I"
   )
   public static int field4874;
   @OriginalMember(
      owner = "client!hc",
      name = "w",
      descriptor = "I"
   )
   public static int field4875;
   @OriginalMember(
      owner = "client!hc",
      name = "G",
      descriptor = "Ljava/lang/String;"
   )
   public String field4868;
   @OriginalMember(
      owner = "client!hc",
      name = "E",
      descriptor = "[C"
   )
   public char[] field4865;
   @OriginalMember(
      owner = "client!hc",
      name = "B",
      descriptor = "[C"
   )
   public char[] field4871;
   @OriginalMember(
      owner = "client!hc",
      name = "C",
      descriptor = "[I"
   )
   public int[] field4869;
   @OriginalMember(
      owner = "client!hc",
      name = "A",
      descriptor = "[I"
   )
   public int[] field4873;

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(ILica;)V",
      line = 5
   )
   public final void method2608(int arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 == 7) {
            while(true) {
               int var4 = arg1.method2855(-31007);
               if (~var4 != -1) {
                  this.method2614(var4, (byte)119, arg1);
                  if (var3) {
                     break;
                  }

                  if (!var3) {
                     continue;
                  }
               }

               ++field4867;
               break;
            }

         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4876[6] + arg0 + ',' + (arg1 != null ? field4876[4] : field4876[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(Lrr;B)V",
      line = 27
   )
   public static final void method2609(class678 arg0, byte arg1) {
      try {
         class633.field9161 = arg0.method4999(field4876[10], (byte)121);
         ++field4866;
         class20.field255 = arg0.method4999(field4876[8], (byte)96);
         if (arg1 <= -76) {
            class553.field8274 = arg0.method4999(field4876[9], (byte)114);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4876[11] + (arg0 != null ? field4876[4] : field4876[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(BC)I",
      line = 40
   )
   public final int method2610(byte arg0, char arg1) {
      boolean var3 = client.field1786;

      try {
         ++field4872;
         if (this.field4869 == null) {
            return -1;
         } else {
            int var4 = 0;
            if (var3) {
               if (~this.field4865[var4] == ~arg1) {
                  return this.field4869[var4];
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (var4 >= this.field4869.length) {
                  int var5 = -122 / ((24 - arg0) / 56);
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = ~this.field4865[var4];
               }

               if (var10000 == ~arg1) {
                  return this.field4869[var4];
               }

               ++var4;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4876[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(BII)B",
      line = 62
   )
   public static final byte method2611(byte arg0, int arg1, int arg2) {
      try {
         ++field4863;
         if (~arg2 != -10) {
            return 0;
         } else {
            if (arg0 < 40) {
               method2615(110, -38, -68, 68, (byte[][][])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, -38, (byte)71, -39, -106, true, true, 41, 69, false);
            }

            return (byte)((arg1 & 1) == 0 ? 1 : 2);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4876[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(Z)V",
      line = 83
   )
   public final void method2612(boolean arg0) {
      boolean var2 = client.field1786;

      try {
         ++field4875;
         if (this.field4869 != null) {
            int var3 = 0;
            if (var2 || ~var3 > ~this.field4869.length) {
               do {
                  this.field4869[var3] = class119.method1087(this.field4869[var3], 32768);
                  ++var3;
               } while(~var3 > ~this.field4869.length);
            }
         }

         if (this.field4873 != null) {
            int var4 = 0;
            if (var2 || var4 < this.field4873.length) {
               do {
                  this.field4873[var4] = class119.method1087(this.field4873[var4], 32768);
                  ++var4;
               } while(var4 < this.field4873.length);
            }
         }

         if (!arg0) {
            this.field4868 = null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4876[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IC)I",
      line = 120
   )
   public final int method2613(int arg0, char arg1) {
      boolean var3 = client.field1786;

      try {
         ++field4874;
         if (this.field4873 == null) {
            return -1;
         } else {
            int var4 = arg0;
            if (var3) {
               if (~this.field4871[arg0] == ~arg1) {
                  return this.field4873[arg0];
               }

               var4 = arg0 + 1;
            }

            while(true) {
               int var10000;
               if (this.field4873.length <= var4) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = ~this.field4871[var4];
               }

               if (var10000 == ~arg1) {
                  return this.field4873[var4];
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4876[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IBLica;)V",
      line = 146
   )
   private final void method2614(int arg0, byte arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label92: {
            ++field4870;
            if (arg0 == 1) {
               this.field4868 = arg2.method2843(-1);
               if (!var4) {
                  break label92;
               }
            }

            if (~arg0 == -3) {
               int var5 = arg2.method2855(-31007);
               this.field4873 = new int[var5];
               this.field4871 = new char[var5];
               int var6 = 0;
               byte var7;
               if (var4) {
                  this.field4873[var6] = arg2.method2848(-94);
                  var7 = arg2.method2886((byte)88);
                  this.field4871[var6] = var7 != 0 ? class424.method3361((byte)82, var7) : 0;
                  ++var6;
               }

               while(true) {
                  if (~var5 >= ~var6) {
                     if (!var4) {
                        if (!var4) {
                           break label92;
                        }
                        break;
                     }
                  } else {
                     this.field4873[var6] = arg2.method2848(-94);
                  }

                  var7 = arg2.method2886((byte)88);
                  this.field4871[var6] = var7 != 0 ? class424.method3361((byte)82, var7) : 0;
                  ++var6;
               }
            }

            if (arg0 == 3) {
               int var8 = arg2.method2855(-31007);
               this.field4869 = new int[var8];
               this.field4865 = new char[var8];
               int var9 = 0;
               if (var4 || ~var8 < ~var9) {
                  do {
                     this.field4869[var9] = arg2.method2848(-99);
                     byte var10 = arg2.method2886((byte)88);
                     this.field4865[var9] = ~var10 != -1 ? class424.method3361((byte)64, var10) : 0;
                     ++var9;
                  } while(~var8 < ~var9);
               }
            }
         }

         if (arg1 <= 67) {
            this.field4868 = null;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field4876[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4876[4] : field4876[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V",
      line = 209
   )
   public static final void method2615(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
      class665.field9966 = true;
      class535.field8107 = class546.field8193.method687() > 0;
      class492.field7436 = arg15;
      class487.field7409 = arg1 >> class394.field6180;
      class701.field10446 = arg3 >> class394.field6180;
      class109.field1501 = arg1;
      class228.field3491 = arg3;
      class761.field11248 = arg2;
      class356.field5484 = class487.field7409 - class382.field6038;
      if (class356.field5484 < 0) {
         class68.field899 = -class356.field5484;
         class356.field5484 = 0;
      } else {
         class68.field899 = 0;
      }

      class775.field11389 = class701.field10446 - class382.field6038;
      if (class775.field11389 < 0) {
         class471.field7169 = -class775.field11389;
         class775.field11389 = 0;
      } else {
         class471.field7169 = 0;
      }

      class713.field10706 = class487.field7409 + class382.field6038;
      if (class713.field10706 > class247.field3734) {
         class713.field10706 = class247.field3734;
      }

      class35.field421 = class701.field10446 + class382.field6038;
      if (class35.field421 > class365.field5634) {
         class35.field421 = class365.field5634;
      }

      boolean[][] var19 = class717.field10755;
      boolean[][] var20 = class247.field3755;
      if (class492.field7436) {
         for(int var21 = 0; var21 < class382.field6038 + class382.field6038 + 2; ++var21) {
            int var22 = 0;
            int var23 = 0;

            for(int var24 = 0; var24 < class382.field6038 + class382.field6038 + 2; ++var24) {
               if (var24 > 1) {
                  class56.field691[var24 - 2] = var22;
               }

               var22 = var23;
               int var25 = class487.field7409 - class382.field6038 + var21;
               int var26 = class701.field10446 - class382.field6038 + var24;
               if (var25 >= 0 && var26 >= 0 && var25 < class247.field3734 && var26 < class365.field5634) {
                  int var27 = var25 << class394.field6180;
                  int var28 = var26 << class394.field6180;
                  int var29 = class96.field1355[class96.field1355.length - 1].method2313(30, var25, var26) - (1000 << class394.field6180 - 7);
                  int var30 = (class190.field2949 != null ? class190.field2949[0].method2313(-121, var25, var26) + class678.field10091 : class96.field1355[0].method2313(12, var25, var26) + class678.field10091) + (1000 << class394.field6180 - 7);
                  var23 = arg16 >= 0 ? class546.field8193.method599(var27, var29, var28, var27, var30, var28, arg16) : class546.field8193.method650(var27, var29, var28, var27, var30, var28);
                  class247.field3755[var21][var24] = var23 == 0;
               } else {
                  var23 = -1;
                  class247.field3755[var21][var24] = false;
               }

               if (var21 > 0 && var24 > 0) {
                  int var31 = class56.field691[var24 - 1] & class56.field691[var24] & var22 & var23;
                  class717.field10755[var21 - 1][var24 - 1] = var31 == 0;
               }
            }

            class56.field691[class382.field6038 + class382.field6038] = var22;
            class56.field691[class382.field6038 + class382.field6038 + 1] = var23;
         }

         if (arg16 >= 0) {
            class665.field9966 = false;
         } else {
            class757.field11214 = arg5;
            class736.field10959 = arg6;
            class47.field618 = arg7;
            class301.field4719 = arg8;
            class415.field6439 = arg9;
            class552.method4191(-110, class546.field8193, arg10);
         }
      } else {
         if (class659.field9845 == null) {
            class659.field9845 = new boolean[class247.field3734 + class247.field3734 + 1][class365.field5634 + class247.field3734 + 1];
         }

         for(int var32 = 0; var32 < class659.field9845.length; ++var32) {
            for(int var42 = 0; var42 < class659.field9845[0].length; ++var42) {
               class659.field9845[var32][var42] = true;
            }
         }

         class247.field3755 = class659.field9845;
         class717.field10755 = class659.field9845;
         class356.field5484 = 0;
         class775.field11389 = 0;
         class713.field10706 = class247.field3734;
         class35.field421 = class365.field5634;
         class665.field9966 = false;
      }

      class283.method2364(class546.field8193, 104);
      if (!class154.field2298.field3731) {
         class208 var33 = class154.field2298.field3729;

         for(class788 var34 = (class788)var33.method1815(1); var34 != null; var34 = (class788)var33.method1817(0)) {
            var34.method3159(true);
            class142.method1291(var34, -71);
         }
      }

      if (class535.field8107) {
         for(int var35 = 0; var35 < class213.field3240; ++var35) {
            class88.field1276[var35].method2693(arg0, arg14, -15859);
         }
      }

      if (class116.field1566) {
         class786.field11532 = class546.field8193.method669();
         class546.field8193.method626(class344.field5273);
         int var36 = (class344.field5273[2] - class344.field5273[0]) / class571.field8459;

         for(int var37 = 0; var37 < class571.field8459 - 1; ++var37) {
            class277.field4418[var37] = (var37 + 1) * var36 + class222.field3346[var37];
         }

         for(int var38 = 0; var38 < class238.field3620.length; ++var38) {
            class238.field3620[var38].method4103();
         }
      }

      if (class459.field7006 != null) {
         if (class116.field1566) {
            class454.method3556(0);
         }

         class19.method142(true);
         class546.field8193.method683(-1, 1583160, 40, 127);
         class32.method229(true, arg4, arg10, arg11, arg16, arg17, arg18);
         if (class116.field1566) {
            class654.method4822();
         }

         class546.field8193.method666();
         class19.method142(false);
      }

      class32.method229(false, arg4, arg10, arg11, arg16, arg17, arg18);
      if (class116.field1566) {
         for(int var39 = 0; var39 < class461.field7016; ++var39) {
            class312.field4842[var39] = class392.field6153[var39];
         }

         class454.method3556(0);

         for(int var40 = 0; var40 < class238.field3620.length; ++var40) {
            class238.field3620[var40].method4103();
         }
      }

      if (class116.field1566) {
         class654.method4822();

         for(int var41 = 0; var41 < class461.field7016; ++var41) {
            class392.field6153[var41] = class312.field4842[var41];
         }

         if (class774.field11384 == 2) {
            int var10002;
            if (class725.field10846[0] < class725.field10846[1]) {
               if (class277.field4418[0] + class222.field3346[0] > class344.field5273[0]) {
                  var10002 = class222.field3346[0]++;
               }
            } else if (class725.field10846[0] > class725.field10846[1] && class277.field4418[0] + class222.field3346[0] < class344.field5273[2]) {
               var10002 = class222.field3346[0]--;
            }
         }
      }

      if (!class492.field7436) {
         class717.field10755 = var19;
         class247.field3755 = var20;
      }

      class724.method5350();
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2616(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2617(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
