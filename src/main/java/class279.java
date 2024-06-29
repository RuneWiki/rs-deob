import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class279 {
   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "I"
   )
   private int field3561;
   @OriginalMember(
      owner = "client!ah",
      name = "k",
      descriptor = "I"
   )
   public int field3559;
   @OriginalMember(
      owner = "client!ah",
      name = "b",
      descriptor = "Lwn;"
   )
   private class576 field3553;
   @OriginalMember(
      owner = "client!ah",
      name = "p",
      descriptor = "I"
   )
   public int field3555;
   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3570 = new String[]{method2203(method2202("\u00016=Z\u000f")), method2203(method2202("\u001bp=H\u001b\u0014qgJZ")), method2203(method2202("\u0014m\u007f\u0018")), method2203(method2202("\u001bp=6Z")), method2203(method2202("\u001bp=5Z")), method2203(method2202("\u001bp=7Z")), method2203(method2202("\u001bp=\u0000\u001d)la\u001d\u001c\u001d0"))};
   @OriginalMember(
      owner = "client!ah",
      name = "e",
      descriptor = "Lah;"
   )
   public static class279 field3558 = new class279(0, 3, class576.field8545);
   @OriginalMember(
      owner = "client!ah",
      name = "f",
      descriptor = "Lah;"
   )
   public static class279 field3562 = new class279(1, 3, class576.field8545);
   @OriginalMember(
      owner = "client!ah",
      name = "c",
      descriptor = "Lah;"
   )
   public static class279 field3563 = new class279(2, 4, class576.field8541);
   @OriginalMember(
      owner = "client!ah",
      name = "j",
      descriptor = "Lah;"
   )
   public static class279 field3564 = new class279(3, 1, class576.field8545);
   @OriginalMember(
      owner = "client!ah",
      name = "n",
      descriptor = "Lah;"
   )
   public static class279 field3565 = new class279(4, 2, class576.field8545);
   @OriginalMember(
      owner = "client!ah",
      name = "o",
      descriptor = "Lah;"
   )
   public static class279 field3566 = new class279(5, 3, class576.field8545);
   @OriginalMember(
      owner = "client!ah",
      name = "g",
      descriptor = "Lah;"
   )
   public static class279 field3567 = new class279(6, 4, class576.field8545);
   @OriginalMember(
      owner = "client!ah",
      name = "h",
      descriptor = "I"
   )
   public static int field3568 = class291.method2349((byte)97, 16);
   @OriginalMember(
      owner = "client!ah",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field3569 = new class418(47, 4);
   @OriginalMember(
      owner = "client!ah",
      name = "l",
      descriptor = "I"
   )
   public static int field3554;
   @OriginalMember(
      owner = "client!ah",
      name = "q",
      descriptor = "I"
   )
   public static int field3556;
   @OriginalMember(
      owner = "client!ah",
      name = "m",
      descriptor = "I"
   )
   public static int field3557;
   @OriginalMember(
      owner = "client!ah",
      name = "i",
      descriptor = "I"
   )
   public static int field3560;

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2199(int arg0) {
      try {
         field3564 = null;
         field3567 = null;
         field3566 = null;
         field3558 = null;
         if (arg0 <= -114) {
            field3569 = null;
            field3565 = null;
            field3563 = null;
            field3562 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3570[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field3556;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3570[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(ILkw;)V"
   )
   public static final void method2200(int arg0, class9 arg1) {
      try {
         ++field3560;
         if (arg0 != 5) {
            field3562 = null;
         }

         boolean var2;
         label69: {
            var2 = false;
            if (class413.field5678 == arg1.field122 || ~arg1.field193 == 0 || arg1.field139 != 0) {
               var2 = true;
               if (!client.field1481) {
                  break label69;
               }
            }

            class238 var3 = class532.field7812.method2473((byte)86, arg1.field193);
            if (var3.field3018 || var3.field3023[arg1.field128] < arg1.field163 + 1) {
               var2 = true;
            }
         }

         if (var2) {
            int var4 = -arg1.field181 + arg1.field122;
            int var5 = -arg1.field181 + class413.field5678;
            int var6 = arg1.field156 * 512 - -(256 * arg1.method78(0));
            int var7 = arg1.field188 * 512 + arg1.method78(arg0 + -5) * 256;
            int var8 = arg1.field172 * 512 - -(arg1.method78(arg0 ^ 5) * 256);
            int var9 = arg1.field176 * 512 - -(256 * arg1.method78(arg0 ^ 5));
            arg1.field10467 = ((-var5 + var4) * var6 + var5 * var8) / var4;
            arg1.field10468 = ((-var5 + var4) * var7 + var5 * var9) / var4;
         }

         arg1.field206 = 0;
         if (arg1.field189 == 0) {
            arg1.method79(false, arg0 + 101, 8192);
         }

         if (~arg1.field189 == -2) {
            arg1.method79(false, 63, 12288);
         }

         if (arg1.field189 == 2) {
            arg1.method79(false, arg0 ^ 27, 0);
         }

         if (~arg1.field189 == -4) {
            arg1.method79(false, 53, 4096);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3570[5] + arg0 + ',' + (arg1 != null ? field3570[0] : field3570[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "<init>",
      descriptor = "(IILwn;)V"
   )
   private class279(int arg0, int arg1, class576 arg2) {
      try {
         this.field3561 = arg1;
         this.field3559 = arg0;
         this.field3553 = arg2;
         this.field3555 = this.field3553.field8536 * this.field3561;
         if (this.field3559 >= 16) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3570[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3570[0] : field3570[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(IB)Lah;"
   )
   public static final class279 method2201(int arg0, byte arg1) {
      try {
         if (arg1 >= -62) {
            return null;
         } else {
            ++field3557;
            if (arg0 != 0) {
               if (arg0 == 1) {
                  return field3562;
               }

               if (arg0 == 2) {
                  return field3563;
               }

               if (~arg0 == -4) {
                  return field3564;
               }

               if (~arg0 == -5) {
                  return field3565;
               }

               if (arg0 == 5) {
                  return field3566;
               }

               if (~arg0 != -7) {
                  return null;
               }

               if (!client.field1481) {
                  return field3567;
               }
            }

            return field3558;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3570[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2202(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2203(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
