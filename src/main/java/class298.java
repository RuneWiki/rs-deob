import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class298 {

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Ldia;")
    private class246 field4323;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "J")
    public long field4321;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lee;")
    public static class706 field4316 = new class706(512);

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Ljda;")
    public static class239 field4322 = new class239(3000000, 200);

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Z")
    public static boolean field4324 = false;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lcka;")
    public static class186 field4317;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "Luu;")
    public static class303 field4325;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1889(int arg0) {
        class184.field2474 = 0;
        field4320++;
        if (arg0 != 1770587368) {
            field4324 = false;
        }
        int var1 = class89.field1233.method2405(arg0 ^ 0x9676FA7F);
        int var2 = class89.field1233.method2381(arg0 ^ 0x9676FB42);
        boolean var3 = class89.field1233.method2398(arg0 ^ 0xC7A48EE0) == 1;
        int var4 = class89.field1233.method2358((byte) -30);
        class750.method4145((byte) -31);
        class41.method281(598809411, var2);
        int var5 = (class206.field2700 - class89.field1233.field5459) / 16;
        class30.field450 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class30.field450[var6][var10] = class89.field1233.method2384(class471.method2773(arg0, 1770587280));
            }
        }
        class381.field5565 = null;
        class103.field1426 = null;
        class503.field6969 = new int[var5];
        class286.field4212 = new int[var5];
        class366.field5331 = new int[var5];
        class560.field7531 = new byte[var5][];
        class73.field1070 = new byte[var5][];
        class476.field6617 = new byte[var5][];
        class186.field2487 = new int[var5];
        class618.field8334 = new int[var5];
        class255.field3811 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var1 - (class597.field8132 >> 4)) / 8; var8 <= (((class597.field8132 >> 4) + var1) / 8); var8++) {
            for (int var9 = (var4 - (class628.field8800 >> 4)) / 8; var9 <= ((class628.field8800 >> 4) + var4) / 8; var9++) {
                class186.field2487[var7] = (var8 << 8) + var9;
                class618.field8334[var7] = class587.field7828.method2092("m" + var8 + "_" + var9, false);
                class366.field5331[var7] = class587.field7828.method2092("l" + var8 + "_" + var9, false);
                class503.field6969[var7] = class587.field7828.method2092("um" + var8 + "_" + var9, false);
                class286.field4212[var7] = class587.field7828.method2092("ul" + var8 + "_" + var9, false);
                var7++;
            }
        }
        class327.method2069(var1, var3, var4, 11, 91);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 80)
    public static void method1890(byte arg0) {
        field4316 = null;
        field4325 = null;
        field4317 = null;
        if (arg0 >= -80) {
            field4316 = null;
        }
        field4322 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 95)
    public static final void method1891(String arg0, byte arg1) {
        field4318++;
        System.exit(1);
        if (arg1 <= -46) {
            ;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)V", line = 110)
    public static final void method1892(int arg0, byte arg1, int arg2) {
        if (arg1 < 68) {
            field4325 = null;
        }
        field4314++;
        if (class21.field332 == class180.field2393) {
            if (!class77.method672(0, 1, -2, (byte) -26, arg2, arg0, 1, 0, false)) {
                class77.method672(0, 1, -3, (byte) -26, arg2, arg0, 1, 0, false);
            }
        } else if (!class77.method672(0, 1, -3, (byte) -26, arg2, arg0, 1, 0, false)) {
            class77.method672(0, 1, -2, (byte) -26, arg2, arg0, 1, 0, false);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Ljava/lang/String;", line = 135)
    public static final String method1893(int arg0) {
        field4315++;
        if (arg0 == -24940) {
            return class526.field7216 || class788.field10852 == null ? "" : class788.field10852.field4078;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V", line = 153)
    protected final void finalize() throws Throwable {
        field4319++;
        this.field4323.method1623(this.field4321, false);
        super.finalize();
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ldia;JI)V", line = 176)
    public class298(class246 arg0, long arg1, int arg2) {
        this.field4323 = arg0;
        this.field4321 = arg1;
    }
}
