import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public abstract class class49 extends class332 {

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[I")
    public static int[] field598 = new int[32];

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Z")
    public boolean field602;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "[I")
    public static int[] field600;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([Ljava/lang/String;II[SI)V", line = 6)
    public static final void method287(String[] arg0, int arg1, int arg2, short[] arg3, int arg4) {
        field611++;
        if (arg2 > -126 || arg1 >= arg4) {
            return;
        }
        int var5 = (arg1 + arg4) / 2;
        int var6 = arg1;
        String var7 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg4];
        arg3[arg4] = var8;
        for (int var9 = arg1; var9 < arg4; var9++) {
            if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg0[arg4] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg4] = arg3[var6];
        arg3[var6] = var8;
        method287(arg0, arg1, -128, arg3, var6 - 1);
        method287(arg0, var6 + 1, -128, arg3, arg4);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I", line = 65)
    public final int method288(byte arg0) {
        field608++;
        return arg0 <= 90 ? -13 : 1;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "()I", line = 77)
    public int method289() {
        field603++;
        return 0;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V", line = 86)
    public static void method291(int arg0) {
        field600 = null;
        if (arg0 != 13013) {
            method287((String[]) null, -104, 33, (short[]) null, -29);
        }
        field598 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)I", line = 109)
    public static final int method295(int arg0, int arg1, int arg2) {
        int var3 = 0;
        if (arg1 != -1) {
            return -55;
        }
        field599++;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)Z", line = 133)
    public final boolean method296(boolean arg0) {
        if (!arg0) {
            field600 = (int[]) null;
        }
        field607++;
        return this.field602;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)Z", line = 144)
    public final boolean method297(int arg0) {
        field601++;
        if (arg0 >= -79) {
            this.method292(-14, 111);
        }
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B[B)Z", line = 157)
    public static final boolean method298(byte arg0, byte[] arg1) {
        field606++;
        if (arg0 < 90) {
            field610 = -44;
        }
        class107 var2 = new class107(arg1);
        int var3 = var2.method661(-1);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method661(-1) == 1;
        if (var4) {
            class81.method483(var2, -27289);
        }
        class184.method1279(65535, var2);
        return true;
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)Z", line = 181)
    public final boolean method299(int arg0) {
        if (arg0 == 1) {
            field605++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()V")
    public abstract void method286();

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
    public abstract void method290(int arg0);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
    public abstract void method292(int arg0, int arg1);

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "()Z")
    public abstract boolean method293();

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V")
    public abstract void method294(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "()Z")
    public abstract boolean method300();
}
