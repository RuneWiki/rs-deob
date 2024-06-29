import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class7 {

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field75 = " has logged in.";

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[S")
    public static short[] field84 = new short[256];

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lnh;")
    public static class305 field74;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lkk;")
    public static class67 field83;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILbj;)V")
    private final void method39(int arg0, int arg1, int arg2, class215 arg3) {
        if (arg1 == 1) {
            this.field73 = arg3.method1379(-95);
        } else if (arg1 == 2) {
            this.field82 = arg3.method1374((byte) -60);
            this.field72 = arg3.method1374((byte) -60);
        }
        if (arg0 > -111) {
            this.method41(-20);
        }
        field78++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
    public static final void method40(int arg0, int arg1, int arg2) {
        field81++;
        class39 var3 = class149.method935(-87, arg0, 6);
        var3.method261(0);
        var3.field598 = arg2;
        int var4 = -39 % ((arg1 - 15) / 39);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Lta;")
    public final class203 method41(int arg0) {
        field71++;
        class203 var2 = (class203) class126.field1759.method950((long) this.field73, (byte) -45);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 2) {
            field79 = -102;
        }
        class203 var3 = class245.method1609(0, -121, this.field73, class59.field824);
        if (var3 != null) {
            class126.field1759.method942((long) this.field73, (byte) 125, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lbj;II)V")
    public final void method42(class215 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field74 = null;
        }
        while (true) {
            int var4 = arg0.method1374((byte) -60);
            if (var4 == 0) {
                field77++;
                return;
            }
            this.method39(arg1 ^ 0xFFFFFF8E, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method43(int arg0) {
        field75 = null;
        if (arg0 != 0) {
            field83 = null;
        }
        field74 = null;
        field84 = null;
        field83 = null;
    }
}
