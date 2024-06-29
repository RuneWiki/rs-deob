import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class158 {

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Ljda;")
    private class239 field2182 = new class239(64);

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Laj;")
    private class333 field2181;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Laj;")
    public class333 field2184;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Z")
    public static boolean field2174;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method1157(int arg0, int arg1) {
        field2176++;
        if (arg1 != -127) {
            return true;
        }
        for (class275 var2 = (class275) class280.field4138.method2551((byte) -108); var2 != null; var2 = (class275) class280.field4138.method2542(-95)) {
            if (class18.method146(var2.field4080, -13) && (long) arg0 == var2.field4079) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)V", line = 28)
    public final void method1158(byte arg0, int arg1) {
        field2183++;
        class239 var3 = this.field2182;
        synchronized (this.field2182) {
            this.field2182.method1546(arg1, (byte) -8);
        }
        if (arg0 != -96) {
            this.field2184 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIB)I", line = 42)
    public static final int method1159(int arg0, int arg1, byte arg2) {
        field2175++;
        if (arg2 > -3) {
            return -101;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljp;I)Ljl;", line = 64)
    public static final class286 method1160(class376 arg0, int arg1) {
        field2173++;
        String var2 = arg0.method2379((byte) 85);
        if (arg1 != 65408) {
            method1157(-56, -50);
        }
        class564 var3 = class706.method3954(118)[arg0.method2398(arg1 - 1372812664)];
        class631 var4 = class709.method3970(-1)[arg0.method2398(-1372747256)];
        int var5 = arg0.method2355(3);
        int var6 = arg0.method2355(3);
        int var7 = arg0.method2398(-1372747256);
        int var8 = arg0.method2398(arg1 - 1372812664);
        int var9 = arg0.method2398(-1372747256);
        int var10 = arg0.method2359(-1);
        int var11 = arg0.method2359(-1);
        int var12 = arg0.method2384(30);
        int var13 = arg0.method2384(arg1 - 65313);
        int var14 = arg0.method2384(arg1 - 65344);
        return new class286(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 104)
    public final void method1161(int arg0) {
        field2180++;
        if (arg0 < -120) {
            class239 var2 = this.field2182;
            synchronized (this.field2182) {
                this.field2182.method1552(-120);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)Lgd;", line = 118)
    public final class360 method1162(int arg0, int arg1) {
        field2178++;
        class239 var3 = this.field2182;
        class360 var4;
        synchronized (this.field2182) {
            var4 = (class360) this.field2182.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field2181;
        byte[] var6;
        synchronized (this.field2181) {
            var6 = this.field2181.method2095(arg0, 3, arg1 ^ 0x3);
        }
        class360 var7 = new class360();
        var7.field5266 = this;
        if (var6 != null) {
            var7.method2257(new class376(var6), 0);
        }
        class239 var8 = this.field2182;
        synchronized (this.field2182) {
            this.field2182.method1544(true, var7, (long) arg0);
        }
        if (arg1 != 2) {
            this.field2181 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V", line = 152)
    public static final void method1163(boolean arg0) {
        class360.field5267 = class548.field7413.field3810 + class548.field7413.field3807 + 2;
        field2177++;
        class588.field7848 = class7.field76.field3810 + class7.field76.field3807 + 2;
        class257.field3837 = new String[500];
        int var1 = 0;
        if (!arg0) {
            method1157(-10, 17);
        }
        while (var1 < class257.field3837.length) {
            class257.field3837[var1] = "";
            var1++;
        }
        class164.method1188((byte) -107, class474.field6536.method2780(104, class38.field589));
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lgia;ILaj;Laj;)V", line = 191)
    public class158(class285 arg0, int arg1, class333 arg2, class333 arg3) {
        this.field2181 = arg2;
        this.field2184 = arg3;
        this.field2181.method2090(3, false);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 180)
    public final void method1164(int arg0) {
        class239 var2 = this.field2182;
        synchronized (this.field2182) {
            int var3 = -88 % ((36 - arg0) / 45);
            this.field2182.method1555((byte) -3);
        }
        field2179++;
    }
}
