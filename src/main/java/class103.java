import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class103 extends class278 {

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public static int field1931 = 0;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "Lud;")
    public static class279 field1927 = class130.method1024(")1o", 255);

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "Lud;")
    public static class279 field1935 = class130.method1024(" loggt sich aus)3", 255);

    @OriginalMember(owner = "client!pm", name = "hb", descriptor = "Lud;")
    public static class279 field1945 = class130.method1024("weiss:", 255);

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "Lud;")
    public static class279 field1936 = class130.method1024("; Max)2Age=", 255);

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "Lcd;")
    public static class69 field1928 = new class69(32);

    @OriginalMember(owner = "client!pm", name = "kb", descriptor = "I")
    public static int field1948 = 1;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "B")
    public byte field1930;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!pm", name = "ab", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!pm", name = "bb", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!pm", name = "db", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!pm", name = "eb", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!pm", name = "fb", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!pm", name = "gb", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!pm", name = "ib", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!pm", name = "lb", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!pm", name = "jb", descriptor = "Lok;")
    public static class149 field1947;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "Lvh;")
    public class53 field1932;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "[Lud;")
    public static class279[] field1929;

    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "[Lom;")
    public static class70[] field1940;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZII)V", line = 16)
    public static final void method867(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1946++;
        boolean var5 = false;
        class253.field4510 = 0L;
        int var6 = class20.method196(3);
        if (arg4 == 3 || var6 == 3) {
            arg2 = true;
        }
        if (arg4 > 0 != var6 > 0) {
            var5 = true;
        }
        int var7 = -127 / ((arg1 + 49) / 42);
        if (class305.field5416.startsWith("mac") && arg4 > 0) {
            arg2 = true;
        }
        if (arg2 && arg4 > 0) {
            var5 = true;
        }
        class297.method2101(arg2, var5, (byte) 120, arg0, arg4, arg3, var6);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Lgf;", line = 50)
    public static final class8 method868(int arg0, int arg1, int arg2) {
        if (arg0 != 250) {
            return (class8) null;
        }
        field1944++;
        class8 var3 = class273.method1940(arg2, 121);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field159 == null || arg1 >= var3.field159.length) {
            return null;
        } else {
            return var3.field159[arg1];
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(Z)I", line = 69)
    public final int method869(boolean arg0) {
        field1934++;
        if (arg0) {
            return this.field1932 == null ? 0 : this.field1932.field1142 * 100 / (this.field1932.field1168.length - this.field1930);
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([BZ)Lvi;", line = 87)
    public static final class6 method870(byte[] arg0, boolean arg1) {
        field1939++;
        if (arg0 == null) {
            return null;
        } else {
            class6 var2 = new class6(arg0, class44.field915, class216.field3811, class1.field92, class115.field2097, class113.field2080);
            class162.method1278(arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lqg;III)V", line = 122)
    public static final void method871(class239 arg0, int arg1, int arg2, int arg3) {
        if ((arg1 & 0x20) != 0) {
            int var4 = class287.field5106.method491(-1268);
            int var5 = class287.field5106.method477(-1);
            if (var4 == 65535) {
                var4 = -1;
            }
            class86.method755(var4, arg0, var5, -5815);
        }
        field1933++;
        if ((arg1 & 0x8) != 0) {
            arg0.field43 = class287.field5106.method468(28214);
            arg0.field58 = class287.field5106.method468(28214);
        }
        if ((arg1 & 0x200) != 0) {
            int var6 = class287.field5106.method466(255);
            boolean var7 = true;
            if (var6 == 65535) {
                var6 = -1;
            }
            int var8 = class287.field5106.method456((byte) -116);
            if (var6 != -1 && arg0.field81 != -1 && class131.method1033((byte) -82, method874(var6, -601).field3755).field3321 < class131.method1033((byte) -82, method874(arg0.field81, -601).field3755).field3321) {
                var7 = false;
            }
            if (var7) {
                arg0.field81 = var6;
                arg0.field75 = (var8 & 0xFFFF) + class8.field279;
                arg0.field7 = var8 >> 16;
                arg0.field2 = 1;
                arg0.field102 = 0;
                arg0.field5 = 0;
                if (class8.field279 < arg0.field75) {
                    arg0.field5 = -1;
                }
                if (arg0.field81 != -1 && class8.field279 == arg0.field75) {
                    int var9 = method874(arg0.field81, -601).field3755;
                    if (var9 != -1) {
                        class182 var10 = class131.method1033((byte) -82, var9);
                        if (var10 != null && var10.field3341 != null) {
                            class194.method1460(class72.field1420 == arg0, arg0.field86, 0, var10, arg0.field79, (byte) 107);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x1) != 0) {
            arg0.field62 = class287.field5106.method466(255);
            if (arg0.field62 == 65535) {
                arg0.field62 = -1;
            }
        }
        if ((arg1 & 0x800) != 0) {
            int var11 = class287.field5106.method470((byte) -7);
            int[] var12 = new int[var11];
            int[] var13 = new int[var11];
            int[] var14 = new int[var11];
            for (int var15 = 0; var15 < var11; var15++) {
                int var16 = class287.field5106.method475(117);
                if (var16 == 65535) {
                    var16 = -1;
                }
                var13[var15] = var16;
                var12[var15] = class287.field5106.method488((byte) 114);
                var14[var15] = class287.field5106.method475(-9);
            }
            class122.method961(var14, arg0, var13, var12, 0);
        }
        if (arg3 > -116) {
            field1948 = 107;
        }
        if ((arg1 & 0x400) != 0) {
            int var17 = class287.field5106.method472((byte) 95);
            int var18 = class287.field5106.method477(-1);
            arg0.method12(-28, class8.field279, var17, var18);
        }
        if ((arg1 & 0x4) != 0) {
            int var19 = class287.field5106.method468(28214);
            boolean var20 = (var19 & 0x8000) != 0;
            int var21 = class287.field5106.method483(-103);
            int var22 = class287.field5106.method470((byte) -7);
            int var23 = class287.field5106.field1142;
            if (arg0.field4197 != null && arg0.field4189 != null) {
                boolean var24 = false;
                long var25 = arg0.field4197.method2013(117);
                if (var21 <= 1) {
                    if (!var20 && (class179.field3242 && !class196.field3533 || class248.field4408)) {
                        var24 = true;
                    } else {
                        for (int var27 = 0; var27 < class194.field3498; var27++) {
                            if (class59.field1250[var27] == var25) {
                                var24 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var24 && class18.field543 == 0) {
                    class226.field3970.field1142 = 0;
                    int var28 = -1;
                    class287.field5106.method482(0, var22, class226.field3970.field1168, 128);
                    class226.field3970.field1142 = 0;
                    class279 var30;
                    if (var20) {
                        var19 &= 0x7FFF;
                        class282 var29 = class266.method1906(class226.field3970, 24);
                        var28 = var29.field5038;
                        var30 = var29.field5033.method2186(127, class226.field3970);
                    } else {
                        var30 = class49.method414(class58.method529(class226.field3970, (byte) -34).method2005(192));
                    }
                    arg0.field42 = var30.method2006((byte) 112);
                    arg0.field36 = 150;
                    arg0.field37 = var19 & 0xFF;
                    arg0.field1 = var19 >> 8;
                    if (var21 == 2) {
                        class170.method1325(0, var30, var20 ? 17 : 1, (class279) null, var28, class115.method929(new class279[] { class96.field1788, arg0.method1718(4) }, (byte) 60));
                    } else if (var21 == 1) {
                        class170.method1325(0, var30, var20 ? 17 : 1, (class279) null, var28, class115.method929(new class279[] { class318.field5588, arg0.method1718(4) }, (byte) 60));
                    } else {
                        class170.method1325(0, var30, var20 ? 17 : 2, (class279) null, var28, arg0.method1718(4));
                    }
                }
            }
            class287.field5106.field1142 = var22 + var23;
        }
        if ((arg1 & 0x80) != 0) {
            int var31 = class287.field5106.method488((byte) 115);
            byte[] var32 = new byte[var31];
            class53 var33 = new class53(var32);
            class287.field5106.method496(0, var31, var32, 3);
            class249.field4450[arg2] = var33;
            arg0.method1720(var33, 0);
        }
        if ((arg1 & 0x100) != 0) {
            arg0.field50 = class287.field5106.method488((byte) 111);
            arg0.field22 = class287.field5106.method470((byte) -7);
            arg0.field33 = class287.field5106.method488((byte) 109);
            arg0.field40 = class287.field5106.method488((byte) 120);
            arg0.field65 = class287.field5106.method475(117) + class8.field279;
            arg0.field98 = class287.field5106.method468(28214) + class8.field279;
            arg0.field53 = class287.field5106.method477(-1);
            arg0.field16 = 0;
            arg0.field82 = 1;
        }
        if ((arg1 & 0x2) != 0) {
            arg0.field42 = class287.field5106.method467((byte) -16);
            if (arg0.field42.method1973(true, 0) == 126) {
                arg0.field42 = arg0.field42.method1988((byte) -68, 1);
                class59.method532(arg0.field42, arg0.method1718(4), 2, 29437);
            } else if (class72.field1420 == arg0) {
                class59.method532(arg0.field42, arg0.method1718(4), 2, 29437);
            }
            arg0.field37 = 0;
            arg0.field36 = 150;
            arg0.field1 = 0;
        }
        if ((arg1 & 0x40) == 0) {
            return;
        }
        int var34 = class287.field5106.method472((byte) 76);
        int var35 = class287.field5106.method470((byte) -7);
        arg0.method12(93, class8.field279, var34, var35);
        arg0.field21 = class8.field279 + 300;
        arg0.field48 = class287.field5106.method470((byte) -7);
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(B)V", line = 404)
    public static void method872(byte arg0) {
        field1947 = null;
        field1940 = null;
        field1935 = null;
        field1927 = null;
        field1929 = null;
        field1936 = null;
        field1945 = null;
        int var1 = -95 / ((20 - arg0) / 50);
        field1928 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)[B", line = 425)
    public final byte[] method873(int arg0) {
        if (arg0 != -4958) {
            return (byte[]) null;
        }
        field1938++;
        if (this.field4920 || this.field1932.field1142 < (this.field1932.field1168.length - this.field1930)) {
            throw new RuntimeException();
        }
        return this.field1932.field1168;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)Lgi;", line = 449)
    public static final class213 method874(int arg0, int arg1) {
        field1943++;
        if (arg1 != -601) {
            field1931 = -71;
        }
        class213 var2 = (class213) class111.field2046.method1336((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class92.field1744.method1192(0, class209.method1538(true, arg0), class223.method1642((byte) 21, arg0));
        class213 var4 = new class213();
        var4.field3750 = arg0;
        if (var3 != null) {
            var4.method1563(-39, new class53(var3));
        }
        class111.field2046.method1331(var4, arg1 ^ 0xFFFF8BBA, (long) arg0);
        return var4;
    }
}
