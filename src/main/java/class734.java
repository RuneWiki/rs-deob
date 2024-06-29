import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class734 extends class297 {
   @OriginalMember(
      owner = "client!ho",
      name = "v",
      descriptor = "Lqw;"
   )
   public class253 field10936;
   @OriginalMember(
      owner = "client!ho",
      name = "H",
      descriptor = "Lrfa;"
   )
   public class481 field10938;
   @OriginalMember(
      owner = "client!ho",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10946 = new String[]{method5407(method5406("2N\u0016\u0013w")), method5407(method5406("!\u000f\u0016\u0001c'\tL\u0003\"")), method5407(method5406("'\u0015TQ")), method5407(method5406("!\u000f\u0016|\"")), method5407(method5406("!\u000f\u0016\u007f\"")), method5407(method5406(".\u000eHR|x")), method5407(method5406("!\u000f\u0016y\"")), method5407(method5406("!\u000f\u0016~\""))};
   @OriginalMember(
      owner = "client!ho",
      name = "w",
      descriptor = "Lgv;"
   )
   public static class12 field10934 = new class12(method5407(method5406("\u001e4q")), method5407(method5406("&\u0006^Ti,")), method5407(method5406("\u0016\u0017LT")), 5);
   @OriginalMember(
      owner = "client!ho",
      name = "G",
      descriptor = "[[I"
   )
   public static int[][] field10943 = new int[][]{{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!ho",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field10944 = false;
   @OriginalMember(
      owner = "client!ho",
      name = "B",
      descriptor = "I"
   )
   public int field10932;
   @OriginalMember(
      owner = "client!ho",
      name = "E",
      descriptor = "I"
   )
   public int field10933;
   @OriginalMember(
      owner = "client!ho",
      name = "A",
      descriptor = "I"
   )
   public static int field10935;
   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "I"
   )
   public int field10937;
   @OriginalMember(
      owner = "client!ho",
      name = "C",
      descriptor = "I"
   )
   public static int field10939;
   @OriginalMember(
      owner = "client!ho",
      name = "D",
      descriptor = "I"
   )
   public int field10940;
   @OriginalMember(
      owner = "client!ho",
      name = "x",
      descriptor = "I"
   )
   public int field10941;
   @OriginalMember(
      owner = "client!ho",
      name = "y",
      descriptor = "I"
   )
   public static int field10942;
   @OriginalMember(
      owner = "client!ho",
      name = "F",
      descriptor = "Lrr;"
   )
   public static class678 field10945;

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5402(byte arg0) {
      try {
         this.field10940 = this.field10936.field3819;
         this.field10941 = this.field10936.field3813;
         ++field10939;
         int var2 = -126 % ((-73 - arg0) / 53);
         this.field10932 = this.field10936.field3815;
         if (this.field10936.field3818 != null) {
            this.field10936.field3818.method1545(this.field10938.field7303, this.field10938.field7304, this.field10938.field7316, class537.field8120);
         }

         this.field10933 = class537.field8120[0];
         this.field10937 = class537.field8120[2];
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10946[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5403(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ho",
      name = "<init>",
      descriptor = "(Lqw;Laaa;)V"
   )
   public class734(class253 arg0, class743 arg1) {
      try {
         this.field10936 = arg0;
         this.field10938 = this.field10936.method2133(true);
         this.method5402((byte)-127);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10946[1] + (arg0 != null ? field10946[0] : field10946[2]) + ',' + (arg1 != null ? field10946[0] : field10946[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method5404(int arg0) {
      try {
         field10943 = null;
         field10934 = null;
         if (arg0 != 3) {
            method5405(true);
         }

         field10945 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10946[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5405(boolean arg0) {
      try {
         ++field10935;
         class300.field4707.method224(true);
         class690.field10254.method2577(-6457);
         class798.field11616.method1159((byte)-84);
         class544.field8183.setBackground(Color.black);
         if (!arg0) {
            class308.field4802 = -1;
            class300.field4707 = class711.method5257(class544.field8183, true);
            class690.field10254 = class69.method531(class544.field8183, true, (byte)74);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10946[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5406(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5407(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
