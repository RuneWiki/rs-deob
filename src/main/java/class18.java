import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class18 {

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "[Lq;")
    private class6[] field258;

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "Lh;")
    public static class15 field250 = method153(" map", 1);

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "Lh;")
    public static class15 field257 = method153("Silk Trader", 1);

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "Lh;")
    public static class15 field252 = method153("Quest Start", 1);

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Lh;")
    public static class15 field253 = method153("loc)3dat", 1);

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Lh;")
    public static class15 field255 = method153("Mining Site", 1);

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "Lh;")
    public static class15 field254 = method153("Shield Shop", 1);

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Lh;")
    public static class15 field260 = method153("Fishing Shop", 1);

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "J")
    private long field259;

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "Lq;")
    private class6 field256;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(B)Lq;", line = 7)
    public final class6 method149(byte arg0) {
        if (this.field256 == null) {
            return null;
        } else if (arg0 <= 84) {
            return (class6) null;
        } else {
            class6 var2 = this.field258[(int) (this.field259 & (long) (this.field251 - 1))];
            while (this.field256 != var2) {
                if (this.field256.field94 == this.field259) {
                    class6 var3 = this.field256;
                    this.field256 = this.field256.field97;
                    return var3;
                }
                this.field256 = this.field256.field97;
            }
            this.field256 = null;
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)V", line = 48)
    public static void method150(int arg0) {
        field260 = null;
        field252 = null;
        field250 = null;
        field254 = null;
        field255 = null;
        field253 = null;
        field257 = null;
        if (arg0 < 27) {
            method155((byte) 51, 65, -33, null);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Z)V", line = 64)
    public static final void method151(boolean arg0) {
        if (arg0) {
            method150(-126);
        }
        if (class24.field327[0][class9.field123][mapview.field57] == null) {
            class25.field338 = null;
        } else {
            class25.field338 = class24.field327[0][class9.field123][mapview.field57];
        }
        if (class24.field327[1][class9.field123][mapview.field57] == null) {
            class12.field179 = null;
        } else {
            class12.field179 = class24.field327[1][class9.field123][mapview.field57];
        }
        if (class24.field327[2][class9.field123][mapview.field57] == null) {
            class31.field398 = null;
        } else {
            class31.field398 = class24.field327[2][class9.field123][mapview.field57];
        }
        if (class24.field327[3][class9.field123][mapview.field57] == null) {
            class23.field311 = null;
        } else {
            class23.field311 = class24.field327[3][class9.field123][mapview.field57];
        }
        if (class24.field327[4][class9.field123][mapview.field57] == null) {
            class36.field457 = null;
        } else {
            class36.field457 = class24.field327[4][class9.field123][mapview.field57];
        }
        if (class25.field335[class9.field123][mapview.field57] == null) {
            class32.field420 = null;
        } else {
            class32.field420 = class25.field335[class9.field123][mapview.field57];
        }
        if (class21.field299[class9.field123][mapview.field57] == null) {
            class21.field297 = null;
        } else {
            class21.field297 = class21.field299[class9.field123][mapview.field57];
        }
        if (class35.field440[class9.field123][mapview.field57] == null) {
            class12.field175 = null;
        } else {
            class12.field175 = class35.field440[class9.field123][mapview.field57];
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(II)Lh;", line = 116)
    public static final class15 method152(int arg0, int arg1) {
        class15 var2 = new class15();
        if (arg0 != 8163) {
            field254 = null;
        }
        var2.field219 = new byte[arg1];
        var2.field229 = 0;
        return var2;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Ljava/lang/String;I)Lh;", line = 132)
    public static final class15 method153(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        if (arg1 != 1) {
            return (class15) null;
        }
        int var3 = var2.length;
        class15 var4 = new class15();
        var4.field219 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field219[var4.field229++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var4.field219[var4.field229++] = (byte) var6;
            }
        }
        var4.method139(2);
        return var4.method122((byte) 88);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Lq;IJ)V", line = 190)
    public final void method154(class6 arg0, int arg1, long arg2) {
        if (arg0.field95 != null) {
            arg0.method52(arg1 ^ 0xBF);
        }
        class6 var5 = this.field258[(int) (arg2 & (long) (this.field251 - 1))];
        arg0.field95 = var5.field95;
        arg0.field97 = var5;
        arg0.field94 = arg2;
        arg0.field95.field97 = arg0;
        arg0.field97.field95 = arg0;
        if (arg1 != 63) {
            field257 = null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(BII[Lh;)Lh;", line = 219)
    public static final class15 method155(byte arg0, int arg1, int arg2, class15[] arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class28.field356;
            }
            var4 += arg3[arg2 + var5].field229;
        }
        int var6 = 59 / ((arg0 + 47) / 58);
        int var7 = 0;
        byte[] var8 = new byte[var4];
        for (int var9 = 0; var9 < arg1; var9++) {
            class15 var10 = arg3[arg2 + var9];
            class2.method28(var10.field219, 0, var8, var7, var10.field229);
            var7 += var10.field229;
        }
        class15 var11 = new class15();
        var11.field219 = var8;
        var11.field229 = var4;
        return var11;
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(B)Lla;", line = 271)
    public static final class24 method156(byte arg0) {
        if (arg0 != 9) {
            method150(-62);
        }
        try {
            return (class24) Class.forName("l").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class5();
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "<init>", descriptor = "(I)V", line = 305)
    public class18(int arg0) {
        this.field258 = new class6[arg0];
        this.field251 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class6 var3 = this.field258[var2] = new class6();
            var3.field95 = var3;
            var3.field97 = var3;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(JZ)Lq;", line = 329)
    public final class6 method157(long arg0, boolean arg1) {
        this.field259 = arg0;
        class6 var4 = this.field258[(int) (arg0 & (long) (this.field251 - 1))];
        for (this.field256 = var4.field97; this.field256 != var4; this.field256 = this.field256.field97) {
            if (this.field256.field94 == arg0) {
                class6 var5 = this.field256;
                this.field256 = this.field256.field97;
                return var5;
            }
        }
        this.field256 = null;
        if (arg1) {
            method156((byte) -80);
        }
        return null;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(III)V", line = 359)
    public static final void method158(int arg0, int arg1, int arg2) {
        class9.field123 = arg1 >> 6;
        class9.field119 = arg2 & 0x3F;
        class24.field321 = arg1 & 0x3F;
        class15.field220 = (class24.field321 << 6) + class9.field119;
        mapview.field57 = arg2 >> 6;
        if (arg0 >= -98) {
            field254 = null;
        }
        method151(false);
    }
}
