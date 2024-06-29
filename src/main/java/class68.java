import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class68 extends class294 {
   @OriginalMember(
      owner = "client!fs",
      name = "m",
      descriptor = "I"
   )
   public int field898;
   @OriginalMember(
      owner = "client!fs",
      name = "t",
      descriptor = "I"
   )
   public int field900;
   @OriginalMember(
      owner = "client!fs",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field902 = new String[]{method530(method529("fI\u0013\u0006\u0007")), method530(method529("s\u0012QD")), method530(method529("{\u0014\u0013lR")), method530(method529("{\u0014\u0013jR")), method530(method529("{\u0014\u0013aR")), method530(method529("{\u0014\u0013oR")), method530(method529("{\u0014\u0013kR")), method530(method529("{\u0014\u0013nR")), method530(method529("{\u0014\u0013`R")), method530(method529("{\u0014\u0013\u0014\u0013s\u000eI\u0016R")), method530(method529("{\u0014\u0013iR")), method530(method529("{\u0014\u0013mR"))};
   @OriginalMember(
      owner = "client!fs",
      name = "o",
      descriptor = "Lgea;"
   )
   public static class750 field888 = new class750();
   @OriginalMember(
      owner = "client!fs",
      name = "q",
      descriptor = "Luk;"
   )
   public static class498 field892 = new class498(124, 6);
   @OriginalMember(
      owner = "client!fs",
      name = "y",
      descriptor = "J"
   )
   public static long field897 = 0L;
   @OriginalMember(
      owner = "client!fs",
      name = "p",
      descriptor = "I"
   )
   public static int field887;
   @OriginalMember(
      owner = "client!fs",
      name = "u",
      descriptor = "I"
   )
   public static int field889;
   @OriginalMember(
      owner = "client!fs",
      name = "s",
      descriptor = "I"
   )
   public static int field890;
   @OriginalMember(
      owner = "client!fs",
      name = "v",
      descriptor = "I"
   )
   public static int field891;
   @OriginalMember(
      owner = "client!fs",
      name = "r",
      descriptor = "I"
   )
   public static int field893;
   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "I"
   )
   public static int field894;
   @OriginalMember(
      owner = "client!fs",
      name = "x",
      descriptor = "I"
   )
   public static int field895;
   @OriginalMember(
      owner = "client!fs",
      name = "w",
      descriptor = "I"
   )
   public static int field896;
   @OriginalMember(
      owner = "client!fs",
      name = "n",
      descriptor = "I"
   )
   public static int field899;
   @OriginalMember(
      owner = "client!fs",
      name = "A",
      descriptor = "Liba;"
   )
   public static class343 field901;

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(B)I",
      line = 4
   )
   public final int method520(byte arg0) {
      try {
         if (arg0 != 42) {
            this.method521(-36);
         }

         ++field896;
         return class180.method1634((byte)121, this.field898);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field902[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(I)Z",
      line = 17
   )
   public final boolean method521(int arg0) {
      try {
         ++field891;
         if (arg0 != 1) {
            return false;
         } else {
            return ~(this.field898 >> 21 & 1) != -1;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field902[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(BLica;)Lej;",
      line = 34
   )
   public static final class665 method522(byte arg0, class354 arg1) {
      try {
         ++field889;
         String var2 = arg1.method2843(-1);
         class694 var3 = class389.method3142((byte)-83)[arg1.method2855(-31007)];
         class750 var4 = class666.method4919((byte)91)[arg1.method2855(-31007)];
         int var5 = arg1.method2869(false);
         if (arg0 > -66) {
            return null;
         } else {
            int var6 = arg1.method2869(false);
            int var7 = arg1.method2855(-31007);
            int var8 = arg1.method2855(-31007);
            int var9 = arg1.method2855(-31007);
            int var10 = arg1.method2848(-119);
            int var11 = arg1.method2848(-123);
            int var12 = arg1.method2894(109);
            int var13 = arg1.method2894(118);
            int var14 = arg1.method2894(124);
            return new class665(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field902[2] + arg0 + ',' + (arg1 != null ? field902[0] : field902[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "b",
      descriptor = "(I)V",
      line = 71
   )
   public static void method523(int arg0) {
      try {
         if (arg0 == -8890) {
            field901 = null;
            field888 = null;
            field892 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field902[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "c",
      descriptor = "(I)Z",
      line = 83
   )
   public final boolean method524(int arg0) {
      try {
         if (arg0 != 1696813014) {
            field899 = -127;
         }

         ++field890;
         return ~((5716868 & this.field898) >> 22) != -1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field902[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(ZII)V",
      line = 94
   )
   public static final void method525(boolean arg0, int arg1, int arg2) {
      try {
         ++field894;
         class566 var3 = class146.method1321((long)arg1, 6, -1428737160);
         var3.method4269((byte)-111);
         if (!arg0) {
            field897 = -17L;
         }

         var3.field8394 = arg2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field902[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(IB)Z",
      line = 108
   )
   public final boolean method526(int arg0, byte arg1) {
      try {
         if (arg1 != -61) {
            return false;
         } else {
            ++field893;
            return (this.field898 >> arg0 + 1 & 1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field902[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "b",
      descriptor = "(B)Z",
      line = 119
   )
   public final boolean method527(byte arg0) {
      try {
         if (arg0 != 63) {
            return false;
         } else {
            ++field887;
            return ~(this.field898 & 1) != -1;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field902[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "c",
      descriptor = "(B)I",
      line = 134
   )
   public final int method528(byte arg0) {
      try {
         ++field895;
         if (arg0 < 87) {
            this.method520((byte)-54);
         }

         return (2091444 & this.field898) >> 18;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field902[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "<init>",
      descriptor = "(II)V",
      line = 160
   )
   public class68(int arg0, int arg1) {
      try {
         this.field898 = arg0;
         this.field900 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field902[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method530(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
