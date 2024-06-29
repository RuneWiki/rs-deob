import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class213 extends class351 {

    @OriginalMember(owner = "client!jda", name = "H", descriptor = "I")
    public static int field2502 = 0;

    @OriginalMember(owner = "client!jda", name = "B", descriptor = "F")
    public static float field2497;

    @OriginalMember(owner = "client!jda", name = "E", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!jda", name = "G", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!jda", name = "K", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!jda", name = "L", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!jda", name = "M", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!jda", name = "D", descriptor = "[B")
    private byte[] field2498;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method1242(int arg0, int arg1) {
        if (arg1 != -5) {
            field2504 = -46;
        }
        field2499++;
        return arg0 == 0 || arg0 == 4;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IBII)[B", line = 19)
    public final byte[] method1243(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = -28 % ((arg1 + 3) / 44);
        field2505++;
        this.field2498 = new byte[arg2 * arg3 * arg0 * 2];
        this.method751(arg2, arg3, false, arg0);
        return this.field2498;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V", line = 33)
    public class213() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "(B)V", line = 43)
    public static final void method1244(byte arg0) {
        field2500++;
        if (arg0 != 94) {
            method1246(null, -86);
        }
        class367.field4751.method1961(18234);
        class76.field1000 = 1;
        class334.field4134 = null;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(IBI)V", line = 58)
    public final void method1245(int arg0, byte arg1, int arg2) {
        field2506++;
        int var4 = arg0 * 2;
        byte var5 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2498[var10001] = var5;
        if (arg2 == -1554) {
            this.field2498[var6] = var5;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lww;I)V", line = 74)
    public static final void method1246(class686 arg0, int arg1) {
        field2503++;
        arg0.field9364 = null;
        int var2 = arg0.field9361.length;
        if (arg1 < 33) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field9361[var3].field6625 = false;
        }
        class285[] var4 = class694.field9611;
        synchronized (class694.field9611) {
            if (var2 < class694.field9611.length && class539.field6804[var2] < 200) {
                class694.field9611[var2].method1714(arg0, (byte) 11);
                int var10002 = class539.field6804[var2]++;
            }
        }
    }
}
