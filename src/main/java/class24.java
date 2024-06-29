import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class24 extends class115 {

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field409 = 128;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "Lub;")
    private static class227 field399 = class257.method1749("Loading title screen )2 ", 17263);

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "Lub;")
    public static class227 field403 = field399;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "La;")
    public static class20 field402;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Lub;")
    public class227 field400;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "[I")
    public int[] field397;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "[I")
    public int[] field401;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "[I")
    public int[] field406;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "[I")
    public int[] field407;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V")
    public static void method115(byte arg0) {
        field402 = null;
        field403 = null;
        field399 = null;
        if (arg0 > -118) {
            method120(-101, 76, 101, 110L);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljk;IB[B)V")
    public static final void method116(class192 arg0, int arg1, byte arg2, byte[] arg3) {
        field410++;
        class41 var4 = new class41();
        var4.field1113 = (long) arg1;
        var4.field678 = arg0;
        var4.field680 = arg3;
        var4.field671 = 0;
        int var5 = -18 / ((arg2 + 2) / 54);
        class198 var6 = class192.field3256;
        synchronized (class192.field3256) {
            class192.field3256.method1272(5664, var4);
        }
        class86.method517(1684492428);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
    public final int method117(int arg0, int arg1) {
        field405++;
        if (this.field397 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field397.length; var3++) {
            if (this.field406[var3] == arg1) {
                return this.field397[var3];
            }
        }
        if (arg0 >= -112) {
            this.field401 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)I")
    public final int method118(int arg0, int arg1) {
        field411++;
        if (this.field407 == null) {
            return -1;
        }
        if (arg0 != -1) {
            this.method118(-36, 48);
        }
        for (int var3 = 0; var3 < this.field407.length; var3++) {
            if (this.field401[var3] == arg1) {
                return this.field407[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lnj;B)V")
    public final void method119(class226 arg0, byte arg1) {
        if (arg1 != 103) {
            method115((byte) 122);
        }
        while (true) {
            int var3 = arg0.method1471(255);
            if (var3 == 0) {
                field404++;
                return;
            }
            this.method122(-1, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method120(int arg0, int arg1, int arg2, long arg3) {
        class108 var5 = class261.field4539[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2024 != null && var5.field2024.field879 == arg3) {
            return true;
        } else if (var5.field2037 != null && var5.field2037.field1378 == arg3) {
            return true;
        } else if (var5.field2039 != null && var5.field2039.field2312 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2012; var6++) {
                if (var5.field2021[var6].field4029 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)V")
    public final void method121(byte arg0) {
        int var2 = -79 % ((arg0 - 58) / 48);
        if (this.field397 != null) {
            for (int var3 = 0; var3 < this.field397.length; var3++) {
                this.field397[var3] = class246.method1640(this.field397[var3], 32768);
            }
        }
        if (this.field407 != null) {
            for (int var4 = 0; var4 < this.field407.length; var4++) {
                this.field407[var4] = class246.method1640(this.field407[var4], 32768);
            }
        }
        field408++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILnj;I)V")
    private final void method122(int arg0, class226 arg1, int arg2) {
        if (arg2 == 1) {
            this.field400 = arg1.method1480(arg0 + 15);
        } else if (arg2 == 2) {
            int var7 = arg1.method1471(arg0 + 256);
            this.field407 = new int[var7];
            this.field401 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field407[var8] = arg1.method1447(0);
                int var9 = arg1.method1471(255);
                if (var9 == 0) {
                    this.field401[var8] = -1;
                } else {
                    this.field401[var8] = var9;
                }
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1471(255);
            this.field397 = new int[var4];
            this.field406 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field397[var5] = arg1.method1447(0);
                int var6 = arg1.method1471(255);
                if (var6 == 0) {
                    this.field406[var5] = -1;
                } else {
                    this.field406[var5] = var6;
                }
            }
        }
        if (arg0 != -1) {
            field399 = null;
        }
        field398++;
    }
}
