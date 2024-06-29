import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class263 extends class453 {

    @OriginalMember(owner = "client!js", name = "F", descriptor = "Luea;")
    public static class256 field3783 = new class256("WTRC", 1);

    @OriginalMember(owner = "client!js", name = "H", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "Lvo;")
    public static class345 field3787;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "[B")
    private byte[] field3786;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IBI)V")
    public final void method1674(int arg0, byte arg1, int arg2) {
        if (arg0 != 21395) {
            this.field3786 = null;
        }
        field3789++;
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        int var5 = arg2 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field3786[var10001] = var4;
        this.field3786[var6] = var4;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
    public static final void method1675(byte arg0) {
        class565[] var1 = client.field1378;
        synchronized (client.field1378) {
            int var2 = 107 / ((arg0 - 78) / 36);
            int var3 = 0;
            while (true) {
                if (var3 >= client.field1378.length) {
                    break;
                }
                client.field1378[var3] = new class565();
                class508.field7566[var3] = 0;
                var3++;
            }
        }
        field3785++;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
    public class263() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V")
    public static void method1676(int arg0) {
        if (arg0 != 16) {
            method1676(-83);
        }
        field3787 = null;
        field3783 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZII)[B")
    public final byte[] method1677(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.method1674(-68, (byte) 77, -14);
        }
        this.field3786 = new byte[arg0 * arg2 * arg3 * 2];
        field3784++;
        this.method1936(arg3, arg2, arg0, arg1);
        return this.field3786;
    }
}
