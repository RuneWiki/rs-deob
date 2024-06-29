import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class23 extends class54 {

    @OriginalMember(owner = "client!c", name = "F", descriptor = "[Lc;")
    public class23[] field410;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Z")
    public boolean field407;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Ldc;")
    public static class37 field395 = class185.method1233((byte) 86, "welle2:");

    @OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
    public static int[] field404 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!c", name = "v", descriptor = "[J")
    public static long[] field400 = new long[1000];

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field393 = 0;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "Lud;")
    public class221 field405;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Lvi;")
    public class236 field398;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
    public final void method157(int arg0, int arg1, int arg2) {
        int var4 = this.field408 == 255 ? arg0 : this.field408;
        if (arg2 != -21809) {
            this.method162(63, 69, (byte) 5);
        }
        if (this.field407) {
            this.field405 = new class221(var4, arg0, arg1);
        } else {
            this.field398 = new class236(var4, arg0, arg1);
        }
        field414++;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public void method158(int arg0) {
        if (this.field407) {
            this.field405.method1456((byte) -13);
            this.field405 = null;
        } else {
            this.field398.method1523(-89);
            this.field398 = null;
        }
        field415++;
        if (arg0 != -1339) {
            this.method165((byte) -128);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lce;II)V")
    public void method40(class28 arg0, int arg1, int arg2) {
        field406++;
        if (arg2 != 1000) {
            field393 = -119;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)[[I")
    public final int[][] method159(int arg0, byte arg1, int arg2) {
        if (arg1 >= -57) {
            this.field398 = null;
        }
        field402++;
        if (!this.field410[arg0].field407) {
            return this.field410[arg0].method36(arg2, (byte) 9);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field410[arg0].method57(0, arg2);
        var4[0] = var5;
        var4[2] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method160(boolean arg0) {
        field395 = null;
        if (!arg0) {
            method161(null, (byte) 99);
        }
        field400 = null;
        field404 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[[I")
    public int[][] method36(int arg0, byte arg1) {
        field401++;
        if (arg1 != 9) {
            this.field398 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lre;B)V")
    public static final void method161(class190 arg0, byte arg1) {
        if (arg0.field3548 == 0) {
            arg0.field3513 = 1024;
        }
        field396++;
        arg0.field3463 = 0;
        int var2 = arg0.field3515 - class203.field3758;
        int var3 = arg0.field3499 * 64 + arg0.field3481 * 128;
        if (arg0.field3548 == 1) {
            arg0.field3513 = 1536;
        }
        int var4 = arg0.field3519 * 128 + arg0.field3499 * 64;
        arg0.field3505 += (var3 - arg0.field3505) / var2;
        if (arg1 != 12) {
            method166(75, -65, -36);
        }
        arg0.field3490 += (var4 - arg0.field3490) / var2;
        if (arg0.field3548 == 2) {
            arg0.field3513 = 0;
        }
        if (arg0.field3548 == 3) {
            arg0.field3513 = 512;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I")
    public int[] method57(int arg0, int arg1) {
        field412++;
        if (arg0 == 0) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)[I")
    public final int[] method162(int arg0, int arg1, byte arg2) {
        field397++;
        if (arg2 != 18) {
            this.field408 = -63;
        }
        return this.field410[arg1].field407 ? this.field410[arg1].method57(0, arg0) : this.field410[arg1].method36(arg0, (byte) 9)[0];
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)I")
    public int method163(int arg0) {
        int var2 = 90 / ((57 - arg0) / 63);
        field394++;
        return -1;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)[Lng;")
    public static final class148[] method164(int arg0) {
        field411++;
        class148[] var1 = new class148[class113.field2018];
        for (int var2 = 0; var2 < class113.field2018; var2++) {
            var1[var2] = new class148(class67.field1207, class160.field3030, class166.field3162[var2], class7.field77[var2], class174.field3308[var2], class238.field4336[var2], class217.field4040[var2], class5.field42);
        }
        class97.method644(true);
        int var3 = -4 / ((53 - arg0) / 50);
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)I")
    public int method165(byte arg0) {
        field399++;
        return arg0 == 15 ? -1 : 6;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IZ)V")
    public class23(int arg0, boolean arg1) {
        this.field410 = new class23[arg0];
        this.field407 = arg1;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public void method53(int arg0) {
        if (arg0 != -21746) {
            this.field407 = true;
        }
        field403++;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
    public static final void method166(int arg0, int arg1, int arg2) {
        if (arg0 != 4096) {
            method166(-114, 1, -91);
        }
        field409++;
        if (class199.field3705 != arg1) {
            class133.field2477 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class133.field2477[var3] = (var3 << 12) / arg1;
            }
            class119.field2136 = arg1 == 64 ? 2048 : 4096;
            class215.field4008 = arg1 - 1;
            class199.field3705 = arg1;
        }
        if (class235.field4276 == arg2) {
            return;
        }
        if (class199.field3705 == arg2) {
            class167.field3196 = class133.field2477;
        } else {
            class167.field3196 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class167.field3196[var4] = (var4 << 12) / arg2;
            }
        }
        class235.field4276 = arg2;
        class5.field44 = arg2 - 1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwa;Lwa;ILwa;)V")
    public static final void method167(class238 arg0, class238 arg1, int arg2, class238 arg3) {
        class215.field4015 = arg3;
        if (arg2 != 1024) {
            method167(null, null, 77, null);
        }
        class96.field1687 = arg0;
        field413++;
        class161.field3048 = arg1;
    }
}
