import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class137 {

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    private int field2176 = 0;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    private int field2178 = 0;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    private int field2179 = 0;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lrda;")
    private class663 field2181;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Llba;")
    private class550 field2184;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[Les;")
    private class387[] field2175;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lmv;")
    public class378 field2180;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lvfa;")
    public static class672 field2182 = null;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lhda;")
    public static class752 field2174 = new class752(60, 0);

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lap;")
    public static class480 field2187;

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lrda;)V", line = 122)
    public class137(class663 arg0) {
        this.field2181 = arg0;
        this.field2184 = new class550(arg0);
        this.field2175 = new class387[10];
        this.field2175[1] = new class484(arg0);
        this.field2175[2] = new class428(arg0, this.field2184);
        this.field2175[4] = new class489(arg0, this.field2184);
        this.field2175[5] = new class307(arg0, this.field2184);
        this.field2175[6] = new class204(arg0);
        this.field2175[7] = new class516(arg0);
        this.field2175[3] = this.field2180 = new class378(arg0);
        this.field2175[8] = new class686(arg0, this.field2184);
        this.field2175[9] = new class82(arg0, this.field2184);
        if (!this.field2175[8].method641(-16777216)) {
            this.field2175[8] = this.field2175[4];
        }
        if (!this.field2175[9].method641(-16777216)) {
            this.field2175[9] = this.field2175[8];
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 12)
    public static final void method1062(byte arg0) {
        class682.field9521++;
        field2185++;
        if (arg0 == 17) {
            class583 var1 = class381.method2246(1, class128.field2105, class34.field507);
            var1.field7637.method3823(-41, 0);
            class42.method309(var1, 0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z", line = 28)
    public final boolean method1063(int arg0, int arg1) {
        if (arg1 != 12686) {
            this.field2184 = null;
        }
        field2183++;
        return this.field2175[arg0].method641(-16777216);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 43)
    public static void method1064(int arg0) {
        field2182 = null;
        field2174 = null;
        field2187 = null;
        if (arg0 <= 89) {
            field2182 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIZZI)V", line = 58)
    public final void method1065(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        boolean var7 = arg4 & this.field2181.method449();
        if (arg5 != 0) {
            this.field2179 = -63;
        }
        field2186++;
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg1 = arg0;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg3) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field2176 != arg2) {
            if (this.field2176 != 0) {
                this.field2175[this.field2176 & Integer.MAX_VALUE].method644(false);
            }
            if (arg2 != 0) {
                this.field2175[arg2 & Integer.MAX_VALUE].method640(arg3, (byte) 20);
                this.field2175[Integer.MAX_VALUE & arg2].method639((byte) -124, arg3);
                this.field2175[Integer.MAX_VALUE & arg2].method643(arg0, arg1, -107);
            }
            this.field2178 = arg0;
            this.field2179 = arg1;
            this.field2176 = arg2;
        } else if (this.field2176 != 0) {
            this.field2175[this.field2176 & Integer.MAX_VALUE].method639((byte) -125, arg3);
            if (this.field2178 != arg0 || this.field2179 != arg1) {
                this.field2175[Integer.MAX_VALUE & this.field2176].method643(arg0, arg1, -22);
                this.field2178 = arg0;
                this.field2179 = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Liga;BI)Z", line = 148)
    public final boolean method1066(class460 arg0, byte arg1, int arg2) {
        int var4 = -45 / ((arg1 - 55) / 40);
        field2177++;
        if (this.field2176 == 0) {
            return false;
        } else {
            this.field2175[this.field2176 & Integer.MAX_VALUE].method638((byte) 121, arg2, arg0);
            return true;
        }
    }
}
