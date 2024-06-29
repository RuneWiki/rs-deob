import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class339 extends class751 {

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    private int field5037 = 10;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    private int field5029 = 0;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    private int field5035 = 2048;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field5039 = 0;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "[I")
    private int[] field5032;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "[I")
    private int[] field5033;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public final void method1454(byte arg0) {
        ++field5034;
        if (arg0 > 123) {
            this.method2175(true);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
    public static final void method2174() {
        for (int var0 = 0; var0 < class468.field6693.length; ++var0) {
            class468.field6693[var0].method2665();
        }
        class468.field6693 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    private final void method2175(boolean arg0) {
        ++field5040;
        this.field5033 = new int[this.field5037 + 1];
        int var2 = 0;
        this.field5032 = new int[this.field5037 + 1];
        int var3 = 4096 / this.field5037;
        int var4 = this.field5035 * var3 >> 12;
        if (!arg0) {
            this.method309(-33, (class120) null, 37);
        }
        for (int var5 = 0; this.field5037 > var5; ++var5) {
            this.field5033[var5] = var2;
            this.field5032[var5] = var2 + var4;
            var2 += var3;
        }
        this.field5033[this.field5037] = 4096;
        this.field5032[this.field5037] = 4096 - -this.field5032[0];
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        if (arg1 != 4095) {
            method2174();
        }
        ++field5041;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int var4 = class619.field8728[arg0];
            if (this.field5029 != 0) {
                for (int var5 = 0; class673.field9452 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class179.field2708[var5];
                    int var9 = this.field5029;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var8 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field5037 < ~var10; ++var10) {
                        if (var6 >= this.field5033[var10] && this.field5033[var10 + 1] > var6) {
                            if (~var6 > ~this.field5032[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field5037; ++var12) {
                    if (~var4 <= ~this.field5033[var12] && ~this.field5033[var12 - -1] < ~var4) {
                        if (this.field5032[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class42.method293(var3, 0, class673.field9452, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class339() {
        super(0, true);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field5038;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field5029 = arg1.method842(2384);
                }
            } else {
                this.field5035 = arg1.method898((byte) -119);
            }
        } else {
            this.field5037 = arg1.method842(2384);
        }
        int var5 = 99 / ((25 - arg0) / 63);
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(B)V")
    public static final void method2176(byte arg0) {
        int var1 = -16 % ((50 - arg0) / 55);
        ++class174.field2454;
        ++field5036;
        class731 var2 = class155.method1222(260, class58.field818, class237.field3417);
        var2.field10211.method851((byte) -2, 0);
        class533.method3088(var2, 0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2177(int arg0, int arg1, boolean arg2) {
        ++field5031;
        if (!class229.method1596(-98, arg0, arg1)) {
            return false;
        } else if (class162.method1273(arg1, -5913, arg0) | ~(arg0 & 45056) != -1 | class530.method3081(arg0, (byte) 31, arg1)) {
            return true;
        } else {
            if (arg2) {
                method2177(67, -34, true);
            }
            return (class627.method3590(-114, arg1, arg0) | class697.method3930(arg1, 0, arg0)) & (55 & arg1) == 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(B)V")
    public static final void method2178(byte arg0) {
        ++field5030;
        if (~class284.field4365 != -1) {
            try {
                if (~(++class207.field3027) < -2001) {
                    if (class76.field1025 != null) {
                        class76.field1025.method201(69);
                        class76.field1025 = null;
                    }
                    if (class789.field10835 >= 2) {
                        class284.field4365 = 0;
                        class715.field10078 = -5;
                        return;
                    }
                    class458.field6560.method2878(3128);
                    class284.field4365 = 1;
                    ++class789.field10835;
                    class207.field3027 = 0;
                }
                int var1 = -61 / ((14 - arg0) / 57);
                if (~class284.field4365 == -2) {
                    class744.field10365 = class458.field6560.method2876(-1, class27.field395);
                    class284.field4365 = 2;
                }
                if (class284.field4365 == 2) {
                    if (class744.field10365.field5314 == 2) {
                        throw new IOException();
                    }
                    if (~class744.field10365.field5314 != -2) {
                        return;
                    }
                    class76.field1025 = class325.method2110((Socket) class744.field10365.field5317, 15000, -1);
                    class744.field10365 = null;
                    class663.method3778(121);
                    class284.field4365 = 4;
                }
                if (~class284.field4365 == -5) {
                    if (class76.field1025.method199(1, (byte) 101)) {
                        class76.field1025.method200(1, -30359, 0, class26.field371.field1556);
                        int var2 = 255 & class26.field371.field1556[0];
                        class715.field10078 = var2;
                        class284.field4365 = 0;
                        class76.field1025.method201(-61);
                        class76.field1025 = null;
                    }
                }
            } catch (IOException var3) {
                if (class76.field1025 != null) {
                    class76.field1025.method201(28);
                    class76.field1025 = null;
                }
                if (~class789.field10835 <= -3) {
                    class284.field4365 = 0;
                    class715.field10078 = -4;
                } else {
                    class458.field6560.method2878(3128);
                    class207.field3027 = 0;
                    ++class789.field10835;
                    class284.field4365 = 1;
                }
            }
        }
    }
}
