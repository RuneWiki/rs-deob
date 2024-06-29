import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class107 extends class186 {

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "Lrg;")
    public class84 field1852 = new class84();

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "Lri;")
    public class222 field1860 = new class222();

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "Lwg;")
    private class238 field1856;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "Lda;")
    public static class275 field1849 = class255.method1672(119, "logo");

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "Lda;")
    public static class275 field1863 = class255.method1672(125, "hint_headicons");

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "Loa;")
    public static class276 field1862 = new class276(16);

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field1867 = 5063219;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "[[[B")
    public static byte[][][] field1865;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "[[[S")
    public static short[][][] field1855;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
    public final void method404(int arg0) {
        field1846++;
        this.field1860.method404(arg0);
        for (class192 var2 = (class192) this.field1852.method550(-117); var2 != null; var2 = (class192) this.field1852.method545(104)) {
            if (!this.field1856.method1556(-101, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3284) {
                        this.method796(10313, var2, var3);
                        var2.field3284 -= var3;
                        break;
                    }
                    this.method796(10313, var2, var2.field3284);
                    var3 -= var2.field3284;
                } while (!this.field1856.method1565(-117, 0, var3, var2, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Ltf;")
    public static final class119 method789(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class119 var4 = var3.field41;
            var3.field41 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([IIILkj;IZ)V")
    private final void method790(int[] arg0, int arg1, int arg2, class192 arg3, int arg4, boolean arg5) {
        field1864++;
        if (!arg5) {
            this.method796(-71, (class192) null, -29);
        }
        if ((this.field1856.field4184[arg3.field3287] & 0x4) != 0 && arg3.field3297 < 0) {
            int var7 = this.field1856.field4192[arg3.field3287] / class84.field1375;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field3298) / var7;
                if (arg2 < var8) {
                    arg3.field3298 += arg2 * var7;
                    break;
                }
                arg3.field3294.method425(arg0, arg1, var8);
                int var9 = class84.field1375 / 100;
                int var10 = 262144 / var7;
                arg2 -= var8;
                arg1 += var8;
                if (var10 < var9) {
                    var9 = var10;
                }
                arg3.field3298 += var7 * var8 - 1048576;
                class62 var11 = arg3.field3294;
                if (this.field1856.field4186[arg3.field3287] == 0) {
                    arg3.field3294 = class62.method431(arg3.field3288, var11.method421(), var11.method388(), var11.method393());
                } else {
                    arg3.field3294 = class62.method431(arg3.field3288, var11.method421(), 0, var11.method393());
                    this.field1856.method1570(false, arg3.field3306.field810[arg3.field3301] < 0, arg3);
                    arg3.field3294.method424(var9, var11.method388());
                }
                if (arg3.field3306.field810[arg3.field3301] < 0) {
                    arg3.field3294.method401(-1);
                }
                var11.method402(var9);
                var11.method425(arg0, arg1, arg4 - arg1);
                if (var11.method432()) {
                    this.field1860.method1422(var11);
                }
            }
        }
        arg3.field3294.method425(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)V")
    public static final void method791(int arg0, int arg1) {
        field1861++;
        if (arg0 > -39) {
            method793(-126);
        }
        class184 var2 = class147.method1044(4, (byte) 38, arg1);
        var2.method1230(1000);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "()I")
    public final int method395() {
        field1848++;
        return 0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lma;Lma;B)V")
    public static final void method792(class105 arg0, class105 arg1, byte arg2) {
        if (arg2 != -122) {
            method797(60);
        }
        class174.field3019 = arg1;
        class148.field2578 = arg0;
        field1851++;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "([III)V")
    public final void method425(int[] arg0, int arg1, int arg2) {
        this.field1860.method425(arg0, arg1, arg2);
        field1857++;
        for (class192 var4 = (class192) this.field1852.method550(-55); var4 != null; var4 = (class192) this.field1852.method545(104)) {
            if (!this.field1856.method1556(-89, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3284) {
                        this.method790(arg0, var6, var5, var4, var5 + var6, true);
                        var4.field3284 -= var5;
                        break;
                    }
                    this.method790(arg0, var6, var4.field3284, var4, var5 + var6, true);
                    var6 += var4.field3284;
                    var5 -= var4.field3284;
                } while (!this.field1856.method1565(-99, var6, var5, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()Luh;")
    public final class186 method414() {
        field1853++;
        class192 var1 = (class192) this.field1852.method550(-110);
        if (var1 == null) {
            return null;
        } else if (var1.field3294 == null) {
            return this.method408();
        } else {
            return var1.field3294;
        }
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V")
    public static final void method793(int arg0) {
        field1847++;
        class197.field3363++;
        class149.field2597.method526((byte) -119, arg0);
        class149.field2597.method560(0L, -68);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)Lci;")
    public static final class71 method794(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class71 var4 = var3.field37;
            var3.field37 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method795(byte arg0) {
        field1865 = null;
        if (arg0 != 81) {
            field1859 = -121;
        }
        field1862 = null;
        field1855 = null;
        field1849 = null;
        field1863 = null;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "()Luh;")
    public final class186 method408() {
        field1854++;
        class192 var1;
        do {
            var1 = (class192) this.field1852.method545(104);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3294 == null);
        return var1.field3294;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILkj;I)V")
    private final void method796(int arg0, class192 arg1, int arg2) {
        field1866++;
        if (arg0 != 10313) {
            this.method404(64);
        }
        if ((this.field1856.field4184[arg1.field3287] & 0x4) != 0 && arg1.field3297 < 0) {
            int var4 = this.field1856.field4192[arg1.field3287] / class84.field1375;
            int var5 = (var4 + 1048575 - arg1.field3298) / var4;
            arg1.field3298 = arg2 * var4 + arg1.field3298 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field1856.field4186[arg1.field3287] == 0) {
                    arg1.field3294 = class62.method431(arg1.field3288, arg1.field3294.method421(), arg1.field3294.method388(), arg1.field3294.method393());
                } else {
                    arg1.field3294 = class62.method431(arg1.field3288, arg1.field3294.method421(), 0, arg1.field3294.method393());
                    this.field1856.method1570(false, arg1.field3306.field810[arg1.field3301] < 0, arg1);
                }
                if (arg1.field3306.field810[arg1.field3301] < 0) {
                    arg1.field3294.method401(-1);
                }
                arg2 = arg1.field3298 / var4;
            }
        }
        arg1.field3294.method404(arg2);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lwg;)V")
    public class107(class238 arg0) {
        this.field1856 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "(I)V")
    public static final void method797(int arg0) {
        field1858++;
        for (int var1 = 0; var1 < class230.field4035; var1++) {
            class174 var2 = class251.method1655(var1, (byte) 67);
            if (var2 != null && var2.field3017 == 0) {
                class199.field3390[var1] = 0;
                class218.field3698[var1] = 0;
            }
        }
        field1862 = new class276(16);
        if (arg0 != 13326) {
            field1867 = 56;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lij;I)Lnk;")
    public static final class89 method798(class85 arg0, int arg1) {
        field1850++;
        int var2 = 2 / ((arg1 - 23) / 50);
        arg0.method564((byte) 49);
        int var3 = arg0.method564((byte) 123);
        class89 var4 = class124.method900(var3, (byte) -13);
        var4.field1515 = arg0.method564((byte) 127);
        int var5 = arg0.method564((byte) 67);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg0.method564((byte) 66);
            var4.method49(-20503, arg0, var7);
        }
        var4.method234(1);
        return var4;
    }
}
