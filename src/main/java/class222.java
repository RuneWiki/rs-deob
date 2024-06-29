import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class222 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    private int field3759 = -1;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    private int field3767 = 0;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Luh;")
    private class198 field3763 = new class198();

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
    public boolean field3771 = false;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    private int field3766;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "[Lwg;")
    private class98[] field3765;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    private int field3769;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[[[I")
    private int[][][] field3762;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Z")
    public static boolean field3758 = false;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[[S")
    public static short[][] field3761;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method1401(int arg0) {
        field3757++;
        if (arg0 > -41) {
            return;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class94.field1631 - 1; var2++) {
                if (class19.field327[var2] < 1000 && class19.field327[var2 + 1] > 1000) {
                    var1 = false;
                    class227 var3 = class213.field3607[var2];
                    class213.field3607[var2] = class213.field3607[var2 + 1];
                    class213.field3607[var2 + 1] = var3;
                    class227 var4 = class37.field611[var2];
                    class37.field611[var2] = class37.field611[var2 + 1];
                    class37.field611[var2 + 1] = var4;
                    int var5 = class210.field3562[var2];
                    class210.field3562[var2] = class210.field3562[var2 + 1];
                    class210.field3562[var2 + 1] = var5;
                    int var6 = class236.field4099[var2];
                    class236.field4099[var2] = class236.field4099[var2 + 1];
                    class236.field4099[var2 + 1] = var6;
                    short var7 = class19.field327[var2];
                    class19.field327[var2] = class19.field327[var2 + 1];
                    class19.field327[var2 + 1] = var7;
                    long var8 = class161.field2720[var2];
                    class161.field2720[var2] = class161.field2720[var2 + 1];
                    class161.field2720[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ln;IZI)[Lwh;")
    public static final class163[] method1402(class138 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field3764++;
            return class123.method760(arg0, arg3, arg1, -67) ? class36.method193(-83) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method1403(byte arg0) {
        field3760++;
        if (this.field3769 != this.field3766) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -73) {
            for (int var2 = 0; var2 < this.field3769; var2++) {
                this.field3765[var2] = client.field1424;
            }
            return this.field3762;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static void method1404(int arg0) {
        field3761 = null;
        if (arg0 != -1) {
            method1402((class138) null, -105, true, -60);
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public final void method1405(int arg0) {
        int var2 = 0;
        if (arg0 >= -16) {
            return;
        }
        while (var2 < this.field3769) {
            this.field3762[var2][0] = null;
            this.field3762[var2][1] = null;
            this.field3762[var2][2] = null;
            this.field3762[var2] = null;
            var2++;
        }
        this.field3762 = null;
        field3770++;
        this.field3765 = null;
        this.field3763.method1274((byte) 109);
        this.field3763 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[[I")
    public final int[][] method1406(int arg0, int arg1) {
        field3768++;
        if (arg1 != 0) {
            method1401(9);
        }
        if (this.field3769 == this.field3766) {
            this.field3771 = this.field3765[arg0] == null;
            this.field3765[arg0] = client.field1424;
            return this.field3762[arg0];
        } else if (this.field3769 == 1) {
            this.field3771 = this.field3759 != arg0;
            this.field3759 = arg0;
            return this.field3762[0];
        } else {
            class98 var3 = this.field3765[arg0];
            if (var3 == null) {
                this.field3771 = true;
                if (this.field3769 <= this.field3767) {
                    class98 var4 = (class98) this.field3763.method1270(0);
                    var3 = new class98(arg0, var4.field1713);
                    this.field3765[var4.field1710] = null;
                    var4.method369(124);
                } else {
                    var3 = new class98(arg0, this.field3767);
                    this.field3767++;
                }
                this.field3765[arg0] = var3;
            } else {
                this.field3771 = false;
            }
            this.field3763.method1275(-18157, var3);
            return this.field3762[var3.field1713];
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III)V")
    public class222(int arg0, int arg1, int arg2) {
        this.field3766 = arg1;
        this.field3765 = new class98[this.field3766];
        this.field3769 = arg0;
        this.field3762 = new int[this.field3769][3][arg2];
    }
}
