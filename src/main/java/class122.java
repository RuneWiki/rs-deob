import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class122 extends class120 {

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    private int field1809 = 1;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    private int field1810 = 1;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    private int field1805 = 204;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "Lok;")
    public static class41 field1811 = class137.method956("Suche nach Updates )2 ", 45);

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "Lok;")
    private static class41 field1806 = class137.method956("Loading title screen )2 ", 45);

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "Lok;")
    public static class41 field1812 = field1806;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "Lef;")
    public static class259 field1807 = new class259(0, 0);

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "Lok;")
    public static class41 field1814 = class137.method956("(Udns", 45);

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "Z")
    public static boolean field1813 = false;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "[I")
    public static int[] field1815;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V", line = 14)
    public static void method867(boolean arg0) {
        field1811 = null;
        if (!arg0) {
            field1811 = (class41) null;
        }
        field1806 = null;
        field1814 = null;
        field1812 = null;
        field1807 = null;
        field1815 = null;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(III)V", line = 29)
    public static final void method868(int arg0, int arg1, int arg2) {
        if (arg1 < 93) {
            return;
        }
        class36.field544 = class129.field1932[arg0][arg2].field4606;
        class68.field1018 = class129.field1932[arg0][arg2].field4621;
        field1804++;
        class308.field5186 = class129.field1932[arg0][arg2].field4612;
        class58.method403((float) class36.field544, (float) class68.field1018, (float) class308.field5186);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIZLqa;ILqa;)I", line = 44)
    public static final int method869(int arg0, boolean arg1, int arg2, boolean arg3, class79 arg4, int arg5, class79 arg6) {
        field1808++;
        int var7 = class260.method1832(arg6, 122, arg1, arg2, arg4);
        if (~var7 != arg5) {
            return arg1 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class260.method1832(arg6, 121, arg3, arg0, arg4);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I", line = 79)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            field1815 = (int[]) null;
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            for (int var4 = 0; var4 < class307.field5160; var4++) {
                int var5 = class203.field3278[var4];
                int var6 = class16.field216[arg0];
                int var7 = this.field1809 * var6 >> 12;
                int var8 = var5 % (4096 / this.field1810) * this.field1810;
                int var9 = this.field1810 * var5 >> 12;
                int var10 = var6 % (4096 / this.field1809) * this.field1809;
                if (this.field1805 > var10) {
                    for (var9 -= var7; var9 < 0; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (var9 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field1805 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var8 < this.field1805) {
                    int var11;
                    for (var11 = var9 - var7; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        field1802++;
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Llb;II)V", line = 161)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field1801++;
        if (arg1 != -1) {
            field1814 = (class41) null;
        }
        if (arg2 == 0) {
            this.field1810 = arg0.method792(arg1 + 3);
        } else if (arg2 == 1) {
            this.field1809 = arg0.method792(arg1 + 3);
        } else if (arg2 == 2) {
            this.field1805 = arg0.method759((byte) -70);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 222)
    public class122() {
        super(0, true);
    }
}
