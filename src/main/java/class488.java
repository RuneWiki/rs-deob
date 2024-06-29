import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class488 extends class426 {
   @OriginalMember(
      owner = "client!sj",
      name = "q",
      descriptor = "I"
   )
   private int field6735;
   @OriginalMember(
      owner = "client!sj",
      name = "o",
      descriptor = "I"
   )
   private int field6724;
   @OriginalMember(
      owner = "client!sj",
      name = "t",
      descriptor = "I"
   )
   private int field6733;
   @OriginalMember(
      owner = "client!sj",
      name = "l",
      descriptor = "I"
   )
   private int field6722;
   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6738 = new String[]{method3553(method3552("wb4j\u0010")), method3553(method3552("wb4\u0017Qjan\u0015\u0010")), method3553(method3552("\u007f&4\u0005E")), method3553(method3552("wb4n\u0010")), method3553(method3552("j}vG")), method3553(method3552("wb4b\u0010")), method3553(method3552("wb4l\u0010")), method3553(method3552("wb4c\u0010")), method3553(method3552("wb4o\u0010")), method3553(method3552("wb4h\u0010")), method3553(method3552("wb4i\u0010"))};
   @OriginalMember(
      owner = "client!sj",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field6725 = new int[]{1, 0, -1, 0};
   @OriginalMember(
      owner = "client!sj",
      name = "n",
      descriptor = "I"
   )
   public static int field6726;
   @OriginalMember(
      owner = "client!sj",
      name = "r",
      descriptor = "I"
   )
   public static int field6727;
   @OriginalMember(
      owner = "client!sj",
      name = "j",
      descriptor = "I"
   )
   public static int field6728;
   @OriginalMember(
      owner = "client!sj",
      name = "m",
      descriptor = "I"
   )
   public static int field6729;
   @OriginalMember(
      owner = "client!sj",
      name = "s",
      descriptor = "I"
   )
   public static int field6730;
   @OriginalMember(
      owner = "client!sj",
      name = "p",
      descriptor = "I"
   )
   public static int field6731;
   @OriginalMember(
      owner = "client!sj",
      name = "k",
      descriptor = "I"
   )
   public static int field6732;
   @OriginalMember(
      owner = "client!sj",
      name = "v",
      descriptor = "I"
   )
   public static int field6734;
   @OriginalMember(
      owner = "client!sj",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field6737;
   @OriginalMember(
      owner = "client!sj",
      name = "h",
      descriptor = "[Lbo;"
   )
   public static class763[] field6723;
   @OriginalMember(
      owner = "client!sj",
      name = "u",
      descriptor = "[Ljava/lang/Object;"
   )
   public static Object[] field6736;

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method2688(byte arg0, int arg1, int arg2) {
      try {
         ++field6730;
         if (arg0 != 41) {
            method3547(-42, (byte)-95, false, 24, (String)null);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6738[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method2689(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 109) {
            method3551(114);
         }

         ++field6727;
         int var4 = this.field6724 * arg0 >> 12;
         int var5 = this.field6735 * arg0 >> 12;
         int var6 = this.field6733 * arg1 >> 12;
         int var7 = this.field6722 * arg1 >> 12;
         class44.method373(super.field5957, var7, var5, (byte)-103, var4, var6);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field6738[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(IBZILjava/lang/String;)V"
   )
   public static final void method3547(int arg0, byte arg1, boolean arg2, int arg3, String arg4) {
      try {
         ++field6729;
         if (arg1 != -81) {
            method3550(-94);
         }

         class339.method2690(false, 113, arg2, arg3, arg4, (String)null, arg0);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6738[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6738[2] : field6738[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(-1, arg4, arg5);

      try {
         this.field6735 = arg2;
         this.field6724 = arg0;
         this.field6733 = arg1;
         this.field6722 = arg3;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6738[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2691(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 553) {
            field6723 = null;
         }

         ++field6734;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6738[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(BLjava/lang/String;)I"
   )
   public static final int method3548(byte arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         int var3 = 111 % ((-13 - arg0) / 59);
         ++field6728;
         int var4 = arg1.length();
         int var5 = 0;
         int var6 = 0;
         if (var2) {
            var5 = (var5 << 5) - var5 - -arg1.charAt(var6);
            ++var6;
         }

         while(true) {
            while(~var4 < ~var6) {
               var5 = (var5 << 5) - var5 - -arg1.charAt(var6);
               ++var6;
            }

            if (!var2) {
               return var5;
            }

            var5 = var5;
            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6738[6] + arg0 + ',' + (arg1 != null ? field6738[2] : field6738[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(BLol;)I"
   )
   public static final int method3549(byte arg0, class300 arg1) {
      try {
         ++field6731;
         if (class550.field7513 != arg1) {
            if (class544.field7429 == arg1) {
               return 34167;
            } else if (class529.field7261 == arg1) {
               return 34168;
            } else if (class206.field2525 == arg1) {
               return 34166;
            } else if (arg0 < 90) {
               return 121;
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return 5890;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6738[5] + arg0 + ',' + (arg1 != null ? field6738[2] : field6738[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "b",
      descriptor = "(I)Z"
   )
   public static final boolean method3550(int arg0) {
      try {
         ++field6726;

         try {
            class211 var1 = new class211();
            byte[] var2 = var1.method1608(class581.field7978, 11351);
            if (arg0 != 29455) {
               method3550(113);
            }

            class585.method4199((byte)-102, var2);
            return true;
         } catch (Exception var4) {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6738[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3551(int arg0) {
      try {
         field6737 = null;
         field6723 = null;
         if (arg0 != 731) {
            method3549((byte)-78, (class300)null);
         }

         field6736 = null;
         field6725 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6738[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3552(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3553(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
