import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class289 extends class115 {

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field5146 = -1;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "Lcd;")
    public static class69 field5152 = new class69(16);

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Z")
    public static boolean field5155 = false;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field5156 = 2;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "Z")
    public static boolean field5158 = true;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "Lud;")
    public class279 field5139;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "[I")
    public int[] field5140;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "[I")
    public int[] field5144;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "[I")
    public int[] field5151;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "[I")
    public int[] field5153;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 6)
    public static final void method2059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field5143++;
        class283 var13 = new class283();
        if (arg12 != -1) {
            method2060(-100, -45);
        }
        var13.field5056 = arg4;
        var13.field5049 = arg2;
        var13.field5060 = arg8;
        var13.field5054 = arg7;
        var13.field5053 = arg1;
        var13.field5050 = arg11;
        var13.field5055 = arg6;
        var13.field5051 = arg3;
        var13.field5048 = arg5;
        var13.field5057 = arg9;
        var13.field5047 = arg0;
        var13.field5058 = arg10;
        class194.field3483.method2246(true, var13);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 38)
    public static final void method2060(int arg0, int arg1) {
        field5145++;
        class104 var2 = class293.method2085(3, arg1, false);
        int var3 = 41 / ((-arg0 - 17) / 55);
        var2.method875(12466);
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)V", line = 50)
    public final void method2061(byte arg0) {
        if (this.field5153 != null) {
            for (int var2 = 0; var2 < this.field5153.length; var2++) {
                this.field5153[var2] = class301.method2139(this.field5153[var2], 32768);
            }
        }
        field5150++;
        if (this.field5151 != null) {
            for (int var3 = 0; var3 < this.field5151.length; var3++) {
                this.field5151[var3] = class301.method2139(this.field5151[var3], 32768);
            }
        }
        if (arg0 < 58) {
            field5152 = (class69) null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLvh;)V", line = 84)
    public final void method2062(byte arg0, class53 arg1) {
        if (arg0 <= 115) {
            return;
        }
        while (true) {
            int var3 = arg1.method483(-105);
            if (var3 == 0) {
                field5154++;
                return;
            }
            this.method2067(arg1, 44, var3);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V", line = 109)
    public static final void method2063(boolean arg0) {
        field5141++;
        while (class287.field5106.method1624(class264.field4741, !arg0) >= 27) {
            int var1 = class287.field5106.method1628(-100, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class122.field2196[var1] == null) {
                var2 = true;
                class122.field2196[var1] = new class102();
            }
            class102 var3 = class122.field2196[var1];
            class200.field3579[class26.field626++] = var1;
            var3.field84 = class8.field279;
            if (var3.field1921 != null && var3.field1921.method998(28284)) {
                class323.method2272(-75, var3);
            }
            int var4 = class287.field5106.method1628(116, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            var3.method862((byte) 72, class150.method1198(class287.field5106.method1628(89, 14), 116));
            int var5 = class287.field5106.method1628(-103, 1);
            int var6 = class287.field5106.method1628(120, 5);
            int var7 = class75.field1472[class287.field5106.method1628(-109, 3)];
            if (var2) {
                var3.field28 = var3.field44 = var7;
            }
            if (var6 > 15) {
                var6 -= 32;
            }
            int var8 = class287.field5106.method1628(-80, 1);
            if (var8 == 1) {
                class45.field945[class174.field3139++] = var1;
            }
            var3.method1(0, var3.field1921.field2266);
            var3.field23 = var3.field1921.field2294;
            var3.field93 = var3.field1921.field2295;
            if (var3.field93 == 0) {
                var3.field44 = 0;
            }
            var3.method10(var5 == 1, var3.method3((byte) -117), class72.field1420.field34[0] + var6, 0, class72.field1420.field11[0] + var4);
            if (var3.field1921.method998(28284)) {
                class311.method2212(var3.field11[0], (byte) -82, (class239) null, class287.field5134, 0, var3.field34[0], var3, (class264) null);
            }
        }
        class287.field5106.method1635(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 187)
    public static void method2064(int arg0) {
        int var1 = -26 % ((-arg0 - 69) / 38);
        field5152 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V", line = 201)
    public static final void method2065(int arg0, int arg1) {
        field5142++;
        class104 var2 = class293.method2085(7, arg1, false);
        if (arg0 <= 85) {
            field5158 = false;
        }
        var2.method875(12466);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)I", line = 213)
    public final int method2066(int arg0, boolean arg1) {
        field5157++;
        if (arg1) {
            this.field5153 = (int[]) null;
        }
        if (this.field5153 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5153.length; var3++) {
            if (this.field5140[var3] == arg0) {
                return this.field5153[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lvh;II)V", line = 249)
    private final void method2067(class53 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field5139 = arg0.method467((byte) -16);
        } else if (arg2 == 2) {
            int var4 = arg0.method483(-115);
            this.field5151 = new int[var4];
            this.field5144 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5151[var5] = arg0.method468(28214);
                int var6 = arg0.method483(-116);
                if (var6 == 0) {
                    this.field5144[var5] = -1;
                } else {
                    this.field5144[var5] = var6;
                }
            }
        } else if (arg2 == 3) {
            int var7 = arg0.method483(-115);
            this.field5153 = new int[var7];
            this.field5140 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5153[var8] = arg0.method468(28214);
                int var9 = arg0.method483(-128);
                if (var9 == 0) {
                    this.field5140[var8] = -1;
                } else {
                    this.field5140[var8] = var9;
                }
            }
        } else if (arg2 == 4) {
        }
        int var10 = 21 % ((-arg1 - 13) / 55);
        field5149++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)I", line = 329)
    public final int method2068(boolean arg0, int arg1) {
        if (arg0) {
            this.field5140 = (int[]) null;
        }
        field5147++;
        if (this.field5151 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5151.length; var3++) {
            if (this.field5144[var3] == arg1) {
                return this.field5151[var3];
            }
        }
        return -1;
    }
}
