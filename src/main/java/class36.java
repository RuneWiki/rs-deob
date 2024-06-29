import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class36 implements class381 {

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lgk;")
    private class181 field511;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[Lkd;")
    private class100[] field506;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lfha;")
    public static class522 field508 = new class522();

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "[I")
    public static int[] field514 = new int[1];

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
    public static int[] field515 = new int[1000];

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lha;")
    private class545 field516;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Z")
    private boolean field517;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIZII)Z", line = 7)
    public static final boolean method250(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            return false;
        }
        field509++;
        for (int var6 = arg5; var6 <= arg2; var6++) {
            for (int var7 = arg4; var7 <= arg1; var7++) {
                if (class491.field6605[var6][var7] == arg0 && class284.field3767[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Ljava/lang/String;I[SII)V", line = 39)
    public static final void method251(String[] arg0, int arg1, short[] arg2, int arg3, int arg4) {
        if (arg4 != -12862) {
            method251(null, -123, null, 104, -67);
        }
        field510++;
        if (arg3 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        String var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        short var8 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var8;
        for (int var9 = arg1; var9 < arg3; var9++) {
            if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg2[arg3] = arg2[var6];
        arg2[var6] = var8;
        method251(arg0, arg1, arg2, var6 - 1, -12862);
        method251(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)I", line = 93)
    public final int method252(byte arg0) {
        if (arg0 != 40) {
            this.method258(-33L, 121);
        }
        field512++;
        int var2 = 0;
        class100[] var3 = this.field506;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class100 var5 = var3[var4];
            if (var5 == null || var5.method680(29892)) {
                var2++;
            }
        }
        return var2 * 100 / this.field506.length;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I", line = 119)
    public final int method253(int arg0) {
        if (arg0 != -4505) {
            this.method253(-36);
        }
        field504++;
        return this.field511.field2626;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V", line = 133)
    public final void method254(byte arg0) {
        field503++;
        if (arg0 >= -1) {
            this.field516 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V", line = 144)
    public final void method255(boolean arg0, int arg1) {
        boolean var3 = true;
        field513++;
        class100[] var4 = this.field506;
        int var5 = 0;
        if (arg1 != -21878) {
            return;
        }
        while (var4.length > var5) {
            class100 var6 = var4[var5];
            if (var6 != null) {
                var6.method681(true, var3 || this.field517);
            }
            var5++;
        }
        this.field517 = false;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V", line = 172)
    public final void method256(byte arg0) {
        if (class96.field1401 != this.field516) {
            this.field516 = class96.field1401;
            this.field517 = true;
        }
        field505++;
        this.field516.method563(0);
        if (arg0 != -105) {
            return;
        }
        class100[] var2 = this.field506;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class100 var4 = var2[var3];
            if (var4 != null) {
                var4.method682((byte) 42);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 211)
    public static void method257(int arg0) {
        field515 = null;
        field508 = null;
        if (arg0 != 0) {
            field514 = null;
        }
        field514 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(JI)Z", line = 223)
    public final boolean method258(long arg0, int arg1) {
        if (arg1 == -20712) {
            field507++;
            return class224.method1457((byte) -62) >= (long) this.field511.field2631 + arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lgk;Lgm;)V", line = 239)
    public class36(class181 arg0, class210 arg1) {
        this.field511 = arg0;
        this.field506 = new class100[this.field511.field2632.length];
        for (int var3 = 0; var3 < this.field506.length; var3++) {
            this.field506[var3] = arg1.method1394(this.field511.field2632[var3], false);
        }
    }
}
