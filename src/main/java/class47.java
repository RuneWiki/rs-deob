import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class47 extends class732 {
   @OriginalMember(
      owner = "client!sc",
      name = "Y",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field601 = new String[]{method355(method354("^#e\u0014O")), method355(method354("^#e\u0010O")), method355(method354("C5';")), method355(method354("^#e\u0013O")), method355(method354("Vney\u001a")), method355(method354("B0.9\r^")), method355(method354("^#e\u0016O"))};
   @OriginalMember(
      owner = "client!sc",
      name = "V",
      descriptor = "Lrca;"
   )
   public static class37 field593 = new class37();
   @OriginalMember(
      owner = "client!sc",
      name = "R",
      descriptor = "I"
   )
   public static int field595;
   @OriginalMember(
      owner = "client!sc",
      name = "X",
      descriptor = "I"
   )
   public static int field596;
   @OriginalMember(
      owner = "client!sc",
      name = "S",
      descriptor = "I"
   )
   public static int field597;
   @OriginalMember(
      owner = "client!sc",
      name = "W",
      descriptor = "Lww;"
   )
   public static class339 field598;
   @OriginalMember(
      owner = "client!sc",
      name = "U",
      descriptor = "Lww;"
   )
   public static class339 field599;
   @OriginalMember(
      owner = "client!sc",
      name = "T",
      descriptor = "[B"
   )
   private byte[] field594;
   @OriginalMember(
      owner = "client!sc",
      name = "Q",
      descriptor = "[[S"
   )
   public static short[][] field600;

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Lgj;ZILjava/lang/String;Z)V"
   )
   public static final void method350(class736 arg0, boolean arg1, int arg2, String arg3, boolean arg4) {
      try {
         class664.method4849(arg0, 118, arg3, field601[5], arg4, arg1);
         ++field595;
         if (arg2 != -16656) {
            field598 = null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field601[3] + (arg0 != null ? field601[4] : field601[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field601[4] : field601[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method351(byte arg0) {
      try {
         field598 = null;
         field593 = null;
         int var1 = -78 / ((-30 - arg0) / 32);
         field600 = null;
         field599 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field601[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "<init>",
      descriptor = "()V"
   )
   public class47() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIII)[B"
   )
   public final byte[] method352(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field597;
         this.field594 = new byte[arg1 * 2 * arg2 * arg3];
         this.method3281(arg2, arg3, (byte)-123, arg1);
         if (arg0 != 6743) {
            method351((byte)80);
         }

         return this.field594;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field601[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IZB)V"
   )
   public final void method353(int arg0, boolean arg1, byte arg2) {
      try {
         ++field596;
         int var4 = arg0 * 2;
         int var5 = arg2 & 255;
         if (arg1) {
            method350((class736)null, false, -83, (String)null, true);
         }

         this.field594[var4++] = (byte)(var5 * 3 >> 5);
         this.field594[var4] = (byte)(var5 * 3 >> 5);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field601[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method354(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method355(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
