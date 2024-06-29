import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class304 extends class45 {

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "Z")
    public static boolean field4466 = true;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field4467 = 0;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lcr;")
    public static class189 field4463 = new class189(64);

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Lwl;")
    public static class273 field4461;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Lwd;")
    public static class36 field4460;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Ltj;")
    public static class429 field4462;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "[Lcq;")
    public static class67[] field4459;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)I")
    public final int method2066(byte arg0) {
        if (arg0 >= -118) {
            field4459 = null;
        }
        field4469++;
        return class228.method1335((byte) 58, this.field4475);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)V")
    public static final void method2067(int arg0, boolean arg1) {
        field4476++;
        if (arg0 > -18) {
            method2068(72, 80, 36, -124);
        }
        if (class173.field2305 != arg1) {
            class173.field2305 = arg1;
            class147.method934(-124);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)I")
    public static final int method2068(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -91) {
            method2068(-2, -76, 19, 17);
        }
        field4471++;
        if (arg1 < arg0) {
            return arg0;
        } else if (arg3 >= arg1) {
            return arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Z")
    public final boolean method2069(int arg0) {
        if (arg0 != 1) {
            field4459 = null;
        }
        field4470++;
        return (this.field4475 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Z")
    public final boolean method2070(int arg0) {
        field4458++;
        if (arg0 < 19) {
            this.method2077(-71);
        }
        return (this.field4475 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
    public static void method2071(boolean arg0) {
        field4463 = null;
        field4460 = null;
        field4461 = null;
        if (!arg0) {
            field4462 = null;
            field4459 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)Z")
    public final boolean method2072(int arg0) {
        if (arg0 != 5785441) {
            this.field4475 = -53;
        }
        field4465++;
        return ((this.field4475 & 0x584761) >> 22) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z")
    public final boolean method2073(int arg0, int arg1) {
        field4464++;
        if (arg0 >= -1) {
            field4461 = null;
        }
        return (this.field4475 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)Z")
    public final boolean method2074(int arg0) {
        field4457++;
        if (arg0 <= 30) {
            field4463 = null;
        }
        return (this.field4475 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)Z")
    public final boolean method2075(int arg0) {
        field4477++;
        if (arg0 >= -19) {
            return false;
        } else {
            return (this.field4475 >> 31 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V")
    public static final void method2076(int arg0) {
        field4472++;
        class69.field894.method1756(((float) class416.field6106 * 0.1F + 0.7F) * class166.field2233);
        if (arg0 > 50) {
            class69.field894.method1752(class262.field3806, class227.field2977, class379.field5527, (float) class41.field570, (float) class4.field45, (float) class174.field2323);
            class69.field894.method1671(class243.field3241);
        }
    }

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "(I)I")
    public final int method2077(int arg0) {
        int var2 = -22 % ((-arg0 - 29) / 41);
        field4468++;
        return (this.field4475 & 0x1C82FE) >> 18;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II)V")
    public class304(int arg0, int arg1) {
        this.field4475 = arg0;
        this.field4474 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "(I)Z")
    public final boolean method2078(int arg0) {
        if (arg0 >= -68) {
            this.method2066((byte) -36);
        }
        field4473++;
        return (this.field4475 & 0x792D350B) >> 30 != 0;
    }
}
