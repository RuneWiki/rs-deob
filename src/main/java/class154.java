import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class154 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "J")
    public static long field3504 = 0L;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field3511 = 0;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[Lrd;")
    public static class122[] field3507;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "[Lsa;")
    public static class126[] field3505;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BI)V")
    public abstract void method396(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)[B")
    public abstract byte[] method395(int arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method1189(byte arg0) {
        field3505 = null;
        field3507 = null;
        if (arg0 != -94) {
            method1189((byte) 109);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLc;Lc;)V")
    public static final void method1190(byte arg0, class15 arg1, class15 arg2) {
        class152.field3467 = arg1;
        if (arg0 <= 73) {
            method1193(-63, -104, 37);
        }
        class28.field757 = arg2;
        field3506++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILod;)Z")
    public static final boolean method1191(int arg0, class101 arg1) {
        field3510++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class101.field2205; var2++) {
            if (arg1.method710(class35.field899[var2], 6587)) {
                return true;
            }
        }
        if (arg0 <= 23) {
            method1189((byte) -97);
        }
        return arg1.method710(class82.field1778.field276, 6587);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public static final void method1192(boolean arg0) {
        field3512++;
        int var1 = 0;
        if (arg0) {
            return;
        }
        while (var1 < class11.field176) {
            int var2 = class39.field935[var1];
            class13 var3 = class94.field2032[var2];
            int var4 = class118.field2611.method1055(119);
            if ((var4 & 0x2) != 0) {
                var4 += class118.field2611.method1055(117) << 8;
            }
            class152.method1178((byte) -85, var3, var2, var4);
            var1++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
    public static final int method1193(int arg0, int arg1, int arg2) {
        field3508++;
        int var3 = arg0 >>> 31;
        if (arg2 != 28253) {
            field3511 = 85;
        }
        return (arg0 + var3) / arg1 - var3;
    }
}
