import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class52 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[Lta;")
    public static class142[] field578;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static final void method511(int arg0) {
        field577++;
        if (class171.field2439 == 0) {
            return;
        }
        try {
            if (arg0 != -5) {
                method511(-93);
            }
            if ((++class24.field289) > 1500) {
                if (class383.field5635 != null) {
                    class383.field5635.method646(false);
                    class383.field5635 = null;
                }
                if (class88.field1196 >= 1) {
                    class428.field6307 = -5;
                    class171.field2439 = 0;
                    return;
                }
                if (class354.field4947 == class310.field4421) {
                    class310.field4421 = class205.field2981;
                } else {
                    class310.field4421 = class354.field4947;
                }
                class88.field1196++;
                class24.field289 = 0;
                class171.field2439 = 1;
            }
            if (class171.field2439 == 1) {
                class262.field3853 = class498.field7404.method2551(arg0 ^ 0xFFFFFFFB, class66.field839, class310.field4421);
                class171.field2439 = 2;
            }
            if (class171.field2439 == 2) {
                if (class262.field3853.field6617 == 2) {
                    throw new IOException();
                }
                if (class262.field3853.field6617 != 1) {
                    return;
                }
                class383.field5635 = new class66((Socket) class262.field3853.field6613, class498.field7404);
                class262.field3853 = null;
                class383.field5635.method650(class472.field6970.field827, 0, class472.field6970.field783, 126);
                class515.method3056((byte) 86);
                int var1 = class383.field5635.method647(30);
                class515.method3056((byte) 66);
                if (var1 != 101) {
                    class428.field6307 = var1;
                    class171.field2439 = 0;
                    class383.field5635.method646(false);
                    class383.field5635 = null;
                    return;
                }
                class171.field2439 = 3;
            }
            if (class171.field2439 == 3 && class383.field5635.method641(3) >= 2) {
                int var2 = class383.field5635.method647(arg0 ^ 0xFFFFFFA2) << 8 | class383.field5635.method647(125);
                class6.method46(false, var2);
                if (class77.field1046 == -1) {
                    class171.field2439 = 0;
                    class428.field6307 = 6;
                    class383.field5635.method646(false);
                    class383.field5635 = null;
                } else {
                    class171.field2439 = 0;
                    class383.field5635.method646(false);
                    class383.field5635 = null;
                    class95.method826(1);
                }
            }
        } catch (IOException var3) {
            if (class383.field5635 != null) {
                class383.field5635.method646(false);
                class383.field5635 = null;
            }
            if (class88.field1196 >= 1) {
                class171.field2439 = 0;
                class428.field6307 = -4;
            } else {
                class171.field2439 = 1;
                class24.field289 = 0;
                class88.field1196++;
                if (class354.field4947 == class310.field4421) {
                    class310.field4421 = class205.field2981;
                } else {
                    class310.field4421 = class354.field4947;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static void method512(int arg0) {
        field578 = null;
        int var1 = -61 / ((arg0 - 6) / 37);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
    public abstract void method513(int arg0, int arg1);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIBI)Lr;")
    public static final class121 method514(int arg0, int arg1, byte arg2, int arg3) {
        field576++;
        class148 var4 = class422.field6240[arg3][arg1][arg0];
        if (var4 == null) {
            return null;
        }
        class121 var5 = null;
        if (arg2 < 74) {
            method511(-24);
        }
        int var6 = -1;
        for (class480 var7 = var4.field2086; var7 != null; var7 = var7.field7058) {
            class431 var8 = var7.field7054;
            if (var8 instanceof class121) {
                class121 var9 = (class121) var8;
                int var10 = (var9.method963((byte) 127) - 1) * 64 + 60;
                int var11 = var9.field6335 - var10 >> 7;
                int var12 = var9.field6334 - var10 >> 7;
                int var13 = var9.field6335 + var10 >> 7;
                int var14 = var9.field6334 + var10 >> 7;
                if (var11 <= arg1 && var12 <= arg0 && arg1 <= var13 && arg0 <= var14) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg0);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Lrt;")
    public abstract class151 method515(byte arg0);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)I")
    public abstract int method516(int arg0, byte arg1);

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)[B")
    public abstract byte[] method517(int arg0, int arg1);
}
