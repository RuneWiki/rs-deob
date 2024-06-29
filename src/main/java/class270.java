import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class270 {

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Z")
    public static boolean field4430 = false;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public int field4424;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lfa;")
    public static class273 field4426;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1851(boolean arg0, String[] arg1) {
        field4422++;
        if (arg0) {
            return null;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Lnf;")
    public static final class166 method1852(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class166 var4 = var3.field2430;
            var3.field2430 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILma;)V")
    public final void method1853(int arg0, class202 arg1) {
        if (arg0 != -1) {
            this.method1853(-98, (class202) null);
        }
        while (true) {
            int var3 = arg1.method1420((byte) 0);
            if (var3 == 0) {
                field4423++;
                return;
            }
            this.method1857(arg1, (byte) -80, var3);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLfa;)V")
    public static final void method1854(byte arg0, class273 arg1) {
        int var2 = -118 / ((arg0 - 53) / 54);
        class51.field698 = arg1;
        field4431++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public static final void method1855(int arg0, int arg1) {
        field4429++;
        class9.field106.method147(arg0, (byte) -121);
        if (arg1 != 0) {
            method1858(89);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static final void method1856(int arg0) {
        class239.field3781 = null;
        int var1 = 22 / ((25 - arg0) / 57);
        class56.field758 = null;
        class272.field4457 = null;
        field4421++;
        class12.field157 = null;
        class184.field2854 = null;
        class263.field4341 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lma;BI)V")
    private final void method1857(class202 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field4425 = arg0.method1419(112);
            this.field4427 = arg0.method1420((byte) 0);
            this.field4424 = arg0.method1420((byte) 0);
        }
        field4428++;
        if (arg1 != -80) {
            this.field4424 = -67;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method1858(int arg0) {
        field4426 = null;
        if (arg0 < 44) {
            field4430 = true;
        }
    }
}
