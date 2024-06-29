import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class126 extends class186 {

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    private int field2022;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    private int field2018;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field2025 = 0;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field2027 = 0;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "[Lib;")
    public static class56[] field2026;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    public static void method856(byte arg0) {
        if (arg0 != 53) {
            field2025 = -63;
        }
        field2026 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method857(int arg0) {
        if (arg0 != -624818004) {
            method857(-100);
        }
        ++field2024;
        if (class187.field2974 != null) {
            class139 var1 = class187.field2974;
            synchronized (class187.field2974) {
                class187.field2974 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BII)V")
    public final void method291(byte arg0, int arg1, int arg2) {
        int var4 = this.field2018 * arg2 >> 12;
        ++field2023;
        int var5 = this.field2022 * arg2 >> 12;
        if (arg0 > -45) {
            this.field2022 = 11;
        }
        int var6 = this.field2031 * arg1 >> 12;
        int var7 = this.field2029 * arg1 >> 12;
        class271.method1821(super.field2966, var7, var4, -1, var6, var5);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)V")
    public final void method293(int arg0, int arg1, byte arg2) {
        ++field2021;
        int var4 = this.field2018 * arg0 >> 12;
        int var5 = this.field2022 * arg0 >> 12;
        int var6 = this.field2031 * arg1 >> 12;
        int var7 = this.field2029 * arg1 >> 12;
        int var8 = -22 % ((arg2 - 90) / 34);
        class200.method1399(var6, 12874, super.field2970, var4, super.field2966, var5, super.field2971, var7);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIIII)V")
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2022 = arg2;
        this.field2031 = arg1;
        this.field2018 = arg0;
        this.field2029 = arg3;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
    public static final void method858(byte arg0) {
        ++field2028;
        class47.field590.method1699(0);
        if (arg0 >= -117) {
            field2027 = -82;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)V")
    public final void method292(int arg0, int arg1, int arg2) {
        ++field2030;
        int var4 = this.field2018 * arg2 >> 12;
        int var5 = this.field2022 * arg2 >> 12;
        if (arg0 != -6) {
            field2032 = 19;
        }
        int var6 = this.field2029 * arg1 >> 12;
        int var7 = this.field2031 * arg1 >> 12;
        class194.method1372(var6, 117, var4, super.field2970, var5, super.field2971, var7);
    }
}
