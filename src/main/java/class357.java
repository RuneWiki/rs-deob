import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class357 extends class294 {
   @OriginalMember(
      owner = "client!sfa",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5521 = new String[]{method2922(method2921("N#iH\u001f\u0015")), method2922(method2921("N#iH\u001a\u0015")), method2922(method2921("N#iH\u0019\u0015")), method2922(method2921("N#iH\u0018\u0015")), method2922(method2921("N#iH\u001e\u0015"))};
   @OriginalMember(
      owner = "client!sfa",
      name = "t",
      descriptor = "Llj;"
   )
   public static class304 field5503 = new class304(5);
   @OriginalMember(
      owner = "client!sfa",
      name = "G",
      descriptor = "Luk;"
   )
   public static class498 field5508 = new class498(100, 3);
   @OriginalMember(
      owner = "client!sfa",
      name = "n",
      descriptor = "F"
   )
   public static float field5520 = 1024.0F;
   @OriginalMember(
      owner = "client!sfa",
      name = "H",
      descriptor = "I"
   )
   public static int field5491;
   @OriginalMember(
      owner = "client!sfa",
      name = "w",
      descriptor = "I"
   )
   public int field5492;
   @OriginalMember(
      owner = "client!sfa",
      name = "P",
      descriptor = "I"
   )
   public int field5493;
   @OriginalMember(
      owner = "client!sfa",
      name = "x",
      descriptor = "I"
   )
   public static int field5494;
   @OriginalMember(
      owner = "client!sfa",
      name = "O",
      descriptor = "I"
   )
   public int field5495;
   @OriginalMember(
      owner = "client!sfa",
      name = "N",
      descriptor = "I"
   )
   public int field5496;
   @OriginalMember(
      owner = "client!sfa",
      name = "M",
      descriptor = "I"
   )
   public int field5497;
   @OriginalMember(
      owner = "client!sfa",
      name = "u",
      descriptor = "I"
   )
   public int field5498;
   @OriginalMember(
      owner = "client!sfa",
      name = "p",
      descriptor = "I"
   )
   public int field5499;
   @OriginalMember(
      owner = "client!sfa",
      name = "C",
      descriptor = "I"
   )
   public int field5501;
   @OriginalMember(
      owner = "client!sfa",
      name = "m",
      descriptor = "I"
   )
   public int field5504;
   @OriginalMember(
      owner = "client!sfa",
      name = "E",
      descriptor = "I"
   )
   public static int field5505;
   @OriginalMember(
      owner = "client!sfa",
      name = "q",
      descriptor = "I"
   )
   public int field5506;
   @OriginalMember(
      owner = "client!sfa",
      name = "I",
      descriptor = "I"
   )
   public int field5507;
   @OriginalMember(
      owner = "client!sfa",
      name = "D",
      descriptor = "I"
   )
   public int field5510;
   @OriginalMember(
      owner = "client!sfa",
      name = "A",
      descriptor = "I"
   )
   public int field5511;
   @OriginalMember(
      owner = "client!sfa",
      name = "o",
      descriptor = "I"
   )
   public int field5512;
   @OriginalMember(
      owner = "client!sfa",
      name = "K",
      descriptor = "I"
   )
   public int field5513;
   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "I"
   )
   public int field5514;
   @OriginalMember(
      owner = "client!sfa",
      name = "s",
      descriptor = "I"
   )
   public int field5515;
   @OriginalMember(
      owner = "client!sfa",
      name = "L",
      descriptor = "I"
   )
   public static int field5516;
   @OriginalMember(
      owner = "client!sfa",
      name = "y",
      descriptor = "Lec;"
   )
   public class184 field5517;
   @OriginalMember(
      owner = "client!sfa",
      name = "F",
      descriptor = "Lsu;"
   )
   public static class289 field5519;
   @OriginalMember(
      owner = "client!sfa",
      name = "J",
      descriptor = "Lmd;"
   )
   public class54 field5509;
   @OriginalMember(
      owner = "client!sfa",
      name = "B",
      descriptor = "Lss;"
   )
   public class559 field5502;
   @OriginalMember(
      owner = "client!sfa",
      name = "v",
      descriptor = "Lcq;"
   )
   public class582 field5500;
   @OriginalMember(
      owner = "client!sfa",
      name = "r",
      descriptor = "Lrr;"
   )
   public static class678 field5518;

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2916(byte arg0) {
      try {
         this.field5502 = null;
         this.field5517 = null;
         this.field5500 = null;
         this.field5509 = null;
         ++field5505;
         int var2 = -29 / ((arg0 - -44) / 56);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5521[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IBII)I"
   )
   public static final int method2917(int arg0, byte arg1, int arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         label31: {
            ++field5516;
            if (~arg3 >= -244) {
               if (~arg3 < -218) {
                  arg2 >>= 3;
                  if (!var4) {
                     break label31;
                  }
               }

               if (arg3 <= 192) {
                  if (~arg3 >= -180) {
                     break label31;
                  }

                  arg2 >>= 1;
                  if (!var4) {
                     break label31;
                  }
               }

               arg2 >>= 2;
               if (!var4) {
                  break label31;
               }
            }

            arg2 >>= 4;
         }

         int var5 = -123 / ((arg1 - 49) / 52);
         return (arg3 >> 1) + (arg2 >> 5 << 7) + ((arg0 >> 2 & 63) << 10);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5521[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2918(int arg0) {
      try {
         field5508 = null;
         int var1 = -70 / ((9 - arg0) / 43);
         field5518 = null;
         field5519 = null;
         field5503 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5521[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method2919(boolean arg0) {
      try {
         ++field5491;
         if (arg0) {
            field5520 = 0.054330077F;
         }

         class686.field10203.method2551(!arg0);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5521[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method2920(byte arg0, int arg1) {
      try {
         ++field5494;
         if (arg0 != -51) {
            field5518 = null;
         }

         if (~arg1 != -6407) {
            if (~arg1 != -6410) {
               if (~arg1 == -32842) {
                  return 1;
               } else if (arg1 != 6410) {
                  if (~arg1 == -6408) {
                     return 3;
                  } else if (~arg1 == -6409) {
                     return 4;
                  } else {
                     throw new IllegalArgumentException("");
                  }
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5521[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2921(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2922(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
