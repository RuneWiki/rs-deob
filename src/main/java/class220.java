import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class220 {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    private int field3185 = 0;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ltp;")
    private class375 field3182 = null;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    private int field3181 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lfu;")
    private class42 field3180;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Ls;")
    private class258 field3183;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[Lfb;")
    private class338[] field3184;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z", line = 5)
    public final boolean method1515(int arg0, int arg1) {
        if (arg0 < 19) {
            this.method1515(5, 25);
        }
        return this.field3184[arg1].method191();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZI)V", line = 15)
    public final void method1516(byte arg0, boolean arg1, int arg2) {
        if ((arg1 | this.field3181 != arg2) & this.field3185 != 0) {
            this.field3184[this.field3185 & Integer.MAX_VALUE].method189(arg2);
            this.field3181 = arg2;
        }
        if (arg0 < 55) {
            this.field3183 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIZI)V", line = 32)
    public final void method1517(boolean arg0, int arg1, boolean arg2, int arg3) {
        boolean var5 = arg2 & this.field3180.method375();
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg1 != 22957) {
            this.method1517(false, 24, false, -97);
        }
        if (arg3 != 0 && arg0) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field3185 != arg3) {
            if (this.field3185 != 0) {
                this.field3184[this.field3185 & Integer.MAX_VALUE].method192();
            }
            if (arg3 != 0) {
                this.field3184[Integer.MAX_VALUE & arg3].method187(arg0);
                this.field3184[arg3 & Integer.MAX_VALUE].method190(arg0);
            }
            this.field3185 = arg3;
            this.field3182 = null;
            this.field3181 = Integer.MIN_VALUE;
        } else if (this.field3185 != 0) {
            this.field3184[Integer.MAX_VALUE & this.field3185].method190(arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lfu;)V", line = 100)
    public class220(class42 arg0) {
        this.field3180 = arg0;
        this.field3183 = new class258(arg0);
        this.field3184 = new class338[9];
        this.field3184[1] = new class29(arg0);
        this.field3184[2] = new class426(arg0, this.field3183);
        this.field3184[4] = new class447(arg0, this.field3183);
        this.field3184[5] = new class415(arg0, this.field3183);
        this.field3184[6] = new class70(arg0);
        this.field3184[7] = new class121(arg0);
        this.field3184[3] = new class252(arg0);
        this.field3184[8] = this.field3184[4];
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLtp;)Z", line = 80)
    public final boolean method1518(byte arg0, class375 arg1) {
        if (this.field3185 == 0) {
            return false;
        }
        if (arg0 != -11) {
            this.field3181 = 36;
        }
        if (this.field3182 != arg1) {
            this.field3184[this.field3185 & Integer.MAX_VALUE].method188(arg1);
            this.field3182 = arg1;
        }
        return true;
    }
}
