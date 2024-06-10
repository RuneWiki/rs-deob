import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ga")
public abstract class class17 {
   @OriginalMember(
      owner = "loginapplet!ga",
      name = "a",
      descriptor = "I"
   )
   public static int field128 = 0;
   @OriginalMember(
      owner = "loginapplet!ga",
      name = "b",
      descriptor = "I"
   )
   public static int field129 = 0;
   @OriginalMember(
      owner = "loginapplet!ga",
      name = "c",
      descriptor = "Ljava/awt/Image;"
   )
   public Image field130;
   @OriginalMember(
      owner = "loginapplet!ga",
      name = "d",
      descriptor = "I"
   )
   public int field131;
   @OriginalMember(
      owner = "loginapplet!ga",
      name = "e",
      descriptor = "I"
   )
   public int field132;
   @OriginalMember(
      owner = "loginapplet!ga",
      name = "f",
      descriptor = "I"
   )
   public static int field133 = 0;
   @OriginalMember(
      owner = "loginapplet!ga",
      name = "g",
      descriptor = "Lr;"
   )
   public static class38 field134;
   @OriginalMember(
      owner = "loginapplet!ga",
      name = "h",
      descriptor = "[I"
   )
   public int[] field135;

   @OriginalMember(
      owner = "loginapplet!ga",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public static void method85(byte arg0) {
      try {
         field134 = null;
         if (arg0 != -21) {
            method85((byte)98);
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ga.I(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ga",
      name = "a",
      descriptor = "(I)V",
      line = 21
   )
   public final void method86(int arg0) {
      try {
         int var2 = -93 % ((arg0 - 14) / 62);
         class21.method104(this.field135, this.field131, this.field132);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ga.H(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ga",
      name = "a",
      descriptor = "(IILjava/awt/Graphics;I)V"
   )
   public abstract void method87(int arg0, int arg1, Graphics arg2, int arg3);

   @OriginalMember(
      owner = "loginapplet!ga",
      name = "a",
      descriptor = "(ILjava/awt/Component;BI)V"
   )
   public abstract void method88(int arg0, Component arg1, byte arg2, int arg3);

   @OriginalMember(
      owner = "loginapplet!ga",
      name = "<init>",
      descriptor = "()V",
      line = 67
   )
   protected class17() {
   }
}
