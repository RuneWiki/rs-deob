import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class776 {
   @OriginalMember(
      owner = "client!jv",
      name = "b",
      descriptor = "I"
   )
   public int field11314;
   @OriginalMember(
      owner = "client!jv",
      name = "d",
      descriptor = "I"
   )
   public int field11307;
   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field11310;
   @OriginalMember(
      owner = "client!jv",
      name = "m",
      descriptor = "J"
   )
   public long field11308;
   @OriginalMember(
      owner = "client!jv",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field11313;
   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11317 = new String[]{method5609(method5608("2\u007f]\u0018")), method5609(method5608("6|\u001f2!")), method5609(method5608("'$\u001fZt")), method5609(method5608("6|\u001f0!")), method5609(method5608("6|\u001f6!")), method5609(method5608("6|\u001f1!")), method5609(method5608("6|\u001f5!")), method5609(method5608("6|\u001fH`2cEJ!"))};
   @OriginalMember(
      owner = "client!jv",
      name = "k",
      descriptor = "Llia;"
   )
   public static class633 field11304 = new class633(method5609(method5608("\u000b^`5")), method5609(method5608("3lW\u001dj9")), method5609(method5608("\u0003{P")), 2);
   @OriginalMember(
      owner = "client!jv",
      name = "l",
      descriptor = "Lkb;"
   )
   public static class500 field11312 = new class500(method5609(method5608("/~T\u0018e=xU\u0015~2")), method5609(method5608("\u000f~T\u0018e=x\u00110h+d")), 1);
   @OriginalMember(
      owner = "client!jv",
      name = "h",
      descriptor = "F"
   )
   public static float field11315;
   @OriginalMember(
      owner = "client!jv",
      name = "i",
      descriptor = "F"
   )
   public static float field11316;
   @OriginalMember(
      owner = "client!jv",
      name = "f",
      descriptor = "I"
   )
   public static int field11305;
   @OriginalMember(
      owner = "client!jv",
      name = "c",
      descriptor = "I"
   )
   public static int field11306;
   @OriginalMember(
      owner = "client!jv",
      name = "e",
      descriptor = "I"
   )
   public static int field11309;
   @OriginalMember(
      owner = "client!jv",
      name = "g",
      descriptor = "I"
   )
   public static int field11311;

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(Ljava/lang/String;ZILjava/lang/String;I)V"
   )
   public static final void method5602(String arg0, boolean arg1, int arg2, String arg3, int arg4) {
      try {
         class1.method2(arg1, arg2, arg3, true, -1, arg0, -98);
         ++field11311;
         int var5 = -15 / ((arg4 - 45) / 47);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11317[6] + (arg0 != null ? field11317[2] : field11317[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11317[2] : field11317[0]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method5603(int arg0, int arg1) {
      try {
         ++field11305;
         if (arg0 != -10) {
            method5604(4);
         }

         return ~arg1 <= -1 && arg1 <= 3 || ~arg1 == -10;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11317[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5604(int arg0) {
      try {
         field11312 = null;
         field11304 = null;
         if (arg0 != -10) {
            method5605((class339)null, true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11317[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(Lww;Z)V"
   )
   public static final void method5605(class339 arg0, boolean arg1) {
      try {
         if (!arg1) {
            method5607(-59, 70, -46);
         }

         class36.field507 = arg0;
         ++field11306;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11317[5] + (arg0 != null ? field11317[2] : field11317[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "([BBI)I"
   )
   public static final int method5606(byte[] arg0, byte arg1, int arg2) {
      try {
         ++field11309;
         if (arg1 != -70) {
            field11304 = null;
         }

         return class69.method681(arg0, arg2, 0, true);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11317[1] + (arg0 != null ? field11317[2] : field11317[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(III)Lpf;"
   )
   public static final class30 method5607(int arg0, int arg1, int arg2) {
      class731 var3 = class548.field8080[arg0][arg1][arg2];
      return var3 == null ? null : var3.field10656;
   }

   @OriginalMember(
      owner = "client!jv",
      name = "<init>",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V"
   )
   public class776(int arg0, String arg1, int arg2, String arg3, long arg4) {
      try {
         this.field11314 = arg0;
         this.field11307 = arg2;
         this.field11310 = arg1;
         this.field11308 = arg4;
         this.field11313 = arg3;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field11317[7] + arg0 + ',' + (arg1 != null ? field11317[2] : field11317[0]) + ',' + arg2 + ',' + (arg3 != null ? field11317[2] : field11317[0]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5608(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5609(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
