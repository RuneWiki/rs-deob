import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class46 extends class278 {

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    private final int field761;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    private final int field753;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    private final int field752;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "[Z")
    public static boolean[] field751 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "J")
    public static long field768 = 0L;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "Lcd;")
    public static class64 field763 = class44.method335((byte) 71, ")4p=");

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "[B")
    private byte[] field762;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V", line = 20)
    public static void method341(byte arg0) {
        int var1 = -7 % ((48 - arg0) / 60);
        field763 = null;
        field751 = null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIIIFFF)V", line = 30)
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field761 = (int) (arg7 * 4096.0F);
        this.field753 = (int) (arg6 * 4096.0F);
        this.field760 = this.field752 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 42)
    public final void method342(byte arg0) {
        this.field769 >>= 0x4;
        if (arg0 != 55) {
            return;
        }
        this.field760 = this.field752;
        if (this.field769 < 0) {
            this.field769 = 0;
        } else if (this.field769 > 255) {
            this.field769 = 255;
        }
        this.method350(this.field770++, (byte) this.field769);
        this.field769 = 0;
        field757++;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V", line = 66)
    public static final void method343(int arg0) {
        field756++;
        int var1 = class75.field1419.method1276(class28.field452);
        for (int var2 = arg0; var2 < class220.field3736; var2++) {
            int var3 = class75.field1419.method1276(class253.method1809(false, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class220.field3736 * 15 + 21;
        int var5 = class245.field4259;
        int var6 = class278.field4789 - var1 / 2;
        if (class13.field290 < (var6 + var1)) {
            var6 = class13.field290 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if ((var4 + var5) > class58.field960) {
            var5 = class58.field960 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class200.field3425 == 1) {
            if (class306.field5219 == class278.field4789 && class36.field581 == class245.field4259) {
                class244.field4247 = var6;
                class190.field3262 = var5;
                class313.field5300 = var1;
                class253.field4415 = class220.field3736 * 15 + 22;
                class101.field1828 = true;
                class200.field3425 = 0;
            }
        } else if (class278.field4789 == class268.field4609 && class245.field4259 == class238.field4061) {
            class101.field1828 = true;
            class244.field4247 = var6;
            class253.field4415 = class220.field3736 * 15 + 22;
            class313.field5300 = var1;
            class200.field3425 = 0;
            class190.field3262 = var5;
        } else {
            class200.field3425 = 1;
            class306.field5219 = class268.field4609;
            class36.field581 = class238.field4061;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V", line = 163)
    public final void method344(byte arg0) {
        field758++;
        this.field770 = 0;
        if (arg0 < -83) {
            this.field769 = 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILqm;II)Lnm;", line = 178)
    public static final class176 method345(int arg0, class222 arg1, int arg2, int arg3) {
        if (arg2 == -29867) {
            field766++;
            return class135.method966(114, arg3, arg0, arg1) ? class159.method1141(arg2 + 29993) : null;
        } else {
            return (class176) null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V", line = 193)
    public static final void method346(int arg0) {
        field767++;
        int var1 = class110.method801(arg0 ^ 0xFFFFFFFD);
        if (var1 == 0) {
            class264.field4528 = (byte[][][]) null;
            class278.method1930(0, false);
        } else if (var1 == 1) {
            class146.method1041((byte) -125, (byte) 0);
            class278.method1930(512, false);
            class30.method259((byte) 114);
        } else {
            class146.method1041((byte) -126, (byte) (class26.field426 - 4 & 0xFF));
            class278.method1930(2, false);
        }
        if (arg0 != -4) {
            method347(110);
        }
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)Z", line = 226)
    public static final boolean method347(int arg0) {
        field754++;
        try {
            if (arg0 != -1690) {
                field763 = (class64) null;
            }
            if (class238.field4072 == 2) {
                if (class62.field1212 == null) {
                    class62.field1212 = class221.method1575(class124.field2242, class66.field1314, class93.field1735);
                    if (class62.field1212 == null) {
                        return false;
                    }
                }
                if (class76.field1437 == null) {
                    class76.field1437 = new class69(class26.field427, class25.field419);
                }
                if (class258.field4463.method1721(class76.field1437, class62.field1207, class62.field1212, 0, 22050)) {
                    class258.field4463.method1717((byte) 75);
                    class258.field4463.method1702(class122.field2197, (byte) 49);
                    class258.field4463.method1712(class62.field1212, 8192, class121.field2185);
                    class124.field2242 = null;
                    class62.field1212 = null;
                    class238.field4072 = 0;
                    class76.field1437 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class258.field4463.method1730(99);
            class76.field1437 = null;
            class238.field4072 = 0;
            class124.field2242 = null;
            class62.field1212 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V", line = 288)
    public final void method348(int arg0, int arg1, int arg2) {
        int var4 = 30 % ((71 - arg0) / 41);
        field750++;
        if (arg2 == 0) {
            this.field764 = this.field753 - (arg1 < 0 ? -arg1 : arg1);
            this.field759 = 4096;
            this.field764 = this.field764 * this.field764 >> 12;
            this.field769 = this.field764;
            return;
        }
        this.field759 = this.field764 * this.field761 >> 12;
        this.field764 = this.field753 - (arg1 >= 0 ? arg1 : -arg1);
        this.field764 = this.field764 * this.field764 >> 12;
        if (this.field759 < 0) {
            this.field759 = 0;
        } else if (this.field759 > 4096) {
            this.field759 = 4096;
        }
        this.field764 = this.field764 * this.field759 >> 12;
        this.field769 += this.field764 * this.field760 >> 12;
        this.field760 = this.field760 * this.field752 >> 12;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)I", line = 320)
    public static final int method349(int arg0, int arg1, int arg2) {
        field765++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + arg2) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7F9ED5B) >> 19;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(IB)V", line = 343)
    public void method350(int arg0, byte arg1) {
        this.field762[arg0] = arg1;
        field749++;
    }
}
