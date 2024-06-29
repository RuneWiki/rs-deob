import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class415 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    private int field5680 = 0;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    private int field5682 = 0;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    private int field5686 = 0;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lqfa;")
    private class106 field5684;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lgo;")
    private class653 field5691;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[Lod;")
    private class531[] field5685;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lpk;")
    public class209 field5687;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lwv;")
    public static class37 field5679 = new class37(5, 16);

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field5689 = 0;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lqfa;)V", line = 143)
    public class415(class106 arg0) {
        this.field5684 = arg0;
        this.field5691 = new class653(arg0);
        this.field5685 = new class531[10];
        this.field5685[1] = new class611(arg0);
        this.field5685[2] = new class186(arg0, this.field5691);
        this.field5685[4] = new class564(arg0, this.field5691);
        this.field5685[5] = new class95(arg0, this.field5691);
        this.field5685[6] = new class347(arg0);
        this.field5685[7] = new class428(arg0);
        this.field5685[3] = this.field5687 = new class209(arg0);
        this.field5685[8] = new class40(arg0, this.field5691);
        this.field5685[9] = new class286(arg0, this.field5691);
        if (!this.field5685[8].method304(126)) {
            this.field5685[8] = this.field5685[4];
        }
        if (!this.field5685[9].method304(127)) {
            this.field5685[9] = this.field5685[8];
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 16)
    public static void method2524(boolean arg0) {
        if (arg0) {
            field5679 = null;
        }
        field5679 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(JIB)Ljava/lang/String;", line = 28)
    public static final String method2525(long arg0, int arg1, byte arg2) {
        class193.method1338(arg0, -120);
        field5688++;
        int var4 = class4.field30.get(5);
        int var5 = class4.field30.get(2) + 1;
        int var6 = class4.field30.get(1);
        if (arg2 > -125) {
            method2525(45L, 60, (byte) -42);
        }
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ldca;II)Z", line = 46)
    public final boolean method2526(class188 arg0, int arg1, int arg2) {
        if (arg2 <= 4) {
            return false;
        }
        field5683++;
        if (this.field5686 == 0) {
            return false;
        } else {
            this.field5685[this.field5686 & Integer.MAX_VALUE].method307(arg1, false, arg0);
            return true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z", line = 63)
    public final boolean method2527(int arg0, int arg1) {
        field5690++;
        if (arg0 != 1) {
            this.method2527(-19, 119);
        }
        return this.field5685[arg1].method304(arg0 + 126);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZIIZ)V", line = 80)
    public final void method2528(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg2 & this.field5684.method455();
        field5681++;
        if (!var7 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
                arg4 = arg3;
            }
            arg1 = 2;
        }
        if (arg1 != 0 && arg5) {
            arg1 |= Integer.MIN_VALUE;
        }
        int var8 = 4 / ((57 - arg0) / 55);
        if (this.field5686 != arg1) {
            if (this.field5686 != 0) {
                this.field5685[this.field5686 & Integer.MAX_VALUE].method300(1);
            }
            if (arg1 != 0) {
                this.field5685[Integer.MAX_VALUE & arg1].method301(arg5, -101);
                this.field5685[arg1 & Integer.MAX_VALUE].method309(arg5, -74);
                this.field5685[Integer.MAX_VALUE & arg1].method311((byte) -117, arg3, arg4);
            }
            this.field5686 = arg1;
            this.field5682 = arg3;
            this.field5680 = arg4;
        } else if (this.field5686 != 0) {
            this.field5685[Integer.MAX_VALUE & this.field5686].method309(arg5, -76);
            if (this.field5682 != arg3 || this.field5680 != arg4) {
                this.field5685[Integer.MAX_VALUE & this.field5686].method311((byte) -114, arg3, arg4);
                this.field5680 = arg4;
                this.field5682 = arg3;
            }
        }
    }
}
