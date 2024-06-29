import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class693 {
   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10176 = new String[]{method5043(method5042("\ra< \u000bD")), method5043(method5042("\u0017(s 4")), method5043(method5042("\u0002s1b")), method5043(method5042("\ra< \bD")), method5043(method5042("\ra< \nD")), method5043(method5042("\ra< \rD"))};
   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "Ltm;"
   )
   public static class407 field10165 = class133.method1273((byte)11);
   @OriginalMember(
      owner = "client!aga",
      name = "g",
      descriptor = "B"
   )
   public byte field10152;
   @OriginalMember(
      owner = "client!aga",
      name = "l",
      descriptor = "B"
   )
   public byte field10154;
   @OriginalMember(
      owner = "client!aga",
      name = "e",
      descriptor = "B"
   )
   public byte field10161;
   @OriginalMember(
      owner = "client!aga",
      name = "u",
      descriptor = "B"
   )
   public byte field10164;
   @OriginalMember(
      owner = "client!aga",
      name = "h",
      descriptor = "B"
   )
   public byte field10167;
   @OriginalMember(
      owner = "client!aga",
      name = "o",
      descriptor = "B"
   )
   public byte field10170;
   @OriginalMember(
      owner = "client!aga",
      name = "j",
      descriptor = "B"
   )
   public byte field10173;
   @OriginalMember(
      owner = "client!aga",
      name = "p",
      descriptor = "I"
   )
   public int field10155;
   @OriginalMember(
      owner = "client!aga",
      name = "d",
      descriptor = "I"
   )
   public static int field10156;
   @OriginalMember(
      owner = "client!aga",
      name = "k",
      descriptor = "I"
   )
   public int field10158;
   @OriginalMember(
      owner = "client!aga",
      name = "b",
      descriptor = "I"
   )
   public static int field10160;
   @OriginalMember(
      owner = "client!aga",
      name = "f",
      descriptor = "I"
   )
   public int field10166;
   @OriginalMember(
      owner = "client!aga",
      name = "n",
      descriptor = "I"
   )
   public static int field10168;
   @OriginalMember(
      owner = "client!aga",
      name = "t",
      descriptor = "I"
   )
   public static int field10174;
   @OriginalMember(
      owner = "client!aga",
      name = "c",
      descriptor = "S"
   )
   public short field10162;
   @OriginalMember(
      owner = "client!aga",
      name = "i",
      descriptor = "Z"
   )
   public boolean field10153;
   @OriginalMember(
      owner = "client!aga",
      name = "x",
      descriptor = "Z"
   )
   public boolean field10157;
   @OriginalMember(
      owner = "client!aga",
      name = "w",
      descriptor = "Z"
   )
   public boolean field10159;
   @OriginalMember(
      owner = "client!aga",
      name = "v",
      descriptor = "Z"
   )
   public boolean field10163;
   @OriginalMember(
      owner = "client!aga",
      name = "m",
      descriptor = "Z"
   )
   public boolean field10169;
   @OriginalMember(
      owner = "client!aga",
      name = "q",
      descriptor = "Z"
   )
   public boolean field10171;
   @OriginalMember(
      owner = "client!aga",
      name = "s",
      descriptor = "Z"
   )
   public boolean field10172;
   @OriginalMember(
      owner = "client!aga",
      name = "r",
      descriptor = "Z"
   )
   public boolean field10175;

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(B)V",
      line = 14
   )
   public static final void method5038(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field10168;
         short var2 = 1024;
         short var3 = 3072;
         if (class679.field9962) {
            var3 = 4096;
            if (class630.field9185) {
               var2 = 2048;
            }
         }

         if (class621.field9035 < (float)var2) {
            class621.field9035 = (float)var2;
            if (var1) {
               class756.field10975 -= 16384.0F;
            }
         }

         while(true) {
            float var10000;
            float var10001;
            if (!(class756.field10975 >= 16384.0F)) {
               var10000 = class621.field9035;
               var10001 = (float)var3;
               if (!var1) {
                  if (var10000 > var10001) {
                     class621.field9035 = (float)var3;
                     if (var1) {
                        class756.field10975 += 16384.0F;
                     }
                  }

                  while(class756.field10975 < 0.0F) {
                     class756.field10975 += 16384.0F;
                  }

                  int var4 = class587.field8484 >> 9;
                  int var5 = class243.field3500 >> 9;
                  int var6 = class663.method4851(class243.field3500, class587.field8484, class731.field10504, 115);
                  int var7 = 0;
                  if (var4 > 3 && var5 > 3 && class209.field3112 + -4 > var4 && var5 < class1.field3 + -4) {
                     int var8 = var4 - 4;
                     if (var1 || var4 - -4 >= var8) {
                        do {
                           int var9 = var5 + -4;
                           if (var1 || ~var9 >= ~(var5 - -4)) {
                              do {
                                 int var10 = class731.field10504;
                                 if (var10 < 3 && class561.method4189(var8, arg0 + -32032, var9)) {
                                    ++var10;
                                 }

                                 int var11 = 0;
                                 if (class358.field5362.field1902 != null && class358.field5362.field1902[var10] != null) {
                                    var11 = (class358.field5362.field1902[var10][var8][var9] & 255) * 8 << 2;
                                 }

                                 if (class269.field3810 != null && class269.field3810[var10] != null) {
                                    int var12 = var6 + var11 + -class269.field3810[var10].method2289(var8, var9, (byte)121);
                                    if (~var7 > ~var12) {
                                       var7 = var12;
                                    }
                                 }

                                 ++var9;
                              } while(~var9 >= ~(var5 - -4));
                           }

                           ++var8;
                        } while(var4 - -4 >= var8);
                     }
                  }

                  if (arg0 != 14) {
                     return;
                  } else {
                     int var13 = (var7 >> 2) * 1536;
                     if (var13 > 786432) {
                        var13 = 786432;
                     }

                     if (~var13 > -262145) {
                        var13 = 262144;
                     }

                     if (~class463.field6770 <= ~var13) {
                        if (class463.field6770 > var13) {
                           class463.field6770 += (-class463.field6770 + var13) / 80;
                           return;
                        }
                     } else {
                        class463.field6770 += (-class463.field6770 + var13) / 24;
                     }

                     return;
                  }
               }
            } else {
               var10000 = class756.field10975;
               var10001 = 16384.0F;
            }

            class756.field10975 = var10000 - var10001;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field10176[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(II[BIII[BII)V",
      line = 121
   )
   public static final void method5039(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      boolean var9 = client.field4564;

      try {
         ++field10174;
         if (arg8 != -571462391) {
            field10165 = null;
         }

         int var10 = -(arg4 >> 2);
         int var16 = -(arg4 & 3);
         int var11 = -arg5;
         if (var9 || ~var11 > -1) {
            label88:
            do {
               int var12 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg7++;
                  arg2[var10001] += arg6[arg1++];
                  int var17 = arg7++;
                  arg2[var17] += arg6[arg1++];
                  int var18 = arg7++;
                  arg2[var18] += arg6[arg1++];
                  int var19 = arg7++;
                  arg2[var19] += arg6[arg1++];
                  var12 = var10 + 1;
               }

               while(true) {
                  while(~var12 > -1) {
                     var10001 = arg7++;
                     arg2[var10001] += arg6[arg1++];
                     var10001 = arg7++;
                     arg2[var10001] += arg6[arg1++];
                     var10001 = arg7++;
                     arg2[var10001] += arg6[arg1++];
                     var10001 = arg7++;
                     arg2[var10001] += arg6[arg1++];
                     ++var12;
                  }

                  int var13 = var16;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg7++;
                        arg2[var10001] += arg6[arg1++];
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(~var13 > -1) {
                           var10001 = arg7++;
                           arg2[var10001] += arg6[arg1++];
                           ++var13;
                        }

                        arg1 += arg3;
                        arg7 += arg0;
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
         throw class608.method4462(var15, field10176[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10176[1] : field10176[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10176[1] : field10176[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(IZ)V",
      line = 168
   )
   public static final void method5040(int arg0, boolean arg1) {
      boolean var2 = client.field4564;

      try {
         if (arg1) {
            if (class277.field3907 != -1) {
               class17.method128((byte)49, class277.field3907);
            }

            int var10000;
            label60: {
               class719 var3 = (class719)class520.field7582.method1567((byte)-44);
               if (var2) {
                  var10000 = var3.method156(false);
               } else if (var3 == null) {
                  class277.field3907 = -1;
                  class520.field7582 = new class178(8);
                  class17.method121(false);
                  class277.field3907 = class591.field8522;
                  class715.method5185(false, arg0 ^ -2487);
                  class585.method4337((byte)-39);
                  var10000 = class277.field3907;
                  if (!var2) {
                     break label60;
                  }
               } else {
                  var10000 = var3.method156(false);
               }

               label59:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class719)class520.field7582.method1567((byte)-44);
                        if (var3 == null) {
                           if (!var2) {
                              class277.field3907 = -1;
                              class520.field7582 = new class178(8);
                              class17.method121(false);
                              class277.field3907 = class591.field8522;
                              class715.method5185(false, arg0 ^ -2487);
                              class585.method4337((byte)-39);
                              var10000 = class277.field3907;
                              break;
                           }

                           class242.method1970((byte)119, var3, true, false);
                           var3 = (class719)class520.field7582.method1575((byte)-128);
                        } else {
                           class242.method1970((byte)119, var3, true, false);
                           var3 = (class719)class520.field7582.method1575((byte)-128);
                        }
                     } else {
                        class242.method1970((byte)119, var3, true, false);
                        var3 = (class719)class520.field7582.method1575((byte)-128);
                     }

                     if (var3 == null) {
                        class277.field3907 = -1;
                        class520.field7582 = new class178(8);
                        class17.method121(false);
                        class277.field3907 = class591.field8522;
                        class715.method5185(false, arg0 ^ -2487);
                        class585.method4337((byte)-39);
                        var10000 = class277.field3907;
                        if (!var2) {
                           break label59;
                        }
                     } else {
                        var10000 = var3.method156(false);
                     }
                  }
               } while(var2);
            }

            class161.method1468(var10000);
         }

         ++field10160;
         class533.field7764 = true;
         if (arg0 != 2513) {
            field10156 = 127;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10176[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "b",
      descriptor = "(B)V",
      line = 216
   )
   public static void method5041(byte arg0) {
      try {
         field10165 = null;
         if (arg0 != 92) {
            method5039(50, 58, (byte[])null, 13, -11, 124, (byte[])null, -77, -39);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10176[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5042(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5043(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
