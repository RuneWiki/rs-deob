import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class28 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lab;")
    public static class279 field533 = new class279(64);

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
    public static boolean field539 = false;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field538 = 0;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lh;")
    public static class107 field541;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "[I")
    public static int[] field537;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
    public static int[] field543;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLag;)V", line = 10)
    public static final void method227(byte arg0, class202 arg1) {
        if (arg0 >= -62) {
            field537 = (int[]) null;
        }
        byte[] var2 = new byte[24];
        field535++;
        if (class158.field2585 != null) {
            try {
                class158.field2585.method1371((byte) 102, 0L);
                int var3 = 0;
                class158.field2585.method1364(var2, 0);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg1.method1332(var2, 24, (byte) 0, 0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V", line = 59)
    public static final void method228(boolean arg0) {
        class159.field2601.method1884(-22054);
        field536++;
        if (arg0) {
            field537 = (int[]) null;
        }
        class341.field5286.method1884(-22054);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IB)V", line = 71)
    public static final void method229(int arg0, byte arg1) {
        field542++;
        class342.field5311.method1883(2047773287, arg0);
        class128.field2198.method1883(2047773287, arg0);
        int var2 = -62 / ((arg1 - 28) / 54);
        class24.field478.method1883(2047773287, arg0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 83)
    public static final String method230(boolean arg0, String arg1) {
        field534++;
        if (arg0) {
            method227((byte) 6, (class202) null);
        }
        int var2 = class122.method786((byte) 28, arg1);
        return var2 == -1 ? "" : class208.method1407(class222.field3517.field3673[var2], "<br>", " ", 22);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 121)
    public static void method234(int arg0) {
        field543 = null;
        if (arg0 == 18056) {
            field533 = null;
            field541 = null;
            field537 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)V")
    public abstract void method226(int arg0, byte arg1);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
    public abstract int method231(int arg0, int arg1);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lvb;")
    public abstract class176 method232(int arg0);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)[B")
    public abstract byte[] method233(boolean arg0, int arg1);
}
