import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class349 extends class471 {
   @OriginalMember(
      owner = "client!nu",
      name = "H",
      descriptor = "S"
   )
   public short field5124;
   @OriginalMember(
      owner = "client!nu",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5125 = new String[]{method2762(method2761("ON\u00046_")), method2762(method2761("ON\u0004_\u001eOR^]_")), method2762(method2761("ONF\u000f")), method2762(method2761("Z\u0015\u0004M\n")), method2762(method2761("ON\u0004&_")), method2762(method2761("ON\u00045_")), method2762(method2761("ON\u0004'_")), method2762(method2761("ON\u0004!_"))};
   @OriginalMember(
      owner = "client!nu",
      name = "G",
      descriptor = "Lef;"
   )
   public static class171 field5123 = new class171();
   @OriginalMember(
      owner = "client!nu",
      name = "J",
      descriptor = "I"
   )
   public static int field5119;
   @OriginalMember(
      owner = "client!nu",
      name = "I",
      descriptor = "I"
   )
   public static int field5120;
   @OriginalMember(
      owner = "client!nu",
      name = "E",
      descriptor = "I"
   )
   public static int field5121;
   @OriginalMember(
      owner = "client!nu",
      name = "F",
      descriptor = "I"
   )
   public static int field5122;

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method2759(int param0, int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nu",
      name = "b",
      descriptor = "(Lha;I)Z"
   )
   public final boolean method1682(class17 arg0, int arg1) {
      try {
         ++field5121;
         if (arg1 != 1) {
            this.method1685(-12);
         }

         return class767.method5521(super.field6832 >> class313.field4707, (byte)-78, super.field6826, super.field6833 >> class313.field4707);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5125[6] + (arg0 != null ? field5125[3] : field5125[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method1685(int arg0) {
      try {
         if (arg0 != -1) {
            return true;
         } else {
            ++field5120;
            return class232.field3602[(super.field6832 >> class313.field4707) + (-class507.field7207 - -class15.field214)][(super.field6833 >> class313.field4707) + -class477.field6876 + class15.field214];
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5125[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(B[Lpha;)I"
   )
   public final int method1681(byte arg0, class757[] arg1) {
      try {
         if (arg0 != 39) {
            field5123 = null;
         }

         ++field5122;
         return this.method3610(arg1, super.field6833 >> class313.field4707, 32764, super.field6832 >> class313.field4707);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5125[4] + arg0 + ',' + (arg1 != null ? field5125[3] : field5125[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field6832 = arg0;
         super.field6826 = (byte)arg4;
         super.field6833 = arg2;
         super.field6829 = arg1;
         this.field5124 = (short)arg5;
         super.field6824 = (byte)arg3;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field5125[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method2760(byte arg0) {
      try {
         field5123 = null;
         if (arg0 != -57) {
            field5123 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5125[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2761(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2762(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
