import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class506 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Lfa;")
    private class156 field7480 = new class156(64);

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Lfs;")
    private class387 field7489;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Ljc;")
    public static class303 field7483 = new class303("RC", 1);

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field7488 = 0;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "[I")
    public static int[] field7490 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "[I")
    public static int[] field7491;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "[[B")
    public static byte[][] field7486;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public final void method3018(int arg0) {
        field7485++;
        class156 var2 = this.field7480;
        synchronized (this.field7480) {
            this.field7480.method1105(false);
            if (arg0 != 64) {
                this.method3022((byte) -49, 14);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
    public final void method3019(boolean arg0) {
        class156 var2 = this.field7480;
        synchronized (this.field7480) {
            this.field7480.method1119(88);
        }
        field7484++;
        if (!arg0) {
            this.field7489 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    public static void method3020(byte arg0) {
        field7486 = null;
        field7490 = null;
        if (arg0 > -7) {
            field7490 = null;
        }
        field7483 = null;
        field7491 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BILf;I)J")
    public static final long method3021(byte arg0, int arg1, class529 arg2, int arg3) {
        field7481++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class222 var10 = class384.field5645.method786(arg2.method28(true), 0);
        long var11 = (long) (arg3 | 0x800000 << 7 | arg1 | arg2.method27(118) << 14 | arg2.method22((byte) -70) << 20);
        if (var10.field3200 == 0) {
            var11 |= var8;
        }
        if (var10.field3208 == 1) {
            var11 |= var4;
        }
        if (arg0 <= 11) {
            method3021((byte) 127, -81, null, -45);
        }
        if (var10.field3211) {
            var11 |= var6;
        }
        return var11 | (long) arg2.method28(true) << 32;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
    public final void method3022(byte arg0, int arg1) {
        class156 var3 = this.field7480;
        synchronized (this.field7480) {
            if (arg0 >= -123) {
                return;
            }
            this.field7480.method1116(arg1, -50);
        }
        field7487++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Lpu;")
    public final class393 method3023(int arg0, int arg1) {
        field7482++;
        if (arg1 <= 54) {
            method3021((byte) 12, 34, null, -37);
        }
        class156 var3 = this.field7480;
        class393 var4;
        synchronized (this.field7480) {
            var4 = (class393) this.field7480.method1115((long) arg0, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7489.method2363(arg0, 31, 122);
        class393 var6 = new class393();
        if (var5 != null) {
            var6.method2408(false, new class65(var5));
        }
        class156 var7 = this.field7480;
        synchronized (this.field7480) {
            this.field7480.method1107(1, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class506(class446 arg0, int arg1, class387 arg2) {
        this.field7489 = arg2;
        this.field7489.method2367(31, 28724);
    }
}
