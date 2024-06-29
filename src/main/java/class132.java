import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class132 extends class345 {
   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2192 = new String[]{method1265(method1264("&\u0018oI\u0001")), method1265(method1264("&\u0018oJ\u0001")), method1265(method1264("&\u0018oL\u0001")), method1265(method1264("&\u0018oE\u0001")), method1265(method1264("&\u0018oM\u0001")), method1265(method1264(".\u001b-b")), method1265(method1264("&\u0018oD\u0001")), method1265(method1264(";@o T")), method1265(method1264("&\u0018oK\u0001")), method1265(method1264("&\u0018oO\u0001")), method1265(method1264("&\u0018oH\u0001"))};
   @OriginalMember(
      owner = "client!fv",
      name = "m",
      descriptor = "I"
   )
   public static int field2183;
   @OriginalMember(
      owner = "client!fv",
      name = "i",
      descriptor = "I"
   )
   public static int field2184;
   @OriginalMember(
      owner = "client!fv",
      name = "p",
      descriptor = "I"
   )
   public static int field2185;
   @OriginalMember(
      owner = "client!fv",
      name = "j",
      descriptor = "I"
   )
   public static int field2186;
   @OriginalMember(
      owner = "client!fv",
      name = "k",
      descriptor = "I"
   )
   public static int field2187;
   @OriginalMember(
      owner = "client!fv",
      name = "l",
      descriptor = "I"
   )
   public static int field2188;
   @OriginalMember(
      owner = "client!fv",
      name = "q",
      descriptor = "I"
   )
   public static int field2189;
   @OriginalMember(
      owner = "client!fv",
      name = "o",
      descriptor = "I"
   )
   public static int field2190;
   @OriginalMember(
      owner = "client!fv",
      name = "n",
      descriptor = "I"
   )
   public static int field2191;

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(BI[Ljava/lang/Object;I[J)V",
      line = 5
   )
   public static final void method1257(byte arg0, int arg1, Object[] arg2, int arg3, long[] arg4) {
      boolean var5 = client.field4564;

      try {
         ++field2190;
         if (~arg1 < ~arg3) {
            int var6 = (arg3 - -arg1) / 2;
            int var7 = arg3;
            long var8 = arg4[var6];
            arg4[var6] = arg4[arg1];
            arg4[arg1] = var8;
            Object var10 = arg2[var6];
            arg2[var6] = arg2[arg1];
            arg2[arg1] = var10;
            int var11 = var8 == Long.MAX_VALUE ? 0 : 1;
            int var12 = arg3;
            long var13;
            Object var15;
            if (var5) {
               if (arg4[arg3] < (long)(arg3 & var11) + var8) {
                  var13 = arg4[arg3];
                  arg4[arg3] = arg4[arg3];
                  arg4[arg3] = var13;
                  var15 = arg2[arg3];
                  arg2[arg3] = arg2[arg3];
                  var7 = arg3 + 1;
                  arg2[arg3] = var15;
               }

               var12 = arg3 + 1;
            }

            while(true) {
               int var10000;
               if (~var12 <= ~arg1) {
                  arg4[arg1] = arg4[var7];
                  arg4[var7] = var8;
                  arg2[arg1] = arg2[var7];
                  arg2[var7] = var10;
                  method1257((byte)-104, var7 - 1, arg2, arg3, arg4);
                  var10000 = -58;
                  if (!var5) {
                     method1257((byte)-58, arg1, arg2, var7 + 1, arg4);
                     break;
                  }
               } else {
                  long var18;
                  var10000 = (var18 = arg4[var12] - ((long)(var12 & var11) + var8)) == 0L ? 0 : (var18 < 0L ? -1 : 1);
               }

               if (var10000 < 0) {
                  var13 = arg4[var12];
                  arg4[var12] = arg4[var7];
                  arg4[var7] = var13;
                  var15 = arg2[var12];
                  arg2[var12] = arg2[var7];
                  arg2[var7++] = var15;
               }

               ++var12;
            }
         }

         if (arg0 <= -40) {
            ;
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field2192[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2192[7] : field2192[5]) + ',' + arg3 + ',' + (arg4 != null ? field2192[7] : field2192[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)V",
      line = 64
   )
   public static final void method1258(int arg0, int arg1, int arg2, Class arg3) {
      class600 var4 = class90.field1473[arg0][arg1][arg2];
      if (var4 != null) {
         for(class533 var5 = var4.field8653; var5 != null; var5 = var5.field7763) {
            class144 var6 = var5.field7766;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2354 == arg1 && var6.field2347 == arg2) {
               class62.method675(var6, false);
               return;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(BI)I",
      line = 91
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field2184;
         if (~arg1 != -1 && super.field4914.field11175.method2967(false) != 1) {
            return arg0 > -45 ? -36 : 2;
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2192[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(B)Z",
      line = 105
   )
   public final boolean method1259(byte arg0) {
      try {
         if (arg0 >= -127) {
            this.method52((byte)-108, -16);
         }

         ++field2185;
         return true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2192[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(III)Lqj;",
      line = 118
   )
   public static final class533 method1260(int arg0, int arg1, int arg2) {
      class600 var3 = class90.field1473[arg0][arg1][arg2];
      return var3 == null ? null : var3.field8653;
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(IIZILuba;Laf;ILnia;)V",
      line = 127
   )
   public static final void method1261(int arg0, int arg1, boolean arg2, int arg3, class451 arg4, class457 arg5, int arg6, class670 arg7) {
      try {
         ++field2191;
         if (!arg2) {
            class618 var8 = new class618();
            var8.field8994 = arg0;
            var8.field8995 = arg1 << 9;
            var8.field8985 = arg3 << 9;
            if (arg7 == null) {
               if (arg4 == null) {
                  if (arg5 != null) {
                     var8.field8970 = arg5;
                     var8.field8987 = arg5.method3438(false) + arg3 << 9;
                     var8.field8974 = arg5.method3438(arg2) + arg1 << 9;
                     var8.field8990 = class477.method3611(arg5, (byte)-90);
                     var8.field8992 = arg5.field6689 << 9;
                     var8.field8989 = 256;
                     var8.field8988 = arg5.field6695;
                     var8.field8969 = 0;
                     var8.field8993 = arg5.field6674;
                     var8.field8996 = 256;
                     class638.field9308.method1566(var8, 24742, (long)arg5.field11306);
                     return;
                  }
               } else {
                  var8.field8986 = arg4;
                  class15 var9 = arg4.field6586;
                  if (var9.field230 != null) {
                     var8.field8972 = true;
                     var9 = var9.method111(class616.field8951, -2690);
                  }

                  if (var9 != null) {
                     var8.field8987 = var9.field239 + arg3 << 9;
                     var8.field8974 = var9.field239 + arg1 << 9;
                     var8.field8990 = class407.method3127(-1, arg4);
                     var8.field8996 = var9.field236;
                     var8.field8993 = var9.field287;
                     var8.field8992 = var9.field225 << 9;
                     var8.field8969 = var9.field268 << 9;
                     var8.field8988 = var9.field237;
                     var8.field8989 = var9.field277;
                  }

                  class231.field3383.method2585(var8, -71);
               }

            } else {
               var8.field8981 = arg7;
               int var10 = arg7.field9830;
               int var11 = arg7.field9807;
               if (~arg6 == -2 || ~arg6 == -4) {
                  var11 = arg7.field9830;
                  var10 = arg7.field9807;
               }

               var8.field8999 = arg7.field9780;
               var8.field8984 = arg7.field9749;
               var8.field8979 = arg7.field9783;
               var8.field8991 = arg7.field9811;
               var8.field8988 = arg7.field9806;
               var8.field8974 = arg1 + var11 << 9;
               var8.field8993 = arg7.field9746;
               var8.field8990 = arg7.field9800;
               var8.field8987 = arg3 - -var10 << 9;
               var8.field8992 = arg7.field9766 << 9;
               var8.field8996 = arg7.field9812;
               var8.field8969 = arg7.field9815 << 9;
               var8.field8989 = arg7.field9793;
               if (arg7.field9805 != null) {
                  var8.field8972 = true;
                  var8.method4529(15781);
               }

               if (var8.field8979 != null) {
                  var8.field8976 = var8.field8999 - -((int)(Math.random() * (double)(-var8.field8999 + var8.field8984)));
               }

               class732.field10523.method2585(var8, -101);
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field2192[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2192[7] : field2192[5]) + ',' + (arg5 != null ? field2192[7] : field2192[5]) + ',' + arg6 + ',' + (arg7 != null ? field2192[7] : field2192[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(Z)I",
      line = 229
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            return 71;
         } else {
            ++field2187;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2192[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "b",
      descriptor = "(Z)I",
      line = 240
   )
   public final int method1262(boolean arg0) {
      try {
         ++field2183;
         return arg0 ? -30 : super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2192[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 251
   )
   public class132(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!fv",
      name = "b",
      descriptor = "(I)V",
      line = 254
   )
   public final void method51(int arg0) {
      try {
         ++field2188;
         if (super.field4913 != arg0 && super.field4914.field11175.method2967(false) != 1) {
            super.field4913 = 0;
         }

         if (~super.field4913 > -1 || super.field4913 > 1) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2192[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 268
   )
   public class132(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(IB)V",
      line = 271
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 >= 99) {
            super.field4913 = arg0;
            ++field2189;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2192[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "b",
      descriptor = "(B)V",
      line = 282
   )
   public static final void method1263(byte arg0) {
      try {
         if (arg0 > 11) {
            class310.field4469.method1570((byte)15);
            ++field2186;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2192[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1264(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1265(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
