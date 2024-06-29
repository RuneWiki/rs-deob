import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class274 {

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    private int field3906;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "Lnga;")
    public static class513 field3912;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Z")
    public static final boolean method1780(boolean arg0) {
        field3909++;
        if (arg0) {
            method1780(true);
        }
        return class130.field1571;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lar;I)V")
    public static final void method1781(class681 arg0, int arg1) {
        int var2 = 24 / ((-arg1 - 30) / 51);
        field3907++;
        class559.field7848 = arg0;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(Z)V")
    public static void method1782(boolean arg0) {
        if (!arg0) {
            field3912 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IC)V")
    public final void method1783(int arg0, char arg1) {
        field3904++;
        OpenGL.glCallList(this.field3906 + arg1);
        if (arg0 >= -7) {
            this.field3906 = -69;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public final void method1784(int arg0) {
        OpenGL.glEndList();
        field3908++;
        if (arg0 != -50135600) {
            this.field3906 = -35;
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Leea;I)V")
    public class274(class131 arg0, int arg1) {
        this.field3906 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
    public final void method1785(int arg0, int arg1) {
        OpenGL.glNewList(this.field3906 + arg0, 4864);
        field3911++;
        if (arg1 <= 38) {
            field3912 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IILrb;I)Lbl;")
    public static final class648 method1786(int arg0, int arg1, class352 arg2, int arg3) {
        field3910++;
        int var4 = arg3 << 10 | arg2.field4975;
        class648 var5 = (class648) class746.field10368.method3612(-110, (long) var4 << 16);
        if (arg1 >= -23) {
            return null;
        } else if (var5 == null) {
            byte[] var6 = class164.field2255.method2108(class164.field2255.method2111(false, var4), 0);
            if (var6 == null) {
                int var9 = arg2.field4975 | arg0 + 65536 << 10;
                class648 var10 = (class648) class746.field10368.method3612(-115, (long) var9 << 16);
                if (var10 != null) {
                    return var10;
                }
                byte[] var11 = class164.field2255.method2108(class164.field2255.method2111(false, var9), 0);
                if (var11 == null) {
                    int var14 = arg2.field4975 | 0x3FFFC00;
                    class648 var15 = (class648) class746.field10368.method3612(-114, (long) var14 << 16);
                    if (var15 != null) {
                        return var15;
                    }
                    byte[] var16 = class164.field2255.method2108(class164.field2255.method2111(false, var14), 0);
                    if (var16 == null) {
                        return null;
                    } else if (var16.length <= 1) {
                        return null;
                    } else {
                        class648 var17;
                        try {
                            var17 = class582.method3306(var16, 0);
                        } catch (Exception var21) {
                            throw new RuntimeException(var21.getMessage() + " S: " + var14);
                        }
                        var17.field8906 = arg2;
                        class746.field10368.method3611(var17, (byte) 36, (long) var14 << 16);
                        return var17;
                    }
                } else if (var11.length <= 1) {
                    return null;
                } else {
                    class648 var12;
                    try {
                        var12 = class582.method3306(var11, 0);
                    } catch (Exception var20) {
                        throw new RuntimeException(var20.getMessage() + " S: " + var9);
                    }
                    var12.field8906 = arg2;
                    class746.field10368.method3611(var12, (byte) 36, (long) var9 << 16);
                    return var12;
                }
            } else if (var6.length <= 1) {
                return null;
            } else {
                class648 var7;
                try {
                    var7 = class582.method3306(var6, 0);
                } catch (Exception var19) {
                    throw new RuntimeException(var19.getMessage() + " S: " + var4);
                }
                var7.field8906 = arg2;
                class746.field10368.method3611(var7, (byte) 36, (long) var4 << 16);
                return var7;
            }
        } else {
            return var5;
        }
    }
}
