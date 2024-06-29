import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class428 extends class476 {

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public int field6211;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    public int field6217;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6209 = new Rectangle[100];

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "[Z")
    public static boolean[] field6214 = new boolean[100];

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "[Lqq;")
    public static class496[] field6222;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "Lrb;")
    public static class283 field6220;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "B")
    public static byte field6219;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public static int field6223;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field6209[var0] = new Rectangle();
        }
        field6222 = new class496[4];
        field6220 = new class283(86, 6);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)Z", line = 6)
    public final boolean method2549(int arg0) {
        if (arg0 != 6) {
            this.method2555(41);
        }
        field6221++;
        return (this.field6217 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V", line = 17)
    public static void method2550(byte arg0) {
        field6220 = null;
        field6222 = null;
        field6214 = null;
        field6209 = null;
        int var1 = 7 % ((27 - arg0) / 41);
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)I", line = 29)
    public final int method2551(int arg0) {
        field6212++;
        if (arg0 != 1762144786) {
            field6214 = null;
        }
        return (this.field6217 & 0x1E92D1) >> 18;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)Z", line = 42)
    public final boolean method2552(byte arg0, int arg1) {
        field6210++;
        if (arg0 != -49) {
            this.field6217 = -99;
        }
        return (this.field6217 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z", line = 53)
    public final boolean method2553(boolean arg0) {
        if (arg0) {
            field6214 = null;
        }
        field6213++;
        return (this.field6217 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)I", line = 71)
    public final int method2554(int arg0) {
        int var2 = -28 / ((57 - arg0) / 59);
        field6215++;
        return class462.method2688(this.field6217, true);
    }

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)Z", line = 93)
    public final boolean method2555(int arg0) {
        if (arg0 != 4120336) {
            field6209 = null;
        }
        field6216++;
        return (this.field6217 & 0x3EDF10) >> 21 != 0;
    }

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "(I)V", line = 105)
    public static final void method2556(int arg0) {
        field6218++;
        class210.field3001 = 0;
        if (arg0 != -15271) {
            method2556(-111);
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class161.field2438[var1] = null;
            class195.field2829[var1] = 1;
            class312.field4240[var1] = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(II)V", line = 127)
    public class428(int arg0, int arg1) {
        this.field6211 = arg1;
        this.field6217 = arg0;
    }
}
