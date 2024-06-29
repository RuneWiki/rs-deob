import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public abstract class class575 {
   @OriginalMember(
      owner = "client!sp",
      name = "f",
      descriptor = "Ldaa;"
   )
   public class226 field8129;
   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8137 = new String[]{method4261(method4260("^\n\fjd")), method4261(method4260("^\n\fhd")), method4261(method4260("^\n\fid")), method4261(method4260("^\n\fkd")), method4261(method4260("^\n\fmd")), method4261(method4260("^\n\fld")), method4261(method4260("^\n\f\u001a%C\u0013V\u0018d")), method4261(method4260("C\u000fNJ")), method4261(method4260("VT\f\b1")), method4261(method4260("^\n\fwd")), method4261(method4260("^\n\fnd")), method4261(method4260("^\n\fod"))};
   @OriginalMember(
      owner = "client!sp",
      name = "g",
      descriptor = "[J"
   )
   public static long[] field8135 = new long[256];
   @OriginalMember(
      owner = "client!sp",
      name = "j",
      descriptor = "I"
   )
   public static int field8126;
   @OriginalMember(
      owner = "client!sp",
      name = "k",
      descriptor = "I"
   )
   public static int field8127;
   @OriginalMember(
      owner = "client!sp",
      name = "d",
      descriptor = "I"
   )
   public static int field8128;
   @OriginalMember(
      owner = "client!sp",
      name = "h",
      descriptor = "I"
   )
   public static int field8130;
   @OriginalMember(
      owner = "client!sp",
      name = "e",
      descriptor = "I"
   )
   public static int field8131;
   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "I"
   )
   public static int field8132;
   @OriginalMember(
      owner = "client!sp",
      name = "c",
      descriptor = "I"
   )
   public static int field8134;
   @OriginalMember(
      owner = "client!sp",
      name = "i",
      descriptor = "I"
   )
   public static int field8136;
   @OriginalMember(
      owner = "client!sp",
      name = "b",
      descriptor = "Ljm;"
   )
   public static class483 field8133;

   @OriginalMember(
      owner = "client!sp",
      name = "d",
      descriptor = "(I)V"
   )
   public void method3464(int arg0) {
      try {
         int var2 = -20 / ((11 - arg0) / 54);
         ++field8134;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8137[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method4256(boolean arg0) {
      try {
         field8135 = null;
         field8133 = null;
         if (!arg0) {
            method4256(true);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8137[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public abstract void method87(boolean arg0, boolean arg1);

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(ZB)V"
   )
   public abstract void method82(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method4257(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field8136;
         if (arg1 == 0) {
            int var5 = class749.field10650;
            if (~var5 != -1) {
               if (~var5 == -2) {
                  class438.field6423 = arg3;
                  class131.field2128 = arg4;
                  class158.field2426 = arg2;
                  class749.field10650 = 2;
                  class153.field2342 = arg0;
                  return;
               }

               if (~var5 != -3) {
                  return;
               }

               if (!client.field10022) {
                  if (~arg4 > ~class131.field2128) {
                     class131.field2128 = arg4;
                  }

                  if (~arg0 < ~class153.field2342) {
                     class153.field2342 = arg0;
                  }

                  if (arg2 < class158.field2426) {
                     class158.field2426 = arg2;
                  }

                  if (class438.field6423 < arg3) {
                     class438.field6423 = arg3;
                  }

                  return;
               }
            }

         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8137[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(I)V"
   )
   public void method3480(int arg0) {
      try {
         ++field8127;
         if (arg0 != 0) {
            this.method3465((byte)123);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8137[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public static final void method4258(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         int var7 = class476.field6870.field9111.method3775(-125) * arg0 >> 8;
         ++field8126;
         if (!arg2) {
            field8133 = null;
         }

         if (var7 != 0 && arg1 != -1) {
            if (!class253.field3843 && class24.field344 != -1 && class578.method4270(65535) && !class218.method1892(6850)) {
               class337.field4990 = class526.method3946(arg2);
               class119 var4 = class135.method1376(104, class337.field4990);
               class790.method5702((byte)102, true, var4);
            }

            class504.method3804(var7, false, arg1, class72.field1167, 0, (byte)85);
            class344.method2733(255, -68, -1);
            class253.field3843 = true;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8137[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "b",
      descriptor = "(B)V"
   )
   public void method3467(byte arg0) {
      try {
         if (arg0 != -84) {
            this.method3480(115);
         }

         ++field8132;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8137[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(Z)V"
   )
   public void method3468(boolean arg0) {
      try {
         if (arg0) {
            this.method87(true, false);
         }

         ++field8131;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8137[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(Lwb;Z)Z"
   )
   public static final boolean method4259(class578 arg0, boolean arg1) {
      boolean var2 = class634.field8989 == class225.field3197;
      int var3 = 0;
      short var4 = 0;
      byte var5 = 0;
      arg0.method3052(240);
      if (arg0.field8154 >= 0 && arg0.field8160 >= 0 && arg0.field8150 < class155.field2381 && arg0.field8155 < class25.field360) {
         short var6 = 0;

         for(int var7 = arg0.field8154; var7 <= arg0.field8150; ++var7) {
            for(int var11 = arg0.field8160; var11 <= arg0.field8155; ++var11) {
               class312 var12 = class366.method2886(arg0.field6824, var7, var11);
               if (var12 != null) {
                  class84 var13 = class419.method3271((byte)106, arg0);
                  class84 var14 = var12.field4678;
                  if (var14 == null) {
                     var12.field4678 = var13;
                  } else {
                     while(var14.field1305 != null) {
                        var14 = var14.field1305;
                     }

                     var14.field1305 = var13;
                  }

                  if (var2 && (class157.field2392[var7][var11] & -16777216) != 0) {
                     var3 = class157.field2392[var7][var11];
                     var4 = class175.field2603[var7][var11];
                     var5 = class6.field103[var7][var11];
                  }

                  if (!arg1 && var12.field4677 != null && var12.field4677.field5124 > var6) {
                     var6 = var12.field4677.field5124;
                  }
               }
            }
         }

         if (var2 && (var3 & -16777216) != 0) {
            for(int var8 = arg0.field8154; var8 <= arg0.field8150; ++var8) {
               for(int var9 = arg0.field8160; var9 <= arg0.field8155; ++var9) {
                  if ((class157.field2392[var8][var9] & -16777216) == 0) {
                     class157.field2392[var8][var9] = var3;
                     class175.field2603[var8][var9] = var4;
                     class6.field103[var8][var9] = var5;
                  }
               }
            }
         }

         if (arg1) {
            class788.field11486[class155.field2377++] = arg0;
         } else {
            int var10 = class634.field8989 == class225.field3197 ? 1 : 0;
            if (arg0.method725(-6664)) {
               if (arg0.method723(-84)) {
                  arg0.field6823 = class705.field10147[var10];
                  class705.field10147[var10] = arg0;
               } else {
                  arg0.field6823 = class615.field8739[var10];
                  class615.field8739[var10] = arg0;
                  class248.field3804 = true;
               }
            } else {
               arg0.field6823 = class399.field5912[var10];
               class399.field5912[var10] = arg0;
            }
         }

         if (arg1) {
            arg0.field6829 -= var6;
         }

         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(IIB)V"
   )
   public abstract void method84(int arg0, int arg1, byte arg2);

   @OriginalMember(
      owner = "client!sp",
      name = "<init>",
      descriptor = "(Ldaa;)V"
   )
   public class575(class226 arg0) {
      try {
         this.field8129 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8137[6] + (arg0 != null ? field8137[8] : field8137[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "c",
      descriptor = "(Z)V"
   )
   public abstract void method85(boolean arg0);

   @OriginalMember(
      owner = "client!sp",
      name = "b",
      descriptor = "(I)Z"
   )
   public abstract boolean method86(int arg0);

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(B)V"
   )
   public void method3465(byte arg0) {
      try {
         ++field8130;
         if (arg0 != -15) {
            this.method82(false, (byte)-35);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8137[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "c",
      descriptor = "(I)V"
   )
   public void method3466(int arg0) {
      try {
         ++field8128;
         if (arg0 != 24515) {
            field8133 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8137[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public abstract void method88(int arg0, boolean arg1, class683 arg2);

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         long var1 = (long)var0;

         for(int var3 = 0; ~var3 > -9; ++var3) {
            if ((var1 & 1L) != 1L) {
               var1 >>>= 1;
            } else {
               var1 = -3932672073523589310L ^ var1 >>> 1;
            }
         }

         field8135[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4260(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4261(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
