import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class456 {

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Lqk;")
    public static class148 field6278 = new class148(71, 4);

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "[I")
    public static int[] field6279 = new int[3];

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "Leaa;")
    public static class380 field6280 = new class380("LIVE", 0);

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field6281 = 104;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field6276;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 5)
    public static void method2737(byte arg0) {
        field6280 = null;
        field6279 = null;
        if (arg0 == -51) {
            field6278 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method2738(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class67 var5 = (class67) class154.field2122.method3118((byte) 73); var5 != null; var5 = (class67) class154.field2122.method3111(126)) {
            class672.method3846(var5, (byte) -93, arg2, arg4, arg0, arg3);
        }
        field6274++;
        for (class67 var6 = (class67) class483.field6544.method3118((byte) 73); var6 != null; var6 = (class67) class483.field6544.method3111(118)) {
            byte var12 = 1;
            class591 var13 = var6.field917.method3482(0);
            if (var6.field917.field8309 == -1 || var6.field917.field8352) {
                var12 = 0;
            } else if (var6.field917.field8309 == var13.field8489 || var6.field917.field8309 == var13.field8501 || var6.field917.field8309 == var13.field8518 || var6.field917.field8309 == var13.field8491) {
                var12 = 2;
            } else if (var6.field917.field8309 == var13.field8516 || var6.field917.field8309 == var13.field8476 || var6.field917.field8309 == var13.field8500 || var6.field917.field8309 == var13.field8496) {
                var12 = 3;
            }
            if (var6.field940 != var12) {
                int var14 = class259.method1611(var6.field917, (byte) -102);
                class11 var15 = var6.field917.field771;
                if (var15.field111 != null) {
                    var15 = var15.method55((byte) 118, class554.field7826);
                }
                if (var15 == null || var14 == -1) {
                    var6.field929 = false;
                    var6.field922 = -1;
                    var6.field940 = var12;
                } else if (var6.field922 == var14 && var15.field160 == var6.field929) {
                    var6.field940 = var12;
                    var6.field937 = var15.field155;
                } else {
                    boolean var16 = false;
                    if (var6.field927 == null) {
                        var16 = true;
                    } else {
                        var6.field937 -= 512;
                        if (var6.field937 <= 0) {
                            class237.field3299.method3761(var6.field927);
                            var16 = true;
                            var6.field927 = null;
                        }
                    }
                    if (var16) {
                        var6.field922 = var14;
                        var6.field940 = var12;
                        var6.field937 = var15.field155;
                        var6.field921 = null;
                        var6.field929 = var15.field160;
                        var6.field943 = null;
                    }
                }
            }
            var6.field916 = var6.field917.field9490;
            var6.field941 = var6.field917.field9490 + (var6.field917.method3470(-1) << 8);
            var6.field944 = var6.field917.field9489;
            var6.field939 = var6.field917.field9489 + (var6.field917.method3470(-1) << 8);
            class672.method3846(var6, (byte) -124, arg2, arg4, arg0, arg3);
        }
        for (class67 var7 = (class67) class393.field5473.method1382(27901); var7 != null; var7 = (class67) class393.field5473.method1383(false)) {
            byte var8 = 1;
            class591 var9 = var7.field942.method3482(0);
            if (var7.field942.field8309 == -1 || var7.field942.field8352) {
                var8 = 0;
            } else if (var7.field942.field8309 == var9.field8489 || var7.field942.field8309 == var9.field8501 || var7.field942.field8309 == var9.field8518 || var7.field942.field8309 == var9.field8491) {
                var8 = 2;
            } else if (var7.field942.field8309 == var9.field8516 || var7.field942.field8309 == var9.field8476 || var7.field942.field8309 == var9.field8500 || var7.field942.field8309 == var9.field8496) {
                var8 = 3;
            }
            if (var7.field940 != var8) {
                int var10 = class300.method1760(false, var7.field942);
                if (var7.field922 == var10 && var7.field942.field9271 == var7.field929) {
                    var7.field937 = var7.field942.field9234;
                    var7.field940 = var8;
                } else {
                    boolean var11 = false;
                    if (var7.field927 == null) {
                        var11 = true;
                    } else {
                        var7.field937 -= 512;
                        if (var7.field937 <= 0) {
                            class237.field3299.method3761(var7.field927);
                            var7.field927 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var7.field921 = null;
                        var7.field937 = var7.field942.field9234;
                        var7.field940 = var8;
                        var7.field922 = var10;
                        var7.field929 = var7.field942.field9271;
                        var7.field943 = null;
                    }
                }
            }
            var7.field916 = var7.field942.field9490;
            var7.field941 = var7.field942.field9490 + (var7.field942.method3470(-1) << 8);
            var7.field944 = var7.field942.field9489;
            var7.field939 = var7.field942.field9489 + (var7.field942.method3470(-1) << 8);
            class672.method3846(var7, (byte) -108, arg2, arg4, arg0, arg3);
        }
        if (arg1 != 3) {
            field6278 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([BI)[B", line = 199)
    public final byte[] method2739(byte[] arg0, int arg1) {
        field6275++;
        class26 var3 = new class26(arg0);
        var3.field330 = arg0.length - 4;
        int var4 = var3.method198(arg1 - 16777216);
        byte[] var5 = new byte[var4];
        var3.field330 = arg1;
        this.method2741(var5, var3, (byte) 114);
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 216)
    public class456() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILvj;)Lrg;", line = 219)
    public static final class555 method2740(int arg0, class26 arg1) {
        field6273++;
        class679 var2 = class664.method3813(arg1, -19264);
        int var3 = arg1.method193(2);
        int var4 = arg1.method193(2);
        int var5 = arg1.method193(2);
        int var6 = arg1.method193(2);
        int var7 = arg1.method193(2);
        int var8 = -116 % ((arg0 + 65) / 51);
        int var9 = arg1.method193(2);
        return new class555(var2.field9569, var2.field9563, var2.field9562, var2.field9570, var2.field9575, var2.field9561, var2.field9568, var2.field9572, var2.field9571, var3, var4, var5, var6, var7, var9);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([BLvj;B)V", line = 246)
    public final void method2741(byte[] arg0, class26 arg1, byte arg2) {
        field6277++;
        if (arg1.field279[arg1.field330] != 31 || arg1.field279[arg1.field330 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field6276 == null) {
            this.field6276 = new Inflater(true);
        }
        try {
            this.field6276.setInput(arg1.field279, arg1.field330 + 10, -18 - (arg1.field330 - arg1.field279.length));
            int var4 = 32 / ((arg2 - 44) / 40);
            this.field6276.inflate(arg0);
        } catch (Exception var5) {
            this.field6276.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field6276.reset();
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(III)V", line = 275)
    private class456(int arg0, int arg1, int arg2) {
    }
}
