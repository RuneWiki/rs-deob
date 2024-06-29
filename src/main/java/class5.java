import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class5 {

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Lva;")
    private class288 field73 = new class288(256);

    @OriginalMember(owner = "client!il", name = "r", descriptor = "Lva;")
    private class288 field88 = new class288(256);

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Ltq;")
    private class376 field86;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Ltq;")
    private class376 field75;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field81 = -1;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field71 = -1;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Liq;")
    public static class362 field74 = new class362("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "Llg;")
    public static class237 field84 = new class237(64);

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZII[I)Lvo;")
    private final class27 method34(boolean arg0, int arg1, int arg2, int[] arg3) {
        field76++;
        if (!arg0) {
            return null;
        }
        int var5 = arg1 ^ ((arg2 & 0xC0000FFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class27 var9 = (class27) this.field88.method1888(var7, (byte) -30);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class172 var10 = class172.method1146(this.field75, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class27 var11 = var10.method1148();
            this.field88.method1886(var11, var7, 1);
            if (arg3 != null) {
                arg3[0] -= var11.field334.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static final void method35(byte arg0) {
        if (arg0 <= 50) {
            field81 = 65;
        }
        field77++;
        if (class237.field3389 != 2) {
            try {
                class368.method2348(class382.field5381, -104, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI[I)Lvo;")
    public final class27 method36(boolean arg0, int arg1, int[] arg2) {
        field87++;
        if (this.field75.method2432(arg0) == 1) {
            return this.method34(true, arg1, 0, arg2);
        } else if (this.field75.method2415(arg1, (byte) 56) == 1) {
            return this.method34(arg0, 0, arg1, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method37(int arg0) {
        if (arg0 != -18414) {
            field81 = 66;
        }
        field74 = null;
        field84 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ldg;I)Lr;")
    public static final class98 method38(class236 arg0, int arg1) {
        field80++;
        arg0.method1574(-92);
        int var2 = arg0.method1574(-35);
        class98 var3 = class140.method860((byte) 68, var2);
        var3.field1187 = arg0.method1574(arg1 ^ 0xFFFFFFE6);
        int var4 = arg0.method1574(arg1 ^ 0xFFFFFFFB);
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method1574(-65);
            var3.method81(var6, arg0, 0);
        }
        var3.method188(arg1 + 1);
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public static final void method39(int arg0) {
        field79++;
        for (int var1 = 0; var1 < class102.field1250; var1++) {
            int var2 = class86.field981[var1];
            class77 var3 = class167.field2335[var2];
            if (var3 != null) {
                class432.method2710(var3, 128, var3.field912.field1697);
            }
        }
        if (arg0 != 945770988) {
            method35((byte) 78);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([IZI)Lvo;")
    public final class27 method40(int[] arg0, boolean arg1, int arg2) {
        field78++;
        if (this.field86.method2432(arg1) == 1) {
            return this.method42(arg2, 36, arg0, 0);
        } else if (this.field86.method2415(arg2, (byte) 56) == 1) {
            return this.method42(0, -85, arg0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
    public static final void method41(int arg0, int arg1) {
        if (arg0 >= -78) {
            field81 = 88;
        }
        field83++;
        class20 var2 = class369.method2351((byte) 74, 9, arg1);
        var2.method148(-11806);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II[II)Lvo;")
    private final class27 method42(int arg0, int arg1, int[] arg2, int arg3) {
        field72++;
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFF1) ^ arg0;
        int var6 = var5 | arg3 << 16;
        int var7 = -48 / ((81 - arg1) / 39);
        long var8 = (long) var6 ^ 0x100000000L;
        class27 var10 = (class27) this.field88.method1888(var8, (byte) -30);
        if (var10 != null) {
            return var10;
        } else if (arg2 == null || arg2[0] > 0) {
            class319 var11 = (class319) this.field73.method1888(var8, (byte) -30);
            if (var11 == null) {
                var11 = class319.method2085(this.field86, arg3, arg0);
                if (var11 == null) {
                    return null;
                }
                this.field73.method1886(var11, var8, 1);
            }
            class27 var12 = var11.method2094(arg2);
            if (var12 == null) {
                return null;
            } else {
                var11.method2594((byte) -22);
                this.field88.method1886(var12, var8, 1);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/awt/Frame;ILrd;)V")
    public static final void method43(Frame arg0, int arg1, class185 arg2) {
        while (true) {
            class315 var3 = arg2.method1252(3, arg0);
            while (var3.field4498 == 0) {
                class150.method907(10L, (byte) -32);
            }
            if (var3.field4498 == 1) {
                field82++;
                if (arg1 != 10) {
                    field71 = -121;
                }
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class150.method907(100L, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Ltq;Ltq;)V")
    public class5(class376 arg0, class376 arg1) {
        this.field86 = arg1;
        this.field75 = arg0;
    }
}
