import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BCCRZRYI")
public class class6 {

    @OriginalMember(owner = "client!BCCRZRYI", name = "a", descriptor = "I")
    private int field135 = 616;

    @OriginalMember(owner = "client!BCCRZRYI", name = "b", descriptor = "Z")
    private boolean field136 = true;

    @OriginalMember(owner = "client!BCCRZRYI", name = "c", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!BCCRZRYI", name = "d", descriptor = "[LBEBSUZBY;")
    private class7[] field138;

    @OriginalMember(owner = "client!BCCRZRYI", name = "<init>", descriptor = "(II)V")
    public class6(int arg0, int arg1) {
        this.field137 = arg0;
        this.field138 = new class7[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class7 var4 = this.field138[var3] = new class7();
            var4.field140 = var4;
            var4.field141 = var4;
        }
        if (arg1 != 40545) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!BCCRZRYI", name = "a", descriptor = "(J)LBEBSUZBY;")
    public class7 method39(long arg0) {
        class7 var3 = this.field138[(int) (arg0 & (long) (this.field137 - 1))];
        for (class7 var4 = var3.field140; var4 != var3; var4 = var4.field140) {
            if (var4.field139 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!BCCRZRYI", name = "a", descriptor = "(JBLBEBSUZBY;)V")
    public void method40(long arg0, byte arg1, class7 arg2) {
        if (arg2.field141 != null) {
            arg2.method41();
        }
        class7 var5 = this.field138[(int) (arg0 & (long) (this.field137 - 1))];
        arg2.field141 = var5.field141;
        arg2.field140 = var5;
        arg2.field141.field140 = arg2;
        if (arg1 == 5) {
            boolean var6 = false;
            arg2.field140.field141 = arg2;
            arg2.field139 = arg0;
        }
    }
}
