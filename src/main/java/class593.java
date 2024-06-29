import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class593 {

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Lpca;")
    private class653 field8427 = new class653(64);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Ljo;")
    private class303 field8423;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field8430 = 0;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "[S")
    public static short[] field8432 = new short[256];

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "F")
    public static float field8429;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 4)
    public final void method3322(int arg0) {
        class653 var2 = this.field8427;
        synchronized (this.field8427) {
            this.field8427.method3684(-17200);
        }
        field8425++;
        if (arg0 != 4) {
            this.method3324(-128, 54);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V", line = 18)
    public final void method3323(int arg0, int arg1) {
        class653 var3 = this.field8427;
        synchronized (this.field8427) {
            this.field8427.method3691(false, arg1);
            if (arg0 != 26791) {
                this.field8427 = null;
            }
        }
        field8424++;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)Ljq;", line = 33)
    public final class468 method3324(int arg0, int arg1) {
        field8422++;
        class653 var3 = this.field8427;
        class468 var4;
        synchronized (this.field8427) {
            var4 = (class468) this.field8427.method3690((byte) -67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != -28590) {
            this.method3324(122, -34);
        }
        class303 var5 = this.field8423;
        byte[] var6;
        synchronized (this.field8423) {
            var6 = this.field8423.method1719(arg0, 32, 4);
        }
        class468 var7 = new class468();
        if (var6 != null) {
            var7.method2652((byte) -50, new class452(var6));
        }
        class653 var8 = this.field8427;
        synchronized (this.field8427) {
            this.field8427.method3683(var7, (byte) -77, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 67)
    public static final void method3325(byte arg0) {
        field8428++;
        int var1 = 0;
        if (arg0 >= -92) {
            field8432 = null;
        }
        if (class601.field8530.method1320(49, class150.field1711)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class601.field8530.field2876) {
            var1 |= 0x40;
        }
        class405.method2204(var1, 1);
        class195.field2339.method3727(var1, (byte) 67);
        class472.field6588.method1904(-105, var1);
        class608.field8585.method3274(-3617, var1);
        class203.field2487.method2049(-29127, var1);
        class623.method3491((byte) -114, var1);
        class291.method1646(var1, 122);
        class608.method3388(-115, var1);
        class521.method2970(256, var1);
        class675.method3778((byte) 127);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 107)
    public static void method3326(boolean arg0) {
        field8432 = null;
        if (!arg0) {
            field8429 = -0.18202753F;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 117)
    public static final void method3327(int arg0) {
        if (arg0 != -7857) {
            method3326(true);
        }
        class653 var1 = class39.field423;
        synchronized (class39.field423) {
            class39.field423.method3687((byte) -10);
        }
        field8431++;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V", line = 133)
    public final void method3328(boolean arg0) {
        field8426++;
        class653 var2 = this.field8427;
        synchronized (this.field8427) {
            if (!arg0) {
                method3327(-112);
            }
            this.field8427.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljda;ILjo;)V", line = 150)
    public class593(class207 arg0, int arg1, class303 arg2) {
        this.field8423 = arg2;
        this.field8423.method1727(-77, 32);
    }
}
