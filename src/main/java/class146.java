import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class146 {

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Z")
    private boolean field2326 = false;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public int field2323 = 0;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public int field2337 = 0;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Lpi;")
    public static class342 field2329 = new class342("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public int field2325;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    private int field2342;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "J")
    public long field2330;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILcu;)V")
    public final void method1124(int arg0, class145 arg1) {
        if (arg0 > -83) {
            method1128(-111);
        }
        field2331++;
        while (true) {
            int var3 = arg1.method1063((byte) -112);
            if (var3 == 0) {
                return;
            }
            this.method1127((byte) -13, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)I")
    public static final int method1125(int arg0, int arg1, int arg2) {
        field2328++;
        if (arg0 >= -5) {
            method1125(-45, 123, -29);
        }
        return arg2 == 1 || arg2 == 3 ? class300.field4267[arg1 & 0x3] : class300.field4270[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
    public final void method1126(byte arg0) {
        this.field2339 = class528.field7786[this.field2342 << 3];
        field2336++;
        this.field2324 = (int) Math.sqrt((double) (this.field2325 * this.field2325 + this.field2332 * this.field2332 + this.field2327 * this.field2327));
        if (this.field2338 == 0) {
            this.field2338 = 1;
        }
        if (arg0 > -33) {
            this.field2324 = 42;
        }
        if (this.field2334 == 0) {
            this.field2330 = 2147483647L;
        } else if (this.field2334 == 1) {
            this.field2330 = (this.field2324 * 8 / this.field2338);
            this.field2330 *= this.field2330;
        } else if (this.field2334 == 2) {
            this.field2330 = (this.field2324 * 8 / this.field2338);
        }
        if (this.field2326) {
            this.field2324 *= -1;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLcu;I)V")
    private final void method1127(byte arg0, class145 arg1, int arg2) {
        field2341++;
        if (arg2 == 1) {
            this.field2342 = arg1.method1069((byte) -89);
        } else if (arg2 == 2) {
            arg1.method1063((byte) 107);
        } else if (arg2 == 3) {
            this.field2327 = arg1.method1070(-32387);
            this.field2332 = arg1.method1070(-32387);
            this.field2325 = arg1.method1070(-32387);
        } else if (arg2 == 4) {
            this.field2334 = arg1.method1063((byte) 103);
            this.field2338 = arg1.method1070(-32387);
        } else if (arg2 == 6) {
            this.field2340 = arg1.method1063((byte) -103);
        } else if (arg2 == 8) {
            this.field2337 = 1;
        } else if (arg2 == 9) {
            this.field2323 = 1;
        } else if (arg2 == 10) {
            this.field2326 = true;
        }
        int var4 = 117 / ((arg0 - 56) / 36);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method1128(int arg0) {
        field2329 = null;
        if (arg0 != 22873) {
            field2335 = -100;
        }
    }
}
