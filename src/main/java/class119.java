import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class119 {

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lbo;")
    private class28 field1539 = new class28();

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "S")
    public static short field1546 = 320;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lbo;")
    private class28 field1549;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lfs;")
    public static class546 field1536;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lbo;", line = 5)
    public final class28 method887(int arg0) {
        if (arg0 >= -55) {
            return null;
        }
        field1541++;
        class28 var2 = this.field1539.field438;
        if (this.field1539 == var2) {
            this.field1549 = null;
            return null;
        } else {
            this.field1549 = var2.field438;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 26)
    public static void method888(int arg0) {
        field1536 = null;
        if (arg0 != 13) {
            method888(-119);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLbo;)V", line = 36)
    public final void method889(byte arg0, class28 arg1) {
        field1540++;
        if (arg1.field439 != null) {
            arg1.method237((byte) -102);
        }
        arg1.field438 = this.field1539.field438;
        arg1.field439 = this.field1539;
        arg1.field439.field438 = arg1;
        arg1.field438.field439 = arg1;
        if (arg0 != -49) {
            field1546 = -56;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(BLbo;)V", line = 59)
    public final void method890(byte arg0, class28 arg1) {
        if (arg1.field439 != null) {
            arg1.method237((byte) -96);
        }
        field1547++;
        arg1.field439 = this.field1539.field439;
        arg1.field438 = this.field1539;
        arg1.field439.field438 = arg1;
        if (arg0 <= -4) {
            arg1.field438.field439 = arg1;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFBF)F", line = 77)
    public static final float method891(float arg0, float arg1, byte arg2, float arg3) {
        field1544++;
        if (arg2 > -101) {
            method898((byte) -55);
        }
        return (arg0 - arg3) * arg1 + arg3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)Lbo;", line = 89)
    public final class28 method892(boolean arg0) {
        if (!arg0) {
            this.method887(3);
        }
        field1537++;
        class28 var2 = this.field1549;
        if (this.field1539 == var2) {
            this.field1549 = null;
            return null;
        } else {
            this.field1549 = var2.field438;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lbo;", line = 112)
    public final class28 method893(byte arg0) {
        field1543++;
        class28 var2 = this.field1539.field438;
        if (arg0 <= 104) {
            field1546 = 89;
        }
        if (this.field1539 == var2) {
            return null;
        } else {
            var2.method237((byte) -82);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)Lbo;", line = 132)
    public final class28 method894(byte arg0) {
        field1538++;
        class28 var2 = this.field1539.field439;
        if (this.field1539 == var2) {
            return null;
        }
        var2.method237((byte) -86);
        if (arg0 != -112) {
            field1536 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)I", line = 150)
    public final int method895(int arg0) {
        field1545++;
        int var2 = arg0;
        for (class28 var3 = this.field1539.field438; var3 != this.field1539; var3 = var3.field438) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V", line = 168)
    public final void method896(int arg0) {
        while (true) {
            class28 var2 = this.field1539.field438;
            if (this.field1539 == var2) {
                field1548++;
                this.field1549 = null;
                if (arg0 != 13) {
                    this.method892(true);
                    return;
                }
                return;
            }
            var2.method237((byte) -127);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 236)
    public class119() {
        this.field1539.field438 = this.field1539;
        this.field1539.field439 = this.field1539;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Lun;", line = 201)
    public static final class266 method897(int arg0, int arg1, int arg2) {
        class530 var3 = class483.field6438[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class266 var4 = var3.field6896;
            var3.field6896 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V", line = 214)
    public static final void method898(byte arg0) {
        field1542++;
        if (class566.field7391 == 7) {
            class250.method1577(3, false);
        } else {
            int var1 = 43 % ((41 - arg0) / 63);
            class535.field6958 = class2.field15;
            class2.field15 = null;
            class442.method2508(13, 1);
        }
    }
}
