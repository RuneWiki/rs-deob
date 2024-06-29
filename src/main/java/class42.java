import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class42 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lbl;")
    public static class191 field529 = new class191();

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Z")
    public static boolean field535 = true;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field539 = -2;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public int field538;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[B")
    public byte[] field528;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "[B")
    public byte[] field531;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[Lbf;")
    public static class58[] field536;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lak;Lak;Lun;Lak;Z)Z", line = 12)
    public static final boolean method212(class172 arg0, class172 arg1, class121 arg2, class172 arg3, boolean arg4) {
        class246.field3878 = arg0;
        if (!arg4) {
            method212((class172) null, (class172) null, (class121) null, (class172) null, true);
        }
        field530++;
        class211.field3459 = arg2;
        class253.field4040 = arg1;
        class65.field941 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 42)
    public static void method213(int arg0) {
        if (arg0 != -5) {
            field529 = (class191) null;
        }
        field536 = null;
        field529 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 62)
    public static final void method214(int arg0) {
        field537++;
        if (class320.field4966 != null) {
            class320.field4966.method91(-86);
            class320.field4966 = null;
        }
        class115.method795((byte) -96);
        class229.method1626();
        for (int var1 = 0; var1 < 4; var1++) {
            class126.field1964[var1].method737(-107);
        }
        class115.method793(false, (byte) -34);
        System.gc();
        class164.method1204((byte) 15, 2);
        class137.field2164 = false;
        class108.field1584 = -1;
        class48.method311(122, true);
        class63.field914 = 0;
        class142.field2215 = 0;
        class205.field3367 = 0;
        class221.field3548 = false;
        if (arg0 != -105) {
            method213(-85);
        }
        class70.field989 = 0;
        for (int var2 = 0; var2 < class175.field2895.length; var2++) {
            class175.field2895[var2] = null;
        }
        class275.field4435 = 0;
        class233.field3736 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class74.field1049[var3] = null;
            class324.field5033[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class99.field1445[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class108.field1593[var5][var6][var7] = null;
                }
            }
        }
        class55.method351(arg0 + 104);
        class39.field502 = 0;
        class25.method140(0);
        class301.method2145((byte) 68, true);
        try {
            class308.method2181("loggedout", 32627, class14.field159.field1951);
        } catch (Throwable var9) {
        }
    }
}
