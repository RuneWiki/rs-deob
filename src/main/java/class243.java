import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class243 extends class60 {

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "[Lsg;")
    public class243[] field4234;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "Z")
    public boolean field4230;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Lub;")
    public static class227 field4208 = class257.method1749("", 17263);

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "S")
    public static short field4223 = 1;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "[I")
    public static int[] field4214 = new int[256];

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "Lna;")
    public static class209 field4220 = null;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "Lub;")
    public static class227 field4229 = class257.method1749("overlay2)3dat", 17263);

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "Lub;")
    public static class227 field4231 = class257.method1749(" zuerst von Ihrer Freunde)2Liste(Q", 17263);

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "Lta;")
    public static class105 field4212;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "Loj;")
    public class160 field4215;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "Lcb;")
    public class222 field4213;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static final void method1613(int arg0) {
        if (class134.field2341 != null) {
            class11 var1 = class134.field2341;
            synchronized (class134.field2341) {
                class134.field2341 = null;
            }
        }
        if (arg0 != -1) {
            field4208 = null;
        }
        field4222++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)[I")
    public final int[] method1614(int arg0, int arg1, int arg2) {
        if (arg2 <= 79) {
            this.method1616(98, -128, -23);
        }
        field4232++;
        return this.field4234[arg0].field4230 ? this.field4234[arg0].method77(-116, arg1) : this.field4234[arg0].method80(230, arg1)[0];
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lub;IZ)V")
    public static final void method1615(class227 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        class176.field2935.method664((byte) -109, 230);
        class176.field2935.method1442(23440, arg0.method1485(122));
        field4211++;
        class118.field2150++;
        class176.field2935.method1466(arg1, -92);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[[I")
    public int[][] method80(int arg0, int arg1) {
        field4216++;
        if (arg0 != 230) {
            this.field4234 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)[[I")
    public final int[][] method1616(int arg0, int arg1, int arg2) {
        field4221++;
        if (arg0 != -1) {
            this.method80(86, -12);
        }
        if (this.field4234[arg2].field4230) {
            int[] var4 = this.field4234[arg2].method77(arg0 - 71, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4234[arg2].method80(230, arg1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public static void method1617(int arg0) {
        field4208 = null;
        field4212 = null;
        field4229 = null;
        field4214 = null;
        field4220 = null;
        field4231 = null;
        if (arg0 != 0) {
            field4229 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[I")
    public int[] method77(int arg0, int arg1) {
        int var3 = -91 / ((arg0 + 15) / 51);
        field4235++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lnj;ZI)V")
    public void method81(class226 arg0, boolean arg1, int arg2) {
        field4217++;
        if (arg1) {
            field4223 = -74;
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)I")
    public int method228(int arg0) {
        if (arg0 != -23565) {
            this.field4234 = null;
        }
        field4225++;
        return -1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if ((arg5 - arg3) >= class125.field2234 && (arg3 + arg5) <= class19.field331 && (arg2 - arg3) >= class161.field2718 && (arg2 + arg3) <= class46.field817) {
            class250.method1675(arg2, arg4, arg5, (byte) -92, arg3, arg1, arg0);
        } else {
            class59.method358(arg1, arg0, (byte) -109, arg3, arg2, arg5, arg4);
        }
        field4209++;
        if (arg6) {
            method1618(-100, 31, -114, -58, 87, 62, false);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)V")
    public void method170(boolean arg0) {
        field4224++;
        if (arg0) {
            method1620(118, -21, -47, 127);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)I")
    public int method449(byte arg0) {
        field4233++;
        return arg0 == -64 ? -1 : 15;
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V")
    public void method227(int arg0) {
        if (arg0 != 256) {
            this.field4230 = true;
        }
        field4228++;
        if (this.field4230) {
            this.field4215.method983(true);
            this.field4215 = null;
        } else {
            this.field4213.method1405(-87);
            this.field4213 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V")
    public static final void method1619(int arg0) {
        field4218++;
        if (arg0 != 0) {
            method1619(52);
        }
        class131.field2292.method1723(-4173);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
    public static final void method1620(int arg0, int arg1, int arg2, int arg3) {
        class108 var4 = class261.field4539[arg0][arg1][arg2];
        if (var4 != null) {
            class261.field4539[arg0][arg1][arg2].field2010 = arg3;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI)V")
    public final void method1621(int arg0, byte arg1, int arg2) {
        if (arg1 < 90) {
            field4220 = null;
        }
        field4219++;
        int var4 = this.field4236 == 255 ? arg0 : this.field4236;
        if (this.field4230) {
            this.field4215 = new class160(var4, arg0, arg2);
        } else {
            this.field4213 = new class222(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IZ)V")
    public class243(int arg0, boolean arg1) {
        this.field4234 = new class243[arg0];
        this.field4230 = arg1;
    }
}
