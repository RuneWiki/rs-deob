import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class109 {

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Z")
    public boolean field1473 = false;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "Lgw;")
    private class690 field1474 = new class690(64);

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "Lgw;")
    public class690 field1477 = new class690(500);

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "Lgw;")
    public class690 field1478 = new class690(30);

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Lgw;")
    public class690 field1479 = new class690(50);

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Z")
    public boolean field1466;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Luu;")
    public class237 field1468;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "Luu;")
    private class237 field1472;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "[Llk;")
    public static class252[] field1467 = new class252[6];

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lwha;")
    public static class342 field1462 = null;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)V", line = 7)
    public final void method709(byte arg0, int arg1) {
        field1463++;
        this.field1480 = arg1;
        class690 var3 = this.field1477;
        synchronized (this.field1477) {
            this.field1477.method3906(-116);
        }
        class690 var4 = this.field1478;
        synchronized (this.field1478) {
            this.field1478.method3906(-95);
            if (arg0 >= -109) {
                this.field1478 = null;
            }
        }
        class690 var5 = this.field1479;
        synchronized (this.field1479) {
            this.field1479.method3906(-125);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 27)
    public static void method710(int arg0) {
        field1467 = null;
        if (arg0 >= -118) {
            method710(64);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 37)
    public final void method711(byte arg0) {
        field1471++;
        class690 var2 = this.field1474;
        synchronized (this.field1474) {
            this.field1474.method3906(-109);
        }
        class690 var3 = this.field1477;
        synchronized (this.field1477) {
            this.field1477.method3906(-108);
        }
        class690 var4 = this.field1478;
        synchronized (this.field1478) {
            this.field1478.method3906(-118);
            if (arg0 > -91) {
                this.field1473 = true;
            }
        }
        class690 var5 = this.field1479;
        synchronized (this.field1479) {
            this.field1479.method3906(-94);
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 62)
    public final void method712(int arg0) {
        class690 var2 = this.field1474;
        synchronized (this.field1474) {
            this.field1474.method3902(0);
        }
        field1469++;
        class690 var3 = this.field1477;
        synchronized (this.field1477) {
            this.field1477.method3902(arg0);
        }
        class690 var4 = this.field1478;
        synchronized (this.field1478) {
            this.field1478.method3902(0);
        }
        class690 var5 = this.field1479;
        synchronized (this.field1479) {
            this.field1479.method3902(0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V", line = 88)
    public final void method713(int arg0, boolean arg1) {
        field1475++;
        int var3 = -2 % ((arg0 + 20) / 34);
        if (this.field1473 != arg1) {
            this.field1473 = arg1;
            this.method711((byte) -125);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZB)V", line = 106)
    public final void method714(boolean arg0, byte arg1) {
        field1465++;
        if (this.field1466 == arg0) {
            return;
        }
        this.field1466 = arg0;
        if (arg1 != -15) {
            this.field1466 = false;
        }
        this.method711((byte) -121);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V", line = 123)
    public final void method715(boolean arg0, int arg1) {
        if (!arg0) {
            this.method715(true, 31);
        }
        field1464++;
        this.field1474 = new class690(arg1);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Lts;", line = 139)
    public final class220 method716(int arg0, int arg1) {
        field1476++;
        class690 var3 = this.field1474;
        class220 var4;
        synchronized (this.field1474) {
            var4 = (class220) this.field1474.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field1472;
        byte[] var6;
        synchronized (this.field1472) {
            var6 = this.field1472.method1572(class303.method1997(arg1, true), 0, class134.method850(arg1, 200));
        }
        class220 var7 = new class220();
        var7.field2899 = this;
        if (arg0 != 6) {
            this.field1468 = null;
        }
        var7.field2964 = arg1;
        if (var6 != null) {
            var7.method1290(0, new class63(var6));
        }
        var7.method1304(102);
        if (!this.field1466 && var7.field2883) {
            var7.field2877 = null;
            var7.field2942 = null;
        }
        if (var7.field2896) {
            var7.field2884 = 0;
            var7.field2875 = false;
        }
        class690 var8 = this.field1474;
        synchronized (this.field1474) {
            this.field1474.method3899(-95, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(ZI)V", line = 185)
    public final void method717(boolean arg0, int arg1) {
        field1470++;
        class690 var3 = this.field1474;
        synchronized (this.field1474) {
            this.field1474.method3896(1, arg1);
        }
        class690 var4 = this.field1477;
        synchronized (this.field1477) {
            this.field1477.method3896(1, arg1);
        }
        class690 var5 = this.field1478;
        synchronized (this.field1478) {
            this.field1478.method3896(1, arg1);
            if (!arg0) {
                this.method714(true, (byte) -60);
            }
        }
        class690 var6 = this.field1479;
        synchronized (this.field1479) {
            this.field1479.method3896(1, arg1);
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lgp;IZLuu;Luu;)V", line = 226)
    public class109(class553 arg0, int arg1, boolean arg2, class237 arg3, class237 arg4) {
        this.field1466 = arg2;
        this.field1468 = arg4;
        this.field1472 = arg3;
        if (this.field1472 != null) {
            int var6 = this.field1472.method1584((byte) 117) - 1;
            this.field1472.method1597(var6, 0);
        }
    }
}
