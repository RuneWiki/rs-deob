import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class50 {

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "Lmf;")
    private class382 field1026 = new class382(128);

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "Lpu;")
    private class522 field1031;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "[F")
    public static float[] field1028 = new float[4];

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIBI)V")
    public static final void method569(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = -7 % ((44 - arg3) / 61);
        field1025++;
        if (class287.field4270.field3697 != 0 && arg1 != 0 && class8.field83 < 50 && arg0 != -1) {
            class106.field1642[class8.field83++] = new class603((byte) 1, arg0, arg1, arg2, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)Lri;")
    public final class96 method570(int arg0, int arg1) {
        field1029++;
        class382 var3 = this.field1026;
        class96 var4;
        synchronized (this.field1026) {
            var4 = (class96) this.field1026.method2287(1, (long) arg1);
        }
        if (arg0 != -7848) {
            this.field1031 = null;
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1031.method3007(class286.method1838(-67, arg1), class205.method1359(false, arg1), arg0 + 7853);
        class96 var6 = new class96();
        if (var5 != null) {
            var6.method780((byte) 9, new class695(var5));
        }
        class382 var7 = this.field1026;
        synchronized (this.field1026) {
            this.field1026.method2291(var6, (long) arg1, arg0 ^ 0xFFFFE159);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I[SZ)[S")
    public static final short[] method571(int arg0, short[] arg1, boolean arg2) {
        if (!arg2) {
            field1027 = 61;
        }
        field1032++;
        short[] var3 = new short[arg0];
        class476.method2791(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)V")
    public static final void method572(int arg0, int arg1, int arg2) {
        field1030++;
        class191 var3 = class6.method38(16, -100, arg2);
        int var4 = -37 / ((35 - arg0) / 39);
        var3.method1285((byte) -1);
        var3.field2754 = arg1;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IILjava/awt/Component;ILft;)Ljp;")
    public static final class322 method573(int arg0, int arg1, Component arg2, int arg3, class4 arg4) {
        field1033++;
        if (class465.field6683 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= arg0 && arg1 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class322 var5 = (class322) Class.forName("lf").getDeclaredConstructor().newInstance();
                var5.field4750 = arg3;
                var5.field4737 = new int[(class22.field297 ? 2 : 1) * 256];
                var5.method1399(arg2);
                var5.field4752 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field4752 > 16384) {
                    var5.field4752 = 16384;
                }
                var5.method1400(var5.field4752);
                if (class617.field8597 > 0 && class109.field1676 == null) {
                    class109.field1676 = new class541();
                    class109.field1676.field7563 = arg4;
                    arg4.method22(class109.field1676, class617.field8597, (byte) -126);
                }
                if (class109.field1676 != null) {
                    if (class109.field1676.field7562[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class109.field1676.field7562[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class246 var6 = new class246(arg4, arg1);
                    var6.field4737 = new int[(class22.field297 ? 2 : 1) * 256];
                    var6.field4750 = arg3;
                    var6.method1399(arg2);
                    var6.field4752 = 16384;
                    var6.method1400(var6.field4752);
                    if (class617.field8597 > 0 && class109.field1676 == null) {
                        class109.field1676 = new class541();
                        class109.field1676.field7563 = arg4;
                        arg4.method22(class109.field1676, class617.field8597, (byte) -127);
                    }
                    if (class109.field1676 != null) {
                        if (class109.field1676.field7562[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class109.field1676.field7562[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class322();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
    public static void method574(byte arg0) {
        field1028 = null;
        if (arg0 > -23) {
            field1027 = 43;
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lkr;ILpu;)V")
    public class50(class693 arg0, int arg1, class522 arg2) {
        this.field1031 = arg2;
        if (this.field1031 != null) {
            int var4 = this.field1031.method2977((byte) -95) - 1;
            this.field1031.method2988(-35, var4);
        }
    }
}
