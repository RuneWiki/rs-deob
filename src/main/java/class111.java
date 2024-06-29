import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class111 extends class107 {

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    private int field1943;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "[I")
    public static int[] field1948 = new int[32];

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "Lpj;")
    public static class237 field1945 = class33.method353(": ", 49);

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "Lak;")
    public static class135 field1950 = new class135(50);

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    public static int field1952 = 0;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "Lwc;")
    public static class221 field1944;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field1949;
        if (~arg1 == -1) {
            this.field1943 = (arg0.method316((byte) -53) << 12) / 255;
        }
        if (arg2 != -32513) {
            this.method123((byte) 40, 48);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
    private class111(int arg0) {
        super(0, true);
        this.field1943 = 4096;
        this.field1943 = arg0;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field1947;
        if (arg0 != -17) {
            this.method122((class32) null, -91, 69);
        }
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            class171.method1186(var3, 0, class106.field1862, this.field1943);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)V")
    public static final void method821(int arg0) {
        class114.field1997.method942(0);
        class90.field1640.method942(0);
        ++field1942;
        if (arg0 < 16) {
            method821(-24);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class111() {
        this(4096);
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
    public static void method822(int arg0) {
        field1948 = null;
        field1950 = null;
        field1945 = null;
        if (arg0 == 255) {
            field1944 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "(I)V")
    public static final void method823(int arg0) {
        ++field1946;
        if (!class119.field2083[98]) {
            if (class119.field2083[99]) {
                class23.field426 += (-class23.field426 + -12) / 2;
            } else {
                class23.field426 /= 2;
            }
        } else {
            class23.field426 += (-class23.field426 + 12) / 2;
        }
        int var1 = class229.field3911.field3710 - -class204.field3488;
        class12.field210 += class23.field426 / 2;
        if (!class119.field2083[96]) {
            if (class119.field2083[97]) {
                class269.field4600 += (-class269.field4600 + 24) / 2;
            } else {
                class269.field4600 /= 2;
            }
        } else {
            class269.field4600 += (-class269.field4600 + -24) / 2;
        }
        if (arg0 > -13) {
            field1952 = 1;
        }
        int var2 = class176.field3083 + class229.field3911.field3700;
        if (class164.field2921 - var1 < -500 || ~(-var1 + class164.field2921) < -501 || ~(-var2 + class31.field616) > 499 || ~(class31.field616 - var2) < -501) {
            class164.field2921 = var1;
            class31.field616 = var2;
        }
        if (class164.field2921 != var1) {
            class164.field2921 += (-class164.field2921 + var1) / 16;
        }
        if (class31.field616 != var2) {
            class31.field616 += (-class31.field616 + var2) / 16;
        }
        class257.field4417 += class269.field4600 / 2;
        class189.method1285((byte) -126);
    }
}
