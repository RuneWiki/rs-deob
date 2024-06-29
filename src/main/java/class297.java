import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class297 {

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Loh;")
    public class165 field4771 = new class165();

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lbc;")
    public static class148 field4772;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lve;")
    public static class203 field4762;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lmh;")
    public static class263 field4764;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Llc;")
    public static class270 field4773;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[I")
    public static int[] field4765;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "[I")
    public static int[] field4770;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[[[I")
    public static int[][][] field4763;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)Z")
    public static final boolean method2018(byte arg0, int arg1, int arg2) {
        field4769++;
        if (!class191.field2823) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class134.field2195[var3] == null || class134.field2195[var3][var4] == null) {
            return false;
        } else if (arg0 == 117) {
            class263 var5 = class134.field2195[var3][var4];
            if (arg1 == -1 && var5.field4129 == 0) {
                for (int var6 = 0; var6 < class147.field2360; var6++) {
                    if (class204.field3009[var6] == 30 || class204.field3009[var6] == 1004 || class204.field3009[var6] == 48 || class204.field3009[var6] == 51 || class204.field3009[var6] == 5) {
                        for (class263 var7 = class144.method1078(class131.field2173[var6], 8534); var7 != null; var7 = class195.method1377(var7, false)) {
                            if (var5.field4083 == var7.field4083) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (int var8 = 0; var8 < class147.field2360; var8++) {
                    if (class141.field2277[var8] == arg1 && class131.field2173[var8] == var5.field4083 && (class204.field3009[var8] == 30 || class204.field3009[var8] == 1004 || class204.field3009[var8] == 48 || class204.field3009[var8] == 51 || class204.field3009[var8] == 5)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method2019(byte arg0) {
        field4761++;
        if (arg0 < 89) {
            field4773 = null;
        }
        int var1 = class160.method1163(0);
        if (var1 == 0) {
            class228.field3361 = null;
            class134.method1014((byte) 43, 0);
        } else if (var1 == 1) {
            class241.method1646((byte) 0, true);
            class134.method1014((byte) 43, 512);
            if (class253.field3806 != null) {
                class222.method1542(-49);
            }
        } else {
            class241.method1646((byte) (class62.field949 - 4 & 0xFF), true);
            class134.method1014((byte) 43, 2);
        }
        class47.field647 = class37.field474;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Loh;B)V")
    public final void method2020(class165 arg0, byte arg1) {
        field4767++;
        if (arg1 <= 103) {
            method2022(true);
        }
        if (arg0.field2535 != null) {
            arg0.method1185(-11201);
        }
        arg0.field2535 = this.field4771.field2535;
        arg0.field2533 = this.field4771;
        arg0.field2535.field2533 = arg0;
        arg0.field2533.field2535 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public final void method2021(byte arg0) {
        while (true) {
            class165 var2 = this.field4771.field2533;
            if (this.field4771 == var2) {
                if (arg0 > -5) {
                    method2019((byte) -75);
                }
                field4768++;
                return;
            }
            var2.method1185(-11201);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static final void method2022(boolean arg0) {
        field4766++;
        if (!arg0) {
            field4763 = null;
        }
        class253.field3821.method1422((byte) -87);
        class186.field2771.method1422((byte) -95);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method2023(int arg0) {
        field4763 = null;
        field4765 = null;
        field4764 = null;
        field4772 = null;
        field4770 = null;
        field4773 = null;
        if (arg0 != 255) {
            field4772 = null;
        }
        field4762 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class297() {
        this.field4771.field2533 = this.field4771;
        this.field4771.field2535 = this.field4771;
    }
}
