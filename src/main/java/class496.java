import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class496 {
   @OriginalMember(
      owner = "client!on",
      name = "k",
      descriptor = "I"
   )
   public int field7073 = 128;
   @OriginalMember(
      owner = "client!on",
      name = "d",
      descriptor = "I"
   )
   public int field7078 = 128;
   @OriginalMember(
      owner = "client!on",
      name = "f",
      descriptor = "I"
   )
   public int field7069;
   @OriginalMember(
      owner = "client!on",
      name = "j",
      descriptor = "I"
   )
   public int field7071;
   @OriginalMember(
      owner = "client!on",
      name = "m",
      descriptor = "I"
   )
   public int field7070;
   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "I"
   )
   public int field7076;
   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7080 = new String[]{method3768(method3767("ZUI\u0014\u0017[R\u0013\u0016V")), method3768(method3767("[N\u000bD")), method3768(method3767("N\u0015I\u0006\u0003")), method3768(method3767("ZUIjV")), method3768(method3767("ZUInV")), method3768(method3767("ZUIkV")), method3768(method3767("ZUImV")), method3768(method3767("ZUIlV"))};
   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field7075 = new int[32];
   @OriginalMember(
      owner = "client!on",
      name = "g",
      descriptor = "I"
   )
   public static int field7067;
   @OriginalMember(
      owner = "client!on",
      name = "h",
      descriptor = "I"
   )
   public static int field7068;
   @OriginalMember(
      owner = "client!on",
      name = "e",
      descriptor = "I"
   )
   public static int field7074;
   @OriginalMember(
      owner = "client!on",
      name = "i",
      descriptor = "I"
   )
   public static int field7077;
   @OriginalMember(
      owner = "client!on",
      name = "c",
      descriptor = "I"
   )
   public static int field7079;
   @OriginalMember(
      owner = "client!on",
      name = "l",
      descriptor = "Lsa;"
   )
   public static class39 field7072;

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(ILon;)V"
   )
   public final void method3761(int arg0, class496 arg1) {
      try {
         this.field7071 = arg1.field7071;
         this.field7073 = arg1.field7073;
         if (arg0 == 128) {
            this.field7076 = arg1.field7076;
            this.field7078 = arg1.field7078;
            this.field7070 = arg1.field7070;
            this.field7069 = arg1.field7069;
            ++field7077;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7080[3] + arg0 + ',' + (arg1 != null ? field7080[2] : field7080[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(I[BII[BIIZI)V"
   )
   public static final void method3762(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, boolean arg7, int arg8) {
      boolean var9 = client.field10022;

      try {
         if (!arg7) {
            ++field7067;
            int var10 = -(arg2 >> 2);
            int var16 = -(arg2 & 3);
            int var11 = -arg6;
            if (var9 || var11 < 0) {
               label88:
               do {
                  int var12 = var10;
                  int var10001;
                  if (var9) {
                     var10001 = arg5++;
                     arg1[var10001] = (byte)(arg1[var10001] + -arg4[arg0++]);
                     int var17 = arg5++;
                     arg1[var17] = (byte)(arg1[var17] + -arg4[arg0++]);
                     int var18 = arg5++;
                     arg1[var18] = (byte)(arg1[var18] + -arg4[arg0++]);
                     int var19 = arg5++;
                     arg1[var19] = (byte)(arg1[var19] + -arg4[arg0++]);
                     var12 = var10 + 1;
                  }

                  while(true) {
                     while(~var12 > -1) {
                        var10001 = arg5++;
                        arg1[var10001] = (byte)(arg1[var10001] + -arg4[arg0++]);
                        var10001 = arg5++;
                        arg1[var10001] = (byte)(arg1[var10001] + -arg4[arg0++]);
                        var10001 = arg5++;
                        arg1[var10001] = (byte)(arg1[var10001] + -arg4[arg0++]);
                        var10001 = arg5++;
                        arg1[var10001] = (byte)(arg1[var10001] + -arg4[arg0++]);
                        ++var12;
                     }

                     int var13 = var16;
                     if (!var9) {
                        if (var9) {
                           var10001 = arg5++;
                           arg1[var10001] = (byte)(arg1[var10001] + -arg4[arg0++]);
                           var13 = var16 + 1;
                        }

                        while(true) {
                           while(~var13 > -1) {
                              var10001 = arg5++;
                              arg1[var10001] = (byte)(arg1[var10001] + -arg4[arg0++]);
                              ++var13;
                           }

                           arg0 += arg8;
                           arg5 += arg3;
                           if (!var9) {
                              ++var11;
                              continue label88;
                           }

                           ++var13;
                        }
                     }

                     ++var12;
                  }
               } while(var11 < 0);

            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field7080[5] + arg0 + ',' + (arg1 != null ? field7080[2] : field7080[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7080[2] : field7080[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3763(int arg0, int arg1) {
      return class157.field2392 != null ? class157.field2392[arg0][arg1] & 16777215 : 0;
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(I)Lon;"
   )
   public final class496 method3764(int arg0) {
      try {
         int var2 = -7 / ((arg0 - 26) / 62);
         ++field7074;
         return new class496(this.field7069, this.field7073, this.field7078, this.field7071, this.field7070, this.field7076);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7080[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(IIIIB[BI)Z"
   )
   public static final boolean method3765(int arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5, int arg6) {
      boolean var7 = client.field10022;

      try {
         ++field7068;
         if (arg4 <= 90) {
            method3762(-18, (byte[])null, -71, 92, (byte[])null, -55, 92, true, -93);
         }

         int var9;
         label45: {
            int var8 = arg2 % arg3;
            if (~var8 != -1) {
               var9 = -var8 + arg3;
               if (!var7) {
                  break label45;
               }
            }

            var9 = 0;
         }

         int var10 = -((arg1 - -arg3 + -1) / arg3);
         int var11 = -((arg2 + arg3 + -1) / arg3);
         int var12 = var10;
         int var10000;
         if (var7) {
            var10000 = var11;
         } else if (var10 >= 0) {
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
               if (~arg5[arg0] == -1) {
                  return true;
               }

               arg0 += arg3;
               ++var13;
            }

            while(true) {
               if (var13 >= 0) {
                  arg0 -= var9;
                  var10000 = arg5[arg0 - 1];
                  if (!var7) {
                     if (var10000 == 0) {
                        return true;
                     }

                     arg0 += arg6;
                     ++var12;
                     if (var12 >= 0) {
                        var10000 = 0;
                        if (!var7) {
                           return false;
                        }
                     } else {
                        var10000 = var11;
                     }
                     break;
                  }
               } else {
                  var10000 = ~arg5[arg0];
               }

               if (var10000 == -1) {
                  return true;
               }

               arg0 += arg3;
               ++var13;
            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field7080[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7080[2] : field7080[1]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3766(int arg0) {
      try {
         field7072 = null;
         field7075 = null;
         if (arg0 != 8394) {
            field7075 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7080[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class496(int arg0) {
      try {
         this.field7069 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7080[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field7073 = arg1;
         this.field7069 = arg0;
         this.field7078 = arg2;
         this.field7071 = arg3;
         this.field7070 = arg4;
         this.field7076 = arg5;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7080[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3767(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3768(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
