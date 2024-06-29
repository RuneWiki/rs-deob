import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class569 extends class318 implements class112 {
   @OriginalMember(
      owner = "client!uda",
      name = "m",
      descriptor = "I"
   )
   private int field8414;
   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8423 = new String[]{method4282(method4281("ZG\u0013id\u0007")), method4282(method4281("AV\u001e+")), method4282(method4281("ZG\u0013ii\u0007")), method4282(method4281("T\r\\iP")), method4282(method4281("ZG\u0013ie\u0007")), method4282(method4281("ZG\u0013ij\u0007")), method4282(method4281("ZG\u0013in\u0007")), method4282(method4281("ZG\u0013i\u0011FM\u001b3\u0013\u0007")), method4282(method4281("ZG\u0013io\u0007")), method4282(method4281("ZG\u0013il\u0007")), method4282(method4281("ZG\u0013ik\u0007")), method4282(method4281("\u000fP\u0017$BAG\u0001i\u0003\u0001")), method4282(method4281("_B\u00074H")), method4282(method4281("\u007fB\u00074DADR!B]\u0003"))};
   @OriginalMember(
      owner = "client!uda",
      name = "f",
      descriptor = "Luk;"
   )
   public static class498 field8415 = new class498(82, -1);
   @OriginalMember(
      owner = "client!uda",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field8420 = new int[]{1, 0, -1, 0};
   @OriginalMember(
      owner = "client!uda",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field8421 = new int[1];
   @OriginalMember(
      owner = "client!uda",
      name = "k",
      descriptor = "I"
   )
   public static int field8412;
   @OriginalMember(
      owner = "client!uda",
      name = "g",
      descriptor = "I"
   )
   public static int field8413;
   @OriginalMember(
      owner = "client!uda",
      name = "d",
      descriptor = "I"
   )
   public static int field8416;
   @OriginalMember(
      owner = "client!uda",
      name = "j",
      descriptor = "I"
   )
   public static int field8417;
   @OriginalMember(
      owner = "client!uda",
      name = "e",
      descriptor = "I"
   )
   public static int field8418;
   @OriginalMember(
      owner = "client!uda",
      name = "h",
      descriptor = "I"
   )
   public static int field8419;
   @OriginalMember(
      owner = "client!uda",
      name = "i",
      descriptor = "I"
   )
   public static int field8422;

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(IIII)I",
      line = 3
   )
   public static final int method4277(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         ++field8418;
         if (class598.field8777 < 100) {
            return -2;
         } else if (arg2 != 4100) {
            return -8;
         } else {
            int var5 = -2;
            int var6 = Integer.MAX_VALUE;
            int var7 = -class60.field774 + arg1;
            int var8 = -class60.field763 + arg3;
            class28 var9 = (class28)class60.field747.method4972((byte)-84);
            int var10000;
            if (var4) {
               var10000 = ~var9.field332;
            } else if (var9 == null) {
               var10000 = var5;
               if (!var4) {
                  return var5;
               }
            } else {
               var10000 = ~var9.field332;
            }

            while(true) {
               if (var10000 == ~arg0) {
                  int var10 = var9.field336;
                  int var11 = var9.field335;
                  int var12 = class60.field763 + var11 | class60.field774 + var10 << 14;
                  int var13 = (var7 - var10) * (-var10 + var7) + (-var11 + var8) * (-var11 + var8);
                  if (~var5 <= -1) {
                     if (~var6 < ~var13) {
                        var5 = var12;
                        var6 = var13;
                     }
                  } else {
                     var5 = var12;
                     var6 = var13;
                  }
               }

               var9 = (class28)class60.field747.method4975((byte)111);
               if (var9 == null) {
                  var10000 = var5;
                  if (!var4) {
                     return var5;
                  }
               } else {
                  var10000 = ~var9.field332;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field8423[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(III[B)V",
      line = 51
   )
   public final void method1056(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         ++field8419;
         if (arg0 != -1752) {
            field8421 = null;
         }

         this.method2627(arg3, arg1);
         this.field8414 = arg2;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8423[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8423[3] : field8423[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "c",
      descriptor = "(I)I",
      line = 66
   )
   public final int method1054(int arg0) {
      try {
         ++field8416;
         if (arg0 < 5) {
            this.field8414 = -14;
         }

         return this.field8414;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8423[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "<init>",
      descriptor = "(Lc;ILjaclib/memory/Buffer;)V",
      line = 77
   )
   public class569(class652 arg0, int arg1, Buffer arg2) {
      super(arg0, arg2);

      try {
         this.field8414 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8423[7] + (arg0 != null ? field8423[3] : field8423[1]) + ',' + arg1 + ',' + (arg2 != null ? field8423[3] : field8423[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(IBIIZI)V",
      line = 86
   )
   public static final void method4278(int param0, byte param1, int param2, int param3, boolean param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(I[Ljava/lang/String;)V",
      line = 218
   )
   public static final void method4279(int arg0, String[] arg1) {
      boolean var2 = client.field1786;

      try {
         ++field8412;
         if (arg0 == 5) {
            if (arg1.length <= 1) {
               class552.field8265 = class552.field8265 + arg1[0];
               class452.field6918 += arg1[0].length();
            } else {
               int var3 = 0;
               int var4;
               if (var2) {
                  if (arg1[var3].startsWith(field8423[12])) {
                     var4 = 5;

                     try {
                        var4 = Integer.parseInt(arg1[var3].substring(6));
                     } catch (Exception var7) {
                     }

                     class120.method1111((byte)93, field8423[13] + var4 + field8423[11]);
                     class615.field8928 = arg1;
                     class20.field254 = var3 + 1;
                     class629.field9095 = class162.method1442(arg0 ^ 14085) - -((long)(var4 * 1000));
                     return;
                  }

                  class552.field8265 = arg1[var3];
                  class491.method3803((byte)59, false);
                  ++var3;
               }

               while(true) {
                  while(~arg1.length < ~var3) {
                     if (arg1[var3].startsWith(field8423[12])) {
                        var4 = 5;

                        try {
                           var4 = Integer.parseInt(arg1[var3].substring(6));
                        } catch (Exception var6) {
                        }

                        class120.method1111((byte)93, field8423[13] + var4 + field8423[11]);
                        class615.field8928 = arg1;
                        class20.field254 = var3 + 1;
                        class629.field9095 = class162.method1442(arg0 ^ 14085) - -((long)(var4 * 1000));
                        return;
                     }

                     class552.field8265 = arg1[var3];
                     class491.method3803((byte)59, false);
                     ++var3;
                  }

                  if (!var2) {
                     return;
                  }

                  ++var3;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field8423[10] + arg0 + ',' + (arg1 != null ? field8423[3] : field8423[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(B)V",
      line = 265
   )
   public static void method4280(byte arg0) {
      try {
         if (arg0 >= -20) {
            method4277(-87, -24, 74, -110);
         }

         field8421 = null;
         field8415 = null;
         field8420 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8423[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(I)I",
      line = 288
   )
   public final int method1055(int arg0) {
      try {
         ++field8413;
         return arg0 != 20584 ? -17 : 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8423[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "b",
      descriptor = "(I)J",
      line = 300
   )
   public final long method1057(int arg0) {
      try {
         if (arg0 != -18611) {
            return -84L;
         } else {
            ++field8422;
            return super.field4900.getAddress();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8423[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "<init>",
      descriptor = "(Lc;I[BI)V",
      line = 314
   )
   public class569(class652 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field8414 = arg1;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8423[7] + (arg0 != null ? field8423[3] : field8423[1]) + ',' + arg1 + ',' + (arg2 != null ? field8423[3] : field8423[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4281(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4282(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
