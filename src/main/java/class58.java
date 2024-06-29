import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class58 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "B")
    private byte field1009;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1010 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1025 = null;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Luj;")
    public static class132 field1008;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Luj;")
    public static class132 field1013;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Laj;")
    public static class151 field1006;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Laj;")
    public static class151 field1011;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Laj;")
    public static class151 field1021;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Lbi;")
    public static class27 field1017;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method369(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class143.field2351[var1] = true;
        }
        field1019++;
        if (arg0 > -71) {
            field1013 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public static final void method370(boolean arg0) {
        class110.field1823.method94(34);
        field1015++;
        class31.field518.method94(34);
        if (arg0) {
            class228.field3853.method94(34);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method371(int arg0) {
        field1006 = null;
        field1010 = null;
        field1017 = null;
        field1025 = null;
        field1011 = null;
        field1008 = null;
        field1021 = null;
        field1013 = null;
        if (arg0 != -1) {
            field1008 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)I")
    public final int method372(boolean arg0) {
        if (arg0) {
            field1026++;
            return this.field1009 & 0x7;
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)I")
    public final int method373(int arg0) {
        field1018++;
        if (arg0 != 0) {
            method374(-84, -100, (class151) null, -58);
        }
        return (this.field1009 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILaj;I)[Lmd;")
    public static final class273[] method374(int arg0, int arg1, class151 arg2, int arg3) {
        field1014++;
        if (class167.method1242(arg2, arg1, arg3, 64)) {
            return arg0 == 0 ? class73.method514(-98) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public static final void method375(int arg0) {
        field1007++;
        if (class116.field1981 == 0) {
            return;
        }
        if (arg0 != 1) {
            method375(-105);
        }
        try {
            if (++class145.field2389 > 1500) {
                if (class159.field2609 != null) {
                    class159.field2609.method1070(-114);
                    class159.field2609 = null;
                }
                if (class210.field3549 >= 1) {
                    class116.field1981 = 0;
                    class295.field4839 = -5;
                    return;
                }
                class116.field1981 = 1;
                class145.field2389 = 0;
                if (class205.field3286 == class142.field2346) {
                    class205.field3286 = class132.field2179;
                } else {
                    class205.field3286 = class142.field2346;
                }
                class210.field3549++;
            }
            if (class116.field1981 == 1) {
                class244.field4100 = class142.field2344.method572(class205.field3286, (byte) -111, class57.field998);
                class116.field1981 = 2;
            }
            if (class116.field1981 == 2) {
                if (class244.field4100.field3091 == 2) {
                    throw new IOException();
                }
                if (class244.field4100.field3091 != 1) {
                    return;
                }
                class159.field2609 = new class144((Socket) class244.field4100.field3089, class142.field2344);
                class244.field4100 = null;
                class159.field2609.method1066(class236.field3980.field4182, -97, class236.field3980.field4160, 0);
                if (class95.field1543 != null) {
                    class95.field1543.method1715(2);
                }
                if (class272.field4546 != null) {
                    class272.field4546.method1715(2);
                }
                int var1 = class159.field2609.method1064(false);
                if (class95.field1543 != null) {
                    class95.field1543.method1715(2);
                }
                if (class272.field4546 != null) {
                    class272.field4546.method1715(2);
                }
                if (var1 != 101) {
                    class295.field4839 = var1;
                    class116.field1981 = 0;
                    class159.field2609.method1070(75);
                    class159.field2609 = null;
                    return;
                }
                class116.field1981 = 3;
            }
            if (class116.field1981 == 3 && class159.field2609.method1065(-54) >= 2) {
                int var2 = class159.field2609.method1064(false) << 8 | class159.field2609.method1064(false);
                class296.method2039((byte) 122, var2);
                if (class251.field4250 == -1) {
                    class295.field4839 = 6;
                    class116.field1981 = 0;
                    class159.field2609.method1070(-118);
                    class159.field2609 = null;
                } else {
                    class116.field1981 = 0;
                    class159.field2609.method1070(92);
                    class159.field2609 = null;
                    class279.method1958(3);
                }
            }
        } catch (IOException var3) {
            if (class159.field2609 != null) {
                class159.field2609.method1070(arg0 + 63);
                class159.field2609 = null;
            }
            if (class210.field3549 >= 1) {
                class116.field1981 = 0;
                class295.field4839 = -4;
            } else {
                class210.field3549++;
                class116.field1981 = 1;
                class145.field2389 = 0;
                if (class205.field3286 == class142.field2346) {
                    class205.field3286 = class132.field2179;
                } else {
                    class205.field3286 = class142.field2346;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class58() {
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lab;)V")
    public class58(class249 arg0) {
        this.field1009 = arg0.method1768(84);
        this.field1016 = arg0.method1821((byte) 51);
        this.field1024 = arg0.method1800(-111);
        this.field1022 = arg0.method1800(85);
        this.field1012 = arg0.method1800(-107);
        this.field1027 = arg0.method1800(90);
    }
}
