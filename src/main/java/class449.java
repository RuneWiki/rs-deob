import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class class449 {

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "Ljp;")
    public static class55 field6683 = new class55(40, 4);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "Lwr;")
    public static class537 field6685;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)I")
    public abstract int method2228(byte arg0, int arg1);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public static void method2758(byte arg0) {
        field6683 = null;
        if (arg0 <= 112) {
            method2758((byte) 65);
        }
        field6685 = null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V")
    public abstract void method2235(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)Lsq;")
    public abstract class366 method2230(byte arg0);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2759(String arg0, byte arg1) {
        field6681++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 != -46) {
            method2759(null, (byte) -49);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class365.method2328(arg0.charAt(var4), (byte) -108) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
    public static final void method2760(boolean arg0) {
        if (!arg0) {
            field6686 = -89;
        }
        if (class59.field909 != -1) {
            class488.method2948(false, class59.field909, (byte) 45, -1, -1);
            class59.field909 = -1;
        }
        field6684++;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)[B")
    public abstract byte[] method2231(int arg0, int arg1);
}
