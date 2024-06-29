import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class578 implements class517 {
   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "Lww;"
   )
   private class339 field8566;
   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8569 = new String[]{method4331(method4330("\u000f_n!\rF")), method4331(method4330("\u000f_n!\u000fF")), method4331(method4330("\u0015\u0014!!3")), method4331(method4330("\u0000Occ")), method4331(method4330("\u000f_n!\fF")), method4331(method4330("\u000f_n!r\u0007Tf{pF"))};
   @OriginalMember(
      owner = "client!aea",
      name = "e",
      descriptor = "I"
   )
   public static int field8565 = 64;
   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "I"
   )
   public static int field8564;
   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "I"
   )
   public static int field8567;
   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "I"
   )
   public static int field8568;

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1638(int arg0) {
      try {
         if (arg0 != 13053) {
            field8565 = 67;
         }

         ++field8567;
         return this.field8566.method2702(118) ? 100 : this.field8566.method2694(-19821);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8569[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(I)Ltg;"
   )
   public final class374 method1641(int arg0) {
      try {
         ++field8568;
         if (arg0 != -23257) {
            method4329((byte)-25, -128, 28, -118, (class486)null);
         }

         return class374.field5228;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8569[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(BIIILsg;)V"
   )
   public static final void method4329(byte param0, int param1, int param2, int param3, class486 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aea",
      name = "<init>",
      descriptor = "(Lww;)V"
   )
   public class578(class339 arg0) {
      try {
         this.field8566 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8569[5] + (arg0 != null ? field8569[2] : field8569[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4330(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4331(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
