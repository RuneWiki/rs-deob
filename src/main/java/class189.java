import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class189 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public abstract void method447(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
    public abstract void method452(int arg0, int arg1);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)V")
    public static final void method1209(byte arg0, int arg1) {
        field2615++;
        class6.field48.method536(126, arg1);
        if (arg0 >= 117) {
            class236.field3594.method536(-36, arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V")
    public static final void method1210(int arg0, byte arg1) {
        if (arg1 <= -69) {
            class228.field3461.method536(96, arg0);
            field2606++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLhc;)V")
    public static final void method1211(byte arg0, class235 arg1) {
        if (arg0 == 79) {
            field2605++;
            class39.field589 = arg1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)Lqb;")
    public static final class59 method1212(byte arg0, int arg1) {
        field2613++;
        if (arg0 != -56) {
            method1210(-96, (byte) -99);
        }
        class59 var2 = (class59) class34.field518.method961((long) arg1, 9156);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class270.field4139.method1576(-108, 0, arg1);
        } else {
            var3 = class175.field2464.method1576(arg0 - 43, 0, arg1 & 0x7FFF);
        }
        class59 var4 = new class59();
        if (var3 != null) {
            var4.method373(new class224(var3), -91);
        }
        if (arg1 >= 32768) {
            var4.method368(-128);
        }
        class34.field518.method957(arg0 + 21971, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1213(String arg0, int arg1) {
        field2614++;
        int var2 = class187.method1197(arg0, (byte) 43);
        if (var2 == -1) {
            return;
        }
        if (arg1 <= 66) {
            method1211((byte) 115, (class235) null);
        }
        int[] var3 = class210.field3000.method1701(102, (class146.field2037.field2386[var2] & 0x3AD45ACB) >> 28, class146.field2037.field2386[var2] & 0x3FFF, (class146.field2037.field2386[var2] & 0xFFFEB7D) >> 14);
        class270.method1785(var3[1], true, var3[2]);
    }
}
