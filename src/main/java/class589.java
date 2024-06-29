import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class589 {

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public int field8026 = -1;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    private int field8029 = -1;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Ljava/lang/String;")
    private String field8023 = "";

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field8024 = 0;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    private int field8033 = -1;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public int field8022 = 0;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    private int field8039 = -1;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public int field8031 = -1;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public int field8034 = 70;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public int field8035 = -1;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    private int field8021 = -1;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field8020 = 0;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public int field8044 = 16777215;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field8043 = 1;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lbf;")
    public static class536 field8030 = new class536();

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lsb;")
    public class293 field8038;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lha;Z)Lmi;")
    public final class496 method3357(class59 arg0, boolean arg1) {
        field8040++;
        if (!arg1) {
            return null;
        } else if (this.field8029 < 0) {
            return null;
        } else {
            class496 var3 = (class496) this.field8038.field4099.method992((long) this.field8029, -62);
            if (var3 == null) {
                this.method3363(arg0, -41);
                var3 = (class496) this.field8038.field4099.method992((long) this.field8029, 53);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lha;I)Lmi;")
    public final class496 method3358(class59 arg0, int arg1) {
        field8028++;
        if (this.field8039 < 0) {
            return null;
        }
        class496 var3 = (class496) this.field8038.field4099.method992((long) this.field8039, -59);
        if (arg1 < 23) {
            return null;
        }
        if (var3 == null) {
            this.method3363(arg0, -118);
            var3 = (class496) this.field8038.field4099.method992((long) this.field8039, 123);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method3359(byte arg0) {
        field8042++;
        if (class216.field3137) {
            return;
        }
        class392.field5766 = true;
        class55.field1119 += (12.0F - class55.field1119) / 2.0F;
        class216.field3137 = true;
        if (arg0 != 68) {
            field8030 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lha;B)Lmi;")
    public final class496 method3360(class59 arg0, byte arg1) {
        field8032++;
        if (this.field8021 < 0) {
            return null;
        }
        class496 var3 = (class496) this.field8038.field4099.method992((long) this.field8021, 118);
        if (var3 == null) {
            this.method3363(arg0, -66);
            var3 = (class496) this.field8038.field4099.method992((long) this.field8021, 119);
        }
        int var4 = 20 % ((arg1 - 19) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method3361(int arg0) {
        if (arg0 != 0) {
            field8025 = -128;
        }
        field8030 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lcea;II)V")
    private final void method3362(class215 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field8035 = arg0.method1478(842397944);
        } else if (arg2 == 2) {
            this.field8044 = arg0.method1499(-1);
        } else if (arg2 == 3) {
            this.field8021 = arg0.method1478(842397944);
        } else if (arg2 == 4) {
            this.field8029 = arg0.method1478(842397944);
        } else if (arg2 == 5) {
            this.field8033 = arg0.method1478(842397944);
        } else if (arg2 == 6) {
            this.field8039 = arg0.method1478(842397944);
        } else if (arg2 == 7) {
            this.field8024 = arg0.method1520(13638);
        } else if (arg2 == 8) {
            this.field8023 = arg0.method1519(arg1 ^ 0x34AF);
        } else if (arg2 == 9) {
            this.field8034 = arg0.method1478(842397944);
        } else if (arg2 == 10) {
            this.field8022 = arg0.method1520(13638);
        } else if (arg2 == 11) {
            this.field8026 = 0;
        } else if (arg2 == 12) {
            this.field8031 = arg0.method1535(255);
        } else if (arg2 == 13) {
            this.field8020 = arg0.method1520(arg1 ^ 0xFFFFCAB8);
        } else if (arg2 == 14) {
            this.field8026 = arg0.method1478(842397944);
        }
        if (arg1 != -2) {
            this.method3366(-112, 38);
        }
        field8037++;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lha;I)V")
    private final void method3363(class59 arg0, int arg1) {
        field8046++;
        class91 var3 = this.field8038.field4110;
        if (this.field8021 >= 0 && this.field8038.field4099.method992((long) this.field8021, 121) == null && var3.method874(false, this.field8021)) {
            class267 var4 = class267.method1771(var3, this.field8021);
            this.field8038.field4099.method991(arg0.method356(var4, true), (long) this.field8021, (byte) -112);
        }
        if (this.field8033 >= 0 && this.field8038.field4099.method992((long) this.field8033, -99) == null && var3.method874(false, this.field8033)) {
            class267 var5 = class267.method1771(var3, this.field8033);
            this.field8038.field4099.method991(arg0.method356(var5, true), (long) this.field8033, (byte) -128);
        }
        if (this.field8029 >= 0 && this.field8038.field4099.method992((long) this.field8029, 86) == null && var3.method874(false, this.field8029)) {
            class267 var6 = class267.method1771(var3, this.field8029);
            this.field8038.field4099.method991(arg0.method356(var6, true), (long) this.field8029, (byte) -108);
        }
        if (arg1 > -7) {
            this.field8034 = -14;
        }
        if (this.field8039 >= 0 && this.field8038.field4099.method992((long) this.field8039, -83) == null && var3.method874(false, this.field8039)) {
            class267 var7 = class267.method1771(var3, this.field8039);
            this.field8038.field4099.method991(arg0.method356(var7, true), (long) this.field8039, (byte) -101);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lha;B)Lmi;")
    public final class496 method3364(class59 arg0, byte arg1) {
        field8041++;
        if (this.field8033 < 0) {
            return null;
        }
        int var3 = -84 % ((arg1 - 32) / 35);
        class496 var4 = (class496) this.field8038.field4099.method992((long) this.field8033, -50);
        if (var4 == null) {
            this.method3363(arg0, -89);
            var4 = (class496) this.field8038.field4099.method992((long) this.field8033, -117);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILcea;)V")
    public final void method3365(int arg0, class215 arg1) {
        if (arg0 > -119) {
            this.method3366(119, -71);
        }
        while (true) {
            int var3 = arg1.method1535(255);
            if (var3 == 0) {
                field8027++;
                return;
            }
            this.method3362(arg1, -2, var3);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method3366(int arg0, int arg1) {
        field8045++;
        String var3 = this.field8023;
        if (arg1 != 0) {
            return null;
        }
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class205.method1424(arg0, 55, false) + var3.substring(var4 + 2);
        }
    }
}
