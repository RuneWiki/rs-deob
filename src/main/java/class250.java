import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class250 extends class120 {

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    private int field3927;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    private int field3919;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
    private int field3930;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    private int field3924;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "Z")
    public static boolean field3925 = true;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public static int field3926 = 0;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "Lgn;")
    public static class257 field3932;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIZ)V", line = 11)
    public final void method293(int arg0, int arg1, boolean arg2) {
        int var4 = this.field3927 * arg0 >> 12;
        int var5 = this.field3930 * arg0 >> 12;
        int var6 = this.field3924 * arg1 >> 12;
        field3929++;
        int var7 = this.field3919 * arg1 >> 12;
        class173.method1094(var6, var4, (byte) 44, this.field2086, var7, var5);
        if (arg2) {
            this.field3924 = -62;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V", line = 28)
    public final void method290(int arg0, int arg1, int arg2) {
        if (arg0 >= -46) {
            method1691((byte) -22, (class124) null);
        }
        field3922++;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIIIII)V", line = 39)
    public class250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3927 = arg1;
        this.field3919 = arg2;
        this.field3930 = arg3;
        this.field3924 = arg0;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLte;)V", line = 51)
    public static final void method1691(byte arg0, class124 arg1) {
        field3931++;
        class331.field5068 = 3;
        class17.method122((byte) 117, true);
        class318.field4809 = true;
        class337.field5238 = 0;
        class171.field2751 = 255;
        class157.field2572 = true;
        class180.field2902 = 0;
        class191.field3110 = true;
        class80.field1573 = 127;
        class259.field4030 = true;
        class45.field926 = true;
        class79.field1555 = true;
        class64.field1227 = true;
        class219.field3477 = 0;
        client.field902 = true;
        class202.field3278 = 127;
        class334.field5115 = true;
        class171.field2757 = 0;
        class110 var2 = null;
        class305.field4620 = 2;
        class140.field2314 = true;
        class104.field1794 = true;
        if (class318.field4807 >= 96) {
            class275.method1840(2);
        } else {
            class275.method1840(0);
        }
        class6.field136 = false;
        class28.field539 = false;
        class236.field3714 = false;
        class259.field4028 = 0;
        class290.field4460 = true;
        class52.field1051 = 0;
        class211.field3397 = 0;
        try {
            class107 var3 = arg1.method815("runescape", 61);
            while (var3.field1852 == 0) {
                class127.method843(-30, 1L);
            }
            if (var3.field1852 == 1) {
                var2 = (class110) var3.field1853;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method716(0)];
                while (var4 < var5.length) {
                    int var6 = var2.method715(var4, (byte) 78, var5, var5.length - var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class90.method620(new class202(var5), (byte) 84);
            }
            if (arg0 != 31) {
                method1692((byte) -120);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method711(0);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 147)
    public static void method1692(byte arg0) {
        if (arg0 != -51) {
            field3921 = -45;
        }
        field3932 = null;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(IIZ)V", line = 157)
    public final void method292(int arg0, int arg1, boolean arg2) {
        field3928++;
        int var4 = this.field3924 * arg1 >> 12;
        if (arg2) {
            this.method292(-23, 13, false);
        }
        int var5 = this.field3919 * arg1 >> 12;
        int var6 = this.field3930 * arg0 >> 12;
        int var7 = this.field3927 * arg0 >> 12;
        class259.method1736(var5, this.field2086, var4, this.field2084, !arg2, var6, var7, this.field2085);
    }
}
