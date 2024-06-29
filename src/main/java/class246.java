import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class246 {

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public int field4349 = -1;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Z")
    public boolean field4352 = false;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "[I")
    private int[] field4351 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
    public static int[] field4337 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field4355 = 0;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lda;")
    public static class275 field4353 = class255.method1672(111, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lma;")
    public static class105 field4339;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "[I")
    private int[] field4347;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "[I")
    public static int[] field4357;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "[S")
    private short[] field4338;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[S")
    private short[] field4345;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[S")
    private short[] field4346;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[S")
    private short[] field4348;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
    public static int method1612(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lij;I)V")
    public final void method1613(class85 arg0, int arg1) {
        if (arg1 != -23985) {
            this.method1621(true);
        }
        while (true) {
            int var3 = arg0.method564((byte) 68);
            if (var3 == 0) {
                field4354++;
                return;
            }
            this.method1615(var3, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILfb;)V")
    public static final void method1614(int arg0, class109 arg1) {
        field4340++;
        class249 var2 = (class249) class35.field566.method1871(0, arg1.field1910.method1833(0));
        if (arg0 <= 84) {
            field4337 = null;
        }
        if (var2 == null) {
            class234.method1525((class34) null, (class165) null, 0, arg1.field1722[0], arg1.field1752[0], arg1, class159.field2790, (byte) -53);
        } else {
            var2.method1632((byte) -113);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILij;I)V")
    private final void method1615(int arg0, class85 arg1, int arg2) {
        field4344++;
        if (arg0 == arg2) {
            this.field4349 = arg1.method564((byte) 118);
        } else if (arg0 == 2) {
            int var4 = arg1.method564((byte) 123);
            this.field4347 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4347[var5] = arg1.method608(class261.method1705(arg2, 96));
            }
        } else if (arg0 == 3) {
            this.field4352 = true;
        } else if (arg0 == 40) {
            int var8 = arg1.method564((byte) 70);
            this.field4346 = new short[var8];
            this.field4348 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4346[var9] = (short) arg1.method608(108);
                this.field4348[var9] = (short) arg1.method608(class261.method1705(arg2, 106));
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method564((byte) 107);
            this.field4345 = new short[var6];
            this.field4338 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4345[var7] = (short) arg1.method608(58);
                this.field4338[var7] = (short) arg1.method608(arg2 + 116);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field4351[arg0 - 60] = arg1.method608(84);
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method1616(int arg0) {
        class41.field685.method993(108);
        if (arg0 == 0) {
            class113.field1989.method993(116);
            field4350++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lo;")
    public final class263 method1617(byte arg0) {
        field4342++;
        class263[] var2 = new class263[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4351[var4] != -1) {
                var2[var3++] = class263.method1719(class9.field134, this.field4351[var4], 0);
            }
        }
        class263 var5 = new class263(var2, var3);
        if (this.field4346 != null) {
            for (int var6 = 0; var6 < this.field4346.length; var6++) {
                var5.method1723(this.field4346[var6], this.field4348[var6]);
            }
        }
        int var7 = 119 / ((arg0 + 10) / 52);
        if (this.field4345 != null) {
            for (int var8 = 0; var8 < this.field4345.length; var8++) {
                var5.method1734(this.field4345[var8], this.field4338[var8]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method1618(boolean arg0) {
        field4353 = null;
        field4337 = null;
        field4357 = null;
        field4339 = null;
        if (!arg0) {
            method1614(-20, (class109) null);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(JILda;Lda;IBS)V")
    public static final void method1619(long arg0, int arg1, class275 arg2, class275 arg3, int arg4, byte arg5, short arg6) {
        field4356++;
        if (class63.field1051 || arg5 != -70 || class52.field863 >= 500) {
            return;
        }
        class174.field3015[class52.field863] = arg3;
        class201.field3446[class52.field863] = arg2;
        class137.field2400[class52.field863] = arg6;
        class13.field200[class52.field863] = arg0;
        class161.field2820[class52.field863] = arg1;
        class13.field196[class52.field863] = arg4;
        class52.field863++;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Lo;")
    public final class263 method1620(int arg0) {
        field4336++;
        if (this.field4347 == null) {
            return null;
        }
        class263[] var2 = new class263[this.field4347.length];
        int var3 = -52 / ((arg0 + 44) / 61);
        for (int var4 = 0; var4 < this.field4347.length; var4++) {
            var2[var4] = class263.method1719(class9.field134, this.field4347[var4], 0);
        }
        class263 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class263(var2, var2.length);
        }
        if (this.field4346 != null) {
            for (int var6 = 0; var6 < this.field4346.length; var6++) {
                var5.method1723(this.field4346[var6], this.field4348[var6]);
            }
        }
        if (this.field4345 != null) {
            for (int var7 = 0; var7 < this.field4345.length; var7++) {
                var5.method1734(this.field4345[var7], this.field4338[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)Z")
    public final boolean method1621(boolean arg0) {
        field4341++;
        boolean var2 = arg0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4351[var3] != -1 && !class9.field134.method777((byte) -60, 0, this.field4351[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)Z")
    public final boolean method1622(byte arg0) {
        field4343++;
        if (this.field4347 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 >= -51) {
            return false;
        }
        for (int var3 = 0; var3 < this.field4347.length; var3++) {
            if (!class9.field134.method777((byte) -60, 0, this.field4347[var3])) {
                var2 = false;
            }
        }
        return var2;
    }
}
