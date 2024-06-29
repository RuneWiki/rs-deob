import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class296 extends class511 {

    @OriginalMember(owner = "client!un", name = "V", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!un", name = "Hb", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!un", name = "Ib", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I)V", line = 3)
    public class296(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(FI)V", line = 9)
    public final void method1942(float arg0, int arg1) {
        ++field4324;
        int var3 = Stream.floatToRawIntBits(arg0);
        if (arg1 < -14) {
            super.field6979[super.field6962++] = (byte) var3;
            super.field6979[super.field6962++] = (byte) (var3 >> 8);
            super.field6979[super.field6962++] = (byte) (var3 >> 16);
            super.field6979[super.field6962++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IF)V", line = 26)
    public final void method1943(int arg0, float arg1) {
        if (arg0 != -21171) {
            this.method1942(1.4621173F, -109);
        }
        ++field4325;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field6979[super.field6962++] = (byte) (var3 >> 24);
        super.field6979[super.field6962++] = (byte) (var3 >> 16);
        super.field6979[super.field6962++] = (byte) (var3 >> 8);
        super.field6979[super.field6962++] = (byte) var3;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()V", line = 44)
    public static final void method1944() {
        if (class545.field7583 != null) {
            for (int var0 = 0; var0 < class545.field7583.length; ++var0) {
                for (int var1 = 0; var1 < class414.field5796; ++var1) {
                    for (int var2 = 0; var2 < class704.field9799; ++var2) {
                        if (class545.field7583[var0][var1][var2] != null) {
                            class545.field7583[var0][var1][var2].method2810(-127);
                        }
                        class545.field7583[var0][var1][var2] = null;
                    }
                }
            }
        }
        class545.field7583 = null;
        class95.field1115 = null;
        if (class530.field7302 != null) {
            for (int var3 = 0; var3 < class530.field7302.length; ++var3) {
                for (int var4 = 0; var4 < class414.field5796; ++var4) {
                    for (int var5 = 0; var5 < class704.field9799; ++var5) {
                        if (class530.field7302[var3][var4][var5] != null) {
                            class530.field7302[var3][var4][var5].method2810(-63);
                        }
                        class530.field7302[var3][var4][var5] = null;
                    }
                }
            }
        }
        class530.field7302 = null;
        class594.field8355 = null;
        class59.field688 = null;
        class661.field9303 = null;
        class592.field8338 = null;
        class450.field6289 = null;
        class223.field3151 = null;
        class158.field2049 = null;
        class152.field1994 = null;
        class462.method2782(4273);
        if (class313.field4484 != null) {
            for (int var6 = 0; var6 < class586.field8275; ++var6) {
                class313.field4484[var6] = null;
            }
            class586.field8275 = 0;
        }
        class226.field3436 = null;
        class689.field9618 = null;
        class289.field4265 = null;
        if (class112.field1361 != null) {
            for (int var7 = 0; var7 < class112.field1361.length; ++var7) {
                class112.field1361[var7] = null;
            }
            class74.field827 = 0;
        }
        if (class728.field10067 != null) {
            for (int var8 = 0; var8 < class728.field10067.length; ++var8) {
                class728.field10067[var8] = null;
            }
            class565.field7980 = 0;
        }
        if (class205.field2880 != null) {
            for (int var9 = 0; var9 < class392.field5587; ++var9) {
                class205.field2880[var9] = null;
            }
            for (int var10 = 0; var10 < class266.field3869; ++var10) {
                for (int var11 = 0; var11 < class414.field5796; ++var11) {
                    for (int var12 = 0; var12 < class704.field9799; ++var12) {
                        class182.field2291[var10][var11][var12] = 0L;
                    }
                }
            }
            class392.field5587 = 0;
        }
        client.method792(true);
        class539.field7444 = class539.field7451;
        class539.field7444.method3979(2048);
        class516.field7086 = null;
        class120.field1598 = null;
        class57.field668 = null;
        if (class449.field6282 != null) {
            class381.method2378();
            class139.field1781.method195(1);
            class139.field1781.method170(0);
        }
        if (class393.field5594 != null) {
            class393.field5594 = null;
        }
        class139.field1781 = null;
    }
}
