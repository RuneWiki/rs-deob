import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class689 {
   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10245 = new String[]{method5081(method5080("tnu]\u0005")), method5081(method5080("}\"u5P")), method5081(method5080("hy7w")), method5081(method5080("tnuZ\u0005")), method5081(method5080("tnuS\u0005")), method5081(method5080("tnu_\u0005")), method5081(method5080("tnuX\u0005")), method5081(method5080("tnu^\u0005")), method5081(method5080("tnuY\u0005")), method5081(method5080("tnu\\\u0005"))};
   @OriginalMember(
      owner = "client!rb",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field10234 = new class498(32, -1);
   @OriginalMember(
      owner = "client!rb",
      name = "e",
      descriptor = "[Lnga;"
   )
   public static class159[] field10243 = new class159[4];
   @OriginalMember(
      owner = "client!rb",
      name = "h",
      descriptor = "I"
   )
   public int field10232;
   @OriginalMember(
      owner = "client!rb",
      name = "l",
      descriptor = "I"
   )
   public int field10233;
   @OriginalMember(
      owner = "client!rb",
      name = "j",
      descriptor = "I"
   )
   public static int field10235;
   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "I"
   )
   public static int field10236;
   @OriginalMember(
      owner = "client!rb",
      name = "i",
      descriptor = "I"
   )
   public static int field10237;
   @OriginalMember(
      owner = "client!rb",
      name = "f",
      descriptor = "I"
   )
   public static int field10239;
   @OriginalMember(
      owner = "client!rb",
      name = "k",
      descriptor = "I"
   )
   public static int field10240;
   @OriginalMember(
      owner = "client!rb",
      name = "d",
      descriptor = "I"
   )
   public static int field10241;
   @OriginalMember(
      owner = "client!rb",
      name = "c",
      descriptor = "I"
   )
   public static int field10242;
   @OriginalMember(
      owner = "client!rb",
      name = "g",
      descriptor = "[Lm;"
   )
   public class26[] field10238;
   @OriginalMember(
      owner = "client!rb",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field10244;

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(BLica;)V"
   )
   public final void method5072(byte arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         this.field10233 = arg1.method2872(2);
         ++field10242;
         this.field10232 = arg1.method2848(arg0 ^ 66);
         this.field10238 = new class26[arg1.method2855(-31007)];
         class783[] var4 = class312.method2597(arg0 ^ 18);
         int var5 = 0;
         if (var3) {
            this.field10238[var5] = this.method5077(arg1, var4[arg1.method2855(class419.method3339(arg0, 31012))], 126);
            ++var5;
         }

         while(true) {
            while(~var5 > ~this.field10238.length) {
               this.field10238[var5] = this.method5077(arg1, var4[arg1.method2855(class419.method3339(arg0, 31012))], 126);
               ++var5;
            }

            if (!var3) {
               if (arg0 != -59) {
                  this.method5072((byte)-128, (class354)null);
                  return;
               }

               return;
            }

            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10245[4] + arg0 + ',' + (arg1 != null ? field10245[1] : field10245[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method5073(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         ++field10241;
         if (class678.field10127 != arg1) {
            class199.field3060 = new int[arg1];
            int var4 = 0;
            if (var3) {
               class199.field3060[var4] = (var4 << 12) / arg1;
               ++var4;
            }

            while(true) {
               while(arg1 > var4) {
                  class199.field3060[var4] = (var4 << 12) / arg1;
                  ++var4;
               }

               class50.field637 = arg1 + -1;
               class678.field10127 = arg1;
               if (!var3) {
                  class354.field5405 = arg1 * 32;
                  break;
               }

               ++var4;
            }
         }

         if (class304.field4744 != arg2) {
            label75: {
               if (class678.field10127 == arg2) {
                  class204.field3113 = class199.field3060;
                  if (!var3) {
                     break label75;
                  }
               }

               class204.field3113 = new int[arg2];
               int var5 = 0;
               if (var3 || var5 < arg2) {
                  do {
                     class204.field3113[var5] = (var5 << 12) / arg2;
                     ++var5;
                  } while(var5 < arg2);
               }
            }

            class304.field4744 = arg2;
            class578.field8547 = arg2 - 1;
         }

         if (arg0 != -1) {
            method5078(-62, (byte)53, 43);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10245[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5074(byte arg0) {
      try {
         field10244 = null;
         field10234 = null;
         if (arg0 > -16) {
            method5079(84, 92, 47);
         }

         field10243 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10245[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(ILuaa;)V"
   )
   public static final void method5075(int param0, class119 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(IIB[II)V"
   )
   public static final void method5076(int arg0, int arg1, byte arg2, int[] arg3, int arg4) {
      boolean var5 = client.field1786;

      try {
         --arg1;
         if (arg2 == 57) {
            ++field10237;
            int var9 = arg0 - 1;
            int var6 = var9 + -7;
            int var10;
            if (var5) {
               var10 = arg1 + 1;
               arg3[var10] = arg4;
               int var11 = var10 + 1;
               arg3[var11] = arg4;
               int var12 = var11 + 1;
               arg3[var12] = arg4;
               int var13 = var12 + 1;
               arg3[var13] = arg4;
               int var14 = var13 + 1;
               arg3[var14] = arg4;
               int var15 = var14 + 1;
               arg3[var15] = arg4;
               int var16 = var15 + 1;
               arg3[var16] = arg4;
               arg1 = var16 + 1;
               arg3[arg1] = arg4;
            }

            while(true) {
               while(~arg1 > ~var6) {
                  var10 = arg1 + 1;
                  arg3[var10] = arg4;
                  ++var10;
                  arg3[var10] = arg4;
                  ++var10;
                  arg3[var10] = arg4;
                  ++var10;
                  arg3[var10] = arg4;
                  ++var10;
                  arg3[var10] = arg4;
                  ++var10;
                  arg3[var10] = arg4;
                  ++var10;
                  arg3[var10] = arg4;
                  arg1 = var10 + 1;
                  arg3[arg1] = arg4;
               }

               if (!var5) {
                  if (var5) {
                     ++arg1;
                     arg3[arg1] = arg4;
                  }

                  while(~arg1 > ~var9) {
                     ++arg1;
                     arg3[arg1] = arg4;
                  }

                  return;
               }

               ++arg1;
               arg3[arg1] = arg4;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field10245[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10245[1] : field10245[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(Lica;Lbda;I)Lm;"
   )
   private final class26 method5077(class354 arg0, class783 arg1, int arg2) {
      try {
         ++field10240;
         if (class716.field10728 == arg1) {
            return class595.method4426(false, arg0);
         } else if (class751.field11145 == arg1) {
            return class797.method5747(arg0, -20910);
         } else if (class147.field2205 == arg1) {
            return class280.method2345(arg0, -2);
         } else {
            int var4 = 10 % ((arg2 - 1) / 47);
            if (class759.field11226 == arg1) {
               return class614.method4520(arg0, 2);
            } else if (class82.field1164 == arg1) {
               return class419.method3340(12, arg0);
            } else if (class696.field10344 == arg1) {
               return class535.method4112(-57, arg0);
            } else if (class288.field4528 == arg1) {
               return class571.method4294((byte)111, arg0);
            } else if (class650.field9377 == arg1) {
               return class68.method522((byte)-93, arg0);
            } else if (class186.field2916 == arg1) {
               return class246.method2091(1, arg0);
            } else {
               return class133.field1892 == arg1 ? class301.method2520(-2, arg0) : null;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10245[8] + (arg0 != null ? field10245[1] : field10245[2]) + ',' + (arg1 != null ? field10245[1] : field10245[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method5078(int arg0, byte arg1, int arg2) {
      try {
         ++field10236;
         if (arg1 != -50) {
            return false;
         } else {
            return class31.method223(arg2, arg0, (byte)61) | (393216 & arg2) != 0 || class605.method4466(arg2, (byte)-62, arg0);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10245[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(III)Lfr;"
   )
   public static final class482 method5079(int arg0, int arg1, int arg2) {
      try {
         ++field10239;
         class482 var3 = new class482();
         var3.field7337 = -1;
         var3.field7327 = arg1 - -6;
         if (arg0 >= -49) {
            field10243 = null;
         }

         var3.field7344 = arg2 + 1 + 5;
         var3.field7329 = -1;
         var3.field7339 = new int[var3.field7327][var3.field7344];
         var3.method3744(-40);
         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10245[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5080(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5081(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
