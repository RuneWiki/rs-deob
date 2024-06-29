import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ta")
public class class38 {

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "[I")
    private int[] field493;

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "Lea;")
    public static class10 field495 = class3.method8("Loading )3)3)3", 120);

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "Lea;")
    public static class10 field496 = class3.method8("world", 119);

    @OriginalMember(owner = "mapview!ta", name = "e", descriptor = "Lea;")
    public static class10 field497 = class3.method8("Mace Shop", 104);

    @OriginalMember(owner = "mapview!ta", name = "g", descriptor = "Lea;")
    public static class10 field499 = class3.method8("Woodcutting stump", 94);

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "Lsa;")
    public static class36 field494;

    @OriginalMember(owner = "mapview!ta", name = "f", descriptor = "Lba;")
    public static class4 field498;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I[B)[B", line = 5)
    public static final byte[] method245(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        if (arg0 != -21128) {
            field497 = null;
        }
        byte[] var3 = new byte[var2];
        class26.method197(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Ls;III)[Lm;", line = 44)
    public static final class24[] method246(class35 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -29411) {
            field497 = null;
        }
        return class19.method133(arg3, arg2, arg0, (byte) 20) ? class14.method102(0) : null;
    }

    @OriginalMember(owner = "mapview!ta", name = "<init>", descriptor = "([I)V", line = 64)
    public class38(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field493 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field493[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field493[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field493[var5 + var5] = arg0[var4];
            this.field493[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I)V", line = 112)
    public static void method247(int arg0) {
        field498 = null;
        field494 = null;
        if (arg0 < -27) {
            field496 = null;
            field497 = null;
            field499 = null;
            field495 = null;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(I)V", line = 127)
    public static final void method248(int arg0) {
        if (arg0 != -1) {
            method245(111, null);
        }
        if (class22.field234 != null) {
            class39 var1 = class22.field234;
            synchronized (class22.field234) {
                class22.field234 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(II)I", line = 150)
    public final int method249(int arg0, int arg1) {
        int var3 = (this.field493.length >> 1) - 1;
        if (arg1 != 1) {
            field496 = null;
        }
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field493[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field493[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
