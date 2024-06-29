import java.awt.Component;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class72 {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "[I")
    private int[] field1520;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "[I")
    public static int[] field1526 = new int[32768];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1516 = 0;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1521 = 0;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Lvc;")
    public static class137 field1530 = class45.method325("Einloggen", -46);

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Lga;")
    public static class44 field1531 = null;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "Lr;")
    public static class110 field1527 = new class110(5000);

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Lvc;")
    public static class137 field1533 = class45.method325("welle:", -46);

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1535 = 0;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "[I")
    public static int[] field1537 = new int[5];

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "[I")
    public static int[] field1538 = new int[5];

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lrb;")
    public static class112 field1536 = new class112(4096);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lia;")
    public static class57 field1522;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method500(int arg0) {
        field1517++;
        if (class29.field639 > 0) {
            class78.method579((byte) 76);
        } else {
            int var1 = -49 / (-arg0 / 61);
            class33.method245(40, -96);
            class33.field704 = class69.field1446;
            class69.field1446 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method501(boolean arg0, Component arg1) {
        field1534++;
        if (arg0) {
            method505((byte) 13);
        }
        Method var2 = class50.field1119;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class78.field1725);
        arg1.addFocusListener(class78.field1725);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)V")
    public static final void method502(int arg0, byte arg1, int arg2) {
        field1524++;
        class10 var3 = class106.method767((byte) -102, arg0);
        int var4 = var3.field219;
        if (arg1 != 87) {
            method503(false, (byte) 65);
        }
        int var5 = var3.field209;
        int var6 = var3.field214;
        int var7 = class63.field1344[var5 - var6];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var6;
        class28.field631[var4] = class49.method351(class45.method323(~var8, class28.field631[var4]), class45.method323(arg2 << var6, var8));
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZB)V")
    public static final void method503(boolean arg0, byte arg1) {
        class25.field595++;
        field1523++;
        if (arg1 >= -38) {
            method503(false, (byte) 7);
        }
        if (class25.field595 < 50 && !arg0) {
            return;
        }
        class25.field595 = 0;
        if (class134.field3106 || class69.field1446 == null) {
            return;
        }
        class121.field2818++;
        field1527.method845(128, 100);
        try {
            class69.field1446.method440(0, field1527.field2583, false, field1527.field2547);
            field1527.field2583 = 0;
        } catch (IOException var2) {
            class134.field3106 = true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)I")
    public final int method504(int arg0, byte arg1) {
        field1518++;
        int var3 = 88 % ((arg1 - 14) / 55);
        int var4 = this.field1520.length - 2;
        int var5 = var4 & arg0 << 1;
        while (true) {
            int var6 = this.field1520[var5];
            if (arg0 == var6) {
                return this.field1520[var5 + 1];
            }
            if (var6 == -1) {
                return -1;
            }
            var5 = var4 & var5 + 2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([I)V")
    public class72(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field1520 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1520[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1520[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1520[var5 + var5] = arg0[var4];
            this.field1520[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method505(byte arg0) {
        field1537 = null;
        field1538 = null;
        field1526 = null;
        field1527 = null;
        if (arg0 < 109) {
            field1537 = null;
        }
        field1522 = null;
        field1533 = null;
        field1536 = null;
        field1530 = null;
    }
}
