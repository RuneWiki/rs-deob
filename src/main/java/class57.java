import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class57 extends class224 {

    @OriginalMember(owner = "client!si", name = "X", descriptor = "Luf;")
    public static class168 field747 = class148.method1019(-1720, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "[I")
    public static int[] field755 = new int[100];

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "Luf;")
    private static class168 field756 = class148.method1019(-1720, "Please wait)3)3)3");

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "Luf;")
    public static class168 field750 = field756;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
    private int field749;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "[Lwa;")
    public static class284[] field745;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIILf;JLf;Lf;)V", line = 9)
    public static final void method320(int arg0, int arg1, int arg2, int arg3, class231 arg4, long arg5, class231 arg6, class231 arg7) {
        class130 var9 = new class130();
        var9.field2018 = arg4;
        var9.field2017 = arg1 * 128 + 64;
        var9.field2013 = arg2 * 128 + 64;
        var9.field2012 = arg3;
        var9.field2021 = arg5;
        var9.field2014 = arg6;
        var9.field2016 = arg7;
        int var10 = 0;
        class127 var11 = class92.field1424[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1970; var12++) {
                class91 var13 = var11.field1971[var12];
                if ((var13.field1407 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1408.method116();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2026 = -var10;
        if (class92.field1424[arg0][arg1][arg2] == null) {
            class92.field1424[arg0][arg1][arg2] = new class127(arg0, arg1, arg2);
        }
        class92.field1424[arg0][arg1][arg2].field1986 = var9;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZLj;)V", line = 53)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (!arg1) {
            field744++;
            if (arg0 == 0) {
                this.method324(arg2.method1088(-30917), 4080);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 81)
    public class57() {
        this(0);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V", line = 85)
    private class57(int arg0) {
        super(0, false);
        this.method324(arg0, 4080);
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)[Lha;", line = 95)
    public static final class49[] method321(int arg0) {
        field752++;
        class49[] var1 = new class49[class201.field3305];
        if (arg0 != 2) {
            method320(-83, -69, -113, -63, (class231) null, -83L, (class231) null, (class231) null);
        }
        for (int var2 = 0; var2 < class201.field3305; var2++) {
            int var3 = class214.field3490[var2] * class205.field3374[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class236.field3779[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class123.field1905[class159.method1119(255, var5[var6])];
            }
            var1[var2] = new class49(class56.field724, class206.field3381, class154.field2430[var2], class254.field4341[var2], class205.field3374[var2], class214.field3490[var2], var4);
        }
        class244.method1679(-14642);
        return var1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V", line = 135)
    public static final void method322(int arg0, int arg1) {
        int var2 = 103 / ((arg1 + 5) / 62);
        if (arg0 == -1 && !class5.field55) {
            class240.method1622((byte) -76);
        } else if (arg0 != -1 && (class122.field1895 != arg0 || !class285.method1971((byte) 114)) && class48.field593 != 0 && !class5.field55) {
            class168.method1211(false, 2, 0, arg0, class278.field4658, class48.field593, -11);
        }
        field751++;
        class122.field1895 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(B)V", line = 157)
    public static void method323(byte arg0) {
        if (arg0 != 118) {
            return;
        }
        field745 = null;
        field755 = null;
        field747 = null;
        field750 = null;
        field756 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[[I", line = 176)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            method325(73);
        }
        field746++;
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class187.field2961; var7++) {
                var4[var7] = this.field743;
                var6[var7] = this.field749;
                var5[var7] = this.field753;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V", line = 220)
    private final void method324(int arg0, int arg1) {
        this.field749 = arg0 >> 4 & arg1;
        this.field753 = arg0 & 0xFF << 4;
        field754++;
        this.field743 = arg0 >> 12 & 0xFF0;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V", line = 230)
    public static final void method325(int arg0) {
        field742++;
        try {
            if (arg0 != -32485) {
                method320(-41, 81, 63, -81, (class231) null, -88L, (class231) null, (class231) null);
            }
            if (class83.field1261 == 1) {
                int var1 = class92.field1414.method544((byte) -2);
                if (var1 > 0 && class92.field1414.method526(1)) {
                    int var2 = var1 - class151.field2345;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class92.field1414.method555(var2, true);
                    return;
                }
                class92.field1414.method527(-82);
                class92.field1414.method536((byte) 43);
                if (class300.field5091 == null) {
                    class83.field1261 = 0;
                } else {
                    class83.field1261 = 2;
                }
                class179.field2887 = null;
                class62.field812 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class92.field1414.method527(-106);
            class83.field1261 = 0;
            class179.field2887 = null;
            class300.field5091 = null;
            class62.field812 = null;
        }
    }
}
