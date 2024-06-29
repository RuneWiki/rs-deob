import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class172 {

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    private int field3203 = 0;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    private int field3209 = -1;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Lbg;")
    private class19 field3216 = new class19();

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Z")
    public boolean field3219 = false;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    private int field3204;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[Lwd;")
    private class238[] field3201;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    private int field3215;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[[I")
    private int[][] field3202;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lmb;")
    public static class132 field3198 = class166.method1092("weiss:", 118);

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
    public static int[] field3205 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field3197 = 0;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lmb;")
    private static class132 field3199 = class166.method1092("Connection timed out)3", 125);

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Lmb;")
    public static class132 field3217 = class166.method1092("overlay)3dat", 121);

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lmb;")
    public static class132 field3206 = class166.method1092("Mitglieder)2Welt", 115);

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "Lmb;")
    public static class132 field3221 = field3199;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "Loc;")
    public static class155 field3220;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static void method1118(boolean arg0) {
        field3217 = null;
        if (!arg0) {
            return;
        }
        field3205 = null;
        field3199 = null;
        field3221 = null;
        field3220 = null;
        field3206 = null;
        field3198 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)Z")
    public static final boolean method1119(int arg0, byte arg1) {
        field3212++;
        if (arg1 == -126) {
            return (arg0 >> 20 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)[[I")
    public final int[][] method1120(int arg0) {
        field3210++;
        if (this.field3215 != this.field3204) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3215; var2++) {
            this.field3201[var2] = class218.field3987;
        }
        return this.field3202;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)I")
    public static final int method1121(int arg0, byte arg1, int arg2) {
        field3213++;
        if (arg1 != -20) {
            method1121(-118, (byte) -95, 37);
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILpb;IZ)Z")
    public static final boolean method1122(int arg0, class165 arg1, int arg2, boolean arg3) {
        byte[] var4 = arg1.method1079(arg0, 119, arg2);
        field3218++;
        if (var4 == null) {
            return false;
        } else {
            class100.method622(var4, arg3);
            return true;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[I")
    public final int[] method1123(int arg0, int arg1) {
        field3207++;
        if (arg0 != 0) {
            method1122(-13, null, 122, false);
        }
        if (this.field3215 == this.field3204) {
            this.field3219 = this.field3201[arg1] == null;
            this.field3201[arg1] = class218.field3987;
            return this.field3202[arg1];
        } else if (this.field3215 == 1) {
            this.field3219 = this.field3209 != arg1;
            this.field3209 = arg1;
            return this.field3202[0];
        } else {
            class238 var3 = this.field3201[arg1];
            if (var3 == null) {
                this.field3219 = true;
                if (this.field3215 <= this.field3203) {
                    class238 var4 = (class238) this.field3216.method124(arg0);
                    var3 = new class238(arg1, var4.field4300);
                    this.field3201[var4.field4301] = null;
                    var4.method995((byte) -66);
                } else {
                    var3 = new class238(arg1, this.field3203);
                    this.field3203++;
                }
                this.field3201[arg1] = var3;
            } else {
                this.field3219 = false;
            }
            this.field3216.method122(var3, 3);
            return this.field3202[var3.field4300];
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lmb;B)I")
    public static final int method1124(class132 arg0, byte arg1) {
        field3200++;
        if (arg1 != 15) {
            method1124(null, (byte) 110);
        }
        return arg0.method902((byte) -4) + 1;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public final void method1125(int arg0) {
        int var2 = 0;
        int var3 = -107 / ((-arg0 - 4) / 46);
        while (this.field3215 > var2) {
            this.field3202[var2] = null;
            var2++;
        }
        this.field3201 = null;
        this.field3202 = null;
        this.field3216.method130(12040);
        this.field3216 = null;
        field3211++;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(III)V")
    public class172(int arg0, int arg1, int arg2) {
        this.field3204 = arg1;
        this.field3201 = new class238[this.field3204];
        this.field3215 = arg0;
        this.field3202 = new int[this.field3215][arg2];
    }
}
