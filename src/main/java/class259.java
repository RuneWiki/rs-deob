import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class259 {

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    private int field4323 = 0;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    private int field4325 = -1;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lo;")
    private class227 field4326 = new class227();

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Z")
    public boolean field4334 = false;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    private int field4331;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "[Lfj;")
    private class311[] field4322;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    private int field4327;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "[[[I")
    private int[][][] field4333;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "J")
    public static volatile long field4316 = 0L;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lph;")
    public static class229 field4324 = class266.method1858("Monde de jeu cr-B-B", 0);

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Lph;")
    public static class229 field4328 = class266.method1858("Particles: ", 0);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
    public static int[] field4314 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field4312;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1794(int arg0) {
        field4321++;
        int var1 = 0;
        int[] var2 = new int[class154.field2507];
        if (arg0 != 128) {
            return;
        }
        for (int var3 = 0; var3 < class154.field2507; var3++) {
            class191 var4 = class124.method920(arg0 - 212, var3);
            if (var4.field3162 >= 0 || var4.field3117 >= 0) {
                var2[var1++] = var3;
            }
        }
        class314.field5347 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            class314.field5347[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIBI)V", line = 43)
    public static final void method1795(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4329++;
        class121.field2033.field2670 = 0;
        class121.field2033.method1188(-123, 62);
        class121.field2033.method1188(-77, arg1);
        class121.field2033.method1188(-111, arg4);
        class121.field2033.method1155(-1640531527, arg2);
        class121.field2033.method1155(-1640531527, arg0);
        class228.field3751 = 0;
        class211.field3490 = 1;
        class263.field4404 = 0;
        int var5 = 95 / ((arg3 - 16) / 46);
        class4.field42 = -3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)[[I", line = 68)
    public final int[][] method1796(boolean arg0, int arg1) {
        field4318++;
        if (!arg0) {
            method1800(36, 56, -22, 38, 45, -92);
        }
        if (this.field4331 == this.field4327) {
            this.field4334 = this.field4322[arg1] == null;
            this.field4322[arg1] = class186.field3028;
            return this.field4333[arg1];
        } else if (this.field4327 == 1) {
            this.field4334 = this.field4325 != arg1;
            this.field4325 = arg1;
            return this.field4333[0];
        } else {
            class311 var3 = this.field4322[arg1];
            if (var3 == null) {
                this.field4334 = true;
                if (this.field4323 >= this.field4327) {
                    class311 var4 = (class311) this.field4326.method1575(-61);
                    var3 = new class311(arg1, var4.field5221);
                    this.field4322[var4.field5224] = null;
                    var4.method598(35);
                } else {
                    var3 = new class311(arg1, this.field4323);
                    this.field4323++;
                }
                this.field4322[arg1] = var3;
            } else {
                this.field4334 = false;
            }
            this.field4326.method1578(0, var3);
            return this.field4333[var3.field5221];
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)[[[I", line = 135)
    public final int[][][] method1797(int arg0) {
        field4330++;
        if (this.field4331 != this.field4327) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4327; var2++) {
            this.field4322[var2] = class186.field3028;
        }
        if (arg0 < 93) {
            method1800(-112, -60, -71, -103, -97, -83);
        }
        return this.field4333;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 165)
    public final void method1798(int arg0) {
        if (arg0 > -74) {
            method1800(-10, -104, -82, -83, -112, -83);
        }
        for (int var2 = 0; var2 < this.field4327; var2++) {
            this.field4333[var2][0] = null;
            this.field4333[var2][1] = null;
            this.field4333[var2][2] = null;
            this.field4333[var2] = (int[][]) null;
        }
        this.field4333 = (int[][][]) null;
        this.field4322 = null;
        this.field4326.method1573((byte) -48);
        this.field4326 = null;
        field4317++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lr;", line = 195)
    public static final class269 method1799(int arg0, int arg1) {
        field4315++;
        class269 var2 = (class269) class208.field3428.method1413((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class260.field4357.method523(-102, class111.method850(116, arg1), class129.method934(true, arg1));
        if (arg0 != 20527) {
            field4328 = (class229) null;
        }
        class269 var4 = new class269();
        var4.field4500 = arg1;
        if (var3 != null) {
            var4.method1874((byte) 117, new class164(var3));
        }
        class208.field3428.method1419((long) arg1, arg0 - 15311, var4);
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V", line = 229)
    public static final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class222.field3649 = arg2;
        field4319++;
        class236.field3887 = arg0;
        class205.field3378 = arg5;
        class324.field5544 = arg1;
        class52.field744 = arg4;
        int var6 = -42 / ((arg3 - 65) / 44);
        if (class52.field744 >= 100) {
            int var7 = class236.field3887 * 128 + 64;
            int var8 = class222.field3649 * 128 + 64;
            int var9 = method1801(var7, -20428, class298.field4849, var8) - class324.field5544;
            int var10 = var8 - class192.field3177;
            int var11 = var9 - class205.field3387;
            int var12 = var7 - class167.field2725;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class222.field3653 = (int) (Math.atan2((double) var11, (double) var13) * 325.949D) & 0x7FF;
            class65.field1004 = (int) (Math.atan2((double) var10, (double) var12) * -325.949D) & 0x7FF;
            if (class222.field3653 < 128) {
                class222.field3653 = 128;
            }
            if (class222.field3653 > 383) {
                class222.field3653 = 383;
            }
        }
        class217.field3565 = 2;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)I", line = 283)
    public static final int method1801(int arg0, int arg1, int arg2, int arg3) {
        field4313++;
        if (class192.field3174 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        if (arg1 != -20428) {
            field4324 = (class229) null;
        }
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3 & 0x7F;
        int var7 = arg2;
        int var8 = arg0 & 0x7F;
        if (arg2 < 3 && (class245.field4050[1][var4][var5] & 0x2) == 2) {
            var7 = arg2 + 1;
        }
        int var9 = (128 - var6) * class192.field3174[var7][var4][var5] + class192.field3174[var7][var4 + 1][var5] * var6 >> 7;
        int var10 = (128 - var6) * class192.field3174[var7][var4][var5 + 1] + class192.field3174[var7][var4 + 1][var5 + 1] * var6 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(III)V", line = 356)
    public class259(int arg0, int arg1, int arg2) {
        this.field4331 = arg1;
        this.field4322 = new class311[this.field4331];
        this.field4327 = arg0;
        this.field4333 = new int[this.field4327][3][arg2];
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 335)
    public static void method1802(boolean arg0) {
        field4324 = null;
        field4314 = null;
        if (!arg0) {
            method1802(true);
        }
        field4312 = null;
        field4328 = null;
    }
}
