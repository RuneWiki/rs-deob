import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class10 {

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field180 = 0;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field175 = 16;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public int field176 = -1;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Z")
    public boolean field182 = true;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Z")
    public boolean field174 = true;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public int field181 = 8;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public int field184 = -1;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public int field190 = 1190717;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public int field179 = 128;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Z")
    public boolean field185 = false;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field183 = 127;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field177 = 2301979;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lrm;")
    public static class184 field191 = new class184(64);

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lqf;")
    public static class311 field192 = new class311(16);

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Ljava/lang/String;")
    public static String field193 = "Unable to find ";

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field195 = 1;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lug;")
    public static class253 field178;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[I")
    public static int[] field194;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 10)
    public static final void method126(boolean arg0) {
        field186++;
        class79.field1075.method1355(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lvc;Z)[Lwf;", line = 30)
    public static final class56[] method127(class137 arg0, boolean arg1) {
        field173++;
        if (arg1) {
            field195 = 22;
        }
        if (!arg0.method1015((byte) 114)) {
            return new class56[0];
        }
        class114 var2 = arg0.method1017((byte) -58);
        while (var2.field1595 == 0) {
            class272.method1918((byte) 22, 10L);
        }
        if (var2.field1595 == 2) {
            return new class56[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field1591);
        class56[] var4 = new class56[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class56 var6 = new class56();
            var4[var5] = var6;
            var6.field784 = var3[var5 << 2];
            var6.field780 = var3[(var5 << 2) + 1];
            var6.field772 = var3[(var5 << 2) + 2];
            var6.field781 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILvl;II)V", line = 95)
    private final void method128(int arg0, class6 arg1, int arg2, int arg3) {
        int var5 = 126 / ((arg3 + 69) / 43);
        field189++;
        if (arg2 == 1) {
            this.field180 = class128.method934(15131, arg1.method31(-22888));
        } else if (arg2 == 2) {
            this.field184 = arg1.method58(-288140008);
        } else if (arg2 == 3) {
            this.field184 = arg1.method39((byte) 44);
            if (this.field184 == 65535) {
                this.field184 = -1;
            }
        } else if (arg2 == 5) {
            this.field182 = false;
        } else if (arg2 == 7) {
            this.field176 = class128.method934(15131, arg1.method31(-22888));
        } else if (arg2 == 8) {
            class6.field87 = arg0;
        } else if (arg2 == 9) {
            this.field179 = arg1.method39((byte) 124);
        } else if (arg2 == 10) {
            this.field174 = false;
        } else if (arg2 == 11) {
            this.field181 = arg1.method58(-288140008);
        } else if (arg2 == 12) {
            this.field185 = true;
        } else if (arg2 == 13) {
            this.field190 = arg1.method31(-22888);
        } else if (arg2 == 14) {
            this.field175 = arg1.method58(-288140008);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lvl;ZI)V", line = 162)
    public final void method129(class6 arg0, boolean arg1, int arg2) {
        while (true) {
            int var4 = arg0.method58(-288140008);
            if (var4 == 0) {
                if (arg1) {
                    method127((class137) null, true);
                }
                field188++;
                return;
            }
            this.method128(arg2, arg0, var4, -119);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 179)
    public static void method130(byte arg0) {
        field193 = null;
        field194 = null;
        field178 = null;
        field192 = null;
        if (arg0 != -44) {
            field177 = 61;
        }
        field191 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 198)
    public static final void method131(int arg0, int arg1) {
        field187++;
        if (arg1 == -1 || !class34.field505[arg1]) {
            return;
        }
        class57.field795.method1811(arg1, (byte) 114);
        if (class269.field4182[arg1] == null) {
            return;
        }
        boolean var2 = true;
        if (arg0 <= 63) {
            return;
        }
        for (int var3 = 0; var3 < class269.field4182[arg1].length; var3++) {
            if (class269.field4182[arg1][var3] != null) {
                if (class269.field4182[arg1][var3].field2063 == 2) {
                    var2 = false;
                } else {
                    class269.field4182[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class269.field4182[arg1] = null;
        }
        class34.field505[arg1] = false;
    }
}
