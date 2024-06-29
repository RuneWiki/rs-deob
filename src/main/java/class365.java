import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class365 extends class344 {

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Lum;")
    public class347 field5489 = new class347();

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "Luh;")
    public class108 field5494 = new class108();

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Lbk;")
    private class242 field5492;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field5493 = 0;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([III)V")
    public final void method651(int[] arg0, int arg1, int arg2) {
        field5487++;
        this.field5494.method651(arg0, arg1, arg2);
        for (class98 var4 = (class98) this.field5489.method2096(-21400); var4 != null; var4 = (class98) this.field5489.method2084((byte) 19)) {
            if (!this.field5492.method1493((byte) -109, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1325) {
                        this.method2231(-1, var5 + var6, var4, arg0, var6, var5);
                        var4.field1325 -= var5;
                        break;
                    }
                    this.method2231(-1, var6 + var5, var4, arg0, var6, var4.field1325);
                    var5 -= var4.field1325;
                    var6 += var4.field1325;
                } while (!this.field5492.method1497(var6, var5, arg0, var4, 0));
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()Lcb;")
    public final class344 method645() {
        field5490++;
        class98 var1;
        do {
            var1 = (class98) this.field5489.method2084((byte) 19);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1331 == null);
        return var1.field1331;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILd;[III)V")
    private final void method2231(int arg0, int arg1, class98 arg2, int[] arg3, int arg4, int arg5) {
        field5484++;
        if (~(this.field5492.field3451[arg2.field1332] & 0x4) != arg0 && arg2.field1334 < 0) {
            int var7 = this.field5492.field3462[arg2.field1332] / class266.field3763;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field1323) / var7;
                if (arg5 < var8) {
                    arg2.field1323 += arg5 * var7;
                    break;
                }
                arg2.field1331.method651(arg3, arg4, var8);
                arg4 += var8;
                arg5 -= var8;
                arg2.field1323 += var7 * var8 - 1048576;
                int var9 = class266.field3763 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class462 var11 = arg2.field1331;
                if (this.field5492.field3461[arg2.field1332] == 0) {
                    arg2.field1331 = class462.method2680(arg2.field1315, var11.method2705(), var11.method2690(), var11.method2708());
                } else {
                    arg2.field1331 = class462.method2680(arg2.field1315, var11.method2705(), 0, var11.method2708());
                    this.field5492.method1504(arg2, arg2.field1329.field4102[arg2.field1335] < 0, (byte) -106);
                    arg2.field1331.method2698(var9, var11.method2690());
                }
                if (arg2.field1329.field4102[arg2.field1335] < 0) {
                    arg2.field1331.method2685(-1);
                }
                var11.method2710(var9);
                var11.method651(arg3, arg4, arg1 - arg4);
                if (var11.method2689()) {
                    this.field5494.method640(var11);
                }
            }
        }
        arg2.field1331.method651(arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()I")
    public final int method644() {
        field5485++;
        return 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZLd;)V")
    private final void method2232(int arg0, boolean arg1, class98 arg2) {
        if ((this.field5492.field3451[arg2.field1332] & 0x4) != 0 && arg2.field1334 < 0) {
            int var4 = this.field5492.field3462[arg2.field1332] / class266.field3763;
            int var5 = (var4 + 1048575 - arg2.field1323) / var4;
            arg2.field1323 = arg0 * var4 + arg2.field1323 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field5492.field3461[arg2.field1332] == 0) {
                    arg2.field1331 = class462.method2680(arg2.field1315, arg2.field1331.method2705(), arg2.field1331.method2690(), arg2.field1331.method2708());
                } else {
                    arg2.field1331 = class462.method2680(arg2.field1315, arg2.field1331.method2705(), 0, arg2.field1331.method2708());
                    this.field5492.method1504(arg2, arg2.field1329.field4102[arg2.field1335] < 0, (byte) 85);
                }
                if (arg2.field1329.field4102[arg2.field1335] < 0) {
                    arg2.field1331.method2685(-1);
                }
                arg0 = arg2.field1323 / var4;
            }
        }
        field5483++;
        arg2.field1331.method650(arg0);
        if (arg1) {
            this.method651(null, -77, -51);
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()Lcb;")
    public final class344 method642() {
        field5488++;
        class98 var1 = (class98) this.field5489.method2096(-21400);
        if (var1 == null) {
            return null;
        } else if (var1.field1331 == null) {
            return this.method645();
        } else {
            return var1.field1331;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public final void method650(int arg0) {
        this.field5494.method650(arg0);
        field5486++;
        for (class98 var2 = (class98) this.field5489.method2096(-21400); var2 != null; var2 = (class98) this.field5489.method2084((byte) 19)) {
            if (!this.field5492.method1493((byte) 123, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1325) {
                        this.method2232(var3, false, var2);
                        var2.field1325 -= var3;
                        break;
                    }
                    this.method2232(var2.field1325, false, var2);
                    var3 -= var2.field1325;
                } while (!this.field5492.method1497(0, var3, null, var2, 0));
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lbk;)V")
    public class365(class242 arg0) {
        this.field5492 = arg0;
    }
}
