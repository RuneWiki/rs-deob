import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class40 {

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Z")
    public boolean field601 = false;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "[C")
    public static char[] field599 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field604 = -1;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZIZIIB)V")
    public static final void method265(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        if (arg0 < arg4) {
            int var7 = arg0;
            int var8 = (arg0 + arg4) / 2;
            class245 var9 = class17.field178[var8];
            class17.field178[var8] = class17.field178[arg4];
            class17.field178[arg4] = var9;
            for (int var10 = arg0; var10 < arg4; var10++) {
                if (class13.method76(arg1, var9, arg3, arg2, class17.field178[var10], 0, arg5) <= 0) {
                    class245 var11 = class17.field178[var10];
                    class17.field178[var10] = class17.field178[var7];
                    class17.field178[var7++] = var11;
                }
            }
            class17.field178[arg4] = class17.field178[var7];
            class17.field178[var7] = var9;
            method265(arg0, arg1, arg2, arg3, var7 - 1, arg5, (byte) 120);
            method265(var7 + 1, arg1, arg2, arg3, arg4, arg5, (byte) 120);
        }
        field597++;
        if (arg6 != 120) {
            method267(false);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BIZ)Lge;")
    public final class72 method266(byte arg0, int arg1, boolean arg2) {
        if (arg0 != 1) {
            return null;
        }
        field602++;
        class72 var4 = (class72) class62.field858.method540((byte) -128, (long) (arg1 << 16 | this.field603 | (arg2 ? 262144 : 0)));
        if (var4 != null) {
            return var4;
        }
        class89.field1251.method1570((byte) -39, this.field603);
        class72 var5 = class119.method792(0, arg0 - 1, class89.field1251, this.field603);
        if (var5 != null) {
            var5.method449(class249.field3804, class6.field55, class105.field1459);
            var5.field2607 = var5.field2609;
            var5.field2604 = var5.field2611;
            if (arg2) {
                var5.method457();
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                var5.method448();
            }
            class62.field858.method543(var5, (long) ((arg2 ? 262144 : 0) | this.field603 | arg1 << 16), 858993459);
        }
        return var5;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
    public static void method267(boolean arg0) {
        field599 = null;
        if (arg0) {
            field593 = -7;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lql;IB)V")
    public final void method268(class224 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method1453((byte) -128);
            if (var4 == 0) {
                field596++;
                if (arg2 != 120) {
                    field595 = 126;
                    return;
                }
                return;
            }
            this.method269(var4, arg1, 7697, arg0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIILql;)V")
    private final void method269(int arg0, int arg1, int arg2, class224 arg3) {
        if (arg0 == 1) {
            this.field603 = arg3.method1445(false);
        } else if (arg0 == 2) {
            this.field598 = arg3.method1454(arg2 - 7750);
        } else if (arg0 == 3) {
            this.field601 = true;
        } else if (arg0 == 4) {
            this.field603 = -1;
        }
        if (arg2 == 7697) {
            field600++;
        }
    }
}
