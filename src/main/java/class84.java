import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class84 extends class70 {
   @OriginalMember(
      owner = "client!mba",
      name = "M",
      descriptor = "I"
   )
   private int field1160 = 4096;
   @OriginalMember(
      owner = "client!mba",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1169 = new String[]{method807(method806("\t=\u0018E\u007fL")), method807(method806("\t=\u0018E~L")), method807(method806("\t=\u0018EuL")), method807(method806("\t=\u0018EyL")), method807(method806("\n*\u0015\u0007")), method807(method806("\u001fqWEG"))};
   @OriginalMember(
      owner = "client!mba",
      name = "P",
      descriptor = "[I"
   )
   public static int[] field1167 = new int[3];
   @OriginalMember(
      owner = "client!mba",
      name = "K",
      descriptor = "I"
   )
   public static int field1166 = 0;
   @OriginalMember(
      owner = "client!mba",
      name = "O",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field1164 = new String[][]{{method807(method806(")n")), method807(method806(")m")), method807(method806("7n")), "F"}, {method807(method806(")n")), method807(method806(")m")), method807(method806(")l")), method807(method806("7n")), method807(method806("7m")), "F"}, {method807(method806(")n")), method807(method806(")m")), method807(method806(")l")), method807(method806(")k")), method807(method806("7n")), method807(method806("7m")), method807(method806("7l")), "F"}};
   @OriginalMember(
      owner = "client!mba",
      name = "J",
      descriptor = "I"
   )
   public static int field1168 = -1;
   @OriginalMember(
      owner = "client!mba",
      name = "N",
      descriptor = "I"
   )
   public static int field1161;
   @OriginalMember(
      owner = "client!mba",
      name = "Q",
      descriptor = "I"
   )
   public static int field1162;
   @OriginalMember(
      owner = "client!mba",
      name = "L",
      descriptor = "I"
   )
   public static int field1163;
   @OriginalMember(
      owner = "client!mba",
      name = "I",
      descriptor = "I"
   )
   public static int field1165;

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         ++field1161;
         if (arg2 == 0) {
            this.field1160 = arg1.method603(-2);
         }

         if (arg0 >= -34) {
            method804((byte)-100);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1169[3] + arg0 + ',' + (arg1 != null ? field1169[5] : field1169[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method804(byte arg0) {
      try {
         class577.field8555.method516(class773.field11262, ~class757.field11093.field10999.method3532(-18033) == -2 ? class382.field5307 + 256 << 2 : -1, 0);
         ++field1163;
         if (arg0 != -88) {
            field1168 = -33;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1169[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method805(int arg0) {
      try {
         field1164 = null;
         if (arg0 != 0) {
            method805(-117);
         }

         field1167 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1169[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field1162;
         if (arg0 != -63) {
            this.method331((byte)-97, -103);
         }

         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int[] var5 = this.method690(-81, 0, class623.field9205 & arg1 + -1);
            int[] var6 = this.method690(63, 0, arg1);
            int[] var7 = this.method690(-92, 0, arg1 - -1 & class623.field9205);
            int var8 = 0;
            if (var3 || var8 < class262.field3328) {
               do {
                  int var9 = (var7[var8] + -var5[var8]) * this.field1160;
                  int var10 = (var6[class174.field2249 & var8 + 1] + -var6[var8 + -1 & class174.field2249]) * this.field1160;
                  int var11 = var10 >> 12;
                  int var12 = var9 >> 12;
                  int var13 = var11 * var11 >> 12;
                  int var14 = var12 * var12 >> 12;
                  int var15 = (int)(Math.sqrt((double)((float)(var13 + 4096 + var14) / 4096.0F)) * 4096.0D);
                  int var16 = var15 != 0 ? 16777216 / var15 : 0;
                  var4[var8] = 4096 - var16;
                  ++var8;
               } while(var8 < class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field1169[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "<init>",
      descriptor = "()V"
   )
   public class84() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method806(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method807(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
