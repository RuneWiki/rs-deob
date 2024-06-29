import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class203 extends class673 {
   @OriginalMember(
      owner = "client!b",
      name = "s",
      descriptor = "I"
   )
   public int field2578;
   @OriginalMember(
      owner = "client!b",
      name = "w",
      descriptor = "I"
   )
   public int field2582;
   @OriginalMember(
      owner = "client!b",
      name = "t",
      descriptor = "I"
   )
   public int field2577;
   @OriginalMember(
      owner = "client!b",
      name = "r",
      descriptor = "I"
   )
   public int field2589;
   @OriginalMember(
      owner = "client!b",
      name = "x",
      descriptor = "Z"
   )
   public boolean field2579;
   @OriginalMember(
      owner = "client!b",
      name = "v",
      descriptor = "I"
   )
   public int field2581;
   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2590 = new String[]{method1684(method1683("%&8n")), method1684(method1683("%&G/\u000e.|En")), method1684(method1683("%&9n")), method1684(method1683(")}\u0017*")), method1684(method1683("%&:n")), method1684(method1683("<&Uh\u001d"))};
   @OriginalMember(
      owner = "client!b",
      name = "u",
      descriptor = "I"
   )
   public static int field2585 = 0;
   @OriginalMember(
      owner = "client!b",
      name = "m",
      descriptor = "Ljava/util/zip/CRC32;"
   )
   public static CRC32 field2584 = new CRC32();
   @OriginalMember(
      owner = "client!b",
      name = "o",
      descriptor = "[Z"
   )
   public static boolean[] field2587 = new boolean[5];
   @OriginalMember(
      owner = "client!b",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field2588 = false;
   @OriginalMember(
      owner = "client!b",
      name = "l",
      descriptor = "I"
   )
   public static int field2580;
   @OriginalMember(
      owner = "client!b",
      name = "p",
      descriptor = "I"
   )
   public static int field2583;
   @OriginalMember(
      owner = "client!b",
      name = "n",
      descriptor = "I"
   )
   public static int field2586;

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1680(int arg0) {
      try {
         field2584 = null;
         field2587 = null;
         if (arg0 != 5) {
            field2584 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2590[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method1681(int arg0, byte arg1) {
      try {
         class210.field2676 = arg0;
         ++field2583;
         class407 var2 = class88.field1196;
         synchronized(class88.field1196) {
            int var3 = 97 % ((12 - arg1) / 32);
            class88.field1196.method3201((byte)-22);
         }

         class407 var4 = class563.field8278;
         synchronized(class563.field8278) {
            class563.field8278.method3201((byte)-9);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2590[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(IIIFFFLeo;FIFI)[B"
   )
   public static final byte[] method1682(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, class726 arg6, float arg7, int arg8, float arg9, int arg10) {
      try {
         int var11 = 96 % ((77 - arg8) / 40);
         ++field2580;
         byte[] var12 = new byte[arg0 * arg10 * arg1];
         class401.method3146(arg4, arg6, arg1, arg10, arg3, 0, arg5, arg2, arg9, 0, arg0, arg7, var12);
         return var12;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field2590[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2590[5] : field2590[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "<init>",
      descriptor = "(IIIIIZ)V"
   )
   public class203(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         this.field2578 = arg1;
         this.field2582 = arg4;
         this.field2577 = arg0;
         this.field2589 = arg3;
         this.field2579 = arg5;
         this.field2581 = arg2;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2590[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1683(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1684(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
