import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lid;")
    public static class60[] field1729 = new class60[100];

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
    public static boolean field1733 = false;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Lid;")
    private static class60 field1742 = class11.method72("Loaded wordpack", (byte) 109);

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lid;")
    public static class60 field1746 = class11.method72("Bitte geben Sie Ihr Passwort ein)3", (byte) 116);

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1748 = 0;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lid;")
    public static class60 field1749 = field1742;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public int field1750;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[B")
    public byte[] field1736;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "[B")
    public byte[] field1738;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "[I")
    public static int[] field1731;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[Lae;")
    public static class6[] field1732;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lte;B)V")
    public static final void method547(class137 arg0, byte arg1) {
        field1728++;
        if (arg1 >= -119 || class60.field1466 != 1) {
            return;
        }
        short var2 = 280;
        if (class140.field3185 >= var2 && class140.field3185 <= var2 + 14 && class139.field3174 >= 4 && class139.field3174 <= 18) {
            class28.method216(0, (byte) 122, 0);
            return;
        }
        if (class140.field3185 >= var2 + 15 && class140.field3185 <= var2 + 80 && class139.field3174 >= 4 && class139.field3174 <= 18) {
            class28.method216(0, (byte) 126, 1);
            return;
        }
        short var3 = 390;
        if (var3 <= class140.field3185 && class140.field3185 <= var3 + 14 && class139.field3174 >= 4 && class139.field3174 <= 18) {
            class28.method216(1, (byte) 120, 0);
            return;
        }
        if (class140.field3185 >= var3 + 15 && var3 + 80 >= class140.field3185 && class139.field3174 >= 4 && class139.field3174 <= 18) {
            class28.method216(1, (byte) 124, 1);
            return;
        }
        short var4 = 500;
        if (class140.field3185 >= var4 && class140.field3185 <= var4 + 14 && class139.field3174 >= 4 && class139.field3174 <= 18) {
            class28.method216(2, (byte) 121, 0);
            return;
        }
        if (class140.field3185 >= var4 + 15 && class140.field3185 <= var4 + 80 && class139.field3174 >= 4 && class139.field3174 <= 18) {
            class28.method216(2, (byte) 123, 1);
            return;
        }
        short var5 = 610;
        if (var5 <= class140.field3185 && class140.field3185 <= var5 + 14 && class139.field3174 >= 4 && class139.field3174 <= 18) {
            class28.method216(3, (byte) 126, 0);
            return;
        }
        if (class140.field3185 >= var5 + 15 && class140.field3185 <= var5 + 80 && class139.field3174 >= 4 && class139.field3174 <= 18) {
            class28.method216(3, (byte) 124, 1);
            return;
        }
        if (class140.field3185 >= 708 && class139.field3174 >= 4 && class140.field3185 <= 758 && class139.field3174 <= 20) {
            class129.field2937 = false;
            class22.field551.method39(0, 0);
            class86.field2140.method39(382, 0);
            class66.field1634.method224(382 - class66.field1634.field698 / 2, 18);
            return;
        }
        if (class10.field162 == -1) {
            return;
        }
        class30 var6 = class80.field1986[class10.field162];
        if (class31.field719 == var6.field699) {
            byte[] var7 = class104.method853(-93, new class60[] { var6.field710, class157.field3585 }).method440(0);
            class56.field1401 = new String(var7, 0, var7.length);
            class17.field434 = var6.field703;
            if (class34.field785 != 0) {
                class90.field2230 = 43594;
                class60.field1442 = 43594;
                class125.field2881 = 443;
                class34.field785 = 0;
            }
            class129.field2937 = false;
            class22.field551.method39(0, 0);
            class86.field2140.method39(382, 0);
            class66.field1634.method224(382 - class66.field1634.field698 / 2, 18);
            return;
        }
        class60 var8 = class104.method853(-84, new class60[] { class2.field44, var6.field710, class157.field3585, class94.field2311, class52.field1311, class98.method774((byte) -121, class22.field548 ? 1 : 0), class107.field2639, class98.method774((byte) -121, class101.field2468), class63.field1575, class98.method774((byte) -121, class18.field445) });
        try {
            arg0.getAppletContext().showDocument(var8.method452(-85), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILfd;)V")
    public static final void method548(int arg0, class40 arg1) {
        field1739++;
        int var2 = arg1.field966;
        if (var2 == 324) {
            if (class15.field348 == -1) {
                class15.field348 = arg1.field1068;
                class93.field2291 = arg1.field953;
            }
            if (class69.field1646.field412) {
                arg1.field1068 = class15.field348;
            } else {
                arg1.field1068 = class93.field2291;
            }
            return;
        }
        if (arg0 != 0) {
            field1731 = null;
        }
        if (var2 == 325) {
            if (class15.field348 == -1) {
                class15.field348 = arg1.field1068;
                class93.field2291 = arg1.field953;
            }
            if (class69.field1646.field412) {
                arg1.field1068 = class93.field2291;
            } else {
                arg1.field1068 = class15.field348;
            }
        } else if (var2 == 327) {
            arg1.field952 = 150;
            arg1.field980 = (int) (Math.sin((double) class82.field2065 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field981 = 5;
            arg1.field963 = 0;
        } else if (var2 == 328) {
            arg1.field952 = 150;
            arg1.field980 = (int) (Math.sin((double) class82.field2065 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field981 = 5;
            arg1.field963 = 1;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
    public static final void method549(int arg0, boolean arg1) {
        if (arg0 != -15562) {
            return;
        }
        class139.method1080((byte) 45);
        class16.field405++;
        field1740++;
        if (class16.field405 < 50 && !arg1) {
            return;
        }
        class16.field405 = 0;
        if (class116.field2738 || class4.field73 == null) {
            return;
        }
        class8.field124++;
        class22.field519.method1214(240, arg0 ^ 0xFFFFC336);
        try {
            class4.field73.method730(0, arg0 ^ 0xFFFFC336, class22.field519.field2498, class22.field519.field2501);
            class22.field519.field2501 = 0;
        } catch (IOException var2) {
            class116.field2738 = true;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method550(int arg0) {
        field1749 = null;
        field1746 = null;
        field1729 = null;
        field1732 = null;
        field1731 = null;
        if (arg0 == 29269) {
            field1742 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)V")
    public static final void method551(byte arg0, int arg1) {
        field1727++;
        class139.method1082(13);
        class63.method488(-123);
        int var2 = class116.method921(arg1, (byte) -74).field129;
        if (var2 == 0) {
            return;
        }
        int var3 = class43.field1158[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class127.method995(0.9D);
                ((class139) class127.field2914).method1078(7, 0.9D);
            }
            if (var3 == 2) {
                class127.method995(0.8D);
                ((class139) class127.field2914).method1078(33, 0.8D);
            }
            if (var3 == 3) {
                class127.method995(0.7D);
                ((class139) class127.field2914).method1078(83, 0.7D);
            }
            if (var3 == 4) {
                class127.method995(0.6D);
                ((class139) class127.field2914).method1078(54, 0.6D);
            }
            class153.method1162(128);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class9.field156 != var4) {
                if (class9.field156 == 0 && class7.field99 != -1) {
                    class100.method786(class7.field99, (byte) 67, false, 0, class35.field883, var4);
                    field1733 = false;
                } else if (var4 == 0) {
                    class113.method906(-117);
                    field1733 = false;
                } else {
                    class112.method905(var4, (byte) -13);
                }
                class9.field156 = var4;
            }
        }
        if (arg0 < 109) {
            field1732 = null;
        }
        if (var2 == 5) {
            class61.field1539 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class74.field1784 = 127;
            }
            if (var3 == 1) {
                class74.field1784 = 96;
            }
            if (var3 == 2) {
                class74.field1784 = 64;
            }
            if (var3 == 3) {
                class74.field1784 = 32;
            }
            if (var3 == 4) {
                class74.field1784 = 0;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class66.field1632 = 127;
            }
            if (var3 == 1) {
                class66.field1632 = 96;
            }
            if (var3 == 2) {
                class66.field1632 = 64;
            }
            if (var3 == 3) {
                class66.field1632 = 32;
            }
            if (var3 == 4) {
                class66.field1632 = 0;
            }
        }
        if (var2 == 9) {
            class39.field932 = var3;
        }
        if (var2 == 6) {
            class55.field1377 = var3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Z")
    public static final boolean method552(int arg0, int arg1, int arg2) {
        if (arg0 <= 22) {
            return false;
        } else {
            field1730++;
            return (arg2 >> arg1 + 1 & 0x1) != 0;
        }
    }
}
