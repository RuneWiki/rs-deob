import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class80 extends class673 {
   @OriginalMember(
      owner = "client!fu",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field1112 = null;
   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "I"
   )
   public int field1115 = 0;
   @OriginalMember(
      owner = "client!fu",
      name = "v",
      descriptor = "Z"
   )
   private boolean field1117 = true;
   @OriginalMember(
      owner = "client!fu",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1119 = new String[]{method782(method781("$\u0000HLs")), method782(method781(",\u0000\nf")), method782(method781("9[H$&")), method782(method781("$\u0000HNs")), method782(method781("$\u0000HOs")), method782(method781("$\u0000HKs")), method782(method781("$\u0000HMs")), method782(method781("$\u0000HHs")), method782(method781("$\u0000HCs")), method782(method781("$\u0000HIs")), method782(method781("$\u0000H62,\u001c\u00124s")), method782(method781("$\u0000HBs"))};
   @OriginalMember(
      owner = "client!fu",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field1102 = new int[1];
   @OriginalMember(
      owner = "client!fu",
      name = "q",
      descriptor = "I"
   )
   public static int field1106 = 0;
   @OriginalMember(
      owner = "client!fu",
      name = "t",
      descriptor = "B"
   )
   public byte field1105;
   @OriginalMember(
      owner = "client!fu",
      name = "m",
      descriptor = "B"
   )
   public byte field1109;
   @OriginalMember(
      owner = "client!fu",
      name = "r",
      descriptor = "I"
   )
   public static int field1100;
   @OriginalMember(
      owner = "client!fu",
      name = "u",
      descriptor = "I"
   )
   public static int field1103;
   @OriginalMember(
      owner = "client!fu",
      name = "B",
      descriptor = "I"
   )
   public static int field1107;
   @OriginalMember(
      owner = "client!fu",
      name = "o",
      descriptor = "I"
   )
   public static int field1110;
   @OriginalMember(
      owner = "client!fu",
      name = "x",
      descriptor = "I"
   )
   public static int field1111;
   @OriginalMember(
      owner = "client!fu",
      name = "p",
      descriptor = "I"
   )
   public static int field1113;
   @OriginalMember(
      owner = "client!fu",
      name = "w",
      descriptor = "I"
   )
   public static int field1114;
   @OriginalMember(
      owner = "client!fu",
      name = "n",
      descriptor = "I"
   )
   public static int field1116;
   @OriginalMember(
      owner = "client!fu",
      name = "y",
      descriptor = "J"
   )
   public long field1118;
   @OriginalMember(
      owner = "client!fu",
      name = "A",
      descriptor = "Z"
   )
   private boolean field1101;
   @OriginalMember(
      owner = "client!fu",
      name = "D",
      descriptor = "[I"
   )
   private int[] field1108;
   @OriginalMember(
      owner = "client!fu",
      name = "C",
      descriptor = "[Lsl;"
   )
   public class98[] field1104;

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(BI)V"
   )
   private final void method772(byte arg0, int arg1) {
      try {
         ++field1113;
         if (arg0 >= -47) {
            this.method772((byte)68, 120);
         }

         if (this.field1104 != null) {
            class349.method2758(this.field1104, 0, this.field1104 = new class98[arg1], 0, this.field1115);
         } else {
            this.field1104 = new class98[arg1];
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1119[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method773(int arg0, int arg1) {
      try {
         label16: {
            --this.field1115;
            ++field1107;
            if (~this.field1115 != arg0) {
               class349.method2758(this.field1104, arg1 + 1, this.field1104, arg1, -arg1 + this.field1115);
               if (!client.field1481) {
                  break label16;
               }
            }

            this.field1104 = null;
         }

         this.field1108 = null;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1119[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I"
   )
   public final int method774(String arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field1116;
         if (arg1 != -2854) {
            return 92;
         } else {
            int var4 = 0;
            if (var3) {
               if (this.field1104[var4].field1299.equalsIgnoreCase(arg0)) {
                  return var4;
               }

               ++var4;
            }

            while(true) {
               while(~this.field1115 < ~var4) {
                  if (this.field1104[var4].field1299.equalsIgnoreCase(arg0)) {
                     return var4;
                  }

                  ++var4;
               }

               if (!var3) {
                  return -1;
               }

               if (-1 != 0) {
                  return var4;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1119[3] + (arg0 != null ? field1119[2] : field1119[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(I[JII[Ljava/lang/Object;)V"
   )
   public static final void method775(int arg0, long[] arg1, int arg2, int arg3, Object[] arg4) {
      boolean var5 = client.field1481;

      try {
         if (~arg0 > ~arg2) {
            int var6 = (arg0 - -arg2) / 2;
            int var7 = arg0;
            long var8 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var8;
            Object var10 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var10;
            int var11 = ~var8 != Long.MIN_VALUE ? 1 : 0;
            int var12 = arg0;
            long var13;
            Object var15;
            if (var5) {
               if ((long)(arg0 & var11) + var8 > arg1[arg0]) {
                  var13 = arg1[arg0];
                  arg1[arg0] = arg1[arg0];
                  arg1[arg0] = var13;
                  var15 = arg4[arg0];
                  arg4[arg0] = arg4[arg0];
                  var7 = arg0 + 1;
                  arg4[arg0] = var15;
               }

               var12 = arg0 + 1;
            }

            while(true) {
               int var10000;
               if (~var12 <= ~arg2) {
                  arg1[arg2] = arg1[var7];
                  arg1[var7] = var8;
                  arg4[arg2] = arg4[var7];
                  arg4[var7] = var10;
                  method775(arg0, arg1, var7 + -1, -10963, arg4);
                  var10000 = var7 + 1;
                  if (!var5) {
                     method775(var10000, arg1, arg2, -10963, arg4);
                     break;
                  }
               } else {
                  long var18;
                  var10000 = (var18 = (long)(var12 & var11) + var8 - arg1[var12]) == 0L ? 0 : (var18 < 0L ? -1 : 1);
               }

               if (var10000 > 0) {
                  var13 = arg1[var12];
                  arg1[var12] = arg1[var7];
                  arg1[var7] = var13;
                  var15 = arg4[var12];
                  arg4[var12] = arg4[var7];
                  arg4[var7++] = var15;
               }

               ++var12;
            }
         }

         ++field1110;
         if (arg3 != -10963) {
            method775(-98, (long[])null, -118, -107, (Object[])null);
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field1119[9] + arg0 + ',' + (arg1 != null ? field1119[2] : field1119[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1119[2] : field1119[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(BLsl;)V"
   )
   public final void method776(byte arg0, class98 arg1) {
      try {
         if (this.field1104 == null || ~this.field1104.length >= ~this.field1115) {
            this.method772((byte)-104, this.field1115 + 5);
         }

         ++field1111;
         int var3 = 80 % ((35 - arg0) / 50);
         this.field1104[this.field1115++] = arg1;
         this.field1108 = null;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1119[0] + arg0 + ',' + (arg1 != null ? field1119[2] : field1119[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(I)[I"
   )
   public final int[] method777(int arg0) {
      boolean var2 = client.field1481;

      try {
         if (this.field1108 == null) {
            String[] var3 = new String[this.field1115];
            this.field1108 = new int[this.field1115];
            int var4 = 0;
            if (var2) {
               var3[var4] = this.field1104[var4].field1299;
               this.field1108[var4] = var4++;
            }

            while(true) {
               while(~this.field1115 < ~var4) {
                  var3[var4] = this.field1104[var4].field1299;
                  this.field1108[var4] = var4++;
               }

               int[] var10000 = this.field1108;
               if (!var2) {
                  class433.method3356(var10000, -96, var3);
                  break;
               }

               var10000[-96] = var4++;
            }
         }

         ++field1100;
         if (arg0 != 0) {
            this.field1117 = false;
         }

         return this.field1108;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1119[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "(B)[Ldp;"
   )
   public static final class499[] method778(byte arg0) {
      try {
         ++field1114;
         if (arg0 < 24) {
            method779((byte)-20);
         }

         return new class499[]{class238.field3011, class763.field11167, class569.field8363, class793.field11596, class495.field6912, class359.field4999, class188.field2390, class447.field6053, class238.field3033, class21.field327};
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1119[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method779(byte arg0) {
      try {
         if (arg0 < 38) {
            method775(-14, (long[])null, 66, 68, (Object[])null);
         }

         field1102 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1119[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(BLgea;)V"
   )
   private final void method780(byte arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         ++field1103;
         int var4 = arg1.method640(255);
         if (~(var4 & 2) != -1) {
            this.field1117 = true;
         }

         if ((1 & var4) != 0) {
            this.field1101 = true;
         }

         super.field9965 = arg1.method660(116);
         this.field1118 = arg1.method660(111);
         this.field1112 = arg1.method606(11856);
         arg1.method640(255);
         this.field1105 = arg1.method628((byte)-12);
         if (arg0 > -15) {
            this.field1101 = true;
         }

         this.field1109 = arg1.method628((byte)-12);
         this.field1115 = arg1.method603(-2);
         if (~this.field1115 < -1) {
            this.field1104 = new class98[this.field1115];
            int var5 = 0;
            if (var3 || var5 < this.field1115) {
               do {
                  class98 var6 = new class98();
                  if (this.field1101) {
                     arg1.method660(114);
                  }

                  if (this.field1117) {
                     var6.field1299 = arg1.method606(11856);
                  }

                  var6.field1298 = arg1.method628((byte)-12);
                  var6.field1307 = arg1.method603(-2);
                  this.field1104[var5] = var6;
                  ++var5;
               } while(var5 < this.field1115);

            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1119[4] + arg0 + ',' + (arg1 != null ? field1119[2] : field1119[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "<init>",
      descriptor = "(Lgea;)V"
   )
   public class80(class66 arg0) {
      try {
         this.method780((byte)-38, arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1119[10] + (arg0 != null ? field1119[2] : field1119[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method781(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method782(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
