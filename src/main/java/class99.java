import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class99 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[Lfs;")
    private class331[] field1209;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1201 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[[I")
    public static int[][] field1210 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field1212 = 0;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1213 = new String[100];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "J")
    private long field1205;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lfs;")
    private class331 field1199;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Ltq;")
    public static class376 field1211;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
    public static int[] field1214;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IJ)Lfs;")
    public final class331 method547(int arg0, long arg1) {
        field1198++;
        this.field1205 = arg1;
        if (arg0 != -12822) {
            return null;
        }
        class331 var4 = this.field1209[(int) ((long) (this.field1202 - 1) & arg1)];
        for (this.field1199 = var4.field4676; this.field1199 != var4; this.field1199 = this.field1199.field4676) {
            if (this.field1199.field4685 == arg1) {
                class331 var5 = this.field1199;
                this.field1199 = this.field1199.field4676;
                return var5;
            }
        }
        this.field1199 = null;
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lfs;")
    public final class331 method548(byte arg0) {
        field1200++;
        if (arg0 <= 9) {
            this.field1199 = null;
        }
        if (this.field1199 == null) {
            return null;
        }
        class331 var2 = this.field1209[(int) ((long) (this.field1202 - 1) & this.field1205)];
        while (this.field1199 != var2) {
            if (this.field1199.field4685 == this.field1205) {
                class331 var3 = this.field1199;
                this.field1199 = this.field1199.field4676;
                return var3;
            }
            this.field1199 = this.field1199.field4676;
        }
        this.field1199 = null;
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lfs;IJ)V")
    public final void method549(class331 arg0, int arg1, long arg2) {
        if (arg1 <= 102) {
            this.method548((byte) -31);
        }
        if (arg0.field4673 != null) {
            arg0.method2133(-31493);
        }
        field1204++;
        class331 var5 = this.field1209[(int) ((long) (this.field1202 - 1) & arg2)];
        arg0.field4676 = var5;
        arg0.field4673 = var5.field4673;
        arg0.field4673.field4676 = arg0;
        arg0.field4685 = arg2;
        arg0.field4676.field4673 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Lle;")
    public static final class166 method550(int arg0) {
        field1203++;
        try {
            if (arg0 != 25329) {
                field1213 = null;
            }
            return (class166) Class.forName("m").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static void method551(byte arg0) {
        field1214 = null;
        field1213 = null;
        if (arg0 != -15) {
            field1210 = null;
        }
        field1211 = null;
        field1201 = null;
        field1210 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
    public static final void method552(int arg0, byte arg1) {
        field1206++;
        if (class98.method545(arg0, (byte) 11)) {
            class413.method2633(class98.field1194[arg0], -1, arg1 ^ 0x7C69);
            if (arg1 != 88) {
                field1201 = null;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static final void method553(int arg0) {
        class237 var1 = class50.field595;
        synchronized (class50.field595) {
            class50.field595.method1618(0);
        }
        field1208++;
        class237 var2 = class247.field3528;
        synchronized (class247.field3528) {
            class247.field3528.method1618(0);
        }
        class237 var3 = class265.field3773;
        synchronized (class265.field3773) {
            class265.field3773.method1618(0);
        }
        if (arg0 != -13851) {
            method550(-126);
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
    public class99(int arg0) {
        this.field1202 = arg0;
        this.field1209 = new class331[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class331 var3 = this.field1209[var2] = new class331();
            var3.field4673 = var3;
            var3.field4676 = var3;
        }
    }
}
