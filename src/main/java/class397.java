import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class397 {

    @OriginalMember(owner = "client!at", name = "a", descriptor = "Lvv;")
    public class343 field5452 = new class343();

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Z")
    public boolean field5458 = false;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "Lbu;")
    public static class21 field5453 = new class21(89, -2);

    @OriginalMember(owner = "client!at", name = "i", descriptor = "[I")
    public static int[] field5460 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!at", name = "f", descriptor = "Lbu;")
    public static class21 field5457 = new class21(48, 5);

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 5)
    public static void method2447(int arg0) {
        field5453 = null;
        field5460 = null;
        if (arg0 == -32842) {
            field5457 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lmaa;I)V", line = 17)
    public final void method2448(class495 arg0, int arg1) {
        field5455++;
        class421 var3 = arg0.field7063;
        boolean var4 = true;
        class711[] var5 = arg0.field7067;
        for (int var6 = arg1; var6 < var5.length; var6++) {
            if (var5[var6].field9875) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field5458) {
            for (class495 var7 = (class495) this.field5452.method2170(false); var7 != null; var7 = (class495) this.field5452.method2176(arg1 ^ 0xFFFFBAA6)) {
                if (var7.field7063 == var3) {
                    var7.method3358(7);
                    class121.method919(var7, (byte) -11);
                }
            }
        }
        for (class495 var8 = (class495) this.field5452.method2170(false); var8 != null; var8 = (class495) this.field5452.method2176(-17754)) {
            if (var3.field5744 >= var8.field7063.field5744) {
                class193.method1339(arg0, var8, -27321);
                return;
            }
        }
        this.field5452.method2173(57, arg0);
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Z)V", line = 167)
    public class397(boolean arg0) {
        this.field5458 = arg0;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)I", line = 85)
    public static final int method2449(int arg0, int arg1) {
        field5454++;
        if (arg0 != 4) {
            method2450((byte) 21, -44);
        }
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)Z", line = 126)
    public static final boolean method2450(byte arg0, int arg1) {
        if (arg0 <= 32) {
            method2450((byte) 8, 98);
        }
        field5459++;
        return arg1 == 7 || arg1 == 8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V", line = 140)
    public final void method2451(byte arg0) {
        field5456++;
        if (arg0 != 127) {
            return;
        }
        while (true) {
            class495 var2 = (class495) this.field5452.method2172(-122);
            if (var2 == null) {
                return;
            }
            var2.method3358(arg0 - 39);
            class121.method919(var2, (byte) -53);
        }
    }
}
