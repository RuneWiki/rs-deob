import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class37 extends class34 {

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
    public static int field555 = 0;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!ts", name = "I", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(I)V", line = 4)
    private class37(int arg0) {
        super(0, false);
        this.method264(arg0, 4454);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BI)[[I", line = 18)
    public final int[][] method66(byte arg0, int arg1) {
        ++field558;
        if (arg0 != -11) {
            this.method264(19, -44);
        }
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (super.field536.field726) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class383.field5502; ++var7) {
                var4[var7] = this.field561;
                var5[var7] = this.field557;
                var6[var7] = this.field556;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V", line = 62)
    public class37() {
        this(0);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V", line = 66)
    private final void method264(int arg0, int arg1) {
        this.field556 = (arg0 & 255) << 4;
        ++field559;
        this.field557 = 4080 & arg0 >> 4;
        if (arg1 != 4454) {
            this.method264(-6, 8);
        }
        this.field561 = arg0 >> 12 & 4080;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lsv;II)V", line = 79)
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.method264(arg0.method1852(1086280488), 4454);
        }
        if (arg1 <= 16) {
            this.field557 = -13;
        }
        ++field560;
    }
}
