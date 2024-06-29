import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class524 extends class213 {
   @OriginalMember(
      owner = "client!mi",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7522 = new String[]{method3799(method3798("FAy\f|")), method3799(method3798("E];\"")), method3799(method3798("FAy\u000f|")), method3799(method3798("P\u0006y`)")), method3799(method3798("FAy\r|"))};
   @OriginalMember(
      owner = "client!mi",
      name = "A",
      descriptor = "B"
   )
   private byte field7512;
   @OriginalMember(
      owner = "client!mi",
      name = "v",
      descriptor = "B"
   )
   private byte field7513;
   @OriginalMember(
      owner = "client!mi",
      name = "B",
      descriptor = "B"
   )
   private byte field7514;
   @OriginalMember(
      owner = "client!mi",
      name = "u",
      descriptor = "B"
   )
   private byte field7521;
   @OriginalMember(
      owner = "client!mi",
      name = "w",
      descriptor = "I"
   )
   public static int field7515;
   @OriginalMember(
      owner = "client!mi",
      name = "x",
      descriptor = "I"
   )
   public static int field7516;
   @OriginalMember(
      owner = "client!mi",
      name = "y",
      descriptor = "I"
   )
   public static int field7517;
   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "I"
   )
   public static int field7518;
   @OriginalMember(
      owner = "client!mi",
      name = "t",
      descriptor = "I"
   )
   public static int field7520;
   @OriginalMember(
      owner = "client!mi",
      name = "C",
      descriptor = "Z"
   )
   private boolean field7519;

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "()V",
      line = 10
   )
   public static final void method3796() {
      for(int var0 = 0; var0 < class274.field3764; ++var0) {
         class627 var1 = class541.field7770[var0];
         class682.method4973(var1, true);
         class541.field7770[var0] = null;
      }

      class274.field3764 = 0;
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(ZII)V",
      line = 26
   )
   public static final void method3797(boolean arg0, int arg1, int arg2) {
      try {
         ++field7515;
         class111 var3 = class616.method4475(arg2, arg0, (byte)45);
         if (var3 != null) {
            var3.method3165(114);
            if (arg1 != 0) {
               field7517 = -127;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7522[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(Lqv;Z)V",
      line = 43
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         if (!arg1) {
            method3796();
         }

         arg0.field6779 = this.field7513;
         ++field7518;
         arg0.field6764 = this.field7512;
         arg0.field6771 = this.field7521;
         arg0.field6781 = this.field7514;
         arg0.field6772 = this.field7519;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7522[2] + (arg0 != null ? field7522[3] : field7522[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(Lwf;B)V",
      line = 62
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         this.field7519 = ~arg0.method1143(-15465) == -2;
         ++field7516;
         if (arg1 >= -38) {
            this.method1347((class147)null, (byte)-117);
         }

         this.field7513 = arg0.method1162(4);
         this.field7521 = arg0.method1162(4);
         this.field7514 = arg0.method1162(4);
         this.field7512 = arg0.method1162(4);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7522[4] + (arg0 != null ? field7522[3] : field7522[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3798(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3799(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
