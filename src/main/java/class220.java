import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class220 {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3969 = 0;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3971 = 0;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lsg;")
    public static class30 field3976 = class167.method1221((byte) 33, "null");

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Laa;")
    public static class8 field3973 = new class8(new byte[5000]);

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field3979 = 0;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field3977 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Lui;")
    public static class220 field3978;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1590(int arg0) {
        field3976 = null;
        field3973 = null;
        field3978 = null;
        if (arg0 != 0) {
            field3978 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)I")
    public abstract int method1346(int arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1347(int arg0, Component arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method1345(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lmc;Lmc;ZB)V")
    public static final void method1591(class151 arg0, class151 arg1, boolean arg2, byte arg3) {
        if (arg3 <= 73) {
            field3972 = -57;
        }
        class273.field4794 = arg0;
        field3966++;
        class43.field1027 = arg1;
        class76.field1676 = arg2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lsg;B)V")
    public static final void method1592(class30 arg0, byte arg1) {
        field3974++;
        int var2 = class179.method1304((byte) -83, arg0);
        if (var2 == -1) {
            return;
        }
        class41.field1014 = class29.field556.field3465[var2] - class61.field1323;
        int var3 = class41.field1014 - ((int) ((float) class139.field2714.field728 / class208.field3749));
        int var4 = class41.field1014 + ((int) ((float) class139.field2714.field728 / class208.field3749));
        class32.field811 = class53.field1179 + class170.field3205 - class29.field556.field3459[var2] - 1;
        int var5 = (int) ((float) class139.field2714.field670 / class208.field3749) + class32.field811;
        if (var3 < 0) {
            class41.field1014 = (int) ((float) class139.field2714.field728 / class208.field3749);
        }
        if (class98.field1979 < var4) {
            class41.field1014 = class98.field1979 - (int) ((float) class139.field2714.field728 / class208.field3749);
        }
        int var6 = class32.field811 - ((int) ((float) class139.field2714.field670 / class208.field3749));
        if (var6 < 0) {
            class32.field811 = (int) ((float) class139.field2714.field670 / class208.field3749);
        }
        if (class53.field1179 < var5) {
            class32.field811 = class53.field1179 - (int) ((float) class139.field2714.field670 / class208.field3749);
        }
        int var7 = -117 % ((82 - arg1) / 42);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Lsg;")
    public static final class30 method1593(int arg0, int arg1) {
        field3970++;
        return arg1 > arg0 ? class73.method675(-115, arg0) : class204.field3658;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static final void method1594(int arg0) {
        field3968++;
        class254.method1771(class166.field3053, 8);
        class119.field2321++;
        if (class124.field2434 && class49.field1114) {
            int var1 = class23.field440;
            int var2 = var1 - class64.field1420;
            if (class193.field3496 > var2) {
                var2 = class193.field3496;
            }
            if (class193.field3496 + class172.field3212.field728 < class166.field3053.field728 + var2) {
                var2 = class193.field3496 + class172.field3212.field728 - class166.field3053.field728;
            }
            int var3 = class104.field2095;
            int var4 = var3 - class77.field1687;
            int var5 = var2 - class259.field4574;
            if (arg0 != 6442) {
                method1590(-110);
            }
            if (class157.field2951 > var4) {
                var4 = class157.field2951;
            }
            if (class166.field3053.field670 + var4 > class157.field2951 + class172.field3212.field670) {
                var4 = class157.field2951 + class172.field3212.field670 - class166.field3053.field670;
            }
            int var6 = class166.field3053.field698;
            int var7 = var4 - class269.field4738;
            if (class119.field2321 > class166.field3053.field718 && (var6 < var5 || -var6 > var5 || var6 < var7 || var7 < (-var6))) {
                class138.field2711 = true;
            }
            int var8 = var4 + class172.field3212.field736 - class157.field2951;
            int var9 = var2 + class172.field3212.field734 - class193.field3496;
            if (class166.field3053.field659 != null && class138.field2711) {
                class183 var10 = new class183();
                var10.field3369 = class166.field3053;
                var10.field3373 = var8;
                var10.field3363 = class166.field3053.field659;
                var10.field3370 = var9;
                class104.method835(var10, (byte) 41);
            }
            if (class122.field2413 == 0) {
                if (class138.field2711) {
                    if (class166.field3053.field780 != null) {
                        class183 var11 = new class183();
                        var11.field3363 = class166.field3053.field780;
                        var11.field3373 = var8;
                        var11.field3370 = var9;
                        var11.field3374 = class256.field4516;
                        var11.field3369 = class166.field3053;
                        class104.method835(var11, (byte) 41);
                    }
                    if (class256.field4516 != null && client.method1492(class166.field3053) != null) {
                        class196.field3553.method1267(181, arg0 - 6451);
                        class196.field3553.method71(class166.field3053.field716, arg0 ^ 0x19D5);
                        class254.field4475++;
                        class196.field3553.method89(class166.field3053.field638, (byte) 119);
                        class196.field3553.method94(class256.field4516.field638, 69);
                        class196.field3553.method71(class256.field4516.field716, 255);
                    }
                } else if ((class154.field2913 == 1 || class101.method822(0, class52.field1165 - 1)) && class52.field1165 > 2) {
                    class154.method1153(false);
                } else if (class52.field1165 > 0) {
                    class143.method1064(-257);
                }
                class166.field3053 = null;
            }
        } else if (class119.field2321 > 1) {
            class166.field3053 = null;
        }
    }
}
