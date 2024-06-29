import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class402 extends class108 implements class129 {

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "Lim;")
    public static class353 field5500 = new class353(59, -1);

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field5501 = 0;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "C")
    public char field5495;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public int field5491;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public int field5498;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public int field5499;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "J")
    public long field5492;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)C")
    public final char method692(boolean arg0) {
        field5493++;
        if (!arg0) {
            this.field5491 = -72;
        }
        return this.field5495;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V")
    public static final void method2406(boolean arg0) {
        field5488++;
        int var1 = class512.field7133;
        int[] var2 = class514.field7144;
        if (arg0) {
            method2407((byte) 19);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class20 var4 = class364.field5092[var2[var3]];
            if (var4 != null) {
                class132.method701((byte) 77, var4, var4.method104((byte) -92));
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
    public static void method2407(byte arg0) {
        int var1 = -55 / ((arg0 - 39) / 62);
        field5500 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
    public final int method693(byte arg0) {
        if (arg0 != -108) {
            this.method692(true);
        }
        field5496++;
        return this.field5499;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I")
    public final int method691(int arg0) {
        if (arg0 < 31) {
            field5501 = -107;
        }
        field5497++;
        return this.field5491;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J")
    public final long method690(int arg0) {
        field5489++;
        return arg0 == -31826 ? this.field5492 : -42L;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)I")
    public final int method694(int arg0) {
        if (arg0 != -8395) {
            field5500 = null;
        }
        field5490++;
        return this.field5498;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIZZZ)Lkr;")
    public static final class329 method2408(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field5494++;
        class120 var5 = null;
        if (class173.field2238 != null) {
            var5 = new class120(arg0, class173.field2238, class452.field6395[arg0], 1000000);
        }
        class172.field2232[arg0] = class466.field6612.method674(arg0, class267.field3415, 8539, var5);
        if (arg3) {
            method2408(124, 103, false, true, false);
        }
        if (arg4) {
            class172.field2232[arg0].method1462((byte) -100);
        }
        return new class329(class172.field2232[arg0], arg2, arg1);
    }
}
