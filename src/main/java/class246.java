import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class246 extends class25 {

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public int field4274 = 0;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "Lcd;")
    public static class64 field4286 = class44.method335((byte) 71, "http:)4)4");

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "Lcd;")
    private static class64 field4281 = class44.method335((byte) 71, "Select");

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "Lcd;")
    public static class64 field4291 = field4281;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public int field4265;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public int field4266;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public int field4269;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
    public int field4279;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "Ljm;")
    public static class226 field4277;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "Lfd;")
    public class232 field4289;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "Lqi;")
    public class290 field4275;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "Lug;")
    public class294 field4270;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "Lug;")
    public class294 field4283;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "Lfk;")
    public class41 field4284;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "Z")
    public boolean field4273;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "[I")
    public int[] field4292;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V", line = 6)
    public static final void method1778(int arg0) {
        if (class315.field5334 != null) {
            class315.field5334.method1059((byte) -73);
        }
        if (arg0 != 5) {
            method1784(84);
        }
        if (class94.field1747 != null) {
            class94.field1747.method1059((byte) -113);
        }
        field4278++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)Leh;", line = 28)
    public static final class158 method1779(byte arg0, int arg1) {
        field4282++;
        class158 var2 = (class158) class304.field5192.method329((long) arg1, (byte) -63);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -64) {
            field4277 = (class226) null;
        }
        byte[] var3 = class14.field317.method1580(arg0 ^ 0xFFFFFFC0, arg1, 5);
        class158 var4 = new class158();
        if (var3 != null) {
            var4.method1139(false, new class13(var3));
        }
        class304.field5192.method331((long) arg1, var4, (byte) -120);
        return var4;
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V", line = 53)
    public static final void method1780(int arg0) {
        class251.field4359 = null;
        field4288++;
        class28.field446 = null;
        class298.field5135 = null;
        if (arg0 > -83) {
            field4277 = (class226) null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)V", line = 72)
    public final void method1781(int arg0) {
        field4287++;
        int var2 = this.field4294;
        if (arg0 != 0) {
            return;
        }
        if (this.field4275 != null) {
            class290 var5 = this.field4275.method2001(true);
            if (var5 == null) {
                this.field4294 = -1;
                this.field4292 = null;
                this.field4279 = 0;
                this.field4265 = 0;
                this.field4269 = 0;
            } else {
                this.field4294 = var5.field4959;
                this.field4279 = var5.field4994;
                this.field4292 = var5.field5015;
                this.field4269 = var5.field5004;
                this.field4265 = var5.field4991 * 128;
            }
        } else if (this.field4289 != null) {
            int var3 = class196.method1378(this.field4289, 128);
            if (var2 != var3) {
                this.field4294 = var3;
                class6 var4 = this.field4289.field3911;
                if (var4.field144 != null) {
                    var4 = var4.method66(0);
                }
                if (var4 == null) {
                    this.field4265 = 0;
                } else {
                    this.field4265 = var4.field137 * 128;
                }
            }
        } else if (this.field4284 != null) {
            this.field4294 = class44.method336(this.field4284, -111);
            this.field4265 = this.field4284.field675 * 128;
        }
        if (this.field4294 != var2 && this.field4283 != null) {
            class250.field4341.method1419(this.field4283);
            this.field4283 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V", line = 147)
    public static void method1782(int arg0) {
        field4291 = null;
        field4277 = null;
        int var1 = -118 / ((57 - arg0) / 54);
        field4286 = null;
        field4281 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 171)
    public static final void method1783(int arg0, int arg1) {
        if (arg1 != 60) {
            method1784(-91);
        }
        class299 var2 = class158.method1135(arg0, -124, 3);
        var2.method2093((byte) -86);
        field4272++;
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "(I)V", line = 187)
    public static final void method1784(int arg0) {
        field4280++;
        class227 var1 = (class227) class151.field2687.method778(0);
        if (arg0 != 60) {
            method1784(105);
        }
        while (var1 != null) {
            class267 var2 = var1.field3856;
            if (class20.field364 != var2.field4580 || var2.field4600) {
                var1.method232(128);
            } else if (var2.field4596 <= class29.field482) {
                var2.method1870(class249.field4327, -111);
                if (var2.field4600) {
                    var1.method232(128);
                } else {
                    class11.method93(var2.field4580, var2.field4579, var2.field4587, var2.field4590, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class227) class151.field2687.method775(arg0 + 26457);
        }
    }
}
