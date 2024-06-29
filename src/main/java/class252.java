import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class252 extends class86 implements class212 {

    @OriginalMember(owner = "client!po", name = "C", descriptor = "I")
    private int field3484 = -1;

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "I")
    private int field3496 = -1;

    @OriginalMember(owner = "client!po", name = "J", descriptor = "I")
    public int field3489;

    @OriginalMember(owner = "client!po", name = "I", descriptor = "Lbv;")
    private class282 field3488;

    @OriginalMember(owner = "client!po", name = "G", descriptor = "I")
    public int field3487;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "I")
    private int field3482;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "I")
    private int field3481;

    @OriginalMember(owner = "client!po", name = "D", descriptor = "I")
    private int field3485;

    @OriginalMember(owner = "client!po", name = "O", descriptor = "Lpg;")
    public static class492 field3494;

    @OriginalMember(owner = "client!po", name = "R", descriptor = "Lpg;")
    public static class492 field3497;

    @OriginalMember(owner = "client!po", name = "S", descriptor = "Ljr;")
    public static class219 field3498;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "F")
    public static float field3491;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!po", name = "K", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!po", name = "M", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!po", name = "N", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!po", name = "P", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!po", name = "T", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!po", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1643((byte) -102);
        field3492++;
        super.finalize();
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V")
    public final void method1643(byte arg0) {
        if (this.field3481 > 0) {
            this.field3488.method1808((byte) 108, this.field3481, this.field3485);
            this.field3481 = 0;
        }
        field3486++;
        if (arg0 > -11) {
            method1645(null, (byte) -79, null, false);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public final void method127(boolean arg0) {
        field3490++;
        OpenGL.glFramebufferRenderbufferEXT(this.field3496, this.field3484, 36161, 0);
        this.field3484 = -1;
        this.field3496 = -1;
        if (arg0) {
            field3491 = -0.6907229F;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
    public final void method1644(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, arg0, this.field3481);
        field3493++;
        this.field3496 = arg2;
        this.field3484 = arg1;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Loa;BLjava/lang/String;Z)V")
    public static final void method1645(class33 arg0, byte arg1, String arg2, boolean arg3) {
        field3495++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class34.field532.method38(250, null, arg2, 0);
        int var8 = class34.field532.method37((byte) -20, null, 250, arg2) * 13;
        class337.field5242.method1112(var5 - var4, -var4 + var6, var7 + var4 + var4, var4 + var4 + var8, -16777216, 0);
        class337.field5242.method1125(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 - -var4, -1, 0);
        if (arg1 != 31) {
            return;
        }
        arg0.method245(var8, -1, 0, 0, 1, 1, null, 0, null, -1, null, var6, var5, arg2, var7, 0);
        class244.method1627(var7 + var4 + var4, -var4 + var6, var4 + var8 + var4, -var4 + var5, (byte) -31);
        if (arg3) {
            class337.field5242.method1075();
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1646(int arg0, int arg1, byte arg2) {
        if (arg2 != 11) {
            method1646(25, -61, (byte) -47);
        }
        field3499++;
        return (arg0 & 0x70000) != 0 | class300.method1935(arg1, arg0, 101) || class202.method1407(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public static void method1647(int arg0) {
        field3494 = null;
        field3497 = null;
        field3498 = null;
        if (arg0 != -16777216) {
            method1646(34, -52, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ICLjava/lang/String;)I")
    public static final int method1648(int arg0, char arg1, String arg2) {
        field3483++;
        int var3 = 0;
        int var4 = arg2.length();
        int var5 = 0;
        if (arg0 != -27917) {
            method1648(68, '\r', null);
        }
        while (var5 < var4) {
            if (arg1 == arg2.charAt(var5)) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lbv;III)V")
    public class252(class282 arg0, int arg1, int arg2, int arg3) {
        this.field3489 = arg3;
        this.field3488 = arg0;
        this.field3487 = arg2;
        this.field3482 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class207.field2925, 0);
        this.field3481 = class207.field2925[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3481);
        OpenGL.glRenderbufferStorageEXT(36161, this.field3482, this.field3487, this.field3489);
        this.field3485 = this.field3487 * this.field3489 * this.field3488.method1800(this.field3482, false);
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lbv;IIII)V")
    public class252(class282 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3489 = arg3;
        this.field3487 = arg2;
        this.field3488 = arg0;
        this.field3482 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class207.field2925, 0);
        this.field3481 = class207.field2925[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3481);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field3482, this.field3487, this.field3489);
        this.field3485 = this.field3489 * this.field3487 * this.field3488.method1800(this.field3482, false);
    }

    static {
        new class375("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field3494 = new class492(71, 9);
        field3497 = new class492(16, 10);
        field3498 = new class219();
    }
}
