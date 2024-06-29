import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class15 extends class791 {
   @OriginalMember(
      owner = "client!vl",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field198 = new String[]{method119(method118("OyIJZ")), method119(method118("OyIIZ")), method119(method118("OyIHZ")), method119(method118("W`\u000b`")), method119(method118("B;I\"\u000f")), method119(method118("OyIOZ")), method119(method118("OyIDZ"))};
   @OriginalMember(
      owner = "client!vl",
      name = "F",
      descriptor = "I"
   )
   public static int field192;
   @OriginalMember(
      owner = "client!vl",
      name = "E",
      descriptor = "I"
   )
   public static int field193;
   @OriginalMember(
      owner = "client!vl",
      name = "I",
      descriptor = "I"
   )
   public static int field194;
   @OriginalMember(
      owner = "client!vl",
      name = "G",
      descriptor = "I"
   )
   public static int field196;
   @OriginalMember(
      owner = "client!vl",
      name = "H",
      descriptor = "Lclient;"
   )
   public static client field197;
   @OriginalMember(
      owner = "client!vl",
      name = "D",
      descriptor = "[B"
   )
   private byte[] field195;

   @OriginalMember(
      owner = "client!vl",
      name = "b",
      descriptor = "(BII)Z"
   )
   public static final boolean method113(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 <= 60) {
            method114((byte)-80, 71, (class594)null, (class255)null);
         }

         ++field192;
         return class418.method3165(arg2, arg1, (byte)52) || class707.method5144((byte)-113, arg1, arg2);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field198[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(BILwm;Lbj;)V"
   )
   public static final void method114(byte param0, int param1, class594 param2, class255 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(IBII)[B"
   )
   public final byte[] method115(int arg0, byte arg1, int arg2, int arg3) {
      try {
         this.field195 = new byte[arg0 * arg3 * 2 * arg2];
         ++field193;
         this.method1350(arg3, arg0, arg2, (byte)-10);
         int var5 = 111 / ((arg1 - -3) / 52);
         return this.field195;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field198[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method116(int arg0) {
      try {
         field197 = null;
         if (arg0 != 15935) {
            field197 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field198[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "<init>",
      descriptor = "()V"
   )
   public class15() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method117(int arg0, int arg1, byte arg2) {
      try {
         ++field196;
         byte var7 = (byte)((arg2 >> 1 & 127) + 127);
         int var4 = arg1 * 2;
         if (arg0 != -513) {
            this.field195 = null;
         }

         this.field195[var4++] = var7;
         this.field195[var4] = var7;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field198[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method118(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method119(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
