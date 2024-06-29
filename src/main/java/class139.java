import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class139 extends class698 implements class516 {
   @OriginalMember(
      owner = "client!ofa",
      name = "d",
      descriptor = "I"
   )
   private int field2226;
   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2237 = new String[]{method1404(method1403("YiCt8\u001e")), method1404(method1403("YiCt2\u001e")), method1404(method1403("YiCt=\u001e")), method1404(method1403("YiCt9\u001e")), method1404(method1403("YiCt<\u001e")), method1404(method1403("YiCt?\u001e")), method1404(method1403("M!\ft\u0007")), method1404(method1403("XzN6")), method1404(method1403("YiCtF_aK.D\u001e")), method1404(method1403("YiCt>\u001e"))};
   @OriginalMember(
      owner = "client!ofa",
      name = "i",
      descriptor = "Lbga;"
   )
   public static class398 field2228 = new class398(8);
   @OriginalMember(
      owner = "client!ofa",
      name = "k",
      descriptor = "F"
   )
   public static float field2232;
   @OriginalMember(
      owner = "client!ofa",
      name = "h",
      descriptor = "I"
   )
   public static int field2227;
   @OriginalMember(
      owner = "client!ofa",
      name = "f",
      descriptor = "I"
   )
   public static int field2229;
   @OriginalMember(
      owner = "client!ofa",
      name = "l",
      descriptor = "I"
   )
   public static int field2230;
   @OriginalMember(
      owner = "client!ofa",
      name = "e",
      descriptor = "I"
   )
   public static int field2231;
   @OriginalMember(
      owner = "client!ofa",
      name = "m",
      descriptor = "I"
   )
   public static int field2233;
   @OriginalMember(
      owner = "client!ofa",
      name = "j",
      descriptor = "I"
   )
   public static int field2234;
   @OriginalMember(
      owner = "client!ofa",
      name = "g",
      descriptor = "I"
   )
   public static int field2235;
   @OriginalMember(
      owner = "client!ofa",
      name = "c",
      descriptor = "I"
   )
   public static int field2236;

   @OriginalMember(
      owner = "client!ofa",
      name = "<init>",
      descriptor = "(Laea;I[BI)V"
   )
   public class139(class678 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field2226 = arg1;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2237[8] + (arg0 != null ? field2237[6] : field2237[7]) + ',' + arg1 + ',' + (arg2 != null ? field2237[6] : field2237[7]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method1396(int arg0) {
      try {
         if (arg0 != 17378) {
            method1401((byte)-18, (byte)-61);
         }

         ++field2235;
         return super.field10071.getAddress();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2237[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "<init>",
      descriptor = "(Laea;ILjaclib/memory/Buffer;)V"
   )
   public class139(class678 arg0, int arg1, Buffer arg2) {
      super(arg0, arg2);

      try {
         this.field2226 = arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2237[8] + (arg0 != null ? field2237[6] : field2237[7]) + ',' + arg1 + ',' + (arg2 != null ? field2237[6] : field2237[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1397(int arg0) {
      try {
         if (arg0 != -28824) {
            return -14;
         } else {
            ++field2230;
            return this.field2226;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2237[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method1398(int arg0, String arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2231;
         if (class37.field543 && ~(24 & class394.field5716) != -1) {
            boolean var3;
            label76: {
               var3 = false;
               int var4 = class274.field4182;
               int[] var5 = class124.field1983;
               int var6 = 0;
               if (arg0 != -9717) {
                  method1401((byte)45, (byte)-100);
                  if (!var2 && var4 <= var6) {
                     break label76;
                  }
               } else if (var4 <= var6) {
                  break label76;
               }

               do {
                  class158 var7 = class501.field7137[var5[var6]];
                  if (var7.field2402 != null) {
                     if (!var7.field2402.equalsIgnoreCase(arg1)) {
                        ++var6;
                     } else if ((class117.field1849 != var7 || (class394.field5716 & 16) == 0) && (8 & class394.field5716) == 0) {
                        ++var6;
                     } else {
                        ++class17.field234;
                        class381 var8 = class801.method5775(class330.field4928, 0, class745.field10605.field3718);
                        var8.field5570.method675(arg0 + -22614, class451.field6582);
                        var8.field5570.method675(-32331, class704.field10135);
                        var8.field5570.method653(var5[var6], -112);
                        var8.field5570.method689((byte)-121, 0);
                        var8.field5570.method674(-31, class224.field3183);
                        class745.field10605.method2111(arg0 + 23741, var8);
                        class627.method4612(var7.method1507(-52), (byte)106, true, var7.field5861[0], -2, 0, 0, var7.method1507(arg0 ^ 9657), var7.field5865[0]);
                        var3 = true;
                        if (!var2) {
                           break;
                        }

                        ++var6;
                     }
                  } else {
                     ++var6;
                  }
               } while(var4 > var6);
            }

            if (!var3) {
               class249.method2149(17, class765.field10924.method5512(-2, class777.field11340) + arg1, 4);
            }

            if (class37.field543) {
               class499.method3776(121);
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2237[9] + arg0 + ',' + (arg1 != null ? field2237[6] : field2237[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1399(boolean arg0) {
      try {
         if (arg0) {
            this.method1402(-51, -22, 43, (byte[])null);
         }

         ++field2233;
         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2237[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1400(int arg0) {
      try {
         field2228 = null;
         if (arg0 != -1) {
            field2232 = -0.46203005F;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2237[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(BB)Z"
   )
   public static final boolean method1401(byte arg0, byte arg1) {
      try {
         ++field2227;
         if (arg0 != 61) {
            return true;
         } else {
            int var2 = arg1 & 255;
            if (~var2 == -1) {
               return false;
            } else {
               return ~var2 > -129 || var2 >= 160 || class574.field8113[var2 + -128] != 0;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2237[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(III[B)V"
   )
   public final void method1402(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.method5107(arg3, arg2);
         ++field2236;
         if (arg1 == 8680) {
            this.field2226 = arg0;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2237[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2237[6] : field2237[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1403(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1404(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
