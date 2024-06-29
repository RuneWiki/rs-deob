import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class131 {

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lar;")
    private class479 field1921;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "S")
    public static short field1923 = 320;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Luj;")
    private class260 field1920;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILar;)V")
    public final void method896(int arg0, class479 arg1) {
        if (arg0 != 320) {
            method898(-17, -108, (byte) 105, -99, 41);
        }
        this.field1921 = arg1;
        field1922++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Luj;")
    public final class260 method897(int arg0) {
        field1918++;
        class260 var2 = this.field1921.field6997.field3612;
        if (arg0 >= -50) {
            this.method896(96, null);
        }
        if (this.field1921.field6997 == var2) {
            this.field1920 = null;
            return null;
        } else {
            this.field1920 = var2.field3612;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIBII)V")
    public static final void method898(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1917++;
        if (class174.field2592 == 1) {
            class30.field403[class283.field3875 / 100].method85(class179.field2629 - 8, class116.field1743 + -8);
        }
        int var5 = 95 / ((-arg2 - 44) / 58);
        if (class174.field2592 == 2) {
            class30.field403[(class283.field3875 / 100) + 4].method85(class179.field2629 - 8, class116.field1743 - 8);
        }
        class177.method1146((byte) -94);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Lhm;")
    public static final class147 method899(int arg0, int arg1, int arg2) {
        class486 var3 = class89.field1305[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7103;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class131() {
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lar;)V")
    public class131(class479 arg0) {
        this.field1921 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Luj;")
    public final class260 method900(int arg0) {
        if (arg0 != -8) {
            return null;
        }
        field1926++;
        class260 var2 = this.field1920;
        if (this.field1921.field6997 == var2) {
            this.field1920 = null;
            return null;
        } else {
            this.field1920 = var2.field3612;
            return var2;
        }
    }
}
