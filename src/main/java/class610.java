import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class610 extends class74 {

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "Llm;")
    private class337 field8554;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "Lbd;")
    private class190 field8553;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "Lml;")
    private class36 field8556;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "Z")
    public static boolean field8558 = false;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "[Llo;")
    public static class488[] field8563;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)V")
    public final void method347(int arg0, boolean arg1) {
        OpenGL.glBindProgramARB(34336, this.field8556.field489);
        ++field8559;
        OpenGL.glEnable(34336);
        super.field1011.method2602(0, 1, class141.field1830);
        int var3 = -111 % ((52 - arg0) / 36);
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
    public final void method343(int arg0) {
        ++field8561;
        super.field1011.method2602(0, arg0 ^ -19091, class5.field119);
        OpenGL.glBindProgramARB(34336, 0);
        if (arg0 == -19092) {
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Llm;Lpl;Lbd;)V")
    public class610(class337 arg0, class612 arg1, class190 arg2) {
        super(arg0);
        this.field8554 = arg0;
        this.field8553 = arg2;
        if (arg1 != null && this.field8553.method1156((byte) -92) && this.field8554.field4376) {
            this.field8556 = class225.method1355((byte) 100, arg1.method3345(69, "gl", "transparent_water"), this.field8554, 34336);
        } else {
            this.field8556 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZZ)V")
    public final void method339(boolean arg0, boolean arg1) {
        ++field8557;
        super.field1011.method2550(class538.field7226, arg0, class88.field1235);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Z")
    public final boolean method346(int arg0) {
        ++field8552;
        if (arg0 != -16777216) {
            method3332(-12);
        }
        return this.field8556 != null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IILhfa;)V")
    public final void method341(int arg0, int arg1, class466 arg2) {
        if (arg1 < 47) {
            this.method340(-113, -48, (byte) 92);
        }
        ++field8562;
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)V")
    public static final void method3332(int arg0) {
        if (arg0 != 0) {
            field8563 = null;
        }
        ++field8560;
        class186.field2355.method2406(18385);
    }

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "(I)V")
    public static void method3333(int arg0) {
        field8563 = null;
        if (arg0 >= -100) {
            field8563 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
    public static final void method3334(int arg0, int arg1) {
        class75 var2 = class270.field3423[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class75 var4 = class270.field3423[var3][arg0][arg1] = class270.field3423[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class138 var5 = var4.field1024; var5 != null; var5 = var5.field1789) {
                    class172 var6 = var5.field1786;
                    if (var6.field2247 == arg0 && var6.field2243 == arg1) {
                        --var6.field6470;
                    }
                }
                if (var4.field1031 != null) {
                    --var4.field1031.field6470;
                }
                if (var4.field1030 != null) {
                    --var4.field1030.field6470;
                }
                if (var4.field1026 != null) {
                    --var4.field1026.field6470;
                }
                if (var4.field1022 != null) {
                    --var4.field1022.field6470;
                }
                if (var4.field1034 != null) {
                    --var4.field1034.field6470;
                }
            }
        }
        if (class270.field3423[0][arg0][arg1] == null) {
            class270.field3423[0][arg0][arg1] = new class75(0);
            class270.field3423[0][arg0][arg1].field1028 = 1;
        }
        class270.field3423[0][arg0][arg1].field1023 = var2;
        class270.field3423[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIB)V")
    public final void method340(int arg0, int arg1, byte arg2) {
        ++field8555;
        if (arg2 != 65) {
            this.field8553 = null;
        }
        if (!this.field8553.field2372) {
            int var4 = super.field1011.field6279 % 4000 * 16 / 4000;
            super.field1011.method2596(this.field8553.field2370[var4], 0);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field1011.field6279 % 4000) / 4000.0F;
            super.field1011.method2596(this.field8553.field2369, 0);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
    }
}
