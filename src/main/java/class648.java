import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class648 extends class549 {
   @OriginalMember(
      owner = "client!cf",
      name = "u",
      descriptor = "[I"
   )
   private int[] field9337;
   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9343 = new String[]{method4709(method4708("D(\t+j")), method4709(method4708("D(\t.j")), method4709(method4708("D(\t&j")), method4709(method4708("D(\tP+I'SRj")), method4709(method4708("D(\t%j")), method4709(method4708("D(\t)j"))};
   @OriginalMember(
      owner = "client!cf",
      name = "p",
      descriptor = "Lrga;"
   )
   public static class694 field9338 = new class694();
   @OriginalMember(
      owner = "client!cf",
      name = "o",
      descriptor = "I"
   )
   public static int field9342 = 0;
   @OriginalMember(
      owner = "client!cf",
      name = "s",
      descriptor = "I"
   )
   public static int field9332;
   @OriginalMember(
      owner = "client!cf",
      name = "q",
      descriptor = "I"
   )
   public static int field9333;
   @OriginalMember(
      owner = "client!cf",
      name = "m",
      descriptor = "I"
   )
   private int field9334;
   @OriginalMember(
      owner = "client!cf",
      name = "v",
      descriptor = "I"
   )
   private int field9335;
   @OriginalMember(
      owner = "client!cf",
      name = "t",
      descriptor = "I"
   )
   public static int field9339;
   @OriginalMember(
      owner = "client!cf",
      name = "n",
      descriptor = "I"
   )
   public static int field9340;
   @OriginalMember(
      owner = "client!cf",
      name = "r",
      descriptor = "I"
   )
   public static int field9341;
   @OriginalMember(
      owner = "client!cf",
      name = "l",
      descriptor = "[B"
   )
   private byte[] field9336;

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method469(int arg0, int arg1, int arg2) {
      try {
         if (arg1 == -256) {
            ++field9339;
            this.field9335 += this.field9337[arg0] * arg2 >> 12;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9343[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(IBI)V"
   )
   public void method2289(int arg0, byte arg1, int arg2) {
      try {
         if (arg2 > -22) {
            this.field9337 = null;
         }

         ++field9341;
         this.field9336[this.field9334++] = (byte)(127 + class408.method3277(127, arg1 >> 1));
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9343[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method471(boolean arg0) {
      try {
         this.field9335 = Math.abs(this.field9335);
         ++field9332;
         if (!arg0) {
            method4707(-100);
         }

         if (this.field9335 >= 4096) {
            this.field9335 = 4095;
         }

         this.method2289(this.field9334++, (byte)(this.field9335 >> 4), -54);
         this.field9335 = 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9343[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class648(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field9337 = new int[super.field8217];

         for(int var7 = 0; var7 < super.field8217; ++var7) {
            this.field9337[var7] = (short)((int)(Math.pow((double)arg5, (double)var7) * 4096.0D));
         }

      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9343[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method470(int arg0) {
      try {
         this.field9334 = 0;
         ++field9333;
         this.field9335 = 0;
         if (arg0 != -273) {
            this.field9335 = -19;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9343[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4707(int arg0) {
      try {
         field9338 = null;
         if (arg0 != 0) {
            field9338 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9343[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4708(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4709(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
