import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class587 extends class283 {

    @OriginalMember(owner = "client!oea", name = "M", descriptor = "[I")
    public static int[] field8206 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!oea", name = "B", descriptor = "I")
    public int field8195;

    @OriginalMember(owner = "client!oea", name = "C", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!oea", name = "D", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!oea", name = "F", descriptor = "I")
    public int field8199;

    @OriginalMember(owner = "client!oea", name = "G", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!oea", name = "H", descriptor = "I")
    public int field8201;

    @OriginalMember(owner = "client!oea", name = "I", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!oea", name = "J", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!oea", name = "K", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!oea", name = "L", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!oea", name = "N", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!oea", name = "O", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!oea", name = "P", descriptor = "I")
    public int field8209;

    @OriginalMember(owner = "client!oea", name = "E", descriptor = "J")
    public long field8198;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)I")
    public final int method1701(int arg0) {
        int var2 = 119 % ((68 - arg0) / 46);
        field8202++;
        return this.field8209;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)I")
    public final int method1702(byte arg0) {
        field8203++;
        if (arg0 > -26) {
            this.method1706(false);
        }
        return this.field8195;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)V")
    public static final void method3265(boolean arg0) {
        field8200++;
        if (class262.field3329) {
            return;
        }
        class408.method2418(-44, class93.field1177);
        if (class618.field8658 != null) {
            class408.method2418(-126, class618.field8658);
        }
        class262.field3329 = arg0;
    }

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "(I)I")
    public final int method1705(int arg0) {
        if (arg0 != -3668) {
            method3266(false, -107);
        }
        field8197++;
        return this.field8199;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZI)I")
    public static final int method3266(boolean arg0, int arg1) {
        if (arg0) {
            field8196++;
            return arg1 >>> 10;
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "(I)J")
    public final long method1704(int arg0) {
        int var2 = 123 / ((arg0 - 25) / 45);
        field8205++;
        return this.field8198;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3267(int arg0, int arg1, byte arg2) {
        field8204++;
        if (arg2 != -55) {
            method3268((byte) -4);
        }
        return false;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)I")
    public final int method1706(boolean arg0) {
        field8207++;
        if (!arg0) {
            method3267(69, 21, (byte) 75);
        }
        return this.field8201;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(B)V")
    public static void method3268(byte arg0) {
        if (arg0 != 24) {
            field8206 = null;
        }
        field8206 = null;
    }
}
