import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!m")
public class class28 {
   @OriginalMember(
      owner = "loginapplet!m",
      name = "a",
      descriptor = "Lsa;"
   )
   public static class41 field194 = class3.method9(12, (byte)-120);
   @OriginalMember(
      owner = "loginapplet!m",
      name = "b",
      descriptor = "Lsa;"
   )
   public static class41 field195 = field194;
   @OriginalMember(
      owner = "loginapplet!m",
      name = "c",
      descriptor = "Lsa;"
   )
   public static class41 field196 = class8.method31(-92, "box_left_plain");
   @OriginalMember(
      owner = "loginapplet!m",
      name = "d",
      descriptor = "I"
   )
   public static volatile int field197 = 0;

   @OriginalMember(
      owner = "loginapplet!m",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V",
      line = 4
   )
   public static final void method135(int arg0, Component arg1) {
      try {
         arg1.removeMouseListener(class14.field111);
         arg1.removeMouseMotionListener(class14.field111);
         arg1.removeFocusListener(class14.field111);
         if (arg0 != 12) {
            field197 = -69;
         }

      } catch (RuntimeException var3) {
         throw method139(var3, "m.D(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!m",
      name = "a",
      descriptor = "(ZI)I",
      line = 23
   )
   public static final int method136(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            field194 = (class41)null;
         }

         return (int)(Math.sin(0.01D * (double)arg1) * 10.0D);
      } catch (RuntimeException var3) {
         throw method139(var3, "m.C(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!m",
      name = "a",
      descriptor = "(I)V",
      line = 36
   )
   public static void method137(int arg0) {
      try {
         int var1 = -43 / ((arg0 - -1) / 46);
         field195 = null;
         field196 = null;
         field194 = null;
      } catch (RuntimeException var2) {
         throw method139(var2, "m.E(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!m",
      name = "a",
      descriptor = "(BIILjava/awt/Component;)Lga;",
      line = 56
   )
   public static final class17 method138(byte arg0, int arg1, int arg2, Component arg3) {
      try {
         try {
            Class var4 = Class.forName("q");
            class17 var8 = (class17)var4.newInstance();
            var8.method88(arg1, arg3, (byte)-14, arg2);
            if (arg0 <= 52) {
               field195 = (class41)null;
            }

            return var8;
         } catch (Throwable var6) {
            class19 var5 = new class19();
            var5.method88(arg1, arg3, (byte)-14, arg2);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw method139(var7, "m.A(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!m",
      name = "a",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)La;",
      line = 87
   )
   public static final class1 method139(Throwable arg0, String arg1) {
      try {
         class1 var2;
         if (arg0 instanceof class1) {
            var2 = (class1)arg0;
            var2.field1 = var2.field1 + ' ' + arg1;
         } else {
            var2 = new class1(arg0, arg1);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   @OriginalMember(
      owner = "loginapplet!m",
      name = "a",
      descriptor = "(FFIFFFF)F",
      line = 109
   )
   public static final float method140(float arg0, float arg1, int arg2, float arg3, float arg4, float arg5, float arg6) {
      try {
         if (arg2 != -10343) {
            field195 = (class41)null;
         }

         float var7 = arg4 - arg1;
         float var9 = class20.method95(arg0, arg3, false, arg0, arg3);
         float var8 = arg5 - arg6;
         float var10 = class20.method95(var7, var8, false, var7, var8);
         float var11 = class20.method95(var7, arg3, false, arg0, var8);
         return var10 - var11 * var11 / var9;
      } catch (RuntimeException var12) {
         throw method139(var12, "m.F(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }
}
