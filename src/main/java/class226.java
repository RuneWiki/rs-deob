import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class226 extends class403 {

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public static int field2977 = 0;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "Ljava/lang/String;")
    public String field2982;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "[C")
    public char[] field2979;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "[C")
    public char[] field2988;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "[I")
    public int[] field2978;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "[I")
    public int[] field2980;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
    public final void method1269(byte arg0) {
        field2981++;
        if (this.field2978 != null) {
            for (int var2 = 0; var2 < this.field2978.length; var2++) {
                this.field2978[var2] = class21.method133(this.field2978[var2], 32768);
            }
        }
        if (this.field2980 != null) {
            for (int var3 = 0; var3 < this.field2980.length; var3++) {
                this.field2980[var3] = class21.method133(this.field2980[var3], 32768);
            }
        }
        if (arg0 != -120) {
            this.field2978 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(CZ)I")
    public final int method1270(char arg0, boolean arg1) {
        field2983++;
        if (arg1) {
            this.method1274(false, ' ');
        }
        if (this.field2980 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2980.length; var3++) {
            if (this.field2979[var3] == arg0) {
                return this.field2980[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
    public static final void method1271(int arg0, int arg1) {
        field2986++;
        if (class239.field3188 == arg1) {
            return;
        }
        class295.field3947 = class39.field567 = class138.field2007[arg1];
        class98.field1432.method2022(50, (int) ((double) class295.field3947 * 34.46D));
        class65.field868 = new int[class295.field3947][class39.field567];
        class405.field5568 = new int[class295.field3947][class39.field567];
        class137.field1993 = new int[4][class295.field3947 >> 3][class39.field567 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class60.field805[var2] = class27.method157(class39.field567, (byte) -119, class295.field3947);
        }
        class191.field2589 = new byte[4][class295.field3947][class39.field567];
        class464.method2733(arg0 ^ arg0, class295.field3947, 4, class39.field567);
        class98.method602(class39.field567 >> 3, -60, class295.field3947 >> 3, class98.field1432);
        class239.field3188 = arg1;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILbt;)V")
    private final void method1272(byte arg0, int arg1, class32 arg2) {
        if (arg1 == 1) {
            this.field2982 = arg2.method195(115);
        } else if (arg1 == 2) {
            int var7 = arg2.method201((byte) -110);
            this.field2980 = new int[var7];
            this.field2979 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2980[var8] = arg2.method215((byte) 108);
                byte var9 = arg2.method211(29861);
                this.field2979[var8] = var9 == 0 ? 0 : class107.method661(class71.method462(arg0, 2089), var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method201((byte) -110);
            this.field2988 = new char[var4];
            this.field2978 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2978[var5] = arg2.method215((byte) 107);
                byte var6 = arg2.method211(29861);
                this.field2988[var5] = var6 == 0 ? 0 : class107.method661(-2101, var6);
            }
        }
        field2985++;
        if (arg0 != -30) {
            this.method1273((class32) null, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lbt;B)V")
    public final void method1273(class32 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method201((byte) -113);
            if (var3 == 0) {
                field2989++;
                if (arg1 != 126) {
                    this.method1269((byte) -53);
                    return;
                }
                return;
            }
            this.method1272((byte) -30, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZC)I")
    public final int method1274(boolean arg0, char arg1) {
        field2990++;
        if (this.field2978 == null) {
            return -1;
        }
        if (!arg0) {
            field2984 = 47;
        }
        for (int var3 = 0; var3 < this.field2978.length; var3++) {
            if (this.field2988[var3] == arg1) {
                return this.field2978[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Lbt;B)Lpd;")
    public static final class155 method1275(class32 arg0, byte arg1) {
        if (arg1 != -25) {
            method1271(-72, -27);
        }
        field2987++;
        return new class155(arg0.method209((byte) 35), arg0.method209((byte) 35), arg0.method209((byte) 35), arg0.method209((byte) 35), arg0.method219(-128), arg0.method219(-125), arg0.method201((byte) -109));
    }
}
