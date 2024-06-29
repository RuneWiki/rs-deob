import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class23 implements class171 {

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Ljava/lang/String;")
    private String field256;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Lwu;")
    private class557 field261;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Lju;")
    public static class102 field257 = new class102(29, 8);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "Lqk;")
    public static class148 field262;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)I")
    public final int method126(int arg0) {
        field260++;
        if (arg0 == 23022) {
            return this.field261.method3343(-24230, this.field256) ? 100 : this.field261.method3308(this.field256, arg0 - 22895);
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
    public static void method127(boolean arg0) {
        field262 = null;
        field257 = null;
        if (!arg0) {
            field262 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
    public static final void method128(int arg0) {
        class336.field4314.method2311(-108);
        field258++;
        if (arg0 != -6) {
            field262 = null;
        }
        class355.field4565 = null;
        class539.field7539 = null;
        class736.field10292 = 1;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([J[IIIB)V")
    public static final void method129(long[] arg0, int[] arg1, int arg2, int arg3, byte arg4) {
        field254++;
        if (arg4 != -3 || arg3 >= arg2) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg3;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var7;
        int var9 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg3; var11 < arg2; var11++) {
            if ((long) (var10 & var11) + var7 > arg0[var11]) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                int var14 = arg1[var11];
                arg1[var11] = arg1[var6];
                arg1[var6++] = var14;
            }
        }
        arg0[arg2] = arg0[var6];
        arg0[var6] = var7;
        arg1[arg2] = arg1[var6];
        arg1[var6] = var9;
        method129(arg0, arg1, var6 - 1, arg3, (byte) -3);
        method129(arg0, arg1, arg2, var6 + 1, (byte) -3);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Lvm;")
    public final class75 method130(int arg0) {
        field255++;
        if (arg0 != 29067) {
            field257 = null;
        }
        return class75.field1033;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(Z)V")
    public static final void method131(boolean arg0) {
        field253++;
        if (class218.field3089) {
            return;
        }
        class218.field3089 = true;
        if (!arg0) {
            class196.field2836 += (-12.0F - class196.field2836) / 2.0F;
            class263.field3586 = true;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILpaa;I)V")
    public static final void method132(int arg0, int arg1, class712 arg2, int arg3) {
        if (class13.field187) {
            class752 var4 = class545.field7705 == -1 ? null : class223.field3134.method2390(1, class545.field7705);
            if (client.method2675(arg2).method644((byte) 16) && (class626.field8934 & 0x20) != 0 && (var4 == null || arg2.method4005(var4.field10448, class545.field7705, 30423) != var4.field10448)) {
                class78.field1060++;
                class370.method2059(false, arg2.field10026, 28, arg2.field9953, class101.field1454, false, arg2.field9998, (long) (arg2.field9998 | arg2.field10026 << 0), class215.field3044, 0L, 9, true, class146.field2027 + " -> " + arg2.field9941);
            }
        }
        field259++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class48.method326(arg2, var5, true);
            if (var9 != null) {
                class370.method2059(false, arg2.field10026, 28, arg2.field9953, class141.method928(var5, -1, arg2), false, arg2.field9998, (long) (arg2.field9998 | arg2.field10026 << 0), var9, (long) (var5 + 1), 1002, true, arg2.field9941);
                class692.field9680++;
            }
        }
        if (arg3 != 0) {
            field257 = null;
        }
        String var6 = class392.method2389(arg2, arg3 + 15269);
        if (var6 != null) {
            class244.field3383++;
            class370.method2059(false, arg2.field10026, 28, arg2.field9953, arg2.field10003, false, arg2.field9998, (long) (arg2.field9998 | arg2.field10026 << 0), var6, 0L, 5, true, arg2.field9941);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class48.method326(arg2, var7, true);
            if (var8 != null) {
                class370.method2059(false, arg2.field10026, 28, arg2.field9953, class141.method928(var7, arg3 - 1, arg2), false, arg2.field9998, (long) (arg2.field10026 << 0 | arg2.field9998), var8, (long) (var7 + 1), 10, true, arg2.field9941);
                class692.field9680++;
            }
        }
        if (!client.method2675(arg2).method643(arg3 ^ 0x1)) {
            return;
        }
        if (arg2.field10055 == null) {
            class370.method2059(false, arg2.field10026, 28, arg2.field9953, -1, false, arg2.field9998, (long) (arg2.field9998 | arg2.field10026 << 0), class138.field1845.method891(-2041650704, class369.field4721), 0L, 15, true, "");
        } else {
            class370.method2059(false, arg2.field10026, 28, arg2.field9953, -1, false, arg2.field9998, (long) (arg2.field10026 << 0 | arg2.field9998), arg2.field10055, 0L, 15, true, "");
        }
        class330.field4235++;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lwu;Ljava/lang/String;)V")
    public class23(class557 arg0, String arg1) {
        this.field256 = arg1;
        this.field261 = arg0;
    }
}
