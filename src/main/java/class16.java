import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class class16 extends class71 {

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "[Lkh;")
    public class16[] field198;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Z")
    public boolean field191;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field208 = -1;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "Lhe;")
    public class101 field197;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "Lof;")
    public class253 field207;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "[[[B")
    public static byte[][][] field210;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)[I", line = 13)
    public final int[] method103(int arg0, int arg1, int arg2) {
        field194++;
        if (arg1 == 4389) {
            return this.field198[arg0].field191 ? this.field198[arg0].method8(true, arg2) : this.field198[arg0].method54(arg2, (byte) 94)[0];
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)Lim;", line = 40)
    public static final class192 method104(boolean arg0) {
        field200++;
        class192 var1 = new class192(34);
        var1.method1365(-32769, 11);
        var1.method1365(-32769, class91.field1404);
        var1.method1365(-32769, class237.field3757 ? 1 : 0);
        var1.method1365(-32769, class243.field3859 ? 1 : 0);
        var1.method1365(-32769, class39.field548 ? 1 : 0);
        var1.method1365(-32769, class175.field2791 ? 1 : 0);
        var1.method1365(-32769, class196.field3219 ? 1 : 0);
        var1.method1365(-32769, class39.field512 ? 1 : 0);
        var1.method1365(-32769, class226.field3598 ? 1 : 0);
        var1.method1365(-32769, class202.field3302 ? 1 : 0);
        var1.method1365(-32769, class17.field227);
        var1.method1365(-32769, class269.field4250 ? 1 : 0);
        var1.method1365(-32769, class63.field831 ? 1 : 0);
        var1.method1365(-32769, class238.field3766 ? 1 : 0);
        var1.method1365(-32769, class327.field5098);
        var1.method1365(-32769, class56.field739 ? 1 : 0);
        var1.method1365(-32769, class337.field5229);
        if (arg0) {
            method112(-128);
        }
        var1.method1365(-32769, class13.field164);
        var1.method1365(-32769, class139.field2076);
        var1.method1368(class198.field3256, 4796);
        var1.method1368(class80.field1213, 4796);
        var1.method1365(-32769, class167.method1151());
        var1.method1350(class17.field230, -125);
        var1.method1365(-32769, class49.field674);
        var1.method1365(-32769, class27.field390 ? 1 : 0);
        var1.method1365(-32769, class325.field5079 ? 1 : 0);
        var1.method1365(-32769, class86.field1304);
        var1.method1365(-32769, class263.field4174 ? 1 : 0);
        var1.method1365(-32769, class126.field1885 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)V", line = 90)
    public final void method105(int arg0, int arg1, int arg2) {
        field199++;
        int var4 = this.field205 == 255 ? arg1 : this.field205;
        if (arg2 > -104) {
            this.method70(10);
        }
        if (this.field191) {
            this.field207 = new class253(var4, arg1, arg0);
        } else {
            this.field197 = new class101(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[[I", line = 111)
    public int[][] method54(int arg0, byte arg1) {
        field212++;
        int var3 = 2 / ((arg1 - 40) / 41);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V", line = 128)
    public static final void method106(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 48) {
            method104(false);
        }
        class179 var4 = class319.method2220(arg3, (byte) -77, 9);
        var4.method1242((byte) -34);
        var4.field2897 = arg0;
        field214++;
        var4.field2889 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I", line = 142)
    public int method70(int arg0) {
        if (arg0 != 0) {
            this.method111(76, (byte) -4, 103);
        }
        field204++;
        return -1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)Z", line = 155)
    public static final boolean method107(boolean arg0, int arg1) {
        if (arg0) {
            field208 = 2;
        }
        field206++;
        return arg1 == 4 || arg1 == 8;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILkb;B)Lfj;", line = 167)
    public static final class254 method108(int arg0, class39 arg1, byte arg2) {
        int var3 = -29 / ((arg2 - 47) / 57);
        field195++;
        return class221.method1609(arg1, 5282, arg0) ? class319.method2233(0) : null;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V", line = 179)
    public static final void method109(int arg0) {
        class250.field3968 = arg0;
        for (int var1 = 0; var1 < class4.field43; var1++) {
            for (int var2 = 0; var2 < class64.field844; var2++) {
                if (class251.field3996[arg0][var1][var2] == null) {
                    class251.field3996[arg0][var1][var2] = new class230(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V", line = 206)
    public static void method110(byte arg0) {
        if (arg0 != -124) {
            field210 = (byte[][][]) ((byte[][][]) null);
        }
        field210 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)V", line = 217)
    public void method55(byte arg0) {
        field213++;
        if (arg0 != 0) {
            field208 = -128;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(ZI)[I", line = 229)
    public int[] method8(boolean arg0, int arg1) {
        field209++;
        if (!arg0) {
            field208 = 9;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IBI)[[I", line = 245)
    public final int[][] method111(int arg0, byte arg1, int arg2) {
        field203++;
        if (arg1 != 122) {
            this.field191 = true;
        }
        if (this.field198[arg0].field191) {
            int[] var4 = this.field198[arg0].method8(true, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field198[arg0].method54(arg2, (byte) -30);
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V", line = 281)
    public static final void method112(int arg0) {
        class23.field335.method1623(1);
        if (arg0 != 6830) {
            field210 = (byte[][][]) ((byte[][][]) null);
        }
        field202++;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IZ)V", line = 291)
    public class16(int arg0, boolean arg1) {
        this.field198 = new class16[arg0];
        this.field191 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLim;I)V", line = 310)
    public void method52(byte arg0, class192 arg1, int arg2) {
        field192++;
        if (arg0 != -7) {
            method112(10);
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)I", line = 321)
    public int method113(int arg0) {
        field196++;
        if (arg0 != -9079) {
            field211 = -40;
        }
        return -1;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V", line = 340)
    public void method68(int arg0) {
        field201++;
        if (this.field191) {
            this.field207.method1783((byte) 40);
            this.field207 = null;
        } else {
            this.field197.method714(1);
            this.field197 = null;
        }
        if (arg0 != -8090) {
            this.field205 = 118;
        }
    }
}
