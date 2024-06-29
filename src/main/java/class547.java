import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class547 extends class76 {

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "Z")
    public boolean field7715 = false;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "Z")
    public static boolean field7724 = false;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Lke;")
    public static class622 field7713 = new class622(36, 12);

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field7725 = 0;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field7726 = 0;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "B")
    public byte field7710;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "B")
    public byte field7711;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field7712;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public int field7717;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public int field7718;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public int field7719;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public int field7722;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public int field7723;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lsf;")
    public class547 field7714;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Z")
    public boolean field7720;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)Z")
    public abstract boolean method248(byte arg0);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lha;B)Lhq;")
    public abstract class167 method258(class66 arg0, byte arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z[Ljw;)I")
    public abstract int method1634(boolean arg0, class578[] arg1);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Z")
    public abstract boolean method254(byte arg0);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(ILha;)Z")
    public abstract boolean method1638(int arg0, class66 arg1);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)I")
    public abstract int method246(int arg0);

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)Z")
    public abstract boolean method244(int arg0);

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)V")
    public abstract void method240(int arg0);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
    public static void method3181(boolean arg0) {
        field7713 = null;
        if (arg0) {
            field7726 = 11;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Lha;B)Lpw;")
    public abstract class733 method255(class66 arg0, byte arg1);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([Ljw;BII)I")
    public final int method3182(class578[] arg0, byte arg1, int arg2, int arg3) {
        field7721++;
        long var5 = class555.field7896[this.field7710][arg3][arg2];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg0[var9++] = class238.field3437[var10 - 1].field9855;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg0[var11] = null;
        }
        if (arg1 != 32) {
            this.method258(null, (byte) -84);
        }
        return var9;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILsf;Lha;BIIZ)V")
    public abstract void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;[Ljw;)V")
    public static final void method3183(class547 arg0, class578[] arg1) {
        if (class727.field10183) {
            int var2 = arg0.method1634(true, arg1);
            class711.field10005.method429(var2, arg1);
        }
        if (class622.field8777 == class311.field4628) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class778) {
                var5 = ((class778) arg0).field10733;
                var6 = ((class778) arg0).field10730;
            } else {
                var5 = arg0.field7718 >> class310.field4616;
                var6 = arg0.field7719 >> class310.field4616;
            }
            class711.field10005.method411(class750.field10395[0].method1977((byte) 8, arg0.field7718, arg0.field7719), class554.method3224(var5, var6), class541.method3122(var5, var6), class71.method563(var5, var6));
        }
        class167 var7 = arg0.method258(class711.field10005, (byte) 10);
        if (var7 == null) {
            return;
        }
        if (arg0.field7715) {
            class660[] var8 = var7.field2426;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class660 var10 = var8[var9];
                if (var10.field9279) {
                    class651.method3726(var10.field9281 - var10.field9276, 74, var10.field9277 + var10.field9276, var10.field9280 - var10.field9276, var10.field9278 + var10.field9276);
                }
            }
        }
        if (var7.field2427) {
            var7.field2428 = arg0;
            if (class437.field6253) {
                class650 var11 = class619.field8726;
                synchronized (class619.field8726) {
                    class619.field8726.method3721(0, var7);
                    return;
                }
            }
            class619.field8726.method3721(0, var7);
            return;
        }
        class192.method1407(var7, 1949);
    }

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "(I)I")
    public abstract int method239(int arg0);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZLha;I)Z")
    public abstract boolean method253(int arg0, boolean arg1, class66 arg2, int arg3);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lha;I)V")
    public abstract void method257(class66 arg0, int arg1);

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "(I)I")
    public int method1599(int arg0) {
        if (arg0 > -118) {
            this.method1599(-104);
        }
        field7716++;
        return 0;
    }

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "(I)Z")
    public abstract boolean method1637(int arg0);
}
