import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class101 extends class27 {

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    private int field1854 = 1;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "I")
    private int field1866 = 1;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "I")
    private int field1868 = 204;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "Lkb;")
    public static class93 field1859 = class76.method390("::fps ", 0);

    @OriginalMember(owner = "client!la", name = "U", descriptor = "Lkb;")
    public static class93 field1858 = class76.method390("gr-Un:", 0);

    @OriginalMember(owner = "client!la", name = "R", descriptor = "Lkb;")
    private static class93 field1855 = class76.method390("Members object", 0);

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "I")
    public static int field1863 = 0;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "Lkb;")
    public static class93 field1861 = class76.method390("Bitte warten Sie)3)3)3", 0);

    @OriginalMember(owner = "client!la", name = "N", descriptor = "Lkb;")
    public static class93 field1851 = field1855;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "Lkb;")
    public static class93 field1862 = class76.method390("Schrifts-=tze geladen)3", 0);

    @OriginalMember(owner = "client!la", name = "T", descriptor = "[Lob;")
    public static class129[] field1857 = new class129[1000];

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    public static int field1867 = 0;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1864 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "Ljg;")
    public static class89 field1852;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "Z")
    public static boolean field1853;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZLjg;III)V")
    public static final void method562(int arg0, int arg1, boolean arg2, class89 arg3, int arg4, int arg5, int arg6) {
        ++field1850;
        class166.field3327 = arg2;
        class64.field1032 = arg6;
        field1852 = arg3;
        class148.field2861 = arg4;
        class88.field1593 = arg5;
        class188.field3692 = arg0;
        class24.field365 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V")
    public static void method563(byte arg0) {
        field1861 = null;
        field1857 = null;
        if (arg0 != -125) {
            method564((class89) null, (class89) null, 89);
        }
        field1864 = null;
        field1851 = null;
        field1859 = null;
        field1858 = null;
        field1852 = null;
        field1862 = null;
        field1855 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class101() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljg;Ljg;I)V")
    public static final void method564(class89 arg0, class89 arg1, int arg2) {
        ++field1856;
        if (arg2 != 1) {
            method564((class89) null, (class89) null, 55);
        }
        class159.field3200 = arg0;
        class72.field1318 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field1865;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            for (int var4 = 0; var4 < class159.field3209; ++var4) {
                int var5 = class97.field1808[var4];
                int var6 = this.field1866 * var5 >> 12;
                int var7 = class142.field2781[arg0];
                int var8 = this.field1854 * var7 >> 12;
                int var9 = var5 % (4096 / this.field1866) * this.field1866;
                int var10 = var7 % (4096 / this.field1854) * this.field1854;
                if (var10 < this.field1868) {
                    for (var6 -= var8; ~var6 > -1; var6 += 4) {
                    }
                    while (~var6 < -4) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field1868) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1868 < ~var9) {
                    int var11;
                    for (var11 = var6 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 <= 106) {
            method564((class89) null, (class89) null, 26);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field1868 = arg2.method1071(28101);
                }
            } else {
                this.field1854 = arg2.method1054(128);
            }
        } else {
            this.field1866 = arg2.method1054(128);
        }
        ++field1860;
    }
}
