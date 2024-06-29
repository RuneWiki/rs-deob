import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class70 {

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lfr;")
    private class231 field1213 = new class231(128);

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Lfr;")
    public class231 field1216 = new class231(64);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Lqs;")
    public class496 field1203;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Lqs;")
    private class496 field1212;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Lvv;")
    public static class313 field1204 = new class313(37, 4);

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "[[I")
    public static int[][] field1211 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lik;")
    public static class78 field1209 = new class78();

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lhn;III)V", line = 9)
    public static final void method491(class284 arg0, int arg1, int arg2, int arg3) {
        class412.field6247[arg3][arg1] = arg0;
        field1215++;
        if (arg2 != 6) {
            method497(-90, 40, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Lco;", line = 21)
    public final class445 method492(int arg0, byte arg1) {
        field1208++;
        class231 var3 = this.field1213;
        class445 var4;
        synchronized (this.field1213) {
            var4 = (class445) this.field1213.method1593((byte) 118, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field1212;
        byte[] var6;
        synchronized (this.field1212) {
            var6 = this.field1212.method2926(arg0, arg1 - 102, 36);
        }
        class445 var7 = new class445();
        var7.field6628 = this;
        var7.field6617 = arg0;
        if (var6 != null) {
            var7.method2672(new class23(var6), 0);
        }
        if (arg1 != -10) {
            this.field1203 = null;
        }
        var7.method2671(8940);
        class231 var8 = this.field1213;
        synchronized (this.field1213) {
            this.field1213.method1595(var7, (long) arg0, (byte) -95);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 56)
    public final void method493(int arg0) {
        field1210++;
        class231 var2 = this.field1213;
        synchronized (this.field1213) {
            this.field1213.method1598(arg0 ^ 0x54);
        }
        class231 var3 = this.field1216;
        synchronized (this.field1216) {
            this.field1216.method1598(-82);
            if (arg0 != 2) {
                this.field1203 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 74)
    public final void method494(byte arg0) {
        if (arg0 < 124) {
            return;
        }
        field1206++;
        class231 var2 = this.field1213;
        synchronized (this.field1213) {
            this.field1213.method1604(4);
        }
        class231 var3 = this.field1216;
        synchronized (this.field1216) {
            this.field1216.method1604(4);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 94)
    public final void method495(int arg0, int arg1) {
        class231 var3 = this.field1213;
        synchronized (this.field1213) {
            this.field1213.method1603((byte) -117, arg1);
        }
        field1207++;
        class231 var4 = this.field1216;
        synchronized (this.field1216) {
            this.field1216.method1603((byte) -128, arg1);
            if (arg0 >= -46) {
                this.method496(27, -13, -12);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V", line = 113)
    public final void method496(int arg0, int arg1, int arg2) {
        this.field1213 = new class231(arg1);
        field1214++;
        this.field1216 = new class231(arg2);
        if (arg0 != 28167) {
            this.field1213 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lwv;ILqs;Lqs;)V", line = 165)
    public class70(class535 arg0, int arg1, class496 arg2, class496 arg3) {
        this.field1203 = arg3;
        this.field1212 = arg2;
        this.field1212.method2940(36, -10511);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIB)V", line = 135)
    public static final void method497(int arg0, int arg1, byte arg2) {
        class250.field4264++;
        class265.method1775(-2, class236.field4085);
        field1205++;
        if (arg2 < -61) {
            class261.field4357.method122(30393, arg1);
            class261.field4357.method178(arg0, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V", line = 151)
    public static void method498(byte arg0) {
        field1204 = null;
        int var1 = -80 % ((arg0 + 17) / 39);
        field1211 = null;
        field1209 = null;
    }
}
