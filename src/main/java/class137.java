import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class137 {

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field1986 = -1;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lg;")
    public static class67 field1983 = new class67(128);

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[[B")
    public static byte[][] field1992 = new byte[1000][];

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "C")
    public static char field1993;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public int field1984;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Lon;")
    public static class344 field1994;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field1987;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
    public int[] field1988;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 5)
    public static void method970(boolean arg0) {
        field1994 = null;
        field1983 = null;
        field1992 = (byte[][]) null;
        if (!arg0) {
            field1994 = (class344) null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[Lqf;B)V", line = 20)
    public static final void method971(int arg0, class359[] arg1, byte arg2) {
        int var3 = 0;
        int var4 = 3 / ((arg2 + 68) / 45);
        while (var3 < arg1.length) {
            class359 var5 = arg1[var3];
            if (var5 != null && var5.field5638 == arg0 && (!var5.field5500 || !client.method359(var5))) {
                label118: {
                    if (var5.field5554 == 0) {
                        if (!var5.field5500 && client.method359(var5) && class92.field1271 != var5) {
                            break label118;
                        }
                        method971(var5.field5521, arg1, (byte) -21);
                        if (var5.field5579 != null) {
                            method971(var5.field5521, var5.field5579, (byte) 5);
                        }
                        class98 var6 = (class98) class288.field4360.method1405((long) var5.field5521, false);
                        if (var6 != null) {
                            class73.method603(-126, var6.field1393);
                        }
                    }
                    if (var5.field5554 == 6) {
                        if (var5.field5547 != -1 || var5.field5668 != -1) {
                            boolean var7 = class315.method2201(var5, 22366);
                            int var8;
                            if (var7) {
                                var8 = var5.field5668;
                            } else {
                                var8 = var5.field5547;
                            }
                            if (var8 != -1) {
                                class248 var9 = class119.method893(var8, (byte) -41);
                                if (var9 != null) {
                                    var5.field5519 += class94.field1310;
                                    while (var5.field5519 > var9.field3694[var5.field5593]) {
                                        var5.field5519 -= var9.field3694[var5.field5593];
                                        var5.field5593++;
                                        if (var5.field5593 >= var9.field3667.length) {
                                            var5.field5593 -= var9.field3677;
                                            if (var5.field5593 < 0 || var5.field5593 >= var9.field3667.length) {
                                                var5.field5593 = 0;
                                            }
                                        }
                                        var5.field5621 = var5.field5593 + 1;
                                        if (var9.field3667.length <= var5.field5621) {
                                            var5.field5621 -= var9.field3677;
                                            if (var5.field5621 < 0 || var5.field5621 >= var9.field3667.length) {
                                                var5.field5621 = -1;
                                            }
                                        }
                                        class83.method676(var5, (byte) 45);
                                    }
                                }
                            }
                        }
                        if (var5.field5490 != 0 && !var5.field5500) {
                            int var10 = var5.field5490 >> 16;
                            int var11 = var5.field5490 << 16 >> 16;
                            int var12 = class94.field1310 * var11;
                            int var13 = class94.field1310 * var10;
                            var5.field5517 = var5.field5517 + var13 & 0x7FF;
                            var5.field5609 = var5.field5609 + var12 & 0x7FF;
                            class83.method676(var5, (byte) -69);
                        }
                    }
                }
            }
            var3++;
        }
        field1985++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZII)I", line = 140)
    public static final int method972(int arg0, boolean arg1, int arg2, int arg3) {
        field1982++;
        if ((class230.field3491[arg3][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class230.field3491[1][arg2][arg0] & 0x2) == 0) {
            if (arg1) {
                method971(-114, (class359[]) null, (byte) 83);
            }
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 160)
    public final void method973(int arg0) {
        field1990++;
        class44.method325(this.field1988, this.field1984, this.field1989);
        if (arg0 != -27272) {
            this.method221(-115, 119, 108, (Graphics) null);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 182)
    protected class137() {
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public abstract void method219(byte arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method221(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method222(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);
}
