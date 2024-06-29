import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public abstract class class238 {

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "Lfc;")
    public static class262 field3114 = new class262(8);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "J")
    public static long field3115;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II[BI)V")
    public abstract void method1434(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)Z")
    public abstract boolean method1435(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
    public abstract void method1436(int arg0);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I[BIIII)Z")
    public static final boolean method1437(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 85) {
            method1442(81);
        }
        field3113++;
        boolean var6 = true;
        class611 var7 = new class611(arg1);
        int var8 = -1;
        label74: while (true) {
            int var9 = var7.method3407(3893);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class685 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method3396(1689622712);
                                        if (var19 == 0) {
                                            continue label74;
                                        }
                                        var7.method3428((byte) -124);
                                    }
                                    int var12 = var7.method3396(1689622712);
                                    if (var12 == 0) {
                                        continue label74;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method3428((byte) -122) >> 2;
                                    var16 = var14 + arg2;
                                    var17 = var13 + arg0;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while ((arg3 - 1) <= var16);
                    } while (var17 >= arg4 - 1);
                    var18 = class707.field9894.method4109(var8, (byte) 119);
                } while (var15 == 22 && class11.field68.field5498.method4055((byte) 120) == 0 && var18.field9610 == 0 && var18.field9611 != 1 && !var18.field9578);
                if (!var18.method3880(18182)) {
                    class579.field8117++;
                    var6 = false;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lsba;B)V")
    public static final void method1438(class218 arg0, byte arg1) {
        if (arg1 != 19) {
            return;
        }
        field3111++;
        if (class181.field2220 != arg0.field2776) {
            return;
        }
        if (class653.field9086.field1148 == null) {
            arg0.field2820 = 0;
            arg0.field2668 = 0;
            return;
        }
        arg0.field2779 = 150;
        arg0.field2676 = (int) (Math.sin((double) class406.field5732 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field2820 = class247.field3207;
        arg0.field2692 = 5;
        arg0.field2668 = class753.method4192(class653.field9086.field1148, arg1 + 6224);
        arg0.field2782 = 0;
        arg0.field2772 = class653.field9086.field790;
        arg0.field2753 = class653.field9086.field878;
        arg0.field2666 = class653.field9086.field837;
        class300 var2 = arg0.field2666 == -1 ? null : class460.field6365.method1090(arg0.field2666, 16383);
        if (var2 != null) {
            class268.method1605(arg0.field2772, var2, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V")
    public abstract void method1439(int arg0);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "([BIII)I")
    public abstract int method1440(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II[S)[S")
    public static final short[] method1441(int arg0, int arg1, short[] arg2) {
        if (arg1 != 21119) {
            field3114 = null;
        }
        field3112++;
        short[] var3 = new short[arg0];
        class373.method2195(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(I)V")
    public static void method1442(int arg0) {
        field3114 = null;
        if (arg0 != 145149062) {
            field3114 = null;
        }
    }
}
