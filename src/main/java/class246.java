import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class246 extends Canvas {

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field4462;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lcc;")
    public static class209 field4454 = class95.method669(124, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Lcc;")
    public static class209 field4451 = class95.method669(101, "");

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Z")
    public static boolean field4456 = false;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Z")
    public static boolean field4457 = false;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field4465 = 0;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Lcc;")
    public static class209 field4463 = field4451;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Lcc;")
    public static class209 field4461 = class95.method669(100, "Schlie-8en");

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Lcc;")
    public static class209 field4467 = field4451;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Lkd;")
    public static class203 field4458;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "Lji;")
    public static class42 field4466;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Lsj;")
    public static class49 field4460;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method1714(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field4463 = null;
        field4460 = null;
        field4458 = null;
        field4466 = null;
        field4467 = null;
        field4451 = null;
        field4461 = null;
        field4454 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLsj;Lsj;B)V")
    public static final void method1715(boolean arg0, class49 arg1, class49 arg2, byte arg3) {
        if (arg3 != 59) {
            method1715(false, (class49) null, (class49) null, (byte) 90);
        }
        class273.field4840 = arg2;
        class10.field194 = arg0;
        class10.field204 = arg1;
        field4452++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIILde;)V")
    public static final void method1716(int arg0, int arg1, int arg2, class108 arg3) {
        if ((arg2 & 0x200) != 0) {
            arg3.field1517 = client.field2818.method736(125);
            int var4 = client.field2818.method735((byte) -31);
            if (arg3.field1517 == 65535) {
                arg3.field1517 = -1;
            }
            arg3.field1538 = class163.field2968 + (var4 & 0xFFFF);
            arg3.field1568 = 0;
            arg3.field1572 = var4 >> 16;
            arg3.field1547 = 0;
            if (arg3.field1538 > class163.field2968) {
                arg3.field1547 = -1;
            }
            if (arg3.field1517 != -1 && class163.field2968 == arg3.field1538) {
                int var5 = class259.method1797(125, arg3.field1517).field4122;
                if (var5 != -1) {
                    class241 var6 = class245.method1706(var5, (byte) 127);
                    if (var6 != null && var6.field4341 != null) {
                        class224.method1577(0, var6, arg3.field1534, arg3.field1571, arg1 ^ 0x80, class223.field4069 == arg3);
                    }
                }
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var7 = client.field2818.method761(-121);
            byte[] var8 = new byte[var7];
            class106 var9 = new class106(var8);
            client.field2818.method734(-107, 0, var7, var8);
            class262.field4702[arg0] = var9;
            arg3.method787(var9, -1);
        }
        field4455++;
        if ((arg2 & 0x80) != 0) {
            arg3.field1553 = client.field2818.method766(-46);
            arg3.field1524 = client.field2818.method724((byte) 79);
        }
        if ((arg2 & 0x10) != 0) {
            arg3.field1559 = client.field2818.method724((byte) 79);
            if (arg3.field1559 == 65535) {
                arg3.field1559 = -1;
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg3.field1552 = client.field2818.method755(1);
            if (arg3.field1552.method1491(111, 0) == 126) {
                arg3.field1552 = arg3.field1552.method1461(arg1 - 63, 1);
                class238.method1649((byte) -127, arg3.method781(arg1 + 65535), 2, arg3.field1552);
            } else if (class223.field4069 == arg3) {
                class238.method1649((byte) -124, arg3.method781(65535), 2, arg3.field1552);
            }
            arg3.field1540 = 0;
            arg3.field1545 = 0;
            arg3.field1509 = 150;
        }
        if ((arg2 & 0x8) != arg1) {
            int var10 = client.field2818.method760(255);
            int var11 = client.field2818.method769(false);
            arg3.method572(var10, class163.field2968, -114, var11);
            arg3.field1522 = class163.field2968 + 300;
            arg3.field1565 = client.field2818.method761(-126);
        }
        if ((arg2 & 0x20) != 0) {
            int var12 = client.field2818.method766(-36);
            int var13 = client.field2818.method757(-1);
            if (var12 == 65535) {
                var12 = -1;
            }
            class227.method1596(var13, false, arg3, var12);
        }
        if ((arg2 & 0x4) != 0) {
            int var14 = client.field2818.method736(125);
            int var15 = client.field2818.method774((byte) 117);
            int var16 = client.field2818.method757(-1);
            boolean var17 = (var14 & 0x8000) != 0;
            int var18 = client.field2818.field2085;
            if (arg3.field2140 != null && arg3.field2142 != null) {
                boolean var19 = false;
                long var20 = arg3.field2140.method1448(true);
                if (var15 <= 1) {
                    if (!var17 && (class250.field4505 && !class68.field1304 || class252.field4534)) {
                        var19 = true;
                    } else {
                        for (int var22 = 0; var22 < class163.field2949; var22++) {
                            if (class253.field4566[var22] == var20) {
                                var19 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var19 && class116.field2335 == 0) {
                    class108.field2179.field2085 = 0;
                    int var23 = -1;
                    client.field2818.method749(0, var16, true, class108.field2179.field2108);
                    class108.field2179.field2085 = 0;
                    class209 var24;
                    if (var17) {
                        var14 &= 0x7FFF;
                        class154 var25 = class277.method1879(class108.field2179, 32093);
                        var23 = var25.field2807;
                        var24 = var25.field2802.method1775(class108.field2179, (byte) -9);
                    } else {
                        var24 = class188.method1294(class195.method1336((byte) -72, class108.field2179).method1465(0));
                    }
                    arg3.field1552 = var24.method1454(121);
                    arg3.field1509 = 150;
                    arg3.field1545 = var14 & 0xFF;
                    arg3.field1540 = var14 >> 8;
                    if (var15 == 2) {
                        class94.method655(var24, var23, (class209) null, class229.method1604(new class209[] { class131.field2512, arg3.method781(arg1 + 65535) }, (byte) 82), -121, var17 ? 17 : 1);
                    } else if (var15 == 1) {
                        class94.method655(var24, var23, (class209) null, class229.method1604(new class209[] { class148.field2716, arg3.method781(65535) }, (byte) 93), -102, var17 ? 17 : 1);
                    } else {
                        class94.method655(var24, var23, (class209) null, arg3.method781(arg1 ^ 0xFFFF), -128, var17 ? 17 : 2);
                    }
                }
            }
            client.field2818.field2085 = var16 + var18;
        }
        if ((arg2 & 0x100) != 0) {
            arg3.field1514 = client.field2818.method761(-120);
            arg3.field1532 = client.field2818.method757(-1);
            arg3.field1560 = client.field2818.method761(-127);
            arg3.field1556 = client.field2818.method769(false);
            arg3.field1542 = client.field2818.method766(-36) + class163.field2968;
            arg3.field1563 = client.field2818.method766(-31) + class163.field2968;
            arg3.field1535 = client.field2818.method774((byte) 95);
            arg3.field1573 = 0;
            arg3.field1510 = 1;
        }
        if ((arg2 & 0x400) != 0) {
            int var26 = client.field2818.method760(255);
            int var27 = client.field2818.method774((byte) 75);
            arg3.method572(var26, class163.field2968, -123, var27);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZIIIIIIII)V")
    public static final void method1717(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4453++;
        if (arg0) {
            method1714(-119);
        }
        if (class161.method1111((byte) 82, arg4)) {
            class234.field4216 = null;
            class22.method191(arg1, arg2, class50.field984[arg4], arg8, arg5, arg3, 62, -1, arg6, arg7);
            if (class234.field4216 != null) {
                class22.method191(class84.field1673, arg2, class234.field4216, arg8, arg5, arg3, 107, -1412584499, arg6, class73.field1388);
                class234.field4216 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class129.field2476[var9] = true;
            }
        } else {
            class129.field2476[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!jl", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field4462.update(arg0);
        field4459++;
    }

    @OriginalMember(owner = "client!jl", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field4464++;
        this.field4462.paint(arg0);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class246(Component arg0) {
        this.field4462 = arg0;
    }
}
