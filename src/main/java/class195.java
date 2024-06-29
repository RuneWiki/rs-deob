import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class195 {
   @OriginalMember(
      owner = "client!gw",
      name = "i",
      descriptor = "J"
   )
   private long field3024 = -1L;
   @OriginalMember(
      owner = "client!gw",
      name = "e",
      descriptor = "Lsn;"
   )
   private class675 field3026 = new class675();
   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3030 = new String[]{method1731(method1730("D||bQ")), method1731(method1730("Q'> ")), method1731(method1730("j< )OP5<%_Z6r\u000f@^<\u0011$MQ<7 hZ>&-\fK+\")\fV<r(I\\=6)\u0004\u0016")), method1731(method1730("X%|\n\u0004")), method1731(method1730("X%|\u000e\u0004")), method1731(method1730("X%|\r\u0004")), method1731(method1730("X%|\t\u0004")), method1731(method1730("X%|\u000b\u0004")), method1731(method1730("X%|pEQ;&r\u0004")), method1731(method1730("\u001f'\"(MK7\u001c9A\u0005")), method1731(method1730("\u001f67 X^|1 MQ\u001a3?D\u0005")), method1731(method1730("X%|\u000f\u0004")), method1731(method1730("|>3\"oW3<\"IS\u00167 X^|3<\\S+\u0006#oS3<\u000fD^<<)@\u0017{hloM76)BK;3 _\u001f6=lBP&r!MK1:m\f\\1|/@^<\u001a-_Wh"))};
   @OriginalMember(
      owner = "client!gw",
      name = "h",
      descriptor = "F"
   )
   public static float field3029;
   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "I"
   )
   public static int field3020;
   @OriginalMember(
      owner = "client!gw",
      name = "j",
      descriptor = "I"
   )
   public static int field3021;
   @OriginalMember(
      owner = "client!gw",
      name = "f",
      descriptor = "I"
   )
   public static int field3022;
   @OriginalMember(
      owner = "client!gw",
      name = "b",
      descriptor = "I"
   )
   public static int field3023;
   @OriginalMember(
      owner = "client!gw",
      name = "d",
      descriptor = "I"
   )
   public static int field3028;
   @OriginalMember(
      owner = "client!gw",
      name = "c",
      descriptor = "J"
   )
   private long field3025;
   @OriginalMember(
      owner = "client!gw",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field3027;

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(I)Z",
      line = 5
   )
   public static final boolean method1723(int arg0) {
      try {
         if (arg0 > -54) {
            method1729((class109)null, -82, 17, -104, -124, -120);
         }

         ++field3028;
         return ~class519.field7897 != -1;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3030[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(B)V",
      line = 23
   )
   public static final void method1724(byte arg0) {
      try {
         class440.method3470(-1);
         ++field3023;
         class304.field4759 = false;
         if (arg0 >= -48) {
            field3029 = 0.06046854F;
         }

         class793.method5733(class108.field1490, class572.field8475, (byte)45, class344.field5235, class190.field2947);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3030[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "b",
      descriptor = "(I)V",
      line = 37
   )
   public static void method1725(int arg0) {
      try {
         if (arg0 != 1) {
            method1726(-62);
         }

         field3027 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3030[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "c",
      descriptor = "(I)V",
      line = 51
   )
   public static final void method1726(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field3021;
         int var2 = -120 / ((59 - arg0) / 45);
         class102 var3 = class510.field7801.field362;

         while(true) {
            if (var3.method989(class510.field7801.field370, -13053) >= 15) {
               int var4 = var3.method988((byte)-116, 15);
               if (var4 != 32767) {
                  boolean var5 = false;
                  class795 var6 = (class795)class501.field7665.method3141((long)var4, true);
                  if (var6 == null) {
                     class466 var7 = new class466();
                     var7.field1640 = var4;
                     var6 = new class795(var7);
                     class501.field7665.method3143(54, var6, (long)var4);
                     var5 = true;
                     class204.field3112[class522.field7961++] = var6;
                  }

                  class466 var8 = var6.field11592;
                  class334.field5139[class615.field8929++] = var4;
                  var8.field1674 = class619.field9011;
                  if (var8.field7072 != null && var8.field7072.method2786(24931)) {
                     class205.method1789(var8, 9);
                  }

                  int var9 = var3.method988((byte)-116, 2);
                  var8.method3618(-10000, class412.field6401.method791((byte)-84, var3.method988((byte)-116, 14)));
                  int var10 = var3.method988((byte)-116, 5);
                  if (var10 > 15) {
                     var10 -= 32;
                  }

                  int var11 = var3.method988((byte)-116, 5);
                  if (var11 > 15) {
                     var11 -= 32;
                  }

                  int var12 = var3.method988((byte)-116, 1);
                  if (var12 == 1) {
                     class77.field1024[class36.field442++] = var4;
                  }

                  int var13 = var3.method988((byte)-116, 1);
                  int var14 = var3.method988((byte)-116, 3) - -4 << 11 & 14672;
                  var8.method1104(-2620, var8.field7072.field5250);
                  var8.field1677 = var8.field7072.field5279 << 3;
                  if (var5) {
                     var8.method1103(90, var14, true);
                  }

                  var8.method3613(var8.method61((byte)70), (byte)8, var9, var13 == 1, class476.field7251.field1683[0] + var10, class476.field7251.field1685[0] + var11);
                  if (!var8.field7072.method2786(24931)) {
                     continue;
                  }

                  class346.method2795(var8, (class9)null, var8.field1506, 0, (byte)124, (class333)null, var8.field1683[0], var8.field1685[0]);
                  if (var1) {
                     break;
                  }

                  if (!var1) {
                     continue;
                  }
               }
            }

            var3.method986(8);
            break;
         }

      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field3030[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "<init>",
      descriptor = "(Lica;)V",
      line = 293
   )
   public class195(class354 arg0) {
      try {
         this.method1728(arg0, 5);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3030[8] + (arg0 != null ? field3030[0] : field3030[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(Laka;I)V",
      line = 135
   )
   public final void method1727(class637 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(Lica;I)V",
      line = 162
   )
   private final void method1728(class354 arg0, int arg1) {
      boolean var3 = client.field1786;

      RuntimeException var10000;
      label64: {
         int var4;
         boolean var10001;
         try {
            this.field3025 = arg0.method2898(32109);
            ++field3022;
            this.field3024 = arg0.method2898(32109);
            var4 = arg0.method2855(-31007);
            if (arg1 != 5) {
               return;
            }
         } catch (RuntimeException var10) {
            var10000 = var10;
            var10001 = false;
            break label64;
         }

         while(true) {
            class446 var5;
            label59: {
               label58: {
                  try {
                     if (~var4 != -1) {
                        if (var4 == 1) {
                           var5 = new class511();
                           if (!var3) {
                              break label59;
                           }
                        }
                        break label58;
                     }
                  } catch (RuntimeException var9) {
                     var10000 = var9;
                     var10001 = false;
                     break;
                  }

                  if (!var3) {
                     return;
                  }
               }

               try {
                  label68: {
                     if (var4 == 4) {
                        var5 = new class83();
                        if (!var3) {
                           break label68;
                        }
                     }

                     if (~var4 == -4) {
                        var5 = new class179();
                        if (!var3) {
                           break label68;
                        }
                     }

                     if (~var4 != -3) {
                        throw new RuntimeException(field3030[2]);
                     }

                     var5 = new class596();
                  }
               } catch (RuntimeException var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }

            try {
               var5.method805(arg0, 0);
               this.field3026.method4980(var5, arg1 ^ 5);
               var4 = arg0.method2855(-31007);
            } catch (RuntimeException var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var6 = var10000;
      throw class482.method3757(var6, field3030[3] + (arg0 != null ? field3030[0] : field3030[1]) + ',' + arg1 + ')');
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(Lbaa;IIIII)V",
      line = 202
   )
   public static final void method1729(class109 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = true;
      int var7 = arg2;
      int var8 = arg2 + arg4;
      int var9 = arg3 - 1;
      int var10 = arg3 + arg5;

      for(int var11 = arg1; var11 <= arg1 + 1; ++var11) {
         if (class461.field7016 != var11) {
            for(int var12 = var7; var12 <= var8; ++var12) {
               if (var12 >= 0 && var12 < class247.field3734) {
                  for(int var13 = var9; var13 <= var10; ++var13) {
                     if (var13 >= 0 && var13 < class365.field5634 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                        class190 var14 = class711.field10694[var11][var12][var13];
                        if (var14 != null) {
                           int var15 = (class385.field6076[var11].method2313(-126, var12, var13) + class385.field6076[var11].method2313(123, var12 + 1, var13) + class385.field6076[var11].method2313(-118, var12, var13 + 1) + class385.field6076[var11].method2313(-11, var12 + 1, var13 + 1)) / 4 - (class385.field6076[arg1].method2313(3, arg2, arg3) + class385.field6076[arg1].method2313(-20, arg2 + 1, arg3) + class385.field6076[arg1].method2313(29, arg2, arg3 + 1) + class385.field6076[arg1].method2313(-20, arg2 + 1, arg3 + 1)) / 4;
                           class269 var16 = var14.field2960;
                           class269 var17 = var14.field2955;
                           if (var16 != null && var16.method45((byte)-124)) {
                              arg0.method44(var15, 0, (var13 - arg3) * class678.field10091 + (1 - arg5) * class42.field564, class546.field8193, var6, (var12 - arg2) * class678.field10091 + (1 - arg4) * class42.field564, var16);
                           }

                           if (var17 != null && var17.method45((byte)-121)) {
                              arg0.method44(var15, 0, (var13 - arg3) * class678.field10091 + (1 - arg5) * class42.field564, class546.field8193, var6, (var12 - arg2) * class678.field10091 + (1 - arg4) * class42.field564, var17);
                           }

                           for(class605 var18 = var14.field2962; var18 != null; var18 = var18.field8840) {
                              class78 var19 = var18.field8839;
                              if (var19 != null && var19.method45((byte)-113) && (var19.field1040 == var12 || var7 == var12) && (var19.field1044 == var13 || var9 == var13)) {
                                 int var20 = var19.field1042 - var19.field1040 + 1;
                                 int var21 = var19.field1049 - var19.field1044 + 1;
                                 arg0.method44(var15, 0, (var19.field1044 - arg3) * class678.field10091 + (var21 - arg5) * class42.field564, class546.field8193, var6, (var19.field1040 - arg2) * class678.field10091 + (var20 - arg4) * class42.field564, var19);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var7;
            var6 = false;
         }
      }

   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1730(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1731(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
