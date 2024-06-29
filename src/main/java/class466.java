import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class466 implements class307 {

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Liu;")
    private class527 field6469;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "[Lwu;")
    private class338[] field6467;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field6460 = 765;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Loa;")
    private class635 field6465;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Z")
    private boolean field6466;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 7)
    public final void method1750(byte arg0) {
        field6462++;
        if (class453.field6284 != this.field6465) {
            this.field6465 = class453.field6284;
            this.field6466 = true;
        }
        if (arg0 != 39) {
            this.field6467 = null;
        }
        this.field6465.method343(0);
        class338[] var2 = this.field6467;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class338 var4 = var2[var3];
            if (var4 != null) {
                var4.method149(-29265);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 39)
    public final void method1752(int arg0) {
        field6463++;
        if (arg0 != 13901) {
            this.field6466 = false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V", line = 51)
    public static final void method2646(int arg0, int arg1) {
        field6459++;
        class244.method1415(-59);
        class332.method1870((byte) 79);
        class217.method1288(arg1, true, -115);
        if (arg0 != 8000) {
            return;
        }
        class264.method1501(-1);
        class647.method3631(class453.field6284, true);
        class178.method1052((byte) 3, class453.field6284);
        class548.method3098(arg0 ^ 0x4578, class453.field6284, class633.field8972);
        class566.method3200(-10);
        class292.method1666(124, class387.field5169);
        class14.method66(12287);
        class593.method3325((byte) -112);
        if (class351.field4601 == 3) {
            class508.method2921(4, (byte) -121);
        } else if (class351.field4601 == 7) {
            class508.method2921(8, (byte) -108);
        } else if (class351.field4601 == 10) {
            class508.method2921(11, (byte) -118);
        } else if (class351.field4601 == 1 || class351.field4601 == 2) {
            class312.field4030.method1750((byte) 39);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIZ)V", line = 92)
    public static final void method2647(int arg0, int arg1, int arg2, boolean arg3) {
        field6461++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class519.field7413 = arg1;
        if (arg2 != 8) {
            field6460 = -70;
        }
        class81.field856 = arg3;
        class507.field7297 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I", line = 109)
    public final int method1753(int arg0) {
        field6458++;
        int var2 = 0;
        class338[] var3 = this.field6467;
        int var4 = 0;
        if (arg0 != 26630) {
            this.method1752(107);
        }
        while (var3.length > var4) {
            class338 var5 = var3[var4];
            if (var5 == null || var5.method152(-18257)) {
                var2++;
            }
            var4++;
        }
        return var2 * 100 / this.field6467.length;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V", line = 137)
    public final void method1754(int arg0, boolean arg1) {
        field6468++;
        boolean var3 = true;
        if (arg0 <= 61) {
            return;
        }
        class338[] var4 = this.field6467;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class338 var6 = var4[var5];
            if (var6 != null) {
                var6.method725(var3 || this.field6466, -2536);
            }
        }
        this.field6466 = false;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Z", line = 164)
    public final boolean method1751(byte arg0) {
        field6464++;
        if (arg0 == -29) {
            return class112.field1300 >= this.field6469.field7532;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Liu;Lci;)V", line = 175)
    public class466(class527 arg0, class410 arg1) {
        this.field6469 = arg0;
        this.field6467 = new class338[this.field6469.field7527.length];
        for (int var3 = 0; var3 < this.field6467.length; var3++) {
            this.field6467[var3] = arg1.method2226(this.field6469.field7527[var3], 2);
        }
    }
}
