import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class78 {

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "Lkl;")
    private class100 field1369 = new class100();

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lpu;")
    public static class411 field1358 = new class411();

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "[Ldl;")
    public static class48[] field1364 = new class48[14];

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field1368 = 1;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Lkl;")
    private class100 field1370;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Llq;")
    public static class226 field1366;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)Lkl;")
    public final class100 method564(byte arg0) {
        field1354++;
        class100 var2 = this.field1369.field1659;
        if (this.field1369 == var2) {
            return null;
        }
        var2.method695(-125);
        if (arg0 != -76) {
            field1364 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Z")
    public final boolean method565(byte arg0) {
        field1357++;
        if (arg0 != 99) {
            this.method565((byte) -70);
        }
        return this.field1369.field1659 == this.field1369;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
    public final void method566(boolean arg0) {
        while (true) {
            class100 var2 = this.field1369.field1659;
            if (this.field1369 == var2) {
                if (!arg0) {
                    field1364 = null;
                }
                field1362++;
                this.field1370 = null;
                return;
            }
            var2.method695(-127);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lkl;I)V")
    public final void method567(class100 arg0, int arg1) {
        field1359++;
        if (arg1 != 255) {
            this.method575(-3);
        }
        if (arg0.field1660 != null) {
            arg0.method695(arg1 ^ 0xFFFFFF78);
        }
        arg0.field1660 = this.field1369.field1660;
        arg0.field1659 = this.field1369;
        arg0.field1660.field1659 = arg0;
        arg0.field1659.field1660 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
    public final int method568(int arg0) {
        field1367++;
        int var2 = 0;
        class100 var3 = this.field1369.field1659;
        while (this.field1369 != var3) {
            var3 = var3.field1659;
            var2++;
        }
        return arg0 == 511 ? var2 : 111;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)[B")
    public static final byte[] method569(byte arg0, int arg1) {
        if (arg0 >= -90) {
            method570(30);
        }
        field1356++;
        class126 var2 = (class126) class212.field3376.method2832((byte) 82, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class235.method1620(var4, var7, false);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class126(var3);
            class212.field3376.method2831((byte) 92, var2, (long) arg1);
        }
        return var2.field2184;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public static final void method570(int arg0) {
        int var1 = -117 / ((arg0 - 32) / 56);
        field1361++;
        if (class305.field4873.method822()) {
            class305.field4873.method846(class270.field4495);
            class247.method1682((byte) 98);
            class305.field4873.method890(class270.field4495);
            class305.field4873.method863(class270.field4495);
        } else {
            class86.method616(class511.field7485, 48);
        }
        class408.method2530(17234);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIB)Z")
    public static final boolean method571(int arg0, int arg1, byte arg2) {
        field1365++;
        if (arg2 == -37) {
            return (arg1 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lco;I)Z")
    public static final boolean method572(class445 arg0, int arg1) {
        field1355++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field6656) {
            return false;
        } else if (arg0.method2673(class210.field3326, -13309)) {
            if (arg1 >= -96) {
                method571(112, 25, (byte) 116);
            }
            if (class262.field4366.method2516((long) arg0.field6617, -1) == null) {
                return client.field1183.method2516((long) arg0.field6613, -1) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)Lkl;")
    public final class100 method573(int arg0) {
        if (arg0 != 24037) {
            return null;
        }
        field1360++;
        class100 var2 = this.field1369.field1659;
        if (this.field1369 == var2) {
            this.field1370 = null;
            return null;
        } else {
            this.field1370 = var2.field1659;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V")
    public static void method574(byte arg0) {
        field1364 = null;
        field1366 = null;
        field1358 = null;
        if (arg0 > -40) {
            method570(-51);
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)Lkl;")
    public final class100 method575(int arg0) {
        if (arg0 != 0) {
            this.field1369 = null;
        }
        field1353++;
        class100 var2 = this.field1369.field1660;
        if (this.field1369 == var2) {
            this.field1370 = null;
            return null;
        } else {
            this.field1370 = var2.field1660;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)Lkl;")
    public final class100 method576(int arg0) {
        field1363++;
        class100 var2 = this.field1370;
        if (this.field1369 == var2) {
            this.field1370 = null;
            return null;
        }
        if (arg0 != 14) {
            this.field1369 = null;
        }
        this.field1370 = var2.field1659;
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class78() {
        this.field1369.field1659 = this.field1369;
        this.field1369.field1660 = this.field1369;
    }
}
