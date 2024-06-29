import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class246 {

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field4455 = 0;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field4467 = 0;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lqk;")
    public static class207 field4469 = class24.method212(255, "rot:");

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lqk;")
    public static class207 field4461 = class24.method212(255, "Polices charg-Bes");

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public int field4459;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "J")
    public long field4464;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Ldc;")
    public class235 field4465;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)I")
    public static final int method1727(boolean arg0) {
        if (!arg0) {
            method1733(16, -21, -11, -101, 58, -66, 108);
        }
        field4462++;
        return class78.field1426;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method1728(byte arg0) {
        field4461 = null;
        if (arg0 < 39) {
            field4461 = null;
        }
        field4469 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lpk;ILpk;Lmi;)V")
    public static final void method1729(class99 arg0, int arg1, class99 arg2, class258 arg3) {
        class22.field359 = arg3;
        class15.field240 = arg2;
        if (arg1 >= -76) {
            field4461 = null;
        }
        field4460++;
        class78.field1425 = arg0;
        if (class78.field1425 != null) {
            class100.field1809 = class78.field1425.method698(7, 1);
        }
        if (class15.field240 != null) {
            class141.field2441 = class15.field240.method698(7, 1);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZB)V")
    public static final void method1730(boolean arg0, byte arg1) {
        if (arg1 > -10) {
            method1733(-13, 65, -4, 67, -103, -5, -93);
        }
        field4458++;
        if (class55.field1024 != arg0) {
            class55.field1024 = arg0;
            class179.method1276(-1601881921);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBIIII)V")
    public static final void method1731(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4468++;
        int var6 = class21.method123(arg2, -15466, class204.field3580, class204.field3602);
        int var7 = class21.method123(arg5, -15466, class204.field3580, class204.field3602);
        if (arg1 < 102) {
            field4455 = 82;
        }
        int var8 = class21.method123(arg0, -15466, class124.field2158, class88.field1599);
        int var9 = class21.method123(arg3, -15466, class124.field2158, class88.field1599);
        for (int var10 = var6; var10 <= var7; var10++) {
            class215.method1544(var8, var9, class15.field238[var10], arg4, 114);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lqk;Lqk;Lqk;II)V")
    public static final void method1732(class207 arg0, class207 arg1, class207 arg2, int arg3, int arg4) {
        field4457++;
        class74.method539(-124, arg0, arg1, arg3, arg2, -1);
        int var5 = -60 / ((-arg4 - 62) / 59);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4463++;
        if (arg5 < 41) {
            method1733(114, -69, 77, -69, -98, -126, -59);
        }
        class156[] var7 = class170.field3025;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class156 var9 = var7[var8];
            if (var9 != null && var9.field2749 == 2) {
                class199.method1381(arg4, (var9.field2732 - class180.field3231 << 7) + var9.field2738, (-class21.field349 + var9.field2756 << 7) + var9.field2733, arg3 >> 1, var9.field2736 * 2, 1480421801, arg1 >> 1, arg6);
                if (class125.field2179 > -1 && (class160.field2844 % 20) < 10) {
                    class67.field1191[var9.field2750].method381(class125.field2179 + arg2 - 12, arg0 + -28 - -class234.field4334);
                }
            }
        }
    }
}
