import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class39 extends class15 {

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    private int field622 = 0;

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
    private int field628 = -1;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "Lce;")
    public static class126 field616 = class206.method1445(-7923, "cross");

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "J")
    public static long field621 = 0L;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field615 = 0;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "Lce;")
    public static class126 field627 = class206.method1445(-7923, "(U3");

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "Z")
    public static boolean field626 = false;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "Lsg;")
    public static class164 field630;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "[Lpk;")
    public static class76[] field623;

    @OriginalMember(owner = "client!hk", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() throws Throwable {
        if (this.field628 != -1) {
            class121.method794(this.field628, this.field622, this.field624);
            this.field628 = -1;
            this.field622 = 0;
        }
        super.finalize();
        field614++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILcc;IZII)V", line = 26)
    public static final void method243(int arg0, int arg1, class313 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class288.field4785 = arg4;
        class100.field1608 = arg2;
        field619++;
        if (arg6 >= -93) {
            return;
        }
        class240.field4050 = arg0;
        class150.field2751 = arg1;
        class272.field4587 = arg3;
        class33.field477 = 1;
        class315.field5413 = arg5;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)V", line = 45)
    public static final void method244(byte arg0) {
        if (arg0 != 1) {
            field626 = false;
        }
        class203.field3480.method1178(-114);
        field618++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IJ)V", line = 56)
    public static final void method245(int arg0, long arg1) {
        field629++;
        if (arg1 != 0L) {
            class103.field1645.method1238(110, 105);
            int var3 = 9 % ((-arg0 - 38) / 59);
            class17.field229++;
            class103.field1645.method962(-123, arg1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)Lce;", line = 76)
    public static final class126 method246(int arg0, int arg1) {
        field631++;
        if (arg1 < 100000) {
            return class12.method69(new class126[] { class296.field4928, class195.method1386((byte) 20, arg1), class106.field1671 }, (byte) 116);
        } else if (arg1 < 10000000) {
            return class12.method69(new class126[] { class181.field3158, class195.method1386((byte) 20, arg1 / 1000), class71.field1159, class106.field1671 }, (byte) 124);
        } else if (arg0 == 26300) {
            return class12.method69(new class126[] { class257.field4327, class195.method1386((byte) 20, arg1 / 1000000), class58.field902, class106.field1671 }, (byte) 125);
        } else {
            return (class126) null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V", line = 103)
    public static void method247(boolean arg0) {
        field627 = null;
        field616 = null;
        field630 = null;
        field623 = null;
        if (arg0) {
            method245(-31, 35L);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(Z)V", line = 120)
    public static final void method248(boolean arg0) {
        field620++;
        class322.method2236(arg0, 0);
        System.gc();
        class280.method1872(-108, 25);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V", line = 182)
    public class39(int arg0) {
        GL var2 = class56.field848;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field624 = class121.field2023;
        this.field628 = var3[0];
        class56.method354(this.field628);
        int var4 = class236.field3979[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class121.field2025 += var6.limit() - this.field622;
        this.field622 = var6.limit();
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V", line = 153)
    public final void method249(int arg0) {
        field617++;
        int var2 = class46.method287((byte) -117);
        if ((arg0 & var2) == 0) {
            class56.method354(this.field628);
        }
        if ((var2 & 0x2) == 0) {
            class56.method381(0);
        }
        if ((var2 & 0x4) == 0) {
            class56.method351(0);
        }
    }
}
