import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class66 {

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lpa;")
    public static class140 field1055 = new class140(16);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Llb;")
    public static class207 field1052;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[Lfk;")
    public static class256[] field1054;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method456(int arg0) {
        if (arg0 == 16) {
            field1055 = null;
            field1054 = null;
            field1052 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BZ)V")
    public static final void method457(byte arg0, boolean arg1) {
        field1050++;
        if (arg0 <= 113) {
            field1055 = null;
        }
        if (arg1 != class35.field504) {
            class35.field504 = arg1;
            class291.method1949(77);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static final void method458(byte arg0) {
        field1053++;
        if (arg0 != -83) {
            return;
        }
        for (int var1 = -1; var1 < class138.field2360; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class285.field5020[var1];
            }
            class188 var3 = class98.field1526[var2];
            if (var3 != null) {
                class214.method1520(var3.method763(arg0 + 82), (byte) -66, var3);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static final void method459(boolean arg0) {
        field1056++;
        class193.method1330((long) class72.field1146);
        if (class234.field4044 != -1) {
            class18.method121(-1, class234.field4044);
        }
        for (int var1 = 0; var1 < class216.field3723; var1++) {
            if (class154.field2597[var1]) {
                class255.field4528[var1] = true;
            }
            class52.field813[var1] = class154.field2597[var1];
            class154.field2597[var1] = false;
        }
        class174.field2923 = -1;
        class217.field3733 = -1;
        if (arg0) {
            return;
        }
        class181.field3030 = null;
        class28.field404 = class72.field1146;
        if (class234.field4044 != -1) {
            class216.field3723 = 0;
            class252.method1723(class199.field3390, class249.field4479, 0, 0, -1, class234.field4044, -89, 0, 0);
        }
        class122.method859();
        class259.field4588 = 0;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)[B")
    public abstract byte[] method460(byte arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B[B)V")
    public abstract void method461(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)V")
    public static final void method462(int arg0, byte arg1, int arg2) {
        field1051++;
        if (arg1 > -67) {
            return;
        }
        if (class227.field3898 != arg0) {
            class239.field4263 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class239.field4263[var3] = (var3 << 12) / arg0;
            }
            class227.field3898 = arg0;
            class144.field2463 = arg0 == 64 ? 2048 : 4096;
            class109.field1786 = arg0 - 1;
        }
        if (class110.field1847 == arg2) {
            return;
        }
        if (class227.field3898 == arg2) {
            class62.field1029 = class239.field4263;
        } else {
            class62.field1029 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class62.field1029[var4] = (var4 << 12) / arg2;
            }
        }
        class239.field4260 = arg2 - 1;
        class110.field1847 = arg2;
    }
}
