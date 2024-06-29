import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class556 extends class644 {
   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8157 = new String[]{method4198(method4197("c\ni#\u001b")), method4198(method4197("c\ni%\u001b")), method4198(method4197("mQiNN")), method4198(method4197("x\n+\f")), method4198(method4197("c\ni!\u001b")), method4198(method4197("c\ni\"\u001b"))};
   @OriginalMember(
      owner = "client!uu",
      name = "y",
      descriptor = "[[I"
   )
   public static int[][] field8152 = new int[6][];
   @OriginalMember(
      owner = "client!uu",
      name = "v",
      descriptor = "Lrca;"
   )
   public static class37 field8154 = new class37();
   @OriginalMember(
      owner = "client!uu",
      name = "w",
      descriptor = "I"
   )
   public static int field8150;
   @OriginalMember(
      owner = "client!uu",
      name = "x",
      descriptor = "I"
   )
   public static int field8153;
   @OriginalMember(
      owner = "client!uu",
      name = "u",
      descriptor = "I"
   )
   private int field8155;
   @OriginalMember(
      owner = "client!uu",
      name = "t",
      descriptor = "I"
   )
   public static int field8156;
   @OriginalMember(
      owner = "client!uu",
      name = "s",
      descriptor = "J"
   )
   private long field8151;

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4195(byte arg0) {
      try {
         field8154 = null;
         field8152 = null;
         if (arg0 >= -15) {
            field8152 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8157[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method4196(int arg0, int arg1, int arg2) {
      try {
         ++field8150;
         class487 var3 = class2.method12((long)arg2, 5, (byte)43);
         var3.method3694(-21792);
         if (arg0 >= -103) {
            method4195((byte)109);
         }

         var3.field6794 = arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8157[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         ++field8156;
         arg1.method5687(this.field8151, this.field8155, (byte)44);
         if (arg0 != 19163) {
            this.method111(71, (class66)null);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8157[5] + arg0 + ',' + (arg1 != null ? field8157[2] : field8157[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         ++field8153;
         this.field8155 = arg1.method610(126);
         this.field8151 = arg1.method660(arg0 + 107);
         if (arg0 != 11) {
            field8152 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8157[1] + arg0 + ',' + (arg1 != null ? field8157[2] : field8157[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4197(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4198(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
