import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class450 extends class222 implements class186 {

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    private int field6927;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field6926 = 0;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "Ltq;")
    public static class427 field6931 = null;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Ltq;")
    public static class427 field6928;

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lbl;I[BIZ)V")
    public class450(class442 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6927 = arg1;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)J")
    public final long method1156(int arg0) {
        if (arg0 != 14522) {
            this.field6927 = 82;
        }
        ++field6923;
        return 0L;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)I")
    public final int method1155(boolean arg0) {
        if (!arg0) {
            this.method1155(false);
        }
        ++field6930;
        return super.field3430;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public static void method2685(int arg0) {
        field6928 = null;
        if (arg0 == -1) {
            field6931 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)I")
    public final int method1154(byte arg0) {
        ++field6929;
        if (arg0 != 22) {
            field6928 = null;
        }
        return this.field6927;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lbl;ILjaggl/memory/NativeBuffer;IZ)V")
    public class450(class442 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6927 = arg1;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([BIII)V")
    public final void method1153(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method1350(arg1, (byte) 83, arg0);
        ++field6924;
        this.field6927 = arg3;
        if (arg2 != -2805) {
            field6928 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V")
    public static final void method2686(int arg0) {
        ++field6922;
        if (arg0 == 914352296) {
            if (class23.field297 >= 0) {
                long var1 = class344.method2111((byte) -99);
                class23.field297 = (int) ((long) class23.field297 - (-class487.field7421 + var1));
                if (~class23.field297 >= -1) {
                    class23.field297 = -1;
                    class116.field1956 = class223.field3441.field2710;
                    class52.field797 = class223.field3441.field2708;
                    class86.field1499 = class223.field3441.field2723;
                    class162.field2533 = class223.field3441.field2713;
                    class238.field3593 = class223.field3441.field2722;
                    class73.field1311 = class223.field3441.field2725;
                    class400.field5826 = class223.field3441.field2707;
                    class329.field4933 = class223.field3441.field2711;
                    class349.field5150 = class223.field3441.field2720;
                    class207.field3250 = class223.field3441.field2716;
                } else {
                    int var3 = (class23.field297 << 8) / class415.field6011;
                    int var4 = -var3 + 255;
                    float var5 = (float) var3 / 255.0F;
                    float var6 = -var5 + 1.0F;
                    class238.field3593 = (-16711936 & (16711935 & class350.field5154) * var3 - -((16711935 & class223.field3441.field2722) * var4)) + ((class350.field5154 & 65280) * var3 + (65280 & class223.field3441.field2722) * var4 & 16711680) >>> 8;
                    class52.field797 = (-class107.field1867 + class223.field3441.field2708) * var6 + class107.field1867;
                    class162.field2533 = (class223.field3441.field2713 - class13.field148) * var6 + class13.field148;
                    class400.field5826 = class169.field2631 * var3 + class223.field3441.field2707 * var4 >> 8;
                    class329.field4933 = (class223.field3441.field2711 - class476.field7274) * var6 + class476.field7274;
                    class349.field5150 = (-class9.field123 + class223.field3441.field2720) * var6 + class9.field123;
                    class86.field1499 = (class223.field3441.field2723 - class299.field4529) * var6 + class299.field4529;
                    class73.field1311 = ((class110.field1896 & 65280) * var3 - -((class223.field3441.field2725 & 65280) * var4) & 16711680) + ((16711935 & class110.field1896) * var3 - -((class223.field3441.field2725 & 16711935) * var4) & -16711936) >>> 8;
                    class116.field1956 = (-class110.field1897 + class223.field3441.field2710) * var6 + class110.field1897;
                    if (class212.field3291 != class223.field3441.field2716) {
                        class207.field3250 = class329.field4937.method1985(class212.field3291, class223.field3441.field2716, var6, class207.field3250);
                    }
                }
                class487.field7421 = var1;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
    public final void method1352(byte arg0) {
        super.field3425.method2618(false, this);
        if (arg0 == 93) {
            ++field6925;
        }
    }
}
