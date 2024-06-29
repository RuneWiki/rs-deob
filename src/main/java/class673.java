import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class673 extends class67 {
   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10022 = new String[]{method4964(method4963("r:aVT")), method4964(method4963("r:a_T")), method4964(method4963("r:aYT")), method4964(method4963("g`a0\u0001")), method4964(method4963("r:aZT")), method4964(method4963("r;#r")), method4964(method4963("r:a\\T")), method4964(method4963("r:a]T")), method4964(method4963("r:a[T"))};
   @OriginalMember(
      owner = "client!nt",
      name = "m",
      descriptor = "I"
   )
   public static int field10015;
   @OriginalMember(
      owner = "client!nt",
      name = "o",
      descriptor = "I"
   )
   public static int field10016;
   @OriginalMember(
      owner = "client!nt",
      name = "n",
      descriptor = "I"
   )
   public static int field10017;
   @OriginalMember(
      owner = "client!nt",
      name = "q",
      descriptor = "I"
   )
   public static int field10018;
   @OriginalMember(
      owner = "client!nt",
      name = "k",
      descriptor = "I"
   )
   public static int field10019;
   @OriginalMember(
      owner = "client!nt",
      name = "p",
      descriptor = "I"
   )
   public static int field10020;
   @OriginalMember(
      owner = "client!nt",
      name = "l",
      descriptor = "I"
   )
   public static int field10021;

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(II)I",
      line = 3
   )
   public final int method161(int arg0, int arg1) {
      try {
         if (arg1 > -74) {
            return 117;
         } else {
            ++field10018;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10022[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "b",
      descriptor = "(I)I",
      line = 15
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            return 24;
         } else {
            ++field10020;
            return 3;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10022[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(IIII)I",
      line = 26
   )
   public static final int method4960(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10021;
         if (~arg1 == ~arg3) {
            return arg1;
         } else {
            int var4 = 128 - arg2;
            int var5 = (127 & arg1) * var4 + (127 & arg3) * arg2 >> 7;
            if (arg0 != 19417) {
               return 14;
            } else {
               int var6 = (896 & arg1) * var4 + (896 & arg3) * arg2 >> 7;
               int var7 = (64512 & arg1) * var4 - -((64512 & arg3) * arg2) >> 7;
               return 896 & var6 | 64512 & var7 | var5 & 127;
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field10022[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(B)V",
      line = 49
   )
   public final void method158(byte arg0) {
      try {
         ++field10019;
         if (arg0 != -69) {
            this.method158((byte)16);
         }

         if (~super.field877 > -1 || ~super.field877 < -5) {
            super.field877 = this.method162(0);
         }

      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10022[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(IB[BIIII)Z",
      line = 64
   )
   public static final boolean method4961(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1786;

      try {
         int var9;
         label92: {
            ++field10017;
            int var8 = arg3 % arg5;
            if (var8 == 0) {
               var9 = 0;
               if (!var7) {
                  break label92;
               }
            }

            var9 = -var8 + arg5;
         }

         int var10 = -((arg0 - -arg5 - 1) / arg5);
         if (arg1 != 15) {
            return false;
         } else {
            int var11 = -((arg5 + -1 + arg3) / arg5);
            int var12 = var10;
            int var10000;
            if (var7) {
               var10000 = var11;
            } else if (~var10 <= -1) {
               var10000 = 0;
               if (!var7) {
                  return false;
               }
            } else {
               var10000 = var11;
            }

            while(true) {
               int var13 = var10000;
               if (var7) {
                  if (arg2[arg6] == 0) {
                     return true;
                  }

                  arg6 += arg5;
                  ++var13;
               }

               while(true) {
                  while(var13 < 0) {
                     if (arg2[arg6] == 0) {
                        return true;
                     }

                     arg6 += arg5;
                     ++var13;
                  }

                  arg6 -= var9;
                  var10000 = ~arg2[arg6 - 1];
                  if (!var7) {
                     if (var10000 == -1) {
                        return true;
                     }

                     arg6 += arg4;
                     ++var12;
                     if (~var12 <= -1) {
                        var10000 = 0;
                        if (!var7) {
                           return false;
                        }
                     } else {
                        var10000 = var11;
                     }
                     break;
                  }

                  arg6 = var10000 + -1;
                  ++var13;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field10022[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10022[3] : field10022[5]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 117
   )
   public class673(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(IZ)V",
      line = 124
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         if (arg1) {
            ++field10015;
            super.field877 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10022[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 135
   )
   public class673(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nt",
      name = "c",
      descriptor = "(I)I",
      line = 138
   )
   public final int method4962(int arg0) {
      try {
         if (arg0 != 480102311) {
            return 100;
         } else {
            ++field10016;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10022[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4963(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4964(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
