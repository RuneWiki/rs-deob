import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class94 extends class513 {

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field1375 = -1;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Leo;)V")
    public static final void method642(class321 arg0) {
        class365.field4690 = arg0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Z")
    public final boolean method643(int arg0) {
        if (arg0 != 1) {
            this.method647((byte) 127);
        }
        field1370++;
        return (this.field1372 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Z")
    public final boolean method644(byte arg0) {
        field1378++;
        if (arg0 == 16) {
            return (this.field1372 >> 22 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Lsc;")
    public static final class451 method645(int arg0, int arg1) {
        field1374++;
        class451 var2 = (class451) class146.field2024.method3200((long) arg1, -19983);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class351.field4458.method3322(1, arg1, (byte) 83);
        class451 var4 = new class451();
        var4.field6207 = arg1;
        if (arg0 != -1) {
            method642(null);
        }
        if (var3 != null) {
            var4.method2713(new class26(var3), -237);
        }
        var4.method2716(-14227);
        if (var4.field6209 == 2 && class175.field2386.method1381(true, (long) arg1) == null) {
            class175.field2386.method1387(new class285(class576.field8155), (long) arg1, (byte) -128);
            class76.field1046[class576.field8155++] = var4;
        }
        class146.field2024.method3199((byte) 78, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)I")
    public final int method646(byte arg0) {
        if (arg0 == -122) {
            field1377++;
            return this.field1372 >> 18 & 0x7;
        } else {
            return 92;
        }
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)I")
    public final int method647(byte arg0) {
        if (arg0 != -125) {
            this.field1376 = 50;
        }
        field1371++;
        return class608.method3556(this.field1372, 104);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(II)V")
    public class94(int arg0, int arg1) {
        this.field1376 = arg1;
        this.field1372 = arg0;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Z")
    public final boolean method648(int arg0) {
        field1379++;
        if (arg0 == 2111642) {
            return ((this.field1372 & 0x20389A) >> 21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)Z")
    public final boolean method649(int arg0, byte arg1) {
        int var3 = 100 / ((arg1 + 61) / 42);
        field1373++;
        return (this.field1372 >> arg0 + 1 & 0x1) != 0;
    }
}
