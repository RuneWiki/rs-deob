import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class161 extends class64 {

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field2979 = 0;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Lid;")
    public static class149 field2989 = class60.method382("Chargement des interfaces )2 ", (byte) 31);

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lid;")
    private static class149 field2983 = class60.method382("wave:", (byte) 120);

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lid;")
    public static class149 field2981 = field2983;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "Lid;")
    public static class149 field2994 = field2983;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public static final void method1176(boolean arg0) {
        field2997++;
        if (!arg0) {
            method1186(-127, (byte) -25);
        }
        for (class18 var1 = (class18) class193.field3456.method1140(0); var1 != null; var1 = (class18) class193.field3456.method1127(0)) {
            if (var1.field258 == -1) {
                var1.field272 = 0;
                class109.method771(var1, 0);
            } else {
                var1.method401((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method1177(int arg0) {
        field2981 = null;
        field2983 = null;
        field2994 = null;
        if (arg0 == 4) {
            field2989 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)I")
    public final int method1178(int arg0) {
        field2980++;
        if (arg0 != -1) {
            field2996 = -29;
        }
        return class115.method803(this.field2992, (byte) -32);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Z")
    public final boolean method1179(int arg0) {
        field2984++;
        if (arg0 != 3867171) {
            this.method1184(-72);
        }
        return (this.field2992 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)Z")
    public final boolean method1180(int arg0) {
        if (arg0 != -23) {
            field2994 = null;
        }
        field2991++;
        return ((this.field2992 & 0x1D9A9815) >> 28) != 0;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)I")
    public final int method1181(int arg0) {
        if (arg0 != -30954) {
            this.method1188(98);
        }
        field2990++;
        return this.field2992 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Z")
    public final boolean method1182(byte arg0, int arg1) {
        if (arg0 > -67) {
            this.method1184(51);
        }
        field2993++;
        return (this.field2992 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)Z")
    public final boolean method1183(int arg0) {
        if (arg0 != 3867171) {
            this.method1188(106);
        }
        field2987++;
        return (this.field2992 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)Z")
    public final boolean method1184(int arg0) {
        if (arg0 == 12928) {
            field2988++;
            return (this.field2992 >> 22 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)Z")
    public final boolean method1185(byte arg0) {
        field2978++;
        int var2 = -111 % ((arg0 - 24) / 44);
        return (this.field2992 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)I")
    public static final int method1186(int arg0, byte arg1) {
        if (arg1 <= 32) {
            field2979 = -126;
        }
        field2986++;
        if (class164.field3047 != null) {
            class164.field3047.method1398((byte) -112);
            class164.field3047 = null;
        }
        class267.field4753++;
        if (class267.field4753 > 4) {
            class22.field313 = 0;
            class267.field4753 = 0;
            return arg0;
        }
        class22.field313 = 0;
        if (class47.field774 == class111.field1922) {
            class47.field774 = class7.field81;
        } else {
            class47.field774 = class111.field1922;
        }
        return -1;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(II)V")
    public class161(int arg0, int arg1) {
        this.field2985 = arg1;
        this.field2992 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)Z")
    public final boolean method1187(byte arg0) {
        field2998++;
        int var2 = -106 / ((-arg0 - 25) / 47);
        return (this.field2992 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)Z")
    public final boolean method1188(int arg0) {
        field2982++;
        if (arg0 == 0) {
            return (this.field2992 & 0x3B0223) >> 21 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILal;)V")
    public static final void method1189(int arg0, class230 arg1) {
        class124.field2190 = arg1;
        field2995++;
        if (arg0 <= 88) {
            field2989 = null;
        }
    }
}
