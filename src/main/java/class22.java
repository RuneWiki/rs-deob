import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!j")
public class class22 implements Runnable {
   @OriginalMember(
      owner = "loginapplet!j",
      name = "a",
      descriptor = "[[B"
   )
   public static byte[][] field153;
   @OriginalMember(
      owner = "loginapplet!j",
      name = "b",
      descriptor = "Lloginapplet;"
   )
   private loginapplet field154;
   @OriginalMember(
      owner = "loginapplet!j",
      name = "c",
      descriptor = "Laa;"
   )
   public static class2 field155;
   @OriginalMember(
      owner = "loginapplet!j",
      name = "d",
      descriptor = "I"
   )
   public static int field156 = 0;
   @OriginalMember(
      owner = "loginapplet!j",
      name = "e",
      descriptor = "I"
   )
   public static int field157 = 0;

   @OriginalMember(
      owner = "loginapplet!j",
      name = "a",
      descriptor = "(Lr;BLjava/lang/Object;)V",
      line = 4
   )
   public static final void method111(class38 arg0, byte arg1, Object arg2) {
      try {
         if (arg0.field274 != null) {
            int var3 = 0;
            int var4 = -123 / ((69 - arg1) / 50);

            while(var3 < 50 && arg0.field274.peekEvent() != null) {
               class37.method177(1L, false);
               ++var3;
            }

            if (arg2 != null) {
               arg0.field274.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }

         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "j.C(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!j",
      name = "a",
      descriptor = "(IZ)I",
      line = 28
   )
   public static final int method112(int arg0, boolean arg1) {
      try {
         return !arg1 ? -77 : arg0 / 4 << 293631176 | arg0 / 3 << 1163852048 | arg0 / 7;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "j.D(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!j",
      name = "a",
      descriptor = "(Lw;Lsa;BLsa;)Laa;",
      line = 42
   )
   public static final class2 method113(class48 arg0, class41 arg1, byte arg2, class41 arg3) {
      try {
         int var5 = -34 / ((63 - arg2) / 57);
         int var4 = arg0.method236(arg1, 100);
         int var6 = arg0.method232(var4, true, arg3);
         return class1.method1(arg0, var4, (byte)95, var6);
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "j.B(" + (arg0 != null ? "{...}" : "null") + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ',' + (arg3 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!j",
      name = "<init>",
      descriptor = "(Lloginapplet;)V",
      line = 57
   )
   public class22(loginapplet arg0) {
      try {
         this.field154 = arg0;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "j.<init>(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!j",
      name = "run",
      descriptor = "()V",
      line = 68
   )
   public final void run() {
      try {
         try {
            class13.field106 = new class38(true, this.field154, this.field154.field191, "loginapplet", 0);
         } catch (Exception var2) {
            return;
         }

         this.field154.method15(2, 200, 400, 32, -18742);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "j.run()");
      }
   }

   @OriginalMember(
      owner = "loginapplet!j",
      name = "a",
      descriptor = "(I)V",
      line = 90
   )
   public static void method114(int arg0) {
      try {
         field155 = null;
         field153 = (byte[][])null;
         if (arg0 < 110) {
            method113((class48)null, (class41)null, (byte)86, (class41)null);
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "j.A(" + arg0 + ')');
      }
   }
}
