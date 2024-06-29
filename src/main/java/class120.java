import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class120 extends class11 {

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
    private int field2979 = -1;

    @OriginalMember(owner = "client!u", name = "jb", descriptor = "Z")
    private volatile boolean field2982 = false;

    @OriginalMember(owner = "client!u", name = "ub", descriptor = "Z")
    private boolean field2993 = false;

    @OriginalMember(owner = "client!u", name = "vb", descriptor = "Lsa;")
    private class109 field2994;

    @OriginalMember(owner = "client!u", name = "lb", descriptor = "Lsa;")
    private class109 field2984;

    @OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
    private int field2989;

    @OriginalMember(owner = "client!u", name = "kb", descriptor = "La;")
    public static class1 field2983 = class113.method934(-11538, "Freunde");

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "La;")
    public static class1 field2980 = class113.method934(-11538, "blinken1:");

    @OriginalMember(owner = "client!u", name = "xb", descriptor = "La;")
    public static class1 field2996 = class113.method934(-11538, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "La;")
    public static class1 field2981 = class113.method934(-11538, "Offline");

    @OriginalMember(owner = "client!u", name = "zb", descriptor = "La;")
    public static class1 field2998 = class113.method934(-11538, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!u", name = "Cb", descriptor = "I")
    public static int field3001 = -1;

    @OriginalMember(owner = "client!u", name = "wb", descriptor = "[Lvd;")
    public static class130[] field2995 = new class130[32768];

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!u", name = "mb", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!u", name = "nb", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!u", name = "ob", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!u", name = "pb", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!u", name = "rb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!u", name = "sb", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!u", name = "tb", descriptor = "I")
    private int field2992;

    @OriginalMember(owner = "client!u", name = "yb", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!u", name = "Ab", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!u", name = "Bb", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "[Z")
    private volatile boolean[] field2978;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZIZ[B)V", line = 6)
    public final void method979(boolean arg0, boolean arg1, int arg2, boolean arg3, byte[] arg4) {
        if (arg1) {
            field3001 = -117;
        }
        ++field2997;
        if (arg0) {
            if (this.field2982) {
                throw new RuntimeException();
            } else {
                if (this.field2984 != null) {
                    class43.method465(arg4, (byte) -54, this.field2984, this.field2989);
                }
                this.method224(-21071, arg4);
                this.method982(-124);
            }
        } else {
            arg4[arg4.length - 2] = (byte) (super.field375[arg2] >> 8);
            arg4[arg4.length + -1] = (byte) super.field375[arg2];
            if (this.field2994 != null) {
                class43.method465(arg4, (byte) 55, this.field2994, arg2);
                this.field2978[arg2] = true;
            }
            if (arg3) {
                super.field363[arg2] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I", line = 49)
    public final int method980(int arg0) {
        ++field2990;
        if (this.field2982) {
            return 100;
        } else if (super.field363 != null) {
            return 99;
        } else {
            int var2 = class74.method687((byte) -103, 255, this.field2989);
            if (arg0 != 100) {
                return -74;
            } else {
                if (~var2 <= -101) {
                    var2 = 99;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BZ[BILsa;)V", line = 71)
    public final void method981(byte arg0, boolean arg1, byte[] arg2, int arg3, class109 arg4) {
        ++field2976;
        if (this.field2984 == arg4) {
            if (this.field2982) {
                throw new RuntimeException();
            }
            if (arg2 == null) {
                class48.method497(true, this, 255, this.field2989, (byte) 0, this.field2992, (byte) 85);
                return;
            }
            class131.field3201.reset();
            class131.field3201.update(arg2, 0, arg2.length);
            int var6 = (int) class131.field3201.getValue();
            if (~this.field2992 != ~var6) {
                class48.method497(true, this, 255, this.field2989, (byte) 0, this.field2992, (byte) -121);
                return;
            }
            this.method224(-21071, arg2);
            this.method982(-112);
        } else {
            if (!arg1 && ~this.field2979 == ~arg3) {
                this.field2982 = true;
            }
            if (arg2 == null || ~arg2.length >= -3) {
                this.field2978[arg3] = false;
                if (this.field2993 || arg1) {
                    class48.method497(arg1, this, this.field2989, arg3, (byte) 2, super.field403[arg3], (byte) -117);
                }
                return;
            }
            class131.field3201.reset();
            class131.field3201.update(arg2, 0, arg2.length - 2);
            int var7 = (int) class131.field3201.getValue();
            int var8 = ((arg2[arg2.length + -2] & 255) << 8) - -(255 & arg2[arg2.length + -1]);
            if (super.field403[arg3] != var7 || ~super.field375[arg3] != ~var8) {
                this.field2978[arg3] = false;
                if (this.field2993 || arg1) {
                    class48.method497(arg1, this, this.field2989, arg3, (byte) 2, super.field403[arg3], (byte) -78);
                }
                return;
            }
            this.field2978[arg3] = true;
            if (arg1) {
                super.field363[arg3] = arg2;
            }
        }
        if (arg0 != -115) {
            this.method980(-55);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V", line = 174)
    public final void method223(int arg0, int arg1) {
        ++field2991;
        if (this.field2994 != null && this.field2978 != null && this.field2978[arg1]) {
            class49.method509(this, arg1, this.field2994, (byte) -125);
        } else {
            class48.method497(true, this, this.field2989, arg1, (byte) 2, super.field403[arg1], (byte) -127);
        }
        if (arg0 <= 1) {
            this.field2993 = true;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V", line = 192)
    public final void method220(int arg0, byte arg1) {
        class70.method664(this.field2989, 33, arg0);
        ++field2987;
        if (arg1 != 2) {
            this.method220(13, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lsa;Lsa;IZZZ)V", line = 323)
    public class120(class109 arg0, class109 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2994 = arg0;
        this.field2993 = arg5;
        this.field2984 = arg1;
        this.field2989 = arg2;
        client.method281(this, (byte) 98, this.field2989);
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V", line = 214)
    private final void method982(int arg0) {
        this.field2978 = new boolean[super.field363.length];
        ++field2999;
        int var2 = -58 % ((-44 - arg0) / 55);
        for (int var3 = 0; ~var3 > ~this.field2978.length; ++var3) {
            this.field2978[var3] = false;
        }
        if (this.field2994 == null) {
            this.field2982 = true;
        } else {
            this.field2979 = -1;
            for (int var4 = 0; ~this.field2978.length < ~var4; ++var4) {
                if (super.field412[var4] > 0) {
                    class36.method411(var4, this, this.field2994, (byte) -28);
                    this.field2979 = var4;
                }
            }
            if (~this.field2979 == 0) {
                this.field2982 = true;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(II)V", line = 271)
    public final void method983(int arg0, int arg1) {
        if (arg1 >= 41) {
            ++field3000;
            this.field2992 = arg0;
            if (this.field2984 == null) {
                class48.method497(true, this, 255, this.field2989, (byte) 0, this.field2992, (byte) -118);
            } else {
                class49.method509(this, this.field2989, this.field2984, (byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(II)I", line = 294)
    private final int method984(int arg0, int arg1) {
        ++field2977;
        int var3 = 124 / ((-6 - arg1) / 34);
        if (super.field363[arg0] != null) {
            return 100;
        } else {
            return this.field2978[arg0] ? 100 : class74.method687((byte) 88, this.field2989, arg0);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(Z)I", line = 357)
    public final int method985(boolean arg0) {
        int var2 = 0;
        ++field2985;
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~super.field363.length; ++var4) {
            if (super.field412[var4] > 0) {
                var2 += 100;
                var3 += this.method984(var4, 28);
            }
        }
        if (arg0) {
            method986(-91);
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V", line = 394)
    public static void method986(int arg0) {
        field2981 = null;
        field2995 = null;
        field2983 = null;
        if (arg0 != 99) {
            method986(24);
        }
        field2980 = null;
        field2998 = null;
        field2996 = null;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(II)La;", line = 409)
    public static final class1 method987(int arg0, int arg1) {
        ++field2986;
        if (arg1 != 255) {
            method986(83);
        }
        return class116.method959(-110, new class1[] { class48.method504(255 & arg0 >> 24, -1), class82.field2115, class48.method504((arg0 & 16763528) >> 16, -1), class82.field2115, class48.method504((65528 & arg0) >> 8, -1), class82.field2115, class48.method504(255 & arg0, -1) });
    }
}
