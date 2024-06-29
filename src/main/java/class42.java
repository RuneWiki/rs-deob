import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class42 extends class292 {

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field683 = 0;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "[I")
    public static int[] field686 = new int[500];

    @OriginalMember(owner = "client!r", name = "D", descriptor = "[I")
    public static int[] field678 = new int[100];

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(JZ)V")
    public static final void method354(long arg0, boolean arg1) {
        field687++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1) {
            method355(true);
        }
        if ((arg0 % 10L) == 0L) {
            class286.method1926(26740, arg0 - 1L);
            class286.method1926(26740, 1L);
        } else {
            class286.method1926(26740, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public static void method355(boolean arg0) {
        if (arg0) {
            field686 = null;
        }
        field678 = null;
        field686 = null;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method356(int arg0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)I")
    public static final int method357(int arg0, int arg1) {
        field681++;
        if (arg1 != 3754) {
            field678 = null;
        }
        class241 var2 = class73.method575(arg0, -120);
        int var3 = var2.field3719;
        int var4 = var2.field3721;
        int var5 = var2.field3720;
        int var6 = class196.field3090[var5 - var4];
        return class30.field482[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
    public static final int method358(int arg0, int arg1, int arg2) {
        field685++;
        if (arg2 != 21) {
            method362(-41);
        }
        int var3 = 0;
        while (arg0 > 0) {
            arg0--;
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Luf;Luf;Luf;BLuf;)V")
    public static final void method359(class176 arg0, class176 arg1, class176 arg2, byte arg3, class176 arg4) {
        int var5 = 46 / ((28 - arg3) / 50);
        field680++;
        class219.field3425 = arg4;
        class280.field4384 = arg2;
        class241.field3729 = arg0;
        class143.field2217 = arg1;
        class261.field4006 = new class188[class143.field2217.method1167(-125)][];
        class142.field2184 = new boolean[class143.field2217.method1167(-126)];
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)Z")
    public abstract boolean method360(int arg0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
    public static final void method361(boolean arg0) {
        if (class66.field1045 != -1) {
            class283.method1899(class66.field1045, -1, (byte) -112, -1);
            class66.field1045 = -1;
        }
        if (arg0) {
            field682++;
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    public static final void method362(int arg0) {
        field679++;
        if (class137.field2132 == 0) {
            return;
        }
        try {
            if (arg0 != -3142) {
                method359((class176) null, (class176) null, (class176) null, (byte) -20, (class176) null);
            }
            if ((++class255.field3911) > 2000) {
                if (class118.field1829 != null) {
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                }
                if (class6.field102 >= 1) {
                    class137.field2132 = 0;
                    class259.field3978 = -5;
                    return;
                }
                class137.field2132 = 1;
                class6.field102++;
                if (class6.field104 == class51.field810) {
                    class6.field104 = class88.field1446;
                } else {
                    class6.field104 = class51.field810;
                }
                class255.field3911 = 0;
            }
            if (class137.field2132 == 1) {
                class272.field4302 = class22.field329.method480(class6.field104, (byte) -82, class217.field3374);
                class137.field2132 = 2;
            }
            if (class137.field2132 == 2) {
                if (class272.field4302.field3828 == 2) {
                    throw new IOException();
                }
                if (class272.field4302.field3828 != 1) {
                    return;
                }
                class118.field1829 = new class184((Socket) class272.field4302.field3831, class22.field329);
                class272.field4302 = null;
                class118.field1829.method1243(0, class292.field4607.field583, class292.field4607.field588, (byte) -100);
                if (class33.field531 != null) {
                    class33.field531.method66((byte) 122);
                }
                if (class46.field737 != null) {
                    class46.field737.method66((byte) 122);
                }
                int var1 = class118.field1829.method1232(22221);
                if (class33.field531 != null) {
                    class33.field531.method66((byte) 122);
                }
                if (class46.field737 != null) {
                    class46.field737.method66((byte) 122);
                }
                if (var1 != 21) {
                    class259.field3978 = var1;
                    class137.field2132 = 0;
                    class118.field1829.method1242((byte) 113);
                    class118.field1829 = null;
                    return;
                }
                class137.field2132 = 3;
            }
            if (class137.field2132 == 3) {
                if (class118.field1829.method1240((byte) 117) < 1) {
                    return;
                }
                class126.field1968 = new String[class118.field1829.method1232(22221)];
                class137.field2132 = 4;
            }
            if (class137.field2132 == 4 && class118.field1829.method1240((byte) 8) >= (class126.field1968.length * 8)) {
                class239.field3692.field588 = 0;
                class118.field1829.method1231(0, class239.field3692.field583, class126.field1968.length * 8, arg0 ^ 0xFFFFF3BA);
                for (int var2 = 0; var2 < class126.field1968.length; var2++) {
                    class126.field1968[var2] = class93.method733(class239.field3692.method315(arg0 + 1744673062), arg0 + 3142);
                }
                class137.field2132 = 0;
                class259.field3978 = 21;
                class118.field1829.method1242((byte) 113);
                class118.field1829 = null;
            }
        } catch (IOException var3) {
            if (class118.field1829 != null) {
                class118.field1829.method1242((byte) 113);
                class118.field1829 = null;
            }
            if (class6.field102 >= 1) {
                class259.field3978 = -4;
                class137.field2132 = 0;
            } else {
                class255.field3911 = 0;
                class137.field2132 = 1;
                if (class6.field104 == class51.field810) {
                    class6.field104 = class88.field1446;
                } else {
                    class6.field104 = class51.field810;
                }
                class6.field102++;
            }
        }
    }
}
