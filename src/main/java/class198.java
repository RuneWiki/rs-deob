import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class198 extends class331 {
   @OriginalMember(
      owner = "client!ov",
      name = "q",
      descriptor = "Z"
   )
   private boolean field2453 = false;
   @OriginalMember(
      owner = "client!ov",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2465 = new String[]{method1511(method1510("w9^\u00171")), method1511(method1510("w9^\u00151")), method1511(method1510("w9^\u001b1")), method1511(method1510("v:\u001c1")), method1511(method1510("ca^sd")), method1511(method1510("w9^\u00141")), method1511(method1510("w9^\u00161")), method1511(method1510("w9^\u00101")), method1511(method1510("w9^\u001f1"))};
   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "I"
   )
   public static volatile int field2452 = -1;
   @OriginalMember(
      owner = "client!ov",
      name = "x",
      descriptor = "Lsda;"
   )
   public static class269 field2458 = new class269(57, -1);
   @OriginalMember(
      owner = "client!ov",
      name = "r",
      descriptor = "[[I"
   )
   public static int[][] field2463 = new int[6][];
   @OriginalMember(
      owner = "client!ov",
      name = "y",
      descriptor = "I"
   )
   public static int field2454;
   @OriginalMember(
      owner = "client!ov",
      name = "s",
      descriptor = "I"
   )
   public static int field2455;
   @OriginalMember(
      owner = "client!ov",
      name = "n",
      descriptor = "I"
   )
   public static int field2456;
   @OriginalMember(
      owner = "client!ov",
      name = "v",
      descriptor = "I"
   )
   public static int field2457;
   @OriginalMember(
      owner = "client!ov",
      name = "u",
      descriptor = "I"
   )
   public static int field2460;
   @OriginalMember(
      owner = "client!ov",
      name = "t",
      descriptor = "I"
   )
   public static int field2461;
   @OriginalMember(
      owner = "client!ov",
      name = "o",
      descriptor = "I"
   )
   public static int field2462;
   @OriginalMember(
      owner = "client!ov",
      name = "w",
      descriptor = "I"
   )
   public static int field2464;
   @OriginalMember(
      owner = "client!ov",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field2459;

   @OriginalMember(
      owner = "client!ov",
      name = "b",
      descriptor = "(I)V",
      line = 4
   )
   public final void method411(int arg0) {
      try {
         if (arg0 < -21) {
            label19: {
               if (!this.field2453) {
                  super.field4745.method2662(true, class496.field7336, 0);
                  if (client.field4530 == 0) {
                     break label19;
                  }
               }

               super.field4745.method2574(71, 1);
               super.field4745.method2635(class50.field605, true);
               super.field4745.method2568(class556.field8257, class556.field8257, false);
               super.field4745.method2636(-100, 2, class522.field7591);
               super.field4745.method2662(true, class496.field7336, 0);
               super.field4745.method2652(-13410);
               super.field4745.method2578((class254)null, true);
               super.field4745.method2574(50, 0);
               this.field2453 = false;
            }

            ++field2461;
            super.field4745.method2568(class556.field8257, class556.field8257, false);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2465[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(ZB)V",
      line = 30
   )
   public final void method417(boolean arg0, byte arg1) {
      try {
         ++field2454;
         super.field4745.method2568(class556.field8257, class680.field10213, false);
         if (arg1 != -102) {
            field2462 = 81;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2465[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(IILuha;)V",
      line = 45
   )
   public final void method414(int arg0, int arg1, class254 arg2) {
      try {
         ++field2457;
         super.field4745.method2578(arg2, true);
         if (arg0 != 0) {
            field2462 = 88;
         }

         super.field4745.method2649((byte)119, arg1);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2465[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2465[4] : field2465[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(III)V",
      line = 59
   )
   public final void method412(int arg0, int arg1, int arg2) {
      try {
         ++field2456;
         if (arg1 != 9950) {
            this.method407((byte)-119);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2465[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(B)Z",
      line = 69
   )
   public final boolean method407(byte arg0) {
      try {
         if (arg0 < 16) {
            return true;
         } else {
            ++field2460;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2465[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "<init>",
      descriptor = "(Ldh;)V",
      line = 85
   )
   public class198(class338 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(IZ)V",
      line = 96
   )
   public final void method410(int arg0, boolean arg1) {
      try {
         ++field2455;
         if (arg0 <= 3) {
            field2464 = -78;
         }

         class223 var3 = super.field4745.method2669(-720);
         if (var3 != null && arg1) {
            super.field4745.method2574(52, 1);
            super.field4745.method2578(var3, true);
            super.field4745.method2635(class104.field1257, true);
            super.field4745.method2574(56, 1);
            super.field4745.method2568(class225.field2891, class680.field10213, false);
            super.field4745.method2629(class309.field4402, -87, 2, false, true);
            super.field4745.method2662(true, class219.field2784, 0);
            class495 var4 = super.field4745.method2616(-104);
            var4.method3673(super.field4745.method2641(60), 0);
            super.field4745.method2614(class180.field2210, 6);
            super.field4745.method2574(49, 0);
            this.field2453 = true;
         } else {
            super.field4745.method2662(true, class219.field2784, 0);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2465[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "f",
      descriptor = "(I)V",
      line = 127
   )
   public static void method1509(int arg0) {
      try {
         field2463 = null;
         field2459 = null;
         if (arg0 >= 105) {
            field2458 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2465[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1510(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1511(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
