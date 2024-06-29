import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class76 extends class224 {

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "Lch;")
    public class117 field1461 = new class117();

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "Lhi;")
    public class250 field1466 = new class250();

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "Lod;")
    private class21 field1458;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "Z")
    public static boolean field1465 = false;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
    public final void method208(int arg0) {
        field1464++;
        this.field1466.method208(arg0);
        for (class131 var2 = (class131) this.field1461.method789((byte) -123); var2 != null; var2 = (class131) this.field1461.method787((byte) -76)) {
            if (!this.field1458.method203((byte) -119, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2400) {
                        this.method538(var3, var2, (byte) 69);
                        var2.field2400 -= var3;
                        break;
                    }
                    this.method538(var2.field2400, var2, (byte) 69);
                    var3 -= var2.field2400;
                } while (!this.field1458.method183(var3, var2, 0, (int[]) null, 123));
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "([III)V")
    public final void method192(int[] arg0, int arg1, int arg2) {
        this.field1466.method192(arg0, arg1, arg2);
        for (class131 var4 = (class131) this.field1461.method789((byte) -81); var4 != null; var4 = (class131) this.field1461.method787((byte) -76)) {
            if (!this.field1458.method203((byte) -124, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2400 >= var6) {
                        this.method537(arg0, var5, var6, var4, var5 + var6, (byte) 90);
                        var4.field2400 -= var6;
                        break;
                    }
                    this.method537(arg0, var5, var4.field2400, var4, var5 + var6, (byte) 90);
                    var5 += var4.field2400;
                    var6 -= var4.field2400;
                } while (!this.field1458.method183(var6, var4, var5, arg0, -114));
            }
        }
        field1460++;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()I")
    public final int method174() {
        field1455++;
        return 0;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)Z")
    public static final boolean method536(byte arg0) {
        field1463++;
        if (arg0 != -42) {
            field1465 = true;
        }
        return class216.field3899 == 0 ? class270.field4818.method177((byte) -111) : true;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([IIILmg;IB)V")
    private final void method537(int[] arg0, int arg1, int arg2, class131 arg3, int arg4, byte arg5) {
        if (arg5 != 90) {
            this.field1461 = null;
        }
        if ((this.field1458.field578[arg3.field2401] & 0x4) != 0 && arg3.field2381 < 0) {
            int var7 = this.field1458.field618[arg3.field2401] / class125.field2242;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field2375) / var7;
                if (var8 > arg2) {
                    arg3.field2375 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg3.field2377.method192(arg0, arg1, var8);
                arg3.field2375 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                arg1 += var8;
                class180 var10 = arg3.field2377;
                int var11 = class125.field2242 / 100;
                if (var11 > var9) {
                    var11 = var9;
                }
                if (this.field1458.field646[arg3.field2401] == 0) {
                    arg3.field2377 = class180.method1203(arg3.field2387, var10.method1193(), var10.method1201(), var10.method1186());
                } else {
                    arg3.field2377 = class180.method1203(arg3.field2387, var10.method1193(), 0, var10.method1186());
                    this.field1458.method184(arg3, arg3.field2378.field1735[arg3.field2397] < 0, (byte) 13);
                    arg3.field2377.method1194(var11, var10.method1201());
                }
                if (arg3.field2378.field1735[arg3.field2397] < 0) {
                    arg3.field2377.method1208(-1);
                }
                var10.method1169(var11);
                var10.method192(arg0, arg1, arg4 - arg1);
                if (var10.method1170()) {
                    this.field1466.method1661(var10);
                }
            }
        }
        field1459++;
        arg3.field2377.method192(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()Lvg;")
    public final class224 method182() {
        field1467++;
        class131 var1;
        do {
            var1 = (class131) this.field1461.method787((byte) -76);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2377 == null);
        return var1.field2377;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILmg;B)V")
    private final void method538(int arg0, class131 arg1, byte arg2) {
        if (arg2 != 69) {
            return;
        }
        if ((this.field1458.field578[arg1.field2401] & 0x4) != 0 && arg1.field2381 < 0) {
            int var4 = this.field1458.field618[arg1.field2401] / class125.field2242;
            int var5 = (1048575 - (arg1.field2375 - var4)) / var4;
            arg1.field2375 = arg0 * var4 + arg1.field2375 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field1458.field646[arg1.field2401] == 0) {
                    arg1.field2377 = class180.method1203(arg1.field2387, arg1.field2377.method1193(), arg1.field2377.method1201(), arg1.field2377.method1186());
                } else {
                    arg1.field2377 = class180.method1203(arg1.field2387, arg1.field2377.method1193(), 0, arg1.field2377.method1186());
                    this.field1458.method184(arg1, arg1.field2378.field1735[arg1.field2397] < 0, (byte) 13);
                }
                if (arg1.field2378.field1735[arg1.field2397] < 0) {
                    arg1.field2377.method1208(-1);
                }
                arg0 = arg1.field2375 / var4;
            }
        }
        field1457++;
        arg1.field2377.method208(arg0);
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "()Lvg;")
    public final class224 method211() {
        field1454++;
        class131 var1 = (class131) this.field1461.method789((byte) -77);
        if (var1 == null) {
            return null;
        } else if (var1.field2377 == null) {
            return this.method182();
        } else {
            return var1.field2377;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lod;)V")
    public class76(class21 arg0) {
        this.field1458 = arg0;
    }
}
