import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class472 implements class603 {
   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "Liia;"
   )
   private class539 field6503;
   @OriginalMember(
      owner = "client!oc",
      name = "b",
      descriptor = "Lup;"
   )
   private class548 field6506;
   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6510 = new String[]{method3587(method3586("otxGC")), method3587(method3586("{9xUWz3\"W\u0016")), method3587(method3586("z/:\u0005")), method3587(method3586("{9x-\u0016")), method3587(method3586("{9x(\u0016")), method3587(method3586("{9x.\u0016")), method3587(method3586("{9x/\u0016")), method3587(method3586("{9x+\u0016"))};
   @OriginalMember(
      owner = "client!oc",
      name = "f",
      descriptor = "I"
   )
   public static int field6505 = 0;
   @OriginalMember(
      owner = "client!oc",
      name = "h",
      descriptor = "Z"
   )
   public static volatile boolean field6509 = true;
   @OriginalMember(
      owner = "client!oc",
      name = "e",
      descriptor = "I"
   )
   public static int field6501;
   @OriginalMember(
      owner = "client!oc",
      name = "c",
      descriptor = "I"
   )
   public static int field6502;
   @OriginalMember(
      owner = "client!oc",
      name = "d",
      descriptor = "I"
   )
   public static int field6504;
   @OriginalMember(
      owner = "client!oc",
      name = "i",
      descriptor = "I"
   )
   public static int field6507;
   @OriginalMember(
      owner = "client!oc",
      name = "g",
      descriptor = "I"
   )
   public static int field6508;

   @OriginalMember(
      owner = "client!oc",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method221(int arg0) {
      try {
         ++field6507;
         if (arg0 != -10439) {
            this.field6503 = null;
         }

         return this.field6503.method4085(3);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6510[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(II)S"
   )
   public static final short method3584(int arg0, int arg1) {
      try {
         ++field6501;
         int var2 = arg0 >> 10 & 63;
         int var3 = (897 & arg0) >> 3;
         int var4 = arg0 & 127;
         if (arg1 != -10794) {
            method3584(20, 57);
         }

         int var5 = ~var4 < -65 ? (-var4 + 127) * var3 >> 7 : var3 * var4 >> 7;
         int var6 = var4 + var5;
         int var7;
         if (var6 == 0) {
            var7 = var5 << 1;
            if (!client.field1481) {
               return (short)(var2 << 10 | var7 >> 4 << 7 | var6);
            }
         }

         var7 = (var5 << 8) / var6;
         return (short)(var2 << 10 | var7 >> 4 << 7 | var6);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field6510[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(ILda;Ljava/lang/String;III)I"
   )
   private final int method3585(int arg0, class447 arg1, String arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg3 != -1975055510) {
            this.field6503 = null;
         }

         ++field6502;
         return arg1.method3420(arg5 - -arg0, 0, arg3 ^ -1975048598, this.field6506.field8077, -(arg0 * 2) + this.field6506.field8075, (class648[])null, arg2, 0, (int[])null, 0, 0, 0, this.field6506.field8069, arg0 + arg4, (class87)null, this.field6506.field8072 - arg0 * 2);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6510[7] + arg0 + ',' + (arg1 != null ? field6510[0] : field6510[2]) + ',' + (arg2 != null ? field6510[0] : field6510[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method223(int arg0) {
      try {
         ++field6504;
         if (arg0 != -28722) {
            this.field6503 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6510[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method222(int arg0, boolean arg1) {
      try {
         if (arg0 != -22493) {
            field6509 = true;
         }

         ++field6508;
         class90 var3 = this.field6503.method4087((byte)-121, this.field6506.field8067);
         if (var3 != null) {
            int var4 = this.field6506.field8073.method1893((byte)-49, this.field6506.field8075, class286.field3961) - -this.field6506.field8065;
            int var5 = this.field6506.field8074.method4440(class627.field9254, 64, this.field6506.field8072) + this.field6506.field8068;
            if (this.field6506.field8076) {
               class629.field9294.method462(var4, var5, this.field6506.field8075, this.field6506.field8072, this.field6506.field8070, 0);
            }

            int var6 = var5 + this.method3585(5, class98.field1306, var3.field1217, -1975055510, var5, var4) * 12;
            int var11 = var6 + 8;
            if (this.field6506.field8076) {
               class629.field9294.method446(var4, var11, this.field6506.field8075 - 1 + var4, var11, this.field6506.field8070, 0);
            }

            var6 = var11 + 1;
            int var7 = var6 + 12 * this.method3585(5, class98.field1306, var3.field1218, -1975055510, var6, var4);
            int var12 = var7 + 5;
            int var10000 = var12 + this.method3585(5, class98.field1306, var3.field1214, -1975055510, var12, var4) * 12;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field6510[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "<init>",
      descriptor = "(Liia;Lup;)V"
   )
   public class472(class539 arg0, class548 arg1) {
      try {
         this.field6503 = arg0;
         this.field6506 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6510[1] + (arg0 != null ? field6510[0] : field6510[2]) + ',' + (arg1 != null ? field6510[0] : field6510[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3586(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3587(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
