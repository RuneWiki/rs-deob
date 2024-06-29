import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class240 {

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public int field4387 = -1;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public int field4385 = 0;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public int field4388 = -1;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Z")
    public boolean field4381 = true;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static final void method1696(int arg0) {
        if (class250.field4524 == 30) {
            class193.method1345(10, 25);
        }
        field4380++;
        if (arg0 != -7413) {
            method1697((class99) null, 87, (byte) 81, 84);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lpk;IBI)Ldg;")
    public static final class139 method1697(class99 arg0, int arg1, byte arg2, int arg3) {
        field4386++;
        if (class78.method594(arg3, arg0, -65, arg1)) {
            if (arg2 != 34) {
                method1698(-41);
            }
            return class207.method1470(arg2 - 34);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public static final void method1698(int arg0) {
        class247.method1738(25);
        field4384++;
        class195.method1358(false);
        class40.method302((byte) -108);
        class172.method1229((byte) 95);
        class275.method1875(12160);
        class241.method1704(256);
        class69.method499(6);
        class178.method1273(0);
        class276.method1878(1024);
        class219.method1555(-120);
        class170.method1221(64);
        if (arg0 < 57) {
            method1700(22, -21);
        }
        class235.method1679(99999999);
        class13.method78(0);
        class194.method1350((byte) -42);
        class99.method708(-1);
        class174.method1254((byte) 124);
        class282.method1919(true);
        class288.method1963(1);
        class101.field1815.method1382(31346);
        class143.field2474.method1382(31346);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBLv;)V")
    public final void method1699(int arg0, byte arg1, class149 arg2) {
        while (true) {
            int var4 = arg2.method1045((byte) 77);
            if (var4 == 0) {
                field4383++;
                if (arg1 != 9) {
                    this.field4387 = -110;
                    return;
                }
                return;
            }
            this.method1702((byte) 105, arg0, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I")
    public static final int method1700(int arg0, int arg1) {
        field4378++;
        if (arg1 != -1) {
            return 29;
        }
        if (class98.field1738 != null) {
            class98.field1738.method888(true);
            class98.field1738 = null;
        }
        class283.field4967++;
        if (class283.field4967 > 4) {
            client.field2678 = 0;
            class283.field4967 = 0;
            return arg0;
        }
        if (class279.field4890 == class227.field4160) {
            class279.field4890 = class1.field11;
        } else {
            class279.field4890 = class227.field4160;
        }
        client.field2678 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)I")
    private static final int method1701(byte arg0, int arg1) {
        field4379++;
        if (arg0 <= 111) {
            method1697((class99) null, -123, (byte) -60, -79);
        }
        return arg1 == 16711935 ? -1 : class99.method729(true, arg1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BIILv;)V")
    private final void method1702(byte arg0, int arg1, int arg2, class149 arg3) {
        if (arg2 == 1) {
            this.field4385 = method1701((byte) 126, arg3.method1065((byte) 52));
        } else if (arg2 == 2) {
            this.field4387 = arg3.method1045((byte) -80);
        } else if (arg2 == 3) {
            this.field4387 = arg3.method1050(1272006568);
            if (this.field4387 == 65535) {
                this.field4387 = -1;
            }
        } else if (arg2 == 5) {
            this.field4381 = false;
        } else if (arg2 == 7) {
            this.field4388 = method1701((byte) 123, arg3.method1065((byte) 125));
        } else if (arg2 == 8) {
            class131.field2270 = arg1;
        } else if (arg2 == 9) {
            arg3.method1050(1272006568);
        } else if (arg2 != 10) {
            if (arg2 == 11) {
                arg3.method1045((byte) -30);
            } else if (arg2 != 12) {
                if (arg2 == 13) {
                    arg3.method1065((byte) 26);
                } else if (arg2 == 14) {
                    arg3.method1045((byte) -50);
                }
            }
        }
        field4382++;
        if (arg0 <= 94) {
            method1696(-80);
        }
    }
}
