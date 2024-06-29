import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class93 extends class51 {

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    private int field1833 = 1;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "I")
    private int field1842 = 1;

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "I")
    private int field1844 = 204;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "Led;")
    private static class43 field1836 = class191.method1219("Members only world", false);

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "Led;")
    public static class43 field1843 = field1836;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "Lig;")
    public static class80 field1835;

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class93() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field1832;
        if (arg0 != 16) {
            field1839 = -83;
        }
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            for (int var4 = 0; class122.field2442 > var4; ++var4) {
                int var5 = class95.field1855[var4];
                int var6 = this.field1833 * var5 >> 12;
                int var7 = class40.field771[arg1];
                int var8 = this.field1842 * var7 >> 12;
                int var9 = var7 % (4096 / this.field1842) * this.field1842;
                int var10 = var5 % (4096 / this.field1833) * this.field1833;
                if (var9 < this.field1844) {
                    for (var6 -= var8; var6 < 0; var6 += 4) {
                    }
                    while (~var6 < -4) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field1844 < ~var10) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var10 < this.field1844) {
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

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BI)Led;")
    public static final class43 method594(int arg0, int arg1, byte[] arg2, int arg3) {
        class43 var4 = new class43();
        if (arg3 != 0) {
            return null;
        } else {
            ++field1841;
            var4.field818 = 0;
            var4.field844 = new byte[arg1];
            for (int var5 = arg0; arg0 + arg1 > var5; ++var5) {
                if (arg2[var5] != 0) {
                    var4.field844[var4.field818++] = arg2[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field1831;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1844 = arg0.method555(-1113627096);
                }
            } else {
                this.field1842 = arg0.method538((byte) 127);
            }
        } else {
            this.field1833 = arg0.method538((byte) -86);
        }
        if (arg1 != 0) {
            this.field1842 = -74;
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
    public static void method595(int arg0) {
        field1843 = null;
        field1836 = null;
        field1835 = null;
        if (arg0 != 896913964) {
            method594(-125, 103, (byte[]) null, 123);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lga;ILme;Lga;Lga;)Z")
    public static final boolean method596(class58 arg0, int arg1, class114 arg2, class58 arg3, class58 arg4) {
        class138.field2854 = arg3;
        class38.field725 = arg2;
        class131.field2746 = arg0;
        class125.field2493 = arg4;
        if (arg1 > -99) {
            field1835 = null;
        }
        ++field1837;
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
    public static final void method597(int arg0) {
        ++field1845;
        if (arg0 != 0) {
            method596((class58) null, 62, (class114) null, (class58) null, (class58) null);
        }
        if (class9.field163 && field1839 != class109.field2114) {
            class89.method569(class67.field1348.field2357[0], class32.field595, arg0 ^ 71211880, class67.field1348.field2335[0], class51.field1044, field1839);
        } else if (~class96.field1876 != ~field1839) {
            class96.field1876 = field1839;
            class118.method748(~arg0, field1839);
        }
    }
}
