import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class95 extends class59 {

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    private int field1597 = 0;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    private int field1601 = 10;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    private int field1614 = 2048;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "Lph;")
    private static class229 field1600 = class266.method1858("You can(Wt add yourself to your own ignore list)3", 0);

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field1605 = 0;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "Z")
    public static boolean field1608 = false;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "Lph;")
    public static class229 field1609 = field1600;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "F")
    public static float field1604;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "[I")
    private int[] field1602;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "[I")
    private int[] field1615;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BII)V", line = 4)
    public static final void method703(byte arg0, int arg1, int arg2) {
        field1603++;
        if (arg0 >= -37) {
            method708((byte) 24);
        }
        class281 var3 = class135.method957(0, arg1, 7);
        var3.method1932(0);
        var3.field4660 = arg2;
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)V", line = 31)
    public final void method65(int arg0) {
        field1613++;
        this.method706(0);
        if (arg0 <= 110) {
            this.field1615 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()V", line = 42)
    public static final void method704() {
        GL var0 = class99.field1682;
        var0.glDisableClientState(32886);
        class99.method730(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class99.method743();
        for (int var1 = 0; var1 < class37.field600[0].length; var1++) {
            class264 var2 = class37.field600[0][var1];
            if (var2.field4421 >= 0 && class310.field5207.method90(-92, var2.field4421) == 4) {
                var0.glColor4fv(class250.method1751(-1027097016, var2.field4427), 0);
                float var3 = 201.5F - (var2.field4406 ? 1.0F : 0.5F);
                var2.method1835(class225.field3705, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class99.method764();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class99.method755();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V", line = 75)
    public static void method705(boolean arg0) {
        field1609 = null;
        if (arg0) {
            method707((class229) null, -14);
        }
        field1600 = null;
    }

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "(I)V", line = 86)
    private final void method706(int arg0) {
        field1612++;
        this.field1615 = new int[this.field1601 + 1];
        int var2 = 0;
        this.field1602 = new int[this.field1601 + 1];
        int var3 = 4096 / this.field1601;
        int var4 = this.field1614 * var3 >> 12;
        for (int var5 = arg0; var5 < this.field1601; var5++) {
            this.field1602[var5] = var2;
            this.field1615[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1602[this.field1601] = 4096;
        this.field1615[this.field1601] = this.field1615[0] + 4096;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 305)
    public class95() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lph;I)I", line = 117)
    public static final int method707(class229 arg0, int arg1) {
        field1607++;
        if (class1.field5 == null || arg0.method1642(29) == 0) {
            return -1;
        }
        for (int var2 = arg1; var2 < class1.field5.field882; var2++) {
            if (class1.field5.field872[var2].method1597(arg1 ^ 0x7AC4, class184.field2988, class77.field1283).method1626(arg0, true)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)[I", line = 145)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            this.method706(24);
        }
        int[] var3 = this.field846.method383(3583, arg1);
        field1598++;
        if (this.field846.field811) {
            int var4 = class269.field4504[arg1];
            if (this.field1597 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1601; var6++) {
                    if (this.field1602[var6] <= var4 && this.field1602[var6 + 1] > var4) {
                        if (this.field1615[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class42.method315(var3, 0, class293.field4789, var5);
            } else {
                for (int var7 = 0; var7 < class293.field4789; var7++) {
                    int var8 = 0;
                    int var9 = class219.field3608[var7];
                    int var10 = this.field1597;
                    if (var10 == 1) {
                        var8 = var9;
                    } else if (var10 == 2) {
                        var8 = (var4 + var9 - 4096 >> 1) + 2048;
                    } else if (var10 == 3) {
                        var8 = (var9 - var4 >> 1) + 2048;
                    }
                    short var11 = 0;
                    for (int var12 = 0; var12 < this.field1601; var12++) {
                        if (var8 >= this.field1602[var12] && var8 < this.field1602[var12 + 1]) {
                            if (var8 < this.field1615[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var11;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 264)
    public static final void method708(byte arg0) {
        field1606++;
        if (!class61.method415((byte) 68) && class298.field4849 != class102.field1742) {
            class78.method589(class122.field2054, class298.field4849, class230.field3820.field5104[0], false, class230.field3820.field5159[0], 25, field1611);
            return;
        }
        if (class298.field4849 != class262.field4380) {
            class262.field4380 = class298.field4849;
            class82.method605(class298.field4849, 0);
            class227.method1572(32);
        }
        if (arg0 != -94) {
            field1605 = 5;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Z", line = 295)
    public static final boolean method709(int arg0, int arg1) {
        if (arg0 != 658667091) {
            method703((byte) 54, -123, -6);
        }
        field1599++;
        return (arg1 & 0x27427653) >> 29 != 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BILhb;)V", line = 311)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg0 != 115) {
            return;
        }
        field1610++;
        if (arg1 == 0) {
            this.field1601 = arg2.method1178(8);
        } else if (arg1 == 1) {
            this.field1614 = arg2.method1161(true);
        } else if (arg1 == 2) {
            this.field1597 = arg2.method1178(8);
        }
    }
}
