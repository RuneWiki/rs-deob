import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class70 extends class555 {
   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field877 = new String[]{method697(method696(",B\u000e\u0016f")), method697(method696(",B\u000e\u0013f")), method697(method696(",B\u000e\u0014f")), method697(method696(",B\u000e\u0010f")), method697(method696(",B\u000e\u0011f")), method697(method696(",B\u000e\u0017f")), method697(method696("3YL9")), method697(method696("&\u0002\u000e{3")), method697(method696(",B\u000e\u0012f"))};
   @OriginalMember(
      owner = "client!qn",
      name = "g",
      descriptor = "Lo;"
   )
   public static class31 field873 = new class31(10, 8);
   @OriginalMember(
      owner = "client!qn",
      name = "j",
      descriptor = "I"
   )
   public static int field869;
   @OriginalMember(
      owner = "client!qn",
      name = "k",
      descriptor = "I"
   )
   public static int field870;
   @OriginalMember(
      owner = "client!qn",
      name = "h",
      descriptor = "I"
   )
   public static int field871;
   @OriginalMember(
      owner = "client!qn",
      name = "i",
      descriptor = "I"
   )
   public static int field872;
   @OriginalMember(
      owner = "client!qn",
      name = "m",
      descriptor = "I"
   )
   public static int field874;
   @OriginalMember(
      owner = "client!qn",
      name = "f",
      descriptor = "I"
   )
   public static int field875;
   @OriginalMember(
      owner = "client!qn",
      name = "l",
      descriptor = "I"
   )
   public static int field876;

   @OriginalMember(
      owner = "client!qn",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class70(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method693(byte arg0) {
      try {
         ++field870;
         if (arg0 >= -61) {
            this.method637(-124);
         }

         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field877[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class70(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         ++field871;
         if (arg0 <= 124) {
            field873 = null;
         }

         return super.field7633.method4408(-123).method1279(128) > 1 ? 4 : 2;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field877[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         if (arg1 <= 36) {
            return 66;
         } else {
            ++field874;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field877[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(IIILor;II)Lbe;"
   )
   public static final class40 method694(int arg0, int arg1, int arg2, class670 arg3, int arg4, int arg5) {
      try {
         if (arg0 != 30988) {
            method695(-70);
         }

         ++field869;
         if (arg3.field9783 || class685.method5005(arg1, (byte)109) && class685.method5005(arg5, (byte)113)) {
            return new class40(arg3, 3553, arg2, arg4, arg1, arg5, true);
         } else {
            return arg3.field9809 ? new class40(arg3, 34037, arg2, arg4, arg1, arg5, true) : new class40(arg3, arg2, arg4, arg1, arg5, class546.method3944(10, arg1), class546.method3944(10, arg5), true);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field877[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field877[7] : field877[6]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method695(int arg0) {
      try {
         if (arg0 != -19252) {
            method695(-17);
         }

         field873 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field877[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         ++field872;
         if (super.field7632 < 0 && super.field7632 > 4) {
            super.field7632 = this.method635(125);
         }

         if (arg0 != -13712) {
            this.method633(-106, (byte)-38);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field877[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         super.field7632 = arg0;
         int var3 = -65 / ((arg1 - 12) / 47);
         ++field875;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field877[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method696(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method697(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
