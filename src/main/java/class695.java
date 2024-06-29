import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class695 extends class575 {
   @OriginalMember(
      owner = "client!df",
      name = "n",
      descriptor = "Z"
   )
   private boolean field10040 = false;
   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10047 = new String[]{method5092(method5091("gN\u0004*V")), method5092(method5091("m]F\u0002")), method5092(method5091("x\u0006\u0004@\u0003")), method5092(method5091("gN\u0004-V")), method5092(method5091("gN\u0004(V")), method5092(method5091("gN\u0004/V")), method5092(method5091("gN\u0004+V")), method5092(method5091("gN\u0004<V")), method5092(method5091("gN\u0004)V")), method5092(method5091("gN\u0004,V"))};
   @OriginalMember(
      owner = "client!df",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field10045 = false;
   @OriginalMember(
      owner = "client!df",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field10037 = new int[1];
   @OriginalMember(
      owner = "client!df",
      name = "m",
      descriptor = "Ldb;"
   )
   public static class685 field10038 = new class685(14, 4);
   @OriginalMember(
      owner = "client!df",
      name = "u",
      descriptor = "I"
   )
   public static int field10036;
   @OriginalMember(
      owner = "client!df",
      name = "l",
      descriptor = "I"
   )
   public static int field10041;
   @OriginalMember(
      owner = "client!df",
      name = "v",
      descriptor = "I"
   )
   public static int field10042;
   @OriginalMember(
      owner = "client!df",
      name = "s",
      descriptor = "I"
   )
   public static int field10043;
   @OriginalMember(
      owner = "client!df",
      name = "q",
      descriptor = "I"
   )
   public static int field10044;
   @OriginalMember(
      owner = "client!df",
      name = "t",
      descriptor = "I"
   )
   public static int field10046;
   @OriginalMember(
      owner = "client!df",
      name = "r",
      descriptor = "Lnd;"
   )
   public static class785 field10039;

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 <= 61) {
            this.method82(true, (byte)-29);
         }

         ++field10041;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10047[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      try {
         ++field10042;
         if (arg0 != 15385) {
            field10038 = null;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10047[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method5089(int arg0) {
      try {
         field10039 = null;
         field10037 = null;
         field10038 = null;
         if (arg0 != 1) {
            method5089(59);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10047[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      try {
         label20: {
            if (!this.field10040) {
               super.field8129.method1937(class339.field5001, 0, 0);
               if (!client.field10022) {
                  break label20;
               }
            }

            super.field8129.method1953(116, 1);
            super.field8129.method1259(class725.field10360, (byte)123);
            super.field8129.method1945((byte)-86, class561.field7986, class561.field7986);
            super.field8129.method2009(0, 2, class172.field2572);
            super.field8129.method1937(class339.field5001, 0, 0);
            super.field8129.method1958(0);
            super.field8129.method1943(0, (class683)null);
            super.field8129.method1953(114, 0);
            this.field10040 = false;
         }

         if (arg0) {
            field10045 = false;
         }

         ++field10043;
         super.field8129.method1945((byte)-86, class561.field7986, class561.field7986);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10047[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      try {
         ++field10044;
         super.field8129.method1943(0, arg2);
         if (!arg1) {
            field10038 = null;
         }

         super.field8129.method1966(arg0, -5);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10047[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10047[2] : field10047[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "b",
      descriptor = "(ZZ)Z"
   )
   public static boolean method5090(boolean arg0, boolean arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10047[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "<init>",
      descriptor = "(Ldaa;)V"
   )
   public class695(class226 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      try {
         if (arg1 != 23) {
            this.method85(true);
         }

         super.field8129.method1945((byte)-86, class74.field1189, class561.field7986);
         ++field10036;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10047[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      try {
         ++field10046;
         class293 var3 = super.field8129.method2005(false);
         if (!arg1) {
            field10045 = true;
         }

         if (var3 != null && arg0) {
            super.field8129.method1953(127, 1);
            super.field8129.method1943(0, var3);
            super.field8129.method1259(class635.field8997, (byte)123);
            super.field8129.method1953(125, 1);
            super.field8129.method1945((byte)-86, class74.field1189, class117.field1846);
            super.field8129.method1239(2, class77.field1238, 2, true, false);
            super.field8129.method1937(class151.field2323, 0, 0);
            class522 var4 = super.field8129.method1992((byte)-117);
            var4.method3911((byte)49, super.field8129.method1947(-116));
            super.field8129.method2015(class303.field4584, (byte)101);
            super.field8129.method1953(98, 0);
            this.field10040 = true;
         } else {
            super.field8129.method1937(class151.field2323, 0, 0);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10047[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5091(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!df",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5092(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
