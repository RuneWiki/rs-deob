import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class121 implements class217 {

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "Lmk;")
    private class506 field1533;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Lpl;")
    private class612 field1538;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lf;")
    private class536 field1537;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z")
    public final boolean method392(byte arg0) {
        field1534++;
        if (arg0 != 82) {
            method649(null, 59, 78);
        }
        return this.field1538.method3368(1912, this.field1533.field6693);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public final void method394(int arg0) {
        field1540++;
        this.field1537 = method649(this.field1538, 1024, this.field1533.field6693);
        if (arg0 >= -41) {
            this.field1537 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lpl;II)Lf;")
    public static final class536 method649(class612 arg0, int arg1, int arg2) {
        field1535++;
        class536 var3 = (class536) class186.field2355.method2418((long) arg2, (byte) 100);
        if (arg1 != 1024) {
            field1539 = 120;
        }
        if (var3 == null) {
            if (class377.field4751) {
                var3 = class32.field452.method1072(class661.method3721(arg0, arg2), true);
            } else {
                var3 = class672.method3774(arg0.method3344(110, arg2), arg1 ^ 0x443);
            }
            class186.field2355.method2409((long) arg2, var3, 1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lks;B)V")
    public static final void method650(class30 arg0, byte arg1) {
        if (arg1 > -125) {
            field1539 = 73;
        }
        field1536++;
        for (int var2 = 0; var2 < class207.field2620; var2++) {
            int var3 = class139.field1805[var2];
            class514 var4 = class351.field4490[var3];
            int var5 = arg0.method3501(-9268);
            if ((var5 & 0x40) != 0) {
                var5 += arg0.method3501(-9268) << 8;
            }
            if ((var5 & 0x400) != 0) {
                var5 += arg0.method3501(-9268) << 16;
            }
            class551.method3042(0, var4, arg0, var5, var3);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)V")
    public final void method395(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = class523.field7111 > class593.field8327 ? class523.field7111 : class593.field8327;
            int var4 = class316.field4060 < class244.field3022 ? class244.field3022 : class316.field4060;
            int var5 = this.field1537.method160();
            int var6 = this.field1537.method166();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var9 = var4;
                var10 = 0;
                var8 = var4 * var5 / var6;
                var7 = (var3 - var8) / 2;
            }
            this.field1537.method2899(var7, var10, var8, var9);
        }
        field1532++;
        if (arg1 != 6621) {
            this.method395(false, 26);
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lpl;Lmk;)V")
    public class121(class612 arg0, class506 arg1) {
        this.field1533 = arg1;
        this.field1538 = arg0;
    }
}
