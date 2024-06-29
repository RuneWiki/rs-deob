import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class573 extends class757 {
   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8406 = new String[]{method4301(method4300("yxl:\u0010")), method4301(method4300("s<l^E")), method4301(method4300("fg.\u001c")), method4301(method4300("yxl8\u0010")), method4301(method4300("yxl9\u0010")), method4301(method4300("yxl6\u0010")), method4301(method4300("yxl4\u0010")), method4301(method4300("yxl5\u0010"))};
   @OriginalMember(
      owner = "client!qj",
      name = "x",
      descriptor = "Laka;"
   )
   public static class418 field8398 = new class418(39, 6);
   @OriginalMember(
      owner = "client!qj",
      name = "r",
      descriptor = "I"
   )
   public static int field8401 = 0;
   @OriginalMember(
      owner = "client!qj",
      name = "y",
      descriptor = "I"
   )
   public static int field8397;
   @OriginalMember(
      owner = "client!qj",
      name = "s",
      descriptor = "I"
   )
   public static int field8399;
   @OriginalMember(
      owner = "client!qj",
      name = "u",
      descriptor = "I"
   )
   public static int field8400;
   @OriginalMember(
      owner = "client!qj",
      name = "v",
      descriptor = "I"
   )
   public static int field8402;
   @OriginalMember(
      owner = "client!qj",
      name = "t",
      descriptor = "I"
   )
   public static int field8404;
   @OriginalMember(
      owner = "client!qj",
      name = "w",
      descriptor = "I"
   )
   public static int field8405;
   @OriginalMember(
      owner = "client!qj",
      name = "q",
      descriptor = "Lpd;"
   )
   private class648 field8403;

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(ILs;)V"
   )
   public static final void method4297(int arg0, class423 arg1) {
      class659.field9815[arg0] = arg1;
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public final void method3508(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         class629.field9294.method462(arg1 - 2, arg0, super.field11086.field2853 + 4, super.field11086.field2850 + 2, ((class630)super.field11086).field9300, 0);
         ++field8400;
         class629.field9294.method462(arg1 + -1, arg0 + arg3, super.field11086.field2853 + 2, super.field11086.field2850, 0, 0);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8406[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method221(int arg0) {
      try {
         ++field8404;
         return !super.method221(arg0) ? false : super.field11092.method2681((byte)100, ((class630)super.field11086).field9302);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8406[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "<init>",
      descriptor = "(Lww;Lww;Lffa;)V"
   )
   public class573(class339 arg0, class339 arg1, class630 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(ZBII)V"
   )
   public final void method3506(boolean arg0, byte arg1, int arg2, int arg3) {
      try {
         if (arg1 != 62) {
            field8401 = -111;
         }

         ++field8405;
         int var5 = this.method5479(22) * super.field11086.field2853 / 10000;
         int[] var6 = new int[4];
         class629.field9294.method417(var6);
         class629.field9294.method460(arg3, arg2 + 2, arg3 + var5, super.field11086.field2850 + arg2);
         this.field8403.method4762(arg3, arg2 - -2, super.field11086.field2853, super.field11086.field2850);
         class629.field9294.method460(var6[0], var6[1], var6[2], var6[3]);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field8406[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "([Ljava/lang/Object;[IIIB)V"
   )
   public static final void method4298(Object[] param0, int[] param1, int param2, int param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4299(boolean arg0) {
      try {
         field8398 = null;
         if (arg0) {
            method4298((Object[])null, (int[])null, -73, 36, (byte)53);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8406[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method223(int arg0) {
      try {
         super.method223(arg0);
         ++field8399;
         this.field8403 = class13.method110(super.field11092, ((class630)super.field11086).field9302, 255);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8406[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4300(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4301(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
