import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class85 extends class188 {

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!hu", name = "D", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method596(int arg0, boolean arg1) {
        ++field1177;
        super.field2615.method2412((byte) 4, this);
        OpenGL.glTexParameteri(super.field2613, 10242, !arg1 ? 33071 : 10497);
        if (arg0 != -29322) {
            field1173 = 42;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILht;I[II[I)Lvm;", line = 19)
    public static final class482 method597(int arg0, class410 arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        ++field1171;
        byte[] var6 = new byte[arg0 * arg4];
        int var7 = 121 / ((-7 - arg2) / 41);
        for (int var8 = 0; arg4 > var8; ++var8) {
            int var9 = arg0 * var8 + arg3[var8];
            for (int var10 = 0; var10 < arg5[var8]; ++var10) {
                var6[var9++] = -1;
            }
        }
        return new class482(arg1, arg0, arg4, var6);
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lht;II[BI)V", line = 49)
    public class85(class410 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field1180 = arg2;
        super.field2615.method2412((byte) 4, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2613, 0, super.field2601, this.field1180, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V", line = 64)
    public static final void method598(boolean arg0) {
        ++field1175;
        if (!class125.field1717) {
            class125.field1717 = true;
            class351.field4800 = true;
            if (arg0) {
                method597(118, (class410) null, -89, (int[]) null, -35, (int[]) null);
            }
            if (class437.field6374.field4261) {
                class40.field553 = (float) (-128 & (int) class40.field553 - -191);
            } else {
                class401.field5582 += (-class401.field5582 + 24.0F) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(B)V", line = 90)
    public static final void method599(byte arg0) {
        ++field1179;
        if (arg0 > 31) {
            class9 var1 = class383.field5390;
            synchronized (class383.field5390) {
                class383.field5390.method67(-126);
            }
            class9 var2 = class223.field3137;
            synchronized (class223.field3137) {
                class223.field3137.method67(48);
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V", line = 110)
    public final void method43(int arg0) {
        ++field1181;
        int var2 = -17 / ((-72 - arg0) / 38);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II[Lss;IZI)V", line = 120)
    public static final void method600(int arg0, int arg1, class295[] arg2, int arg3, boolean arg4, int arg5) {
        ++field1178;
        if (arg1 != 18219) {
            field1174 = -116;
        }
        for (int var6 = 0; var6 < arg2.length; ++var6) {
            class295 var7 = arg2[var6];
            if (var7 != null && var7.field3988 == arg3) {
                class138.method893(arg0, arg4, var7, false, arg5);
                class407.method2352(arg5, arg0, 0, var7);
                if (var7.field3968 > -var7.field4022 + var7.field4034) {
                    var7.field3968 = -var7.field4022 + var7.field4034;
                }
                if (~var7.field3968 > -1) {
                    var7.field3968 = 0;
                }
                if (~(-var7.field3960 + var7.field4051) > ~var7.field3977) {
                    var7.field3977 = -var7.field3960 + var7.field4051;
                }
                if (var7.field3977 < 0) {
                    var7.field3977 = 0;
                }
                if (~var7.field3984 == -1) {
                    class263.method1517((byte) -72, arg4, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lss;ZII)V", line = 171)
    public static final void method601(class295 arg0, boolean arg1, int arg2, int arg3) {
        ++field1176;
        if (class292.field3914 == null && !class9.field86) {
            if (arg0 != null && class66.method414((byte) 118, arg0) != null) {
                class292.field3914 = arg0;
                class177.field2509 = class66.method414((byte) 124, arg0);
                class119.field1629 = arg2;
                class185.field2583 = 0;
                class278.field3763 = arg3;
                class153.field2174 = arg1;
            }
        }
    }
}
