import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class5 extends class55 implements class601 {

    @OriginalMember(owner = "client!uha", name = "C", descriptor = "Laq;")
    public static class494 field69 = new class494(4);

    @OriginalMember(owner = "client!uha", name = "G", descriptor = "Lss;")
    public static class307 field73 = new class307("", 14);

    @OriginalMember(owner = "client!uha", name = "I", descriptor = "B")
    private byte field75;

    @OriginalMember(owner = "client!uha", name = "w", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!uha", name = "x", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!uha", name = "y", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!uha", name = "A", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!uha", name = "B", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!uha", name = "D", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!uha", name = "E", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!uha", name = "F", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!uha", name = "H", descriptor = "[Lnfa;")
    public static class745[] field74;

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Lfc;Z)V")
    public class5(class642 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
    public final void method32(int arg0) {
        super.method32(arg0);
        ++field72;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(III)V")
    public static final void method33(int arg0, int arg1, int arg2) {
        ++field71;
        class371 var3 = class490.method2867((byte) -128, 14, (long) arg2);
        var3.method2212(-100);
        var3.field5233 = arg1;
        int var4 = 43 % ((arg0 - 1) / 62);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(ILkm;)Lbc;")
    public static final class11 method34(int arg0, class208 arg1) {
        if (arg0 != -20292) {
            method34(75, (class208) null);
        }
        ++field70;
        class11 var2;
        if (class668.field9391 != null) {
            var2 = class668.field9391;
            class668.field9391 = class668.field9391.field145;
            --class60.field913;
            var2.field145 = null;
        } else {
            var2 = new class11();
        }
        var2.field143 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(B)I")
    public final int method35(byte arg0) {
        if (arg0 <= 71) {
            return 6;
        } else {
            ++field67;
            return super.method35((byte) 83);
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)Z")
    public final boolean method36(int arg0) {
        if (arg0 != 6740) {
            field73 = null;
        }
        ++field68;
        return super.method604((byte) -22, super.field866.field9131);
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(B)V")
    public static void method37(byte arg0) {
        field69 = null;
        field74 = null;
        field73 = null;
        int var1 = -3 / ((arg0 - -19) / 50);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(BILjaclib/memory/Source;I)Z")
    public final boolean method38(byte arg0, int arg1, Source arg2, int arg3) {
        this.field75 = (byte) arg1;
        ++field63;
        if (arg0 <= 93) {
            field73 = null;
        }
        super.method609(arg3, 0, arg2);
        return true;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method39(boolean arg0, int arg1) {
        ++field64;
        if (arg1 <= 27) {
            this.method36(-124);
        }
        return super.method603(arg0, 35040, super.field866.field9131);
    }

    @OriginalMember(owner = "client!uha", name = "g", descriptor = "(B)I")
    public final int method40(byte arg0) {
        ++field66;
        if (arg0 != 96) {
            field74 = null;
        }
        return this.field75;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IBI)Z")
    public final boolean method41(int arg0, byte arg1, int arg2) {
        this.field75 = (byte) arg2;
        ++field65;
        int var4 = 106 % ((-54 - arg1) / 53);
        super.method602(17154, arg0);
        return true;
    }
}
