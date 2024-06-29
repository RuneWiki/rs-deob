import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class58 extends class644 {
   @OriginalMember(
      owner = "client!hq",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field767 = new String[]{method537(method536(">;Y_Y")), method537(method536("-dY3\f")), method537(method536("+`\u001b\u001d")), method537(method536("-dY4\f")), method537(method536("-dY0\f"))};
   @OriginalMember(
      owner = "client!hq",
      name = "y",
      descriptor = "[F"
   )
   public static float[] field766 = new float[4];
   @OriginalMember(
      owner = "client!hq",
      name = "u",
      descriptor = "I"
   )
   public static int field760 = -1;
   @OriginalMember(
      owner = "client!hq",
      name = "x",
      descriptor = "I"
   )
   public static int field759;
   @OriginalMember(
      owner = "client!hq",
      name = "s",
      descriptor = "I"
   )
   private int field761;
   @OriginalMember(
      owner = "client!hq",
      name = "v",
      descriptor = "I"
   )
   private int field763;
   @OriginalMember(
      owner = "client!hq",
      name = "t",
      descriptor = "I"
   )
   public static int field764;
   @OriginalMember(
      owner = "client!hq",
      name = "w",
      descriptor = "Lwc;"
   )
   public static class394 field765;
   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "Lkc;"
   )
   public static class72 field762;

   @OriginalMember(
      owner = "client!hq",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method535(int arg0) {
      try {
         field762 = null;
         if (arg0 == -1) {
            field766 = null;
            field765 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field767[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         ++field759;
         if (arg0 != 11) {
            field760 = 6;
         }

         this.field763 = arg1.method610(-119);
         this.field761 = arg1.method610(arg0 + -59);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field767[3] + arg0 + ',' + (arg1 != null ? field767[0] : field767[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         if (arg0 != 19163) {
            this.field763 = -55;
         }

         ++field764;
         arg1.method5706(this.field763, this.field761, (byte)-109);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field767[1] + arg0 + ',' + (arg1 != null ? field767[0] : field767[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method536(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method537(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
