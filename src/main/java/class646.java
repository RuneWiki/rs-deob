import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class646 {

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    public int field9145 = 0;

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
    public int field9149 = 2048;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
    public int field9146 = 2048;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
    public int field9148 = 0;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IBLdga;)V", line = 8)
    private final void method3590(int arg0, byte arg1, class138 arg2) {
        if (arg1 != -68) {
            this.method3590(-96, (byte) 84, null);
        }
        field9147++;
        if (arg0 == 1) {
            this.field9145 = arg2.method957((byte) -78);
        } else if (arg0 == 2) {
            this.field9146 = arg2.method922((byte) -113);
        } else if (arg0 == 3) {
            this.field9149 = arg2.method922((byte) -125);
        } else if (arg0 == 4) {
            this.field9148 = arg2.method924(2);
            return;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lpq;III)Lrf;", line = 37)
    public static final class238 method3591(class159 arg0, int arg1, int arg2, int arg3) {
        field9144++;
        byte[] var4 = arg0.method1087(arg1, arg3, arg2 ^ 0x1);
        if (var4 == null) {
            return null;
        } else if (arg2 == 0) {
            return new class238(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ldga;Z)V", line = 55)
    public final void method3592(class138 arg0, boolean arg1) {
        if (arg1) {
            this.field9145 = -105;
        }
        field9143++;
        while (true) {
            int var3 = arg0.method957((byte) -106);
            if (var3 == 0) {
                return;
            }
            this.method3590(var3, (byte) -68, arg0);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)Z", line = 85)
    public static final boolean method3593(int arg0) {
        field9150++;
        if (arg0 != 21111) {
            return true;
        }
        try {
            if (class369.field5301 == 2) {
                if (class86.field1056 == null) {
                    class86.field1056 = class281.method1692(class168.field2093, class208.field2732, class265.field3643);
                    if (class86.field1056 == null) {
                        return false;
                    }
                }
                if (class582.field8025 == null) {
                    class582.field8025 = new class501(class155.field1922, class128.field1628);
                }
                if (class648.field9178.method320(class86.field1056, class582.field8025, 22050, (byte) -20, class147.field1868)) {
                    class648.field9178.method344(-34);
                    class648.field9178.method346(2, class333.field4865);
                    class648.field9178.method335(class159.field1987, class86.field1056, (byte) 14);
                    class168.field2093 = null;
                    class582.field8025 = null;
                    class369.field5301 = 0;
                    class86.field1056 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class648.field9178.method306(arg0 - 21235);
            class86.field1056 = null;
            class369.field5301 = 0;
            class168.field2093 = null;
            class582.field8025 = null;
        }
        return false;
    }
}
