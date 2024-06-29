import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class334 extends class337 {

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Lod;")
    public class349 field4704;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Lri;")
    public static class73 field4705 = new class73(81, 4);

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "Lri;")
    public static class73 field4709 = new class73(35, -2);

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Lki;")
    public static class498 field4712 = new class498(5, 1);

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "Lri;")
    public static class73 field4714 = new class73(53, 3);

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "Z")
    public boolean field4711;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "[Lf;")
    public static class529[] field4703;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method2031(int arg0) {
        if (arg0 == -3155) {
            field4710++;
            return this.field4711;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V", line = 16)
    public static final void method2032(int arg0, boolean arg1) {
        class110.method675(19315);
        int var2 = 99 / ((arg0 - 63) / 39);
        field4701++;
        if (class193.field2832 != 30 && class193.field2832 != 25) {
            return;
        }
        class248.field3637++;
        if (class248.field3637 < 50 && !arg1) {
            return;
        }
        class248.field3637 = 0;
        if (!class445.field6627 && class90.field1361 != null) {
            class390.field5879++;
            class291.method1861((byte) -104, class315.field4490);
            try {
                class90.field1361.method2311(class356.field5471.field3037, class356.field5471.field3036, 4900, 0);
                class356.field5471.field3037 = 0;
            } catch (IOException var3) {
                class445.field6627 = true;
            }
        }
        class110.method675(19315);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V", line = 47)
    public static void method2033(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field4705 = null;
        field4703 = null;
        field4709 = null;
        field4712 = null;
        field4714 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)V", line = 67)
    public static final void method2036(boolean arg0, int arg1) {
        class214.field3120 = 0;
        field4708++;
        class22.field234 = 0;
        class209.method1454((byte) 127);
        class19.method127(arg0, 3544);
        class134.method891(0);
        for (int var2 = 0; var2 < class22.field234; var2++) {
            int var4 = class471.field6946[var2];
            if (class317.field4559 != class193.field2821[var4].field1939) {
                if (class193.field2821[var4].field2472.method2097(105)) {
                    class497.method2980(0, class193.field2821[var4]);
                }
                class193.field2821[var4].method1160(null, 73);
                class193.field2821[var4] = null;
            }
        }
        if (arg1 != 663) {
            field4703 = null;
        }
        if (class352.field5395 != class66.field1009.field3037) {
            throw new RuntimeException("gnp1 pos:" + class66.field1009.field3037 + " psize:" + class352.field5395);
        }
        for (int var3 = 0; var3 < class402.field6044; var3++) {
            if (class193.field2821[class378.field5766[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class402.field6044);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)I", line = 119)
    public int method2037(int arg0) {
        if (arg0 == 0) {
            field4702++;
            return 0;
        } else {
            return -100;
        }
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)I", line = 142)
    public final int method2039(int arg0) {
        int var2 = 7 / ((-arg0 - 40) / 52);
        field4707++;
        return 1;
    }

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "(I)Z", line = 157)
    public final boolean method2041(int arg0) {
        if (arg0 != -1) {
            field4703 = null;
        }
        field4706++;
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lod;)V", line = 168)
    public class334(class349 arg0) {
        this.field4704 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZII)V", line = 185)
    public static final void method2043(int arg0, boolean arg1, int arg2, int arg3) {
        field4713++;
        if (!arg1) {
            method2032(-27, true);
        }
        int var4 = class426.field6401.field1018 * arg3 >> 8;
        if (arg0 == -1 && !class104.field1515) {
            class190.method1297(arg1);
        } else if (arg0 != -1 && (class386.field5852 != arg0 || !class6.method40((byte) -64)) && var4 != 0 && !class104.field1515) {
            class204.method1379((byte) 61, class465.field6881, var4, false, arg2, 0, arg0);
        }
        class386.field5852 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V")
    public abstract void method2030(byte arg0, int arg1);

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
    public abstract void method2034(int arg0);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V")
    public abstract void method2035(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)Z")
    public abstract boolean method2038(int arg0);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILah;ILah;)V")
    public abstract void method2040(int arg0, class260 arg1, int arg2, class260 arg3);

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "(I)Z")
    public abstract boolean method2042(int arg0);
}
