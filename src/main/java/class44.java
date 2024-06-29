import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class44 extends class557 {
   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field661 = new String[]{method499(method498(".\u0011\foN")), method499(method498(".\u0011\flN")), method499(method498("1H\f\u0005\u001b")), method499(method498(".\u0011\fiN")), method499(method498("$\u0013NG")), method499(method498(".\u0011\faN")), method499(method498(".\u0011\fmN")), method499(method498(".\u0011\fhN")), method499(method498(".\u0011\fnN"))};
   @OriginalMember(
      owner = "client!dw",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field654 = false;
   @OriginalMember(
      owner = "client!dw",
      name = "o",
      descriptor = "Laaa;"
   )
   public static class393 field653 = null;
   @OriginalMember(
      owner = "client!dw",
      name = "m",
      descriptor = "I"
   )
   public static int field652;
   @OriginalMember(
      owner = "client!dw",
      name = "p",
      descriptor = "I"
   )
   public static int field655;
   @OriginalMember(
      owner = "client!dw",
      name = "j",
      descriptor = "I"
   )
   public static int field656;
   @OriginalMember(
      owner = "client!dw",
      name = "i",
      descriptor = "I"
   )
   public static int field657;
   @OriginalMember(
      owner = "client!dw",
      name = "n",
      descriptor = "I"
   )
   public static int field658;
   @OriginalMember(
      owner = "client!dw",
      name = "h",
      descriptor = "I"
   )
   public static int field659;
   @OriginalMember(
      owner = "client!dw",
      name = "l",
      descriptor = "I"
   )
   public static int field660;

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field657;
         if (~super.field7905 > -1 || super.field7905 > 4) {
            super.field7905 = this.method97(0);
         }

         if (arg0 != -22) {
            method495(120, true, (class395)null, (byte)72, (int[])null);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field661[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field656;
         if (arg0 != 1) {
            field653 = null;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field661[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class44(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!dw",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method494(int arg0) {
      try {
         ++field659;
         return arg0 >= -52 ? -46 : super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field661[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(IZLbt;B[I)V"
   )
   public static final void method495(int arg0, boolean arg1, class395 arg2, byte arg3, int[] arg4) {
      boolean var5 = client.field10022;

      try {
         if (arg2.field5816 != null) {
            class258 var8;
            int var10000;
            label174: {
               byte var6 = 1;
               int var7 = 0;
               if (var5) {
                  var10000 = ~arg4[var7];
               } else if (~var7 <= ~arg2.field5816.length) {
                  var8 = arg2.field5831;
                  var10000 = var6;
                  if (!var5) {
                     break label174;
                  }
               } else {
                  var10000 = ~arg4[var7];
               }

               label173:
               do {
                  while(true) {
                     if (var10000 != ~arg2.field5816[var7]) {
                        var6 = 0;
                        if (!var5) {
                           var8 = arg2.field5831;
                           var10000 = var6;
                           break;
                        }

                        ++var7;
                     } else {
                        ++var7;
                     }

                     if (~var7 <= ~arg2.field5816.length) {
                        var8 = arg2.field5831;
                        var10000 = var6;
                        if (!var5) {
                           break label173;
                        }
                     } else {
                        var10000 = ~arg4[var7];
                     }
                  }
               } while(var5);
            }

            if (var10000 != 0 && var8.method2201((byte)97)) {
               class33 var9 = arg2.field5831.method2196((byte)23);
               int var10 = var9.field468;
               if (var10 == 1) {
                  var8.method2193((byte)-82, arg0);
               }

               if (~var10 == -3) {
                  var8.method2205(80);
               }
            }
         }

         ++field660;
         boolean var11 = true;
         if (arg3 > 63) {
            int var12 = 0;
            if (var5) {
               if (~arg4[var12] != 0) {
                  var11 = false;
               }
            } else if (arg4.length <= var12) {
               if (!var5) {
                  if (var11) {
                     arg2.field5816 = arg4;
                     arg2.field5831.method2203(true, arg0);
                     if (arg1) {
                        arg2.field5856 = arg2.field5860;
                        return;
                     }
                  }

                  return;
               }

               if (var11) {
                  var11 = false;
               }
            } else if (~arg4[var12] != 0) {
               var11 = false;
            }

            while(true) {
               if (arg2.field5816 != null) {
                  if (arg2.field5816[var12] != -1) {
                     if (~class216.field3085.method4252(arg4[var12], -1).field481 <= ~class216.field3085.method4252(arg2.field5816[var12], -1).field481) {
                        arg2.field5816 = arg4;
                        arg2.field5831.method2203(true, arg0);
                        if (arg1) {
                           arg2.field5856 = arg2.field5860;
                        }

                        ++var12;
                     } else {
                        ++var12;
                     }
                  } else {
                     arg2.field5816 = arg4;
                     arg2.field5831.method2203(true, arg0);
                     if (arg1) {
                        arg2.field5856 = arg2.field5860;
                     }

                     ++var12;
                  }
               } else {
                  arg2.field5816 = arg4;
                  arg2.field5831.method2203(true, arg0);
                  if (arg1) {
                     arg2.field5856 = arg2.field5860;
                  }

                  ++var12;
               }

               if (arg4.length <= var12) {
                  if (!var5) {
                     if (var11) {
                        arg2.field5816 = arg4;
                        arg2.field5831.method2203(true, arg0);
                        if (arg1) {
                           arg2.field5856 = arg2.field5860;
                           return;
                        }
                     }

                     return;
                  }

                  if (var11) {
                     var11 = false;
                  }
               } else if (~arg4[var12] != 0) {
                  var11 = false;
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field661[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field661[2] : field661[4]) + ',' + arg3 + ',' + (arg4 != null ? field661[2] : field661[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         super.field7905 = arg0;
         ++field652;
         if (!arg1) {
            method496(-61);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field661[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class44(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!dw",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method496(int arg0) {
      try {
         if (arg0 != -1) {
            method495(58, true, (class395)null, (byte)85, (int[])null);
         }

         field653 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field661[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            method497(9, (class751)null);
         }

         ++field658;
         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field661[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(ILs;)V"
   )
   public static final void method497(int arg0, class751 arg1) {
      class225.field3197[arg0] = arg1;
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method498(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method499(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
