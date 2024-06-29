import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class71 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lmr;")
    public class143 field879 = new class143();

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lmr;")
    private class143 field881;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lmr;")
    public final class143 method425(int arg0) {
        if (arg0 != 7) {
            return null;
        }
        field878++;
        class143 var2 = this.field879.field1677;
        if (this.field879 == var2) {
            this.field881 = null;
            return null;
        } else {
            this.field881 = var2.field1677;
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public final void method426(byte arg0) {
        if (arg0 >= -87) {
            return;
        }
        while (true) {
            class143 var2 = this.field879.field1677;
            if (this.field879 == var2) {
                field880++;
                this.field881 = null;
                return;
            }
            var2.method920((byte) -59);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public static final void method427(int arg0, int arg1) {
        class416 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class279 var4 = class219.field2709[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class262.field3367; var5++) {
                    for (int var6 = 0; var6 < class43.field512; var6++) {
                        var2 = var4.method1055(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class279 var10 = class219.field2709[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1050(var6, var5) - var10.method1050(var6, var5);
                                    int var12 = var4.method1050(var6 + 1, var5) - var10.method1050(var6 + 1, var5);
                                    int var13 = var4.method1050(var6 + 1, var5 + 1) - var10.method1050(var6 + 1, var5 + 1);
                                    int var14 = var4.method1050(var6, var5 + 1) - var10.method1050(var6, var5 + 1);
                                    var10.method1051(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Lmr;")
    public final class143 method428(int arg0) {
        field877++;
        class143 var2 = this.field881;
        if (this.field879 == var2) {
            this.field881 = null;
            return null;
        }
        this.field881 = var2.field1677;
        if (arg0 != 1) {
            this.method425(-52);
        }
        return var2;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class71() {
        this.field879.field1681 = this.field879;
        this.field879.field1677 = this.field879;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILmr;)V")
    public final void method429(int arg0, class143 arg1) {
        field876++;
        if (arg1.field1681 != null) {
            arg1.method920((byte) -59);
        }
        arg1.field1677 = this.field879;
        int var3 = -62 / ((-arg0 - 70) / 43);
        arg1.field1681 = this.field879.field1681;
        arg1.field1681.field1677 = arg1;
        arg1.field1677.field1681 = arg1;
    }
}
