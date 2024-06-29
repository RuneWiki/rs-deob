import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class702 extends class350 {

    @OriginalMember(owner = "client!gv", name = "M", descriptor = "I")
    public int field9781;

    @OriginalMember(owner = "client!gv", name = "ab", descriptor = "I")
    public int field9793;

    @OriginalMember(owner = "client!gv", name = "W", descriptor = "Z")
    public boolean field9789;

    @OriginalMember(owner = "client!gv", name = "Y", descriptor = "F")
    public float field9791;

    @OriginalMember(owner = "client!gv", name = "N", descriptor = "F")
    public float field9782;

    @OriginalMember(owner = "client!gv", name = "O", descriptor = "I")
    public static int field9783 = -1;

    @OriginalMember(owner = "client!gv", name = "V", descriptor = "Z")
    public static boolean field9788 = false;

    @OriginalMember(owner = "client!gv", name = "Q", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!gv", name = "R", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!gv", name = "T", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!gv", name = "X", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!gv", name = "Z", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!gv", name = "P", descriptor = "Lfd;")
    public static class298 field9784;

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ldw;IIIII[BI)V", line = 5)
    public class702(class664 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field9781 = arg2;
        this.field9793 = arg3;
        this.method2236(0, arg6, arg2, 0, true, 0, arg3, false, arg7, 0);
        this.field9789 = false;
        this.field9791 = (float) arg2 / (float) arg4;
        this.field9782 = (float) arg3 / (float) arg5;
        this.method2230(3314, false, false);
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ldw;IIIII)V", line = 19)
    public class702(class664 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field9791 = (float) arg2 / (float) arg4;
        this.field9782 = (float) arg3 / (float) arg5;
        this.field9793 = arg3;
        this.field9789 = false;
        this.field9781 = arg2;
        this.method2230(3314, false, false);
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ldw;IIII[I)V", line = 35)
    public class702(class664 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field9781 = arg1;
        this.field9793 = arg2;
        this.method2238(true, -21477, 0, arg1, 0, arg2, 0, 0, arg5);
        this.field9791 = (float) arg1 / (float) arg3;
        this.field9789 = false;
        this.field9782 = (float) arg2 / (float) arg4;
        this.method2230(3314, false, false);
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ldw;IIIIIIZ)V", line = 49)
    public class702(class664 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field9793 = arg4;
        this.field9782 = (float) arg4 / (float) arg6;
        this.field9791 = (float) arg3 / (float) arg5;
        this.field9789 = false;
        this.field9781 = arg3;
        this.method2230(3314, false, false);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILkaa;)[I", line = 62)
    public static final int[] method3962(int arg0, class583 arg1) {
        ++field9787;
        class63 var2 = new class63(518);
        int[] var3 = new int[4];
        if (arg0 != -64) {
            method3964((class515) null, false);
        }
        for (int var4 = 0; ~var4 > -5; ++var4) {
            var3[var4] = (int) (9.9999999E7D * Math.random());
        }
        var2.method444(10, 128);
        var2.method473(-122, var3[0]);
        var2.method473(arg0 + 155, var3[1]);
        var2.method473(112, var3[2]);
        var2.method473(arg0 ^ 70, var3[3]);
        for (int var5 = 0; var5 < 10; ++var5) {
            var2.method473(arg0 ^ 69, (int) (Math.random() * 9.9999999E7D));
        }
        var2.method492(arg0 ^ 62, (int) (Math.random() * 9.9999999E7D));
        var2.method454(38, class99.field1382, class613.field8243);
        arg1.field7963.method497(var2.field954, var2.field956, 0, -1);
        return var3;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 99)
    public static final long method3963(String arg0, int arg1) {
        ++field9790;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 != 17521) {
            field9786 = 125;
        }
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && ~var6 >= -91) {
                var2 += (long) (var6 + -64);
            } else if (var6 >= 'a' && ~var6 >= -123) {
                var2 += (long) (1 - -var6 + -97);
            } else if (var6 >= '0' && ~var6 >= -58) {
                var2 += (long) (-21 - -var6);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ldw;IIIIZ[BI)V", line = 143)
    public class702(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field9793 = arg4;
        if (~super.field7768 != -34038) {
            this.field9791 = this.field9782 = 1.0F;
            this.field9789 = true;
        } else {
            this.field9789 = false;
            this.field9791 = (float) arg3;
            this.field9782 = (float) arg4;
        }
        this.field9781 = arg3;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ldw;IIII)V", line = 165)
    public class702(class664 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9793 = arg4;
        this.field9781 = arg3;
        if (super.field7768 == 34037) {
            this.field9782 = (float) arg4;
            this.field9791 = (float) arg3;
            this.field9789 = false;
        } else {
            this.field9791 = this.field9782 = 1.0F;
            this.field9789 = true;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lni;Z)V", line = 196)
    public static final void method3964(class515 arg0, boolean arg1) {
        if (arg0 instanceof class679) {
            class679 var2 = (class679) arg0;
            if (var2.field9436 != null) {
                class235.method1565(class388.field5601.field4408 != var2.field4408, -24434, var2);
            }
        } else if (arg0 instanceof class96) {
            class96 var3 = (class96) arg0;
            class18.method89(class388.field5601.field4408 != var3.field4408, 24897, var3);
        }
        ++field9785;
        if (arg1) {
            method3963((String) null, -5);
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V", line = 225)
    public static void method3965(byte arg0) {
        if (arg0 < 105) {
            method3965((byte) 26);
        }
        field9784 = null;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ldw;IIIIIZ)V", line = 238)
    public class702(class664 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field9793 = arg5;
        this.field9781 = arg4;
        if (super.field7768 == 34037) {
            this.field9789 = false;
            this.field9791 = (float) arg4;
            this.field9782 = (float) arg5;
        } else {
            this.field9791 = this.field9782 = 1.0F;
            this.field9789 = true;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ldw;IIIZ[III)V", line = 259)
    public class702(class664 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field9781 = arg2;
        if (super.field7768 == 34037) {
            this.field9789 = false;
            this.field9791 = (float) arg2;
            this.field9782 = (float) arg3;
        } else {
            this.field9791 = this.field9782 = 1.0F;
            this.field9789 = true;
        }
        this.field9793 = arg3;
    }
}
