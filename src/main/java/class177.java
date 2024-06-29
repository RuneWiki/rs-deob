import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class177 extends class555 {
   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2204 = new String[]{method1375(method1374("\u001eT}\u0002UT")), method1375(method1374("\u001eT}\u0002\\T")), method1375(method1374("\u001eT}\u0002YT")), method1375(method1374("\u001eT}\u0002_T")), method1375(method1374("\u001eT}\u0002XT")), method1375(method1374("\u0012Jp@")), method1375(method1374("\u001eT}\u0002TT")), method1375(method1374("\u0007\u00112\u0002`")), method1375(method1374("\u001eT}\u0002^T")), method1375(method1374("\u001eT}\u0002[T")), method1375(method1374("\u001eT}\u0002ZT"))};
   @OriginalMember(
      owner = "client!bka",
      name = "i",
      descriptor = "Ldd;"
   )
   public static class735 field2202 = new class735(14, 0, 4, 1);
   @OriginalMember(
      owner = "client!bka",
      name = "k",
      descriptor = "I"
   )
   public static int field2195;
   @OriginalMember(
      owner = "client!bka",
      name = "h",
      descriptor = "I"
   )
   public static int field2196;
   @OriginalMember(
      owner = "client!bka",
      name = "g",
      descriptor = "I"
   )
   public static int field2197;
   @OriginalMember(
      owner = "client!bka",
      name = "m",
      descriptor = "I"
   )
   public static int field2198;
   @OriginalMember(
      owner = "client!bka",
      name = "f",
      descriptor = "I"
   )
   public static int field2199;
   @OriginalMember(
      owner = "client!bka",
      name = "l",
      descriptor = "I"
   )
   public static int field2200;
   @OriginalMember(
      owner = "client!bka",
      name = "n",
      descriptor = "I"
   )
   public static int field2201;
   @OriginalMember(
      owner = "client!bka",
      name = "j",
      descriptor = "I"
   )
   public static int field2203;

   @OriginalMember(
      owner = "client!bka",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1369(byte arg0) {
      try {
         if (arg0 >= -61) {
            field2202 = null;
         }

         ++field2197;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2204[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         super.field7632 = arg0;
         ++field2199;
         int var3 = 34 % ((arg1 - 12) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2204[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(I[B[BIIIIII)V"
   )
   public static final void method1370(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field4273;

      try {
         if (arg0 != 4) {
            field2202 = null;
         }

         ++field2200;
         int var10 = -(arg3 >> 2);
         int var16 = -(3 & arg3);
         int var11 = -arg4;
         if (var9 || ~var11 > -1) {
            label88:
            do {
               int var12 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg6++;
                  arg1[var10001] += arg2[arg5++];
                  int var17 = arg6++;
                  arg1[var17] += arg2[arg5++];
                  int var18 = arg6++;
                  arg1[var18] += arg2[arg5++];
                  int var19 = arg6++;
                  arg1[var19] += arg2[arg5++];
                  var12 = var10 + 1;
               }

               while(true) {
                  while(~var12 > -1) {
                     var10001 = arg6++;
                     arg1[var10001] += arg2[arg5++];
                     var10001 = arg6++;
                     arg1[var10001] += arg2[arg5++];
                     var10001 = arg6++;
                     arg1[var10001] += arg2[arg5++];
                     var10001 = arg6++;
                     arg1[var10001] += arg2[arg5++];
                     ++var12;
                  }

                  int var13 = var16;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg6++;
                        arg1[var10001] += arg2[arg5++];
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(var13 < 0) {
                           var10001 = arg6++;
                           arg1[var10001] += arg2[arg5++];
                           ++var13;
                        }

                        arg6 += arg7;
                        arg5 += arg8;
                        if (!var9) {
                           ++var11;
                           continue label88;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            } while(~var11 > -1);

         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field2204[6] + arg0 + ',' + (arg1 != null ? field2204[7] : field2204[5]) + ',' + (arg2 != null ? field2204[7] : field2204[5]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method1371(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 > 105) {
            ++field2196;
            if (class603.method4400(2, arg0)) {
               class559.method4027(class468.field6451[arg0], 0, arg2);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2204[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class177(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 <= 124) {
            field2202 = null;
         }

         ++field2198;
         return 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2204[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class177(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field2203;
         if (arg1 <= 36) {
            field2202 = null;
         }

         if (super.field7633.method4414(0)) {
            return 3;
         } else {
            return arg0 != 0 && ~super.field7633.field8461.method1732((byte)-77) != -2 ? 2 : 1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2204[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1372(int arg0) {
      try {
         field2202 = null;
         if (arg0 < 36) {
            field2202 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2204[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (super.field7633.method4414(0)) {
            super.field7632 = 0;
         }

         if (arg0 != -13712) {
            field2202 = null;
         }

         ++field2201;
         if (~super.field7632 > -1 && super.field7632 > 2) {
            super.field7632 = this.method635(arg0 ^ -13809);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2204[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1373(byte arg0) {
      try {
         ++field2195;
         if (super.field7633.method4414(arg0 + 107)) {
            return false;
         } else {
            if (arg0 != -107) {
               method1372(-78);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2204[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1374(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1375(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
