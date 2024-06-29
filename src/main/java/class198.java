import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class198 implements class765 {
   @OriginalMember(
      owner = "client!vp",
      name = "c",
      descriptor = "Lco;"
   )
   private class130 field2981;
   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "Lhw;"
   )
   private class141 field2982;
   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2988 = new String[]{method1708(method1707("\u001b\u001al_C")), method1708(method1707("\u001b\u001alYC")), method1708(method1707("\u0016Dl6\u0016")), method1708(method1707("\u0003\u001f.t")), method1708(method1707("\u001b\u001al$\u0002\u0003\u00036&C")), method1708(method1707("\u001b\u001alZC")), method1708(method1707("\u001b\u001alQC"))};
   @OriginalMember(
      owner = "client!vp",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field2983 = new int[1];
   @OriginalMember(
      owner = "client!vp",
      name = "e",
      descriptor = "Luw;"
   )
   public static class435 field2986 = new class435(14, 7);
   @OriginalMember(
      owner = "client!vp",
      name = "h",
      descriptor = "I"
   )
   public static int field2980;
   @OriginalMember(
      owner = "client!vp",
      name = "d",
      descriptor = "I"
   )
   public static int field2984;
   @OriginalMember(
      owner = "client!vp",
      name = "b",
      descriptor = "I"
   )
   public static int field2987;
   @OriginalMember(
      owner = "client!vp",
      name = "f",
      descriptor = "Ltd;"
   )
   private class476 field2985;

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method61(int arg0) {
      try {
         if (arg0 != -15367) {
            field2983 = null;
         }

         ++field2987;
         this.field2985 = class208.method1771(this.field2981.field2164, this.field2982, -82);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2988[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method58(boolean arg0, int arg1) {
      try {
         if (arg0) {
            int var3 = class720.field10406 <= class140.field2281 ? class140.field2281 : class720.field10406;
            int var4 = ~class218.field3296 >= ~class664.field9661 ? class664.field9661 : class218.field3296;
            int var5 = this.field2985.method3009();
            int var6 = this.field2985.method3000();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (-var9 + var4) / 2;
            if (~var4 > ~var9) {
               var8 = var4 * var5 / var6;
               var9 = var4;
               var10 = 0;
               var7 = (-var8 + var3) / 2;
            }

            this.field2985.method3602(var7, var10, var8, var9);
         }

         ++field2984;
         if (arg1 != 9124) {
            field2986 = null;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field2988[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method59(byte arg0) {
      try {
         ++field2980;
         int var2 = 113 % ((arg0 - 62) / 51);
         return this.field2982.method1335((byte)115, this.field2981.field2164);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2988[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1706(byte arg0) {
      try {
         field2983 = null;
         if (arg0 == 94) {
            field2986 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2988[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "<init>",
      descriptor = "(Lhw;Lco;)V"
   )
   public class198(class141 arg0, class130 arg1) {
      try {
         this.field2981 = arg1;
         this.field2982 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2988[4] + (arg0 != null ? field2988[2] : field2988[3]) + ',' + (arg1 != null ? field2988[2] : field2988[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1707(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1708(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
