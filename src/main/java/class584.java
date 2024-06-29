import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class584 {
   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "I"
   )
   public int field8449;
   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8452 = new String[]{method4336(method4335(" `,,/:\u007fv.n")), method4336(method4335(" `,Rn")), method4336(method4335("/8,>;")), method4336(method4335(":cn|")), method4336(method4335(" `,Tn")), method4336(method4335(" `,d)\u0007bpy(3>")), method4336(method4335(" `,Sn")), method4336(method4335(" `,Qn"))};
   @OriginalMember(
      owner = "client!tv",
      name = "e",
      descriptor = "Lgh;"
   )
   public static class572 field8447 = new class572(49, 2);
   @OriginalMember(
      owner = "client!tv",
      name = "b",
      descriptor = "Z"
   )
   public static volatile boolean field8450 = true;
   @OriginalMember(
      owner = "client!tv",
      name = "g",
      descriptor = "I"
   )
   public static int field8445;
   @OriginalMember(
      owner = "client!tv",
      name = "c",
      descriptor = "I"
   )
   public static int field8446;
   @OriginalMember(
      owner = "client!tv",
      name = "d",
      descriptor = "I"
   )
   public static int field8448;
   @OriginalMember(
      owner = "client!tv",
      name = "f",
      descriptor = "I"
   )
   public static int field8451;

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(IIILcf;IIIIIII)Z"
   )
   public static final boolean method4331(int arg0, int arg1, int arg2, class628 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field4564;

      try {
         ++field8446;
         if (arg4 != 22705) {
            method4331(85, -7, -63, (class628)null, -97, 96, -44, 65, 113, -8, 34);
         }

         byte var14 = 64;
         byte var15 = 64;
         int var16 = -var14 + arg9;
         class451.field6590[var14][var15] = 99;
         int var17 = -var15 + arg2;
         class202.field3023[var14][var15] = 0;
         byte var18 = 0;
         class128.field2142[var18] = arg9;
         int var19 = 0;
         int var28 = var18 + 1;
         class530.field7715[var18] = arg2;
         int[][] var20 = arg3.field9137;
         if (!var11 && var28 == var19) {
            class256.field3634 = arg2;
            class218.field3300 = arg9;
            return false;
         } else {
            int var12;
            int var13;
            label230:
            do {
               var13 = class530.field7715[var19];
               var12 = class128.field2142[var19];
               int var21 = -var17 + var13;
               int var22 = -var16 + var12;
               var19 = var19 + 1 & 4095;
               int var23 = -arg3.field9143 + var12;
               int var24 = var13 - arg3.field9147;
               int var25 = arg7;
               int var10000 = ~arg7;
               byte var10001 = 3;

               do {
                  if (var10000 != var10001) {
                     if (var25 != -3) {
                        if (var25 != -2) {
                           if (var25 != -1) {
                              label217: {
                                 if (var25 != 0 && var25 != 1 && var25 != 2 && ~var25 != -4) {
                                    if (~var25 != -10) {
                                       if (arg3.method4612(arg1, var13, var12, arg6, arg7, arg4 ^ 22780, arg0, 2)) {
                                          class218.field3300 = var12;
                                          class256.field3634 = var13;
                                          return true;
                                       }
                                       break label217;
                                    }

                                    if (var11) {
                                       if (arg1 == var12 && ~arg0 == ~var13) {
                                          class256.field3634 = var13;
                                          class218.field3300 = var12;
                                          return true;
                                       }
                                       break label217;
                                    }
                                 }

                                 if (arg3.method4614(arg1, arg7, arg0, 2, arg6, var13, 22066, var12)) {
                                    class218.field3300 = var12;
                                    class256.field3634 = var13;
                                    return true;
                                 }
                              }
                           } else if (arg3.method4604(arg0, (byte)-123, arg5, var12, var13, arg1, 2, arg10, arg8)) {
                              class218.field3300 = var12;
                              class256.field3634 = var13;
                              return true;
                           }
                        } else if (arg3.method4606(arg8, 2, arg10, var13, 2, arg0, arg5, arg1, var12, (byte)19)) {
                           class256.field3634 = var13;
                           class218.field3300 = var12;
                           return true;
                        }
                     } else if (class595.method4398(arg1, -1, 2, var12, arg0, arg8, arg5, 2, var13)) {
                        class218.field3300 = var12;
                        class256.field3634 = var13;
                        return true;
                     }
                  } else if (arg1 == var12 && ~arg0 == ~var13) {
                     class256.field3634 = var13;
                     class218.field3300 = var12;
                     return true;
                  }

                  var25 = class202.field3023[var22][var21] - -1;
                  if (var22 > 0 && ~class451.field6590[var22 + -1][var21] == -1 && ~(var20[var23 + -1][var24] & 1134821376) == -1 && (1310982144 & var20[var23 - 1][var24 + 1]) == 0) {
                     class128.field2142[var28] = var12 + -1;
                     class530.field7715[var28] = var13;
                     class451.field6590[var22 - 1][var21] = 2;
                     var28 = 4095 & var28 + 1;
                     class202.field3023[var22 + -1][var21] = var25;
                  }

                  if (~var22 > -127 && ~class451.field6590[var22 + 1][var21] == -1 && ~(1625554944 & var20[var23 + 2][var24]) == -1 && (var20[var23 + 2][var24 + 1] & 2015625216) == 0) {
                     class128.field2142[var28] = var12 + 1;
                     class530.field7715[var28] = var13;
                     var28 = 4095 & var28 - -1;
                     class451.field6590[var22 + 1][var21] = 8;
                     class202.field3023[var22 + 1][var21] = var25;
                  }

                  if (var21 > 0 && ~class451.field6590[var22][var21 + -1] == -1 && (var20[var23][var24 - 1] & 1134821376) == 0 && ~(1625554944 & var20[var23 + 1][var24 + -1]) == -1) {
                     class128.field2142[var28] = var12;
                     class530.field7715[var28] = var13 - 1;
                     var28 = 4095 & var28 + 1;
                     class451.field6590[var22][var21 + -1] = 1;
                     class202.field3023[var22][var21 + -1] = var25;
                  }

                  if (~var21 > -127 && ~class451.field6590[var22][var21 + 1] == -1 && ~(var20[var23][var24 + 2] & 1310982144) == -1 && ~(2015625216 & var20[var23 + 1][var24 - -2]) == -1) {
                     class128.field2142[var28] = var12;
                     class530.field7715[var28] = var13 + 1;
                     class451.field6590[var22][var21 + 1] = 4;
                     var28 = var28 + 1 & 4095;
                     class202.field3023[var22][var21 + 1] = var25;
                  }

                  if (var22 > 0 && ~var21 < -1 && ~class451.field6590[var22 - 1][var21 - 1] == -1 && (var20[var23 + -1][var24] & 1336147968) == 0 && ~(1134821376 & var20[var23 - 1][var24 - 1]) == -1 && ~(1675886592 & var20[var23][var24 + -1]) == -1) {
                     class128.field2142[var28] = var12 - 1;
                     class530.field7715[var28] = var13 + -1;
                     var28 = var28 + 1 & 4095;
                     class451.field6590[var22 + -1][var21 + -1] = 3;
                     class202.field3023[var22 - 1][var21 + -1] = var25;
                  }

                  if (var22 < 126 && ~var21 < -1 && ~class451.field6590[var22 + 1][var21 + -1] == -1 && ~(1675886592 & var20[var23 + 1][var24 + -1]) == -1 && (1625554944 & var20[var23 + 2][var24 + -1]) == 0 && ~(var20[var23 - -2][var24] & 2028208128) == -1) {
                     class128.field2142[var28] = var12 + 1;
                     class530.field7715[var28] = var13 + -1;
                     class451.field6590[var22 + 1][var21 + -1] = 9;
                     var28 = var28 + 1 & 4095;
                     class202.field3023[var22 + 1][var21 + -1] = var25;
                  }

                  if (var22 > 0 && ~var21 > -127 && class451.field6590[var22 + -1][var21 + 1] == 0 && (var20[var23 + -1][var24 - -1] & 1336147968) == 0 && ~(var20[var23 + -1][var24 - -2] & 1310982144) == -1 && ~(var20[var23][var24 + 2] & 2116288512) == -1) {
                     class128.field2142[var28] = var12 + -1;
                     class530.field7715[var28] = var13 - -1;
                     class451.field6590[var22 + -1][var21 - -1] = 6;
                     var28 = 4095 & var28 + 1;
                     class202.field3023[var22 - 1][var21 + 1] = var25;
                  }

                  if (~var22 <= -127) {
                     continue label230;
                  }

                  var10000 = var21;
                  var10001 = 126;
               } while(var11);

               if (var21 < 126 && class451.field6590[var22 + 1][var21 + 1] == 0 && ~(2116288512 & var20[var23 + 1][var24 - -2]) == -1 && ~(var20[var23 + 2][var24 + 2] & 2015625216) == -1 && ~(2028208128 & var20[var23 + 2][var24 + 1]) == -1) {
                  class128.field2142[var28] = var12 + 1;
                  class530.field7715[var28] = var13 - -1;
                  var28 = var28 - -1 & 4095;
                  class451.field6590[var22 + 1][var21 - -1] = 12;
                  class202.field3023[var22 + 1][var21 + 1] = var25;
               }
            } while(var28 != var19);

            class256.field3634 = var13;
            class218.field3300 = var12;
            return false;
         }
      } catch (RuntimeException var27) {
         throw class608.method4462(var27, field8452[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8452[2] : field8452[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(Ljava/io/File;ZI)[B"
   )
   public static final byte[] method4332(File arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            field8450 = false;
         }

         ++field8448;

         try {
            byte[] var3 = new byte[arg2];
            class708.method5140(arg0, var3, 0, arg2);
            return var3;
         } catch (IOException var5) {
            return null;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8452[1] + (arg0 != null ? field8452[2] : field8452[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4333(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tv",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class584(int arg0) {
      try {
         this.field8449 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8452[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4334(byte arg0) {
      try {
         field8447 = null;
         if (arg0 > -73) {
            field8447 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8452[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field8445;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8452[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4335(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4336(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
