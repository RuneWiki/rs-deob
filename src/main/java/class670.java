import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class670 extends class15 {
   @OriginalMember(
      owner = "client!ma",
      name = "y",
      descriptor = "I"
   )
   private int field9925;
   @OriginalMember(
      owner = "client!ma",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9930 = new String[]{method4894(method4893("\f9#'\u000b")), method4894(method4893("\f9#!\u000b")), method4894(method4893("\f9# \u000b")), method4894(method4893("\f9#\"\u000b")), method4894(method4893("\f9#_J\u000f1y]\u000b")), method4894(method4893("\f9#%\u000b")), method4894(method4893("\f9#$\u000b")), method4894(method4893("\u000f-a\u000f")), method4894(method4893("\f9#+\u000b")), method4894(method4893("\u001av#M^"))};
   @OriginalMember(
      owner = "client!ma",
      name = "s",
      descriptor = "I"
   )
   public static int field9919 = 0;
   @OriginalMember(
      owner = "client!ma",
      name = "v",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9923 = new String[100];
   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "I"
   )
   public static int field9918;
   @OriginalMember(
      owner = "client!ma",
      name = "t",
      descriptor = "I"
   )
   public static int field9922;
   @OriginalMember(
      owner = "client!ma",
      name = "B",
      descriptor = "I"
   )
   public static int field9924;
   @OriginalMember(
      owner = "client!ma",
      name = "E",
      descriptor = "I"
   )
   public static int field9926;
   @OriginalMember(
      owner = "client!ma",
      name = "w",
      descriptor = "I"
   )
   public static int field9927;
   @OriginalMember(
      owner = "client!ma",
      name = "D",
      descriptor = "I"
   )
   public static int field9928;
   @OriginalMember(
      owner = "client!ma",
      name = "u",
      descriptor = "I"
   )
   public static int field9929;
   @OriginalMember(
      owner = "client!ma",
      name = "x",
      descriptor = "[Lvk;"
   )
   public class451[] field9920;
   @OriginalMember(
      owner = "client!ma",
      name = "C",
      descriptor = "[[B"
   )
   private byte[][] field9921;

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4885(byte arg0) {
      try {
         int var1 = 75 / ((-51 - arg0) / 61);
         field9923 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9930[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(Ljava/lang/String;BLjava/lang/String;ZZ)V"
   )
   public static final void method4886(String arg0, byte arg1, String arg2, boolean arg3, boolean arg4) {
      try {
         class130.field1666 = arg2;
         ++field9926;
         class783.field11418 = arg4;
         class668.field9903 = arg3;
         class76.field1009 = arg0;
         if (!arg3) {
            class428.field5822 = -1;
         }

         if (arg1 <= 45) {
            field9923 = null;
         }

         if (class668.field9903 || !class76.field1009.equals("") && !class130.field1666.equals("")) {
            class223.field2792.field8768 = false;
            if (~class413.field5674 != -2) {
               class597.field8825 = 0;
               class116.field1525 = -1;
            }

            class419.method3265((byte)-115, -3);
            class663.field9827 = 0;
            class484.field6741 = 0;
            class623.field9218 = 1;
         } else {
            class419.method3265((byte)-55, 3);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9930[8] + (arg0 != null ? field9930[9] : field9930[7]) + ',' + arg1 + ',' + (arg2 != null ? field9930[9] : field9930[7]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method4887(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method4888(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         int var4 = 46 % ((32 - arg0) / 55);
         if (~class262.field3328 != ~arg1) {
            class17.field290 = new int[arg1];
            int var5 = 0;
            if (var3) {
               class17.field290[var5] = (var5 << 12) / arg1;
               ++var5;
            }

            while(true) {
               while(~arg1 < ~var5) {
                  class17.field290[var5] = (var5 << 12) / arg1;
                  ++var5;
               }

               class696.field10206 = arg1 * 32;
               class174.field2249 = arg1 - 1;
               if (!var3) {
                  class262.field3328 = arg1;
                  break;
               }

               ++var5;
            }
         }

         ++field9918;
         if (~class99.field1313 != ~arg2) {
            label54: {
               if (class262.field3328 != arg2) {
                  class502.field6979 = new int[arg2];
                  int var6 = 0;
                  if (var3) {
                     class502.field6979[var6] = (var6 << 12) / arg2;
                     ++var6;
                  }

                  while(true) {
                     while(arg2 > var6) {
                        class502.field6979[var6] = (var6 << 12) / arg2;
                        ++var6;
                     }

                     if (!var3) {
                        if (!var3) {
                           break label54;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               class502.field6979 = class17.field290;
            }

            class623.field9205 = arg2 + -1;
            class99.field1313 = arg2;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field9930[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "c",
      descriptor = "(II)Z"
   )
   public final boolean method4889(int arg0, int arg1) {
      try {
         int var3 = -47 % ((arg0 - 70) / 56);
         ++field9924;
         return this.field9920[arg1].field6117;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9930[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "(II)Z"
   )
   public final boolean method4890(int arg0, int arg1) {
      try {
         if (arg1 != 3) {
            method4885((byte)98);
         }

         ++field9922;
         return this.field9920[arg0].field6122;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9930[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method4891(int arg0, int arg1) {
      try {
         ++field9927;
         if (arg1 <= 114) {
            field9919 = 112;
         }

         return this.field9920[arg0].field6115;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9930[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "()V"
   )
   public static final void method4892() {
      while(true) {
         boolean var0 = true;

         for(int var1 = 0; var1 < class403.field5537.length; ++var1) {
            if (!class403.field5537[var1].method4814()) {
               synchronized(class403.field5537[var1]) {
                  class403.field5537[var1].notify();
               }

               var0 = false;
            } else {
               class749.field10939[var1] = class403.field5537[var1].method4815();
            }
         }

         if (var0) {
            class403.field5537[class403.field5537.length - 1].method4816();
            class125.method1083(1);

            while(true) {
               boolean var3 = true;

               for(int var4 = 0; var4 < class403.field5537.length - 1; ++var4) {
                  if (!class403.field5537[var4].method4814()) {
                     synchronized(class403.field5537[var4]) {
                        class403.field5537[var4].notify();
                     }

                     var3 = false;
                  }
               }

               if (var3) {
                  for(int var6 = 1; var6 < class403.field5537.length - 2; ++var6) {
                     class403.field5537[var6].method4816();
                  }

                  class125.method1083(2);

                  while(!class403.field5537[0].method4814()) {
                     synchronized(class403.field5537[0]) {
                        class403.field5537[0].notify();
                     }

                     try {
                        class340.method2717(1L, (byte)-119);
                     } catch (Exception var9) {
                     }
                  }

                  class403.field5537[0].method4816();
                  return;
               }

               try {
                  class340.method2717(1L, (byte)-119);
               } catch (Exception var12) {
               }
            }
         }

         try {
            class340.method2717(1L, (byte)-119);
         } catch (Exception var8) {
         }
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class670(int arg0) {
      try {
         this.field9925 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9930[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4893(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4894(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
