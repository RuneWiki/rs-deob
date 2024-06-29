import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class28 extends class184 implements class581 {
   @OriginalMember(
      owner = "client!aba",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field419 = new String[]{method360(method359("xWx<I1")), method360(method359("b\u001b7<\u007f")), method360(method359("w@u~")), method360(method359("xWx<F1")), method360(method359("xWx<E1")), method360(method359("xWx<H1")), method360(method359("xWx<A1")), method360(method359("xWx<@1")), method360(method359("xWx<D1")), method360(method359("xWx<J1")), method360(method359("xWx<G1")), method360(method359("xWx<K1"))};
   @OriginalMember(
      owner = "client!aba",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field414 = false;
   @OriginalMember(
      owner = "client!aba",
      name = "F",
      descriptor = "Ldb;"
   )
   public static class685 field410 = new class685(9, 7);
   @OriginalMember(
      owner = "client!aba",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field418 = new int[1];
   @OriginalMember(
      owner = "client!aba",
      name = "E",
      descriptor = "B"
   )
   private byte field409;
   @OriginalMember(
      owner = "client!aba",
      name = "x",
      descriptor = "I"
   )
   public static int field406;
   @OriginalMember(
      owner = "client!aba",
      name = "B",
      descriptor = "I"
   )
   public static int field407;
   @OriginalMember(
      owner = "client!aba",
      name = "A",
      descriptor = "I"
   )
   public static int field408;
   @OriginalMember(
      owner = "client!aba",
      name = "u",
      descriptor = "I"
   )
   public static int field411;
   @OriginalMember(
      owner = "client!aba",
      name = "D",
      descriptor = "I"
   )
   public static int field412;
   @OriginalMember(
      owner = "client!aba",
      name = "y",
      descriptor = "I"
   )
   public static int field413;
   @OriginalMember(
      owner = "client!aba",
      name = "C",
      descriptor = "I"
   )
   public static int field415;
   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "I"
   )
   public static int field416;
   @OriginalMember(
      owner = "client!aba",
      name = "G",
      descriptor = "I"
   )
   public static int field417;

   @OriginalMember(
      owner = "client!aba",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method349(byte arg0) {
      try {
         if (arg0 == -33) {
            field418 = null;
            field410 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field419[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method350(int arg0) {
      try {
         ++field417;
         return arg0 <= 77 ? -66 : super.method350(101);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field419[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(BII)Z"
   )
   public final boolean method351(byte arg0, int arg1, int arg2) {
      try {
         this.field409 = (byte)arg2;
         ++field408;
         if (arg0 != 38) {
            this.method351((byte)-99, -76, -31);
         }

         super.method981(arg1, (byte)124);
         return true;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field419[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "<init>",
      descriptor = "(Lqs;Z)V"
   )
   public class28(class771 arg0, boolean arg1) {
      super(arg0, 34962, arg1);
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method352(int arg0) {
      try {
         ++field412;
         if (arg0 != -2070) {
            field418 = null;
         }

         return super.method1660(super.field2702.field11149, 1);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field419[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(ZB)Ljaclib/memory/Buffer;"
   )
   public final Buffer method353(boolean arg0, byte arg1) {
      try {
         if (arg1 <= 98) {
            return null;
         } else {
            ++field415;
            return super.method1659(-92, super.field2702.field11149, arg0);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field419[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(IIZIIIIIF)[[I"
   )
   public static final int[][] method354(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8) {
      boolean var9 = client.field10022;

      try {
         ++field406;
         int[][] var10 = new int[arg4][arg1];
         class76 var11 = new class76();
         var11.field1227 = arg6;
         var11.field1212 = arg2;
         var11.field1223 = arg7;
         var11.field1219 = arg0;
         var11.field1221 = (int)(arg8 * 4096.0F);
         var11.method270((byte)119);
         class261.method2250(arg1, arg4, arg3 + 32);
         int var12 = arg3;
         if (var9) {
            var11.method843(var10[arg3], arg3 + 19077, arg3);
            var12 = arg3 + 1;
         }

         while(true) {
            while(~var12 > ~arg4) {
               var11.method843(var10[var12], arg3 + 19077, var12);
               ++var12;
            }

            if (!var9) {
               return var10;
            }

            ++var12;
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field419[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(IILjaclib/memory/Source;I)Z"
   )
   public final boolean method355(int arg0, int arg1, Source arg2, int arg3) {
      try {
         ++field407;
         this.field409 = (byte)arg0;
         if (arg1 != -23537) {
            return false;
         } else {
            super.method1661(arg2, arg3, -103);
            return true;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field419[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field419[1] : field419[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "([BIIB)I"
   )
   public static final int method356(byte[] arg0, int arg1, int arg2, byte arg3) {
      boolean var4 = client.field10022;

      try {
         ++field411;
         int var5 = -1;
         int var6 = arg1;
         if (var4) {
            var5 = var5 >>> 8 ^ class614.field8729[255 & (var5 ^ arg0[arg1])];
            var6 = arg1 + 1;
         }

         while(true) {
            while(arg2 > var6) {
               var5 = var5 >>> 8 ^ class614.field8729[255 & (var5 ^ arg0[var6])];
               ++var6;
            }

            int var7 = 69 / ((72 - arg3) / 41);
            int var8 = ~var5;
            if (!var4) {
               return var8;
            }

            var5 = var8;
            ++var6;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field419[0] + (arg0 != null ? field419[1] : field419[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method357(byte arg0) {
      try {
         ++field416;
         if (arg0 != 32) {
            this.method355(-20, -10, (Source)null, -65);
         }

         return this.field409;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field419[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method358(boolean arg0) {
      try {
         ++field413;
         super.method358(arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field419[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method359(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method360(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
