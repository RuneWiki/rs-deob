import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class230 {
   @OriginalMember(
      owner = "client!eb",
      name = "b",
      descriptor = "I"
   )
   public int field3574 = -1;
   @OriginalMember(
      owner = "client!eb",
      name = "f",
      descriptor = "I"
   )
   public int field3573 = -1;
   @OriginalMember(
      owner = "client!eb",
      name = "j",
      descriptor = "I"
   )
   public int field3578 = -1;
   @OriginalMember(
      owner = "client!eb",
      name = "k",
      descriptor = "I"
   )
   public int field3581 = 0;
   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3585 = new String[]{method2054(method2053("4p7\t!")), method2054(method2053("!+uK")), method2054(method2053("*<7bt")), method2054(method2053("*<7dt")), method2054(method2053("*<7et")), method2054(method2053("*<7`t")), method2054(method2053("*<7ft")), method2054(method2053("*<7at")), method2054(method2053("*<7ct"))};
   @OriginalMember(
      owner = "client!eb",
      name = "m",
      descriptor = "Lae;"
   )
   public static class506 field3584 = new class506();
   @OriginalMember(
      owner = "client!eb",
      name = "d",
      descriptor = "I"
   )
   public static int field3575;
   @OriginalMember(
      owner = "client!eb",
      name = "e",
      descriptor = "I"
   )
   public static int field3576;
   @OriginalMember(
      owner = "client!eb",
      name = "i",
      descriptor = "I"
   )
   public static int field3577;
   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "I"
   )
   public static int field3579;
   @OriginalMember(
      owner = "client!eb",
      name = "l",
      descriptor = "I"
   )
   public static int field3580;
   @OriginalMember(
      owner = "client!eb",
      name = "g",
      descriptor = "I"
   )
   public static int field3582;
   @OriginalMember(
      owner = "client!eb",
      name = "h",
      descriptor = "I"
   )
   public static int field3583;
   @OriginalMember(
      owner = "client!eb",
      name = "c",
      descriptor = "[I"
   )
   public int[] field3572;

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2046(byte arg0) {
      try {
         if (arg0 != 33) {
            method2049(3, (String)null);
         }

         field3584 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3585[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method2047(class65 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg1 != -1) {
            field3579 = 36;
         }

         while(true) {
            int var4 = arg0.method665(false);
            if (~var4 != -1) {
               this.method2050(arg0, var4, (byte)42);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field3577;
            break;
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3585[2] + (arg0 != null ? field3585[0] : field3585[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2048(int arg0, int arg1, int arg2) {
      try {
         class644.field9063 = -class651.field9223 + arg1;
         if (arg2 == -1) {
            ++field3580;
            class348.field5114 = -class651.field9220 + arg0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3585[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ILjava/lang/String;)Z"
   )
   public static final boolean method2049(int arg0, String arg1) {
      try {
         if (arg0 != 25243) {
            field3579 = -9;
         }

         ++field3575;
         return class235.field3630.containsKey(arg1);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3585[7] + arg0 + ',' + (arg1 != null ? field3585[0] : field3585[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lcu;IB)V"
   )
   private final void method2050(class65 arg0, int arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         int var5 = -103 / ((arg2 - -47) / 32);
         ++field3576;
         if (~arg1 == -2) {
            this.field3573 = arg0.method685(-2);
         } else {
            if (~arg1 != -3) {
               if (arg1 == 3) {
                  this.field3574 = arg0.method665(false);
                  return;
               }

               if (arg1 == 4) {
                  this.field3581 = arg0.method665(false);
                  return;
               }

               if (~arg1 == -6) {
                  this.field3578 = arg0.method685(-2);
                  return;
               }
            } else {
               this.field3572 = new int[arg0.method665(false)];
               int var6 = 0;
               if (var4) {
                  this.field3572[var6] = arg0.method685(-2);
                  ++var6;
               }

               while(~this.field3572.length < ~var6) {
                  this.field3572[var6] = arg0.method685(-2);
                  ++var6;
               }
            }

         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3585[5] + (arg0 != null ? field3585[0] : field3585[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method2051(byte arg0, int arg1) {
      try {
         ++field3583;
         if (arg1 != -1) {
            if (class14.field203[arg1]) {
               class558.field7924.method453(arg1, 2);
               class315.field4719[arg1] = null;
               class779.field11377[arg1] = null;
               class14.field203[arg1] = false;
               if (arg0 != 115) {
                  field3579 = -108;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3585[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method2052(boolean arg0) {
      try {
         class424.field6199 = null;
         class172.field2578 = null;
         if (arg0) {
            field3584 = null;
         }

         ++field3582;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3585[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2053(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2054(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
