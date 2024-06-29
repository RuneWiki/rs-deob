import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class236 extends class4 {
   @OriginalMember(
      owner = "client!bea",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3293 = new String[]{method1822(method1821(";\"\u001d\u0018\rq")), method1822(method1821(";\"\u001d\u0018\fq")), method1822(method1821(";\"\u001d\u0018\bq")), method1822(method1821(";\"\u001d\u0018\nq")), method1822(method1821(";\"\u001d\u0018\u000bq"))};
   @OriginalMember(
      owner = "client!bea",
      name = "L",
      descriptor = "Leg;"
   )
   public static class118 field3285 = new class118(15, 8);
   @OriginalMember(
      owner = "client!bea",
      name = "K",
      descriptor = "Lno;"
   )
   public static class732 field3287 = new class732(method1822(method1821(">&\u0011Sz")), method1822(method1821("\u001e&\u0011Sij")), 2);
   @OriginalMember(
      owner = "client!bea",
      name = "I",
      descriptor = "I"
   )
   public static int field3288 = 0;
   @OriginalMember(
      owner = "client!bea",
      name = "E",
      descriptor = "Lll;"
   )
   public static class387 field3289 = new class387();
   @OriginalMember(
      owner = "client!bea",
      name = "N",
      descriptor = "I"
   )
   public static int field3280;
   @OriginalMember(
      owner = "client!bea",
      name = "O",
      descriptor = "I"
   )
   public static int field3281;
   @OriginalMember(
      owner = "client!bea",
      name = "D",
      descriptor = "I"
   )
   public static int field3282;
   @OriginalMember(
      owner = "client!bea",
      name = "J",
      descriptor = "I"
   )
   public static int field3283;
   @OriginalMember(
      owner = "client!bea",
      name = "H",
      descriptor = "I"
   )
   public static int field3286;
   @OriginalMember(
      owner = "client!bea",
      name = "M",
      descriptor = "I"
   )
   public static int field3290;
   @OriginalMember(
      owner = "client!bea",
      name = "G",
      descriptor = "Lvca;"
   )
   public static class296 field3292;
   @OriginalMember(
      owner = "client!bea",
      name = "P",
      descriptor = "[B"
   )
   private byte[] field3284;
   @OriginalMember(
      owner = "client!bea",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field3291;

   @OriginalMember(
      owner = "client!bea",
      name = "b",
      descriptor = "(B)Z",
      line = 5
   )
   public static final boolean method1817(byte arg0) {
      try {
         if (arg0 != -5) {
            method1817((byte)127);
         }

         ++field3282;
         if (class622.field9156 != 3) {
            return false;
         } else {
            return class542.field7787 == 0 && class444.field6324 == 0;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3293[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(IBB)V",
      line = 28
   )
   public final void method18(int arg0, byte arg1, byte arg2) {
      try {
         ++field3280;
         int var4 = arg0 * 2;
         int var5 = 255 & arg1;
         int var10001 = var4;
         int var8 = var4 + 1;
         this.field3284[var10001] = (byte)(var5 * 3 >> 5);
         if (arg2 <= -56) {
            this.field3284[var8] = (byte)(var5 * 3 >> 5);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3293[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "e",
      descriptor = "(I)V",
      line = 45
   )
   public static void method1818(int arg0) {
      try {
         field3291 = null;
         field3289 = null;
         field3292 = null;
         field3287 = null;
         field3285 = null;
         if (arg0 != 8) {
            method1817((byte)42);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3293[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(II)Luba;",
      line = 60
   )
   public static final class457 method1819(int arg0, int arg1) {
      try {
         ++field3281;
         class457 var2 = (class457)class743.field10830.method725(arg0 + -12473, (long)arg1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class87.field1138.method2037(false, arg1, 0);
            if (arg0 != 12473) {
               method1819(-46, 63);
            }

            class457 var4 = new class457();
            if (var3 != null) {
               var4.method3333(new class147(var3), (byte)-79);
            }

            var4.method3335((byte)127);
            class743.field10830.method723(0, (long)arg1, var4);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3293[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "<init>",
      descriptor = "()V",
      line = 89
   )
   public class236() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(IIII)[B",
      line = 93
   )
   public final byte[] method1820(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field3284 = new byte[arg3 * 2 * arg2 * arg0];
         if (arg1 >= -102) {
            method1819(58, 90);
         }

         ++field3286;
         this.method2389(arg0, (byte)-117, arg3, arg2);
         return this.field3284;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3293[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1821(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1822(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
