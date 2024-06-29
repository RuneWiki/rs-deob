import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class334 {

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Ljda;")
    private class239 field4858 = new class239(64);

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Laj;")
    private class333 field4860;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Ldd;")
    public class734 field4866;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lsca;")
    public static class49 field4862 = new class49(1);

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field4867 = 0;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Ljw;")
    public static class581 field4863 = new class581(55, -2);

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "[I")
    public static int[] field4868 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "F")
    public static float field4864;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Luu;")
    public static class303 field4865;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 3)
    public final void method2122(boolean arg0) {
        class239 var2 = this.field4858;
        synchronized (this.field4858) {
            this.field4858.method1555((byte) -3);
            if (!arg0) {
                this.field4866 = null;
            }
        }
        field4854++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;)I", line = 18)
    public static final int method2123(int arg0, String arg1) {
        if (arg0 != 1) {
            field4856 = 46;
        }
        field4855++;
        return class543.method3092(10, true, arg1, true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLln;)I", line = 32)
    public static final int method2124(byte arg0, class400 arg1) {
        field4859++;
        int var2 = 21 / ((47 - arg0) / 55);
        if (class521.field7150 == arg1) {
            return 7681;
        } else if (class364.field5299 == arg1) {
            return 8448;
        } else if (class412.field5923 == arg1) {
            return 34165;
        } else if (class187.field2499 == arg1) {
            return 260;
        } else if (class165.field2224 == arg1) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 61)
    public static void method2125(int arg0) {
        field4863 = null;
        if (arg0 == 8448) {
            field4868 = null;
            field4862 = null;
            field4865 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V", line = 75)
    public final void method2126(boolean arg0) {
        if (arg0) {
            return;
        }
        class239 var2 = this.field4858;
        synchronized (this.field4858) {
            this.field4858.method1552(14);
        }
        field4857++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V", line = 90)
    public final void method2127(byte arg0, int arg1) {
        field4853++;
        if (arg0 == 68) {
            class239 var3 = this.field4858;
            synchronized (this.field4858) {
                this.field4858.method1546(arg1, (byte) -8);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(BI)Lvb;", line = 113)
    public final class208 method2128(byte arg0, int arg1) {
        field4861++;
        if (arg0 != -75) {
            this.method2128((byte) 66, 118);
        }
        class239 var3 = this.field4858;
        class208 var4;
        synchronized (this.field4858) {
            var4 = (class208) this.field4858.method1541(-10, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field4860;
        byte[] var6;
        synchronized (this.field4860) {
            var6 = this.field4860.method2095(arg1, 32, 1);
        }
        class208 var7 = new class208();
        var7.field2715 = this;
        if (var6 != null) {
            var7.method1390(76, new class376(var6));
        }
        class239 var8 = this.field4858;
        synchronized (this.field4858) {
            this.field4858.method1544(true, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lgia;ILaj;Ldd;)V", line = 160)
    public class334(class285 arg0, int arg1, class333 arg2, class734 arg3) {
        this.field4860 = arg2;
        this.field4860.method2090(32, false);
        this.field4866 = arg3;
    }
}
