import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class44 {

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "B")
    public byte field539;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "Lmv;")
    public class44 field547;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILht;)Lfe;", line = 5)
    public static final class638 method238(int arg0, class395 arg1) {
        field549++;
        class638 var2;
        if (class477.field6642 == null) {
            var2 = new class638();
        } else {
            var2 = class477.field6642;
            class477.field6642 = class477.field6642.field8564;
            class525.field7295--;
            var2.field8564 = null;
        }
        var2.field8567 = arg1;
        if (arg0 != 0) {
            method240(-79, 39);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZII)Lmv;", line = 38)
    public final class44 method239(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return null;
        } else {
            field546++;
            return new class44(this.field543, arg2, arg0, arg3, this.field539);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)Lfi;", line = 49)
    public static final class12 method240(int arg0, int arg1) {
        field538++;
        class12 var2 = (class12) class58.field830.method1945((byte) -52, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class587.field7997.method1572(arg1, 0, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class12 var5;
        try {
            int var4 = 18 % ((33 - arg0) / 54);
            var5 = class38.method207(true, var3);
        } catch (Exception var7) {
            throw new RuntimeException(var7.getMessage() + " S: " + arg1);
        }
        class58.field830.method1940(var5, (byte) -27, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Ldf;", line = 76)
    public final class623 method241(int arg0) {
        field540++;
        int var2 = 17 / ((arg0 + 68) / 35);
        return class497.method3010(this.field543, -59);
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIIIB)V", line = 93)
    public class44(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field543 = arg0;
        this.field539 = arg4;
        this.field535 = arg3;
        this.field542 = arg1;
        this.field550 = arg2;
    }
}
