import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class287 extends class290 {

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Loh;")
    public static class258 field4938 = null;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Lfk;")
    public static class144 field4943 = new class144(32);

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Loh;")
    public static class258 field4946 = class153.method1046(")3", 120);

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Lnl;")
    public static class279 field4944;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BZ)V", line = 12)
    public static final void method2020(byte arg0, boolean arg1) {
        byte[][] var2;
        if (class257.field4390 && arg1) {
            var2 = class58.field925;
        } else {
            var2 = class146.field2482;
        }
        int var3 = class191.field3383.length;
        if (arg0 < 18) {
            method2020((byte) 8, false);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class231.field3990[var4] >> 8) * 64 - class229.field3955;
                int var7 = (class231.field3990[var4] & 0xFF) * 64 - class311.field5271;
                class172.method1164(48);
                class123.method900(class243.field4216, var5, arg1, var7, var6, 2);
            }
        }
        field4940++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V", line = 48)
    public static void method2021(boolean arg0) {
        field4938 = null;
        field4943 = null;
        if (!arg0) {
            method2021(true);
        }
        field4944 = null;
        field4946 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I", line = 70)
    public static final int method2022(int arg0, int arg1, int arg2) {
        field4947++;
        int var3 = arg0 >> 31 & arg2 - 1;
        return arg1 < 49 ? -18 : ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 106)
    public static final void method2023(byte arg0) {
        if (arg0 == 94) {
            class51.field819.method1161(57);
            class226.field3886.method1161(arg0 ^ 0xFFFFFFEA);
            class308.field5224.method1161(83);
            field4942++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)I", line = 129)
    public static final int method2024(byte arg0, int arg1) {
        if (arg0 == 63) {
            field4941++;
            return arg1 >>> 10;
        } else {
            return -47;
        }
    }
}
