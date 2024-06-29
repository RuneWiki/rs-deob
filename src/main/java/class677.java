import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public abstract class class677 extends class540 {

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "Ljo;")
    public static class351 field9633 = new class351(5, 4);

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public static int field9636 = 0;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "[I")
    public static int[] field9638 = new int[1];

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public int field9632;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public int field9635;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field9637;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "[I")
    public int[] field9631;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLcb;Lkj;)V")
    public static final void method3830(byte arg0, class544 arg1, class590 arg2) {
        class489.field6919 = "";
        class62.field839 = arg1;
        if (arg0 != -44) {
            return;
        }
        class543.field7604 = arg2;
        field9634++;
        if (class16.field272.startsWith("win")) {
            class489.field6919 = class489.field6919 + "windows/";
        } else if (class16.field272.startsWith("linux")) {
            class489.field6919 = class489.field6919 + "linux/";
        } else if (class16.field272.startsWith("mac")) {
            class489.field6919 = class489.field6919 + "macos/";
        }
        if (class543.field7604.field8345) {
            class489.field6919 = class489.field6919 + "msjava/";
        } else if (class16.field273.startsWith("amd64") || class16.field273.startsWith("x86_64")) {
            class489.field6919 = class489.field6919 + "x86_64/";
        } else if (class16.field273.startsWith("i386") || class16.field273.startsWith("i486") || class16.field273.startsWith("i586") || class16.field273.startsWith("x86")) {
            class489.field6919 = class489.field6919 + "x86/";
        } else if (class16.field273.startsWith("ppc")) {
            class489.field6919 = class489.field6919 + "ppc/";
        } else {
            class489.field6919 = class489.field6919 + "universal/";
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static void method3831(int arg0) {
        if (arg0 != 0) {
            field9633 = null;
        }
        field9638 = null;
        field9633 = null;
        field9637 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
    public abstract void method911(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/awt/Canvas;BI)V")
    public abstract void method909(int arg0, Canvas arg1, byte arg2, int arg3);
}
