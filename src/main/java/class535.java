import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class535 extends class724 implements class546 {

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    private int field6744;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    private int field6743;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    private int field6749;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "Luw;")
    public static class208 field6748 = new class208(20, -1);

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "Luw;")
    public static class208 field6751 = new class208(5, 2);

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILwu;)Lfba;")
    public static final class368 method2915(int arg0, int arg1, int arg2, class582 arg3) {
        ++field6747;
        int var4 = arg3.field7366 | arg0 << 10;
        class368 var5 = (class368) class121.field1624.method1941((long) var4 << 16, (byte) 60);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class67.field884.method148((byte) 106, class67.field884.method136(var4, (byte) -74));
            if (var6 != null) {
                if (var6.length <= 1) {
                    return null;
                } else {
                    class368 var7;
                    try {
                        var7 = class310.method1830(var6, -101);
                    } catch (Exception var19) {
                        throw new RuntimeException(var19.getMessage() + " S: " + var4);
                    }
                    var7.field4511 = arg3;
                    class121.field1624.method1936(var7, (long) var4 << 16, -123);
                    return var7;
                }
            } else {
                int var9 = arg2 - -65536 << 10 | arg3.field7366;
                class368 var10 = (class368) class121.field1624.method1941((long) var9 << 16, (byte) -67);
                if (arg1 != 1521386064) {
                    method2916(126);
                }
                if (var10 != null) {
                    return var10;
                } else {
                    byte[] var11 = class67.field884.method148((byte) -126, class67.field884.method136(var9, (byte) -74));
                    if (var11 != null) {
                        if (~var11.length >= -2) {
                            return null;
                        } else {
                            class368 var12;
                            try {
                                var12 = class310.method1830(var11, -94);
                            } catch (Exception var20) {
                                throw new RuntimeException(var20.getMessage() + " S: " + var9);
                            }
                            var12.field4511 = arg3;
                            class121.field1624.method1936(var12, (long) var9 << 16, -113);
                            return var12;
                        }
                    } else {
                        int var14 = arg3.field7366 | 67107840;
                        class368 var15 = (class368) class121.field1624.method1941((long) var14 << 16, (byte) -57);
                        if (var15 != null) {
                            return var15;
                        } else {
                            byte[] var16 = class67.field884.method148((byte) -128, class67.field884.method136(var14, (byte) -74));
                            if (var16 != null) {
                                if (var16.length <= 1) {
                                    return null;
                                } else {
                                    class368 var17;
                                    try {
                                        var17 = class310.method1830(var16, -80);
                                    } catch (Exception var21) {
                                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                                    }
                                    var17.field4511 = arg3;
                                    class121.field1624.method1936(var17, (long) var14 << 16, -111);
                                    return var17;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljc;Ltn;III[B)V")
    public class535(class179 arg0, class749 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class73.field990, arg2 * arg3 * arg4, false);
        this.field6744 = arg2;
        this.field6743 = arg4;
        this.field6749 = arg3;
        super.field9498.method3756(10, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field9516, 0, this.method3878(255), this.field6744, this.field6749, this.field6743, 0, class735.method3999((byte) -85, super.field9499), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method2916(int arg0) {
        if (arg0 != -252136560) {
            field6745 = 62;
        }
        field6748 = null;
        field6751 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V")
    public static final void method2917(byte arg0, int arg1) {
        ++field6746;
        class614 var2 = class497.method2759(9, 5977, (long) arg1);
        var2.method3279(false);
        if (arg0 < 77) {
            field6751 = null;
        }
    }
}
