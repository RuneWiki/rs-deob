import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class250 extends class70 {
   @OriginalMember(
      owner = "client!ln",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3164 = new String[]{method1988(method1987("s\u000e\u000e\u0011|")), method1988(method1987("s\u000e\u000ee=q\tTg|")), method1988(method1987("s\u000e\u000e\u001e|")), method1988(method1987("s\u000e\u000e\u001b|")), method1988(method1987("s\u000e\u000e\u001d|")), method1988(method1987("dN\u000ew)")), method1988(method1987("q\u0015L5")), method1988(method1987("s\u000e\u000e\u001a|"))};
   @OriginalMember(
      owner = "client!ln",
      name = "I",
      descriptor = "I"
   )
   public static int field3157 = -1;
   @OriginalMember(
      owner = "client!ln",
      name = "M",
      descriptor = "F"
   )
   public static float field3162 = 1024.0F;
   @OriginalMember(
      owner = "client!ln",
      name = "R",
      descriptor = "I"
   )
   public static int field3153;
   @OriginalMember(
      owner = "client!ln",
      name = "Q",
      descriptor = "I"
   )
   public static int field3154;
   @OriginalMember(
      owner = "client!ln",
      name = "K",
      descriptor = "I"
   )
   private int field3155;
   @OriginalMember(
      owner = "client!ln",
      name = "P",
      descriptor = "I"
   )
   public static int field3156;
   @OriginalMember(
      owner = "client!ln",
      name = "N",
      descriptor = "I"
   )
   public static int field3158;
   @OriginalMember(
      owner = "client!ln",
      name = "O",
      descriptor = "I"
   )
   public static int field3159;
   @OriginalMember(
      owner = "client!ln",
      name = "L",
      descriptor = "I"
   )
   private int field3160;
   @OriginalMember(
      owner = "client!ln",
      name = "J",
      descriptor = "I"
   )
   public static int field3161;
   @OriginalMember(
      owner = "client!ln",
      name = "S",
      descriptor = "I"
   )
   private int field3163;

   @OriginalMember(
      owner = "client!ln",
      name = "<init>",
      descriptor = "(I)V"
   )
   private class250(int arg0) {
      super(0, false);

      try {
         this.method1986(arg0, -35);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3164[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "(BI)V"
   )
   public static final void method1983(byte arg0, int arg1) {
      try {
         if (arg0 == -2) {
            ++field3159;
            class487 var2 = class2.method12((long)arg1, 12, (byte)43);
            var2.method3696(arg0 + -11116);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3164[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "<init>",
      descriptor = "()V"
   )
   public class250() {
      this(0);
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(BLha;)V"
   )
   public static final void method1984(byte arg0, class479 arg1) {
      try {
         class59.field770 = class511.method3855(arg1, 2, class641.field9435, true);
         ++field3154;
         class13.field253 = class441.method3397(16, class641.field9435, arg1);
         if (arg0 != 84) {
            field3161 = 69;
         }

         class209.field2657 = class511.method3855(arg1, 2, class90.field1221, true);
         class689.field10134 = class441.method3397(16, class90.field1221, arg1);
         class98.field1306 = class511.method3855(arg1, 2, class408.field5631, true);
         class492.field6871 = class441.method3397(arg0 ^ 68, class408.field5631, arg1);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3164[4] + arg0 + ',' + (arg1 != null ? field3164[5] : field3164[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         if (arg0 >= -34) {
            this.field3160 = 4;
         }

         if (arg2 == 0) {
            this.method1986(arg1.method645((byte)-26), 121);
         }

         ++field3156;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3164[7] + arg0 + ',' + (arg1 != null ? field3164[5] : field3164[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field3153;
         int[][] var4 = super.field926.method2860(arg0 ^ arg0, arg1);
         if (super.field926.field5048) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 || class262.field3328 > var8) {
               do {
                  var5[var8] = this.field3163;
                  var6[var8] = this.field3155;
                  var7[var8] = this.field3160;
                  ++var8;
               } while(class262.field3328 > var8);
            }
         }

         return var4;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field3164[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "d",
      descriptor = "(III)V"
   )
   public static final void method1985(int arg0, int arg1, int arg2) {
      class731 var3 = class548.field8080[arg0][arg1][arg2];
      if (var3 != null) {
         class676.method4946(var3.field10656);
         class676.method4946(var3.field10642);
         if (var3.field10656 != null) {
            var3.field10656 = null;
         }

         if (var3.field10642 != null) {
            var3.field10642 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "(II)V"
   )
   private final void method1986(int arg0, int arg1) {
      try {
         int var3 = -23 / ((arg1 - 46) / 57);
         this.field3155 = (arg0 & 65280) >> 4;
         this.field3163 = (arg0 & 16711680) >> 12;
         this.field3160 = (255 & arg0) << 4;
         ++field3158;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3164[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1987(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1988(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
