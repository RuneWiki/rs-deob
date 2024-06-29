import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class455 extends class589 {

    @OriginalMember(owner = "client!nja", name = "g", descriptor = "Ljea;")
    public static class474 field6513 = new class474(2, 16);

    @OriginalMember(owner = "client!nja", name = "m", descriptor = "I")
    public static int field6519 = 0;

    @OriginalMember(owner = "client!nja", name = "i", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!nja", name = "k", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!nja", name = "l", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!nja", name = "n", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!nja", name = "h", descriptor = "Lnja;")
    public class455 field6514;

    @OriginalMember(owner = "client!nja", name = "j", descriptor = "Lnja;")
    public class455 field6516;

    @OriginalMember(owner = "client!nja", name = "o", descriptor = "[[I")
    public static int[][] field6521;

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lec;BLuq;)V", line = 4)
    public static final void method2700(class248 arg0, byte arg1, class172 arg2) {
        class117.field1580 = arg2;
        if (arg1 >= -31) {
            return;
        }
        field6520++;
        class451.field6470 = arg0;
        class682.field9116 = "";
        if (class519.field7225.startsWith("win")) {
            class682.field9116 = class682.field9116 + "windows/";
        } else if (class519.field7225.startsWith("linux")) {
            class682.field9116 = class682.field9116 + "linux/";
        } else if (class519.field7225.startsWith("mac")) {
            class682.field9116 = class682.field9116 + "macos/";
        }
        if (class451.field6470.field3233) {
            class682.field9116 = class682.field9116 + "msjava/";
        } else if (class519.field7220.startsWith("amd64") || class519.field7220.startsWith("x86_64")) {
            class682.field9116 = class682.field9116 + "x86_64/";
        } else if (class519.field7220.startsWith("i386") || class519.field7220.startsWith("i486") || class519.field7220.startsWith("i586") || class519.field7220.startsWith("x86")) {
            class682.field9116 = class682.field9116 + "x86/";
        } else if (class519.field7220.startsWith("ppc")) {
            class682.field9116 = class682.field9116 + "ppc/";
        } else {
            class682.field9116 = class682.field9116 + "universal/";
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V", line = 53)
    public final void method2701(int arg0) {
        field6518++;
        int var2 = 51 / ((-arg0 - 32) / 41);
        if (this.field6514 != null) {
            this.field6514.field6516 = this.field6516;
            this.field6516.field6514 = this.field6514;
            this.field6514 = null;
            this.field6516 = null;
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)V", line = 78)
    public static void method2702(byte arg0) {
        field6513 = null;
        if (arg0 == -123) {
            field6521 = null;
        }
    }
}
