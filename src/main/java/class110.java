import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class110 extends class335 {

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "Ltb;")
    public static class220 field1712;

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(I)V", line = 5)
    public class110(int arg0) {
        super(0, true);
        this.field1718 = 4096;
        this.field1718 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)[I", line = 17)
    public final int[] method149(int arg0, int arg1) {
        field1711++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            class343.method2376(var3, 0, class105.field1630, this.field1718);
        }
        return arg1 == 621 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V", line = 37)
    public static final void method821(int arg0) {
        class247.field3918.method2176((byte) 111);
        field1720++;
        if (arg0 != -1) {
            method821(31);
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 48)
    public class110() {
        this(4096);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZ)V", line = 58)
    public static final void method822(int arg0, int arg1, int arg2, boolean arg3) {
        field1713++;
        String var4 = "::tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class128.method932(var4, arg3);
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V", line = 72)
    public static void method823(int arg0) {
        int var1 = -48 / ((13 - arg0) / 63);
        field1712 = null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)V", line = 80)
    public static final void method824(int arg0, int arg1) {
        field1716++;
        if (arg1 == -1 || !class321.method2189(arg1, (byte) 79)) {
            return;
        }
        class220[] var2 = class163.field2463[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class220 var4 = var2[var3];
            if (var4.field3525 != null) {
                class240 var5 = new class240();
                var5.field3834 = var4;
                var5.field3826 = var4.field3525;
                class229.method1620(-111, var5, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILkh;I)V", line = 119)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg2 <= 51) {
            this.field1718 = -122;
        }
        if (arg0 == 0) {
            this.field1718 = (arg1.method1178(0) << 12) / 255;
        }
        field1717++;
    }
}
