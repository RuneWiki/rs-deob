import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public abstract class class580 extends class347 {
   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8594 = new String[]{method4277(method4276("MBG\"j")), method4277(method4276("MBG j")), method4277(method4276("C@\u0004\b;")), method4277(method4276("I@\u0005\t")), method4277(method4276("\\\u001bGK?")), method4277(method4276("MBG#j"))};
   @OriginalMember(
      owner = "client!jw",
      name = "l",
      descriptor = "I"
   )
   public static int field8588 = 0;
   @OriginalMember(
      owner = "client!jw",
      name = "j",
      descriptor = "Lsd;"
   )
   public static class101 field8591 = new class101(13, 1);
   @OriginalMember(
      owner = "client!jw",
      name = "m",
      descriptor = "D"
   )
   public static double field8593 = -1.0D;
   @OriginalMember(
      owner = "client!jw",
      name = "i",
      descriptor = "I"
   )
   public static int field8587;
   @OriginalMember(
      owner = "client!jw",
      name = "o",
      descriptor = "I"
   )
   public static int field8589;
   @OriginalMember(
      owner = "client!jw",
      name = "k",
      descriptor = "I"
   )
   public static int field8590;
   @OriginalMember(
      owner = "client!jw",
      name = "n",
      descriptor = "I"
   )
   public static int field8592;

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4273(int arg0) {
      try {
         if (arg0 != -1) {
            method4273(53);
         }

         field8591 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8594[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4274(boolean arg0) {
      int var1 = client.field4530;

      try {
         if (arg0) {
            field8593 = -0.19210641911794468D;
         }

         ++field8587;
         int var2 = 0;
         if (var1 != 0 || var2 < class144.field1823) {
            do {
               int var3 = class96.field1189[var2];
               class155 var4 = ((class726)class259.field3509.method5681((long)var3, -1)).field10794;
               int var5 = class401.field6163.method1104(255);
               if ((var5 & 4) != 0) {
                  var5 += class401.field6163.method1104(255) << 8;
               }

               if ((1024 & var5) != 0) {
                  var5 += class401.field6163.method1104(255) << 16;
               }

               if ((524288 & var5) != 0) {
                  int var6 = var4.field1971.field5556.length;
                  int var7 = 0;
                  if (var4.field1971.field5614 != null) {
                     var7 = var4.field1971.field5614.length;
                  }

                  if (var4.field1971.field5566 != null) {
                     var7 = var4.field1971.field5566.length;
                  }

                  byte var8 = 0;
                  int var9 = class401.field6163.method1104(255);
                  if ((var9 & 1) != 1) {
                     int[] var10 = null;
                     if ((var9 & 2) == 2) {
                        var10 = new int[var6];
                        int var11 = 0;
                        if (var1 != 0 || var6 > var11) {
                           do {
                              var10[var11] = class401.field6163.method1086(-1);
                              ++var11;
                           } while(var6 > var11);
                        }
                     }

                     short[] var12 = null;
                     if (~(4 & var9) == -5) {
                        var12 = new short[var7];
                        int var13 = 0;
                        if (var1 != 0 || ~var13 > ~var7) {
                           do {
                              var12[var13] = (short)class401.field6163.method1053(arg0);
                              ++var13;
                           } while(~var13 > ~var7);
                        }
                     }

                     short[] var14 = null;
                     if ((8 & var9) == 8) {
                        var14 = new short[var8];
                        int var15 = 0;
                        if (var1 != 0 || var8 > var15) {
                           do {
                              var14[var15] = (short)class401.field6163.method1038((byte)-125);
                              ++var15;
                           } while(var8 > var15);
                        }
                     }

                     long var16 = (long)(var4.field1967++) << 32 | (long)var3;
                     new class548(var16, var10, var12, var14);
                  }
               }

               if ((262144 & var5) != 0) {
                  var4.field1959 = class401.field6163.method1038((byte)-107);
                  if (var4.field1959 == 65535) {
                     var4.field1959 = var4.field1971.field5621;
                  }
               }

               if ((256 & var5) != 0) {
                  int var18 = class401.field6163.method1054(-8779);
                  int var19 = class401.field6163.method1100(58);
                  if (~var18 == -65536) {
                     var18 = -1;
                  }

                  int var20 = class401.field6163.method1104(255);
                  int var21 = 7 & var20;
                  int var22 = 15 & var20 >> 3;
                  if (~var22 == -16) {
                     var22 = -1;
                  }

                  var4.method3047(var18, var19, var21, (byte)11, var22, 1);
               }

               if (~(var5 & 8) != -1) {
                  var4.field1961 = class401.field6163.method1054(-8779);
                  var4.field1973 = class401.field6163.method1086(-1);
               }

               if (~(8192 & var5) != -1) {
                  int var23 = class401.field6163.method1074((byte)-116);
                  int[] var24 = new int[var23];
                  int[] var25 = new int[var23];
                  int var26 = 0;
                  if (var1 == 0 && ~var26 <= ~var23) {
                     var4.method3057(var25, (byte)118, var24);
                  } else {
                     while(true) {
                        int var27 = class401.field6163.method1038((byte)-125);
                        int var28;
                        if (~(49152 & var27) != -49153) {
                           var24[var26] = var27;
                           if (var1 != 0) {
                              var28 = class401.field6163.method1086(-1);
                              var24[var26] = class379.method2928(var27 << 16, var28);
                              var25[var26] = class401.field6163.method1054(-8779);
                              ++var26;
                           } else {
                              var25[var26] = class401.field6163.method1054(-8779);
                              ++var26;
                           }
                        } else {
                           var28 = class401.field6163.method1086(-1);
                           var24[var26] = class379.method2928(var27 << 16, var28);
                           var25[var26] = class401.field6163.method1054(-8779);
                           ++var26;
                        }

                        if (~var26 <= ~var23) {
                           var4.method3057(var25, (byte)118, var24);
                           break;
                        }
                     }
                  }
               }

               if ((4096 & var5) != 0) {
                  var4.field6068 = class401.field6163.method1047((byte)-120);
                  var4.field6080 = class401.field6163.method1047((byte)-115);
                  var4.field6023 = class401.field6163.method1039(128);
                  var4.field6038 = (byte)class401.field6163.method1076((byte)-95);
                  var4.field6095 = class314.field4488 + class401.field6163.method1086(-1);
                  var4.field6074 = class314.field4488 - -class401.field6163.method1054(-8779);
               }

               if ((var5 & 2048) != 0) {
                  int var29 = var4.field1971.field5554.length;
                  int var30 = 0;
                  if (var4.field1971.field5614 != null) {
                     var30 = var4.field1971.field5614.length;
                  }

                  int var31 = 0;
                  if (var4.field1971.field5566 != null) {
                     var31 = var4.field1971.field5566.length;
                  }

                  int var32 = class401.field6163.method1043((byte)-119);
                  if ((var32 & 1) == 1) {
                     var4.field1965 = null;
                  } else {
                     int[] var33 = null;
                     if (~(var32 & 2) == -3) {
                        var33 = new int[var29];
                        int var34 = 0;
                        if (var1 != 0) {
                           var33[var34] = class401.field6163.method1038((byte)-109);
                           ++var34;
                        }

                        while(~var29 < ~var34) {
                           var33[var34] = class401.field6163.method1038((byte)-109);
                           ++var34;
                        }
                     }

                     short[] var35 = null;
                     if ((var32 & 4) == 4) {
                        var35 = new short[var30];
                        int var36 = 0;
                        if (var1 != 0 || ~var30 < ~var36) {
                           do {
                              var35[var36] = (short)class401.field6163.method1054(-8779);
                              ++var36;
                           } while(~var30 < ~var36);
                        }
                     }

                     short[] var37 = null;
                     if (~(var32 & 8) == -9) {
                        var37 = new short[var31];
                        int var38 = 0;
                        if (var1 != 0 || ~var38 > ~var31) {
                           do {
                              var37[var38] = (short)class401.field6163.method1086(-1);
                              ++var38;
                           } while(~var38 > ~var31);
                        }
                     }

                     long var39 = (long)(var4.field1975++) << 32 | (long)var3;
                     var4.field1965 = new class548(var39, var33, var35, var37);
                     if (var1 != 0) {
                        var4.field1965 = null;
                     }
                  }
               }

               if (~(32 & var5) != -1) {
                  var4.field6048 = class401.field6163.method1038((byte)-116);
                  if (~var4.field6048 == -65536) {
                     var4.field6048 = -1;
                  }
               }

               if (~(16 & var5) != -1) {
                  int var41 = class401.field6163.method1076((byte)-89);
                  if (var41 > 0) {
                     int var42 = 0;
                     if (var1 != 0 || var41 > var42) {
                        do {
                           int var43;
                           int var44;
                           int var45;
                           int var46;
                           label330: {
                              var43 = -1;
                              var44 = -1;
                              var45 = -1;
                              var46 = class401.field6163.method1061((byte)60);
                              if (~var46 != -32768) {
                                 if (var46 != 32766) {
                                    var44 = class401.field6163.method1061((byte)60);
                                    if (var1 == 0) {
                                       break label330;
                                    }
                                 }

                                 var46 = -1;
                                 if (var1 == 0) {
                                    break label330;
                                 }
                              }

                              var46 = class401.field6163.method1061((byte)60);
                              var44 = class401.field6163.method1061((byte)60);
                              var43 = class401.field6163.method1061((byte)60);
                              var45 = class401.field6163.method1061((byte)60);
                           }

                           int var47 = class401.field6163.method1061((byte)60);
                           int var48 = class401.field6163.method1074((byte)-120);
                           var4.method3039(var46, var48, var45, var44, class314.field4488, (byte)55, var43, var47);
                           ++var42;
                        } while(var41 > var42);
                     }
                  }
               }

               if (~(var5 & 32768) != -1) {
                  int var49 = class401.field6163.method1054(-8779);
                  var4.field6036 = class401.field6163.method1074((byte)-125);
                  var4.field6085 = class401.field6163.method1074((byte)-111);
                  var4.field6017 = ~(32768 & var49) != -1;
                  var4.field6069 = var49 & 32767;
                  var4.field6035 = class314.field4488 + var4.field6069 + var4.field6036;
               }

               if (~(131072 & var5) != -1) {
                  int var50 = class401.field6163.method1086(-1);
                  if (~var50 == -65536) {
                     var50 = -1;
                  }

                  int var51 = class401.field6163.method1082((byte)58);
                  int var52 = class401.field6163.method1074((byte)-125);
                  int var53 = 7 & var52;
                  int var54 = (120 & var52) >> 3;
                  if (~var54 == -16) {
                     var54 = -1;
                  }

                  var4.method3047(var50, var51, var53, (byte)11, var54, 2);
               }

               if (~(var5 & 128) != -1) {
                  var4.field6034 = class401.field6163.method1083((byte)65);
                  var4.field6052 = 100;
               }

               if (~(var5 & 2) != -1) {
                  int var55 = class401.field6163.method1038((byte)-107);
                  if (var55 == 65535) {
                     var55 = -1;
                  }

                  int var56 = class401.field6163.method1100(116);
                  int var57 = class401.field6163.method1074((byte)-128);
                  int var58 = var57 & 7;
                  int var59 = (var57 & 123) >> 3;
                  if (var59 == 15) {
                     var59 = -1;
                  }

                  var4.method3047(var55, var56, var58, (byte)11, var59, 0);
               }

               if (~(var5 & 1) != -1) {
                  int[] var60 = new int[4];
                  int var61 = 0;
                  if (var1 != 0) {
                     var60[var61] = class401.field6163.method1038((byte)-128);
                     if (~var60[var61] == -65536) {
                        var60[var61] = -1;
                     }

                     ++var61;
                  }

                  while(true) {
                     while(var61 < 4) {
                        var60[var61] = class401.field6163.method1038((byte)-128);
                        if (~var60[var61] == -65536) {
                           var60[var61] = -1;
                        }

                        ++var61;
                     }

                     int var62 = class401.field6163.method1104(255);
                     if (var1 == 0) {
                        class373.method2895(var62, 0, var4, var60);
                        break;
                     }

                     if (var62 == 0) {
                        var60[var61] = -1;
                     }

                     ++var61;
                  }
               }

               if (~(var5 & 512) != -1) {
                  var4.field6089 = class401.field6163.method1047((byte)98);
                  var4.field6039 = class401.field6163.method1045((byte)78);
                  var4.field6062 = class401.field6163.method1092((byte)68);
                  var4.field6047 = class401.field6163.method1047((byte)-8);
                  var4.field6086 = class401.field6163.method1086(-1) + class314.field4488;
                  var4.field6028 = class401.field6163.method1086(-1) - -class314.field4488;
                  var4.field6031 = class401.field6163.method1043((byte)-127);
                  var4.field6119 = 0;
                  var4.field6047 += var4.field6116[0];
                  var4.field6039 += var4.field6116[0];
                  var4.field6062 += var4.field6114[0];
                  var4.field6121 = 1;
                  var4.field6089 += var4.field6114[0];
               }

               if (~(16384 & var5) != -1) {
                  int var63 = class401.field6163.method1043((byte)-126);
                  int[] var64 = new int[var63];
                  int[] var65 = new int[var63];
                  int[] var66 = new int[var63];
                  int var67 = 0;
                  if (var1 == 0 && ~var67 <= ~var63) {
                     class791.method5676(var4, -101, var66, var65, var64);
                  } else {
                     while(true) {
                        int var68 = class401.field6163.method1053(false);
                        if (~var68 == -65536) {
                           var68 = -1;
                        }

                        var64[var67] = var68;
                        var65[var67] = class401.field6163.method1074((byte)-121);
                        var66[var67] = class401.field6163.method1053(false);
                        ++var67;
                        if (~var67 <= ~var63) {
                           class791.method5676(var4, -101, var66, var65, var64);
                           break;
                        }
                     }
                  }
               }

               if ((var5 & 65536) != 0) {
                  var4.field1952 = class401.field6163.method1083((byte)94);
                  if ("".equals(var4.field1952) || var4.field1952.equals(var4.field1971.field5597)) {
                     var4.field1952 = var4.field1971.field5597;
                  }
               }

               if ((64 & var5) != 0) {
                  if (var4.field1971.method2871(-77)) {
                     class58.method487(false, var4);
                  }

                  var4.method1288(57, class536.field7845.method3363(class401.field6163.method1086(-1), arg0));
                  var4.method3043((byte)-122, var4.field1971.field5589);
                  var4.field6104 = var4.field1971.field5628 << 3;
                  if (var4.field1971.method2871(-78)) {
                     class597.method4374(1111756009, 0, (class687)null, var4.field6116[0], (class557)null, var4.field9010, var4.field6114[0], var4);
                  }
               }

               ++var2;
            } while(var2 < class144.field1823);

         }
      } catch (RuntimeException var70) {
         throw class670.method4877(var70, field8594[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(Lki;B)V"
   )
   public abstract void method513(class736 arg0, byte arg1);

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(ILjj;)V"
   )
   public abstract void method514(int arg0, class128 arg1);

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(ILhg;Ljava/lang/Object;)V"
   )
   public static final void method4275(int arg0, class719 arg1, Object arg2) {
      int var3 = client.field4530;

      try {
         ++field8590;
         if (arg1.field10715 != null) {
            int var4 = 0;
            if (arg0 != 1001) {
               field8593 = -0.02672591717143298D;
               if (var3 != 0) {
                  class89.method817(1L, 2535);
                  ++var4;
               }
            }

            Object var10000;
            boolean var10001;
            while(true) {
               if (~var4 <= -51) {
                  try {
                     var10000 = arg2;
                     break;
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }
               }

               var10000 = arg1.field10715.peekEvent();
               if (var3 != 0) {
                  break;
               }

               if (var10000 == null) {
                  try {
                     var10000 = arg2;
                     break;
                  } catch (Exception var7) {
                     var10001 = false;
                     return;
                  }
               }

               class89.method817(1L, 2535);
               ++var4;
            }

            try {
               if (var10000 != null) {
                  arg1.field10715.postEvent(new ActionEvent(arg2, 1001, field8594[2]));
               }
            } catch (Exception var6) {
               var10001 = false;
            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field8594[5] + arg0 + ',' + (arg1 != null ? field8594[4] : field8594[3]) + ',' + (arg2 != null ? field8594[4] : field8594[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4276(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4277(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
