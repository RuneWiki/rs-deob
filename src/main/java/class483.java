import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class class483 extends class347 {
   @OriginalMember(
      owner = "client!sl",
      name = "r",
      descriptor = "Lck;"
   )
   public class667 field7169;
   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7175 = new String[]{method3596(method3595("\u000eOi\u00159")), method3596(method3595("\u000eOi\u00109")), method3596(method3595("\u000eOi\u00149")), method3596(method3595("P\u000ey~")), method3596(method3595("\u0006\ripl")), method3596(method3595("\u0013V+2")), method3596(method3595("\u000eOi\u00129")), method3596(method3595("\u0019J5;r\tO(9x\u0013\u0003")), method3596(method3595("\u000eOi\u001b9")), method3596(method3595("\u000eOi\u00139")), method3596(method3595("\u000eOi\u00119")), method3596(method3595("\u000eOibx\u0013J3`9"))};
   @OriginalMember(
      owner = "client!sl",
      name = "l",
      descriptor = "[Ljf;"
   )
   public static class225[] field7171 = new class225[16];
   @OriginalMember(
      owner = "client!sl",
      name = "o",
      descriptor = "I"
   )
   public static int field7164;
   @OriginalMember(
      owner = "client!sl",
      name = "m",
      descriptor = "I"
   )
   public static int field7167;
   @OriginalMember(
      owner = "client!sl",
      name = "s",
      descriptor = "I"
   )
   public static int field7168;
   @OriginalMember(
      owner = "client!sl",
      name = "n",
      descriptor = "I"
   )
   public static int field7170;
   @OriginalMember(
      owner = "client!sl",
      name = "p",
      descriptor = "I"
   )
   public static int field7172;
   @OriginalMember(
      owner = "client!sl",
      name = "i",
      descriptor = "I"
   )
   public static int field7173;
   @OriginalMember(
      owner = "client!sl",
      name = "q",
      descriptor = "Z"
   )
   public boolean field7174;
   @OriginalMember(
      owner = "client!sl",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field7166;
   @OriginalMember(
      owner = "client!sl",
      name = "j",
      descriptor = "[[B"
   )
   public static byte[][] field7165;

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method3582(int arg0, int arg1);

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method3583(String arg0, int arg1) {
      int var2 = client.field4530;

      try {
         if (arg1 != 0) {
            field7171 = null;
         }

         ++field7173;
         String var3 = null;
         int var4 = arg0.indexOf(field7175[3]);
         if (~var4 <= -1) {
            var3 = arg0.substring(0, var4 + 4);
            arg0 = arg0.substring(var4 + 4);
         }

         if (arg0.startsWith(field7175[7])) {
            int var5 = arg0.indexOf(" ", field7175[7].length());
            if (var5 >= 0) {
               int var6 = arg0.length();
               arg0 = arg0.substring(0, var5) + " ";
               int var7 = var5 + 1;
               if (var2 != 0 || var6 > var7) {
                  do {
                     arg0 = arg0 + "*";
                     ++var7;
                  } while(var6 > var7);
               }
            }
         }

         return var3 == null ? arg0 : var3 + arg0;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field7175[6] + (arg0 != null ? field7175[4] : field7175[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "(B)Z"
   )
   public abstract boolean method3584(byte arg0);

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(IBI)V"
   )
   public abstract void method3585(int arg0, byte arg1, int arg2);

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(Ldt;ZLdt;I)V"
   )
   public abstract void method3586(class251 arg0, boolean arg1, class251 arg2, int arg3);

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method3587(int arg0);

   @OriginalMember(
      owner = "client!sl",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method3588(int arg0) {
      try {
         ++field7168;
         int var2 = -41 % ((arg0 - -59) / 58);
         return this.field7174;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7175[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "(I)Z"
   )
   public abstract boolean method3589(int arg0);

   @OriginalMember(
      owner = "client!sl",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method3590(int arg0) {
      try {
         field7171 = null;
         if (arg0 != 0) {
            field7165 = null;
         }

         field7165 = null;
         field7166 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7175[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(IBI[BII)V"
   )
   public static final void method3591(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5) {
      int var6 = client.field4530;

      try {
         ++field7164;
         if (~arg0 > ~arg2) {
            arg5 = arg2 - arg0 >> 2;
            arg4 += arg0;
            if (arg1 < -34) {
               while(true) {
                  --arg5;
                  if (arg5 < 0) {
                     arg5 = 3 & arg2 - arg0;
                     if (var6 == 0) {
                        if (var6 == 0) {
                           --arg5;
                           if (arg5 < 0) {
                              return;
                           }
                        }

                        do {
                           arg3[arg4++] = 1;
                           --arg5;
                        } while(arg5 >= 0);

                        return;
                     }
                  } else {
                     int var9 = arg4 + 1;
                     arg3[arg4] = 1;
                     int var10 = var9 + 1;
                     arg3[var9] = 1;
                     arg4 = var10 + 1;
                     arg3[var10] = 1;
                  }

                  arg3[arg4++] = 1;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7175[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7175[4] : field7175[5]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method3592(byte arg0) {
      try {
         if (arg0 >= -100) {
            this.method3593((byte)-41);
         }

         ++field7172;
         return false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7175[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3593(byte arg0) {
      try {
         ++field7170;
         int var2 = 3 % ((arg0 - 37) / 36);
         return 1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7175[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "g",
      descriptor = "(I)I"
   )
   public int method3594(int arg0) {
      try {
         int var2 = 17 % ((arg0 - 53) / 36);
         ++field7167;
         return 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7175[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "<init>",
      descriptor = "(Lck;)V"
   )
   public class483(class667 arg0) {
      try {
         this.field7169 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7175[11] + (arg0 != null ? field7175[4] : field7175[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3595(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3596(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
