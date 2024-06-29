import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class444 extends class37 {

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field6451 = 0;

    @OriginalMember(owner = "client!jh", name = "Cb", descriptor = "Z")
    public static boolean field6454 = false;

    @OriginalMember(owner = "client!jh", name = "Qb", descriptor = "[I")
    public static int[] field6468 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!jh", name = "Ab", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!jh", name = "Bb", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!jh", name = "Db", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!jh", name = "Eb", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!jh", name = "Fb", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!jh", name = "Hb", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!jh", name = "Ib", descriptor = "I")
    private int field6460;

    @OriginalMember(owner = "client!jh", name = "Jb", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!jh", name = "Kb", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!jh", name = "Mb", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!jh", name = "Nb", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!jh", name = "Ob", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!jh", name = "Pb", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!jh", name = "Gb", descriptor = "Lhg;")
    private class289 field6458;

    @OriginalMember(owner = "client!jh", name = "Lb", descriptor = "[I")
    public static int[] field6463;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "(I)V")
    public static final void method2772(int arg0) {
        ++field6452;
        class397.method2532((byte) -68);
        class393.method2504((byte) -122);
        class230.method1711(-22);
        class153.method1180((byte) -20);
        class303.method2075(true);
        class78.method612((byte) -54);
        class358.method2295(19396);
        class305.method2089(19924);
        class92.method782((byte) -119);
        class148.method1155(5);
        class190.method1470(6);
        class354.method2271(20189);
        class164.method1271(-98);
        class46.method378(122);
        class49.method392(8);
        class171.method1309((byte) -8);
        class84.method644((byte) -24);
        class127.method1068(-218);
        class46.method377(108);
        class373.method2377(-34);
        class302.method2069(-26053);
        if (arg0 < 119) {
            method2775(-93);
        }
        class242.method1771((byte) 3);
        class367.method2345((byte) 99);
        class329.field4734.method112(0);
        class257.field3722.method112(0);
        class441.field6403.method112(0);
        class409.field5959.method112(0);
        class216.field3192.method112(0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lja;Lmb;B)V")
    public static final void method2773(class90 arg0, class258 arg1, byte arg2) {
        if (arg2 == -78) {
            class64.method492(arg1, 117, 0, 0, arg0);
            ++field6462;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB[B)V")
    public final void method2774(int arg0, int arg1, byte arg2, byte[] arg3) {
        ++field6453;
        if (arg2 != -105) {
            method2772(-88);
        }
        for (int var5 = 0; arg0 > var5; ++var5) {
            arg3[var5 - -arg1] = (byte) (super.field578[super.field565++] + -this.field6458.method2034(-12041));
        }
    }

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "(I)V")
    public static void method2775(int arg0) {
        int var1 = 9 / ((arg0 - -50) / 38);
        field6468 = null;
        field6463 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(JLja;B)V")
    public static final void method2776(long arg0, class90 arg1, byte arg2) {
        class351.field4983 = class198.field2888;
        class193.field2843 = 0;
        ++field6459;
        class198.field2888 = 0;
        long var4 = class10.method63(arg2 ^ 21198);
        if (arg2 == -83) {
            for (class54 var6 = (class54) class322.field4654.method2496(64); var6 != null; var6 = (class54) class322.field4654.method2487(arg2 ^ -83)) {
                if (var6.method422(arg1, arg0)) {
                    ++class193.field2843;
                }
            }
            if (class21.field316 && arg0 % 100L == 0L) {
                System.out.println("Particle system count: " + class322.field4654.method2495(1) + ", running: " + class193.field2843 + ". Particles: " + class198.field2888 + ". Time taken: " + (-var4 + class10.method63(-21149)) + "ms");
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
    public class444(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([IZ)V")
    public final void method2777(int[] arg0, boolean arg1) {
        if (arg1) {
            field6468 = null;
        }
        ++field6457;
        this.field6458 = new class289(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(IB)I")
    public final int method2778(int arg0, byte arg1) {
        if (arg1 != -95) {
            field6468 = null;
        }
        ++field6466;
        int var3 = this.field6460 >> 3;
        int var4 = -(this.field6460 & 7) + 8;
        int var5 = 0;
        this.field6460 += arg0;
        while (arg0 > var4) {
            var5 += (class78.field1315[var4] & super.field578[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field578[var3] >> -arg0 + var4 & class78.field1315[arg0]) + var5;
        } else {
            var6 = (super.field578[var3] & class78.field1315[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "(I)V")
    public final void method2779(int arg0) {
        if (arg0 <= -69) {
            ++field6461;
            super.field565 = (this.field6460 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(BI)V")
    public static final void method2780(byte arg0, int arg1) {
        ++field6465;
        class18 var2 = class219.field3253;
        synchronized (class219.field3253) {
            class219.field3253.method104(arg1, (byte) -34);
        }
        int var3 = -122 / ((arg0 - 37) / 58);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
    public final void method2781(boolean arg0, int arg1) {
        if (arg0) {
            this.field6458 = null;
        }
        ++field6456;
        super.field578[super.field565++] = (byte) (this.field6458.method2034(-12041) + arg1);
    }

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "(B)V")
    public final void method2782(byte arg0) {
        if (arg0 >= -71) {
            method2776(-58L, (class90) null, (byte) 109);
        }
        ++field6464;
        this.field6460 = super.field565 * 8;
    }

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "(II)I")
    public final int method2783(int arg0, int arg1) {
        ++field6467;
        return arg0 != 0 ? 48 : arg1 * 8 + -this.field6460;
    }

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "(I)I")
    public final int method2784(int arg0) {
        if (arg0 != 0) {
            this.method2774(-7, -121, (byte) 66, (byte[]) null);
        }
        ++field6455;
        return super.field578[super.field565++] + -this.field6458.method2034(-12041) & 255;
    }
}
