import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class461 extends class622 {
   @OriginalMember(
      owner = "client!jc",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6746 = new String[]{method3462(method3461("3^9@1")), method3462(method3461("3^9F1")), method3462(method3461("3^9G1")), method3462(method3461("7H{n")), method3462(method3461("\"\u00139,d")), method3462(method3461("3^9C1"))};
   @OriginalMember(
      owner = "client!jc",
      name = "E",
      descriptor = "I"
   )
   public static int field6742;
   @OriginalMember(
      owner = "client!jc",
      name = "C",
      descriptor = "I"
   )
   public static int field6743;
   @OriginalMember(
      owner = "client!jc",
      name = "G",
      descriptor = "I"
   )
   public static int field6744;
   @OriginalMember(
      owner = "client!jc",
      name = "F",
      descriptor = "I"
   )
   public static int field6745;

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(IIBI)V",
      line = 6
   )
   public final void method1814(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field6742;
         super.field9064 = arg0;
         super.field9066 = arg3;
         int var5 = 121 / ((arg2 - -62) / 32);
         super.field9072 = arg1;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6746[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "<init>",
      descriptor = "(IIIIIF)V",
      line = 19
   )
   public class461(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(FZ)V",
      line = 23
   )
   public final void method1812(float arg0, boolean arg1) {
      try {
         ++field6745;
         if (arg1) {
            this.method1814(-81, -10, (byte)-57, 108);
         }

         super.field9076 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6746[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(ZB)V",
      line = 35
   )
   public static final void method3459(boolean arg0, byte arg1) {
      try {
         class510.field7454.method5552(0, 53, class510.field7454.field11187);
         ++field6743;
         class510.field7454.method5552(0, 69, class510.field7454.field11159);
         class510.field7454.method5552(1, -105, class510.field7454.field11186);
         class510.field7454.method5552(1, 54, class510.field7454.field11165);
         class510.field7454.method5552(0, -107, class510.field7454.field11188);
         class510.field7454.method5552(0, -107, class510.field7454.field11181);
         class510.field7454.method5552(0, 82, class510.field7454.field11175);
         class510.field7454.method5552(0, 21, class510.field7454.field11162);
         class510.field7454.method5552(0, 88, class510.field7454.field11179);
         class510.field7454.method5552(0, 37, class510.field7454.field11148);
         class510.field7454.method5552(0, 16, class510.field7454.field11143);
         if (arg1 >= -47) {
            method3459(false, (byte)-99);
         }

         class510.field7454.method5552(0, 86, class510.field7454.field11166);
         class510.field7454.method5552(0, -105, class510.field7454.field11139);
         class510.field7454.method5552(0, -115, class510.field7454.field11150);
         class510.field7454.method5552(0, 68, class510.field7454.field11173);
         class510.field7454.method5552(0, -122, class510.field7454.field11149);
         class510.field7454.method5552(0, 36, class510.field7454.field11189);
         class510.field7454.method5552(0, -126, class510.field7454.field11163);
         class510.field7454.method5552(0, 18, class510.field7454.field11138);
         class468.method3504(false);
         class510.field7454.method5552(2, 17, class510.field7454.field11168);
         class510.field7454.method5552(1, -107, class510.field7454.field11184);
         class416.method3174(false);
         class681.method4967(-1);
         class26.field391 = true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6746[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(Lnm;BIII)Z",
      line = 75
   )
   public static final boolean method3460(class496 arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6744;
         if (class11.field119 && class675.field9895) {
            if (~class771.field11305 > -101) {
               return false;
            } else if (!class310.method2416(arg4, arg3, arg2, -109)) {
               return false;
            } else {
               int var5 = arg4 << class76.field1336;
               int var6 = arg3 << class76.field1336;
               int var7 = -1 + class269.field3810[arg2].method2289(arg4, arg3, (byte)125);
               int var8 = arg0.method589(19053) + var7;
               if (arg0.field7263 == 1) {
                  if (!class252.method2038(class57.field1124 + var6, var5, var6, var6, var7, var8, -30465, var5, var8, var5)) {
                     return false;
                  } else if (!class252.method2038(var6 - -class57.field1124, var5, var6, var6 - -class57.field1124, var7, var8, -30465, var5, var7, var5)) {
                     return false;
                  } else {
                     ++class57.field1127;
                     return true;
                  }
               } else if (arg0.field7263 == 2) {
                  if (!class252.method2038(var6 - -class57.field1124, class57.field1124 + var5, class57.field1124 + var6, class57.field1124 + var6, var7, var8, -30465, var5, var8, var5)) {
                     return false;
                  } else if (!class252.method2038(class57.field1124 + var6, class57.field1124 + var5, class57.field1124 + var6, var6 - -class57.field1124, var7, var7, -30465, class57.field1124 + var5, var8, var5)) {
                     return false;
                  } else {
                     ++class57.field1127;
                     return true;
                  }
               } else if (~arg0.field7263 == -5) {
                  if (!class252.method2038(class57.field1124 + var6, class57.field1124 + var5, var6, var6, var7, var8, -30465, class57.field1124 + var5, var8, class57.field1124 + var5)) {
                     return false;
                  } else if (!class252.method2038(class57.field1124 + var6, class57.field1124 + var5, var6, class57.field1124 + var6, var7, var8, -30465, var5 - -class57.field1124, var7, class57.field1124 + var5)) {
                     return false;
                  } else {
                     ++class57.field1127;
                     return true;
                  }
               } else if (arg1 <= 91) {
                  return true;
               } else if (~arg0.field7263 == -9) {
                  if (!class252.method2038(var6, var5 - -class57.field1124, var6, var6, var7, var8, -30465, var5, var8, var5)) {
                     return false;
                  } else if (!class252.method2038(var6, var5 - -class57.field1124, var6, var6, var7, var7, -30465, class57.field1124 + var5, var8, var5)) {
                     return false;
                  } else {
                     ++class57.field1127;
                     return true;
                  }
               } else if (arg0.field7263 == 16) {
                  if (!class599.method4425(var7, var6 - -class760.field11026, (byte)6, var8, class760.field11026, class760.field11026, var5)) {
                     return false;
                  } else {
                     ++class57.field1127;
                     return true;
                  }
               } else if (arg0.field7263 == 32) {
                  if (!class599.method4425(var7, class760.field11026 + var6, (byte)6, var8, class760.field11026, class760.field11026, class760.field11026 + var5)) {
                     return false;
                  } else {
                     ++class57.field1127;
                     return true;
                  }
               } else if (~arg0.field7263 == -65) {
                  if (!class599.method4425(var7, var6, (byte)6, var8, class760.field11026, class760.field11026, var5 - -class760.field11026)) {
                     return false;
                  } else {
                     ++class57.field1127;
                     return true;
                  }
               } else if (~arg0.field7263 == -129) {
                  if (!class599.method4425(var7, var6, (byte)6, var8, class760.field11026, class760.field11026, var5)) {
                     return false;
                  } else {
                     ++class57.field1127;
                     return true;
                  }
               } else {
                  return true;
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field6746[5] + (arg0 != null ? field6746[4] : field6746[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3461(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3462(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
