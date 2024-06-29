import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class699 extends class428 {
   @OriginalMember(
      owner = "client!ab",
      name = "r",
      descriptor = "I"
   )
   public int field10236;
   @OriginalMember(
      owner = "client!ab",
      name = "q",
      descriptor = "Z"
   )
   public boolean field10231;
   @OriginalMember(
      owner = "client!ab",
      name = "y",
      descriptor = "Lqf;"
   )
   public class711 field10230;
   @OriginalMember(
      owner = "client!ab",
      name = "w",
      descriptor = "I"
   )
   public int field10227;
   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10240 = new String[]{method5083(method5082("\u0000*5L\u0010")), method5083(method5082("\u000f=wb")), method5083(method5082("\u001af5 E")), method5083(method5082("\u0000*52Q\u000f!o0\u0010")), method5083(method5082("\u0000*5O\u0010")), method5083(method5082("\u0000*5M\u0010"))};
   @OriginalMember(
      owner = "client!ab",
      name = "m",
      descriptor = "Leg;"
   )
   public static class118 field10234 = new class118(97, 10);
   @OriginalMember(
      owner = "client!ab",
      name = "p",
      descriptor = "I"
   )
   public static int field10237 = 100;
   @OriginalMember(
      owner = "client!ab",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field10239 = new int[1];
   @OriginalMember(
      owner = "client!ab",
      name = "s",
      descriptor = "I"
   )
   public static int field10232;
   @OriginalMember(
      owner = "client!ab",
      name = "t",
      descriptor = "I"
   )
   public static int field10235;
   @OriginalMember(
      owner = "client!ab",
      name = "o",
      descriptor = "Lkf;"
   )
   public static class266 field10238;
   @OriginalMember(
      owner = "client!ab",
      name = "u",
      descriptor = "Z"
   )
   public boolean field10228;
   @OriginalMember(
      owner = "client!ab",
      name = "n",
      descriptor = "Z"
   )
   public boolean field10229;
   @OriginalMember(
      owner = "client!ab",
      name = "v",
      descriptor = "Z"
   )
   public boolean field10233;

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(Ltn;B)I",
      line = 8
   )
   public static final int method5079(class95 arg0, byte arg1) {
      try {
         if (arg1 < 125) {
            field10237 = -123;
         }

         ++field10232;
         if (class10.field93 == arg0) {
            return 5890;
         } else if (class691.field10171 == arg0) {
            return 34167;
         } else if (class706.field10312 == arg0) {
            return 34168;
         } else if (class304.field4150 == arg0) {
            return 34166;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10240[0] + (arg0 != null ? field10240[2] : field10240[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(Z)V",
      line = 35
   )
   public static void method5080(boolean arg0) {
      try {
         field10234 = null;
         if (arg0) {
            field10238 = null;
         }

         field10239 = null;
         field10238 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10240[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "<init>",
      descriptor = "(ILqf;IZ)V",
      line = 54
   )
   public class699(int arg0, class711 arg1, int arg2, boolean arg3) {
      try {
         this.field10236 = arg2;
         this.field10231 = arg3;
         this.field10230 = arg1;
         this.field10227 = arg0;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10240[3] + arg0 + ',' + (arg1 != null ? field10240[2] : field10240[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(IB)Z",
      line = 70
   )
   public static final boolean method5081(int arg0, byte arg1) {
      try {
         if (arg1 <= 126) {
            method5079((class95)null, (byte)-12);
         }

         ++field10235;
         return ~arg0 == -3 || arg0 == 3;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10240[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5082(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5083(char[] arg0) {
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
            var10005 = 72;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
