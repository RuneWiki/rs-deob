import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class173 {

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lch;")
    private class298 field2996;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lem;")
    private class240 field2993;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Lmk;")
    private class89 field3002;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lbd;")
    private static class162 field2998 = class17.method142(0, "Continue");

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lbd;")
    public static class162 field2995 = field2998;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field3003 = 0;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Lbd;")
    public static class162 field2999 = class17.method142(0, "::");

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "B")
    public static byte field2992;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Lb;")
    private class94 field3005;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Z")
    public static boolean field2991;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "[Lae;")
    private class23[] field2990;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILda;II)[Ldc;", line = 13)
    public static final class71[] method1323(int arg0, class143 arg1, int arg2, int arg3) {
        field3004++;
        if (class94.method757(arg1, arg3, -1908303920, arg2)) {
            return arg0 == 255 ? class237.method1679(-69) : (class71[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lh;Lh;II)Lae;", line = 51)
    public final class23 method1324(class315 arg0, class315 arg1, int arg2, int arg3) {
        if (arg2 != 255) {
            this.field3005 = (class94) null;
        }
        field3000++;
        return this.method1326(arg3, arg1, arg0, (byte) -67, true);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Z", line = 70)
    public final boolean method1325(byte arg0) {
        field2989++;
        if (arg0 > -82) {
            field2992 = 93;
        }
        if (this.field3005 != null) {
            return true;
        }
        if (this.field3002 == null) {
            if (this.field2993.method1701(117)) {
                return false;
            }
            this.field3002 = this.field2993.method1692(true, (byte) 0, 255, 255, (byte) 82);
        }
        if (this.field3002.field2311) {
            return false;
        } else {
            this.field3005 = new class94(this.field3002.method652(false));
            this.field2990 = new class23[(this.field3005.field1681.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILh;Lh;BZ)Lae;", line = 102)
    private final class23 method1326(int arg0, class315 arg1, class315 arg2, byte arg3, boolean arg4) {
        field2997++;
        if (this.field3005 == null) {
            throw new RuntimeException();
        }
        this.field3005.field1653 = arg0 * 8 + 5;
        if (this.field3005.field1681.length <= this.field3005.field1653) {
            throw new RuntimeException();
        } else if (this.field2990[arg0] == null) {
            int var6 = this.field3005.method747(false);
            int var7 = this.field3005.method747(false);
            if (arg3 > -46) {
                method1328(-39);
            }
            class23 var8 = new class23(arg0, arg2, arg1, this.field2993, this.field2996, var6, var7, arg4);
            this.field2990[arg0] = var8;
            return var8;
        } else {
            return this.field2990[arg0];
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 148)
    public final void method1327(int arg0) {
        field2994++;
        if (this.field2990 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field2990.length; var2++) {
            if (this.field2990[var2] != null) {
                this.field2990[var2].method197((byte) 109);
            }
        }
        for (int var3 = 0; var3 < this.field2990.length; var3++) {
            if (this.field2990[var3] != null) {
                this.field2990[var3].method187(-113);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 182)
    public static void method1328(int arg0) {
        field2999 = null;
        if (arg0 > -119) {
            method1323(-52, (class143) null, 21, -96);
        }
        field2995 = null;
        field2998 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lem;Lch;)V", line = 201)
    public class173(class240 arg0, class298 arg1) {
        this.field2996 = arg1;
        this.field2993 = arg0;
        if (!this.field2993.method1701(109)) {
            this.field3002 = this.field2993.method1692(true, (byte) 0, 255, 255, (byte) -49);
        }
    }
}
