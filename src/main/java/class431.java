import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class431 {

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    private int field6168 = 0;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    private int field6162 = 0;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
    private int field6176 = 0;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "Lqo;")
    private class22 field6165;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "Llc;")
    private class648 field6166;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "[Lvk;")
    private class369[] field6172;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "Lan;")
    public class23 field6170;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "[Ll;")
    public static class18[] field6163 = new class18[37];

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "[I")
    public static int[] field6167 = new int[14];

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "Leq;")
    public static class213 field6169 = new class213(16);

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "Lsh;")
    public static class70 field6175 = new class70(1);

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZIIBZ)V", line = 3)
    public final void method2618(int arg0, boolean arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field6171++;
        boolean var7 = arg5 & this.field6165.method327();
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg3 = arg0;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg1) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field6162 != arg2) {
            if (this.field6162 != 0) {
                this.field6172[Integer.MAX_VALUE & this.field6162].method371(-93);
            }
            if (arg2 != 0) {
                this.field6172[arg2 & Integer.MAX_VALUE].method369(arg1, false);
                this.field6172[Integer.MAX_VALUE & arg2].method366(arg1, (byte) -115);
                this.field6172[arg2 & Integer.MAX_VALUE].method372(arg0, arg3, (byte) -106);
            }
            this.field6162 = arg2;
            this.field6168 = arg3;
            this.field6176 = arg0;
        } else if (this.field6162 != 0) {
            this.field6172[Integer.MAX_VALUE & this.field6162].method366(arg1, (byte) -101);
            if (this.field6176 != arg0 || this.field6168 != arg3) {
                this.field6172[Integer.MAX_VALUE & this.field6162].method372(arg0, arg3, (byte) -98);
                this.field6176 = arg0;
                this.field6168 = arg3;
            }
        }
        if (arg4 <= 9) {
            this.field6166 = null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IBLud;)Z", line = 67)
    public final boolean method2619(int arg0, byte arg1, class36 arg2) {
        field6174++;
        if (this.field6162 == 0) {
            return false;
        }
        if (arg1 != -124) {
            this.method2623((byte) 99, 7);
        }
        this.field6172[Integer.MAX_VALUE & this.field6162].method373(arg2, (byte) -98, arg0);
        return true;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lqo;)V", line = 173)
    public class431(class22 arg0) {
        this.field6165 = arg0;
        this.field6166 = new class648(arg0);
        this.field6172 = new class369[10];
        this.field6172[1] = new class144(arg0);
        this.field6172[2] = new class227(arg0, this.field6166);
        this.field6172[4] = new class87(arg0, this.field6166);
        this.field6172[5] = new class700(arg0, this.field6166);
        this.field6172[6] = new class128(arg0);
        this.field6172[7] = new class365(arg0);
        this.field6172[3] = this.field6170 = new class23(arg0);
        this.field6172[8] = new class269(arg0, this.field6166);
        this.field6172[9] = new class108(arg0, this.field6166);
        if (!this.field6172[8].method368(-33)) {
            this.field6172[8] = this.field6172[4];
        }
        if (!this.field6172[9].method368(-82)) {
            this.field6172[9] = this.field6172[8];
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V", line = 96)
    public static void method2620(int arg0) {
        field6169 = null;
        field6163 = null;
        if (arg0 != 16) {
            field6163 = null;
        }
        field6167 = null;
        field6175 = null;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lat;III)V", line = 113)
    public static final void method2621(class378 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != Integer.MAX_VALUE) {
            return;
        }
        field6173++;
        if (class591.field8071 != null || class311.field4321 || arg0 == null || class721.method4006(arg0, (byte) -79) == null) {
            return;
        }
        class591.field8071 = arg0;
        class234.field3393 = class721.method4006(arg0, (byte) -117);
        class404.field5937 = 0;
        class293.field4109 = arg2;
        class228.field3310 = arg1;
        class756.field10556 = false;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BILat;)I", line = 138)
    public static final int method2622(byte arg0, int arg1, class378 arg2) {
        field6164++;
        if (arg0 != 57) {
            method2620(7);
        }
        if (!client.method1975(arg2).method2099(arg1, false) && arg2.field5417 == null) {
            return -1;
        } else if (arg2.field5382 == null || arg1 >= arg2.field5382.length) {
            return -1;
        } else {
            return arg2.field5382[arg1];
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BI)Z", line = 163)
    public final boolean method2623(byte arg0, int arg1) {
        if (arg0 >= -45) {
            this.method2619(7, (byte) -70, null);
        }
        field6161++;
        return this.field6172[arg1].method368(-112);
    }
}
