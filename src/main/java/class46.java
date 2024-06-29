import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public abstract class class46 extends class70 {

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public static int field927 = -2;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "Len;")
    public static class49 field931 = new class49();

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "Lek;")
    public static class206 field934;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "Z")
    public boolean field924;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "[[B")
    public static byte[][] field920;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method375(int arg0, boolean arg1) {
        field926++;
        if (!arg1) {
            method392(95, -61, -0.058162402F, -20, true, -103, 24, 86, -110);
        }
        class274.field4463.method896(arg0, (byte) -102);
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V", line = 18)
    public static void method376(int arg0) {
        if (arg0 > -117) {
            field932 = -86;
        }
        field931 = null;
        field934 = null;
        field920 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V", line = 30)
    public static final void method377(int arg0) {
        client.method1988();
        field918++;
        if (arg0 > -98) {
            method381(36);
        }
        client.method1989();
        client.method1997();
        client.method1985();
        client.method2000();
        client.method1993();
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "()I", line = 46)
    public int method378() {
        field919++;
        return 0;
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)V", line = 56)
    public static final void method379(int arg0) {
        field917++;
        if (arg0 > 68 && !class295.field4812 && class39.field848 != 2) {
            try {
                class186.method1305(class111.field2036, false, "tbrefresh");
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V", line = 77)
    public static final void method380(int arg0, int arg1, int arg2) {
        class31.field712 = true;
        class267.field4360 = arg0;
        class205.field3413 = arg1;
        class274.field4472 = arg2;
        class7.field241 = -1;
        class267.field4364 = -1;
    }

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V", line = 86)
    public static final void method381(int arg0) {
        class238.field3885.method889((byte) 19);
        if (arg0 != 0) {
            field931 = (class49) null;
        }
        field929++;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)Z", line = 100)
    public static final boolean method382(byte arg0) {
        field925++;
        try {
            if (arg0 != -68) {
                method382((byte) -61);
            }
            if (class222.field3671 == 2) {
                if (class57.field1134 == null) {
                    class57.field1134 = class246.method1736(class257.field4202, class352.field5619, class359.field5720);
                    if (class57.field1134 == null) {
                        return false;
                    }
                }
                if (class104.field1904 == null) {
                    class104.field1904 = new class348(class238.field3969, class178.field2948);
                }
                if (class349.field5586.method2450(22050, class316.field5138, class57.field1134, 16264, class104.field1904)) {
                    class349.field5586.method2461((byte) -61);
                    class349.field5586.method2437(-27441, class144.field2426);
                    class349.field5586.method2458(arg0 ^ 0xFFFFFFF7, class57.field1134, class181.field3110);
                    class222.field3671 = 0;
                    class257.field4202 = null;
                    class104.field1904 = null;
                    class57.field1134 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class349.field5586.method2429(true);
            class257.field4202 = null;
            class104.field1904 = null;
            class222.field3671 = 0;
            class57.field1134 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)Z", line = 156)
    public final boolean method384(boolean arg0) {
        field921++;
        if (!arg0) {
            field934 = (class206) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)Z", line = 176)
    public final boolean method387(byte arg0) {
        if (arg0 != 94) {
            field927 = -77;
        }
        field933++;
        return false;
    }

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)I", line = 190)
    public final int method389(int arg0) {
        if (arg0 != 1) {
            this.method388(-91, -28);
        }
        field928++;
        return 1;
    }

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "(I)Z", line = 201)
    public final boolean method390(int arg0) {
        field930++;
        if (arg0 != -16923) {
            this.field924 = false;
        }
        return this.field924;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIFIZIIII)[[I", line = 220)
    public static final int[][] method392(int arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field922++;
        int[][] var9 = new int[arg8][arg7];
        class317 var10 = new class317();
        if (arg5 != 22050) {
            return (int[][]) ((int[][]) null);
        }
        var10.field5163 = arg0;
        var10.field5157 = arg1;
        var10.field5154 = arg6;
        var10.field5159 = (int) (arg2 * 4096.0F);
        var10.field5151 = arg4;
        var10.method163(100);
        class101.method764((byte) -115, arg8, arg7);
        for (int var11 = 0; var11 < arg8; var11++) {
            var10.method2281(53, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "()Z")
    public abstract boolean method374();

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "()Z")
    public abstract boolean method383();

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(IIIII)V")
    public abstract void method385(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "()V")
    public abstract void method386();

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V")
    public abstract void method388(int arg0, int arg1);

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "(I)V")
    public abstract void method391(int arg0);
}
