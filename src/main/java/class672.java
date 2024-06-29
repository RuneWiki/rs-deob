import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class672 extends class356 {

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public int field9541 = -1;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public int field9545 = 12800;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public int field9552 = 0;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "Z")
    public boolean field9555 = true;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public int field9557 = -1;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public int field9547 = 0;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public int field9549 = 12800;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "Ljava/lang/String;")
    public String field9551;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "Ljava/lang/String;")
    public String field9546;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public int field9544;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public int field9540;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "Lmfa;")
    public class562 field9548;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "Lep;")
    public static class382 field9556 = null;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field9543;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field9559;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[IIII)Z", line = 3)
    public final boolean method3765(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1) {
            this.field9548 = null;
        }
        field9542++;
        for (class596 var6 = (class596) this.field9548.method3174((byte) 49); var6 != null; var6 = (class596) this.field9548.method3168(false)) {
            if (var6.method3340(arg0, -1, arg4, arg2)) {
                var6.method3334(arg1, arg2, arg0, -30702);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjo;Ljo;I)V", line = 29)
    public static final void method3766(int arg0, class303 arg1, class303 arg2, int arg3) {
        class353.field4634 = arg2;
        field9553++;
        class2.field21 = arg1;
        if (arg0 != 5552) {
            method3766(-103, null, null, 51);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([IIII)Z", line = 46)
    public final boolean method3767(int[] arg0, int arg1, int arg2, int arg3) {
        field9559++;
        if (arg2 >= -69) {
            method3770(false);
        }
        for (class596 var5 = (class596) this.field9548.method3174((byte) 49); var5 != null; var5 = (class596) this.field9548.method3168(false)) {
            if (var5.method3335(arg3, 1, arg1)) {
                var5.method3334(arg0, arg1, arg3, -30702);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 238)
    public class672(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field9551 = arg2;
        this.field9546 = arg1;
        this.field9541 = arg4;
        this.field9544 = arg0;
        this.field9555 = arg5;
        this.field9540 = arg3;
        this.field9557 = arg6;
        if (this.field9557 == 255) {
            this.field9557 = 0;
        }
        this.field9548 = new class562();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 89)
    public final void method3768(byte arg0) {
        this.field9547 = 0;
        field9543++;
        this.field9545 = 12800;
        this.field9549 = 12800;
        int var2 = -93 / ((-arg0 - 83) / 39);
        this.field9552 = 0;
        for (class596 var3 = (class596) this.field9548.method3174((byte) 49); var3 != null; var3 = (class596) this.field9548.method3168(false)) {
            if (this.field9552 < var3.field8464) {
                this.field9552 = var3.field8464;
            }
            if (var3.field8465 < this.field9549) {
                this.field9549 = var3.field8465;
            }
            if (this.field9545 > var3.field8470) {
                this.field9545 = var3.field8470;
            }
            if (this.field9547 < var3.field8460) {
                this.field9547 = var3.field8460;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZZ)V", line = 124)
    public static final void method3769(int arg0, boolean arg1, boolean arg2) {
        field9558++;
        if (arg2) {
            class517.field7393++;
            class648.method3640(-890);
        }
        if (arg0 <= -110 && arg1) {
            class588.field8356++;
            class50.method255(3);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 157)
    public static void method3770(boolean arg0) {
        field9556 = null;
        if (!arg0) {
            method3769(36, true, true);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([IBII)Z", line = 170)
    public final boolean method3771(int[] arg0, byte arg1, int arg2, int arg3) {
        field9554++;
        class596 var5 = (class596) this.field9548.method3174((byte) 49);
        if (arg1 != -59) {
            method3766(-106, null, null, -10);
        }
        while (var5 != null) {
            if (var5.method3338((byte) -83, arg3, arg2)) {
                var5.method3339(arg2, arg0, arg3, arg1 - 4925);
                return true;
            }
            var5 = (class596) this.field9548.method3168(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)Z", line = 202)
    public final boolean method3772(int arg0, int arg1, byte arg2) {
        if (arg2 >= -48) {
            return true;
        }
        field9550++;
        for (class596 var4 = (class596) this.field9548.method3174((byte) 49); var4 != null; var4 = (class596) this.field9548.method3168(false)) {
            if (var4.method3335(arg0, 1, arg1)) {
                return true;
            }
        }
        return false;
    }
}
