import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class543 extends class25 {
   @OriginalMember(
      owner = "client!fo",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7913 = new String[]{method4015(method4014("!{-ck")), method4015(method4014("!{-nk")), method4015(method4014("!{-`k")), method4015(method4014("!{-gk")), method4015(method4014("!{-mk")), method4015(method4014(")aoG")), method4015(method4014("<:-\u0005>")), method4015(method4014("!{-bk")), method4015(method4014("!{-ok")), method4015(method4014("!{-fk")), method4015(method4014("!{-ak")), method4015(method4014("!{-lk"))};
   @OriginalMember(
      owner = "client!fo",
      name = "A",
      descriptor = "Lsda;"
   )
   public static class269 field7911 = new class269(56, -1);
   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field7912 = new int[13];
   @OriginalMember(
      owner = "client!fo",
      name = "t",
      descriptor = "I"
   )
   public static int field7901;
   @OriginalMember(
      owner = "client!fo",
      name = "p",
      descriptor = "I"
   )
   public static int field7902;
   @OriginalMember(
      owner = "client!fo",
      name = "q",
      descriptor = "I"
   )
   public static int field7903;
   @OriginalMember(
      owner = "client!fo",
      name = "s",
      descriptor = "I"
   )
   public static int field7905;
   @OriginalMember(
      owner = "client!fo",
      name = "x",
      descriptor = "I"
   )
   public static int field7906;
   @OriginalMember(
      owner = "client!fo",
      name = "w",
      descriptor = "I"
   )
   public static int field7907;
   @OriginalMember(
      owner = "client!fo",
      name = "B",
      descriptor = "I"
   )
   public static int field7908;
   @OriginalMember(
      owner = "client!fo",
      name = "r",
      descriptor = "I"
   )
   public static int field7909;
   @OriginalMember(
      owner = "client!fo",
      name = "y",
      descriptor = "I"
   )
   public static int field7910;
   @OriginalMember(
      owner = "client!fo",
      name = "v",
      descriptor = "Lat;"
   )
   private class396 field7904;
   @OriginalMember(
      owner = "client!fo",
      name = "u",
      descriptor = "Lmja;"
   )
   public static class440 field7900;

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method165(int arg0) {
      try {
         ++field7910;
         super.method165(arg0);
         this.field7904 = class256.method1940(((class576)super.field263).field8558, super.field270, 95);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7913[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(IIBZ)V"
   )
   public final void method169(int arg0, int arg1, byte arg2, boolean arg3) {
      try {
         int var5 = -106 / ((16 - arg2) / 58);
         ++field7903;
         int var6 = this.method164((byte)105) * super.field263.field5645 / 10000;
         int[] var7 = new int[4];
         class786.field11439.method618(var7);
         class786.field11439.method554(arg1, arg0 + 2, arg1 + var6, super.field263.field5637 + arg0);
         this.field7904.method3032(arg1, arg0 - -2, super.field263.field5645, super.field263.field5637);
         class786.field11439.method554(var7[0], var7[1], var7[2], var7[3]);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field7913[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method168(boolean arg0) {
      try {
         ++field7909;
         return !super.method168(arg0) ? false : super.field270.method3884((byte)-99, ((class576)super.field263).field8558);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7913[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4008(int arg0, int arg1) {
      try {
         if (arg1 != -5984) {
            field7911 = null;
         }

         ++field7905;
         class298.field4137.method5453(arg0, false);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7913[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(ZLjava/lang/String;)I"
   )
   public static final int method4009(boolean arg0, String arg1) {
      try {
         ++field7901;
         if (!arg0) {
            field7912 = null;
         }

         return arg1.length() - -1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7913[4] + arg0 + ',' + (arg1 != null ? field7913[6] : field7913[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "<init>",
      descriptor = "(Leaa;Leaa;Lcba;)V"
   )
   public class543(class526 arg0, class526 arg1, class576 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!fo",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4010(int arg0) {
      try {
         field7911 = null;
         if (arg0 == -13622) {
            field7912 = null;
            field7900 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7913[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(IB)Lhv;"
   )
   public static final class544 method4011(int arg0, byte arg1) {
      try {
         ++field7907;
         int var2 = arg0 >> 16;
         int var3 = 90 % ((62 - arg1) / 61);
         int var4 = arg0 & 65535;
         if (class136.field1744[var2] == null || class136.field1744[var2][var4] == null) {
            boolean var5 = class647.method4669(var2, (byte)-78);
            if (!var5) {
               return null;
            }
         }

         return class136.field1744[var2][var4];
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7913[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(IZBI)V"
   )
   public final void method171(int arg0, boolean arg1, byte arg2, int arg3) {
      try {
         if (arg2 >= 6) {
            class786.field11439.method553(arg0 + -2, arg3, super.field263.field5645 + 4, super.field263.field5637 + 2, ((class576)super.field263).field8560, 0);
            ++field7902;
            class786.field11439.method553(arg0 - 1, arg3 - -1, super.field263.field5645 - -2, super.field263.field5637, 0, 0);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7913[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(II[BIII)Z"
   )
   public static final boolean method4012(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
      int var6 = client.field4530;

      try {
         ++field7908;
         boolean var7 = true;
         if (arg4 > -91) {
            return false;
         } else {
            class128 var8 = new class128(arg2);
            int var9 = -1;

            while(true) {
               int var10 = var8.method1088(255);
               boolean var23;
               if (var10 != 0) {
                  int var10000 = var9;
                  int var10001 = var10;

                  label85:
                  while(true) {
                     var9 = var10000 + var10001;
                     int var11 = 0;
                     var23 = false;
                     if (var6 != 0) {
                        return var23;
                     }

                     boolean var12 = false;

                     while(true) {
                        while(true) {
                           if (!var12) {
                              int var13 = var8.method1061((byte)60);
                              var10000 = ~var13;
                              var10001 = -1;
                              if (var6 != 0) {
                                 continue label85;
                              }

                              if (var10000 == -1) {
                                 break label85;
                              }

                              var11 += var13 - 1;
                              int var14 = 63 & var11;
                              int var15 = var11 >> 6 & 63;
                              int var16 = var8.method1104(255) >> 2;
                              int var17 = var15 - -arg0;
                              int var18 = arg5 + var14;
                              if (~var17 >= -1 || ~var18 >= -1 || ~var17 <= ~(arg1 + -1) || arg3 + -1 <= var18) {
                                 continue;
                              }

                              class557 var19 = class151.field1896.method5072(30, var9);
                              if (var16 == 22 && ~class261.field3566.field9461.method5177(117) == -1 && var19.field8317 == 0 && var19.field8304 != 1 && !var19.field8324) {
                                 break;
                              }

                              var12 = true;
                              if (var19.method4130((byte)72)) {
                                 continue;
                              }

                              var7 = false;
                              ++class69.field873;
                              if (var6 == 0) {
                                 continue;
                              }
                           }

                           int var20 = var8.method1061((byte)60);
                           if (var20 == 0) {
                              break label85;
                           }

                           var8.method1104(255);
                           break;
                        }

                        if (var6 != 0) {
                           break label85;
                        }
                     }
                  }

                  if (var6 == 0) {
                     continue;
                  }
               }

               var23 = var7;
               return var23;
            }
         }
      } catch (RuntimeException var22) {
         throw class670.method4877(var22, field7913[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7913[6] : field7913[5]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4013(int arg0) {
      try {
         if (class777.field11357 != 0) {
            if (class429.field6546 != null) {
               class429.field6546.method812(2035738378);
               class429.field6546 = null;
            }

            class625.method4512(119);
            class109.method935((byte)0);
         }

         ++field7906;
         if (arg0 <= 103) {
            method4012(-49, 22, (byte[])null, -23, 95, 100);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7913[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4014(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4015(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
