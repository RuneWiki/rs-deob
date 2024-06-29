import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class651 extends class207 {
   @OriginalMember(
      owner = "client!eb",
      name = "n",
      descriptor = "I"
   )
   private int field9492 = -1;
   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9500 = new String[]{method4702(method4701("b+5\u001d7")), method4702(method4701("b+5\u001b7")), method4702(method4701("b+5\u001c7")), method4702(method4701("b+5\u001a7")), method4702(method4701("i<w4")), method4702(method4701("|g5vb")), method4702(method4701("b+5\u00197")), method4702(method4701("b+5\u001e7"))};
   @OriginalMember(
      owner = "client!eb",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field9495 = new int[14];
   @OriginalMember(
      owner = "client!eb",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field9498 = new int[3];
   @OriginalMember(
      owner = "client!eb",
      name = "q",
      descriptor = "I"
   )
   public static int field9493;
   @OriginalMember(
      owner = "client!eb",
      name = "t",
      descriptor = "I"
   )
   public static int field9494;
   @OriginalMember(
      owner = "client!eb",
      name = "u",
      descriptor = "I"
   )
   public static int field9496;
   @OriginalMember(
      owner = "client!eb",
      name = "o",
      descriptor = "I"
   )
   public static int field9497;
   @OriginalMember(
      owner = "client!eb",
      name = "r",
      descriptor = "I"
   )
   public static int field9499;

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method4697(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            field9495 = null;
         }

         ++field9499;
         if (arg1 != 6406) {
            if (arg1 == 6409) {
               return 1;
            } else if (arg1 != 32841) {
               if (arg1 == 6410) {
                  return 2;
               } else if (~arg1 == -6408) {
                  return 3;
               } else if (arg1 == 6408) {
                  return 4;
               } else {
                  throw new IllegalArgumentException("");
               }
            } else {
               return 1;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9500[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4698(boolean arg0) {
      try {
         field9495 = null;
         field9498 = null;
         if (arg0) {
            method4698(false);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9500[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lfa;Z)V"
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         arg0.method1812((byte)-89, this.field9492);
         ++field9497;
         if (!arg1) {
            method4697(-63, 31);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9500[3] + (arg0 != null ? field9500[5] : field9500[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method4699(int arg0, byte arg1) {
      try {
         label16: {
            if (~class627.field9106 == -1) {
               class663.field9609.method436(arg0, -81);
               if (client.field4530 == 0) {
                  break label16;
               }
            }

            class9.field136 = arg0;
         }

         int var2 = -25 % ((3 - arg1) / 44);
         ++field9493;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9500[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method4700(byte arg0, int arg1, int arg2) {
      try {
         ++field9496;
         class403 var3 = class453.method3410((long)arg2, true, 13);
         var3.method3093(22144);
         var3.field6185 = arg1;
         if (arg0 <= 75) {
            field9495 = null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9500[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Ljj;Z)V"
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         this.field9492 = arg0.method1038((byte)-97);
         if (!arg1) {
            this.method793((class128)null, false);
         }

         ++field9494;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9500[6] + (arg0 != null ? field9500[5] : field9500[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4701(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4702(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
