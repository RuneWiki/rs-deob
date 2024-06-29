import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class691 extends class555 {
   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10100 = new String[]{method5030(method5029("w{Y>U5")), method5030(method5029("w{Y>R5")), method5030(method5029("w{Y>V5")), method5030(method5029("w{Y>Q5")), method5030(method5029("w{Y>T5"))};
   @OriginalMember(
      owner = "client!jka",
      name = "i",
      descriptor = "I"
   )
   public static int field10093 = 0;
   @OriginalMember(
      owner = "client!jka",
      name = "l",
      descriptor = "I"
   )
   public static int field10097 = -1;
   @OriginalMember(
      owner = "client!jka",
      name = "f",
      descriptor = "I"
   )
   public static int field10092;
   @OriginalMember(
      owner = "client!jka",
      name = "k",
      descriptor = "I"
   )
   public static int field10094;
   @OriginalMember(
      owner = "client!jka",
      name = "j",
      descriptor = "I"
   )
   public static int field10095;
   @OriginalMember(
      owner = "client!jka",
      name = "h",
      descriptor = "I"
   )
   public static int field10096;
   @OriginalMember(
      owner = "client!jka",
      name = "g",
      descriptor = "I"
   )
   public static int field10098;
   @OriginalMember(
      owner = "client!jka",
      name = "m",
      descriptor = "I"
   )
   public static int field10099;

   @OriginalMember(
      owner = "client!jka",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method5028(byte arg0) {
      try {
         if (arg0 >= -61) {
            return 57;
         } else {
            ++field10095;
            return super.field7632;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10100[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         super.field7632 = this.method635(125);
         ++field10092;
         if (arg0 != -13712) {
            this.method638(100, (byte)26);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10100[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class691(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jka",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         int var3 = 70 % ((12 - arg1) / 47);
         ++field10094;
         super.field7632 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10100[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 < 124) {
            this.method635(28);
         }

         ++field10098;
         return super.field7633.method4414(0) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10100[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class691(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field10096;
         if (arg1 < 36) {
            this.method638(20, (byte)-53);
         }

         return 3;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10100[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5029(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5030(char[] arg0) {
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
            var10005 = 16;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
