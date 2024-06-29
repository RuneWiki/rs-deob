import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class48 extends class172 {

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "Ljava/lang/String;")
    private String field772 = "null";

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "I")
    public static int field774 = 50;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "[I")
    public static int[] field770 = new int[field774];

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "[I")
    public static int[] field760 = new int[field774];

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "[I")
    public static int[] field761 = new int[field774];

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "[I")
    public static int[] field776 = new int[field774];

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "[I")
    public static int[] field777 = new int[field774];

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "[Ljava/lang/String;")
    public static String[] field773 = new String[field774];

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "[I")
    public static int[] field768 = new int[field774];

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "[I")
    public static int[] field767 = new int[field774];

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "C")
    public char field753;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "C")
    public char field775;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "Lvl;")
    public class164 field752;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "Lvl;")
    private class164 field754;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "[Lml;")
    public static class17[] field771;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V", line = 6)
    private final void method372(int arg0) {
        field756++;
        this.field754 = new class164(this.field752.method1278(false));
        for (class109 var2 = (class109) this.field752.method1265(116); var2 != null; var2 = (class109) this.field752.method1277((byte) -126)) {
            class2 var3 = new class2(var2.field1803, (int) var2.field698);
            this.field754.method1273(1, class222.method1678(0, var2.field1803), var3);
        }
        int var4 = -3 % ((arg0 + 50) / 49);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Laj;)V", line = 29)
    public static final void method373(class209 arg0) {
        for (int var1 = arg0.field3283; var1 <= arg0.field3289; var1++) {
            for (int var2 = arg0.field3291; var2 <= arg0.field3280; var2++) {
                class36 var3 = class129.field2184[arg0.field3293][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field531; var4++) {
                        if (var3.field544[var4] == arg0) {
                            var3.field531--;
                            for (int var5 = var4; var5 < var3.field531; var5++) {
                                var3.field544[var5] = var3.field544[var5 + 1];
                                var3.field523[var5] = var3.field523[var5 + 1];
                            }
                            var3.field544[var3.field531] = null;
                            break;
                        }
                    }
                    var3.field552 = 0;
                    for (int var6 = 0; var6 < var3.field531; var6++) {
                        var3.field552 |= var3.field523[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 89)
    public final String method374(byte arg0, int arg1) {
        field769++;
        if (this.field752 == null) {
            return this.field772;
        } else if (arg0 == -115) {
            class109 var3 = (class109) this.field752.method1268(-118, (long) arg1);
            return var3 == null ? this.field772 : var3.field1803;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V", line = 111)
    public static void method375(int arg0) {
        field770 = null;
        field767 = null;
        field777 = null;
        field773 = null;
        field761 = null;
        field771 = null;
        field760 = null;
        field768 = null;
        if (arg0 >= -25) {
            method382((byte) 76);
        }
        field776 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLqm;I)V", line = 131)
    private final void method376(boolean arg0, class227 arg1, int arg2) {
        if (arg2 == 1) {
            this.field775 = class240.method1832(arg1.method1733(0), 15218);
        } else if (arg2 == 2) {
            this.field753 = class240.method1832(arg1.method1733(0), 15218);
        } else if (arg2 == 3) {
            this.field772 = arg1.method1758((byte) -66);
        } else if (arg2 == 4) {
            this.field765 = arg1.method1715((byte) -115);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1765(true);
            this.field752 = new class164(class206.method1575(var4, (byte) 99));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1715((byte) 29);
                class45 var7;
                if (arg2 == 5) {
                    var7 = new class109(arg1.method1758((byte) -111));
                } else {
                    var7 = new class301(arg1.method1715((byte) -80));
                }
                this.field752.method1273(1, (long) var6, var7);
            }
        }
        field763++;
        if (!arg0) {
            field773 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Z", line = 185)
    public final boolean method377(int arg0, byte arg1) {
        field759++;
        if (this.field752 == null) {
            return false;
        }
        if (this.field754 == null) {
            this.method381((byte) 31);
        }
        class301 var3 = (class301) this.field754.method1268(-93, (long) arg0);
        if (arg1 != -108) {
            field771 = (class17[]) null;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 208)
    public static final void method378(int arg0, int arg1) {
        field755++;
        class321 var2 = class46.method370(1, (byte) -106, arg0);
        if (arg1 < 29) {
            method382((byte) -126);
        }
        var2.method2261(-129);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILqm;)V", line = 228)
    public final void method379(int arg0, class227 arg1) {
        while (true) {
            int var3 = arg1.method1720((byte) -96);
            if (var3 == 0) {
                field757++;
                if (arg0 != 0) {
                    method382((byte) 44);
                }
                return;
            }
            this.method376(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 251)
    public final boolean method380(byte arg0, String arg1) {
        field764++;
        if (arg0 != -96) {
            field774 = 98;
        }
        if (this.field752 == null) {
            return false;
        }
        if (this.field754 == null) {
            this.method372(-105);
        }
        for (class2 var3 = (class2) this.field754.method1268(-57, class222.method1678(0, arg1)); var3 != null; var3 = (class2) this.field754.method1281(arg0 + 209)) {
            if (var3.field8.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V", line = 279)
    private final void method381(byte arg0) {
        field766++;
        this.field754 = new class164(this.field752.method1278(false));
        for (class301 var2 = (class301) this.field752.method1265(39); var2 != null; var2 = (class301) this.field752.method1277((byte) -118)) {
            class301 var3 = new class301((int) var2.field698);
            this.field754.method1273(arg0 - 30, (long) var2.field4846, var3);
        }
        if (arg0 != 31) {
            this.field772 = (String) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)I", line = 306)
    public static final int method382(byte arg0) {
        field762++;
        if (arg0 != 47) {
            method378(53, -49);
        }
        return 14;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)I", line = 325)
    public final int method383(int arg0, byte arg1) {
        field758++;
        if (this.field752 == null) {
            return this.field765;
        }
        if (arg1 != 110) {
            method378(42, 123);
        }
        class301 var3 = (class301) this.field752.method1268(-55, (long) arg0);
        return var3 == null ? this.field765 : var3.field4846;
    }
}
