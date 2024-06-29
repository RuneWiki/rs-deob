import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class362 extends class334 implements class390 {
   @OriginalMember(
      owner = "client!afa",
      name = "m",
      descriptor = "I"
   )
   private int field5458;
   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5459 = new String[]{method2826(method2825(":w/0Ks")), method2826(method2825(" ?`0p")), method2826(method2825(":w/012\u007f'j3s")), method2826(method2825("5d\"r")), method2826(method2825(":w/0Ds")), method2826(method2825(":w/0Js")), method2826(method2825(":w/0Os")), method2826(method2825(":w/0Es")), method2826(method2825(":w/0Hs"))};
   @OriginalMember(
      owner = "client!afa",
      name = "l",
      descriptor = "Lsd;"
   )
   public static class101 field5452 = new class101(57, 4);
   @OriginalMember(
      owner = "client!afa",
      name = "s",
      descriptor = "I"
   )
   public static int field5455 = 0;
   @OriginalMember(
      owner = "client!afa",
      name = "n",
      descriptor = "Loi;"
   )
   public static class79 field5454 = new class79(5, 1);
   @OriginalMember(
      owner = "client!afa",
      name = "o",
      descriptor = "I"
   )
   public static int field5449;
   @OriginalMember(
      owner = "client!afa",
      name = "r",
      descriptor = "I"
   )
   public static int field5450;
   @OriginalMember(
      owner = "client!afa",
      name = "t",
      descriptor = "I"
   )
   public static int field5451;
   @OriginalMember(
      owner = "client!afa",
      name = "u",
      descriptor = "I"
   )
   public static int field5453;
   @OriginalMember(
      owner = "client!afa",
      name = "p",
      descriptor = "I"
   )
   public static int field5456;
   @OriginalMember(
      owner = "client!afa",
      name = "q",
      descriptor = "I"
   )
   public static int field5457;

   @OriginalMember(
      owner = "client!afa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2820(int arg0) {
      try {
         field5452 = null;
         field5454 = null;
         if (arg0 >= -22) {
            field5454 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5459[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method2821(boolean arg0) {
      try {
         ++field5449;
         if (arg0) {
            this.method2824((byte)-18);
         }

         return super.field4785;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5459[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method2822(int arg0) {
      try {
         if (arg0 != 16968) {
            return -82L;
         } else {
            ++field5456;
            return 0L;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5459[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method2823(int arg0, int arg1, byte[] arg2, int arg3) {
      try {
         if (arg0 <= 32) {
            field5457 = 55;
         }

         this.method2532(arg3, arg2, 3);
         ++field5451;
         this.field5458 = arg1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5459[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5459[1] : field5459[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "<init>",
      descriptor = "(Lck;I[BIZ)V"
   )
   public class362(class667 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field5458 = arg1;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5459[2] + (arg0 != null ? field5459[1] : field5459[3]) + ',' + arg1 + ',' + (arg2 != null ? field5459[1] : field5459[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "<init>",
      descriptor = "(Lck;ILjaclib/memory/Buffer;IZ)V"
   )
   public class362(class667 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field5458 = arg1;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5459[2] + (arg0 != null ? field5459[1] : field5459[3]) + ',' + arg1 + ',' + (arg2 != null ? field5459[1] : field5459[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method995(int arg0) {
      try {
         super.field4783.method4850(this, 34962);
         if (arg0 != -18582) {
            method2820(4);
         }

         ++field5453;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5459[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method2824(byte arg0) {
      try {
         if (arg0 < 31) {
            this.method995(-74);
         }

         ++field5450;
         return this.field5458;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5459[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2825(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2826(char[] arg0) {
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
            var10005 = 17;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
