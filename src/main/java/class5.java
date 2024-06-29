import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends IOException {
   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field58 = new String[]{method43(method42("?$#<u")), method43(method42("?$#>u")), method43(method42("52a\u0016")), method43(method42(" i#T ")), method43(method42("?$#9u")), method43(method42("?$#?u")), method43(method42("?$#8u")), method43(method42("?$#=u")), method43(method42("?$#;u"))};
   @OriginalMember(
      owner = "client!dc",
      name = "e",
      descriptor = "[[I"
   )
   public static int[][] field57 = new int[][]{{0, 1, 2, 3}, {1, 2, 3, 0}, {1, 2, -1, 0}, {2, 0, -1, 1}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 1, 3, -1}, {-1, 0, 2, -1}, {3, 5, 2, 0}, {0, 2, 5, 3}, {0, 2, 3, 5}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "I"
   )
   public static int field49;
   @OriginalMember(
      owner = "client!dc",
      name = "f",
      descriptor = "I"
   )
   public static int field50;
   @OriginalMember(
      owner = "client!dc",
      name = "g",
      descriptor = "I"
   )
   public static int field51;
   @OriginalMember(
      owner = "client!dc",
      name = "d",
      descriptor = "I"
   )
   public static int field52;
   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "I"
   )
   public static int field53;
   @OriginalMember(
      owner = "client!dc",
      name = "h",
      descriptor = "I"
   )
   public static int field54;
   @OriginalMember(
      owner = "client!dc",
      name = "i",
      descriptor = "I"
   )
   public static int field56;
   @OriginalMember(
      owner = "client!dc",
      name = "c",
      descriptor = "Lhw;"
   )
   public static class141 field55;

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(III)I",
      line = 3
   )
   public static final int method35(int arg0, int arg1, int arg2) {
      try {
         ++field51;
         if (arg1 > -100) {
            return -44;
         } else {
            arg0 = (arg2 & 127) * arg0 >> 7;
            if (~arg0 <= -3) {
               if (~arg0 >= -127) {
                  return (arg2 & 65408) + arg0;
               }

               arg0 = 126;
               if (!client.field4564) {
                  return (arg2 & 65408) + arg0;
               }
            }

            arg0 = 2;
            return (arg2 & 65408) + arg0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field58[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(B)V",
      line = 24
   )
   public static final void method36(byte arg0) {
      boolean var1 = client.field4564;

      try {
         if (class245.field3527 != null) {
            int var2 = 0;
            if (var1) {
               class245.field3527[var2] = null;
               ++var2;
            }

            while(true) {
               while(~var2 > ~class614.field8921) {
                  class245.field3527[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class245.field3527 = null;
                  break;
               }

               ++var2;
            }
         }

         ++field54;
         if (class530.field7719 != null) {
            int var3 = 0;
            if (var1) {
               class530.field7719[var3] = null;
               ++var3;
            }

            while(true) {
               while(~class38.field912 < ~var3) {
                  class530.field7719[var3] = null;
                  ++var3;
               }

               if (!var1) {
                  class530.field7719 = null;
                  break;
               }

               ++var3;
            }
         }

         if (class256.field3636 != null) {
            int var4 = 0;
            if (var1) {
               class256.field3636[var4] = null;
               ++var4;
            }

            while(true) {
               while(var4 < class778.field11382) {
                  class256.field3636[var4] = null;
                  ++var4;
               }

               if (!var1) {
                  class256.field3636 = null;
                  break;
               }

               ++var4;
            }
         }

         class533.field7769 = -1;
         class580.field8327 = -1;
         class596.field8597 = null;
         class665.field9667 = null;
         class128.field2141 = null;
         if (arg0 > -70) {
            method36((byte)17);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field58[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 79
   )
   public class5(String arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(ILgha;[[B)V",
      line = 83
   )
   public static final void method37(int arg0, class363 arg1, byte[][] arg2) {
      boolean var3 = client.field4564;

      try {
         ++field53;
         if (arg0 < -85) {
            int var4 = class756.field10978.length;
            int var5 = 0;
            if (var3 || var4 > var5) {
               do {
                  byte[] var6 = arg2[var5];
                  if (var6 != null) {
                     int var7 = (class733.field10553[var5] >> 8) * 64 + -class347.field4939;
                     int var8 = (255 & class733.field10553[var5]) * 64 - class753.field10887;
                     class743.method5393(4);
                     arg1.method2846(var8, (byte)92, var6, class444.field6473, var7, class218.field3299);
                  }

                  ++var5;
               } while(var4 > var5);

            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field58[7] + arg0 + ',' + (arg1 != null ? field58[3] : field58[2]) + ',' + (arg2 != null ? field58[3] : field58[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(I)V",
      line = 115
   )
   public static void method38(int arg0) {
      try {
         if (arg0 == 127) {
            field57 = null;
            field55 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field58[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(IIZ)V",
      line = 128
   )
   public static final void method39(int arg0, int arg1, boolean arg2) {
      try {
         ++field49;
         if (arg2) {
            field56 = -2;
         }

         class536 var3 = class108.method1038((long)arg1, 83, 1);
         var3.method4017(24076);
         var3.field7800 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field58[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(III[B)[B",
      line = 143
   )
   public static final byte[] method40(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         ++field52;
         byte[] var4 = new byte[arg0];
         class365.method2856(arg3, arg2, var4, 0, arg0);
         return arg1 <= 41 ? null : var4;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field58[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field58[3] : field58[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(Z[FI)[F",
      line = 160
   )
   public static final float[] method41(boolean arg0, float[] arg1, int arg2) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field50;
            float[] var3 = new float[arg2];
            class365.method2857(arg1, 0, var3, 0, arg2);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field58[8] + arg0 + ',' + (arg1 != null ? field58[3] : field58[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method42(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method43(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
