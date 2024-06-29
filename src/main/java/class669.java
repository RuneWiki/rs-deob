import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class669 extends class483 {
   @OriginalMember(
      owner = "client!bba",
      name = "Z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9993 = new String[]{method4933(method4932("}\tQ\u0004")), method4933(method4932("hR\u0013FM")), method4933(method4932("q\u001e\\Fw;")), method4933(method4932("q\u001e\\Fy;")), method4933(method4932("q\u001e\\Fz;")), method4933(method4932("q\u001e\\Fv;"))};
   @OriginalMember(
      owner = "client!bba",
      name = "W",
      descriptor = "I"
   )
   public static int field9989;
   @OriginalMember(
      owner = "client!bba",
      name = "G",
      descriptor = "I"
   )
   public static int field9990;
   @OriginalMember(
      owner = "client!bba",
      name = "Y",
      descriptor = "I"
   )
   public static int field9991;
   @OriginalMember(
      owner = "client!bba",
      name = "X",
      descriptor = "I"
   )
   public static int field9992;

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IIILdj;)J",
      line = 5
   )
   public static final long method4929(int arg0, int arg1, int arg2, class434 arg3) {
      try {
         ++field9990;
         long var4 = 4194304L;
         long var6 = Long.MIN_VALUE;
         class333 var8 = class102.field1434.method1411(arg3.method236((byte)-11), -85);
         long var9 = (long)(1073741824 | arg3.method237(arg2 ^ 28441) << 14 | arg0 << 7 | arg1 | arg3.method231((byte)-42) << 20);
         if (var8.field5071 == 0) {
            var9 |= var6;
         }

         if (var8.field5100 == arg2) {
            var9 |= var4;
         }

         return var9 | (long)arg3.method236((byte)-11) << 32;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field9993[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9993[1] : field9993[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IIBIII)V",
      line = 30
   )
   public static final void method4930(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field9992;
         int var7 = arg4 - arg1;
         int var8 = -arg0 + arg5;
         if (var7 != 0) {
            if (var8 == 0) {
               class750.method5509(arg0, arg1, arg2 + -114, arg3, arg4);
            } else {
               int var9;
               int var10;
               int var11;
               int var12;
               label84: {
                  var9 = (var8 << 12) / var7;
                  var10 = -(arg1 * var9 >> 12) + arg0;
                  if (class443.field6806 > arg4) {
                     var11 = class443.field6806;
                     var12 = (class443.field6806 * var9 >> 12) + var10;
                     if (!var6) {
                        break label84;
                     }
                  }

                  if (~class182.field2833 > ~arg4) {
                     var12 = (class182.field2833 * var9 >> 12) + var10;
                     var11 = class182.field2833;
                     if (!var6) {
                        break label84;
                     }
                  }

                  var11 = arg4;
                  var12 = arg5;
               }

               int var13;
               int var14;
               label66: {
                  if (class443.field6806 <= arg1) {
                     if (~class182.field2833 > ~arg1) {
                        var13 = (class182.field2833 * var9 >> 12) + var10;
                        var14 = class182.field2833;
                        if (!var6) {
                           break label66;
                        }
                     }

                     var13 = arg0;
                     var14 = arg1;
                     if (!var6) {
                        break label66;
                     }
                  }

                  var14 = class443.field6806;
                  var13 = (class443.field6806 * var9 >> 12) + var10;
               }

               label58: {
                  if (var13 >= class368.field5724) {
                     if (~var13 >= ~class84.field1212) {
                        break label58;
                     }

                     var13 = class84.field1212;
                     var14 = (class84.field1212 - var10 << 12) / var9;
                     if (!var6) {
                        break label58;
                     }
                  }

                  var14 = (class368.field5724 - var10 << 12) / var9;
                  var13 = class368.field5724;
               }

               if (arg2 == 116) {
                  label50: {
                     if (class368.field5724 <= var12) {
                        if (~var12 >= ~class84.field1212) {
                           break label50;
                        }

                        var11 = (-var10 + class84.field1212 << 12) / var9;
                        var12 = class84.field1212;
                        if (!var6) {
                           break label50;
                        }
                     }

                     var12 = class368.field5724;
                     var11 = (-var10 + class368.field5724 << 12) / var9;
                  }

                  class636.method4642(var14, var13, arg2 ^ 41, var11, arg3, var12);
               }
            }
         } else {
            if (~var8 != -1) {
               class345.method2792(31372, arg0, arg5, arg3, arg1);
            }

         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field9993[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "h",
      descriptor = "(I)V",
      line = 132
   )
   public static final void method4931(int arg0) {
      try {
         ++field9991;
         class798.field11616.method5144(32000);
         class37.field448.method202(0);
         class37.field448.field374 = null;
         class37.field448.field362.field5436 = 0;
         class37.field448.field363 = null;
         class37.field448.field375 = 0;
         if (arg0 == -28824) {
            class37.field448.field364 = null;
            class213.field3239 = 0;
            class22.method164((byte)93);
            class64.field850 = 0;
            class511.field7808 = null;
            class452.field6907 = null;
            class104.field1451 = null;
            class412.field6415 = 0;
            class66.field874 = null;
            class148.field2244 = 0;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9993[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(II)[[I",
      line = 159
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9989;
         int[][] var4 = super.field918.method3276((byte)108, arg1);
         if (super.field918.field6361 && this.method3761(arg0 ^ 17083)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg1 % super.field7354 * super.field7354;
            int var9 = 0;
            if (var3 || ~class678.field10127 < ~var9) {
               do {
                  int var10 = super.field7352[var9 % super.field7349 + var8];
                  var7[var9] = class408.method3277(var10, 255) << 4;
                  var6[var9] = class408.method3277(65280, var10) >> 4;
                  var5[var9] = class408.method3277(16711680, var10) >> 12;
                  ++var9;
               } while(~class678.field10127 < ~var9);
            }
         }

         return arg0 != 32 ? null : var4;
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field9993[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4932(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4933(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
