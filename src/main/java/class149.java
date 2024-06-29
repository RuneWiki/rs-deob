import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class149 {

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "F")
    public float field2305 = 1.0F;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "F")
    public float field2307 = 0.25F;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "F")
    public float field2312 = 1.0F;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "F")
    public float field2301;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "F")
    public float field2317;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "F")
    public float field2309;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lha;")
    public class328 field2302;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "J")
    public static long field2316 = 0L;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2311 = 3;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[Z")
    public static boolean[] field2300;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lak;Lak;I)V", line = 6)
    public static final void method1089(class172 arg0, class172 arg1, int arg2) {
        class129.field2023 = arg1;
        if (arg2 == 0) {
            class175.field2901 = arg0;
            field2314++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljj;I)V", line = 23)
    public final void method1090(class44 arg0, int arg1) {
        field2315++;
        this.field2305 = (float) (arg0.method286((byte) -81) * 8) / 255.0F;
        this.field2307 = (float) (arg0.method286((byte) -108) * 8) / 255.0F;
        if (arg1 != -9537) {
            this.field2307 = 1.076436F;
        }
        this.field2312 = (float) (arg0.method286((byte) -105) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 77)
    public class149() {
        this.field2306 = -50;
        this.field2301 = 0.69921875F;
        this.field2299 = -50;
        this.field2308 = 0;
        this.field2310 = -60;
        this.field2317 = 1.2F;
        this.field2309 = 1.1523438F;
        this.field2313 = class87.field1203;
        this.field2304 = class87.field1201;
        if (class127.field1981 != null) {
            this.field2302 = class328.method2295(class127.field1981[0], class127.field1981[1], class127.field1981[2], class127.field1981[3], class127.field1981[4], class127.field1981[5]);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljj;)V", line = 98)
    public class149(class44 arg0) {
        int var2 = arg0.method286((byte) -103);
        if ((var2 & 0x1) == 0) {
            this.field2304 = class87.field1201;
        } else {
            this.field2304 = arg0.method238((byte) 82);
        }
        if ((var2 & 0x2) == 0) {
            this.field2309 = 1.1523438F;
        } else {
            this.field2309 = (float) arg0.method271(21081) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2301 = 0.69921875F;
        } else {
            this.field2301 = (float) arg0.method271(21081) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2317 = 1.2F;
        } else {
            this.field2317 = (float) arg0.method271(21081) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2306 = -50;
            this.field2299 = -50;
            this.field2310 = -60;
        } else {
            this.field2306 = arg0.method228(true);
            this.field2310 = arg0.method228(true);
            this.field2299 = arg0.method228(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field2313 = class87.field1203;
        } else {
            this.field2313 = arg0.method238((byte) 82);
        }
        if ((var2 & 0x40) == 0) {
            this.field2308 = 0;
        } else {
            this.field2308 = arg0.method271(21081);
        }
        if ((var2 & 0x80) != 0) {
            this.field2302 = class328.method2295(arg0.method271(21081), arg0.method271(21081), arg0.method271(21081), arg0.method271(21081), arg0.method271(21081), arg0.method271(21081));
        } else if (class127.field1981 != null) {
            this.field2302 = class328.method2295(class127.field1981[0], class127.field1981[1], class127.field1981[2], class127.field1981[3], class127.field1981[4], class127.field1981[5]);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 53)
    public static void method1091(int arg0) {
        if (arg0 != -12451) {
            method1091(-61);
        }
        field2300 = null;
    }
}
