import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class524 {

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    private int field7491 = 0;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    private int field7493 = -1;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lbu;")
    private class19 field7485 = new class19();

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
    public boolean field7499 = false;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    private int field7498;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    private int field7496;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[Lid;")
    private class502[] field7486;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[[I")
    private int[][] field7492;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
    public static int[] field7487 = new int[3];

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method3086(int arg0, int arg1) {
        field7488++;
        if (arg1 != -2) {
            this.field7499 = false;
        }
        if (this.field7498 == this.field7496) {
            this.field7499 = this.field7486[arg0] == null;
            this.field7486[arg0] = class555.field8258;
            return this.field7492[arg0];
        } else if (this.field7496 == 1) {
            this.field7499 = this.field7493 != arg0;
            this.field7493 = arg0;
            return this.field7492[0];
        } else {
            class502 var3 = this.field7486[arg0];
            if (var3 == null) {
                this.field7499 = true;
                if (this.field7491 >= this.field7496) {
                    class502 var4 = (class502) this.field7485.method125(arg1 ^ 0x1);
                    var3 = new class502(arg0, var4.field7114);
                    this.field7486[var4.field7116] = null;
                    var4.method2457(arg1 ^ 0x20E4);
                } else {
                    var3 = new class502(arg0, this.field7491);
                    this.field7491++;
                }
                this.field7486[arg0] = var3;
            } else {
                this.field7499 = false;
            }
            this.field7485.method123(-1, var3);
            return this.field7492[var3.field7114];
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V", line = 72)
    public static final void method3087(int arg0, int arg1, int arg2) {
        int var3 = -72 % ((65 - arg2) / 33);
        if (class339.field4675 < class339.field4678) {
            class339.field4675 = (float) ((double) class339.field4675 / 30.0D + (double) class339.field4675);
            if (class339.field4675 > class339.field4678) {
                class339.field4675 = class339.field4678;
            }
            class415.method2448((byte) -34);
            class339.field4674 = (int) class339.field4675 >> 1;
            class339.field4680 = class84.method635(class339.field4674, 83);
        } else if (class339.field4675 > class339.field4678) {
            class339.field4675 = (float) ((double) class339.field4675 - (double) class339.field4675 / 30.0D);
            if (class339.field4675 < class339.field4678) {
                class339.field4675 = class339.field4678;
            }
            class415.method2448((byte) -34);
            class339.field4674 = (int) class339.field4675 >> 1;
            class339.field4680 = class84.method635(class339.field4674, 79);
        }
        field7490++;
        if (class485.field6906 != -1 && class451.field6372 != -1) {
            int var4 = class485.field6906 - class607.field9016;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            int var5 = class451.field6372 - class177.field2703;
            class607.field9016 += var4;
            if (var5 < 2 || var5 > 2) {
                var5 /= 8;
            }
            if (var4 == 0 && var5 == 0) {
                class451.field6372 = -1;
                class485.field6906 = -1;
            }
            class177.field2703 += var5;
            class415.method2448((byte) -34);
        }
        if (class572.field8429 > 0) {
            class276.field3881--;
            if (class276.field3881 == 0) {
                class572.field8429--;
                class276.field3881 = 100;
            }
        } else {
            class383.field5268 = -1;
            class90.field1352 = -1;
        }
        if (!class72.field993 || class227.field3313 == null) {
            return;
        }
        for (class561 var6 = (class561) class227.field3313.method124((byte) 42); var6 != null; var6 = (class561) class227.field3313.method120(-82)) {
            class308 var7 = class339.field4665.method3058(var6.field8334.field1463, 0);
            if (var6.method3380(arg1, arg0, 110)) {
                if (var7.field4253 != null) {
                    if (var7.field4253[4] != null) {
                        class335.method2049(0, -1, (long) var6.field8334.field1463, 126, true, 1004, var7.field4253[4], false, -1, var7.field4246, var7.field4240);
                    }
                    if (var7.field4253[3] != null) {
                        class335.method2049(0, -1, (long) var6.field8334.field1463, 126, true, 1003, var7.field4253[3], false, -1, var7.field4246, var7.field4240);
                    }
                    if (var7.field4253[2] != null) {
                        class335.method2049(0, -1, (long) var6.field8334.field1463, 124, true, 1010, var7.field4253[2], false, -1, var7.field4246, var7.field4240);
                    }
                    if (var7.field4253[1] != null) {
                        class335.method2049(0, -1, (long) var6.field8334.field1463, 124, true, 1008, var7.field4253[1], false, -1, var7.field4246, var7.field4240);
                    }
                    if (var7.field4253[0] != null) {
                        class335.method2049(0, -1, (long) var6.field8334.field1463, 123, true, 1007, var7.field4253[0], false, -1, var7.field4246, var7.field4240);
                    }
                }
                if (!var6.field8334.field1462) {
                    var6.field8334.field1462 = true;
                    class98.method755(class488.field6936, var6.field8334.field1463, var7.field4246);
                }
                if (var6.field8334.field1462) {
                    class98.method755(class241.field3460, var6.field8334.field1463, var7.field4246);
                }
            } else if (var6.field8334.field1462) {
                var6.field8334.field1462 = false;
                class98.method755(class171.field2666, var6.field8334.field1463, var7.field4246);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 209)
    public static void method3088(int arg0) {
        field7487 = null;
        if (arg0 >= -68) {
            field7489 = 115;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)[[I", line = 222)
    public final int[][] method3089(boolean arg0) {
        field7497++;
        if (arg0) {
            this.field7491 = -52;
        }
        if (this.field7498 != this.field7496) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field7496; var2++) {
            this.field7486[var2] = class555.field8258;
        }
        return this.field7492;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V", line = 250)
    public final void method3090(boolean arg0) {
        field7494++;
        for (int var2 = 0; var2 < this.field7496; var2++) {
            this.field7492[var2] = null;
        }
        if (!arg0) {
            field7487 = null;
        }
        this.field7492 = null;
        this.field7486 = null;
        this.field7485.method122((byte) 14);
        this.field7485 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(III)V", line = 315)
    public class524(int arg0, int arg1, int arg2) {
        this.field7498 = arg1;
        this.field7496 = arg0;
        this.field7486 = new class502[this.field7498];
        this.field7492 = new int[this.field7496][arg2];
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Lod;", line = 277)
    public static final class433 method3091(int arg0, int arg1) {
        field7495++;
        class433 var2 = (class433) class135.field1843.method1423((byte) 89, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 8) {
            field7487 = null;
        }
        byte[] var3 = class429.field5766.method1966(0, arg1, true);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class433 var4 = class621.method3633(0, var3);
            class135.field1843.method1422((long) arg1, var4, -91);
            return var4;
        }
    }
}
