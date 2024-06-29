import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class128 {
   @OriginalMember(
      owner = "client!ld",
      name = "h",
      descriptor = "Llea;"
   )
   private class574 field1642;
   @OriginalMember(
      owner = "client!ld",
      name = "e",
      descriptor = "J"
   )
   public long field1644;
   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1647 = new String[]{method1097(method1096("\u000f\u0019\t|g\r\u001cKst\u0006U")), method1097(method1096("\u000f\u0019\tX&")), method1097(method1096("\u0018S\t4s")), method1097(method1096("\r\bKv")), method1097(method1096("\u000f\u0019\t[&")), method1097(method1096("\u000f\u0019\t&g\r\u0014S$&"))};
   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "I"
   )
   public static int field1640 = 0;
   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field1645 = false;
   @OriginalMember(
      owner = "client!ld",
      name = "f",
      descriptor = "I"
   )
   public static int field1639;
   @OriginalMember(
      owner = "client!ld",
      name = "c",
      descriptor = "I"
   )
   public static int field1641;
   @OriginalMember(
      owner = "client!ld",
      name = "d",
      descriptor = "I"
   )
   public static int field1643;
   @OriginalMember(
      owner = "client!ld",
      name = "g",
      descriptor = "I"
   )
   public static int field1646;

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIZLtk;ZILtk;)I"
   )
   public static final int method1094(int arg0, int arg1, boolean arg2, class111 arg3, boolean arg4, int arg5, class111 arg6) {
      try {
         ++field1643;
         int var7 = class90.method839(arg4, arg3, arg6, 1, arg1);
         if (var7 != 0) {
            return !arg4 ? var7 : -var7;
         } else if (arg0 == arg5) {
            return 0;
         } else {
            int var8 = class90.method839(arg2, arg3, arg6, arg0 + 2, arg5);
            return !arg2 ? var8 : -var8;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1647[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1647[2] : field1647[3]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1647[2] : field1647[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field1642.method4309(-99, this.field1644);
         ++field1646;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1647[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "<init>",
      descriptor = "(Llea;JI)V"
   )
   public class128(class574 arg0, long arg1, int arg2) {
      try {
         this.field1642 = arg0;
         this.field1644 = arg1;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1647[5] + (arg0 != null ? field1647[2] : field1647[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1095(int arg0) {
      try {
         ++field1641;
         class577.field8555.method428((0.7F + (float)class757.field11093.field10984.method5239(-18033) * 0.1F) * 1.1523438F);
         class577.field8555.method418(class591.field8716, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
         class577.field8555.method516(class477.field6648, -1, 0);
         int var1 = 119 / ((arg0 - 7) / 36);
         class577.field8555.method490(class199.field2536);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1647[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1096(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1097(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
