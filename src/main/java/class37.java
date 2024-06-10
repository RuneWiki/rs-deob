import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!qa")
public class class37 extends Canvas {
   @OriginalMember(
      owner = "loginapplet!qa",
      name = "a",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field268;
   @OriginalMember(
      owner = "loginapplet!qa",
      name = "b",
      descriptor = "F"
   )
   public static float field269;
   @OriginalMember(
      owner = "loginapplet!qa",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field270 = false;
   @OriginalMember(
      owner = "loginapplet!qa",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field271 = false;

   @OriginalMember(
      owner = "loginapplet!qa",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 9
   )
   public final void update(Graphics arg0) {
      try {
         this.field268.update(arg0);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "qa.update(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!qa",
      name = "a",
      descriptor = "(B)V",
      line = 22
   )
   public static final void method176(byte arg0) {
      try {
         if (arg0 >= -26) {
            field269 = 0.31640977F;
         }

         if (class8.field73 != null) {
            class29 var1 = class8.field73;
            synchronized(class8.field73) {
               class8.field73 = null;
            }
         }

      } catch (RuntimeException var4) {
         throw class28.method139(var4, "qa.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!qa",
      name = "a",
      descriptor = "(JZ)V",
      line = 43
   )
   public static final void method177(long arg0, boolean arg1) {
      try {
         if (~arg0 < -1L) {
            if (0L != arg0 % 10L) {
               class6.method24(arg0, 124);
            } else {
               class6.method24(arg0 + -1L, 126);
               class6.method24(1L, 88);
            }

            if (arg1) {
               method176((byte)-122);
            }

         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "qa.A(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!qa",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V",
      line = 62
   )
   public class37(Component arg0) {
      try {
         this.field268 = arg0;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "qa.<init>(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!qa",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 80
   )
   public final void paint(Graphics arg0) {
      try {
         this.field268.paint(arg0);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "qa.paint(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }
}
