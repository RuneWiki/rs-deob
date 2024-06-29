import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class332 extends class80 {

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public int field5659 = 0;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public static int field5661 = -2;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public static int field5660 = 0;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public int field5641;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public int field5643;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public int field5644;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public int field5649;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public int field5650;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public int field5651;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public int field5653;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    public int field5656;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    public int field5657;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public int field5663;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "Lac;")
    public class144 field5652;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "Lac;")
    public class144 field5662;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "Lce;")
    public class209 field5647;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "Lrd;")
    public class217 field5655;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Lqa;")
    public class83 field5642;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Lwe;")
    public static class92 field5646;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "Z")
    public boolean field5658;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "[I")
    public int[] field5645;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "[I")
    public static int[] field5648;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 10)
    public static final void method2270(int arg0, int arg1) {
        field5664++;
        class275.field4596[0] = (float) (class243.method1696(arg0, 16759397) >> 16) / 255.0F;
        class275.field4596[2] = (float) class243.method1696(255, arg0) / 255.0F;
        class275.field4596[1] = (float) (class243.method1696(65379, arg0) >> 8) / 255.0F;
        int var2 = 35 / ((arg1 - 28) / 55);
        class149.method1085(3, (byte) 64);
        class149.method1085(4, (byte) 64);
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(I)V", line = 39)
    public final void method2271(int arg0) {
        if (arg0 != 0) {
            field5661 = 74;
        }
        int var2 = this.field5644;
        if (this.field5642 != null) {
            class83 var3 = this.field5642.method613((byte) -93);
            if (var3 == null) {
                this.field5644 = -1;
                this.field5657 = 0;
                this.field5645 = null;
                this.field5643 = 0;
                this.field5650 = 0;
            } else {
                this.field5645 = var3.field1418;
                this.field5644 = var3.field1399;
                this.field5657 = var3.field1379;
                this.field5643 = var3.field1433 * 128;
                this.field5650 = var3.field1395;
            }
        } else if (this.field5655 != null) {
            int var4 = class94.method701(this.field5655, false);
            if (var2 != var4) {
                this.field5644 = var4;
                class313 var5 = this.field5655.field3559;
                if (var5.field5262 != null) {
                    var5 = var5.method2118(0);
                }
                if (var5 == null) {
                    this.field5643 = 0;
                } else {
                    this.field5643 = var5.field5332 * 128;
                }
            }
        } else if (this.field5647 != null) {
            this.field5644 = class301.method2021((byte) 120, this.field5647);
            this.field5643 = this.field5647.field3447 * 128;
        }
        if (this.field5644 != var2 && this.field5662 != null) {
            class239.field3949.method2150(this.field5662);
            this.field5662 = null;
        }
        field5639++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([Lri;II)V", line = 121)
    public static final void method2272(class301[] arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = 38 / ((-arg2 - 17) / 55);
        while (arg0.length > var3) {
            class301 var5 = arg0[var3];
            if (var5 != null && var5.field5040 == arg1 && (!var5.field5043 || !client.method2171(var5))) {
                label103: {
                    if (var5.field4920 == 0) {
                        if (!var5.field5043 && client.method2171(var5) && class181.field2967 != var5) {
                            break label103;
                        }
                        method2272(arg0, var5.field4948, 52);
                        if (var5.field4955 != null) {
                            method2272(var5.field4955, var5.field4948, 106);
                        }
                        class48 var6 = (class48) class251.field4176.method713(3365, (long) var5.field4948);
                        if (var6 != null) {
                            class213.method1506(var6.field700, (byte) 127);
                        }
                    }
                    if (var5.field4920 == 6) {
                        if (var5.field4973 != -1 || var5.field4928 != -1) {
                            boolean var7 = class314.method2129((byte) 40, var5);
                            int var8;
                            if (var7) {
                                var8 = var5.field4928;
                            } else {
                                var8 = var5.field4973;
                            }
                            if (var8 != -1) {
                                class312 var9 = class53.method362((byte) 101, var8);
                                if (var9 != null) {
                                    var5.field4950 += class69.field1106;
                                    while (var5.field4950 > var9.field5236[var5.field5000]) {
                                        var5.field4950 -= var9.field5236[var5.field5000];
                                        var5.field5000++;
                                        if (var5.field5000 >= var9.field5226.length) {
                                            var5.field5000 -= var9.field5228;
                                            if (var5.field5000 < 0 || var5.field5000 >= var9.field5226.length) {
                                                var5.field5000 = 0;
                                            }
                                        }
                                        class296.method2006(var5, 124);
                                    }
                                }
                            }
                        }
                        if (var5.field4883 != 0 && !var5.field5043) {
                            int var10 = var5.field4883 >> 16;
                            int var11 = class69.field1106 * var10;
                            var5.field5034 = var5.field5034 + var11 & 0x7FF;
                            int var12 = var5.field4883 << 16 >> 16;
                            int var13 = class69.field1106 * var12;
                            var5.field4916 = var5.field4916 + var13 & 0x7FF;
                            class296.method2006(var5, 121);
                        }
                    }
                }
            }
            var3++;
        }
        field5640++;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V", line = 235)
    public static void method2273(int arg0) {
        field5648 = null;
        field5646 = null;
        if (arg0 != 4) {
            field5648 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IBLsi;I)[Lcl;", line = 247)
    public static final class32[] method2274(int arg0, byte arg1, class66 arg2, int arg3) {
        field5654++;
        if (class176.method1264(arg3, (byte) 65, arg2, arg0)) {
            if (arg1 <= 22) {
                field5660 = 36;
            }
            return class132.method938(-101);
        } else {
            return null;
        }
    }
}
