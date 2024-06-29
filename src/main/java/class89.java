import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class89 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    private int field1362 = -1;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    private int field1364 = 0;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Luj;")
    private class156 field1371 = new class156();

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Z")
    public boolean field1372 = false;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[Lj;")
    private class8[] field1370;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "[[[I")
    private int[][][] field1358;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field1356 = -2;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[[I", line = 10)
    public final int[][] method603(int arg0, int arg1) {
        if (arg1 > -122) {
            field1365 = 1;
        }
        field1367++;
        if (this.field1369 == this.field1360) {
            this.field1372 = this.field1370[arg0] == null;
            this.field1370[arg0] = class42.field650;
            return this.field1358[arg0];
        } else if (this.field1369 == 1) {
            this.field1372 = this.field1362 != arg0;
            this.field1362 = arg0;
            return this.field1358[0];
        } else {
            class8 var3 = this.field1370[arg0];
            if (var3 == null) {
                this.field1372 = true;
                if (this.field1364 >= this.field1369) {
                    class8 var4 = (class8) this.field1371.method1000((byte) 113);
                    var3 = new class8(arg0, var4.field165);
                    this.field1370[var4.field163] = null;
                    var4.method552((byte) -125);
                } else {
                    var3 = new class8(arg0, this.field1364);
                    this.field1364++;
                }
                this.field1370[arg0] = var3;
            } else {
                this.field1372 = false;
            }
            this.field1371.method1003(126, var3);
            return this.field1358[var3.field165];
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V", line = 86)
    public static final void method604(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1368++;
        if (class268.field4419 == 1) {
            class246.field3985[class10.field179 / 100].method139(class295.field4907 - 8, class10.field191 + -8);
        }
        if (class268.field4419 == 2) {
            class246.field3985[class10.field179 / 100 + 4].method139(class295.field4907 - 8, class10.field191 + -8);
        }
        class222.method1413(arg4 + 58);
        if (arg4 != 0) {
            field1373 = 44;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(III)V", line = 180)
    public class89(int arg0, int arg1, int arg2) {
        this.field1360 = arg1;
        this.field1370 = new class8[this.field1360];
        this.field1369 = arg0;
        this.field1358 = new int[this.field1369][3][arg2];
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 117)
    public final void method605(byte arg0) {
        field1357++;
        for (int var2 = 0; var2 < this.field1369; var2++) {
            this.field1358[var2][0] = null;
            this.field1358[var2][1] = null;
            this.field1358[var2][2] = null;
            this.field1358[var2] = (int[][]) null;
        }
        this.field1370 = null;
        this.field1358 = (int[][][]) null;
        this.field1371.method1001(-60);
        if (arg0 >= -67) {
            field1373 = 120;
        }
        this.field1371 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Z", line = 156)
    public static final boolean method606(int arg0, int arg1) {
        int var2 = -101 % ((arg1 - 70) / 45);
        field1361++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)[[[I", line = 192)
    public final int[][][] method607(int arg0) {
        field1366++;
        if (this.field1369 != this.field1360) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -28281) {
            for (int var2 = 0; var2 < this.field1369; var2++) {
                this.field1370[var2] = class42.field650;
            }
            return this.field1358;
        } else {
            return (int[][][]) ((int[][][]) null);
        }
    }
}
