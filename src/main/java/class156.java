import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class156 {

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public int field2241 = 0;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public int field2239 = 64;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public int field2242 = 127;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "Z")
    public boolean field2249 = false;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "Z")
    public boolean field2245 = true;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    public int field2244 = -1;

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "I")
    public int field2250 = 512;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
    public int field2248 = -1;

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
    public int field2252 = 1190717;

    @OriginalMember(owner = "client!tca", name = "p", descriptor = "Z")
    public boolean field2253 = true;

    @OriginalMember(owner = "client!tca", name = "q", descriptor = "I")
    public int field2254 = 8;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
    public int field2247;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "Lka;")
    public class435 field2246;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lmo;BI)V", line = 7)
    private final void method1085(class695 arg0, byte arg1, int arg2) {
        if (arg1 > -106) {
            this.field2249 = true;
        }
        if (arg2 == 1) {
            this.field2241 = class268.method1748(arg0.method3873(255), (byte) -52);
        } else if (arg2 == 2) {
            this.field2244 = arg0.method3826(false);
        } else if (arg2 == 3) {
            this.field2244 = arg0.method3847((byte) 118);
            if (this.field2244 == 65535) {
                this.field2244 = -1;
            }
        } else if (arg2 == 5) {
            this.field2253 = false;
        } else if (arg2 == 7) {
            this.field2248 = class268.method1748(arg0.method3873(255), (byte) -72);
        } else if (arg2 == 8) {
            this.field2246.field6356 = this.field2247;
        } else if (arg2 == 9) {
            this.field2250 = arg0.method3847((byte) 118) << 2;
        } else if (arg2 == 10) {
            this.field2245 = false;
        } else if (arg2 == 11) {
            this.field2254 = arg0.method3826(false);
        } else if (arg2 == 12) {
            this.field2249 = true;
        } else if (arg2 == 13) {
            this.field2252 = arg0.method3873(255);
        } else if (arg2 == 14) {
            this.field2239 = arg0.method3826(false) << 2;
        } else if (arg2 == 16) {
            this.field2242 = arg0.method3826(false);
        }
        field2243++;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V", line = 82)
    public final void method1086(int arg0) {
        this.field2254 = this.field2247 | this.field2254 << 8;
        field2238++;
        if (arg0 != 512) {
            this.field2239 = 45;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lmo;I)V", line = 102)
    public final void method1087(class695 arg0, int arg1) {
        if (arg1 != 10) {
            this.method1086(-124);
        }
        while (true) {
            int var3 = arg0.method3826(false);
            if (var3 == 0) {
                field2240++;
                return;
            }
            this.method1085(arg0, (byte) -128, var3);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)Z", line = 131)
    public static final boolean method1088(int arg0, int arg1, int arg2) {
        field2251++;
        if (arg1 == -17) {
            return (arg0 & 0x84080) != 0;
        } else {
            return false;
        }
    }
}
