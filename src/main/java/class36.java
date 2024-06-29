import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LTJSGGCA")
public class class36 {

    @OriginalMember(owner = "client!LTJSGGCA", name = "a", descriptor = "Z")
    private boolean field980 = true;

    @OriginalMember(owner = "client!LTJSGGCA", name = "b", descriptor = "I")
    private int field981 = -645;

    @OriginalMember(owner = "client!LTJSGGCA", name = "c", descriptor = "B")
    private byte field982 = -54;

    @OriginalMember(owner = "client!LTJSGGCA", name = "d", descriptor = "I")
    private int field983 = 9;

    @OriginalMember(owner = "client!LTJSGGCA", name = "e", descriptor = "Z")
    private boolean field984 = false;

    @OriginalMember(owner = "client!LTJSGGCA", name = "f", descriptor = "I")
    private int field985 = 866;

    @OriginalMember(owner = "client!LTJSGGCA", name = "g", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!LTJSGGCA", name = "h", descriptor = "[LTVKHSKYG;")
    private class56[] field987;

    @OriginalMember(owner = "client!LTJSGGCA", name = "<init>", descriptor = "(II)V")
    public class36(int arg0, int arg1) {
        this.field986 = arg0;
        this.field987 = new class56[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class56 var4 = this.field987[var3] = new class56();
            var4.field1533 = var4;
            var4.field1534 = var4;
        }
        if (arg1 >= 0) {
            this.field981 = 207;
        }
    }

    @OriginalMember(owner = "client!LTJSGGCA", name = "a", descriptor = "(J)LTVKHSKYG;")
    public class56 method363(long arg0) {
        class56 var3 = this.field987[(int) (arg0 & (long) (this.field986 - 1))];
        for (class56 var4 = var3.field1533; var4 != var3; var4 = var4.field1533) {
            if (var4.field1532 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!LTJSGGCA", name = "a", descriptor = "(ILTVKHSKYG;J)V")
    public void method364(int arg0, class56 arg1, long arg2) {
        if (arg1.field1534 != null) {
            arg1.method518();
        }
        class56 var5 = this.field987[(int) (arg2 & (long) (this.field986 - 1))];
        if (this.field983 != arg0) {
            this.field980 = !this.field980;
        }
        arg1.field1534 = var5.field1534;
        arg1.field1533 = var5;
        arg1.field1534.field1533 = arg1;
        arg1.field1533.field1534 = arg1;
        arg1.field1532 = arg2;
    }
}
