import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class305 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field5168 = 0;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public int field5174 = -1;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public int field5173 = -1;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field5178 = 8;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Z")
    public boolean field5177 = false;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public int field5176 = 128;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public int field5180 = 16;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Z")
    public boolean field5170 = true;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public int field5182 = 1190717;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Z")
    public boolean field5184 = true;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lhi;")
    public static class82 field5167 = class95.method664((byte) -102, "d-Broulement:");

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Lhi;")
    public static class82 field5172 = class95.method664((byte) -95, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lhi;")
    public static class82 field5175 = class95.method664((byte) -54, "Chargement des sprites )2 ");

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Lhi;")
    public static class82 field5183 = class95.method664((byte) -49, "; Expires=");

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Lhi;")
    public static class82 field5179 = null;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method2107(int arg0, int arg1, int arg2) {
        int var3 = class286.field4816[arg0][arg1][arg2];
        if (-class14.field109 == var3) {
            return false;
        } else if (class14.field109 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class160.method1163(var4 + 1, class245.field4255[arg0][arg1][arg2], var5 + 1) && class160.method1163(var4 + 128 - 1, class245.field4255[arg0][arg1 + 1][arg2], var5 + 1) && class160.method1163(var4 + 128 - 1, class245.field4255[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class160.method1163(var4 + 1, class245.field4255[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class286.field4816[arg0][arg1][arg2] = class14.field109;
                return true;
            } else {
                class286.field4816[arg0][arg1][arg2] = -class14.field109;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZZI)V", line = 47)
    public static final void method2108(int arg0, boolean arg1, boolean arg2, int arg3) {
        field5169++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class219.field3799 = arg2;
        if (!arg1) {
            field5179 = (class82) null;
        }
        class238.field4145 = arg3;
        class307.field5236 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 64)
    public static void method2109(boolean arg0) {
        field5179 = null;
        field5172 = null;
        field5175 = null;
        field5183 = null;
        if (!arg0) {
            field5167 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILbc;)V", line = 79)
    private final void method2110(int arg0, int arg1, int arg2, class153 arg3) {
        if (arg0 <= 37) {
            return;
        }
        field5181++;
        if (arg1 == 1) {
            this.field5168 = class255.method1826(arg3.method1107((byte) 82), -1);
        } else if (arg1 == 2) {
            this.field5173 = arg3.method1082(-66);
        } else if (arg1 == 3) {
            this.field5173 = arg3.method1090(false);
            if (this.field5173 == 65535) {
                this.field5173 = -1;
            }
        } else if (arg1 == 5) {
            this.field5170 = false;
        } else if (arg1 == 7) {
            this.field5174 = class255.method1826(arg3.method1107((byte) 82), -1);
        } else if (arg1 == 8) {
            class63.field981 = arg2;
        } else if (arg1 == 9) {
            this.field5176 = arg3.method1090(false);
        } else if (arg1 == 10) {
            this.field5184 = false;
        } else if (arg1 == 11) {
            this.field5178 = arg3.method1082(-77);
        } else if (arg1 == 12) {
            this.field5177 = true;
        } else if (arg1 == 13) {
            this.field5182 = arg3.method1107((byte) 82);
        } else if (arg1 == 14) {
            this.field5180 = arg3.method1082(-61);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lbc;II)V", line = 151)
    public final void method2111(class153 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1082(-128);
            if (var4 == 0) {
                field5171++;
                if (arg2 <= 49) {
                    this.field5177 = true;
                }
                return;
            }
            this.method2110(113, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)Ltf;", line = 199)
    public static final class123 method2112(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        return var3 == null || var3.field161 == null ? null : var3.field161;
    }
}
