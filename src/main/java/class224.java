import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class224 extends class500 {
   @OriginalMember(
      owner = "client!ta",
      name = "q",
      descriptor = "Lor;"
   )
   public class670 field2813;
   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2816 = new String[]{method1721(method1720("\u0006\"KUI")), method1721(method1720("\u0006\"K^I")), method1721(method1720("\u0006\"KWI")), method1721(method1720("\tmK:\u001c")), method1721(method1720("\u001c6\tx")), method1721(method1720("\u0006\"K(\b\u001c*\u0011*I")), method1721(method1720("\u0006\"KQI")), method1721(method1720("\u0006\"KPI")), method1721(method1720("\u0006\"KZI")), method1721(method1720("\u0006\"KXI")), method1721(method1720("\u0006\"KSI"))};
   @OriginalMember(
      owner = "client!ta",
      name = "v",
      descriptor = "[[Z"
   )
   public static boolean[][] field2807 = new boolean[][]{new boolean[13], {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}};
   @OriginalMember(
      owner = "client!ta",
      name = "j",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field2809 = new Rectangle[100];
   @OriginalMember(
      owner = "client!ta",
      name = "r",
      descriptor = "F"
   )
   public static float field2815;
   @OriginalMember(
      owner = "client!ta",
      name = "p",
      descriptor = "I"
   )
   public static int field2803;
   @OriginalMember(
      owner = "client!ta",
      name = "o",
      descriptor = "I"
   )
   public static int field2804;
   @OriginalMember(
      owner = "client!ta",
      name = "m",
      descriptor = "I"
   )
   public static int field2805;
   @OriginalMember(
      owner = "client!ta",
      name = "u",
      descriptor = "I"
   )
   public static int field2806;
   @OriginalMember(
      owner = "client!ta",
      name = "l",
      descriptor = "I"
   )
   public static int field2810;
   @OriginalMember(
      owner = "client!ta",
      name = "n",
      descriptor = "I"
   )
   public static int field2811;
   @OriginalMember(
      owner = "client!ta",
      name = "s",
      descriptor = "I"
   )
   public static int field2812;
   @OriginalMember(
      owner = "client!ta",
      name = "t",
      descriptor = "I"
   )
   public static int field2814;
   @OriginalMember(
      owner = "client!ta",
      name = "k",
      descriptor = "Z"
   )
   public boolean field2808;

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(ILmj;Lmj;B)V"
   )
   public abstract void method1706(int arg0, class684 arg1, class684 arg2, byte arg3);

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method1707(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ta",
      name = "b",
      descriptor = "(I)Z"
   )
   public abstract boolean method1708(int arg0);

   @OriginalMember(
      owner = "client!ta",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method1709(int arg0) {
      try {
         ++field2804;
         if (arg0 <= 2) {
            method1713((byte)63);
         }

         return this.field2808;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2816[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "b",
      descriptor = "(Z)Z"
   )
   public abstract boolean method1710(boolean arg0);

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method1711(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ta",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method1712(byte arg0);

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1713(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ta",
      name = "d",
      descriptor = "(Z)Z"
   )
   public final boolean method1714(boolean arg0) {
      try {
         ++field2803;
         if (arg0) {
            this.method1714(false);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2816[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1715(int arg0) {
      try {
         field2807 = null;
         field2809 = null;
         if (arg0 != 7548) {
            method1719((byte)-126, 21, -111, -89, -74, 114, 64, -114, 69, 96, -98, 49);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2816[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "c",
      descriptor = "(Z)I"
   )
   public int method1716(boolean arg0) {
      try {
         if (!arg0) {
            this.field2808 = true;
         }

         ++field2814;
         return 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2816[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1717(int arg0) {
      try {
         if (arg0 <= 57) {
            method1719((byte)28, 67, 7, -81, 58, -66, -35, 123, 123, 87, 0, -31);
         }

         ++field2811;
         return 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2816[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class224(class670 arg0) {
      try {
         this.field2813 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2816[5] + (arg0 != null ? field2816[3] : field2816[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method1718(int arg0) {
      try {
         class606.method4428((byte)-103);
         ++field2805;
         if (arg0 != 0) {
            field2815 = 0.9031173F;
         }

         class317.field4233 = null;
         class233.field2892 = null;
         class427.field5963 = null;
         class252.field3198 = null;
         class585.field8040 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2816[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(BIIIIIIIIIII)V"
   )
   public static final void method1719(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         int var12 = 69 % ((arg0 - -24) / 53);
         ++field2806;
         if (class603.method4400(2, arg2)) {
            if (class549.field7503[arg2] != null) {
               client.method2397(class549.field7503[arg2], -1, arg3, arg11, arg7, arg6, arg8, arg9, arg1, arg4, arg5, arg10);
            } else {
               client.method2397(class468.field6451[arg2], -1, arg3, arg11, arg7, arg6, arg8, arg9, arg1, arg4, arg5, arg10);
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field2816[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 100; ++var0) {
         field2809[var0] = new Rectangle();
      }

   }

   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1720(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1721(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
