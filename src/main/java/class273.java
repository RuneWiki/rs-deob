import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class273 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    private int field4355 = 0;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lpf;")
    private class305 field4363;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
    public static int[] field4357 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4365 = "Hidden";

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Llb;")
    private class134 field4364;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lok;")
    public static class41 field4358;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Llb;")
    public final class134 method1866(int arg0) {
        if (arg0 < 64) {
            method1869((byte) -120);
        }
        field4360++;
        if (this.field4355 > 0 && this.field4363.field4906[this.field4355 - 1] != this.field4364) {
            class134 var2 = this.field4364;
            this.field4364 = var2.field2006;
            return var2;
        }
        while (this.field4363.field4910 > this.field4355) {
            class134 var3 = this.field4363.field4906[this.field4355++].field2006;
            if (this.field4363.field4906[this.field4355 - 1] != var3) {
                this.field4364 = var3.field2006;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static final void method1867(byte arg0) {
        class162.field2427 = -1;
        class135.field2019 = -1;
        class240.field3826.field541 = 0;
        if (arg0 != -1) {
            method1867((byte) -29);
        }
        class95.field1528 = 0;
        class9.field147 = -1;
        class207.field3185 = false;
        class14.field174 = 0;
        class50.field813 = 0;
        class52.field824 = 0;
        class305.field4895 = 0;
        field4361++;
        class304.field4892 = 0;
        class215.field3302 = -1;
        class183.field2900.field541 = 0;
        for (int var1 = 0; var1 < class233.field3682.length; var1++) {
            if (class233.field3682[var1] != null) {
                class233.field3682[var1].field4702 = -1;
            }
        }
        for (int var2 = 0; var2 < class116.field1781.length; var2++) {
            if (class116.field1781[var2] != null) {
                class116.field1781[var2].field4702 = -1;
            }
        }
        class260.method1746(arg0 ^ 0xFFFFFFDF);
        class175.field2704 = 1;
        class248.method1679(30, 2);
        for (int var3 = 0; var3 < 100; var3++) {
            class247.field3933[var3] = true;
        }
        class162.method1174(~arg0);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Llb;")
    public final class134 method1868(int arg0) {
        this.field4355 = arg0;
        field4359++;
        return this.method1866(101);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
    public static void method1869(byte arg0) {
        field4358 = null;
        if (arg0 != -35) {
            method1869((byte) 88);
        }
        field4357 = null;
        field4365 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLha;)V")
    public static final void method1870(boolean arg0, class31 arg1) {
        field4356++;
        byte[] var2 = new byte[24];
        if (arg0) {
            field4362 = -10;
        }
        if (class75.field1169 != null) {
            try {
                class75.field1169.method201(0L, (byte) 89);
                class75.field1169.method206(var2, -31);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method302(24, 6103, 0, var2);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lpf;)V")
    public class273(class305 arg0) {
        this.field4363 = arg0;
    }
}
