import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class594 extends class29 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lks;")
    public abstract class461 method2465(int arg0);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3462(int arg0, byte arg1, int arg2) {
        int var3 = 40 / ((arg1 - 12) / 61);
        field8358++;
        return (arg2 & 0x70000) != 0 | class690.method3901((byte) 8, arg0, arg2) || class759.method4216(true, arg2, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public static final void method3463(int arg0) {
        field8357++;
        class766.method4236(4, class21.field353.field10100.method1660(arg0 ^ 0xFFFFFF96));
        int var1 = (class614.field8619 >> 12) + (class124.field1922 >> 3);
        class368.field5113 = class210.field3250.field5755 = 0;
        int var2 = (class88.field999 >> 3) + (class472.field6622 >> 12);
        class210.field3250.method3978(8, 8, (byte) 125);
        if (arg0 != 1) {
            method3465(true, 60);
        }
        byte var3 = 18;
        class300.field4333 = new byte[var3][];
        class148.field2139 = new int[var3];
        class459.field6422 = new int[var3];
        class551.field7919 = new int[var3];
        class325.field4552 = new int[var3];
        class490.field6955 = new int[var3];
        class779.field10692 = new int[var3][4];
        client.field4492 = new byte[var3][];
        client.field4500 = new byte[var3][];
        class8.field79 = new byte[var3][];
        class506.field7191 = new byte[var3][];
        class314.field4472 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class768.field10571 >> 4)) / 8; var5 <= (var1 + (class768.field10571 >> 4)) / 8; var5++) {
            for (int var8 = (var2 - (class350.field4898 >> 4)) / 8; var8 <= ((class350.field4898 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class551.field7919[var4] = var9;
                class325.field4552[var4] = class168.field2640.method4356(class587.method3425(arg0, 16), "m" + var5 + "_" + var8);
                class459.field6422[var4] = class168.field2640.method4356(122, "l" + var5 + "_" + var8);
                class314.field4472[var4] = class168.field2640.method4356(45, "n" + var5 + "_" + var8);
                class148.field2139[var4] = class168.field2640.method4356(51, "um" + var5 + "_" + var8);
                class490.field6955[var4] = class168.field2640.method4356(46, "ul" + var5 + "_" + var8);
                if (class314.field4472[var4] == -1) {
                    class325.field4552[var4] = -1;
                    class459.field6422[var4] = -1;
                    class148.field2139[var4] = -1;
                    class490.field6955[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class314.field4472.length; var6++) {
            class314.field4472[var6] = -1;
            class325.field4552[var6] = -1;
            class459.field6422[var6] = -1;
            class148.field2139[var6] = -1;
            class490.field6955[var6] = -1;
        }
        byte var7;
        if (class266.field3873 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class417.method2537(false, var1, var7, false, var2);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
    public static final void method3464(boolean arg0) {
        field8359++;
        int var1 = 0;
        if (class21.field353.field10080.method4366(-119) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class21.field353.field10057.method1024(-43) == 0) {
            var1 |= 0x40;
        }
        class774.method4264(0, var1);
        class277.field4038.method3911(1, var1);
        class313.field4456.method1677((byte) -103, var1);
        if (!arg0) {
            return;
        }
        class575.field8103.method2441(false, var1);
        class456.field6385.method2386(var1, 32765);
        class456.method2715(2048, var1);
        class646.method3706(0, var1);
        class410.method2495(74, var1);
        class622.method3586((byte) -71, var1);
        class13.method139(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V")
    public static final void method3465(boolean arg0, int arg1) {
        field8360++;
        class265.method1722(16033);
        if (!class695.method3923(class266.field3873, false) || arg1 <= 64) {
            return;
        }
        class374.field5165++;
        if (class374.field5165 < 50 && !arg0) {
            return;
        }
        class374.field5165 = 0;
        if (!class100.field1157 && class527.field7529 != null) {
            class290.field4247++;
            class312 var2 = class353.method2245(class87.field971, class421.field5756, (byte) 19);
            class208.method1440(var2, 95);
            try {
                class158.method1205((byte) -30);
            } catch (IOException var3) {
                class100.field1157 = true;
            }
        }
        class265.method1722(16033);
    }
}
