import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class99 extends class171 {

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "Z")
    public volatile boolean field1834 = true;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "Z")
    public boolean field1837;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "Z")
    public boolean field1838;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)I")
    public abstract int method21(int arg0);

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)[B")
    public abstract byte[] method20(int arg0);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)J")
    public static final long method765(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3585; var4++) {
            class197 var5 = var3.field3600[var4];
            if ((var5.field3523 >> 29 & 0x3L) == 2L && var5.field3541 == arg1 && var5.field3533 == arg2) {
                return var5.field3523;
            }
        }
        return 0L;
    }
}
