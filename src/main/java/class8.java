import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ca")
public class class8 {
   @OriginalMember(
      owner = "loginapplet!ca",
      name = "a",
      descriptor = "Ljava/awt/Canvas;"
   )
   public static Canvas field70;
   @OriginalMember(
      owner = "loginapplet!ca",
      name = "b",
      descriptor = "[[D"
   )
   public static double[][] field71 = new double[][]{{0.033D, 0.013D}, {0.041D, 0.015D}};
   @OriginalMember(
      owner = "loginapplet!ca",
      name = "c",
      descriptor = "Laa;"
   )
   public static class2 field72;
   @OriginalMember(
      owner = "loginapplet!ca",
      name = "d",
      descriptor = "Lma;"
   )
   public static class29 field73 = new class29();
   @OriginalMember(
      owner = "loginapplet!ca",
      name = "e",
      descriptor = "I"
   )
   public static volatile int field74 = -1;

   @OriginalMember(
      owner = "loginapplet!ca",
      name = "a",
      descriptor = "(ILjava/lang/String;)Lsa;",
      line = 6
   )
   public static final class41 method31(int arg0, String arg1) {
      try {
         byte[] var2 = arg1.getBytes();
         int var5 = 0;
         int var3 = var2.length;
         class41 var4 = new class41();
         var4.field309 = new byte[var3];

         int var6;
         while(var3 > var5) {
            var6 = var2[var5++] & 255;
            if (-46 <= ~var6 && 40 <= var6) {
               if (~var5 <= ~var3) {
                  break;
               }

               int var7 = 255 & var2[var5++];
               var4.field309[var4.field316++] = (byte)((-40 + var6) * 43 + var7 + -48);
            } else if (-1 != ~var6) {
               var4.field309[var4.field316++] = (byte)var6;
            }
         }

         var6 = 104 % ((arg0 - -11) / 37);
         var4.method197((byte)-39);
         return var4.method199((byte)67);
      } catch (RuntimeException var8) {
         throw class28.method139(var8, "ca.A(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ca",
      name = "a",
      descriptor = "(Z)V",
      line = 58
   )
   public static final void method32(boolean arg0) {
      try {
         if (arg0) {
            if (-1 != class38.field279.toLowerCase().indexOf("microsoft")) {
               class1.field2[192] = 58;
               class1.field2[191] = 73;
               class1.field2[220] = 74;
               class1.field2[187] = 27;
               class1.field2[189] = 26;
               class1.field2[221] = 43;
               class1.field2[219] = 42;
               class1.field2[222] = 59;
               class1.field2[190] = 72;
               class1.field2[223] = 28;
               class1.field2[188] = 71;
               class1.field2[186] = 57;
            } else {
               if (null == class38.field285) {
                  class1.field2[192] = 58;
                  class1.field2[222] = 59;
               } else {
                  class1.field2[222] = 58;
                  class1.field2[520] = 59;
                  class1.field2[192] = 28;
               }

               class1.field2[93] = 43;
               class1.field2[45] = 26;
               class1.field2[59] = 57;
               class1.field2[92] = 74;
               class1.field2[46] = 72;
               class1.field2[61] = 27;
               class1.field2[91] = 42;
               class1.field2[47] = 73;
               class1.field2[44] = 71;
            }

         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ca.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ca",
      name = "a",
      descriptor = "(I)V",
      line = 114
   )
   public static void method33(int arg0) {
      try {
         field71 = (double[][])null;
         field72 = null;
         field73 = null;
         field70 = null;
         if (arg0 != 26) {
            method33(66);
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ca.C(" + arg0 + ')');
      }
   }
}
