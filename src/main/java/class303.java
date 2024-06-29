import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class303 extends class240 {

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "[Lqi;")
    public class303[] field4762;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "Z")
    public boolean field4773;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field4761 = 0;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Lik;")
    public static class259 field4758 = new class259(64);

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public static int field4776 = 0;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "Lwb;")
    public class156 field4772;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "Lvb;")
    public class54 field4763;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILpe;I)V", line = 5)
    public void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            this.field4773 = true;
        }
        field4774++;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V", line = 17)
    public static void method2104(int arg0) {
        if (arg0 != 25) {
            method2108(-64, -66, -37);
        }
        field4758 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBI)V", line = 30)
    public final void method2105(int arg0, byte arg1, int arg2) {
        if (arg1 <= 8) {
            field4761 = 19;
        }
        int var4 = this.field4771 == 255 ? arg2 : this.field4771;
        if (this.field4773) {
            this.field4763 = new class54(var4, arg2, arg0);
        } else {
            this.field4772 = new class156(var4, arg2, arg0);
        }
        field4759++;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(III)[[I", line = 51)
    public final int[][] method2106(int arg0, int arg1, int arg2) {
        if (arg2 < 17) {
            this.field4771 = 15;
        }
        field4765++;
        if (this.field4762[arg1].field4773) {
            int[] var4 = this.field4762[arg1].method67(-3, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4762[arg1].method74(arg0, 82);
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(III)[I", line = 96)
    public final int[] method2107(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method65(-126, (class101) null, 17);
        }
        field4766++;
        return this.field4762[arg2].field4773 ? this.field4762[arg2].method67(arg1 ^ 0xFFFFFFFD, arg0) : this.field4762[arg2].method74(arg0, 82)[0];
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 124)
    public void method72(byte arg0) {
        field4768++;
        if (arg0 != -27) {
            this.method73((byte) -124);
        }
        if (this.field4773) {
            this.field4763.method399(false);
            this.field4763 = null;
        } else {
            this.field4772.method1178(-92);
            this.field4772 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[[I", line = 154)
    public int[][] method74(int arg0, int arg1) {
        if (arg1 != 82) {
            this.field4772 = (class156) null;
        }
        field4760++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)[I", line = 167)
    public int[] method67(int arg0, int arg1) {
        field4770++;
        if (arg0 == -3) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return (int[]) null;
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)V", line = 179)
    public void method70(int arg0) {
        if (arg0 > 13) {
            field4767++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(III)V", line = 190)
    public static final void method2108(int arg0, int arg1, int arg2) {
        int var3 = arg1;
        if (arg1 > 25) {
            var3 = 25;
        }
        arg1--;
        field4764++;
        int var4 = class297.field4688[arg1];
        int var5 = class217.field3470[arg1];
        if (arg0 == 0) {
            class269.field4191.method246(false, 198);
            class104.field1766++;
            class269.field4191.method772((byte) -65, var3 + var3 + 3);
        }
        if (arg0 == 1) {
            class269.field4191.method246(false, 97);
            class269.field4191.method772((byte) -87, var3 + var3 + 3 + 14);
            class183.field2920++;
        }
        if (arg0 == 2) {
            class269.field4191.method246(false, 152);
            class269.field4191.method772((byte) -76, var3 + var3 + 3);
            class168.field2617++;
        }
        class269.field4191.method737(var5 + class177.field2780, arg2 ^ 0x72);
        class269.field4191.method735((byte) 77, class108.field1795[82] ? 1 : 0);
        class36.field640 = class297.field4688[0];
        class25.field417 = class217.field3470[0];
        for (int var6 = arg2; var6 < var3; var6++) {
            arg1--;
            class269.field4191.method726((byte) 38, class217.field3470[arg1] - var5);
            class269.field4191.method735((byte) 102, class297.field4688[arg1] - var4);
        }
        class269.field4191.method785(98, var4 + class91.field1485);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IZ)V", line = 247)
    public class303(int arg0, boolean arg1) {
        this.field4762 = new class303[arg0];
        this.field4773 = arg1;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)I", line = 266)
    public int method1994(byte arg0) {
        field4769++;
        if (arg0 != -4) {
            this.field4772 = (class156) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)I", line = 279)
    public int method73(byte arg0) {
        if (arg0 == 2) {
            field4775++;
            return -1;
        } else {
            return -26;
        }
    }
}
