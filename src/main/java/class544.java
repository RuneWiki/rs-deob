import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class544 {
   @OriginalMember(
      owner = "client!cn",
      name = "d",
      descriptor = "Loi;"
   )
   private class80 field7810 = new class80(128);
   @OriginalMember(
      owner = "client!cn",
      name = "b",
      descriptor = "Lkf;"
   )
   private class266 field7811;
   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7813 = new String[]{method3914(method3913("{\u00178\u0001{")), method3914(method3913("{\u00178\u0007{")), method3914(method3913("{\u00178y:v\u0010b{{")), method3914(method3913("v\fz)")), method3914(method3913("cW8k.")), method3914(method3913("{\u00178\u0004{")), method3914(method3913("{\u00178\u0006{"))};
   @OriginalMember(
      owner = "client!cn",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field7808 = new int[13];
   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "I"
   )
   public static int field7809;
   @OriginalMember(
      owner = "client!cn",
      name = "c",
      descriptor = "I"
   )
   public static int field7812;

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3909(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(II)I"
   )
   public static int method3910(int arg0, int arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7813[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3911(int arg0) {
      try {
         field7808 = null;
         if (arg0 != -1) {
            field7808 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7813[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(IB)Lfea;"
   )
   public final class153 method3912(int arg0, byte arg1) {
      try {
         ++field7809;
         if (arg1 <= 90) {
            method3909(-5);
         }

         class80 var3 = this.field7810;
         class153 var4;
         synchronized(this.field7810) {
            var4 = (class153)this.field7810.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            byte[] var5 = this.field7811.method2037(false, class429.method3173((byte)112, arg0), class341.method2502(-112, arg0));
            class153 var6 = new class153();
            if (var5 != null) {
               var6.method1285(0, new class147(var5));
            }

            class80 var7 = this.field7810;
            synchronized(this.field7810) {
               this.field7810.method723(0, (long)arg0, var6);
               return var6;
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field7813[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V"
   )
   public class544(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field7811 = arg2;
         if (this.field7811 != null) {
            int var4 = this.field7811.method2027((byte)-124) + -1;
            this.field7811.method2060(2, var4);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7813[2] + (arg0 != null ? field7813[4] : field7813[3]) + ',' + arg1 + ',' + (arg2 != null ? field7813[4] : field7813[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3913(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3914(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
