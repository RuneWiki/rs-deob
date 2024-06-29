import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class338 extends class493 {
   @OriginalMember(
      owner = "client!dea",
      name = "j",
      descriptor = "I"
   )
   private int field4622;
   @OriginalMember(
      owner = "client!dea",
      name = "o",
      descriptor = "I"
   )
   private int field4623;
   @OriginalMember(
      owner = "client!dea",
      name = "p",
      descriptor = "I"
   )
   private int field4630;
   @OriginalMember(
      owner = "client!dea",
      name = "i",
      descriptor = "I"
   )
   private int field4626;
   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4633 = new String[]{method2676(method2675(" oh\u007frl")), method2676(method2675("?$'\u007fF")), method2676(method2675("*\u007fe=")), method2676(method2675(" oh\u007f\u0007-d`%\u0005l")), method2676(method2675(" oh\u007f~l")), method2676(method2675(" oh\u007fxl")), method2676(method2675(" oh\u007fzl")), method2676(method2675(" oh\u007f}l")), method2676(method2675(" oh\u007f|l"))};
   @OriginalMember(
      owner = "client!dea",
      name = "g",
      descriptor = "I"
   )
   public static int field4624;
   @OriginalMember(
      owner = "client!dea",
      name = "q",
      descriptor = "I"
   )
   public static int field4625;
   @OriginalMember(
      owner = "client!dea",
      name = "m",
      descriptor = "I"
   )
   public static int field4627;
   @OriginalMember(
      owner = "client!dea",
      name = "k",
      descriptor = "I"
   )
   public static int field4629;
   @OriginalMember(
      owner = "client!dea",
      name = "h",
      descriptor = "I"
   )
   public static int field4631;
   @OriginalMember(
      owner = "client!dea",
      name = "n",
      descriptor = "I"
   )
   public static int field4632;
   @OriginalMember(
      owner = "client!dea",
      name = "l",
      descriptor = "Lww;"
   )
   public static class339 field4628;

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(IZI)V"
   )
   public final void method2668(int arg0, boolean arg1, int arg2) {
      try {
         ++field4632;
         int var4 = this.field4623 * arg0 >> 12;
         if (!arg1) {
            int var5 = this.field4630 * arg0 >> 12;
            int var6 = this.field4626 * arg2 >> 12;
            int var7 = this.field4622 * arg2 >> 12;
            class329.method2609(super.field6887, super.field6884, var5, 103, super.field6886, var6, var4, var7);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4633[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(Ljava/lang/String;B)I"
   )
   public static final int method2669(String arg0, byte arg1) {
      try {
         if (arg1 != -126) {
            method2674(101);
         }

         ++field4625;
         return class21.method165(arg0, true, false, 10);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4633[8] + (arg0 != null ? field4633[1] : field4633[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(Lkw;I)V"
   )
   public static final void method2670(class9 arg0, int arg1) {
      try {
         ++field4631;
         if (arg1 == 779412684) {
            if (!(arg0 instanceof class81)) {
               if (arg0 instanceof class783) {
                  class783 var2 = (class783)arg0;
                  class684.method4978(class204.field2593.field10457 != var2.field10457, false, var2);
                  return;
               }
            } else {
               class81 var3 = (class81)arg0;
               if (var3.field1135 == null) {
                  return;
               }

               class595.method4436(var3, arg1 ^ -779412685, ~class204.field2593.field10457 != ~var3.field10457);
            }

         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4633[0] + (arg0 != null ? field4633[1] : field4633[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2671(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -2) {
            method2670((class9)null, -67);
         }

         ++field4624;
         int var4 = this.field4623 * arg2 >> 12;
         int var5 = this.field4630 * arg2 >> 12;
         int var6 = this.field4626 * arg0 >> 12;
         int var7 = this.field4622 * arg0 >> 12;
         class423.method3289(var7, var6, var4, arg1 + 121, super.field6886, var5);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4633[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)Lpia;"
   )
   public static final class680 method2672(int arg0, int arg1, int arg2, Class arg3) {
      class731 var4 = class548.field8080[arg0][arg1][arg2];
      if (var4 == null) {
         return null;
      } else {
         for(class131 var5 = var4.field10654; var5 != null; var5 = var5.field1670) {
            class680 var6 = var5.field1676;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field10010 == arg1 && var6.field10011 == arg2) {
               return var6;
            }
         }

         return null;
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field4622 = arg3;
         this.field4623 = arg0;
         this.field4630 = arg2;
         this.field4626 = arg1;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4633[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public final void method2673(int arg0, int arg1, boolean arg2) {
      try {
         ++field4627;
         if (arg2) {
            int var4 = this.field4623 * arg0 >> 12;
            int var5 = this.field4630 * arg0 >> 12;
            int var6 = this.field4626 * arg1 >> 12;
            int var7 = this.field4622 * arg1 >> 12;
            class107.method963(super.field6887, super.field6884, var7, arg2, var5, var4, var6);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4633[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2674(int arg0) {
      try {
         if (arg0 == 2132891692) {
            field4628 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4633[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2675(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2676(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
