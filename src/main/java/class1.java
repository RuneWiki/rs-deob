import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 {

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "[I")
    private int[] field70;

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "[J")
    public static long[] field72 = new long[32];

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "[I")
    public static int[] field74 = new int[128];

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "Lj;")
    public static class17 field75 = class30.method190(-121, "Key");

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Lj;")
    public static class17 field73 = class30.method190(-91, "Short)2cut");

    @OriginalMember(owner = "mapview!a", name = "m", descriptor = "Lj;")
    public static class17 field79 = class30.method190(-105, "Mace Shop");

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "Lj;")
    public static class17 field71 = class30.method190(-101, "Loading ");

    @OriginalMember(owner = "mapview!a", name = "n", descriptor = "Lj;")
    public static class17 field80 = class30.method190(-119, "Pub)4Bar");

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "mapview!a", name = "k", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "mapview!a", name = "l", descriptor = "Loa;")
    public static class28 field78;

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "[I")
    public static int[] field68;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 22)
    public static final void method21(Component arg0, int arg1) {
        int var2 = 3 / ((arg1 - 83) / 42);
        arg0.removeKeyListener(class28.field364);
        arg0.removeFocusListener(class28.field364);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Z)I", line = 40)
    public static final int method22(boolean arg0) {
        if (arg0) {
            return 63;
        } else if (class26.field346 == null) {
            return 0;
        } else {
            return class26.field346[class13.field234];
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(II)I", line = 55)
    public final int method23(int arg0, int arg1) {
        if (arg0 != -29060) {
            method22(true);
        }
        int var3 = this.field70.length - 2;
        int var4 = arg1 << 1 & var3;
        while (true) {
            int var5 = this.field70[var4];
            if (arg1 == var5) {
                return this.field70[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "<init>", descriptor = "([I)V", line = 91)
    public class1(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field70 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field70[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field70[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field70[var5 + var5] = arg0[var4];
            this.field70[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)V", line = 130)
    public static void method24(int arg0) {
        field80 = null;
        field74 = null;
        field79 = null;
        field78 = null;
        field73 = null;
        if (arg0 >= -91) {
            field67 = 16;
        }
        field72 = null;
        field71 = null;
        field75 = null;
        field68 = null;
    }
}
