import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class77 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field1490 = 0;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lvd;")
    public static class222 field1494 = class212.method1357("::autoshadow off", 10731);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lvd;")
    public static class222 field1491 = class212.method1357(" zuerst von Ihrer Ignorieren)2Liste(Q", 10731);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method510(int arg0) {
        field1494 = null;
        if (arg0 == -11215) {
            field1491 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLka;)Lpi;")
    public static final class167 method511(byte arg0, class109 arg1) {
        if (arg0 == -91) {
            field1487++;
            return new class167(arg1.method700((byte) 64), arg1.method700((byte) 64), arg1.method700((byte) 64), arg1.method700((byte) 64), arg1.method701(869322848), arg1.method662((byte) -93));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public static final void method512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1495++;
        for (int var5 = arg2; var5 < class98.field1834; var5++) {
            if (class122.field2340[var5] + class214.field3982[var5] > arg0 && class122.field2340[var5] < arg0 + arg3 && arg4 < class56.field1062[var5] + class121.field2285[var5] && arg1 + arg4 > class56.field1062[var5]) {
                class93.field1746[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ls;II[B)V")
    public static final void method513(class188 arg0, int arg1, int arg2, byte[] arg3) {
        field1488++;
        class174 var4 = new class174();
        var4.field3267 = 0;
        var4.field3268 = arg0;
        var4.field2555 = arg2;
        var4.field3274 = arg3;
        class28 var5 = class185.field3420;
        synchronized (class185.field3420) {
            class185.field3420.method235(var4, true);
            if (arg1 != -1) {
                method512(-75, -99, 81, -73, 66);
            }
        }
        class197.method1210((byte) -116);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)V")
    public static final void method514(int arg0, byte arg1) {
        field1493++;
        class122.field2334 = arg0;
        class218.field4052 = -1;
        class218.field4052 = -1;
        if (arg1 > -36) {
            method511((byte) -94, null);
        }
        class21.method207(-1);
    }
}
