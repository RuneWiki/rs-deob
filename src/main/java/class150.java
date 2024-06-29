import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class150 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public int field2178 = 0;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public int field2181 = -1;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Z")
    public boolean field2180 = true;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public int field2186 = -1;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2184 = "Loading interfaces - ";

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Z")
    public static boolean field2185 = false;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2189 = new String[1000];

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2190 = "Walk here";

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(DI)V")
    public static final void method987(double arg0, int arg1) {
        int var3 = -100 % ((arg1 + 49) / 43);
        field2182++;
        if (class290.field4591 == arg0) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
            class72.field868[var4] = var5 <= 255 ? var5 : 255;
        }
        class290.field4591 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public static final void method988(int arg0, int arg1, int arg2) {
        class272.field3987 = true;
        class107.field1447 = arg0;
        class166.field2384 = arg1;
        class172.field2460 = arg2;
        class251.field3633 = -1;
        class176.field2506 = -1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILqi;I)V")
    public final void method989(int arg0, class216 arg1, int arg2) {
        field2179++;
        if (arg0 != 25412) {
            method988(-128, -50, 13);
        }
        while (true) {
            int var4 = arg1.method1407(103);
            if (var4 == 0) {
                return;
            }
            this.method990(arg1, var4, arg2, arg0 ^ 0x634F);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lqi;III)V")
    private final void method990(class216 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field2178 = class270.method1732(arg3 ^ 0x8C40326E, arg0.method1382(arg3 ^ 0xFFFFFFAF));
        } else if (arg1 == 2) {
            this.field2186 = arg0.method1407(arg3 + 99);
        } else if (arg1 == 3) {
            this.field2186 = arg0.method1380(true);
            if (this.field2186 == 65535) {
                this.field2186 = -1;
            }
        } else if (arg1 == 5) {
            this.field2180 = false;
        } else if (arg1 == 7) {
            this.field2181 = class270.method1732(arg3 - 1941949862, arg0.method1382(-100));
        } else if (arg1 == 8) {
            class149.field2166 = arg2;
        } else if (arg1 == 9) {
            arg0.method1380(true);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg0.method1407(121);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg0.method1382(-87);
                } else if (arg1 == 14) {
                    arg0.method1407(106);
                }
            }
        }
        field2188++;
        if (arg3 != 11) {
            this.method990((class216) null, -7, 28, -12);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static final void method991(int arg0) {
        field2175++;
        class272.field3986 = 0;
        class121.field1724 = 0;
        class253.method1624((byte) -96);
        class261.method1667((byte) 123);
        class149.method980(-2886);
        class63.method386(89);
        for (int var1 = 0; var1 < class121.field1724; var1++) {
            int var3 = class144.field2060[var1];
            if (class198.field2819 != class253.field3656[var3].field4546) {
                if (class253.field3656[var3].field3475 > 0) {
                    class154.method1010(class253.field3656[var3], (byte) -106);
                }
                class253.field3656[var3] = null;
            }
        }
        if (arg0 != -15809) {
            field2187 = -110;
        }
        if (class230.field3314 != class163.field2332.field3021) {
            throw new RuntimeException("gpp1 pos:" + class163.field2332.field3021 + " psize:" + class230.field3314);
        }
        for (int var2 = 0; var2 < class238.field3432; var2++) {
            if (class253.field3656[class46.field540[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class238.field3432);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static void method992(boolean arg0) {
        field2190 = null;
        if (arg0) {
            field2184 = null;
            field2189 = null;
        }
    }
}
