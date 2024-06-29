import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class231 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lqf;")
    public static class632 field3003 = new class632();

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lmq;")
    public static class472 field3009 = new class472(4);

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Lgga;")
    public static class265 field3011 = new class265();

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lhq;")
    public static class142 field3012 = new class142("WTWIP", 3);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3004;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lun;I[B)V", line = 5)
    public final void method1395(class389 arg0, int arg1, byte[] arg2) {
        field3002++;
        if (arg0.field5205[arg0.field5195] != 31 || arg0.field5205[arg0.field5195 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3004 == null) {
            this.field3004 = new Inflater(true);
        }
        try {
            this.field3004.setInput(arg0.field5205, arg0.field5195 + 10, -arg0.field5195 + -10 - 8 + arg0.field5205.length);
            this.field3004.inflate(arg2);
        } catch (Exception var4) {
            this.field3004.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 > 85) {
            this.field3004.reset();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 36)
    public static final void method1396(byte arg0) {
        if (arg0 != 92) {
            return;
        }
        field3005++;
        class301.field4044++;
        class543 var1 = class299.method1780(class84.field1196, class40.field735, 91);
        var1.field7872.method2261((byte) 39, class697.field9869);
        class511.method3028(7482, var1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[B)[B", line = 52)
    public final byte[] method1397(int arg0, byte[] arg1) {
        field3010++;
        class389 var3 = new class389(arg1);
        var3.field5195 = arg1.length - 4;
        int var4 = var3.method2242(-60);
        byte[] var5 = new byte[var4];
        var3.field5195 = arg0;
        this.method1395(var3, 98, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 70)
    public class231() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBI)V", line = 79)
    public static final void method1398(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = class221.field2851.field4158 * arg1 >> 8;
        field3008++;
        if (arg3 == -1 && !class621.field8895) {
            class88.method700(-87);
        } else if (arg3 != -1 && (class584.field8487 != arg3 || !class501.method2913(69)) && var4 != 0 && !class621.field8895) {
            class86.method690(false, (byte) 96, 0, arg3, var4, arg0, class275.field3764);
            class331.method1920(-1);
        }
        if (class584.field8487 != arg3) {
            class548.field7961 = null;
        }
        class584.field8487 = arg3;
        int var5 = -85 / ((76 - arg2) / 45);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 116)
    public static final void method1399(int arg0) {
        field3006++;
        int var1 = 0;
        if (class221.field2851.method1841(class375.field5039, 3)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class221.field2851.field4142) {
            var1 |= 0x40;
        }
        class324.method1891(var1, 16383);
        class37.field703.method806(4, var1);
        class65.field1021.method188(var1, 86);
        class206.field2477.method1954(-4, var1);
        if (arg0 != 97693160) {
            method1396((byte) -33);
        }
        class276.field3774.method139((byte) -115, var1);
        class202.method1233(var1, 6339);
        class597.method3455(false, var1);
        class166.method1051(false, var1);
        class488.method2843(false, var1);
        class479.method2811((byte) -24);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(III)V", line = 154)
    private class231(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V", line = 167)
    public static void method1400(byte arg0) {
        field3003 = null;
        field3011 = null;
        field3012 = null;
        if (arg0 == 74) {
            field3009 = null;
        }
    }
}
