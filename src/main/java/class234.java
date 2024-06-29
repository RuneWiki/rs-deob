import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class234 extends class59 {

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field3860 = 255;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Lph;")
    public static class229 field3861 = class266.method1858("(U0a )2 in: ", 0);

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "[I")
    public static int[] field3858 = new int[1000];

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Lvm;")
    public static class202 field3856 = new class202(50);

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "Lka;")
    public static class293 field3864;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "Lsi;")
    public static class66 field3857;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)[I", line = 16)
    public final int[] method63(boolean arg0, int arg1) {
        field3862++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (arg0) {
            if (this.field846.field811) {
                class42.method315(var3, 0, class293.field4789, class269.field4504[arg1]);
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V", line = 35)
    public static void method1660(byte arg0) {
        field3857 = null;
        field3861 = null;
        field3858 = null;
        field3856 = null;
        if (arg0 > -27) {
            method1660((byte) -48);
        }
        field3864 = null;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)I", line = 49)
    public static final int method1661(int arg0, int arg1, int arg2) {
        field3859++;
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 <= 98) {
            method1662(16, (byte) -29);
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 87)
    public class234() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IB)Ls;", line = 109)
    public static final class103 method1662(int arg0, byte arg1) {
        field3855++;
        class103 var2 = (class103) class59.field829.method1027(-25, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field2929.method523(-97, arg0, 26);
        class103 var4 = new class103();
        if (var3 != null) {
            var4.method790(new class164(var3), 9420);
        }
        class59.field829.method1026(var4, 120, (long) arg0);
        int var5 = -122 % ((56 - arg1) / 33);
        return var4;
    }
}
